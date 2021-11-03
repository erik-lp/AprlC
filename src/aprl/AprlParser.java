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
		DelimitedComment=1, DocComment=2, LineComment=3, WS=4, NL=5, USING=6, 
		ALIAS=7, CLASS=8, INTERFACE=9, STRUCT=10, DOCUMENT=11, ANONYMOUS=12, ENUM=13, 
		ANNOTATION=14, PARTNER=15, THIS=16, SUPER=17, SUB_=18, ACTUAL=19, INIT=20, 
		EXEC=21, PRIVATE=22, BOUNDED=23, LOCAL=24, PUBLIC=25, GETTER=26, SETTER=27, 
		DEF=28, CONST=29, VAR=30, VAL=31, ABSTRACT=32, COVER=33, OPEN=34, FINAL=35, 
		INLINE=36, EXTERNAL=37, SYNC=38, FUNCTION=39, SCRIPT=40, OPERATOR=41, 
		EXTENSION=42, PARAMS=43, IF=44, UNLESS=45, ELSIF=46, ELSE=47, FOR=48, 
		MATCH=49, WHEN=50, DO=51, WHILE=52, RETURN=53, BREAK=54, CONTINUE=55, 
		AS=56, AS_QUEST=57, IS=58, NOT_IS=59, IN=60, NOT_IN=61, TRY=62, TRY_QUEST=63, 
		CATCH=64, FINALLY=65, TRIGGER=66, TRUE=67, FALSE=68, NONE=69, NULL=70, 
		LPAREN=71, RPAREN=72, LSQUARE=73, RSQUARE=74, LCURLY=75, RCURLY=76, ASSIGN=77, 
		DEFINE=78, ADD=79, ADD_ASSIGN=80, INCR=81, SUB=82, SUB_ASSIGN=83, DECR=84, 
		MUL=85, MUL_ASSIGN=86, DIV=87, DIV_ASSIGN=88, MOD=89, MOD_ASSIGN=90, EXP=91, 
		EXP_ASSIGN=92, CONJ=93, CONJ_ASSIGN=94, DISJ=95, DISJ_ASSIGN=96, XOR=97, 
		XOR_ASSIGN=98, COMMA=99, PERIOD=100, QUEST_PERIOD=101, DOWNTO=102, TO=103, 
		UNTIL=104, TRIPLE_PERIOD=105, COLON=106, DOUBLE_COLON=107, SEMICOLON=108, 
		EXCL=109, DOUBLE_EXCL=110, QUEST=111, HASH=112, AT=113, DOUBLE_AT=114, 
		ELVIS=115, ELVIS_ASSIGN=116, EQUAL=117, NEQUAL=118, IDENTICAL=119, NIDENTICAL=120, 
		LANGLE=121, NLANGLE=122, LEQ=123, NLEQ=124, RANGLE=125, NRANGLE=126, GEQ=127, 
		NGEQ=128, LARROW=129, RARROW=130, RARROW_THICK=131, SINGLE_QUOTE=132, 
		QUOTE_OPEN=133, TRIPLE_QUOTE_OPEN=134, IntegerLiteral=135, LongLiteral=136, 
		ShortLiteral=137, ByteLiteral=138, FloatLiteral=139, DoubleLiteral=140, 
		ComplexLiteral=141, HexLiteral=142, BinLiteral=143, OctalLiteral=144, 
		BooleanLiteral=145, TrileanLiteral=146, Identifier=147, FieldIdentifier=148, 
		CharacterLiteral=149, UNICODE_CLASS_LL=150, UNICODE_CLASS_LM=151, UNICODE_CLASS_LO=152, 
		UNICODE_CLASS_LT=153, UNICODE_CLASS_LU=154, UNICODE_CLASS_ND=155, UNICODE_CLASS_NL=156, 
		QUOTE_CLOSE=157, LineStrRef=158, LineStrText=159, LineStrEscapedChar=160, 
		LineStrExprStart=161, TRIPLE_QUOTE_CLOSE=162, MultiLineStrQuote=163, MultiLineStrRef=164, 
		MultiLineStrText=165, MultiLineStrEscapedChar=166, MultiLineStrExprStart=167, 
		MultiLineNL=168;
	public static final int
		RULE_aprlFile = 0, RULE_preamble = 1, RULE_namespaceHeader = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_importIdentifier = 5, RULE_subImportIdentifier = 6, 
		RULE_singleImport = 7, RULE_importAlias = 8, RULE_topLevelObject = 9, 
		RULE_classDeclaration = 10, RULE_interfaceDeclaration = 11, RULE_annotationDeclaration = 12, 
		RULE_documentDeclaration = 13, RULE_primaryConstructor = 14, RULE_classParameters = 15, 
		RULE_classParameter = 16, RULE_delegationSpecifiers = 17, RULE_delegationSpecifier = 18, 
		RULE_interfaceDelegationSpecifiers = 19, RULE_annotatedInterfaceDelegationSpecifier = 20, 
		RULE_valueArguments = 21, RULE_valueArgument = 22, RULE_secondaryConstructor = 23, 
		RULE_constructorDelegationCall = 24, RULE_classBody = 25, RULE_classMember = 26, 
		RULE_loadScript = 27, RULE_initializerBody = 28, RULE_partnerDeclaration = 29, 
		RULE_typeArguments = 30, RULE_typeProjection = 31, RULE_typeProjectionModifierList = 32, 
		RULE_typeProjectionModifier = 33, RULE_typeParameters = 34, RULE_typeParameter = 35, 
		RULE_typeParameterModifierList = 36, RULE_typeParameterModifier = 37, 
		RULE_reificationModifier = 38, RULE_varianceModifier = 39, RULE_type = 40, 
		RULE_functionType = 41, RULE_receiverType = 42, RULE_functionTypeParameters = 43, 
		RULE_parenthesizedType = 44, RULE_arrayType = 45, RULE_nullableType = 46, 
		RULE_structDeclaration = 47, RULE_structBody = 48, RULE_structMember = 49, 
		RULE_enumDeclaration = 50, RULE_enumBody = 51, RULE_enumEntries = 52, 
		RULE_enumEntry = 53, RULE_extensionDeclaration = 54, RULE_extensionBody = 55, 
		RULE_extensionMember = 56, RULE_propertyDeclaration = 57, RULE_variableDeclaration = 58, 
		RULE_propertyBody = 59, RULE_getter = 60, RULE_setter = 61, RULE_functionValueParameterWithOptionalType = 62, 
		RULE_parameterWithOptionalType = 63, RULE_functionDeclaration = 64, RULE_functionValueParameters = 65, 
		RULE_functionValueParameter = 66, RULE_parameter = 67, RULE_functionBody = 68, 
		RULE_block = 69, RULE_statements = 70, RULE_statement = 71, RULE_localVariableDeclaration = 72, 
		RULE_loopStatement = 73, RULE_forStatement = 74, RULE_whileStatement = 75, 
		RULE_doWhileStatement = 76, RULE_assignment = 77, RULE_expression = 78, 
		RULE_disjunction = 79, RULE_conjunction = 80, RULE_equalityComparison = 81, 
		RULE_identityComparison = 82, RULE_comparison = 83, RULE_namedInfixExpression = 84, 
		RULE_namedInfix = 85, RULE_elvisExpression = 86, RULE_infixFunctionCall = 87, 
		RULE_rangeExpression = 88, RULE_xorExpression = 89, RULE_additiveExpression = 90, 
		RULE_multiplicativeExpression = 91, RULE_exponentialExpression = 92, RULE_asExpression = 93, 
		RULE_prefixUnaryExpression = 94, RULE_postfixUnaryExpression = 95, RULE_atomicExpression = 96, 
		RULE_parenthesizedExpression = 97, RULE_contextualReference = 98, RULE_callableReference = 99, 
		RULE_collectionLiteral = 100, RULE_thisExpression = 101, RULE_superExpression = 102, 
		RULE_conditionalExpression = 103, RULE_ifExpression = 104, RULE_elsifExpression = 105, 
		RULE_matchExpression = 106, RULE_matchEntry = 107, RULE_optionalTryExpression = 108, 
		RULE_tryExpression = 109, RULE_catchBlock = 110, RULE_finallyBlock = 111, 
		RULE_jumpExpression = 112, RULE_triggerExpression = 113, RULE_returnExpression = 114, 
		RULE_continueExpression = 115, RULE_breakExpression = 116, RULE_literalConstant = 117, 
		RULE_nullLiteral = 118, RULE_boolLiteral = 119, RULE_trileanLiteral = 120, 
		RULE_integerLiteral = 121, RULE_longLiteral = 122, RULE_shortLiteral = 123, 
		RULE_byteLiteral = 124, RULE_floatLiteral = 125, RULE_doubleLiteral = 126, 
		RULE_complexLiteral = 127, RULE_characterLiteral = 128, RULE_stringLiteral = 129, 
		RULE_lineStringLiteral = 130, RULE_multiLineStringLiteral = 131, RULE_lineStringContent = 132, 
		RULE_lineStringExpression = 133, RULE_multiLineStringContent = 134, RULE_multiLineStringExpression = 135, 
		RULE_lambdaLiteral = 136, RULE_lambdaParameters = 137, RULE_lambdaParameter = 138, 
		RULE_assignmentOperator = 139, RULE_disjunctionOperator = 140, RULE_conjunctionOperator = 141, 
		RULE_equalityOperator = 142, RULE_identityOperator = 143, RULE_comparisonOperator = 144, 
		RULE_inOperator = 145, RULE_isOperator = 146, RULE_elvisOperator = 147, 
		RULE_toOperator = 148, RULE_xorOperator = 149, RULE_additiveOperator = 150, 
		RULE_multiplicativeOperator = 151, RULE_exponentialOperator = 152, RULE_asOperator = 153, 
		RULE_unaryPrefix = 154, RULE_unaryPostfix = 155, RULE_postfixUnaryOperator = 156, 
		RULE_assignableExpression = 157, RULE_parenthesizedAssignableExpression = 158, 
		RULE_assignableSuffix = 159, RULE_callSuffix = 160, RULE_lambdaCallSuffix = 161, 
		RULE_annotatedLambda = 162, RULE_indexingSuffix = 163, RULE_navigationSuffix = 164, 
		RULE_memberAccessOperator = 165, RULE_modifierList = 166, RULE_modifier = 167, 
		RULE_visibilityModifier = 168, RULE_inheritanceModifier = 169, RULE_parameterModifier = 170, 
		RULE_functionModifier = 171, RULE_annotations = 172, RULE_annotation = 173, 
		RULE_unescapedAnnotation = 174, RULE_identifier = 175, RULE_simpleIdentifier = 176, 
		RULE_semi = 177;
	private static String[] makeRuleNames() {
		return new String[] {
			"aprlFile", "preamble", "namespaceHeader", "importList", "importHeader", 
			"importIdentifier", "subImportIdentifier", "singleImport", "importAlias", 
			"topLevelObject", "classDeclaration", "interfaceDeclaration", "annotationDeclaration", 
			"documentDeclaration", "primaryConstructor", "classParameters", "classParameter", 
			"delegationSpecifiers", "delegationSpecifier", "interfaceDelegationSpecifiers", 
			"annotatedInterfaceDelegationSpecifier", "valueArguments", "valueArgument", 
			"secondaryConstructor", "constructorDelegationCall", "classBody", "classMember", 
			"loadScript", "initializerBody", "partnerDeclaration", "typeArguments", 
			"typeProjection", "typeProjectionModifierList", "typeProjectionModifier", 
			"typeParameters", "typeParameter", "typeParameterModifierList", "typeParameterModifier", 
			"reificationModifier", "varianceModifier", "type", "functionType", "receiverType", 
			"functionTypeParameters", "parenthesizedType", "arrayType", "nullableType", 
			"structDeclaration", "structBody", "structMember", "enumDeclaration", 
			"enumBody", "enumEntries", "enumEntry", "extensionDeclaration", "extensionBody", 
			"extensionMember", "propertyDeclaration", "variableDeclaration", "propertyBody", 
			"getter", "setter", "functionValueParameterWithOptionalType", "parameterWithOptionalType", 
			"functionDeclaration", "functionValueParameters", "functionValueParameter", 
			"parameter", "functionBody", "block", "statements", "statement", "localVariableDeclaration", 
			"loopStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"assignment", "expression", "disjunction", "conjunction", "equalityComparison", 
			"identityComparison", "comparison", "namedInfixExpression", "namedInfix", 
			"elvisExpression", "infixFunctionCall", "rangeExpression", "xorExpression", 
			"additiveExpression", "multiplicativeExpression", "exponentialExpression", 
			"asExpression", "prefixUnaryExpression", "postfixUnaryExpression", "atomicExpression", 
			"parenthesizedExpression", "contextualReference", "callableReference", 
			"collectionLiteral", "thisExpression", "superExpression", "conditionalExpression", 
			"ifExpression", "elsifExpression", "matchExpression", "matchEntry", "optionalTryExpression", 
			"tryExpression", "catchBlock", "finallyBlock", "jumpExpression", "triggerExpression", 
			"returnExpression", "continueExpression", "breakExpression", "literalConstant", 
			"nullLiteral", "boolLiteral", "trileanLiteral", "integerLiteral", "longLiteral", 
			"shortLiteral", "byteLiteral", "floatLiteral", "doubleLiteral", "complexLiteral", 
			"characterLiteral", "stringLiteral", "lineStringLiteral", "multiLineStringLiteral", 
			"lineStringContent", "lineStringExpression", "multiLineStringContent", 
			"multiLineStringExpression", "lambdaLiteral", "lambdaParameters", "lambdaParameter", 
			"assignmentOperator", "disjunctionOperator", "conjunctionOperator", "equalityOperator", 
			"identityOperator", "comparisonOperator", "inOperator", "isOperator", 
			"elvisOperator", "toOperator", "xorOperator", "additiveOperator", "multiplicativeOperator", 
			"exponentialOperator", "asOperator", "unaryPrefix", "unaryPostfix", "postfixUnaryOperator", 
			"assignableExpression", "parenthesizedAssignableExpression", "assignableSuffix", 
			"callSuffix", "lambdaCallSuffix", "annotatedLambda", "indexingSuffix", 
			"navigationSuffix", "memberAccessOperator", "modifierList", "modifier", 
			"visibilityModifier", "inheritanceModifier", "parameterModifier", "functionModifier", 
			"annotations", "annotation", "unescapedAnnotation", "identifier", "simpleIdentifier", 
			"semi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'using'", "'alias'", "'class'", 
			"'interface'", "'struct'", "'document'", "'anonymous'", "'enum'", "'annotation'", 
			"'partner'", "'this'", "'super'", "'sub'", "'actual'", "'init'", "'exec'", 
			"'private'", "'bounded'", "'local'", "'public'", "'getter'", "'setter'", 
			"'def'", "'const'", "'var'", "'val'", "'abstract'", "'cover'", "'open'", 
			"'final'", "'inline'", "'external'", "'sync'", "'function'", "'script'", 
			"'operator'", "'extension'", "'params'", "'if'", "'unless'", "'elsif'", 
			"'else'", "'for'", "'match'", "'when'", "'do'", "'while'", "'return'", 
			"'break'", "'continue'", "'as'", "'as?'", "'is'", "'!is'", "'in'", "'!in'", 
			"'try'", "'try?'", "'catch'", "'finally'", "'trigger'", "'true'", "'false'", 
			"'none'", "'null'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", 
			"':='", "'+'", "'+='", "'++'", "'-'", "'-='", "'--'", "'*'", "'*='", 
			"'/'", "'/='", "'%'", "'%='", "'**'", "'**='", null, null, null, null, 
			null, null, "','", "'.'", "'?.'", "'>..'", "'..'", "'..<'", "'...'", 
			"':'", "'::'", "';'", "'!'", "'!!'", "'?'", "'#'", "'@'", "'@@'", "'?:'", 
			"'?='", "'=='", "'!='", "'==='", "'!=='", "'<'", "'!<'", "'<='", "'!<='", 
			"'>'", "'!>'", "'>='", "'!>='", "'<-'", "'->'", "'=>'", "'''", null, 
			"'\"\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "DocComment", "LineComment", "WS", "NL", "USING", 
			"ALIAS", "CLASS", "INTERFACE", "STRUCT", "DOCUMENT", "ANONYMOUS", "ENUM", 
			"ANNOTATION", "PARTNER", "THIS", "SUPER", "SUB_", "ACTUAL", "INIT", "EXEC", 
			"PRIVATE", "BOUNDED", "LOCAL", "PUBLIC", "GETTER", "SETTER", "DEF", "CONST", 
			"VAR", "VAL", "ABSTRACT", "COVER", "OPEN", "FINAL", "INLINE", "EXTERNAL", 
			"SYNC", "FUNCTION", "SCRIPT", "OPERATOR", "EXTENSION", "PARAMS", "IF", 
			"UNLESS", "ELSIF", "ELSE", "FOR", "MATCH", "WHEN", "DO", "WHILE", "RETURN", 
			"BREAK", "CONTINUE", "AS", "AS_QUEST", "IS", "NOT_IS", "IN", "NOT_IN", 
			"TRY", "TRY_QUEST", "CATCH", "FINALLY", "TRIGGER", "TRUE", "FALSE", "NONE", 
			"NULL", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", 
			"ASSIGN", "DEFINE", "ADD", "ADD_ASSIGN", "INCR", "SUB", "SUB_ASSIGN", 
			"DECR", "MUL", "MUL_ASSIGN", "DIV", "DIV_ASSIGN", "MOD", "MOD_ASSIGN", 
			"EXP", "EXP_ASSIGN", "CONJ", "CONJ_ASSIGN", "DISJ", "DISJ_ASSIGN", "XOR", 
			"XOR_ASSIGN", "COMMA", "PERIOD", "QUEST_PERIOD", "DOWNTO", "TO", "UNTIL", 
			"TRIPLE_PERIOD", "COLON", "DOUBLE_COLON", "SEMICOLON", "EXCL", "DOUBLE_EXCL", 
			"QUEST", "HASH", "AT", "DOUBLE_AT", "ELVIS", "ELVIS_ASSIGN", "EQUAL", 
			"NEQUAL", "IDENTICAL", "NIDENTICAL", "LANGLE", "NLANGLE", "LEQ", "NLEQ", 
			"RANGLE", "NRANGLE", "GEQ", "NGEQ", "LARROW", "RARROW", "RARROW_THICK", 
			"SINGLE_QUOTE", "QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", "IntegerLiteral", 
			"LongLiteral", "ShortLiteral", "ByteLiteral", "FloatLiteral", "DoubleLiteral", 
			"ComplexLiteral", "HexLiteral", "BinLiteral", "OctalLiteral", "BooleanLiteral", 
			"TrileanLiteral", "Identifier", "FieldIdentifier", "CharacterLiteral", 
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
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					match(NL);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(362);
			preamble();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(363);
				match(NL);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(369);
				topLevelObject();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(371); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(370);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(373); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
						{
						setState(375);
						topLevelObject();
						}
					}

					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(385);
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
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(387);
				namespaceHeader();
				}
			}

			setState(390);
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
			setState(392);
			identifier();
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(393);
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
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(396);
				importHeader();
				}
				}
				setState(401);
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
			setState(402);
			match(USING);
			setState(403);
			importIdentifier();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(404);
				match(COMMA);
				setState(405);
				importIdentifier();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(411);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				singleImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				identifier();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(416);
					match(PERIOD);
					setState(429);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(417);
						match(MUL);
						}
						break;
					case LSQUARE:
						{
						setState(418);
						match(LSQUARE);
						setState(419);
						subImportIdentifier();
						setState(424);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(420);
							match(COMMA);
							setState(421);
							subImportIdentifier();
							}
							}
							setState(426);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(427);
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
			setState(435);
			simpleIdentifier();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(436);
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
			setState(439);
			identifier();
			setState(440);
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
			setState(442);
			match(ALIAS);
			setState(443);
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				annotationDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				documentDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				extensionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(452);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
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
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(456);
				modifierList();
				}
			}

			setState(459);
			match(CLASS);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(460);
				match(NL);
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			simpleIdentifier();
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(467);
					match(NL);
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				typeParameters();
				}
				break;
			}
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(476);
					match(NL);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				primaryConstructor();
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(485);
					match(NL);
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(LARROW);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(492);
					match(NL);
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				delegationSpecifiers();
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(501);
					match(NL);
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
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
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(510);
				modifierList();
				}
			}

			setState(513);
			match(INTERFACE);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(514);
				match(NL);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			simpleIdentifier();
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(521);
					match(NL);
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				typeParameters();
				}
				break;
			}
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(530);
					match(NL);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(LARROW);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(537);
					match(NL);
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
				interfaceDelegationSpecifiers();
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(546);
					match(NL);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
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
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(555);
				modifierList();
				}
			}

			setState(558);
			match(ANNOTATION);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(559);
				match(NL);
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			simpleIdentifier();
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(566);
					match(NL);
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				primaryConstructor();
				}
				break;
			}
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(575);
					match(NL);
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
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
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(584);
				modifierList();
				}
			}

			setState(587);
			match(DOCUMENT);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(588);
				match(NL);
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			simpleIdentifier();
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(595);
					match(NL);
					}
					}
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(601);
				typeParameters();
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(604);
				match(NL);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			primaryConstructor();
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(611);
					match(NL);
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
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
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					setState(620);
					modifierList();
					}
				}

				setState(623);
				match(INIT);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(624);
					match(NL);
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(632);
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
			setState(634);
			match(LPAREN);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(NL);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(641);
				classParameter();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(642);
							match(NL);
							}
							}
							setState(647);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(648);
						match(COMMA);
						setState(652);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(649);
								match(NL);
								}
								} 
							}
							setState(654);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						}
						setState(655);
						classParameter();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(663);
				match(NL);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
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
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(671);
				modifierList();
				}
			}

			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==VAL) {
				{
				setState(674);
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

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(677);
				match(NL);
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			simpleIdentifier();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(684);
				match(NL);
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			match(COLON);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(691);
				match(NL);
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			type();
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(698);
					match(NL);
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(704);
				match(ASSIGN);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(705);
					match(NL);
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(711);
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
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
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
			setState(714);
			delegationSpecifier();
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					match(COMMA);
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
					delegationSpecifier();
					}
					} 
				}
				setState(733);
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
		enterRule(_localctx, 36, RULE_delegationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			identifier();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(735);
				typeArguments();
				}
			}

			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(738);
				valueArguments();
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
		enterRule(_localctx, 38, RULE_interfaceDelegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			annotatedInterfaceDelegationSpecifier();
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(742);
						match(NL);
						}
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(748);
					match(COMMA);
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(749);
						match(NL);
						}
						}
						setState(754);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(755);
					annotatedInterfaceDelegationSpecifier();
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 40, RULE_annotatedInterfaceDelegationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(761);
				annotations();
				}
			}

			setState(764);
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
		enterRule(_localctx, 42, RULE_valueArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(LPAREN);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(767);
				match(NL);
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRY) | (1L << TRY_QUEST))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRIGGER - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NONE - 66)) | (1L << (NULL - 66)) | (1L << (LPAREN - 66)) | (1L << (LSQUARE - 66)) | (1L << (LCURLY - 66)) | (1L << (ADD - 66)) | (1L << (INCR - 66)) | (1L << (SUB - 66)) | (1L << (DECR - 66)) | (1L << (PERIOD - 66)) | (1L << (DOUBLE_COLON - 66)) | (1L << (EXCL - 66)) | (1L << (HASH - 66)) | (1L << (DOUBLE_AT - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (QUOTE_OPEN - 133)) | (1L << (TRIPLE_QUOTE_OPEN - 133)) | (1L << (IntegerLiteral - 133)) | (1L << (LongLiteral - 133)) | (1L << (ShortLiteral - 133)) | (1L << (ByteLiteral - 133)) | (1L << (FloatLiteral - 133)) | (1L << (DoubleLiteral - 133)) | (1L << (ComplexLiteral - 133)) | (1L << (Identifier - 133)) | (1L << (CharacterLiteral - 133)))) != 0)) {
				{
				setState(773);
				valueArgument();
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(777);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(774);
							match(NL);
							}
							}
							setState(779);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(780);
						match(COMMA);
						setState(784);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(781);
							match(NL);
							}
							}
							setState(786);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(787);
						valueArgument();
						}
						} 
					}
					setState(792);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(793);
					match(NL);
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(801);
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
		enterRule(_localctx, 44, RULE_valueArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(803);
				annotations();
				}
			}

			setState(806);
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
		enterRule(_localctx, 46, RULE_secondaryConstructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(808);
				modifierList();
				}
			}

			setState(811);
			match(INIT);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(812);
				match(NL);
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(818);
			functionValueParameters();
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(819);
					match(NL);
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(825);
				match(COLON);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(826);
					match(NL);
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				constructorDelegationCall();
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(835);
					match(NL);
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(841);
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
		enterRule(_localctx, 48, RULE_constructorDelegationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==SUPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(845);
				match(NL);
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
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
		enterRule(_localctx, 50, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(LCURLY);
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(854);
					match(NL);
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(860);
				classMember();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 52, RULE_classMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(874);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(875);
				secondaryConstructor();
				}
				break;
			case 3:
				{
				setState(876);
				loadScript();
				}
				break;
			case 4:
				{
				setState(877);
				initializerBody();
				}
				break;
			case 5:
				{
				setState(878);
				partnerDeclaration();
				}
				break;
			}
			setState(882); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(881);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(884); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 54, RULE_loadScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(EXEC);
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(887);
				match(NL);
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893);
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
		enterRule(_localctx, 56, RULE_initializerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(INIT);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(896);
				match(NL);
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
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
		enterRule(_localctx, 58, RULE_partnerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(904);
				modifierList();
				}
			}

			setState(907);
			match(PARTNER);
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(908);
					match(NL);
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
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
		enterRule(_localctx, 60, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(LANGLE);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(918);
				match(NL);
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			typeProjection();
			setState(935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(925);
						match(NL);
						}
						}
						setState(930);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(931);
					match(COMMA);
					setState(932);
					typeProjection();
					}
					} 
				}
				setState(937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(938);
				match(NL);
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
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
		enterRule(_localctx, 62, RULE_typeProjection);
		try {
			setState(951);
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
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(946);
					typeProjectionModifierList();
					}
					break;
				}
				setState(949);
				type();
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
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
		enterRule(_localctx, 64, RULE_typeProjectionModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(953);
					typeProjectionModifier();
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(954);
						match(NL);
						}
						}
						setState(959);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(962); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		enterRule(_localctx, 66, RULE_typeProjectionModifier);
		try {
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case SUB_:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				varianceModifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
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
		enterRule(_localctx, 68, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(LANGLE);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(969);
				match(NL);
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			typeParameter();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(976);
						match(NL);
						}
						}
						setState(981);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(982);
					match(COMMA);
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(983);
						match(NL);
						}
						}
						setState(988);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(989);
					typeParameter();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(995);
				match(NL);
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1001);
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
		enterRule(_localctx, 70, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << SUB_) | (1L << ACTUAL))) != 0) || _la==HASH) {
				{
				setState(1003);
				typeParameterModifierList();
				}
			}

			setState(1006);
			simpleIdentifier();
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1007);
					match(NL);
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1013);
				match(COLON);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1014);
					match(NL);
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				type();
				setState(1037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1024);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1021);
							match(NL);
							}
							}
							setState(1026);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1027);
						match(CONJ);
						setState(1031);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1028);
							match(NL);
							}
							}
							setState(1033);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1034);
						type();
						}
						} 
					}
					setState(1039);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		enterRule(_localctx, 72, RULE_typeParameterModifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1042);
				typeParameterModifier();
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1043);
					match(NL);
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1051); 
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
		enterRule(_localctx, 74, RULE_typeParameterModifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTUAL:
				{
				setState(1053);
				reificationModifier();
				}
				break;
			case SUPER:
			case SUB_:
				{
				setState(1054);
				varianceModifier();
				}
				break;
			case HASH:
				{
				setState(1055);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1061);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1058);
					match(NL);
					}
					} 
				}
				setState(1063);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 76, RULE_reificationModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		enterRule(_localctx, 78, RULE_varianceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1068);
				annotations();
				}
			}

			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1071);
				functionType();
				}
				break;
			case 2:
				{
				setState(1072);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1073);
				arrayType();
				}
				break;
			case 4:
				{
				setState(1074);
				nullableType();
				}
				break;
			case 5:
				{
				setState(1075);
				identifier();
				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1076);
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
		enterRule(_localctx, 82, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			functionTypeParameters();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1082);
				match(NL);
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
			match(RARROW_THICK);
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1089);
				match(NL);
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1095);
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
		enterRule(_localctx, 84, RULE_receiverType);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				identifier();
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
		enterRule(_localctx, 86, RULE_functionTypeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(LPAREN);
			setState(1106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					match(NL);
					}
					} 
				}
				setState(1108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LSQUARE - 71)) | (1L << (HASH - 71)))) != 0) || _la==Identifier) {
				{
				setState(1109);
				type();
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1110);
							match(NL);
							}
							}
							setState(1115);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1116);
						match(COMMA);
						setState(1120);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1117);
							match(NL);
							}
							}
							setState(1122);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1123);
						type();
						}
						} 
					}
					setState(1128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
			}

			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1131);
				match(NL);
				}
				}
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1137);
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
		enterRule(_localctx, 88, RULE_parenthesizedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(LPAREN);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1140);
				match(NL);
				}
				}
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1146);
			type();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1147);
				match(NL);
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1153);
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
		enterRule(_localctx, 90, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(LSQUARE);
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1156);
				match(NL);
				}
				}
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1162);
			type();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1163);
				match(NL);
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169);
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
		enterRule(_localctx, 92, RULE_nullableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1171);
				identifier();
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGLE) {
					{
					setState(1172);
					typeArguments();
					}
				}

				}
				break;
			case LPAREN:
				{
				setState(1175);
				parenthesizedType();
				}
				break;
			case LSQUARE:
				{
				setState(1176);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1179);
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
		enterRule(_localctx, 94, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1181);
				modifierList();
				}
			}

			setState(1184);
			match(STRUCT);
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1185);
				match(NL);
				}
				}
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1191);
			simpleIdentifier();
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1192);
					match(NL);
					}
					}
					setState(1197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1198);
				match(LARROW);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1199);
					match(NL);
					}
					}
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1205);
				delegationSpecifiers();
				}
				break;
			}
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1208);
					match(NL);
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
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
		enterRule(_localctx, 96, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(LCURLY);
			setState(1221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1218);
					match(NL);
					}
					} 
				}
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1224);
				structMember();
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1230);
				match(NL);
				}
				}
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1236);
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
		enterRule(_localctx, 98, RULE_structMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
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
			case ABSTRACT:
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
				setState(1238);
				topLevelObject();
				}
				break;
			case EXEC:
				{
				setState(1239);
				loadScript();
				}
				break;
			case INIT:
				{
				setState(1240);
				initializerBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1243);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 100, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1248);
				modifierList();
				}
			}

			setState(1251);
			match(ENUM);
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1252);
				match(NL);
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1258);
			simpleIdentifier();
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1259);
					match(NL);
					}
					}
					setState(1264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1265);
				primaryConstructor();
				}
				break;
			}
			{
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1268);
				match(NL);
				}
				}
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1274);
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
		enterRule(_localctx, 102, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(LCURLY);
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1277);
					match(NL);
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1283);
				enumEntries();
				}
			}

			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1286);
					match(NL);
					}
					}
					setState(1291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1292);
				match(SEMICOLON);
				setState(1296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1293);
						match(NL);
						}
						} 
					}
					setState(1298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					{
					setState(1299);
					classMember();
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1307);
				match(NL);
				}
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1313);
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
		enterRule(_localctx, 104, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			enumEntry();
			setState(1332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1316);
						match(NL);
						}
						}
						setState(1321);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1322);
					match(COMMA);
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1323);
						match(NL);
						}
						}
						setState(1328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1329);
					enumEntry();
					}
					} 
				}
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 106, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1335);
				modifierList();
				}
			}

			setState(1338);
			simpleIdentifier();
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1339);
					match(NL);
					}
					}
					setState(1344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				valueArguments();
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1348);
					match(NL);
					}
					}
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1354);
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
		enterRule(_localctx, 108, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1357);
				modifierList();
				}
			}

			setState(1360);
			match(EXTENSION);
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1361);
					match(NL);
					}
					}
					setState(1366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1367);
				typeParameters();
				}
				break;
			}
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1370);
				match(NL);
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1376);
			receiverType();
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1377);
					match(NL);
					}
					}
					setState(1382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1383);
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
		enterRule(_localctx, 110, RULE_extensionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(LCURLY);
			setState(1390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1387);
					match(NL);
					}
					} 
				}
				setState(1392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1393);
				extensionMember();
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1399);
				match(NL);
				}
				}
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1405);
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
		enterRule(_localctx, 112, RULE_extensionMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			functionDeclaration();
			setState(1409); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1408);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1411); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AprlParser.DEF, 0); }
		public TerminalNode CONST() { return getToken(AprlParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
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
		public PropertyBodyContext propertyBody() {
			return getRuleContext(PropertyBodyContext.class,0);
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
		enterRule(_localctx, 114, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1413);
				modifierList();
				}
			}

			setState(1416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1417);
				match(NL);
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1423);
			variableDeclaration();
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1424);
					match(NL);
					}
					}
					setState(1429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1430);
				match(ASSIGN);
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1431);
					match(NL);
					}
					}
					setState(1436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1437);
				expression();
				}
				break;
			}
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1440);
					match(NL);
					}
					}
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1446);
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
		enterRule(_localctx, 116, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1449);
				annotations();
				}
			}

			setState(1452);
			simpleIdentifier();
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1453);
					match(NL);
					}
					}
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1459);
				match(COLON);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1460);
					match(NL);
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1466);
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
		enterRule(_localctx, 118, RULE_propertyBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(LCURLY);
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1470);
					match(NL);
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1476);
				getter();
				setState(1484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1477);
						semi();
						}
						}
						setState(1482);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1483);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1486);
				setter();
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1487);
						semi();
						}
						}
						setState(1492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1493);
					getter();
					}
					break;
				}
				}
				break;
			}
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1498);
				match(NL);
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1504);
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
		enterRule(_localctx, 120, RULE_getter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1506);
				modifierList();
				}
			}

			setState(1509);
			match(GETTER);
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1510);
					match(NL);
					}
					}
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1516);
				match(LPAREN);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1517);
					match(NL);
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1523);
				match(RPAREN);
				}
				break;
			}
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
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
				match(RARROW);
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1533);
					match(NL);
					}
					}
					setState(1538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1539);
				type();
				}
				break;
			}
			setState(1545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1542);
					match(NL);
					}
					} 
				}
				setState(1547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==ASSIGN) {
				{
				setState(1548);
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
		enterRule(_localctx, 122, RULE_setter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1551);
				modifierList();
				}
			}

			setState(1554);
			match(SETTER);
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1555);
					match(NL);
					}
					} 
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1561);
					match(LPAREN);
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
					functionValueParameterWithOptionalType();
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1569);
						match(NL);
						}
						}
						setState(1574);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1575);
					match(RPAREN);
					}
				}

				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1579);
						match(NL);
						}
						}
						setState(1584);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1585);
					match(RARROW);
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1586);
						match(NL);
						}
						}
						setState(1591);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1592);
					type();
					}
					break;
				}
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1595);
					match(NL);
					}
					}
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1601);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
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
		enterRule(_localctx, 124, RULE_functionValueParameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1604);
				modifierList();
				}
			}

			setState(1607);
			parameterWithOptionalType();
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1608);
					match(NL);
					}
					}
					setState(1613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1614);
				match(ASSIGN);
				setState(1618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1615);
					match(NL);
					}
					}
					setState(1620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1621);
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
		enterRule(_localctx, 126, RULE_parameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			simpleIdentifier();
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1625);
					match(NL);
					}
					}
					setState(1630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1631);
				match(COLON);
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1632);
					match(NL);
					}
					}
					setState(1637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1638);
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
		enterRule(_localctx, 128, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1641);
				modifierList();
				}
			}

			setState(1644);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1645);
					match(NL);
					}
					}
					setState(1650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1651);
				typeParameters();
				}
				break;
			}
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1654);
				match(NL);
				}
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1660);
			simpleIdentifier();
			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1661);
				match(NL);
				}
				}
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1667);
			functionValueParameters();
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1668);
					match(NL);
					}
					}
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1674);
				match(RARROW);
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1675);
					match(NL);
					}
					}
					setState(1680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1681);
				type();
				}
				break;
			}
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1684);
					match(NL);
					}
					}
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1690);
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
		enterRule(_localctx, 130, RULE_functionValueParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(LPAREN);
			setState(1697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1694);
					match(NL);
					}
					} 
				}
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1700);
				functionValueParameter();
				setState(1717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1704);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1701);
							match(NL);
							}
							}
							setState(1706);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1707);
						match(COMMA);
						setState(1711);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1708);
							match(NL);
							}
							}
							setState(1713);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1714);
						functionValueParameter();
						}
						} 
					}
					setState(1719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				}
				}
			}

			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1722);
				match(NL);
				}
				}
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1728);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
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
		enterRule(_localctx, 132, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1730);
				modifierList();
				}
			}

			setState(1733);
			parameter();
			setState(1748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1734);
					match(NL);
					}
					}
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1740);
				match(ASSIGN);
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1741);
					match(NL);
					}
					}
					setState(1746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1747);
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
		enterRule(_localctx, 134, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			simpleIdentifier();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1751);
				match(NL);
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1757);
			match(COLON);
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1758);
				match(NL);
				}
				}
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1764);
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
		enterRule(_localctx, 136, RULE_functionBody);
		int _la;
		try {
			setState(1775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767);
				match(ASSIGN);
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
		enterRule(_localctx, 138, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(LCURLY);
			setState(1781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1778);
					match(NL);
					}
					} 
				}
				setState(1783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			}
			setState(1784);
			statements();
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1785);
				match(NL);
				}
				}
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1791);
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
		enterRule(_localctx, 140, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1793);
				statement();
				setState(1803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1795); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1794);
								semi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1797); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1799);
						statement();
						}
						} 
					}
					setState(1805);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				}
				}
				break;
			}
			setState(1811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1808);
					semi();
					}
					} 
				}
				setState(1813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1814);
				annotations();
				}
				break;
			}
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1817);
				match(NL);
				}
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1823);
				localVariableDeclaration();
				}
				break;
			case 2:
				{
				setState(1824);
				assignment();
				}
				break;
			case 3:
				{
				setState(1825);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(1826);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AprlParser.DEF, 0); }
		public TerminalNode CONST() { return getToken(AprlParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1829);
				annotations();
				}
			}

			setState(1832);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1833);
				match(NL);
				}
				}
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1839);
			variableDeclaration();
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1840);
					match(NL);
					}
					}
					setState(1845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1846);
				match(ASSIGN);
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1847);
					match(NL);
					}
					}
					setState(1852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1853);
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
		enterRule(_localctx, 146, RULE_loopStatement);
		try {
			setState(1859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1858);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AprlParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 148, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			match(FOR);
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1862);
				match(NL);
				}
				}
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1868);
			match(LPAREN);
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1869);
				match(NL);
				}
				}
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(1875);
				annotations();
				}
				break;
			}
			setState(1878);
			variableDeclaration();
			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1879);
				match(NL);
				}
				}
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1885);
			match(IN);
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1886);
				match(NL);
				}
				}
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1892);
			expression();
			setState(1896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1893);
				match(NL);
				}
				}
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1899);
			match(RPAREN);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1900);
				match(NL);
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1906);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AprlParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 150, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(WHILE);
			setState(1912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1909);
				match(NL);
				}
				}
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1915);
			match(LPAREN);
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1916);
				match(NL);
				}
				}
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1922);
			expression();
			setState(1926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1923);
				match(NL);
				}
				}
				setState(1928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1929);
			match(RPAREN);
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1930);
				match(NL);
				}
				}
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1936);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AprlParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 152, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(DO);
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1939);
				match(NL);
				}
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1945);
			block();
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
			match(WHILE);
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
			setState(1959);
			match(LPAREN);
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1960);
				match(NL);
				}
				}
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1966);
			expression();
			setState(1970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1967);
				match(NL);
				}
				}
				setState(1972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1973);
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
		public AssignableExpressionContext assignableExpression() {
			return getRuleContext(AssignableExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 154, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			assignableExpression();
			setState(1979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1976);
					match(NL);
					}
					} 
				}
				setState(1981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
			setState(1982);
			assignmentOperator();
			setState(1983);
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
		enterRule(_localctx, 156, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
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
		enterRule(_localctx, 158, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			conjunction();
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1988);
					disjunctionOperator();
					setState(1989);
					conjunction();
					}
					} 
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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
		enterRule(_localctx, 160, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			equalityComparison();
			setState(2002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1997);
					conjunctionOperator();
					setState(1998);
					equalityComparison();
					}
					} 
				}
				setState(2004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
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
		enterRule(_localctx, 162, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			identityComparison();
			setState(2011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2006);
					equalityOperator();
					setState(2007);
					identityComparison();
					}
					} 
				}
				setState(2013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
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
		enterRule(_localctx, 164, RULE_identityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			comparison();
			setState(2020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2015);
					identityOperator();
					setState(2016);
					comparison();
					}
					} 
				}
				setState(2022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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
		public List<NamedInfixExpressionContext> namedInfixExpression() {
			return getRuleContexts(NamedInfixExpressionContext.class);
		}
		public NamedInfixExpressionContext namedInfixExpression(int i) {
			return getRuleContext(NamedInfixExpressionContext.class,i);
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
		enterRule(_localctx, 166, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			namedInfixExpression();
			setState(2029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2024);
					comparisonOperator();
					setState(2025);
					namedInfixExpression();
					}
					} 
				}
				setState(2031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
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
		public ElvisExpressionContext elvisExpression() {
			return getRuleContext(ElvisExpressionContext.class,0);
		}
		public List<NamedInfixContext> namedInfix() {
			return getRuleContexts(NamedInfixContext.class);
		}
		public NamedInfixContext namedInfix(int i) {
			return getRuleContext(NamedInfixContext.class,i);
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
		enterRule(_localctx, 168, RULE_namedInfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			elvisExpression();
			setState(2036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2033);
					namedInfix();
					}
					} 
				}
				setState(2038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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

	public static class NamedInfixContext extends ParserRuleContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public ElvisExpressionContext elvisExpression() {
			return getRuleContext(ElvisExpressionContext.class,0);
		}
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NamedInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterNamedInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitNamedInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitNamedInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedInfixContext namedInfix() throws RecognitionException {
		NamedInfixContext _localctx = new NamedInfixContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_namedInfix);
		try {
			setState(2045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2039);
				inOperator();
				setState(2040);
				elvisExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				isOperator();
				setState(2043);
				type();
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
		enterRule(_localctx, 172, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			infixFunctionCall();
			setState(2053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2048);
					elvisOperator();
					setState(2049);
					infixFunctionCall();
					}
					} 
				}
				setState(2055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
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
		enterRule(_localctx, 174, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			rangeExpression();
			setState(2062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2057);
					simpleIdentifier();
					setState(2058);
					rangeExpression();
					}
					} 
				}
				setState(2064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
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
		enterRule(_localctx, 176, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			xorExpression();
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2066);
				toOperator();
				setState(2067);
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
		enterRule(_localctx, 178, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			additiveExpression();
			setState(2077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2072);
					xorOperator();
					setState(2073);
					additiveExpression();
					}
					} 
				}
				setState(2079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
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
		enterRule(_localctx, 180, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			multiplicativeExpression();
			setState(2086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2081);
					additiveOperator();
					setState(2082);
					multiplicativeExpression();
					}
					} 
				}
				setState(2088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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
		enterRule(_localctx, 182, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			exponentialExpression();
			setState(2095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2090);
					multiplicativeOperator();
					setState(2091);
					exponentialExpression();
					}
					} 
				}
				setState(2097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
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
		enterRule(_localctx, 184, RULE_exponentialExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			asExpression();
			setState(2104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2099);
					exponentialOperator();
					setState(2100);
					asExpression();
					}
					} 
				}
				setState(2106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
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
		enterRule(_localctx, 186, RULE_asExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			prefixUnaryExpression();
			setState(2113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2108);
					asOperator();
					setState(2109);
					type();
					}
					} 
				}
				setState(2115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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
		enterRule(_localctx, 188, RULE_prefixUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ADD - 79)) | (1L << (INCR - 79)) | (1L << (SUB - 79)) | (1L << (DECR - 79)) | (1L << (EXCL - 79)) | (1L << (DOUBLE_AT - 79)))) != 0)) {
				{
				{
				setState(2116);
				unaryPrefix();
				}
				}
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2122);
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
		enterRule(_localctx, 190, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			atomicExpression();
			setState(2128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2125);
					unaryPostfix();
					}
					} 
				}
				setState(2130);
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
		public LambdaLiteralContext lambdaLiteral() {
			return getRuleContext(LambdaLiteralContext.class,0);
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
		enterRule(_localctx, 192, RULE_atomicExpression);
		try {
			setState(2144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2131);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2132);
				simpleIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2133);
				literalConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2134);
				contextualReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2135);
				callableReference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2136);
				lambdaLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2137);
				collectionLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2138);
				thisExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2139);
				superExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2140);
				conditionalExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2141);
				optionalTryExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2142);
				tryExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2143);
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
		enterRule(_localctx, 194, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(LPAREN);
			setState(2147);
			expression();
			setState(2148);
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
		enterRule(_localctx, 196, RULE_contextualReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			match(PERIOD);
			setState(2151);
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
		enterRule(_localctx, 198, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==LSQUARE || _la==Identifier) {
				{
				setState(2153);
				receiverType();
				}
			}

			setState(2156);
			match(DOUBLE_COLON);
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2157);
				match(NL);
				}
				}
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2163);
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
		enterRule(_localctx, 200, RULE_collectionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			match(LSQUARE);
			setState(2169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2166);
					match(NL);
					}
					} 
				}
				setState(2171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			setState(2173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRY) | (1L << TRY_QUEST))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRIGGER - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NONE - 66)) | (1L << (NULL - 66)) | (1L << (LPAREN - 66)) | (1L << (LSQUARE - 66)) | (1L << (LCURLY - 66)) | (1L << (ADD - 66)) | (1L << (INCR - 66)) | (1L << (SUB - 66)) | (1L << (DECR - 66)) | (1L << (PERIOD - 66)) | (1L << (DOUBLE_COLON - 66)) | (1L << (EXCL - 66)) | (1L << (DOUBLE_AT - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (QUOTE_OPEN - 133)) | (1L << (TRIPLE_QUOTE_OPEN - 133)) | (1L << (IntegerLiteral - 133)) | (1L << (LongLiteral - 133)) | (1L << (ShortLiteral - 133)) | (1L << (ByteLiteral - 133)) | (1L << (FloatLiteral - 133)) | (1L << (DoubleLiteral - 133)) | (1L << (ComplexLiteral - 133)) | (1L << (Identifier - 133)) | (1L << (CharacterLiteral - 133)))) != 0)) {
				{
				setState(2172);
				expression();
				}
			}

			setState(2191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2175);
						match(NL);
						}
						}
						setState(2180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2181);
					match(COMMA);
					setState(2185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2182);
						match(NL);
						}
						}
						setState(2187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2188);
					expression();
					}
					} 
				}
				setState(2193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			setState(2197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2194);
				match(NL);
				}
				}
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2200);
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
		enterRule(_localctx, 202, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(THIS);
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
		enterRule(_localctx, 204, RULE_superExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			match(SUPER);
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
		enterRule(_localctx, 206, RULE_conditionalExpression);
		try {
			setState(2208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case UNLESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				ifExpression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207);
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
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode IF() { return getToken(AprlParser.IF, 0); }
		public TerminalNode UNLESS() { return getToken(AprlParser.UNLESS, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<ElsifExpressionContext> elsifExpression() {
			return getRuleContexts(ElsifExpressionContext.class);
		}
		public ElsifExpressionContext elsifExpression(int i) {
			return getRuleContext(ElsifExpressionContext.class,i);
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
		enterRule(_localctx, 208, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==UNLESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2211);
				match(NL);
				}
				}
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2217);
			match(LPAREN);
			setState(2221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2218);
				match(NL);
				}
				}
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2224);
			expression();
			setState(2228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2225);
				match(NL);
				}
				}
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2231);
			match(RPAREN);
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2232);
				match(NL);
				}
				}
				setState(2237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2238);
			block();
			setState(2248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2239);
						match(NL);
						}
						}
						setState(2244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2245);
					elsifExpression();
					}
					} 
				}
				setState(2250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(2254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2251);
					match(NL);
					}
					}
					setState(2256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2257);
				match(ELSE);
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2258);
					match(NL);
					}
					}
					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2264);
				block();
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

	public static class ElsifExpressionContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(AprlParser.ELSIF, 0); }
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AprlParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ElsifExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterElsifExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitElsifExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitElsifExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifExpressionContext elsifExpression() throws RecognitionException {
		ElsifExpressionContext _localctx = new ElsifExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_elsifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			match(ELSIF);
			setState(2271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2268);
				match(NL);
				}
				}
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2274);
			match(LPAREN);
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2275);
				match(NL);
				}
				}
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2281);
			expression();
			setState(2285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2282);
				match(NL);
				}
				}
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2288);
			match(RPAREN);
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2289);
				match(NL);
				}
				}
				setState(2294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2295);
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
		enterRule(_localctx, 212, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			match(MATCH);
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
			match(LPAREN);
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
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2312);
				match(NL);
				}
				}
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2318);
			match(RPAREN);
			setState(2322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2319);
				match(NL);
				}
				}
				setState(2324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2325);
			match(LCURLY);
			setState(2333); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2326);
						match(NL);
						}
						}
						setState(2331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2332);
					matchEntry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2335); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2337);
				match(NL);
				}
				}
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2343);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 214, RULE_matchEntry);
		int _la;
		try {
			int _alt;
			setState(2404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2345);
				match(WHEN);
				setState(2349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2346);
					match(NL);
					}
					}
					setState(2351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2352);
				literalConstant();
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2353);
							match(NL);
							}
							}
							setState(2358);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2359);
						match(COMMA);
						setState(2363);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2360);
							match(NL);
							}
							}
							setState(2365);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2366);
						literalConstant();
						}
						} 
					}
					setState(2371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				}
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2372);
					match(NL);
					}
					}
					setState(2377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2378);
				match(RARROW_THICK);
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2379);
					match(NL);
					}
					}
					setState(2384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2385);
				block();
				setState(2387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2386);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(ELSE);
				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2390);
					match(NL);
					}
					}
					setState(2395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2396);
				match(RARROW_THICK);
				setState(2400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2397);
					match(NL);
					}
					}
					setState(2402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2403);
				block();
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
		enterRule(_localctx, 216, RULE_optionalTryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			match(TRY_QUEST);
			setState(2410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2407);
				match(NL);
				}
				}
				setState(2412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2413);
				block();
				}
				break;
			case 2:
				{
				setState(2414);
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
		enterRule(_localctx, 218, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			match(TRY);
			setState(2421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2418);
				match(NL);
				}
				}
				setState(2423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2424);
			block();
			setState(2434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					catchBlock();
					}
					} 
				}
				setState(2436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			setState(2444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2437);
					match(NL);
					}
					}
					setState(2442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2443);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 220, RULE_catchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			match(CATCH);
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2447);
				match(NL);
				}
				}
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2453);
			match(LPAREN);
			setState(2457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2454);
				match(NL);
				}
				}
				setState(2459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(2460);
				annotations();
				}
			}

			setState(2463);
			simpleIdentifier();
			setState(2467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2464);
				match(NL);
				}
				}
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2470);
			match(COLON);
			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2471);
				match(NL);
				}
				}
				setState(2476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2477);
			type();
			setState(2494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2478);
						match(NL);
						}
						}
						setState(2483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2484);
					match(CONJ);
					setState(2488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2485);
						match(NL);
						}
						}
						setState(2490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2491);
					type();
					}
					} 
				}
				setState(2496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			setState(2500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2497);
				match(NL);
				}
				}
				setState(2502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2503);
			match(RPAREN);
			setState(2507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2504);
				match(NL);
				}
				}
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2510);
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
		enterRule(_localctx, 222, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			match(FINALLY);
			setState(2516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2513);
				match(NL);
				}
				}
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2519);
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
		enterRule(_localctx, 224, RULE_jumpExpression);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2521);
				triggerExpression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2522);
				returnExpression();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2523);
				continueExpression();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2524);
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
		enterRule(_localctx, 226, RULE_triggerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			match(TRIGGER);
			setState(2531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2528);
				match(NL);
				}
				}
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2534);
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
		enterRule(_localctx, 228, RULE_returnExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			match(RETURN);
			setState(2540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2537);
					match(NL);
					}
					} 
				}
				setState(2542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			setState(2544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2543);
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
		enterRule(_localctx, 230, RULE_continueExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			match(CONTINUE);
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
		enterRule(_localctx, 232, RULE_breakExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			match(BREAK);
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
		enterRule(_localctx, 234, RULE_literalConstant);
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2550);
				nullLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2551);
				boolLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2552);
				trileanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2553);
				integerLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2554);
				longLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2555);
				shortLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2556);
				byteLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2557);
				floatLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2558);
				doubleLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2559);
				complexLiteral();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2560);
				characterLiteral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2561);
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
		enterRule(_localctx, 236, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
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
		enterRule(_localctx, 238, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
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
		enterRule(_localctx, 240, RULE_trileanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (NONE - 67)))) != 0)) ) {
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
		enterRule(_localctx, 242, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
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
		enterRule(_localctx, 244, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
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
		enterRule(_localctx, 246, RULE_shortLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
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
		enterRule(_localctx, 248, RULE_byteLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
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
		enterRule(_localctx, 250, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
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
		enterRule(_localctx, 252, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2580);
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
		enterRule(_localctx, 254, RULE_complexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
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
		enterRule(_localctx, 256, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
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
		enterRule(_localctx, 258, RULE_stringLiteral);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2587);
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
		enterRule(_localctx, 260, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(QUOTE_OPEN);
			setState(2595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (LineStrRef - 158)) | (1L << (LineStrText - 158)) | (1L << (LineStrEscapedChar - 158)) | (1L << (LineStrExprStart - 158)))) != 0)) {
				{
				setState(2593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(2591);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(2592);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2598);
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
		enterRule(_localctx, 262, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			match(TRIPLE_QUOTE_OPEN);
			setState(2607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (QUOTE_OPEN - 133)) | (1L << (MultiLineStrQuote - 133)) | (1L << (MultiLineStrRef - 133)) | (1L << (MultiLineStrText - 133)) | (1L << (MultiLineStrEscapedChar - 133)) | (1L << (MultiLineStrExprStart - 133)))) != 0)) {
				{
				setState(2605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(2601);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(2602);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(2603);
					lineStringLiteral();
					}
					break;
				case MultiLineStrQuote:
					{
					setState(2604);
					match(MultiLineStrQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2610);
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
		enterRule(_localctx, 264, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			_la = _input.LA(1);
			if ( !(((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (LineStrRef - 158)) | (1L << (LineStrText - 158)) | (1L << (LineStrEscapedChar - 158)))) != 0)) ) {
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
		enterRule(_localctx, 266, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			match(LineStrExprStart);
			setState(2615);
			expression();
			setState(2616);
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
		enterRule(_localctx, 268, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (MultiLineStrRef - 164)) | (1L << (MultiLineStrText - 164)) | (1L << (MultiLineStrEscapedChar - 164)))) != 0)) ) {
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
		enterRule(_localctx, 270, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			match(MultiLineStrExprStart);
			setState(2621);
			expression();
			setState(2622);
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
		enterRule(_localctx, 272, RULE_lambdaLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2624);
			match(LCURLY);
			setState(2628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2625);
					match(NL);
					}
					} 
				}
				setState(2630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
			}
			setState(2647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH || _la==Identifier) {
					{
					setState(2631);
					lambdaParameters();
					}
				}

				setState(2637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2634);
					match(NL);
					}
					}
					setState(2639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2640);
				match(RARROW_THICK);
				setState(2644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2641);
						match(NL);
						}
						} 
					}
					setState(2646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
				}
				}
				break;
			}
			setState(2649);
			statements();
			setState(2653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2650);
				match(NL);
				}
				}
				setState(2655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2656);
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
		enterRule(_localctx, 274, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			lambdaParameter();
			setState(2675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,379,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2659);
						match(NL);
						}
						}
						setState(2664);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2665);
					match(COMMA);
					setState(2669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2666);
						match(NL);
						}
						}
						setState(2671);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2672);
					lambdaParameter();
					}
					} 
				}
				setState(2677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,379,_ctx);
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
		enterRule(_localctx, 276, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
			variableDeclaration();
			setState(2693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2679);
					match(NL);
					}
					}
					setState(2684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2685);
				match(COLON);
				setState(2689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2686);
					match(NL);
					}
					}
					setState(2691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2692);
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
		enterRule(_localctx, 278, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2695);
				match(NL);
				}
				}
				setState(2700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2701);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (DEFINE - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (EXP_ASSIGN - 77)) | (1L << (CONJ_ASSIGN - 77)) | (1L << (DISJ_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (ELVIS_ASSIGN - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2702);
				match(NL);
				}
				}
				setState(2707);
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
		enterRule(_localctx, 280, RULE_disjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2708);
				match(NL);
				}
				}
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2714);
			match(DISJ);
			setState(2718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2715);
				match(NL);
				}
				}
				setState(2720);
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
		enterRule(_localctx, 282, RULE_conjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2721);
				match(NL);
				}
				}
				setState(2726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2727);
			match(CONJ);
			setState(2731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2728);
				match(NL);
				}
				}
				setState(2733);
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
		enterRule(_localctx, 284, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2734);
				match(NL);
				}
				}
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2740);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2741);
				match(NL);
				}
				}
				setState(2746);
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
		enterRule(_localctx, 286, RULE_identityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2747);
				match(NL);
				}
				}
				setState(2752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2753);
			_la = _input.LA(1);
			if ( !(_la==IDENTICAL || _la==NIDENTICAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2754);
				match(NL);
				}
				}
				setState(2759);
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
		enterRule(_localctx, 288, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2760);
				match(NL);
				}
				}
				setState(2765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2766);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (LANGLE - 121)) | (1L << (NLANGLE - 121)) | (1L << (LEQ - 121)) | (1L << (NLEQ - 121)) | (1L << (RANGLE - 121)) | (1L << (NRANGLE - 121)) | (1L << (GEQ - 121)) | (1L << (NGEQ - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2767);
				match(NL);
				}
				}
				setState(2772);
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
		enterRule(_localctx, 290, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2773);
				match(NL);
				}
				}
				setState(2778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2779);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2780);
				match(NL);
				}
				}
				setState(2785);
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
		enterRule(_localctx, 292, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2786);
				match(NL);
				}
				}
				setState(2791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2792);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2793);
				match(NL);
				}
				}
				setState(2798);
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
		enterRule(_localctx, 294, RULE_elvisOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2799);
				match(NL);
				}
				}
				setState(2804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2805);
			match(ELVIS);
			setState(2809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2806);
				match(NL);
				}
				}
				setState(2811);
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
		enterRule(_localctx, 296, RULE_toOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2812);
				match(NL);
				}
				}
				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2818);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DOWNTO - 102)) | (1L << (TO - 102)) | (1L << (UNTIL - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 298, RULE_xorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2825);
				match(NL);
				}
				}
				setState(2830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2831);
			match(XOR);
			setState(2835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2832);
				match(NL);
				}
				}
				setState(2837);
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
		enterRule(_localctx, 300, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2838);
				match(NL);
				}
				}
				setState(2843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2844);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2845);
				match(NL);
				}
				}
				setState(2850);
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
		enterRule(_localctx, 302, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (MUL - 85)) | (1L << (DIV - 85)) | (1L << (MOD - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 304, RULE_exponentialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2864);
				match(NL);
				}
				}
				setState(2869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2870);
			match(EXP);
			setState(2874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2871);
				match(NL);
				}
				}
				setState(2876);
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
		enterRule(_localctx, 306, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2877);
				match(NL);
				}
				}
				setState(2882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2883);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==AS_QUEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2884);
				match(NL);
				}
				}
				setState(2889);
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
		public TerminalNode INCR() { return getToken(AprlParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(AprlParser.DECR, 0); }
		public TerminalNode ADD() { return getToken(AprlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AprlParser.SUB, 0); }
		public TerminalNode EXCL() { return getToken(AprlParser.EXCL, 0); }
		public TerminalNode DOUBLE_AT() { return getToken(AprlParser.DOUBLE_AT, 0); }
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
		enterRule(_localctx, 308, RULE_unaryPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2890);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ADD - 79)) | (1L << (INCR - 79)) | (1L << (SUB - 79)) | (1L << (DECR - 79)) | (1L << (EXCL - 79)) | (1L << (DOUBLE_AT - 79)))) != 0)) ) {
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
		enterRule(_localctx, 310, RULE_unaryPostfix);
		try {
			setState(2897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2892);
				postfixUnaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2893);
				typeArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2894);
				callSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2895);
				indexingSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2896);
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
		enterRule(_localctx, 312, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INCR - 81)) | (1L << (DECR - 81)) | (1L << (DOUBLE_EXCL - 81)))) != 0)) ) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AssignableSuffixContext> assignableSuffix() {
			return getRuleContexts(AssignableSuffixContext.class);
		}
		public AssignableSuffixContext assignableSuffix(int i) {
			return getRuleContext(AssignableSuffixContext.class,i);
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
		enterRule(_localctx, 314, RULE_assignableExpression);
		try {
			int _alt;
			setState(2908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2901);
				expression();
				setState(2903); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2902);
						assignableSuffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2905); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,414,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2907);
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
		enterRule(_localctx, 316, RULE_parenthesizedAssignableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
			match(LPAREN);
			setState(2914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2911);
				match(NL);
				}
				}
				setState(2916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2917);
			assignableExpression();
			setState(2921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2918);
				match(NL);
				}
				}
				setState(2923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2924);
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
		enterRule(_localctx, 318, RULE_assignableSuffix);
		try {
			setState(2928);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2926);
				indexingSuffix();
				}
				break;
			case NL:
			case PERIOD:
			case QUEST_PERIOD:
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2927);
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
		enterRule(_localctx, 320, RULE_callSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2930);
				typeArguments();
				}
			}

			setState(2935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,420,_ctx) ) {
			case 1:
				{
				setState(2933);
				lambdaCallSuffix();
				}
				break;
			case 2:
				{
				setState(2934);
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
		enterRule(_localctx, 322, RULE_lambdaCallSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2937);
				valueArguments();
				}
			}

			setState(2940);
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
		enterRule(_localctx, 324, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(2942);
				annotations();
				}
			}

			setState(2948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2945);
				match(NL);
				}
				}
				setState(2950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2951);
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
		enterRule(_localctx, 326, RULE_indexingSuffix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2953);
			match(LSQUARE);
			setState(2957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2954);
				match(NL);
				}
				}
				setState(2959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2960);
			expression();
			setState(2977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,427,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2964);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2961);
						match(NL);
						}
						}
						setState(2966);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2967);
					match(COMMA);
					setState(2971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2968);
						match(NL);
						}
						}
						setState(2973);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2974);
					expression();
					}
					} 
				}
				setState(2979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,427,_ctx);
			}
			setState(2983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2980);
				match(NL);
				}
				}
				setState(2985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2986);
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
		enterRule(_localctx, 328, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2988);
			memberAccessOperator();
			setState(2989);
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
		enterRule(_localctx, 330, RULE_memberAccessOperator);
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
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (PERIOD - 100)) | (1L << (QUEST_PERIOD - 100)) | (1L << (DOUBLE_COLON - 100)))) != 0)) ) {
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
		enterRule(_localctx, 332, RULE_modifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3018);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(3004);
					annotations();
					setState(3008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,431,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3005);
							match(NL);
							}
							} 
						}
						setState(3010);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,431,_ctx);
					}
					}
					break;
				case PRIVATE:
				case BOUNDED:
				case LOCAL:
				case PUBLIC:
				case ABSTRACT:
				case COVER:
				case OPEN:
				case FINAL:
				case INLINE:
				case EXTERNAL:
				case SYNC:
				case PARAMS:
					{
					setState(3011);
					modifier();
					setState(3015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,432,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3012);
							match(NL);
							}
							} 
						}
						setState(3017);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,432,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH );
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
		enterRule(_localctx, 334, RULE_modifier);
		try {
			setState(3026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case BOUNDED:
			case LOCAL:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3022);
				visibilityModifier();
				}
				break;
			case ABSTRACT:
			case COVER:
			case OPEN:
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3023);
				inheritanceModifier();
				}
				break;
			case PARAMS:
				enterOuterAlt(_localctx, 3);
				{
				setState(3024);
				parameterModifier();
				}
				break;
			case INLINE:
			case EXTERNAL:
			case SYNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(3025);
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
		enterRule(_localctx, 336, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3028);
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
		public TerminalNode ABSTRACT() { return getToken(AprlParser.ABSTRACT, 0); }
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
		enterRule(_localctx, 338, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3030);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL))) != 0)) ) {
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
		enterRule(_localctx, 340, RULE_parameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3032);
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
		enterRule(_localctx, 342, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
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
		enterRule(_localctx, 344, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3043); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3036);
					annotation();
					setState(3040);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3037);
							match(NL);
							}
							} 
						}
						setState(3042);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3045); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,437,_ctx);
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
		enterRule(_localctx, 346, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3047);
			match(HASH);
			setState(3069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(3048);
				unescapedAnnotation();
				}
				break;
			case LSQUARE:
				{
				setState(3049);
				match(LSQUARE);
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
				setState(3057); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3056);
					unescapedAnnotation();
					}
					}
					setState(3059); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(3064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3061);
					match(NL);
					}
					}
					setState(3066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3067);
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
		enterRule(_localctx, 348, RULE_unescapedAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3071);
			identifier();
			setState(3073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				{
				setState(3072);
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
		enterRule(_localctx, 350, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3075);
			simpleIdentifier();
			setState(3092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					setState(3082);
					match(PERIOD);
					setState(3086);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3083);
						match(NL);
						}
						}
						setState(3088);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3089);
					simpleIdentifier();
					}
					} 
				}
				setState(3094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
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
		enterRule(_localctx, 352, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3095);
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
		enterRule(_localctx, 354, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(3115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3098); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3097);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3102);
					match(NL);
					}
					}
					setState(3107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3108);
				match(SEMICOLON);
				setState(3112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3109);
						match(NL);
						}
						} 
					}
					setState(3114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00aa\u0c30\4\2\t"+
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
		"\t\u00b2\4\u00b3\t\u00b3\3\2\7\2\u0168\n\2\f\2\16\2\u016b\13\2\3\2\3\2"+
		"\7\2\u016f\n\2\f\2\16\2\u0172\13\2\3\2\3\2\6\2\u0176\n\2\r\2\16\2\u0177"+
		"\3\2\5\2\u017b\n\2\7\2\u017d\n\2\f\2\16\2\u0180\13\2\5\2\u0182\n\2\3\2"+
		"\3\2\3\3\5\3\u0187\n\3\3\3\3\3\3\4\3\4\5\4\u018d\n\4\3\5\7\5\u0190\n\5"+
		"\f\5\16\5\u0193\13\5\3\6\3\6\3\6\3\6\7\6\u0199\n\6\f\6\16\6\u019c\13\6"+
		"\3\6\5\6\u019f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01a9\n\7\f\7\16"+
		"\7\u01ac\13\7\3\7\3\7\5\7\u01b0\n\7\5\7\u01b2\n\7\5\7\u01b4\n\7\3\b\3"+
		"\b\5\b\u01b8\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u01c9\n\13\3\f\5\f\u01cc\n\f\3\f\3\f\7\f\u01d0\n"+
		"\f\f\f\16\f\u01d3\13\f\3\f\3\f\7\f\u01d7\n\f\f\f\16\f\u01da\13\f\3\f\5"+
		"\f\u01dd\n\f\3\f\7\f\u01e0\n\f\f\f\16\f\u01e3\13\f\3\f\5\f\u01e6\n\f\3"+
		"\f\7\f\u01e9\n\f\f\f\16\f\u01ec\13\f\3\f\3\f\7\f\u01f0\n\f\f\f\16\f\u01f3"+
		"\13\f\3\f\5\f\u01f6\n\f\3\f\7\f\u01f9\n\f\f\f\16\f\u01fc\13\f\3\f\5\f"+
		"\u01ff\n\f\3\r\5\r\u0202\n\r\3\r\3\r\7\r\u0206\n\r\f\r\16\r\u0209\13\r"+
		"\3\r\3\r\7\r\u020d\n\r\f\r\16\r\u0210\13\r\3\r\5\r\u0213\n\r\3\r\7\r\u0216"+
		"\n\r\f\r\16\r\u0219\13\r\3\r\3\r\7\r\u021d\n\r\f\r\16\r\u0220\13\r\3\r"+
		"\5\r\u0223\n\r\3\r\7\r\u0226\n\r\f\r\16\r\u0229\13\r\3\r\5\r\u022c\n\r"+
		"\3\16\5\16\u022f\n\16\3\16\3\16\7\16\u0233\n\16\f\16\16\16\u0236\13\16"+
		"\3\16\3\16\7\16\u023a\n\16\f\16\16\16\u023d\13\16\3\16\5\16\u0240\n\16"+
		"\3\16\7\16\u0243\n\16\f\16\16\16\u0246\13\16\3\16\5\16\u0249\n\16\3\17"+
		"\5\17\u024c\n\17\3\17\3\17\7\17\u0250\n\17\f\17\16\17\u0253\13\17\3\17"+
		"\3\17\7\17\u0257\n\17\f\17\16\17\u025a\13\17\3\17\5\17\u025d\n\17\3\17"+
		"\7\17\u0260\n\17\f\17\16\17\u0263\13\17\3\17\3\17\7\17\u0267\n\17\f\17"+
		"\16\17\u026a\13\17\3\17\5\17\u026d\n\17\3\20\5\20\u0270\n\20\3\20\3\20"+
		"\7\20\u0274\n\20\f\20\16\20\u0277\13\20\5\20\u0279\n\20\3\20\3\20\3\21"+
		"\3\21\7\21\u027f\n\21\f\21\16\21\u0282\13\21\3\21\3\21\7\21\u0286\n\21"+
		"\f\21\16\21\u0289\13\21\3\21\3\21\7\21\u028d\n\21\f\21\16\21\u0290\13"+
		"\21\3\21\7\21\u0293\n\21\f\21\16\21\u0296\13\21\5\21\u0298\n\21\3\21\7"+
		"\21\u029b\n\21\f\21\16\21\u029e\13\21\3\21\3\21\3\22\5\22\u02a3\n\22\3"+
		"\22\5\22\u02a6\n\22\3\22\7\22\u02a9\n\22\f\22\16\22\u02ac\13\22\3\22\3"+
		"\22\7\22\u02b0\n\22\f\22\16\22\u02b3\13\22\3\22\3\22\7\22\u02b7\n\22\f"+
		"\22\16\22\u02ba\13\22\3\22\3\22\7\22\u02be\n\22\f\22\16\22\u02c1\13\22"+
		"\3\22\3\22\7\22\u02c5\n\22\f\22\16\22\u02c8\13\22\3\22\5\22\u02cb\n\22"+
		"\3\23\3\23\7\23\u02cf\n\23\f\23\16\23\u02d2\13\23\3\23\3\23\7\23\u02d6"+
		"\n\23\f\23\16\23\u02d9\13\23\3\23\7\23\u02dc\n\23\f\23\16\23\u02df\13"+
		"\23\3\24\3\24\5\24\u02e3\n\24\3\24\5\24\u02e6\n\24\3\25\3\25\7\25\u02ea"+
		"\n\25\f\25\16\25\u02ed\13\25\3\25\3\25\7\25\u02f1\n\25\f\25\16\25\u02f4"+
		"\13\25\3\25\7\25\u02f7\n\25\f\25\16\25\u02fa\13\25\3\26\5\26\u02fd\n\26"+
		"\3\26\3\26\3\27\3\27\7\27\u0303\n\27\f\27\16\27\u0306\13\27\3\27\3\27"+
		"\7\27\u030a\n\27\f\27\16\27\u030d\13\27\3\27\3\27\7\27\u0311\n\27\f\27"+
		"\16\27\u0314\13\27\3\27\7\27\u0317\n\27\f\27\16\27\u031a\13\27\3\27\7"+
		"\27\u031d\n\27\f\27\16\27\u0320\13\27\5\27\u0322\n\27\3\27\3\27\3\30\5"+
		"\30\u0327\n\30\3\30\3\30\3\31\5\31\u032c\n\31\3\31\3\31\7\31\u0330\n\31"+
		"\f\31\16\31\u0333\13\31\3\31\3\31\7\31\u0337\n\31\f\31\16\31\u033a\13"+
		"\31\3\31\3\31\7\31\u033e\n\31\f\31\16\31\u0341\13\31\3\31\5\31\u0344\n"+
		"\31\3\31\7\31\u0347\n\31\f\31\16\31\u034a\13\31\3\31\5\31\u034d\n\31\3"+
		"\32\3\32\7\32\u0351\n\32\f\32\16\32\u0354\13\32\3\32\3\32\3\33\3\33\7"+
		"\33\u035a\n\33\f\33\16\33\u035d\13\33\3\33\7\33\u0360\n\33\f\33\16\33"+
		"\u0363\13\33\3\33\7\33\u0366\n\33\f\33\16\33\u0369\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0372\n\34\3\34\6\34\u0375\n\34\r\34\16\34\u0376"+
		"\3\35\3\35\7\35\u037b\n\35\f\35\16\35\u037e\13\35\3\35\3\35\3\36\3\36"+
		"\7\36\u0384\n\36\f\36\16\36\u0387\13\36\3\36\3\36\3\37\5\37\u038c\n\37"+
		"\3\37\3\37\7\37\u0390\n\37\f\37\16\37\u0393\13\37\3\37\5\37\u0396\n\37"+
		"\3 \3 \7 \u039a\n \f \16 \u039d\13 \3 \3 \7 \u03a1\n \f \16 \u03a4\13"+
		" \3 \3 \7 \u03a8\n \f \16 \u03ab\13 \3 \7 \u03ae\n \f \16 \u03b1\13 \3"+
		" \3 \3!\5!\u03b6\n!\3!\3!\5!\u03ba\n!\3\"\3\"\7\"\u03be\n\"\f\"\16\"\u03c1"+
		"\13\"\6\"\u03c3\n\"\r\"\16\"\u03c4\3#\3#\5#\u03c9\n#\3$\3$\7$\u03cd\n"+
		"$\f$\16$\u03d0\13$\3$\3$\7$\u03d4\n$\f$\16$\u03d7\13$\3$\3$\7$\u03db\n"+
		"$\f$\16$\u03de\13$\3$\7$\u03e1\n$\f$\16$\u03e4\13$\3$\7$\u03e7\n$\f$\16"+
		"$\u03ea\13$\3$\3$\3%\5%\u03ef\n%\3%\3%\7%\u03f3\n%\f%\16%\u03f6\13%\3"+
		"%\3%\7%\u03fa\n%\f%\16%\u03fd\13%\3%\3%\7%\u0401\n%\f%\16%\u0404\13%\3"+
		"%\3%\7%\u0408\n%\f%\16%\u040b\13%\3%\7%\u040e\n%\f%\16%\u0411\13%\5%\u0413"+
		"\n%\3&\3&\7&\u0417\n&\f&\16&\u041a\13&\6&\u041c\n&\r&\16&\u041d\3\'\3"+
		"\'\3\'\5\'\u0423\n\'\3\'\7\'\u0426\n\'\f\'\16\'\u0429\13\'\3(\3(\3)\3"+
		")\3*\5*\u0430\n*\3*\3*\3*\3*\3*\3*\5*\u0438\n*\5*\u043a\n*\3+\3+\7+\u043e"+
		"\n+\f+\16+\u0441\13+\3+\3+\7+\u0445\n+\f+\16+\u0448\13+\3+\3+\3,\3,\3"+
		",\5,\u044f\n,\3-\3-\7-\u0453\n-\f-\16-\u0456\13-\3-\3-\7-\u045a\n-\f-"+
		"\16-\u045d\13-\3-\3-\7-\u0461\n-\f-\16-\u0464\13-\3-\7-\u0467\n-\f-\16"+
		"-\u046a\13-\5-\u046c\n-\3-\7-\u046f\n-\f-\16-\u0472\13-\3-\3-\3.\3.\7"+
		".\u0478\n.\f.\16.\u047b\13.\3.\3.\7.\u047f\n.\f.\16.\u0482\13.\3.\3.\3"+
		"/\3/\7/\u0488\n/\f/\16/\u048b\13/\3/\3/\7/\u048f\n/\f/\16/\u0492\13/\3"+
		"/\3/\3\60\3\60\5\60\u0498\n\60\3\60\3\60\5\60\u049c\n\60\3\60\3\60\3\61"+
		"\5\61\u04a1\n\61\3\61\3\61\7\61\u04a5\n\61\f\61\16\61\u04a8\13\61\3\61"+
		"\3\61\7\61\u04ac\n\61\f\61\16\61\u04af\13\61\3\61\3\61\7\61\u04b3\n\61"+
		"\f\61\16\61\u04b6\13\61\3\61\5\61\u04b9\n\61\3\61\7\61\u04bc\n\61\f\61"+
		"\16\61\u04bf\13\61\3\61\5\61\u04c2\n\61\3\62\3\62\7\62\u04c6\n\62\f\62"+
		"\16\62\u04c9\13\62\3\62\7\62\u04cc\n\62\f\62\16\62\u04cf\13\62\3\62\7"+
		"\62\u04d2\n\62\f\62\16\62\u04d5\13\62\3\62\3\62\3\63\3\63\3\63\5\63\u04dc"+
		"\n\63\3\63\6\63\u04df\n\63\r\63\16\63\u04e0\3\64\5\64\u04e4\n\64\3\64"+
		"\3\64\7\64\u04e8\n\64\f\64\16\64\u04eb\13\64\3\64\3\64\7\64\u04ef\n\64"+
		"\f\64\16\64\u04f2\13\64\3\64\5\64\u04f5\n\64\3\64\7\64\u04f8\n\64\f\64"+
		"\16\64\u04fb\13\64\3\64\3\64\3\65\3\65\7\65\u0501\n\65\f\65\16\65\u0504"+
		"\13\65\3\65\5\65\u0507\n\65\3\65\7\65\u050a\n\65\f\65\16\65\u050d\13\65"+
		"\3\65\3\65\7\65\u0511\n\65\f\65\16\65\u0514\13\65\3\65\7\65\u0517\n\65"+
		"\f\65\16\65\u051a\13\65\5\65\u051c\n\65\3\65\7\65\u051f\n\65\f\65\16\65"+
		"\u0522\13\65\3\65\3\65\3\66\3\66\7\66\u0528\n\66\f\66\16\66\u052b\13\66"+
		"\3\66\3\66\7\66\u052f\n\66\f\66\16\66\u0532\13\66\3\66\7\66\u0535\n\66"+
		"\f\66\16\66\u0538\13\66\3\67\5\67\u053b\n\67\3\67\3\67\7\67\u053f\n\67"+
		"\f\67\16\67\u0542\13\67\3\67\5\67\u0545\n\67\3\67\7\67\u0548\n\67\f\67"+
		"\16\67\u054b\13\67\3\67\5\67\u054e\n\67\38\58\u0551\n8\38\38\78\u0555"+
		"\n8\f8\168\u0558\138\38\58\u055b\n8\38\78\u055e\n8\f8\168\u0561\138\3"+
		"8\38\78\u0565\n8\f8\168\u0568\138\38\58\u056b\n8\39\39\79\u056f\n9\f9"+
		"\169\u0572\139\39\79\u0575\n9\f9\169\u0578\139\39\79\u057b\n9\f9\169\u057e"+
		"\139\39\39\3:\3:\6:\u0584\n:\r:\16:\u0585\3;\5;\u0589\n;\3;\3;\7;\u058d"+
		"\n;\f;\16;\u0590\13;\3;\3;\7;\u0594\n;\f;\16;\u0597\13;\3;\3;\7;\u059b"+
		"\n;\f;\16;\u059e\13;\3;\5;\u05a1\n;\3;\7;\u05a4\n;\f;\16;\u05a7\13;\3"+
		";\5;\u05aa\n;\3<\5<\u05ad\n<\3<\3<\7<\u05b1\n<\f<\16<\u05b4\13<\3<\3<"+
		"\7<\u05b8\n<\f<\16<\u05bb\13<\3<\5<\u05be\n<\3=\3=\7=\u05c2\n=\f=\16="+
		"\u05c5\13=\3=\3=\7=\u05c9\n=\f=\16=\u05cc\13=\3=\5=\u05cf\n=\3=\3=\7="+
		"\u05d3\n=\f=\16=\u05d6\13=\3=\5=\u05d9\n=\5=\u05db\n=\3=\7=\u05de\n=\f"+
		"=\16=\u05e1\13=\3=\3=\3>\5>\u05e6\n>\3>\3>\7>\u05ea\n>\f>\16>\u05ed\13"+
		">\3>\3>\7>\u05f1\n>\f>\16>\u05f4\13>\3>\5>\u05f7\n>\3>\7>\u05fa\n>\f>"+
		"\16>\u05fd\13>\3>\3>\7>\u0601\n>\f>\16>\u0604\13>\3>\5>\u0607\n>\3>\7"+
		">\u060a\n>\f>\16>\u060d\13>\3>\5>\u0610\n>\3?\5?\u0613\n?\3?\3?\7?\u0617"+
		"\n?\f?\16?\u061a\13?\3?\3?\7?\u061e\n?\f?\16?\u0621\13?\3?\3?\7?\u0625"+
		"\n?\f?\16?\u0628\13?\3?\3?\5?\u062c\n?\3?\7?\u062f\n?\f?\16?\u0632\13"+
		"?\3?\3?\7?\u0636\n?\f?\16?\u0639\13?\3?\5?\u063c\n?\3?\7?\u063f\n?\f?"+
		"\16?\u0642\13?\3?\5?\u0645\n?\3@\5@\u0648\n@\3@\3@\7@\u064c\n@\f@\16@"+
		"\u064f\13@\3@\3@\7@\u0653\n@\f@\16@\u0656\13@\3@\5@\u0659\n@\3A\3A\7A"+
		"\u065d\nA\fA\16A\u0660\13A\3A\3A\7A\u0664\nA\fA\16A\u0667\13A\3A\5A\u066a"+
		"\nA\3B\5B\u066d\nB\3B\3B\7B\u0671\nB\fB\16B\u0674\13B\3B\5B\u0677\nB\3"+
		"B\7B\u067a\nB\fB\16B\u067d\13B\3B\3B\7B\u0681\nB\fB\16B\u0684\13B\3B\3"+
		"B\7B\u0688\nB\fB\16B\u068b\13B\3B\3B\7B\u068f\nB\fB\16B\u0692\13B\3B\5"+
		"B\u0695\nB\3B\7B\u0698\nB\fB\16B\u069b\13B\3B\5B\u069e\nB\3C\3C\7C\u06a2"+
		"\nC\fC\16C\u06a5\13C\3C\3C\7C\u06a9\nC\fC\16C\u06ac\13C\3C\3C\7C\u06b0"+
		"\nC\fC\16C\u06b3\13C\3C\7C\u06b6\nC\fC\16C\u06b9\13C\5C\u06bb\nC\3C\7"+
		"C\u06be\nC\fC\16C\u06c1\13C\3C\3C\3D\5D\u06c6\nD\3D\3D\7D\u06ca\nD\fD"+
		"\16D\u06cd\13D\3D\3D\7D\u06d1\nD\fD\16D\u06d4\13D\3D\5D\u06d7\nD\3E\3"+
		"E\7E\u06db\nE\fE\16E\u06de\13E\3E\3E\7E\u06e2\nE\fE\16E\u06e5\13E\3E\3"+
		"E\3F\3F\3F\7F\u06ec\nF\fF\16F\u06ef\13F\3F\5F\u06f2\nF\3G\3G\7G\u06f6"+
		"\nG\fG\16G\u06f9\13G\3G\3G\7G\u06fd\nG\fG\16G\u0700\13G\3G\3G\3H\3H\6"+
		"H\u0706\nH\rH\16H\u0707\3H\3H\7H\u070c\nH\fH\16H\u070f\13H\5H\u0711\n"+
		"H\3H\7H\u0714\nH\fH\16H\u0717\13H\3I\5I\u071a\nI\3I\7I\u071d\nI\fI\16"+
		"I\u0720\13I\3I\3I\3I\3I\5I\u0726\nI\3J\5J\u0729\nJ\3J\3J\7J\u072d\nJ\f"+
		"J\16J\u0730\13J\3J\3J\7J\u0734\nJ\fJ\16J\u0737\13J\3J\3J\7J\u073b\nJ\f"+
		"J\16J\u073e\13J\3J\5J\u0741\nJ\3K\3K\3K\5K\u0746\nK\3L\3L\7L\u074a\nL"+
		"\fL\16L\u074d\13L\3L\3L\7L\u0751\nL\fL\16L\u0754\13L\3L\5L\u0757\nL\3"+
		"L\3L\7L\u075b\nL\fL\16L\u075e\13L\3L\3L\7L\u0762\nL\fL\16L\u0765\13L\3"+
		"L\3L\7L\u0769\nL\fL\16L\u076c\13L\3L\3L\7L\u0770\nL\fL\16L\u0773\13L\3"+
		"L\3L\3M\3M\7M\u0779\nM\fM\16M\u077c\13M\3M\3M\7M\u0780\nM\fM\16M\u0783"+
		"\13M\3M\3M\7M\u0787\nM\fM\16M\u078a\13M\3M\3M\7M\u078e\nM\fM\16M\u0791"+
		"\13M\3M\3M\3N\3N\7N\u0797\nN\fN\16N\u079a\13N\3N\3N\7N\u079e\nN\fN\16"+
		"N\u07a1\13N\3N\3N\7N\u07a5\nN\fN\16N\u07a8\13N\3N\3N\7N\u07ac\nN\fN\16"+
		"N\u07af\13N\3N\3N\7N\u07b3\nN\fN\16N\u07b6\13N\3N\3N\3O\3O\7O\u07bc\n"+
		"O\fO\16O\u07bf\13O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\7Q\u07ca\nQ\fQ\16Q\u07cd"+
		"\13Q\3R\3R\3R\3R\7R\u07d3\nR\fR\16R\u07d6\13R\3S\3S\3S\3S\7S\u07dc\nS"+
		"\fS\16S\u07df\13S\3T\3T\3T\3T\7T\u07e5\nT\fT\16T\u07e8\13T\3U\3U\3U\3"+
		"U\7U\u07ee\nU\fU\16U\u07f1\13U\3V\3V\7V\u07f5\nV\fV\16V\u07f8\13V\3W\3"+
		"W\3W\3W\3W\3W\5W\u0800\nW\3X\3X\3X\3X\7X\u0806\nX\fX\16X\u0809\13X\3Y"+
		"\3Y\3Y\3Y\7Y\u080f\nY\fY\16Y\u0812\13Y\3Z\3Z\3Z\3Z\5Z\u0818\nZ\3[\3[\3"+
		"[\3[\7[\u081e\n[\f[\16[\u0821\13[\3\\\3\\\3\\\3\\\7\\\u0827\n\\\f\\\16"+
		"\\\u082a\13\\\3]\3]\3]\3]\7]\u0830\n]\f]\16]\u0833\13]\3^\3^\3^\3^\7^"+
		"\u0839\n^\f^\16^\u083c\13^\3_\3_\3_\3_\7_\u0842\n_\f_\16_\u0845\13_\3"+
		"`\7`\u0848\n`\f`\16`\u084b\13`\3`\3`\3a\3a\7a\u0851\na\fa\16a\u0854\13"+
		"a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0863\nb\3c\3c\3c\3c\3d\3"+
		"d\3d\3e\5e\u086d\ne\3e\3e\7e\u0871\ne\fe\16e\u0874\13e\3e\3e\3f\3f\7f"+
		"\u087a\nf\ff\16f\u087d\13f\3f\5f\u0880\nf\3f\7f\u0883\nf\ff\16f\u0886"+
		"\13f\3f\3f\7f\u088a\nf\ff\16f\u088d\13f\3f\7f\u0890\nf\ff\16f\u0893\13"+
		"f\3f\7f\u0896\nf\ff\16f\u0899\13f\3f\3f\3g\3g\3h\3h\3i\3i\5i\u08a3\ni"+
		"\3j\3j\7j\u08a7\nj\fj\16j\u08aa\13j\3j\3j\7j\u08ae\nj\fj\16j\u08b1\13"+
		"j\3j\3j\7j\u08b5\nj\fj\16j\u08b8\13j\3j\3j\7j\u08bc\nj\fj\16j\u08bf\13"+
		"j\3j\3j\7j\u08c3\nj\fj\16j\u08c6\13j\3j\7j\u08c9\nj\fj\16j\u08cc\13j\3"+
		"j\7j\u08cf\nj\fj\16j\u08d2\13j\3j\3j\7j\u08d6\nj\fj\16j\u08d9\13j\3j\5"+
		"j\u08dc\nj\3k\3k\7k\u08e0\nk\fk\16k\u08e3\13k\3k\3k\7k\u08e7\nk\fk\16"+
		"k\u08ea\13k\3k\3k\7k\u08ee\nk\fk\16k\u08f1\13k\3k\3k\7k\u08f5\nk\fk\16"+
		"k\u08f8\13k\3k\3k\3l\3l\7l\u08fe\nl\fl\16l\u0901\13l\3l\3l\7l\u0905\n"+
		"l\fl\16l\u0908\13l\3l\3l\7l\u090c\nl\fl\16l\u090f\13l\3l\3l\7l\u0913\n"+
		"l\fl\16l\u0916\13l\3l\3l\7l\u091a\nl\fl\16l\u091d\13l\3l\6l\u0920\nl\r"+
		"l\16l\u0921\3l\7l\u0925\nl\fl\16l\u0928\13l\3l\3l\3m\3m\7m\u092e\nm\f"+
		"m\16m\u0931\13m\3m\3m\7m\u0935\nm\fm\16m\u0938\13m\3m\3m\7m\u093c\nm\f"+
		"m\16m\u093f\13m\3m\7m\u0942\nm\fm\16m\u0945\13m\3m\7m\u0948\nm\fm\16m"+
		"\u094b\13m\3m\3m\7m\u094f\nm\fm\16m\u0952\13m\3m\3m\5m\u0956\nm\3m\3m"+
		"\7m\u095a\nm\fm\16m\u095d\13m\3m\3m\7m\u0961\nm\fm\16m\u0964\13m\3m\5"+
		"m\u0967\nm\3n\3n\7n\u096b\nn\fn\16n\u096e\13n\3n\3n\5n\u0972\nn\3o\3o"+
		"\7o\u0976\no\fo\16o\u0979\13o\3o\3o\7o\u097d\no\fo\16o\u0980\13o\3o\7"+
		"o\u0983\no\fo\16o\u0986\13o\3o\7o\u0989\no\fo\16o\u098c\13o\3o\5o\u098f"+
		"\no\3p\3p\7p\u0993\np\fp\16p\u0996\13p\3p\3p\7p\u099a\np\fp\16p\u099d"+
		"\13p\3p\5p\u09a0\np\3p\3p\7p\u09a4\np\fp\16p\u09a7\13p\3p\3p\7p\u09ab"+
		"\np\fp\16p\u09ae\13p\3p\3p\7p\u09b2\np\fp\16p\u09b5\13p\3p\3p\7p\u09b9"+
		"\np\fp\16p\u09bc\13p\3p\7p\u09bf\np\fp\16p\u09c2\13p\3p\7p\u09c5\np\f"+
		"p\16p\u09c8\13p\3p\3p\7p\u09cc\np\fp\16p\u09cf\13p\3p\3p\3q\3q\7q\u09d5"+
		"\nq\fq\16q\u09d8\13q\3q\3q\3r\3r\3r\3r\5r\u09e0\nr\3s\3s\7s\u09e4\ns\f"+
		"s\16s\u09e7\13s\3s\3s\3t\3t\7t\u09ed\nt\ft\16t\u09f0\13t\3t\5t\u09f3\n"+
		"t\3u\3u\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u0a05\nw\3x\3x\3"+
		"y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u0a1f\n\u0083\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u0a24\n\u0084\f\u0084\16\u0084\u0a27\13\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0a30"+
		"\n\u0085\f\u0085\16\u0085\u0a33\13\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\7\u008a\u0a45\n\u008a\f\u008a\16\u008a\u0a48"+
		"\13\u008a\3\u008a\5\u008a\u0a4b\n\u008a\3\u008a\7\u008a\u0a4e\n\u008a"+
		"\f\u008a\16\u008a\u0a51\13\u008a\3\u008a\3\u008a\7\u008a\u0a55\n\u008a"+
		"\f\u008a\16\u008a\u0a58\13\u008a\5\u008a\u0a5a\n\u008a\3\u008a\3\u008a"+
		"\7\u008a\u0a5e\n\u008a\f\u008a\16\u008a\u0a61\13\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\7\u008b\u0a67\n\u008b\f\u008b\16\u008b\u0a6a\13\u008b"+
		"\3\u008b\3\u008b\7\u008b\u0a6e\n\u008b\f\u008b\16\u008b\u0a71\13\u008b"+
		"\3\u008b\7\u008b\u0a74\n\u008b\f\u008b\16\u008b\u0a77\13\u008b\3\u008c"+
		"\3\u008c\7\u008c\u0a7b\n\u008c\f\u008c\16\u008c\u0a7e\13\u008c\3\u008c"+
		"\3\u008c\7\u008c\u0a82\n\u008c\f\u008c\16\u008c\u0a85\13\u008c\3\u008c"+
		"\5\u008c\u0a88\n\u008c\3\u008d\7\u008d\u0a8b\n\u008d\f\u008d\16\u008d"+
		"\u0a8e\13\u008d\3\u008d\3\u008d\7\u008d\u0a92\n\u008d\f\u008d\16\u008d"+
		"\u0a95\13\u008d\3\u008e\7\u008e\u0a98\n\u008e\f\u008e\16\u008e\u0a9b\13"+
		"\u008e\3\u008e\3\u008e\7\u008e\u0a9f\n\u008e\f\u008e\16\u008e\u0aa2\13"+
		"\u008e\3\u008f\7\u008f\u0aa5\n\u008f\f\u008f\16\u008f\u0aa8\13\u008f\3"+
		"\u008f\3\u008f\7\u008f\u0aac\n\u008f\f\u008f\16\u008f\u0aaf\13\u008f\3"+
		"\u0090\7\u0090\u0ab2\n\u0090\f\u0090\16\u0090\u0ab5\13\u0090\3\u0090\3"+
		"\u0090\7\u0090\u0ab9\n\u0090\f\u0090\16\u0090\u0abc\13\u0090\3\u0091\7"+
		"\u0091\u0abf\n\u0091\f\u0091\16\u0091\u0ac2\13\u0091\3\u0091\3\u0091\7"+
		"\u0091\u0ac6\n\u0091\f\u0091\16\u0091\u0ac9\13\u0091\3\u0092\7\u0092\u0acc"+
		"\n\u0092\f\u0092\16\u0092\u0acf\13\u0092\3\u0092\3\u0092\7\u0092\u0ad3"+
		"\n\u0092\f\u0092\16\u0092\u0ad6\13\u0092\3\u0093\7\u0093\u0ad9\n\u0093"+
		"\f\u0093\16\u0093\u0adc\13\u0093\3\u0093\3\u0093\7\u0093\u0ae0\n\u0093"+
		"\f\u0093\16\u0093\u0ae3\13\u0093\3\u0094\7\u0094\u0ae6\n\u0094\f\u0094"+
		"\16\u0094\u0ae9\13\u0094\3\u0094\3\u0094\7\u0094\u0aed\n\u0094\f\u0094"+
		"\16\u0094\u0af0\13\u0094\3\u0095\7\u0095\u0af3\n\u0095\f\u0095\16\u0095"+
		"\u0af6\13\u0095\3\u0095\3\u0095\7\u0095\u0afa\n\u0095\f\u0095\16\u0095"+
		"\u0afd\13\u0095\3\u0096\7\u0096\u0b00\n\u0096\f\u0096\16\u0096\u0b03\13"+
		"\u0096\3\u0096\3\u0096\7\u0096\u0b07\n\u0096\f\u0096\16\u0096\u0b0a\13"+
		"\u0096\3\u0097\7\u0097\u0b0d\n\u0097\f\u0097\16\u0097\u0b10\13\u0097\3"+
		"\u0097\3\u0097\7\u0097\u0b14\n\u0097\f\u0097\16\u0097\u0b17\13\u0097\3"+
		"\u0098\7\u0098\u0b1a\n\u0098\f\u0098\16\u0098\u0b1d\13\u0098\3\u0098\3"+
		"\u0098\7\u0098\u0b21\n\u0098\f\u0098\16\u0098\u0b24\13\u0098\3\u0099\7"+
		"\u0099\u0b27\n\u0099\f\u0099\16\u0099\u0b2a\13\u0099\3\u0099\3\u0099\7"+
		"\u0099\u0b2e\n\u0099\f\u0099\16\u0099\u0b31\13\u0099\3\u009a\7\u009a\u0b34"+
		"\n\u009a\f\u009a\16\u009a\u0b37\13\u009a\3\u009a\3\u009a\7\u009a\u0b3b"+
		"\n\u009a\f\u009a\16\u009a\u0b3e\13\u009a\3\u009b\7\u009b\u0b41\n\u009b"+
		"\f\u009b\16\u009b\u0b44\13\u009b\3\u009b\3\u009b\7\u009b\u0b48\n\u009b"+
		"\f\u009b\16\u009b\u0b4b\13\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\5\u009d\u0b54\n\u009d\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\6\u009f\u0b5a\n\u009f\r\u009f\16\u009f\u0b5b\3\u009f\5\u009f\u0b5f\n"+
		"\u009f\3\u00a0\3\u00a0\7\u00a0\u0b63\n\u00a0\f\u00a0\16\u00a0\u0b66\13"+
		"\u00a0\3\u00a0\3\u00a0\7\u00a0\u0b6a\n\u00a0\f\u00a0\16\u00a0\u0b6d\13"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1\u0b73\n\u00a1\3\u00a2\5"+
		"\u00a2\u0b76\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0b7a\n\u00a2\3\u00a3\5\u00a3"+
		"\u0b7d\n\u00a3\3\u00a3\3\u00a3\3\u00a4\5\u00a4\u0b82\n\u00a4\3\u00a4\7"+
		"\u00a4\u0b85\n\u00a4\f\u00a4\16\u00a4\u0b88\13\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\7\u00a5\u0b8e\n\u00a5\f\u00a5\16\u00a5\u0b91\13\u00a5\3"+
		"\u00a5\3\u00a5\7\u00a5\u0b95\n\u00a5\f\u00a5\16\u00a5\u0b98\13\u00a5\3"+
		"\u00a5\3\u00a5\7\u00a5\u0b9c\n\u00a5\f\u00a5\16\u00a5\u0b9f\13\u00a5\3"+
		"\u00a5\7\u00a5\u0ba2\n\u00a5\f\u00a5\16\u00a5\u0ba5\13\u00a5\3\u00a5\7"+
		"\u00a5\u0ba8\n\u00a5\f\u00a5\16\u00a5\u0bab\13\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a7\7\u00a7\u0bb3\n\u00a7\f\u00a7\16\u00a7"+
		"\u0bb6\13\u00a7\3\u00a7\3\u00a7\7\u00a7\u0bba\n\u00a7\f\u00a7\16\u00a7"+
		"\u0bbd\13\u00a7\3\u00a8\3\u00a8\7\u00a8\u0bc1\n\u00a8\f\u00a8\16\u00a8"+
		"\u0bc4\13\u00a8\3\u00a8\3\u00a8\7\u00a8\u0bc8\n\u00a8\f\u00a8\16\u00a8"+
		"\u0bcb\13\u00a8\6\u00a8\u0bcd\n\u00a8\r\u00a8\16\u00a8\u0bce\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\5\u00a9\u0bd5\n\u00a9\3\u00aa\3\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\7\u00ae\u0be1\n"+
		"\u00ae\f\u00ae\16\u00ae\u0be4\13\u00ae\6\u00ae\u0be6\n\u00ae\r\u00ae\16"+
		"\u00ae\u0be7\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0bee\n\u00af\f\u00af"+
		"\16\u00af\u0bf1\13\u00af\3\u00af\6\u00af\u0bf4\n\u00af\r\u00af\16\u00af"+
		"\u0bf5\3\u00af\7\u00af\u0bf9\n\u00af\f\u00af\16\u00af\u0bfc\13\u00af\3"+
		"\u00af\3\u00af\5\u00af\u0c00\n\u00af\3\u00b0\3\u00b0\5\u00b0\u0c04\n\u00b0"+
		"\3\u00b1\3\u00b1\7\u00b1\u0c08\n\u00b1\f\u00b1\16\u00b1\u0c0b\13\u00b1"+
		"\3\u00b1\3\u00b1\7\u00b1\u0c0f\n\u00b1\f\u00b1\16\u00b1\u0c12\13\u00b1"+
		"\3\u00b1\7\u00b1\u0c15\n\u00b1\f\u00b1\16\u00b1\u0c18\13\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b3\6\u00b3\u0c1d\n\u00b3\r\u00b3\16\u00b3\u0c1e\3\u00b3"+
		"\7\u00b3\u0c22\n\u00b3\f\u00b3\16\u00b3\u0c25\13\u00b3\3\u00b3\3\u00b3"+
		"\7\u00b3\u0c29\n\u00b3\f\u00b3\16\u00b3\u0c2c\13\u00b3\5\u00b3\u0c2e\n"+
		"\u00b3\3\u00b3\2\2\u00b4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\2\34\3\2 !\3\2\22\23\3\2\23\24\3\2\36!\3\2)+"+
		"\3\2./\3\2EF\3\2EG\3\2\u00a0\u00a2\3\2\u00a6\u00a8\r\2OPRRUUXXZZ\\\\^"+
		"^``bbddvv\3\2wx\3\2yz\3\2{\u0082\3\2>?\3\2<=\3\2hj\4\2QQTT\5\2WWYY[[\3"+
		"\2:;\7\2QQSTVVoott\5\2SSVVpp\4\2fgmm\3\2\30\33\3\2\"%\3\2&(\2\u0d72\2"+
		"\u0169\3\2\2\2\4\u0186\3\2\2\2\6\u018a\3\2\2\2\b\u0191\3\2\2\2\n\u0194"+
		"\3\2\2\2\f\u01b3\3\2\2\2\16\u01b5\3\2\2\2\20\u01b9\3\2\2\2\22\u01bc\3"+
		"\2\2\2\24\u01c8\3\2\2\2\26\u01cb\3\2\2\2\30\u0201\3\2\2\2\32\u022e\3\2"+
		"\2\2\34\u024b\3\2\2\2\36\u0278\3\2\2\2 \u027c\3\2\2\2\"\u02a2\3\2\2\2"+
		"$\u02cc\3\2\2\2&\u02e0\3\2\2\2(\u02e7\3\2\2\2*\u02fc\3\2\2\2,\u0300\3"+
		"\2\2\2.\u0326\3\2\2\2\60\u032b\3\2\2\2\62\u034e\3\2\2\2\64\u0357\3\2\2"+
		"\2\66\u0371\3\2\2\28\u0378\3\2\2\2:\u0381\3\2\2\2<\u038b\3\2\2\2>\u0397"+
		"\3\2\2\2@\u03b9\3\2\2\2B\u03c2\3\2\2\2D\u03c8\3\2\2\2F\u03ca\3\2\2\2H"+
		"\u03ee\3\2\2\2J\u041b\3\2\2\2L\u0422\3\2\2\2N\u042a\3\2\2\2P\u042c\3\2"+
		"\2\2R\u042f\3\2\2\2T\u043b\3\2\2\2V\u044e\3\2\2\2X\u0450\3\2\2\2Z\u0475"+
		"\3\2\2\2\\\u0485\3\2\2\2^\u049b\3\2\2\2`\u04a0\3\2\2\2b\u04c3\3\2\2\2"+
		"d\u04db\3\2\2\2f\u04e3\3\2\2\2h\u04fe\3\2\2\2j\u0525\3\2\2\2l\u053a\3"+
		"\2\2\2n\u0550\3\2\2\2p\u056c\3\2\2\2r\u0581\3\2\2\2t\u0588\3\2\2\2v\u05ac"+
		"\3\2\2\2x\u05bf\3\2\2\2z\u05e5\3\2\2\2|\u0612\3\2\2\2~\u0647\3\2\2\2\u0080"+
		"\u065a\3\2\2\2\u0082\u066c\3\2\2\2\u0084\u069f\3\2\2\2\u0086\u06c5\3\2"+
		"\2\2\u0088\u06d8\3\2\2\2\u008a\u06f1\3\2\2\2\u008c\u06f3\3\2\2\2\u008e"+
		"\u0710\3\2\2\2\u0090\u0719\3\2\2\2\u0092\u0728\3\2\2\2\u0094\u0745\3\2"+
		"\2\2\u0096\u0747\3\2\2\2\u0098\u0776\3\2\2\2\u009a\u0794\3\2\2\2\u009c"+
		"\u07b9\3\2\2\2\u009e\u07c3\3\2\2\2\u00a0\u07c5\3\2\2\2\u00a2\u07ce\3\2"+
		"\2\2\u00a4\u07d7\3\2\2\2\u00a6\u07e0\3\2\2\2\u00a8\u07e9\3\2\2\2\u00aa"+
		"\u07f2\3\2\2\2\u00ac\u07ff\3\2\2\2\u00ae\u0801\3\2\2\2\u00b0\u080a\3\2"+
		"\2\2\u00b2\u0813\3\2\2\2\u00b4\u0819\3\2\2\2\u00b6\u0822\3\2\2\2\u00b8"+
		"\u082b\3\2\2\2\u00ba\u0834\3\2\2\2\u00bc\u083d\3\2\2\2\u00be\u0849\3\2"+
		"\2\2\u00c0\u084e\3\2\2\2\u00c2\u0862\3\2\2\2\u00c4\u0864\3\2\2\2\u00c6"+
		"\u0868\3\2\2\2\u00c8\u086c\3\2\2\2\u00ca\u0877\3\2\2\2\u00cc\u089c\3\2"+
		"\2\2\u00ce\u089e\3\2\2\2\u00d0\u08a2\3\2\2\2\u00d2\u08a4\3\2\2\2\u00d4"+
		"\u08dd\3\2\2\2\u00d6\u08fb\3\2\2\2\u00d8\u0966\3\2\2\2\u00da\u0968\3\2"+
		"\2\2\u00dc\u0973\3\2\2\2\u00de\u0990\3\2\2\2\u00e0\u09d2\3\2\2\2\u00e2"+
		"\u09df\3\2\2\2\u00e4\u09e1\3\2\2\2\u00e6\u09ea\3\2\2\2\u00e8\u09f4\3\2"+
		"\2\2\u00ea\u09f6\3\2\2\2\u00ec\u0a04\3\2\2\2\u00ee\u0a06\3\2\2\2\u00f0"+
		"\u0a08\3\2\2\2\u00f2\u0a0a\3\2\2\2\u00f4\u0a0c\3\2\2\2\u00f6\u0a0e\3\2"+
		"\2\2\u00f8\u0a10\3\2\2\2\u00fa\u0a12\3\2\2\2\u00fc\u0a14\3\2\2\2\u00fe"+
		"\u0a16\3\2\2\2\u0100\u0a18\3\2\2\2\u0102\u0a1a\3\2\2\2\u0104\u0a1e\3\2"+
		"\2\2\u0106\u0a20\3\2\2\2\u0108\u0a2a\3\2\2\2\u010a\u0a36\3\2\2\2\u010c"+
		"\u0a38\3\2\2\2\u010e\u0a3c\3\2\2\2\u0110\u0a3e\3\2\2\2\u0112\u0a42\3\2"+
		"\2\2\u0114\u0a64\3\2\2\2\u0116\u0a78\3\2\2\2\u0118\u0a8c\3\2\2\2\u011a"+
		"\u0a99\3\2\2\2\u011c\u0aa6\3\2\2\2\u011e\u0ab3\3\2\2\2\u0120\u0ac0\3\2"+
		"\2\2\u0122\u0acd\3\2\2\2\u0124\u0ada\3\2\2\2\u0126\u0ae7\3\2\2\2\u0128"+
		"\u0af4\3\2\2\2\u012a\u0b01\3\2\2\2\u012c\u0b0e\3\2\2\2\u012e\u0b1b\3\2"+
		"\2\2\u0130\u0b28\3\2\2\2\u0132\u0b35\3\2\2\2\u0134\u0b42\3\2\2\2\u0136"+
		"\u0b4c\3\2\2\2\u0138\u0b53\3\2\2\2\u013a\u0b55\3\2\2\2\u013c\u0b5e\3\2"+
		"\2\2\u013e\u0b60\3\2\2\2\u0140\u0b72\3\2\2\2\u0142\u0b75\3\2\2\2\u0144"+
		"\u0b7c\3\2\2\2\u0146\u0b81\3\2\2\2\u0148\u0b8b\3\2\2\2\u014a\u0bae\3\2"+
		"\2\2\u014c\u0bb4\3\2\2\2\u014e\u0bcc\3\2\2\2\u0150\u0bd4\3\2\2\2\u0152"+
		"\u0bd6\3\2\2\2\u0154\u0bd8\3\2\2\2\u0156\u0bda\3\2\2\2\u0158\u0bdc\3\2"+
		"\2\2\u015a\u0be5\3\2\2\2\u015c\u0be9\3\2\2\2\u015e\u0c01\3\2\2\2\u0160"+
		"\u0c05\3\2\2\2\u0162\u0c19\3\2\2\2\u0164\u0c2d\3\2\2\2\u0166\u0168\7\7"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170\5\4"+
		"\3\2\u016d\u016f\7\7\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0181\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u017e\5\24\13\2\u0174\u0176\5\u0164\u00b3\2\u0175\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u017b\5\24\13\2\u017a\u0179\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017b\u017d\3\2\2\2\u017c\u0175\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0173\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\7\2\2\3\u0184\3\3\2\2\2\u0185\u0187\5\6\4\2\u0186\u0185\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5\b\5\2\u0189\5\3"+
		"\2\2\2\u018a\u018c\5\u0160\u00b1\2\u018b\u018d\5\u0164\u00b3\2\u018c\u018b"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\7\3\2\2\2\u018e\u0190\5\n\6\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\t\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\b\2\2\u0195\u019a"+
		"\5\f\7\2\u0196\u0197\7e\2\2\u0197\u0199\5\f\7\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u019f\5\u0164\u00b3\2\u019e\u019d\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\13\3\2\2\2\u01a0\u01b4\5\20\t\2\u01a1\u01b1"+
		"\5\u0160\u00b1\2\u01a2\u01af\7f\2\2\u01a3\u01b0\7W\2\2\u01a4\u01a5\7K"+
		"\2\2\u01a5\u01aa\5\16\b\2\u01a6\u01a7\7e\2\2\u01a7\u01a9\5\16\b\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7L\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a4\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01a2\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01a0\3\2\2\2\u01b3\u01a1\3\2\2\2\u01b4\r\3\2\2\2\u01b5\u01b7\5\u0162"+
		"\u00b2\2\u01b6\u01b8\5\22\n\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2"+
		"\u01b8\17\3\2\2\2\u01b9\u01ba\5\u0160\u00b1\2\u01ba\u01bb\5\22\n\2\u01bb"+
		"\21\3\2\2\2\u01bc\u01bd\7\t\2\2\u01bd\u01be\5\u0162\u00b2\2\u01be\23\3"+
		"\2\2\2\u01bf\u01c9\5\26\f\2\u01c0\u01c9\5\30\r\2\u01c1\u01c9\5\32\16\2"+
		"\u01c2\u01c9\5\34\17\2\u01c3\u01c9\5`\61\2\u01c4\u01c9\5f\64\2\u01c5\u01c9"+
		"\5n8\2\u01c6\u01c9\5\u0082B\2\u01c7\u01c9\5t;\2\u01c8\u01bf\3\2\2\2\u01c8"+
		"\u01c0\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c3\3\2"+
		"\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9\25\3\2\2\2\u01ca\u01cc\5\u014e\u00a8\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\7\n\2\2\u01ce"+
		"\u01d0\7\7\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01dc\5\u0162\u00b2\2\u01d5\u01d7\7\7\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01dd\5F$\2\u01dc\u01d8\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01e5\3\2\2\2\u01de\u01e0\7\7\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e6\5\36\20\2\u01e5\u01e1\3\2\2\2\u01e5\u01e6\3"+
		"\2\2\2\u01e6\u01f5\3\2\2\2\u01e7\u01e9\7\7\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f1\7\u0083\2\2\u01ee\u01f0\7\7\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\5$\23\2\u01f5"+
		"\u01ea\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fe\3\2\2\2\u01f7\u01f9\7\7"+
		"\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\5\64"+
		"\33\2\u01fe\u01fa\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\27\3\2\2\2\u0200\u0202"+
		"\5\u014e\u00a8\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0207\7\13\2\2\u0204\u0206\7\7\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u020a\u0212\5\u0162\u00b2\2\u020b\u020d\7\7\2"+
		"\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\5F$\2\u0212"+
		"\u020e\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0222\3\2\2\2\u0214\u0216\7\7"+
		"\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021e\7\u0083"+
		"\2\2\u021b\u021d\7\7\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0223\5(\25\2\u0222\u0217\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u022b\3\2\2\2\u0224\u0226\7\7\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022c\5\64\33\2\u022b\u0227\3\2\2\2\u022b\u022c\3"+
		"\2\2\2\u022c\31\3\2\2\2\u022d\u022f\5\u014e\u00a8\2\u022e\u022d\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0234\7\20\2\2\u0231"+
		"\u0233\7\7\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u023f\5\u0162\u00b2\2\u0238\u023a\7\7\2\2\u0239\u0238\3\2\2\2\u023a\u023d"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u0240\5\36\20\2\u023f\u023b\3\2\2\2\u023f\u0240\3"+
		"\2\2\2\u0240\u0248\3\2\2\2\u0241\u0243\7\7\2\2\u0242\u0241\3\2\2\2\u0243"+
		"\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0247\u0249\5\64\33\2\u0248\u0244\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\33\3\2\2\2\u024a\u024c\5\u014e\u00a8\2\u024b\u024a"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0251\7\r\2\2\u024e"+
		"\u0250\7\7\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254"+
		"\u025c\5\u0162\u00b2\2\u0255\u0257\7\7\2\2\u0256\u0255\3\2\2\2\u0257\u025a"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025b\u025d\5F$\2\u025c\u0258\3\2\2\2\u025c\u025d\3\2\2"+
		"\2\u025d\u0261\3\2\2\2\u025e\u0260\7\7\2\2\u025f\u025e\3\2\2\2\u0260\u0263"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u026c\5\36\20\2\u0265\u0267\7\7\2\2\u0266\u0265\3"+
		"\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\5\64\33\2\u026c\u0268\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026d\35\3\2\2\2\u026e\u0270\5\u014e\u00a8"+
		"\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275"+
		"\7\26\2\2\u0272\u0274\7\7\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2"+
		"\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0278\u026f\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\5 \21\2\u027b\37\3\2\2\2\u027c\u0280\7I\2\2\u027d\u027f\7\7\2\2"+
		"\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0297\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0294\5\"\22\2"+
		"\u0284\u0286\7\7\2\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028e\7e\2\2\u028b\u028d\7\7\2\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0293\5\"\22\2\u0292\u0287\3\2\2\2\u0293\u0296\3"+
		"\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0297\u0283\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029c\3\2"+
		"\2\2\u0299\u029b\7\7\2\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\u02a0\7J\2\2\u02a0!\3\2\2\2\u02a1\u02a3\5\u014e\u00a8\2\u02a2"+
		"\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a6\t\2"+
		"\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02aa\3\2\2\2\u02a7"+
		"\u02a9\7\7\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02b1\5\u0162\u00b2\2\u02ae\u02b0\7\7\2\2\u02af\u02ae\3\2\2\2\u02b0\u02b3"+
		"\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b4\u02b8\7l\2\2\u02b5\u02b7\7\7\2\2\u02b6\u02b5\3\2"+
		"\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02ca\5R*\2\u02bc\u02be\7\7\2"+
		"\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c6\7O\2\2\u02c3"+
		"\u02c5\7\7\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02cb\5\u009eP\2\u02ca\u02bf\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb#\3\2\2"+
		"\2\u02cc\u02dd\5&\24\2\u02cd\u02cf\7\7\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d7\7e\2\2\u02d4\u02d6\7\7\2\2\u02d5\u02d4\3\2"+
		"\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\5&\24\2\u02db\u02d0\3\2"+
		"\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"%\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\5\u0160\u00b1\2\u02e1\u02e3"+
		"\5> \2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4"+
		"\u02e6\5,\27\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\'\3\2\2\2"+
		"\u02e7\u02f8\5*\26\2\u02e8\u02ea\7\7\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed"+
		"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f2\7e\2\2\u02ef\u02f1\7\7\2\2\u02f0\u02ef\3\2"+
		"\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f7\5*\26\2\u02f6\u02eb\3\2"+
		"\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		")\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fd\5\u015a\u00ae\2\u02fc\u02fb"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\u0160\u00b1"+
		"\2\u02ff+\3\2\2\2\u0300\u0304\7I\2\2\u0301\u0303\7\7\2\2\u0302\u0301\3"+
		"\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0321\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0318\5.\30\2\u0308\u030a\7\7"+
		"\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0312\7e"+
		"\2\2\u030f\u0311\7\7\2\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0312\3\2"+
		"\2\2\u0315\u0317\5.\30\2\u0316\u030b\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031e\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u031d\7\7\2\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2"+
		"\2\2\u0321\u0307\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0324\7J\2\2\u0324-\3\2\2\2\u0325\u0327\5\u015a\u00ae\2\u0326\u0325\3"+
		"\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\5\u009eP\2"+
		"\u0329/\3\2\2\2\u032a\u032c\5\u014e\u00a8\2\u032b\u032a\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0331\7\26\2\2\u032e\u0330\7"+
		"\7\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0343\5\u0084"+
		"C\2\u0335\u0337\7\7\2\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u033f\7l\2\2\u033c\u033e\7\7\2\2\u033d\u033c\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342\u0344\5\62\32\2\u0343\u0338\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0348\3\2\2\2\u0345\u0347\7\7\2\2\u0346\u0345\3\2"+
		"\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034d\5\u008cG\2\u034c\u034b"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\61\3\2\2\2\u034e\u0352\t\3\2\2\u034f"+
		"\u0351\7\7\2\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355"+
		"\u0356\5,\27\2\u0356\63\3\2\2\2\u0357\u035b\7M\2\2\u0358\u035a\7\7\2\2"+
		"\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u0361\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0360\5\66\34\2"+
		"\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362"+
		"\3\2\2\2\u0362\u0367\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0366\7\7\2\2\u0365"+
		"\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7N\2\2\u036b"+
		"\65\3\2\2\2\u036c\u0372\5\24\13\2\u036d\u0372\5\60\31\2\u036e\u0372\5"+
		"8\35\2\u036f\u0372\5:\36\2\u0370\u0372\5<\37\2\u0371\u036c\3\2\2\2\u0371"+
		"\u036d\3\2\2\2\u0371\u036e\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2"+
		"\2\2\u0372\u0374\3\2\2\2\u0373\u0375\5\u0164\u00b3\2\u0374\u0373\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\67"+
		"\3\2\2\2\u0378\u037c\7\27\2\2\u0379\u037b\7\7\2\2\u037a\u0379\3\2\2\2"+
		"\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f"+
		"\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0380\5\u008cG\2\u03809\3\2\2\2\u0381"+
		"\u0385\7\26\2\2\u0382\u0384\7\7\2\2\u0383\u0382\3\2\2\2\u0384\u0387\3"+
		"\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0388\u0389\5\u008cG\2\u0389;\3\2\2\2\u038a\u038c\5\u014e"+
		"\u00a8\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u0395\7\21\2\2\u038e\u0390\7\7\2\2\u038f\u038e\3\2\2\2\u0390\u0393\3"+
		"\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0396\5\64\33\2\u0395\u0391\3\2\2\2\u0395\u0396\3"+
		"\2\2\2\u0396=\3\2\2\2\u0397\u039b\7{\2\2\u0398\u039a\7\7\2\2\u0399\u0398"+
		"\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a9\5@!\2\u039f\u03a1\7\7\2"+
		"\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3"+
		"\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\7e\2\2\u03a6"+
		"\u03a8\5@!\2\u03a7\u03a2\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2"+
		"\2\u03a9\u03aa\3\2\2\2\u03aa\u03af\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae"+
		"\7\7\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3\7\177"+
		"\2\2\u03b3?\3\2\2\2\u03b4\u03b6\5B\"\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03ba\5R*\2\u03b8\u03ba\7q\2\2\u03b9"+
		"\u03b5\3\2\2\2\u03b9\u03b8\3\2\2\2\u03baA\3\2\2\2\u03bb\u03bf\5D#\2\u03bc"+
		"\u03be\7\7\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2"+
		"\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2"+
		"\u03bb\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5C\3\2\2\2\u03c6\u03c9\5P)\2\u03c7\u03c9\5\u015c\u00af\2\u03c8"+
		"\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9E\3\2\2\2\u03ca\u03ce\7{\2\2\u03cb"+
		"\u03cd\7\7\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03e2\5H%\2\u03d2\u03d4\7\7\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2"+
		"\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5"+
		"\3\2\2\2\u03d8\u03dc\7e\2\2\u03d9\u03db\7\7\2\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2"+
		"\2\2\u03de\u03dc\3\2\2\2\u03df\u03e1\5H%\2\u03e0\u03d5\3\2\2\2\u03e1\u03e4"+
		"\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e8\3\2\2\2\u03e4"+
		"\u03e2\3\2\2\2\u03e5\u03e7\7\7\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea\3\2"+
		"\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03ec\7\177\2\2\u03ecG\3\2\2\2\u03ed\u03ef\5J&\2"+
		"\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u0412"+
		"\5\u0162\u00b2\2\u03f1\u03f3\7\7\2\2\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3"+
		"\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f7\u03fb\7l\2\2\u03f8\u03fa\7\7\2\2\u03f9\u03f8\3\2"+
		"\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u040f\5R*\2\u03ff\u0401\7\7\2"+
		"\2\u0400\u03ff\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0409\7_\2\2\u0406"+
		"\u0408\7\7\2\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u0409\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0409\3\2\2\2\u040c"+
		"\u040e\5R*\2\u040d\u0402\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2"+
		"\2\u040f\u0410\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u03f4"+
		"\3\2\2\2\u0412\u0413\3\2\2\2\u0413I\3\2\2\2\u0414\u0418\5L\'\2\u0415\u0417"+
		"\7\7\2\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u0414\3\2"+
		"\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"K\3\2\2\2\u041f\u0423\5N(\2\u0420\u0423\5P)\2\u0421\u0423\5\u015c\u00af"+
		"\2\u0422\u041f\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423\u0427"+
		"\3\2\2\2\u0424\u0426\7\7\2\2\u0425\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427"+
		"\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428M\3\2\2\2\u0429\u0427\3\2\2\2"+
		"\u042a\u042b\7\25\2\2\u042bO\3\2\2\2\u042c\u042d\t\4\2\2\u042dQ\3\2\2"+
		"\2\u042e\u0430\5\u015a\u00ae\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2"+
		"\u0430\u0439\3\2\2\2\u0431\u043a\5T+\2\u0432\u043a\5Z.\2\u0433\u043a\5"+
		"\\/\2\u0434\u043a\5^\60\2\u0435\u0437\5\u0160\u00b1\2\u0436\u0438\5> "+
		"\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u0431"+
		"\3\2\2\2\u0439\u0432\3\2\2\2\u0439\u0433\3\2\2\2\u0439\u0434\3\2\2\2\u0439"+
		"\u0435\3\2\2\2\u043aS\3\2\2\2\u043b\u043f\5X-\2\u043c\u043e\7\7\2\2\u043d"+
		"\u043c\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0442\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0446\7\u0085\2\2\u0443"+
		"\u0445\7\7\2\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u0446\3\2\2\2\u0449"+
		"\u044a\5R*\2\u044aU\3\2\2\2\u044b\u044f\5Z.\2\u044c\u044f\5^\60\2\u044d"+
		"\u044f\5\u0160\u00b1\2\u044e\u044b\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044d"+
		"\3\2\2\2\u044fW\3\2\2\2\u0450\u0454\7I\2\2\u0451\u0453\7\7\2\2\u0452\u0451"+
		"\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u046b\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u0468\5R*\2\u0458\u045a\7\7\2"+
		"\2\u0459\u0458\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c"+
		"\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u0462\7e\2\2\u045f"+
		"\u0461\7\7\2\2\u0460\u045f\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2"+
		"\2\2\u0462\u0463\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465"+
		"\u0467\5R*\2\u0466\u045b\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2"+
		"\2\u0468\u0469\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u0457"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u0470\3\2\2\2\u046d\u046f\7\7\2\2\u046e"+
		"\u046d\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471\u0473\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7J\2\2\u0474"+
		"Y\3\2\2\2\u0475\u0479\7I\2\2\u0476\u0478\7\7\2\2\u0477\u0476\3\2\2\2\u0478"+
		"\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2"+
		"\2\2\u047b\u0479\3\2\2\2\u047c\u0480\5R*\2\u047d\u047f\7\7\2\2\u047e\u047d"+
		"\3\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0483\3\2\2\2\u0482\u0480\3\2\2\2\u0483\u0484\7J\2\2\u0484[\3\2\2\2\u0485"+
		"\u0489\7K\2\2\u0486\u0488\7\7\2\2\u0487\u0486\3\2\2\2\u0488\u048b\3\2"+
		"\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b"+
		"\u0489\3\2\2\2\u048c\u0490\5R*\2\u048d\u048f\7\7\2\2\u048e\u048d\3\2\2"+
		"\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493"+
		"\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0494\7L\2\2\u0494]\3\2\2\2\u0495\u0497"+
		"\5\u0160\u00b1\2\u0496\u0498\5> \2\u0497\u0496\3\2\2\2\u0497\u0498\3\2"+
		"\2\2\u0498\u049c\3\2\2\2\u0499\u049c\5Z.\2\u049a\u049c\5\\/\2\u049b\u0495"+
		"\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u049e\7q\2\2\u049e_\3\2\2\2\u049f\u04a1\5\u014e\u00a8\2\u04a0\u049f\3"+
		"\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a6\7\f\2\2\u04a3"+
		"\u04a5\7\7\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2"+
		"\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9"+
		"\u04b8\5\u0162\u00b2\2\u04aa\u04ac\7\7\2\2\u04ab\u04aa\3\2\2\2\u04ac\u04af"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b4\7\u0083\2\2\u04b1\u04b3\7\7\2\2\u04b2\u04b1"+
		"\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b9\5$\23\2\u04b8\u04ad\3\2"+
		"\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04c1\3\2\2\2\u04ba\u04bc\7\7\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2"+
		"\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\5b\62\2\u04c1"+
		"\u04bd\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2a\3\2\2\2\u04c3\u04c7\7M\2\2\u04c4"+
		"\u04c6\7\7\2\2\u04c5\u04c4\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2"+
		"\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cd\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca"+
		"\u04cc\5d\63\2\u04cb\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d3\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d2\7\7\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d6"+
		"\u04d7\7N\2\2\u04d7c\3\2\2\2\u04d8\u04dc\5\24\13\2\u04d9\u04dc\58\35\2"+
		"\u04da\u04dc\5:\36\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da"+
		"\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04df\5\u0164\u00b3\2\u04de\u04dd\3"+
		"\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"e\3\2\2\2\u04e2\u04e4\5\u014e\u00a8\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4"+
		"\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e9\7\17\2\2\u04e6\u04e8\7\7\2\2"+
		"\u04e7\u04e6\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea"+
		"\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04f4\5\u0162\u00b2"+
		"\2\u04ed\u04ef\7\7\2\2\u04ee\u04ed\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee"+
		"\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3"+
		"\u04f5\5\36\20\2\u04f4\u04f0\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f9\3"+
		"\2\2\2\u04f6\u04f8\7\7\2\2\u04f7\u04f6\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9"+
		"\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f9\3\2"+
		"\2\2\u04fc\u04fd\5h\65\2\u04fdg\3\2\2\2\u04fe\u0502\7M\2\2\u04ff\u0501"+
		"\7\7\2\2\u0500\u04ff\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0502"+
		"\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0505\u0507\5j"+
		"\66\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u051b\3\2\2\2\u0508"+
		"\u050a\7\7\2\2\u0509\u0508\3\2\2\2\u050a\u050d\3\2\2\2\u050b\u0509\3\2"+
		"\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050b\3\2\2\2\u050e"+
		"\u0512\7n\2\2\u050f\u0511\7\7\2\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2"+
		"\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0518\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0515\u0517\5\66\34\2\u0516\u0515\3\2\2\2\u0517\u051a\3"+
		"\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051c\3\2\2\2\u051a"+
		"\u0518\3\2\2\2\u051b\u050b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0520\3\2"+
		"\2\2\u051d\u051f\7\7\2\2\u051e\u051d\3\2\2\2\u051f\u0522\3\2\2\2\u0520"+
		"\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u0520\3\2"+
		"\2\2\u0523\u0524\7N\2\2\u0524i\3\2\2\2\u0525\u0536\5l\67\2\u0526\u0528"+
		"\7\7\2\2\u0527\u0526\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u0529\3\2\2\2\u052c\u0530\7e"+
		"\2\2\u052d\u052f\7\7\2\2\u052e\u052d\3\2\2\2\u052f\u0532\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2"+
		"\2\2\u0533\u0535\5l\67\2\u0534\u0529\3\2\2\2\u0535\u0538\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537k\3\2\2\2\u0538\u0536\3\2\2\2"+
		"\u0539\u053b\5\u014e\u00a8\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u0544\5\u0162\u00b2\2\u053d\u053f\7\7\2\2\u053e\u053d"+
		"\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0545\5,\27\2\u0544\u0540\3\2"+
		"\2\2\u0544\u0545\3\2\2\2\u0545\u054d\3\2\2\2\u0546\u0548\7\7\2\2\u0547"+
		"\u0546\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054a\u054c\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054e\5\64\33\2\u054d"+
		"\u0549\3\2\2\2\u054d\u054e\3\2\2\2\u054em\3\2\2\2\u054f\u0551\5\u014e"+
		"\u00a8\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u055a\7,\2\2\u0553\u0555\7\7\2\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2"+
		"\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558"+
		"\u0556\3\2\2\2\u0559\u055b\5F$\2\u055a\u0556\3\2\2\2\u055a\u055b\3\2\2"+
		"\2\u055b\u055f\3\2\2\2\u055c\u055e\7\7\2\2\u055d\u055c\3\2\2\2\u055e\u0561"+
		"\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561"+
		"\u055f\3\2\2\2\u0562\u056a\5V,\2\u0563\u0565\7\7\2\2\u0564\u0563\3\2\2"+
		"\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569"+
		"\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056b\5p9\2\u056a\u0566\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056bo\3\2\2\2\u056c\u0570\7M\2\2\u056d\u056f\7\7\2\2\u056e"+
		"\u056d\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2"+
		"\2\2\u0571\u0576\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u0575\5r:\2\u0574\u0573"+
		"\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u057c\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057b\7\7\2\2\u057a\u0579\3\2"+
		"\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u0580\7N\2\2\u0580q\3\2\2\2\u0581"+
		"\u0583\5\u0082B\2\u0582\u0584\5\u0164\u00b3\2\u0583\u0582\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586s\3\2\2\2"+
		"\u0587\u0589\5\u014e\u00a8\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058e\t\5\2\2\u058b\u058d\7\7\2\2\u058c\u058b\3\2"+
		"\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0591\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u05a0\5v<\2\u0592\u0594\7\7\2"+
		"\2\u0593\u0592\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596"+
		"\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u059c\7O\2\2\u0599"+
		"\u059b\7\7\2\2\u059a\u0599\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2"+
		"\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u059c\3\2\2\2\u059f"+
		"\u05a1\5\u009eP\2\u05a0\u0595\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a9"+
		"\3\2\2\2\u05a2\u05a4\7\7\2\2\u05a3\u05a2\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a8\u05aa\5x=\2\u05a9\u05a5\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aau"+
		"\3\2\2\2\u05ab\u05ad\5\u015a\u00ae\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3"+
		"\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05bd\5\u0162\u00b2\2\u05af\u05b1\7\7"+
		"\2\2\u05b0\u05af\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b9\7l"+
		"\2\2\u05b6\u05b8\7\7\2\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9"+
		"\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b9\3\2"+
		"\2\2\u05bc\u05be\5R*\2\u05bd\u05b2\3\2\2\2\u05bd\u05be\3\2\2\2\u05bew"+
		"\3\2\2\2\u05bf\u05c3\7M\2\2\u05c0\u05c2\7\7\2\2\u05c1\u05c0\3\2\2\2\u05c2"+
		"\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05da\3\2"+
		"\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05ce\5z>\2\u05c7\u05c9\5\u0164\u00b3\2"+
		"\u05c8\u05c7\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb"+
		"\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05cf\5|?\2\u05ce"+
		"\u05ca\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05db\3\2\2\2\u05d0\u05d8\5|"+
		"?\2\u05d1\u05d3\5\u0164\u00b3\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2"+
		"\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4"+
		"\3\2\2\2\u05d7\u05d9\5z>\2\u05d8\u05d4\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u05db\3\2\2\2\u05da\u05c6\3\2\2\2\u05da\u05d0\3\2\2\2\u05da\u05db\3\2"+
		"\2\2\u05db\u05df\3\2\2\2\u05dc\u05de\7\7\2\2\u05dd\u05dc\3\2\2\2\u05de"+
		"\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\3\2"+
		"\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e3\7N\2\2\u05e3y\3\2\2\2\u05e4\u05e6"+
		"\5\u014e\u00a8\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\3"+
		"\2\2\2\u05e7\u05f6\7\34\2\2\u05e8\u05ea\7\7\2\2\u05e9\u05e8\3\2\2\2\u05ea"+
		"\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2"+
		"\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05f2\7I\2\2\u05ef\u05f1\7\7\2\2\u05f0"+
		"\u05ef\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2"+
		"\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f7\7J\2\2\u05f6"+
		"\u05eb\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u0606\3\2\2\2\u05f8\u05fa\7\7"+
		"\2\2\u05f9\u05f8\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0602\7\u0084"+
		"\2\2\u05ff\u0601\7\7\2\2\u0600\u05ff\3\2\2\2\u0601\u0604\3\2\2\2\u0602"+
		"\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0602\3\2"+
		"\2\2\u0605\u0607\5R*\2\u0606\u05fb\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060b"+
		"\3\2\2\2\u0608\u060a\7\7\2\2\u0609\u0608\3\2\2\2\u060a\u060d\3\2\2\2\u060b"+
		"\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060b\3\2"+
		"\2\2\u060e\u0610\5\u008aF\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"{\3\2\2\2\u0611\u0613\5\u014e\u00a8\2\u0612\u0611\3\2\2\2\u0612\u0613"+
		"\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0618\7\35\2\2\u0615\u0617\7\7\2\2"+
		"\u0616\u0615\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619"+
		"\3\2\2\2\u0619\u0644\3\2\2\2\u061a\u0618\3\2\2\2\u061b\u061f\7I\2\2\u061c"+
		"\u061e\7\7\2\2\u061d\u061c\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2"+
		"\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2\2\2\u0621\u061f\3\2\2\2\u0622"+
		"\u0626\5~@\2\u0623\u0625\7\7\2\2\u0624\u0623\3\2\2\2\u0625\u0628\3\2\2"+
		"\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\3\2\2\2\u0628\u0626"+
		"\3\2\2\2\u0629\u062a\7J\2\2\u062a\u062c\3\2\2\2\u062b\u061b\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u063b\3\2\2\2\u062d\u062f\7\7\2\2\u062e\u062d\3\2"+
		"\2\2\u062f\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0633\3\2\2\2\u0632\u0630\3\2\2\2\u0633\u0637\7\u0084\2\2\u0634\u0636"+
		"\7\7\2\2\u0635\u0634\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637"+
		"\u0638\3\2\2\2\u0638\u063a\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063c\5R"+
		"*\2\u063b\u0630\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u0640\3\2\2\2\u063d"+
		"\u063f\7\7\2\2\u063e\u063d\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2"+
		"\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0640\3\2\2\2\u0643"+
		"\u0645\5\u008aF\2\u0644\u062b\3\2\2\2\u0644\u0645\3\2\2\2\u0645}\3\2\2"+
		"\2\u0646\u0648\5\u014e\u00a8\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2"+
		"\u0648\u0649\3\2\2\2\u0649\u0658\5\u0080A\2\u064a\u064c\7\7\2\2\u064b"+
		"\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0654\7O\2\2\u0651"+
		"\u0653\7\7\2\2\u0652\u0651\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2"+
		"\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0654\3\2\2\2\u0657"+
		"\u0659\5\u009eP\2\u0658\u064d\3\2\2\2\u0658\u0659\3\2\2\2\u0659\177\3"+
		"\2\2\2\u065a\u0669\5\u0162\u00b2\2\u065b\u065d\7\7\2\2\u065c\u065b\3\2"+
		"\2\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0661\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0665\7l\2\2\u0662\u0664\7\7"+
		"\2\2\u0663\u0662\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0665\3\2\2\2\u0668\u066a\5R"+
		"*\2\u0669\u065e\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u0081\3\2\2\2\u066b"+
		"\u066d\5\u014e\u00a8\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u0676\t\6\2\2\u066f\u0671\7\7\2\2\u0670\u066f\3\2\2\2\u0671"+
		"\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2"+
		"\2\2\u0674\u0672\3\2\2\2\u0675\u0677\5F$\2\u0676\u0672\3\2\2\2\u0676\u0677"+
		"\3\2\2\2\u0677\u067b\3\2\2\2\u0678\u067a\7\7\2\2\u0679\u0678\3\2\2\2\u067a"+
		"\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2"+
		"\2\2\u067d\u067b\3\2\2\2\u067e\u0682\5\u0162\u00b2\2\u067f\u0681\7\7\2"+
		"\2\u0680\u067f\3\2\2\2\u0681\u0684\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683"+
		"\3\2\2\2\u0683\u0685\3\2\2\2\u0684\u0682\3\2\2\2\u0685\u0694\5\u0084C"+
		"\2\u0686\u0688\7\7\2\2\u0687\u0686\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u0689\3\2\2\2\u068c"+
		"\u0690\7\u0084\2\2\u068d\u068f\7\7\2\2\u068e\u068d\3\2\2\2\u068f\u0692"+
		"\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0693\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0695\5R*\2\u0694\u0689\3\2\2\2\u0694\u0695\3\2\2"+
		"\2\u0695\u069d\3\2\2\2\u0696\u0698\7\7\2\2\u0697\u0696\3\2\2\2\u0698\u069b"+
		"\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b"+
		"\u0699\3\2\2\2\u069c\u069e\5\u008aF\2\u069d\u0699\3\2\2\2\u069d\u069e"+
		"\3\2\2\2\u069e\u0083\3\2\2\2\u069f\u06a3\7I\2\2\u06a0\u06a2\7\7\2\2\u06a1"+
		"\u06a0\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2"+
		"\2\2\u06a4\u06ba\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06b7\5\u0086D\2\u06a7"+
		"\u06a9\7\7\2\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2"+
		"\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad"+
		"\u06b1\7e\2\2\u06ae\u06b0\7\7\2\2\u06af\u06ae\3\2\2\2\u06b0\u06b3\3\2"+
		"\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3"+
		"\u06b1\3\2\2\2\u06b4\u06b6\5\u0086D\2\u06b5\u06aa\3\2\2\2\u06b6\u06b9"+
		"\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9"+
		"\u06b7\3\2\2\2\u06ba\u06a6\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bf\3\2"+
		"\2\2\u06bc\u06be\7\7\2\2\u06bd\u06bc\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf"+
		"\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1\u06bf\3\2"+
		"\2\2\u06c2\u06c3\7J\2\2\u06c3\u0085\3\2\2\2\u06c4\u06c6\5\u014e\u00a8"+
		"\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06d6"+
		"\5\u0088E\2\u06c8\u06ca\7\7\2\2\u06c9\u06c8\3\2\2\2\u06ca\u06cd\3\2\2"+
		"\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06cb"+
		"\3\2\2\2\u06ce\u06d2\7O\2\2\u06cf\u06d1\7\7\2\2\u06d0\u06cf\3\2\2\2\u06d1"+
		"\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2"+
		"\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d7\5\u009eP\2\u06d6\u06cb\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u0087\3\2\2\2\u06d8\u06dc\5\u0162\u00b2\2\u06d9\u06db"+
		"\7\7\2\2\u06da\u06d9\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc"+
		"\u06dd\3\2\2\2\u06dd\u06df\3\2\2\2\u06de\u06dc\3\2\2\2\u06df\u06e3\7l"+
		"\2\2\u06e0\u06e2\7\7\2\2\u06e1\u06e0\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3"+
		"\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e6\u06e7\5R*\2\u06e7\u0089\3\2\2\2\u06e8\u06f2\5\u008cG\2\u06e9"+
		"\u06ed\7O\2\2\u06ea\u06ec\7\7\2\2\u06eb\u06ea\3\2\2\2\u06ec\u06ef\3\2"+
		"\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef"+
		"\u06ed\3\2\2\2\u06f0\u06f2\5\u009eP\2\u06f1\u06e8\3\2\2\2\u06f1\u06e9"+
		"\3\2\2\2\u06f2\u008b\3\2\2\2\u06f3\u06f7\7M\2\2\u06f4\u06f6\7\7\2\2\u06f5"+
		"\u06f4\3\2\2\2\u06f6\u06f9\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f7\u06f8\3\2"+
		"\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06f7\3\2\2\2\u06fa\u06fe\5\u008eH\2\u06fb"+
		"\u06fd\7\7\2\2\u06fc\u06fb\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2"+
		"\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\3\2\2\2\u0700\u06fe\3\2\2\2\u0701"+
		"\u0702\7N\2\2\u0702\u008d\3\2\2\2\u0703\u070d\5\u0090I\2\u0704\u0706\5"+
		"\u0164\u00b3\2\u0705\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0705\3\2"+
		"\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\5\u0090I\2\u070a"+
		"\u070c\3\2\2\2\u070b\u0705\3\2\2\2\u070c\u070f\3\2\2\2\u070d\u070b\3\2"+
		"\2\2\u070d\u070e\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u0710"+
		"\u0703\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0715\3\2\2\2\u0712\u0714\5\u0164"+
		"\u00b3\2\u0713\u0712\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2\2\u0715"+
		"\u0716\3\2\2\2\u0716\u008f\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u071a\5\u015a"+
		"\u00ae\2\u0719\u0718\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071e\3\2\2\2\u071b"+
		"\u071d\7\7\2\2\u071c\u071b\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2"+
		"\2\2\u071e\u071f\3\2\2\2\u071f\u0725\3\2\2\2\u0720\u071e\3\2\2\2\u0721"+
		"\u0726\5\u0092J\2\u0722\u0726\5\u009cO\2\u0723\u0726\5\u0094K\2\u0724"+
		"\u0726\5\u009eP\2\u0725\u0721\3\2\2\2\u0725\u0722\3\2\2\2\u0725\u0723"+
		"\3\2\2\2\u0725\u0724\3\2\2\2\u0726\u0091\3\2\2\2\u0727\u0729\5\u015a\u00ae"+
		"\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072e"+
		"\t\5\2\2\u072b\u072d\7\7\2\2\u072c\u072b\3\2\2\2\u072d\u0730\3\2\2\2\u072e"+
		"\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2"+
		"\2\2\u0731\u0740\5v<\2\u0732\u0734\7\7\2\2\u0733\u0732\3\2\2\2\u0734\u0737"+
		"\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737"+
		"\u0735\3\2\2\2\u0738\u073c\7O\2\2\u0739\u073b\7\7\2\2\u073a\u0739\3\2"+
		"\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d"+
		"\u073f\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0741\5\u009eP\2\u0740\u0735"+
		"\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0093\3\2\2\2\u0742\u0746\5\u0096L"+
		"\2\u0743\u0746\5\u0098M\2\u0744\u0746\5\u009aN\2\u0745\u0742\3\2\2\2\u0745"+
		"\u0743\3\2\2\2\u0745\u0744\3\2\2\2\u0746\u0095\3\2\2\2\u0747\u074b\7\62"+
		"\2\2\u0748\u074a\7\7\2\2\u0749\u0748\3\2\2\2\u074a\u074d\3\2\2\2\u074b"+
		"\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\3\2\2\2\u074d\u074b\3\2"+
		"\2\2\u074e\u0752\7I\2\2\u074f\u0751\7\7\2\2\u0750\u074f\3\2\2\2\u0751"+
		"\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0756\3\2"+
		"\2\2\u0754\u0752\3\2\2\2\u0755\u0757\5\u015a\u00ae\2\u0756\u0755\3\2\2"+
		"\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075c\5v<\2\u0759\u075b"+
		"\7\7\2\2\u075a\u0759\3\2\2\2\u075b\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u075f\3\2\2\2\u075e\u075c\3\2\2\2\u075f\u0763\7>"+
		"\2\2\u0760\u0762\7\7\2\2\u0761\u0760\3\2\2\2\u0762\u0765\3\2\2\2\u0763"+
		"\u0761\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0763\3\2"+
		"\2\2\u0766\u076a\5\u009eP\2\u0767\u0769\7\7\2\2\u0768\u0767\3\2\2\2\u0769"+
		"\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2"+
		"\2\2\u076c\u076a\3\2\2\2\u076d\u0771\7J\2\2\u076e\u0770\7\7\2\2\u076f"+
		"\u076e\3\2\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2"+
		"\2\2\u0772\u0774\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0775\5\u008cG\2\u0775"+
		"\u0097\3\2\2\2\u0776\u077a\7\66\2\2\u0777\u0779\7\7\2\2\u0778\u0777\3"+
		"\2\2\2\u0779\u077c\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u077d\3\2\2\2\u077c\u077a\3\2\2\2\u077d\u0781\7I\2\2\u077e\u0780\7\7"+
		"\2\2\u077f\u077e\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2\2\2\u0781"+
		"\u0782\3\2\2\2\u0782\u0784\3\2\2\2\u0783\u0781\3\2\2\2\u0784\u0788\5\u009e"+
		"P\2\u0785\u0787\7\7\2\2\u0786\u0785\3\2\2\2\u0787\u078a\3\2\2\2\u0788"+
		"\u0786\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\3\2\2\2\u078a\u0788\3\2"+
		"\2\2\u078b\u078f\7J\2\2\u078c\u078e\7\7\2\2\u078d\u078c\3\2\2\2\u078e"+
		"\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2"+
		"\2\2\u0791\u078f\3\2\2\2\u0792\u0793\5\u008cG\2\u0793\u0099\3\2\2\2\u0794"+
		"\u0798\7\65\2\2\u0795\u0797\7\7\2\2\u0796\u0795\3\2\2\2\u0797\u079a\3"+
		"\2\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079b\3\2\2\2\u079a"+
		"\u0798\3\2\2\2\u079b\u079f\5\u008cG\2\u079c\u079e\7\7\2\2\u079d\u079c"+
		"\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u07a2\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a6\7\66\2\2\u07a3\u07a5\7"+
		"\7\2\2\u07a4\u07a3\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6"+
		"\u07a7\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07ad\7I"+
		"\2\2\u07aa\u07ac\7\7\2\2\u07ab\u07aa\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad"+
		"\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\3\2\2\2\u07af\u07ad\3\2"+
		"\2\2\u07b0\u07b4\5\u009eP\2\u07b1\u07b3\7\7\2\2\u07b2\u07b1\3\2\2\2\u07b3"+
		"\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b7\3\2"+
		"\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07b8\7J\2\2\u07b8\u009b\3\2\2\2\u07b9"+
		"\u07bd\5\u013c\u009f\2\u07ba\u07bc\7\7\2\2\u07bb\u07ba\3\2\2\2\u07bc\u07bf"+
		"\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c0\3\2\2\2\u07bf"+
		"\u07bd\3\2\2\2\u07c0\u07c1\5\u0118\u008d\2\u07c1\u07c2\5\u009eP\2\u07c2"+
		"\u009d\3\2\2\2\u07c3\u07c4\5\u00a0Q\2\u07c4\u009f\3\2\2\2\u07c5\u07cb"+
		"\5\u00a2R\2\u07c6\u07c7\5\u011a\u008e\2\u07c7\u07c8\5\u00a2R\2\u07c8\u07ca"+
		"\3\2\2\2\u07c9\u07c6\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb"+
		"\u07cc\3\2\2\2\u07cc\u00a1\3\2\2\2\u07cd\u07cb\3\2\2\2\u07ce\u07d4\5\u00a4"+
		"S\2\u07cf\u07d0\5\u011c\u008f\2\u07d0\u07d1\5\u00a4S\2\u07d1\u07d3\3\2"+
		"\2\2\u07d2\u07cf\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4"+
		"\u07d5\3\2\2\2\u07d5\u00a3\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07dd\5\u00a6"+
		"T\2\u07d8\u07d9\5\u011e\u0090\2\u07d9\u07da\5\u00a6T\2\u07da\u07dc\3\2"+
		"\2\2\u07db\u07d8\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd"+
		"\u07de\3\2\2\2\u07de\u00a5\3\2\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e6\5\u00a8"+
		"U\2\u07e1\u07e2\5\u0120\u0091\2\u07e2\u07e3\5\u00a8U\2\u07e3\u07e5\3\2"+
		"\2\2\u07e4\u07e1\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u00a7\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ef\5\u00aa"+
		"V\2\u07ea\u07eb\5\u0122\u0092\2\u07eb\u07ec\5\u00aaV\2\u07ec\u07ee\3\2"+
		"\2\2\u07ed\u07ea\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef"+
		"\u07f0\3\2\2\2\u07f0\u00a9\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f6\5\u00ae"+
		"X\2\u07f3\u07f5\5\u00acW\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6"+
		"\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u00ab\3\2\2\2\u07f8\u07f6\3\2"+
		"\2\2\u07f9\u07fa\5\u0124\u0093\2\u07fa\u07fb\5\u00aeX\2\u07fb\u0800\3"+
		"\2\2\2\u07fc\u07fd\5\u0126\u0094\2\u07fd\u07fe\5R*\2\u07fe\u0800\3\2\2"+
		"\2\u07ff\u07f9\3\2\2\2\u07ff\u07fc\3\2\2\2\u0800\u00ad\3\2\2\2\u0801\u0807"+
		"\5\u00b0Y\2\u0802\u0803\5\u0128\u0095\2\u0803\u0804\5\u00b0Y\2\u0804\u0806"+
		"\3\2\2\2\u0805\u0802\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807"+
		"\u0808\3\2\2\2\u0808\u00af\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u0810\5\u00b2"+
		"Z\2\u080b\u080c\5\u0162\u00b2\2\u080c\u080d\5\u00b2Z\2\u080d\u080f\3\2"+
		"\2\2\u080e\u080b\3\2\2\2\u080f\u0812\3\2\2\2\u0810\u080e\3\2\2\2\u0810"+
		"\u0811\3\2\2\2\u0811\u00b1\3\2\2\2\u0812\u0810\3\2\2\2\u0813\u0817\5\u00b4"+
		"[\2\u0814\u0815\5\u012a\u0096\2\u0815\u0816\5\u00b4[\2\u0816\u0818\3\2"+
		"\2\2\u0817\u0814\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u00b3\3\2\2\2\u0819"+
		"\u081f\5\u00b6\\\2\u081a\u081b\5\u012c\u0097\2\u081b\u081c\5\u00b6\\\2"+
		"\u081c\u081e\3\2\2\2\u081d\u081a\3\2\2\2\u081e\u0821\3\2\2\2\u081f\u081d"+
		"\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u00b5\3\2\2\2\u0821\u081f\3\2\2\2\u0822"+
		"\u0828\5\u00b8]\2\u0823\u0824\5\u012e\u0098\2\u0824\u0825\5\u00b8]\2\u0825"+
		"\u0827\3\2\2\2\u0826\u0823\3\2\2\2\u0827\u082a\3\2\2\2\u0828\u0826\3\2"+
		"\2\2\u0828\u0829\3\2\2\2\u0829\u00b7\3\2\2\2\u082a\u0828\3\2\2\2\u082b"+
		"\u0831\5\u00ba^\2\u082c\u082d\5\u0130\u0099\2\u082d\u082e\5\u00ba^\2\u082e"+
		"\u0830\3\2\2\2\u082f\u082c\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2"+
		"\2\2\u0831\u0832\3\2\2\2\u0832\u00b9\3\2\2\2\u0833\u0831\3\2\2\2\u0834"+
		"\u083a\5\u00bc_\2\u0835\u0836\5\u0132\u009a\2\u0836\u0837\5\u00bc_\2\u0837"+
		"\u0839\3\2\2\2\u0838\u0835\3\2\2\2\u0839\u083c\3\2\2\2\u083a\u0838\3\2"+
		"\2\2\u083a\u083b\3\2\2\2\u083b\u00bb\3\2\2\2\u083c\u083a\3\2\2\2\u083d"+
		"\u0843\5\u00be`\2\u083e\u083f\5\u0134\u009b\2\u083f\u0840\5R*\2\u0840"+
		"\u0842\3\2\2\2\u0841\u083e\3\2\2\2\u0842\u0845\3\2\2\2\u0843\u0841\3\2"+
		"\2\2\u0843\u0844\3\2\2\2\u0844\u00bd\3\2\2\2\u0845\u0843\3\2\2\2\u0846"+
		"\u0848\5\u0136\u009c\2\u0847\u0846\3\2\2\2\u0848\u084b\3\2\2\2\u0849\u0847"+
		"\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084c\3\2\2\2\u084b\u0849\3\2\2\2\u084c"+
		"\u084d\5\u00c0a\2\u084d\u00bf\3\2\2\2\u084e\u0852\5\u00c2b\2\u084f\u0851"+
		"\5\u0138\u009d\2\u0850\u084f\3\2\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3"+
		"\2\2\2\u0852\u0853\3\2\2\2\u0853\u00c1\3\2\2\2\u0854\u0852\3\2\2\2\u0855"+
		"\u0863\5\u00c4c\2\u0856\u0863\5\u0162\u00b2\2\u0857\u0863\5\u00ecw\2\u0858"+
		"\u0863\5\u00c6d\2\u0859\u0863\5\u00c8e\2\u085a\u0863\5\u0112\u008a\2\u085b"+
		"\u0863\5\u00caf\2\u085c\u0863\5\u00ccg\2\u085d\u0863\5\u00ceh\2\u085e"+
		"\u0863\5\u00d0i\2\u085f\u0863\5\u00dan\2\u0860\u0863\5\u00dco\2\u0861"+
		"\u0863\5\u00e2r\2\u0862\u0855\3\2\2\2\u0862\u0856\3\2\2\2\u0862\u0857"+
		"\3\2\2\2\u0862\u0858\3\2\2\2\u0862\u0859\3\2\2\2\u0862\u085a\3\2\2\2\u0862"+
		"\u085b\3\2\2\2\u0862\u085c\3\2\2\2\u0862\u085d\3\2\2\2\u0862\u085e\3\2"+
		"\2\2\u0862\u085f\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0861\3\2\2\2\u0863"+
		"\u00c3\3\2\2\2\u0864\u0865\7I\2\2\u0865\u0866\5\u009eP\2\u0866\u0867\7"+
		"J\2\2\u0867\u00c5\3\2\2\2\u0868\u0869\7f\2\2\u0869\u086a\5\u0160\u00b1"+
		"\2\u086a\u00c7\3\2\2\2\u086b\u086d\5V,\2\u086c\u086b\3\2\2\2\u086c\u086d"+
		"\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0872\7m\2\2\u086f\u0871\7\7\2\2\u0870"+
		"\u086f\3\2\2\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2"+
		"\2\2\u0873\u0875\3\2\2\2\u0874\u0872\3\2\2\2\u0875\u0876\5\u0162\u00b2"+
		"\2\u0876\u00c9\3\2\2\2\u0877\u087b\7K\2\2\u0878\u087a\7\7\2\2\u0879\u0878"+
		"\3\2\2\2\u087a\u087d\3\2\2\2\u087b\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c"+
		"\u087f\3\2\2\2\u087d\u087b\3\2\2\2\u087e\u0880\5\u009eP\2\u087f\u087e"+
		"\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0891\3\2\2\2\u0881\u0883\7\7\2\2\u0882"+
		"\u0881\3\2\2\2\u0883\u0886\3\2\2\2\u0884\u0882\3\2\2\2\u0884\u0885\3\2"+
		"\2\2\u0885\u0887\3\2\2\2\u0886\u0884\3\2\2\2\u0887\u088b\7e\2\2\u0888"+
		"\u088a\7\7\2\2\u0889\u0888\3\2\2\2\u088a\u088d\3\2\2\2\u088b\u0889\3\2"+
		"\2\2\u088b\u088c\3\2\2\2\u088c\u088e\3\2\2\2\u088d\u088b\3\2\2\2\u088e"+
		"\u0890\5\u009eP\2\u088f\u0884\3\2\2\2\u0890\u0893\3\2\2\2\u0891\u088f"+
		"\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0897\3\2\2\2\u0893\u0891\3\2\2\2\u0894"+
		"\u0896\7\7\2\2\u0895\u0894\3\2\2\2\u0896\u0899\3\2\2\2\u0897\u0895\3\2"+
		"\2\2\u0897\u0898\3\2\2\2\u0898\u089a\3\2\2\2\u0899\u0897\3\2\2\2\u089a"+
		"\u089b\7L\2\2\u089b\u00cb\3\2\2\2\u089c\u089d\7\22\2\2\u089d\u00cd\3\2"+
		"\2\2\u089e\u089f\7\23\2\2\u089f\u00cf\3\2\2\2\u08a0\u08a3\5\u00d2j\2\u08a1"+
		"\u08a3\5\u00d6l\2\u08a2\u08a0\3\2\2\2\u08a2\u08a1\3\2\2\2\u08a3\u00d1"+
		"\3\2\2\2\u08a4\u08a8\t\7\2\2\u08a5\u08a7\7\7\2\2\u08a6\u08a5\3\2\2\2\u08a7"+
		"\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08ab\3\2"+
		"\2\2\u08aa\u08a8\3\2\2\2\u08ab\u08af\7I\2\2\u08ac\u08ae\7\7\2\2\u08ad"+
		"\u08ac\3\2\2\2\u08ae\u08b1\3\2\2\2\u08af\u08ad\3\2\2\2\u08af\u08b0\3\2"+
		"\2\2\u08b0\u08b2\3\2\2\2\u08b1\u08af\3\2\2\2\u08b2\u08b6\5\u009eP\2\u08b3"+
		"\u08b5\7\7\2\2\u08b4\u08b3\3\2\2\2\u08b5\u08b8\3\2\2\2\u08b6\u08b4\3\2"+
		"\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b9\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b9"+
		"\u08bd\7J\2\2\u08ba\u08bc\7\7\2\2\u08bb\u08ba\3\2\2\2\u08bc\u08bf\3\2"+
		"\2\2\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c0\3\2\2\2\u08bf"+
		"\u08bd\3\2\2\2\u08c0\u08ca\5\u008cG\2\u08c1\u08c3\7\7\2\2\u08c2\u08c1"+
		"\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5"+
		"\u08c7\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08c9\5\u00d4k";
	private static final String _serializedATNSegment1 =
		"\2\u08c8\u08c4\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb"+
		"\3\2\2\2\u08cb\u08db\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd\u08cf\7\7\2\2\u08ce"+
		"\u08cd\3\2\2\2\u08cf\u08d2\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2"+
		"\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d3\u08d7\7\61\2\2\u08d4"+
		"\u08d6\7\7\2\2\u08d5\u08d4\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2"+
		"\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08da\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da"+
		"\u08dc\5\u008cG\2\u08db\u08d0\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u00d3"+
		"\3\2\2\2\u08dd\u08e1\7\60\2\2\u08de\u08e0\7\7\2\2\u08df\u08de\3\2\2\2"+
		"\u08e0\u08e3\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e4"+
		"\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4\u08e8\7I\2\2\u08e5\u08e7\7\7\2\2\u08e6"+
		"\u08e5\3\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e6\3\2\2\2\u08e8\u08e9\3\2"+
		"\2\2\u08e9\u08eb\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u08ef\5\u009eP\2\u08ec"+
		"\u08ee\7\7\2\2\u08ed\u08ec\3\2\2\2\u08ee\u08f1\3\2\2\2\u08ef\u08ed\3\2"+
		"\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f2\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f2"+
		"\u08f6\7J\2\2\u08f3\u08f5\7\7\2\2\u08f4\u08f3\3\2\2\2\u08f5\u08f8\3\2"+
		"\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f9\3\2\2\2\u08f8"+
		"\u08f6\3\2\2\2\u08f9\u08fa\5\u008cG\2\u08fa\u00d5\3\2\2\2\u08fb\u08ff"+
		"\7\63\2\2\u08fc\u08fe\7\7\2\2\u08fd\u08fc\3\2\2\2\u08fe\u0901\3\2\2\2"+
		"\u08ff\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0902\3\2\2\2\u0901\u08ff"+
		"\3\2\2\2\u0902\u0906\7I\2\2\u0903\u0905\7\7\2\2\u0904\u0903\3\2\2\2\u0905"+
		"\u0908\3\2\2\2\u0906\u0904\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0909\3\2"+
		"\2\2\u0908\u0906\3\2\2\2\u0909\u090d\5\u009eP\2\u090a\u090c\7\7\2\2\u090b"+
		"\u090a\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b\3\2\2\2\u090d\u090e\3\2"+
		"\2\2\u090e\u0910\3\2\2\2\u090f\u090d\3\2\2\2\u0910\u0914\7J\2\2\u0911"+
		"\u0913\7\7\2\2\u0912\u0911\3\2\2\2\u0913\u0916\3\2\2\2\u0914\u0912\3\2"+
		"\2\2\u0914\u0915\3\2\2\2\u0915\u0917\3\2\2\2\u0916\u0914\3\2\2\2\u0917"+
		"\u091f\7M\2\2\u0918\u091a\7\7\2\2\u0919\u0918\3\2\2\2\u091a\u091d\3\2"+
		"\2\2\u091b\u0919\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091e\3\2\2\2\u091d"+
		"\u091b\3\2\2\2\u091e\u0920\5\u00d8m\2\u091f\u091b\3\2\2\2\u0920\u0921"+
		"\3\2\2\2\u0921\u091f\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0926\3\2\2\2\u0923"+
		"\u0925\7\7\2\2\u0924\u0923\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924\3\2"+
		"\2\2\u0926\u0927\3\2\2\2\u0927\u0929\3\2\2\2\u0928\u0926\3\2\2\2\u0929"+
		"\u092a\7N\2\2\u092a\u00d7\3\2\2\2\u092b\u092f\7\64\2\2\u092c\u092e\7\7"+
		"\2\2\u092d\u092c\3\2\2\2\u092e\u0931\3\2\2\2\u092f\u092d\3\2\2\2\u092f"+
		"\u0930\3\2\2\2\u0930\u0932\3\2\2\2\u0931\u092f\3\2\2\2\u0932\u0943\5\u00ec"+
		"w\2\u0933\u0935\7\7\2\2\u0934\u0933\3\2\2\2\u0935\u0938\3\2\2\2\u0936"+
		"\u0934\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0939\3\2\2\2\u0938\u0936\3\2"+
		"\2\2\u0939\u093d\7e\2\2\u093a\u093c\7\7\2\2\u093b\u093a\3\2\2\2\u093c"+
		"\u093f\3\2\2\2\u093d\u093b\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0940\3\2"+
		"\2\2\u093f\u093d\3\2\2\2\u0940\u0942\5\u00ecw\2\u0941\u0936\3\2\2\2\u0942"+
		"\u0945\3\2\2\2\u0943\u0941\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0949\3\2"+
		"\2\2\u0945\u0943\3\2\2\2\u0946\u0948\7\7\2\2\u0947\u0946\3\2\2\2\u0948"+
		"\u094b\3\2\2\2\u0949\u0947\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094c\3\2"+
		"\2\2\u094b\u0949\3\2\2\2\u094c\u0950\7\u0085\2\2\u094d\u094f\7\7\2\2\u094e"+
		"\u094d\3\2\2\2\u094f\u0952\3\2\2\2\u0950\u094e\3\2\2\2\u0950\u0951\3\2"+
		"\2\2\u0951\u0953\3\2\2\2\u0952\u0950\3\2\2\2\u0953\u0955\5\u008cG\2\u0954"+
		"\u0956\5\u0164\u00b3\2\u0955\u0954\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0967"+
		"\3\2\2\2\u0957\u095b\7\61\2\2\u0958\u095a\7\7\2\2\u0959\u0958\3\2\2\2"+
		"\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095e"+
		"\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u0962\7\u0085\2\2\u095f\u0961\7\7\2"+
		"\2\u0960\u095f\3\2\2\2\u0961\u0964\3\2\2\2\u0962\u0960\3\2\2\2\u0962\u0963"+
		"\3\2\2\2\u0963\u0965\3\2\2\2\u0964\u0962\3\2\2\2\u0965\u0967\5\u008cG"+
		"\2\u0966\u092b\3\2\2\2\u0966\u0957\3\2\2\2\u0967\u00d9\3\2\2\2\u0968\u096c"+
		"\7A\2\2\u0969\u096b\7\7\2\2\u096a\u0969\3\2\2\2\u096b\u096e\3\2\2\2\u096c"+
		"\u096a\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u0971\3\2\2\2\u096e\u096c\3\2"+
		"\2\2\u096f\u0972\5\u008cG\2\u0970\u0972\5\u009eP\2\u0971\u096f\3\2\2\2"+
		"\u0971\u0970\3\2\2\2\u0972\u00db\3\2\2\2\u0973\u0977\7@\2\2\u0974\u0976"+
		"\7\7\2\2\u0975\u0974\3\2\2\2\u0976\u0979\3\2\2\2\u0977\u0975\3\2\2\2\u0977"+
		"\u0978\3\2\2\2\u0978\u097a\3\2\2\2\u0979\u0977\3\2\2\2\u097a\u0984\5\u008c"+
		"G\2\u097b\u097d\7\7\2\2\u097c\u097b\3\2\2\2\u097d\u0980\3\2\2\2\u097e"+
		"\u097c\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0981\3\2\2\2\u0980\u097e\3\2"+
		"\2\2\u0981\u0983\5\u00dep\2\u0982\u097e\3\2\2\2\u0983\u0986\3\2\2\2\u0984"+
		"\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u098e\3\2\2\2\u0986\u0984\3\2"+
		"\2\2\u0987\u0989\7\7\2\2\u0988\u0987\3\2\2\2\u0989\u098c\3\2\2\2\u098a"+
		"\u0988\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c\u098a\3\2"+
		"\2\2\u098d\u098f\5\u00e0q\2\u098e\u098a\3\2\2\2\u098e\u098f\3\2\2\2\u098f"+
		"\u00dd\3\2\2\2\u0990\u0994\7B\2\2\u0991\u0993\7\7\2\2\u0992\u0991\3\2"+
		"\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0997\3\2\2\2\u0996\u0994\3\2\2\2\u0997\u099b\7I\2\2\u0998\u099a\7\7"+
		"\2\2\u0999\u0998\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3\2\2\2\u099b"+
		"\u099c\3\2\2\2\u099c\u099f\3\2\2\2\u099d\u099b\3\2\2\2\u099e\u09a0\5\u015a"+
		"\u00ae\2\u099f\u099e\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u09a5\5\u0162\u00b2\2\u09a2\u09a4\7\7\2\2\u09a3\u09a2\3\2\2\2\u09a4\u09a7"+
		"\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a8\3\2\2\2\u09a7"+
		"\u09a5\3\2\2\2\u09a8\u09ac\7l\2\2\u09a9\u09ab\7\7\2\2\u09aa\u09a9\3\2"+
		"\2\2\u09ab\u09ae\3\2\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad"+
		"\u09af\3\2\2\2\u09ae\u09ac\3\2\2\2\u09af\u09c0\5R*\2\u09b0\u09b2\7\7\2"+
		"\2\u09b1\u09b0\3\2\2\2\u09b2\u09b5\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b3\u09b4"+
		"\3\2\2\2\u09b4\u09b6\3\2\2\2\u09b5\u09b3\3\2\2\2\u09b6\u09ba\7_\2\2\u09b7"+
		"\u09b9\7\7\2\2\u09b8\u09b7\3\2\2\2\u09b9\u09bc\3\2\2\2\u09ba\u09b8\3\2"+
		"\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bd"+
		"\u09bf\5R*\2\u09be\u09b3\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2\2"+
		"\2\u09c0\u09c1\3\2\2\2\u09c1\u09c6\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09c5"+
		"\7\7\2\2\u09c4\u09c3\3\2\2\2\u09c5\u09c8\3\2\2\2\u09c6\u09c4\3\2\2\2\u09c6"+
		"\u09c7\3\2\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c6\3\2\2\2\u09c9\u09cd\7J"+
		"\2\2\u09ca\u09cc\7\7\2\2\u09cb\u09ca\3\2\2\2\u09cc\u09cf\3\2\2\2\u09cd"+
		"\u09cb\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09d0\3\2\2\2\u09cf\u09cd\3\2"+
		"\2\2\u09d0\u09d1\5\u008cG\2\u09d1\u00df\3\2\2\2\u09d2\u09d6\7C\2\2\u09d3"+
		"\u09d5\7\7\2\2\u09d4\u09d3\3\2\2\2\u09d5\u09d8\3\2\2\2\u09d6\u09d4\3\2"+
		"\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09d9\3\2\2\2\u09d8\u09d6\3\2\2\2\u09d9"+
		"\u09da\5\u008cG\2\u09da\u00e1\3\2\2\2\u09db\u09e0\5\u00e4s\2\u09dc\u09e0"+
		"\5\u00e6t\2\u09dd\u09e0\5\u00e8u\2\u09de\u09e0\5\u00eav\2\u09df\u09db"+
		"\3\2\2\2\u09df\u09dc\3\2\2\2\u09df\u09dd\3\2\2\2\u09df\u09de\3\2\2\2\u09e0"+
		"\u00e3\3\2\2\2\u09e1\u09e5\7D\2\2\u09e2\u09e4\7\7\2\2\u09e3\u09e2\3\2"+
		"\2\2\u09e4\u09e7\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6"+
		"\u09e8\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8\u09e9\5\u009eP\2\u09e9\u00e5"+
		"\3\2\2\2\u09ea\u09ee\7\67\2\2\u09eb\u09ed\7\7\2\2\u09ec\u09eb\3\2\2\2"+
		"\u09ed\u09f0\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f2"+
		"\3\2\2\2\u09f0\u09ee\3\2\2\2\u09f1\u09f3\5\u009eP\2\u09f2\u09f1\3\2\2"+
		"\2\u09f2\u09f3\3\2\2\2\u09f3\u00e7\3\2\2\2\u09f4\u09f5\79\2\2\u09f5\u00e9"+
		"\3\2\2\2\u09f6\u09f7\78\2\2\u09f7\u00eb\3\2\2\2\u09f8\u0a05\5\u00eex\2"+
		"\u09f9\u0a05\5\u00f0y\2\u09fa\u0a05\5\u00f2z\2\u09fb\u0a05\5\u00f4{\2"+
		"\u09fc\u0a05\5\u00f6|\2\u09fd\u0a05\5\u00f8}\2\u09fe\u0a05\5\u00fa~\2"+
		"\u09ff\u0a05\5\u00fc\177\2\u0a00\u0a05\5\u00fe\u0080\2\u0a01\u0a05\5\u0100"+
		"\u0081\2\u0a02\u0a05\5\u0102\u0082\2\u0a03\u0a05\5\u0104\u0083\2\u0a04"+
		"\u09f8\3\2\2\2\u0a04\u09f9\3\2\2\2\u0a04\u09fa\3\2\2\2\u0a04\u09fb\3\2"+
		"\2\2\u0a04\u09fc\3\2\2\2\u0a04\u09fd\3\2\2\2\u0a04\u09fe\3\2\2\2\u0a04"+
		"\u09ff\3\2\2\2\u0a04\u0a00\3\2\2\2\u0a04\u0a01\3\2\2\2\u0a04\u0a02\3\2"+
		"\2\2\u0a04\u0a03\3\2\2\2\u0a05\u00ed\3\2\2\2\u0a06\u0a07\7H\2\2\u0a07"+
		"\u00ef\3\2\2\2\u0a08\u0a09\t\b\2\2\u0a09\u00f1\3\2\2\2\u0a0a\u0a0b\t\t"+
		"\2\2\u0a0b\u00f3\3\2\2\2\u0a0c\u0a0d\7\u0089\2\2\u0a0d\u00f5\3\2\2\2\u0a0e"+
		"\u0a0f\7\u008a\2\2\u0a0f\u00f7\3\2\2\2\u0a10\u0a11\7\u008b\2\2\u0a11\u00f9"+
		"\3\2\2\2\u0a12\u0a13\7\u008c\2\2\u0a13\u00fb\3\2\2\2\u0a14\u0a15\7\u008d"+
		"\2\2\u0a15\u00fd\3\2\2\2\u0a16\u0a17\7\u008e\2\2\u0a17\u00ff\3\2\2\2\u0a18"+
		"\u0a19\7\u008f\2\2\u0a19\u0101\3\2\2\2\u0a1a\u0a1b\7\u0097\2\2\u0a1b\u0103"+
		"\3\2\2\2\u0a1c\u0a1f\5\u0106\u0084\2\u0a1d\u0a1f\5\u0108\u0085\2\u0a1e"+
		"\u0a1c\3\2\2\2\u0a1e\u0a1d\3\2\2\2\u0a1f\u0105\3\2\2\2\u0a20\u0a25\7\u0087"+
		"\2\2\u0a21\u0a24\5\u010a\u0086\2\u0a22\u0a24\5\u010c\u0087\2\u0a23\u0a21"+
		"\3\2\2\2\u0a23\u0a22\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a25"+
		"\u0a26\3\2\2\2\u0a26\u0a28\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a28\u0a29\7\u009f"+
		"\2\2\u0a29\u0107\3\2\2\2\u0a2a\u0a31\7\u0088\2\2\u0a2b\u0a30\5\u010e\u0088"+
		"\2\u0a2c\u0a30\5\u0110\u0089\2\u0a2d\u0a30\5\u0106\u0084\2\u0a2e\u0a30"+
		"\7\u00a5\2\2\u0a2f\u0a2b\3\2\2\2\u0a2f\u0a2c\3\2\2\2\u0a2f\u0a2d\3\2\2"+
		"\2\u0a2f\u0a2e\3\2\2\2\u0a30\u0a33\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a32"+
		"\3\2\2\2\u0a32\u0a34\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a34\u0a35\7\u00a4\2"+
		"\2\u0a35\u0109\3\2\2\2\u0a36\u0a37\t\n\2\2\u0a37\u010b\3\2\2\2\u0a38\u0a39"+
		"\7\u00a3\2\2\u0a39\u0a3a\5\u009eP\2\u0a3a\u0a3b\7N\2\2\u0a3b\u010d\3\2"+
		"\2\2\u0a3c\u0a3d\t\13\2\2\u0a3d\u010f\3\2\2\2\u0a3e\u0a3f\7\u00a9\2\2"+
		"\u0a3f\u0a40\5\u009eP\2\u0a40\u0a41\7N\2\2\u0a41\u0111\3\2\2\2\u0a42\u0a46"+
		"\7M\2\2\u0a43\u0a45\7\7\2\2\u0a44\u0a43\3\2\2\2\u0a45\u0a48\3\2\2\2\u0a46"+
		"\u0a44\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a59\3\2\2\2\u0a48\u0a46\3\2"+
		"\2\2\u0a49\u0a4b\5\u0114\u008b\2\u0a4a\u0a49\3\2\2\2\u0a4a\u0a4b\3\2\2"+
		"\2\u0a4b\u0a4f\3\2\2\2\u0a4c\u0a4e\7\7\2\2\u0a4d\u0a4c\3\2\2\2\u0a4e\u0a51"+
		"\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a52\3\2\2\2\u0a51"+
		"\u0a4f\3\2\2\2\u0a52\u0a56\7\u0085\2\2\u0a53\u0a55\7\7\2\2\u0a54\u0a53"+
		"\3\2\2\2\u0a55\u0a58\3\2\2\2\u0a56\u0a54\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57"+
		"\u0a5a\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a59\u0a4a\3\2\2\2\u0a59\u0a5a\3\2"+
		"\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5f\5\u008eH\2\u0a5c\u0a5e\7\7\2\2\u0a5d"+
		"\u0a5c\3\2\2\2\u0a5e\u0a61\3\2\2\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a60\3\2"+
		"\2\2\u0a60\u0a62\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a62\u0a63\7N\2\2\u0a63"+
		"\u0113\3\2\2\2\u0a64\u0a75\5\u0116\u008c\2\u0a65\u0a67\7\7\2\2\u0a66\u0a65"+
		"\3\2\2\2\u0a67\u0a6a\3\2\2\2\u0a68\u0a66\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69"+
		"\u0a6b\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6b\u0a6f\7e\2\2\u0a6c\u0a6e\7\7"+
		"\2\2\u0a6d\u0a6c\3\2\2\2\u0a6e\u0a71\3\2\2\2\u0a6f\u0a6d\3\2\2\2\u0a6f"+
		"\u0a70\3\2\2\2\u0a70\u0a72\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a72\u0a74\5\u0116"+
		"\u008c\2\u0a73\u0a68\3\2\2\2\u0a74\u0a77\3\2\2\2\u0a75\u0a73\3\2\2\2\u0a75"+
		"\u0a76\3\2\2\2\u0a76\u0115\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a78\u0a87\5v"+
		"<\2\u0a79\u0a7b\7\7\2\2\u0a7a\u0a79\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c"+
		"\u0a7a\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a7f\3\2\2\2\u0a7e\u0a7c\3\2"+
		"\2\2\u0a7f\u0a83\7l\2\2\u0a80\u0a82\7\7\2\2\u0a81\u0a80\3\2\2\2\u0a82"+
		"\u0a85\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a86\3\2"+
		"\2\2\u0a85\u0a83\3\2\2\2\u0a86\u0a88\5R*\2\u0a87\u0a7c\3\2\2\2\u0a87\u0a88"+
		"\3\2\2\2\u0a88\u0117\3\2\2\2\u0a89\u0a8b\7\7\2\2\u0a8a\u0a89\3\2\2\2\u0a8b"+
		"\u0a8e\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a8f\3\2"+
		"\2\2\u0a8e\u0a8c\3\2\2\2\u0a8f\u0a93\t\f\2\2\u0a90\u0a92\7\7\2\2\u0a91"+
		"\u0a90\3\2\2\2\u0a92\u0a95\3\2\2\2\u0a93\u0a91\3\2\2\2\u0a93\u0a94\3\2"+
		"\2\2\u0a94\u0119\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a96\u0a98\7\7\2\2\u0a97"+
		"\u0a96\3\2\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a99\u0a9a\3\2"+
		"\2\2\u0a9a\u0a9c\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0aa0\7a\2\2\u0a9d"+
		"\u0a9f\7\7\2\2\u0a9e\u0a9d\3\2\2\2\u0a9f\u0aa2\3\2\2\2\u0aa0\u0a9e\3\2"+
		"\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u011b\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa3"+
		"\u0aa5\7\7\2\2\u0aa4\u0aa3\3\2\2\2\u0aa5\u0aa8\3\2\2\2\u0aa6\u0aa4\3\2"+
		"\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7\u0aa9\3\2\2\2\u0aa8\u0aa6\3\2\2\2\u0aa9"+
		"\u0aad\7_\2\2\u0aaa\u0aac\7\7\2\2\u0aab\u0aaa\3\2\2\2\u0aac\u0aaf\3\2"+
		"\2\2\u0aad\u0aab\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u011d\3\2\2\2\u0aaf"+
		"\u0aad\3\2\2\2\u0ab0\u0ab2\7\7\2\2\u0ab1\u0ab0\3\2\2\2\u0ab2\u0ab5\3\2"+
		"\2\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u0ab6\3\2\2\2\u0ab5"+
		"\u0ab3\3\2\2\2\u0ab6\u0aba\t\r\2\2\u0ab7\u0ab9\7\7\2\2\u0ab8\u0ab7\3\2"+
		"\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb"+
		"\u011f\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abf\7\7\2\2\u0abe\u0abd\3\2"+
		"\2\2\u0abf\u0ac2\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1"+
		"\u0ac3\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac3\u0ac7\t\16\2\2\u0ac4\u0ac6\7"+
		"\7\2\2\u0ac5\u0ac4\3\2\2\2\u0ac6\u0ac9\3\2\2\2\u0ac7\u0ac5\3\2\2\2\u0ac7"+
		"\u0ac8\3\2\2\2\u0ac8\u0121\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0aca\u0acc\7\7"+
		"\2\2\u0acb\u0aca\3\2\2\2\u0acc\u0acf\3\2\2\2\u0acd\u0acb\3\2\2\2\u0acd"+
		"\u0ace\3\2\2\2\u0ace\u0ad0\3\2\2\2\u0acf\u0acd\3\2\2\2\u0ad0\u0ad4\t\17"+
		"\2\2\u0ad1\u0ad3\7\7\2\2\u0ad2\u0ad1\3\2\2\2\u0ad3\u0ad6\3\2\2\2\u0ad4"+
		"\u0ad2\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u0123\3\2\2\2\u0ad6\u0ad4\3\2"+
		"\2\2\u0ad7\u0ad9\7\7\2\2\u0ad8\u0ad7\3\2\2\2\u0ad9\u0adc\3\2\2\2\u0ada"+
		"\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0add\3\2\2\2\u0adc\u0ada\3\2"+
		"\2\2\u0add\u0ae1\t\20\2\2\u0ade\u0ae0\7\7\2\2\u0adf\u0ade\3\2\2\2\u0ae0"+
		"\u0ae3\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0125\3\2"+
		"\2\2\u0ae3\u0ae1\3\2\2\2\u0ae4\u0ae6\7\7\2\2\u0ae5\u0ae4\3\2\2\2\u0ae6"+
		"\u0ae9\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8\u0aea\3\2"+
		"\2\2\u0ae9\u0ae7\3\2\2\2\u0aea\u0aee\t\21\2\2\u0aeb\u0aed\7\7\2\2\u0aec"+
		"\u0aeb\3\2\2\2\u0aed\u0af0\3\2\2\2\u0aee\u0aec\3\2\2\2\u0aee\u0aef\3\2"+
		"\2\2\u0aef\u0127\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af1\u0af3\7\7\2\2\u0af2"+
		"\u0af1\3\2\2\2\u0af3\u0af6\3\2\2\2\u0af4\u0af2\3\2\2\2\u0af4\u0af5\3\2"+
		"\2\2\u0af5\u0af7\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af7\u0afb\7u\2\2\u0af8"+
		"\u0afa\7\7\2\2\u0af9\u0af8\3\2\2\2\u0afa\u0afd\3\2\2\2\u0afb\u0af9\3\2"+
		"\2\2\u0afb\u0afc\3\2\2\2\u0afc\u0129\3\2\2\2\u0afd\u0afb\3\2\2\2\u0afe"+
		"\u0b00\7\7\2\2\u0aff\u0afe\3\2\2\2\u0b00\u0b03\3\2\2\2\u0b01\u0aff\3\2"+
		"\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b04\3\2\2\2\u0b03\u0b01\3\2\2\2\u0b04"+
		"\u0b08\t\22\2\2\u0b05\u0b07\7\7\2\2\u0b06\u0b05\3\2\2\2\u0b07\u0b0a\3"+
		"\2\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u012b\3\2\2\2\u0b0a"+
		"\u0b08\3\2\2\2\u0b0b\u0b0d\7\7\2\2\u0b0c\u0b0b\3\2\2\2\u0b0d\u0b10\3\2"+
		"\2\2\u0b0e\u0b0c\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b11\3\2\2\2\u0b10"+
		"\u0b0e\3\2\2\2\u0b11\u0b15\7c\2\2\u0b12\u0b14\7\7\2\2\u0b13\u0b12\3\2"+
		"\2\2\u0b14\u0b17\3\2\2\2\u0b15\u0b13\3\2\2\2\u0b15\u0b16\3\2\2\2\u0b16"+
		"\u012d\3\2\2\2\u0b17\u0b15\3\2\2\2\u0b18\u0b1a\7\7\2\2\u0b19\u0b18\3\2"+
		"\2\2\u0b1a\u0b1d\3\2\2\2\u0b1b\u0b19\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c"+
		"\u0b1e\3\2\2\2\u0b1d\u0b1b\3\2\2\2\u0b1e\u0b22\t\23\2\2\u0b1f\u0b21\7"+
		"\7\2\2\u0b20\u0b1f\3\2\2\2\u0b21\u0b24\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b22"+
		"\u0b23\3\2\2\2\u0b23\u012f\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b25\u0b27\7\7"+
		"\2\2\u0b26\u0b25\3\2\2\2\u0b27\u0b2a\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b28"+
		"\u0b29\3\2\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b28\3\2\2\2\u0b2b\u0b2f\t\24"+
		"\2\2\u0b2c\u0b2e\7\7\2\2\u0b2d\u0b2c\3\2\2\2\u0b2e\u0b31\3\2\2\2\u0b2f"+
		"\u0b2d\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0131\3\2\2\2\u0b31\u0b2f\3\2"+
		"\2\2\u0b32\u0b34\7\7\2\2\u0b33\u0b32\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35"+
		"\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b38\3\2\2\2\u0b37\u0b35\3\2"+
		"\2\2\u0b38\u0b3c\7]\2\2\u0b39\u0b3b\7\7\2\2\u0b3a\u0b39\3\2\2\2\u0b3b"+
		"\u0b3e\3\2\2\2\u0b3c\u0b3a\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0133\3\2"+
		"\2\2\u0b3e\u0b3c\3\2\2\2\u0b3f\u0b41\7\7\2\2\u0b40\u0b3f\3\2\2\2\u0b41"+
		"\u0b44\3\2\2\2\u0b42\u0b40\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b45\3\2"+
		"\2\2\u0b44\u0b42\3\2\2\2\u0b45\u0b49\t\25\2\2\u0b46\u0b48\7\7\2\2\u0b47"+
		"\u0b46\3\2\2\2\u0b48\u0b4b\3\2\2\2\u0b49\u0b47\3\2\2\2\u0b49\u0b4a\3\2"+
		"\2\2\u0b4a\u0135\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4c\u0b4d\t\26\2\2\u0b4d"+
		"\u0137\3\2\2\2\u0b4e\u0b54\5\u013a\u009e\2\u0b4f\u0b54\5> \2\u0b50\u0b54"+
		"\5\u0142\u00a2\2\u0b51\u0b54\5\u0148\u00a5\2\u0b52\u0b54\5\u014a\u00a6"+
		"\2\u0b53\u0b4e\3\2\2\2\u0b53\u0b4f\3\2\2\2\u0b53\u0b50\3\2\2\2\u0b53\u0b51"+
		"\3\2\2\2\u0b53\u0b52\3\2\2\2\u0b54\u0139\3\2\2\2\u0b55\u0b56\t\27\2\2"+
		"\u0b56\u013b\3\2\2\2\u0b57\u0b59\5\u009eP\2\u0b58\u0b5a\5\u0140\u00a1"+
		"\2\u0b59\u0b58\3\2\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0b59\3\2\2\2\u0b5b\u0b5c"+
		"\3\2\2\2\u0b5c\u0b5f\3\2\2\2\u0b5d\u0b5f\5\u013e\u00a0\2\u0b5e\u0b57\3"+
		"\2\2\2\u0b5e\u0b5d\3\2\2\2\u0b5f\u013d\3\2\2\2\u0b60\u0b64\7I\2\2\u0b61"+
		"\u0b63\7\7\2\2\u0b62\u0b61\3\2\2\2\u0b63\u0b66\3\2\2\2\u0b64\u0b62\3\2"+
		"\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b67\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b67"+
		"\u0b6b\5\u013c\u009f\2\u0b68\u0b6a\7\7\2\2\u0b69\u0b68\3\2\2\2\u0b6a\u0b6d"+
		"\3\2\2\2\u0b6b\u0b69\3\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6e\3\2\2\2\u0b6d"+
		"\u0b6b\3\2\2\2\u0b6e\u0b6f\7J\2\2\u0b6f\u013f\3\2\2\2\u0b70\u0b73\5\u0148"+
		"\u00a5\2\u0b71\u0b73\5\u014a\u00a6\2\u0b72\u0b70\3\2\2\2\u0b72\u0b71\3"+
		"\2\2\2\u0b73\u0141\3\2\2\2\u0b74\u0b76\5> \2\u0b75\u0b74\3\2\2\2\u0b75"+
		"\u0b76\3\2\2\2\u0b76\u0b79\3\2\2\2\u0b77\u0b7a\5\u0144\u00a3\2\u0b78\u0b7a"+
		"\5,\27\2\u0b79\u0b77\3\2\2\2\u0b79\u0b78\3\2\2\2\u0b7a\u0143\3\2\2\2\u0b7b"+
		"\u0b7d\5,\27\2\u0b7c\u0b7b\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7e\3\2"+
		"\2\2\u0b7e\u0b7f\5\u0146\u00a4\2\u0b7f\u0145\3\2\2\2\u0b80\u0b82\5\u015a"+
		"\u00ae\2\u0b81\u0b80\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82\u0b86\3\2\2\2\u0b83"+
		"\u0b85\7\7\2\2\u0b84\u0b83\3\2\2\2\u0b85\u0b88\3\2\2\2\u0b86\u0b84\3\2"+
		"\2\2\u0b86\u0b87\3\2\2\2\u0b87\u0b89\3\2\2\2\u0b88\u0b86\3\2\2\2\u0b89"+
		"\u0b8a\5\u0112\u008a\2\u0b8a\u0147\3\2\2\2\u0b8b\u0b8f\7K\2\2\u0b8c\u0b8e"+
		"\7\7\2\2\u0b8d\u0b8c\3\2\2\2\u0b8e\u0b91\3\2\2\2\u0b8f\u0b8d\3\2\2\2\u0b8f"+
		"\u0b90\3\2\2\2\u0b90\u0b92\3\2\2\2\u0b91\u0b8f\3\2\2\2\u0b92\u0ba3\5\u009e"+
		"P\2\u0b93\u0b95\7\7\2\2\u0b94\u0b93\3\2\2\2\u0b95\u0b98\3\2\2\2\u0b96"+
		"\u0b94\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b99\3\2\2\2\u0b98\u0b96\3\2"+
		"\2\2\u0b99\u0b9d\7e\2\2\u0b9a\u0b9c\7\7\2\2\u0b9b\u0b9a\3\2\2\2\u0b9c"+
		"\u0b9f\3\2\2\2\u0b9d\u0b9b\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e\u0ba0\3\2"+
		"\2\2\u0b9f\u0b9d\3\2\2\2\u0ba0\u0ba2\5\u009eP\2\u0ba1\u0b96\3\2\2\2\u0ba2"+
		"\u0ba5\3\2\2\2\u0ba3\u0ba1\3\2\2\2\u0ba3\u0ba4\3\2\2\2\u0ba4\u0ba9\3\2"+
		"\2\2\u0ba5\u0ba3\3\2\2\2\u0ba6\u0ba8\7\7\2\2\u0ba7\u0ba6\3\2\2\2\u0ba8"+
		"\u0bab\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0ba9\u0baa\3\2\2\2\u0baa\u0bac\3\2"+
		"\2\2\u0bab\u0ba9\3\2\2\2\u0bac\u0bad\7L\2\2\u0bad\u0149\3\2\2\2\u0bae"+
		"\u0baf\5\u014c\u00a7\2\u0baf\u0bb0\5\u0162\u00b2\2\u0bb0\u014b\3\2\2\2"+
		"\u0bb1\u0bb3\7\7\2\2\u0bb2\u0bb1\3\2\2\2\u0bb3\u0bb6\3\2\2\2\u0bb4\u0bb2"+
		"\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb7\3\2\2\2\u0bb6\u0bb4\3\2\2\2\u0bb7"+
		"\u0bbb\t\30\2\2\u0bb8\u0bba\7\7\2\2\u0bb9\u0bb8\3\2\2\2\u0bba\u0bbd\3"+
		"\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u014d\3\2\2\2\u0bbd"+
		"\u0bbb\3\2\2\2\u0bbe\u0bc2\5\u015a\u00ae\2\u0bbf\u0bc1\7\7\2\2\u0bc0\u0bbf"+
		"\3\2\2\2\u0bc1\u0bc4\3\2\2\2\u0bc2\u0bc0\3\2\2\2\u0bc2\u0bc3\3\2\2\2\u0bc3"+
		"\u0bcd\3\2\2\2\u0bc4\u0bc2\3\2\2\2\u0bc5\u0bc9\5\u0150\u00a9\2\u0bc6\u0bc8"+
		"\7\7\2\2\u0bc7\u0bc6\3\2\2\2\u0bc8\u0bcb\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bc9"+
		"\u0bca\3\2\2\2\u0bca\u0bcd\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcc\u0bbe\3\2"+
		"\2\2\u0bcc\u0bc5\3\2\2\2\u0bcd\u0bce\3\2\2\2\u0bce\u0bcc\3\2\2\2\u0bce"+
		"\u0bcf\3\2\2\2\u0bcf\u014f\3\2\2\2\u0bd0\u0bd5\5\u0152\u00aa\2\u0bd1\u0bd5"+
		"\5\u0154\u00ab\2\u0bd2\u0bd5\5\u0156\u00ac\2\u0bd3\u0bd5\5\u0158\u00ad"+
		"\2\u0bd4\u0bd0\3\2\2\2\u0bd4\u0bd1\3\2\2\2\u0bd4\u0bd2\3\2\2\2\u0bd4\u0bd3"+
		"\3\2\2\2\u0bd5\u0151\3\2\2\2\u0bd6\u0bd7\t\31\2\2\u0bd7\u0153\3\2\2\2"+
		"\u0bd8\u0bd9\t\32\2\2\u0bd9\u0155\3\2\2\2\u0bda\u0bdb\7-\2\2\u0bdb\u0157"+
		"\3\2\2\2\u0bdc\u0bdd\t\33\2\2\u0bdd\u0159\3\2\2\2\u0bde\u0be2\5\u015c"+
		"\u00af\2\u0bdf\u0be1\7\7\2\2\u0be0\u0bdf\3\2\2\2\u0be1\u0be4\3\2\2\2\u0be2"+
		"\u0be0\3\2\2\2\u0be2\u0be3\3\2\2\2\u0be3\u0be6\3\2\2\2\u0be4\u0be2\3\2"+
		"\2\2\u0be5\u0bde\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0be5\3\2\2\2\u0be7"+
		"\u0be8\3\2\2\2\u0be8\u015b\3\2\2\2\u0be9\u0bff\7r\2\2\u0bea\u0c00\5\u015e"+
		"\u00b0\2\u0beb\u0bef\7K\2\2\u0bec\u0bee\7\7\2\2\u0bed\u0bec\3\2\2\2\u0bee"+
		"\u0bf1\3\2\2\2\u0bef\u0bed\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0bf3\3\2"+
		"\2\2\u0bf1\u0bef\3\2\2\2\u0bf2\u0bf4\5\u015e\u00b0\2\u0bf3\u0bf2\3\2\2"+
		"\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf3\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bfa"+
		"\3\2\2\2\u0bf7\u0bf9\7\7\2\2\u0bf8\u0bf7\3\2\2\2\u0bf9\u0bfc\3\2\2\2\u0bfa"+
		"\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bfd\3\2\2\2\u0bfc\u0bfa\3\2"+
		"\2\2\u0bfd\u0bfe\7L\2\2\u0bfe\u0c00\3\2\2\2\u0bff\u0bea\3\2\2\2\u0bff"+
		"\u0beb\3\2\2\2\u0c00\u015d\3\2\2\2\u0c01\u0c03\5\u0160\u00b1\2\u0c02\u0c04"+
		"\5,\27\2\u0c03\u0c02\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u015f\3\2\2\2\u0c05"+
		"\u0c16\5\u0162\u00b2\2\u0c06\u0c08\7\7\2\2\u0c07\u0c06\3\2\2\2\u0c08\u0c0b"+
		"\3\2\2\2\u0c09\u0c07\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0c0c\3\2\2\2\u0c0b"+
		"\u0c09\3\2\2\2\u0c0c\u0c10\7f\2\2\u0c0d\u0c0f\7\7\2\2\u0c0e\u0c0d\3\2"+
		"\2\2\u0c0f\u0c12\3\2\2\2\u0c10\u0c0e\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11"+
		"\u0c13\3\2\2\2\u0c12\u0c10\3\2\2\2\u0c13\u0c15\5\u0162\u00b2\2\u0c14\u0c09"+
		"\3\2\2\2\u0c15\u0c18\3\2\2\2\u0c16\u0c14\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17"+
		"\u0161\3\2\2\2\u0c18\u0c16\3\2\2\2\u0c19\u0c1a\7\u0095\2\2\u0c1a\u0163"+
		"\3\2\2\2\u0c1b\u0c1d\7\7\2\2\u0c1c\u0c1b\3\2\2\2\u0c1d\u0c1e\3\2\2\2\u0c1e"+
		"\u0c1c\3\2\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f\u0c2e\3\2\2\2\u0c20\u0c22\7\7"+
		"\2\2\u0c21\u0c20\3\2\2\2\u0c22\u0c25\3\2\2\2\u0c23\u0c21\3\2\2\2\u0c23"+
		"\u0c24\3\2\2\2\u0c24\u0c26\3\2\2\2\u0c25\u0c23\3\2\2\2\u0c26\u0c2a\7n"+
		"\2\2\u0c27\u0c29\7\7\2\2\u0c28\u0c27\3\2\2\2\u0c29\u0c2c\3\2\2\2\u0c2a"+
		"\u0c28\3\2\2\2\u0c2a\u0c2b\3\2\2\2\u0c2b\u0c2e\3\2\2\2\u0c2c\u0c2a\3\2"+
		"\2\2\u0c2d\u0c1c\3\2\2\2\u0c2d\u0c23\3\2\2\2\u0c2e\u0165\3\2\2\2\u01c4"+
		"\u0169\u0170\u0177\u017a\u017e\u0181\u0186\u018c\u0191\u019a\u019e\u01aa"+
		"\u01af\u01b1\u01b3\u01b7\u01c8\u01cb\u01d1\u01d8\u01dc\u01e1\u01e5\u01ea"+
		"\u01f1\u01f5\u01fa\u01fe\u0201\u0207\u020e\u0212\u0217\u021e\u0222\u0227"+
		"\u022b\u022e\u0234\u023b\u023f\u0244\u0248\u024b\u0251\u0258\u025c\u0261"+
		"\u0268\u026c\u026f\u0275\u0278\u0280\u0287\u028e\u0294\u0297\u029c\u02a2"+
		"\u02a5\u02aa\u02b1\u02b8\u02bf\u02c6\u02ca\u02d0\u02d7\u02dd\u02e2\u02e5"+
		"\u02eb\u02f2\u02f8\u02fc\u0304\u030b\u0312\u0318\u031e\u0321\u0326\u032b"+
		"\u0331\u0338\u033f\u0343\u0348\u034c\u0352\u035b\u0361\u0367\u0371\u0376"+
		"\u037c\u0385\u038b\u0391\u0395\u039b\u03a2\u03a9\u03af\u03b5\u03b9\u03bf"+
		"\u03c4\u03c8\u03ce\u03d5\u03dc\u03e2\u03e8\u03ee\u03f4\u03fb\u0402\u0409"+
		"\u040f\u0412\u0418\u041d\u0422\u0427\u042f\u0437\u0439\u043f\u0446\u044e"+
		"\u0454\u045b\u0462\u0468\u046b\u0470\u0479\u0480\u0489\u0490\u0497\u049b"+
		"\u04a0\u04a6\u04ad\u04b4\u04b8\u04bd\u04c1\u04c7\u04cd\u04d3\u04db\u04e0"+
		"\u04e3\u04e9\u04f0\u04f4\u04f9\u0502\u0506\u050b\u0512\u0518\u051b\u0520"+
		"\u0529\u0530\u0536\u053a\u0540\u0544\u0549\u054d\u0550\u0556\u055a\u055f"+
		"\u0566\u056a\u0570\u0576\u057c\u0585\u0588\u058e\u0595\u059c\u05a0\u05a5"+
		"\u05a9\u05ac\u05b2\u05b9\u05bd\u05c3\u05ca\u05ce\u05d4\u05d8\u05da\u05df"+
		"\u05e5\u05eb\u05f2\u05f6\u05fb\u0602\u0606\u060b\u060f\u0612\u0618\u061f"+
		"\u0626\u062b\u0630\u0637\u063b\u0640\u0644\u0647\u064d\u0654\u0658\u065e"+
		"\u0665\u0669\u066c\u0672\u0676\u067b\u0682\u0689\u0690\u0694\u0699\u069d"+
		"\u06a3\u06aa\u06b1\u06b7\u06ba\u06bf\u06c5\u06cb\u06d2\u06d6\u06dc\u06e3"+
		"\u06ed\u06f1\u06f7\u06fe\u0707\u070d\u0710\u0715\u0719\u071e\u0725\u0728"+
		"\u072e\u0735\u073c\u0740\u0745\u074b\u0752\u0756\u075c\u0763\u076a\u0771"+
		"\u077a\u0781\u0788\u078f\u0798\u079f\u07a6\u07ad\u07b4\u07bd\u07cb\u07d4"+
		"\u07dd\u07e6\u07ef\u07f6\u07ff\u0807\u0810\u0817\u081f\u0828\u0831\u083a"+
		"\u0843\u0849\u0852\u0862\u086c\u0872\u087b\u087f\u0884\u088b\u0891\u0897"+
		"\u08a2\u08a8\u08af\u08b6\u08bd\u08c4\u08ca\u08d0\u08d7\u08db\u08e1\u08e8"+
		"\u08ef\u08f6\u08ff\u0906\u090d\u0914\u091b\u0921\u0926\u092f\u0936\u093d"+
		"\u0943\u0949\u0950\u0955\u095b\u0962\u0966\u096c\u0971\u0977\u097e\u0984"+
		"\u098a\u098e\u0994\u099b\u099f\u09a5\u09ac\u09b3\u09ba\u09c0\u09c6\u09cd"+
		"\u09d6\u09df\u09e5\u09ee\u09f2\u0a04\u0a1e\u0a23\u0a25\u0a2f\u0a31\u0a46"+
		"\u0a4a\u0a4f\u0a56\u0a59\u0a5f\u0a68\u0a6f\u0a75\u0a7c\u0a83\u0a87\u0a8c"+
		"\u0a93\u0a99\u0aa0\u0aa6\u0aad\u0ab3\u0aba\u0ac0\u0ac7\u0acd\u0ad4\u0ada"+
		"\u0ae1\u0ae7\u0aee\u0af4\u0afb\u0b01\u0b08\u0b0e\u0b15\u0b1b\u0b22\u0b28"+
		"\u0b2f\u0b35\u0b3c\u0b42\u0b49\u0b53\u0b5b\u0b5e\u0b64\u0b6b\u0b72\u0b75"+
		"\u0b79\u0b7c\u0b81\u0b86\u0b8f\u0b96\u0b9d\u0ba3\u0ba9\u0bb4\u0bbb\u0bc2"+
		"\u0bc9\u0bcc\u0bce\u0bd4\u0be2\u0be7\u0bef\u0bf5\u0bfa\u0bff\u0c03\u0c09"+
		"\u0c10\u0c16\u0c1e\u0c23\u0c2a\u0c2d";
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