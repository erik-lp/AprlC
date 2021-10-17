package aprl.compiler

import aprl.AprlParser
import aprl.AprlParserBaseListener
import aprl.compiler.jvm.*
import aprl.compiler.jvm.Annotation
import aprl.compiler.jvm.Enum
import java.io.File
import java.util.*
import kotlin.jvm.Throws

class AprlListener(private val fileName: String, targetDir: File?) : AprlParserBaseListener() {
    
    companion object {
        private const val SUFFIX = "java"
    }
    
    private val simpleName = fileName.substringAfterLast(File.separator)
    
    // if there are multiple top level objects or a standalone function/property/extension, an enclosing class is needed
    private var enclosingClassRequired = false
        private set(new) {
            field = new
            enclosingClass = if (new) Clazz(fileName) else null
        }
    
    // $fileName if there are top level functions/properties/extensions, null otherwise
    private var enclosingClass: Clazz? = null
    
    // if there is a targetDir, use it; source folder otherwise
    private val outputFileName = targetDir.safe { path + File.separator + fileName.substringAfterLast(File.separator) }
        ?: fileName.replaceAfterLast(".", SUFFIX)
    
    private val namespace = Namespace()
    private val imports = ArrayList<Import>()
    
    private val topLevelObjects = ArrayList<TopLevelObject>()
    
    fun compile() {}
    
    override fun enterNamespaceHeader(ctx: AprlParser.NamespaceHeaderContext) {
        val pos = ctx.identifier().position
        val namespaceMatchesLocation = namespaceMatchesLocation(ctx, fileName)
        if (!namespaceMatchesLocation) {
            WARN(simpleName, pos, "Namespace does not match file location")
        }
        namespace.addAll(ctx.identifier().simpleIdentifier().map { it.text })
        namespace.freeze()
    }
    
    private fun namespaceMatchesLocation(ctx: AprlParser.NamespaceHeaderContext, filePath: String): Boolean {
        val identifier = ctx.identifier()
        val simpleIdentifiers = ArrayList(identifier.simpleIdentifier().reversed())
        val subFolders = LinkedList(filePath.split(File.separator).reversed()).also { it.pop() }
        for (id in simpleIdentifiers) {
            if (id.Identifier().symbol.text != subFolders.pop()) {
                return false
            }
        }
        return true
    }
    
    override fun enterImportHeader(ctx: AprlParser.ImportHeaderContext) {
        for (importIdentifier in ctx.importIdentifier()) {
            parseImportIdentifier(importIdentifier)
        }
    }
    
    private fun parseImportIdentifier(ctx: AprlParser.ImportIdentifierContext) {
        if (ctx.singleImport() != null) { // alias import (import foo.b as a)
            val singleImport = ctx.singleImport()!!
            parseSingleImport(singleImport.identifier(), singleImport.importAlias())
        } else {
            if (ctx.PERIOD() == null) { // plain import (import foo.a)
                parseSingleImport(ctx.identifier(), null)
            } else {
                if (ctx.MUL() != null) { // all-import (using foo.*)
                    parseAllImport(ctx.identifier())
                } else {
                    if (ctx.subImportIdentifier().size > 1) { // multiple import (using foo.[a, b])
                        val elementsInBrackets = ArrayList<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>()
                        for (subImportIdentifier in ctx.subImportIdentifier()) {
                            elementsInBrackets.add(
                                Pair(
                                    subImportIdentifier.simpleIdentifier(),
                                    subImportIdentifier.importAlias()
                                )
                            )
                        }
                        parseMultiImport(ctx.identifier(), elementsInBrackets)
                    } else { // redundant brackets (using foo.[a])
                        val identifierPosition = ctx.subImportIdentifier(0).position
                        val bracketPosition = Pair(identifierPosition.first, identifierPosition.second - 1)
                        WARN(simpleName, bracketPosition, "Redundant brackets")
                        val allIdentifiers =
                            ctx.identifier().simpleIdentifier() + ctx.subImportIdentifier(0).simpleIdentifier()
                        parseSingleImport(allIdentifiers, ctx.subImportIdentifier(0).importAlias())
                    }
                }
            }
        }
    }
    
