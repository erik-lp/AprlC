package aprl.compiler.verification

import aprl.compiler.Scope
import aprl.compiler.asList
import aprl.compiler.contentEquals
import aprl.compiler.error.ErrorCollector
import aprl.compiler.error.SyntaxError
import aprl.compiler.error.SyntaxWarning
import aprl.compiler.position
import aprl.compiler.psi.Position
import aprl.compiler.psi.aprl.*
import aprl.compiler.type.evaluateMultiplicativeExpression
import aprl.compiler.type.isClass
import aprl.compiler.type.isPrimitive
import org.antlr.v4.runtime.ParserRuleContext
import java.lang.reflect.Type

class AprlVerifier(val aprlFile: AprlFile) {
    
    val errorCollector = ErrorCollector<SyntaxError>()
    val warningCollector = ErrorCollector<SyntaxWarning>()
    
    @Suppress("FunctionName")
    private fun ERROR(token: ParserRuleContext, message: String) = ERROR(token.position, message)
    
    @Suppress("FunctionName")
    private fun ERROR(token: Token, message: String) = ERROR(token.position, message)
    
    @Suppress("FunctionName")
    private fun ERROR(position: Position, message: String) {
        val error = SyntaxError(aprlFile.file, position, message)
        errorCollector.collect(error)
    }
    
    @Suppress("FunctionName")
    private fun WARN(token: ParserRuleContext, message: String) = WARN(token.position, message)
    
    @Suppress("FunctionName")
    private fun WARN(token: Token, message: String) = WARN(token.position, message)
    
    @Suppress("FunctionName")
    private fun WARN(position: Position, message: String) {
        val warning = SyntaxWarning(aprlFile.file, position, message)
        warningCollector.collect(warning)
    }
    
    fun verify() {
        val scope = Scope(aprlFile.topLevelObjects)
        verifyPreamble(aprlFile.preamble, scope.constraint())
        aprlFile.topLevelObjects.forEach { verifyTopLevelObject(it, scope) }
    }
    
    private fun verifyAdditiveExpression(additiveExpression: AdditiveExpression, scope: Scope<Named>) {
        var left = additiveExpression.firstMultiplicativeExpression
        for ((operator, right) in additiveExpression.multiplicativeExpressions) {
            left = verifySingleAdditiveExpression(left, operator, right, scope)
        }
    }
    
    private fun verifySingleAdditiveExpression(leftAddend: MultiplicativeExpression, operator: AdditiveExpression.Operator, rightAddend: MultiplicativeExpression, scope: Scope<Named>): MultiplicativeExpression {
        val leftType = evaluateMultiplicativeExpression(leftAddend)
        val requiredOperatorFunction = operator.operatorName
        val functions =
        val rightType = evaluateMultiplicativeExpression(rightAddend)
        
        TODO("verifySingleAdditiveExpression()")
    }
    
    private fun verifyAllImport(allImport: AllImport, scope: Scope<Named>) {
    
    }
    
    private fun verifyAnnotatedLambda(annotatedLambda: AnnotatedLambda, scope: Scope<Named>) {
    
    }
    
    private fun verifyAnnotationDeclaration(annotationDeclaration: AnnotationDeclaration, scope: Scope<Named>) {
    
    }
    
    private fun verifyAnnotationReference(annotationReference: AnnotationReference) {
    
    }
    
    private fun verifyArrayType(arrayType: ArrayType) {
    
    }
    
    private fun verifyAsExpression(asExpression: AsExpression) {
    
    }
    
    private fun verifyAssignableExpression(assignableExpression: AssignableExpression) {
    
    }
    
    private fun verifyAssignableSuffix(assignableSuffix: AssignableSuffix) {
    
    }
    
    private fun verifyAssignment(assignment: Assignment, scope: Scope<Named>) {
    
    }
    
    private fun verifyAtomicExpression(atomicExpression: AtomicExpression) {
    
    }
    
