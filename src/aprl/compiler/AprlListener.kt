@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE")

package aprl.compiler

import aprl.AprlParser
import aprl.AprlParserBaseListener
import aprl.compiler.jvm.*
import aprl.compiler.jvm.Annotation
import aprl.compiler.jvm.Function
import aprl.lang.*
import aprl.lang.annotation.AnnotationRetention
import aprl.lang.annotation.AnnotationTarget
import aprl.lang.annotation.Retention
import aprl.lang.annotation.Target
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl
import java.io.File
import java.lang.Class
import java.lang.InternalError
import java.lang.Package
import java.lang.reflect.*
import java.util.*
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.Pair
import kotlin.Short
import kotlin.String
import kotlin.Suppress
import kotlin.TODO
import kotlin.Throws
import kotlin.Triple
import kotlin.also
import kotlin.apply
import kotlin.let
import kotlin.run
import kotlin.to
import java.lang.reflect.Constructor as JConstructor
import java.lang.reflect.Modifier as JModifier
import java.lang.reflect.Type as JType
import java.math.BigDecimal.valueOf as BigDecimal
import java.math.BigInteger.valueOf as BigInteger

class AprlListener(private val fileName: String, targetDir: File?) : AprlParserBaseListener() /*{
    
    companion object {
        private const val SUFFIX = "java"
    }
    
    *//**
     * Simple file name (only file name, no path) used in output messages (like errors or warnings).
     *//*
    private val simpleName = fileName.substringAfterLast(File.separator)
    
    *//**
     * Whether an enclosing class is required or not.
     * If there are standalone function(s)/property(ies)/extension(s), an enclosing class is needed.
     *//*
    private var enclosingClassRequired = false
        private set(new) {
            field = new
            enclosingClass = if (new) Clazz(fileName, null) else null
        }
    
    private var enclosingClass: ClassMemberOwner? = null // fileName if an enclosing class is required (see enclosingClassRequired), null otherwise
    
    private val outputFileName = targetDir?.let { it.path + File.separator + fileName.substringAfterLast(File.separator) } ?: fileName.replaceAfterLast(".", SUFFIX) // if there is a targetDir, use it; source folder otherwise
    
    private val namespace = Namespace()
    private val imports = mutableListOf<Import>()
    
    private val importedMethods get() = imports.filter { it.method != null }.map { it.method!! }
    
    private val topLevelObjects = mutableSetOf<TopLevelObject>()
    
    fun compile() {}
    
    override fun enterNamespaceHeader(ctx: AprlParser.NamespaceHeaderContext) {
        val namespaceMatchesLocation = namespaceMatchesLocation(ctx)
        if (!namespaceMatchesLocation) {
            WARN(simpleName, ctx.identifier(), "Namespace does not match file location")
        }
        namespace.addAll(ctx.identifier().simpleIdentifier().map { it.text })
        namespace.freeze()
    }
    
    *//**
     * Checks if the given namespace matches the file location of the current file.
     *
     * For example:
     *
     * - namespace *example*, file *.../example/Example.aprl* → `true`
     * - namespace *other*, file *.../example/Example.aprl* → `false`
     * - namespace *test.example*, file *.../test/example/Example.aprl* → `true`
     *//*
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
    
    *//**
     * Parses and the given import identifier, adding all the resulting imports to the [imports list][imports].
     *
     * @param[ctx] The import identifier to be parsed
     *
     * @throws Error If a reference can't be resolved
     *//*
    private fun parseImportIdentifier(ctx: AprlParser.ImportIdentifierContext) {
        *//*if (ctx.singleImport() != null) { // alias import (import foo.b as a)
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
                        val bracketPosition = ctx.subImportIdentifier(0).position - 1
                        WARN(simpleName, bracketPosition, "Redundant brackets")
                        val allIdentifiers = ctx.identifier().simpleIdentifier() + ctx.subImportIdentifier(0).simpleIdentifier()
                        parseSingleImport(allIdentifiers, ctx.subImportIdentifier(0).importAlias())
                    }
                }
            }
        }*//*
    }
    
    *//**
     * Parses an "all-import" (e.g. using *aprl.`*`*; using *aprl.annotation.AnnotationTarget.`*`*), adding all the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left side of the all-import
     *
     * @throws Error If a reference can't be resolved
     *//*
    private fun parseAllImport(identifier: AprlParser.IdentifierContext) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            if (imports.any { it.pkg == pkg }) {
                WARN(simpleName, identifier, "Redundant import")
            }
            imports.add(Import().also { it.pkg = pkg })
        } else if (clazz != null) {
            importEverything(clazz)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun ERROR(pos: Position, message: String): Nothing {
        throw Error(simpleName, pos, message)
    }
    
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun ERROR(element: ParserRuleContext, message: String): Nothing {
        ERROR(element.position, message)
    }
    
    *//**
     * When known that an error is caused by an unresolved reference, [this function][UNRESOLVED_REFERENCE]
     * can be used to throw an [Error] at the actual reference that cannot be resolved.
     *
     * @param[identifiers] The identifiers, at least one of which cannot be resolved
     *
     * @throws Error Always throws an [Error]
     *//*
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun UNRESOLVED_REFERENCE(identifiers: List<AprlParser.SimpleIdentifierContext>): Nothing {
        val error = faultyIdentifier(identifiers)
        ERROR(error, "Unresolved reference: '${error.text}'")
    }
    
    *//**
     * Imports all members (classes, methods, fields) of a class into the [imports list][imports].
     *
     * @param[from] The class to be imported from
     *//*
    private fun importEverything(from: Class<*>) {
        from.classes.forEach { clazz -> imports.add(Import().also { it.clazz = clazz }) }
        from.methods.forEach { method -> imports.add(Import().also { it.method = method }) }
        from.fields.forEach { field -> imports.add(Import().also { it.field = field }) }
    }
    
    *//**
     * Parses a "multi-import" (e.g. using java.util.`[`List, Map`]`), adding the resulting imports to the [imports list][imports].
     *
     * @param[identifier] The identifier on the left-hand side of the multi-import
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     *//*
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
    
    *//**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a package.
     *
     * @param[from] The package to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     *//*
    private fun importMultipleFromPackage(from: Package, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        val pkg = from.name
        for ((subIdentifier, alias) in elements) {
            val aliasString = alias?.simpleIdentifier()?.text
            val clazz = loadCompleteClass("$pkg.${subIdentifier.text}") ?: ERROR(subIdentifier, "Unresolved reference: '${subIdentifier.text}'")
            if (imports.any { it.clazz == clazz && it.alias == aliasString }) {
                WARN(simpleName, subIdentifier, "Redundant import")
            }
            if (clazz.simpleName == aliasString) {
                WARN(simpleName, alias!!, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = aliasString })
        }
    }
    
    *//**
     * Imports multiple elements (from a [multi-import][parseMultiImport]) from a class.
     *
     * @param[from] The class to be imported from
     * @param[elements] The identifiers and corresponding aliases on the right-hand side of the multi-import
     *
     * @throws Error If a reference can't be resolved
     *//*
    private fun importMultipleFromClass(from: Class<*>, elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>) {
        for ((subIdentifier, alias) in elements) {
            addValidImports(from, subIdentifier, alias)
        }
    }
    
    *//**
     * Imports methods and/or fields in the given class by the given name with the given alias
     *
     * @param[clazz] The class to be imported from
     * @param[identifier] The name of the method and/or field to be imported
     * @param[alias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     * @throws Error If a distinct field by the same name is already imported
     *//*
    private fun addValidImports(clazz: Class<*>, identifier: AprlParser.SimpleIdentifierContext, alias: AprlParser.ImportAliasContext?) {
        val method = loadMethod(clazz, identifier.text)
        val field = loadField(clazz, identifier.text)
        if (method != null) {
            if (imports.any { it.method == method }) {
                WARN(simpleName, identifier, "Redundant import")
            }
            imports.add(Import().also { it.method = method; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (field != null) {
            if (imports.any { it.field?.name == field.name && it.field != field }) {
                ERROR(identifier, "Field by name '${field.name}' is already defined in an import")
            }
            if (imports.any { it.field == field }) {
                WARN(simpleName, identifier, "Redundant import")
            }
            imports.add(Import().also { it.field = field; it.alias = alias?.simpleIdentifier()?.text })
        }
        method ?: field ?: ERROR(identifier, "Unresolved reference: '${identifier.text}'")
        if (identifier.text == alias?.simpleIdentifier()?.text) {
            WARN(simpleName, alias!!, "Redundant import alias")
        }
    }
    
    *//**
     * Parses a regular single-import with the given identifier, and assigns it the given alias
     *
     * @param[identifier] The identifier to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     *//*
    private fun parseSingleImport(identifier: AprlParser.IdentifierContext, importAlias: AprlParser.ImportAliasContext?) {
        parseSingleImport(identifier.simpleIdentifier(), importAlias)
    }
    
    *//**
     * Parses a regular single-import with the given identifiers, and assigns it the given alias
     *
     * @param[identifiers] The identifier list to be imported
     * @param[importAlias] The alias to be given to the import
     *
     * @throws Error If the reference can't be resolved
     *//*
    private fun parseSingleImport(identifiers: List<AprlParser.SimpleIdentifierContext>, importAlias: AprlParser.ImportAliasContext?) {
        val importIdentifier = identifiers.joinToString(".") { it.text }
        val alias = importAlias?.simpleIdentifier()?.text
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            ERROR(identifiers[0], "Namespaces cannot be imported")
        } else if (clazz != null) {
            if (imports.any { it.clazz == clazz && it.alias == alias }) {
                WARN(simpleName, identifiers[0], "Redundant import")
            }
            if (clazz.simpleName == alias) {
                WARN(simpleName, importAlias!!, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = alias })
        } else {
            val last = identifiers.last()
            val possibleClass = loadCompleteClass(identifiers.dropLast(1).joinToString(".") { it.text })
                ?: ERROR(last, "Unresolved reference: '${last.text}'")
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
        clazz.modifiers.addAll(ctx.modifierList()?.let { modifiersFromModifierList(it, "top level class", Modifier::`class`).split().first } ?: mutableListOf())
        clazz.annotations.addAll(ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: Annotations())
        clazz.typeParameters.addAll(ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf())
        val delegations = ctx.delegationSpecifiers()
        var superConstructorCall: ValueArguments? = null
        if (delegations != null) {
            val superClasses = mutableListOf<Pair<Class<*>, ValueArguments>>()
            for (delegation in delegations.delegationSpecifier()) {
                val identifier = delegation.identifier()
                val superClass = loadImportedClass(identifier)
                val valueArguments = delegation.valueArguments()?.let { parseValueArguments(it) } ?: ValueArguments()
                if (superClasses.any { it.first == superClass }) {
                    ERROR(identifier, "Supertype '${superClass.simpleName}' appears twice")
                }
                checkClassExtendability(superClass, identifier.position)
                if (!superClass.isInterface) {
                    if (superClasses.any { !it.first.isInterface }) {
                        ERROR(identifier, "Multiple inheritance is not allowed")
                    }
                    if (delegation.valueArguments() == null) {
                        ERROR(identifier.simpleIdentifier().last().run { position + text.length }, "This type has a constructor and thus must be initialized here")
                    }
                    if (getValidConstructor(superClass.constructors, valueArguments) == null) {
                        ERROR(delegation.valueArguments(), "No constructor can be called with the arguments supplied")
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
        return parseTopLevelExtension(ctx).map { Function(it.name, enclosingClass, it.annotations, it.modifiers, it.typeParameters, it.parameters, it.returnType, it.statements) }
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
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "function", Modifier::function) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.FUNCTION) } ?: Annotations()
        val typeParameters = ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf()
        val name = ctx.simpleIdentifier().text
        val valueParameters = parseFunctionParameters(ctx.functionValueParameters())
        
        fun OVERRIDES_NOTHING(): Nothing = ERROR(modifiers.first { it.first == Modifier.COVER }.second, "'$name' overrides nothing")
        
        val superMethodReturnType = run {
            val methods = enclosingClass.superClasses.flatMap { loadMethods(it.javaType, name) }.filter { method ->
                method.parameters.allIndexed { i, it ->
                    valueParameters.getOrNull(i)?.run { type.javaType == it.type } == true
                }
            }
            methods.firstOrNull()?.genericReturnType?.toType()
        }
        
        if (ctx.functionBody() == null) {
            if (enclosingClass is Interface) {
                modifiers.add(Modifier.ABSTRACT to (-1 to -1))
            } else if (Modifier.ABSTRACT in enclosingClass.modifiers) {
                if (Modifier.ABSTRACT !in modifiers.split().first) {
                    ERROR(ctx, "Function '$name' must have a body or be declared abstract")
                }
            }
        }
        val type: Type = if (ctx.type() == null) {
            if (ctx.functionBody() == null) {
                if (Modifier.COVER !in modifiers.split().first) {
                    Void
                } else {
                    superMethodReturnType ?: OVERRIDES_NOTHING()
                }
            } else {
                parseFunctionBody(ctx.functionBody()).last().type
            }
        } else {
            parseType(ctx.type()).also { type ->
                if (Modifier.COVER in modifiers.split().first) {
                    val intendedType = superMethodReturnType ?: OVERRIDES_NOTHING()
                    if (!isInBound(type, intendedType)) {
                        OVERRIDES_NOTHING()
                    }
                }
            }
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: Statements()
        return Function(name, enclosingClass, annotations, modifiers.split().first.toMutableSet(), typeParameters, valueParameters, type, statements)
    }
    
    private fun parseProperty(ctx: AprlParser.PropertyDeclarationContext, enclosingClass: ClassMemberOwner): List<OnlyClassMember> {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "property", Modifier::property) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.PROPERTY) } ?: Annotations()
        val expression = ctx.expression()?.let { parseExpression(it) }
        val variableDeclaration = parseVariableDeclaration(ctx.variableDeclaration(), false)
        val name = variableDeclaration.name
        val type = variableDeclaration.type ?: expression?.type ?: ERROR(1 to 1, "")
        val final = ctx.VAL() != null || ctx.CONST() != null
        val static = ctx.CONST() != null || ctx.DEF() != null
        if (enclosingClass.static && static) {
            WARN(simpleName, ctx.position + ctx.text.length + 1, "Property '$name' is already in a static environment")
        }
        val field = Property(name, enclosingClass, annotations, modifiers.split().first.toMutableSet(), type, expression, final, enclosingClass.static || static)
        val getter: Getter? = ctx.propertyBody()?.getter()?.let {
            parseGetter(it, field)
        }
        val setter: Setter? = ctx.propertyBody()?.setter()?.let {
            parseSetter(it, field)
        }
        return listOf(field) andMaybe getter andMaybe setter
    }
    
    private fun parseGetter(ctx: AprlParser.GetterContext, property: Property): Getter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "getter", Modifier::getterSetter) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.GETTER) } ?: Annotations()
        if (ctx.type() != null) {
            if (parseType(ctx.type()) != property.type) {
                ERROR(ctx.type(), "Getter return type must be equal to the type of the property (${property.type.toJava()})")
            }
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: Statements(defaultGetter(property))
        return Getter(property, annotations, modifiers.split().first.toMutableSet(), statements)
    }
    
    private fun defaultGetter(property: Property): Statement {
        TODO("defaultGetter")
    }
    
    private fun parseSetter(ctx: AprlParser.SetterContext, property: Property): Setter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "setter", Modifier::getterSetter) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.SETTER) } ?: Annotations()
        if (ctx.type() != null) {
            if (parseType(ctx.type()) != property.type) {
                ERROR(ctx.type(), "Setter parameter type must be equal to the type of the property. (${property.type.toJava()})")
            }
        }
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: Statements(defaultGetter(property))
        return Setter(property, annotations, modifiers.split().first.toMutableSet(), statements)
    }
    
    private fun defaultSetter(property: Property): Statement {
        TODO("defaultSetter")
    }
    
    private fun parseFunctionBody(ctx: AprlParser.FunctionBodyContext): Statements {
        return if (ctx.block() != null) {
            parseBlock(ctx.block())
        } else if (ctx.expression() != null) {
            Statements(ReturnStatement(parseExpression(ctx.expression())))
        } else {
            throw InternalError("Expected FunctionBodyContext ($ctx) to have body or expression")
        }
    }
    
    private fun parseFunctionParameters(ctx: AprlParser.FunctionValueParametersContext): MutableList<MethodParameter> {
        val parameters = ctx.functionValueParameter()?.mapMutable { parseFunctionValueParameter(it) } ?: mutableListOf()
        val checked = mutableListOf<MethodParameter>()
        for ((i, param) in parameters.withIndex()) {
            val redeclaration = checked.firstOrNull { it.name == param.name }
            if (redeclaration != null) {
                ERROR(ctx.functionValueParameter(i),
                    "Conflicting declarations: parameter ${param.name}: ${param.type.toJava()}, parameter ${redeclaration.name}: ${redeclaration.type.toJava()}")
            }
            checked.add(param)
        }
        return parameters
    }
    
    private fun parseFunctionValueParameter(ctx: AprlParser.FunctionValueParameterContext): MethodParameter {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "parameter") { mod -> mod == Modifier.PARAMS } } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.VALUE_PARAMETER) } ?: Annotations()
        val name = ctx.parameter().simpleIdentifier().text
        val type = parseType(ctx.parameter().type())
        val expression = ctx.expression()?.let { parseExpression(it) }
        return MethodParameter(modifiers.split().first.toMutableSet(), annotations, name, type, expression)
    }
    
    private fun parseNestedInterface(ctx: AprlParser.InterfaceDeclarationContext, enclosingClass: ClassMemberOwner): Interface {
        return parseTopLevelInterface(ctx).run {
            Interface(name, enclosingClass, annotations, modifiers, typeParameters, superClasses, interfaceMembers)
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
            Statements(parseAssignment(ctx.assignment()))
        } else if (ctx.loopStatement() != null) {
            Statements(parseLoopStatement(ctx.loopStatement()))
        } else if (ctx.expression() != null) {
            Statements(parseExpression(ctx.expression()))
        } else {
            throw InternalError("Expected StatementContext ($ctx) to have localVariableDeclaration, assignment, loopStatement or expression")
        }
    }
    
    private fun parseAssignment(ctx: AprlParser.AssignmentContext): Assignment {
        val expression = parseExpression(ctx.expression())
        val assignableExpression = parseAssignableExpression(ctx.assignableExpression(), expression)
        val operator = parseAssignmentOperator(ctx.assignmentOperator())
        val to = assignableExpression.type
        val from = expression.type
        if (!isInBound(from, to)) {
            ERROR(ctx.expression(), "Type mismatch: Inferred type is ${from.toJava()} but ${to.toJava()} was expected")
        }
        return Assignment(assignableExpression, operator, expression)
    }
    
    private fun parseAssignableExpression(ctx: AprlParser.AssignableExpressionContext, toAssign: Expression?): AssignableExpression {
        if (ctx.parenthesizedAssignableExpression() != null) {
            return parseAssignableExpression(ctx.parenthesizedAssignableExpression().assignableExpression(), toAssign)
        }
        val expression = parseExpression(ctx.expression())
        val assignableSuffixes = ctx.assignableSuffix().mapMutable { parseAssignableSuffix(it) }
        val chainedCalls = mutableListOf<Pair<AccessibleObject, Boolean>>()
        var left = expression.type
        for ((i, suffix) in assignableSuffixes.withIndex()) {
            if (i == assignableSuffixes.lastIndex) { // last suffix has to be setter
                when (suffix) {
                    is IndexingSuffix -> {
                        val setOperators = loadMethods(left.javaType, "set") // member 'set' operators
                        val extensionSetOperators = loadExtensionFunctions(left, "set") // extension 'set' operators
                        if (setOperators.isEmpty() && extensionSetOperators.isEmpty()) { // neither member nor extension operators found
                            ERROR(ctx.assignableSuffix(i), "Unresolved reference: operator 'set'")
                        }
                        val memberSetOperator = setOperators.firstOrNull { method ->
                            method.parameters.size == suffix.expressions.size + 1 // parameters in brackets + value
                                    && suffix.expressions.pair(method.parameters.dropLast(1)).all { isInBound(it.first.type, it.second.parameterizedType) } // bracket parameters match requirements
                                    && toAssign?.type?.let { isInBound(it, method.parameters.last().parameterizedType) } != false // value to assign matches requirements
                        }?.let { it to false } // false: not an extension function
                        val extensionSetOperator = extensionSetOperators.firstOrNull { method ->
                            method.parameters.size == suffix.expressions.size + 2 // $this + parameters in brackets + value
                                    && suffix.expressions.pair(method.parameters.dropSurrounding(1)).all { isInBound(it.first.type, it.second.parameterizedType) } // bracket parameters match requirements
                                    && toAssign?.type?.let { isInBound(it, method.parameters.last().parameterizedType) } != false // value to assign matches requirements
                        }?.let { it to true } // true: is an extension function
                        chainedCalls.add(memberSetOperator ?: extensionSetOperator ?: ERROR(ctx.assignableSuffix(i), "No operator can be called with the arguments supplied"))
                    }
                    is NavigationSuffix -> {
                        val field = loadField(left.javaType, suffix.identifier) // member field
                        val memberMethod = loadMethods(left.javaType, "set${suffix.identifier.replaceFirstChar(Char::uppercase)}").firstOrNull { method ->
                            method.parameters.size == 1 // property access syntax can only be used with single parameters
                                    && toAssign?.type?.let { isInBound(it, method.parameters[0].parameterizedType) } != false // value to assign matches requirements
                        } // member setter
                        val extensionFunction = loadExtensionFunctions(left, "set${suffix.identifier.replaceFirstChar(Char::uppercase)}").firstOrNull { method ->
                            method.parameters.size == 2 // $this + single parameter
                                    && toAssign?.type?.let { isInBound(it, method.parameters[1].parameterizedType) } != false // value to assign matches requirements
                        } // extension setter
                        if (memberMethod != null) {
                            chainedCalls.add(memberMethod to false)
                        } else if (extensionFunction != null) {
                            chainedCalls.add(extensionFunction to true)
                        } else if (field != null) {
                            if (field.isEnumConstant) { // enum constant
                                ERROR(ctx.assignableSuffix(i), "'${suffix.identifier}' is an enum constant and cannot be reassigned")
                            }
                            if (JModifier.isFinal(field.modifiers)) { // final (val/const)
                                ERROR(ctx.assignableSuffix(i), "'${suffix.identifier}' is final and cannot be reassigned")
                            }
                            chainedCalls.add(field to false)
                        } else {
                            ERROR(ctx.assignableSuffix(i), "Unresolved reference: ${suffix.identifier}")
                        }
                    }
                }
            } else { // not-last suffixes are getters
                when (suffix) {
                    is IndexingSuffix -> {
                        val getOperators = loadMethods(left.javaType, "get") // member 'get' operators
                        val extensionGetOperators = loadExtensionFunctions(left, "get") // extension 'get' operators
                        if (getOperators.isEmpty() && extensionGetOperators.isEmpty()) { // neither member nor extension operators found
                            ERROR(ctx.assignableSuffix(i), "Unresolved reference: operator 'get'")
                        }
                        val memberGetOperator = getOperators.firstOrNull { method ->
                            method.parameters.size == suffix.expressions.size // parameters in brackets
                                    && suffix.expressions.pair(method.parameters).all { isInBound(it.first.type, it.second.parameterizedType) } // bracket parameters match requirements
                        }?.let { it to false } // false: not an extension function
                        val extensionGetOperator = extensionGetOperators.firstOrNull { method ->
                            method.parameters.size == suffix.expressions.size + 1 // $this + parameters in brackets
                                    && suffix.expressions.pair(method.parameters.drop(1)).all { isInBound(it.first.type, it.second.parameterizedType) } // bracket parameters match requirements
                        }?.let { it to true } // true: is an extension function
                        val actualGetOperator = memberGetOperator ?: extensionGetOperator ?: ERROR(ctx.assignableSuffix(i), "No operator can be called with the arguments supplied")
                        chainedCalls.add(actualGetOperator)
                        left = actualGetOperator.first.genericReturnType.toType()
                    }
                    is NavigationSuffix -> {
                        val field = loadField(left.javaType, suffix.identifier)
                        val method = loadMethod(left.javaType, "get${suffix.identifier.replaceFirstChar(Char::uppercase)}") ?: loadMethod(left.javaType, "is${suffix.identifier.replaceFirstChar(Char::uppercase)}")
                        val extensionFunction = loadExtensionFunction(left, "get${suffix.identifier.replaceFirstChar(Char::uppercase)}") ?: loadExtensionFunction(left, "is${suffix.identifier.replaceFirstChar(Char::uppercase)}")
                        if (method != null) {
                            chainedCalls.add(method to false)
                            left = method.genericReturnType.toType()
                        } else if (extensionFunction != null) {
                            chainedCalls.add(extensionFunction to true)
                            left = extensionFunction.genericReturnType.toType()
                        } else if (field != null) {
                            chainedCalls.add(field to false)
                        } else {
                            ERROR(ctx.assignableSuffix(i), "Unresolved reference: ${suffix.identifier}")
                        }
                    }
                }
            }
        }
        val setter = chainedCalls.lastOrNull()
        val getters = chainedCalls.dropLast(1)
        val type = setter?.first?.type ?: expression.type
        return AssignableExpression(expression, getters, setter, type)
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
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: Annotations()
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
        return Expression(disjunction, disjunction.type)
    }
    
    private fun parseDisjunction(ctx: AprlParser.DisjunctionContext): Disjunction {
        val conjunction = parseConjunction(ctx.conjunction(0))
        val additionalConjunctions = ctx.conjunction().drop(1).mapMutable { parseConjunction(it) }
        var type = conjunction.type
        for ((i, additionalConjunction) in additionalConjunctions.withIndex()) {
            val memberOrOperators = loadMethods(type.javaType, "or").filter { it.parameters.size == 1 }
            val extensionOrOperators = loadExtensionFunctions(type, "or").filter { it.parameters.size == 1 }
            if (memberOrOperators.isEmpty() && extensionOrOperators.isEmpty()) {
                ERROR(ctx.disjunctionOperator(i), "Unresolved reference: operator 'or'")
            }
            val actualOrOperator = memberOrOperators.firstOrNull { isInBound(additionalConjunction.type, it.parameters[0].parameterizedType) }
                ?: extensionOrOperators.firstOrNull { isInBound(additionalConjunction.type, it.parameters[0].parameterizedType) }
                ?: ERROR(ctx.disjunctionOperator(i), "No operator can be called with the arguments supplied")
            type = actualOrOperator.genericReturnType.toType()
        }
        return Disjunction(conjunction, additionalConjunctions, type)
    }
    
    private fun parseConjunction(ctx: AprlParser.ConjunctionContext): Conjunction {
        val equalityComparison = parseEqualityComparison(ctx.equalityComparison(0))
        val additionalEqualityComparisons = ctx.equalityComparison().drop(1).mapMutable { parseEqualityComparison(it) }
        var type = equalityComparison.type
        for ((i, additionalConjunction) in additionalEqualityComparisons.withIndex()) {
            val memberAndOperators = loadMethods(type.javaType, "and").filter { it.parameters.size == 1 }
            val extensionAndOperators = loadExtensionFunctions(type, "and").filter { it.parameters.size == 1 }
            if (memberAndOperators.isEmpty() && extensionAndOperators.isEmpty()) {
                ERROR(ctx.conjunctionOperator(i), "Unresolved reference: operator 'and'")
            }
            val actualAndOperator = memberAndOperators.firstOrNull { isInBound(additionalConjunction.type, it.parameters[0].parameterizedType) }
                ?: extensionAndOperators.firstOrNull { isInBound(additionalConjunction.type, it.parameters[0].parameterizedType) }
                ?: ERROR(ctx.conjunctionOperator(i), "No operator can be called with the arguments supplied")
            type = actualAndOperator.genericReturnType.toType()
        }
        return Conjunction(equalityComparison, additionalEqualityComparisons, type)
    }
    
    private fun parseEqualityComparison(ctx: AprlParser.EqualityComparisonContext): EqualityComparison {
        val identityComparison = parseIdentityComparison(ctx.identityComparison(0))
        val additionalIdentityComparisons = ctx.identityComparison().drop(1).mapMutable { parseIdentityComparison(it) }
        val type = if (additionalIdentityComparisons.isNotEmpty()) {
            ClassType(Boolean::class.javaPrimitiveType!!)
        } else {
            identityComparison.type
        }
        return EqualityComparison(identityComparison, additionalIdentityComparisons, type)
    }
    
    private fun parseIdentityComparison(ctx: AprlParser.IdentityComparisonContext): IdentityComparison {
        val comparison = parseComparison(ctx.comparison(0))
        val additionalComparisons = ctx.comparison().drop(1).mapMutable { parseComparison(it) }
        val type = if (additionalComparisons.isNotEmpty()) {
            ClassType(Boolean::class.javaPrimitiveType!!)
        } else {
            comparison.type
        }
        return IdentityComparison(comparison, additionalComparisons, type)
    }
    
    private fun parseComparison(ctx: AprlParser.ComparisonContext): Comparison {
        val namedInfixExpression = parseNamedInfixExpression(ctx.namedInfixExpression(0))
        val additionalNamedInfixExpressions =
            ctx.namedInfixExpression().drop(1).mapIndexedMutable { i, it -> parseComparisonOperator(ctx.comparisonOperator(i)) to parseNamedInfixExpression(it) }
        val type = if (additionalNamedInfixExpressions.isNotEmpty()) {
            val memberComparators = loadMethods(namedInfixExpression.type.javaType, "compareTo").filter { it.parameters.size == 1 }
            val extensionComparators = loadExtensionFunctions(namedInfixExpression.type, "compareTo").filter { it.parameters.size == 1 }
            if (memberComparators.isEmpty() && extensionComparators.isEmpty()) {
                ERROR(ctx.comparisonOperator(0), "Unresolved reference: operator 'compareTo'")
            }
            if ((memberComparators + extensionComparators).none { isInBound(namedInfixExpression.type, it.parameters[0].parameterizedType) }) {
                ERROR(ctx.namedInfixExpression(1), "No operator can be called with the arguments supplied")
            }
            ClassType(Boolean::class.javaPrimitiveType!!)
        } else {
            namedInfixExpression.type
        }
        return Comparison(namedInfixExpression, additionalNamedInfixExpressions, type)
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
            throw InternalError("Expected ComparisonOperatorContext ($ctx) to be LANGLE, NLANGLE, RANGLE, NRANGLE, LEQ, NLEQ, GEQ or NGEQ")
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
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.EXPRESSION) } ?: Annotations()
        val lambdaLiteral = parseLambdaLiteral(ctx.lambdaLiteral())
        return AnnotatedLambda(annotations, lambdaLiteral)
    }
    
    private fun parseLambdaLiteral(ctx: AprlParser.LambdaLiteralContext): LambdaLiteral {
        if (ctx.lambdaParameters().lambdaParameter().size > 25) {
            ERROR(ctx.lambdaParameters().lambdaParameter(25), "")
        }
        val parameters = ctx.lambdaParameters()?.lambdaParameter()?.map { parseLambdaParameter(it) } ?: emptyList()
        val statements = ctx.statements().statement().flatMapMutable { parseStatement(it) }
        return LambdaLiteral(parameters, statements)
    }
    
    private fun parseLambdaParameter(ctx: AprlParser.LambdaParameterContext): LambdaParameter {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: Annotations()
        val name = ctx.simpleIdentifier().text
        val type = parseType(ctx.type())
        return LambdaParameter(annotations, name, type)
    }
    
    private fun parseVariableDeclaration(ctx: AprlParser.VariableDeclarationContext, annotationsAllowed: Boolean): VariableDeclaration {
        val annotations = ctx.annotations()?.let {
            if (!annotationsAllowed) {
                ERROR(it, "Annotations are not allowed in this position")
            }
            parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE)
        } ?: Annotations()
        val name = ctx.simpleIdentifier().text
        val type = ctx.type()?.let { parseType(it) }
        return VariableDeclaration(annotations, name, type)
    }
    
    private fun parseNamedInfixExpression(ctx: AprlParser.NamedInfixExpressionContext): NamedInfixExpression {
        val elvisExpression = parseElvisExpression(ctx.elvisExpression())
        val namedInfixes = ctx.namedInfix()?.map { parseNamedInfix(it) } ?: listOf()
        val type = if (namedInfixes.isNotEmpty()) {
            ClassType(Boolean::class.javaPrimitiveType!!)
        } else {
            elvisExpression.type
        }
        return NamedInfixExpression(elvisExpression, namedInfixes, type)
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
        val type: Type = if (additionalInfixFunctionCalls.isNotEmpty()) {
            val types = additionalInfixFunctionCalls.mapArray { it.type }
            lowestCommonSuperClass(infixFunctionCall.type, *types)
        } else {
            infixFunctionCall.type
        }
        return ElvisExpression(infixFunctionCall, additionalInfixFunctionCalls, type)
    }
    
    private fun parseInfixFunctionCall(ctx: AprlParser.InfixFunctionCallContext): InfixFunctionCall {
        val rangeExpression = parseRangeExpression(ctx.rangeExpression(0))
        val additionalRangeExpressions = ctx.rangeExpression().drop(1)
        var left = rangeExpression.type
        val infixFunctionCalls = mutableListOf<Pair<Method, RangeExpression>>()
        additionalRangeExpressions.forEachIndexed { i, it ->
            val identifier = ctx.simpleIdentifier(i)
            val functionName = identifier.text
            val parameter = parseRangeExpression(it).type
            val memberFunction = loadMethod(left.javaType, functionName)
            val extensionFunction = loadExtensionFunction(left, functionName)
            left = if (memberFunction != null) {
                if (memberFunction.parameters.size != 1) {
                    ERROR(it, "Method must have exactly one parameter to be infix called")
                }
                val onlyParameter = memberFunction.parameters[0]
                if (!isInBound(parameter, onlyParameter.type)) {
                    ERROR(it, "Type mismatch: Inferred type is ${parameter.toJava()} but ${onlyParameter.type} was expected")
                }
                infixFunctionCalls.add(memberFunction to parseRangeExpression(it))
                memberFunction.genericReturnType.toType()
            } else if (extensionFunction != null) {
                if (extensionFunction.parameters.size != 2) {
                    ERROR(it, "Method must have exactly one parameter to be infix called")
                }
                val onlyParameter = extensionFunction.parameters[1]
                if (!isInBound(parameter, onlyParameter.type)) {
                    ERROR(it, "Type mismatch: Inferred type is ${parameter.toJava()} but ${onlyParameter.type} was expected")
                }
                infixFunctionCalls.add(extensionFunction to parseRangeExpression(it))
                extensionFunction.genericReturnType.toType()
            } else {
                ERROR(identifier, "Unresolved reference: '${identifier.text}'")
            }
        }
        val type = if (additionalRangeExpressions.isNotEmpty()) {
            infixFunctionCalls.last().first.genericReturnType.toType()
        } else {
            rangeExpression.type
        }
        return InfixFunctionCall(rangeExpression, infixFunctionCalls, type)
    }
    
    private fun parseRangeExpression(ctx: AprlParser.RangeExpressionContext): RangeExpression {
        val xorExpression = parseXorExpression(ctx.xorExpression(0))
        val operator = ctx.toOperator()?.let { parseToOperator(it) }
        val to = ctx.xorExpression().getOrNull(1)?.let { parseXorExpression(it) }
        val type = if (operator != null) {
            val clazz = when (operator) {
                RangeExpression.Operator.TO -> RangeTo::class.java
                RangeExpression.Operator.DOWNTO -> RangeDownto::class.java
                RangeExpression.Operator.UNTIL -> RangeUntil::class.java
            }
            val typeArgument = mutableListOf(TypeProjection(type = xorExpression.type))
            ClassType(clazz, TypeArgument(typeArgument))
        } else {
            xorExpression.type
        }
        return RangeExpression(xorExpression, operator, to, type)
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
        val type = additiveExpression.type
        return XorExpression(additiveExpression, additionalAdditiveExpressions, type)
    }
    
    private fun parseAdditiveExpression(ctx: AprlParser.AdditiveExpressionContext): AdditiveExpression {
        val multiplicativeExpression = parseMultiplicativeExpression(ctx.multiplicativeExpression(0))
        val additionalMultiplicativeExpressions =
            ctx.multiplicativeExpression().drop(1).mapIndexedMutable { i, it -> parseAdditiveOperator(ctx.additiveOperator(i)) to parseMultiplicativeExpression(it) }
        val type = multiplicativeExpression.type
        return AdditiveExpression(multiplicativeExpression, additionalMultiplicativeExpressions, type)
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
        val type = exponentialExpression.type
        return MultiplicativeExpression(exponentialExpression, additionalExponentialExpressions, type)
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
        val type = asExpression.type
        return ExponentialExpression(asExpression, additionalAsExpressions, type)
    }
    
    private fun parseAsExpression(ctx: AprlParser.AsExpressionContext): AsExpression {
        val prefixUnaryExpression = parsePrefixUnaryExpression(ctx.prefixUnaryExpression())
        val operator = ctx.asOperator()?.let { parseAsOperator(it) }
        val type = ctx.type()?.let { parseType(it) }?.let {
            if (operator == AsExpression.Operator.AS_QUEST) {
                NullableType(type = it)
            } else {
                it
            }
        } ?: prefixUnaryExpression.type
        return AsExpression(prefixUnaryExpression, operator, type)
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
        val type = if (unaryPrefixes.any { it == UnaryPrefix.DOUBLE_AT }) {
            ClassType(Int::class.javaPrimitiveType!!)
        } else {
            postfixUnaryExpression.type
        }
        return PrefixUnaryExpression(unaryPrefixes, postfixUnaryExpression, type)
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
            throw InternalError("Expected UnaryPrefixContext ($ctx) to be INCR, DECR, ADD, SUB, EXCL or DOUBLE_AT")
        }
    }
    
    private fun parsePostfixUnaryExpression(ctx: AprlParser.PostfixUnaryExpressionContext): PostfixUnaryExpression {
        val atomicExpression = parseAtomicExpression(ctx.atomicExpression())
        val unaryPostfixes = ctx.unaryPostfix()?.mapMutable { parseUnaryPostfix(it) } ?: mutableListOf()
        var left = atomicExpression.type
        if (atomicExpression.identifier != null) {
        
        } else if (atomicExpression.thisLiteral != null) {
            val firstPostfix = unaryPostfixes.getOrNull(0)
            if (firstPostfix != null) {
            
            }
            for (postfix in unaryPostfixes.drop(1)) {
                
            }
        } else if (atomicExpression.superExpression != null) {
        
        } else {
            for ((i, postfix) in unaryPostfixes.withIndex()) {
                if (postfix.postfixUnaryOperator != null) {
                    left = when (postfix.postfixUnaryOperator) {
                        PostfixUnaryOperator.INCR -> {
                            val memberIncrOperators = loadMethods(left.javaType, "incr").filter { it.parameters.isEmpty() && it.returnsSelf() }
                            val extensionIncrOperators = loadExtensionFunctions(left, "incr").filter { method -> method.parameters.size == 1 && isInBound(method.parameters[0].type, method.genericReturnType) }
                            val actualIncrOperator = memberIncrOperators.firstOrNull() ?: extensionIncrOperators.firstOrNull() ?: ERROR(ctx.unaryPostfix(i), "Unresolved reference: operator 'incr'")
                            // TODO: something like a list of chained calls (like somewhere else (WHERE?)); put (actualIncrOperator to true/false) in there
                            actualIncrOperator.genericReturnType.toType()
                        }
                        PostfixUnaryOperator.DECR -> {
                            val memberDecrOperators = loadMethods(left.javaType, "decr").filter { it.parameters.isEmpty() && it.returnsSelf() }
                            val extensionDecrOperators = loadExtensionFunctions(left, "decr").filter { method -> method.parameters.size == 1 && isInBound(method.parameters[0].type, method.genericReturnType) }
                            val actualDecrOperator = memberDecrOperators.firstOrNull() ?: extensionDecrOperators.firstOrNull() ?: ERROR(ctx.unaryPostfix(i), "Unresolved reference: operator 'decr'")
                            // TODO: something like a list of chained calls (like somewhere else (WHERE?)); put (actualDecrOperator to true/false) in there
                            actualDecrOperator.genericReturnType.toType()
                        }
                        PostfixUnaryOperator.DOUBLE_EXCL -> {
                            if (left is NullableType) left.type else left
                        }
                    }
                } else if (postfix.callSuffix != null) {
                    // invoke operator(s)
                } else if (postfix.indexingSuffix != null) {
                    // get operator(s)
                } else if (postfix.navigationSuffix != null) {
                    // hmm
                } else {
                    throw InternalError("Expected UnaryPostfix to have postfixUnaryOperator, callSuffix, indexingSuffix or navigationSuffix")
                }
            }
        }
        return PostfixUnaryExpression(atomicExpression, unaryPostfixes, left)
    }
    
    private fun Method.returnsSelf(): Boolean {
        TODO()
    }
    
    private fun parseUnaryPostfix(ctx: AprlParser.UnaryPostfixContext): UnaryPostfix {
        val postfixUnaryOperator = ctx.postfixUnaryOperator()?.let { parsePostfixUnaryOperator(it) }
        // val typeArguments = ctx.typeArguments()?.let { parseTypeArguments(it) }
        val callSuffix = ctx.callSuffix()?.let { parseCallSuffix(it) }
        val indexingSuffix = ctx.indexingSuffix()?.let { parseIndexingSuffix(it) }
        val navigationSuffix = ctx.navigationSuffix()?.let { parseNavigationSuffix(it) }
        return UnaryPostfix(postfixUnaryOperator, callSuffix, indexingSuffix, navigationSuffix)
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
        val identifier = ctx.identifier()?.simpleIdentifier()?.map { it.text } ?:  ctx.contextualReference()?.let { parseContextualReference(it) }
        val literalConstant = ctx.literalConstant()?.let { parseLiteralConstant(it) }
        val callableReference = ctx.callableReference()?.let { parseCallableReference(it) }
        val lambdaLiteral = ctx.lambdaLiteral()?.let { parseLambdaLiteral(it) }
        val collectionLiteral = ctx.collectionLiteral()?.let { parseCollectionLiteral(it) }
        val thisLiteral = ctx.thisExpression()?.let { ctx.typeOfThis }
        val superLiteral = ctx.superExpression()?.let { ctx.typeOfSuper }
        val conditionalExpression = ctx.conditionalExpression()?.let { parseConditionalExpression(it) }
        val optionalTryExpression = ctx.optionalTryExpression()?.let { parseOptionalTryExpression(it) }
        val tryExpression = ctx.tryExpression()?.let { parseTryExpression(it) }
        val jumpExpression = ctx.jumpExpression()?.let { parseJumpExpression(it) }
        val type: Type = parenthesizedExpression?.type
            ?: identifier?.let { evaluateReference(it) }
            ?: literalConstant?.type
            ?: callableReference?.type
            ?: lambdaLiteral?.type
            ?: collectionLiteral?.run { lowestCommonSuperClass(*mapArray { it.type }) }
            ?: conditionalExpression?.type
            ?: optionalTryExpression?.type
            ?: tryExpression?.type
            ?: jumpExpression?.type
            ?: thisLiteral?.clazz
            ?: superLiteral?.superClass
            ?: throw InternalError("Expected AtomicExpressionContext ($ctx) to have parenthesizedExpression, simpleIdentifier, contextualReference, literalConstant, callableReference, lambdaLiteral, collectionLiteral, thisLiteral, superLiteral, conditionalExpression, optionalTryExpression, tryExpression or jumpExpression")
        return AtomicExpression(
            parenthesizedExpression, identifier, literalConstant, callableReference, lambdaLiteral, collectionLiteral, thisLiteral, superLiteral,
            conditionalExpression, optionalTryExpression, tryExpression, jumpExpression, type
        )
    }
    
    private val RuleContext.typeOfThis: ThisLiteral
        get() {
            val clazz = firstParentWhere { it is AprlParser.ClassDeclarationContext } as? AprlParser.ClassDeclarationContext
            val struct = firstParentWhere { it is AprlParser.StructDeclarationContext } as? AprlParser.StructDeclarationContext
            val enum = firstParentWhere { it is AprlParser.EnumDeclarationContext } as? AprlParser.EnumDeclarationContext
            val inter = firstParentWhere { it is AprlParser.InterfaceDeclarationContext } as? AprlParser.InterfaceDeclarationContext
            val annotation = firstParentWhere { it is AprlParser.AnnotationDeclarationContext } as? AprlParser.AnnotationDeclarationContext
            val document = firstParentWhere { it is AprlParser.DocumentDeclarationContext } as? AprlParser.DocumentDeclarationContext
            val extension = firstParentWhere { it is AprlParser.ExtensionDeclarationContext } as? AprlParser.ExtensionDeclarationContext
            // TODO: how the fuck to access a class before it is compiled???
            val type = if (extension != null) {
                parseReceiverType(extension.receiverType()).type
            } *//* TODO: else if *//* else {
                throw InternalError("")
            }
            return ThisLiteral(type)
        }
    
    private val RuleContext.typeOfSuper: SuperLiteral
        get() {
            TODO("RuleContext.typeOfSuper")
        }
    
    private fun RuleContext.firstParentWhere(condition: (RuleContext) -> Boolean): RuleContext? {
        var parent: RuleContext? = parent
        while (parent?.let { condition(it) } == false) {
            parent = parent.parent
        }
        return parent
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
                ERROR(ctx.integerLiteral(), "Int literal too big")
            } else if (it < BigInteger(Int.MIN_VALUE.toLong())) {
                ERROR(ctx.integerLiteral(), "Int literal too small")
            }
            it.toInt()
        }
        val long = ctx.longLiteral()?.text?.removeSuffix("l")?.removeSuffix("L")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Long.MAX_VALUE)) {
                ERROR(ctx.longLiteral(), "Long literal too big")
            } else if (it < BigInteger(Long.MIN_VALUE)) {
                ERROR(ctx.longLiteral(), "Long literal too small")
            }
            it.toLong()
        }
        val short = ctx.shortLiteral()?.text?.removeSuffix("s")?.removeSuffix("S")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Short.MAX_VALUE.toLong())) {
                ERROR(ctx.shortLiteral(), "Short literal too big")
            } else if (it < BigInteger(Short.MIN_VALUE.toLong())) {
                ERROR(ctx.shortLiteral(), "Short literal too small")
            }
            it.toShort()
        }
        val byte = ctx.byteLiteral()?.text?.removeSuffix("b")?.removeSuffix("B")?.decodeWholeNumberOrNull()?.let {
            if (it > BigInteger(Byte.MAX_VALUE.toLong())) {
                ERROR(ctx.byteLiteral(), "Byte literal too big")
            } else if (it < BigInteger(Byte.MIN_VALUE.toLong())) {
                ERROR(ctx.byteLiteral(), "Byte literal too small")
            }
            it.toByte()
        }
        val float = ctx.floatLiteral()?.text?.removeSuffix("f")?.removeSuffix("F")?.decodeDecimalNumberOrNull()?.let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                ERROR(ctx.floatLiteral(), "Float literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                ERROR(ctx.floatLiteral(), "Float literal too small")
            }
            it.toFloat()
        }
        val double = ctx.doubleLiteral()?.text?.removeSuffix("d")?.removeSuffix("D")?.decodeDecimalNumberOrNull()?.let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                ERROR(ctx.doubleLiteral(), "Double literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                ERROR(ctx.doubleLiteral(), "Double literal too small")
            }
            it.toDouble()
        }
        val complex = ctx.complexLiteral()?.text?.decodeComplexNumberOrNull()?.apply {
            if (getReal() > BigDecimal(Double.MAX_VALUE)) {
                ERROR(ctx.complexLiteral(), "Complex real part too big")
            }
            if (getImaginary() > BigDecimal(Double.MAX_VALUE)) {
                ERROR(ctx.complexLiteral().position + getReal().toString().length + 1, "Complex imaginary part too big")
            }
            if (getReal() < BigDecimal(Double.MIN_VALUE)) {
                ERROR(ctx.complexLiteral(), "Complex real part too small")
            }
            if (getImaginary() < BigDecimal(Double.MIN_VALUE)) {
                ERROR(ctx.complexLiteral().position + getReal().toString().length + 1, "Complex imaginary part too small")
            }
        }
        val character = ctx.characterLiteral()?.text?.get(1)
        val string = ctx.stringLiteral()?.text?.removeSurrounding("\"")
        val clazz = `null`?.let { aprl.lang.Nothing::class.java }
            ?: bool?.let { java.lang.Boolean::class.javaPrimitiveType!! }
            ?: trilean?.let { Trilean::class.java }
            ?: int?.let { java.lang.Integer::class.javaPrimitiveType!! }
            ?: long?.let { java.lang.Long::class.javaPrimitiveType!! }
            ?: short?.let { java.lang.Short::class.javaPrimitiveType!! }
            ?: byte?.let { java.lang.Byte::class.javaPrimitiveType!! }
            ?: float?.let { java.lang.Float::class.javaPrimitiveType!! }
            ?: double?.let { java.lang.Double::class.javaPrimitiveType!! }
            ?: complex?.let { Complex::class.java }
            ?: character?.let { java.lang.Character::class.javaPrimitiveType!! }
            ?: string?.let { java.lang.String::class.java }
            ?: throw InternalError("Literal constant should not be empty! (no literal found)")
        val type = ClassType(clazz)
        return LiteralConstant(`null`, bool, trilean, int, long, short, byte, float, double, complex, character, string, type)
    }
    
    private fun parseContextualReference(ctx: AprlParser.ContextualReferenceContext): List<String> {
        val assignment = ctx.firstParentWhere { it is AprlParser.AssignmentContext } as? AprlParser.AssignmentContext
        val localVariableDeclaration = ctx.firstParentWhere { it is AprlParser.LocalVariableDeclarationContext } as? AprlParser.LocalVariableDeclarationContext
        val function = ctx.firstParentWhere { it is AprlParser.FunctionBodyContext }?.parent as? AprlParser.FunctionDeclarationContext
        val getter = ctx.firstParentWhere { it is AprlParser.FunctionBodyContext }?.parent as? AprlParser.GetterContext
        val valueParameter = ctx.firstParentWhere { it is AprlParser.FunctionValueParameterContext } as? AprlParser.FunctionValueParameterContext
        val property = ctx.firstParentWhere { it is AprlParser.PropertyDeclarationContext } as? AprlParser.PropertyDeclarationContext
        val classParameter = ctx.firstParentWhere { it is AprlParser.ClassParameterContext } as? AprlParser.ClassParameterContext
        val valueArgument = ctx.firstParentWhere { it is AprlParser.ValueArgumentContext } as? AprlParser.ValueArgumentContext
        val baseClass: Type = if (assignment != null) {
            parseAssignableExpression(assignment.assignableExpression(), null).type
        } else if (localVariableDeclaration != null) {
            localVariableDeclaration.variableDeclaration().type()?.let { parseType(it) } ?: ERROR(ctx, "Contextual reference requires type annotation")
        } else if (function != null) {
            function.type()?.let { parseType(it) } ?: ERROR(ctx, "Contextual reference requires type annotation")
        } else if (getter != null) {
            getter.type()?.let { parseType(it) } ?: ERROR(ctx, "Contextual reference requires type annotation")
        } else if (valueParameter != null) {
            parseType(valueParameter.parameter().type())
        } else if (property != null) {
            property.variableDeclaration().type()?.let { parseType(it) } ?: ERROR(ctx, "Contextual reference requires type annotation")
        } else if (classParameter != null) {
            parseType(classParameter.type())
        } else if (valueArgument != null) {
            TODO("get possible 'parents' (like, 'owners') of valueArgument and infer context from them")
        } else {
            ERROR(ctx, "Cannot infer context")
        }
        return baseClass.javaType.name.split(".") + ctx.identifier().simpleIdentifier().map { it.text }
    }
    
    private fun parseCallableReference(ctx: AprlParser.CallableReferenceContext): CallableReference {
        val receiverType = parseReceiverType(ctx.receiverType())
        val identifier = ctx.simpleIdentifier().text
        val type = receiverType.type
        val memberFunction = loadMethod(type.javaType, identifier)
        val extensionFunction = loadExtensionFunction(type, identifier)
        val method = memberFunction ?: extensionFunction ?: ERROR(ctx.simpleIdentifier(), "Unresolved reference: $identifier")
        return CallableReference(method)
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
        val type = run {
            val `if` = statements.last().type
            val elsifs = elsifExpressions.map { it.statements.last().type }
            val `else` = elseStatements?.last()?.type
            lowestCommonSuperClass(elsifs + `if` andMaybe `else`)
        }
        return IfExpression(unless, condition, statements, elsifExpressions, elseStatements, type)
    }
    
    private fun parseElsifExpression(ctx: AprlParser.ElsifExpressionContext): ElsifExpression {
        val condition = parseExpression(ctx.expression())
        val statements = parseBlock(ctx.block())
        val type = statements.last().type
        return ElsifExpression(condition, statements, type)
    }
    
    private fun parseMatchExpression(ctx: AprlParser.MatchExpressionContext): MatchExpression {
        val expression = parseExpression(ctx.expression())
        val matchEntries = ctx.matchEntry().mapMutable { parseMatchEntry(it) }
        val type = lowestCommonSuperClass(matchEntries.map { it.type })
        return MatchExpression(expression, matchEntries, type)
    }
    
    private fun parseMatchEntry(ctx: AprlParser.MatchEntryContext): MatchEntry {
        val default = ctx.ELSE() != null
        val literalConstants = ctx.literalConstant()?.mapMutable { parseLiteralConstant(it) } ?: mutableListOf()
        val statements = parseBlock(ctx.block())
        val type = statements.last().type
        return MatchEntry(default, literalConstants, statements, type)
    }
    
    private fun parseOptionalTryExpression(ctx: AprlParser.OptionalTryExpressionContext): OptionalTryExpression {
        val statements = ctx.block()?.let { parseBlock(it) }
        val expression = ctx.expression()?.let { parseExpression(it) }
        val type = NullableType(type = statements?.last()?.type ?: expression?.type
        ?: throw InternalError("Expected OptionalTryExpressionContext ($ctx) to have statements or expression"))
        return OptionalTryExpression(statements, expression, type)
    }
    
    private fun parseTryExpression(ctx: AprlParser.TryExpressionContext): TryExpression {
        val statements = parseBlock(ctx.block())
        val catchBlocks = ctx.catchBlock()?.mapMutable { parseCatchBlock(it) } ?: mutableListOf()
        val finallyBlock = ctx.finallyBlock()?.let { parseFinallyBlock(it) }
        val type = run {
            val `try` = statements.last().type
            val catch = catchBlocks.map { it.statements.last().type }
            val finally = finallyBlock?.statements?.last()?.type
            lowestCommonSuperClass(catch + `try` andMaybe finally)
        }
        return TryExpression(statements, catchBlocks, finallyBlock, type)
    }
    
    private fun parseCatchBlock(ctx: AprlParser.CatchBlockContext): CatchBlock {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: Annotations()
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
        if (!isInBound(expression.type, java.lang.Throwable::class.java)) {
            ERROR(ctx.expression(), "")
        }
        return TriggerExpression(expression)
    }
    
    private fun parseReturnExpression(ctx: AprlParser.ReturnExpressionContext): ReturnExpression {
        val expression = parseExpression(ctx.expression())
        return ReturnExpression(expression)
    }
    
    private fun parseLocalVariableDeclaration(ctx: AprlParser.LocalVariableDeclarationContext): MutableList<LocalVariable> {
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: Annotations()
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
        expressionPosition: Position?,
    ): LocalVariable {
        annotations.addAll(variableDeclaration.annotations()?.let { parseAnnotations(it, AnnotationTarget.LOCAL_VARIABLE) } ?: Annotations())
        val type: Type
        if (variableDeclaration.type() != null) {
            type = parseType(variableDeclaration.type())
            if (expression != null) {
                checkType(expression, expressionPosition!!, type)
            }
        } else {
            if (expression != null) {
                type = expression.type
            } else {
                ERROR(variableDeclaration.simpleIdentifier(), "Variable must either have a type annotation or be initialized")
            }
        }
        return LocalVariable(variableDeclaration.simpleIdentifier().text, type, final, expression)
    }
    
    private fun checkType(expression: Expression, expressionPosition: Position, type: Type) {
        expression.type.let {
            if (!isInBound(it, type)) {
                ERROR(expressionPosition, "Type mismatch: inferred type is ${it.toJava()} but ${type.toJava()} was expected")
            }
        }
    }
    
    private fun parseInitializerBody(ctx: AprlParser.InitializerBodyContext): Statements {
        return parseBlock(ctx.block())
    }
    
    private fun parseBlock(ctx: AprlParser.BlockContext): Statements {
        return ctx.statements().statement()?.flatMapMutable { parseStatement(it) } ?: Statements()
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
        return Constructor(clazz, modifiers = mutableSetOf(Modifier.PUBLIC), statements = Statements(SuperCall(superArguments)))
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
                                it.value.type.run {
                                    isInBound(javaType, typeArguments, constructor.parameters.last().type)
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
            valueArgument.value.type.run {
                isInBound(javaType, typeArguments, parameter.type)
            }
        }
    }
    
    private fun lowestCommonSuperClass(vararg classes: Type): Type {
        val hierarchies = classes.map { it.javaType.hierarchy }
        val typeArguments = classes.filter { it.typeArguments != null }.map { it.typeArguments!! }
        var i = 0
        while (hierarchies.all { i <= it.lastIndex } && hierarchies.allAt(i).allEqual) {
            i++
        }
        return ClassType(hierarchies[0][i])
    }
    
    private fun lowestCommonSuperClass(classes: Collection<Type>): Type {
        return lowestCommonSuperClass(*classes.toTypedArray())
    }
    
    private fun evaluateReference(identifier: List<String>): Type {
        TODO("also check methods")
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
                ERROR(lastIdentifier.position + lastIdentifier.text.length, "$req expected for ${clazz.name}")
            }
            if (typeArguments.typeProjection().size != b) {
                ERROR(typeArguments, "$req expected for '${clazz.name}'")
            } else {
                for ((typeProjection, superTypeParameter) in typeArguments.typeProjection().pair(superTypeParameters)) {
                    val varianceModifier = typeProjection.typeProjectionModifierList()?.typeProjectionModifier()?.firstOrNull { it.varianceModifier() != null }
                    if (typeProjection.QUEST() != null) {
                        if (!projectionsAllowed) {
                            ERROR(typeProjection, "Projections are not allowed here")
                        }
                    } else if (varianceModifier != null) {
                        if (!projectionsAllowed) {
                            ERROR(varianceModifier, "Projections are not allowed here")
                        }
                    } else {
                        val type: Type = parseType(typeProjection.type())
                        for (bound in superTypeParameter.bounds) {
                            if (!isInBound(type.javaType, type.typeArguments, bound)) {
                                ERROR(typeProjection, "Type argument is not within bounds (expected ${bound.typeName})")
                            }
                        }
                    }
                }
            }
        } else {
            if (typeArguments?.typeProjection()?.isNotEmpty() == true) {
                ERROR(typeArguments, "No type arguments expected for '${clazz.name}'")
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
                        typeProjection.wildcard || typeProjection.type!!.let { isInBound(it.javaType, it.typeArguments, bound.actualTypeArguments[i]) }
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
    
    private fun isInBound(type: Type, bound: JType): Boolean = isInBound(type.javaType, type.typeArguments, bound)
    
    private fun isInBound(clazz1: Class<*>, typeArguments1: TypeArgument?, clazz2: Class<*>, typeArguments2: TypeArgument?): Boolean {
        val type: JType = if (typeArguments2 != null) ParameterizedTypeImpl.make(clazz2, typeArguments2.toJava(), null) else clazz2
        return isInBound(clazz1, typeArguments1, type)
    }
    
    private fun isInBound(type: JType, bound: JType): Boolean = isInBound(type.toType(), bound.toType())
    
    private fun isInBound(type: Type, bound: Type): Boolean = isInBound(type.javaType, type.typeArguments, bound.javaType, bound.typeArguments)
    
    private fun checkClassExtendability(clazz: Class<*>, position: Position) {
        if (clazz.isEnum) {
            ERROR(position, "Cannot inherit from enum '${clazz.name}'")
        } else if (clazz.isRecord) {
            ERROR(position, "Cannot inherit from document '${clazz.name}'")
        } else if (JModifier.isFinal(clazz.modifiers)) {
            ERROR(position, "'${clazz.name}' is final and cannot be inherited from")
        }
        // TODO: are there more class extendability restrictions?
    }
    
    private fun loadImportedClass(identifier: AprlParser.IdentifierContext): Class<*> {
        return loadImportedClass(identifier.simpleIdentifier())
    }
    
    private fun loadImportedClass(identifiers: List<AprlParser.SimpleIdentifierContext>): Class<*> {
        val first = identifiers[0]
        val clazz = loadCompleteClass(identifiers.joinToString(".") { it.text })
        if (clazz != null) {
            return clazz
        }
        val baseClass = loadImportedClass(first) ?: ERROR(first, "Unresolved reference: '${first.text}'")
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
            ERROR(faulty!!, "Unresolved reference: '${faulty.text}'")
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
        val annotations = ctx.annotations()?.let { parseAnnotations(it, AnnotationTarget.EXPRESSION) } ?: Annotations()
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
        val annotations = type.annotations()?.let { parseAnnotations(it, AnnotationTarget.TYPE) } ?: Annotations()
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
                ClassType(loadImportedClass(identifier1.simpleIdentifier()), typeArguments1)
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
            ClassType(loadImportedClass(identifier.simpleIdentifier()), typeArguments)
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
            ClassType(loadImportedClass(identifier.simpleIdentifier()), typeArguments)
        } else if (paren != null) {
            parseType(paren.type())
        } else if (array != null) {
            parseType(array.type())
        } else {
            throw InternalError("Expected NullableTypeContext ($ctx) to have user-, parenthesized- or arrayType")
        }
        return NullableType(type = baseType)
    }
    
    private fun parseIdentifier(ctx: AprlParser.IdentifierContext): ClassType {
        return ClassType(loadImportedClass(ctx.simpleIdentifier()), null)
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
        val typeProjectionModifiers: MutableSet<TypeProjectionModifier>
        if (typeProjectionModifierList == null) {
            annotations = Annotations()
            typeProjectionModifiers = mutableSetOf()
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
    
    private fun typeProjectionModifiersFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): MutableSet<TypeProjectionModifier> {
        return ctx.typeProjectionModifier().filter { it.varianceModifier() != null }.map { parseVarianceModifier(it.varianceModifier()) }.toMutableSet()
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
            Annotations(parseSingleAnnotation(ctx.unescapedAnnotation(0), requiredTarget))
        }
    }
    
    private fun parseMultiAnnotation(annotations: List<AprlParser.UnescapedAnnotationContext>, requiredTarget: AnnotationTarget): Annotations {
        return annotations.mapMutable { parseSingleAnnotation(it, requiredTarget) }
    }
    
    private fun parseSingleAnnotation(annotation: AprlParser.UnescapedAnnotationContext, requiredTarget: AnnotationTarget): Triple<Class<*>, ValueArguments, AnnotationRetention> {
        val clazz = loadImportedClass(annotation.identifier())
        val valueArguments = annotation.valueArguments()?.let { parseValueArguments(it) } ?: ValueArguments()
        val retention = clazz.getAnnotation(Retention::class.java)?.value ?: AnnotationRetention.RUNTIME
        val targets = clazz.getAnnotation(Target::class.java)?.targets ?: AnnotationTarget.values()
        if (requiredTarget !in targets) {
            ERROR(annotation, "Annotation '${clazz.name}' is not applicable to target '${requiredTarget.name.replace("_", " ").lowercase()}'")
        }
        if (getValidConstructor(clazz.constructors, valueArguments) == null) {
            ERROR(annotation.valueArguments()?.position ?: annotation.identifier().let { it.position + it.text.length }, "No constructor can be called with the arguments supplied")
        }
        return Triple(clazz, valueArguments, retention)
    }
    
    private fun parseTopLevelInterface(ctx: AprlParser.InterfaceDeclarationContext): Interface {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level interface", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: Annotations()
        val inter = Interface(ctx.simpleIdentifier().text, null)
        // TODO: parse interface
        return inter
    }
    
    private fun parseTopLevelAnnotation(ctx: AprlParser.AnnotationDeclarationContext): Annotation {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level annotation", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.ANNOTATION) } ?: Annotations()
        val annotation = Annotation(ctx.simpleIdentifier().text, null)
        // TODO: parse annotation class
        return annotation
    }
    
    private fun parseTopLevelDocument(ctx: AprlParser.DocumentDeclarationContext): Document {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level document", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: Annotations()
        val document = Document(ctx.simpleIdentifier().text, null)
        // TODO: parse document class
        return document
    }
    
    private fun parseTopLevelStruct(ctx: AprlParser.StructDeclarationContext): Struct {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level struct", Modifier::`class`) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: Annotations()
        val struct = Struct(ctx.simpleIdentifier().text, null)
        // TODO: parse struct
        return struct
    }
    
    private fun parseTopLevelEnum(ctx: AprlParser.EnumDeclarationContext): aprl.compiler.jvm.Enum {
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "top level enum", Modifier::enum) } ?: mutableListOf()
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.CLASS) } ?: Annotations()
        val enum = Enum(ctx.simpleIdentifier().text, null)
        // TODO: parse enum
        return enum
    }
    
    private fun parseTopLevelExtension(ctx: AprlParser.ExtensionDeclarationContext): List<Function> {
        enclosingClassRequired = ctx.extensionBody() != null && ctx.extensionBody().extensionMember().size != 0
        return ctx.extensionBody()?.extensionMember()?.flatMapMutable { parseExtensionMember(it, parseReceiverType(ctx.receiverType()), ctx) } ?: mutableListOf()
    }
    
    private fun parseExtensionMember(ctx: AprlParser.ExtensionMemberContext, receiverType: ReceiverType, parent: AprlParser.ExtensionDeclarationContext): List<Function> {
        return listOf(parseExtensionFunction(ctx.functionDeclaration(), receiverType, parent))
    }
    
    private fun parseExtensionFunction(ctx: AprlParser.FunctionDeclarationContext, receiverType: ReceiverType, parent: AprlParser.ExtensionDeclarationContext): Function {
        val param1 = MethodParameter(name = "\$this", type = receiverType.type)
        val name = ctx.simpleIdentifier().text
        val annotations = ctx.modifierList()?.let { annotationsFromModifierList(it, AnnotationTarget.FUNCTION) } ?: Annotations()
        val modifiers = ctx.modifierList()?.let { modifiersFromModifierList(it, "extension function", Modifier::function) } ?: mutableListOf()
        val typeParameters = ctx.typeParameters()?.let { parseTypeParameters(it) } ?: mutableListOf()
        parent.typeParameters()?.let { parseTypeParameters(it) }?.also { typeParameters.addAll(0, it) }
        val parameters = parseFunctionParameters(ctx.functionValueParameters()).apply { add(0, param1) }
        val returnType = ctx.type()?.let { parseType(it) } ?: ERROR(ctx.functionValueParameters().run<ParserRuleContext, Position> { position + text.length },
            "Extension function $name() must have explicit return type")
        val statements = ctx.functionBody()?.let { parseFunctionBody(it) } ?: ERROR(ctx.functionValueParameters().run<ParserRuleContext, Position> { position + text.length },
            "Extension function $name() must have a body")
        return Function(name, enclosingClass, annotations, modifiers.split().first.toMutableSet(), typeParameters, parameters, returnType, statements)
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
    
    private fun modifiersFromModifierList(ctx: AprlParser.ModifierListContext, target: String, condition: (Modifier) -> Boolean): MutableList<Pair<Modifier, Position>> {
        val modifiers = ctx.modifier().mapMutable {
            val actualModifier = it.visibilityModifier()?.run {
                if (PUBLIC() != null) Modifier.PUBLIC
                else if (LOCAL() != null) Modifier.LOCAL
                else if (BOUNDED() != null) Modifier.BOUNDED
                else if (PRIVATE() != null) Modifier.PRIVATE
                else throw InternalError("Expected VisibilityModifierContext ($this) to be PUBLIC, LOCAL, BOUNDED or PRIVATE")
            } ?: it.inheritanceModifier()?.run {
                if (ABSTRACT() != null) Modifier.ABSTRACT
                else if (FINAL() != null) Modifier.FINAL
                else if (OPEN() != null) Modifier.OPEN
                else if (COVER() != null) Modifier.COVER
                else throw InternalError("Expected InheritanceModifierContext ($this) to be SAMPLE, FINAL, OPEN or COVER")
            } ?: it.parameterModifier()?.run {
                if (PARAMS() != null) Modifier.PARAMS
                else throw InternalError("Expected ParameterModifierContext ($this) to be PARAMS")
            } ?: it.functionModifier()?.run {
                if (INLINE() != null) Modifier.INLINE
                else if (SYNC() != null) Modifier.SYNC
                else if (EXTERNAL() != null) Modifier.EXTERNAL
                else throw InternalError("Expected FunctionModifierContext ($this) to be INLINE, SYNC or EXTERNAL")
            } ?: throw InternalError("Expected ModifierContext ($it) to have visibility-, inheritance-, parameter- or functionModifier")
            if (!condition(actualModifier)) {
                ERROR(it, "Modifier '$actualModifier' is not applicable to '$target'")
            }
            actualModifier to it.position
        }
        checkIncompatibleModifiers(modifiers.split().first, ctx.modifier())
        return modifiers
    }
    
    private fun checkIncompatibleModifiers(modifiers: List<Modifier>, ctx: List<AprlParser.ModifierContext>) {
        for ((modifier, modifierContext) in modifiers.pair(ctx)) {
            modifiers.firstOrNull { it == modifier }?.let { ERROR(modifierContext, "Repeated '$modifier'") }
            modifiers.firstOrNull { !it.compatibleWith(modifier) }?.let { ERROR(modifierContext, "Modifier '$modifier' is incompatible with '$it'") }
        }
    }
    
    private fun annotationsFromModifierList(ctx: AprlParser.ModifierListContext, requiredTarget: AnnotationTarget): Annotations {
        return ctx.annotations()?.flatMapMutable { parseAnnotations(it, requiredTarget) } ?: Annotations()
    }
    
    private fun loadExtensionFunction(type: Type, functionName: String): Method? {
        return loadExtensionFunctions(type, functionName).firstOrNull()
    }
    
    private fun loadExtensionFunctions(type: Type, functionName: String): List<Method> {
        return importedMethods.filter { method ->
            method.name == functionName
                    && method.parameters[0].let { it.name == "\$this" && isInBound(type, it.type) }
                    && method.modifiers.let { JModifier.isFinal(it) && JModifier.isStatic(it) }
        }
    }
    
}*/