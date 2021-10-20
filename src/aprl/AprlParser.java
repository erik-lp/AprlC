// Generated from C:/Users/erik-/IdeaProjects/AprlC/src/aprl\AprlParser.g4 by ANTLR 4.9.1
package aprl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AprlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DelimitedComment=1, DocComment=2, LineComment=3, WS=4, NL=5, NAMESPACE=6, 
		USING=7, ALIAS=8, CLASS=9, INTERFACE=10, STRUCT=11, DOCUMENT=12, ANONYMOUS=13, 
		ENUM=14, ANNOTATION=15, PARTNER=16, THIS=17, SUPER=18, SUB_=19, ACTUAL=20, 
		INIT=21, EXEC=22, PRIVATE=23, BOUNDED=24, LOCAL=25, PUBLIC=26, GETTER=27, 
		SETTER=28, DEF=29, CONST=30, VAR=31, VAL=32, SAMPLE=33, COVER=34, OPEN=35, 
		FINAL=36, INLINE=37, EXTERNAL=38, SYNC=39, FUNCTION=40, SCRIPT=41, OPERATOR=42, 
		EXTENSION=43, PARAMS=44, IF=45, UNLESS=46, ELSIF=47, ELSE=48, FOR=49, 
		MATCH=50, WHEN=51, DO=52, WHILE=53, RETURN=54, BREAK=55, CONTINUE=56, 
		RETURN_AT=57, BREAK_AT=58, CONTINUE_AT=59, AS=60, AS_QUEST=61, IS=62, 
		NOT_IS=63, IN=64, NOT_IN=65, TRY=66, TRY_QUEST=67, CATCH=68, FINALLY=69, 
		TRIGGER=70, TRUE=71, FALSE=72, NONE=73, NULL=74, LPAREN=75, RPAREN=76, 
		LSQUARE=77, RSQUARE=78, LCURLY=79, RCURLY=80, ASSIGN=81, DEFINE=82, ADD=83, 
		ADD_ASSIGN=84, INCR=85, SUB=86, SUB_ASSIGN=87, DECR=88, MUL=89, MUL_ASSIGN=90, 
		DIV=91, DIV_ASSIGN=92, MOD=93, MOD_ASSIGN=94, EXP=95, EXP_ASSIGN=96, CONJ=97, 
		CONJ_ASSIGN=98, DISJ=99, DISJ_ASSIGN=100, XOR=101, XOR_ASSIGN=102, COMMA=103, 
		PERIOD=104, QUEST_PERIOD=105, DOWNTO=106, TO=107, UNTIL=108, TRIPLE_PERIOD=109, 
		COLON=110, DOUBLE_COLON=111, SEMICOLON=112, EXCL=113, DOUBLE_EXCL=114, 
		QUEST=115, HASH=116, AT=117, DOUBLE_AT=118, ELVIS=119, ELVIS_ASSIGN=120, 
		EQUAL=121, NEQUAL=122, IDENTICAL=123, NIDENTICAL=124, LANGLE=125, NLANGLE=126, 
		LEQ=127, NLEQ=128, RANGLE=129, NRANGLE=130, GEQ=131, NGEQ=132, LARROW=133, 
		RARROW=134, RARROW_THICK=135, SPACESHIP=136, SINGLE_QUOTE=137, QUOTE_OPEN=138, 
		TRIPLE_QUOTE_OPEN=139, IntegerLiteral=140, LongLiteral=141, ShortLiteral=142, 
		ByteLiteral=143, FloatLiteral=144, DoubleLiteral=145, ComplexLiteral=146, 
		HexLiteral=147, BinLiteral=148, OctalLiteral=149, BooleanLiteral=150, 
		TrileanLiteral=151, Identifier=152, LabelReference=153, LabelDefinition=154, 
		FieldIdentifier=155, CharacterLiteral=156, UNICODE_CLASS_LL=157, UNICODE_CLASS_LM=158, 
		UNICODE_CLASS_LO=159, UNICODE_CLASS_LT=160, UNICODE_CLASS_LU=161, UNICODE_CLASS_ND=162, 
		UNICODE_CLASS_NL=163, QUOTE_CLOSE=164, LineStrRef=165, LineStrText=166, 
		LineStrEscapedChar=167, LineStrExprStart=168, TRIPLE_QUOTE_CLOSE=169, 
		MultiLineStrQuote=170, MultiLineStrRef=171, MultiLineStrText=172, MultiLineStrEscapedChar=173, 
		MultiLineStrExprStart=174, MultiLineNL=175;
	public static final int
		RULE_aprlFile = 0, RULE_preamble = 1, RULE_namespaceHeader = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_importIdentifier = 5, RULE_subImportIdentifier = 6, 
		RULE_singleImport = 7, RULE_importAlias = 8, RULE_topLevelObject = 9, 
		RULE_classDeclaration = 10, RULE_interfaceDeclaration = 11, RULE_annotationDeclaration = 12, 
		RULE_documentDeclaration = 13, RULE_primaryConstructor = 14, RULE_classParameters = 15, 
		RULE_classParameter = 16, RULE_delegationSpecifiers = 17, RULE_annotatedDelegationSpecifier = 18, 
		RULE_delegationSpecifier = 19, RULE_interfaceDelegationSpecifiers = 20, 
		RULE_annotatedInterfaceDelegationSpecifier = 21, RULE_valueArguments = 22, 
		RULE_valueArgument = 23, RULE_secondaryConstructor = 24, RULE_constructorDelegationCall = 25, 
		RULE_classBody = 26, RULE_classMember = 27, RULE_loadScript = 28, RULE_initializerBody = 29, 
		RULE_partnerDeclaration = 30, RULE_typeArguments = 31, RULE_typeProjection = 32, 
		RULE_typeProjectionModifierList = 33, RULE_typeProjectionModifier = 34, 
		RULE_typeParameters = 35, RULE_typeParameter = 36, RULE_typeParameterModifierList = 37, 
		RULE_typeParameterModifier = 38, RULE_reificationModifier = 39, RULE_varianceModifier = 40, 
		RULE_type = 41, RULE_functionType = 42, RULE_receiverType = 43, RULE_functionTypeParameters = 44, 
		RULE_parenthesizedType = 45, RULE_arrayType = 46, RULE_nullableType = 47, 
		RULE_structDeclaration = 48, RULE_structBody = 49, RULE_structMember = 50, 
		RULE_enumDeclaration = 51, RULE_enumBody = 52, RULE_enumEntries = 53, 
		RULE_enumEntry = 54, RULE_extensionDeclaration = 55, RULE_extensionBody = 56, 
		RULE_extensionMember = 57, RULE_propertyDeclaration = 58, RULE_variableDeclaration = 59, 
		RULE_multiVariableDeclaration = 60, RULE_propertyBody = 61, RULE_getter = 62, 
		RULE_setter = 63, RULE_functionValueParameterWithOptionalType = 64, RULE_parameterModifiers = 65, 
		RULE_parameterWithOptionalType = 66, RULE_functionDeclaration = 67, RULE_functionValueParameters = 68, 
		RULE_functionValueParameter = 69, RULE_parameter = 70, RULE_functionBody = 71, 
		RULE_block = 72, RULE_statements = 73, RULE_statement = 74, RULE_loopStatement = 75, 
		RULE_forStatement = 76, RULE_whileStatement = 77, RULE_doWhileStatement = 78, 
		RULE_assignment = 79, RULE_expression = 80, RULE_disjunction = 81, RULE_conjunction = 82, 
		RULE_equalityComparison = 83, RULE_identityComparison = 84, RULE_comparison = 85, 
		RULE_callExpression = 86, RULE_namedInfixExpression = 87, RULE_elvisExpression = 88, 
		RULE_infixFunctionCall = 89, RULE_rangeExpression = 90, RULE_xorExpression = 91, 
		RULE_additiveExpression = 92, RULE_multiplicativeExpression = 93, RULE_exponentialExpression = 94, 
		RULE_asExpression = 95, RULE_prefixUnaryExpression = 96, RULE_postfixUnaryExpression = 97, 
		RULE_atomicExpression = 98, RULE_parenthesizedExpression = 99, RULE_contextualReference = 100, 
		RULE_callableReference = 101, RULE_anonymousObjectLiteral = 102, RULE_collectionLiteral = 103, 
		RULE_thisExpression = 104, RULE_superExpression = 105, RULE_conditionalExpression = 106, 
		RULE_ifExpression = 107, RULE_controlStructureBody = 108, RULE_matchExpression = 109, 
		RULE_matchEntry = 110, RULE_optionalTryExpression = 111, RULE_tryExpression = 112, 
		RULE_catchBlock = 113, RULE_finallyBlock = 114, RULE_jumpExpression = 115, 
		RULE_triggerExpression = 116, RULE_returnExpression = 117, RULE_continueExpression = 118, 
		RULE_breakExpression = 119, RULE_labelDefinition = 120, RULE_labelReference = 121, 
		RULE_literalConstant = 122, RULE_nullLiteral = 123, RULE_boolLiteral = 124, 
		RULE_trileanLiteral = 125, RULE_integerLiteral = 126, RULE_longLiteral = 127, 
		RULE_shortLiteral = 128, RULE_byteLiteral = 129, RULE_floatLiteral = 130, 
		RULE_doubleLiteral = 131, RULE_complexLiteral = 132, RULE_characterLiteral = 133, 
		RULE_stringLiteral = 134, RULE_lineStringLiteral = 135, RULE_multiLineStringLiteral = 136, 
		RULE_lineStringContent = 137, RULE_lineStringExpression = 138, RULE_multiLineStringContent = 139, 
		RULE_multiLineStringExpression = 140, RULE_functionLiteral = 141, RULE_lambdaLiteral = 142, 
		RULE_lambdaParameters = 143, RULE_lambdaParameter = 144, RULE_anonymousFunction = 145, 
		RULE_assignmentOperator = 146, RULE_disjunctionOperator = 147, RULE_conjunctionOperator = 148, 
		RULE_equalityOperator = 149, RULE_identityOperator = 150, RULE_comparisonOperator = 151, 
		RULE_inOperator = 152, RULE_isOperator = 153, RULE_elvisOperator = 154, 
		RULE_toOperator = 155, RULE_xorOperator = 156, RULE_additiveOperator = 157, 
		RULE_multiplicativeOperator = 158, RULE_exponentialOperator = 159, RULE_asOperator = 160, 
		RULE_unaryPrefix = 161, RULE_prefixUnaryOperator = 162, RULE_unaryPostfix = 163, 
		RULE_postfixUnaryOperator = 164, RULE_assignableExpression = 165, RULE_parenthesizedAssignableExpression = 166, 
		RULE_assignableSuffix = 167, RULE_callSuffix = 168, RULE_lambdaCallSuffix = 169, 
		RULE_annotatedLambda = 170, RULE_indexingSuffix = 171, RULE_navigationSuffix = 172, 
		RULE_memberAccessOperator = 173, RULE_modifierList = 174, RULE_modifier = 175, 
		RULE_visibilityModifier = 176, RULE_inheritanceModifier = 177, RULE_parameterModifier = 178, 
		RULE_functionModifier = 179, RULE_annotations = 180, RULE_annotation = 181, 
		RULE_unescapedAnnotation = 182, RULE_identifier = 183, RULE_simpleIdentifier = 184, 
		RULE_semi = 185;
	private static String[] makeRuleNames() {
		return new String[] {
			"aprlFile", "preamble", "namespaceHeader", "importList", "importHeader", 
			"importIdentifier", "subImportIdentifier", "singleImport", "importAlias", 
			"topLevelObject", "classDeclaration", "interfaceDeclaration", "annotationDeclaration", 
			"documentDeclaration", "primaryConstructor", "classParameters", "classParameter", 
			"delegationSpecifiers", "annotatedDelegationSpecifier", "delegationSpecifier", 
			"interfaceDelegationSpecifiers", "annotatedInterfaceDelegationSpecifier", 
			"valueArguments", "valueArgument", "secondaryConstructor", "constructorDelegationCall", 
			"classBody", "classMember", "loadScript", "initializerBody", "partnerDeclaration", 
			"typeArguments", "typeProjection", "typeProjectionModifierList", "typeProjectionModifier", 
			"typeParameters", "typeParameter", "typeParameterModifierList", "typeParameterModifier", 
			"reificationModifier", "varianceModifier", "type", "functionType", "receiverType", 
			"functionTypeParameters", "parenthesizedType", "arrayType", "nullableType", 
			"structDeclaration", "structBody", "structMember", "enumDeclaration", 
			"enumBody", "enumEntries", "enumEntry", "extensionDeclaration", "extensionBody", 
			"extensionMember", "propertyDeclaration", "variableDeclaration", "multiVariableDeclaration", 
			"propertyBody", "getter", "setter", "functionValueParameterWithOptionalType", 
			"parameterModifiers", "parameterWithOptionalType", "functionDeclaration", 
			"functionValueParameters", "functionValueParameter", "parameter", "functionBody", 
			"block", "statements", "statement", "loopStatement", "forStatement", 
			"whileStatement", "doWhileStatement", "assignment", "expression", "disjunction", 
			"conjunction", "equalityComparison", "identityComparison", "comparison", 
			"callExpression", "namedInfixExpression", "elvisExpression", "infixFunctionCall", 
			"rangeExpression", "xorExpression", "additiveExpression", "multiplicativeExpression", 
			"exponentialExpression", "asExpression", "prefixUnaryExpression", "postfixUnaryExpression", 
			"atomicExpression", "parenthesizedExpression", "contextualReference", 
			"callableReference", "anonymousObjectLiteral", "collectionLiteral", "thisExpression", 
			"superExpression", "conditionalExpression", "ifExpression", "controlStructureBody", 
			"matchExpression", "matchEntry", "optionalTryExpression", "tryExpression", 
			"catchBlock", "finallyBlock", "jumpExpression", "triggerExpression", 
			"returnExpression", "continueExpression", "breakExpression", "labelDefinition", 
			"labelReference", "literalConstant", "nullLiteral", "boolLiteral", "trileanLiteral", 
			"integerLiteral", "longLiteral", "shortLiteral", "byteLiteral", "floatLiteral", 
			"doubleLiteral", "complexLiteral", "characterLiteral", "stringLiteral", 
			"lineStringLiteral", "multiLineStringLiteral", "lineStringContent", "lineStringExpression", 
			"multiLineStringContent", "multiLineStringExpression", "functionLiteral", 
			"lambdaLiteral", "lambdaParameters", "lambdaParameter", "anonymousFunction", 
			"assignmentOperator", "disjunctionOperator", "conjunctionOperator", "equalityOperator", 
			"identityOperator", "comparisonOperator", "inOperator", "isOperator", 
			"elvisOperator", "toOperator", "xorOperator", "additiveOperator", "multiplicativeOperator", 
			"exponentialOperator", "asOperator", "unaryPrefix", "prefixUnaryOperator", 
			"unaryPostfix", "postfixUnaryOperator", "assignableExpression", "parenthesizedAssignableExpression", 
			"assignableSuffix", "callSuffix", "lambdaCallSuffix", "annotatedLambda", 
			"indexingSuffix", "navigationSuffix", "memberAccessOperator", "modifierList", 
			"modifier", "visibilityModifier", "inheritanceModifier", "parameterModifier", 
			"functionModifier", "annotations", "annotation", "unescapedAnnotation", 
			"identifier", "simpleIdentifier", "semi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'namespace'", "'using'", "'alias'", 
			"'class'", "'interface'", "'struct'", "'document'", "'anonymous'", "'enum'", 
			"'annotation'", "'partner'", "'this'", "'super'", "'sub'", "'actual'", 
			"'init'", "'exec'", "'private'", "'bounded'", "'local'", "'public'", 
			"'getter'", "'setter'", "'def'", "'const'", "'var'", "'val'", "'sample'", 
			"'cover'", "'open'", "'final'", "'inline'", "'external'", "'sync'", "'function'", 
			"'script'", "'operator'", "'extension'", "'params'", "'if'", "'unless'", 
			"'elsif'", "'else'", "'for'", "'match'", "'when'", "'do'", "'while'", 
			"'return'", "'break'", "'continue'", null, null, null, "'as'", "'as?'", 
			"'is'", "'!is'", "'in'", "'!in'", "'try'", "'try?'", "'catch'", "'finally'", 
			"'trigger'", "'true'", "'false'", "'none'", "'null'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'='", "':='", "'+'", "'+='", "'++'", "'-'", "'-='", 
			"'--'", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'^'", "'^='", null, 
			null, null, null, null, null, "','", "'.'", "'?.'", "'>..'", "'..'", 
			"'..<'", "'...'", "':'", "'::'", "';'", "'!'", "'!!'", "'?'", "'#'", 
			"'@'", "'@@'", "'?:'", "'?='", "'=='", "'!='", "'==='", "'!=='", "'<'", 
			"'!<'", "'<='", "'!<='", "'>'", "'!>'", "'>='", "'!>='", "'<-'", "'->'", 
			"'=>'", "'<=>'", "'''", null, "'\"\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "DocComment", "LineComment", "WS", "NL", "NAMESPACE", 
			"USING", "ALIAS", "CLASS", "INTERFACE", "STRUCT", "DOCUMENT", "ANONYMOUS", 
			"ENUM", "ANNOTATION", "PARTNER", "THIS", "SUPER", "SUB_", "ACTUAL", "INIT", 
			"EXEC", "PRIVATE", "BOUNDED", "LOCAL", "PUBLIC", "GETTER", "SETTER", 
			"DEF", "CONST", "VAR", "VAL", "SAMPLE", "COVER", "OPEN", "FINAL", "INLINE", 
			"EXTERNAL", "SYNC", "FUNCTION", "SCRIPT", "OPERATOR", "EXTENSION", "PARAMS", 
			"IF", "UNLESS", "ELSIF", "ELSE", "FOR", "MATCH", "WHEN", "DO", "WHILE", 
			"RETURN", "BREAK", "CONTINUE", "RETURN_AT", "BREAK_AT", "CONTINUE_AT", 
			"AS", "AS_QUEST", "IS", "NOT_IS", "IN", "NOT_IN", "TRY", "TRY_QUEST", 
			"CATCH", "FINALLY", "TRIGGER", "TRUE", "FALSE", "NONE", "NULL", "LPAREN", 
			"RPAREN", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "ASSIGN", "DEFINE", 
			"ADD", "ADD_ASSIGN", "INCR", "SUB", "SUB_ASSIGN", "DECR", "MUL", "MUL_ASSIGN", 
			"DIV", "DIV_ASSIGN", "MOD", "MOD_ASSIGN", "EXP", "EXP_ASSIGN", "CONJ", 
			"CONJ_ASSIGN", "DISJ", "DISJ_ASSIGN", "XOR", "XOR_ASSIGN", "COMMA", "PERIOD", 
			"QUEST_PERIOD", "DOWNTO", "TO", "UNTIL", "TRIPLE_PERIOD", "COLON", "DOUBLE_COLON", 
			"SEMICOLON", "EXCL", "DOUBLE_EXCL", "QUEST", "HASH", "AT", "DOUBLE_AT", 
			"ELVIS", "ELVIS_ASSIGN", "EQUAL", "NEQUAL", "IDENTICAL", "NIDENTICAL", 
			"LANGLE", "NLANGLE", "LEQ", "NLEQ", "RANGLE", "NRANGLE", "GEQ", "NGEQ", 
			"LARROW", "RARROW", "RARROW_THICK", "SPACESHIP", "SINGLE_QUOTE", "QUOTE_OPEN", 
			"TRIPLE_QUOTE_OPEN", "IntegerLiteral", "LongLiteral", "ShortLiteral", 
			"ByteLiteral", "FloatLiteral", "DoubleLiteral", "ComplexLiteral", "HexLiteral", 
			"BinLiteral", "OctalLiteral", "BooleanLiteral", "TrileanLiteral", "Identifier", 
			"LabelReference", "LabelDefinition", "FieldIdentifier", "CharacterLiteral", 
			"UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", 
			"UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "QUOTE_CLOSE", 
			"LineStrRef", "LineStrText", "LineStrEscapedChar", "LineStrExprStart", 
			"TRIPLE_QUOTE_CLOSE", "MultiLineStrQuote", "MultiLineStrRef", "MultiLineStrText", 
			"MultiLineStrEscapedChar", "MultiLineStrExprStart", "MultiLineNL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AprlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AprlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AprlFileContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AprlParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TopLevelObjectContext> topLevelObject() {
			return getRuleContexts(TopLevelObjectContext.class);
		}
		public TopLevelObjectContext topLevelObject(int i) {
			return getRuleContext(TopLevelObjectContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public AprlFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aprlFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAprlFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAprlFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAprlFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AprlFileContext aprlFile() throws RecognitionException {
		AprlFileContext _localctx = new AprlFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aprlFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					match(NL);
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(378);
			preamble();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(379);
				match(NL);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(385);
				topLevelObject();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(387); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(386);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(389); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
						{
						setState(391);
						topLevelObject();
						}
					}

					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(401);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreambleContext extends ParserRuleContext {
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public NamespaceHeaderContext namespaceHeader() {
			return getRuleContext(NamespaceHeaderContext.class,0);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMESPACE) {
				{
				setState(403);
				namespaceHeader();
				}
			}

			setState(406);
			importList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceHeaderContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(AprlParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NamespaceHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNamespaceHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNamespaceHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNamespaceHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceHeaderContext namespaceHeader() throws RecognitionException {
		NamespaceHeaderContext _localctx = new NamespaceHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(NAMESPACE);
			setState(409);
			identifier();
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(410);
				semi();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportListContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(413);
				importHeader();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportHeaderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(AprlParser.USING, 0); }
		public List<ImportIdentifierContext> importIdentifier() {
			return getRuleContexts(ImportIdentifierContext.class);
		}
		public ImportIdentifierContext importIdentifier(int i) {
			return getRuleContext(ImportIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitImportHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitImportHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(USING);
			setState(420);
			importIdentifier();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				importIdentifier();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(428);
				semi();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportIdentifierContext extends ParserRuleContext {
		public SingleImportContext singleImport() {
			return getRuleContext(SingleImportContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
		public TerminalNode MUL() { return getToken(AprlParser.MUL, 0); }
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public List<SubImportIdentifierContext> subImportIdentifier() {
			return getRuleContexts(SubImportIdentifierContext.class);
		}
		public SubImportIdentifierContext subImportIdentifier(int i) {
			return getRuleContext(SubImportIdentifierContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public ImportIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterImportIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitImportIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitImportIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportIdentifierContext importIdentifier() throws RecognitionException {
		ImportIdentifierContext _localctx = new ImportIdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importIdentifier);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				singleImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				identifier();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(433);
					match(PERIOD);
					setState(446);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(434);
						match(MUL);
						}
						break;
					case LSQUARE:
						{
						setState(435);
						match(LSQUARE);
						setState(436);
						subImportIdentifier();
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(437);
							match(COMMA);
							setState(438);
							subImportIdentifier();
							}
							}
							setState(443);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(444);
						match(RSQUARE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubImportIdentifierContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public SubImportIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subImportIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSubImportIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSubImportIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSubImportIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubImportIdentifierContext subImportIdentifier() throws RecognitionException {
		SubImportIdentifierContext _localctx = new SubImportIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subImportIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			simpleIdentifier();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(453);
				importAlias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleImportContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public SingleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSingleImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSingleImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSingleImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleImportContext singleImport() throws RecognitionException {
		SingleImportContext _localctx = new SingleImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			identifier();
			setState(457);
			importAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(AprlParser.ALIAS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterImportAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitImportAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitImportAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(ALIAS);
			setState(460);
			simpleIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelObjectContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationDeclarationContext annotationDeclaration() {
			return getRuleContext(AnnotationDeclarationContext.class,0);
		}
		public DocumentDeclarationContext documentDeclaration() {
			return getRuleContext(DocumentDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ExtensionDeclarationContext extensionDeclaration() {
			return getRuleContext(ExtensionDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TopLevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTopLevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTopLevelObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTopLevelObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelObjectContext topLevelObject() throws RecognitionException {
		TopLevelObjectContext _localctx = new TopLevelObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_topLevelObject);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				annotationDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				documentDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				extensionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(469);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(470);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AprlParser.CLASS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode LARROW() { return getToken(AprlParser.LARROW, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(473);
				modifierList();
				}
			}

			setState(476);
			match(CLASS);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(477);
				match(NL);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			simpleIdentifier();
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(484);
					match(NL);
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				typeParameters();
				}
				break;
			}
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(493);
					match(NL);
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				primaryConstructor();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(502);
					match(NL);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(LARROW);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(509);
					match(NL);
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				delegationSpecifiers();
				}
				break;
			}
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(518);
					match(NL);
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AprlParser.INTERFACE, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode LARROW() { return getToken(AprlParser.LARROW, 0); }
		public InterfaceDelegationSpecifiersContext interfaceDelegationSpecifiers() {
			return getRuleContext(InterfaceDelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(527);
				modifierList();
				}
			}

			setState(530);
			match(INTERFACE);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(531);
				match(NL);
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			simpleIdentifier();
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(538);
					match(NL);
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				typeParameters();
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(547);
					match(NL);
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				match(LARROW);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(554);
					match(NL);
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				interfaceDelegationSpecifiers();
				}
				break;
			}
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(563);
					match(NL);
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(569);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(AprlParser.ANNOTATION, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(572);
				modifierList();
				}
			}

			setState(575);
			match(ANNOTATION);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(576);
				match(NL);
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			simpleIdentifier();
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(583);
					match(NL);
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589);
				primaryConstructor();
				}
				break;
			}
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(592);
					match(NL);
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(598);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentDeclarationContext extends ParserRuleContext {
		public TerminalNode DOCUMENT() { return getToken(AprlParser.DOCUMENT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public DocumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDocumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDocumentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDocumentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentDeclarationContext documentDeclaration() throws RecognitionException {
		DocumentDeclarationContext _localctx = new DocumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_documentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(601);
				modifierList();
				}
			}

			setState(604);
			match(DOCUMENT);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(605);
				match(NL);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			simpleIdentifier();
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(612);
					match(NL);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				typeParameters();
				}
				break;
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(621);
				match(NL);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			primaryConstructor();
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(628);
					match(NL);
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ClassParametersContext classParameters() {
			return getRuleContext(ClassParametersContext.class,0);
		}
		public TerminalNode INIT() { return getToken(AprlParser.INIT, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPrimaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					setState(637);
					modifierList();
					}
				}

				setState(640);
				match(INIT);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(641);
					match(NL);
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(649);
			classParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ClassParameterContext> classParameter() {
			return getRuleContexts(ClassParameterContext.class);
		}
		public ClassParameterContext classParameter(int i) {
			return getRuleContext(ClassParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public ClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitClassParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitClassParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParametersContext classParameters() throws RecognitionException {
		ClassParametersContext _localctx = new ClassParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(LPAREN);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					match(NL);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(658);
				classParameter();
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(659);
							match(NL);
							}
							}
							setState(664);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(665);
						match(COMMA);
						setState(669);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(666);
								match(NL);
								}
								} 
							}
							setState(671);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						}
						setState(672);
						classParameter();
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(680);
				match(NL);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public ClassParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterClassParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitClassParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitClassParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParameterContext classParameter() throws RecognitionException {
		ClassParameterContext _localctx = new ClassParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(688);
				modifierList();
				}
			}

			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==VAL) {
				{
				setState(691);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(694);
				match(NL);
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			simpleIdentifier();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(701);
				match(NL);
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			match(COLON);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(708);
				match(NL);
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
			type();
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(715);
					match(NL);
					}
					}
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(721);
				match(ASSIGN);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(722);
					match(NL);
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegationSpecifiersContext extends ParserRuleContext {
		public List<AnnotatedDelegationSpecifierContext> annotatedDelegationSpecifier() {
			return getRuleContexts(AnnotatedDelegationSpecifierContext.class);
		}
		public AnnotatedDelegationSpecifierContext annotatedDelegationSpecifier(int i) {
			return getRuleContext(AnnotatedDelegationSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public DelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDelegationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDelegationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifiersContext delegationSpecifiers() throws RecognitionException {
		DelegationSpecifiersContext _localctx = new DelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			annotatedDelegationSpecifier();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(732);
						match(NL);
						}
						}
						setState(737);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(738);
					match(COMMA);
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(739);
						match(NL);
						}
						}
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(745);
					annotatedDelegationSpecifier();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedDelegationSpecifierContext extends ParserRuleContext {
		public DelegationSpecifierContext delegationSpecifier() {
			return getRuleContext(DelegationSpecifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AnnotatedDelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedDelegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotatedDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotatedDelegationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotatedDelegationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedDelegationSpecifierContext annotatedDelegationSpecifier() throws RecognitionException {
		AnnotatedDelegationSpecifierContext _localctx = new AnnotatedDelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annotatedDelegationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(751);
				annotations();
				}
			}

			setState(754);
			delegationSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDelegationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDelegationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delegationSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			identifier();
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(757);
				typeArguments();
				}
				break;
			}
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(760);
				valueArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDelegationSpecifiersContext extends ParserRuleContext {
		public List<AnnotatedInterfaceDelegationSpecifierContext> annotatedInterfaceDelegationSpecifier() {
			return getRuleContexts(AnnotatedInterfaceDelegationSpecifierContext.class);
		}
		public AnnotatedInterfaceDelegationSpecifierContext annotatedInterfaceDelegationSpecifier(int i) {
			return getRuleContext(AnnotatedInterfaceDelegationSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public InterfaceDelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDelegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInterfaceDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInterfaceDelegationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInterfaceDelegationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDelegationSpecifiersContext interfaceDelegationSpecifiers() throws RecognitionException {
		InterfaceDelegationSpecifiersContext _localctx = new InterfaceDelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceDelegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			annotatedInterfaceDelegationSpecifier();
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(764);
						match(NL);
						}
						}
						setState(769);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(770);
					match(COMMA);
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(771);
						match(NL);
						}
						}
						setState(776);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(777);
					annotatedInterfaceDelegationSpecifier();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedInterfaceDelegationSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AnnotatedInterfaceDelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedInterfaceDelegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotatedInterfaceDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotatedInterfaceDelegationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotatedInterfaceDelegationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedInterfaceDelegationSpecifierContext annotatedInterfaceDelegationSpecifier() throws RecognitionException {
		AnnotatedInterfaceDelegationSpecifierContext _localctx = new AnnotatedInterfaceDelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_annotatedInterfaceDelegationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(783);
				annotations();
				}
			}

			setState(786);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitValueArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitValueArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valueArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(LPAREN);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(789);
					match(NL);
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << ANONYMOUS) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN_AT) | (1L << BREAK_AT) | (1L << CONTINUE_AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (TRY_QUEST - 66)) | (1L << (TRIGGER - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NONE - 66)) | (1L << (NULL - 66)) | (1L << (LPAREN - 66)) | (1L << (LSQUARE - 66)) | (1L << (LCURLY - 66)) | (1L << (ADD - 66)) | (1L << (INCR - 66)) | (1L << (SUB - 66)) | (1L << (DECR - 66)) | (1L << (PERIOD - 66)) | (1L << (TRIPLE_PERIOD - 66)) | (1L << (DOUBLE_COLON - 66)) | (1L << (EXCL - 66)) | (1L << (HASH - 66)) | (1L << (DOUBLE_AT - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (QUOTE_OPEN - 138)) | (1L << (TRIPLE_QUOTE_OPEN - 138)) | (1L << (IntegerLiteral - 138)) | (1L << (LongLiteral - 138)) | (1L << (ShortLiteral - 138)) | (1L << (ByteLiteral - 138)) | (1L << (FloatLiteral - 138)) | (1L << (DoubleLiteral - 138)) | (1L << (ComplexLiteral - 138)) | (1L << (Identifier - 138)) | (1L << (CharacterLiteral - 138)))) != 0)) {
				{
				setState(795);
				valueArgument();
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(799);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(796);
							match(NL);
							}
							}
							setState(801);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(802);
						match(COMMA);
						setState(806);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(803);
								match(NL);
								}
								} 
							}
							setState(808);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
						}
						setState(809);
						valueArgument();
						}
						} 
					}
					setState(814);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(815);
					match(NL);
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(823);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public TerminalNode TRIPLE_PERIOD() { return getToken(AprlParser.TRIPLE_PERIOD, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitValueArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitValueArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(825);
				annotations();
				}
				break;
			}
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(828);
				simpleIdentifier();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(829);
					match(NL);
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(835);
				match(ASSIGN);
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(836);
						match(NL);
						}
						} 
					}
					setState(841);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRIPLE_PERIOD) {
				{
				setState(844);
				match(TRIPLE_PERIOD);
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(847);
				match(NL);
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(853);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(AprlParser.INIT, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSecondaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSecondaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_secondaryConstructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(855);
				modifierList();
				}
			}

			setState(858);
			match(INIT);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(859);
				match(NL);
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			functionValueParameters();
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(866);
					match(NL);
					}
					}
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(872);
				match(COLON);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(873);
					match(NL);
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(879);
				constructorDelegationCall();
				}
				break;
			}
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(882);
					match(NL);
					}
					} 
				}
				setState(887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(888);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AprlParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(AprlParser.SUPER, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitConstructorDelegationCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitConstructorDelegationCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDelegationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==SUPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(892);
				match(NL);
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			valueArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(LCURLY);
			setState(904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(901);
					match(NL);
					}
					} 
				}
				setState(906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(907);
				classMember();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(913);
				match(NL);
				}
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(919);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberContext extends ParserRuleContext {
		public TopLevelObjectContext topLevelObject() {
			return getRuleContext(TopLevelObjectContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public LoadScriptContext loadScript() {
			return getRuleContext(LoadScriptContext.class,0);
		}
		public InitializerBodyContext initializerBody() {
			return getRuleContext(InitializerBodyContext.class,0);
		}
		public PartnerDeclarationContext partnerDeclaration() {
			return getRuleContext(PartnerDeclarationContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(921);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(922);
				secondaryConstructor();
				}
				break;
			case 3:
				{
				setState(923);
				loadScript();
				}
				break;
			case 4:
				{
				setState(924);
				initializerBody();
				}
				break;
			case 5:
				{
				setState(925);
				partnerDeclaration();
				}
				break;
			}
			setState(929); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(928);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(931); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadScriptContext extends ParserRuleContext {
		public TerminalNode EXEC() { return getToken(AprlParser.EXEC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public LoadScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLoadScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLoadScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLoadScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadScriptContext loadScript() throws RecognitionException {
		LoadScriptContext _localctx = new LoadScriptContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loadScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(EXEC);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(934);
				match(NL);
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerBodyContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(AprlParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public InitializerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInitializerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInitializerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInitializerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerBodyContext initializerBody() throws RecognitionException {
		InitializerBodyContext _localctx = new InitializerBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initializerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(INIT);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(943);
				match(NL);
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartnerDeclarationContext extends ParserRuleContext {
		public TerminalNode PARTNER() { return getToken(AprlParser.PARTNER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public PartnerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partnerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPartnerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPartnerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPartnerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartnerDeclarationContext partnerDeclaration() throws RecognitionException {
		PartnerDeclarationContext _localctx = new PartnerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_partnerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(951);
				modifierList();
				}
			}

			setState(954);
			match(PARTNER);
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(955);
					match(NL);
					}
					}
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(961);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(AprlParser.LANGLE, 0); }
		public List<TypeProjectionContext> typeProjection() {
			return getRuleContexts(TypeProjectionContext.class);
		}
		public TypeProjectionContext typeProjection(int i) {
			return getRuleContext(TypeProjectionContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(AprlParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(LANGLE);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(965);
				match(NL);
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			typeProjection();
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(972);
						match(NL);
						}
						}
						setState(977);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(978);
					match(COMMA);
					setState(979);
					typeProjection();
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(985);
				match(NL);
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			match(RANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeProjectionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeProjectionModifierListContext typeProjectionModifierList() {
			return getRuleContext(TypeProjectionModifierListContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(AprlParser.QUEST, 0); }
		public TypeProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProjectionContext typeProjection() throws RecognitionException {
		TypeProjectionContext _localctx = new TypeProjectionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeProjection);
		try {
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case SUB_:
			case LPAREN:
			case LSQUARE:
			case HASH:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(993);
					typeProjectionModifierList();
					}
					break;
				}
				setState(996);
				type();
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(QUEST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeProjectionModifierListContext extends ParserRuleContext {
		public List<TypeProjectionModifierContext> typeProjectionModifier() {
			return getRuleContexts(TypeProjectionModifierContext.class);
		}
		public TypeProjectionModifierContext typeProjectionModifier(int i) {
			return getRuleContext(TypeProjectionModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeProjectionModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjectionModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeProjectionModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeProjectionModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeProjectionModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProjectionModifierListContext typeProjectionModifierList() throws RecognitionException {
		TypeProjectionModifierListContext _localctx = new TypeProjectionModifierListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeProjectionModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1000);
					typeProjectionModifier();
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1001);
						match(NL);
						}
						}
						setState(1006);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1009); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeProjectionModifierContext extends ParserRuleContext {
		public VarianceModifierContext varianceModifier() {
			return getRuleContext(VarianceModifierContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeProjectionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjectionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeProjectionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeProjectionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeProjectionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProjectionModifierContext typeProjectionModifier() throws RecognitionException {
		TypeProjectionModifierContext _localctx = new TypeProjectionModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeProjectionModifier);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case SUB_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				varianceModifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(AprlParser.LANGLE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(AprlParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(LANGLE);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1016);
				match(NL);
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022);
			typeParameter();
			setState(1039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1023);
						match(NL);
						}
						}
						setState(1028);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1029);
					match(COMMA);
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1030);
						match(NL);
						}
						}
						setState(1035);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1036);
					typeParameter();
					}
					} 
				}
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1042);
				match(NL);
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048);
			match(RANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeParameterModifierListContext typeParameterModifierList() {
			return getRuleContext(TypeParameterModifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> CONJ() { return getTokens(AprlParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(AprlParser.CONJ, i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << SUB_) | (1L << ACTUAL))) != 0) || _la==HASH) {
				{
				setState(1050);
				typeParameterModifierList();
				}
			}

			setState(1053);
			simpleIdentifier();
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1054);
					match(NL);
					}
					}
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1060);
				match(COLON);
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1061);
					match(NL);
					}
					}
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1067);
				type();
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1071);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1068);
							match(NL);
							}
							}
							setState(1073);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1074);
						match(CONJ);
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1075);
							match(NL);
							}
							}
							setState(1080);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1081);
						type();
						}
						} 
					}
					setState(1086);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierListContext extends ParserRuleContext {
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeParameterModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeParameterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeParameterModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeParameterModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierListContext typeParameterModifierList() throws RecognitionException {
		TypeParameterModifierListContext _localctx = new TypeParameterModifierListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeParameterModifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1089);
				typeParameterModifier();
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1090);
					match(NL);
					}
					}
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << SUB_) | (1L << ACTUAL))) != 0) || _la==HASH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public ReificationModifierContext reificationModifier() {
			return getRuleContext(ReificationModifierContext.class,0);
		}
		public VarianceModifierContext varianceModifier() {
			return getRuleContext(VarianceModifierContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeParameterModifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTUAL:
				{
				setState(1100);
				reificationModifier();
				}
				break;
			case SUPER:
			case SUB_:
				{
				setState(1101);
				varianceModifier();
				}
				break;
			case HASH:
				{
				setState(1102);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1105);
					match(NL);
					}
					} 
				}
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReificationModifierContext extends ParserRuleContext {
		public TerminalNode ACTUAL() { return getToken(AprlParser.ACTUAL, 0); }
		public ReificationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reificationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterReificationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitReificationModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitReificationModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReificationModifierContext reificationModifier() throws RecognitionException {
		ReificationModifierContext _localctx = new ReificationModifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_reificationModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(ACTUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianceModifierContext extends ParserRuleContext {
		public TerminalNode SUB_() { return getToken(AprlParser.SUB_, 0); }
		public TerminalNode SUPER() { return getToken(AprlParser.SUPER, 0); }
		public VarianceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterVarianceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitVarianceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitVarianceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarianceModifierContext varianceModifier() throws RecognitionException {
		VarianceModifierContext _localctx = new VarianceModifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_varianceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_la = _input.LA(1);
			if ( !(_la==SUPER || _la==SUB_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1115);
				annotations();
				}
			}

			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1118);
				functionType();
				}
				break;
			case 2:
				{
				setState(1119);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1120);
				arrayType();
				}
				break;
			case 4:
				{
				setState(1121);
				nullableType();
				}
				break;
			case 5:
				{
				setState(1122);
				identifier();
				setState(1124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1123);
					typeArguments();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeParametersContext functionTypeParameters() {
			return getRuleContext(FunctionTypeParametersContext.class,0);
		}
		public TerminalNode RARROW_THICK() { return getToken(AprlParser.RARROW_THICK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			functionTypeParameters();
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1129);
				match(NL);
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1135);
			match(RARROW_THICK);
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1136);
				match(NL);
				}
				}
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1142);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverTypeContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitReceiverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitReceiverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_receiverType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1144);
				annotations();
				}
			}

			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1147);
				parenthesizedType();
				}
				break;
			case 2:
				{
				setState(1148);
				nullableType();
				}
				break;
			case 3:
				{
				setState(1149);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public FunctionTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParametersContext functionTypeParameters() throws RecognitionException {
		FunctionTypeParametersContext _localctx = new FunctionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionTypeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(LPAREN);
			setState(1156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1153);
					match(NL);
					}
					} 
				}
				setState(1158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LPAREN - 75)) | (1L << (LSQUARE - 75)) | (1L << (HASH - 75)))) != 0) || _la==Identifier) {
				{
				setState(1159);
				type();
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1160);
							match(NL);
							}
							}
							setState(1165);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1166);
						match(COMMA);
						setState(1170);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1167);
							match(NL);
							}
							}
							setState(1172);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1173);
						type();
						}
						} 
					}
					setState(1178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				}
			}

			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1181);
				match(NL);
				}
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1187);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parenthesizedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(LPAREN);
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1190);
				match(NL);
				}
				}
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1196);
			type();
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1197);
				match(NL);
				}
				}
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1203);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(LSQUARE);
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1206);
				match(NL);
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			type();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1213);
				match(NL);
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullableTypeContext extends ParserRuleContext {
		public TerminalNode QUEST() { return getToken(AprlParser.QUEST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_nullableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1221);
				identifier();
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGLE) {
					{
					setState(1222);
					typeArguments();
					}
				}

				}
				break;
			case LPAREN:
				{
				setState(1225);
				parenthesizedType();
				}
				break;
			case LSQUARE:
				{
				setState(1226);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1229);
			match(QUEST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(AprlParser.STRUCT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode LARROW() { return getToken(AprlParser.LARROW, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1231);
				modifierList();
				}
			}

			setState(1234);
			match(STRUCT);
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1235);
				match(NL);
				}
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1241);
			simpleIdentifier();
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1242);
					match(NL);
					}
					}
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1248);
				match(LARROW);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1249);
					match(NL);
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1255);
				delegationSpecifiers();
				}
				break;
			}
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1258);
					match(NL);
					}
					}
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1264);
				structBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(LCURLY);
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1268);
					match(NL);
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1274);
				structMember();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1280);
				match(NL);
				}
				}
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1286);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructMemberContext extends ParserRuleContext {
		public TopLevelObjectContext topLevelObject() {
			return getRuleContext(TopLevelObjectContext.class,0);
		}
		public LoadScriptContext loadScript() {
			return getRuleContext(LoadScriptContext.class,0);
		}
		public InitializerBodyContext initializerBody() {
			return getRuleContext(InitializerBodyContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStructMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStructMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_structMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case INTERFACE:
			case STRUCT:
			case DOCUMENT:
			case ENUM:
			case ANNOTATION:
			case PRIVATE:
			case BOUNDED:
			case LOCAL:
			case PUBLIC:
			case DEF:
			case CONST:
			case VAR:
			case VAL:
			case SAMPLE:
			case COVER:
			case OPEN:
			case FINAL:
			case INLINE:
			case EXTERNAL:
			case SYNC:
			case FUNCTION:
			case SCRIPT:
			case OPERATOR:
			case EXTENSION:
			case PARAMS:
			case HASH:
				{
				setState(1288);
				topLevelObject();
				}
				break;
			case EXEC:
				{
				setState(1289);
				loadScript();
				}
				break;
			case INIT:
				{
				setState(1290);
				initializerBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1294); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1293);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AprlParser.ENUM, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1298);
				modifierList();
				}
			}

			setState(1301);
			match(ENUM);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1302);
				match(NL);
				}
				}
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1308);
			simpleIdentifier();
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1309);
					match(NL);
					}
					}
					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1315);
				primaryConstructor();
				}
				break;
			}
			{
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1318);
				match(NL);
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1324);
			enumBody();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AprlParser.SEMICOLON, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(LCURLY);
			setState(1330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1327);
					match(NL);
					}
					} 
				}
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1333);
				enumEntries();
				}
			}

			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1336);
					match(NL);
					}
					}
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1342);
				match(SEMICOLON);
				setState(1346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1343);
						match(NL);
						}
						} 
					}
					setState(1348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					{
					setState(1349);
					classMember();
					}
					}
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1357);
				match(NL);
				}
				}
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1363);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntriesContext extends ParserRuleContext {
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEnumEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEnumEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			enumEntry();
			setState(1382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1366);
						match(NL);
						}
						}
						setState(1371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1372);
					match(COMMA);
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1373);
						match(NL);
						}
						}
						setState(1378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1379);
					enumEntry();
					}
					} 
				}
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntryContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEnumEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEnumEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1385);
				modifierList();
				}
			}

			setState(1388);
			simpleIdentifier();
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1389);
					match(NL);
					}
					}
					setState(1394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1395);
				valueArguments();
				}
				break;
			}
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1398);
					match(NL);
					}
					}
					setState(1403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1404);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTENSION() { return getToken(AprlParser.EXTENSION, 0); }
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ExtensionBodyContext extensionBody() {
			return getRuleContext(ExtensionBodyContext.class,0);
		}
		public ExtensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExtensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExtensionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExtensionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionDeclarationContext extensionDeclaration() throws RecognitionException {
		ExtensionDeclarationContext _localctx = new ExtensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1407);
				modifierList();
				}
			}

			setState(1410);
			match(EXTENSION);
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1411);
					match(NL);
					}
					}
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1417);
				typeParameters();
				}
				break;
			}
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1420);
				match(NL);
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1426);
			receiverType();
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1427);
					match(NL);
					}
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1433);
				extensionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ExtensionMemberContext> extensionMember() {
			return getRuleContexts(ExtensionMemberContext.class);
		}
		public ExtensionMemberContext extensionMember(int i) {
			return getRuleContext(ExtensionMemberContext.class,i);
		}
		public ExtensionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExtensionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExtensionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExtensionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionBodyContext extensionBody() throws RecognitionException {
		ExtensionBodyContext _localctx = new ExtensionBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_extensionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(LCURLY);
			setState(1440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1437);
					match(NL);
					}
					} 
				}
				setState(1442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1443);
				extensionMember();
				}
				}
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1449);
				match(NL);
				}
				}
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1455);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionMemberContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ExtensionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExtensionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExtensionMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExtensionMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionMemberContext extensionMember() throws RecognitionException {
		ExtensionMemberContext _localctx = new ExtensionMemberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_extensionMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1457);
				functionDeclaration();
				}
				break;
			case 2:
				{
				setState(1458);
				propertyDeclaration();
				}
				break;
			case 3:
				{
				setState(1459);
				secondaryConstructor();
				}
				break;
			}
			setState(1463); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1462);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1465); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(AprlParser.DEF, 0); }
		public TerminalNode CONST() { return getToken(AprlParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyBodyContext propertyBody() {
			return getRuleContext(PropertyBodyContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1467);
				modifierList();
				}
			}

			setState(1470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1471);
					match(NL);
					}
					}
					setState(1476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1477);
				typeParameters();
				}
				break;
			}
			{
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1480);
				match(NL);
				}
				}
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				{
				setState(1486);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1487);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1490);
					match(NL);
					}
					}
					setState(1495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1496);
				match(ASSIGN);
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1497);
					match(NL);
					}
					}
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1503);
				expression();
				}
				break;
			}
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1506);
					match(NL);
					}
					}
					setState(1511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1512);
				propertyBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1515);
				annotations();
				}
			}

			setState(1518);
			simpleIdentifier();
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1519);
					match(NL);
					}
					}
					setState(1524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1525);
				match(COLON);
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1526);
					match(NL);
					}
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532);
				type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public MultiVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiVariableDeclarationContext multiVariableDeclaration() throws RecognitionException {
		MultiVariableDeclarationContext _localctx = new MultiVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_multiVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(LPAREN);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1536);
				match(NL);
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1542);
			variableDeclaration();
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1543);
						match(NL);
						}
						}
						setState(1548);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1549);
					match(COMMA);
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1550);
						match(NL);
						}
						}
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1556);
					variableDeclaration();
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1562);
				match(NL);
				}
				}
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1568);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public PropertyBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPropertyBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPropertyBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPropertyBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBodyContext propertyBody() throws RecognitionException {
		PropertyBodyContext _localctx = new PropertyBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_propertyBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(LCURLY);
			setState(1574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1571);
					match(NL);
					}
					} 
				}
				setState(1576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1577);
				getter();
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1578);
						semi();
						}
						}
						setState(1583);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1584);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1587);
				setter();
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1588);
						semi();
						}
						}
						setState(1593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1594);
					getter();
					}
					break;
				}
				}
				break;
			}
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1599);
				match(NL);
				}
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1605);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GETTER() { return getToken(AprlParser.GETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public TerminalNode RARROW() { return getToken(AprlParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_getter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1607);
				modifierList();
				}
			}

			setState(1610);
			match(GETTER);
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1611);
					match(NL);
					}
					}
					setState(1616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1617);
				match(LPAREN);
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1618);
					match(NL);
					}
					}
					setState(1623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1624);
				match(RPAREN);
				}
				break;
			}
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1627);
					match(NL);
					}
					}
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1633);
				match(RARROW);
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1634);
					match(NL);
					}
					}
					setState(1639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1640);
				type();
				}
				break;
			}
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1643);
					match(NL);
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==ASSIGN) {
				{
				setState(1649);
				functionBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SETTER() { return getToken(AprlParser.SETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public FunctionValueParameterWithOptionalTypeContext functionValueParameterWithOptionalType() {
			return getRuleContext(FunctionValueParameterWithOptionalTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public TerminalNode RARROW() { return getToken(AprlParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_setter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1652);
				modifierList();
				}
			}

			setState(1655);
			match(SETTER);
			setState(1659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1656);
					match(NL);
					}
					} 
				}
				setState(1661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1662);
					match(LPAREN);
					setState(1666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1663);
						match(NL);
						}
						}
						setState(1668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1669);
					functionValueParameterWithOptionalType();
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1670);
						match(NL);
						}
						}
						setState(1675);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1676);
					match(RPAREN);
					}
				}

				setState(1694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1680);
						match(NL);
						}
						}
						setState(1685);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1686);
					match(RARROW);
					setState(1690);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1687);
						match(NL);
						}
						}
						setState(1692);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1693);
					type();
					}
					break;
				}
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1696);
					match(NL);
					}
					}
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1702);
				functionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionValueParameterWithOptionalTypeContext extends ParserRuleContext {
		public ParameterWithOptionalTypeContext parameterWithOptionalType() {
			return getRuleContext(ParameterWithOptionalTypeContext.class,0);
		}
		public ParameterModifiersContext parameterModifiers() {
			return getRuleContext(ParameterModifiersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionValueParameterWithOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameterWithOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionValueParameterWithOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionValueParameterWithOptionalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionValueParameterWithOptionalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueParameterWithOptionalTypeContext functionValueParameterWithOptionalType() throws RecognitionException {
		FunctionValueParameterWithOptionalTypeContext _localctx = new FunctionValueParameterWithOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionValueParameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH) {
				{
				setState(1705);
				parameterModifiers();
				}
			}

			setState(1708);
			parameterWithOptionalType();
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1709);
					match(NL);
					}
					}
					setState(1714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1715);
				match(ASSIGN);
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1716);
					match(NL);
					}
					}
					setState(1721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1722);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterModifiersContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ParameterModifierContext> parameterModifier() {
			return getRuleContexts(ParameterModifierContext.class);
		}
		public ParameterModifierContext parameterModifier(int i) {
			return getRuleContext(ParameterModifierContext.class,i);
		}
		public ParameterModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParameterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParameterModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParameterModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterModifiersContext parameterModifiers() throws RecognitionException {
		ParameterModifiersContext _localctx = new ParameterModifiersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(1725);
					annotation();
					}
					break;
				case PARAMS:
					{
					setState(1726);
					parameterModifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1729); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARAMS || _la==HASH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterWithOptionalTypeContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ParameterWithOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWithOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParameterWithOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParameterWithOptionalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParameterWithOptionalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterWithOptionalTypeContext parameterWithOptionalType() throws RecognitionException {
		ParameterWithOptionalTypeContext _localctx = new ParameterWithOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			simpleIdentifier();
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1732);
					match(NL);
					}
					}
					setState(1737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1738);
				match(COLON);
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1739);
					match(NL);
					}
					}
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1745);
				type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AprlParser.FUNCTION, 0); }
		public TerminalNode SCRIPT() { return getToken(AprlParser.SCRIPT, 0); }
		public TerminalNode OPERATOR() { return getToken(AprlParser.OPERATOR, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode RARROW() { return getToken(AprlParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1748);
				modifierList();
				}
			}

			setState(1751);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1752);
					match(NL);
					}
					}
					setState(1757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1758);
				typeParameters();
				}
				break;
			}
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1761);
				match(NL);
				}
				}
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1767);
			simpleIdentifier();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1768);
				match(NL);
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1774);
			functionValueParameters();
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1775);
					match(NL);
					}
					}
					setState(1780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1781);
				match(RARROW);
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1782);
					match(NL);
					}
					}
					setState(1787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1788);
				type();
				}
				break;
			}
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1791);
					match(NL);
					}
					}
					setState(1796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1797);
				functionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionValueParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<FunctionValueParameterContext> functionValueParameter() {
			return getRuleContexts(FunctionValueParameterContext.class);
		}
		public FunctionValueParameterContext functionValueParameter(int i) {
			return getRuleContext(FunctionValueParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public FunctionValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionValueParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionValueParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueParametersContext functionValueParameters() throws RecognitionException {
		FunctionValueParametersContext _localctx = new FunctionValueParametersContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionValueParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(LPAREN);
			setState(1804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1801);
					match(NL);
					}
					} 
				}
				setState(1806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH || _la==Identifier) {
				{
				setState(1807);
				functionValueParameter();
				setState(1824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1811);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1808);
							match(NL);
							}
							}
							setState(1813);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1814);
						match(COMMA);
						setState(1818);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1815);
							match(NL);
							}
							}
							setState(1820);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1821);
						functionValueParameter();
						}
						} 
					}
					setState(1826);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
				}
			}

			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1829);
				match(NL);
				}
				}
				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1835);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionValueParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterModifiersContext parameterModifiers() {
			return getRuleContext(ParameterModifiersContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionValueParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionValueParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueParameterContext functionValueParameter() throws RecognitionException {
		FunctionValueParameterContext _localctx = new FunctionValueParameterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH) {
				{
				setState(1837);
				parameterModifiers();
				}
			}

			setState(1840);
			parameter();
			setState(1855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1841);
					match(NL);
					}
					}
					setState(1846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1847);
				match(ASSIGN);
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1848);
					match(NL);
					}
					}
					setState(1853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1854);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			simpleIdentifier();
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1858);
				match(NL);
				}
				}
				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1864);
			match(COLON);
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1865);
				match(NL);
				}
				}
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1871);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionBody);
		int _la;
		try {
			setState(1882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				match(ASSIGN);
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1875);
					match(NL);
					}
					}
					setState(1880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1881);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(LCURLY);
			setState(1888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1885);
					match(NL);
					}
					} 
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			setState(1891);
			statements();
			setState(1895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1892);
				match(NL);
				}
				}
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1898);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(1900);
				statement();
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1902); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1901);
								semi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1904); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1906);
						statement();
						}
						} 
					}
					setState(1912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				}
				}
				break;
			}
			setState(1918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1915);
					semi();
					}
					} 
				}
				setState(1920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TopLevelObjectContext topLevelObject() {
			return getRuleContext(TopLevelObjectContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LabelDefinitionContext> labelDefinition() {
			return getRuleContexts(LabelDefinitionContext.class);
		}
		public LabelDefinitionContext labelDefinition(int i) {
			return getRuleContext(LabelDefinitionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1923);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(1921);
						labelDefinition();
						}
						break;
					case HASH:
						{
						setState(1922);
						annotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			}
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1928);
				match(NL);
				}
				}
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(1934);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(1935);
				assignment();
				}
				break;
			case 3:
				{
				setState(1936);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(1937);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_loopStatement);
		try {
			setState(1943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				doWhileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AprlParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(AprlParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			match(FOR);
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1946);
				match(NL);
				}
				}
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1952);
			match(LPAREN);
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1953);
				match(NL);
				}
				}
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(1959);
				annotations();
				}
				break;
			}
			setState(1964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				{
				setState(1962);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1963);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1966);
				match(NL);
				}
				}
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1972);
			match(IN);
			setState(1976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1973);
				match(NL);
				}
				}
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1979);
			expression();
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1980);
				match(NL);
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1986);
			match(RPAREN);
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1987);
				match(NL);
				}
				}
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1993);
			controlStructureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AprlParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(WHILE);
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1996);
				match(NL);
				}
				}
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2002);
			match(LPAREN);
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2003);
				match(NL);
				}
				}
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			expression();
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2010);
				match(NL);
				}
				}
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2016);
			match(RPAREN);
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2017);
				match(NL);
				}
				}
				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2023);
			controlStructureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AprlParser.DO, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AprlParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			match(DO);
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2026);
				match(NL);
				}
				}
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2032);
			controlStructureBody();
			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2033);
				match(NL);
				}
				}
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2039);
			match(WHILE);
			setState(2043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2040);
				match(NL);
				}
				}
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2046);
			match(LPAREN);
			setState(2050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2047);
				match(NL);
				}
				}
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2053);
			expression();
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2054);
				match(NL);
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2060);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2062);
				assignableExpression();
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2063);
						match(NL);
						}
						} 
					}
					setState(2068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
				}
				setState(2069);
				assignmentOperator();
				}
				break;
			}
			setState(2073);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			disjunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<DisjunctionOperatorContext> disjunctionOperator() {
			return getRuleContexts(DisjunctionOperatorContext.class);
		}
		public DisjunctionOperatorContext disjunctionOperator(int i) {
			return getRuleContext(DisjunctionOperatorContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			conjunction();
			setState(2083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2078);
					disjunctionOperator();
					setState(2079);
					conjunction();
					}
					} 
				}
				setState(2085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityComparisonContext> equalityComparison() {
			return getRuleContexts(EqualityComparisonContext.class);
		}
		public EqualityComparisonContext equalityComparison(int i) {
			return getRuleContext(EqualityComparisonContext.class,i);
		}
		public List<ConjunctionOperatorContext> conjunctionOperator() {
			return getRuleContexts(ConjunctionOperatorContext.class);
		}
		public ConjunctionOperatorContext conjunctionOperator(int i) {
			return getRuleContext(ConjunctionOperatorContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			equalityComparison();
			setState(2092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2087);
					conjunctionOperator();
					setState(2088);
					equalityComparison();
					}
					} 
				}
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityComparisonContext extends ParserRuleContext {
		public List<IdentityComparisonContext> identityComparison() {
			return getRuleContexts(IdentityComparisonContext.class);
		}
		public IdentityComparisonContext identityComparison(int i) {
			return getRuleContext(IdentityComparisonContext.class,i);
		}
		public List<EqualityOperatorContext> equalityOperator() {
			return getRuleContexts(EqualityOperatorContext.class);
		}
		public EqualityOperatorContext equalityOperator(int i) {
			return getRuleContext(EqualityOperatorContext.class,i);
		}
		public EqualityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityComparisonContext equalityComparison() throws RecognitionException {
		EqualityComparisonContext _localctx = new EqualityComparisonContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			identityComparison();
			setState(2101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2096);
					equalityOperator();
					setState(2097);
					identityComparison();
					}
					} 
				}
				setState(2103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityComparisonContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<IdentityOperatorContext> identityOperator() {
			return getRuleContexts(IdentityOperatorContext.class);
		}
		public IdentityOperatorContext identityOperator(int i) {
			return getRuleContext(IdentityOperatorContext.class,i);
		}
		public IdentityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIdentityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIdentityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIdentityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityComparisonContext identityComparison() throws RecognitionException {
		IdentityComparisonContext _localctx = new IdentityComparisonContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			comparison();
			setState(2110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2105);
					identityOperator();
					setState(2106);
					comparison();
					}
					} 
				}
				setState(2112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<CallExpressionContext> callExpression() {
			return getRuleContexts(CallExpressionContext.class);
		}
		public CallExpressionContext callExpression(int i) {
			return getRuleContext(CallExpressionContext.class,i);
		}
		public List<ComparisonOperatorContext> comparisonOperator() {
			return getRuleContexts(ComparisonOperatorContext.class);
		}
		public ComparisonOperatorContext comparisonOperator(int i) {
			return getRuleContext(ComparisonOperatorContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
			callExpression();
			setState(2119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2114);
					comparisonOperator();
					setState(2115);
					callExpression();
					}
					} 
				}
				setState(2121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpressionContext extends ParserRuleContext {
		public NamedInfixExpressionContext namedInfixExpression() {
			return getRuleContext(NamedInfixExpressionContext.class,0);
		}
		public List<CallSuffixContext> callSuffix() {
			return getRuleContexts(CallSuffixContext.class);
		}
		public CallSuffixContext callSuffix(int i) {
			return getRuleContext(CallSuffixContext.class,i);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_callExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			namedInfixExpression();
			setState(2126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2123);
					callSuffix();
					}
					} 
				}
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedInfixExpressionContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public List<InOperatorContext> inOperator() {
			return getRuleContexts(InOperatorContext.class);
		}
		public InOperatorContext inOperator(int i) {
			return getRuleContext(InOperatorContext.class,i);
		}
		public List<IsOperatorContext> isOperator() {
			return getRuleContexts(IsOperatorContext.class);
		}
		public IsOperatorContext isOperator(int i) {
			return getRuleContext(IsOperatorContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public NamedInfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNamedInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNamedInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNamedInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedInfixExpressionContext namedInfixExpression() throws RecognitionException {
		NamedInfixExpressionContext _localctx = new NamedInfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namedInfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			elvisExpression();
			setState(2138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						setState(2130);
						inOperator();
						setState(2131);
						elvisExpression();
						}
						break;
					case 2:
						{
						setState(2133);
						isOperator();
						setState(2134);
						type();
						}
						break;
					}
					} 
				}
				setState(2140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElvisExpressionContext extends ParserRuleContext {
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<ElvisOperatorContext> elvisOperator() {
			return getRuleContexts(ElvisOperatorContext.class);
		}
		public ElvisOperatorContext elvisOperator(int i) {
			return getRuleContext(ElvisOperatorContext.class,i);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitElvisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitElvisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			infixFunctionCall();
			setState(2147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2142);
					elvisOperator();
					setState(2143);
					infixFunctionCall();
					}
					} 
				}
				setState(2149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInfixFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInfixFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			rangeExpression();
			setState(2156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2151);
					simpleIdentifier();
					setState(2152);
					rangeExpression();
					}
					} 
				}
				setState(2158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<XorExpressionContext> xorExpression() {
			return getRuleContexts(XorExpressionContext.class);
		}
		public XorExpressionContext xorExpression(int i) {
			return getRuleContext(XorExpressionContext.class,i);
		}
		public ToOperatorContext toOperator() {
			return getRuleContext(ToOperatorContext.class,0);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			xorExpression();
			setState(2163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2160);
				toOperator();
				setState(2161);
				xorExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<XorOperatorContext> xorOperator() {
			return getRuleContexts(XorOperatorContext.class);
		}
		public XorOperatorContext xorOperator(int i) {
			return getRuleContext(XorOperatorContext.class,i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			additiveExpression();
			setState(2171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2166);
					xorOperator();
					setState(2167);
					additiveExpression();
					}
					} 
				}
				setState(2173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			multiplicativeExpression();
			setState(2180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2175);
					additiveOperator();
					setState(2176);
					multiplicativeExpression();
					}
					} 
				}
				setState(2182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<ExponentialExpressionContext> exponentialExpression() {
			return getRuleContexts(ExponentialExpressionContext.class);
		}
		public ExponentialExpressionContext exponentialExpression(int i) {
			return getRuleContext(ExponentialExpressionContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			exponentialExpression();
			setState(2189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2184);
					multiplicativeOperator();
					setState(2185);
					exponentialExpression();
					}
					} 
				}
				setState(2191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialExpressionContext extends ParserRuleContext {
		public List<AsExpressionContext> asExpression() {
			return getRuleContexts(AsExpressionContext.class);
		}
		public AsExpressionContext asExpression(int i) {
			return getRuleContext(AsExpressionContext.class,i);
		}
		public List<ExponentialOperatorContext> exponentialOperator() {
			return getRuleContexts(ExponentialOperatorContext.class);
		}
		public ExponentialOperatorContext exponentialOperator(int i) {
			return getRuleContext(ExponentialOperatorContext.class,i);
		}
		public ExponentialExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentialExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExponentialExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExponentialExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExponentialExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentialExpressionContext exponentialExpression() throws RecognitionException {
		ExponentialExpressionContext _localctx = new ExponentialExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exponentialExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			asExpression();
			setState(2198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2193);
					exponentialOperator();
					setState(2194);
					asExpression();
					}
					} 
				}
				setState(2200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsExpressionContext extends ParserRuleContext {
		public PrefixUnaryExpressionContext prefixUnaryExpression() {
			return getRuleContext(PrefixUnaryExpressionContext.class,0);
		}
		public List<AsOperatorContext> asOperator() {
			return getRuleContexts(AsOperatorContext.class);
		}
		public AsOperatorContext asOperator(int i) {
			return getRuleContext(AsOperatorContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public AsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsExpressionContext asExpression() throws RecognitionException {
		AsExpressionContext _localctx = new AsExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_asExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			prefixUnaryExpression();
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2202);
					asOperator();
					setState(2203);
					type();
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<UnaryPrefixContext> unaryPrefix() {
			return getRuleContexts(UnaryPrefixContext.class);
		}
		public UnaryPrefixContext unaryPrefix(int i) {
			return getRuleContext(UnaryPrefixContext.class,i);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPrefixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2210);
					unaryPrefix();
					}
					} 
				}
				setState(2215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2216);
			postfixUnaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public List<UnaryPostfixContext> unaryPostfix() {
			return getRuleContexts(UnaryPostfixContext.class);
		}
		public UnaryPostfixContext unaryPostfix(int i) {
			return getRuleContext(UnaryPostfixContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPostfixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPostfixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			atomicExpression();
			setState(2222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2219);
					unaryPostfix();
					}
					} 
				}
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicExpressionContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public ContextualReferenceContext contextualReference() {
			return getRuleContext(ContextualReferenceContext.class,0);
		}
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public AnonymousObjectLiteralContext anonymousObjectLiteral() {
			return getRuleContext(AnonymousObjectLiteralContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperExpressionContext superExpression() {
			return getRuleContext(SuperExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public OptionalTryExpressionContext optionalTryExpression() {
			return getRuleContext(OptionalTryExpressionContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public JumpExpressionContext jumpExpression() {
			return getRuleContext(JumpExpressionContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_atomicExpression);
		try {
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2225);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				simpleIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2227);
				literalConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2228);
				contextualReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2229);
				callableReference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2230);
				functionLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2231);
				anonymousObjectLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2232);
				collectionLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2233);
				thisExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2234);
				superExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2235);
				conditionalExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2236);
				optionalTryExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2237);
				tryExpression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2238);
				jumpExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(LPAREN);
			setState(2242);
			expression();
			setState(2243);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextualReferenceContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContextualReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextualReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterContextualReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitContextualReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitContextualReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextualReferenceContext contextualReference() throws RecognitionException {
		ContextualReferenceContext _localctx = new ContextualReferenceContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_contextualReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(PERIOD);
			setState(2246);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallableReferenceContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(AprlParser.DOUBLE_COLON, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(AprlParser.CLASS, 0); }
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCallableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCallableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LPAREN - 75)) | (1L << (LSQUARE - 75)) | (1L << (HASH - 75)))) != 0) || _la==Identifier) {
				{
				setState(2248);
				receiverType();
				}
			}

			setState(2251);
			match(DOUBLE_COLON);
			setState(2255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2252);
				match(NL);
				}
				}
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(2258);
				simpleIdentifier();
				}
				break;
			case CLASS:
				{
				setState(2259);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousObjectLiteralContext extends ParserRuleContext {
		public TerminalNode ANONYMOUS() { return getToken(AprlParser.ANONYMOUS, 0); }
		public TerminalNode LARROW() { return getToken(AprlParser.LARROW, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnonymousObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousObjectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnonymousObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnonymousObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnonymousObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousObjectLiteralContext anonymousObjectLiteral() throws RecognitionException {
		AnonymousObjectLiteralContext _localctx = new AnonymousObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_anonymousObjectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			match(ANONYMOUS);
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2263);
					match(NL);
					}
					}
					setState(2268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2269);
				match(LARROW);
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2270);
					match(NL);
					}
					}
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2276);
				delegationSpecifiers();
				}
				break;
			}
			setState(2286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2279);
					match(NL);
					}
					}
					setState(2284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2285);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public CollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCollectionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCollectionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_collectionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			match(LSQUARE);
			setState(2292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2289);
					match(NL);
					}
					} 
				}
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			setState(2296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN_AT) | (1L << BREAK_AT) | (1L << CONTINUE_AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (TRY_QUEST - 66)) | (1L << (TRIGGER - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NONE - 66)) | (1L << (NULL - 66)) | (1L << (LPAREN - 66)) | (1L << (LSQUARE - 66)) | (1L << (LCURLY - 66)) | (1L << (ADD - 66)) | (1L << (INCR - 66)) | (1L << (SUB - 66)) | (1L << (DECR - 66)) | (1L << (PERIOD - 66)) | (1L << (DOUBLE_COLON - 66)) | (1L << (EXCL - 66)) | (1L << (HASH - 66)) | (1L << (DOUBLE_AT - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (QUOTE_OPEN - 138)) | (1L << (TRIPLE_QUOTE_OPEN - 138)) | (1L << (IntegerLiteral - 138)) | (1L << (LongLiteral - 138)) | (1L << (ShortLiteral - 138)) | (1L << (ByteLiteral - 138)) | (1L << (FloatLiteral - 138)) | (1L << (DoubleLiteral - 138)) | (1L << (ComplexLiteral - 138)) | (1L << (Identifier - 138)) | (1L << (CharacterLiteral - 138)))) != 0)) {
				{
				setState(2295);
				expression();
				}
			}

			setState(2314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2298);
						match(NL);
						}
						}
						setState(2303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2304);
					match(COMMA);
					setState(2308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2305);
						match(NL);
						}
						}
						setState(2310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2311);
					expression();
					}
					} 
				}
				setState(2316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2317);
				match(NL);
				}
				}
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2323);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AprlParser.THIS, 0); }
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_thisExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			match(THIS);
			setState(2327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2326);
				labelReference();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperExpressionContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(AprlParser.SUPER, 0); }
		public TerminalNode LANGLE() { return getToken(AprlParser.LANGLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(AprlParser.RANGLE, 0); }
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public SuperExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperExpressionContext superExpression() throws RecognitionException {
		SuperExpressionContext _localctx = new SuperExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			match(SUPER);
			setState(2346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2330);
				match(LANGLE);
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2331);
					match(NL);
					}
					}
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2337);
				type();
				setState(2341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2338);
					match(NL);
					}
					}
					setState(2343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2344);
				match(RANGLE);
				}
				break;
			}
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2348);
				labelReference();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_conditionalExpression);
		try {
			setState(2353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case UNLESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				ifExpression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2352);
				matchExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(AprlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AprlParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AprlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AprlParser.RPAREN, i);
		}
		public List<ControlStructureBodyContext> controlStructureBody() {
			return getRuleContexts(ControlStructureBodyContext.class);
		}
		public ControlStructureBodyContext controlStructureBody(int i) {
			return getRuleContext(ControlStructureBodyContext.class,i);
		}
		public TerminalNode IF() { return getToken(AprlParser.IF, 0); }
		public TerminalNode UNLESS() { return getToken(AprlParser.UNLESS, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> ELSIF() { return getTokens(AprlParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(AprlParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(AprlParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==UNLESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2356);
				match(NL);
				}
				}
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2362);
			match(LPAREN);
			setState(2366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2363);
				match(NL);
				}
				}
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2369);
			expression();
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2370);
				match(NL);
				}
				}
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2376);
			match(RPAREN);
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2377);
				match(NL);
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			controlStructureBody();
			setState(2422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2384);
						match(NL);
						}
						}
						setState(2389);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2390);
					match(ELSIF);
					setState(2394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2391);
						match(NL);
						}
						}
						setState(2396);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2397);
					match(LPAREN);
					setState(2401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2398);
						match(NL);
						}
						}
						setState(2403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2404);
					expression();
					setState(2408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2405);
						match(NL);
						}
						}
						setState(2410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2411);
					match(RPAREN);
					setState(2415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2412);
						match(NL);
						}
						}
						setState(2417);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2418);
					controlStructureBody();
					}
					} 
				}
				setState(2424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			}
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2425);
					match(NL);
					}
					}
					setState(2430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2431);
				match(ELSE);
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2432);
					match(NL);
					}
					}
					setState(2437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2438);
				controlStructureBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlStructureBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ControlStructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterControlStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitControlStructureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitControlStructureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_controlStructureBody);
		try {
			setState(2443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2441);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2442);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchExpressionContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(AprlParser.MATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<MatchEntryContext> matchEntry() {
			return getRuleContexts(MatchEntryContext.class);
		}
		public MatchEntryContext matchEntry(int i) {
			return getRuleContext(MatchEntryContext.class,i);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			match(MATCH);
			setState(2449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2446);
				match(NL);
				}
				}
				setState(2451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2452);
			match(LPAREN);
			setState(2456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2453);
				match(NL);
				}
				}
				setState(2458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2459);
			expression();
			setState(2463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2460);
				match(NL);
				}
				}
				setState(2465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2466);
			match(RPAREN);
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2467);
				match(NL);
				}
				}
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2473);
			match(LCURLY);
			setState(2477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2474);
				match(NL);
				}
				}
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2487); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2480);
				matchEntry();
				setState(2484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2481);
						match(NL);
						}
						} 
					}
					setState(2486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
				}
				}
				}
				setState(2489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ELSE || _la==WHEN );
			setState(2494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2491);
				match(NL);
				}
				}
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2497);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchEntryContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(AprlParser.WHEN, 0); }
		public List<LiteralConstantContext> literalConstant() {
			return getRuleContexts(LiteralConstantContext.class);
		}
		public LiteralConstantContext literalConstant(int i) {
			return getRuleContext(LiteralConstantContext.class,i);
		}
		public TerminalNode RARROW_THICK() { return getToken(AprlParser.RARROW_THICK, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(AprlParser.ELSE, 0); }
		public MatchEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMatchEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMatchEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMatchEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchEntryContext matchEntry() throws RecognitionException {
		MatchEntryContext _localctx = new MatchEntryContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_matchEntry);
		int _la;
		try {
			int _alt;
			setState(2558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2499);
				match(WHEN);
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2500);
					match(NL);
					}
					}
					setState(2505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2506);
				literalConstant();
				setState(2523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2510);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2507);
							match(NL);
							}
							}
							setState(2512);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2513);
						match(COMMA);
						setState(2517);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2514);
							match(NL);
							}
							}
							setState(2519);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2520);
						literalConstant();
						}
						} 
					}
					setState(2525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				setState(2529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2526);
					match(NL);
					}
					}
					setState(2531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2532);
				match(RARROW_THICK);
				setState(2536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2533);
					match(NL);
					}
					}
					setState(2538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2539);
				controlStructureBody();
				setState(2541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2540);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2543);
				match(ELSE);
				setState(2547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2544);
					match(NL);
					}
					}
					setState(2549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2550);
				match(RARROW_THICK);
				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2551);
					match(NL);
					}
					}
					setState(2556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2557);
				controlStructureBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTryExpressionContext extends ParserRuleContext {
		public TerminalNode TRY_QUEST() { return getToken(AprlParser.TRY_QUEST, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public OptionalTryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalTryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterOptionalTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitOptionalTryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitOptionalTryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalTryExpressionContext optionalTryExpression() throws RecognitionException {
		OptionalTryExpressionContext _localctx = new OptionalTryExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_optionalTryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			match(TRY_QUEST);
			setState(2564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2561);
				match(NL);
				}
				}
				setState(2566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2567);
				block();
				}
				break;
			case 2:
				{
				setState(2568);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryExpressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AprlParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			match(TRY);
			setState(2575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2572);
				match(NL);
				}
				}
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2578);
			block();
			setState(2588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2579);
						match(NL);
						}
						}
						setState(2584);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2585);
					catchBlock();
					}
					} 
				}
				setState(2590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			}
			setState(2598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2591);
					match(NL);
					}
					}
					setState(2596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2597);
				finallyBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(AprlParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<TerminalNode> CONJ() { return getTokens(AprlParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(AprlParser.CONJ, i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_catchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			match(CATCH);
			setState(2604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2601);
				match(NL);
				}
				}
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2607);
			match(LPAREN);
			setState(2611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2608);
				match(NL);
				}
				}
				setState(2613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(2614);
				annotations();
				}
			}

			setState(2617);
			simpleIdentifier();
			setState(2621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2618);
				match(NL);
				}
				}
				setState(2623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2624);
			match(COLON);
			setState(2628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2625);
				match(NL);
				}
				}
				setState(2630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2631);
			identifier();
			setState(2648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2632);
						match(NL);
						}
						}
						setState(2637);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2638);
					match(CONJ);
					setState(2642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2639);
						match(NL);
						}
						}
						setState(2644);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2645);
					identifier();
					}
					} 
				}
				setState(2650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			}
			setState(2654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2651);
				match(NL);
				}
				}
				setState(2656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2657);
			match(RPAREN);
			setState(2661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2658);
				match(NL);
				}
				}
				setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2664);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(AprlParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			match(FINALLY);
			setState(2670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2667);
				match(NL);
				}
				}
				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2673);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpExpressionContext extends ParserRuleContext {
		public TriggerExpressionContext triggerExpression() {
			return getRuleContext(TriggerExpressionContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public ContinueExpressionContext continueExpression() {
			return getRuleContext(ContinueExpressionContext.class,0);
		}
		public BreakExpressionContext breakExpression() {
			return getRuleContext(BreakExpressionContext.class,0);
		}
		public JumpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterJumpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitJumpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitJumpExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpExpressionContext jumpExpression() throws RecognitionException {
		JumpExpressionContext _localctx = new JumpExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_jumpExpression);
		try {
			setState(2679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2675);
				triggerExpression();
				}
				break;
			case RETURN:
			case RETURN_AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2676);
				returnExpression();
				}
				break;
			case CONTINUE:
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2677);
				continueExpression();
				}
				break;
			case BREAK:
			case BREAK_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2678);
				breakExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerExpressionContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(AprlParser.TRIGGER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TriggerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTriggerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTriggerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTriggerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerExpressionContext triggerExpression() throws RecognitionException {
		TriggerExpressionContext _localctx = new TriggerExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_triggerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			match(TRIGGER);
			setState(2685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2682);
				match(NL);
				}
				}
				setState(2687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2688);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AprlParser.RETURN, 0); }
		public TerminalNode RETURN_AT() { return getToken(AprlParser.RETURN_AT, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_returnExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			_la = _input.LA(1);
			if ( !(_la==RETURN || _la==RETURN_AT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,393,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2691);
					match(NL);
					}
					} 
				}
				setState(2696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,393,_ctx);
			}
			setState(2698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				{
				setState(2697);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueExpressionContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AprlParser.CONTINUE, 0); }
		public TerminalNode CONTINUE_AT() { return getToken(AprlParser.CONTINUE_AT, 0); }
		public ContinueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterContinueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitContinueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitContinueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueExpressionContext continueExpression() throws RecognitionException {
		ContinueExpressionContext _localctx = new ContinueExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_continueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2700);
			_la = _input.LA(1);
			if ( !(_la==CONTINUE || _la==CONTINUE_AT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakExpressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AprlParser.BREAK, 0); }
		public TerminalNode BREAK_AT() { return getToken(AprlParser.BREAK_AT, 0); }
		public BreakExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakExpressionContext breakExpression() throws RecognitionException {
		BreakExpressionContext _localctx = new BreakExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_breakExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==BREAK_AT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode AT() { return getToken(AprlParser.AT, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
			simpleIdentifier();
			setState(2705);
			match(AT);
			setState(2709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2706);
					match(NL);
					}
					} 
				}
				setState(2711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelReferenceContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AprlParser.AT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public LabelReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLabelReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLabelReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLabelReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelReferenceContext labelReference() throws RecognitionException {
		LabelReferenceContext _localctx = new LabelReferenceContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			match(AT);
			setState(2713);
			simpleIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralConstantContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public TrileanLiteralContext trileanLiteral() {
			return getRuleContext(TrileanLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public ShortLiteralContext shortLiteral() {
			return getRuleContext(ShortLiteralContext.class,0);
		}
		public ByteLiteralContext byteLiteral() {
			return getRuleContext(ByteLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public ComplexLiteralContext complexLiteral() {
			return getRuleContext(ComplexLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_literalConstant);
		try {
			setState(2727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2715);
				nullLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2716);
				boolLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2717);
				trileanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2718);
				integerLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2719);
				longLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2720);
				shortLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2721);
				byteLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2722);
				floatLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2723);
				doubleLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2724);
				complexLiteral();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2725);
				characterLiteral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2726);
				stringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(AprlParser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2729);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AprlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AprlParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrileanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AprlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AprlParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(AprlParser.NONE, 0); }
		public TrileanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trileanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterTrileanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitTrileanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitTrileanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrileanLiteralContext trileanLiteral() throws RecognitionException {
		TrileanLiteralContext _localctx = new TrileanLiteralContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_trileanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NONE - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AprlParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongLiteralContext extends ParserRuleContext {
		public TerminalNode LongLiteral() { return getToken(AprlParser.LongLiteral, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLongLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			match(LongLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortLiteralContext extends ParserRuleContext {
		public TerminalNode ShortLiteral() { return getToken(AprlParser.ShortLiteral, 0); }
		public ShortLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterShortLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitShortLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitShortLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortLiteralContext shortLiteral() throws RecognitionException {
		ShortLiteralContext _localctx = new ShortLiteralContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_shortLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
			match(ShortLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByteLiteralContext extends ParserRuleContext {
		public TerminalNode ByteLiteral() { return getToken(AprlParser.ByteLiteral, 0); }
		public ByteLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterByteLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitByteLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitByteLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteLiteralContext byteLiteral() throws RecognitionException {
		ByteLiteralContext _localctx = new ByteLiteralContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_byteLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			match(ByteLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(AprlParser.FloatLiteral, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
			match(FloatLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode DoubleLiteral() { return getToken(AprlParser.DoubleLiteral, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
			match(DoubleLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexLiteralContext extends ParserRuleContext {
		public TerminalNode ComplexLiteral() { return getToken(AprlParser.ComplexLiteral, 0); }
		public ComplexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterComplexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitComplexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitComplexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexLiteralContext complexLiteral() throws RecognitionException {
		ComplexLiteralContext _localctx = new ComplexLiteralContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_complexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			match(ComplexLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(AprlParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2749);
			match(CharacterLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_stringLiteral);
		try {
			setState(2753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2751);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				multiLineStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(AprlParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(AprlParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public List<LineStringExpressionContext> lineStringExpression() {
			return getRuleContexts(LineStringExpressionContext.class);
		}
		public LineStringExpressionContext lineStringExpression(int i) {
			return getRuleContext(LineStringExpressionContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			match(QUOTE_OPEN);
			setState(2760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (LineStrRef - 165)) | (1L << (LineStrText - 165)) | (1L << (LineStrEscapedChar - 165)) | (1L << (LineStrExprStart - 165)))) != 0)) {
				{
				setState(2758);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(2756);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(2757);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2763);
			match(QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(AprlParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(AprlParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<MultiLineStringExpressionContext> multiLineStringExpression() {
			return getRuleContexts(MultiLineStringExpressionContext.class);
		}
		public MultiLineStringExpressionContext multiLineStringExpression(int i) {
			return getRuleContext(MultiLineStringExpressionContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public List<TerminalNode> MultiLineStrQuote() { return getTokens(AprlParser.MultiLineStrQuote); }
		public TerminalNode MultiLineStrQuote(int i) {
			return getToken(AprlParser.MultiLineStrQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			match(TRIPLE_QUOTE_OPEN);
			setState(2772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (QUOTE_OPEN - 138)) | (1L << (MultiLineStrQuote - 138)) | (1L << (MultiLineStrRef - 138)) | (1L << (MultiLineStrText - 138)) | (1L << (MultiLineStrEscapedChar - 138)) | (1L << (MultiLineStrExprStart - 138)))) != 0)) {
				{
				setState(2770);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(2766);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(2767);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(2768);
					lineStringLiteral();
					}
					break;
				case MultiLineStrQuote:
					{
					setState(2769);
					match(MultiLineStrQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2775);
			match(TRIPLE_QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(AprlParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(AprlParser.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(AprlParser.LineStrRef, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			_la = _input.LA(1);
			if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (LineStrRef - 165)) | (1L << (LineStrText - 165)) | (1L << (LineStrEscapedChar - 165)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringExpressionContext extends ParserRuleContext {
		public TerminalNode LineStrExprStart() { return getToken(AprlParser.LineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public LineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringExpressionContext lineStringExpression() throws RecognitionException {
		LineStringExpressionContext _localctx = new LineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			match(LineStrExprStart);
			setState(2780);
			expression();
			setState(2781);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(AprlParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(AprlParser.MultiLineStrEscapedChar, 0); }
		public TerminalNode MultiLineStrRef() { return getToken(AprlParser.MultiLineStrRef, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
			_la = _input.LA(1);
			if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (MultiLineStrRef - 171)) | (1L << (MultiLineStrText - 171)) | (1L << (MultiLineStrEscapedChar - 171)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringExpressionContext extends ParserRuleContext {
		public TerminalNode MultiLineStrExprStart() { return getToken(AprlParser.MultiLineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public MultiLineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringExpressionContext multiLineStringExpression() throws RecognitionException {
		MultiLineStringExpressionContext _localctx = new MultiLineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			match(MultiLineStrExprStart);
			setState(2786);
			expression();
			setState(2787);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public LambdaLiteralContext lambdaLiteral() {
			return getRuleContext(LambdaLiteralContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_functionLiteral);
		try {
			setState(2791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				lambdaLiteral();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
				anonymousFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode RARROW_THICK() { return getToken(AprlParser.RARROW_THICK, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLambdaLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLambdaLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLambdaLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLiteralContext lambdaLiteral() throws RecognitionException {
		LambdaLiteralContext _localctx = new LambdaLiteralContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_lambdaLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			match(LCURLY);
			setState(2797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2794);
					match(NL);
					}
					} 
				}
				setState(2799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
			}
			setState(2816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(2801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==HASH || _la==Identifier) {
					{
					setState(2800);
					lambdaParameters();
					}
				}

				setState(2806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2803);
					match(NL);
					}
					}
					setState(2808);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2809);
				match(RARROW_THICK);
				setState(2813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2810);
						match(NL);
						}
						} 
					}
					setState(2815);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
				}
				}
				break;
			}
			setState(2818);
			statements();
			setState(2822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2819);
				match(NL);
				}
				}
				setState(2824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2825);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<LambdaParameterContext> lambdaParameter() {
			return getRuleContexts(LambdaParameterContext.class);
		}
		public LambdaParameterContext lambdaParameter(int i) {
			return getRuleContext(LambdaParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			lambdaParameter();
			setState(2844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2831);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2828);
						match(NL);
						}
						}
						setState(2833);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2834);
					match(COMMA);
					setState(2838);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2835);
						match(NL);
						}
						}
						setState(2840);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2841);
					lambdaParameter();
					}
					} 
				}
				setState(2846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParameterContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public LambdaParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLambdaParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLambdaParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLambdaParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				{
				setState(2847);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2848);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				{
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2851);
					match(NL);
					}
					}
					setState(2856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2857);
				match(COLON);
				setState(2861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2858);
					match(NL);
					}
					}
					setState(2863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2864);
				type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AprlParser.FUNCTION, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode RARROW() { return getToken(AprlParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			match(FUNCTION);
			setState(2871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2868);
				match(NL);
				}
				}
				setState(2873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2874);
			functionValueParameters();
			setState(2889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
			case 1:
				{
				setState(2878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2875);
					match(NL);
					}
					}
					setState(2880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2881);
				match(RARROW);
				setState(2885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2882);
					match(NL);
					}
					}
					setState(2887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2888);
				type();
				}
				break;
			}
			setState(2898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				{
				setState(2894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2891);
					match(NL);
					}
					}
					setState(2896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2897);
				functionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public TerminalNode DEFINE() { return getToken(AprlParser.DEFINE, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(AprlParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(AprlParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(AprlParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(AprlParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(AprlParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(AprlParser.EXP_ASSIGN, 0); }
		public TerminalNode CONJ_ASSIGN() { return getToken(AprlParser.CONJ_ASSIGN, 0); }
		public TerminalNode DISJ_ASSIGN() { return getToken(AprlParser.DISJ_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(AprlParser.XOR_ASSIGN, 0); }
		public TerminalNode ELVIS_ASSIGN() { return getToken(AprlParser.ELVIS_ASSIGN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2900);
				match(NL);
				}
				}
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2906);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ASSIGN - 81)) | (1L << (DEFINE - 81)) | (1L << (ADD_ASSIGN - 81)) | (1L << (SUB_ASSIGN - 81)) | (1L << (MUL_ASSIGN - 81)) | (1L << (DIV_ASSIGN - 81)) | (1L << (MOD_ASSIGN - 81)) | (1L << (EXP_ASSIGN - 81)) | (1L << (CONJ_ASSIGN - 81)) | (1L << (DISJ_ASSIGN - 81)) | (1L << (XOR_ASSIGN - 81)) | (1L << (ELVIS_ASSIGN - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2907);
				match(NL);
				}
				}
				setState(2912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionOperatorContext extends ParserRuleContext {
		public TerminalNode DISJ() { return getToken(AprlParser.DISJ, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public DisjunctionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterDisjunctionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitDisjunctionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitDisjunctionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionOperatorContext disjunctionOperator() throws RecognitionException {
		DisjunctionOperatorContext _localctx = new DisjunctionOperatorContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_disjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2913);
				match(NL);
				}
				}
				setState(2918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2919);
			match(DISJ);
			setState(2923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2920);
				match(NL);
				}
				}
				setState(2925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionOperatorContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(AprlParser.CONJ, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ConjunctionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterConjunctionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitConjunctionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitConjunctionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionOperatorContext conjunctionOperator() throws RecognitionException {
		ConjunctionOperatorContext _localctx = new ConjunctionOperatorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_conjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2926);
				match(NL);
				}
				}
				setState(2931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2932);
			match(CONJ);
			setState(2936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2933);
				match(NL);
				}
				}
				setState(2938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AprlParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(AprlParser.NEQUAL, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2939);
				match(NL);
				}
				}
				setState(2944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2945);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2946);
				match(NL);
				}
				}
				setState(2951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityOperatorContext extends ParserRuleContext {
		public TerminalNode IDENTICAL() { return getToken(AprlParser.IDENTICAL, 0); }
		public TerminalNode NIDENTICAL() { return getToken(AprlParser.NIDENTICAL, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public IdentityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIdentityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIdentityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIdentityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityOperatorContext identityOperator() throws RecognitionException {
		IdentityOperatorContext _localctx = new IdentityOperatorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_identityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2952);
				match(NL);
				}
				}
				setState(2957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2958);
			_la = _input.LA(1);
			if ( !(_la==IDENTICAL || _la==NIDENTICAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2959);
				match(NL);
				}
				}
				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(AprlParser.LANGLE, 0); }
		public TerminalNode NLANGLE() { return getToken(AprlParser.NLANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(AprlParser.RANGLE, 0); }
		public TerminalNode NRANGLE() { return getToken(AprlParser.NRANGLE, 0); }
		public TerminalNode LEQ() { return getToken(AprlParser.LEQ, 0); }
		public TerminalNode NLEQ() { return getToken(AprlParser.NLEQ, 0); }
		public TerminalNode GEQ() { return getToken(AprlParser.GEQ, 0); }
		public TerminalNode NGEQ() { return getToken(AprlParser.NGEQ, 0); }
		public TerminalNode SPACESHIP() { return getToken(AprlParser.SPACESHIP, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2965);
				match(NL);
				}
				}
				setState(2970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2971);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (LANGLE - 125)) | (1L << (NLANGLE - 125)) | (1L << (LEQ - 125)) | (1L << (NLEQ - 125)) | (1L << (RANGLE - 125)) | (1L << (NRANGLE - 125)) | (1L << (GEQ - 125)) | (1L << (NGEQ - 125)) | (1L << (SPACESHIP - 125)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2972);
				match(NL);
				}
				}
				setState(2977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(AprlParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(AprlParser.NOT_IN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2978);
				match(NL);
				}
				}
				setState(2983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2984);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2985);
				match(NL);
				}
				}
				setState(2990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOperatorContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(AprlParser.IS, 0); }
		public TerminalNode NOT_IS() { return getToken(AprlParser.NOT_IS, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2991);
				match(NL);
				}
				}
				setState(2996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2997);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2998);
				match(NL);
				}
				}
				setState(3003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElvisOperatorContext extends ParserRuleContext {
		public TerminalNode ELVIS() { return getToken(AprlParser.ELVIS, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ElvisOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterElvisOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitElvisOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitElvisOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisOperatorContext elvisOperator() throws RecognitionException {
		ElvisOperatorContext _localctx = new ElvisOperatorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_elvisOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3004);
				match(NL);
				}
				}
				setState(3009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3010);
			match(ELVIS);
			setState(3014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3011);
				match(NL);
				}
				}
				setState(3016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToOperatorContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(AprlParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(AprlParser.DOWNTO, 0); }
		public TerminalNode UNTIL() { return getToken(AprlParser.UNTIL, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitToOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitToOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToOperatorContext toOperator() throws RecognitionException {
		ToOperatorContext _localctx = new ToOperatorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_toOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3017);
				match(NL);
				}
				}
				setState(3022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3023);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (DOWNTO - 106)) | (1L << (TO - 106)) | (1L << (UNTIL - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3024);
				match(NL);
				}
				}
				setState(3029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorOperatorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(AprlParser.XOR, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public XorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterXorOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitXorOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitXorOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorOperatorContext xorOperator() throws RecognitionException {
		XorOperatorContext _localctx = new XorOperatorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_xorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3030);
				match(NL);
				}
				}
				setState(3035);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3036);
			match(XOR);
			setState(3040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3037);
				match(NL);
				}
				}
				setState(3042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AprlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AprlParser.SUB, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3043);
				match(NL);
				}
				}
				setState(3048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3049);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3050);
				match(NL);
				}
				}
				setState(3055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(AprlParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AprlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AprlParser.MOD, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3056);
				match(NL);
				}
				}
				setState(3061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3062);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3063);
				match(NL);
				}
				}
				setState(3068);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialOperatorContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(AprlParser.EXP, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ExponentialOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentialOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterExponentialOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitExponentialOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitExponentialOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentialOperatorContext exponentialOperator() throws RecognitionException {
		ExponentialOperatorContext _localctx = new ExponentialOperatorContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_exponentialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3069);
				match(NL);
				}
				}
				setState(3074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3075);
			match(EXP);
			setState(3079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3076);
				match(NL);
				}
				}
				setState(3081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsOperatorContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(AprlParser.AS, 0); }
		public TerminalNode AS_QUEST() { return getToken(AprlParser.AS_QUEST, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsOperatorContext asOperator() throws RecognitionException {
		AsOperatorContext _localctx = new AsOperatorContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3082);
				match(NL);
				}
				}
				setState(3087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3088);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==AS_QUEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3089);
				match(NL);
				}
				}
				setState(3094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPrefixContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public PrefixUnaryOperatorContext prefixUnaryOperator() {
			return getRuleContext(PrefixUnaryOperatorContext.class,0);
		}
		public UnaryPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterUnaryPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitUnaryPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitUnaryPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPrefixContext unaryPrefix() throws RecognitionException {
		UnaryPrefixContext _localctx = new UnaryPrefixContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_unaryPrefix);
		try {
			setState(3098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(3095);
				annotation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3096);
				labelDefinition();
				}
				break;
			case ADD:
			case INCR:
			case SUB:
			case DECR:
			case EXCL:
			case DOUBLE_AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3097);
				prefixUnaryOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(AprlParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(AprlParser.DECR, 0); }
		public TerminalNode ADD() { return getToken(AprlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AprlParser.SUB, 0); }
		public TerminalNode EXCL() { return getToken(AprlParser.EXCL, 0); }
		public TerminalNode DOUBLE_AT() { return getToken(AprlParser.DOUBLE_AT, 0); }
		public PrefixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPrefixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPrefixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPrefixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOperatorContext prefixUnaryOperator() throws RecognitionException {
		PrefixUnaryOperatorContext _localctx = new PrefixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3100);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ADD - 83)) | (1L << (INCR - 83)) | (1L << (SUB - 83)) | (1L << (DECR - 83)) | (1L << (EXCL - 83)) | (1L << (DOUBLE_AT - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPostfixContext extends ParserRuleContext {
		public PostfixUnaryOperatorContext postfixUnaryOperator() {
			return getRuleContext(PostfixUnaryOperatorContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public IndexingSuffixContext indexingSuffix() {
			return getRuleContext(IndexingSuffixContext.class,0);
		}
		public NavigationSuffixContext navigationSuffix() {
			return getRuleContext(NavigationSuffixContext.class,0);
		}
		public UnaryPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterUnaryPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitUnaryPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitUnaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPostfixContext unaryPostfix() throws RecognitionException {
		UnaryPostfixContext _localctx = new UnaryPostfixContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_unaryPostfix);
		try {
			setState(3107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,453,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3102);
				postfixUnaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3103);
				typeArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3104);
				callSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3105);
				indexingSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3106);
				navigationSuffix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(AprlParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(AprlParser.DECR, 0); }
		public TerminalNode DOUBLE_EXCL() { return getToken(AprlParser.DOUBLE_EXCL, 0); }
		public PostfixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterPostfixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitPostfixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitPostfixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryOperatorContext postfixUnaryOperator() throws RecognitionException {
		PostfixUnaryOperatorContext _localctx = new PostfixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3109);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INCR - 85)) | (1L << (DECR - 85)) | (1L << (DOUBLE_EXCL - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public AssignableSuffixContext assignableSuffix() {
			return getRuleContext(AssignableSuffixContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ParenthesizedAssignableExpressionContext parenthesizedAssignableExpression() {
			return getRuleContext(ParenthesizedAssignableExpressionContext.class,0);
		}
		public AssignableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAssignableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAssignableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAssignableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableExpressionContext assignableExpression() throws RecognitionException {
		AssignableExpressionContext _localctx = new AssignableExpressionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_assignableExpression);
		try {
			setState(3116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,454,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3111);
				postfixUnaryExpression();
				setState(3112);
				assignableSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3114);
				simpleIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3115);
				parenthesizedAssignableExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedAssignableExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ParenthesizedAssignableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedAssignableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParenthesizedAssignableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParenthesizedAssignableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParenthesizedAssignableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedAssignableExpressionContext parenthesizedAssignableExpression() throws RecognitionException {
		ParenthesizedAssignableExpressionContext _localctx = new ParenthesizedAssignableExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_parenthesizedAssignableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3118);
			match(LPAREN);
			setState(3122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3119);
				match(NL);
				}
				}
				setState(3124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3125);
			assignableExpression();
			setState(3129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3126);
				match(NL);
				}
				}
				setState(3131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3132);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableSuffixContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IndexingSuffixContext indexingSuffix() {
			return getRuleContext(IndexingSuffixContext.class,0);
		}
		public NavigationSuffixContext navigationSuffix() {
			return getRuleContext(NavigationSuffixContext.class,0);
		}
		public AssignableSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAssignableSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAssignableSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAssignableSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableSuffixContext assignableSuffix() throws RecognitionException {
		AssignableSuffixContext _localctx = new AssignableSuffixContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_assignableSuffix);
		try {
			setState(3137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3134);
				typeArguments();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3135);
				indexingSuffix();
				}
				break;
			case NL:
			case PERIOD:
			case QUEST_PERIOD:
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3136);
				navigationSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSuffixContext extends ParserRuleContext {
		public LambdaCallSuffixContext lambdaCallSuffix() {
			return getRuleContext(LambdaCallSuffixContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_callSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(3139);
				typeArguments();
				}
			}

			setState(3144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,459,_ctx) ) {
			case 1:
				{
				setState(3142);
				lambdaCallSuffix();
				}
				break;
			case 2:
				{
				setState(3143);
				valueArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaCallSuffixContext extends ParserRuleContext {
		public AnnotatedLambdaContext annotatedLambda() {
			return getRuleContext(AnnotatedLambdaContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public LambdaCallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCallSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLambdaCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLambdaCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLambdaCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaCallSuffixContext lambdaCallSuffix() throws RecognitionException {
		LambdaCallSuffixContext _localctx = new LambdaCallSuffixContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_lambdaCallSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3146);
				valueArguments();
				}
			}

			setState(3149);
			annotatedLambda();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public LambdaLiteralContext lambdaLiteral() {
			return getRuleContext(LambdaLiteralContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotatedLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotatedLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(3151);
				annotations();
				}
			}

			setState(3155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(3154);
				labelDefinition();
				}
			}

			setState(3160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3157);
				match(NL);
				}
				}
				setState(3162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3163);
			lambdaLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingSuffixContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public IndexingSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIndexingSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIndexingSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIndexingSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingSuffixContext indexingSuffix() throws RecognitionException {
		IndexingSuffixContext _localctx = new IndexingSuffixContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_indexingSuffix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3165);
			match(LSQUARE);
			setState(3169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3166);
				match(NL);
				}
				}
				setState(3171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3172);
			expression();
			setState(3189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,467,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3173);
						match(NL);
						}
						}
						setState(3178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3179);
					match(COMMA);
					setState(3183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3180);
						match(NL);
						}
						}
						setState(3185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3186);
					expression();
					}
					} 
				}
				setState(3191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,467,_ctx);
			}
			setState(3195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3192);
				match(NL);
				}
				}
				setState(3197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3198);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationSuffixContext extends ParserRuleContext {
		public MemberAccessOperatorContext memberAccessOperator() {
			return getRuleContext(MemberAccessOperatorContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public NavigationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNavigationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNavigationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNavigationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationSuffixContext navigationSuffix() throws RecognitionException {
		NavigationSuffixContext _localctx = new NavigationSuffixContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3200);
			memberAccessOperator();
			setState(3203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(3201);
				simpleIdentifier();
				}
				break;
			case LPAREN:
				{
				setState(3202);
				parenthesizedExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessOperatorContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
		public TerminalNode QUEST_PERIOD() { return getToken(AprlParser.QUEST_PERIOD, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(AprlParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public MemberAccessOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMemberAccessOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMemberAccessOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMemberAccessOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessOperatorContext memberAccessOperator() throws RecognitionException {
		MemberAccessOperatorContext _localctx = new MemberAccessOperatorContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_memberAccessOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3205);
				match(NL);
				}
				}
				setState(3210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3211);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PERIOD - 104)) | (1L << (QUEST_PERIOD - 104)) | (1L << (DOUBLE_COLON - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3212);
				match(NL);
				}
				}
				setState(3217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_modifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(3218);
					annotations();
					setState(3222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,472,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3219);
							match(NL);
							}
							} 
						}
						setState(3224);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,472,_ctx);
					}
					}
					break;
				case PRIVATE:
				case BOUNDED:
				case LOCAL:
				case PUBLIC:
				case SAMPLE:
				case COVER:
				case OPEN:
				case FINAL:
				case INLINE:
				case EXTERNAL:
				case SYNC:
				case PARAMS:
					{
					setState(3225);
					modifier();
					setState(3229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3226);
							match(NL);
							}
							} 
						}
						setState(3231);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public InheritanceModifierContext inheritanceModifier() {
			return getRuleContext(InheritanceModifierContext.class,0);
		}
		public ParameterModifierContext parameterModifier() {
			return getRuleContext(ParameterModifierContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_modifier);
		try {
			setState(3240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case BOUNDED:
			case LOCAL:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3236);
				visibilityModifier();
				}
				break;
			case SAMPLE:
			case COVER:
			case OPEN:
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3237);
				inheritanceModifier();
				}
				break;
			case PARAMS:
				enterOuterAlt(_localctx, 3);
				{
				setState(3238);
				parameterModifier();
				}
				break;
			case INLINE:
			case EXTERNAL:
			case SYNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(3239);
				functionModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AprlParser.PUBLIC, 0); }
		public TerminalNode LOCAL() { return getToken(AprlParser.LOCAL, 0); }
		public TerminalNode BOUNDED() { return getToken(AprlParser.BOUNDED, 0); }
		public TerminalNode PRIVATE() { return getToken(AprlParser.PRIVATE, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterVisibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitVisibilityModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitVisibilityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceModifierContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(AprlParser.SAMPLE, 0); }
		public TerminalNode FINAL() { return getToken(AprlParser.FINAL, 0); }
		public TerminalNode OPEN() { return getToken(AprlParser.OPEN, 0); }
		public TerminalNode COVER() { return getToken(AprlParser.COVER, 0); }
		public InheritanceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterInheritanceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitInheritanceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitInheritanceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceModifierContext inheritanceModifier() throws RecognitionException {
		InheritanceModifierContext _localctx = new InheritanceModifierContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterModifierContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(AprlParser.PARAMS, 0); }
		public ParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterModifierContext parameterModifier() throws RecognitionException {
		ParameterModifierContext _localctx = new ParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_parameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3246);
			match(PARAMS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionModifierContext extends ParserRuleContext {
		public TerminalNode INLINE() { return getToken(AprlParser.INLINE, 0); }
		public TerminalNode SYNC() { return getToken(AprlParser.SYNC, 0); }
		public TerminalNode EXTERNAL() { return getToken(AprlParser.EXTERNAL, 0); }
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitFunctionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitFunctionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3250);
					annotation();
					setState(3254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3251);
							match(NL);
							}
							} 
						}
						setState(3256);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,478,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AprlParser.HASH, 0); }
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3261);
			match(HASH);
			setState(3283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(3262);
				unescapedAnnotation();
				}
				break;
			case LSQUARE:
				{
				setState(3263);
				match(LSQUARE);
				setState(3267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3264);
					match(NL);
					}
					}
					setState(3269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3270);
					unescapedAnnotation();
					}
					}
					setState(3273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(3278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3275);
					match(NL);
					}
					}
					setState(3280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3281);
				match(RSQUARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitUnescapedAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitUnescapedAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_unescapedAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3285);
			identifier();
			setState(3287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,483,_ctx) ) {
			case 1:
				{
				setState(3286);
				valueArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(AprlParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(AprlParser.PERIOD, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3289);
			simpleIdentifier();
			setState(3306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,486,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3290);
						match(NL);
						}
						}
						setState(3295);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3296);
					match(PERIOD);
					setState(3300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3297);
						match(NL);
						}
						}
						setState(3302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3303);
					simpleIdentifier();
					}
					} 
				}
				setState(3308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,486,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AprlParser.Identifier, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3309);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(AprlParser.SEMICOLON, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(3329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,490,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3312); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3311);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3314); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,487,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3316);
					match(NL);
					}
					}
					setState(3321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3322);
				match(SEMICOLON);
				setState(3326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,489,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3323);
						match(NL);
						}
						} 
					}
					setState(3328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,489,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b1\u0d06\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\3\2\7\2\u0178\n\2\f\2\16\2\u017b\13\2\3\2\3\2\7\2\u017f\n\2\f"+
		"\2\16\2\u0182\13\2\3\2\3\2\6\2\u0186\n\2\r\2\16\2\u0187\3\2\5\2\u018b"+
		"\n\2\7\2\u018d\n\2\f\2\16\2\u0190\13\2\5\2\u0192\n\2\3\2\3\2\3\3\5\3\u0197"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\5\4\u019e\n\4\3\5\7\5\u01a1\n\5\f\5\16\5\u01a4"+
		"\13\5\3\6\3\6\3\6\3\6\7\6\u01aa\n\6\f\6\16\6\u01ad\13\6\3\6\5\6\u01b0"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01ba\n\7\f\7\16\7\u01bd\13\7"+
		"\3\7\3\7\5\7\u01c1\n\7\5\7\u01c3\n\7\5\7\u01c5\n\7\3\b\3\b\5\b\u01c9\n"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u01da\n\13\3\f\5\f\u01dd\n\f\3\f\3\f\7\f\u01e1\n\f\f\f\16\f\u01e4"+
		"\13\f\3\f\3\f\7\f\u01e8\n\f\f\f\16\f\u01eb\13\f\3\f\5\f\u01ee\n\f\3\f"+
		"\7\f\u01f1\n\f\f\f\16\f\u01f4\13\f\3\f\5\f\u01f7\n\f\3\f\7\f\u01fa\n\f"+
		"\f\f\16\f\u01fd\13\f\3\f\3\f\7\f\u0201\n\f\f\f\16\f\u0204\13\f\3\f\5\f"+
		"\u0207\n\f\3\f\7\f\u020a\n\f\f\f\16\f\u020d\13\f\3\f\5\f\u0210\n\f\3\r"+
		"\5\r\u0213\n\r\3\r\3\r\7\r\u0217\n\r\f\r\16\r\u021a\13\r\3\r\3\r\7\r\u021e"+
		"\n\r\f\r\16\r\u0221\13\r\3\r\5\r\u0224\n\r\3\r\7\r\u0227\n\r\f\r\16\r"+
		"\u022a\13\r\3\r\3\r\7\r\u022e\n\r\f\r\16\r\u0231\13\r\3\r\5\r\u0234\n"+
		"\r\3\r\7\r\u0237\n\r\f\r\16\r\u023a\13\r\3\r\5\r\u023d\n\r\3\16\5\16\u0240"+
		"\n\16\3\16\3\16\7\16\u0244\n\16\f\16\16\16\u0247\13\16\3\16\3\16\7\16"+
		"\u024b\n\16\f\16\16\16\u024e\13\16\3\16\5\16\u0251\n\16\3\16\7\16\u0254"+
		"\n\16\f\16\16\16\u0257\13\16\3\16\5\16\u025a\n\16\3\17\5\17\u025d\n\17"+
		"\3\17\3\17\7\17\u0261\n\17\f\17\16\17\u0264\13\17\3\17\3\17\7\17\u0268"+
		"\n\17\f\17\16\17\u026b\13\17\3\17\5\17\u026e\n\17\3\17\7\17\u0271\n\17"+
		"\f\17\16\17\u0274\13\17\3\17\3\17\7\17\u0278\n\17\f\17\16\17\u027b\13"+
		"\17\3\17\5\17\u027e\n\17\3\20\5\20\u0281\n\20\3\20\3\20\7\20\u0285\n\20"+
		"\f\20\16\20\u0288\13\20\5\20\u028a\n\20\3\20\3\20\3\21\3\21\7\21\u0290"+
		"\n\21\f\21\16\21\u0293\13\21\3\21\3\21\7\21\u0297\n\21\f\21\16\21\u029a"+
		"\13\21\3\21\3\21\7\21\u029e\n\21\f\21\16\21\u02a1\13\21\3\21\7\21\u02a4"+
		"\n\21\f\21\16\21\u02a7\13\21\5\21\u02a9\n\21\3\21\7\21\u02ac\n\21\f\21"+
		"\16\21\u02af\13\21\3\21\3\21\3\22\5\22\u02b4\n\22\3\22\5\22\u02b7\n\22"+
		"\3\22\7\22\u02ba\n\22\f\22\16\22\u02bd\13\22\3\22\3\22\7\22\u02c1\n\22"+
		"\f\22\16\22\u02c4\13\22\3\22\3\22\7\22\u02c8\n\22\f\22\16\22\u02cb\13"+
		"\22\3\22\3\22\7\22\u02cf\n\22\f\22\16\22\u02d2\13\22\3\22\3\22\7\22\u02d6"+
		"\n\22\f\22\16\22\u02d9\13\22\3\22\5\22\u02dc\n\22\3\23\3\23\7\23\u02e0"+
		"\n\23\f\23\16\23\u02e3\13\23\3\23\3\23\7\23\u02e7\n\23\f\23\16\23\u02ea"+
		"\13\23\3\23\7\23\u02ed\n\23\f\23\16\23\u02f0\13\23\3\24\5\24\u02f3\n\24"+
		"\3\24\3\24\3\25\3\25\5\25\u02f9\n\25\3\25\5\25\u02fc\n\25\3\26\3\26\7"+
		"\26\u0300\n\26\f\26\16\26\u0303\13\26\3\26\3\26\7\26\u0307\n\26\f\26\16"+
		"\26\u030a\13\26\3\26\7\26\u030d\n\26\f\26\16\26\u0310\13\26\3\27\5\27"+
		"\u0313\n\27\3\27\3\27\3\30\3\30\7\30\u0319\n\30\f\30\16\30\u031c\13\30"+
		"\3\30\3\30\7\30\u0320\n\30\f\30\16\30\u0323\13\30\3\30\3\30\7\30\u0327"+
		"\n\30\f\30\16\30\u032a\13\30\3\30\7\30\u032d\n\30\f\30\16\30\u0330\13"+
		"\30\3\30\7\30\u0333\n\30\f\30\16\30\u0336\13\30\5\30\u0338\n\30\3\30\3"+
		"\30\3\31\5\31\u033d\n\31\3\31\3\31\7\31\u0341\n\31\f\31\16\31\u0344\13"+
		"\31\3\31\3\31\7\31\u0348\n\31\f\31\16\31\u034b\13\31\5\31\u034d\n\31\3"+
		"\31\5\31\u0350\n\31\3\31\7\31\u0353\n\31\f\31\16\31\u0356\13\31\3\31\3"+
		"\31\3\32\5\32\u035b\n\32\3\32\3\32\7\32\u035f\n\32\f\32\16\32\u0362\13"+
		"\32\3\32\3\32\7\32\u0366\n\32\f\32\16\32\u0369\13\32\3\32\3\32\7\32\u036d"+
		"\n\32\f\32\16\32\u0370\13\32\3\32\5\32\u0373\n\32\3\32\7\32\u0376\n\32"+
		"\f\32\16\32\u0379\13\32\3\32\5\32\u037c\n\32\3\33\3\33\7\33\u0380\n\33"+
		"\f\33\16\33\u0383\13\33\3\33\3\33\3\34\3\34\7\34\u0389\n\34\f\34\16\34"+
		"\u038c\13\34\3\34\7\34\u038f\n\34\f\34\16\34\u0392\13\34\3\34\7\34\u0395"+
		"\n\34\f\34\16\34\u0398\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u03a1"+
		"\n\35\3\35\6\35\u03a4\n\35\r\35\16\35\u03a5\3\36\3\36\7\36\u03aa\n\36"+
		"\f\36\16\36\u03ad\13\36\3\36\3\36\3\37\3\37\7\37\u03b3\n\37\f\37\16\37"+
		"\u03b6\13\37\3\37\3\37\3 \5 \u03bb\n \3 \3 \7 \u03bf\n \f \16 \u03c2\13"+
		" \3 \5 \u03c5\n \3!\3!\7!\u03c9\n!\f!\16!\u03cc\13!\3!\3!\7!\u03d0\n!"+
		"\f!\16!\u03d3\13!\3!\3!\7!\u03d7\n!\f!\16!\u03da\13!\3!\7!\u03dd\n!\f"+
		"!\16!\u03e0\13!\3!\3!\3\"\5\"\u03e5\n\"\3\"\3\"\5\"\u03e9\n\"\3#\3#\7"+
		"#\u03ed\n#\f#\16#\u03f0\13#\6#\u03f2\n#\r#\16#\u03f3\3$\3$\5$\u03f8\n"+
		"$\3%\3%\7%\u03fc\n%\f%\16%\u03ff\13%\3%\3%\7%\u0403\n%\f%\16%\u0406\13"+
		"%\3%\3%\7%\u040a\n%\f%\16%\u040d\13%\3%\7%\u0410\n%\f%\16%\u0413\13%\3"+
		"%\7%\u0416\n%\f%\16%\u0419\13%\3%\3%\3&\5&\u041e\n&\3&\3&\7&\u0422\n&"+
		"\f&\16&\u0425\13&\3&\3&\7&\u0429\n&\f&\16&\u042c\13&\3&\3&\7&\u0430\n"+
		"&\f&\16&\u0433\13&\3&\3&\7&\u0437\n&\f&\16&\u043a\13&\3&\7&\u043d\n&\f"+
		"&\16&\u0440\13&\5&\u0442\n&\3\'\3\'\7\'\u0446\n\'\f\'\16\'\u0449\13\'"+
		"\6\'\u044b\n\'\r\'\16\'\u044c\3(\3(\3(\5(\u0452\n(\3(\7(\u0455\n(\f(\16"+
		"(\u0458\13(\3)\3)\3*\3*\3+\5+\u045f\n+\3+\3+\3+\3+\3+\3+\5+\u0467\n+\5"+
		"+\u0469\n+\3,\3,\7,\u046d\n,\f,\16,\u0470\13,\3,\3,\7,\u0474\n,\f,\16"+
		",\u0477\13,\3,\3,\3-\5-\u047c\n-\3-\3-\3-\5-\u0481\n-\3.\3.\7.\u0485\n"+
		".\f.\16.\u0488\13.\3.\3.\7.\u048c\n.\f.\16.\u048f\13.\3.\3.\7.\u0493\n"+
		".\f.\16.\u0496\13.\3.\7.\u0499\n.\f.\16.\u049c\13.\5.\u049e\n.\3.\7.\u04a1"+
		"\n.\f.\16.\u04a4\13.\3.\3.\3/\3/\7/\u04aa\n/\f/\16/\u04ad\13/\3/\3/\7"+
		"/\u04b1\n/\f/\16/\u04b4\13/\3/\3/\3\60\3\60\7\60\u04ba\n\60\f\60\16\60"+
		"\u04bd\13\60\3\60\3\60\7\60\u04c1\n\60\f\60\16\60\u04c4\13\60\3\60\3\60"+
		"\3\61\3\61\5\61\u04ca\n\61\3\61\3\61\5\61\u04ce\n\61\3\61\3\61\3\62\5"+
		"\62\u04d3\n\62\3\62\3\62\7\62\u04d7\n\62\f\62\16\62\u04da\13\62\3\62\3"+
		"\62\7\62\u04de\n\62\f\62\16\62\u04e1\13\62\3\62\3\62\7\62\u04e5\n\62\f"+
		"\62\16\62\u04e8\13\62\3\62\5\62\u04eb\n\62\3\62\7\62\u04ee\n\62\f\62\16"+
		"\62\u04f1\13\62\3\62\5\62\u04f4\n\62\3\63\3\63\7\63\u04f8\n\63\f\63\16"+
		"\63\u04fb\13\63\3\63\7\63\u04fe\n\63\f\63\16\63\u0501\13\63\3\63\7\63"+
		"\u0504\n\63\f\63\16\63\u0507\13\63\3\63\3\63\3\64\3\64\3\64\5\64\u050e"+
		"\n\64\3\64\6\64\u0511\n\64\r\64\16\64\u0512\3\65\5\65\u0516\n\65\3\65"+
		"\3\65\7\65\u051a\n\65\f\65\16\65\u051d\13\65\3\65\3\65\7\65\u0521\n\65"+
		"\f\65\16\65\u0524\13\65\3\65\5\65\u0527\n\65\3\65\7\65\u052a\n\65\f\65"+
		"\16\65\u052d\13\65\3\65\3\65\3\66\3\66\7\66\u0533\n\66\f\66\16\66\u0536"+
		"\13\66\3\66\5\66\u0539\n\66\3\66\7\66\u053c\n\66\f\66\16\66\u053f\13\66"+
		"\3\66\3\66\7\66\u0543\n\66\f\66\16\66\u0546\13\66\3\66\7\66\u0549\n\66"+
		"\f\66\16\66\u054c\13\66\5\66\u054e\n\66\3\66\7\66\u0551\n\66\f\66\16\66"+
		"\u0554\13\66\3\66\3\66\3\67\3\67\7\67\u055a\n\67\f\67\16\67\u055d\13\67"+
		"\3\67\3\67\7\67\u0561\n\67\f\67\16\67\u0564\13\67\3\67\7\67\u0567\n\67"+
		"\f\67\16\67\u056a\13\67\38\58\u056d\n8\38\38\78\u0571\n8\f8\168\u0574"+
		"\138\38\58\u0577\n8\38\78\u057a\n8\f8\168\u057d\138\38\58\u0580\n8\39"+
		"\59\u0583\n9\39\39\79\u0587\n9\f9\169\u058a\139\39\59\u058d\n9\39\79\u0590"+
		"\n9\f9\169\u0593\139\39\39\79\u0597\n9\f9\169\u059a\139\39\59\u059d\n"+
		"9\3:\3:\7:\u05a1\n:\f:\16:\u05a4\13:\3:\7:\u05a7\n:\f:\16:\u05aa\13:\3"+
		":\7:\u05ad\n:\f:\16:\u05b0\13:\3:\3:\3;\3;\3;\5;\u05b7\n;\3;\6;\u05ba"+
		"\n;\r;\16;\u05bb\3<\5<\u05bf\n<\3<\3<\7<\u05c3\n<\f<\16<\u05c6\13<\3<"+
		"\5<\u05c9\n<\3<\7<\u05cc\n<\f<\16<\u05cf\13<\3<\3<\5<\u05d3\n<\3<\7<\u05d6"+
		"\n<\f<\16<\u05d9\13<\3<\3<\7<\u05dd\n<\f<\16<\u05e0\13<\3<\5<\u05e3\n"+
		"<\3<\7<\u05e6\n<\f<\16<\u05e9\13<\3<\5<\u05ec\n<\3=\5=\u05ef\n=\3=\3="+
		"\7=\u05f3\n=\f=\16=\u05f6\13=\3=\3=\7=\u05fa\n=\f=\16=\u05fd\13=\3=\5"+
		"=\u0600\n=\3>\3>\7>\u0604\n>\f>\16>\u0607\13>\3>\3>\7>\u060b\n>\f>\16"+
		">\u060e\13>\3>\3>\7>\u0612\n>\f>\16>\u0615\13>\3>\7>\u0618\n>\f>\16>\u061b"+
		"\13>\3>\7>\u061e\n>\f>\16>\u0621\13>\3>\3>\3?\3?\7?\u0627\n?\f?\16?\u062a"+
		"\13?\3?\3?\7?\u062e\n?\f?\16?\u0631\13?\3?\5?\u0634\n?\3?\3?\7?\u0638"+
		"\n?\f?\16?\u063b\13?\3?\5?\u063e\n?\5?\u0640\n?\3?\7?\u0643\n?\f?\16?"+
		"\u0646\13?\3?\3?\3@\5@\u064b\n@\3@\3@\7@\u064f\n@\f@\16@\u0652\13@\3@"+
		"\3@\7@\u0656\n@\f@\16@\u0659\13@\3@\5@\u065c\n@\3@\7@\u065f\n@\f@\16@"+
		"\u0662\13@\3@\3@\7@\u0666\n@\f@\16@\u0669\13@\3@\5@\u066c\n@\3@\7@\u066f"+
		"\n@\f@\16@\u0672\13@\3@\5@\u0675\n@\3A\5A\u0678\nA\3A\3A\7A\u067c\nA\f"+
		"A\16A\u067f\13A\3A\3A\7A\u0683\nA\fA\16A\u0686\13A\3A\3A\7A\u068a\nA\f"+
		"A\16A\u068d\13A\3A\3A\5A\u0691\nA\3A\7A\u0694\nA\fA\16A\u0697\13A\3A\3"+
		"A\7A\u069b\nA\fA\16A\u069e\13A\3A\5A\u06a1\nA\3A\7A\u06a4\nA\fA\16A\u06a7"+
		"\13A\3A\5A\u06aa\nA\3B\5B\u06ad\nB\3B\3B\7B\u06b1\nB\fB\16B\u06b4\13B"+
		"\3B\3B\7B\u06b8\nB\fB\16B\u06bb\13B\3B\5B\u06be\nB\3C\3C\6C\u06c2\nC\r"+
		"C\16C\u06c3\3D\3D\7D\u06c8\nD\fD\16D\u06cb\13D\3D\3D\7D\u06cf\nD\fD\16"+
		"D\u06d2\13D\3D\5D\u06d5\nD\3E\5E\u06d8\nE\3E\3E\7E\u06dc\nE\fE\16E\u06df"+
		"\13E\3E\5E\u06e2\nE\3E\7E\u06e5\nE\fE\16E\u06e8\13E\3E\3E\7E\u06ec\nE"+
		"\fE\16E\u06ef\13E\3E\3E\7E\u06f3\nE\fE\16E\u06f6\13E\3E\3E\7E\u06fa\n"+
		"E\fE\16E\u06fd\13E\3E\5E\u0700\nE\3E\7E\u0703\nE\fE\16E\u0706\13E\3E\5"+
		"E\u0709\nE\3F\3F\7F\u070d\nF\fF\16F\u0710\13F\3F\3F\7F\u0714\nF\fF\16"+
		"F\u0717\13F\3F\3F\7F\u071b\nF\fF\16F\u071e\13F\3F\7F\u0721\nF\fF\16F\u0724"+
		"\13F\5F\u0726\nF\3F\7F\u0729\nF\fF\16F\u072c\13F\3F\3F\3G\5G\u0731\nG"+
		"\3G\3G\7G\u0735\nG\fG\16G\u0738\13G\3G\3G\7G\u073c\nG\fG\16G\u073f\13"+
		"G\3G\5G\u0742\nG\3H\3H\7H\u0746\nH\fH\16H\u0749\13H\3H\3H\7H\u074d\nH"+
		"\fH\16H\u0750\13H\3H\3H\3I\3I\3I\7I\u0757\nI\fI\16I\u075a\13I\3I\5I\u075d"+
		"\nI\3J\3J\7J\u0761\nJ\fJ\16J\u0764\13J\3J\3J\7J\u0768\nJ\fJ\16J\u076b"+
		"\13J\3J\3J\3K\3K\6K\u0771\nK\rK\16K\u0772\3K\3K\7K\u0777\nK\fK\16K\u077a"+
		"\13K\5K\u077c\nK\3K\7K\u077f\nK\fK\16K\u0782\13K\3L\3L\7L\u0786\nL\fL"+
		"\16L\u0789\13L\3L\7L\u078c\nL\fL\16L\u078f\13L\3L\3L\3L\3L\5L\u0795\n"+
		"L\3M\3M\3M\5M\u079a\nM\3N\3N\7N\u079e\nN\fN\16N\u07a1\13N\3N\3N\7N\u07a5"+
		"\nN\fN\16N\u07a8\13N\3N\5N\u07ab\nN\3N\3N\5N\u07af\nN\3N\7N\u07b2\nN\f"+
		"N\16N\u07b5\13N\3N\3N\7N\u07b9\nN\fN\16N\u07bc\13N\3N\3N\7N\u07c0\nN\f"+
		"N\16N\u07c3\13N\3N\3N\7N\u07c7\nN\fN\16N\u07ca\13N\3N\3N\3O\3O\7O\u07d0"+
		"\nO\fO\16O\u07d3\13O\3O\3O\7O\u07d7\nO\fO\16O\u07da\13O\3O\3O\7O\u07de"+
		"\nO\fO\16O\u07e1\13O\3O\3O\7O\u07e5\nO\fO\16O\u07e8\13O\3O\3O\3P\3P\7"+
		"P\u07ee\nP\fP\16P\u07f1\13P\3P\3P\7P\u07f5\nP\fP\16P\u07f8\13P\3P\3P\7"+
		"P\u07fc\nP\fP\16P\u07ff\13P\3P\3P\7P\u0803\nP\fP\16P\u0806\13P\3P\3P\7"+
		"P\u080a\nP\fP\16P\u080d\13P\3P\3P\3Q\3Q\7Q\u0813\nQ\fQ\16Q\u0816\13Q\3"+
		"Q\3Q\5Q\u081a\nQ\3Q\3Q\3R\3R\3S\3S\3S\3S\7S\u0824\nS\fS\16S\u0827\13S"+
		"\3T\3T\3T\3T\7T\u082d\nT\fT\16T\u0830\13T\3U\3U\3U\3U\7U\u0836\nU\fU\16"+
		"U\u0839\13U\3V\3V\3V\3V\7V\u083f\nV\fV\16V\u0842\13V\3W\3W\3W\3W\7W\u0848"+
		"\nW\fW\16W\u084b\13W\3X\3X\7X\u084f\nX\fX\16X\u0852\13X\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\7Y\u085b\nY\fY\16Y\u085e\13Y\3Z\3Z\3Z\3Z\7Z\u0864\nZ\fZ\16Z\u0867"+
		"\13Z\3[\3[\3[\3[\7[\u086d\n[\f[\16[\u0870\13[\3\\\3\\\3\\\3\\\5\\\u0876"+
		"\n\\\3]\3]\3]\3]\7]\u087c\n]\f]\16]\u087f\13]\3^\3^\3^\3^\7^\u0885\n^"+
		"\f^\16^\u0888\13^\3_\3_\3_\3_\7_\u088e\n_\f_\16_\u0891\13_\3`\3`\3`\3"+
		"`\7`\u0897\n`\f`\16`\u089a\13`\3a\3a\3a\3a\7a\u08a0\na\fa\16a\u08a3\13"+
		"a\3b\7b\u08a6\nb\fb\16b\u08a9\13b\3b\3b\3c\3c\7c\u08af\nc\fc\16c\u08b2"+
		"\13c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u08c2\nd\3e\3e\3e\3"+
		"e\3f\3f\3f\3g\5g\u08cc\ng\3g\3g\7g\u08d0\ng\fg\16g\u08d3\13g\3g\3g\5g"+
		"\u08d7\ng\3h\3h\7h\u08db\nh\fh\16h\u08de\13h\3h\3h\7h\u08e2\nh\fh\16h"+
		"\u08e5\13h\3h\5h\u08e8\nh\3h\7h\u08eb\nh\fh\16h\u08ee\13h\3h\5h\u08f1"+
		"\nh\3i\3i\7i\u08f5\ni\fi\16i\u08f8\13i\3i\5i\u08fb\ni\3i\7i\u08fe\ni\f"+
		"i\16i\u0901\13i\3i\3i\7i\u0905\ni\fi\16i\u0908\13i\3i\7i\u090b\ni\fi\16"+
		"i\u090e\13i\3i\7i\u0911\ni\fi\16i\u0914\13i\3i\3i\3j\3j\5j\u091a\nj\3"+
		"k\3k\3k\7k\u091f\nk\fk\16k\u0922\13k\3k\3k\7k\u0926\nk\fk\16k\u0929\13"+
		"k\3k\3k\5k\u092d\nk\3k\5k\u0930\nk\3l\3l\5l\u0934\nl\3m\3m\7m\u0938\n"+
		"m\fm\16m\u093b\13m\3m\3m\7m\u093f\nm\fm\16m\u0942\13m\3m\3m\7m\u0946\n"+
		"m\fm\16m\u0949\13m\3m\3m\7m\u094d\nm\fm\16m\u0950\13m\3m\3m\7m\u0954\n"+
		"m\fm\16m\u0957\13m\3m\3m\7m\u095b\nm\fm\16m\u095e\13m\3m\3m\7m\u0962\n"+
		"m\fm\16m\u0965\13m\3m\3m\7m\u0969\nm\fm\16m\u096c\13m\3m\3m\7m\u0970\n"+
		"m\fm\16m\u0973\13m\3m\3m\7m\u0977\nm\fm\16m\u097a\13m\3m\7m\u097d\nm\f"+
		"m\16m\u0980\13m\3m\3m\7m\u0984\nm\fm\16m\u0987\13m\3m\5m\u098a\nm\3n\3"+
		"n\5n\u098e\nn\3o\3o\7o\u0992\no\fo\16o\u0995\13o\3o\3o\7o\u0999\no\fo"+
		"\16o\u099c\13o\3o\3o\7o\u09a0\no\fo\16o\u09a3\13o\3o\3o\7o\u09a7\no\f"+
		"o\16o\u09aa\13o\3o\3o\7o\u09ae\no\fo\16o\u09b1\13o\3o\3o\7o\u09b5\no\f"+
		"o\16o\u09b8\13o\6o\u09ba\no\ro\16o\u09bb\3o\7o\u09bf\no\fo\16o\u09c2\13"+
		"o\3o\3o\3p\3p\7p\u09c8\np\fp\16p\u09cb\13p\3p\3p\7p\u09cf\np\fp\16p\u09d2"+
		"\13p\3p\3p\7p\u09d6\np\fp\16p\u09d9\13p\3p\7p\u09dc\np\fp\16p\u09df\13"+
		"p\3p\7p\u09e2\np\fp\16p\u09e5\13p\3p\3p\7p\u09e9\np\fp\16p\u09ec\13p\3"+
		"p\3p\5p\u09f0\np\3p\3p\7p\u09f4\np\fp\16p\u09f7\13p\3p\3p\7p\u09fb\np"+
		"\fp\16p\u09fe\13p\3p\5p\u0a01\np\3q\3q\7q\u0a05\nq\fq\16q\u0a08\13q\3"+
		"q\3q\5q\u0a0c\nq\3r\3r\7r\u0a10\nr\fr\16r\u0a13\13r\3r\3r\7r\u0a17\nr"+
		"\fr\16r\u0a1a\13r\3r\7r\u0a1d\nr\fr\16r\u0a20\13r\3r\7r\u0a23\nr\fr\16"+
		"r\u0a26\13r\3r\5r\u0a29\nr\3s\3s\7s\u0a2d\ns\fs\16s\u0a30\13s\3s\3s\7"+
		"s\u0a34\ns\fs\16s\u0a37\13s\3s\5s\u0a3a\ns\3s\3s\7s\u0a3e\ns\fs\16s\u0a41"+
		"\13s\3s\3s\7s\u0a45\ns\fs\16s\u0a48\13s\3s\3s\7s\u0a4c\ns\fs\16s\u0a4f"+
		"\13s\3s\3s\7s\u0a53\ns\fs\16s\u0a56\13s\3s\7s\u0a59\ns\fs\16s\u0a5c\13"+
		"s\3s\7s\u0a5f\ns\fs\16s\u0a62\13s\3s\3s\7s\u0a66\ns\fs\16s\u0a69\13s\3"+
		"s\3s\3t\3t\7t\u0a6f\nt\ft\16t\u0a72\13t\3t\3t\3u\3u\3u\3u\5u\u0a7a\nu"+
		"\3v\3v\7v\u0a7e\nv\fv\16v\u0a81\13v\3v\3v\3w\3w\7w\u0a87\nw\fw\16w\u0a8a"+
		"\13w\3w\5w\u0a8d\nw\3x\3x\3y\3y\3z\3z\3z\7z\u0a96\nz\fz\16z\u0a99\13z"+
		"\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0aaa\n|\3}\3}\3~\3~"+
		"\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3"+
		"\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\5\u0088\u0ac4\n\u0088\3\u0089\3\u0089\3\u0089\7\u0089"+
		"\u0ac9\n\u0089\f\u0089\16\u0089\u0acc\13\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u0ad5\n\u008a\f\u008a\16\u008a"+
		"\u0ad8\13\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\5\u008f\u0aea\n\u008f\3\u0090\3\u0090\7\u0090\u0aee\n\u0090\f\u0090\16"+
		"\u0090\u0af1\13\u0090\3\u0090\5\u0090\u0af4\n\u0090\3\u0090\7\u0090\u0af7"+
		"\n\u0090\f\u0090\16\u0090\u0afa\13\u0090\3\u0090\3\u0090\7\u0090\u0afe"+
		"\n\u0090\f\u0090\16\u0090\u0b01\13\u0090\5\u0090\u0b03\n\u0090\3\u0090"+
		"\3\u0090\7\u0090\u0b07\n\u0090\f\u0090\16\u0090\u0b0a\13\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\7\u0091\u0b10\n\u0091\f\u0091\16\u0091\u0b13"+
		"\13\u0091\3\u0091\3\u0091\7\u0091\u0b17\n\u0091\f\u0091\16\u0091\u0b1a"+
		"\13\u0091\3\u0091\7\u0091\u0b1d\n\u0091\f\u0091\16\u0091\u0b20\13\u0091"+
		"\3\u0092\3\u0092\5\u0092\u0b24\n\u0092\3\u0092\7\u0092\u0b27\n\u0092\f"+
		"\u0092\16\u0092\u0b2a\13\u0092\3\u0092\3\u0092\7\u0092\u0b2e\n\u0092\f"+
		"\u0092\16\u0092\u0b31\13\u0092\3\u0092\5\u0092\u0b34\n\u0092\3\u0093\3"+
		"\u0093\7\u0093\u0b38\n\u0093\f\u0093\16\u0093\u0b3b\13\u0093\3\u0093\3"+
		"\u0093\7\u0093\u0b3f\n\u0093\f\u0093\16\u0093\u0b42\13\u0093\3\u0093\3"+
		"\u0093\7\u0093\u0b46\n\u0093\f\u0093\16\u0093\u0b49\13\u0093\3\u0093\5"+
		"\u0093\u0b4c\n\u0093\3\u0093\7\u0093\u0b4f\n\u0093\f\u0093\16\u0093\u0b52"+
		"\13\u0093\3\u0093\5\u0093\u0b55\n\u0093\3\u0094\7\u0094\u0b58\n\u0094"+
		"\f\u0094\16\u0094\u0b5b\13\u0094\3\u0094\3\u0094\7\u0094\u0b5f\n\u0094"+
		"\f\u0094\16\u0094\u0b62\13\u0094\3\u0095\7\u0095\u0b65\n\u0095\f\u0095"+
		"\16\u0095\u0b68\13\u0095\3\u0095\3\u0095\7\u0095\u0b6c\n\u0095\f\u0095"+
		"\16\u0095\u0b6f\13\u0095\3\u0096\7\u0096\u0b72\n\u0096\f\u0096\16\u0096"+
		"\u0b75\13\u0096\3\u0096\3\u0096\7\u0096\u0b79\n\u0096\f\u0096\16\u0096"+
		"\u0b7c\13\u0096\3\u0097\7\u0097\u0b7f\n\u0097\f\u0097\16\u0097\u0b82\13"+
		"\u0097\3\u0097\3\u0097\7\u0097\u0b86\n\u0097\f\u0097\16\u0097\u0b89\13"+
		"\u0097\3\u0098\7\u0098\u0b8c\n\u0098\f\u0098\16\u0098\u0b8f\13\u0098\3"+
		"\u0098\3\u0098\7\u0098\u0b93\n\u0098\f\u0098\16\u0098\u0b96\13\u0098\3"+
		"\u0099\7\u0099\u0b99\n\u0099\f\u0099\16\u0099\u0b9c\13\u0099\3\u0099\3"+
		"\u0099\7\u0099\u0ba0\n\u0099\f\u0099\16\u0099\u0ba3\13\u0099\3\u009a\7"+
		"\u009a\u0ba6\n\u009a\f\u009a\16\u009a\u0ba9\13\u009a\3\u009a\3\u009a\7"+
		"\u009a\u0bad\n\u009a\f\u009a\16\u009a\u0bb0\13\u009a\3\u009b\7\u009b\u0bb3"+
		"\n\u009b\f\u009b\16\u009b\u0bb6\13\u009b\3\u009b\3\u009b\7\u009b\u0bba"+
		"\n\u009b\f\u009b\16\u009b\u0bbd\13\u009b\3\u009c\7\u009c\u0bc0\n\u009c"+
		"\f\u009c\16\u009c\u0bc3\13\u009c\3\u009c\3\u009c\7\u009c\u0bc7\n\u009c"+
		"\f\u009c\16\u009c\u0bca\13\u009c\3\u009d\7\u009d\u0bcd\n\u009d\f\u009d"+
		"\16\u009d\u0bd0\13\u009d\3\u009d\3\u009d\7\u009d\u0bd4\n\u009d\f\u009d"+
		"\16\u009d\u0bd7\13\u009d\3\u009e\7\u009e\u0bda\n\u009e\f\u009e\16\u009e"+
		"\u0bdd\13\u009e\3\u009e\3\u009e\7\u009e\u0be1\n\u009e\f\u009e\16\u009e"+
		"\u0be4\13\u009e\3\u009f\7\u009f\u0be7\n\u009f\f\u009f\16\u009f\u0bea\13"+
		"\u009f\3\u009f\3\u009f\7\u009f\u0bee\n\u009f\f\u009f\16\u009f\u0bf1\13"+
		"\u009f\3\u00a0\7\u00a0\u0bf4\n\u00a0\f\u00a0\16\u00a0\u0bf7\13\u00a0\3"+
		"\u00a0\3\u00a0\7\u00a0\u0bfb\n\u00a0\f\u00a0\16\u00a0\u0bfe\13\u00a0\3"+
		"\u00a1\7\u00a1\u0c01\n\u00a1\f\u00a1\16\u00a1\u0c04\13\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u0c08\n\u00a1\f\u00a1\16\u00a1\u0c0b\13\u00a1\3\u00a2\7"+
		"\u00a2\u0c0e\n\u00a2\f\u00a2\16\u00a2\u0c11\13\u00a2\3\u00a2\3\u00a2\7"+
		"\u00a2\u0c15\n\u00a2\f\u00a2\16\u00a2\u0c18\13\u00a2\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u0c1d\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u0c26\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\5\u00a7\u0c2f\n\u00a7\3\u00a8\3\u00a8\7\u00a8\u0c33"+
		"\n\u00a8\f\u00a8\16\u00a8\u0c36\13\u00a8\3\u00a8\3\u00a8\7\u00a8\u0c3a"+
		"\n\u00a8\f\u00a8\16\u00a8\u0c3d\13\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0c44\n\u00a9\3\u00aa\5\u00aa\u0c47\n\u00aa\3\u00aa\3"+
		"\u00aa\5\u00aa\u0c4b\n\u00aa\3\u00ab\5\u00ab\u0c4e\n\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\5\u00ac\u0c53\n\u00ac\3\u00ac\5\u00ac\u0c56\n\u00ac\3\u00ac\7"+
		"\u00ac\u0c59\n\u00ac\f\u00ac\16\u00ac\u0c5c\13\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ad\3\u00ad\7\u00ad\u0c62\n\u00ad\f\u00ad\16\u00ad\u0c65\13\u00ad\3"+
		"\u00ad\3\u00ad\7\u00ad\u0c69\n\u00ad\f\u00ad\16\u00ad\u0c6c\13\u00ad\3"+
		"\u00ad\3\u00ad\7\u00ad\u0c70\n\u00ad\f\u00ad\16\u00ad\u0c73\13\u00ad\3"+
		"\u00ad\7\u00ad\u0c76\n\u00ad\f\u00ad\16\u00ad\u0c79\13\u00ad\3\u00ad\7"+
		"\u00ad\u0c7c\n\u00ad\f\u00ad\16\u00ad\u0c7f\13\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\5\u00ae\u0c86\n\u00ae\3\u00af\7\u00af\u0c89\n\u00af"+
		"\f\u00af\16\u00af\u0c8c\13\u00af\3\u00af\3\u00af\7\u00af\u0c90\n\u00af"+
		"\f\u00af\16\u00af\u0c93\13\u00af\3\u00b0\3\u00b0\7\u00b0\u0c97\n\u00b0"+
		"\f\u00b0\16\u00b0\u0c9a\13\u00b0\3\u00b0\3\u00b0\7\u00b0\u0c9e\n\u00b0"+
		"\f\u00b0\16\u00b0\u0ca1\13\u00b0\6\u00b0\u0ca3\n\u00b0\r\u00b0\16\u00b0"+
		"\u0ca4\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0cab\n\u00b1\3\u00b2\3"+
		"\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\7\u00b6\u0cb7\n\u00b6\f\u00b6\16\u00b6\u0cba\13\u00b6\6\u00b6\u0cbc\n"+
		"\u00b6\r\u00b6\16\u00b6\u0cbd\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0cc4\n\u00b7\f\u00b7\16\u00b7\u0cc7\13\u00b7\3\u00b7\6\u00b7\u0cca\n"+
		"\u00b7\r\u00b7\16\u00b7\u0ccb\3\u00b7\7\u00b7\u0ccf\n\u00b7\f\u00b7\16"+
		"\u00b7\u0cd2\13\u00b7\3\u00b7\3\u00b7\5\u00b7\u0cd6\n\u00b7\3\u00b8\3"+
		"\u00b8\5\u00b8\u0cda\n\u00b8\3\u00b9\3\u00b9\7\u00b9\u0cde\n\u00b9\f\u00b9"+
		"\16\u00b9\u0ce1\13\u00b9\3\u00b9\3\u00b9\7\u00b9\u0ce5\n\u00b9\f\u00b9"+
		"\16\u00b9\u0ce8\13\u00b9\3\u00b9\7\u00b9\u0ceb\n\u00b9\f\u00b9\16\u00b9"+
		"\u0cee\13\u00b9\3\u00ba\3\u00ba\3\u00bb\6\u00bb\u0cf3\n\u00bb\r\u00bb"+
		"\16\u00bb\u0cf4\3\u00bb\7\u00bb\u0cf8\n\u00bb\f\u00bb\16\u00bb\u0cfb\13"+
		"\u00bb\3\u00bb\3\u00bb\7\u00bb\u0cff\n\u00bb\f\u00bb\16\u00bb\u0d02\13"+
		"\u00bb\5\u00bb\u0d04\n\u00bb\3\u00bb\2\2\u00bc\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\2\37\3\2!\"\3\2\23\24\3\2\24\25\3\2\37\"\3\2"+
		"*,\3\2/\60\4\288;;\4\2::==\4\299<<\3\2IJ\3\2IK\3\2\u00a7\u00a9\3\2\u00ad"+
		"\u00af\r\2STVVYY\\\\^^``bbddffhhzz\3\2{|\3\2}~\4\2\177\u0086\u008a\u008a"+
		"\3\2BC\3\2@A\3\2ln\4\2UUXX\5\2[[]]__\3\2>?\7\2UUWXZZssxx\5\2WWZZtt\4\2"+
		"jkqq\3\2\31\34\3\2#&\3\2\')\2\u0e6e\2\u0179\3\2\2\2\4\u0196\3\2\2\2\6"+
		"\u019a\3\2\2\2\b\u01a2\3\2\2\2\n\u01a5\3\2\2\2\f\u01c4\3\2\2\2\16\u01c6"+
		"\3\2\2\2\20\u01ca\3\2\2\2\22\u01cd\3\2\2\2\24\u01d9\3\2\2\2\26\u01dc\3"+
		"\2\2\2\30\u0212\3\2\2\2\32\u023f\3\2\2\2\34\u025c\3\2\2\2\36\u0289\3\2"+
		"\2\2 \u028d\3\2\2\2\"\u02b3\3\2\2\2$\u02dd\3\2\2\2&\u02f2\3\2\2\2(\u02f6"+
		"\3\2\2\2*\u02fd\3\2\2\2,\u0312\3\2\2\2.\u0316\3\2\2\2\60\u033c\3\2\2\2"+
		"\62\u035a\3\2\2\2\64\u037d\3\2\2\2\66\u0386\3\2\2\28\u03a0\3\2\2\2:\u03a7"+
		"\3\2\2\2<\u03b0\3\2\2\2>\u03ba\3\2\2\2@\u03c6\3\2\2\2B\u03e8\3\2\2\2D"+
		"\u03f1\3\2\2\2F\u03f7\3\2\2\2H\u03f9\3\2\2\2J\u041d\3\2\2\2L\u044a\3\2"+
		"\2\2N\u0451\3\2\2\2P\u0459\3\2\2\2R\u045b\3\2\2\2T\u045e\3\2\2\2V\u046a"+
		"\3\2\2\2X\u047b\3\2\2\2Z\u0482\3\2\2\2\\\u04a7\3\2\2\2^\u04b7\3\2\2\2"+
		"`\u04cd\3\2\2\2b\u04d2\3\2\2\2d\u04f5\3\2\2\2f\u050d\3\2\2\2h\u0515\3"+
		"\2\2\2j\u0530\3\2\2\2l\u0557\3\2\2\2n\u056c\3\2\2\2p\u0582\3\2\2\2r\u059e"+
		"\3\2\2\2t\u05b6\3\2\2\2v\u05be\3\2\2\2x\u05ee\3\2\2\2z\u0601\3\2\2\2|"+
		"\u0624\3\2\2\2~\u064a\3\2\2\2\u0080\u0677\3\2\2\2\u0082\u06ac\3\2\2\2"+
		"\u0084\u06c1\3\2\2\2\u0086\u06c5\3\2\2\2\u0088\u06d7\3\2\2\2\u008a\u070a"+
		"\3\2\2\2\u008c\u0730\3\2\2\2\u008e\u0743\3\2\2\2\u0090\u075c\3\2\2\2\u0092"+
		"\u075e\3\2\2\2\u0094\u077b\3\2\2\2\u0096\u0787\3\2\2\2\u0098\u0799\3\2"+
		"\2\2\u009a\u079b\3\2\2\2\u009c\u07cd\3\2\2\2\u009e\u07eb\3\2\2\2\u00a0"+
		"\u0819\3\2\2\2\u00a2\u081d\3\2\2\2\u00a4\u081f\3\2\2\2\u00a6\u0828\3\2"+
		"\2\2\u00a8\u0831\3\2\2\2\u00aa\u083a\3\2\2\2\u00ac\u0843\3\2\2\2\u00ae"+
		"\u084c\3\2\2\2\u00b0\u0853\3\2\2\2\u00b2\u085f\3\2\2\2\u00b4\u0868\3\2"+
		"\2\2\u00b6\u0871\3\2\2\2\u00b8\u0877\3\2\2\2\u00ba\u0880\3\2\2\2\u00bc"+
		"\u0889\3\2\2\2\u00be\u0892\3\2\2\2\u00c0\u089b\3\2\2\2\u00c2\u08a7\3\2"+
		"\2\2\u00c4\u08ac\3\2\2\2\u00c6\u08c1\3\2\2\2\u00c8\u08c3\3\2\2\2\u00ca"+
		"\u08c7\3\2\2\2\u00cc\u08cb\3\2\2\2\u00ce\u08d8\3\2\2\2\u00d0\u08f2\3\2"+
		"\2\2\u00d2\u0917\3\2\2\2\u00d4\u091b\3\2\2\2\u00d6\u0933\3\2\2\2\u00d8"+
		"\u0935\3\2\2\2\u00da\u098d\3\2\2\2\u00dc\u098f\3\2\2\2\u00de\u0a00\3\2"+
		"\2\2\u00e0\u0a02\3\2\2\2\u00e2\u0a0d\3\2\2\2\u00e4\u0a2a\3\2\2\2\u00e6"+
		"\u0a6c\3\2\2\2\u00e8\u0a79\3\2\2\2\u00ea\u0a7b\3\2\2\2\u00ec\u0a84\3\2"+
		"\2\2\u00ee\u0a8e\3\2\2\2\u00f0\u0a90\3\2\2\2\u00f2\u0a92\3\2\2\2\u00f4"+
		"\u0a9a\3\2\2\2\u00f6\u0aa9\3\2\2\2\u00f8\u0aab\3\2\2\2\u00fa\u0aad\3\2"+
		"\2\2\u00fc\u0aaf\3\2\2\2\u00fe\u0ab1\3\2\2\2\u0100\u0ab3\3\2\2\2\u0102"+
		"\u0ab5\3\2\2\2\u0104\u0ab7\3\2\2\2\u0106\u0ab9\3\2\2\2\u0108\u0abb\3\2"+
		"\2\2\u010a\u0abd\3\2\2\2\u010c\u0abf\3\2\2\2\u010e\u0ac3\3\2\2\2\u0110"+
		"\u0ac5\3\2\2\2\u0112\u0acf\3\2\2\2\u0114\u0adb\3\2\2\2\u0116\u0add\3\2"+
		"\2\2\u0118\u0ae1\3\2\2\2\u011a\u0ae3\3\2\2\2\u011c\u0ae9\3\2\2\2\u011e"+
		"\u0aeb\3\2\2\2\u0120\u0b0d\3\2\2\2\u0122\u0b23\3\2\2\2\u0124\u0b35\3\2"+
		"\2\2\u0126\u0b59\3\2\2\2\u0128\u0b66\3\2\2\2\u012a\u0b73\3\2\2\2\u012c"+
		"\u0b80\3\2\2\2\u012e\u0b8d\3\2\2\2\u0130\u0b9a\3\2\2\2\u0132\u0ba7\3\2"+
		"\2\2\u0134\u0bb4\3\2\2\2\u0136\u0bc1\3\2\2\2\u0138\u0bce\3\2\2\2\u013a"+
		"\u0bdb\3\2\2\2\u013c\u0be8\3\2\2\2\u013e\u0bf5\3\2\2\2\u0140\u0c02\3\2"+
		"\2\2\u0142\u0c0f\3\2\2\2\u0144\u0c1c\3\2\2\2\u0146\u0c1e\3\2\2\2\u0148"+
		"\u0c25\3\2\2\2\u014a\u0c27\3\2\2\2\u014c\u0c2e\3\2\2\2\u014e\u0c30\3\2"+
		"\2\2\u0150\u0c43\3\2\2\2\u0152\u0c46\3\2\2\2\u0154\u0c4d\3\2\2\2\u0156"+
		"\u0c52\3\2\2\2\u0158\u0c5f\3\2\2\2\u015a\u0c82\3\2\2\2\u015c\u0c8a\3\2"+
		"\2\2\u015e\u0ca2\3\2\2\2\u0160\u0caa\3\2\2\2\u0162\u0cac\3\2\2\2\u0164"+
		"\u0cae\3\2\2\2\u0166\u0cb0\3\2\2\2\u0168\u0cb2\3\2\2\2\u016a\u0cbb\3\2"+
		"\2\2\u016c\u0cbf\3\2\2\2\u016e\u0cd7\3\2\2\2\u0170\u0cdb\3\2\2\2\u0172"+
		"\u0cef\3\2\2\2\u0174\u0d03\3\2\2\2\u0176\u0178\7\7\2\2\u0177\u0176\3\2"+
		"\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0180\5\4\3\2\u017d\u017f\7\7"+
		"\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0191\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u018e\5\24"+
		"\13\2\u0184\u0186\5\u0174\u00bb\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u018b\5\24\13\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3"+
		"\2\2\2\u018c\u0185\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0183\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\2\2\3\u0194"+
		"\3\3\2\2\2\u0195\u0197\5\6\4\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2"+
		"\u0197\u0198\3\2\2\2\u0198\u0199\5\b\5\2\u0199\5\3\2\2\2\u019a\u019b\7"+
		"\b\2\2\u019b\u019d\5\u0170\u00b9\2\u019c\u019e\5\u0174\u00bb\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\7\3\2\2\2\u019f\u01a1\5\n\6\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\t\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7\t\2\2\u01a6\u01ab"+
		"\5\f\7\2\u01a7\u01a8\7i\2\2\u01a8\u01aa\5\f\7\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\5\u0174\u00bb\2\u01af\u01ae\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\13\3\2\2\2\u01b1\u01c5\5\20\t\2\u01b2\u01c2"+
		"\5\u0170\u00b9\2\u01b3\u01c0\7j\2\2\u01b4\u01c1\7[\2\2\u01b5\u01b6\7O"+
		"\2\2\u01b6\u01bb\5\16\b\2\u01b7\u01b8\7i\2\2\u01b8\u01ba\5\16\b\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7P\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01b4\3\2\2\2\u01c0\u01b5\3\2\2\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01b3\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01b1\3\2\2\2\u01c4\u01b2\3\2\2\2\u01c5\r\3\2\2\2\u01c6\u01c8\5\u0172"+
		"\u00ba\2\u01c7\u01c9\5\22\n\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2"+
		"\u01c9\17\3\2\2\2\u01ca\u01cb\5\u0170\u00b9\2\u01cb\u01cc\5\22\n\2\u01cc"+
		"\21\3\2\2\2\u01cd\u01ce\7\n\2\2\u01ce\u01cf\5\u0172\u00ba\2\u01cf\23\3"+
		"\2\2\2\u01d0\u01da\5\26\f\2\u01d1\u01da\5\30\r\2\u01d2\u01da\5\32\16\2"+
		"\u01d3\u01da\5\34\17\2\u01d4\u01da\5b\62\2\u01d5\u01da\5h\65\2\u01d6\u01da"+
		"\5p9\2\u01d7\u01da\5\u0088E\2\u01d8\u01da\5v<\2\u01d9\u01d0\3\2\2\2\u01d9"+
		"\u01d1\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2"+
		"\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\25\3\2\2\2\u01db\u01dd\5\u015e\u00b0\2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\7\13\2\2"+
		"\u01df\u01e1\7\7\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01ed\5\u0172\u00ba\2\u01e6\u01e8\7\7\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ee\5H%\2\u01ed\u01e9\3\2\2\2\u01ed\u01ee\3\2\2"+
		"\2\u01ee\u01f6\3\2\2\2\u01ef\u01f1\7\7\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f7\5\36\20\2\u01f6\u01f2\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u0206\3\2\2\2\u01f8\u01fa\7\7\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0202\7\u0087\2\2\u01ff\u0201\7\7\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0207\5$\23\2\u0206"+
		"\u01fb\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020f\3\2\2\2\u0208\u020a\7\7"+
		"\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\5\66"+
		"\34\2\u020f\u020b\3\2\2\2\u020f\u0210\3\2\2\2\u0210\27\3\2\2\2\u0211\u0213"+
		"\5\u015e\u00b0\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3"+
		"\2\2\2\u0214\u0218\7\f\2\2\u0215\u0217\7\7\2\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u0223\5\u0172\u00ba\2\u021c\u021e\7\7\2"+
		"\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\5H%\2\u0223"+
		"\u021f\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0233\3\2\2\2\u0225\u0227\7\7"+
		"\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022f\7\u0087"+
		"\2\2\u022c\u022e\7\7\2\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0232\u0234\5*\26\2\u0233\u0228\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u023c\3\2\2\2\u0235\u0237\7\7\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2"+
		"\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023d\5\66\34\2\u023c\u0238\3\2\2\2\u023c\u023d\3"+
		"\2\2\2\u023d\31\3\2\2\2\u023e\u0240\5\u015e\u00b0\2\u023f\u023e\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0245\7\21\2\2\u0242"+
		"\u0244\7\7\2\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u0250\5\u0172\u00ba\2\u0249\u024b\7\7\2\2\u024a\u0249\3\2\2\2\u024b\u024e"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0251\5\36\20\2\u0250\u024c\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u0259\3\2\2\2\u0252\u0254\7\7\2\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0258\u025a\5\66\34\2\u0259\u0255\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\33\3\2\2\2\u025b\u025d\5\u015e\u00b0\2\u025c\u025b"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\7\16\2\2"+
		"\u025f\u0261\7\7\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265"+
		"\u026d\5\u0172\u00ba\2\u0266\u0268\7\7\2\2\u0267\u0266\3\2\2\2\u0268\u026b"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026e\5H%\2\u026d\u0269\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\u0272\3\2\2\2\u026f\u0271\7\7\2\2\u0270\u026f\3\2\2\2\u0271\u0274"+
		"\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0275\u027d\5\36\20\2\u0276\u0278\7\7\2\2\u0277\u0276\3"+
		"\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\5\66\34\2\u027d\u0279\3"+
		"\2\2\2\u027d\u027e\3\2\2\2\u027e\35\3\2\2\2\u027f\u0281\5\u015e\u00b0"+
		"\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0286"+
		"\7\27\2\2\u0283\u0285\7\7\2\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2"+
		"\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286"+
		"\3\2\2\2\u0289\u0280\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\5 \21\2\u028c\37\3\2\2\2\u028d\u0291\7M\2\2\u028e\u0290\7\7\2\2"+
		"\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u02a8\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u02a5\5\"\22\2"+
		"\u0295\u0297\7\7\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"\u029f\7i\2\2\u029c\u029e\7\7\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2"+
		"\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a2\u02a4\5\"\22\2\u02a3\u0298\3\2\2\2\u02a4\u02a7\3"+
		"\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a8\u0294\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ad\3\2"+
		"\2\2\u02aa\u02ac\7\7\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02b0\u02b1\7N\2\2\u02b1!\3\2\2\2\u02b2\u02b4\5\u015e\u00b0\2\u02b3"+
		"\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b7\t\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bb\3\2\2\2\u02b8"+
		"\u02ba\7\7\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be"+
		"\u02c2\5\u0172\u00ba\2\u02bf\u02c1\7\7\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c5\u02c9\7p\2\2\u02c6\u02c8\7\7\2\2\u02c7\u02c6\3\2"+
		"\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02db\5T+\2\u02cd\u02cf\7\7\2"+
		"\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d7\7S\2\2\u02d4"+
		"\u02d6\7\7\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02dc\5\u00a2R\2\u02db\u02d0\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc#\3\2\2"+
		"\2\u02dd\u02ee\5&\24\2\u02de\u02e0\7\7\2\2\u02df\u02de\3\2\2\2\u02e0\u02e3"+
		"\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3"+
		"\u02e1\3\2\2\2\u02e4\u02e8\7i\2\2\u02e5\u02e7\7\7\2\2\u02e6\u02e5\3\2"+
		"\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\5&\24\2\u02ec\u02e1\3\2"+
		"\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"%\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f3\5\u016a\u00b6\2\u02f2\u02f1"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\5(\25\2\u02f5"+
		"\'\3\2\2\2\u02f6\u02f8\5\u0170\u00b9\2\u02f7\u02f9\5@!\2\u02f8\u02f7\3"+
		"\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02fc\5.\30\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc)\3\2\2\2\u02fd\u030e\5,\27\2"+
		"\u02fe\u0300\7\7\2\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0308\7i\2\2\u0305\u0307\7\7\2\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2"+
		"\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u030d\5,\27\2\u030c\u0301\3\2\2\2\u030d\u0310\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f+\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0311\u0313\5\u016a\u00b6\2\u0312\u0311\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\5\u0170\u00b9\2\u0315-\3\2\2\2"+
		"\u0316\u031a\7M\2\2\u0317\u0319\7\7\2\2\u0318\u0317\3\2\2\2\u0319\u031c"+
		"\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0337\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031d\u032e\5\60\31\2\u031e\u0320\7\7\2\2\u031f\u031e\3"+
		"\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0328\7i\2\2\u0325\u0327\7\7"+
		"\2\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\5\60"+
		"\31\2\u032c\u0321\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0334\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0333\7\7"+
		"\2\2\u0332\u0331\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u031d\3\2"+
		"\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7N\2\2\u033a"+
		"/\3\2\2\2\u033b\u033d\5\u016a\u00b6\2\u033c\u033b\3\2\2\2\u033c\u033d"+
		"\3\2\2\2\u033d\u034c\3\2\2\2\u033e\u0342\5\u0172\u00ba\2\u033f\u0341\7"+
		"\7\2\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0349\7S"+
		"\2\2\u0346\u0348\7\7\2\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2"+
		"\2\2\u034c\u033e\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e"+
		"\u0350\7o\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0354\3\2"+
		"\2\2\u0351\u0353\7\7\2\2\u0352\u0351\3\2\2\2\u0353\u0356\3\2\2\2\u0354"+
		"\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0354\3\2"+
		"\2\2\u0357\u0358\5\u00a2R\2\u0358\61\3\2\2\2\u0359\u035b\5\u015e\u00b0"+
		"\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0360"+
		"\7\27\2\2\u035d\u035f\7\7\2\2\u035e\u035d\3\2\2\2\u035f\u0362\3\2\2\2"+
		"\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0360"+
		"\3\2\2\2\u0363\u0372\5\u008aF\2\u0364\u0366\7\7\2\2\u0365\u0364\3\2\2"+
		"\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036e\7p\2\2\u036b\u036d\7\7\2\2\u036c"+
		"\u036b\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2"+
		"\2\2\u036f\u0371\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0373\5\64\33\2\u0372"+
		"\u0367\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0377\3\2\2\2\u0374\u0376\7\7"+
		"\2\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037c\5\u0092"+
		"J\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\63\3\2\2\2\u037d\u0381"+
		"\t\3\2\2\u037e\u0380\7\7\2\2\u037f\u037e\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0384\u0385\5.\30\2\u0385\65\3\2\2\2\u0386\u038a\7Q\2\2\u0387\u0389"+
		"\7\7\2\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u0390\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038f\58"+
		"\35\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0396\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0395\7\7"+
		"\2\2\u0394\u0393\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039a\7R"+
		"\2\2\u039a\67\3\2\2\2\u039b\u03a1\5\24\13\2\u039c\u03a1\5\62\32\2\u039d"+
		"\u03a1\5:\36\2\u039e\u03a1\5<\37\2\u039f\u03a1\5> \2\u03a0\u039b\3\2\2"+
		"\2\u03a0\u039c\3\2\2\2\u03a0\u039d\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u039f"+
		"\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\5\u0174\u00bb\2\u03a3\u03a2\3"+
		"\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"9\3\2\2\2\u03a7\u03ab\7\30\2\2\u03a8\u03aa\7\7\2\2\u03a9\u03a8\3\2\2\2"+
		"\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae"+
		"\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\5\u0092J\2\u03af;\3\2\2\2\u03b0"+
		"\u03b4\7\27\2\2\u03b1\u03b3\7\7\2\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3"+
		"\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03b8\5\u0092J\2\u03b8=\3\2\2\2\u03b9\u03bb\5\u015e"+
		"\u00b0\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03c4\7\22\2\2\u03bd\u03bf\7\7\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3"+
		"\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c3\u03c5\5\66\34\2\u03c4\u03c0\3\2\2\2\u03c4\u03c5\3"+
		"\2\2\2\u03c5?\3\2\2\2\u03c6\u03ca\7\177\2\2\u03c7\u03c9\7\7\2\2\u03c8"+
		"\u03c7\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2"+
		"\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03d8\5B\"\2\u03ce"+
		"\u03d0\7\7\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4"+
		"\u03d5\7i\2\2\u03d5\u03d7\5B\"\2\u03d6\u03d1\3\2\2\2\u03d7\u03da\3\2\2"+
		"\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03de\3\2\2\2\u03da\u03d8"+
		"\3\2\2\2\u03db\u03dd\7\7\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2"+
		"\2\2\u03e1\u03e2\7\u0083\2\2\u03e2A\3\2\2\2\u03e3\u03e5\5D#\2\u03e4\u03e3"+
		"\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\5T+\2\u03e7"+
		"\u03e9\7u\2\2\u03e8\u03e4\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9C\3\2\2\2\u03ea"+
		"\u03ee\5F$\2\u03eb\u03ed\7\7\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2"+
		"\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee"+
		"\3\2\2\2\u03f1\u03ea\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4E\3\2\2\2\u03f5\u03f8\5R*\2\u03f6\u03f8\5\u016c\u00b7"+
		"\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8G\3\2\2\2\u03f9\u03fd"+
		"\7\177\2\2\u03fa\u03fc\7\7\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2"+
		"\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd"+
		"\3\2\2\2\u0400\u0411\5J&\2\u0401\u0403\7\7\2\2\u0402\u0401\3\2\2\2\u0403"+
		"\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2"+
		"\2\2\u0406\u0404\3\2\2\2\u0407\u040b\7i\2\2\u0408\u040a\7\7\2\2\u0409"+
		"\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0410\5J&\2\u040f\u0404"+
		"\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0417\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0416\7\7\2\2\u0415\u0414\3\2"+
		"\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\7\u0083\2\2\u041bI\3\2"+
		"\2\2\u041c\u041e\5L\'\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0441\5\u0172\u00ba\2\u0420\u0422\7\7\2\2\u0421\u0420"+
		"\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0426\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u042a\7p\2\2\u0427\u0429\7\7"+
		"\2\2\u0428\u0427\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u043e\5T"+
		"+\2\u042e\u0430\7\7\2\2\u042f\u042e\3\2\2\2\u0430\u0433\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0431\3\2"+
		"\2\2\u0434\u0438\7c\2\2\u0435\u0437\7\7\2\2\u0436\u0435\3\2\2\2\u0437"+
		"\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2"+
		"\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5T+\2\u043c\u0431\3\2\2\2\u043d\u0440"+
		"\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0441\u0423\3\2\2\2\u0441\u0442\3\2\2\2\u0442K\3\2\2\2"+
		"\u0443\u0447\5N(\2\u0444\u0446\7\7\2\2\u0445\u0444\3\2\2\2\u0446\u0449"+
		"\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044b\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u044a\u0443\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044a\3\2"+
		"\2\2\u044c\u044d\3\2\2\2\u044dM\3\2\2\2\u044e\u0452\5P)\2\u044f\u0452"+
		"\5R*\2\u0450\u0452\5\u016c\u00b7\2\u0451\u044e\3\2\2\2\u0451\u044f\3\2"+
		"\2\2\u0451\u0450\3\2\2\2\u0452\u0456\3\2\2\2\u0453\u0455\7\7\2\2\u0454"+
		"\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2"+
		"\2\2\u0457O\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\7\26\2\2\u045aQ\3"+
		"\2\2\2\u045b\u045c\t\4\2\2\u045cS\3\2\2\2\u045d\u045f\5\u016a\u00b6\2"+
		"\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0468\3\2\2\2\u0460\u0469"+
		"\5V,\2\u0461\u0469\5\\/\2\u0462\u0469\5^\60\2\u0463\u0469\5`\61\2\u0464"+
		"\u0466\5\u0170\u00b9\2\u0465\u0467\5@!\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0460\3\2\2\2\u0468\u0461\3\2\2\2\u0468"+
		"\u0462\3\2\2\2\u0468\u0463\3\2\2\2\u0468\u0464\3\2\2\2\u0469U\3\2\2\2"+
		"\u046a\u046e\5Z.\2\u046b\u046d\7\7\2\2\u046c\u046b\3\2\2\2\u046d\u0470"+
		"\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470"+
		"\u046e\3\2\2\2\u0471\u0475\7\u0089\2\2\u0472\u0474\7\7\2\2\u0473\u0472"+
		"\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u0478\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u0479\5T+\2\u0479W\3\2\2\2\u047a"+
		"\u047c\5\u016a\u00b6\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0480"+
		"\3\2\2\2\u047d\u0481\5\\/\2\u047e\u0481\5`\61\2\u047f\u0481\5\u0170\u00b9"+
		"\2\u0480\u047d\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u047f\3\2\2\2\u0481Y"+
		"\3\2\2\2\u0482\u0486\7M\2\2\u0483\u0485\7\7\2\2\u0484\u0483\3\2\2\2\u0485"+
		"\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u049d\3\2"+
		"\2\2\u0488\u0486\3\2\2\2\u0489\u049a\5T+\2\u048a\u048c\7\7\2\2\u048b\u048a"+
		"\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490\u0494\7i\2\2\u0491\u0493\7\7"+
		"\2\2\u0492\u0491\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0499\5T"+
		"+\2\u0498\u048d\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u0489\3\2"+
		"\2\2\u049d\u049e\3\2\2\2\u049e\u04a2\3\2\2\2\u049f\u04a1\7\7\2\2\u04a0"+
		"\u049f\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2"+
		"\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a6\7N\2\2\u04a6"+
		"[\3\2\2\2\u04a7\u04ab\7M\2\2\u04a8\u04aa\7\7\2\2\u04a9\u04a8\3\2\2\2\u04aa"+
		"\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2"+
		"\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04b2\5T+\2\u04af\u04b1\7\7\2\2\u04b0\u04af"+
		"\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b5\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b6\7N\2\2\u04b6]\3\2\2\2\u04b7"+
		"\u04bb\7O\2\2\u04b8\u04ba\7\7\2\2\u04b9\u04b8\3\2\2\2\u04ba\u04bd\3\2"+
		"\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04c2\5T+\2\u04bf\u04c1\7\7\2\2\u04c0\u04bf\3\2\2"+
		"\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5"+
		"\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\7P\2\2\u04c6_\3\2\2\2\u04c7\u04c9"+
		"\5\u0170\u00b9\2\u04c8\u04ca\5@!\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2"+
		"\2\2\u04ca\u04ce\3\2\2\2\u04cb\u04ce\5\\/\2\u04cc\u04ce\5^\60\2\u04cd"+
		"\u04c7\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04cf\3\2"+
		"\2\2\u04cf\u04d0\7u\2\2\u04d0a\3\2\2\2\u04d1\u04d3\5\u015e\u00b0\2\u04d2"+
		"\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d8\7\r"+
		"\2\2\u04d5\u04d7\7\7\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8"+
		"\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04d8\3\2"+
		"\2\2\u04db\u04ea\5\u0172\u00ba\2\u04dc\u04de\7\7\2\2\u04dd\u04dc\3\2\2"+
		"\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2"+
		"\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e6\7\u0087\2\2\u04e3\u04e5\7\7\2"+
		"\2\u04e4\u04e3\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04eb\5$\23\2\u04ea"+
		"\u04df\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04f3\3\2\2\2\u04ec\u04ee\7\7"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef"+
		"\u04f0\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2\u04f4\5d"+
		"\63\2\u04f3\u04ef\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4c\3\2\2\2\u04f5\u04f9"+
		"\7Q\2\2\u04f6\u04f8\7\7\2\2\u04f7\u04f6\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9"+
		"\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04ff\3\2\2\2\u04fb\u04f9\3\2"+
		"\2\2\u04fc\u04fe\5f\64\2\u04fd\u04fc\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0505\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0502\u0504\7\7\2\2\u0503\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505"+
		"\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2\2\u0507\u0505\3\2"+
		"\2\2\u0508\u0509\7R\2\2\u0509e\3\2\2\2\u050a\u050e\5\24\13\2\u050b\u050e"+
		"\5:\36\2\u050c\u050e\5<\37\2\u050d\u050a\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050c\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\5\u0174\u00bb\2\u0510\u050f"+
		"\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"g\3\2\2\2\u0514\u0516\5\u015e\u00b0\2\u0515\u0514\3\2\2\2\u0515\u0516"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051b\7\20\2\2\u0518\u051a\7\7\2\2"+
		"\u0519\u0518\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u0526\5\u0172\u00ba"+
		"\2\u051f\u0521\7\7\2\2\u0520\u051f\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0522\3\2\2\2\u0525"+
		"\u0527\5\36\20\2\u0526\u0522\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052b\3"+
		"\2\2\2\u0528\u052a\7\7\2\2\u0529\u0528\3\2\2\2\u052a\u052d\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u052b\3\2"+
		"\2\2\u052e\u052f\5j\66\2\u052fi\3\2\2\2\u0530\u0534\7Q\2\2\u0531\u0533"+
		"\7\7\2\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534"+
		"\u0535\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0539\5l"+
		"\67\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u054d\3\2\2\2\u053a"+
		"\u053c\7\7\2\2\u053b\u053a\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2"+
		"\2\2\u053d\u053e\3\2\2\2\u053e\u0540\3\2\2\2\u053f\u053d\3\2\2\2\u0540"+
		"\u0544\7r\2\2\u0541\u0543\7\7\2\2\u0542\u0541\3\2\2\2\u0543\u0546\3\2"+
		"\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u054a\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u0549\58\35\2\u0548\u0547\3\2\2\2\u0549\u054c\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054e\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u053d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0552\3\2"+
		"\2\2\u054f\u0551\7\7\2\2\u0550\u054f\3\2\2\2\u0551\u0554\3\2\2\2\u0552"+
		"\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0552\3\2"+
		"\2\2\u0555\u0556\7R\2\2\u0556k\3\2\2\2\u0557\u0568\5n8\2\u0558\u055a\7"+
		"\7\2\2\u0559\u0558\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0562\7i"+
		"\2\2\u055f\u0561\7\7\2\2\u0560\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562"+
		"\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2"+
		"\2\2\u0565\u0567\5n8\2\u0566\u055b\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569m\3\2\2\2\u056a\u0568\3\2\2\2\u056b"+
		"\u056d\5\u015e\u00b0\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e"+
		"\3\2\2\2\u056e\u0576\5\u0172\u00ba\2\u056f\u0571\7\7\2\2\u0570\u056f\3"+
		"\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u0575\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0577\5.\30\2\u0576\u0572\3\2"+
		"\2\2\u0576\u0577\3\2\2\2\u0577\u057f\3\2\2\2\u0578\u057a\7\7\2\2\u0579"+
		"\u0578\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2"+
		"\2\2\u057c\u057e\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u0580\5\66\34\2\u057f"+
		"\u057b\3\2\2\2\u057f\u0580\3\2\2\2\u0580o\3\2\2\2\u0581\u0583\5\u015e"+
		"\u00b0\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u058c\7-\2\2\u0585\u0587\7\7\2\2\u0586\u0585\3\2\2\2\u0587\u058a\3\2"+
		"\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a"+
		"\u0588\3\2\2\2\u058b\u058d\5H%\2\u058c\u0588\3\2\2\2\u058c\u058d\3\2\2"+
		"\2\u058d\u0591\3\2\2\2\u058e\u0590\7\7\2\2\u058f\u058e\3\2\2\2\u0590\u0593"+
		"\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0594\u059c\5X-\2\u0595\u0597\7\7\2\2\u0596\u0595\3\2\2"+
		"\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b"+
		"\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059d\5r:\2\u059c\u0598\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059dq\3\2\2\2\u059e\u05a2\7Q\2\2\u059f\u05a1\7\7\2\2\u05a0"+
		"\u059f\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2"+
		"\2\2\u05a3\u05a8\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a7\5t;\2\u05a6\u05a5"+
		"\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ae\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ad\7\7\2\2\u05ac\u05ab\3\2"+
		"\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u05b1\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b2\7R\2\2\u05b2s\3\2\2\2\u05b3"+
		"\u05b7\5\u0088E\2\u05b4\u05b7\5v<\2\u05b5\u05b7\5\62\32\2\u05b6\u05b3"+
		"\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8"+
		"\u05ba\5\u0174\u00bb\2\u05b9\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05b9"+
		"\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bcu\3\2\2\2\u05bd\u05bf\5\u015e\u00b0"+
		"\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c8"+
		"\t\5\2\2\u05c1\u05c3\7\7\2\2\u05c2\u05c1\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4"+
		"\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05c4\3\2"+
		"\2\2\u05c7\u05c9\5H%\2\u05c8\u05c4\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cd"+
		"\3\2\2\2\u05ca\u05cc\7\7\2\2\u05cb\u05ca\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd"+
		"\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d2\3\2\2\2\u05cf\u05cd\3\2"+
		"\2\2\u05d0\u05d3\5x=\2\u05d1\u05d3\5z>\2\u05d2\u05d0\3\2\2\2\u05d2\u05d1"+
		"\3\2\2\2\u05d3\u05e2\3\2\2\2\u05d4\u05d6\7\7\2\2\u05d5\u05d4\3\2\2\2\u05d6"+
		"\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2"+
		"\2\2\u05d9\u05d7\3\2\2\2\u05da\u05de\7S\2\2\u05db\u05dd\7\7\2\2\u05dc"+
		"\u05db\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e1\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\5\u00a2R\2\u05e2"+
		"\u05d7\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05eb\3\2\2\2\u05e4\u05e6\7\7"+
		"\2\2\u05e5\u05e4\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\5|"+
		"?\2\u05eb\u05e7\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ecw\3\2\2\2\u05ed\u05ef"+
		"\5\u016a\u00b6\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3"+
		"\2\2\2\u05f0\u05ff\5\u0172\u00ba\2\u05f1\u05f3\7\7\2\2\u05f2\u05f1\3\2"+
		"\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f7\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05fb\7p\2\2\u05f8\u05fa\7\7"+
		"\2\2\u05f9\u05f8\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0600\5T"+
		"+\2\u05ff\u05f4\3\2\2\2\u05ff\u0600\3\2\2\2\u0600y\3\2\2\2\u0601\u0605"+
		"\7M\2\2\u0602\u0604\7\7\2\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605"+
		"\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2"+
		"\2\2\u0608\u0619\5x=\2\u0609\u060b\7\7\2\2\u060a\u0609\3\2\2\2\u060b\u060e"+
		"\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e"+
		"\u060c\3\2\2\2\u060f\u0613\7i\2\2\u0610\u0612\7\7\2\2\u0611\u0610\3\2"+
		"\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u0616\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0618\5x=\2\u0617\u060c\3\2\2"+
		"\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061f"+
		"\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u061e\7\7\2\2\u061d\u061c\3\2\2\2\u061e"+
		"\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2"+
		"\2\2\u0621\u061f\3\2\2\2\u0622\u0623\7N\2\2\u0623{\3\2\2\2\u0624\u0628"+
		"\7Q\2\2\u0625\u0627\7\7\2\2\u0626\u0625\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u063f\3\2\2\2\u062a\u0628\3\2"+
		"\2\2\u062b\u0633\5~@\2\u062c\u062e\5\u0174\u00bb\2\u062d\u062c\3\2\2\2"+
		"\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632"+
		"\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u0634\5\u0080A\2\u0633\u062f\3\2\2"+
		"\2\u0633\u0634\3\2\2\2\u0634\u0640\3\2\2\2\u0635\u063d\5\u0080A\2\u0636"+
		"\u0638\5\u0174\u00bb\2\u0637\u0636\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\3\2\2\2\u063b\u0639\3\2\2\2\u063c"+
		"\u063e\5~@\2\u063d\u0639\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\3\2\2"+
		"\2\u063f\u062b\3\2\2\2\u063f\u0635\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0644"+
		"\3\2\2\2\u0641\u0643\7\7\2\2\u0642\u0641\3\2\2\2\u0643\u0646\3\2\2\2\u0644"+
		"\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0644\3\2"+
		"\2\2\u0647\u0648\7R\2\2\u0648}\3\2\2\2\u0649\u064b\5\u015e\u00b0\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u065b\7\35"+
		"\2\2\u064d\u064f\7\7\2\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2\2\2\u0650"+
		"\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0650\3\2"+
		"\2\2\u0653\u0657\7M\2\2\u0654\u0656\7\7\2\2\u0655\u0654\3\2\2\2\u0656"+
		"\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2"+
		"\2\2\u0659\u0657\3\2\2\2\u065a\u065c\7N\2\2\u065b\u0650\3\2\2\2\u065b"+
		"\u065c\3\2\2\2\u065c\u066b\3\2\2\2\u065d\u065f\7\7\2\2\u065e\u065d\3\2"+
		"\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661"+
		"\u0663\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0667\7\u0088\2\2\u0664\u0666"+
		"\7\7\2\2\u0665\u0664\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u066a\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066c\5T"+
		"+\2\u066b\u0660\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0670\3\2\2\2\u066d"+
		"\u066f\7\7\2\2\u066e\u066d\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2"+
		"\2\2\u0670\u0671\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0673"+
		"\u0675\5\u0090I\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\177\3"+
		"\2\2\2\u0676\u0678\5\u015e\u00b0\2\u0677\u0676\3\2\2\2\u0677\u0678\3\2"+
		"\2\2\u0678\u0679\3\2\2\2\u0679\u067d\7\36\2\2\u067a\u067c\7\7\2\2\u067b"+
		"\u067a\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u06a9\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0684\7M\2\2\u0681"+
		"\u0683\7\7\2\2\u0682\u0681\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2"+
		"\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686\u0684\3\2\2\2\u0687"+
		"\u068b\5\u0082B\2\u0688\u068a\7\7\2\2\u0689\u0688\3\2\2\2\u068a\u068d"+
		"\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068e\u068f\7N\2\2\u068f\u0691\3\2\2\2\u0690\u0680\3\2"+
		"\2\2\u0690\u0691\3\2\2\2\u0691\u06a0\3\2\2\2\u0692\u0694\7\7\2\2\u0693"+
		"\u0692\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2"+
		"\2\2\u0696\u0698\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u069c\7\u0088\2\2\u0699"+
		"\u069b\7\7\2\2\u069a\u0699\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2"+
		"\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u069c\3\2\2\2\u069f"+
		"\u06a1\5T+\2\u06a0\u0695\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a5\3\2\2"+
		"\2\u06a2\u06a4\7\7\2\2\u06a3\u06a2\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a3"+
		"\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a8"+
		"\u06aa\5\u0090I\2\u06a9\u0690\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u0081"+
		"\3\2\2\2\u06ab\u06ad\5\u0084C\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2"+
		"\2\u06ad\u06ae\3\2\2\2\u06ae\u06bd\5\u0086D\2\u06af\u06b1\7\7\2\2\u06b0"+
		"\u06af\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2"+
		"\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b5\u06b9\7S\2\2\u06b6"+
		"\u06b8\7\7\2\2\u06b7\u06b6\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2"+
		"\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc"+
		"\u06be\5\u00a2R\2\u06bd\u06b2\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u0083"+
		"\3\2\2\2\u06bf\u06c2\5\u016c\u00b7\2\u06c0\u06c2\5\u0166\u00b4\2\u06c1"+
		"\u06bf\3\2\2\2\u06c1\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c1\3\2"+
		"\2\2\u06c3\u06c4\3\2\2\2\u06c4\u0085\3\2\2\2\u06c5\u06d4\5\u0172\u00ba"+
		"\2\u06c6\u06c8\7\7\2\2\u06c7\u06c6\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7"+
		"\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc"+
		"\u06d0\7p\2\2\u06cd\u06cf\7\7\2\2\u06ce\u06cd\3\2\2\2\u06cf\u06d2\3\2"+
		"\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2"+
		"\u06d0\3\2\2\2\u06d3\u06d5\5T+\2\u06d4\u06c9\3\2\2\2\u06d4\u06d5\3\2\2"+
		"\2\u06d5\u0087\3\2\2\2\u06d6\u06d8\5\u015e\u00b0\2\u06d7\u06d6\3\2\2\2"+
		"\u06d7\u06d8\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06e1\t\6\2\2\u06da\u06dc"+
		"\7\7\2\2\u06db\u06da\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e2\5H"+
		"%\2\u06e1\u06dd\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e6\3\2\2\2\u06e3"+
		"\u06e5\7\7\2\2\u06e4\u06e3\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2"+
		"\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9"+
		"\u06ed\5\u0172\u00ba\2\u06ea\u06ec\7\7\2\2\u06eb\u06ea\3\2\2\2\u06ec\u06ef"+
		"\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef"+
		"\u06ed\3\2\2\2\u06f0\u06ff\5\u008aF\2\u06f1\u06f3\7\7\2\2\u06f2\u06f1"+
		"\3\2\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06f7\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06fb\7\u0088\2\2\u06f8\u06fa"+
		"\7\7\2\2\u06f9\u06f8\3\2\2\2\u06fa\u06fd\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb"+
		"\u06fc\3\2\2\2\u06fc\u06fe\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fe\u0700\5T"+
		"+\2\u06ff\u06f4\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0708\3\2\2\2\u0701"+
		"\u0703\7\7\2\2\u0702\u0701\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2"+
		"\2\2\u0704\u0705\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u0704\3\2\2\2\u0707"+
		"\u0709\5\u0090I\2\u0708\u0704\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u0089"+
		"\3\2\2\2\u070a\u070e\7M\2\2\u070b\u070d\7\7\2\2\u070c\u070b\3\2\2\2\u070d"+
		"\u0710\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0725\3\2"+
		"\2\2\u0710\u070e\3\2\2\2\u0711\u0722\5\u008cG\2\u0712\u0714\7\7\2\2\u0713"+
		"\u0712\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2"+
		"\2\2\u0716\u0718\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u071c\7i\2\2\u0719"+
		"\u071b\7\7\2\2\u071a\u0719\3\2\2\2\u071b\u071e\3\2\2\2\u071c\u071a\3\2"+
		"\2\2\u071c\u071d\3\2\2\2\u071d\u071f\3\2\2\2\u071e\u071c\3\2\2\2\u071f"+
		"\u0721\5\u008cG\2\u0720\u0715\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0725"+
		"\u0711\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u072a\3\2\2\2\u0727\u0729\7\7"+
		"\2\2\u0728\u0727\3\2\2\2\u0729\u072c\3\2\2\2\u072a\u0728\3\2\2\2\u072a"+
		"\u072b\3\2\2\2\u072b\u072d\3\2\2\2\u072c\u072a\3\2\2\2\u072d\u072e\7N"+
		"\2\2\u072e\u008b\3\2\2\2\u072f\u0731\5\u0084C\2\u0730\u072f\3\2\2\2\u0730"+
		"\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0741\5\u008eH\2\u0733\u0735"+
		"\7\7\2\2\u0734\u0733\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u0739\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073d\7S"+
		"\2\2\u073a\u073c\7\7\2\2\u073b\u073a\3\2\2\2\u073c\u073f\3\2\2\2\u073d"+
		"\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740\3\2\2\2\u073f\u073d\3\2"+
		"\2\2\u0740\u0742\5\u00a2R\2\u0741\u0736\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u008d\3\2\2\2\u0743\u0747\5\u0172\u00ba\2\u0744\u0746\7\7\2\2\u0745\u0744"+
		"\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748"+
		"\u074a\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074e\7p\2\2\u074b\u074d\7\7"+
		"\2\2\u074c\u074b\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u0752\5T"+
		"+\2\u0752\u008f\3\2\2\2\u0753\u075d\5\u0092J\2\u0754\u0758\7S\2\2\u0755"+
		"\u0757\7\7\2\2\u0756\u0755\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2"+
		"\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3\2\2\2\u075a\u0758\3\2\2\2\u075b"+
		"\u075d\5\u00a2R\2\u075c\u0753\3\2\2\2\u075c\u0754\3\2\2\2\u075d\u0091"+
		"\3\2\2\2\u075e\u0762\7Q\2\2\u075f\u0761\7\7\2\2\u0760\u075f\3\2\2\2\u0761"+
		"\u0764\3\2\2\2\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765\3\2"+
		"\2\2\u0764\u0762\3\2\2\2\u0765\u0769\5\u0094K\2\u0766\u0768\7\7\2\2\u0767"+
		"\u0766\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2"+
		"\2\2\u076a\u076c\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076d\7R\2\2\u076d"+
		"\u0093\3\2\2\2\u076e\u0778\5\u0096L\2\u076f\u0771\5\u0174\u00bb\2\u0770"+
		"\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2"+
		"\2\2\u0773\u0774\3\2\2\2\u0774\u0775\5\u0096L\2\u0775\u0777\3\2\2\2\u0776"+
		"\u0770\3\2\2\2\u0777\u077a\3\2\2\2\u0778\u0776\3\2\2\2\u0778\u0779\3\2"+
		"\2\2\u0779\u077c\3\2\2\2\u077a\u0778\3\2\2\2\u077b\u076e\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u0780\3\2\2\2\u077d\u077f\5\u0174\u00bb\2\u077e\u077d"+
		"\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e\3\2\2\2\u0780\u0781\3\2\2\2\u0781"+
		"\u0095\3\2\2\2\u0782\u0780\3\2\2\2\u0783\u0786\5\u00f2z\2\u0784\u0786"+
		"\5\u016c\u00b7\2\u0785\u0783\3\2\2\2\u0785\u0784\3\2\2\2\u0786\u0789\3"+
		"\2\2\2\u0787\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078d\3\2\2\2\u0789"+
		"\u0787\3\2\2\2\u078a\u078c\7\7\2\2\u078b\u078a\3\2\2\2\u078c\u078f\3\2"+
		"\2\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0794\3\2\2\2\u078f"+
		"\u078d\3\2\2\2\u0790\u0795\5\24\13\2\u0791\u0795\5\u00a0Q\2\u0792\u0795"+
		"\5\u0098M\2\u0793\u0795\5\u00a2R\2\u0794\u0790\3\2\2\2\u0794\u0791\3\2"+
		"\2\2\u0794\u0792\3\2\2\2\u0794\u0793\3\2\2\2\u0795\u0097\3\2\2\2\u0796"+
		"\u079a\5\u009aN\2\u0797\u079a\5\u009cO\2\u0798\u079a\5\u009eP\2\u0799"+
		"\u0796\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u0798\3\2\2\2\u079a\u0099\3\2"+
		"\2\2\u079b\u079f\7\63\2\2\u079c\u079e\7\7\2\2\u079d\u079c\3\2\2\2\u079e"+
		"\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\3\2"+
		"\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a6\7M\2\2\u07a3\u07a5\7\7\2\2\u07a4"+
		"\u07a3\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2"+
		"\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07ab\5\u016a\u00b6"+
		"\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ae\3\2\2\2\u07ac\u07af"+
		"\5x=\2\u07ad\u07af\5z>\2\u07ae\u07ac\3\2\2\2\u07ae\u07ad\3\2\2\2\u07af"+
		"\u07b3\3\2\2\2\u07b0\u07b2\7\7\2\2\u07b1\u07b0\3\2\2\2\u07b2\u07b5\3\2"+
		"\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\3\2\2\2\u07b5"+
		"\u07b3\3\2\2\2\u07b6\u07ba\7B\2\2\u07b7\u07b9\7\7\2\2\u07b8\u07b7\3\2"+
		"\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07bd\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07c1\5\u00a2R\2\u07be\u07c0"+
		"\7\7\2\2\u07bf\u07be\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07c8\7N"+
		"\2\2\u07c5\u07c7\7\7\2\2\u07c6\u07c5\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8"+
		"\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c8\3\2"+
		"\2\2\u07cb\u07cc\5\u00dan\2\u07cc\u009b\3\2\2\2\u07cd\u07d1\7\67\2\2\u07ce"+
		"\u07d0\7\7\2\2\u07cf\u07ce\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2"+
		"\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d4\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d4"+
		"\u07d8\7M\2\2\u07d5\u07d7\7\7\2\2\u07d6\u07d5\3\2\2\2\u07d7\u07da\3\2"+
		"\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\3\2\2\2\u07da"+
		"\u07d8\3\2\2\2\u07db\u07df\5\u00a2R\2\u07dc\u07de\7\7\2\2\u07dd\u07dc"+
		"\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e6\7N\2\2\u07e3\u07e5\7\7"+
		"\2\2\u07e4\u07e3\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\5\u00da"+
		"n\2\u07ea\u009d\3\2\2\2\u07eb\u07ef\7\66\2\2\u07ec\u07ee\7\7\2\2\u07ed"+
		"\u07ec\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2"+
		"\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f6\5\u00dan\2\u07f3"+
		"\u07f5\7\7\2\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2"+
		"\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9"+
		"\u07fd\7\67\2\2\u07fa\u07fc\7\7\2\2\u07fb\u07fa\3\2\2\2\u07fc\u07ff\3"+
		"\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0800\3\2\2\2\u07ff"+
		"\u07fd\3\2\2\2\u0800\u0804\7M\2\2\u0801\u0803\7\7\2\2\u0802\u0801\3\2"+
		"\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805"+
		"\u0807\3\2\2\2\u0806\u0804\3\2\2\2\u0807\u080b\5\u00a2R\2\u0808\u080a"+
		"\7\7\2\2\u0809\u0808\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b"+
		"\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u080f\7N"+
		"\2\2\u080f\u009f\3\2\2\2\u0810\u0814\5\u014c\u00a7\2\u0811\u0813\7\7\2"+
		"\2\u0812\u0811\3\2\2\2\u0813\u0816\3\2\2\2\u0814\u0812\3\2\2\2\u0814\u0815"+
		"\3\2\2\2\u0815\u0817\3\2\2\2\u0816\u0814\3\2\2\2\u0817\u0818\5\u0126\u0094"+
		"\2\u0818\u081a\3\2\2\2\u0819\u0810\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081b"+
		"\3\2\2\2\u081b\u081c\5\u00a2R\2\u081c\u00a1\3\2\2\2\u081d\u081e\5\u00a4"+
		"S\2\u081e\u00a3\3\2\2\2\u081f\u0825\5\u00a6T\2\u0820\u0821\5\u0128\u0095"+
		"\2\u0821\u0822\5\u00a6T\2\u0822\u0824\3\2\2\2\u0823\u0820\3\2\2\2\u0824"+
		"\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u00a5\3\2"+
		"\2\2\u0827\u0825\3\2\2\2\u0828\u082e\5\u00a8U\2\u0829\u082a\5\u012a\u0096"+
		"\2\u082a\u082b\5\u00a8U\2\u082b\u082d\3\2\2\2\u082c\u0829\3\2\2\2\u082d"+
		"\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u00a7\3\2"+
		"\2\2\u0830\u082e\3\2\2\2\u0831\u0837\5\u00aaV\2\u0832\u0833\5\u012c\u0097"+
		"\2\u0833\u0834\5\u00aaV\2\u0834\u0836\3\2\2\2\u0835\u0832\3\2\2\2\u0836"+
		"\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u00a9\3\2"+
		"\2\2\u0839\u0837\3\2\2\2\u083a\u0840\5\u00acW\2\u083b\u083c\5\u012e\u0098"+
		"\2\u083c\u083d\5\u00acW\2\u083d\u083f\3\2\2\2\u083e\u083b\3\2\2\2\u083f"+
		"\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u00ab\3\2"+
		"\2\2\u0842\u0840\3\2\2\2\u0843\u0849\5\u00aeX\2\u0844\u0845\5\u0130\u0099"+
		"\2\u0845\u0846\5\u00aeX\2\u0846\u0848\3\2\2\2\u0847\u0844\3\2\2\2\u0848"+
		"\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u00ad\3\2"+
		"\2\2\u084b\u0849\3\2\2\2\u084c\u0850\5\u00b0Y\2\u084d\u084f\5\u0152\u00aa"+
		"\2\u084e\u084d\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0850\u0851"+
		"\3\2\2\2\u0851\u00af\3\2\2\2\u0852\u0850\3\2\2\2\u0853\u085c\5\u00b2Z"+
		"\2\u0854\u0855\5\u0132\u009a\2\u0855\u0856\5\u00b2Z\2\u0856\u085b\3\2"+
		"\2\2\u0857\u0858\5\u0134\u009b\2\u0858\u0859\5T+\2\u0859\u085b\3\2\2\2"+
		"\u085a\u0854\3\2\2\2\u085a\u0857\3\2\2\2\u085b\u085e\3\2\2\2\u085c\u085a"+
		"\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u00b1\3\2\2\2\u085e\u085c\3\2\2\2\u085f"+
		"\u0865\5\u00b4[\2\u0860\u0861\5\u0136\u009c\2\u0861\u0862\5\u00b4[\2\u0862"+
		"\u0864\3\2\2\2\u0863\u0860\3\2\2\2\u0864\u0867\3\2\2\2\u0865\u0863\3\2"+
		"\2\2\u0865\u0866\3\2\2\2\u0866\u00b3\3\2\2\2\u0867\u0865\3\2\2\2\u0868"+
		"\u086e\5\u00b6\\\2\u0869\u086a\5\u0172\u00ba\2\u086a\u086b\5\u00b6\\\2"+
		"\u086b\u086d\3\2\2\2\u086c\u0869\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c"+
		"\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u00b5\3\2\2\2\u0870\u086e\3\2\2\2\u0871"+
		"\u0875\5\u00b8]\2\u0872\u0873\5\u0138\u009d\2\u0873\u0874\5\u00b8]\2\u0874"+
		"\u0876\3\2\2\2\u0875\u0872\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u00b7\3\2"+
		"\2\2\u0877\u087d\5\u00ba^\2\u0878\u0879\5\u013a\u009e\2\u0879\u087a\5"+
		"\u00ba^\2\u087a\u087c\3\2\2\2\u087b\u0878\3\2\2\2\u087c\u087f\3\2\2\2"+
		"\u087d\u087b\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u00b9\3\2\2\2\u087f\u087d"+
		"\3\2\2\2\u0880\u0886\5\u00bc_\2\u0881\u0882\5\u013c\u009f\2\u0882\u0883"+
		"\5\u00bc_\2\u0883\u0885\3\2\2\2\u0884\u0881\3\2\2\2\u0885\u0888\3\2\2"+
		"\2\u0886\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u00bb";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0888\u0886\3\2\2\2\u0889\u088f\5\u00be`\2\u088a\u088b\5\u013e"+
		"\u00a0\2\u088b\u088c\5\u00be`\2\u088c\u088e\3\2\2\2\u088d\u088a\3\2\2"+
		"\2\u088e\u0891\3\2\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u00bd"+
		"\3\2\2\2\u0891\u088f\3\2\2\2\u0892\u0898\5\u00c0a\2\u0893\u0894\5\u0140"+
		"\u00a1\2\u0894\u0895\5\u00c0a\2\u0895\u0897\3\2\2\2\u0896\u0893\3\2\2"+
		"\2\u0897\u089a\3\2\2\2\u0898\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u00bf"+
		"\3\2\2\2\u089a\u0898\3\2\2\2\u089b\u08a1\5\u00c2b\2\u089c\u089d\5\u0142"+
		"\u00a2\2\u089d\u089e\5T+\2\u089e\u08a0\3\2\2\2\u089f\u089c\3\2\2\2\u08a0"+
		"\u08a3\3\2\2\2\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u00c1\3\2"+
		"\2\2\u08a3\u08a1\3\2\2\2\u08a4\u08a6\5\u0144\u00a3\2\u08a5\u08a4\3\2\2"+
		"\2\u08a6\u08a9\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08aa"+
		"\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08ab\5\u00c4c\2\u08ab\u00c3\3\2\2"+
		"\2\u08ac\u08b0\5\u00c6d\2\u08ad\u08af\5\u0148\u00a5\2\u08ae\u08ad\3\2"+
		"\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1"+
		"\u00c5\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08c2\5\u00c8e\2\u08b4\u08c2"+
		"\5\u0172\u00ba\2\u08b5\u08c2\5\u00f6|\2\u08b6\u08c2\5\u00caf\2\u08b7\u08c2"+
		"\5\u00ccg\2\u08b8\u08c2\5\u011c\u008f\2\u08b9\u08c2\5\u00ceh\2\u08ba\u08c2"+
		"\5\u00d0i\2\u08bb\u08c2\5\u00d2j\2\u08bc\u08c2\5\u00d4k\2\u08bd\u08c2"+
		"\5\u00d6l\2\u08be\u08c2\5\u00e0q\2\u08bf\u08c2\5\u00e2r\2\u08c0\u08c2"+
		"\5\u00e8u\2\u08c1\u08b3\3\2\2\2\u08c1\u08b4\3\2\2\2\u08c1\u08b5\3\2\2"+
		"\2\u08c1\u08b6\3\2\2\2\u08c1\u08b7\3\2\2\2\u08c1\u08b8\3\2\2\2\u08c1\u08b9"+
		"\3\2\2\2\u08c1\u08ba\3\2\2\2\u08c1\u08bb\3\2\2\2\u08c1\u08bc\3\2\2\2\u08c1"+
		"\u08bd\3\2\2\2\u08c1\u08be\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c0\3\2"+
		"\2\2\u08c2\u00c7\3\2\2\2\u08c3\u08c4\7M\2\2\u08c4\u08c5\5\u00a2R\2\u08c5"+
		"\u08c6\7N\2\2\u08c6\u00c9\3\2\2\2\u08c7\u08c8\7j\2\2\u08c8\u08c9\5\u0170"+
		"\u00b9\2\u08c9\u00cb\3\2\2\2\u08ca\u08cc\5X-\2\u08cb\u08ca\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d1\7q\2\2\u08ce\u08d0\7\7"+
		"\2\2\u08cf\u08ce\3\2\2\2\u08d0\u08d3\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1"+
		"\u08d2\3\2\2\2\u08d2\u08d6\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d4\u08d7\5\u0172"+
		"\u00ba\2\u08d5\u08d7\7\13\2\2\u08d6\u08d4\3\2\2\2\u08d6\u08d5\3\2\2\2"+
		"\u08d7\u00cd\3\2\2\2\u08d8\u08e7\7\17\2\2\u08d9\u08db\7\7\2\2\u08da\u08d9"+
		"\3\2\2\2\u08db\u08de\3\2\2\2\u08dc\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd"+
		"\u08df\3\2\2\2\u08de\u08dc\3\2\2\2\u08df\u08e3\7\u0087\2\2\u08e0\u08e2"+
		"\7\7\2\2\u08e1\u08e0\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e8\5$"+
		"\23\2\u08e7\u08dc\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08f0\3\2\2\2\u08e9"+
		"\u08eb\7\7\2\2\u08ea\u08e9\3\2\2\2\u08eb\u08ee\3\2\2\2\u08ec\u08ea\3\2"+
		"\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ef\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ef"+
		"\u08f1\5\66\34\2\u08f0\u08ec\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u00cf\3"+
		"\2\2\2\u08f2\u08f6\7O\2\2\u08f3\u08f5\7\7\2\2\u08f4\u08f3\3\2\2\2\u08f5"+
		"\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08fa\3\2"+
		"\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fb\5\u00a2R\2\u08fa\u08f9\3\2\2\2\u08fa"+
		"\u08fb\3\2\2\2\u08fb\u090c\3\2\2\2\u08fc\u08fe\7\7\2\2\u08fd\u08fc\3\2"+
		"\2\2\u08fe\u0901\3\2\2\2\u08ff\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900"+
		"\u0902\3\2\2\2\u0901\u08ff\3\2\2\2\u0902\u0906\7i\2\2\u0903\u0905\7\7"+
		"\2\2\u0904\u0903\3\2\2\2\u0905\u0908\3\2\2\2\u0906\u0904\3\2\2\2\u0906"+
		"\u0907\3\2\2\2\u0907\u0909\3\2\2\2\u0908\u0906\3\2\2\2\u0909\u090b\5\u00a2"+
		"R\2\u090a\u08ff\3\2\2\2\u090b\u090e\3\2\2\2\u090c\u090a\3\2\2\2\u090c"+
		"\u090d\3\2\2\2\u090d\u0912\3\2\2\2\u090e\u090c\3\2\2\2\u090f\u0911\7\7"+
		"\2\2\u0910\u090f\3\2\2\2\u0911\u0914\3\2\2\2\u0912\u0910\3\2\2\2\u0912"+
		"\u0913\3\2\2\2\u0913\u0915\3\2\2\2\u0914\u0912\3\2\2\2\u0915\u0916\7P"+
		"\2\2\u0916\u00d1\3\2\2\2\u0917\u0919\7\23\2\2\u0918\u091a\5\u00f4{\2\u0919"+
		"\u0918\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u00d3\3\2\2\2\u091b\u092c\7\24"+
		"\2\2\u091c\u0920\7\177\2\2\u091d\u091f\7\7\2\2\u091e\u091d\3\2\2\2\u091f"+
		"\u0922\3\2\2\2\u0920\u091e\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0923\3\2"+
		"\2\2\u0922\u0920\3\2\2\2\u0923\u0927\5T+\2\u0924\u0926\7\7\2\2\u0925\u0924"+
		"\3\2\2\2\u0926\u0929\3\2\2\2\u0927\u0925\3\2\2\2\u0927\u0928\3\2\2\2\u0928"+
		"\u092a\3\2\2\2\u0929\u0927\3\2\2\2\u092a\u092b\7\u0083\2\2\u092b\u092d"+
		"\3\2\2\2\u092c\u091c\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092f\3\2\2\2\u092e"+
		"\u0930\5\u00f4{\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u00d5"+
		"\3\2\2\2\u0931\u0934\5\u00d8m\2\u0932\u0934\5\u00dco\2\u0933\u0931\3\2"+
		"\2\2\u0933\u0932\3\2\2\2\u0934\u00d7\3\2\2\2\u0935\u0939\t\7\2\2\u0936"+
		"\u0938\7\7\2\2\u0937\u0936\3\2\2\2\u0938\u093b\3\2\2\2\u0939\u0937\3\2"+
		"\2\2\u0939\u093a\3\2\2\2\u093a\u093c\3\2\2\2\u093b\u0939\3\2\2\2\u093c"+
		"\u0940\7M\2\2\u093d\u093f\7\7\2\2\u093e\u093d\3\2\2\2\u093f\u0942\3\2"+
		"\2\2\u0940\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942"+
		"\u0940\3\2\2\2\u0943\u0947\5\u00a2R\2\u0944\u0946\7\7\2\2\u0945\u0944"+
		"\3\2\2\2\u0946\u0949\3\2\2\2\u0947\u0945\3\2\2\2\u0947\u0948\3\2\2\2\u0948"+
		"\u094a\3\2\2\2\u0949\u0947\3\2\2\2\u094a\u094e\7N\2\2\u094b\u094d\7\7"+
		"\2\2\u094c\u094b\3\2\2\2\u094d\u0950\3\2\2\2\u094e\u094c\3\2\2\2\u094e"+
		"\u094f\3\2\2\2\u094f\u0951\3\2\2\2\u0950\u094e\3\2\2\2\u0951\u0978\5\u00da"+
		"n\2\u0952\u0954\7\7\2\2\u0953\u0952\3\2\2\2\u0954\u0957\3\2\2\2\u0955"+
		"\u0953\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957\u0955\3\2"+
		"\2\2\u0958\u095c\7\61\2\2\u0959\u095b\7\7\2\2\u095a\u0959\3\2\2\2\u095b"+
		"\u095e\3\2\2\2\u095c\u095a\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095f\3\2"+
		"\2\2\u095e\u095c\3\2\2\2\u095f\u0963\7M\2\2\u0960\u0962\7\7\2\2\u0961"+
		"\u0960\3\2\2\2\u0962\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963\u0964\3\2"+
		"\2\2\u0964\u0966\3\2\2\2\u0965\u0963\3\2\2\2\u0966\u096a\5\u00a2R\2\u0967"+
		"\u0969\7\7\2\2\u0968\u0967\3\2\2\2\u0969\u096c\3\2\2\2\u096a\u0968\3\2"+
		"\2\2\u096a\u096b\3\2\2\2\u096b\u096d\3\2\2\2\u096c\u096a\3\2\2\2\u096d"+
		"\u0971\7N\2\2\u096e\u0970\7\7\2\2\u096f\u096e\3\2\2\2\u0970\u0973\3\2"+
		"\2\2\u0971\u096f\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0974\3\2\2\2\u0973"+
		"\u0971\3\2\2\2\u0974\u0975\5\u00dan\2\u0975\u0977\3\2\2\2\u0976\u0955"+
		"\3\2\2\2\u0977\u097a\3\2\2\2\u0978\u0976\3\2\2\2\u0978\u0979\3\2\2\2\u0979"+
		"\u0989\3\2\2\2\u097a\u0978\3\2\2\2\u097b\u097d\7\7\2\2\u097c\u097b\3\2"+
		"\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097f\3\2\2\2\u097f"+
		"\u0981\3\2\2\2\u0980\u097e\3\2\2\2\u0981\u0985\7\62\2\2\u0982\u0984\7"+
		"\7\2\2\u0983\u0982\3\2\2\2\u0984\u0987\3\2\2\2\u0985\u0983\3\2\2\2\u0985"+
		"\u0986\3\2\2\2\u0986\u0988\3\2\2\2\u0987\u0985\3\2\2\2\u0988\u098a\5\u00da"+
		"n\2\u0989\u097e\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u00d9\3\2\2\2\u098b"+
		"\u098e\5\u0092J\2\u098c\u098e\5\u00a0Q\2\u098d\u098b\3\2\2\2\u098d\u098c"+
		"\3\2\2\2\u098e\u00db\3\2\2\2\u098f\u0993\7\64\2\2\u0990\u0992\7\7\2\2"+
		"\u0991\u0990\3\2\2\2\u0992\u0995\3\2\2\2\u0993\u0991\3\2\2\2\u0993\u0994"+
		"\3\2\2\2\u0994\u0996\3\2\2\2\u0995\u0993\3\2\2\2\u0996\u099a\7M\2\2\u0997"+
		"\u0999\7\7\2\2\u0998\u0997\3\2\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2"+
		"\2\2\u099a\u099b\3\2\2\2\u099b\u099d\3\2\2\2\u099c\u099a\3\2\2\2\u099d"+
		"\u09a1\5\u00a2R\2\u099e\u09a0\7\7\2\2\u099f\u099e\3\2\2\2\u09a0\u09a3"+
		"\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a4\3\2\2\2\u09a3"+
		"\u09a1\3\2\2\2\u09a4\u09a8\7N\2\2\u09a5\u09a7\7\7\2\2\u09a6\u09a5\3\2"+
		"\2\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9"+
		"\u09ab\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab\u09af\7Q\2\2\u09ac\u09ae\7\7"+
		"\2\2\u09ad\u09ac\3\2\2\2\u09ae\u09b1\3\2\2\2\u09af\u09ad\3\2\2\2\u09af"+
		"\u09b0\3\2\2\2\u09b0\u09b9\3\2\2\2\u09b1\u09af\3\2\2\2\u09b2\u09b6\5\u00de"+
		"p\2\u09b3\u09b5\7\7\2\2\u09b4\u09b3\3\2\2\2\u09b5\u09b8\3\2\2\2\u09b6"+
		"\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09ba\3\2\2\2\u09b8\u09b6\3\2"+
		"\2\2\u09b9\u09b2\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bb"+
		"\u09bc\3\2\2\2\u09bc\u09c0\3\2\2\2\u09bd\u09bf\7\7\2\2\u09be\u09bd\3\2"+
		"\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1"+
		"\u09c3\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09c4\7R\2\2\u09c4\u00dd\3\2"+
		"\2\2\u09c5\u09c9\7\65\2\2\u09c6\u09c8\7\7\2\2\u09c7\u09c6\3\2\2\2\u09c8"+
		"\u09cb\3\2\2\2\u09c9\u09c7\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cc\3\2"+
		"\2\2\u09cb\u09c9\3\2\2\2\u09cc\u09dd\5\u00f6|\2\u09cd\u09cf\7\7\2\2\u09ce"+
		"\u09cd\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d0\u09d1\3\2"+
		"\2\2\u09d1\u09d3\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d3\u09d7\7i\2\2\u09d4"+
		"\u09d6\7\7\2\2\u09d5\u09d4\3\2\2\2\u09d6\u09d9\3\2\2\2\u09d7\u09d5\3\2"+
		"\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09da\3\2\2\2\u09d9\u09d7\3\2\2\2\u09da"+
		"\u09dc\5\u00f6|\2\u09db\u09d0\3\2\2\2\u09dc\u09df\3\2\2\2\u09dd\u09db"+
		"\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09e3\3\2\2\2\u09df\u09dd\3\2\2\2\u09e0"+
		"\u09e2\7\7\2\2\u09e1\u09e0\3\2\2\2\u09e2\u09e5\3\2\2\2\u09e3\u09e1\3\2"+
		"\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e6\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e6"+
		"\u09ea\7\u0089\2\2\u09e7\u09e9\7\7\2\2\u09e8\u09e7\3\2\2\2\u09e9\u09ec"+
		"\3\2\2\2\u09ea\u09e8\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ed\3\2\2\2\u09ec"+
		"\u09ea\3\2\2\2\u09ed\u09ef\5\u00dan\2\u09ee\u09f0\5\u0174\u00bb\2\u09ef"+
		"\u09ee\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u0a01\3\2\2\2\u09f1\u09f5\7\62"+
		"\2\2\u09f2\u09f4\7\7\2\2\u09f3\u09f2\3\2\2\2\u09f4\u09f7\3\2\2\2\u09f5"+
		"\u09f3\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f8\3\2\2\2\u09f7\u09f5\3\2"+
		"\2\2\u09f8\u09fc\7\u0089\2\2\u09f9\u09fb\7\7\2\2\u09fa\u09f9\3\2\2\2\u09fb"+
		"\u09fe\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09ff\3\2"+
		"\2\2\u09fe\u09fc\3\2\2\2\u09ff\u0a01\5\u00dan\2\u0a00\u09c5\3\2\2\2\u0a00"+
		"\u09f1\3\2\2\2\u0a01\u00df\3\2\2\2\u0a02\u0a06\7E\2\2\u0a03\u0a05\7\7"+
		"\2\2\u0a04\u0a03\3\2\2\2\u0a05\u0a08\3\2\2\2\u0a06\u0a04\3\2\2\2\u0a06"+
		"\u0a07\3\2\2\2\u0a07\u0a0b\3\2\2\2\u0a08\u0a06\3\2\2\2\u0a09\u0a0c\5\u0092"+
		"J\2\u0a0a\u0a0c\5\u00a2R\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0a\3\2\2\2\u0a0c"+
		"\u00e1\3\2\2\2\u0a0d\u0a11\7D\2\2\u0a0e\u0a10\7\7\2\2\u0a0f\u0a0e\3\2"+
		"\2\2\u0a10\u0a13\3\2\2\2\u0a11\u0a0f\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12"+
		"\u0a14\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a14\u0a1e\5\u0092J\2\u0a15\u0a17"+
		"\7\7\2\2\u0a16\u0a15\3\2\2\2\u0a17\u0a1a\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a18"+
		"\u0a19\3\2\2\2\u0a19\u0a1b\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1b\u0a1d\5\u00e4"+
		"s\2\u0a1c\u0a18\3\2\2\2\u0a1d\u0a20\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1e"+
		"\u0a1f\3\2\2\2\u0a1f\u0a28\3\2\2\2\u0a20\u0a1e\3\2\2\2\u0a21\u0a23\7\7"+
		"\2\2\u0a22\u0a21\3\2\2\2\u0a23\u0a26\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a24"+
		"\u0a25\3\2\2\2\u0a25\u0a27\3\2\2\2\u0a26\u0a24\3\2\2\2\u0a27\u0a29\5\u00e6"+
		"t\2\u0a28\u0a24\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u00e3\3\2\2\2\u0a2a"+
		"\u0a2e\7F\2\2\u0a2b\u0a2d\7\7\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d\u0a30\3\2"+
		"\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a31\3\2\2\2\u0a30"+
		"\u0a2e\3\2\2\2\u0a31\u0a35\7M\2\2\u0a32\u0a34\7\7\2\2\u0a33\u0a32\3\2"+
		"\2\2\u0a34\u0a37\3\2\2\2\u0a35\u0a33\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36"+
		"\u0a39\3\2\2\2\u0a37\u0a35\3\2\2\2\u0a38\u0a3a\5\u016a\u00b6\2\u0a39\u0a38"+
		"\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3f\5\u0172\u00ba"+
		"\2\u0a3c\u0a3e\7\7\2\2\u0a3d\u0a3c\3\2\2\2\u0a3e\u0a41\3\2\2\2\u0a3f\u0a3d"+
		"\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a42\3\2\2\2\u0a41\u0a3f\3\2\2\2\u0a42"+
		"\u0a46\7p\2\2\u0a43\u0a45\7\7\2\2\u0a44\u0a43\3\2\2\2\u0a45\u0a48\3\2"+
		"\2\2\u0a46\u0a44\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a49\3\2\2\2\u0a48"+
		"\u0a46\3\2\2\2\u0a49\u0a5a\5\u0170\u00b9\2\u0a4a\u0a4c\7\7\2\2\u0a4b\u0a4a"+
		"\3\2\2\2\u0a4c\u0a4f\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e"+
		"\u0a50\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a50\u0a54\7c\2\2\u0a51\u0a53\7\7"+
		"\2\2\u0a52\u0a51\3\2\2\2\u0a53\u0a56\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a54"+
		"\u0a55\3\2\2\2\u0a55\u0a57\3\2\2\2\u0a56\u0a54\3\2\2\2\u0a57\u0a59\5\u0170"+
		"\u00b9\2\u0a58\u0a4d\3\2\2\2\u0a59\u0a5c\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5a"+
		"\u0a5b\3\2\2\2\u0a5b\u0a60\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5d\u0a5f\7\7"+
		"\2\2\u0a5e\u0a5d\3\2\2\2\u0a5f\u0a62\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a60"+
		"\u0a61\3\2\2\2\u0a61\u0a63\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a63\u0a67\7N"+
		"\2\2\u0a64\u0a66\7\7\2\2\u0a65\u0a64\3\2\2\2\u0a66\u0a69\3\2\2\2\u0a67"+
		"\u0a65\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u0a6a\3\2\2\2\u0a69\u0a67\3\2"+
		"\2\2\u0a6a\u0a6b\5\u0092J\2\u0a6b\u00e5\3\2\2\2\u0a6c\u0a70\7G\2\2\u0a6d"+
		"\u0a6f\7\7\2\2\u0a6e\u0a6d\3\2\2\2\u0a6f\u0a72\3\2\2\2\u0a70\u0a6e\3\2"+
		"\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a73\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a73"+
		"\u0a74\5\u0092J\2\u0a74\u00e7\3\2\2\2\u0a75\u0a7a\5\u00eav\2\u0a76\u0a7a"+
		"\5\u00ecw\2\u0a77\u0a7a\5\u00eex\2\u0a78\u0a7a\5\u00f0y\2\u0a79\u0a75"+
		"\3\2\2\2\u0a79\u0a76\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79\u0a78\3\2\2\2\u0a7a"+
		"\u00e9\3\2\2\2\u0a7b\u0a7f\7H\2\2\u0a7c\u0a7e\7\7\2\2\u0a7d\u0a7c\3\2"+
		"\2\2\u0a7e\u0a81\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80"+
		"\u0a82\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a82\u0a83\5\u00a2R\2\u0a83\u00eb"+
		"\3\2\2\2\u0a84\u0a88\t\b\2\2\u0a85\u0a87\7\7\2\2\u0a86\u0a85\3\2\2\2\u0a87"+
		"\u0a8a\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88\u0a89\3\2\2\2\u0a89\u0a8c\3\2"+
		"\2\2\u0a8a\u0a88\3\2\2\2\u0a8b\u0a8d\5\u00a2R\2\u0a8c\u0a8b\3\2\2\2\u0a8c"+
		"\u0a8d\3\2\2\2\u0a8d\u00ed\3\2\2\2\u0a8e\u0a8f\t\t\2\2\u0a8f\u00ef\3\2"+
		"\2\2\u0a90\u0a91\t\n\2\2\u0a91\u00f1\3\2\2\2\u0a92\u0a93\5\u0172\u00ba"+
		"\2\u0a93\u0a97\7w\2\2\u0a94\u0a96\7\7\2\2\u0a95\u0a94\3\2\2\2\u0a96\u0a99"+
		"\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u00f3\3\2\2\2\u0a99"+
		"\u0a97\3\2\2\2\u0a9a\u0a9b\7w\2\2\u0a9b\u0a9c\5\u0172\u00ba\2\u0a9c\u00f5"+
		"\3\2\2\2\u0a9d\u0aaa\5\u00f8}\2\u0a9e\u0aaa\5\u00fa~\2\u0a9f\u0aaa\5\u00fc"+
		"\177\2\u0aa0\u0aaa\5\u00fe\u0080\2\u0aa1\u0aaa\5\u0100\u0081\2\u0aa2\u0aaa"+
		"\5\u0102\u0082\2\u0aa3\u0aaa\5\u0104\u0083\2\u0aa4\u0aaa\5\u0106\u0084"+
		"\2\u0aa5\u0aaa\5\u0108\u0085\2\u0aa6\u0aaa\5\u010a\u0086\2\u0aa7\u0aaa"+
		"\5\u010c\u0087\2\u0aa8\u0aaa\5\u010e\u0088\2\u0aa9\u0a9d\3\2\2\2\u0aa9"+
		"\u0a9e\3\2\2\2\u0aa9\u0a9f\3\2\2\2\u0aa9\u0aa0\3\2\2\2\u0aa9\u0aa1\3\2"+
		"\2\2\u0aa9\u0aa2\3\2\2\2\u0aa9\u0aa3\3\2\2\2\u0aa9\u0aa4\3\2\2\2\u0aa9"+
		"\u0aa5\3\2\2\2\u0aa9\u0aa6\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aa9\u0aa8\3\2"+
		"\2\2\u0aaa\u00f7\3\2\2\2\u0aab\u0aac\7L\2\2\u0aac\u00f9\3\2\2\2\u0aad"+
		"\u0aae\t\13\2\2\u0aae\u00fb\3\2\2\2\u0aaf\u0ab0\t\f\2\2\u0ab0\u00fd\3"+
		"\2\2\2\u0ab1\u0ab2\7\u008e\2\2\u0ab2\u00ff\3\2\2\2\u0ab3\u0ab4\7\u008f"+
		"\2\2\u0ab4\u0101\3\2\2\2\u0ab5\u0ab6\7\u0090\2\2\u0ab6\u0103\3\2\2\2\u0ab7"+
		"\u0ab8\7\u0091\2\2\u0ab8\u0105\3\2\2\2\u0ab9\u0aba\7\u0092\2\2\u0aba\u0107"+
		"\3\2\2\2\u0abb\u0abc\7\u0093\2\2\u0abc\u0109\3\2\2\2\u0abd\u0abe\7\u0094"+
		"\2\2\u0abe\u010b\3\2\2\2\u0abf\u0ac0\7\u009e\2\2\u0ac0\u010d\3\2\2\2\u0ac1"+
		"\u0ac4\5\u0110\u0089\2\u0ac2\u0ac4\5\u0112\u008a\2\u0ac3\u0ac1\3\2\2\2"+
		"\u0ac3\u0ac2\3\2\2\2\u0ac4\u010f\3\2\2\2\u0ac5\u0aca\7\u008c\2\2\u0ac6"+
		"\u0ac9\5\u0114\u008b\2\u0ac7\u0ac9\5\u0116\u008c\2\u0ac8\u0ac6\3\2\2\2"+
		"\u0ac8\u0ac7\3\2\2\2\u0ac9\u0acc\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0aca\u0acb"+
		"\3\2\2\2\u0acb\u0acd\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acd\u0ace\7\u00a6\2"+
		"\2\u0ace\u0111\3\2\2\2\u0acf\u0ad6\7\u008d\2\2\u0ad0\u0ad5\5\u0118\u008d"+
		"\2\u0ad1\u0ad5\5\u011a\u008e\2\u0ad2\u0ad5\5\u0110\u0089\2\u0ad3\u0ad5"+
		"\7\u00ac\2\2\u0ad4\u0ad0\3\2\2\2\u0ad4\u0ad1\3\2\2\2\u0ad4\u0ad2\3\2\2"+
		"\2\u0ad4\u0ad3\3\2\2\2\u0ad5\u0ad8\3\2\2\2\u0ad6\u0ad4\3\2\2\2\u0ad6\u0ad7"+
		"\3\2\2\2\u0ad7\u0ad9\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad9\u0ada\7\u00ab\2"+
		"\2\u0ada\u0113\3\2\2\2\u0adb\u0adc\t\r\2\2\u0adc\u0115\3\2\2\2\u0add\u0ade"+
		"\7\u00aa\2\2\u0ade\u0adf\5\u00a2R\2\u0adf\u0ae0\7R\2\2\u0ae0\u0117\3\2"+
		"\2\2\u0ae1\u0ae2\t\16\2\2\u0ae2\u0119\3\2\2\2\u0ae3\u0ae4\7\u00b0\2\2"+
		"\u0ae4\u0ae5\5\u00a2R\2\u0ae5\u0ae6\7R\2\2\u0ae6\u011b\3\2\2\2\u0ae7\u0aea"+
		"\5\u011e\u0090\2\u0ae8\u0aea\5\u0124\u0093\2\u0ae9\u0ae7\3\2\2\2\u0ae9"+
		"\u0ae8\3\2\2\2\u0aea\u011d\3\2\2\2\u0aeb\u0aef\7Q\2\2\u0aec\u0aee\7\7"+
		"\2\2\u0aed\u0aec\3\2\2\2\u0aee\u0af1\3\2\2\2\u0aef\u0aed\3\2\2\2\u0aef"+
		"\u0af0\3\2\2\2\u0af0\u0b02\3\2\2\2\u0af1\u0aef\3\2\2\2\u0af2\u0af4\5\u0120"+
		"\u0091\2\u0af3\u0af2\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af8\3\2\2\2\u0af5"+
		"\u0af7\7\7\2\2\u0af6\u0af5\3\2\2\2\u0af7\u0afa\3\2\2\2\u0af8\u0af6\3\2"+
		"\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afb\3\2\2\2\u0afa\u0af8\3\2\2\2\u0afb"+
		"\u0aff\7\u0089\2\2\u0afc\u0afe\7\7\2\2\u0afd\u0afc\3\2\2\2\u0afe\u0b01"+
		"\3\2\2\2\u0aff\u0afd\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0b03\3\2\2\2\u0b01"+
		"\u0aff\3\2\2\2\u0b02\u0af3\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u0b04\3\2"+
		"\2\2\u0b04\u0b08\5\u0094K\2\u0b05\u0b07\7\7\2\2\u0b06\u0b05\3\2\2\2\u0b07"+
		"\u0b0a\3\2\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0b\3\2"+
		"\2\2\u0b0a\u0b08\3\2\2\2\u0b0b\u0b0c\7R\2\2\u0b0c\u011f\3\2\2\2\u0b0d"+
		"\u0b1e\5\u0122\u0092\2\u0b0e\u0b10\7\7\2\2\u0b0f\u0b0e\3\2\2\2\u0b10\u0b13"+
		"\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b14\3\2\2\2\u0b13"+
		"\u0b11\3\2\2\2\u0b14\u0b18\7i\2\2\u0b15\u0b17\7\7\2\2\u0b16\u0b15\3\2"+
		"\2\2\u0b17\u0b1a\3\2\2\2\u0b18\u0b16\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19"+
		"\u0b1b\3\2\2\2\u0b1a\u0b18\3\2\2\2\u0b1b\u0b1d\5\u0122\u0092\2\u0b1c\u0b11"+
		"\3\2\2\2\u0b1d\u0b20\3\2\2\2\u0b1e\u0b1c\3\2\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f"+
		"\u0121\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b21\u0b24\5x=\2\u0b22\u0b24\5z>\2"+
		"\u0b23\u0b21\3\2\2\2\u0b23\u0b22\3\2\2\2\u0b24\u0b33\3\2\2\2\u0b25\u0b27"+
		"\7\7\2\2\u0b26\u0b25\3\2\2\2\u0b27\u0b2a\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b28"+
		"\u0b29\3\2\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b28\3\2\2\2\u0b2b\u0b2f\7p"+
		"\2\2\u0b2c\u0b2e\7\7\2\2\u0b2d\u0b2c\3\2\2\2\u0b2e\u0b31\3\2\2\2\u0b2f"+
		"\u0b2d\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b32\3\2\2\2\u0b31\u0b2f\3\2"+
		"\2\2\u0b32\u0b34\5T+\2\u0b33\u0b28\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34\u0123"+
		"\3\2\2\2\u0b35\u0b39\7*\2\2\u0b36\u0b38\7\7\2\2\u0b37\u0b36\3\2\2\2\u0b38"+
		"\u0b3b\3\2\2\2\u0b39\u0b37\3\2\2\2\u0b39\u0b3a\3\2\2\2\u0b3a\u0b3c\3\2"+
		"\2\2\u0b3b\u0b39\3\2\2\2\u0b3c\u0b4b\5\u008aF\2\u0b3d\u0b3f\7\7\2\2\u0b3e"+
		"\u0b3d\3\2\2\2\u0b3f\u0b42\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b40\u0b41\3\2"+
		"\2\2\u0b41\u0b43\3\2\2\2\u0b42\u0b40\3\2\2\2\u0b43\u0b47\7\u0088\2\2\u0b44"+
		"\u0b46\7\7\2\2\u0b45\u0b44\3\2\2\2\u0b46\u0b49\3\2\2\2\u0b47\u0b45\3\2"+
		"\2\2\u0b47\u0b48\3\2\2\2\u0b48\u0b4a\3\2\2\2\u0b49\u0b47\3\2\2\2\u0b4a"+
		"\u0b4c\5T+\2\u0b4b\u0b40\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u0b54\3\2\2"+
		"\2\u0b4d\u0b4f\7\7\2\2\u0b4e\u0b4d\3\2\2\2\u0b4f\u0b52\3\2\2\2\u0b50\u0b4e"+
		"\3\2\2\2\u0b50\u0b51\3\2\2\2\u0b51\u0b53\3\2\2\2\u0b52\u0b50\3\2\2\2\u0b53"+
		"\u0b55\5\u0090I\2\u0b54\u0b50\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u0125"+
		"\3\2\2\2\u0b56\u0b58\7\7\2\2\u0b57\u0b56\3\2\2\2\u0b58\u0b5b\3\2\2\2\u0b59"+
		"\u0b57\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b5c\3\2\2\2\u0b5b\u0b59\3\2"+
		"\2\2\u0b5c\u0b60\t\17\2\2\u0b5d\u0b5f\7\7\2\2\u0b5e\u0b5d\3\2\2\2\u0b5f"+
		"\u0b62\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b60\u0b61\3\2\2\2\u0b61\u0127\3\2"+
		"\2\2\u0b62\u0b60\3\2\2\2\u0b63\u0b65\7\7\2\2\u0b64\u0b63\3\2\2\2\u0b65"+
		"\u0b68\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b69\3\2"+
		"\2\2\u0b68\u0b66\3\2\2\2\u0b69\u0b6d\7e\2\2\u0b6a\u0b6c\7\7\2\2\u0b6b"+
		"\u0b6a\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d\u0b6b\3\2\2\2\u0b6d\u0b6e\3\2"+
		"\2\2\u0b6e\u0129\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b70\u0b72\7\7\2\2\u0b71"+
		"\u0b70\3\2\2\2\u0b72\u0b75\3\2\2\2\u0b73\u0b71\3\2\2\2\u0b73\u0b74\3\2"+
		"\2\2\u0b74\u0b76\3\2\2\2\u0b75\u0b73\3\2\2\2\u0b76\u0b7a\7c\2\2\u0b77"+
		"\u0b79\7\7\2\2\u0b78\u0b77\3\2\2\2\u0b79\u0b7c\3\2\2\2\u0b7a\u0b78\3\2"+
		"\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u012b\3\2\2\2\u0b7c\u0b7a\3\2\2\2\u0b7d"+
		"\u0b7f\7\7\2\2\u0b7e\u0b7d\3\2\2\2\u0b7f\u0b82\3\2\2\2\u0b80\u0b7e\3\2"+
		"\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0b83\3\2\2\2\u0b82\u0b80\3\2\2\2\u0b83"+
		"\u0b87\t\20\2\2\u0b84\u0b86\7\7\2\2\u0b85\u0b84\3\2\2\2\u0b86\u0b89\3"+
		"\2\2\2\u0b87\u0b85\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u012d\3\2\2\2\u0b89"+
		"\u0b87\3\2\2\2\u0b8a\u0b8c\7\7\2\2\u0b8b\u0b8a\3\2\2\2\u0b8c\u0b8f\3\2"+
		"\2\2\u0b8d\u0b8b\3\2\2\2\u0b8d\u0b8e\3\2\2\2\u0b8e\u0b90\3\2\2\2\u0b8f"+
		"\u0b8d\3\2\2\2\u0b90\u0b94\t\21\2\2\u0b91\u0b93\7\7\2\2\u0b92\u0b91\3"+
		"\2\2\2\u0b93\u0b96\3\2\2\2\u0b94\u0b92\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95"+
		"\u012f\3\2\2\2\u0b96\u0b94\3\2\2\2\u0b97\u0b99\7\7\2\2\u0b98\u0b97\3\2"+
		"\2\2\u0b99\u0b9c\3\2\2\2\u0b9a\u0b98\3\2\2\2\u0b9a\u0b9b\3\2\2\2\u0b9b"+
		"\u0b9d\3\2\2\2\u0b9c\u0b9a\3\2\2\2\u0b9d\u0ba1\t\22\2\2\u0b9e\u0ba0\7"+
		"\7\2\2\u0b9f\u0b9e\3\2\2\2\u0ba0\u0ba3\3\2\2\2\u0ba1\u0b9f\3\2\2\2\u0ba1"+
		"\u0ba2\3\2\2\2\u0ba2\u0131\3\2\2\2\u0ba3\u0ba1\3\2\2\2\u0ba4\u0ba6\7\7"+
		"\2\2\u0ba5\u0ba4\3\2\2\2\u0ba6\u0ba9\3\2\2\2\u0ba7\u0ba5\3\2\2\2\u0ba7"+
		"\u0ba8\3\2\2\2\u0ba8\u0baa\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0baa\u0bae\t\23"+
		"\2\2\u0bab\u0bad\7\7\2\2\u0bac\u0bab\3\2\2\2\u0bad\u0bb0\3\2\2\2\u0bae"+
		"\u0bac\3\2\2\2\u0bae\u0baf\3\2\2\2\u0baf\u0133\3\2\2\2\u0bb0\u0bae\3\2"+
		"\2\2\u0bb1\u0bb3\7\7\2\2\u0bb2\u0bb1\3\2\2\2\u0bb3\u0bb6\3\2\2\2\u0bb4"+
		"\u0bb2\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb7\3\2\2\2\u0bb6\u0bb4\3\2"+
		"\2\2\u0bb7\u0bbb\t\24\2\2\u0bb8\u0bba\7\7\2\2\u0bb9\u0bb8\3\2\2\2\u0bba"+
		"\u0bbd\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0135\3\2"+
		"\2\2\u0bbd\u0bbb\3\2\2\2\u0bbe\u0bc0\7\7\2\2\u0bbf\u0bbe\3\2\2\2\u0bc0"+
		"\u0bc3\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc4\3\2"+
		"\2\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bc8\7y\2\2\u0bc5\u0bc7\7\7\2\2\u0bc6"+
		"\u0bc5\3\2\2\2\u0bc7\u0bca\3\2\2\2\u0bc8\u0bc6\3\2\2\2\u0bc8\u0bc9\3\2"+
		"\2\2\u0bc9\u0137\3\2\2\2\u0bca\u0bc8\3\2\2\2\u0bcb\u0bcd\7\7\2\2\u0bcc"+
		"\u0bcb\3\2\2\2\u0bcd\u0bd0\3\2\2\2\u0bce\u0bcc\3\2\2\2\u0bce\u0bcf\3\2"+
		"\2\2\u0bcf\u0bd1\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd1\u0bd5\t\25\2\2\u0bd2"+
		"\u0bd4\7\7\2\2\u0bd3\u0bd2\3\2\2\2\u0bd4\u0bd7\3\2\2\2\u0bd5\u0bd3\3\2"+
		"\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0139\3\2\2\2\u0bd7\u0bd5\3\2\2\2\u0bd8"+
		"\u0bda\7\7\2\2\u0bd9\u0bd8\3\2\2\2\u0bda\u0bdd\3\2\2\2\u0bdb\u0bd9\3\2"+
		"\2\2\u0bdb\u0bdc\3\2\2\2\u0bdc\u0bde\3\2\2\2\u0bdd\u0bdb\3\2\2\2\u0bde"+
		"\u0be2\7g\2\2\u0bdf\u0be1\7\7\2\2\u0be0\u0bdf\3\2\2\2\u0be1\u0be4\3\2"+
		"\2\2\u0be2\u0be0\3\2\2\2\u0be2\u0be3\3\2\2\2\u0be3\u013b\3\2\2\2\u0be4"+
		"\u0be2\3\2\2\2\u0be5\u0be7\7\7\2\2\u0be6\u0be5\3\2\2\2\u0be7\u0bea\3\2"+
		"\2\2\u0be8\u0be6\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0beb\3\2\2\2\u0bea"+
		"\u0be8\3\2\2\2\u0beb\u0bef\t\26\2\2\u0bec\u0bee\7\7\2\2\u0bed\u0bec\3"+
		"\2\2\2\u0bee\u0bf1\3\2\2\2\u0bef\u0bed\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0"+
		"\u013d\3\2\2\2\u0bf1\u0bef\3\2\2\2\u0bf2\u0bf4\7\7\2\2\u0bf3\u0bf2\3\2"+
		"\2\2\u0bf4\u0bf7\3\2\2\2\u0bf5\u0bf3\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6"+
		"\u0bf8\3\2\2\2\u0bf7\u0bf5\3\2\2\2\u0bf8\u0bfc\t\27\2\2\u0bf9\u0bfb\7"+
		"\7\2\2\u0bfa\u0bf9\3\2\2\2\u0bfb\u0bfe\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfc"+
		"\u0bfd\3\2\2\2\u0bfd\u013f\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bff\u0c01\7\7"+
		"\2\2\u0c00\u0bff\3\2\2\2\u0c01\u0c04\3\2\2\2\u0c02\u0c00\3\2\2\2\u0c02"+
		"\u0c03\3\2\2\2\u0c03\u0c05\3\2\2\2\u0c04\u0c02\3\2\2\2\u0c05\u0c09\7a"+
		"\2\2\u0c06\u0c08\7\7\2\2\u0c07\u0c06\3\2\2\2\u0c08\u0c0b\3\2\2\2\u0c09"+
		"\u0c07\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0141\3\2\2\2\u0c0b\u0c09\3\2"+
		"\2\2\u0c0c\u0c0e\7\7\2\2\u0c0d\u0c0c\3\2\2\2\u0c0e\u0c11\3\2\2\2\u0c0f"+
		"\u0c0d\3\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c12\3\2\2\2\u0c11\u0c0f\3\2"+
		"\2\2\u0c12\u0c16\t\30\2\2\u0c13\u0c15\7\7\2\2\u0c14\u0c13\3\2\2\2\u0c15"+
		"\u0c18\3\2\2\2\u0c16\u0c14\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0143\3\2"+
		"\2\2\u0c18\u0c16\3\2\2\2\u0c19\u0c1d\5\u016c\u00b7\2\u0c1a\u0c1d\5\u00f2"+
		"z\2\u0c1b\u0c1d\5\u0146\u00a4\2\u0c1c\u0c19\3\2\2\2\u0c1c\u0c1a\3\2\2"+
		"\2\u0c1c\u0c1b\3\2\2\2\u0c1d\u0145\3\2\2\2\u0c1e\u0c1f\t\31\2\2\u0c1f"+
		"\u0147\3\2\2\2\u0c20\u0c26\5\u014a\u00a6\2\u0c21\u0c26\5@!\2\u0c22\u0c26"+
		"\5\u0152\u00aa\2\u0c23\u0c26\5\u0158\u00ad\2\u0c24\u0c26\5\u015a\u00ae"+
		"\2\u0c25\u0c20\3\2\2\2\u0c25\u0c21\3\2\2\2\u0c25\u0c22\3\2\2\2\u0c25\u0c23"+
		"\3\2\2\2\u0c25\u0c24\3\2\2\2\u0c26\u0149\3\2\2\2\u0c27\u0c28\t\32\2\2"+
		"\u0c28\u014b\3\2\2\2\u0c29\u0c2a\5\u00c4c\2\u0c2a\u0c2b\5\u0150\u00a9"+
		"\2\u0c2b\u0c2f\3\2\2\2\u0c2c\u0c2f\5\u0172\u00ba\2\u0c2d\u0c2f\5\u014e"+
		"\u00a8\2\u0c2e\u0c29\3\2\2\2\u0c2e\u0c2c\3\2\2\2\u0c2e\u0c2d\3\2\2\2\u0c2f"+
		"\u014d\3\2\2\2\u0c30\u0c34\7M\2\2\u0c31\u0c33\7\7\2\2\u0c32\u0c31\3\2"+
		"\2\2\u0c33\u0c36\3\2\2\2\u0c34\u0c32\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35"+
		"\u0c37\3\2\2\2\u0c36\u0c34\3\2\2\2\u0c37\u0c3b\5\u014c\u00a7\2\u0c38\u0c3a"+
		"\7\7\2\2\u0c39\u0c38\3\2\2\2\u0c3a\u0c3d\3\2\2\2\u0c3b\u0c39\3\2\2\2\u0c3b"+
		"\u0c3c\3\2\2\2\u0c3c\u0c3e\3\2\2\2\u0c3d\u0c3b\3\2\2\2\u0c3e\u0c3f\7N"+
		"\2\2\u0c3f\u014f\3\2\2\2\u0c40\u0c44\5@!\2\u0c41\u0c44\5\u0158\u00ad\2"+
		"\u0c42\u0c44\5\u015a\u00ae\2\u0c43\u0c40\3\2\2\2\u0c43\u0c41\3\2\2\2\u0c43"+
		"\u0c42\3\2\2\2\u0c44\u0151\3\2\2\2\u0c45\u0c47\5@!\2\u0c46\u0c45\3\2\2"+
		"\2\u0c46\u0c47\3\2\2\2\u0c47\u0c4a\3\2\2\2\u0c48\u0c4b\5\u0154\u00ab\2"+
		"\u0c49\u0c4b\5.\30\2\u0c4a\u0c48\3\2\2\2\u0c4a\u0c49\3\2\2\2\u0c4b\u0153"+
		"\3\2\2\2\u0c4c\u0c4e\5.\30\2\u0c4d\u0c4c\3\2\2\2\u0c4d\u0c4e\3\2\2\2\u0c4e"+
		"\u0c4f\3\2\2\2\u0c4f\u0c50\5\u0156\u00ac\2\u0c50\u0155\3\2\2\2\u0c51\u0c53"+
		"\5\u016a\u00b6\2\u0c52\u0c51\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c55\3"+
		"\2\2\2\u0c54\u0c56\5\u00f2z\2\u0c55\u0c54\3\2\2\2\u0c55\u0c56\3\2\2\2"+
		"\u0c56\u0c5a\3\2\2\2\u0c57\u0c59\7\7\2\2\u0c58\u0c57\3\2\2\2\u0c59\u0c5c"+
		"\3\2\2\2\u0c5a\u0c58\3\2\2\2\u0c5a\u0c5b\3\2\2\2\u0c5b\u0c5d\3\2\2\2\u0c5c"+
		"\u0c5a\3\2\2\2\u0c5d\u0c5e\5\u011e\u0090\2\u0c5e\u0157\3\2\2\2\u0c5f\u0c63"+
		"\7O\2\2\u0c60\u0c62\7\7\2\2\u0c61\u0c60\3\2\2\2\u0c62\u0c65\3\2\2\2\u0c63"+
		"\u0c61\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c66\3\2\2\2\u0c65\u0c63\3\2"+
		"\2\2\u0c66\u0c77\5\u00a2R\2\u0c67\u0c69\7\7\2\2\u0c68\u0c67\3\2\2\2\u0c69"+
		"\u0c6c\3\2\2\2\u0c6a\u0c68\3\2\2\2\u0c6a\u0c6b\3\2\2\2\u0c6b\u0c6d\3\2"+
		"\2\2\u0c6c\u0c6a\3\2\2\2\u0c6d\u0c71\7i\2\2\u0c6e\u0c70\7\7\2\2\u0c6f"+
		"\u0c6e\3\2\2\2\u0c70\u0c73\3\2\2\2\u0c71\u0c6f\3\2\2\2\u0c71\u0c72\3\2"+
		"\2\2\u0c72\u0c74\3\2\2\2\u0c73\u0c71\3\2\2\2\u0c74\u0c76\5\u00a2R\2\u0c75"+
		"\u0c6a\3\2\2\2\u0c76\u0c79\3\2\2\2\u0c77\u0c75\3\2\2\2\u0c77\u0c78\3\2"+
		"\2\2\u0c78\u0c7d\3\2\2\2\u0c79\u0c77\3\2\2\2\u0c7a\u0c7c\7\7\2\2\u0c7b"+
		"\u0c7a\3\2\2\2\u0c7c\u0c7f\3\2\2\2\u0c7d\u0c7b\3\2\2\2\u0c7d\u0c7e\3\2"+
		"\2\2\u0c7e\u0c80\3\2\2\2\u0c7f\u0c7d\3\2\2\2\u0c80\u0c81\7P\2\2\u0c81"+
		"\u0159\3\2\2\2\u0c82\u0c85\5\u015c\u00af\2\u0c83\u0c86\5\u0172\u00ba\2"+
		"\u0c84\u0c86\5\u00c8e\2\u0c85\u0c83\3\2\2\2\u0c85\u0c84\3\2\2\2\u0c86"+
		"\u015b\3\2\2\2\u0c87\u0c89\7\7\2\2\u0c88\u0c87\3\2\2\2\u0c89\u0c8c\3\2"+
		"\2\2\u0c8a\u0c88\3\2\2\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c8d\3\2\2\2\u0c8c"+
		"\u0c8a\3\2\2\2\u0c8d\u0c91\t\33\2\2\u0c8e\u0c90\7\7\2\2\u0c8f\u0c8e\3"+
		"\2\2\2\u0c90\u0c93\3\2\2\2\u0c91\u0c8f\3\2\2\2\u0c91\u0c92\3\2\2\2\u0c92"+
		"\u015d\3\2\2\2\u0c93\u0c91\3\2\2\2\u0c94\u0c98\5\u016a\u00b6\2\u0c95\u0c97"+
		"\7\7\2\2\u0c96\u0c95\3\2\2\2\u0c97\u0c9a\3\2\2\2\u0c98\u0c96\3\2\2\2\u0c98"+
		"\u0c99\3\2\2\2\u0c99\u0ca3\3\2\2\2\u0c9a\u0c98\3\2\2\2\u0c9b\u0c9f\5\u0160"+
		"\u00b1\2\u0c9c\u0c9e\7\7\2\2\u0c9d\u0c9c\3\2\2\2\u0c9e\u0ca1\3\2\2\2\u0c9f"+
		"\u0c9d\3\2\2\2\u0c9f\u0ca0\3\2\2\2\u0ca0\u0ca3\3\2\2\2\u0ca1\u0c9f\3\2"+
		"\2\2\u0ca2\u0c94\3\2\2\2\u0ca2\u0c9b\3\2\2\2\u0ca3\u0ca4\3\2\2\2\u0ca4"+
		"\u0ca2\3\2\2\2\u0ca4\u0ca5\3\2\2\2\u0ca5\u015f\3\2\2\2\u0ca6\u0cab\5\u0162"+
		"\u00b2\2\u0ca7\u0cab\5\u0164\u00b3\2\u0ca8\u0cab\5\u0166\u00b4\2\u0ca9"+
		"\u0cab\5\u0168\u00b5\2\u0caa\u0ca6\3\2\2\2\u0caa\u0ca7\3\2\2\2\u0caa\u0ca8"+
		"\3\2\2\2\u0caa\u0ca9\3\2\2\2\u0cab\u0161\3\2\2\2\u0cac\u0cad\t\34\2\2"+
		"\u0cad\u0163\3\2\2\2\u0cae\u0caf\t\35\2\2\u0caf\u0165\3\2\2\2\u0cb0\u0cb1"+
		"\7.\2\2\u0cb1\u0167\3\2\2\2\u0cb2\u0cb3\t\36\2\2\u0cb3\u0169\3\2\2\2\u0cb4"+
		"\u0cb8\5\u016c\u00b7\2\u0cb5\u0cb7\7\7\2\2\u0cb6\u0cb5\3\2\2\2\u0cb7\u0cba"+
		"\3\2\2\2\u0cb8\u0cb6\3\2\2\2\u0cb8\u0cb9\3\2\2\2\u0cb9\u0cbc\3\2\2\2\u0cba"+
		"\u0cb8\3\2\2\2\u0cbb\u0cb4\3\2\2\2\u0cbc\u0cbd\3\2\2\2\u0cbd\u0cbb\3\2"+
		"\2\2\u0cbd\u0cbe\3\2\2\2\u0cbe\u016b\3\2\2\2\u0cbf\u0cd5\7v\2\2\u0cc0"+
		"\u0cd6\5\u016e\u00b8\2\u0cc1\u0cc5\7O\2\2\u0cc2\u0cc4\7\7\2\2\u0cc3\u0cc2"+
		"\3\2\2\2\u0cc4\u0cc7\3\2\2\2\u0cc5\u0cc3\3\2\2\2\u0cc5\u0cc6\3\2\2\2\u0cc6"+
		"\u0cc9\3\2\2\2\u0cc7\u0cc5\3\2\2\2\u0cc8\u0cca\5\u016e\u00b8\2\u0cc9\u0cc8"+
		"\3\2\2\2\u0cca\u0ccb\3\2\2\2\u0ccb\u0cc9\3\2\2\2\u0ccb\u0ccc\3\2\2\2\u0ccc"+
		"\u0cd0\3\2\2\2\u0ccd\u0ccf\7\7\2\2\u0cce\u0ccd\3\2\2\2\u0ccf\u0cd2\3\2"+
		"\2\2\u0cd0\u0cce\3\2\2\2\u0cd0\u0cd1\3\2\2\2\u0cd1\u0cd3\3\2\2\2\u0cd2"+
		"\u0cd0\3\2\2\2\u0cd3\u0cd4\7P\2\2\u0cd4\u0cd6\3\2\2\2\u0cd5\u0cc0\3\2"+
		"\2\2\u0cd5\u0cc1\3\2\2\2\u0cd6\u016d\3\2\2\2\u0cd7\u0cd9\5\u0170\u00b9"+
		"\2\u0cd8\u0cda\5.\30\2\u0cd9\u0cd8\3\2\2\2\u0cd9\u0cda\3\2\2\2\u0cda\u016f"+
		"\3\2\2\2\u0cdb\u0cec\5\u0172\u00ba\2\u0cdc\u0cde\7\7\2\2\u0cdd\u0cdc\3"+
		"\2\2\2\u0cde\u0ce1\3\2\2\2\u0cdf\u0cdd\3\2\2\2\u0cdf\u0ce0\3\2\2\2\u0ce0"+
		"\u0ce2\3\2\2\2\u0ce1\u0cdf\3\2\2\2\u0ce2\u0ce6\7j\2\2\u0ce3\u0ce5\7\7"+
		"\2\2\u0ce4\u0ce3\3\2\2\2\u0ce5\u0ce8\3\2\2\2\u0ce6\u0ce4\3\2\2\2\u0ce6"+
		"\u0ce7\3\2\2\2\u0ce7\u0ce9\3\2\2\2\u0ce8\u0ce6\3\2\2\2\u0ce9\u0ceb\5\u0172"+
		"\u00ba\2\u0cea\u0cdf\3\2\2\2\u0ceb\u0cee\3\2\2\2\u0cec\u0cea\3\2\2\2\u0cec"+
		"\u0ced\3\2\2\2\u0ced\u0171\3\2\2\2\u0cee\u0cec\3\2\2\2\u0cef\u0cf0\7\u009a"+
		"\2\2\u0cf0\u0173\3\2\2\2\u0cf1\u0cf3\7\7\2\2\u0cf2\u0cf1\3\2\2\2\u0cf3"+
		"\u0cf4\3\2\2\2\u0cf4\u0cf2\3\2\2\2\u0cf4\u0cf5\3\2\2\2\u0cf5\u0d04\3\2"+
		"\2\2\u0cf6\u0cf8\7\7\2\2\u0cf7\u0cf6\3\2\2\2\u0cf8\u0cfb\3\2\2\2\u0cf9"+
		"\u0cf7\3\2\2\2\u0cf9\u0cfa\3\2\2\2\u0cfa\u0cfc\3\2\2\2\u0cfb\u0cf9\3\2"+
		"\2\2\u0cfc\u0d00\7r\2\2\u0cfd\u0cff\7\7\2\2\u0cfe\u0cfd\3\2\2\2\u0cff"+
		"\u0d02\3\2\2\2\u0d00\u0cfe\3\2\2\2\u0d00\u0d01\3\2\2\2\u0d01\u0d04\3\2"+
		"\2\2\u0d02\u0d00\3\2\2\2\u0d03\u0cf2\3\2\2\2\u0d03\u0cf9\3\2\2\2\u0d04"+
		"\u0175\3\2\2\2\u01ed\u0179\u0180\u0187\u018a\u018e\u0191\u0196\u019d\u01a2"+
		"\u01ab\u01af\u01bb\u01c0\u01c2\u01c4\u01c8\u01d9\u01dc\u01e2\u01e9\u01ed"+
		"\u01f2\u01f6\u01fb\u0202\u0206\u020b\u020f\u0212\u0218\u021f\u0223\u0228"+
		"\u022f\u0233\u0238\u023c\u023f\u0245\u024c\u0250\u0255\u0259\u025c\u0262"+
		"\u0269\u026d\u0272\u0279\u027d\u0280\u0286\u0289\u0291\u0298\u029f\u02a5"+
		"\u02a8\u02ad\u02b3\u02b6\u02bb\u02c2\u02c9\u02d0\u02d7\u02db\u02e1\u02e8"+
		"\u02ee\u02f2\u02f8\u02fb\u0301\u0308\u030e\u0312\u031a\u0321\u0328\u032e"+
		"\u0334\u0337\u033c\u0342\u0349\u034c\u034f\u0354\u035a\u0360\u0367\u036e"+
		"\u0372\u0377\u037b\u0381\u038a\u0390\u0396\u03a0\u03a5\u03ab\u03b4\u03ba"+
		"\u03c0\u03c4\u03ca\u03d1\u03d8\u03de\u03e4\u03e8\u03ee\u03f3\u03f7\u03fd"+
		"\u0404\u040b\u0411\u0417\u041d\u0423\u042a\u0431\u0438\u043e\u0441\u0447"+
		"\u044c\u0451\u0456\u045e\u0466\u0468\u046e\u0475\u047b\u0480\u0486\u048d"+
		"\u0494\u049a\u049d\u04a2\u04ab\u04b2\u04bb\u04c2\u04c9\u04cd\u04d2\u04d8"+
		"\u04df\u04e6\u04ea\u04ef\u04f3\u04f9\u04ff\u0505\u050d\u0512\u0515\u051b"+
		"\u0522\u0526\u052b\u0534\u0538\u053d\u0544\u054a\u054d\u0552\u055b\u0562"+
		"\u0568\u056c\u0572\u0576\u057b\u057f\u0582\u0588\u058c\u0591\u0598\u059c"+
		"\u05a2\u05a8\u05ae\u05b6\u05bb\u05be\u05c4\u05c8\u05cd\u05d2\u05d7\u05de"+
		"\u05e2\u05e7\u05eb\u05ee\u05f4\u05fb\u05ff\u0605\u060c\u0613\u0619\u061f"+
		"\u0628\u062f\u0633\u0639\u063d\u063f\u0644\u064a\u0650\u0657\u065b\u0660"+
		"\u0667\u066b\u0670\u0674\u0677\u067d\u0684\u068b\u0690\u0695\u069c\u06a0"+
		"\u06a5\u06a9\u06ac\u06b2\u06b9\u06bd\u06c1\u06c3\u06c9\u06d0\u06d4\u06d7"+
		"\u06dd\u06e1\u06e6\u06ed\u06f4\u06fb\u06ff\u0704\u0708\u070e\u0715\u071c"+
		"\u0722\u0725\u072a\u0730\u0736\u073d\u0741\u0747\u074e\u0758\u075c\u0762"+
		"\u0769\u0772\u0778\u077b\u0780\u0785\u0787\u078d\u0794\u0799\u079f\u07a6"+
		"\u07aa\u07ae\u07b3\u07ba\u07c1\u07c8\u07d1\u07d8\u07df\u07e6\u07ef\u07f6"+
		"\u07fd\u0804\u080b\u0814\u0819\u0825\u082e\u0837\u0840\u0849\u0850\u085a"+
		"\u085c\u0865\u086e\u0875\u087d\u0886\u088f\u0898\u08a1\u08a7\u08b0\u08c1"+
		"\u08cb\u08d1\u08d6\u08dc\u08e3\u08e7\u08ec\u08f0\u08f6\u08fa\u08ff\u0906"+
		"\u090c\u0912\u0919\u0920\u0927\u092c\u092f\u0933\u0939\u0940\u0947\u094e"+
		"\u0955\u095c\u0963\u096a\u0971\u0978\u097e\u0985\u0989\u098d\u0993\u099a"+
		"\u09a1\u09a8\u09af\u09b6\u09bb\u09c0\u09c9\u09d0\u09d7\u09dd\u09e3\u09ea"+
		"\u09ef\u09f5\u09fc\u0a00\u0a06\u0a0b\u0a11\u0a18\u0a1e\u0a24\u0a28\u0a2e"+
		"\u0a35\u0a39\u0a3f\u0a46\u0a4d\u0a54\u0a5a\u0a60\u0a67\u0a70\u0a79\u0a7f"+
		"\u0a88\u0a8c\u0a97\u0aa9\u0ac3\u0ac8\u0aca\u0ad4\u0ad6\u0ae9\u0aef\u0af3"+
		"\u0af8\u0aff\u0b02\u0b08\u0b11\u0b18\u0b1e\u0b23\u0b28\u0b2f\u0b33\u0b39"+
		"\u0b40\u0b47\u0b4b\u0b50\u0b54\u0b59\u0b60\u0b66\u0b6d\u0b73\u0b7a\u0b80"+
		"\u0b87\u0b8d\u0b94\u0b9a\u0ba1\u0ba7\u0bae\u0bb4\u0bbb\u0bc1\u0bc8\u0bce"+
		"\u0bd5\u0bdb\u0be2\u0be8\u0bef\u0bf5\u0bfc\u0c02\u0c09\u0c0f\u0c16\u0c1c"+
		"\u0c25\u0c2e\u0c34\u0c3b\u0c43\u0c46\u0c4a\u0c4d\u0c52\u0c55\u0c5a\u0c63"+
		"\u0c6a\u0c71\u0c77\u0c7d\u0c85\u0c8a\u0c91\u0c98\u0c9f\u0ca2\u0ca4\u0caa"+
		"\u0cb8\u0cbd\u0cc5\u0ccb\u0cd0\u0cd5\u0cd9\u0cdf\u0ce6\u0cec\u0cf4\u0cf9"+
		"\u0d00\u0d03";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}