    private fun parseAllImport(identifier: AprlParser.IdentifierContext) {
        val importIdentifier = identifier.simpleIdentifier().joinToString(".") { it.text }
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            imports.add(Import().also { it.pkg = pkg })
        } else if (clazz != null) {
            importEverything(clazz)
        } else {
            UNRESOLVED_REFERENCE(identifier.simpleIdentifier())
        }
    }
    
    @Throws(Error::class)
    @Suppress("FunctionName")
    private fun UNRESOLVED_REFERENCE(identifiers: List<AprlParser.SimpleIdentifierContext>): Nothing {
        val error = faultyIdentifier(identifiers)
        throw Error(simpleName, error.position, "Unresolved reference: '${error.text}'")
    }
    
    private fun importEverything(from: Class<*>) {
        from.classes.forEach { clazz -> imports.add(Import().also { it.clazz = clazz }) }
        from.methods.forEach { method -> imports.add(Import().also { it.method = method }) }
        from.fields.forEach { field -> imports.add(Import().also { it.field = field }) }
    }
    
    private fun parseMultiImport(
        identifier: AprlParser.IdentifierContext,
        elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>
    ) {
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
    
    private fun importMultipleFromPackage(
        from: Package,
        elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>
    ) {
        val pkg = from.name
        for ((subIdentifier, alias) in elements) {
            val clazz = loadCompleteClass("$pkg.${subIdentifier.text}") ?: throw Error(
                simpleName,
                subIdentifier.position,
                "Unresolved reference: '${subIdentifier.text}'"
            )
            imports.add(Import().also { it.clazz = clazz; it.alias = alias?.simpleIdentifier()?.text })
        }
    }
    
    private fun importMultipleFromClass(
        from: Class<*>,
        elements: List<Pair<AprlParser.SimpleIdentifierContext, AprlParser.ImportAliasContext?>>
    ) {
        for ((subIdentifier, alias) in elements) {
            addValidImports(from, subIdentifier, alias)
        }
    }
    
    private fun addValidImports(clazz: Class<*>, identifier: AprlParser.SimpleIdentifierContext, alias: AprlParser.ImportAliasContext?) {
        val method = loadMethod(clazz, identifier.text)
        val field = loadField(clazz, identifier.text)
        if (method != null) {
            imports.add(Import().also { it.method = method; it.alias = alias?.simpleIdentifier()?.text })
        }
        if (field != null) {
            if (this.imports.any { it.field?.name == field.name && it.field != field }) {
                throw Error(simpleName, identifier.position, "Field by name '${field.name}' is already defined in an import")
            } else {
                imports.add(Import().also { it.field = field; it.alias = alias?.simpleIdentifier()?.text })
            }
        }
        if (method == null && field == null) {
            throw Error(simpleName, identifier.position, "Unresolved reference: '${identifier.text}'")
        }
        if (identifier.text == alias?.simpleIdentifier()?.text) {
            WARN(simpleName, alias!!.position, "Redundant import alias")
        }
    }
    
    private fun parseSingleImport(
        identifier: AprlParser.IdentifierContext,
        importAlias: AprlParser.ImportAliasContext?
    ) {
        parseSingleImport(identifier.simpleIdentifier(), importAlias)
    }
    
    private fun parseSingleImport(
        identifiers: List<AprlParser.SimpleIdentifierContext>,
        importAlias: AprlParser.ImportAliasContext?
    ) {
        val importIdentifier = identifiers.joinToString(".") { it.text }
        val alias = importAlias?.simpleIdentifier()?.text
        val pkg = loadPackage(importIdentifier)
        val clazz = loadCompleteClass(importIdentifier)
        if (pkg != null) {
            throw Error(simpleName, identifiers.last().position, "Namespaces cannot be imported")
        } else if (clazz != null) {
            if (clazz.simpleName == alias) {
                WARN(simpleName, importAlias!!.position, "Redundant import alias")
            }
            imports.add(Import().also { it.clazz = clazz; it.alias = alias })
        } else {
            val last = identifiers.last()
            val possibleClass = loadCompleteClass(identifiers.dropLast(1).joinToString(".") { it.text }) ?: throw Error(simpleName, last.position, "Unresolved reference: '${last.text}'")
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
        if (clazz != null) {
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
        } else if (extension != null) {
            parseTopLevelExtension(extension)
        } else if (function != null) {
            parseTopLevelFunction(function)
        } else if (property != null) {
            parseTopLevelProperty(property)
        }
    }
    
    private fun parseTopLevelClass(ctx: AprlParser.ClassDeclarationContext) {
        val clazz = Clazz(ctx.simpleIdentifier().text)
        clazz.modifiers = ctx.modifierList().safe { modifiersFromModifierList(this@safe) } ?: arrayListOf()
        clazz.annotations = ctx.modifierList().safe { annotationsFromModifierList(this@safe) } ?: arrayListOf()
        clazz.typeParameters = ctx.typeParameters().safe { parseTypeParameters(this@safe) } ?: arrayListOf()
        val delegations = ctx.delegationSpecifiers()
        if (delegations != null) {
            val superClasses = ArrayList<Triple<Annotations, Class<*>, ValueArguments>>()
            for (delegation in delegations.annotatedDelegationSpecifier()) {
                val identifier = delegation.delegationSpecifier().identifier()
                val annotations = delegation.annotations().safe { parseAnnotations(this@safe) } ?: arrayListOf()
                val superClassOrInterface = loadImportedClass(identifier)
                val valueArguments = delegation.delegationSpecifier().valueArguments().safe { parseValueArguments(this@safe) }
                if (!superClassOrInterface.isInterface) {
                    if (superClasses.any { !it.second.isInterface }) {
                        throw Error(simpleName, identifier.position, "Class cannot extend multiple classes")
                    }
                    if (valueArguments == null) {
                        val add: (Int, Int) -> Int = { a, b -> a + b }
                        throw Error(simpleName, identifier.position.plus(0, identifier.text.length, add), "This type has a constructor and thus must be initialized here")
                    }
                }
                superClasses.add(Triple(annotations, superClassOrInterface, valueArguments ?: arrayListOf()))
            }
        }
        // TODO: class members
        topLevelObjects.add(clazz)
    }
    
    private fun loadImportedClass(identifier: AprlParser.IdentifierContext): Class<*> {
        val first = identifier.simpleIdentifier(0)
        val clazz = loadCompleteClass(identifier.simpleIdentifier().joinToString(".") { it.text })
        if (clazz != null) {
            return clazz
        }
        val baseClass = loadImportedClass(first) ?: throw Error(simpleName, first.position, "Unresolved reference: '${first.text}'")
        val suffix = if (identifier.simpleIdentifier().size == 1) "" else "." + identifier.simpleIdentifier().drop(1).joinToString(".") { it.text }
        val completeString = baseClass.name + suffix
        val completeClass = loadCompleteClass(completeString)
        if (completeClass == null) {
            var faulty: AprlParser.SimpleIdentifierContext? = null
            val total = ArrayList<AprlParser.SimpleIdentifierContext>()
            for (some in identifier.simpleIdentifier().drop(1)) {
                total.add(some)
                val str = baseClass.name + "." + total.joinToString(".") { it.text }
                println("Checking existence of $str")
                if (loadCompleteClass(str) == null) {
                    faulty = some
                    break
                }
            }
            faulty ?: throw InternalError("loadCompleteClass() was null although it should not have been (${total.joinToString(".")})")
            throw Error(simpleName, faulty.position, "Unresolved reference: '${faulty.text}'")
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
        TODO()
    }
    
    private fun parseTypeParameters(ctx: AprlParser.TypeParametersContext): ArrayList<TypeParameter> {
        return parseTypeParameters(ctx.typeParameter())
    }
    
    private fun parseTypeParameters(parameters: List<AprlParser.TypeParameterContext>): ArrayList<TypeParameter> {
        val actualParameters = ArrayList<TypeParameter>()
        for (param in parameters) {
            actualParameters.add(parseTypeParameter(param))
        }
        return actualParameters
    }
    
    private fun parseTypeParameter(parameter: AprlParser.TypeParameterContext): TypeParameter {
        val name = parameter.simpleIdentifier().text
        val constraints = parameter.type().safe { parseTypeConstraints(this@safe) } ?: emptyList()
        return TypeParameter(name, constraints.asArray())
    }
    
    private fun parseTypeConstraints(constraints: List<AprlParser.TypeContext>): ArrayList<Type> {
        val actualConstraints = ArrayList<Type>()
        for (constraint in constraints) {
            actualConstraints.add(parseType(constraint))
        }
        return actualConstraints
    }
    
    private fun parseType(type: AprlParser.TypeContext): Type {
        val annotations = parseAnnotations(type.annotations())
        val function = type.functionType()
        val paren = type.parenthesizedType()
        val array = type.arrayType()
        val nullable = type.nullableType()
        val identifier = type.identifier()
        return if (function != null) {
            parseFunctionType(annotations, function)
        } else if (paren != null) {
            parseType(paren.type())
        } else if (array != null) {
            ArrayType(annotations, parseType(array.type()))
        } else if (nullable != null) {
            val identifier1 = nullable.identifier()
            val paren1 = nullable.parenthesizedType()
            val array1 = nullable.arrayType()
            val baseType = if (identifier1 != null) {
                parseUserType(annotations, identifier1)
            } else if (paren1 != null) {
                parseType(paren1.type())
            } else if (array1 != null) {
                parseType(array1.type())
            } else {
                throw InternalError("Expected NullableTypeContext ($nullable) to have userType, parenthesizedType or arrayType")
            }
            NullableType(annotations, baseType)
        } else if (identifier != null) {
            parseUserType(annotations, identifier)
        } else {
            throw InternalError("Expected TypeContext ($type) to have functionType, parenthesizedType, arrayType, nullableType or userType")
        }
    }
    
    private fun parseFunctionType(annotations: Annotations, ctx: AprlParser.FunctionTypeContext): FunctionType {
        val parameters = ArrayList<Type>()
        for (functionTP in ctx.functionTypeParameters().type() ?: emptyList()) {
            parameters.add(parseType(functionTP))
        }
        val returnType = parseType(ctx.type())
        return FunctionType(annotations, parameters, returnType)
    }
    
    private fun parseUserType(annotations: Annotations, ctx: AprlParser.IdentifierContext): Identifier {
        return Identifier(annotations, ctx.simpleIdentifier().map { it.text }.toMutableList())
    }
    
    private fun parseTypeArguments(ctx: AprlParser.TypeArgumentsContext): TypeArgument {
        val typeProjections = ArrayList<TypeProjection>()
        for (typeProjection in ctx.typeProjection()) {
            typeProjections.add(parseTypeProjection(typeProjection))
        }
        return TypeArgument(typeProjections)
    }
    
    private fun parseTypeProjection(ctx: AprlParser.TypeProjectionContext): TypeProjection {
        val typeProjectionModifierList = ctx.typeProjectionModifierList()
        val annotations: Annotations
        val typeProjectionModifiers: ArrayList<TypeProjectionModifier>
        if (typeProjectionModifierList == null) {
            annotations = Annotations()
            typeProjectionModifiers = arrayListOf()
        } else {
            annotations = annotationsFromTypeProjectionModifierList(ctx.typeProjectionModifierList())
            typeProjectionModifiers =
                typeProjectionModifiersFromTypeProjectionModifierList(ctx.typeProjectionModifierList())
        }
        return TypeProjection(annotations, typeProjectionModifiers, ctx.type().safe { parseType(this@safe) })
    }
    
    private fun annotationsFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): Annotations {
        val annotations = Annotations()
        for (modifier in ctx.typeProjectionModifier()) {
            val annotation = modifier.annotation()
            if (annotation != null) {
                annotations.addAll(parseAnnotation(annotation))
            }
        }
        return annotations
    }
    
    private fun typeProjectionModifiersFromTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): ArrayList<TypeProjectionModifier> {
        val typeProjectionModifiers = ArrayList<TypeProjectionModifier>()
        for (modifier in ctx.typeProjectionModifier()) {
            val typeProjectionModifier = modifier.varianceModifier()
            if (typeProjectionModifier != null) {
                typeProjectionModifiers.add(parseVarianceModifier(typeProjectionModifier))
            }
        }
        return typeProjectionModifiers
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
    
    private fun parseAnnotations(ctx: AprlParser.AnnotationsContext): Annotations {
        val annotations = Annotations()
        for (annotation in ctx.annotation()) {
            annotations.addAll(parseAnnotation(annotation))
        }
        return annotations
    }
    
    private fun parseAnnotation(ctx: AprlParser.AnnotationContext): Annotations {
        return if (ctx.LSQUARE() != null) {
            parseMultiAnnotation(ctx.unescapedAnnotation())
        } else {
            arrayListOf(parseSingleAnnotation(ctx.unescapedAnnotation(0)))
        }
    }
    
    private fun parseMultiAnnotation(annotations: List<AprlParser.UnescapedAnnotationContext>): Annotations {
        TODO()
    }
    
    private fun parseSingleAnnotation(annotation: AprlParser.UnescapedAnnotationContext): Pair<Class<*>, ValueArguments> {
        TODO()
    }
    
    private fun parseTopLevelInterface(ctx: AprlParser.InterfaceDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val inter = Interface(ctx.simpleIdentifier().text)
        // TODO: parse interface
        topLevelObjects.add(inter)
    }
    
    private fun parseTopLevelAnnotation(ctx: AprlParser.AnnotationDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val annotation = Annotation(ctx.simpleIdentifier().text)
        // TODO: parse annotation class
        topLevelObjects.add(annotation)
    }
    
    private fun parseTopLevelDocument(ctx: AprlParser.DocumentDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val document = Document(ctx.simpleIdentifier().text)
        // TODO: parse document class
        topLevelObjects.add(document)
    }
    
    private fun parseTopLevelStruct(ctx: AprlParser.StructDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val struct = Struct(ctx.simpleIdentifier().text)
        // TODO: parse struct
        topLevelObjects.add(struct)
    }
    
    private fun parseTopLevelEnum(ctx: AprlParser.EnumDeclarationContext) {
        val modifiers = modifiersFromModifierList(ctx.modifierList())
        val annotations = annotationsFromModifierList(ctx.modifierList())
        val enum = Enum(ctx.simpleIdentifier().text)
        // TODO: parse enum
        topLevelObjects.add(enum)
    }
    
    private fun parseTopLevelExtension(ctx: AprlParser.ExtensionDeclarationContext) {
        enclosingClassRequired = ctx.extensionBody() != null && ctx.extensionBody().extensionMember().size != 0
    }
    
    private fun parseTopLevelFunction(ctx: AprlParser.FunctionDeclarationContext) {
        enclosingClassRequired = true
    }
    
    private fun parseTopLevelProperty(ctx: AprlParser.PropertyDeclarationContext) {
        enclosingClassRequired = true
    }
    
    override fun enterClassDeclaration(ctx: AprlParser.ClassDeclarationContext) {}
    
    override fun enterPrimaryConstructor(ctx: AprlParser.PrimaryConstructorContext) {}
    
    override fun enterClassParameters(ctx: AprlParser.ClassParametersContext) {}
    
    override fun enterClassParameter(ctx: AprlParser.ClassParameterContext) {}
    
    override fun enterDelegationSpecifiers(ctx: AprlParser.DelegationSpecifiersContext) {}
    
    override fun enterAnnotatedDelegationSpecifier(ctx: AprlParser.AnnotatedDelegationSpecifierContext) {}
    
    override fun enterDelegationSpecifier(ctx: AprlParser.DelegationSpecifierContext) {}
    
    override fun enterValueArguments(ctx: AprlParser.ValueArgumentsContext) {}
    
    override fun enterValueArgument(ctx: AprlParser.ValueArgumentContext) {}
    
    override fun enterSecondaryConstructor(ctx: AprlParser.SecondaryConstructorContext) {}
    
    override fun enterConstructorDelegationCall(ctx: AprlParser.ConstructorDelegationCallContext) {}
    
    override fun enterClassBody(ctx: AprlParser.ClassBodyContext) {}
    
    override fun enterClassMember(ctx: AprlParser.ClassMemberContext) {}
    
    override fun enterLoadScript(ctx: AprlParser.LoadScriptContext) {}
    
    override fun enterInitializerBody(ctx: AprlParser.InitializerBodyContext) {}
    
    override fun enterPartnerDeclaration(ctx: AprlParser.PartnerDeclarationContext) {}
    
    override fun enterTypeArguments(ctx: AprlParser.TypeArgumentsContext) {}
    
    override fun enterTypeProjection(ctx: AprlParser.TypeProjectionContext) {}
    
    override fun enterTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext) {}
    
    override fun enterTypeProjectionModifier(ctx: AprlParser.TypeProjectionModifierContext) {}
    
    override fun enterTypeParameters(ctx: AprlParser.TypeParametersContext) {}
    
    override fun enterTypeParameter(ctx: AprlParser.TypeParameterContext) {}
    
    override fun enterTypeParameterModifierList(ctx: AprlParser.TypeParameterModifierListContext) {}
    
    override fun enterTypeParameterModifier(ctx: AprlParser.TypeParameterModifierContext) {}
    
    override fun enterReificationModifier(ctx: AprlParser.ReificationModifierContext) {}
    
    override fun enterVarianceModifier(ctx: AprlParser.VarianceModifierContext) {}
    
    override fun enterType(ctx: AprlParser.TypeContext) {}
    
    override fun enterFunctionType(ctx: AprlParser.FunctionTypeContext) {}
    
    override fun enterReceiverType(ctx: AprlParser.ReceiverTypeContext) {}
    
    override fun enterFunctionTypeParameters(ctx: AprlParser.FunctionTypeParametersContext) {}
    
    override fun enterParenthesizedType(ctx: AprlParser.ParenthesizedTypeContext) {}
    
    override fun enterArrayType(ctx: AprlParser.ArrayTypeContext) {}
    
    override fun enterNullableType(ctx: AprlParser.NullableTypeContext) {}
    
    override fun enterStructDeclaration(ctx: AprlParser.StructDeclarationContext) {}
    
    override fun enterStructBody(ctx: AprlParser.StructBodyContext) {}
    
    override fun enterStructMember(ctx: AprlParser.StructMemberContext) {}
    
    override fun enterEnumDeclaration(ctx: AprlParser.EnumDeclarationContext) {}
    
    override fun enterEnumBody(ctx: AprlParser.EnumBodyContext) {}
    
    override fun enterEnumEntries(ctx: AprlParser.EnumEntriesContext) {}
    
    override fun enterEnumEntry(ctx: AprlParser.EnumEntryContext) {}
    
    override fun enterExtensionDeclaration(ctx: AprlParser.ExtensionDeclarationContext) {}
    
    override fun enterExtensionBody(ctx: AprlParser.ExtensionBodyContext) {}
    
    override fun enterExtensionMember(ctx: AprlParser.ExtensionMemberContext) {}
    
    override fun enterPropertyDeclaration(ctx: AprlParser.PropertyDeclarationContext) {}
    
    override fun enterVariableDeclaration(ctx: AprlParser.VariableDeclarationContext) {}
    
    override fun enterMultiVariableDeclaration(ctx: AprlParser.MultiVariableDeclarationContext) {}
    
    override fun enterPropertyBody(ctx: AprlParser.PropertyBodyContext) {}
    
    override fun enterGetter(ctx: AprlParser.GetterContext) {}
    
    override fun enterSetter(ctx: AprlParser.SetterContext) {}
    
    override fun enterFunctionValueParameterWithOptionalType(ctx: AprlParser.FunctionValueParameterWithOptionalTypeContext) {}
    
    override fun enterParameterModifiers(ctx: AprlParser.ParameterModifiersContext) {}
    
    override fun enterParameterWithOptionalType(ctx: AprlParser.ParameterWithOptionalTypeContext) {}
    
    override fun enterFunctionDeclaration(ctx: AprlParser.FunctionDeclarationContext) {}
    
    override fun enterFunctionValueParameters(ctx: AprlParser.FunctionValueParametersContext) {}
    
    override fun enterFunctionValueParameter(ctx: AprlParser.FunctionValueParameterContext) {}
    
    override fun enterParameter(ctx: AprlParser.ParameterContext) {}
    
    override fun enterFunctionBody(ctx: AprlParser.FunctionBodyContext) {}
    
    override fun enterBlock(ctx: AprlParser.BlockContext) {}
    
    override fun enterStatements(ctx: AprlParser.StatementsContext) {}
    
    override fun enterStatement(ctx: AprlParser.StatementContext) {}
    
    override fun enterLoopStatement(ctx: AprlParser.LoopStatementContext) {}
    
    override fun enterForStatement(ctx: AprlParser.ForStatementContext) {}
    
    override fun enterWhileStatement(ctx: AprlParser.WhileStatementContext) {}
    
    override fun enterDoWhileStatement(ctx: AprlParser.DoWhileStatementContext) {}
    
    override fun enterAssignment(ctx: AprlParser.AssignmentContext) {}
    
    override fun enterExpression(ctx: AprlParser.ExpressionContext) {}
    
    override fun enterDisjunction(ctx: AprlParser.DisjunctionContext) {}
    
    override fun enterConjunction(ctx: AprlParser.ConjunctionContext) {}
    
    override fun enterEqualityComparison(ctx: AprlParser.EqualityComparisonContext) {}
    
    override fun enterIdentityComparison(ctx: AprlParser.IdentityComparisonContext) {}
    
    override fun enterComparison(ctx: AprlParser.ComparisonContext) {}
    
    override fun enterCallExpression(ctx: AprlParser.CallExpressionContext) {}
    
    override fun enterNamedInfixExpression(ctx: AprlParser.NamedInfixExpressionContext) {}
    
    override fun enterElvisExpression(ctx: AprlParser.ElvisExpressionContext) {}
    
    override fun enterInfixFunctionCall(ctx: AprlParser.InfixFunctionCallContext) {}
    
    override fun enterRangeExpression(ctx: AprlParser.RangeExpressionContext) {}
    
    override fun enterXorExpression(ctx: AprlParser.XorExpressionContext) {}
    
    override fun enterAdditiveExpression(ctx: AprlParser.AdditiveExpressionContext) {}
    
    override fun enterMultiplicativeExpression(ctx: AprlParser.MultiplicativeExpressionContext) {}
    
    override fun enterExponentialExpression(ctx: AprlParser.ExponentialExpressionContext) {}
    
    override fun enterAsExpression(ctx: AprlParser.AsExpressionContext) {}
    
    override fun enterPrefixUnaryExpression(ctx: AprlParser.PrefixUnaryExpressionContext) {}
    
    override fun enterPostfixUnaryExpression(ctx: AprlParser.PostfixUnaryExpressionContext) {}
    
    override fun enterAtomicExpression(ctx: AprlParser.AtomicExpressionContext) {}
    
    override fun enterParenthesizedExpression(ctx: AprlParser.ParenthesizedExpressionContext) {}
    
    override fun enterContextualReference(ctx: AprlParser.ContextualReferenceContext) {}
    
    override fun enterCallableReference(ctx: AprlParser.CallableReferenceContext) {}
    
    override fun enterAnonymousObjectLiteral(ctx: AprlParser.AnonymousObjectLiteralContext) {}
    
    override fun enterCollectionLiteral(ctx: AprlParser.CollectionLiteralContext) {}
    
    override fun enterThisExpression(ctx: AprlParser.ThisExpressionContext) {}
    
    override fun enterSuperExpression(ctx: AprlParser.SuperExpressionContext) {}
    
    override fun enterConditionalExpression(ctx: AprlParser.ConditionalExpressionContext) {}
    
    override fun enterIfExpression(ctx: AprlParser.IfExpressionContext) {}
    
    override fun enterControlStructureBody(ctx: AprlParser.ControlStructureBodyContext) {}
    
    override fun enterMatchExpression(ctx: AprlParser.MatchExpressionContext) {}
    
    override fun enterMatchEntry(ctx: AprlParser.MatchEntryContext) {}
    
    override fun enterOptionalTryExpression(ctx: AprlParser.OptionalTryExpressionContext) {}
    
    override fun enterTryExpression(ctx: AprlParser.TryExpressionContext) {}
    
    override fun enterCatchBlock(ctx: AprlParser.CatchBlockContext) {}
    
    override fun enterFinallyBlock(ctx: AprlParser.FinallyBlockContext) {}
    
    override fun enterJumpExpression(ctx: AprlParser.JumpExpressionContext) {}
    
    override fun enterTriggerExpression(ctx: AprlParser.TriggerExpressionContext) {}
    
    override fun enterReturnExpression(ctx: AprlParser.ReturnExpressionContext) {}
    
    override fun enterContinueExpression(ctx: AprlParser.ContinueExpressionContext) {}
    
    override fun enterBreakExpression(ctx: AprlParser.BreakExpressionContext) {}
    
    override fun enterLabelDefinition(ctx: AprlParser.LabelDefinitionContext) {}
    
    override fun enterLabelReference(ctx: AprlParser.LabelReferenceContext) {}
    
    override fun enterLiteralConstant(ctx: AprlParser.LiteralConstantContext) {}
    
    override fun enterNullLiteral(ctx: AprlParser.NullLiteralContext) {}
    
    override fun enterBoolLiteral(ctx: AprlParser.BoolLiteralContext) {}
    
    override fun enterTrileanLiteral(ctx: AprlParser.TrileanLiteralContext) {}
    
    override fun enterIntegerLiteral(ctx: AprlParser.IntegerLiteralContext) {}
    
    override fun enterLongLiteral(ctx: AprlParser.LongLiteralContext) {}
    
    override fun enterShortLiteral(ctx: AprlParser.ShortLiteralContext) {}
    
    override fun enterByteLiteral(ctx: AprlParser.ByteLiteralContext) {}
    
    override fun enterFloatLiteral(ctx: AprlParser.FloatLiteralContext) {}
    
    override fun enterDoubleLiteral(ctx: AprlParser.DoubleLiteralContext) {}
    
    override fun enterComplexLiteral(ctx: AprlParser.ComplexLiteralContext) {}
    
    override fun enterCharacterLiteral(ctx: AprlParser.CharacterLiteralContext) {}
    
    override fun enterStringLiteral(ctx: AprlParser.StringLiteralContext) {}
    
    override fun enterLineStringLiteral(ctx: AprlParser.LineStringLiteralContext) {}
    
    override fun enterMultiLineStringLiteral(ctx: AprlParser.MultiLineStringLiteralContext) {}
    
    override fun enterLineStringContent(ctx: AprlParser.LineStringContentContext) {}
    
    override fun enterLineStringExpression(ctx: AprlParser.LineStringExpressionContext) {}
    
    override fun enterMultiLineStringContent(ctx: AprlParser.MultiLineStringContentContext) {}
    
    override fun enterMultiLineStringExpression(ctx: AprlParser.MultiLineStringExpressionContext) {}
    
    override fun enterFunctionLiteral(ctx: AprlParser.FunctionLiteralContext) {}
    
    override fun enterLambdaLiteral(ctx: AprlParser.LambdaLiteralContext) {}
    
    override fun enterLambdaParameters(ctx: AprlParser.LambdaParametersContext) {}
    
    override fun enterLambdaParameter(ctx: AprlParser.LambdaParameterContext) {}
    
    override fun enterAnonymousFunction(ctx: AprlParser.AnonymousFunctionContext) {}
    
    override fun enterAssignmentOperator(ctx: AprlParser.AssignmentOperatorContext) {}
    
    override fun enterDisjunctionOperator(ctx: AprlParser.DisjunctionOperatorContext) {}
    
    override fun enterConjunctionOperator(ctx: AprlParser.ConjunctionOperatorContext) {}
    
    override fun enterEqualityOperator(ctx: AprlParser.EqualityOperatorContext) {}
    
    override fun enterIdentityOperator(ctx: AprlParser.IdentityOperatorContext) {}
    
    override fun enterComparisonOperator(ctx: AprlParser.ComparisonOperatorContext) {}
    
    override fun enterInOperator(ctx: AprlParser.InOperatorContext) {}
    
    override fun enterIsOperator(ctx: AprlParser.IsOperatorContext) {}
    
    override fun enterElvisOperator(ctx: AprlParser.ElvisOperatorContext) {}
    
    override fun enterToOperator(ctx: AprlParser.ToOperatorContext) {}
    
    override fun enterByOperator(ctx: AprlParser.ByOperatorContext) {}
    
    override fun enterXorOperator(ctx: AprlParser.XorOperatorContext) {}
    
    override fun enterAdditiveOperator(ctx: AprlParser.AdditiveOperatorContext) {}
    
    override fun enterMultiplicativeOperator(ctx: AprlParser.MultiplicativeOperatorContext) {}
    
    override fun enterExponentialOperator(ctx: AprlParser.ExponentialOperatorContext) {}
    
    override fun enterAsOperator(ctx: AprlParser.AsOperatorContext) {}
    
    override fun enterUnaryPrefix(ctx: AprlParser.UnaryPrefixContext) {}
    
    override fun enterPrefixUnaryOperator(ctx: AprlParser.PrefixUnaryOperatorContext) {}
    
    override fun enterUnaryPostfix(ctx: AprlParser.UnaryPostfixContext) {}
    
    override fun enterPostfixUnaryOperator(ctx: AprlParser.PostfixUnaryOperatorContext) {}
    
    override fun enterAssignableExpression(ctx: AprlParser.AssignableExpressionContext) {}
    
    override fun enterParenthesizedAssignableExpression(ctx: AprlParser.ParenthesizedAssignableExpressionContext) {}
    
    override fun enterAssignableSuffix(ctx: AprlParser.AssignableSuffixContext) {}
    
    override fun enterCallSuffix(ctx: AprlParser.CallSuffixContext) {}
    
    override fun enterAnnotatedLambda(ctx: AprlParser.AnnotatedLambdaContext) {}
    
    override fun enterIndexingSuffix(ctx: AprlParser.IndexingSuffixContext) {}
    
    override fun enterNavigationSuffix(ctx: AprlParser.NavigationSuffixContext) {}
    
    override fun enterMemberAccessOperator(ctx: AprlParser.MemberAccessOperatorContext) {}
    
    override fun enterModifierList(ctx: AprlParser.ModifierListContext) {}
    
    override fun enterModifier(ctx: AprlParser.ModifierContext) {}
    
    override fun enterVisibilityModifier(ctx: AprlParser.VisibilityModifierContext) {}
    
    override fun enterInheritanceModifier(ctx: AprlParser.InheritanceModifierContext) {}
    
    override fun enterParameterModifier(ctx: AprlParser.ParameterModifierContext) {}
    
    override fun enterFunctionModifier(ctx: AprlParser.FunctionModifierContext) {}
    
    override fun enterAnnotations(ctx: AprlParser.AnnotationsContext) {}
    
    override fun enterAnnotation(ctx: AprlParser.AnnotationContext) {}
    
    override fun enterUnescapedAnnotation(ctx: AprlParser.UnescapedAnnotationContext) {}
    
    override fun enterIdentifier(ctx: AprlParser.IdentifierContext) {}
    
    override fun enterSimpleIdentifier(ctx: AprlParser.SimpleIdentifierContext) {}
    
    override fun enterSemi(ctx: AprlParser.SemiContext) {}
    
}