    private fun verifyBlock(block: Block) {
    
    }
    
    private fun verifyBoolLiteral(boolLiteral: BoolLiteral) {
    
    }
    
    private fun verifyBreakExpression(breakExpression: BreakExpression) {
    
    }
    
    private fun verifyByteLiteral(byteLiteral: ByteLiteral, scope: Scope) {
    
    }
    
    private fun verifyCallableReference(callableReference: CallableReference, scope: Scope) {
    
    }
    
    private fun verifyCallSuffix(callSuffix: CallSuffix, scope: Scope) {
    
    }
    
    private fun verifyCatchBlock(catchBlock: CatchBlock, scope: Scope) {
    
    }
    
    private fun verifyCaughtException(caughtException: CaughtException, scope: Scope) {
    
    }
    
    private fun verifyCharacterLiteral(characterLiteral: CharacterLiteral, scope: Scope) {
    
    }
    
    private fun verifyClassDeclaration(classDeclaration: ClassDeclaration, scope: Scope) {
    
    }
    
    private fun verifyClassMember(classMember: ClassMember, scope: Scope) {
    
    }
    
    private fun verifyClassParameter(classParameter: ClassParameter, scope: Scope) {
    
    }
    
    private fun verifyCollectionLiteral(collectionLiteral: CollectionLiteral, scope: Scope) {
    
    }
    
    private fun verifyComparison(comparison: Comparison, scope: Scope) {
    
    }
    
    private fun verifyComplexLiteral(complexLiteral: ComplexLiteral, scope: Scope) {
    
    }
    
    private fun verifyConditionalExpression(conditionalExpression: ConditionalExpression, scope: Scope) {
    
    }
    
    private fun verifyConjunction(conjunction: Conjunction, scope: Scope) {
    
    }
    
    private fun verifyConstructorDelegationCall(constructorDelegationCall: ConstructorDelegationCall, scope: Scope) {
    
    }
    
    private fun verifyContinueExpression(continueExpression: ContinueExpression, scope: Scope) {
    
    }
    
    private fun verifyDelegationSpecifier(delegationSpecifier: DelegationSpecifier, scope: Scope) {
    
    }
    
    private fun verifyDisjunction(disjunction: Disjunction, scope: Scope) {
    
    }
    
    private fun verifyDocumentDeclaration(documentDeclaration: DocumentDeclaration, scope: Scope) {
    
    }
    
    private fun verifyDoubleLiteral(doubleLiteral: DoubleLiteral, scope: Scope) {
    
    }
    
    private fun verifyElsifExpression(elsifExpression: ElsifExpression, scope: Scope) {
    
    }
    
    private fun verifyElvisExpression(elvisExpression: ElvisExpression, scope: Scope) {
    
    }
    
    private fun verifyEnumBody(enumBody: EnumBody, scope: Scope) {
    
    }
    
    private fun verifyEnumDeclaration(enumDeclaration: EnumDeclaration, scope: Scope) {
    
    }
    
    private fun verifyEnumEntry(enumEntry: EnumEntry, scope: Scope) {
    
    }
    
    private fun verifyEqualityComparison(equalityComparison: EqualityComparison, scope: Scope) {
    
    }
    
    private fun verifyExponentialExpression(exponentialExpression: ExponentialExpression, scope: Scope) {
    
    }
    
    private fun verifyExpression(expression: Expression, scope: Scope) {
    
    }
    
    private fun verifyExtensionDeclaration(extensionDeclaration: ExtensionDeclaration, scope: Scope) {
    
    }
    
    private fun verifyExtensionMember(extensionMember: ExtensionMember, scope: Scope) {
    
    }
    
    private fun verifyFloatLiteral(floatLiteral: FloatLiteral, scope: Scope) {
    
    }
    
    private fun verifyForStatement(forStatement: ForStatement, scope: Scope) {
    
    }
    
    private fun verifyFunctionBody(functionBody: FunctionBody, scope: Scope) {
    
    }
    
