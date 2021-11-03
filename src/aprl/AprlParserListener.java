// Generated from C:/Users/erik-/IdeaProjects/AprlC/src/aprl\AprlParser.g4 by ANTLR 4.9.1
package aprl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AprlParser}.
 */
public interface AprlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AprlParser#aprlFile}.
	 * @param ctx the parse tree
	 */
	void enterAprlFile(AprlParser.AprlFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#aprlFile}.
	 * @param ctx the parse tree
	 */
	void exitAprlFile(AprlParser.AprlFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(AprlParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(AprlParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#namespaceHeader}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceHeader(AprlParser.NamespaceHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#namespaceHeader}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceHeader(AprlParser.NamespaceHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(AprlParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(AprlParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(AprlParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(AprlParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#importIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterImportIdentifier(AprlParser.ImportIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#importIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitImportIdentifier(AprlParser.ImportIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#subImportIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSubImportIdentifier(AprlParser.SubImportIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#subImportIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSubImportIdentifier(AprlParser.SubImportIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#singleImport}.
	 * @param ctx the parse tree
	 */
	void enterSingleImport(AprlParser.SingleImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#singleImport}.
	 * @param ctx the parse tree
	 */
	void exitSingleImport(AprlParser.SingleImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(AprlParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(AprlParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(AprlParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(AprlParser.TopLevelObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AprlParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AprlParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AprlParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AprlParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(AprlParser.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(AprlParser.AnnotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDocumentDeclaration(AprlParser.DocumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#documentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDocumentDeclaration(AprlParser.DocumentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(AprlParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(AprlParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(AprlParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(AprlParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(AprlParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(AprlParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(AprlParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(AprlParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(AprlParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(AprlParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#interfaceDelegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDelegationSpecifiers(AprlParser.InterfaceDelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#interfaceDelegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDelegationSpecifiers(AprlParser.InterfaceDelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#annotatedInterfaceDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedInterfaceDelegationSpecifier(AprlParser.AnnotatedInterfaceDelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#annotatedInterfaceDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedInterfaceDelegationSpecifier(AprlParser.AnnotatedInterfaceDelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(AprlParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(AprlParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(AprlParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(AprlParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(AprlParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(AprlParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(AprlParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(AprlParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AprlParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AprlParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AprlParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AprlParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#loadScript}.
	 * @param ctx the parse tree
	 */
	void enterLoadScript(AprlParser.LoadScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#loadScript}.
	 * @param ctx the parse tree
	 */
	void exitLoadScript(AprlParser.LoadScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void enterInitializerBody(AprlParser.InitializerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void exitInitializerBody(AprlParser.InitializerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#partnerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPartnerDeclaration(AprlParser.PartnerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#partnerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPartnerDeclaration(AprlParser.PartnerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(AprlParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(AprlParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(AprlParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(AprlParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifierList(AprlParser.TypeProjectionModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifierList(AprlParser.TypeProjectionModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifier(AprlParser.TypeProjectionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifier(AprlParser.TypeProjectionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(AprlParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(AprlParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(AprlParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(AprlParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeParameterModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifierList(AprlParser.TypeParameterModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeParameterModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifierList(AprlParser.TypeParameterModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(AprlParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(AprlParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void enterReificationModifier(AprlParser.ReificationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void exitReificationModifier(AprlParser.ReificationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarianceModifier(AprlParser.VarianceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarianceModifier(AprlParser.VarianceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AprlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AprlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(AprlParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(AprlParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(AprlParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(AprlParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(AprlParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(AprlParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(AprlParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(AprlParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AprlParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AprlParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(AprlParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(AprlParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(AprlParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(AprlParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(AprlParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(AprlParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(AprlParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(AprlParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(AprlParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(AprlParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(AprlParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(AprlParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(AprlParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(AprlParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(AprlParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(AprlParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDeclaration(AprlParser.ExtensionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDeclaration(AprlParser.ExtensionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void enterExtensionBody(AprlParser.ExtensionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void exitExtensionBody(AprlParser.ExtensionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#extensionMember}.
	 * @param ctx the parse tree
	 */
	void enterExtensionMember(AprlParser.ExtensionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#extensionMember}.
	 * @param ctx the parse tree
	 */
	void exitExtensionMember(AprlParser.ExtensionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AprlParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AprlParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AprlParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AprlParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#propertyBody}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBody(AprlParser.PropertyBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#propertyBody}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBody(AprlParser.PropertyBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(AprlParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(AprlParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(AprlParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(AprlParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionValueParameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameterWithOptionalType(AprlParser.FunctionValueParameterWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionValueParameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameterWithOptionalType(AprlParser.FunctionValueParameterWithOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithOptionalType(AprlParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithOptionalType(AprlParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AprlParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AprlParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(AprlParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(AprlParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(AprlParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(AprlParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AprlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AprlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AprlParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AprlParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AprlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AprlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(AprlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(AprlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AprlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AprlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(AprlParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(AprlParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(AprlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(AprlParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AprlParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AprlParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AprlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AprlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(AprlParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(AprlParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AprlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AprlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AprlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AprlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(AprlParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(AprlParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(AprlParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(AprlParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(AprlParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(AprlParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#identityComparison}.
	 * @param ctx the parse tree
	 */
	void enterIdentityComparison(AprlParser.IdentityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#identityComparison}.
	 * @param ctx the parse tree
	 */
	void exitIdentityComparison(AprlParser.IdentityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(AprlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(AprlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#namedInfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedInfixExpression(AprlParser.NamedInfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#namedInfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedInfixExpression(AprlParser.NamedInfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void enterNamedInfix(AprlParser.NamedInfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void exitNamedInfix(AprlParser.NamedInfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(AprlParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(AprlParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(AprlParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(AprlParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(AprlParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(AprlParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(AprlParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(AprlParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AprlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AprlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AprlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AprlParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#exponentialExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentialExpression(AprlParser.ExponentialExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#exponentialExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentialExpression(AprlParser.ExponentialExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(AprlParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(AprlParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(AprlParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(AprlParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(AprlParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(AprlParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(AprlParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(AprlParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AprlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AprlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#contextualReference}.
	 * @param ctx the parse tree
	 */
	void enterContextualReference(AprlParser.ContextualReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#contextualReference}.
	 * @param ctx the parse tree
	 */
	void exitContextualReference(AprlParser.ContextualReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(AprlParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(AprlParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(AprlParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(AprlParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(AprlParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(AprlParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(AprlParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(AprlParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(AprlParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(AprlParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(AprlParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(AprlParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#elsifExpression}.
	 * @param ctx the parse tree
	 */
	void enterElsifExpression(AprlParser.ElsifExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#elsifExpression}.
	 * @param ctx the parse tree
	 */
	void exitElsifExpression(AprlParser.ElsifExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(AprlParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(AprlParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#matchEntry}.
	 * @param ctx the parse tree
	 */
	void enterMatchEntry(AprlParser.MatchEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#matchEntry}.
	 * @param ctx the parse tree
	 */
	void exitMatchEntry(AprlParser.MatchEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#optionalTryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalTryExpression(AprlParser.OptionalTryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#optionalTryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalTryExpression(AprlParser.OptionalTryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(AprlParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(AprlParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(AprlParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(AprlParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(AprlParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(AprlParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(AprlParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(AprlParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#triggerExpression}.
	 * @param ctx the parse tree
	 */
	void enterTriggerExpression(AprlParser.TriggerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#triggerExpression}.
	 * @param ctx the parse tree
	 */
	void exitTriggerExpression(AprlParser.TriggerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(AprlParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(AprlParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#continueExpression}.
	 * @param ctx the parse tree
	 */
	void enterContinueExpression(AprlParser.ContinueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#continueExpression}.
	 * @param ctx the parse tree
	 */
	void exitContinueExpression(AprlParser.ContinueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#breakExpression}.
	 * @param ctx the parse tree
	 */
	void enterBreakExpression(AprlParser.BreakExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#breakExpression}.
	 * @param ctx the parse tree
	 */
	void exitBreakExpression(AprlParser.BreakExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(AprlParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(AprlParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(AprlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(AprlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(AprlParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(AprlParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#trileanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTrileanLiteral(AprlParser.TrileanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#trileanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTrileanLiteral(AprlParser.TrileanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(AprlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(AprlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#longLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLongLiteral(AprlParser.LongLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#longLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLongLiteral(AprlParser.LongLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#shortLiteral}.
	 * @param ctx the parse tree
	 */
	void enterShortLiteral(AprlParser.ShortLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#shortLiteral}.
	 * @param ctx the parse tree
	 */
	void exitShortLiteral(AprlParser.ShortLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#byteLiteral}.
	 * @param ctx the parse tree
	 */
	void enterByteLiteral(AprlParser.ByteLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#byteLiteral}.
	 * @param ctx the parse tree
	 */
	void exitByteLiteral(AprlParser.ByteLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(AprlParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(AprlParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(AprlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(AprlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#complexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterComplexLiteral(AprlParser.ComplexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#complexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitComplexLiteral(AprlParser.ComplexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(AprlParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(AprlParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AprlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AprlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(AprlParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(AprlParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(AprlParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(AprlParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(AprlParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(AprlParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(AprlParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(AprlParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(AprlParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(AprlParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(AprlParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(AprlParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLiteral(AprlParser.LambdaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLiteral(AprlParser.LambdaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(AprlParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(AprlParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(AprlParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(AprlParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(AprlParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(AprlParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionOperator(AprlParser.DisjunctionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionOperator(AprlParser.DisjunctionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionOperator(AprlParser.ConjunctionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionOperator(AprlParser.ConjunctionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(AprlParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(AprlParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#identityOperator}.
	 * @param ctx the parse tree
	 */
	void enterIdentityOperator(AprlParser.IdentityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#identityOperator}.
	 * @param ctx the parse tree
	 */
	void exitIdentityOperator(AprlParser.IdentityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(AprlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(AprlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(AprlParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(AprlParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(AprlParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(AprlParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#elvisOperator}.
	 * @param ctx the parse tree
	 */
	void enterElvisOperator(AprlParser.ElvisOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#elvisOperator}.
	 * @param ctx the parse tree
	 */
	void exitElvisOperator(AprlParser.ElvisOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#toOperator}.
	 * @param ctx the parse tree
	 */
	void enterToOperator(AprlParser.ToOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#toOperator}.
	 * @param ctx the parse tree
	 */
	void exitToOperator(AprlParser.ToOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#xorOperator}.
	 * @param ctx the parse tree
	 */
	void enterXorOperator(AprlParser.XorOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#xorOperator}.
	 * @param ctx the parse tree
	 */
	void exitXorOperator(AprlParser.XorOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(AprlParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(AprlParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(AprlParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(AprlParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#exponentialOperator}.
	 * @param ctx the parse tree
	 */
	void enterExponentialOperator(AprlParser.ExponentialOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#exponentialOperator}.
	 * @param ctx the parse tree
	 */
	void exitExponentialOperator(AprlParser.ExponentialOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(AprlParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(AprlParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(AprlParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(AprlParser.UnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfix(AprlParser.UnaryPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfix(AprlParser.UnaryPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(AprlParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(AprlParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(AprlParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(AprlParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedAssignableExpression(AprlParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedAssignableExpression(AprlParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSuffix(AprlParser.AssignableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSuffix(AprlParser.AssignableSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(AprlParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(AprlParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#lambdaCallSuffix}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCallSuffix(AprlParser.LambdaCallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#lambdaCallSuffix}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCallSuffix(AprlParser.LambdaCallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(AprlParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(AprlParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSuffix(AprlParser.IndexingSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSuffix(AprlParser.IndexingSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterNavigationSuffix(AprlParser.NavigationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitNavigationSuffix(AprlParser.NavigationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(AprlParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(AprlParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(AprlParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(AprlParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(AprlParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(AprlParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(AprlParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(AprlParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(AprlParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(AprlParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(AprlParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(AprlParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(AprlParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(AprlParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(AprlParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(AprlParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(AprlParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(AprlParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(AprlParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(AprlParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AprlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AprlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(AprlParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(AprlParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprlParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(AprlParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprlParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(AprlParser.SemiContext ctx);
}