// Generated from C:/Users/erik-/IdeaProjects/AprlC/src/aprl\AprlParser.g4 by ANTLR 4.9.1
package aprl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AprlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AprlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AprlParser#aprlFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAprlFile(AprlParser.AprlFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(AprlParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#namespaceHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceHeader(AprlParser.NamespaceHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(AprlParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(AprlParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#importIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportIdentifier(AprlParser.ImportIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#subImportIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubImportIdentifier(AprlParser.SubImportIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#singleImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleImport(AprlParser.SingleImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(AprlParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#topLevelObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelObject(AprlParser.TopLevelObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AprlParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AprlParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(AprlParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#documentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentDeclaration(AprlParser.DocumentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(AprlParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#classParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameters(AprlParser.ClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#classParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameter(AprlParser.ClassParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(AprlParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(AprlParser.DelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#interfaceDelegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDelegationSpecifiers(AprlParser.InterfaceDelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#annotatedInterfaceDelegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedInterfaceDelegationSpecifier(AprlParser.AnnotatedInterfaceDelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(AprlParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(AprlParser.ValueArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(AprlParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(AprlParser.ConstructorDelegationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AprlParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(AprlParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#loadScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadScript(AprlParser.LoadScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#initializerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerBody(AprlParser.InitializerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#partnerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartnerDeclaration(AprlParser.PartnerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(AprlParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjection(AprlParser.TypeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifierList(AprlParser.TypeProjectionModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifier(AprlParser.TypeProjectionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(AprlParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(AprlParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeParameterModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifierList(AprlParser.TypeParameterModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(AprlParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#reificationModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReificationModifier(AprlParser.ReificationModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#varianceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceModifier(AprlParser.VarianceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AprlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(AprlParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(AprlParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameters(AprlParser.FunctionTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(AprlParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AprlParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(AprlParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(AprlParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(AprlParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#structMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMember(AprlParser.StructMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AprlParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(AprlParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(AprlParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(AprlParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionDeclaration(AprlParser.ExtensionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#extensionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionBody(AprlParser.ExtensionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#extensionMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionMember(AprlParser.ExtensionMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AprlParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AprlParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#propertyBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBody(AprlParser.PropertyBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(AprlParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(AprlParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionValueParameterWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameterWithOptionalType(AprlParser.FunctionValueParameterWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithOptionalType(AprlParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AprlParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionValueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameters(AprlParser.FunctionValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameter(AprlParser.FunctionValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AprlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AprlParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AprlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(AprlParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AprlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(AprlParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(AprlParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AprlParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AprlParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(AprlParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AprlParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AprlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(AprlParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(AprlParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#equalityComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(AprlParser.EqualityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#identityComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityComparison(AprlParser.IdentityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(AprlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#namedInfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedInfixExpression(AprlParser.NamedInfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#namedInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedInfix(AprlParser.NamedInfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(AprlParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(AprlParser.InfixFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(AprlParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(AprlParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AprlParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AprlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#exponentialExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentialExpression(AprlParser.ExponentialExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(AprlParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(AprlParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(AprlParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(AprlParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AprlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#contextualReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextualReference(AprlParser.ContextualReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(AprlParser.CallableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(AprlParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(AprlParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#superExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(AprlParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(AprlParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(AprlParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#elsifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsifExpression(AprlParser.ElsifExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(AprlParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#matchEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchEntry(AprlParser.MatchEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#optionalTryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalTryExpression(AprlParser.OptionalTryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(AprlParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(AprlParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(AprlParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#jumpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpExpression(AprlParser.JumpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#triggerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerExpression(AprlParser.TriggerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(AprlParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#continueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueExpression(AprlParser.ContinueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#breakExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExpression(AprlParser.BreakExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(AprlParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(AprlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(AprlParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#trileanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrileanLiteral(AprlParser.TrileanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(AprlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#longLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(AprlParser.LongLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#shortLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortLiteral(AprlParser.ShortLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#byteLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteLiteral(AprlParser.ByteLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AprlParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#doubleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(AprlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#complexLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexLiteral(AprlParser.ComplexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(AprlParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AprlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(AprlParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(AprlParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(AprlParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(AprlParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(AprlParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(AprlParser.MultiLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLiteral(AprlParser.LambdaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(AprlParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(AprlParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(AprlParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionOperator(AprlParser.DisjunctionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionOperator(AprlParser.ConjunctionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(AprlParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#identityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityOperator(AprlParser.IdentityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(AprlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(AprlParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(AprlParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#elvisOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisOperator(AprlParser.ElvisOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#toOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToOperator(AprlParser.ToOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#xorOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOperator(AprlParser.XorOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(AprlParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(AprlParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#exponentialOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentialOperator(AprlParser.ExponentialOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(AprlParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefix(AprlParser.UnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfix(AprlParser.UnaryPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(AprlParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(AprlParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedAssignableExpression(AprlParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#assignableSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSuffix(AprlParser.AssignableSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(AprlParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#lambdaCallSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCallSuffix(AprlParser.LambdaCallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(AprlParser.AnnotatedLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#indexingSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSuffix(AprlParser.IndexingSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#navigationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationSuffix(AprlParser.NavigationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperator(AprlParser.MemberAccessOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(AprlParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(AprlParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(AprlParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceModifier(AprlParser.InheritanceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#parameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifier(AprlParser.ParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#functionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifier(AprlParser.FunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(AprlParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(AprlParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(AprlParser.UnescapedAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AprlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(AprlParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprlParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(AprlParser.SemiContext ctx);
}