    private fun verifyFunctionDeclaration(functionDeclaration: FunctionDeclaration, scope: Scope) {
    
    }
    
    private fun verifyFunctionType(functionType: FunctionType, scope: Scope) {
    
    }
    
    private fun verifyFunctionValueParameter(functionValueParameter: FunctionValueParameter, scope: Scope) {
    
    }
    
    private fun verifyFunctionValueParameterWithOptionalType(functionValueParameterWithOptionalType: FunctionValueParameterWithOptionalType, scope: Scope) {
    
    }
    
    private fun verifyGetter(getter: Getter, scope: Scope) {
    
    }
    
    private fun verifyIdentifier(identifier: Identifier, scope: Scope) {
    
    }
    
    private fun verifyIdentityComparison(identityComparison: IdentityComparison, scope: Scope) {
    
    }
    
    private fun verifyIfExpression(ifExpression: IfExpression, scope: Scope) {
    
    }
    
    private fun verifyImportHeader(importHeader: ImportHeader, scope: Scope) {
    
    }
    
    private fun verifyImportIdentifier(importIdentifier: ImportIdentifier, scope: Scope) {
    
    }
    
    private fun verifyIndexingSuffix(indexingSuffix: IndexingSuffix, scope: Scope) {
    
    }
    
    private fun verifyInfixFunctionCall(infixFunctionCall: InfixFunctionCall, scope: Scope) {
    
    }
    
    private fun verifyInitializerBody(initializerBody: InitializerBody, scope: Scope) {
    
    }
    
    private fun verifyIntegerLiteral(integerLiteral: IntegerLiteral, scope: Scope) {
    
    }
    
    private fun verifyInterfaceDeclaration(interfaceDeclaration: InterfaceDeclaration, scope: Scope) {
    
    }
    
    private fun verifyJumpExpression(jumpExpression: JumpExpression, scope: Scope) {
    
    }
    
    private fun verifyLambdaCallSuffix(lambdaCallSuffix: LambdaCallSuffix, scope: Scope) {
    
    }
    
    private fun verifyLambdaLiteral(lambdaLiteral: LambdaLiteral, scope: Scope) {
    
    }
    
    private fun verifyLambdaParameter(lambdaParameter: LambdaParameter, scope: Scope) {
    
    }
    
    private fun verifyLiteralConstant(literalConstant: LiteralConstant<*>, scope: Scope) {
    
    }
    
    private fun verifyLoadScript(loadScript: LoadScript, scope: Scope) {
    
    }
    
    private fun verifyLocalVariableDeclaration(localVariableDeclaration: LocalVariableDeclaration, scope: Scope) {
    
    }
    
    private fun verifyLongLiteral(longLiteral: LongLiteral, scope: Scope) {
    
    }
    
    private fun verifyLoopStatement(loopStatement: LoopStatement, scope: Scope) {
    
    }
    
    private fun verifyMatchEntry(matchEntry: MatchEntry, scope: Scope) {
    
    }
    
    private fun verifyMatchExpression(matchExpression: MatchExpression, scope: Scope) {
    
    }
    
    private fun verifyModifiable(modifiable: Modifiable, scope: Scope) {
    
    }
    
    private fun verifyModifier(modifier: Modifier, scope: Scope) {
    
    }
    
    private fun verifyModifierList(modifierList: ModifierList, scope: Scope) {
    
    }
    
    private fun verifyMultiImport(multiImport: MultiImport, scope: Scope) {
    
    }
    
    private fun verifyMultiplicativeExpression(multiplicativeExpression: MultiplicativeExpression, scope: Scope) {
    
    }
    
    private fun verifyNamed(named: Named, scope: Scope) {
    
    }
    
    private fun verifyNamedInfix(namedInfix: NamedInfix, scope: Scope) {
    
    }
    
    private fun verifyNamedInfixExpression(namedInfixExpression: NamedInfixExpression, scope: Scope) {
    
    }
    
