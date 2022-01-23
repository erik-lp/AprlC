package aprl.compiler.conversion

import aprl.*
import aprl.AprlParser
import aprl.compiler.*
import aprl.compiler.error.*
import aprl.compiler.psi.Position
import aprl.compiler.psi.aprl.*
import org.antlr.v4.runtime.ParserRuleContext
import java.io.File
import java.util.*

// TODO: syntactic/semantic warnings/errors can be thrown in this class, more specific ones later (when compiling to specific language)
class AprlConverter(val file: File) : AprlParserBaseVisitor<Token>() {
    
    private val warningCollector = ErrorCollector<SyntaxWarning>()
    private val errorCollector = ErrorCollector<SyntaxError>()
    
    @Suppress("FunctionName")
    private fun ERROR(token: ParserRuleContext, message: String) {
        val error = SyntaxError(file, token.position, message)
        errorCollector.collect(error)
    }
    
    @Suppress("FunctionName")
    private fun ERROR(token: Token, message: String) {
        val error = SyntaxError(file, token.position, message)
        errorCollector.collect(error)
    }
    
    @Suppress("FunctionName")
    private fun ERROR(position: Position, message: String) {
        val error = SyntaxError(file, position, message)
        errorCollector.collect(error)
    }
    
    @Suppress("FunctionName")
    private fun WARN(token: ParserRuleContext, message: String) = WARN(token.position, message)
    
    @Suppress("FunctionName")
    private fun WARN(token: Token, message: String) = WARN(token.position, message)
    
    @Suppress("FunctionName")
    private fun WARN(position: Position, message: String) {
        val warning = SyntaxWarning(file, position, message)
        warningCollector.collect(warning)
    }
    
    override fun visitAprlFile(ctx: AprlParser.AprlFileContext): AprlFile {
        val preamble = visitPreamble(ctx.preamble())
        val topLevelObjects = ctx.topLevelObject().map(::visitTopLevelObject)
        return AprlFile(file, preamble, topLevelObjects)
    }
    
    override fun visitPreamble(ctx: AprlParser.PreambleContext): Preamble {
        val namespace = visitNamespaceHeader(ctx.namespaceHeader())
        val imports = ctx.importList().importHeader().map(::visitImportHeader)
        return Preamble(ctx.position, namespace, imports)
    }
    
    override fun visitNamespaceHeader(ctx: AprlParser.NamespaceHeaderContext): NamespaceHeader {
        val identifier = visitIdentifier(ctx.identifier())
        if (!namespaceMatchesFileLocation(identifier)) {
            WARN(ctx, "Namespace does not match file location")
        }
        return NamespaceHeader(ctx.position, identifier)
    }
    
    private fun namespaceMatchesFileLocation(identifier: Identifier): Boolean {
        val simpleIdentifiers = identifier.identifiers.reversedMutable()
        val subFolders = LinkedList(file.path.split(File.separator).reversed()).also { it.pop() }
        return simpleIdentifiers.all { it.identifier == subFolders.pop() }
    }
    
    override fun visitImportHeader(ctx: AprlParser.ImportHeaderContext): ImportHeader {
        val importIdentifiers = ctx.importIdentifier().map(::visitImportIdentifier)
        return ImportHeader(ctx.position, importIdentifiers)
    }
    
    override fun visitImportIdentifier(ctx: AprlParser.ImportIdentifierContext): ImportIdentifier {
        val singleImport = ctx.singleImport()?.let(::visitSingleImport)
        val allImport = ctx.allImport()?.let(::visitAllImport)
        val multiImport = ctx.multiImport()?.let(::visitMultiImport)
        return ImportIdentifier(ctx.position, singleImport, allImport, multiImport)
    }
    
    override fun visitSingleImport(ctx: AprlParser.SingleImportContext): SingleImport {
        val identifier = visitIdentifier(ctx.identifier())
        val alias = ctx.simpleIdentifier()?.let(::visitSimpleIdentifier)
        return SingleImport(ctx.position, identifier, alias)
    }
    
    override fun visitTopLevelObject(ctx: AprlParser.TopLevelObjectContext): TopLevelObject {
        return ctx.classDeclaration()?.let(::visitClassDeclaration)
            ?: ctx.interfaceDeclaration()?.let(::visitInterfaceDeclaration)
            ?: ctx.annotationDeclaration()?.let(::visitAnnotationDeclaration)
            ?: ctx.documentDeclaration()?.let(::visitDocumentDeclaration)
            ?: ctx.structDeclaration()?.let(::visitStructDeclaration)
            ?: ctx.enumDeclaration()?.let(::visitEnumDeclaration)
            ?: ctx.extensionDeclaration()?.let(::visitExtensionDeclaration)
            ?: ctx.functionDeclaration()?.let(::visitFunctionDeclaration)
            ?: visitPropertyDeclaration(ctx.propertyDeclaration())
    }
    
