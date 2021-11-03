@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE")

package aprl.compiler

import aprl.AprlParser
import aprl.AprlParserBaseListener
import aprl.compiler.jvm.*
import aprl.compiler.jvm.Annotation
import aprl.compiler.jvm.Function
import aprl.compiler.jvm.Void.typeArguments
import aprl.lang.annotation.AnnotationRetention
import aprl.lang.annotation.AnnotationTarget
import aprl.lang.annotation.Retention
import aprl.lang.annotation.Target
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl
import java.io.File
import java.lang.reflect.*
import java.math.BigDecimal.valueOf as BigDecimal
import java.math.BigInteger.valueOf as BigInteger
import java.util.*
import java.lang.reflect.Constructor as JConstructor
import java.lang.reflect.Modifier as JModifier
import java.lang.reflect.Type as JType

class AprlListener(private val fileName: String, targetDir: File?) : AprlParserBaseListener() {
    
    companion object {
        private const val SUFFIX = "java"
    }
    
    private val simpleName = fileName.substringAfterLast(File.separator)
    
    // if there are standalone function(s)/property(ies)/extension(s), an enclosing class is needed
    private var enclosingClassRequired = false
        private set(new) {
            field = new
            enclosingClass = if (new) Clazz(fileName, null) else null
        }
    
    // fileName if an enclosing class is required (see enclosingClassRequired), null otherwise
    private var enclosingClass: ClassMemberOwner? = null
    
    // if there is a targetDir, use it; source folder otherwise
    private val outputFileName = targetDir?.let { it.path + File.separator + fileName.substringAfterLast(File.separator) }
        ?: fileName.replaceAfterLast(".", SUFFIX)
    
    private val namespace = Namespace()
    private val imports = mutableListOf<Import>()
    
    private val importedMethods get() = imports.filter { it.method != null }.map { it.method!! }
    private val importedFields get() = imports.filter { it.field != null }.map { it.field!! }
    
    private val topLevelObjects = mutableSetOf<TopLevelObject>()
    
    fun compile() {}
    
    override fun enterNamespaceHeader(ctx: AprlParser.NamespaceHeaderContext) {
        val pos = ctx.identifier().position
        val namespaceMatchesLocation = namespaceMatchesLocation(ctx)
        if (!namespaceMatchesLocation) {
            WARN(simpleName, pos, "Namespace does not match file location")
        }
        namespace.addAll(ctx.identifier().simpleIdentifier().map { it.text })
        namespace.freeze()
    }
    
    /**
     * Checks if the given namespace matches the file location of the current file.
     *
     * For example:
     *
     * - namespace *example*, file *.../example/Example.aprl* → `true`
     * - namespace *other*, file *.../example/Example.arl* → `false`
     * - namespace *test.example*, file *.../test/example/Example.aprl* → `true`
     */
    private fun namespaceMatchesLocation(ctx: AprlParser.NamespaceHeaderContext): Boolean {
        val identifier = ctx.identifier()
        val simpleIdentifiers = identifier.simpleIdentifier().reversedMutable()
        val subFolders = LinkedList(fileName.split(File.separator).reversed()).also { it.pop() }
        for (id in simpleIdentifiers) {
            if (id.text != subFolders.pop()) {
                return false
            }
        }
        return true
    }
    
    override fun enterImportHeader(ctx: AprlParser.ImportHeaderContext) {
        for (importIdentifier in ctx.importIdentifier()) {
            parseImportIdentifier(importIdentifier)
        }
        val loadThis = aprl.lang.Function0 { 6 }
        imports.add(Import().also { it.pkg = loadPackage("java.lang") ?: throw InternalError("Package java.lang not found in classpath") })
        imports.add(Import().also { it.pkg = loadPackage("aprl.lang") ?: throw InternalError("Package aprl.lang not found in classpath") })
    }
    
    /**
     * Parses and the given import identifier, adding all the resulting imports to the [imports list][imports].
     *
     * @param[ctx] The import identifier to be parsed
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseImportIdentifier(ctx: AprlParser.ImportIdentifierContext) {
        if (ctx.singleImport() != null) { // alias import (import foo.b as a)
            val singleImport = ctx.singleImport()
            parseSingleImport(singleImport.identifier(), singleImport.importAlias())
        } else {
            if (ctx.PERIOD() == null) { // plain import (import foo.a)
                parseSingleImport(ctx.identifier(), null)
            } else {
                if (ctx.MUL() != null) { // all-import (using foo.*)
                    parseAllImport(ctx.identifier())
                } else {
                    if (ctx.subImportIdentifier().size > 1) { // multiple import (using foo.[a, b])
                        val elementsInBrackets = mutableListOf<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>()
                        for (subImportIdentifier in ctx.subImportIdentifier()) {
                            elementsInBrackets.add(subImportIdentifier.simpleIdentifier() to subImportIdentifier.importAlias())
                        }
                        parseMultiImport(ctx.identifier(), elementsInBrackets)
                    } else { // redundant brackets (using foo.[a])
                        val identifierPosition = ctx.subImportIdentifier(0).position
                        val bracketPosition = identifierPosition.first to identifierPosition.second - 1
                        WARN(simpleName, bracketPosition, "Redundant brackets")
                        val allIdentifiers = ctx.identifier().simpleIdentifier() + ctx.subImportIdentifier(0).simpleIdentifier()
                        parseSingleImport(allIdentifiers, ctx.subImportIdentifier(0).importAlias())
                    }
                }
            }
        }
    }
    
    /**
     * Parses an "all-import" (e.g. using *aprl.`*`*; using *aprl.annotation.AnnotationTarget.`*`*), adding all the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left-hand side of the all-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseAllImport(identifier: AprlParser.IdentifierContext) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            if (imports.any { it.pkg == pkg }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.pkg = pkg })
        } else if (clazz != null) {
            importEverything(clazz)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    /**
     * When known that an error is caused by an unresolved reference, [this function][UNRESOLVED_REFERENCE]
     * can be used to throw an [Error] at the actual reference that cannot be resolved.
     *
     * @param[identifiers] The identifiers, at least one of which cannot be resolved
     *
     * @throws Error Always throws an [Error]
     */
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun UNRESOLVED_REFERENCE(identifiers: List<AprlParser.SimpleIdentifierContext>): Nothing {
        val error = faultyIdentifier(identifiers)
        throw Error(simpleName, error.position, "Unresolved reference: '${error.text}'")
    }
    
    /**
     * Imports all members (classes, methods, fields) of a class into the [imports list][imports].
     *
     * @param[from] The class to be imported from
     */
    private fun importEverything(from: Class<*>) {
        from.classes.forEach { clazz -> imports.add(Import().also { it.clazz = clazz }) }
        from.methods.forEach { method -> imports.add(Import().also { it.method = method }) }
        from.fields.forEach { field -> imports.add(Import().also { it.field = field }) }
    }
    
    /**
     * Parses a "multi-import" (e.g. using java.util.`[`List, Map`]`), adding the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left-hand side of the multi-import
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun parseMultiImport(identifier: AprlParser.IdentifierContext, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            importMultipleFromPackage(pkg, elements)
        } else if (clazz != null) {
            importMultipleFromClass(clazz, elements)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    /**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a package.
     *
     * @param[from] The package to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun importMultipleFromPackage(from: Package, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        val pkg = from.name
        for ((subIdentifier, alias) in elements) {
            val aliasString = alias?.simpleIdentifier()?.text
            val clazz = loadCompleteClass("$pkg.${subIdentifier.text}") ?: throw Error(simpleName, subIdentifier.position, "Unresolved reference: '${subIdentifier.text}'")
            if (imports.any { it.clazz == clazz && it.alias == aliasString }) {
                WARN(simpleName, subIdentifier.position, "Redundant import")
            }
            if (clazz.simpleName == aliasString) {
                WARN(simpleName, alias!!.position, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = aliasString })
        }
    }
    
    /**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a class.
     *
     * @param[from] The class to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     */
    private fun importMultipleFromClass(from: Class<*>, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        for ((subIdentifier, alias) in elements) {
            addValidImports(from, subIdentifier, alias)
        }
    }
    