    private fun verifyNamespaceHeader(namespaceHeader: NamespaceHeader, scope: Scope) {
    
    }
    
    private fun verifyNavigationSuffix(navigationSuffix: NavigationSuffix, scope: Scope) {
    
    }
    
    private fun verifyNullableType(nullableType: NullableType, scope: Scope) {
    
    }
    
    private fun verifyNullLiteral(nullLiteral: NullLiteral, scope: Scope) {
    
    }
    
    private fun verifyOptionalTryExpression(optionalTryExpression: OptionalTryExpression, scope: Scope) {
    
    }
    
    private fun verifyParameter(parameter: Parameter, scope: Scope) {
    
    }
    
    private fun verifyParameterWithOptionalType(parameterWithOptionalType: ParameterWithOptionalType, scope: Scope) {
    
    }
    
    private fun verifyPartnerDeclaration(partnerDeclaration: PartnerDeclaration, scope: Scope) {
    
    }
    
    private fun verifyPostfixUnaryExpression(postfixUnaryExpression: PostfixUnaryExpression, scope: Scope) {
    
    }
    
    private fun verifyPreamble(preamble: Preamble, scope: Scope<Named>) {
    
    }
    
    private fun verifyPrefixUnaryExpression(prefixUnaryExpression: PrefixUnaryExpression, scope: Scope) {
    
    }
    
    private fun verifyPrimaryConstructor(primaryConstructor: PrimaryConstructor, scope: Scope) {
    
    }
    
    private fun verifyPropertyBody(propertyBody: PropertyBody, scope: Scope) {
    
    }
    
    private fun verifyPropertyDeclaration(propertyDeclaration: PropertyDeclaration, scope: Scope) {
    
    }
    
    private fun verifyRangeExpression(rangeExpression: RangeExpression, scope: Scope) {
    
    }
    
    private fun verifyReceiverType(receiverType: ReceiverType, scope: Scope) {
    
    }
    
    private fun verifyReturnExpression(returnExpression: ReturnExpression, scope: Scope) {
    
    }
    
    private fun verifySecondaryConstructor(secondaryConstructor: SecondaryConstructor, scope: Scope) {
    
    }
    
    private fun verifySetter(setter: Setter, scope: Scope) {
    
    }
    
    private fun verifyShortLiteral(shortLiteral: ShortLiteral, scope: Scope) {
    
    }
    
    private fun verifySimpleIdentifier(simpleIdentifier: SimpleIdentifier, scope: Scope) {
    
    }
    
    private fun verifySingleImport(singleImport: SingleImport, scope: Scope) {
    
    }
    
    private fun verifyStatement(statement: Statement, scope: Scope) {
    
    }
    
    private fun verifyStringLiteral(stringLiteral: StringLiteral, scope: Scope) {
    
    }
    
    private fun verifyStructDeclaration(structDeclaration: StructDeclaration, scope: Scope) {
    
    }
    
    private fun verifyStructMember(structMember: StructMember, scope: Scope) {
    
    }
    
    private fun verifySuperExpression(superExpression: SuperExpression, scope: Scope) {
    
    }
    
    private fun verifyThisExpression(thisExpression: ThisExpression, scope: Scope) {
    
    }
    
    private fun verifyToken(token: Token, scope: Scope) {
    
    }
    
    private fun verifyTopLevelObject(topLevelObject: TopLevelObject, scope: Scope<TopLevelObject>) {
    
    }
    
    private fun verifyTriggerExpression(triggerExpression: TriggerExpression, scope: Scope) {
    
    }
    
    private fun verifyTryExpression(tryExpression: TryExpression, scope: Scope) {
    
    }
    
    private fun verifyTypeParameter(typeParameter: TypeParameter, scope: Scope) {
    
    }
    
    private fun verifyTypeParameterModifier(typeParameterModifier: TypeParameterModifier, scope: Scope) {
    
    }
    