    override fun visitClassDeclaration(ctx: AprlParser.ClassDeclarationContext): ClassDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val typeParameters = ctx.typeParameters()?.typeParameter()?.map(::visitTypeParameter)
        val primaryConstructor = ctx.primaryConstructor()?.let(::visitPrimaryConstructor)
        val delegationSpecifier = ctx.delegationSpecifiers()?.delegationSpecifier()?.map(::visitDelegationSpecifier) ?: emptyList()
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        val scope = Scope(members ?: listOf())
        checkModifiers(modifiers, Modifier.Target.CLASS)
        checkName(name, NamedType.CLASS)
        return ClassDeclaration(ctx.position, modifiers, name, typeParameters, primaryConstructor, delegationSpecifier, members)
    }
    
    private fun checkModifiers(modifiers: ModifierList, target: Modifier.Target) {
        modifiers.modifiers.forEachIndexed { i, it ->
            if (!it.applicable(target)) {
                ERROR(it, "Modifier '$it' is not applicable to $target")
            }
            if (target.implies(it)) {
                ERROR(it, "Redundant '$it' modifier")
            }
            modifiers.modifiers.subList(0, i).forEach { prev ->
                if (!it.compatible(prev)) {
                    ERROR(it, "Modifier '$it' is not compatible with '$prev'")
                    ERROR(prev, "Modifier '$prev' is not compatible with '$it'")
                }
            }
        }
        if (!modifiers.modifiers.contentEquals(modifiers.modifiers.sorted())) {
            WARN(modifiers, "Unconventional modifier order")
        }
    }
    
    private fun checkName(identifier: SimpleIdentifier, type: NamedType) {
        if (!identifier.identifier.matches(type.namingPattern)) {
            WARN(identifier, "$type name (${identifier.identifier}) does not follow naming conventions")
        }
    }
    
    override fun visitInterfaceDeclaration(ctx: AprlParser.InterfaceDeclarationContext): InterfaceDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        checkModifiers(modifiers, Modifier.Target.INTERFACE)
        checkName(name, NamedType.INTERFACE)
        val typeParameters = ctx.typeParameters()?.typeParameter()?.map(::visitTypeParameter)
        val delegationSpecifiers = ctx.interfaceDelegationSpecifiers()?.identifier()?.map(::visitIdentifier) ?: emptyList()
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        return InterfaceDeclaration(ctx.position, modifiers, name, typeParameters, delegationSpecifiers, members)
    }
    
    override fun visitAnnotationDeclaration(ctx: AprlParser.AnnotationDeclarationContext): AnnotationDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        checkModifiers(modifiers, Modifier.Target.INTERFACE)
        checkName(name, NamedType.ANNOTATION)
        val primaryConstructor = ctx.primaryConstructor()?.let(::visitPrimaryConstructor)
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        return AnnotationDeclaration(ctx.position, modifiers, name, primaryConstructor, members)
    }
    
    override fun visitDocumentDeclaration(ctx: AprlParser.DocumentDeclarationContext): DocumentDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val typeParameters = ctx.typeParameters()?.typeParameter()?.map(::visitTypeParameter)
        val primaryConstructor = visitPrimaryConstructor(ctx.primaryConstructor())
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        return DocumentDeclaration(ctx.position, modifiers, name, typeParameters, primaryConstructor, members)
    }
    
    override fun visitPrimaryConstructor(ctx: AprlParser.PrimaryConstructorContext): PrimaryConstructor {
        val modifiers = ctx.modifierList()?.let(::visitModifierList)
        val classParameters = ctx.classParameters().classParameter().map(::visitClassParameter)
        return PrimaryConstructor(ctx.position, modifiers, classParameters)
    }
    
    override fun visitClassParameter(ctx: AprlParser.ClassParameterContext): ClassParameter {
        val modifiers = visitModifierList(ctx.modifierList())
        val final = ctx.valOrVar()?.VAL() != null
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val type = visitType(ctx.type())
        val default = ctx.expression()?.let(::visitExpression)
        return ClassParameter(ctx.position, modifiers, final, name, type, default)
    }
    
    override fun visitDelegationSpecifier(ctx: AprlParser.DelegationSpecifierContext): DelegationSpecifier {
        val identifier = visitIdentifier(ctx.identifier())
        val typeArguments = ctx.typeArguments()?.typeProjection()?.map(::visitTypeProjection)
        val valueArguments = ctx.valueArguments()?.valueArgument()?.map(::visitValueArgument)
        return DelegationSpecifier(ctx.position, identifier, typeArguments, valueArguments)
    }
    
    override fun visitValueArgument(ctx: AprlParser.ValueArgumentContext): ValueArgument {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val expression = visitExpression(ctx.expression())
        return ValueArgument(ctx.position, annotations, expression)
    }
    
    override fun visitSecondaryConstructor(ctx: AprlParser.SecondaryConstructorContext): SecondaryConstructor {
        val modifiers = visitModifierList(ctx.modifierList())
        val functionValueParameters = ctx.functionValueParameters().functionValueParameter().map(::visitFunctionValueParameter)
        val constructorDelegationCall = ctx.constructorDelegationCall()?.let(::visitConstructorDelegationCall)
        val block = ctx.block()?.let(::visitBlock)
        return SecondaryConstructor(ctx.position, modifiers, functionValueParameters, constructorDelegationCall, block)
    }
    
    override fun visitConstructorDelegationCall(ctx: AprlParser.ConstructorDelegationCallContext): ConstructorDelegationCall {
        val isSuper = ctx.SUPER() != null
        val valueArguments = ctx.valueArguments().valueArgument().map(::visitValueArgument)
        return ConstructorDelegationCall(ctx.position, isSuper, valueArguments)
    }
    
    override fun visitClassMember(ctx: AprlParser.ClassMemberContext): ClassMember {
        return ctx.topLevelObject()?.let(::visitTopLevelObject)
            ?: ctx.secondaryConstructor()?.let(::visitSecondaryConstructor)
            ?: ctx.loadScript()?.let(::visitLoadScript)
            ?: ctx.initializerBody()?.let(::visitInitializerBody)
            ?: visitPartnerDeclaration(ctx.partnerDeclaration())
    }
    
    override fun visitLoadScript(ctx: AprlParser.LoadScriptContext): LoadScript {
        val block = visitBlock(ctx.block())
        return LoadScript(ctx.position, block)
    }
    
    override fun visitInitializerBody(ctx: AprlParser.InitializerBodyContext): InitializerBody {
        val block = visitBlock(ctx.block())
        return InitializerBody(ctx.position, block)
    }
    
    override fun visitPartnerDeclaration(ctx: AprlParser.PartnerDeclarationContext): PartnerDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        return PartnerDeclaration(ctx.position, modifiers, members)
    }
    
    override fun visitTypeProjection(ctx: AprlParser.TypeProjectionContext): TypeProjection {
        val typeProjectionModifierList = ctx.typeProjectionModifierList()?.let(::visitTypeProjectionModifierList)
        val type = ctx.type()?.let(::visitType)
        val wildcard = type == null
        return TypeProjection(ctx.position, wildcard, typeProjectionModifierList, type)
    }
    
    override fun visitTypeProjectionModifierList(ctx: AprlParser.TypeProjectionModifierListContext): TypeProjectionModifierList {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val typeProjectionModifier = ctx.typeProjectionModifier()?.let(::visitTypeProjectionModifier)
        return TypeProjectionModifierList(ctx.position, annotations, typeProjectionModifier)
    }
    
    override fun visitTypeProjectionModifier(ctx: AprlParser.TypeProjectionModifierContext): TypeProjectionModifier {
        val modifier = if (ctx.varianceModifier().SUB_() != null) {
            TypeProjectionModifier.RawTypeProjectionModifier.SUB
        } else {
            TypeProjectionModifier.RawTypeProjectionModifier.SUPER
        }
        return TypeProjectionModifier(ctx.position, modifier)
    }
    
    override fun visitTypeParameter(ctx: AprlParser.TypeParameterContext): TypeParameter {
        val typeParameterModifierList = visitTypeParameterModifierList(ctx.typeParameterModifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val types = ctx.type()?.map(::visitType)
        return TypeParameter(ctx.position, typeParameterModifierList, name, types)
    }
    
    override fun visitTypeParameterModifierList(ctx: AprlParser.TypeParameterModifierListContext): TypeParameterModifierList {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val typeParameterModifier = ctx.typeParameterModifier()?.let(::visitTypeParameterModifier)
        return TypeParameterModifierList(ctx.position, annotations, typeParameterModifier)
    }
    
    override fun visitTypeParameterModifier(ctx: AprlParser.TypeParameterModifierContext): TypeParameterModifier {
        val modifier = if (ctx.reificationModifier() != null) {
            TypeParameterModifier.RawTypeParameterModifier.ACTUAL
        } else if (ctx.varianceModifier().SUB_() != null) {
            TypeParameterModifier.RawTypeParameterModifier.SUB
        } else {
            TypeParameterModifier.RawTypeParameterModifier.SUPER
        }
        return TypeParameterModifier(ctx.position, modifier)
    }
    
    override fun visitType(ctx: AprlParser.TypeContext): TypeReference {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val functionType = ctx.functionType()?.let(::visitFunctionType)
        val parenthesizedType = ctx.parenthesizedType()?.type()?.let(::visitType)
        val arrayType = ctx.arrayType()?.let(::visitArrayType)
        val nullableType = ctx.nullableType()?.let(::visitNullableType)
        val identifier = ctx.identifier()?.let { visitIdentifier(it) to ctx.typeArguments()?.typeProjection()?.map(::visitTypeProjection) }
        return TypeReference(ctx.position, annotations, functionType, parenthesizedType, arrayType, nullableType, identifier)
    }
    
    override fun visitFunctionType(ctx: AprlParser.FunctionTypeContext): FunctionType {
        val functionTypeParameters = ctx.functionTypeParameters().type().map(::visitType)
        val type = visitType(ctx.type())
        return FunctionType(ctx.position, functionTypeParameters, type)
    }
    
    override fun visitReceiverType(ctx: AprlParser.ReceiverTypeContext): ReceiverType {
        val parenthesizedType = ctx.parenthesizedType()?.type()?.let(::visitType)
        val nullableType = ctx.nullableType()?.let(::visitNullableType)
        val identifier = ctx.identifier()?.let(::visitIdentifier)
        return ReceiverType(ctx.position, parenthesizedType, nullableType, identifier)
    }
    
    override fun visitArrayType(ctx: AprlParser.ArrayTypeContext): ArrayType {
        val type = visitType(ctx.type())
        return ArrayType(ctx.position, type)
    }
    
    override fun visitNullableType(ctx: AprlParser.NullableTypeContext): NullableType {
        val identifier = ctx.identifier()?.let { visitIdentifier(it) to ctx.typeArguments()?.typeProjection()?.map(::visitTypeProjection) }
        val parenthesizedType = ctx.parenthesizedType()?.type()?.let(::visitType)
        val arrayType = ctx.arrayType()?.let(::visitArrayType)
        return NullableType(ctx.position, identifier, parenthesizedType, arrayType)
    }
    
    override fun visitStructDeclaration(ctx: AprlParser.StructDeclarationContext): StructDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val delegationSpecifiers = ctx.delegationSpecifiers()?.delegationSpecifier()?.map(::visitDelegationSpecifier) ?: emptyList()
        val members = ctx.structBody()?.structMember()?.map(::visitStructMember)
        return StructDeclaration(ctx.position, modifiers, name, delegationSpecifiers, members)
    }
    
    override fun visitStructMember(ctx: AprlParser.StructMemberContext): StructMember {
        return ctx.topLevelObject()?.let(::visitTopLevelObject)
            ?: ctx.loadScript()?.let(::visitLoadScript)
            ?: visitInitializerBody(ctx.initializerBody())
    }
    
    override fun visitEnumDeclaration(ctx: AprlParser.EnumDeclarationContext): EnumDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val primaryConstructor = ctx.primaryConstructor()?.let(::visitPrimaryConstructor)
        val enumBody = visitEnumBody(ctx.enumBody())
        return EnumDeclaration(ctx.position, modifiers, name, primaryConstructor, enumBody)
    }
    
    override fun visitEnumBody(ctx: AprlParser.EnumBodyContext): EnumBody {
        val entries = ctx.enumEntries().enumEntry().map(::visitEnumEntry)
        val members = ctx.classMember()?.map(::visitClassMember)
        return EnumBody(ctx.position, entries, members)
    }
    
    override fun visitEnumEntry(ctx: AprlParser.EnumEntryContext): EnumEntry {
        val modifiers = visitModifierList(ctx.modifierList())
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val valueArguments = ctx.valueArguments()?.valueArgument()?.map(::visitValueArgument)
        val members = ctx.classBody()?.classMember()?.map(::visitClassMember)
        return EnumEntry(ctx.position, modifiers, name, valueArguments, members)
    }
    
    override fun visitExtensionDeclaration(ctx: AprlParser.ExtensionDeclarationContext): ExtensionDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val typeParameters = ctx.typeParameters()?.typeParameter()?.map(::visitTypeParameter)
        val receiverType = visitReceiverType(ctx.receiverType())
        val extensionMembers = ctx.extensionBody()?.extensionMember()?.map(::visitExtensionMember)
        return ExtensionDeclaration(ctx.position, modifiers, typeParameters, receiverType, extensionMembers)
    }
    
    override fun visitExtensionMember(ctx: AprlParser.ExtensionMemberContext): ExtensionMember {
        val function = visitFunctionDeclaration(ctx.functionDeclaration())
        return ExtensionMember(ctx.position, function)
    }
    
    override fun visitPropertyDeclaration(ctx: AprlParser.PropertyDeclarationContext): PropertyDeclaration {
        val modifiers = visitModifierList(ctx.modifierList())
        val static = ctx.DEF() != null || ctx.CONST() != null
        val final = ctx.CONST() != null || ctx.VAL() != null
        val variableDeclaration = visitVariableDeclaration(ctx.variableDeclaration())
        val expression = ctx.expression()?.let(::visitExpression)
        val propertyBody = ctx.propertyBody()?.let(::visitPropertyBody)
        return PropertyDeclaration(ctx.position, modifiers, static, final, variableDeclaration, expression, propertyBody)
    }
    
    override fun visitVariableDeclaration(ctx: AprlParser.VariableDeclarationContext): VariableDeclaration {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val type = ctx.type()?.let(::visitType)
        return VariableDeclaration(ctx.position, annotations, name, type)
    }
    
    override fun visitPropertyBody(ctx: AprlParser.PropertyBodyContext): PropertyBody {
        val getters = ctx.getter().map(::visitGetter)
        val setters = ctx.setter().map(::visitSetter)
        return PropertyBody(ctx.position, getters, setters)
    }
    
    override fun visitGetter(ctx: AprlParser.GetterContext): Getter {
        val modifiers = visitModifierList(ctx.modifierList())
        val returnType = ctx.type()?.let(::visitType)
        val body = ctx.functionBody()?.let(::visitFunctionBody)
        return Getter(ctx.position, modifiers, returnType, body)
    }
    
    override fun visitSetter(ctx: AprlParser.SetterContext): Setter {
        val modifiers = visitModifierList(ctx.modifierList())
        val parameter = ctx.functionValueParameterWithOptionalType()?.let(::visitFunctionValueParameterWithOptionalType)
        val returnType = ctx.type()?.let(::visitType)
        val body = ctx.functionBody()?.let(::visitFunctionBody)
        return Setter(ctx.position, modifiers, parameter, returnType, body)
    }
    
    override fun visitFunctionValueParameterWithOptionalType(ctx: AprlParser.FunctionValueParameterWithOptionalTypeContext): FunctionValueParameterWithOptionalType {
        val modifiers = visitModifierList(ctx.modifierList())
        val parameterWithOptionalType = visitParameterWithOptionalType(ctx.parameterWithOptionalType())
        return FunctionValueParameterWithOptionalType(ctx.position, modifiers, parameterWithOptionalType)
    }
    
    override fun visitParameterWithOptionalType(ctx: AprlParser.ParameterWithOptionalTypeContext): ParameterWithOptionalType {
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val type = ctx.type()?.let(::visitType)
        return ParameterWithOptionalType(ctx.position, name, type)
    }
    
    override fun visitFunctionDeclaration(ctx: AprlParser.FunctionDeclarationContext): FunctionDeclaration {
        val modifiers: ModifierList = visitModifierList(ctx.modifierList())
        checkModifiers(modifiers, Modifier.Target.FUNCTION)
        val static = ctx.SCRIPT() != null
        val operator = ctx.OPERATOR() != null
        val typeParameters = ctx.typeParameters()?.typeParameter()?.map(::visitTypeParameter) ?: emptyList()
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        checkName(name, NamedType.FUNCTION)
        val parameters = ctx.functionValueParameters().functionValueParameter().map(::visitFunctionValueParameter)
        val returnType = ctx.type()?.let(::visitType)
        val body = ctx.functionBody()?.let(::visitFunctionBody)
        return FunctionDeclaration(file, ctx.position, modifiers, static, operator, typeParameters, name, parameters, returnType, body)
    }
    
    override fun visitFunctionValueParameter(ctx: AprlParser.FunctionValueParameterContext): FunctionValueParameter {
        val modifiers = visitModifierList(ctx.modifierList())
        val parameter = visitParameter(ctx.parameter())
        val expression = ctx.expression()?.let(::visitExpression)
        return FunctionValueParameter(ctx.position, modifiers, parameter, expression)
    }
    
    override fun visitParameter(ctx: AprlParser.ParameterContext): Parameter {
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val type = visitType(ctx.type())
        return Parameter(ctx.position, name, type)
    }
    
    override fun visitFunctionBody(ctx: AprlParser.FunctionBodyContext): FunctionBody {
        val block = ctx.block()?.let(::visitBlock)
        val expression = ctx.expression()?.let(::visitExpression)
        return FunctionBody(ctx.position, block, expression)
    }
    
    override fun visitBlock(ctx: AprlParser.BlockContext): Block {
        val statements = ctx.statements().statement().map(::visitStatement)
        return Block(ctx.position, statements)
    }
    
    override fun visitStatement(ctx: AprlParser.StatementContext): Statement {
        val localVariableDeclaration = ctx.localVariableDeclaration()?.let(::visitLocalVariableDeclaration)
        val assignment = ctx.assignment()?.let(::visitAssignment)
        val loopStatement = ctx.loopStatement()?.let(::visitLoopStatement)
        val expression = ctx.expression()?.let(::visitExpression)
        return Statement(ctx.position, localVariableDeclaration, assignment, loopStatement, expression)
    }
    
    override fun visitLocalVariableDeclaration(ctx: AprlParser.LocalVariableDeclarationContext): LocalVariableDeclaration {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val static = ctx.DEF() != null || ctx.CONST() != null
        val final = ctx.CONST() != null || ctx.VAL() != null
        val variableDeclaration = visitVariableDeclaration(ctx.variableDeclaration())
        val expression = ctx.expression()?.let(::visitExpression)
        return LocalVariableDeclaration(ctx.position, annotations, static, final, variableDeclaration, expression)
    }
    
    override fun visitLoopStatement(ctx: AprlParser.LoopStatementContext): LoopStatement {
        return ctx.forStatement()?.let(::visitForStatement)
            ?: visitWhileStatement(ctx.whileStatement())
    }
    
    override fun visitForStatement(ctx: AprlParser.ForStatementContext): ForStatement {
        val iteratorAnnotations = ctx.annotations().annotation().map(::visitAnnotation)
        val iterator = visitVariableDeclaration(ctx.variableDeclaration())
        val expression = visitExpression(ctx.expression())
        val block = visitBlock(ctx.block())
        return ForStatement(ctx.position, iteratorAnnotations, iterator, expression, block)
    }
    
    override fun visitWhileStatement(ctx: AprlParser.WhileStatementContext): WhileStatement {
        val condition = visitExpression(ctx.expression())
        val block = visitBlock(ctx.block())
        return WhileStatement(ctx.position, condition, block)
    }
    
    override fun visitAssignment(ctx: AprlParser.AssignmentContext): Assignment {
        val assignableExpression = visitAssignableExpression(ctx.assignableExpression())
        val operator = convertAssignmentOperator(ctx.assignmentOperator())
        val expression = visitExpression(ctx.expression())
        return Assignment(ctx.position, assignableExpression, operator, expression)
    }
    
    private fun convertAssignmentOperator(ctx: AprlParser.AssignmentOperatorContext): Assignment.Operator {
        return ctx.ASSIGN()?.let { Assignment.Operator.ASSIGN }
            ?: ctx.DEFINE()?.let { Assignment.Operator.DEFINE }
            ?: ctx.ADD_ASSIGN()?.let { Assignment.Operator.ADD_ASSIGN }
            ?: ctx.SUB_ASSIGN()?.let { Assignment.Operator.SUB_ASSIGN }
            ?: ctx.MUL_ASSIGN()?.let { Assignment.Operator.MUL_ASSIGN }
            ?: ctx.DIV_ASSIGN()?.let { Assignment.Operator.DIV_ASSIGN }
            ?: ctx.MOD_ASSIGN()?.let { Assignment.Operator.MOD_ASSIGN }
            ?: ctx.EXP_ASSIGN()?.let { Assignment.Operator.EXP_ASSIGN }
            ?: ctx.CONJ_ASSIGN()?.let { Assignment.Operator.CONJ_ASSIGN }
            ?: ctx.DISJ_ASSIGN()?.let { Assignment.Operator.DISJ_ASSIGN }
            ?: ctx.XOR_ASSIGN()?.let { Assignment.Operator.XOR_ASSIGN }
            ?: Assignment.Operator.ELVIS_ASSIGN
    }
    
    override fun visitExpression(ctx: AprlParser.ExpressionContext): Expression {
        val disjunction = visitDisjunction(ctx.disjunction())
        return Expression(ctx.position, disjunction)
    }
    
    override fun visitDisjunction(ctx: AprlParser.DisjunctionContext): Disjunction {
        val conjunctions = ctx.conjunction().map(::visitConjunction)
        return Disjunction(ctx.position, conjunctions)
    }
    
    override fun visitConjunction(ctx: AprlParser.ConjunctionContext): Conjunction {
        val equalityComparisons = ctx.equalityComparison().map(::visitEqualityComparison)
        return Conjunction(ctx.position, equalityComparisons)
    }
    
    override fun visitEqualityComparison(ctx: AprlParser.EqualityComparisonContext): EqualityComparison {
        val identityComparisons = ctx.identityComparison().map(::visitIdentityComparison)
        return EqualityComparison(ctx.position, identityComparisons)
    }
    
    override fun visitIdentityComparison(ctx: AprlParser.IdentityComparisonContext): IdentityComparison {
        val comparisons = ctx.comparison().map(::visitComparison)
        return IdentityComparison(ctx.position, comparisons)
    }
    
    override fun visitComparison(ctx: AprlParser.ComparisonContext): Comparison {
        val firstNamedInfix = visitNamedInfixExpression(ctx.namedInfixExpression(0))
        val operators = ctx.comparisonOperator().map(::convertComparisonOperator)
        val namedInfixes = operators.zip(ctx.namedInfixExpression().drop(1).map(::visitNamedInfixExpression))
        return Comparison(ctx.position, firstNamedInfix, namedInfixes)
    }
    
    private fun convertComparisonOperator(ctx: AprlParser.ComparisonOperatorContext): Comparison.Operator {
        return ctx.LANGLE()?.let { Comparison.Operator.LANGLE }
            ?: ctx.NGEQ()?.let { Comparison.Operator.NGEQ }
            ?: ctx.RANGLE()?.let { Comparison.Operator.RANGLE }
            ?: ctx.NLEQ()?.let { Comparison.Operator.NLEQ }
            ?: ctx.LEQ()?.let { Comparison.Operator.LEQ }
            ?: ctx.NRANGLE()?.let { Comparison.Operator.NRANGLE }
            ?: ctx.GEQ()?.let { Comparison.Operator.GEQ }
            ?: Comparison.Operator.NLANGLE
    }
    
    override fun visitNamedInfixExpression(ctx: AprlParser.NamedInfixExpressionContext): NamedInfixExpression {
        val elvisExpression = visitElvisExpression(ctx.elvisExpression())
        val namedInfixes = ctx.namedInfix().map(::visitNamedInfix)
        return NamedInfixExpression(ctx.position, elvisExpression, namedInfixes)
    }
    
    override fun visitNamedInfix(ctx: AprlParser.NamedInfixContext): NamedInfix {
        val inExpression = ctx.inOperator()?.let { (it.IN() != null) to visitElvisExpression(ctx.elvisExpression()) }
        val isExpression = ctx.isOperator?.let { (it.IS() != null) to visitType(ctx.type()) }
        return NamedInfix(ctx.position, inExpression, isExpression)
    }
    
    override fun visitElvisExpression(ctx: AprlParser.ElvisExpressionContext): ElvisExpression {
        val infixFunctionCalls = ctx.infixFunctionCall().map(::visitInfixFunctionCall)
        return ElvisExpression(ctx.position, infixFunctionCalls)
    }
    
    override fun visitInfixFunctionCall(ctx: AprlParser.InfixFunctionCallContext): InfixFunctionCall {
        val firstRangeExpression = visitRangeExpression(ctx.rangeExpression(0))
        val functions = ctx.simpleIdentifier().map(::visitSimpleIdentifier)
        val rangeExpressions = functions.zip(ctx.rangeExpression().drop(1).map(::visitRangeExpression))
        return InfixFunctionCall(ctx.position, firstRangeExpression, rangeExpressions)
    }
    
    override fun visitRangeExpression(ctx: AprlParser.RangeExpressionContext): RangeExpression {
        val from = visitXorExpression(ctx.xorExpression(0))
        val operator = ctx.toOperator()?.let {
            it.TO()?.let { RangeExpression.Operator.TO }
                ?: it.DOWNTO()?.let { RangeExpression.Operator.DOWNTO }
                ?: RangeExpression.Operator.UNTIL
        }
        val to = ctx.xorExpression(1)?.let(::visitXorExpression)
        return RangeExpression(ctx.position, from, operator, to)
    }
    
    override fun visitXorExpression(ctx: AprlParser.XorExpressionContext): XorExpression {
        val additiveExpressions = ctx.additiveExpression().map(::visitAdditiveExpression)
        return XorExpression(ctx.position, additiveExpressions)
    }
    
    override fun visitAdditiveExpression(ctx: AprlParser.AdditiveExpressionContext): AdditiveExpression {
        val firstMultiplicativeExpression = visitMultiplicativeExpression(ctx.multiplicativeExpression(0))
        val operators = ctx.additiveOperator().map {
            it.ADD()?.let { AdditiveExpression.Operator.ADD }
                ?: AdditiveExpression.Operator.SUB
        }
        val multiplicativeExpressions = operators.zip(ctx.multiplicativeExpression().drop(0).map(::visitMultiplicativeExpression))
        return AdditiveExpression(ctx.position, firstMultiplicativeExpression, multiplicativeExpressions)
    }
    
    override fun visitMultiplicativeExpression(ctx: AprlParser.MultiplicativeExpressionContext): MultiplicativeExpression {
        val firstExponentialExpression = visitExponentialExpression(ctx.exponentialExpression(0))
        val operators = ctx.multiplicativeOperator().map {
            it.MUL()?.let { MultiplicativeExpression.Operator.MUL }
                ?: it.DIV()?.let { MultiplicativeExpression.Operator.DIV }
                ?: MultiplicativeExpression.Operator.MOD
        }
        val exponentialExpressions = operators.zip(ctx.exponentialExpression().drop(0).map(::visitExponentialExpression))
        return MultiplicativeExpression(ctx.position, firstExponentialExpression, exponentialExpressions)
    }
    
    override fun visitExponentialExpression(ctx: AprlParser.ExponentialExpressionContext): ExponentialExpression {
        val asExpressions = ctx.asExpression().map(::visitAsExpression)
        return ExponentialExpression(ctx.position, asExpressions)
    }
    
    override fun visitAsExpression(ctx: AprlParser.AsExpressionContext): AsExpression {
        val prefixUnaryExpression = visitPrefixUnaryExpression(ctx.prefixUnaryExpression())
        val operator = ctx.asOperator()?.let {
            it.AS()?.let { AsExpression.Operator.AS }
                ?: AsExpression.Operator.AS_QUEST
        }
        val type = ctx.type()?.let(::visitType)
        return AsExpression(ctx.position, prefixUnaryExpression, operator, type)
    }
    
    override fun visitPrefixUnaryExpression(ctx: AprlParser.PrefixUnaryExpressionContext): PrefixUnaryExpression {
        val unaryPrefixes = ctx.unaryPrefix().map(::visitUnaryPrefix)
        val postfixUnaryExpression = visitPostfixUnaryExpression(ctx.postfixUnaryExpression())
        return PrefixUnaryExpression(ctx.position, unaryPrefixes, postfixUnaryExpression)
    }
    
    override fun visitPostfixUnaryExpression(ctx: AprlParser.PostfixUnaryExpressionContext): PostfixUnaryExpression {
        val atomicExpression = visitAtomicExpression(ctx.atomicExpression())
        val unaryPostfixes = ctx.unaryPostfix().map(::visitUnaryPostfix)
        return PostfixUnaryExpression(ctx.position, atomicExpression, unaryPostfixes)
    }
    
    override fun visitAtomicExpression(ctx: AprlParser.AtomicExpressionContext): AtomicExpression {
        val identifier = ctx.identifier()?.let(::visitIdentifier)
        val literalConstant = ctx.literalConstant()?.let(::visitLiteralConstant)
        val contextualReference = ctx.contextualReference()?.let(::visitContextualReference)
        val callableReference = ctx.callableReference()?.let(::visitCallableReference)
        val lambdaLiteral = ctx.lambdaLiteral()?.let(::visitLambdaLiteral)
        val collectionLiteral = ctx.collectionLiteral()?.let(::visitCollectionLiteral)
        val thisExpression = ctx.thisExpression()?.let(::visitThisExpression)
        val superExpression = ctx.superExpression()?.let(::visitSuperExpression)
        val conditionalExpression = ctx.conditionalExpression()?.let(::visitConditionalExpression)
        val optionalTryExpression = ctx.optionalTryExpression()?.let(::visitOptionalTryExpression)
        val tryExpression = ctx.tryExpression()?.let(::visitTryExpression)
        val jumpExpression = ctx.jumpExpression()?.let(::visitJumpExpression)
        return AtomicExpression(ctx.position, identifier, literalConstant, contextualReference, callableReference, lambdaLiteral, collectionLiteral, thisExpression, superExpression, conditionalExpression, optionalTryExpression, tryExpression, jumpExpression)
    }
    
    override fun visitParenthesizedExpression(ctx: AprlParser.ParenthesizedExpressionContext): Expression {
        return visitExpression(ctx.expression())
    }
    
    override fun visitContextualReference(ctx: AprlParser.ContextualReferenceContext): Identifier {
        return visitIdentifier(ctx.identifier())
    }
    
    override fun visitCallableReference(ctx: AprlParser.CallableReferenceContext): CallableReference {
        val receiverType = visitReceiverType(ctx.receiverType())
        val reference = visitSimpleIdentifier(ctx.simpleIdentifier())
        return CallableReference(ctx.position, receiverType, reference)
    }
    
    override fun visitCollectionLiteral(ctx: AprlParser.CollectionLiteralContext): CollectionLiteral {
        val expressions = ctx.expression()?.map(::visitExpression) ?: emptyList()
        return CollectionLiteral(ctx.position, expressions)
    }
    
    override fun visitThisExpression(ctx: AprlParser.ThisExpressionContext): ThisExpression {
        return ThisExpression(ctx.position)
    }
    
    override fun visitSuperExpression(ctx: AprlParser.SuperExpressionContext): SuperExpression {
        return SuperExpression(ctx.position)
    }
    
    override fun visitConditionalExpression(ctx: AprlParser.ConditionalExpressionContext): ConditionalExpression {
        return ctx.ifExpression()?.let(::visitIfExpression) ?: visitMatchExpression(ctx.matchExpression())
    }
    
    override fun visitIfExpression(ctx: AprlParser.IfExpressionContext): IfExpression {
        val unless = ctx.UNLESS() != null
        val expression = visitExpression(ctx.expression())
        val block = visitBlock(ctx.block(0))
        val elsifExpressions = ctx.elsifExpression()?.map(::visitElsifExpression) ?: emptyList()
        val elseBlock = ctx.block(1)?.let(::visitBlock)
        return IfExpression(ctx.position, unless, expression, block, elsifExpressions, elseBlock)
    }
    
    override fun visitElsifExpression(ctx: AprlParser.ElsifExpressionContext): ElsifExpression {
        val expression = visitExpression(ctx.expression())
        val block = visitBlock(ctx.block())
        return ElsifExpression(ctx.position, expression, block)
    }
    
    override fun visitMatchExpression(ctx: AprlParser.MatchExpressionContext): MatchExpression {
        val expression = visitExpression(ctx.expression())
        val matchEntries = ctx.matchEntry().map(::visitMatchEntry)
        return MatchExpression(ctx.position, expression, matchEntries)
    }
    
    override fun visitMatchEntry(ctx: AprlParser.MatchEntryContext): MatchEntry {
        val constants = ctx.literalConstant().map(::visitLiteralConstant)
        val block = visitBlock(ctx.block())
        return MatchEntry(ctx.position, constants, block)
    }
    
    override fun visitOptionalTryExpression(ctx: AprlParser.OptionalTryExpressionContext): OptionalTryExpression {
        val block = ctx.block()?.let(::visitBlock)
        val expression = ctx.expression()?.let(::visitExpression)
        return OptionalTryExpression(ctx.position, block, expression)
    }
    
    override fun visitTryExpression(ctx: AprlParser.TryExpressionContext): TryExpression {
        val block = visitBlock(ctx.block())
        val catchBlocks = ctx.catchBlock().map(::visitCatchBlock)
        val finallyBlock = ctx.finallyBlock()?.block()?.let(::visitBlock)
        return TryExpression(ctx.position, block, catchBlocks, finallyBlock)
    }
    
    override fun visitCatchBlock(ctx: AprlParser.CatchBlockContext): CatchBlock {
        val caughtException = ctx.caughtException()?.let(::visitCaughtException)
        val block = visitBlock(ctx.block())
        return CatchBlock(ctx.position, caughtException, block)
    }
    
    override fun visitFinallyBlock(ctx: AprlParser.FinallyBlockContext): Block {
        return visitBlock(ctx.block())
    }
    
    override fun visitJumpExpression(ctx: AprlParser.JumpExpressionContext): JumpExpression {
        return ctx.triggerExpression()?.let(::visitTriggerExpression)
            ?: ctx.returnExpression()?.let(::visitReturnExpression)
            ?: ctx.continueExpression()?.let(::visitContinueExpression)
            ?: visitBreakExpression(ctx.breakExpression())
    }
    
    override fun visitTriggerExpression(ctx: AprlParser.TriggerExpressionContext): TriggerExpression {
        val expression = visitExpression(ctx.expression())
        return TriggerExpression(ctx.position, expression)
    }
    
    override fun visitReturnExpression(ctx: AprlParser.ReturnExpressionContext): ReturnExpression {
        val expression = ctx.expression()?.let(::visitExpression)
        return ReturnExpression(ctx.position, expression)
    }
    
    override fun visitContinueExpression(ctx: AprlParser.ContinueExpressionContext): ContinueExpression {
        return ContinueExpression(ctx.position)
    }
    
    override fun visitBreakExpression(ctx: AprlParser.BreakExpressionContext): BreakExpression {
        return BreakExpression(ctx.position)
    }
    
    override fun visitLiteralConstant(ctx: AprlParser.LiteralConstantContext): LiteralConstant<*> {
        return ctx.nullLiteral()?.let(::visitNullLiteral)
            ?: ctx.boolLiteral()?.let(::visitBoolLiteral)
            ?: ctx.integerLiteral()?.let(::visitIntegerLiteral)
            ?: ctx.longLiteral()?.let(::visitLongLiteral)
            ?: ctx.shortLiteral()?.let(::visitShortLiteral)
            ?: ctx.byteLiteral()?.let(::visitByteLiteral)
            ?: ctx.floatLiteral()?.let(::visitFloatLiteral)
            ?: ctx.doubleLiteral()?.let(::visitDoubleLiteral)
            ?: ctx.complexLiteral()?.let(::visitComplexLiteral)
            ?: ctx.characterLiteral()?.let(::visitCharacterLiteral)
            ?: visitStringLiteral(ctx.stringLiteral())
    }
    
    override fun visitNullLiteral(ctx: AprlParser.NullLiteralContext): NullLiteral {
        return NullLiteral(ctx.position)
    }
    
    override fun visitBoolLiteral(ctx: AprlParser.BoolLiteralContext): BoolLiteral {
        val bool = ctx.TRUE() != null
        return BoolLiteral(ctx.position, bool)
    }
    
    override fun visitIntegerLiteral(ctx: AprlParser.IntegerLiteralContext): IntegerLiteral {
        val value = ctx.text.decodeWholeNumber().let {
            if (it > BigInteger(Int.MAX_VALUE)) {
                ERROR(ctx, "Int literal too big")
            } else if (it < BigInteger(Int.MIN_VALUE)) {
                ERROR(ctx, "Int literal too small")
            }
            it.toInt()
        }
        return IntegerLiteral(ctx.position, value)
    }
    
    override fun visitLongLiteral(ctx: AprlParser.LongLiteralContext): LongLiteral {
        val value = ctx.text.removeSuffix("L").removeSuffix("l").decodeWholeNumber().let {
            if (it > BigInteger(Long.MAX_VALUE)) {
                 ERROR(ctx, "Long literal too big")
            } else if (it < BigInteger(Long.MIN_VALUE)) {
                 ERROR(ctx, "Long literal too small")
            }
            it.toLong()
        }
        return LongLiteral(ctx.position, value)
    }
    
    override fun visitShortLiteral(ctx: AprlParser.ShortLiteralContext): ShortLiteral {
        val value = ctx.text.removeSuffix("S").removeSuffix("s").decodeWholeNumber().let {
            if (it > BigInteger(Short.MAX_VALUE)) {
                 ERROR(ctx, "Short literal too big")
            } else if (it < BigInteger(Short.MIN_VALUE)) {
                 ERROR(ctx, "Short literal too small")
            }
            it.toShort()
        }
        return ShortLiteral(ctx.position, value)
    }
    
    override fun visitByteLiteral(ctx: AprlParser.ByteLiteralContext): ByteLiteral {
        val value = ctx.text.removeSuffix("B").removeSuffix("b").decodeWholeNumber().let {
            if (it > BigInteger(Byte.MAX_VALUE)) {
                 ERROR(ctx, "Byte literal too big")
            } else if (it < BigInteger(Byte.MIN_VALUE)) {
                 ERROR(ctx, "Byte literal too small")
            }
            it.toByte()
        }
        return ByteLiteral(ctx.position, value)
    }
    
    override fun visitFloatLiteral(ctx: AprlParser.FloatLiteralContext): FloatLiteral {
        val value = ctx.text.removeSuffix("f").removeSuffix("F").decodeDecimalNumber().let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                 ERROR(ctx, "Float literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                 ERROR(ctx, "Float literal too small")
            }
            it.toFloat()
        }
        return FloatLiteral(ctx.position, value)
    }
    
    override fun visitDoubleLiteral(ctx: AprlParser.DoubleLiteralContext): DoubleLiteral {
        val value = ctx.text.removeSuffix("d").removeSuffix("D").decodeDecimalNumber().let {
            if (it > BigDecimal(Float.MAX_VALUE.toDouble())) {
                 ERROR(ctx, "Double literal too big")
            } else if (it < BigDecimal(Float.MIN_VALUE.toDouble())) {
                 ERROR(ctx, "Double literal too small")
            }
            it.toDouble()
        }
        return DoubleLiteral(ctx.position, value)
    }
    
    override fun visitComplexLiteral(ctx: AprlParser.ComplexLiteralContext): ComplexLiteral {
        val value = ctx.text.decodeComplexNumber().apply {
            if (getReal() > BigDecimal(Double.MAX_VALUE)) {
                 ERROR(ctx, "Complex real part too big")
            } else if (getReal() < BigDecimal(Double.MIN_VALUE)) {
                 ERROR(ctx, "Complex real part too small")
            }
            if (getImaginary() > BigDecimal(Double.MAX_VALUE)) {
                 ERROR(ctx, "Complex imaginary part too big")
            } else if (getImaginary() < BigDecimal(Double.MIN_VALUE)) {
                 ERROR(ctx, "Complex imaginary part too small")
            }
        }
        return ComplexLiteral(ctx.position, value)
    }
    
    override fun visitCharacterLiteral(ctx: AprlParser.CharacterLiteralContext): CharacterLiteral {
        val value = ctx.text[1]
        return CharacterLiteral(ctx.position, value)
    }
    
    override fun visitStringLiteral(ctx: AprlParser.StringLiteralContext): StringLiteral {
        val value = ctx.text.removeSurrounding("\"")
        return StringLiteral(ctx.position, value)
    }
    
    override fun visitLambdaLiteral(ctx: AprlParser.LambdaLiteralContext): LambdaLiteral {
        val parameters = ctx.lambdaParameters()?.lambdaParameter()?.map(::visitLambdaParameter) ?: emptyList()
        val statements = ctx.statements().statement().map(::visitStatement)
        return LambdaLiteral(ctx.position, parameters, statements)
    }
    
    override fun visitLambdaParameter(ctx: AprlParser.LambdaParameterContext): LambdaParameter {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val type = ctx.type()?.let(::visitType)
        return LambdaParameter(ctx.position, annotations, name, type)
    }
    
    override fun visitUnaryPrefix(ctx: AprlParser.UnaryPrefixContext): UnaryPrefix {
        val rawUnaryPrefix = ctx.INCR()?.let { UnaryPrefix.RawUnaryPrefix.INCR }
            ?: ctx.DECR()?.let { UnaryPrefix.RawUnaryPrefix.DECR }
            ?: ctx.ADD()?.let { UnaryPrefix.RawUnaryPrefix.ADD }
            ?: ctx.SUB()?.let { UnaryPrefix.RawUnaryPrefix.SUB }
            ?: ctx.EXCL()?.let { UnaryPrefix.RawUnaryPrefix.EXCL }
            ?: UnaryPrefix.RawUnaryPrefix.DOUBLE_AT
        return UnaryPrefix(ctx.position, rawUnaryPrefix)
    }
    
    override fun visitUnaryPostfix(ctx: AprlParser.UnaryPostfixContext): UnaryPostfix {
        val postfixUnaryOperator = ctx.postfixUnaryOperator()?.let {
            it.INCR()?.let { UnaryPostfix.PostfixUnaryOperator.INCR }
                ?: it.DECR()?.let { UnaryPostfix.PostfixUnaryOperator.DECR }
                ?: UnaryPostfix.PostfixUnaryOperator.DOUBLE_EXCL
        }
        val typeArguments = ctx.typeArguments()?.typeProjection()?.map(::visitTypeProjection)
        val callSuffix = ctx.callSuffix()?.let(::visitCallSuffix)
        val indexingSuffix = ctx.indexingSuffix()?.let(::visitIndexingSuffix)
        val navigationSuffix = ctx.navigationSuffix()?.let(::visitNavigationSuffix)
        return UnaryPostfix(ctx.position, postfixUnaryOperator, typeArguments, callSuffix, indexingSuffix, navigationSuffix)
    }
    
    override fun visitAssignableExpression(ctx: AprlParser.AssignableExpressionContext): AssignableExpression {
        val expression = visitExpression(ctx.expression())
        val assignableSuffixes = ctx.assignableSuffix().map(::visitAssignableSuffix)
        return AssignableExpression(ctx.position, expression, assignableSuffixes)
    }
    
    override fun visitAssignableSuffix(ctx: AprlParser.AssignableSuffixContext): AssignableSuffix {
        return ctx.indexingSuffix()?.let(::visitIndexingSuffix)
            ?: visitNavigationSuffix(ctx.navigationSuffix())
    }
    
    override fun visitCallSuffix(ctx: AprlParser.CallSuffixContext): CallSuffix {
        val typeArguments = ctx.typeArguments()?.typeProjection()?.map(::visitTypeProjection)
        val lambdaCallSuffix = ctx.lambdaCallSuffix()?.let(::visitLambdaCallSuffix)
        val valueArguments = ctx.valueArguments()?.valueArgument()?.map(::visitValueArgument)
        return CallSuffix(ctx.position, typeArguments, lambdaCallSuffix, valueArguments)
    }
    
    override fun visitLambdaCallSuffix(ctx: AprlParser.LambdaCallSuffixContext): LambdaCallSuffix {
        val valueArguments = ctx.valueArguments()?.valueArgument()?.map(::visitValueArgument)
        val annotatedLambda = visitAnnotatedLambda(ctx.annotatedLambda())
        return LambdaCallSuffix(ctx.position, valueArguments, annotatedLambda)
    }
    
    override fun visitAnnotatedLambda(ctx: AprlParser.AnnotatedLambdaContext): AnnotatedLambda {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val lambdaLiteral = visitLambdaLiteral(ctx.lambdaLiteral())
        return AnnotatedLambda(ctx.position, annotations, lambdaLiteral)
    }
    
    override fun visitIndexingSuffix(ctx: AprlParser.IndexingSuffixContext): IndexingSuffix {
        val expressions = ctx.expression().map(::visitExpression)
        return IndexingSuffix(ctx.position, expressions)
    }
    
    override fun visitNavigationSuffix(ctx: AprlParser.NavigationSuffixContext): NavigationSuffix {
        val operator = with(ctx.memberAccessOperator()) {
            PERIOD()?.let { NavigationSuffix.Operator.PERIOD }
                ?: QUEST_PERIOD()?.let { NavigationSuffix.Operator.QUEST_PERIOD }
                ?: NavigationSuffix.Operator.DOUBLE_COLON
        }
        val identifier = visitSimpleIdentifier(ctx.simpleIdentifier())
        return NavigationSuffix(ctx.position, operator, identifier)
    }
    
    override fun visitModifierList(ctx: AprlParser.ModifierListContext): ModifierList {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val modifiers = ctx.modifier().map(::visitModifier)
        return ModifierList(ctx.position, annotations, modifiers)
    }
    
    override fun visitModifier(ctx: AprlParser.ModifierContext): Modifier {
        
        return Modifier(ctx.position, convertRawModifier(ctx))
    }
    
    private fun convertRawModifier(ctx: AprlParser.ModifierContext): Modifier.RawModifier {
        return ctx.visibilityModifier()?.let {
            it.PUBLIC()?.let { Modifier.RawModifier.PUBLIC }
                ?: it.LOCAL()?.let { Modifier.RawModifier.LOCAL }
                ?: it.BOUNDED()?.let { Modifier.RawModifier.BOUNDED }
                ?: Modifier.RawModifier.PRIVATE
        } ?: ctx.inheritanceModifier()?.let {
            it.ABSTRACT()?.let { Modifier.RawModifier.ABSTRACT }
                ?: it.FINAL()?.let { Modifier.RawModifier.FINAL }
                ?: it.OPEN()?.let { Modifier.RawModifier.OPEN }
                ?: Modifier.RawModifier.COVER
        } ?: ctx.functionModifier()?.let {
            it.INLINE()?.let { Modifier.RawModifier.INLINE }
                ?: it.SYNC()?.let { Modifier.RawModifier.SYNC }
                ?: Modifier.RawModifier.EXTERNAL
        } ?: Modifier.RawModifier.PARAMS
    }
    
    override fun visitAnnotation(ctx: AprlParser.AnnotationContext): AnnotationReference {
        val unescapedAnnotations = ctx.unescapedAnnotation().map(::visitUnescapedAnnotation)
        return AnnotationReference(ctx.position, unescapedAnnotations)
    }
    
    override fun visitUnescapedAnnotation(ctx: AprlParser.UnescapedAnnotationContext): UnescapedAnnotation {
        val name = visitIdentifier(ctx.identifier())
        val valueArguments = ctx.valueArguments()?.valueArgument()?.map(::visitValueArgument)
        return UnescapedAnnotation(ctx.position, name, valueArguments)
    }
    
    override fun visitIdentifier(ctx: AprlParser.IdentifierContext): Identifier {
        val identifiers = ctx.simpleIdentifier().map { it.let(::visitSimpleIdentifier) }
        return Identifier(ctx.position, identifiers)
    }
    
    override fun visitSimpleIdentifier(ctx: AprlParser.SimpleIdentifierContext): SimpleIdentifier {
        return SimpleIdentifier(ctx.position, ctx.text)
    }
    
    override fun visitAllImport(ctx: AprlParser.AllImportContext): AllImport {
        val identifier = visitIdentifier(ctx.identifier())
        return AllImport(ctx.position, identifier)
    }
    
    override fun visitMultiImport(ctx: AprlParser.MultiImportContext): MultiImport {
        val identifier = visitIdentifier(ctx.identifier())
        val subImports = ctx.singleImport().map(::visitSingleImport)
        return MultiImport(ctx.position, identifier, subImports)
    }
    
    override fun visitCaughtException(ctx: AprlParser.CaughtExceptionContext): CaughtException {
        val annotations = ctx.annotations().annotation().map(::visitAnnotation)
        val name = visitSimpleIdentifier(ctx.simpleIdentifier())
        val types = ctx.type().map(::visitType)
        return CaughtException(ctx.position, annotations, name, types)
    }
    
}