    /**
     * Imports methods and/or fields in the given class by the given name with the given alias
     *
     * @param[clazz] The class to be imported from
     * @param[identifier] The name of the method and/or field to be imported
     * @param[alias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     * @throws Error If a distinct field by the same name is already imported
     */
    private fun addValidImports(clazz: Class<*>, identifier: AprlParser.SimpleIdentifierContext, alias: AprlParser.ImportAliasContext?) {
        val method = loadMethod(clazz, identifier.text)
        val field = loadField(clazz, identifier.text)
        if (method != null) {
            if (imports.any { it.method == method }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.method = method; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (field != null) {
            if (imports.any { it.field?.name == field.name && it.field != field }) {
                throw Error(simpleName, identifier.position, "Field by name '${field.name}' is already defined in an import")
            }
            if (imports.any { it.field == field }) {
                WARN(simpleName, identifier.position, "Redundant import")
            }
            imports.add(Import().also { it.field = field; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (method == null && field == null) {
            throw Error(simpleName, identifier.position, "Unresolved reference: '${identifier.text}'")
        }
        if (identifier.text == alias?.simpleIdentifier()?.text) {
            WARN(simpleName, alias!!.position, "Redundant import alias")
        }
    }
    
    /**
     * Parses a regular single-import with the given identifier, and assigns it the given alias
     *
     * @param[identifier] The identifier to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     */
    private fun parseSingleImport(identifier: AprlParser.IdentifierContext, importAlias: AprlParser.ImportAliasContext?) {
        parseSingleImport(identifier.simpleIdentifier(), importAlias)
    }
    
    /**
     * Parses a regular single-import with the given identifiers, and assigns it the given alias
     *
     * @param[identifiers] The identifier list to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     */
    private fun parseSingleImport(identifiers: List<AprlParser.SimpleIdentifierContext>, importAlias: AprlParser.ImportAliasContext?) {
        val importIdentifier = identifiers.joinToString(".") { it.text }
        val alias = importAlias?.simpleIdentifier()?.text
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            throw Error(simpleName, identifiers[0].position, "Namespaces cannot be imported")
        } else if (clazz != null) {
            if (imports.any { it.clazz == clazz && it.alias == alias }) {
                WARN(simpleName, identifiers[0].position, "Redundant import")
            }
            if (clazz.simpleName == alias) {
                WARN(simpleName, importAlias!!.position, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = alias })
        } else {
            val last = identifiers.last()
            val possibleClass = loadCompleteClass(identifiers.dropLast(1).joinToString(".") { it.text })
                ?: throw Error(simpleName, last.position, "Unresolved reference: '${last.text}'")
            addValidImports(possibleClass, last, importAlias)
        }
    }
    
    override fun enterTopLevelObject(ctx: AprlParser.TopLevelObjectContext) {
        val clazz = ctx.classDeclaration()
        val inter = ctx.interfaceDeclaration()
        val annotation = ctx.annotationDeclaration()
        val document = ctx.documentDeclaration()
        val struct = ctx.structDeclaration()
        val enum = ctx.enumDeclaration()
        val extension = ctx.extensionDeclaration()
        val function = ctx.functionDeclaration()
        val property = ctx.propertyDeclaration()
        topLevelObjects.add(
            if (extension != null) {
                parseTopLevelExtension(extension)
                enclosingClass!!
            } else if (clazz != null) {
                parseTopLevelClass(clazz)
            } else if (inter != null) {
                parseTopLevelInterface(inter)
            } else if (annotation != null) {
                parseTopLevelAnnotation(annotation)
            } else if (document != null) {
                parseTopLevelDocument(document)
            } else if (struct != null) {
                parseTopLevelStruct(struct)
            } else if (enum != null) {
                parseTopLevelEnum(enum)
            } else if (function != null) {
                parseTopLevelFunction(function)
                enclosingClass!!
            } else if (property != null) {
                parseTopLevelProperty(property)
                enclosingClass!!
            } else {
                throw InternalError("Expected TopLevelObjectContext ($ctx) to be class-, interface-, annotation-, document-, struct-, extension-, function- or propertyDeclaration")
            }
        )
    }
    
    private fun parseTopLevelClass(ctx: AprlParser.ClassDeclarationContext): Clazz {
        val clazz = Clazz(ctx.simpleIdentifier().text, null)
        clazz.modifiers.addAll(ctx.modifierList()?.let { modifiersFromModifierList(it, "top level class", Modifier::`class`) } ?: mutableListOf())
        clazz.annotations.addAll(ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: mutableListOf())
        clazz.typeParameters.addAll(ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf())
        val delegations = ctx.delegationSpecifiers()
        var superConstructorCall: ValueArguments? = null
        if (delegations != null) {
            val superClasses = mutableListOf<Pair<Class<*>, ValueArguments>>()
            for (delegation in delegations.delegationSpecifier()) {
                val identifier = delegation.identifier()
                val superClass = loadImportedClass(identifier)
                val valueArguments = delegation.valueArguments()?.let { parseValueArguments(it) } ?: mutableListOf()
                if (superClasses.any { it.first == superClass }) {
                    throw Error(simpleName, identifier.position, "Supertype '${superClass.simpleName}' appears twice")
                }
                checkClassExtendability(superClass, identifier.position)
                if (!superClass.isInterface) {
                    if (superClasses.any { !it.first.isInterface }) {
                        throw Error(simpleName, identifier.position, "Multiple inheritance is not allowed")
                    }
                    if (delegation.valueArguments() == null) {
                        throw Error(simpleName,
                            identifier.simpleIdentifier().last().run { position + text.length },
                            "This type has a constructor and thus must be initialized here")
                    }
                    if (getValidConstructor(superClass.constructors, valueArguments) == null) {
                        throw Error(simpleName, delegation.valueArguments().position, "No constructor can be called with the arguments supplied")
                    }
                    superConstructorCall = valueArguments
                }
                checkTypeArguments(superClass, delegation.typeArguments(), false, identifier.simpleIdentifier().last())
                superClasses.add(superClass to valueArguments)
            }
        }
        val classMembers = mutableListOf<ClassMember>()
        if (ctx.primaryConstructor() != null) {
            if (superConstructorCall != null) {
                classMembers.add(superCallConstructor(parseConstructor(ctx.primaryConstructor()), superConstructorCall))
            } else {
                classMembers.add(parseConstructor(ctx.primaryConstructor()))
            }
        } else {
            if (superConstructorCall != null) {
                classMembers.add(superCallConstructor(clazz, superConstructorCall))
            } else {
                classMembers.add(Constructor(clazz, modifiers = mutableSetOf(Modifier.PUBLIC)))
            }
        }
        if (ctx.classBody()?.classMember()?.isNotEmpty() == true) { // not empty
            for (classMember in ctx.classBody().classMember()) {
                if (classMember.topLevelObject() != null) {
                    classMembers.addAll(parseInnerTopLevelObject(classMember.topLevelObject(), clazz))
                } else if (classMember.secondaryConstructor() != null) {
                    classMembers.add(parseSecondaryConstructor(classMember.secondaryConstructor()))
                } else if (classMember.loadScript() != null) {
                    classMembers.add(parseLoadScript(classMember.loadScript(), clazz))
                } else if (classMember.initializerBody() != null) {
                    (classMembers[0] as Constructor).statements.addAll(parseInitializerBody(classMember.initializerBody()))
                } else if (classMember.partnerDeclaration() != null) {
                    classMembers.addAll(parsePartnerDeclaration(classMember.partnerDeclaration()))
                } else {
                    throw InternalError("Expected ClassMemberContext ($classMember) to have topLevelObject, secondaryConstructor, loadScript, initializerBody or partnerDeclaration")
                }
            }
        }
        return clazz
    }
    
    private fun parseInnerTopLevelObject(ctx: AprlParser.TopLevelObjectContext, clazz: Clazz): List<ClassMember> {
        return if (ctx.propertyDeclaration() != null) {
            parseProperty(ctx.propertyDeclaration(), clazz)
        } else if (ctx.extensionDeclaration() != null) {
            parseNestedExtension(ctx.extensionDeclaration(), clazz)
        } else {
            listOf(if (ctx.classDeclaration() != null) {
                parseNestedClass(ctx.classDeclaration(), clazz)
            } else if (ctx.interfaceDeclaration() != null) {
                parseNestedInterface(ctx.interfaceDeclaration(), clazz)
            } else if (ctx.annotationDeclaration() != null) {
                parseNestedAnnotation(ctx.annotationDeclaration(), clazz)
            } else if (ctx.documentDeclaration() != null) {
                parseNestedDocument(ctx.documentDeclaration(), clazz)
            } else if (ctx.structDeclaration() != null) {
                parseNestedStruct(ctx.structDeclaration(), clazz)
            } else if (ctx.enumDeclaration() != null) {
                parseNestedEnum(ctx.enumDeclaration(), clazz)
            } else if (ctx.functionDeclaration() != null) {
                parseFunction(ctx.functionDeclaration(), clazz) as TopLevelObject
            } else {
                throw InternalError("Expected TopLevelObjectContext ($ctx) to be class-, interface-, annotation-, document-, struct-, extension-, function- or propertyDeclaration")
            })
        }
    }
    
    private fun parseNestedExtension(ctx: AprlParser.ExtensionDeclarationContext, enclosingClass: ClassMemberOwner): List<Function> {
        TODO("parseNestedExtension()")
    }
    
    private fun parseNestedClass(ctx: AprlParser.ClassDeclarationContext, enclosingClass: ClassMemberOwner): Clazz {
        return parseTopLevelClass(ctx).run {
            Clazz(name, enclosingClass, annotations, modifiers, typeParameters, superClasses, classMembers)
        }
    }
    
    private fun parseNestedAnnotation(ctx: AprlParser.AnnotationDeclarationContext, enclosingClass: ClassMemberOwner): Annotation {
        return parseTopLevelAnnotation(ctx).run {
            Annotation(name, enclosingClass, annotations, modifiers)
        }
    }
    
    private fun parseNestedDocument(ctx: AprlParser.DocumentDeclarationContext, enclosingClass: ClassMemberOwner): Document {
        return parseTopLevelDocument(ctx).run {
            Document(name, enclosingClass, annotations, modifiers)
        }
    }
    
    private fun parseNestedStruct(ctx: AprlParser.StructDeclarationContext, enclosingClass: ClassMemberOwner): Struct {
        return parseTopLevelStruct(ctx).run {
            Struct(name, enclosingClass, annotations, modifiers)
        }
    }
    
    private fun parseNestedEnum(ctx: AprlParser.EnumDeclarationContext, enclosingClass: ClassMemberOwner): aprl.compiler.jvm.Enum {
        return parseTopLevelEnum(ctx).run {
            Enum(name, enclosingClass, annotations, modifiers)
        }
    }
    
    private fun parseFunction(ctx: AprlParser.FunctionDeclarationContext, enclosingClass: ClassMemberOwner): Function {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "function", Modifier::function) } ?: mutableSetOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.FUNCTION) } ?: mutableListOf()
        val typeParameters = ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf()
        val name = ctx.simpleIdentifier().text
        val valueParameters = parseFunctionParameters(ctx.functionValueParameters())
        if (ctx.functionBody() == null) {
            if (enclosingClass is Interface) {
                modifiers.add(Modifier.ABSTRACT)
            } else if (Modifier.ABSTRACT in enclosingClass.modifiers) {
                if (Modifier.ABSTRACT !in modifiers) {
                    throw Error(simpleName, ctx.position, "Function '$name' must have a body or be declared abstract")
                }
            }
        }
        val type: Pair<Class<*>, TypeArgument?> = if (ctx.type() == null) {
            if (ctx.functionBody() == null) {
                if (Modifier.COVER !in modifiers) {
                    Void.canonical()
                }
                TODO("try to infer from possible super class, void otherwise")
            } else {
                evaluateStatement(parseFunctionBody(ctx.functionBody()).last()).canonical()
            }
        } else {
            parseType(ctx.type()).canonical()
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: mutableListOf()
        return Function(name, enclosingClass, annotations, modifiers, typeParameters, valueParameters, type, statements)
    }
    
    private fun parseProperty(ctx: AprlParser.PropertyDeclarationContext, enclosingClass: ClassMemberOwner): List<OnlyClassMember> {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "property", Modifier::property) } ?: mutableSetOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.PROPERTY) } ?: mutableListOf()
        val expression = ctx.expression()?.let { parseExpression(it) }
        val variableDeclaration = parseVariableDeclaration(ctx.variableDeclaration(), false)
        val name = variableDeclaration.name
        val type = variableDeclaration.type?.canonical() ?: expression?.let { evaluateExpression(it) } ?: throw Error(simpleName, 1 to 1, "")
        val final = ctx.VAL() != null || ctx.CONST() != null
        val static = ctx.CONST() != null || ctx.DEF() != null
        if (enclosingClass.static && static) {
            WARN(simpleName, ctx.position + ctx.text.length + 1, "Property '$name' is already in a static environment")
        }
        val field = Property(name, enclosingClass, annotations, modifiers, type, expression, final, enclosingClass.static || static)
        val getter: Getter? = ctx.propertyBody()?.getter()?.let {
            parseGetter(it, field)
        }
        val setter: Setter? = ctx.propertyBody()?.setter()?.let {
            parseSetter(it, field)
        }
        return listOf(field) andMaybe getter andMaybe setter
    }
    
    private fun parseGetter(ctx: AprlParser.GetterContext, property: Property): Getter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "getter", Modifier::getterSetter) } ?: mutableSetOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.GETTER) } ?: mutableListOf()
        if (ctx.type() != null) {
            if (parseType(ctx.type()) != property.type) {
                throw Error(simpleName, ctx.type().position, "Getter return type must be equal to the type of the property (${property.type.toJava()})")
            }
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: mutableListOf(defaultGetter(property))
        return Getter(property, annotations, modifiers, statements)
    }
    
    private fun defaultGetter(property: Property): Statement {
        TODO("defaultGetter")
    }
    
    private fun parseSetter(ctx: AprlParser.SetterContext, property: Property): Setter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "setter", Modifier::getterSetter) } ?: mutableSetOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.SETTER) } ?: mutableListOf()
        if (ctx.type() != null) {
            if (parseType(ctx.type()) != property.type) {
                throw Error(simpleName, ctx.type().position, "Setter parameter type must be equal to the type of the property. (${property.type.toJava()})")
            }
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: mutableListOf(defaultGetter(property))
        return Setter(property, annotations, modifiers, statements)
    }
    
    private fun defaultSetter(property: Property): Statement {
        TODO("defaultSetter")
    }
    
    private fun evaluateStatement(ctx: Statement): Type {
        TODO("evaluateStatement()")
    }
    
    private fun parseFunctionBody(ctx: AprlParser.FunctionBodyContext): Statements {
        return if (ctx.block() != null) {
            parseBlock(ctx.block())
        } else if (ctx.expression() != null) {
            mutableListOf(ReturnStatement(parseExpression(ctx.expression())))
        } else {
            throw InternalError("Expected FunctionBodyContext ($ctx) to have body or expression")
        }
    }
    
    private fun parseFunctionParameters(ctx: AprlParser.FunctionValueParametersContext): MutableList<MethodParameter> {
        return ctx.functionValueParameter()?.mapMutable { parseFunctionValueParameter(it) } ?: mutableListOf()
    }
    
    private fun parseFunctionValueParameter(ctx: AprlParser.FunctionValueParameterContext): MethodParameter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "parameter") { mod -> mod == Modifier.PARAMS } } ?: mutableSetOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.VALUE_PARAMETER) } ?: mutableListOf()
        val name = ctx.parameter().simpleIdentifier().text
        val type = parseType(ctx.parameter().type())
        val expression = ctx.expression()?.let { parseExpression(it) }
        return MethodParameter(modifiers, annotations, name, type, expression)
    }
    
    private fun parseNestedInterface(ctx: AprlParser.InterfaceDeclarationContext, enclosingClass: ClassMemberOwner): Interface {
        return parseTopLevelInterface(ctx).run {
            Interface(name, enclosingClass, annotations, modifiers, typeParameters, superInterfaces, interfaceMembers)
        }
    }
    
    private fun parseSecondaryConstructor(ctx: AprlParser.SecondaryConstructorContext): Constructor {
        TODO("parseSecondaryConstructor")
    }
    
    private fun parseLoadScript(ctx: AprlParser.LoadScriptContext, enclosingClass: ClassMemberOwner): LoadScript {
        val statements = parseBlock(ctx.block())
        return LoadScript(enclosingClass, statements)
    }
    
    private fun parseStatement(ctx: AprlParser.StatementContext): MutableList<out Statement> {
        return if (ctx.localVariableDeclaration() != null) {
            parseLocalVariableDeclaration(ctx.localVariableDeclaration())
        } else if (ctx.assignment() != null) {
            mutableListOf(parseAssignment(ctx.assignment()))
        } else if (ctx.loopStatement() != null) {
            mutableListOf(parseLoopStatement(ctx.loopStatement()))
        } else if (ctx.expression() != null) {
            mutableListOf(parseExpression(ctx.expression()))
        } else {
            throw InternalError("Expected StatementContext ($ctx) to have localVariableDeclaration, assignment, loopStatement or expression")
        }
    }
    
    private fun parseAssignment(ctx: AprlParser.AssignmentContext): Assignment {
        val assignableExpression = parseAssignableExpression(ctx.assignableExpression())
        val operator = parseAssignmentOperator(ctx.assignmentOperator())
        val expression = parseExpression(ctx.expression())
        val to = evaluateAssignableExpression(assignableExpression)
        val from = evaluateExpression(expression)
        if (!isInBound(from.first, from.second, to.first, to.second)) {
            throw Error(simpleName, ctx.expression().position, "Type mismatch: Inferred type is ${from.toJava()} but ${to.toJava()} was expected")
        }
        return Assignment(assignableExpression, operator, expression)
    }
    
    private fun parseAssignableExpression(ctx: AprlParser.AssignableExpressionContext): AssignableExpression {
        if (ctx.parenthesizedAssignableExpression() != null) {
            return parseAssignableExpression(ctx.parenthesizedAssignableExpression().assignableExpression())
        }
        val expression = parseExpression(ctx.expression())
        val assignableSuffixes = ctx.assignableSuffix().mapMutable { parseAssignableSuffix(it) }
        return AssignableExpression(expression, assignableSuffixes)
    }
    
    private fun parseAssignableSuffix(ctx: AprlParser.AssignableSuffixContext): AssignableSuffix {
        return if (ctx.indexingSuffix() != null) {
            parseIndexingSuffix(ctx.indexingSuffix())
        } else if (ctx.navigationSuffix() != null) {
            parseNavigationSuffix(ctx.navigationSuffix())
        } else {
            throw InternalError("Expected AssignableSuffixContext ($ctx) to be indexingSuffix or navigationSuffix")
        }
    }
    
    private fun parseIndexingSuffix(ctx: AprlParser.IndexingSuffixContext): IndexingSuffix {
        val expressions = ctx.expression().mapMutable { parseExpression(it) }
        return IndexingSuffix(expressions)
    }
    
    private fun parseNavigationSuffix(ctx: AprlParser.NavigationSuffixContext): NavigationSuffix {
        val operator = parseMemberAccessOperator(ctx.memberAccessOperator())
        val identifier = ctx.simpleIdentifier().text
        return NavigationSuffix(operator, identifier)
    }
    
    private fun parseMemberAccessOperator(ctx: AprlParser.MemberAccessOperatorContext): NavigationSuffix.Operator {
        return if (ctx.PERIOD() != null) {
            NavigationSuffix.Operator.PERIOD
        } else if (ctx.QUEST_PERIOD() != null) {
            NavigationSuffix.Operator.QUEST_PERIOD
        } else if (ctx.DOUBLE_COLON() != null) {
            NavigationSuffix.Operator.DOUBLE_COLON
        } else {
            throw InternalError("Expected MemberAccessOperatorContext ($ctx) to be PERIOD, QUEST_PERIOD or DOUBLE_COLON")
        }
    }
    
    private fun parseLoopStatement(ctx: AprlParser.LoopStatementContext): LoopStatement {
        return if (ctx.forStatement() != null) {
            parseForStatement(ctx.forStatement())
        } else if (ctx.whileStatement() != null) {
            parseWhileStatement(ctx.whileStatement())
        } else if (ctx.doWhileStatement() != null) {
            parseDoWhileStatement(ctx.doWhileStatement())
        } else {
            throw InternalError("Expected LoopStatementContext to be for-, while- or doWhileStatement")
        }
    }
    
    private fun parseForStatement(ctx: AprlParser.ForStatementContext): ForStatement {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: mutableListOf()
        val variableDeclaration = ctx.variableDeclaration()?.let { parseVariableDeclaration(it, false) }
        val expression = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        return ForStatement(annotations, variableDeclaration, expression, statements)
    }
    
    private fun parseWhileStatement(ctx: AprlParser.WhileStatementContext): WhileStatement {
        val expression = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        return WhileStatement(expression, statements)
    }
    
    private fun parseDoWhileStatement(ctx: AprlParser.DoWhileStatementContext): DoWhileStatement {
        val statements = parseBlock(ctx.block())
        val expression = parseExpression(ctx.expression())
        return DoWhileStatement(statements, expression)
    }
    
    private fun parseAssignmentOperator(ctx: AprlParser.AssignmentOperatorContext): Assignment.Operator {
        return if (ctx.ASSIGN() != null) {
            Assignment.Operator.ASSIGN
        } else if (ctx.DEFINE() != null) {
            Assignment.Operator.DEFINE
        } else if (ctx.ADD_ASSIGN() != null) {
            Assignment.Operator.ADD_ASSIGN
        } else if (ctx.SUB_ASSIGN() != null) {
            Assignment.Operator.SUB_ASSIGN
        } else if (ctx.MUL_ASSIGN() != null) {
            Assignment.Operator.MUL_ASSIGN
        } else if (ctx.DIV_ASSIGN() != null) {
            Assignment.Operator.DIV_ASSIGN
        } else if (ctx.MOD_ASSIGN() != null) {
            Assignment.Operator.MOD_ASSIGN
        } else if (ctx.EXP_ASSIGN() != null) {
            Assignment.Operator.EXP_ASSIGN
        } else if (ctx.CONJ_ASSIGN() != null) {
            Assignment.Operator.CONJ_ASSIGN
        } else if (ctx.DISJ_ASSIGN() != null) {
            Assignment.Operator.DISJ_ASSIGN
        } else if (ctx.XOR_ASSIGN() != null) {
            Assignment.Operator.XOR_ASSIGN
        } else if (ctx.ELVIS_ASSIGN() != null) {
            Assignment.Operator.ELVIS_ASSIGN
        } else {
            throw InternalError("Expected AssignmentOperatorContext ($ctx) to be ASSIGN, DEFINE, ADD_ASSIGN, SUB_ASSIGN, MUL_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, EXP_ASSIGN, CONJ_ASSIGN, DISJ_ASSIGN, XOR_ASSIGN or ELVIS_ASSIGN")
        }
    }
    
    private fun parseExpression(ctx: AprlParser.ExpressionContext): Expression {
        val disjunction = parseDisjunction(ctx.disjunction())
        return Expression(disjunction)
    }
    
    private fun parseDisjunction(ctx: AprlParser.DisjunctionContext): Disjunction {
        val conjunction = parseConjunction(ctx.conjunction(0))
        val additionalConjunctions = ctx.conjunction().drop(1).mapMutable { parseConjunction(it) }
        return Disjunction(conjunction, additionalConjunctions)
    }
    
    private fun parseConjunction(ctx: AprlParser.ConjunctionContext): Conjunction {
        val equalityComparison = parseEqualityComparison(ctx.equalityComparison(0))
        val additionalEqualityComparisons = ctx.equalityComparison().drop(1).mapMutable { parseEqualityComparison(it) }
        return Conjunction(equalityComparison, additionalEqualityComparisons)
    }
    
    private fun parseEqualityComparison(ctx: AprlParser.EqualityComparisonContext): EqualityComparison {
        val identityComparison = parseIdentityComparison(ctx.identityComparison(0))
        val additionalIdentityComparisons = ctx.identityComparison().drop(1).mapMutable { parseIdentityComparison(it) }
        return EqualityComparison(identityComparison, additionalIdentityComparisons)
    }
    
    private fun parseIdentityComparison(ctx: AprlParser.IdentityComparisonContext): IdentityComparison {
        val comparison = parseComparison(ctx.comparison(0))
        val additionalComparisons = ctx.comparison().drop(1).mapMutable { parseComparison(it) }
        return IdentityComparison(comparison, additionalComparisons)
    }
    
    private fun parseComparison(ctx: AprlParser.ComparisonContext): Comparison {
        val callExpression = parseNamedInfixExpression(ctx.namedInfixExpression(0))
        val additionalCallExpressions = ctx.namedInfixExpression().drop(1).mapIndexedMutable { i, it -> parseComparisonOperator(ctx.comparisonOperator(i)) to parseNamedInfixExpression(it) }
        return Comparison(callExpression, additionalCallExpressions)
    }
    
    private fun parseComparisonOperator(ctx: AprlParser.ComparisonOperatorContext): Comparison.Operator {
        return if (ctx.LANGLE() != null || ctx.NRANGLE() != null) {
            Comparison.Operator.LT
        } else if (ctx.RANGLE() != null || ctx.NLANGLE() != null) {
            Comparison.Operator.GT
        } else if (ctx.LEQ() != null || ctx.NGEQ() != null) {
            Comparison.Operator.LEQ
        } else if (ctx.GEQ() != null || ctx.NLEQ() != null) {
            Comparison.Operator.GEQ
        } else {
            throw InternalError("Expected ComparisonOperatorContext ($ctx) to be LANGLE, NLANGLE, RANGLE, NRANGLE, LEQ, NLEQ, GEQ, NGEQ or SPACESHIP")
        }
    }
    
    private fun parseCallSuffix(ctx: AprlParser.CallSuffixContext): CallSuffix {
        val typeArguments = ctx.typeArguments()?.let { parseTypeArguments(it) }
        val lambdaCallSuffix = ctx.lambdaCallSuffix()?.let { parseLambdaCallSuffix(it) }
        val valueArguments = ctx.valueArguments()?.let { parseValueArguments(it) }
        return CallSuffix(typeArguments, lambdaCallSuffix, valueArguments)
    }
    
    private fun parseLambdaCallSuffix(ctx: AprlParser.LambdaCallSuffixContext): LambdaCallSuffix {
        val valueArguments = ctx.valueArguments()?.let { parseValueArguments(it) }
        val annotatedLambda = parseAnnotatedLambda(ctx.annotatedLambda())
        return LambdaCallSuffix(valueArguments, annotatedLambda)
    }
    
    private fun parseAnnotatedLambda(ctx: AprlParser.AnnotatedLambdaContext): AnnotatedLambda {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.EXPRESSION) } ?: mutableListOf()
        val lambdaLiteral = parseLambdaLiteral(ctx.lambdaLiteral())
        return AnnotatedLambda(annotations, lambdaLiteral)
    }
    
    private fun parseLambdaLiteral(ctx: AprlParser.LambdaLiteralContext): LambdaLiteral {
        val parameters = ctx.lambdaParameters()?.lambdaParameter()?.mapMutable { parseLambdaParameter(it) } ?: mutableListOf()
        val statements = ctx.statements().statement().flatMapMutable { parseStatement(it) }
        return LambdaLiteral(parameters, statements)
    }
    
    private fun parseLambdaParameter(ctx: AprlParser.LambdaParameterContext): LambdaParameter {
        val variableDeclaration = ctx.variableDeclaration()?.let { parseVariableDeclaration(it, true) }
        val type = ctx.type()?.let { parseType(it) }
        return LambdaParameter(variableDeclaration, type)
    }
    
    private fun parseVariableDeclaration(ctx: AprlParser.VariableDeclarationContext, annotationsAllowed: Boolean): VariableDeclaration {
        val annotations = ctx.annotations()?.let {
            if (!annotationsAllowed) {
                throw Error(simpleName, it.position, "Annotations are not allowed in this position")
            }
            parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE)
        } ?: mutableListOf()
        val name = ctx.simpleIdentifier().text
        val type = ctx.type()?.let { parseType(it) }
        return VariableDeclaration(annotations, name, type)
    }
    
    private fun parseNamedInfixExpression(ctx: AprlParser.NamedInfixExpressionContext): NamedInfixExpression {
        val elvisExpression = parseElvisExpression(ctx.elvisExpression())
        val namedInfixes = ctx.namedInfix()?.mapMutable { parseNamedInfix(it) } ?: mutableListOf()
        return NamedInfixExpression(elvisExpression, namedInfixes)
    }
    
    private fun parseNamedInfix(ctx: AprlParser.NamedInfixContext): Pair<NamedInfixExpression.Operator, NamedInfixExpression.ElvisOrType> {
        val operator =
            ctx.inOperator()?.let { parseInOperator(it) } ?: ctx.isOperator?.let { parseIsOperator(it) } ?: throw InternalError("Expected NamedInfixContext ($ctx) to be IN or IS")
        val elvisExpression = ctx.elvisExpression()?.let { parseElvisExpression(it) }
        val type = ctx.type()?.let { parseType(it) }
        val elvisOrType = NamedInfixExpression.ElvisOrType(elvisExpression, type)
        return operator to elvisOrType
    }
    
    private fun parseInOperator(ctx: AprlParser.InOperatorContext): NamedInfixExpression.Operator {
        return if (ctx.IN() != null) {
            NamedInfixExpression.Operator.IN
        } else if (ctx.NOT_IN() != null) {
            NamedInfixExpression.Operator.NOT_IN
        } else {
            throw InternalError("Expected InOperatorContext ($ctx) to be IN or NOT_IN")
        }
    }
    
    private fun parseIsOperator(ctx: AprlParser.IsOperatorContext): NamedInfixExpression.Operator {
        return if (ctx.IS() != null) {
            NamedInfixExpression.Operator.IS
        } else if (ctx.NOT_IS() != null) {
            NamedInfixExpression.Operator.NOT_IS
        } else {
            throw InternalError("Expected InOperatorContext ($ctx) to be IN or NOT_IN")
        }
    }
    
    private fun parseElvisExpression(ctx: AprlParser.ElvisExpressionContext): ElvisExpression {
        val infixFunctionCall = parseInfixFunctionCall(ctx.infixFunctionCall(0))
        val additionalInfixFunctionCalls = ctx.infixFunctionCall().drop(1).mapMutable { parseInfixFunctionCall(it) }
        return ElvisExpression(infixFunctionCall, additionalInfixFunctionCalls)
    }
    
    private fun parseInfixFunctionCall(ctx: AprlParser.InfixFunctionCallContext): InfixFunctionCall {
        val rangeExpression = parseRangeExpression(ctx.rangeExpression(0))
        val additionalRangeExpressions = ctx.rangeExpression().drop(1)
        var left = evaluateRangeExpression(rangeExpression)
        additionalRangeExpressions.forEachIndexed { i, it ->
            val identifier = ctx.simpleIdentifier(i)
            val functionName = identifier.text
            val parameter = evaluateRangeExpression(parseRangeExpression(it))
            val memberFunction = loadMethod(left.first, functionName)
            val extensionFunction = loadExtensionFunction(left, functionName)
            left = if (memberFunction != null) {
                if (memberFunction.parameters.size != 1) {
                    throw Error(simpleName, it.position, "Method must have exactly one parameter to be infix called")
                }
                val onlyParameter = memberFunction.parameters[0]
                if (!isInBound(parameter.first, parameter.second, onlyParameter.type)) {
                    throw Error(simpleName, it.position, "Type mismatch: Inferred type is ${parameter.toJava()} but ${onlyParameter.type} was expected")
                }
                jTypeToType(memberFunction.genericReturnType).canonical()
            } else if (extensionFunction != null) {
                if (extensionFunction.parameters.size != 2) {
                    throw Error(simpleName, it.position, "Method must have exactly one parameter to be infix called")
                }
                val onlyParameter = extensionFunction.parameters[1]
                if (!isInBound(parameter.first, parameter.second, onlyParameter.type)) {
                    throw Error(simpleName, it.position, "Type mismatch: Inferred type is ${parameter.toJava()} but ${onlyParameter.type} was expected")
                }
                jTypeToType(extensionFunction.genericReturnType).canonical()
            } else {
                throw Error(simpleName, identifier.position, "Unresolved reference: '${identifier.text}'")
            }
        }
        return InfixFunctionCall(rangeExpression, additionalRangeExpressions.mapIndexedMutable { i, it -> ctx.simpleIdentifier(i).text to parseRangeExpression(it) })
    }
    
    private fun jTypeToType(type: JType): Type {
        return when (type) {
            is Class<*> -> {
                ClassType(type, null)
            }
            is ParameterizedType -> {
                ClassType(type.toPlainClass(), jTypeArgumentsToTypeArguments(type.actualTypeArguments))
            }
            is GenericArrayType -> {
                return ArrayType(Annotations(), jTypeToType(type.genericComponentType))
            }
            else -> {
                throw InternalError("Didn't expect type $type to be ${type.javaClass.name}")
            }
        }
    }
    
    private fun jTypeArgumentsToTypeArguments(typeArguments: Array<out JType>): TypeArgument {
        TODO("jTypeArgumentsToTypeArguments()")
    }
    
    private fun parseRangeExpression(ctx: AprlParser.RangeExpressionContext): RangeExpression {
        val xorExpression = parseXorExpression(ctx.xorExpression(0))
        val operator = ctx.toOperator()?.let { parseToOperator(it) }
        val to = ctx.xorExpression().getOrNull(1)?.let { parseXorExpression(it) }
        return RangeExpression(xorExpression, operator, to)
    }
    
    private fun parseToOperator(ctx: AprlParser.ToOperatorContext): RangeExpression.Operator {
        return if (ctx.TO() != null) {
            RangeExpression.Operator.TO
        } else if (ctx.DOWNTO() != null) {
            RangeExpression.Operator.DOWNTO
        } else if (ctx.UNTIL() != null) {
            RangeExpression.Operator.UNTIL
        } else {
            throw InternalError("Expected ToOperatorContext ($ctx) to be TO, DOWNTO or UNTIL")
        }
    }
    
    private fun parseXorExpression(ctx: AprlParser.XorExpressionContext): XorExpression {
        val additiveExpression = parseAdditiveExpression(ctx.additiveExpression(0))
        val additionalAdditiveExpressions = ctx.additiveExpression().drop(1).mapMutable { parseAdditiveExpression(it) }
        return XorExpression(additiveExpression, additionalAdditiveExpressions)
    }
    
    private fun parseAdditiveExpression(ctx: AprlParser.AdditiveExpressionContext): AdditiveExpression {
        val multiplicativeExpression = parseMultiplicativeExpression(ctx.multiplicativeExpression(0))
        val additionalMultiplicativeExpressions =
            ctx.multiplicativeExpression().drop(1).mapIndexedMutable { i, it -> parseAdditiveOperator(ctx.additiveOperator(i)) to parseMultiplicativeExpression(it) }
        return AdditiveExpression(multiplicativeExpression, additionalMultiplicativeExpressions)
    }
    
    private fun parseAdditiveOperator(ctx: AprlParser.AdditiveOperatorContext): AdditiveExpression.Operator {
        return if (ctx.ADD() != null) {
            AdditiveExpression.Operator.PLUS
        } else if (ctx.SUB() != null) {
            AdditiveExpression.Operator.MINUS
        } else {
            throw InternalError("Expecetd AdditiveOperatorContext ($ctx) to be ADD or SUB")
        }
    }
    
    private fun parseMultiplicativeExpression(ctx: AprlParser.MultiplicativeExpressionContext): MultiplicativeExpression {
        val exponentialExpression = parseExponentialExpression(ctx.exponentialExpression(0))
        val additionalExponentialExpressions =
            ctx.exponentialExpression().drop(1).mapIndexedMutable { i, it -> parseMultiplicativeOperator(ctx.multiplicativeOperator(i)) to parseExponentialExpression(it) }
        return MultiplicativeExpression(exponentialExpression, additionalExponentialExpressions)
    }
    
    private fun parseMultiplicativeOperator(ctx: AprlParser.MultiplicativeOperatorContext): MultiplicativeExpression.Operator {
        return if (ctx.MUL() != null) {
            MultiplicativeExpression.Operator.MUL
        } else if (ctx.DIV() != null) {
            MultiplicativeExpression.Operator.DIV
        } else if (ctx.MOD() != null) {
            MultiplicativeExpression.Operator.MOD
        } else {
            throw InternalError("Expected MultiplicativeOperatorContext to be MUL, DIV or MOD")
        }
    }
    
    private fun parseExponentialExpression(ctx: AprlParser.ExponentialExpressionContext): ExponentialExpression {
        val asExpression = parseAsExpression(ctx.asExpression(0))
        val additionalAsExpressions = ctx.asExpression().drop(1).mapMutable { parseAsExpression(it) }
        return ExponentialExpression(asExpression, additionalAsExpressions)
    }
    
    private fun parseAsExpression(ctx: AprlParser.AsExpressionContext): AsExpression {
        val prefixUnaryExpression = parsePrefixUnaryExpression(ctx.prefixUnaryExpression())
        val typeCasts = ctx.asOperator()?.mapIndexedMutable { i, it -> parseAsOperator(it) to parseType(ctx.type(i)) } ?: mutableListOf()
        return AsExpression(prefixUnaryExpression, typeCasts)
    }
    
    private fun parseAsOperator(ctx: AprlParser.AsOperatorContext): AsExpression.Operator {
        return if (ctx.AS() != null) {
            AsExpression.Operator.AS
        } else if (ctx.AS_QUEST() != null) {
            AsExpression.Operator.AS_QUEST
        } else {
            throw InternalError("Expected AsOperatorContext to be AS or AS_QUEST")
        }
    }
    
    private fun parsePrefixUnaryExpression(ctx: AprlParser.PrefixUnaryExpressionContext): PrefixUnaryExpression {
        val unaryPrefixes = ctx.unaryPrefix()?.mapMutable { parseUnaryPrefix(it) } ?: mutableListOf()
        val postfixUnaryExpression = parsePostfixUnaryExpression(ctx.postfixUnaryExpression())
        return PrefixUnaryExpression(unaryPrefixes, postfixUnaryExpression)
    }
    
    private fun parseUnaryPrefix(ctx: AprlParser.UnaryPrefixContext): UnaryPrefix {
        return if (ctx.INCR() != null) {
            UnaryPrefix.INCR
        } else if (ctx.DECR() != null) {
            UnaryPrefix.DECR
        } else if (ctx.ADD() != null) {
            UnaryPrefix.ADD
        } else if (ctx.SUB() != null) {
            UnaryPrefix.SUB
        } else if (ctx.EXCL() != null) {
            UnaryPrefix.EXCL
        } else if (ctx.DOUBLE_AT() != null) {
            UnaryPrefix.DOUBLE_AT
        } else {
            throw InternalError("Expected UnaryPrefixContext ($ctx) to be INCR, DECR, ADD, SUb, EXCL or DOUBLE_AT")
        }
    }
    
    private fun parsePostfixUnaryExpression(ctx: AprlParser.PostfixUnaryExpressionContext): PostfixUnaryExpression {
        val atomicExpression = parseAtomicExpression(ctx.atomicExpression())
        val unaryPostfixes = ctx.unaryPostfix()?.mapMutable { parseUnaryPostfix(it) } ?: mutableListOf()
        return PostfixUnaryExpression(atomicExpression, unaryPostfixes)
    }
    
    private fun parseUnaryPostfix(ctx: AprlParser.UnaryPostfixContext): UnaryPostfix {
        val postfixUnaryOperator = ctx.postfixUnaryOperator()?.let { parsePostfixUnaryOperator(it) }
        val typeArguments = ctx.typeArguments()?.let { parseTypeArguments(it) }
        val callSuffix = ctx.callSuffix()?.let { parseCallSuffix(it) }
        val indexingSuffix = ctx.indexingSuffix()?.let { parseIndexingSuffix(it) }
        val navigationSuffix = ctx.navigationSuffix()?.let { parseNavigationSuffix(it) }
        return UnaryPostfix(postfixUnaryOperator, typeArguments, callSuffix, indexingSuffix, navigationSuffix)
    }
    
    private fun parsePostfixUnaryOperator(ctx: AprlParser.PostfixUnaryOperatorContext): PostfixUnaryOperator {
        return if (ctx.INCR() != null) {
            PostfixUnaryOperator.INCR
        } else if (ctx.DECR() != null) {
            PostfixUnaryOperator.DECR
        } else if (ctx.DOUBLE_EXCL() != null) {
            PostfixUnaryOperator.DOUBLE_EXCL
        } else {
            throw InternalError("Expected PostfixUnaryOperatorContext ($ctx) to be INCR, DECR or DOUBLE_EXCL")
        }
    }
    
    private fun parseAtomicExpression(ctx: AprlParser.AtomicExpressionContext): AtomicExpression {
        val parenthesizedExpression = ctx.parenthesizedExpression()?.let { parseParenthesizedExpression(it) }
        val simpleIdentifier = ctx.simpleIdentifier()?.text
        val literalConstant = ctx.literalConstant()?.let { parseLiteralConstant(it) }
        val contextualReference = ctx.contextualReference()?.let { parseContextualReference(it) }
        val callableReference = ctx.callableReference()?.let { parseCallableReference(it) }
        val lambdaLiteral = ctx.lambdaLiteral()?.let { parseLambdaLiteral(it) }
        val collectionLiteral = ctx.collectionLiteral()?.let { parseCollectionLiteral(it) }
        val thisLiteral = ctx.thisExpression()?.let { ThisLiteral }
        val superLiteral = ctx.superExpression()?.let { SuperLiteral }
        val conditionalExpression = ctx.conditionalExpression()?.let { parseConditionalExpression(it) }
        val optionalTryExpression = ctx.optionalTryExpression()?.let { parseOptionalTryExpression(it) }
        val tryExpression = ctx.tryExpression()?.let { parseTryExpression(it) }
        val jumpExpression = ctx.jumpExpression()?.let { parseJumpExpression(it) }
        return AtomicExpression(
            parenthesizedExpression, simpleIdentifier, literalConstant, contextualReference, callableReference, lambdaLiteral, collectionLiteral, thisLiteral, superLiteral,
            conditionalExpression, optionalTryExpression, tryExpression, jumpExpression
        )
    }
    
    private fun parseParenthesizedExpression(ctx: AprlParser.ParenthesizedExpressionContext): Expression {
        return parseExpression(ctx.expression())
    }
    
    private fun parseLiteralConstant(ctx: AprlParser.LiteralConstantContext): LiteralConstant {
        val `null` = ctx.nullLiteral()?.let { Null }
        val bool = ctx.boolLiteral()?.text?.toBooleanStrictOrNull()
        val trilean = ctx.trileanLiteral()?.text?.toTrileanOrNull()
        val int = ctx.integerLiteral()?.text?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Int.MAX_VALUE.toLong())) {
                throw Error(simpleName, ctx.integerLiteral().position, "Int literal too big")
            } else if (it < BigInteger(Int.MIN_VALUE.toLong())) {
                throw Error(simpleName, ctx.integerLiteral().position, "Int literal too small")
            }
            it.toInt()
        }
        val long = ctx.longLiteral()?.text?.removeSuffix("l")?.removeSuffix("L")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Long.MAX_VALUE)) {
                throw Error(simpleName, ctx.longLiteral().position, "Long literal too big")
            } else if (it < BigInteger(Long.MIN_VALUE)) {
                throw Error(simpleName, ctx.longLiteral().position, "Long literal too small")
            }
            it.toLong()
        }
        val short = ctx.shortLiteral()?.text?.removeSuffix("s")?.removeSuffix("S")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Short.MAX_VALUE.toLong())) {
                throw Error(simpleName, ctx.shortLiteral().position, "Short literal too big")
            } else if (it < BigInteger(Short.MIN_VALUE.toLong())) {
                throw Error(simpleName, ctx.shortLiteral().position, "Short literal too small")
            }
            it.toShort()
        }
        val byte = ctx.byteLiteral()?.text?.removeSuffix("b")?.removeSuffix("B")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Byte.MAX_VALUE.toLong())) {
                throw Error(simpleName, ctx.byteLiteral().position, "Byte literal too big")
            } else if (it < BigInteger(Byte.MIN_VALUE.toLong())) {
                throw Error(simpleName, ctx.byteLiteral().position, "Byte literal too small")
            }
            it.toByte()
        }
        val float = ctx.floatLiteral()?.text?.removeSuffix("f")?.removeSuffix("F")?.decodeDecimalNumberOrNull()?.let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                throw Error(simpleName, ctx.floatLiteral().position, "Float literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                throw Error(simpleName, ctx.floatLiteral().position, "Float literal too small")
            }
            it.toFloat()
        }
        val double = ctx.doubleLiteral()?.text?.removeSuffix("d")?.removeSuffix("D")?.decodeDecimalNumberOrNull()?.let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                throw Error(simpleName, ctx.doubleLiteral().position, "Double literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                throw Error(simpleName, ctx.doubleLiteral().position, "Double literal too small")
            }
            it.toDouble()
        }
        val complex = ctx.complexLiteral()?.text?.decodeComplexNumberOrNull()?.apply {
            if (getReal() > BigDecimal(Double.MAX_VALUE)) {
                throw Error(simpleName, ctx.complexLiteral().position, "Complex real part too big")
            }
            if (getImaginary() > BigDecimal(Double.MAX_VALUE)) {
                throw Error(simpleName, ctx.complexLiteral().position + getReal().toString().length + 1, "Complex imaginary part too big")
            }
            if (getReal() < BigDecimal(Double.MIN_VALUE)) {
                throw Error(simpleName, ctx.complexLiteral().position, "Complex real part too small")
            }
            if (getImaginary() < BigDecimal(Double.MIN_VALUE)) {
                throw Error(simpleName, ctx.complexLiteral().position + getReal().toString().length + 1, "Complex imaginary part too small")
            }
        }
        val character = ctx.characterLiteral()?.text?.get(1)
        val string = ctx.stringLiteral()?.text?.removeSurrounding("\"")
        return LiteralConstant(`null`, bool, trilean, int, long, short, byte, float, double, complex, character, string)
    }
    
    private fun parseContextualReference(ctx: AprlParser.ContextualReferenceContext): MutableList<String> {
        return ctx.identifier().simpleIdentifier().mapMutable { it.text }
    }
    
    private fun parseCallableReference(ctx: AprlParser.CallableReferenceContext): CallableReference {
        val receiverType = ctx.receiverType()?.let { parseReceiverType(it) }
        val identifier = ctx.simpleIdentifier().text
        return CallableReference(receiverType, identifier)
    }
    
    private fun parseCollectionLiteral(ctx: AprlParser.CollectionLiteralContext): MutableList<Expression> {
        return ctx.expression().mapMutable { parseExpression(it) }
    }
    
    private fun parseConditionalExpression(ctx: AprlParser.ConditionalExpressionContext): ConditionalExpression {
        return if (ctx.ifExpression() != null) {
            parseIfExpression(ctx.ifExpression())
        } else if (ctx.matchExpression() != null) {
            parseMatchExpression(ctx.matchExpression())
        } else {
            throw InternalError("Expected ConditionalExpressionContext ($ctx) to be if- or matchExpression")
        }
    }
    
    private fun parseIfExpression(ctx: AprlParser.IfExpressionContext): IfExpression {
        val unless = ctx.UNLESS() != null
        val condition = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block(0))
        val elsifExpressions = ctx.elsifExpression()?.mapMutable { parseElsifExpression(it) } ?: mutableListOf()
        val elseStatements = ctx.block().getOrNull(1)?.let { parseBlock(it) }
        return IfExpression(unless, condition, statements, elsifExpressions, elseStatements)
    }
    
    private fun parseElsifExpression(ctx: AprlParser.ElsifExpressionContext): ElsifExpression {
        val condition = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        return ElsifExpression(condition, statements)
    }
    
    private fun parseMatchExpression(ctx: AprlParser.MatchExpressionContext): MatchExpression {
        val expression = parseExpression(ctx.expression())
        val matchEntries = ctx.matchEntry().mapMutable { parseMatchEntry(it) }
        return MatchExpression(expression, matchEntries)
    }
    
    private fun parseMatchEntry(ctx: AprlParser.MatchEntryContext): MatchEntry {
        val default = ctx.ELSE() != null
        val literalConstants = ctx.literalConstant()?.mapMutable { parseLiteralConstant(it) } ?: mutableListOf()
        val statements = parseBlock(ctx.block())
        return MatchEntry(default, literalConstants, statements)
    }
    
    private fun parseOptionalTryExpression(ctx: AprlParser.OptionalTryExpressionContext): OptionalTryExpression {
        val statements = ctx.block()?.let { parseBlock(it) }
        val expression = ctx.expression()?.let { parseExpression(it) }
        return OptionalTryExpression(statements, expression)
    }
    
    private fun parseTryExpression(ctx: AprlParser.TryExpressionContext): TryExpression {
        val statements = parseBlock(ctx.block())
        val catchBlocks = ctx.catchBlock()?.mapMutable { parseCatchBlock(it) } ?: mutableListOf()
        val finallyBlock = ctx.finallyBlock()?.let { parseFinallyBlock(it) }
        return TryExpression(statements, catchBlocks, finallyBlock)
    }
    
    private fun parseCatchBlock(ctx: AprlParser.CatchBlockContext): CatchBlock {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: mutableListOf()
        val name = ctx.simpleIdentifier().text
        val types = ctx.type().mapMutable { parseType(it) }
        val statements = parseBlock(ctx.block())
        return CatchBlock(annotations, name, types, statements)
    }
    
    private fun parseFinallyBlock(ctx: AprlParser.FinallyBlockContext): FinallyBlock {
        val statements = parseBlock(ctx.block())
        return FinallyBlock(statements)
    }
    
    private fun parseJumpExpression(ctx: AprlParser.JumpExpressionContext): JumpExpression {
        return if (ctx.triggerExpression() != null) {
            parseTriggerExpression(ctx.triggerExpression())
        } else if (ctx.returnExpression() != null) {
            parseReturnExpression(ctx.returnExpression())
        } else if (ctx.continueExpression() != null) {
            return ContinueExpression
        } else if (ctx.breakExpression() != null) {
            return BreakExpression
        } else {
            throw InternalError("Expected JumpExpressionContext ($ctx) to be trigger-, return-, continue- or breakExpression")
        }
    }
    
    private fun parseTriggerExpression(ctx: AprlParser.TriggerExpressionContext): TriggerExpression {
        val expression = parseExpression(ctx.expression())
        return TriggerExpression(expression)
    }
    
    private fun parseReturnExpression(ctx: AprlParser.ReturnExpressionContext): ReturnExpression {
        val expression = parseExpression(ctx.expression())
        return ReturnExpression(expression)
    }
    
    private fun parseLocalVariableDeclaration(ctx: AprlParser.LocalVariableDeclarationContext): MutableList<LocalVariable> {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: mutableListOf()
        val final = ctx.VAL() != null || ctx.CONST() != null
        return mutableListOf(parseLocalVariable(annotations, final, ctx.variableDeclaration(), ctx.expression()))
    }
    
    private fun parseLocalVariable(
        annotations: Annotations,
        final: Boolean,
        variableDeclaration: AprlParser.VariableDeclarationContext,
        expression: AprlParser.ExpressionContext?,
    ): LocalVariable {
        return parseLocalVariable(annotations, final, variableDeclaration, expression?.let { parseExpression(it) }, expression?.position)
    }
    
    private fun parseLocalVariable(
        annotations: Annotations,
        final: Boolean,
        variableDeclaration: AprlParser.VariableDeclarationContext,
        expression: Expression?,
        expressionPosition: Pair<Int, Int>?,
    ): LocalVariable {
        annotations.addAll(variableDeclaration.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: mutableListOf())
        val type: Pair<Class<*>, TypeArgument?>
        if (variableDeclaration.type() != null) {
            type = parseType(variableDeclaration.type()).let { it.javaType to it.typeArguments }
            if (expression != null) {
                checkType(expression, expressionPosition!!, type)
            }
        } else {
            if (expression != null) {
                type = evaluateExpression(expression)
            } else {
                throw Error(simpleName, variableDeclaration.simpleIdentifier().position, "Variable must either have a type annotation or be initialized")
            }
        }
        return LocalVariable(variableDeclaration.simpleIdentifier().text, type, final, expression)
    }
    
    private fun checkType(expression: AprlParser.ExpressionContext, type: Pair<Class<*>, TypeArgument?>) {
        checkType(parseExpression(expression), expression.position, type)
    }
    
    private fun checkType(expression: Expression, expressionPosition: Pair<Int, Int>, type: Pair<Class<*>, TypeArgument?>) {
        evaluateExpression(expression).run {
            if (!isInBound(first, second, type.first, type.second)) {
                throw Error(simpleName, expressionPosition, "Type mismatch: inferred type is ${this.toJava()} but ${type.toJava()} was expected")
            }
        }
    }
    
    private fun parseInitializerBody(ctx: AprlParser.InitializerBodyContext): Statements {
        return parseBlock(ctx.block())
    }
    
    private fun parseBlock(ctx: AprlParser.BlockContext): Statements {
        return ctx.statements().statement()?.flatMapMutable { parseStatement(it) } ?: mutableListOf()
    }
    
    private fun parsePartnerDeclaration(ctx: AprlParser.PartnerDeclarationContext): MutableList<ClassMember> {
        TODO("parsePartnerDeclaration()")
    }
    
    private fun superCallConstructor(baseConstructor: Constructor, superArguments: ValueArguments): Constructor {
        baseConstructor.modifiers.add(Modifier.PUBLIC)
        baseConstructor.statements.add(0, SuperCall(superArguments))
        return baseConstructor
    }
    
    private fun superCallConstructor(clazz: Clazz, superArguments: ValueArguments): Constructor {
        return Constructor(clazz, modifiers = mutableSetOf(Modifier.PUBLIC), statements = mutableListOf(SuperCall(superArguments)))
    }
    
    private fun parseConstructor(ctx: AprlParser.PrimaryConstructorContext): Constructor {
        TODO("parseConstructor()")
    }
    
    private fun getValidConstructor(constructors: Array<JConstructor<*>>, valueArguments: ValueArguments): JConstructor<*>? {
        for (constructor in constructors) {
            if (constructor.isVarArgs) {
                if (valueArguments.size >= constructor.parameters.size - 1) { // at least as many value arguments as the parameters without varargs (varargs can be no argument at all)
                    if (constructor.parameters.dropLast(1).allIndexed { i, it -> isValidValueArgument(it, valueArguments[i]) }) {
                        if (valueArguments.drop(constructor.parameters.size - 1).all {
                                evaluateExpression(it.value).run {
                                    isInBound(first, second, constructor.parameters.last().type)
                                }
                            }
                        ) return constructor
                    }
                }
            } else {
                if (constructor.parameters.size == valueArguments.size) {
                    if (isValidConstructor(constructor, valueArguments)) {
                        return constructor
                    }
                }
            }
        }
        return null
    }
    
    private fun isValidConstructor(constructor: JConstructor<*>, valueArguments: ValueArguments): Boolean {
        return constructor.parameters.allIndexed { i, it -> isValidValueArgument(it, valueArguments[i]) }
    }
    
    private fun isValidValueArgument(parameter: Parameter, valueArgument: ValueArgument): Boolean {
        return if (parameter.isVarArgs) { // this function should not be called with vararg parameters
            false
        } else {
            evaluateExpression(valueArgument.value).run {
                isInBound(first, second, parameter.type)
            }
        }
    }
    
    private fun evaluateExpression(expression: Expression): Pair<Class<*>, TypeArgument?> {
        return evaluateDisjunction(expression.disjunction)
    }
    
    private fun evaluateDisjunction(disjunction: Disjunction): Pair<Class<*>, TypeArgument?> {
        return if (disjunction.additionalConjunctions.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateConjunction(disjunction.conjunction)
        }
    }
    
    private fun evaluateConjunction(conjunction: Conjunction): Pair<Class<*>, TypeArgument?> {
        return if (conjunction.additionalEqualityComparisons.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateEqualityComparison(conjunction.equalityComparison)
        }
    }
    
    private fun evaluateEqualityComparison(equalityComparison: EqualityComparison): Pair<Class<*>, TypeArgument?> {
        return if (equalityComparison.additionalIdentityComparisons.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateIdentityComparison(equalityComparison.identityComparison)
        }
    }
    
    private fun evaluateIdentityComparison(identityComparison: IdentityComparison): Pair<Class<*>, TypeArgument?> {
        return if (identityComparison.additionalComparisons.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateComparison(identityComparison.comparison)
        }
    }
    
    private fun evaluateComparison(comparison: Comparison): Pair<Class<*>, TypeArgument?> {
        return if (comparison.additionalNamedInfixExpressions.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateNamedInfixExpression(comparison.namedInfixExpression)
        }
    }
    
    private fun evaluateNamedInfixExpression(namedInfixExpression: NamedInfixExpression): Pair<Class<*>, TypeArgument?> {
        return if (namedInfixExpression.expressions.isNotEmpty()) {
            Boolean::class.javaPrimitiveType!! to null
        } else {
            evaluateElvisExpression(namedInfixExpression.elvisExpression)
        }
    }
    
    private fun evaluateElvisExpression(elvisExpression: ElvisExpression): Pair<Class<*>, TypeArgument?> {
        val infixFunctionType = evaluateInfixFunctionCall(elvisExpression.infixFunctionCall)
        return if (elvisExpression.additionalInfixFunctionCalls.isNotEmpty()) {
            val types = elvisExpression.additionalInfixFunctionCalls.map { evaluateInfixFunctionCall(it) }.toTypedArray()
            lowestCommonSuperClass(infixFunctionType, *types)
        } else {
            infixFunctionType
        }
    }
    
    private fun lowestCommonSuperClass(vararg classes: Pair<Class<*>, TypeArgument?>): Pair<Class<*>, TypeArgument?> {
        TODO("lowestCommonSuperClass()")
    }
    
    private fun evaluateInfixFunctionCall(infixFunctionCall: InfixFunctionCall): Pair<Class<*>, TypeArgument?> {
        val rangeExpressionType = evaluateRangeExpression(infixFunctionCall.rangeExpression)
        return if (infixFunctionCall.additionalRangeExpressions.isNotEmpty()) {
            var left = rangeExpressionType
            for ((functionName, param) in infixFunctionCall.additionalRangeExpressions) {
                val memberFunction = loadMethod(left.first, functionName)
                val extensionFunction = loadExtensionFunction(left, functionName)
                // left = memberFunction?.let { it.returnType } ?: extensionFunction?.let { it.returnType } ?: throw TooLateError("Unresolved reference: $functionName")
            }
            rangeExpressionType // TODO
        } else {
            rangeExpressionType
        }
    }
    
    private fun evaluateRangeExpression(rangeExpression: RangeExpression): Pair<Class<*>, TypeArgument?> {
        TODO("evaluateRangeExpression()")
    }
    
    private fun evaluateXorExpression(xorExpression: XorExpression): Pair<Class<*>, TypeArgument?> {
        TODO("evaluateXorExpression()")
    }
    
    private fun evaluateAdditiveExpression(additiveExpression: AdditiveExpression): Pair<Class<*>, TypeArgument?> {
        TODO("evaluateAdditiveExpression()")
    }
    
    private fun evaluateAssignableExpression(assignableExpression: AssignableExpression): Pair<Class<*>, TypeArgument?> {
        TODO("evaluateAssignableExpression()")
    }
    
    private fun checkTypeArguments(
        clazz: Class<*>,
        typeArguments: AprlParser.TypeArgumentsContext?,
        projectionsAllowed: Boolean,
        lastIdentifier: AprlParser.SimpleIdentifierContext,
    ) {
        val superTypeParameters = clazz.typeParameters
        val b = superTypeParameters.size
        val req = if (b == 1) "One type argument" else "$b type arguments"
        if (superTypeParameters.isNotEmpty()) {
            if (typeArguments?.typeProjection()?.isNotEmpty() != true) {
                throw Error(simpleName, lastIdentifier.position + lastIdentifier.text.length, "$req expected for ${clazz.name}")
            }
            if (typeArguments.typeProjection().size != b) {
                throw Error(simpleName, typeArguments.position, "$req expected for '${clazz.name}'")
            } else {
                for ((typeProjection, superTypeParameter) in typeArguments.typeProjection().pair(superTypeParameters)) {
                    val varianceModifier = typeProjection.typeProjectionModifierList()?.typeProjectionModifier()?.firstOrNull { it.varianceModifier() != null }
                    if (typeProjection.QUEST() != null) {
                        if (!projectionsAllowed) {
                            throw Error(simpleName, typeProjection.position, "Projections are not allowed here")
                        }
                    } else if (varianceModifier != null) {
                        if (!projectionsAllowed) {
                            throw Error(simpleName, varianceModifier.position, "Projections are not allowed here")
                        }
                    } else {
                        val type: Type = parseType(typeProjection.type())
                        for (bound in superTypeParameter.bounds) {
                            if (!isInBound(type.javaType, type.typeArguments, bound)) {
                                throw Error(simpleName, typeProjection.position, "Type argument is not within bounds (expected ${bound.typeName})")
                            }
                        }
                    }
                }
            }
        } else {
            if (typeArguments?.typeProjection()?.isNotEmpty() == true) {
                throw Error(simpleName, typeArguments.position, "No type arguments expected for '${clazz.name}'")
            }
        }
    }
    
    private fun isInBound(clazz: Class<*>, typeArguments: TypeArgument?, bound: JType): Boolean {
        return when (bound) {
            is Class<*> -> {
                bound.isAssignableFrom(clazz)
            }
            is ParameterizedType -> {
                val condition1 = (bound.rawType as Class<*>).isAssignableFrom(clazz)
                val condition2 = (typeArguments?.typeProjections ?: emptyList()).run {
                    val sameSize = size == bound.actualTypeArguments.size
                    val matching = allIndexed { i, typeProjection ->
                        typeProjection.wildcard || isInBound(typeProjection.type!!.javaType, typeProjection.type.typeArguments, bound.actualTypeArguments[i])
                    }
                    sameSize && matching
                }
                (condition1 && condition2)
            }
            is WildcardType -> {
                val belowUpper = bound.upperBounds.all { isInBound(clazz, typeArguments, it) }
                val aboveLower = bound.lowerBounds.all { clazz.isAssignableFrom(it.toPlainClass()) }
                belowUpper && aboveLower
            }
            else -> {
                throw InternalError("Didn't expect bound $bound to be ${bound.javaClass.name}")
            }
        }
    }
    
    private fun isInBound(clazz1: Class<*>, typeArguments1: TypeArgument?, clazz2: Class<*>, typeArguments2: TypeArgument?): Boolean {
        val type: JType = if (typeArguments2 != null) ParameterizedTypeImpl.make(clazz2, typeArguments2.toJava(), null) else clazz2
        return isInBound(clazz1, typeArguments1, type)
    }
    
    private fun JType.toPlainClass(): Class<*> {
        return when (this) {
            is Class<*> -> this
            is ParameterizedType -> this.rawType as Class<*>
            else -> throw InternalError("Didn't expect $this to be ${this.javaClass.name}")
        }
    }
    
    private fun checkClassExtendability(clazz: Class<*>, position: Pair<Int, Int>) {
        if (clazz.isEnum) {
            throw Error(simpleName, position, "Cannot inherit from enum '${clazz.name}'")
        } else if (clazz.isRecord) {
            throw Error(simpleName, position, "Cannot inherit from document '${clazz.name}'")
        } else if (JModifier.isFinal(clazz.modifiers)) {
            throw Error(simpleName, position, "'${clazz.name}' is final and cannot be inherited from")
        }
        // TODO: are there more class extendability restrictions?
    }
    
    private fun loadImportedClass(identifier: AprlParser.IdentifierContext): Class<*> {
        return loadImportedClass(identifier.simpleIdentifier())
    }
    
    fun loadImportedClass(identifiers: List<AprlParser.SimpleIdentifierContext>): Class<*> {
        val first = identifiers[0]
        val clazz = loadCompleteClass(identifiers.joinToString(".") { it.text })
        if (clazz != null) {
            return clazz
        }
        val baseClass = loadImportedClass(first) ?: throw Error(simpleName, first.position, "Unresolved reference: '${first.text}'")
        val suffix = if (identifiers.size == 1) "" else "." + identifiers.drop(1).joinToString(".") { it.text }
        val completeString = baseClass.name + suffix
        val completeClass = loadCompleteClass(completeString)
        if (completeClass == null) {
            var faulty: AprlParser.SimpleIdentifierContext? = null
            val total = mutableListOf<AprlParser.SimpleIdentifierContext>()
            for (some in identifiers.drop(1)) {
                total.add(some)
                val str = baseClass.name + "." + total.joinToString(".") { it.text }
                if (loadCompleteClass(str) == null) {
                    faulty = some
                    break
                }
            }
            throw Error(simpleName, faulty!!.position, "Unresolved reference: '${faulty.text}'")
        }
        return completeClass
    }
    
    private fun loadImportedClass(identifier: AprlParser.SimpleIdentifierContext): Class<*>? {
        val name = identifier.text
        // complete identifier (e.g. java.util.List)
        var possibleClass = loadCompleteClass(name)
        if (possibleClass != null) {
            return possibleClass
        }
        // direct class import (e.g. using java.util.List; (...) List)
        possibleClass = imports.firstOrNull { it.clazz?.simpleName == name || it.alias == name }?.clazz
        if (possibleClass != null) {
            return possibleClass
        }
        // package-import (e.g. using java.util.*; (...) List)
        for (pkg in imports.mapNotNull { it.pkg }) {
            possibleClass = loadCompleteClass(pkg.name + "." + name)
            if (possibleClass != null) {
                return possibleClass
            }
        }
        return null
    }
    
    private fun parseValueArguments(ctx: AprlParser.ValueArgumentsContext): ValueArguments {
        return ctx.valueArgument().mapMutable { parseValueArgument(it) }
    }
    
    private fun parseValueArgument(ctx: AprlParser.ValueArgumentContext): ValueArgument {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.EXPRESSION) } ?: mutableListOf()
        val expression = parseExpression(ctx.expression())
        return ValueArgument(annotations, expression)
    }
    
    private fun parseTypeParameters(ctx: AprlParser.TypeParametersContext): MutableList<TypeParameter> {
        return parseTypeParameters(ctx.typeParameter())
    }
    
    private fun parseTypeParameters(parameters: List<AprlParser.TypeParameterContext>): MutableList<TypeParameter> {
        return parameters.mapMutable { parseTypeParameter(it) }
    }
    
    private fun parseTypeParameter(parameter: AprlParser.TypeParameterContext): TypeParameter {
        val name = parameter.simpleIdentifier().text
        val constraints = parameter.type()?.let { parseTypeConstraints(it) } ?: emptyList()
        return TypeParameter(name, constraints.asArray())
    }
    
    private fun parseTypeConstraints(constraints: List<AprlParser.TypeContext>): MutableList<Type> {
        return constraints.mapMutable { parseType(it) }
    }
    
    private fun parseType(type: AprlParser.TypeContext): Type {
        val annotations = type.annotations()?.let { parseAnnotations(it, AnnotationTarget.TYPE) } ?: mutableListOf()
        val function = type.functionType()
        val paren = type.parenthesizedType()
        val array = type.arrayType()
        val nullable = type.nullableType()
        val identifier = type.identifier()
        val typeArguments = type.typeArguments()?.let { parseTypeArguments(it) }
        return if (function != null) {
            parseFunctionType(annotations, function)
        } else if (paren != null) {
            parseType(paren.type())
        } else if (array != null) {
            ArrayType(annotations, parseType(array.type()))
        } else if (nullable != null) {
            val identifier1 = nullable.identifier()
            val typeArguments1 = nullable.typeArguments()?.let { parseTypeArguments(it) }
            val paren1 = nullable.parenthesizedType()
            val array1 = nullable.arrayType()
            val baseType = if (identifier1 != null) {
                val clazz = loadImportedClass(identifier1)
                checkTypeArguments(clazz, nullable.typeArguments(), true, identifier1.simpleIdentifier().last())
                Identifier(this, annotations, identifier1.simpleIdentifier().toMutableList(), typeArguments1)
            } else if (paren1 != null) {
                parseType(paren1.type())
            } else if (array1 != null) {
                parseType(array1.type())
            } else {
                throw InternalError("Expected NullableTypeContext ($nullable) to have user-, parenthesized- or arrayType")
            }
            NullableType(annotations, baseType)
        } else if (identifier != null) {
            val clazz = loadImportedClass(identifier)
            checkTypeArguments(clazz, type.typeArguments(), true, identifier.simpleIdentifier().last())
            Identifier(this, annotations, identifier.simpleIdentifier().toMutableList(), typeArguments)
        } else {
            throw InternalError("Expected TypeContext ($type) to have function-, parenthesized-, array-, nullable- or userType")
        }
    }
    
    private fun parseParenthesizedType(type: AprlParser.ParenthesizedTypeContext): Type {
        return parseType(type.type())
    }
    
    private fun parseNullableType(ctx: AprlParser.NullableTypeContext): NullableType {
        val identifier = ctx.identifier()
        val typeArguments = ctx.typeArguments()?.let { parseTypeArguments(it) }
        val paren = ctx.parenthesizedType()
        val array = ctx.arrayType()
        val baseType = if (identifier != null) {
            val clazz = loadImportedClass(identifier)
            checkTypeArguments(clazz, ctx.typeArguments(), true, identifier.simpleIdentifier().last())
            Identifier(this, mutableListOf(), identifier.simpleIdentifier().toMutableList(), typeArguments)
        } else if (paren != null) {
            parseType(paren.type())
        } else if (array != null) {
            parseType(array.type())
        } else {
            throw InternalError("Expected NullableTypeContext ($ctx) to have user-, parenthesized- or arrayType")
        }
        return NullableType(mutableListOf(), baseType)
    }
    
    private fun parseIdentifier(ctx: AprlParser.IdentifierContext): Identifier {
        return Identifier(this, mutableListOf(), ctx.simpleIdentifier(), null)
    }
    
    private fun parseFunctionType(annotations: Annotations, ctx: AprlParser.FunctionTypeContext): FunctionType {
        val returnType = parseType(ctx.type())
        return FunctionType(annotations, ctx.functionTypeParameters().type()?.mapMutable { parseType(it) } ?: mutableListOf(), returnType)
    }
    
    private fun parseTypeArguments(ctx: AprlParser.TypeArgumentsContext): TypeArgument {
        return TypeArgument(ctx.typeProjection().mapMutable { parseTypeProjection(it) })
    }
    
    private fun parseTypeProjection(ctx: AprlParser.TypeProjectionContext): TypeProjection {
        val typeProjectionModifierList = ctx.typeProjectionModifierList()
        val annotations: Annotations
        val typeProjectionModifiers: MutableList<TypeProjectionModifier>
        if (typeProjectionModifierList == null) {
            annotations = mutableListOf()
            typeProjectionModifiers = mutableListOf()
        } else {
            annotations = annotationsFromTypeProjectionModifierList(typeProjectionModifierList)
            typeProjectionModifiers =
                typeProjectionModifiersFromTypeProjectionModifierList(typeProjectionModifierList)
        }
        return TypeProjection(annotations, typeProjectionModifiers, ctx.type()?.let { parseType(it) })
    }
    
    private fun annotationsFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): Annotations {
        return ctx.typeProjectionModifier().filter { it.annotation() != null }.flatMapMutable { parseAnnotation(it.annotation(), AnnotationTarget.TYPE) }
    }
    
    private fun typeProjectionModifiersFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): MutableList<TypeProjectionModifier> {
        return ctx.typeProjectionModifier().filter { it.varianceModifier() != null }.mapMutable { parseVarianceModifier(it.varianceModifier()) }
    }
    
    private fun parseVarianceModifier(ctx: AprlParser.VarianceModifierContext): TypeProjectionModifier {
        val sub = ctx.SUB_()
        val sup = ctx.SUPER()
        return if (sub != null) {
            TypeProjectionModifier.SUB
        } else if (sup != null) {
            TypeProjectionModifier.SUPER
        } else {
            throw InternalError("Expected VarianceModifierContext ($ctx) to be SUB_ or SUPER")
        }
    }
    
    private fun parseAnnotations(ctx: AprlParser.AnnotationsContext, requiredTarget: AnnotationTarget): Annotations {
        return ctx.annotation().flatMapMutable { parseAnnotation(it, requiredTarget) }
    }
    
    private fun parseAnnotation(ctx: AprlParser.AnnotationContext, requiredTarget: AnnotationTarget): Annotations {
        return if (ctx.LSQUARE() != null) {
            parseMultiAnnotation(ctx.unescapedAnnotation(), requiredTarget)
        } else {
            mutableListOf(parseSingleAnnotation(ctx.unescapedAnnotation(0), requiredTarget))
        }
    }
    
    private fun parseMultiAnnotation(annotations: List<AprlParser.UnescapedAnnotationContext>, requiredTarget: AnnotationTarget): Annotations {
        return annotations.mapMutable { parseSingleAnnotation(it, requiredTarget) }
    }
    
    private fun parseSingleAnnotation(annotation: AprlParser.UnescapedAnnotationContext, requiredTarget: AnnotationTarget): Triple<Class<*>, ValueArguments, AnnotationRetention> {
        val clazz = loadImportedClass(annotation.identifier())
        val valueArguments = annotation.valueArguments()?.let { parseValueArguments(it) } ?: mutableListOf()
        val retention = clazz.getAnnotation(Retention::class.java)?.value ?: AnnotationRetention.RUNTIME
        val targets = clazz.getAnnotation(Target::class.java)?.targets ?: AnnotationTarget.values()
        if (requiredTarget !in targets) {
            throw Error(simpleName, annotation.position, "Annotation '${clazz.name}' is not applicable to target '${requiredTarget.name.replace("_", " ").lowercase()}'")
        }
        if (getValidConstructor(clazz.constructors, valueArguments) == null) {
            throw Error(simpleName, annotation.valueArguments()?.position ?: annotation.identifier().let { it.position + it.text.length }, "No constructor can be called with the arguments supplied")
        }
        return Triple(clazz, valueArguments, retention)
    }
    
    private fun parseTopLevelInterface(ctx: AprlParser.InterfaceDeclarationContext): Interface {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level interface", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: mutableListOf()
        val inter = Interface(ctx.simpleIdentifier().text, null)
        // TODO: parse interface
        return inter
    }
    
    private fun parseTopLevelAnnotation(ctx: AprlParser.AnnotationDeclarationContext): Annotation {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level annotation", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.ANNOTATION) } ?: mutableListOf()
        val annotation = Annotation(ctx.simpleIdentifier().text, null)
        // TODO: parse annotation class
        return annotation
    }
    
    private fun parseTopLevelDocument(ctx: AprlParser.DocumentDeclarationContext): Document {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level document", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: mutableListOf()
        val document = Document(ctx.simpleIdentifier().text, null)
        // TODO: parse document class
        return document
    }
    
    private fun parseTopLevelStruct(ctx: AprlParser.StructDeclarationContext): Struct {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level struct", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: mutableListOf()
        val struct = Struct(ctx.simpleIdentifier().text, null)
        // TODO: parse struct
        return struct
    }
    
    private fun parseTopLevelEnum(ctx: AprlParser.EnumDeclarationContext): aprl.compiler.jvm.Enum {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level enum", Modifier::enum) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: mutableListOf()
        val enum = Enum(ctx.simpleIdentifier().text, null)
        // TODO: parse enum
        return enum
    }
    
    private fun parseTopLevelExtension(ctx: AprlParser.ExtensionDeclarationContext): List<ClassMember> {
        enclosingClassRequired = ctx.extensionBody() != null && ctx.extensionBody().extensionMember().size != 0
        return ctx.extensionBody()?.extensionMember()?.flatMapMutable { parseExtensionMember(it, parseReceiverType(ctx.receiverType()), ctx) } ?: mutableListOf()
    }
    
    private fun parseExtensionMember(ctx: AprlParser.ExtensionMemberContext, receiverType: ReceiverType, parent: AprlParser.ExtensionDeclarationContext): List<ClassMember> {
        return listOf(parseExtensionFunction(ctx.functionDeclaration(), receiverType, parent))
    }
    
    private fun parseExtensionFunction(ctx: AprlParser.FunctionDeclarationContext, receiverType: ReceiverType, parent: AprlParser.ExtensionDeclarationContext): Function {
        val param1 = MethodParameter(name = "\$this", type = receiverType.type)
        val name = ctx.simpleIdentifier().text
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.FUNCTION) } ?: mutableListOf()
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "extension function", Modifier::function) } ?: mutableSetOf()
        val typeParameters = ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf()
        parent.typeParameters()?.let { parseTypeParameters(it) }?.also { typeParameters.addAll(0, it) }
        val parameters = parseFunctionParameters(ctx.functionValueParameters()).apply { add(0, param1) }
        val returnType = ctx.type()?.let { parseType(it) }?.canonical() ?: throw Error(simpleName,
            ctx.functionValueParameters().let { it.position + it.text.length },
            "Extension function $name() must have explicit return type")
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: throw Error(simpleName,
            ctx.functionValueParameters().let { it.position + it.text.length },
            "Extension function $name() must have a body")
        return Function(name, enclosingClass, annotations, modifiers, typeParameters, parameters, returnType, statements)
    }
    
    private fun parseReceiverType(ctx: AprlParser.ReceiverTypeContext): ReceiverType {
        return if (ctx.parenthesizedType() != null) {
            ReceiverType(parenthesizedType = parseParenthesizedType(ctx.parenthesizedType()))
        } else if (ctx.nullableType() != null) {
            ReceiverType(nullableType = parseNullableType(ctx.nullableType()))
        } else if (ctx.identifier() != null) {
            ReceiverType(identifier = parseIdentifier(ctx.identifier()))
        } else {
            throw InternalError("Expected ReceiverTypeContext ($ctx) to have parenthesizedType, nullableType or identifier")
        }
    }
    
    private fun parseTopLevelFunction(ctx: AprlParser.FunctionDeclarationContext): Function {
        enclosingClassRequired = true
        return parseFunction(ctx, enclosingClass!!)
    }
    
    private fun parseTopLevelProperty(ctx: AprlParser.PropertyDeclarationContext): List<OnlyClassMember> {
        enclosingClassRequired = true
        return parseProperty(ctx, enclosingClass!!)
    }
    
    private fun modifiersFromModifierList(
        ctx: AprlParser.ModifierListContext,
        target: String,
        condition: (Modifier) -> Boolean,
    ): MutableSet<Modifier> {
        val modifiers = HashSet<Modifier>()
        for (modifier in ctx.modifier()) {
            val visibility = modifier.visibilityModifier()
            val inheritance = modifier.inheritanceModifier()
            val parameter = modifier.parameterModifier()
            val function = modifier.functionModifier()
            val actualModifier: Modifier = visibility?.run {
                if (PUBLIC() != null) Modifier.PUBLIC
                else if (LOCAL() != null) Modifier.LOCAL
                else if (BOUNDED() != null) Modifier.BOUNDED
                else if (PRIVATE() != null) Modifier.PRIVATE
                else throw InternalError("Expected VisibilityModifierContext ($visibility) to be PUBLIC, LOCAL, BOUNDED or PRIVATE")
            } ?: inheritance?.run {
                if (ABSTRACT() != null) Modifier.ABSTRACT
                else if (FINAL() != null) Modifier.FINAL
                else if (OPEN() != null) Modifier.OPEN
                else if (COVER() != null) Modifier.COVER
                else throw InternalError("Expected InheritanceModifierContext ($inheritance) to be SAMPLE, FINAL, OPEN or COVER")
            } ?: parameter?.run {
                if (PARAMS() != null) Modifier.PARAMS
                else throw InternalError("Expected ParameterModifierContext ($parameter) to be PARAMS")
            } ?: function?.run {
                if (INLINE() != null) Modifier.INLINE
                else if (SYNC() != null) Modifier.SYNC
                else if (EXTERNAL() != null) Modifier.EXTERNAL
                else throw InternalError("Expected FunctionModifierContext ($function) to be INLINE, SYNC or EXTERNAL")
            } ?: throw InternalError("Expected ModifierContext ($modifier) to have visibility-, inheritance-, parameter- or functionModifier")
            if (!condition(actualModifier)) {
                throw Error(simpleName, modifier.position, "Modifier '$actualModifier' is not applicable to '$target'")
            }
            modifiers.add(actualModifier)
        }
        return modifiers
    }
    
    private fun annotationsFromModifierList(ctx: AprlParser.ModifierListContext, requiredTarget: AnnotationTarget): Annotations {
        return ctx.annotations()?.flatMapMutable { parseAnnotations(it, requiredTarget) } ?: mutableListOf()
    }
    
    private fun loadExtensionFunction(type: Pair<Class<*>, TypeArgument?>, functionName: String): Method? {
        return importedMethods.firstOrNull { method ->
            method.name == functionName
                && method.parameters[0].let { it.name == "\$this" && isInBound(type.first, type.second, it.type) }
                && method.modifiers.let { JModifier.isFinal(it) && JModifier.isStatic(it) }
        }
    }
    
}