    private fun verifyTypeParameterModifierList(typeParameterModifierList: TypeParameterModifierList, scope: Scope) {
    
    }
    
    private fun verifyTypeProjection(typeProjection: TypeProjection, scope: Scope) {
    
    }
    
    private fun verifyTypeProjectionModifier(typeProjectionModifier: TypeProjectionModifier, scope: Scope) {
    
    }
    
    private fun verifyTypeProjectionModifierList(typeProjectionModifierList: TypeProjectionModifierList, scope: Scope) {
    
    }
    
    private fun verifyTypeReference(typeReference: TypeReference, scope: Scope) {
    
    }
    
    private fun verifyUnaryPostfix(unaryPostfix: UnaryPostfix, scope: Scope) {
    
    }
    
    private fun verifyUnaryPrefix(unaryPrefix: UnaryPrefix, scope: Scope) {
    
    }
    
    private fun verifyUnescapedAnnotation(unescapedAnnotation: UnescapedAnnotation, scope: Scope) {
    
    }
    
    private fun verifyValueArgument(valueArgument: ValueArgument, scope: Scope) {
    
    }
    
    private fun verifyVariableDeclaration(variableDeclaration: VariableDeclaration, scope: Scope) {
    
    }
    
    private fun verifyWhileStatement(whileStatement: WhileStatement, scope: Scope) {
    
    }
    
    private fun verifyXorExpression(xorExpression: XorExpression, scope: Scope) {
    
    }
    
    /**
     * Checks a list of imports.
     *
     * Gives an error if:
     * - there are ambiguous imports
     *
     * Gives a warning if:
     * - an import is redundant
     * - an alias equals the imported identifier itself
     */
    private fun verifyImports(imports: List<ImportIdentifier>, scope: Scope) {
        val checked = mutableListOf<ImportIdentifier>()
        for (import in imports) {
            fun validateSingleImport(position: Position, identifiers: List<SimpleIdentifier>, alias: SimpleIdentifier?) {
                val frontend = alias ?: identifiers.last()
                val isInSingleImport = checked.flatMap { it.singleImport?.asList() ?: emptyList() }.any { single ->
                    if (frontend == single.frontend()) {
                        if (!identifiers.contentEquals(single.identifier.identifiers)) {
                            ERROR(position, "Ambiguous import")
                            false
                        } else {
                            true
                        }
                    } else {
                        false
                    }
                }
                val isInMultiImport = checked.flatMap { it.multiImport?.asList() ?: emptyList() }.any { multi ->
                    multi.subImports.any {
                        val joined = multi.identifier.identifiers + it.identifier.identifiers
                        val final = it.alias ?: joined.last()
                        if (frontend == final) {
                            if (!identifiers.contentEquals(joined)) {
                                ERROR(position, "Ambiguous import")
                                false
                            } else {
                                true
                            }
                        } else {
                            false
                        }
                    }
                }
                val isInAllImport = alias == null && checked.flatMap { it.allImport?.asList() ?: emptyList() }.any { all ->
                    all.identifier.identifiers.contentEquals(identifiers.dropLast(1))
                }
                if (isInSingleImport || isInMultiImport || isInAllImport) {
                    WARN(position, "Redundant import")
                }
                if (alias == identifiers.last()) {
                    WARN(alias, "Redundant import alias")
                }
            }
            if (import.singleImport != null) {
                validateSingleImport(import.position, import.singleImport.identifier.identifiers, import.singleImport.alias)
            } else if (import.allImport != null) {
                if (checked.any { it.allImport == import.allImport }) {
                    WARN(import, "Redundant import")
                }
            } else {
                import.multiImport!!.subImports.forEach {
                    val joined = import.multiImport.identifier.identifiers + it.identifier.identifiers
                    val alias = it.alias
                    validateSingleImport(it.position, joined, alias)
                }
            }
            checked.add(import)
        }
    }
    
}