// Generated from C:/Users/erik-/IdeaProjects/AprlC/src/aprl\AprlParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DelimitedComment=1, DocComment=2, LineComment=3, WS=4, NL=5, USING=6, 
		ALIAS=7, CLASS=8, INTERFACE=9, STRUCT=10, DOCUMENT=11, ANONYMOUS=12, ENUM=13, 
		ANNOTATION=14, PARTNER=15, BLUEPRINT=16, THIS=17, SUPER=18, SUB_=19, ACTUAL=20, 
		INIT=21, EXEC=22, PRIVATE=23, BOUNDED=24, LOCAL=25, PUBLIC=26, GETTER=27, 
		SETTER=28, DEF=29, CONST=30, VAR=31, VAL=32, ABSTRACT=33, COVER=34, OPEN=35, 
		FINAL=36, INLINE=37, EXTERNAL=38, SYNC=39, FUNCTION=40, SCRIPT=41, OPERATOR=42, 
		EXTENSION=43, PARAMS=44, IF=45, UNLESS=46, ELSIF=47, ELSE=48, FOR=49, 
		MATCH=50, WHEN=51, DO=52, WHILE=53, RETURN=54, BREAK=55, CONTINUE=56, 
		AS=57, AS_QUEST=58, IS=59, NOT_IS=60, IN=61, NOT_IN=62, TRY=63, TRY_QUEST=64, 
		CATCH=65, FINALLY=66, TRIGGER=67, TRUE=68, FALSE=69, NONE=70, NULL=71, 
		LPAREN=72, RPAREN=73, LSQUARE=74, RSQUARE=75, LCURLY=76, RCURLY=77, ASSIGN=78, 
		DEFINE=79, ADD=80, ADD_ASSIGN=81, INCR=82, SUB=83, SUB_ASSIGN=84, DECR=85, 
		MUL=86, MUL_ASSIGN=87, DIV=88, DIV_ASSIGN=89, MOD=90, MOD_ASSIGN=91, EXP=92, 
		EXP_ASSIGN=93, CONJ=94, CONJ_ASSIGN=95, DISJ=96, DISJ_ASSIGN=97, XOR=98, 
		XOR_ASSIGN=99, COMMA=100, PERIOD=101, QUEST_PERIOD=102, DOWNTO=103, TO=104, 
		UNTIL=105, TRIPLE_PERIOD=106, COLON=107, DOUBLE_COLON=108, SEMICOLON=109, 
		EXCL=110, DOUBLE_EXCL=111, QUEST=112, HASH=113, AT=114, DOUBLE_AT=115, 
		ELVIS=116, ELVIS_ASSIGN=117, EQUAL=118, NEQUAL=119, IDENTICAL=120, NIDENTICAL=121, 
		LANGLE=122, NLANGLE=123, LEQ=124, NLEQ=125, RANGLE=126, NRANGLE=127, GEQ=128, 
		NGEQ=129, LARROW=130, RARROW=131, RARROW_THICK=132, SINGLE_QUOTE=133, 
		QUOTE_OPEN=134, TRIPLE_QUOTE_OPEN=135, IntegerLiteral=136, LongLiteral=137, 
		ShortLiteral=138, ByteLiteral=139, FloatLiteral=140, DoubleLiteral=141, 
		ComplexLiteral=142, HexLiteral=143, BinLiteral=144, OctalLiteral=145, 
		BooleanLiteral=146, TrileanLiteral=147, Identifier=148, FieldIdentifier=149, 
		CharacterLiteral=150, UNICODE_CLASS_LL=151, UNICODE_CLASS_LM=152, UNICODE_CLASS_LO=153, 
		UNICODE_CLASS_LT=154, UNICODE_CLASS_LU=155, UNICODE_CLASS_ND=156, UNICODE_CLASS_NL=157, 
		QUOTE_CLOSE=158, LineStrRef=159, LineStrText=160, LineStrEscapedChar=161, 
		LineStrExprStart=162, TRIPLE_QUOTE_CLOSE=163, MultiLineStrQuote=164, MultiLineStrRef=165, 
		MultiLineStrText=166, MultiLineStrEscapedChar=167, MultiLineStrExprStart=168, 
		MultiLineNL=169;
	public static final int
		RULE_aprlFile = 0, RULE_preamble = 1, RULE_namespaceHeader = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_importIdentifier = 5, RULE_allImport = 6, 
		RULE_multiImport = 7, RULE_singleImport = 8, RULE_topLevelObject = 9, 
		RULE_classDeclaration = 10, RULE_interfaceDeclaration = 11, RULE_annotationDeclaration = 12, 
		RULE_documentDeclaration = 13, RULE_primaryConstructor = 14, RULE_classParameters = 15, 
		RULE_classParameter = 16, RULE_valOrVar = 17, RULE_delegationSpecifiers = 18, 
		RULE_delegationSpecifier = 19, RULE_interfaceDelegationSpecifiers = 20, 
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
		RULE_blueprintDeclaration = 69, RULE_blueprintBody = 70, RULE_blueprintMember = 71, 
		RULE_block = 72, RULE_statements = 73, RULE_statement = 74, RULE_localVariableDeclaration = 75, 
		RULE_loopStatement = 76, RULE_forStatement = 77, RULE_whileStatement = 78, 
		RULE_assignment = 79, RULE_expression = 80, RULE_disjunction = 81, RULE_conjunction = 82, 
		RULE_equalityComparison = 83, RULE_identityComparison = 84, RULE_comparison = 85, 
		RULE_namedInfixExpression = 86, RULE_namedInfix = 87, RULE_elvisExpression = 88, 
		RULE_infixFunctionCall = 89, RULE_rangeExpression = 90, RULE_xorExpression = 91, 
		RULE_additiveExpression = 92, RULE_multiplicativeExpression = 93, RULE_exponentialExpression = 94, 
		RULE_asExpression = 95, RULE_prefixUnaryExpression = 96, RULE_postfixUnaryExpression = 97, 
		RULE_atomicExpression = 98, RULE_parenthesizedExpression = 99, RULE_contextualReference = 100, 
		RULE_callableReference = 101, RULE_collectionLiteral = 102, RULE_thisExpression = 103, 
		RULE_superExpression = 104, RULE_conditionalExpression = 105, RULE_ifExpression = 106, 
		RULE_elsifExpression = 107, RULE_matchExpression = 108, RULE_matchEntry = 109, 
		RULE_optionalTryExpression = 110, RULE_tryExpression = 111, RULE_catchBlock = 112, 
		RULE_caughtException = 113, RULE_finallyBlock = 114, RULE_jumpExpression = 115, 
		RULE_triggerExpression = 116, RULE_returnExpression = 117, RULE_continueExpression = 118, 
		RULE_breakExpression = 119, RULE_literalConstant = 120, RULE_nullLiteral = 121, 
		RULE_boolLiteral = 122, RULE_integerLiteral = 123, RULE_longLiteral = 124, 
		RULE_shortLiteral = 125, RULE_byteLiteral = 126, RULE_floatLiteral = 127, 
		RULE_doubleLiteral = 128, RULE_complexLiteral = 129, RULE_characterLiteral = 130, 
		RULE_stringLiteral = 131, RULE_lineStringLiteral = 132, RULE_multiLineStringLiteral = 133, 
		RULE_lineStringContent = 134, RULE_lineStringExpression = 135, RULE_multiLineStringContent = 136, 
		RULE_multiLineStringExpression = 137, RULE_lambdaLiteral = 138, RULE_lambdaParameters = 139, 
		RULE_lambdaParameter = 140, RULE_assignmentOperator = 141, RULE_disjunctionOperator = 142, 
		RULE_conjunctionOperator = 143, RULE_equalityOperator = 144, RULE_identityOperator = 145, 
		RULE_comparisonOperator = 146, RULE_inOperator = 147, RULE_isOperator = 148, 
		RULE_elvisOperator = 149, RULE_toOperator = 150, RULE_xorOperator = 151, 
		RULE_additiveOperator = 152, RULE_multiplicativeOperator = 153, RULE_exponentialOperator = 154, 
		RULE_asOperator = 155, RULE_unaryPrefix = 156, RULE_unaryPostfix = 157, 
		RULE_postfixUnaryOperator = 158, RULE_assignableExpression = 159, RULE_assignableSuffix = 160, 
		RULE_callSuffix = 161, RULE_lambdaCallSuffix = 162, RULE_annotatedLambda = 163, 
		RULE_indexingSuffix = 164, RULE_navigationSuffix = 165, RULE_memberAccessOperator = 166, 
		RULE_modifierList = 167, RULE_modifier = 168, RULE_visibilityModifier = 169, 
		RULE_inheritanceModifier = 170, RULE_parameterModifier = 171, RULE_functionModifier = 172, 
		RULE_annotations = 173, RULE_annotation = 174, RULE_unescapedAnnotation = 175, 
		RULE_identifier = 176, RULE_simpleIdentifier = 177, RULE_semi = 178;
	private static String[] makeRuleNames() {
		return new String[] {
			"aprlFile", "preamble", "namespaceHeader", "importList", "importHeader", 
			"importIdentifier", "allImport", "multiImport", "singleImport", "topLevelObject", 
			"classDeclaration", "interfaceDeclaration", "annotationDeclaration", 
			"documentDeclaration", "primaryConstructor", "classParameters", "classParameter", 
			"valOrVar", "delegationSpecifiers", "delegationSpecifier", "interfaceDelegationSpecifiers", 
			"valueArguments", "valueArgument", "secondaryConstructor", "constructorDelegationCall", 
			"classBody", "classMember", "loadScript", "initializerBody", "partnerDeclaration", 
			"typeArguments", "typeProjection", "typeProjectionModifierList", "typeProjectionModifier", 
			"typeParameters", "typeParameter", "typeParameterModifierList", "typeParameterModifier", 
			"reificationModifier", "varianceModifier", "type", "functionType", "receiverType", 
			"functionTypeParameters", "parenthesizedType", "arrayType", "nullableType", 
			"structDeclaration", "structBody", "structMember", "enumDeclaration", 
			"enumBody", "enumEntries", "enumEntry", "extensionDeclaration", "extensionBody", 
			"extensionMember", "propertyDeclaration", "variableDeclaration", "propertyBody", 
			"getter", "setter", "functionValueParameterWithOptionalType", "parameterWithOptionalType", 
			"functionDeclaration", "functionValueParameters", "functionValueParameter", 
			"parameter", "functionBody", "blueprintDeclaration", "blueprintBody", 
			"blueprintMember", "block", "statements", "statement", "localVariableDeclaration", 
			"loopStatement", "forStatement", "whileStatement", "assignment", "expression", 
			"disjunction", "conjunction", "equalityComparison", "identityComparison", 
			"comparison", "namedInfixExpression", "namedInfix", "elvisExpression", 
			"infixFunctionCall", "rangeExpression", "xorExpression", "additiveExpression", 
			"multiplicativeExpression", "exponentialExpression", "asExpression", 
			"prefixUnaryExpression", "postfixUnaryExpression", "atomicExpression", 
			"parenthesizedExpression", "contextualReference", "callableReference", 
			"collectionLiteral", "thisExpression", "superExpression", "conditionalExpression", 
			"ifExpression", "elsifExpression", "matchExpression", "matchEntry", "optionalTryExpression", 
			"tryExpression", "catchBlock", "caughtException", "finallyBlock", "jumpExpression", 
			"triggerExpression", "returnExpression", "continueExpression", "breakExpression", 
			"literalConstant", "nullLiteral", "boolLiteral", "integerLiteral", "longLiteral", 
			"shortLiteral", "byteLiteral", "floatLiteral", "doubleLiteral", "complexLiteral", 
			"characterLiteral", "stringLiteral", "lineStringLiteral", "multiLineStringLiteral", 
			"lineStringContent", "lineStringExpression", "multiLineStringContent", 
			"multiLineStringExpression", "lambdaLiteral", "lambdaParameters", "lambdaParameter", 
			"assignmentOperator", "disjunctionOperator", "conjunctionOperator", "equalityOperator", 
			"identityOperator", "comparisonOperator", "inOperator", "isOperator", 
			"elvisOperator", "toOperator", "xorOperator", "additiveOperator", "multiplicativeOperator", 
			"exponentialOperator", "asOperator", "unaryPrefix", "unaryPostfix", "postfixUnaryOperator", 
			"assignableExpression", "assignableSuffix", "callSuffix", "lambdaCallSuffix", 
			"annotatedLambda", "indexingSuffix", "navigationSuffix", "memberAccessOperator", 
			"modifierList", "modifier", "visibilityModifier", "inheritanceModifier", 
			"parameterModifier", "functionModifier", "annotations", "annotation", 
			"unescapedAnnotation", "identifier", "simpleIdentifier", "semi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'using'", "'alias'", "'class'", 
			"'interface'", "'struct'", "'document'", "'anonymous'", "'enum'", "'annotation'", 
			"'partner'", "'blueprint'", "'this'", "'super'", "'sub'", "'actual'", 
			"'init'", "'exec'", "'private'", "'bounded'", "'local'", "'public'", 
			"'getter'", "'setter'", "'def'", "'const'", "'var'", "'val'", "'abstract'", 
			"'cover'", "'open'", "'final'", "'inline'", "'external'", "'sync'", "'function'", 
			"'script'", "'operator'", "'extension'", "'params'", "'if'", "'unless'", 
			"'elsif'", "'else'", "'for'", "'match'", "'when'", "'do'", "'while'", 
			"'return'", "'break'", "'continue'", "'as'", "'as?'", "'is'", "'!is'", 
			"'in'", "'!in'", "'try'", "'try?'", "'catch'", "'finally'", "'trigger'", 
			"'true'", "'false'", "'none'", "'null'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'='", "':='", "'+'", "'+='", "'++'", "'-'", "'-='", "'--'", 
			"'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'**'", "'**='", null, null, 
			null, null, null, null, "','", "'.'", "'?.'", "'>..'", "'..'", "'..<'", 
			"'...'", "':'", "'::'", "';'", "'!'", "'!!'", "'?'", "'#'", "'@'", "'@@'", 
			"'?:'", "'?='", "'=='", "'!='", "'==='", "'!=='", "'<'", "'!<'", "'<='", 
			"'!<='", "'>'", "'!>'", "'>='", "'!>='", "'<-'", "'->'", "'=>'", "'''", 
			null, "'\"\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "DocComment", "LineComment", "WS", "NL", "USING", 
			"ALIAS", "CLASS", "INTERFACE", "STRUCT", "DOCUMENT", "ANONYMOUS", "ENUM", 
			"ANNOTATION", "PARTNER", "BLUEPRINT", "THIS", "SUPER", "SUB_", "ACTUAL", 
			"INIT", "EXEC", "PRIVATE", "BOUNDED", "LOCAL", "PUBLIC", "GETTER", "SETTER", 
			"DEF", "CONST", "VAR", "VAL", "ABSTRACT", "COVER", "OPEN", "FINAL", "INLINE", 
			"EXTERNAL", "SYNC", "FUNCTION", "SCRIPT", "OPERATOR", "EXTENSION", "PARAMS", 
			"IF", "UNLESS", "ELSIF", "ELSE", "FOR", "MATCH", "WHEN", "DO", "WHILE", 
			"RETURN", "BREAK", "CONTINUE", "AS", "AS_QUEST", "IS", "NOT_IS", "IN", 
			"NOT_IN", "TRY", "TRY_QUEST", "CATCH", "FINALLY", "TRIGGER", "TRUE", 
			"FALSE", "NONE", "NULL", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", 
			"RCURLY", "ASSIGN", "DEFINE", "ADD", "ADD_ASSIGN", "INCR", "SUB", "SUB_ASSIGN", 
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
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(NL);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(364);
			preamble();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(365);
				match(NL);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << BLUEPRINT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(371);
				topLevelObject();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(373); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(372);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(375); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << BLUEPRINT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
						{
						setState(377);
						topLevelObject();
						}
					}

					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(387);
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
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(389);
				namespaceHeader();
				}
			}

			setState(392);
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
			setState(394);
			identifier();
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(395);
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
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(398);
				importHeader();
				}
				}
				setState(403);
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
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(USING);
			setState(405);
			importIdentifier();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				importIdentifier();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(413);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(416); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ImportIdentifierContext extends ParserRuleContext {
		public SingleImportContext singleImport() {
			return getRuleContext(SingleImportContext.class,0);
		}
		public AllImportContext allImport() {
			return getRuleContext(AllImportContext.class,0);
		}
		public MultiImportContext multiImport() {
			return getRuleContext(MultiImportContext.class,0);
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
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				singleImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				allImport();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				multiImport();
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

	public static class AllImportContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
		public TerminalNode MUL() { return getToken(AprlParser.MUL, 0); }
		public AllImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterAllImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitAllImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitAllImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllImportContext allImport() throws RecognitionException {
		AllImportContext _localctx = new AllImportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_allImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			identifier();
			setState(424);
			match(PERIOD);
			setState(425);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiImportContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
		public TerminalNode LSQUARE() { return getToken(AprlParser.LSQUARE, 0); }
		public List<SingleImportContext> singleImport() {
			return getRuleContexts(SingleImportContext.class);
		}
		public SingleImportContext singleImport(int i) {
			return getRuleContext(SingleImportContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(AprlParser.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AprlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AprlParser.COMMA, i);
		}
		public MultiImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterMultiImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitMultiImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitMultiImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiImportContext multiImport() throws RecognitionException {
		MultiImportContext _localctx = new MultiImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			identifier();
			setState(428);
			match(PERIOD);
			setState(429);
			match(LSQUARE);
			setState(430);
			singleImport();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				singleImport();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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

	public static class SingleImportContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ALIAS() { return getToken(AprlParser.ALIAS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
		enterRule(_localctx, 16, RULE_singleImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			identifier();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(441);
				match(ALIAS);
				setState(442);
				simpleIdentifier();
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
		public BlueprintDeclarationContext blueprintDeclaration() {
			return getRuleContext(BlueprintDeclarationContext.class,0);
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
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
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
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(454);
				blueprintDeclaration();
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(AprlParser.CLASS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			modifierList();
			setState(458);
			match(CLASS);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(459);
				match(NL);
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			simpleIdentifier();
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(466);
					match(NL);
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				typeParameters();
				}
				break;
			}
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(475);
					match(NL);
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				primaryConstructor();
				}
				break;
			}
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				match(LARROW);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(491);
					match(NL);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				delegationSpecifiers();
				}
				break;
			}
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(500);
					match(NL);
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(506);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(AprlParser.INTERFACE, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			setState(509);
			modifierList();
			setState(510);
			match(INTERFACE);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(511);
				match(NL);
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			simpleIdentifier();
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
				typeParameters();
				}
				break;
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(527);
					match(NL);
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				match(LARROW);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(534);
					match(NL);
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				interfaceDelegationSpecifiers();
				}
				break;
			}
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(543);
					match(NL);
					}
					}
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(549);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ANNOTATION() { return getToken(AprlParser.ANNOTATION, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			setState(552);
			modifierList();
			setState(553);
			match(ANNOTATION);
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
			simpleIdentifier();
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(561);
					match(NL);
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(567);
				primaryConstructor();
				}
				break;
			}
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(570);
					match(NL);
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(576);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode DOCUMENT() { return getToken(AprlParser.DOCUMENT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
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
			setState(579);
			modifierList();
			setState(580);
			match(DOCUMENT);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(581);
				match(NL);
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			simpleIdentifier();
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
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
				typeParameters();
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(597);
				match(NL);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			primaryConstructor();
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode INIT() { return getToken(AprlParser.INIT, 0); }
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
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(613);
				modifierList();
				setState(614);
				match(INIT);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(615);
					match(NL);
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(623);
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
			setState(625);
			match(LPAREN);
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(626);
					match(NL);
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(632);
				classParameter();
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(633);
							match(NL);
							}
							}
							setState(638);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(639);
						match(COMMA);
						setState(643);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(640);
								match(NL);
								}
								} 
							}
							setState(645);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						}
						setState(646);
						classParameter();
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(654);
				match(NL);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValOrVarContext valOrVar() {
			return getRuleContext(ValOrVarContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode ASSIGN() { return getToken(AprlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(662);
			modifierList();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==VAL) {
				{
				setState(663);
				valOrVar();
				}
			}

			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(666);
				match(NL);
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			simpleIdentifier();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(673);
				match(NL);
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(COLON);
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
			type();
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(687);
					match(NL);
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(693);
				match(ASSIGN);
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

	public static class ValOrVarContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public ValOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterValOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitValOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitValOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValOrVarContext valOrVar() throws RecognitionException {
		ValOrVarContext _localctx = new ValOrVarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valOrVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			delegationSpecifier();
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(706);
						match(NL);
						}
						}
						setState(711);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(712);
					match(COMMA);
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(713);
						match(NL);
						}
						}
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(719);
					delegationSpecifier();
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 38, RULE_delegationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			identifier();
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(726);
				typeArguments();
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(729);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(732);
			identifier();
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(733);
						match(NL);
						}
						}
						setState(738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(739);
					match(COMMA);
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(740);
						match(NL);
						}
						}
						setState(745);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(746);
					identifier();
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
			setState(752);
			match(LPAREN);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(753);
				match(NL);
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRY_QUEST - 64)) | (1L << (TRIGGER - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (LPAREN - 64)) | (1L << (LSQUARE - 64)) | (1L << (LCURLY - 64)) | (1L << (ADD - 64)) | (1L << (INCR - 64)) | (1L << (SUB - 64)) | (1L << (DECR - 64)) | (1L << (PERIOD - 64)) | (1L << (EXCL - 64)) | (1L << (HASH - 64)) | (1L << (DOUBLE_AT - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (QUOTE_OPEN - 134)) | (1L << (TRIPLE_QUOTE_OPEN - 134)) | (1L << (IntegerLiteral - 134)) | (1L << (LongLiteral - 134)) | (1L << (ShortLiteral - 134)) | (1L << (ByteLiteral - 134)) | (1L << (FloatLiteral - 134)) | (1L << (DoubleLiteral - 134)) | (1L << (ComplexLiteral - 134)) | (1L << (Identifier - 134)) | (1L << (CharacterLiteral - 134)))) != 0)) {
				{
				setState(759);
				valueArgument();
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(760);
							match(NL);
							}
							}
							setState(765);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(766);
						match(COMMA);
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
						setState(773);
						valueArgument();
						}
						} 
					}
					setState(778);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(779);
					match(NL);
					}
					}
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(787);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			annotations();
			setState(790);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode INIT() { return getToken(AprlParser.INIT, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
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
			setState(792);
			modifierList();
			setState(793);
			match(INIT);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(794);
				match(NL);
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800);
			functionValueParameters();
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(801);
					match(NL);
					}
					}
					setState(806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(807);
				match(COLON);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(808);
					match(NL);
					}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(814);
				constructorDelegationCall();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					match(NL);
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(823);
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
			setState(826);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==SUPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(827);
				match(NL);
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
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
			setState(835);
			match(LCURLY);
			setState(839);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << BLUEPRINT) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(842);
				classMember();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(848);
				match(NL);
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
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
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(856);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(857);
				secondaryConstructor();
				}
				break;
			case 3:
				{
				setState(858);
				loadScript();
				}
				break;
			case 4:
				{
				setState(859);
				initializerBody();
				}
				break;
			case 5:
				{
				setState(860);
				partnerDeclaration();
				}
				break;
			}
			setState(864); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(863);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(866); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
			setState(868);
			match(EXEC);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(869);
				match(NL);
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(875);
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
			setState(877);
			match(INIT);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(878);
				match(NL);
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode PARTNER() { return getToken(AprlParser.PARTNER, 0); }
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
			setState(886);
			modifierList();
			setState(887);
			match(PARTNER);
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(888);
					match(NL);
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
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
			setState(897);
			match(LANGLE);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(898);
				match(NL);
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			typeProjection();
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(905);
						match(NL);
						}
						}
						setState(910);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(911);
					match(COMMA);
					setState(912);
					typeProjection();
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
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
		public TypeProjectionModifierListContext typeProjectionModifierList() {
			return getRuleContext(TypeProjectionModifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(930);
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
				setState(926);
				typeProjectionModifierList();
				setState(927);
				type();
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeProjectionModifierContext typeProjectionModifier() {
			return getRuleContext(TypeProjectionModifierContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			annotations();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER || _la==SUB_) {
				{
				setState(933);
				typeProjectionModifier();
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

	public static class TypeProjectionModifierContext extends ParserRuleContext {
		public VarianceModifierContext varianceModifier() {
			return getRuleContext(VarianceModifierContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			varianceModifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(938);
			match(LANGLE);
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(939);
					match(NL);
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(945);
			typeParameter();
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(946);
						match(NL);
						}
						}
						setState(951);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(952);
					match(COMMA);
					setState(956);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(953);
							match(NL);
							}
							} 
						}
						setState(958);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
					}
					setState(959);
					typeParameter();
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
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
		public TypeParameterModifierListContext typeParameterModifierList() {
			return getRuleContext(TypeParameterModifierListContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(AprlParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(973);
			typeParameterModifierList();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(974);
				match(NL);
				}
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(980);
			simpleIdentifier();
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(981);
					match(NL);
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(987);
				match(COLON);
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(988);
					match(NL);
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(994);
				type();
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						match(CONJ);
						setState(1005);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1002);
							match(NL);
							}
							}
							setState(1007);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1008);
						type();
						}
						} 
					}
					setState(1013);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeParameterModifierContext typeParameterModifier() {
			return getRuleContext(TypeParameterModifierContext.class,0);
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
			setState(1016);
			annotations();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << SUB_) | (1L << ACTUAL))) != 0)) {
				{
				setState(1017);
				typeParameterModifier();
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public ReificationModifierContext reificationModifier() {
			return getRuleContext(ReificationModifierContext.class,0);
		}
		public VarianceModifierContext varianceModifier() {
			return getRuleContext(VarianceModifierContext.class,0);
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
			setState(1022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				reificationModifier();
				}
				break;
			case SUPER:
			case SUB_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				varianceModifier();
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
			setState(1024);
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
			setState(1026);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			annotations();
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1029);
				functionType();
				}
				break;
			case 2:
				{
				setState(1030);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1031);
				arrayType();
				}
				break;
			case 4:
				{
				setState(1032);
				nullableType();
				}
				break;
			case 5:
				{
				setState(1033);
				identifier();
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1034);
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
			setState(1039);
			functionTypeParameters();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1040);
				match(NL);
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046);
			match(RARROW_THICK);
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1047);
				match(NL);
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1053);
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
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
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
			setState(1060);
			match(LPAREN);
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1061);
					match(NL);
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LPAREN - 72)) | (1L << (LSQUARE - 72)) | (1L << (HASH - 72)))) != 0) || _la==Identifier) {
				{
				setState(1067);
				type();
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
						match(COMMA);
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
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
			}

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
			setState(1097);
			match(LPAREN);
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1098);
				match(NL);
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1104);
			type();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1105);
				match(NL);
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
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
			setState(1113);
			match(LSQUARE);
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1114);
				match(NL);
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120);
			type();
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1121);
				match(NL);
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
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
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1129);
				identifier();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LANGLE) {
					{
					setState(1130);
					typeArguments();
					}
				}

				}
				break;
			case LPAREN:
				{
				setState(1133);
				parenthesizedType();
				}
				break;
			case LSQUARE:
				{
				setState(1134);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1137);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(AprlParser.STRUCT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			setState(1139);
			modifierList();
			setState(1140);
			match(STRUCT);
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1141);
				match(NL);
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
			simpleIdentifier();
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1148);
					match(NL);
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				match(LARROW);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1155);
					match(NL);
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1161);
				delegationSpecifiers();
				}
				break;
			}
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1164);
					match(NL);
					}
					}
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1170);
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
			setState(1173);
			match(LCURLY);
			setState(1177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1174);
					match(NL);
					}
					} 
				}
				setState(1179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << BLUEPRINT) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1180);
				structMember();
				}
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1186);
				match(NL);
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1192);
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
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case INTERFACE:
			case STRUCT:
			case DOCUMENT:
			case ENUM:
			case ANNOTATION:
			case BLUEPRINT:
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
				setState(1194);
				topLevelObject();
				}
				break;
			case EXEC:
				{
				setState(1195);
				loadScript();
				}
				break;
			case INIT:
				{
				setState(1196);
				initializerBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1199);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(AprlParser.ENUM, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
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
			setState(1204);
			modifierList();
			setState(1205);
			match(ENUM);
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
			simpleIdentifier();
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
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
				primaryConstructor();
				}
				break;
			}
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1222);
				match(NL);
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
			enumBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(1230);
			match(LCURLY);
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1231);
					match(NL);
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1237);
				enumEntries();
				}
			}

			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1240);
					match(NL);
					}
					}
					setState(1245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1246);
				match(SEMICOLON);
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1247);
						match(NL);
						}
						} 
					}
					setState(1252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << BLUEPRINT) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					{
					setState(1253);
					classMember();
					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1261);
				match(NL);
				}
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1267);
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
			setState(1269);
			enumEntry();
			setState(1286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1270);
						match(NL);
						}
						}
						setState(1275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1276);
					match(COMMA);
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1277);
						match(NL);
						}
						}
						setState(1282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1283);
					enumEntry();
					}
					} 
				}
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			setState(1289);
			modifierList();
			setState(1290);
			simpleIdentifier();
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1291);
					match(NL);
					}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1297);
				valueArguments();
				}
				break;
			}
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1300);
					match(NL);
					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1306);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode EXTENSION() { return getToken(AprlParser.EXTENSION, 0); }
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
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
			setState(1309);
			modifierList();
			setState(1310);
			match(EXTENSION);
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1311);
					match(NL);
					}
					}
					setState(1316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1317);
				typeParameters();
				}
				break;
			}
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1320);
				match(NL);
				}
				}
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			receiverType();
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1327);
					match(NL);
					}
					}
					setState(1332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1333);
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
			setState(1336);
			match(LCURLY);
			setState(1340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1337);
					match(NL);
					}
					} 
				}
				setState(1342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1343);
				extensionMember();
				}
				}
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1349);
				match(NL);
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1355);
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
			setState(1357);
			functionDeclaration();
			setState(1359); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1358);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1361); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AprlParser.DEF, 0); }
		public TerminalNode CONST() { return getToken(AprlParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
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
			setState(1363);
			modifierList();
			setState(1364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1365);
				match(NL);
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
			variableDeclaration();
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1372);
					match(NL);
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
				match(ASSIGN);
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1379);
					match(NL);
					}
					}
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1385);
				expression();
				}
				break;
			}
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1388);
					match(NL);
					}
					}
					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1394);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
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
			setState(1397);
			annotations();
			setState(1398);
			simpleIdentifier();
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
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
				match(COLON);
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1406);
					match(NL);
					}
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1412);
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
		public List<GetterContext> getter() {
			return getRuleContexts(GetterContext.class);
		}
		public GetterContext getter(int i) {
			return getRuleContext(GetterContext.class,i);
		}
		public List<SetterContext> setter() {
			return getRuleContexts(SetterContext.class);
		}
		public SetterContext setter(int i) {
			return getRuleContext(SetterContext.class,i);
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
			setState(1415);
			match(LCURLY);
			setState(1419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1416);
					match(NL);
					}
					} 
				}
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << GETTER) | (1L << SETTER) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1422);
					getter();
					}
					break;
				case 2:
					{
					setState(1423);
					setter();
					}
					break;
				}
				setState(1429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1426);
						semi();
						}
						} 
					}
					setState(1431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1437);
				match(NL);
				}
				}
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1443);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode GETTER() { return getToken(AprlParser.GETTER, 0); }
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
			setState(1445);
			modifierList();
			setState(1446);
			match(GETTER);
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1447);
					match(NL);
					}
					}
					setState(1452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1453);
				match(LPAREN);
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1454);
					match(NL);
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1460);
				match(RPAREN);
				}
				break;
			}
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1463);
					match(NL);
					}
					}
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1469);
				match(RARROW);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1470);
					match(NL);
					}
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1476);
				type();
				}
				break;
			}
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1479);
					match(NL);
					}
					} 
				}
				setState(1484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==ASSIGN) {
				{
				setState(1485);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode SETTER() { return getToken(AprlParser.SETTER, 0); }
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
			setState(1488);
			modifierList();
			setState(1489);
			match(SETTER);
			setState(1493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1490);
					match(NL);
					}
					} 
				}
				setState(1495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1496);
					match(LPAREN);
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
					functionValueParameterWithOptionalType();
					setState(1507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1504);
						match(NL);
						}
						}
						setState(1509);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1510);
					match(RPAREN);
					}
				}

				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1517);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1514);
						match(NL);
						}
						}
						setState(1519);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1520);
					match(RARROW);
					setState(1524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1521);
						match(NL);
						}
						}
						setState(1526);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1527);
					type();
					}
					break;
				}
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1530);
					match(NL);
					}
					}
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1536);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ParameterWithOptionalTypeContext parameterWithOptionalType() {
			return getRuleContext(ParameterWithOptionalTypeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			modifierList();
			setState(1540);
			parameterWithOptionalType();
			}
		}
		catch (RecognitionException re) {
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
			setState(1542);
			simpleIdentifier();
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
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
				match(COLON);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AprlParser.FUNCTION, 0); }
		public TerminalNode SCRIPT() { return getToken(AprlParser.SCRIPT, 0); }
		public TerminalNode OPERATOR() { return getToken(AprlParser.OPERATOR, 0); }
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
			setState(1559);
			modifierList();
			setState(1560);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1561);
					match(NL);
					}
					}
					setState(1566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1567);
				typeParameters();
				}
				break;
			}
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1570);
				match(NL);
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1576);
			simpleIdentifier();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1577);
				match(NL);
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1583);
			functionValueParameters();
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1584);
					match(NL);
					}
					}
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1590);
				match(RARROW);
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1591);
					match(NL);
					}
					}
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1597);
				type();
				}
				break;
			}
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1600);
					match(NL);
					}
					}
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1606);
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
			setState(1609);
			match(LPAREN);
			setState(1613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1610);
					match(NL);
					}
					} 
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1616);
				functionValueParameter();
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1620);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1617);
							match(NL);
							}
							}
							setState(1622);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1623);
						match(COMMA);
						setState(1627);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1624);
							match(NL);
							}
							}
							setState(1629);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1630);
						functionValueParameter();
						}
						} 
					}
					setState(1635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				}
			}

			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1638);
				match(NL);
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1644);
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
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
			setState(1646);
			modifierList();
			setState(1647);
			parameter();
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1648);
					match(NL);
					}
					}
					setState(1653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1654);
				match(ASSIGN);
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1655);
					match(NL);
					}
					}
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1661);
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
			setState(1664);
			simpleIdentifier();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1665);
				match(NL);
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1671);
			match(COLON);
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1672);
				match(NL);
				}
				}
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1678);
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
			setState(1689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				match(ASSIGN);
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1682);
					match(NL);
					}
					}
					setState(1687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1688);
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

	public static class BlueprintDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode BLUEPRINT() { return getToken(AprlParser.BLUEPRINT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public BlueprintBodyContext blueprintBody() {
			return getRuleContext(BlueprintBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public BlueprintDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blueprintDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBlueprintDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBlueprintDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBlueprintDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlueprintDeclarationContext blueprintDeclaration() throws RecognitionException {
		BlueprintDeclarationContext _localctx = new BlueprintDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blueprintDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			modifierList();
			setState(1692);
			match(BLUEPRINT);
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1693);
				match(NL);
				}
				}
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1699);
			simpleIdentifier();
			{
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1700);
				match(NL);
				}
				}
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1706);
			blueprintBody();
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

	public static class BlueprintBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AprlParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AprlParser.RCURLY, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<BlueprintMemberContext> blueprintMember() {
			return getRuleContexts(BlueprintMemberContext.class);
		}
		public BlueprintMemberContext blueprintMember(int i) {
			return getRuleContext(BlueprintMemberContext.class,i);
		}
		public BlueprintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blueprintBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBlueprintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBlueprintBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBlueprintBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlueprintBodyContext blueprintBody() throws RecognitionException {
		BlueprintBodyContext _localctx = new BlueprintBodyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_blueprintBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			match(LCURLY);
			setState(1712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1709);
					match(NL);
					}
					} 
				}
				setState(1714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1715);
				blueprintMember();
				}
				}
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1721);
				match(NL);
				}
				}
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1727);
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

	public static class BlueprintMemberContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public BlueprintMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blueprintMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterBlueprintMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitBlueprintMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitBlueprintMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlueprintMemberContext blueprintMember() throws RecognitionException {
		BlueprintMemberContext _localctx = new BlueprintMemberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_blueprintMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1729);
				functionDeclaration();
				}
				break;
			case 2:
				{
				setState(1730);
				propertyDeclaration();
				}
				break;
			}
			setState(1734); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1733);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1736); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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
			setState(1738);
			match(LCURLY);
			setState(1742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1739);
					match(NL);
					}
					} 
				}
				setState(1744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1745);
			statements();
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1746);
				match(NL);
				}
				}
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1752);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << IF) | (1L << UNLESS) | (1L << FOR) | (1L << MATCH) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRY_QUEST - 64)) | (1L << (TRIGGER - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (LPAREN - 64)) | (1L << (LSQUARE - 64)) | (1L << (LCURLY - 64)) | (1L << (ADD - 64)) | (1L << (INCR - 64)) | (1L << (SUB - 64)) | (1L << (DECR - 64)) | (1L << (PERIOD - 64)) | (1L << (EXCL - 64)) | (1L << (HASH - 64)) | (1L << (DOUBLE_AT - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (QUOTE_OPEN - 134)) | (1L << (TRIPLE_QUOTE_OPEN - 134)) | (1L << (IntegerLiteral - 134)) | (1L << (LongLiteral - 134)) | (1L << (ShortLiteral - 134)) | (1L << (ByteLiteral - 134)) | (1L << (FloatLiteral - 134)) | (1L << (DoubleLiteral - 134)) | (1L << (ComplexLiteral - 134)) | (1L << (Identifier - 134)) | (1L << (CharacterLiteral - 134)))) != 0)) {
				{
				setState(1754);
				statement();
				setState(1764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1756); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1755);
							semi();
							}
							}
							setState(1758); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NL || _la==SEMICOLON );
						setState(1760);
						statement();
						}
						} 
					}
					setState(1766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				}
			}

			setState(1772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1769);
					semi();
					}
					} 
				}
				setState(1774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1775);
				localVariableDeclaration();
				}
				break;
			case 2:
				{
				setState(1776);
				assignment();
				}
				break;
			case 3:
				{
				setState(1777);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(1778);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode DEF() { return getToken(AprlParser.DEF, 0); }
		public TerminalNode CONST() { return getToken(AprlParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(AprlParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(AprlParser.VAL, 0); }
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
		enterRule(_localctx, 150, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			annotations();
			setState(1782);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1783);
				match(NL);
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1789);
			variableDeclaration();
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1790);
					match(NL);
					}
					}
					setState(1795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1796);
				match(ASSIGN);
				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1797);
					match(NL);
					}
					}
					setState(1802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1803);
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
		enterRule(_localctx, 152, RULE_loopStatement);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				whileStatement();
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
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
		enterRule(_localctx, 154, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(FOR);
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1811);
				match(NL);
				}
				}
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1817);
			match(LPAREN);
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1818);
				match(NL);
				}
				}
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1824);
			annotations();
			setState(1825);
			variableDeclaration();
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1826);
				match(NL);
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
			match(IN);
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
			expression();
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
			match(RPAREN);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 156, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(WHILE);
			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1856);
				match(NL);
				}
				}
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1862);
			expression();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1863);
				match(NL);
				}
				}
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1869);
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
		enterRule(_localctx, 158, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			assignableExpression();
			setState(1875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1872);
					match(NL);
					}
					} 
				}
				setState(1877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			setState(1878);
			assignmentOperator();
			setState(1879);
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
			setState(1881);
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
			setState(1883);
			conjunction();
			setState(1889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1884);
					disjunctionOperator();
					setState(1885);
					conjunction();
					}
					} 
				}
				setState(1891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
			setState(1892);
			equalityComparison();
			setState(1898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1893);
					conjunctionOperator();
					setState(1894);
					equalityComparison();
					}
					} 
				}
				setState(1900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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
			setState(1901);
			identityComparison();
			setState(1907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1902);
					equalityOperator();
					setState(1903);
					identityComparison();
					}
					} 
				}
				setState(1909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
			setState(1910);
			comparison();
			setState(1916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1911);
					identityOperator();
					setState(1912);
					comparison();
					}
					} 
				}
				setState(1918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		enterRule(_localctx, 170, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			namedInfixExpression();
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1920);
					comparisonOperator();
					setState(1921);
					namedInfixExpression();
					}
					} 
				}
				setState(1927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		enterRule(_localctx, 172, RULE_namedInfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			elvisExpression();
			setState(1932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1929);
					namedInfix();
					}
					} 
				}
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
		enterRule(_localctx, 174, RULE_namedInfix);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1935);
				inOperator();
				setState(1936);
				elvisExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				isOperator();
				setState(1939);
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
		enterRule(_localctx, 176, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			infixFunctionCall();
			setState(1949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1944);
					elvisOperator();
					setState(1945);
					infixFunctionCall();
					}
					} 
				}
				setState(1951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
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
			setState(1952);
			rangeExpression();
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1953);
					simpleIdentifier();
					setState(1954);
					rangeExpression();
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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
			setState(1961);
			xorExpression();
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1962);
				toOperator();
				setState(1963);
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
			setState(1967);
			additiveExpression();
			setState(1973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1968);
					xorOperator();
					setState(1969);
					additiveExpression();
					}
					} 
				}
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
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
			setState(1976);
			multiplicativeExpression();
			setState(1982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1977);
					additiveOperator();
					setState(1978);
					multiplicativeExpression();
					}
					} 
				}
				setState(1984);
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
			setState(1985);
			exponentialExpression();
			setState(1991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1986);
					multiplicativeOperator();
					setState(1987);
					exponentialExpression();
					}
					} 
				}
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
			setState(1994);
			asExpression();
			setState(2000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1995);
					exponentialOperator();
					setState(1996);
					asExpression();
					}
					} 
				}
				setState(2002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		public AsOperatorContext asOperator() {
			return getRuleContext(AsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			prefixUnaryExpression();
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2004);
				asOperator();
				setState(2005);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ADD - 80)) | (1L << (INCR - 80)) | (1L << (SUB - 80)) | (1L << (DECR - 80)) | (1L << (EXCL - 80)) | (1L << (DOUBLE_AT - 80)))) != 0)) {
				{
				{
				setState(2009);
				unaryPrefix();
				}
				}
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2015);
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
			setState(2017);
			atomicExpression();
			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2018);
					unaryPostfix();
					}
					} 
				}
				setState(2023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 196, RULE_atomicExpression);
		try {
			setState(2037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2026);
				literalConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2027);
				contextualReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2028);
				callableReference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2029);
				lambdaLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2030);
				collectionLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2031);
				thisExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2032);
				superExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2033);
				conditionalExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2034);
				optionalTryExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2035);
				tryExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2036);
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
			setState(2039);
			match(LPAREN);
			setState(2040);
			expression();
			setState(2041);
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
			setState(2043);
			match(PERIOD);
			setState(2044);
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
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(AprlParser.DOUBLE_COLON, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
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
			setState(2046);
			receiverType();
			setState(2047);
			match(DOUBLE_COLON);
			setState(2051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2048);
				match(NL);
				}
				}
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2054);
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
		enterRule(_localctx, 204, RULE_collectionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(LSQUARE);
			setState(2060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2057);
					match(NL);
					}
					} 
				}
				setState(2062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TRY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRY_QUEST - 64)) | (1L << (TRIGGER - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (LPAREN - 64)) | (1L << (LSQUARE - 64)) | (1L << (LCURLY - 64)) | (1L << (ADD - 64)) | (1L << (INCR - 64)) | (1L << (SUB - 64)) | (1L << (DECR - 64)) | (1L << (PERIOD - 64)) | (1L << (EXCL - 64)) | (1L << (DOUBLE_AT - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (QUOTE_OPEN - 134)) | (1L << (TRIPLE_QUOTE_OPEN - 134)) | (1L << (IntegerLiteral - 134)) | (1L << (LongLiteral - 134)) | (1L << (ShortLiteral - 134)) | (1L << (ByteLiteral - 134)) | (1L << (FloatLiteral - 134)) | (1L << (DoubleLiteral - 134)) | (1L << (ComplexLiteral - 134)) | (1L << (Identifier - 134)) | (1L << (CharacterLiteral - 134)))) != 0)) {
				{
				setState(2063);
				expression();
				}
			}

			setState(2082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2069);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2066);
						match(NL);
						}
						}
						setState(2071);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2072);
					match(COMMA);
					setState(2076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2073);
						match(NL);
						}
						}
						setState(2078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2079);
					expression();
					}
					} 
				}
				setState(2084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			setState(2088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2085);
				match(NL);
				}
				}
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2091);
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
		enterRule(_localctx, 206, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
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
		enterRule(_localctx, 208, RULE_superExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
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
		enterRule(_localctx, 210, RULE_conditionalExpression);
		try {
			setState(2099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case UNLESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2097);
				ifExpression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 212, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==UNLESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2102);
				match(NL);
				}
				}
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2108);
			expression();
			setState(2112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2109);
				match(NL);
				}
				}
				setState(2114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2115);
			block();
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2116);
						match(NL);
						}
						}
						setState(2121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2122);
					elsifExpression();
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2128);
					match(NL);
					}
					}
					setState(2133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2134);
				match(ELSE);
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2135);
					match(NL);
					}
					}
					setState(2140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2141);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 214, RULE_elsifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(ELSIF);
			setState(2148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2145);
				match(NL);
				}
				}
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2151);
			expression();
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2152);
				match(NL);
				}
				}
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2158);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 216, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			match(MATCH);
			setState(2164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2161);
				match(NL);
				}
				}
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2167);
			expression();
			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2168);
				match(NL);
				}
				}
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2174);
			match(LCURLY);
			setState(2182); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
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
					matchEntry();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2184); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2186);
				match(NL);
				}
				}
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2192);
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
		enterRule(_localctx, 218, RULE_matchEntry);
		int _la;
		try {
			int _alt;
			setState(2253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2194);
				match(WHEN);
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2195);
					match(NL);
					}
					}
					setState(2200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2201);
				literalConstant();
				setState(2218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2202);
							match(NL);
							}
							}
							setState(2207);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2208);
						match(COMMA);
						setState(2212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2209);
							match(NL);
							}
							}
							setState(2214);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2215);
						literalConstant();
						}
						} 
					}
					setState(2220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				}
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2221);
					match(NL);
					}
					}
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2227);
				match(RARROW_THICK);
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2228);
					match(NL);
					}
					}
					setState(2233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2234);
				block();
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2235);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2238);
				match(ELSE);
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
				match(RARROW_THICK);
				setState(2249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2246);
					match(NL);
					}
					}
					setState(2251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2252);
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
		enterRule(_localctx, 220, RULE_optionalTryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(TRY_QUEST);
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2256);
				match(NL);
				}
				}
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2262);
				block();
				}
				break;
			case 2:
				{
				setState(2263);
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
		enterRule(_localctx, 222, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			match(TRY);
			setState(2270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2267);
				match(NL);
				}
				}
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2273);
			block();
			setState(2283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2274);
						match(NL);
						}
						}
						setState(2279);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2280);
					catchBlock();
					}
					} 
				}
				setState(2285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			setState(2293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2286);
					match(NL);
					}
					}
					setState(2291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2292);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaughtExceptionContext caughtException() {
			return getRuleContext(CaughtExceptionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
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
		enterRule(_localctx, 224, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			match(CATCH);
			setState(2309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL || _la==LPAREN) {
				{
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2296);
					match(NL);
					}
					}
					setState(2301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2302);
				caughtException();
				setState(2306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2303);
					match(NL);
					}
					}
					setState(2308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2311);
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

	public static class CaughtExceptionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AprlParser.LPAREN, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
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
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> CONJ() { return getTokens(AprlParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(AprlParser.CONJ, i);
		}
		public CaughtExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caughtException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterCaughtException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitCaughtException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitCaughtException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaughtExceptionContext caughtException() throws RecognitionException {
		CaughtExceptionContext _localctx = new CaughtExceptionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_caughtException);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(LPAREN);
			setState(2317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2314);
				match(NL);
				}
				}
				setState(2319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2320);
			annotations();
			setState(2321);
			simpleIdentifier();
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2322);
				match(NL);
				}
				}
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2328);
			match(COLON);
			setState(2332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2329);
				match(NL);
				}
				}
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2335);
			type();
			setState(2352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2336);
						match(NL);
						}
						}
						setState(2341);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2342);
					match(CONJ);
					setState(2346);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2343);
						match(NL);
						}
						}
						setState(2348);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2349);
					type();
					}
					} 
				}
				setState(2354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2355);
				match(NL);
				}
				}
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2361);
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
			setState(2363);
			match(FINALLY);
			setState(2367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2364);
				match(NL);
				}
				}
				setState(2369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2370);
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
			setState(2376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2372);
				triggerExpression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
				returnExpression();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2374);
				continueExpression();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2375);
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
			setState(2378);
			match(TRIGGER);
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
		enterRule(_localctx, 234, RULE_returnExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			match(RETURN);
			setState(2391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2388);
					match(NL);
					}
					} 
				}
				setState(2393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2394);
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
		enterRule(_localctx, 236, RULE_continueExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
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
		enterRule(_localctx, 238, RULE_breakExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
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
		enterRule(_localctx, 240, RULE_literalConstant);
		try {
			setState(2412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2401);
				nullLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2402);
				boolLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2403);
				integerLiteral();
				}
				break;
			case LongLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2404);
				longLiteral();
				}
				break;
			case ShortLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2405);
				shortLiteral();
				}
				break;
			case ByteLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(2406);
				byteLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2407);
				floatLiteral();
				}
				break;
			case DoubleLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(2408);
				doubleLiteral();
				}
				break;
			case ComplexLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(2409);
				complexLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 10);
				{
				setState(2410);
				characterLiteral();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2411);
				stringLiteral();
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
		enterRule(_localctx, 242, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
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
		enterRule(_localctx, 244, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
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
		enterRule(_localctx, 246, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
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
		enterRule(_localctx, 248, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
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
		enterRule(_localctx, 250, RULE_shortLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
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
		enterRule(_localctx, 252, RULE_byteLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
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
		enterRule(_localctx, 254, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
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
		enterRule(_localctx, 256, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
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
		enterRule(_localctx, 258, RULE_complexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
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
		enterRule(_localctx, 260, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2432);
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
		enterRule(_localctx, 262, RULE_stringLiteral);
		try {
			setState(2436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2434);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2435);
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
		enterRule(_localctx, 264, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			match(QUOTE_OPEN);
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (LineStrRef - 159)) | (1L << (LineStrText - 159)) | (1L << (LineStrEscapedChar - 159)) | (1L << (LineStrExprStart - 159)))) != 0)) {
				{
				setState(2441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(2439);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(2440);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2446);
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
		enterRule(_localctx, 266, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			match(TRIPLE_QUOTE_OPEN);
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (QUOTE_OPEN - 134)) | (1L << (MultiLineStrQuote - 134)) | (1L << (MultiLineStrRef - 134)) | (1L << (MultiLineStrText - 134)) | (1L << (MultiLineStrEscapedChar - 134)) | (1L << (MultiLineStrExprStart - 134)))) != 0)) {
				{
				setState(2453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(2449);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(2450);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(2451);
					lineStringLiteral();
					}
					break;
				case MultiLineStrQuote:
					{
					setState(2452);
					match(MultiLineStrQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2458);
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
		enterRule(_localctx, 268, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			_la = _input.LA(1);
			if ( !(((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (LineStrRef - 159)) | (1L << (LineStrText - 159)) | (1L << (LineStrEscapedChar - 159)))) != 0)) ) {
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
		enterRule(_localctx, 270, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			match(LineStrExprStart);
			setState(2463);
			expression();
			setState(2464);
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
		enterRule(_localctx, 272, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			_la = _input.LA(1);
			if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (MultiLineStrRef - 165)) | (1L << (MultiLineStrText - 165)) | (1L << (MultiLineStrEscapedChar - 165)))) != 0)) ) {
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
		enterRule(_localctx, 274, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			match(MultiLineStrExprStart);
			setState(2469);
			expression();
			setState(2470);
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
		enterRule(_localctx, 276, RULE_lambdaLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(LCURLY);
			setState(2476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2473);
					match(NL);
					}
					} 
				}
				setState(2478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			setState(2495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH || _la==Identifier) {
					{
					setState(2479);
					lambdaParameters();
					}
				}

				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2482);
					match(NL);
					}
					}
					setState(2487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2488);
				match(RARROW_THICK);
				setState(2492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2489);
						match(NL);
						}
						} 
					}
					setState(2494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				}
				}
				break;
			}
			setState(2497);
			statements();
			setState(2501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2498);
				match(NL);
				}
				}
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2504);
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
		enterRule(_localctx, 278, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			lambdaParameter();
			setState(2523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
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
					lambdaParameter();
					}
					} 
				}
				setState(2525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
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
		enterRule(_localctx, 280, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			annotations();
			setState(2527);
			simpleIdentifier();
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
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
				match(COLON);
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2535);
					match(NL);
					}
					}
					setState(2540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2541);
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
		enterRule(_localctx, 282, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (ASSIGN - 78)) | (1L << (DEFINE - 78)) | (1L << (ADD_ASSIGN - 78)) | (1L << (SUB_ASSIGN - 78)) | (1L << (MUL_ASSIGN - 78)) | (1L << (DIV_ASSIGN - 78)) | (1L << (MOD_ASSIGN - 78)) | (1L << (EXP_ASSIGN - 78)) | (1L << (CONJ_ASSIGN - 78)) | (1L << (DISJ_ASSIGN - 78)) | (1L << (XOR_ASSIGN - 78)) | (1L << (ELVIS_ASSIGN - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 284, RULE_disjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2557);
				match(NL);
				}
				}
				setState(2562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2563);
			match(DISJ);
			setState(2567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2564);
				match(NL);
				}
				}
				setState(2569);
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
		enterRule(_localctx, 286, RULE_conjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2570);
				match(NL);
				}
				}
				setState(2575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2576);
			match(CONJ);
			setState(2580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2577);
				match(NL);
				}
				}
				setState(2582);
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
		enterRule(_localctx, 288, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2583);
				match(NL);
				}
				}
				setState(2588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2589);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2590);
				match(NL);
				}
				}
				setState(2595);
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
		enterRule(_localctx, 290, RULE_identityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2596);
				match(NL);
				}
				}
				setState(2601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2602);
			_la = _input.LA(1);
			if ( !(_la==IDENTICAL || _la==NIDENTICAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2603);
				match(NL);
				}
				}
				setState(2608);
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
		enterRule(_localctx, 292, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2609);
				match(NL);
				}
				}
				setState(2614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2615);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (LANGLE - 122)) | (1L << (NLANGLE - 122)) | (1L << (LEQ - 122)) | (1L << (NLEQ - 122)) | (1L << (RANGLE - 122)) | (1L << (NRANGLE - 122)) | (1L << (GEQ - 122)) | (1L << (NGEQ - 122)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2616);
				match(NL);
				}
				}
				setState(2621);
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
		enterRule(_localctx, 294, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2622);
				match(NL);
				}
				}
				setState(2627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2628);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2629);
				match(NL);
				}
				}
				setState(2634);
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
		enterRule(_localctx, 296, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2635);
				match(NL);
				}
				}
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2641);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2642);
				match(NL);
				}
				}
				setState(2647);
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
		enterRule(_localctx, 298, RULE_elvisOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2648);
				match(NL);
				}
				}
				setState(2653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2654);
			match(ELVIS);
			setState(2658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2655);
				match(NL);
				}
				}
				setState(2660);
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
		enterRule(_localctx, 300, RULE_toOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2661);
				match(NL);
				}
				}
				setState(2666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2667);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (DOWNTO - 103)) | (1L << (TO - 103)) | (1L << (UNTIL - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2668);
				match(NL);
				}
				}
				setState(2673);
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
		enterRule(_localctx, 302, RULE_xorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2674);
				match(NL);
				}
				}
				setState(2679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2680);
			match(XOR);
			setState(2684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2681);
				match(NL);
				}
				}
				setState(2686);
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
		enterRule(_localctx, 304, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2687);
				match(NL);
				}
				}
				setState(2692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2693);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2694);
				match(NL);
				}
				}
				setState(2699);
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
		enterRule(_localctx, 306, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2700);
				match(NL);
				}
				}
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2706);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2707);
				match(NL);
				}
				}
				setState(2712);
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
		enterRule(_localctx, 308, RULE_exponentialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2713);
				match(NL);
				}
				}
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2719);
			match(EXP);
			setState(2723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2720);
				match(NL);
				}
				}
				setState(2725);
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
		enterRule(_localctx, 310, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2726);
				match(NL);
				}
				}
				setState(2731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2732);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==AS_QUEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2733);
				match(NL);
				}
				}
				setState(2738);
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
		enterRule(_localctx, 312, RULE_unaryPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ADD - 80)) | (1L << (INCR - 80)) | (1L << (SUB - 80)) | (1L << (DECR - 80)) | (1L << (EXCL - 80)) | (1L << (DOUBLE_AT - 80)))) != 0)) ) {
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
		enterRule(_localctx, 314, RULE_unaryPostfix);
		try {
			setState(2746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				postfixUnaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2742);
				typeArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2743);
				callSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2744);
				indexingSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2745);
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
		enterRule(_localctx, 316, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INCR - 82)) | (1L << (DECR - 82)) | (1L << (DOUBLE_EXCL - 82)))) != 0)) ) {
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
		enterRule(_localctx, 318, RULE_assignableExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			expression();
			setState(2752); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2751);
					assignableSuffix();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2754); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
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
		enterRule(_localctx, 320, RULE_assignableSuffix);
		try {
			setState(2758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2756);
				indexingSuffix();
				}
				break;
			case NL:
			case PERIOD:
			case QUEST_PERIOD:
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2757);
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
		enterRule(_localctx, 322, RULE_callSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2760);
				typeArguments();
				}
			}

			setState(2765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2763);
				lambdaCallSuffix();
				}
				break;
			case 2:
				{
				setState(2764);
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
		enterRule(_localctx, 324, RULE_lambdaCallSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2767);
				valueArguments();
				}
			}

			setState(2770);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LambdaLiteralContext lambdaLiteral() {
			return getRuleContext(LambdaLiteralContext.class,0);
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
		enterRule(_localctx, 326, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			annotations();
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
		enterRule(_localctx, 328, RULE_indexingSuffix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
			match(LSQUARE);
			setState(2785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2782);
				match(NL);
				}
				}
				setState(2787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2788);
			expression();
			setState(2805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2789);
						match(NL);
						}
						}
						setState(2794);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2795);
					match(COMMA);
					setState(2799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2796);
						match(NL);
						}
						}
						setState(2801);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2802);
					expression();
					}
					} 
				}
				setState(2807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,378,_ctx);
			}
			setState(2811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2808);
				match(NL);
				}
				}
				setState(2813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2814);
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
		enterRule(_localctx, 330, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			memberAccessOperator();
			setState(2817);
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
		enterRule(_localctx, 332, RULE_memberAccessOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (PERIOD - 101)) | (1L << (QUEST_PERIOD - 101)) | (1L << (DOUBLE_COLON - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2826);
				match(NL);
				}
				}
				setState(2831);
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
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 334, RULE_modifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			annotations();
			setState(2842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << INLINE) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0)) {
				{
				{
				setState(2833);
				modifier();
				setState(2837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2834);
						match(NL);
						}
						} 
					}
					setState(2839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
				}
				}
				}
				setState(2844);
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
		enterRule(_localctx, 336, RULE_modifier);
		try {
			setState(2849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case BOUNDED:
			case LOCAL:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2845);
				visibilityModifier();
				}
				break;
			case ABSTRACT:
			case COVER:
			case OPEN:
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2846);
				inheritanceModifier();
				}
				break;
			case PARAMS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2847);
				parameterModifier();
				}
				break;
			case INLINE:
			case EXTERNAL:
			case SYNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(2848);
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
		enterRule(_localctx, 338, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
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
		enterRule(_localctx, 340, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
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
		enterRule(_localctx, 342, RULE_parameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
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
		enterRule(_localctx, 344, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
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
		enterRule(_localctx, 346, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2859);
					annotation();
					setState(2863);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2860);
							match(NL);
							}
							} 
						}
						setState(2865);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
					}
					}
					} 
				}
				setState(2870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
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
		enterRule(_localctx, 348, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2871);
			match(HASH);
			setState(2893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(2872);
				unescapedAnnotation();
				}
				break;
			case LSQUARE:
				{
				setState(2873);
				match(LSQUARE);
				setState(2877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2874);
					match(NL);
					}
					}
					setState(2879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2880);
					unescapedAnnotation();
					}
					}
					setState(2883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(2888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2885);
					match(NL);
					}
					}
					setState(2890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2891);
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
		enterRule(_localctx, 350, RULE_unescapedAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2895);
			identifier();
			setState(2897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				setState(2896);
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
		enterRule(_localctx, 352, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			simpleIdentifier();
			setState(2916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					match(PERIOD);
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
					setState(2913);
					simpleIdentifier();
					}
					} 
				}
				setState(2918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
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
		enterRule(_localctx, 354, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
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
		enterRule(_localctx, 356, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(2939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2922); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2921);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2924); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(SEMICOLON);
				setState(2936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2933);
						match(NL);
						}
						} 
					}
					setState(2938);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u0b80\4\2\t"+
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
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\3\2\7\2\u016a\n\2\f\2\16\2\u016d"+
		"\13\2\3\2\3\2\7\2\u0171\n\2\f\2\16\2\u0174\13\2\3\2\3\2\6\2\u0178\n\2"+
		"\r\2\16\2\u0179\3\2\5\2\u017d\n\2\7\2\u017f\n\2\f\2\16\2\u0182\13\2\5"+
		"\2\u0184\n\2\3\2\3\2\3\3\5\3\u0189\n\3\3\3\3\3\3\4\3\4\5\4\u018f\n\4\3"+
		"\5\7\5\u0192\n\5\f\5\16\5\u0195\13\5\3\6\3\6\3\6\3\6\7\6\u019b\n\6\f\6"+
		"\16\6\u019e\13\6\3\6\6\6\u01a1\n\6\r\6\16\6\u01a2\3\7\3\7\3\7\5\7\u01a8"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01b4\n\t\f\t\16\t\u01b7"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u01be\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u01ca\n\13\3\f\3\f\3\f\7\f\u01cf\n\f\f\f\16"+
		"\f\u01d2\13\f\3\f\3\f\7\f\u01d6\n\f\f\f\16\f\u01d9\13\f\3\f\5\f\u01dc"+
		"\n\f\3\f\7\f\u01df\n\f\f\f\16\f\u01e2\13\f\3\f\5\f\u01e5\n\f\3\f\7\f\u01e8"+
		"\n\f\f\f\16\f\u01eb\13\f\3\f\3\f\7\f\u01ef\n\f\f\f\16\f\u01f2\13\f\3\f"+
		"\5\f\u01f5\n\f\3\f\7\f\u01f8\n\f\f\f\16\f\u01fb\13\f\3\f\5\f\u01fe\n\f"+
		"\3\r\3\r\3\r\7\r\u0203\n\r\f\r\16\r\u0206\13\r\3\r\3\r\7\r\u020a\n\r\f"+
		"\r\16\r\u020d\13\r\3\r\5\r\u0210\n\r\3\r\7\r\u0213\n\r\f\r\16\r\u0216"+
		"\13\r\3\r\3\r\7\r\u021a\n\r\f\r\16\r\u021d\13\r\3\r\5\r\u0220\n\r\3\r"+
		"\7\r\u0223\n\r\f\r\16\r\u0226\13\r\3\r\5\r\u0229\n\r\3\16\3\16\3\16\7"+
		"\16\u022e\n\16\f\16\16\16\u0231\13\16\3\16\3\16\7\16\u0235\n\16\f\16\16"+
		"\16\u0238\13\16\3\16\5\16\u023b\n\16\3\16\7\16\u023e\n\16\f\16\16\16\u0241"+
		"\13\16\3\16\5\16\u0244\n\16\3\17\3\17\3\17\7\17\u0249\n\17\f\17\16\17"+
		"\u024c\13\17\3\17\3\17\7\17\u0250\n\17\f\17\16\17\u0253\13\17\3\17\5\17"+
		"\u0256\n\17\3\17\7\17\u0259\n\17\f\17\16\17\u025c\13\17\3\17\3\17\7\17"+
		"\u0260\n\17\f\17\16\17\u0263\13\17\3\17\5\17\u0266\n\17\3\20\3\20\3\20"+
		"\7\20\u026b\n\20\f\20\16\20\u026e\13\20\5\20\u0270\n\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0276\n\21\f\21\16\21\u0279\13\21\3\21\3\21\7\21\u027d\n\21"+
		"\f\21\16\21\u0280\13\21\3\21\3\21\7\21\u0284\n\21\f\21\16\21\u0287\13"+
		"\21\3\21\7\21\u028a\n\21\f\21\16\21\u028d\13\21\5\21\u028f\n\21\3\21\7"+
		"\21\u0292\n\21\f\21\16\21\u0295\13\21\3\21\3\21\3\22\3\22\5\22\u029b\n"+
		"\22\3\22\7\22\u029e\n\22\f\22\16\22\u02a1\13\22\3\22\3\22\7\22\u02a5\n"+
		"\22\f\22\16\22\u02a8\13\22\3\22\3\22\7\22\u02ac\n\22\f\22\16\22\u02af"+
		"\13\22\3\22\3\22\7\22\u02b3\n\22\f\22\16\22\u02b6\13\22\3\22\3\22\7\22"+
		"\u02ba\n\22\f\22\16\22\u02bd\13\22\3\22\5\22\u02c0\n\22\3\23\3\23\3\24"+
		"\3\24\7\24\u02c6\n\24\f\24\16\24\u02c9\13\24\3\24\3\24\7\24\u02cd\n\24"+
		"\f\24\16\24\u02d0\13\24\3\24\7\24\u02d3\n\24\f\24\16\24\u02d6\13\24\3"+
		"\25\3\25\5\25\u02da\n\25\3\25\5\25\u02dd\n\25\3\26\3\26\7\26\u02e1\n\26"+
		"\f\26\16\26\u02e4\13\26\3\26\3\26\7\26\u02e8\n\26\f\26\16\26\u02eb\13"+
		"\26\3\26\7\26\u02ee\n\26\f\26\16\26\u02f1\13\26\3\27\3\27\7\27\u02f5\n"+
		"\27\f\27\16\27\u02f8\13\27\3\27\3\27\7\27\u02fc\n\27\f\27\16\27\u02ff"+
		"\13\27\3\27\3\27\7\27\u0303\n\27\f\27\16\27\u0306\13\27\3\27\7\27\u0309"+
		"\n\27\f\27\16\27\u030c\13\27\3\27\7\27\u030f\n\27\f\27\16\27\u0312\13"+
		"\27\5\27\u0314\n\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u031e"+
		"\n\31\f\31\16\31\u0321\13\31\3\31\3\31\7\31\u0325\n\31\f\31\16\31\u0328"+
		"\13\31\3\31\3\31\7\31\u032c\n\31\f\31\16\31\u032f\13\31\3\31\5\31\u0332"+
		"\n\31\3\31\7\31\u0335\n\31\f\31\16\31\u0338\13\31\3\31\5\31\u033b\n\31"+
		"\3\32\3\32\7\32\u033f\n\32\f\32\16\32\u0342\13\32\3\32\3\32\3\33\3\33"+
		"\7\33\u0348\n\33\f\33\16\33\u034b\13\33\3\33\7\33\u034e\n\33\f\33\16\33"+
		"\u0351\13\33\3\33\7\33\u0354\n\33\f\33\16\33\u0357\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0360\n\34\3\34\6\34\u0363\n\34\r\34\16\34\u0364"+
		"\3\35\3\35\7\35\u0369\n\35\f\35\16\35\u036c\13\35\3\35\3\35\3\36\3\36"+
		"\7\36\u0372\n\36\f\36\16\36\u0375\13\36\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u037c\n\37\f\37\16\37\u037f\13\37\3\37\5\37\u0382\n\37\3 \3 \7 \u0386"+
		"\n \f \16 \u0389\13 \3 \3 \7 \u038d\n \f \16 \u0390\13 \3 \3 \7 \u0394"+
		"\n \f \16 \u0397\13 \3 \7 \u039a\n \f \16 \u039d\13 \3 \3 \3!\3!\3!\3"+
		"!\5!\u03a5\n!\3\"\3\"\5\"\u03a9\n\"\3#\3#\3$\3$\7$\u03af\n$\f$\16$\u03b2"+
		"\13$\3$\3$\7$\u03b6\n$\f$\16$\u03b9\13$\3$\3$\7$\u03bd\n$\f$\16$\u03c0"+
		"\13$\3$\7$\u03c3\n$\f$\16$\u03c6\13$\3$\7$\u03c9\n$\f$\16$\u03cc\13$\3"+
		"$\3$\3%\3%\7%\u03d2\n%\f%\16%\u03d5\13%\3%\3%\7%\u03d9\n%\f%\16%\u03dc"+
		"\13%\3%\3%\7%\u03e0\n%\f%\16%\u03e3\13%\3%\3%\7%\u03e7\n%\f%\16%\u03ea"+
		"\13%\3%\3%\7%\u03ee\n%\f%\16%\u03f1\13%\3%\7%\u03f4\n%\f%\16%\u03f7\13"+
		"%\5%\u03f9\n%\3&\3&\5&\u03fd\n&\3\'\3\'\5\'\u0401\n\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u040e\n*\5*\u0410\n*\3+\3+\7+\u0414\n+\f+\16+\u0417"+
		"\13+\3+\3+\7+\u041b\n+\f+\16+\u041e\13+\3+\3+\3,\3,\3,\5,\u0425\n,\3-"+
		"\3-\7-\u0429\n-\f-\16-\u042c\13-\3-\3-\7-\u0430\n-\f-\16-\u0433\13-\3"+
		"-\3-\7-\u0437\n-\f-\16-\u043a\13-\3-\7-\u043d\n-\f-\16-\u0440\13-\5-\u0442"+
		"\n-\3-\7-\u0445\n-\f-\16-\u0448\13-\3-\3-\3.\3.\7.\u044e\n.\f.\16.\u0451"+
		"\13.\3.\3.\7.\u0455\n.\f.\16.\u0458\13.\3.\3.\3/\3/\7/\u045e\n/\f/\16"+
		"/\u0461\13/\3/\3/\7/\u0465\n/\f/\16/\u0468\13/\3/\3/\3\60\3\60\5\60\u046e"+
		"\n\60\3\60\3\60\5\60\u0472\n\60\3\60\3\60\3\61\3\61\3\61\7\61\u0479\n"+
		"\61\f\61\16\61\u047c\13\61\3\61\3\61\7\61\u0480\n\61\f\61\16\61\u0483"+
		"\13\61\3\61\3\61\7\61\u0487\n\61\f\61\16\61\u048a\13\61\3\61\5\61\u048d"+
		"\n\61\3\61\7\61\u0490\n\61\f\61\16\61\u0493\13\61\3\61\5\61\u0496\n\61"+
		"\3\62\3\62\7\62\u049a\n\62\f\62\16\62\u049d\13\62\3\62\7\62\u04a0\n\62"+
		"\f\62\16\62\u04a3\13\62\3\62\7\62\u04a6\n\62\f\62\16\62\u04a9\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\5\63\u04b0\n\63\3\63\6\63\u04b3\n\63\r\63\16\63"+
		"\u04b4\3\64\3\64\3\64\7\64\u04ba\n\64\f\64\16\64\u04bd\13\64\3\64\3\64"+
		"\7\64\u04c1\n\64\f\64\16\64\u04c4\13\64\3\64\5\64\u04c7\n\64\3\64\7\64"+
		"\u04ca\n\64\f\64\16\64\u04cd\13\64\3\64\3\64\3\65\3\65\7\65\u04d3\n\65"+
		"\f\65\16\65\u04d6\13\65\3\65\5\65\u04d9\n\65\3\65\7\65\u04dc\n\65\f\65"+
		"\16\65\u04df\13\65\3\65\3\65\7\65\u04e3\n\65\f\65\16\65\u04e6\13\65\3"+
		"\65\7\65\u04e9\n\65\f\65\16\65\u04ec\13\65\5\65\u04ee\n\65\3\65\7\65\u04f1"+
		"\n\65\f\65\16\65\u04f4\13\65\3\65\3\65\3\66\3\66\7\66\u04fa\n\66\f\66"+
		"\16\66\u04fd\13\66\3\66\3\66\7\66\u0501\n\66\f\66\16\66\u0504\13\66\3"+
		"\66\7\66\u0507\n\66\f\66\16\66\u050a\13\66\3\67\3\67\3\67\7\67\u050f\n"+
		"\67\f\67\16\67\u0512\13\67\3\67\5\67\u0515\n\67\3\67\7\67\u0518\n\67\f"+
		"\67\16\67\u051b\13\67\3\67\5\67\u051e\n\67\38\38\38\78\u0523\n8\f8\16"+
		"8\u0526\138\38\58\u0529\n8\38\78\u052c\n8\f8\168\u052f\138\38\38\78\u0533"+
		"\n8\f8\168\u0536\138\38\58\u0539\n8\39\39\79\u053d\n9\f9\169\u0540\13"+
		"9\39\79\u0543\n9\f9\169\u0546\139\39\79\u0549\n9\f9\169\u054c\139\39\3"+
		"9\3:\3:\6:\u0552\n:\r:\16:\u0553\3;\3;\3;\7;\u0559\n;\f;\16;\u055c\13"+
		";\3;\3;\7;\u0560\n;\f;\16;\u0563\13;\3;\3;\7;\u0567\n;\f;\16;\u056a\13"+
		";\3;\5;\u056d\n;\3;\7;\u0570\n;\f;\16;\u0573\13;\3;\5;\u0576\n;\3<\3<"+
		"\3<\7<\u057b\n<\f<\16<\u057e\13<\3<\3<\7<\u0582\n<\f<\16<\u0585\13<\3"+
		"<\5<\u0588\n<\3=\3=\7=\u058c\n=\f=\16=\u058f\13=\3=\3=\5=\u0593\n=\3="+
		"\7=\u0596\n=\f=\16=\u0599\13=\7=\u059b\n=\f=\16=\u059e\13=\3=\7=\u05a1"+
		"\n=\f=\16=\u05a4\13=\3=\3=\3>\3>\3>\7>\u05ab\n>\f>\16>\u05ae\13>\3>\3"+
		">\7>\u05b2\n>\f>\16>\u05b5\13>\3>\5>\u05b8\n>\3>\7>\u05bb\n>\f>\16>\u05be"+
		"\13>\3>\3>\7>\u05c2\n>\f>\16>\u05c5\13>\3>\5>\u05c8\n>\3>\7>\u05cb\n>"+
		"\f>\16>\u05ce\13>\3>\5>\u05d1\n>\3?\3?\3?\7?\u05d6\n?\f?\16?\u05d9\13"+
		"?\3?\3?\7?\u05dd\n?\f?\16?\u05e0\13?\3?\3?\7?\u05e4\n?\f?\16?\u05e7\13"+
		"?\3?\3?\5?\u05eb\n?\3?\7?\u05ee\n?\f?\16?\u05f1\13?\3?\3?\7?\u05f5\n?"+
		"\f?\16?\u05f8\13?\3?\5?\u05fb\n?\3?\7?\u05fe\n?\f?\16?\u0601\13?\3?\5"+
		"?\u0604\n?\3@\3@\3@\3A\3A\7A\u060b\nA\fA\16A\u060e\13A\3A\3A\7A\u0612"+
		"\nA\fA\16A\u0615\13A\3A\5A\u0618\nA\3B\3B\3B\7B\u061d\nB\fB\16B\u0620"+
		"\13B\3B\5B\u0623\nB\3B\7B\u0626\nB\fB\16B\u0629\13B\3B\3B\7B\u062d\nB"+
		"\fB\16B\u0630\13B\3B\3B\7B\u0634\nB\fB\16B\u0637\13B\3B\3B\7B\u063b\n"+
		"B\fB\16B\u063e\13B\3B\5B\u0641\nB\3B\7B\u0644\nB\fB\16B\u0647\13B\3B\5"+
		"B\u064a\nB\3C\3C\7C\u064e\nC\fC\16C\u0651\13C\3C\3C\7C\u0655\nC\fC\16"+
		"C\u0658\13C\3C\3C\7C\u065c\nC\fC\16C\u065f\13C\3C\7C\u0662\nC\fC\16C\u0665"+
		"\13C\5C\u0667\nC\3C\7C\u066a\nC\fC\16C\u066d\13C\3C\3C\3D\3D\3D\7D\u0674"+
		"\nD\fD\16D\u0677\13D\3D\3D\7D\u067b\nD\fD\16D\u067e\13D\3D\5D\u0681\n"+
		"D\3E\3E\7E\u0685\nE\fE\16E\u0688\13E\3E\3E\7E\u068c\nE\fE\16E\u068f\13"+
		"E\3E\3E\3F\3F\3F\7F\u0696\nF\fF\16F\u0699\13F\3F\5F\u069c\nF\3G\3G\3G"+
		"\7G\u06a1\nG\fG\16G\u06a4\13G\3G\3G\7G\u06a8\nG\fG\16G\u06ab\13G\3G\3"+
		"G\3H\3H\7H\u06b1\nH\fH\16H\u06b4\13H\3H\7H\u06b7\nH\fH\16H\u06ba\13H\3"+
		"H\7H\u06bd\nH\fH\16H\u06c0\13H\3H\3H\3I\3I\5I\u06c6\nI\3I\6I\u06c9\nI"+
		"\rI\16I\u06ca\3J\3J\7J\u06cf\nJ\fJ\16J\u06d2\13J\3J\3J\7J\u06d6\nJ\fJ"+
		"\16J\u06d9\13J\3J\3J\3K\3K\6K\u06df\nK\rK\16K\u06e0\3K\3K\7K\u06e5\nK"+
		"\fK\16K\u06e8\13K\5K\u06ea\nK\3K\7K\u06ed\nK\fK\16K\u06f0\13K\3L\3L\3"+
		"L\3L\5L\u06f6\nL\3M\3M\3M\7M\u06fb\nM\fM\16M\u06fe\13M\3M\3M\7M\u0702"+
		"\nM\fM\16M\u0705\13M\3M\3M\7M\u0709\nM\fM\16M\u070c\13M\3M\5M\u070f\n"+
		"M\3N\3N\5N\u0713\nN\3O\3O\7O\u0717\nO\fO\16O\u071a\13O\3O\3O\7O\u071e"+
		"\nO\fO\16O\u0721\13O\3O\3O\3O\7O\u0726\nO\fO\16O\u0729\13O\3O\3O\7O\u072d"+
		"\nO\fO\16O\u0730\13O\3O\3O\7O\u0734\nO\fO\16O\u0737\13O\3O\3O\7O\u073b"+
		"\nO\fO\16O\u073e\13O\3O\3O\3P\3P\7P\u0744\nP\fP\16P\u0747\13P\3P\3P\7"+
		"P\u074b\nP\fP\16P\u074e\13P\3P\3P\3Q\3Q\7Q\u0754\nQ\fQ\16Q\u0757\13Q\3"+
		"Q\3Q\3Q\3R\3R\3S\3S\3S\3S\7S\u0762\nS\fS\16S\u0765\13S\3T\3T\3T\3T\7T"+
		"\u076b\nT\fT\16T\u076e\13T\3U\3U\3U\3U\7U\u0774\nU\fU\16U\u0777\13U\3"+
		"V\3V\3V\3V\7V\u077d\nV\fV\16V\u0780\13V\3W\3W\3W\3W\7W\u0786\nW\fW\16"+
		"W\u0789\13W\3X\3X\7X\u078d\nX\fX\16X\u0790\13X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0798"+
		"\nY\3Z\3Z\3Z\3Z\7Z\u079e\nZ\fZ\16Z\u07a1\13Z\3[\3[\3[\3[\7[\u07a7\n[\f"+
		"[\16[\u07aa\13[\3\\\3\\\3\\\3\\\5\\\u07b0\n\\\3]\3]\3]\3]\7]\u07b6\n]"+
		"\f]\16]\u07b9\13]\3^\3^\3^\3^\7^\u07bf\n^\f^\16^\u07c2\13^\3_\3_\3_\3"+
		"_\7_\u07c8\n_\f_\16_\u07cb\13_\3`\3`\3`\3`\7`\u07d1\n`\f`\16`\u07d4\13"+
		"`\3a\3a\3a\3a\5a\u07da\na\3b\7b\u07dd\nb\fb\16b\u07e0\13b\3b\3b\3c\3c"+
		"\7c\u07e6\nc\fc\16c\u07e9\13c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u07f8\nd\3e\3e\3e\3e\3f\3f\3f\3g\3g\3g\7g\u0804\ng\fg\16g\u0807\13g"+
		"\3g\3g\3h\3h\7h\u080d\nh\fh\16h\u0810\13h\3h\5h\u0813\nh\3h\7h\u0816\n"+
		"h\fh\16h\u0819\13h\3h\3h\7h\u081d\nh\fh\16h\u0820\13h\3h\7h\u0823\nh\f"+
		"h\16h\u0826\13h\3h\7h\u0829\nh\fh\16h\u082c\13h\3h\3h\3i\3i\3j\3j\3k\3"+
		"k\5k\u0836\nk\3l\3l\7l\u083a\nl\fl\16l\u083d\13l\3l\3l\7l\u0841\nl\fl"+
		"\16l\u0844\13l\3l\3l\7l\u0848\nl\fl\16l\u084b\13l\3l\7l\u084e\nl\fl\16"+
		"l\u0851\13l\3l\7l\u0854\nl\fl\16l\u0857\13l\3l\3l\7l\u085b\nl\fl\16l\u085e"+
		"\13l\3l\5l\u0861\nl\3m\3m\7m\u0865\nm\fm\16m\u0868\13m\3m\3m\7m\u086c"+
		"\nm\fm\16m\u086f\13m\3m\3m\3n\3n\7n\u0875\nn\fn\16n\u0878\13n\3n\3n\7"+
		"n\u087c\nn\fn\16n\u087f\13n\3n\3n\7n\u0883\nn\fn\16n\u0886\13n\3n\6n\u0889"+
		"\nn\rn\16n\u088a\3n\7n\u088e\nn\fn\16n\u0891\13n\3n\3n\3o\3o\7o\u0897"+
		"\no\fo\16o\u089a\13o\3o\3o\7o\u089e\no\fo\16o\u08a1\13o\3o\3o\7o\u08a5"+
		"\no\fo\16o\u08a8\13o\3o\7o\u08ab\no\fo\16o\u08ae\13o\3o\7o\u08b1\no\f"+
		"o\16o\u08b4\13o\3o\3o\7o\u08b8\no\fo\16o\u08bb\13o\3o\3o\5o\u08bf\no\3"+
		"o\3o\7o\u08c3\no\fo\16o\u08c6\13o\3o\3o\7o\u08ca\no\fo\16o\u08cd\13o\3"+
		"o\5o\u08d0\no\3p\3p\7p\u08d4\np\fp\16p\u08d7\13p\3p\3p\5p\u08db\np\3q"+
		"\3q\7q\u08df\nq\fq\16q\u08e2\13q\3q\3q\7q\u08e6\nq\fq\16q\u08e9\13q\3"+
		"q\7q\u08ec\nq\fq\16q\u08ef\13q\3q\7q\u08f2\nq\fq\16q\u08f5\13q\3q\5q\u08f8"+
		"\nq\3r\3r\7r\u08fc\nr\fr\16r\u08ff\13r\3r\3r\7r\u0903\nr\fr\16r\u0906"+
		"\13r\5r\u0908\nr\3r\3r\3s\3s\7s\u090e\ns\fs\16s\u0911\13s\3s\3s\3s\7s"+
		"\u0916\ns\fs\16s\u0919\13s\3s\3s\7s\u091d\ns\fs\16s\u0920\13s\3s\3s\7"+
		"s\u0924\ns\fs\16s\u0927\13s\3s\3s\7s\u092b\ns\fs\16s\u092e\13s\3s\7s\u0931"+
		"\ns\fs\16s\u0934\13s\3s\7s\u0937\ns\fs\16s\u093a\13s\3s\3s\3t\3t\7t\u0940"+
		"\nt\ft\16t\u0943\13t\3t\3t\3u\3u\3u\3u\5u\u094b\nu\3v\3v\7v\u094f\nv\f"+
		"v\16v\u0952\13v\3v\3v\3w\3w\7w\u0958\nw\fw\16w\u095b\13w\3w\5w\u095e\n"+
		"w\3x\3x\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u096f\nz\3{\3{\3|\3"+
		"|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u0987\n\u0085"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u098c\n\u0086\f\u0086\16\u0086\u098f"+
		"\13\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u0998\n\u0087\f\u0087\16\u0087\u099b\13\u0087\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\7\u008c\u09ad\n\u008c\f\u008c\16\u008c"+
		"\u09b0\13\u008c\3\u008c\5\u008c\u09b3\n\u008c\3\u008c\7\u008c\u09b6\n"+
		"\u008c\f\u008c\16\u008c\u09b9\13\u008c\3\u008c\3\u008c\7\u008c\u09bd\n"+
		"\u008c\f\u008c\16\u008c\u09c0\13\u008c\5\u008c\u09c2\n\u008c\3\u008c\3"+
		"\u008c\7\u008c\u09c6\n\u008c\f\u008c\16\u008c\u09c9\13\u008c\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\7\u008d\u09cf\n\u008d\f\u008d\16\u008d\u09d2\13"+
		"\u008d\3\u008d\3\u008d\7\u008d\u09d6\n\u008d\f\u008d\16\u008d\u09d9\13"+
		"\u008d\3\u008d\7\u008d\u09dc\n\u008d\f\u008d\16\u008d\u09df\13\u008d\3"+
		"\u008e\3\u008e\3\u008e\7\u008e\u09e4\n\u008e\f\u008e\16\u008e\u09e7\13"+
		"\u008e\3\u008e\3\u008e\7\u008e\u09eb\n\u008e\f\u008e\16\u008e\u09ee\13"+
		"\u008e\3\u008e\5\u008e\u09f1\n\u008e\3\u008f\7\u008f\u09f4\n\u008f\f\u008f"+
		"\16\u008f\u09f7\13\u008f\3\u008f\3\u008f\7\u008f\u09fb\n\u008f\f\u008f"+
		"\16\u008f\u09fe\13\u008f\3\u0090\7\u0090\u0a01\n\u0090\f\u0090\16\u0090"+
		"\u0a04\13\u0090\3\u0090\3\u0090\7\u0090\u0a08\n\u0090\f\u0090\16\u0090"+
		"\u0a0b\13\u0090\3\u0091\7\u0091\u0a0e\n\u0091\f\u0091\16\u0091\u0a11\13"+
		"\u0091\3\u0091\3\u0091\7\u0091\u0a15\n\u0091\f\u0091\16\u0091\u0a18\13"+
		"\u0091\3\u0092\7\u0092\u0a1b\n\u0092\f\u0092\16\u0092\u0a1e\13\u0092\3"+
		"\u0092\3\u0092\7\u0092\u0a22\n\u0092\f\u0092\16\u0092\u0a25\13\u0092\3"+
		"\u0093\7\u0093\u0a28\n\u0093\f\u0093\16\u0093\u0a2b\13\u0093\3\u0093\3"+
		"\u0093\7\u0093\u0a2f\n\u0093\f\u0093\16\u0093\u0a32\13\u0093\3\u0094\7"+
		"\u0094\u0a35\n\u0094\f\u0094\16\u0094\u0a38\13\u0094\3\u0094\3\u0094\7"+
		"\u0094\u0a3c\n\u0094\f\u0094\16\u0094\u0a3f\13\u0094\3\u0095\7\u0095\u0a42"+
		"\n\u0095\f\u0095\16\u0095\u0a45\13\u0095\3\u0095\3\u0095\7\u0095\u0a49"+
		"\n\u0095\f\u0095\16\u0095\u0a4c\13\u0095\3\u0096\7\u0096\u0a4f\n\u0096"+
		"\f\u0096\16\u0096\u0a52\13\u0096\3\u0096\3\u0096\7\u0096\u0a56\n\u0096"+
		"\f\u0096\16\u0096\u0a59\13\u0096\3\u0097\7\u0097\u0a5c\n\u0097\f\u0097"+
		"\16\u0097\u0a5f\13\u0097\3\u0097\3\u0097\7\u0097\u0a63\n\u0097\f\u0097"+
		"\16\u0097\u0a66\13\u0097\3\u0098\7\u0098\u0a69\n\u0098\f\u0098\16\u0098"+
		"\u0a6c\13\u0098\3\u0098\3\u0098\7\u0098\u0a70\n\u0098\f\u0098\16\u0098"+
		"\u0a73\13\u0098\3\u0099\7\u0099\u0a76\n\u0099\f\u0099\16\u0099\u0a79\13"+
		"\u0099\3\u0099\3\u0099\7\u0099\u0a7d\n\u0099\f\u0099\16\u0099\u0a80\13"+
		"\u0099\3\u009a\7\u009a\u0a83\n\u009a\f\u009a\16\u009a\u0a86\13\u009a\3"+
		"\u009a\3\u009a\7\u009a\u0a8a\n\u009a\f\u009a\16\u009a\u0a8d\13\u009a\3"+
		"\u009b\7\u009b\u0a90\n\u009b\f\u009b\16\u009b\u0a93\13\u009b\3\u009b\3"+
		"\u009b\7\u009b\u0a97\n\u009b\f\u009b\16\u009b\u0a9a\13\u009b\3\u009c\7"+
		"\u009c\u0a9d\n\u009c\f\u009c\16\u009c\u0aa0\13\u009c\3\u009c\3\u009c\7"+
		"\u009c\u0aa4\n\u009c\f\u009c\16\u009c\u0aa7\13\u009c\3\u009d\7\u009d\u0aaa"+
		"\n\u009d\f\u009d\16\u009d\u0aad\13\u009d\3\u009d\3\u009d\7\u009d\u0ab1"+
		"\n\u009d\f\u009d\16\u009d\u0ab4\13\u009d\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u0abd\n\u009f\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\6\u00a1\u0ac3\n\u00a1\r\u00a1\16\u00a1\u0ac4\3\u00a2\3\u00a2"+
		"\5\u00a2\u0ac9\n\u00a2\3\u00a3\5\u00a3\u0acc\n\u00a3\3\u00a3\3\u00a3\5"+
		"\u00a3\u0ad0\n\u00a3\3\u00a4\5\u00a4\u0ad3\n\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\7\u00a5\u0ad9\n\u00a5\f\u00a5\16\u00a5\u0adc\13\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\7\u00a6\u0ae2\n\u00a6\f\u00a6\16\u00a6\u0ae5"+
		"\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0ae9\n\u00a6\f\u00a6\16\u00a6\u0aec"+
		"\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0af0\n\u00a6\f\u00a6\16\u00a6\u0af3"+
		"\13\u00a6\3\u00a6\7\u00a6\u0af6\n\u00a6\f\u00a6\16\u00a6\u0af9\13\u00a6"+
		"\3\u00a6\7\u00a6\u0afc\n\u00a6\f\u00a6\16\u00a6\u0aff\13\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\7\u00a8\u0b07\n\u00a8\f\u00a8"+
		"\16\u00a8\u0b0a\13\u00a8\3\u00a8\3\u00a8\7\u00a8\u0b0e\n\u00a8\f\u00a8"+
		"\16\u00a8\u0b11\13\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0b16\n\u00a9"+
		"\f\u00a9\16\u00a9\u0b19\13\u00a9\7\u00a9\u0b1b\n\u00a9\f\u00a9\16\u00a9"+
		"\u0b1e\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0b24\n\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\7\u00af\u0b30\n\u00af\f\u00af\16\u00af\u0b33\13\u00af\7\u00af"+
		"\u0b35\n\u00af\f\u00af\16\u00af\u0b38\13\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\7\u00b0\u0b3e\n\u00b0\f\u00b0\16\u00b0\u0b41\13\u00b0\3\u00b0"+
		"\6\u00b0\u0b44\n\u00b0\r\u00b0\16\u00b0\u0b45\3\u00b0\7\u00b0\u0b49\n"+
		"\u00b0\f\u00b0\16\u00b0\u0b4c\13\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b50\n"+
		"\u00b0\3\u00b1\3\u00b1\5\u00b1\u0b54\n\u00b1\3\u00b2\3\u00b2\7\u00b2\u0b58"+
		"\n\u00b2\f\u00b2\16\u00b2\u0b5b\13\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b5f"+
		"\n\u00b2\f\u00b2\16\u00b2\u0b62\13\u00b2\3\u00b2\7\u00b2\u0b65\n\u00b2"+
		"\f\u00b2\16\u00b2\u0b68\13\u00b2\3\u00b3\3\u00b3\3\u00b4\6\u00b4\u0b6d"+
		"\n\u00b4\r\u00b4\16\u00b4\u0b6e\3\u00b4\7\u00b4\u0b72\n\u00b4\f\u00b4"+
		"\16\u00b4\u0b75\13\u00b4\3\u00b4\3\u00b4\7\u00b4\u0b79\n\u00b4\f\u00b4"+
		"\16\u00b4\u0b7c\13\u00b4\5\u00b4\u0b7e\n\u00b4\3\u00b4\2\2\u00b5\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\2\33\3\2!\"\3\2\23\24\3\2\24\25\3\2\37\"\3\2*,\3\2/\60\3\2FG\3\2\u00a1"+
		"\u00a3\3\2\u00a7\u00a9\r\2PQSSVVYY[[]]__aacceeww\3\2xy\3\2z{\3\2|\u0083"+
		"\3\2?@\3\2=>\3\2ik\4\2RRUU\5\2XXZZ\\\\\3\2;<\7\2RRTUWWppuu\5\2TTWWqq\4"+
		"\2ghnn\3\2\31\34\3\2#&\3\2\')\2\u0c8c\2\u016b\3\2\2\2\4\u0188\3\2\2\2"+
		"\6\u018c\3\2\2\2\b\u0193\3\2\2\2\n\u0196\3\2\2\2\f\u01a7\3\2\2\2\16\u01a9"+
		"\3\2\2\2\20\u01ad\3\2\2\2\22\u01ba\3\2\2\2\24\u01c9\3\2\2\2\26\u01cb\3"+
		"\2\2\2\30\u01ff\3\2\2\2\32\u022a\3\2\2\2\34\u0245\3\2\2\2\36\u026f\3\2"+
		"\2\2 \u0273\3\2\2\2\"\u0298\3\2\2\2$\u02c1\3\2\2\2&\u02c3\3\2\2\2(\u02d7"+
		"\3\2\2\2*\u02de\3\2\2\2,\u02f2\3\2\2\2.\u0317\3\2\2\2\60\u031a\3\2\2\2"+
		"\62\u033c\3\2\2\2\64\u0345\3\2\2\2\66\u035f\3\2\2\28\u0366\3\2\2\2:\u036f"+
		"\3\2\2\2<\u0378\3\2\2\2>\u0383\3\2\2\2@\u03a4\3\2\2\2B\u03a6\3\2\2\2D"+
		"\u03aa\3\2\2\2F\u03ac\3\2\2\2H\u03cf\3\2\2\2J\u03fa\3\2\2\2L\u0400\3\2"+
		"\2\2N\u0402\3\2\2\2P\u0404\3\2\2\2R\u0406\3\2\2\2T\u0411\3\2\2\2V\u0424"+
		"\3\2\2\2X\u0426\3\2\2\2Z\u044b\3\2\2\2\\\u045b\3\2\2\2^\u0471\3\2\2\2"+
		"`\u0475\3\2\2\2b\u0497\3\2\2\2d\u04af\3\2\2\2f\u04b6\3\2\2\2h\u04d0\3"+
		"\2\2\2j\u04f7\3\2\2\2l\u050b\3\2\2\2n\u051f\3\2\2\2p\u053a\3\2\2\2r\u054f"+
		"\3\2\2\2t\u0555\3\2\2\2v\u0577\3\2\2\2x\u0589\3\2\2\2z\u05a7\3\2\2\2|"+
		"\u05d2\3\2\2\2~\u0605\3\2\2\2\u0080\u0608\3\2\2\2\u0082\u0619\3\2\2\2"+
		"\u0084\u064b\3\2\2\2\u0086\u0670\3\2\2\2\u0088\u0682\3\2\2\2\u008a\u069b"+
		"\3\2\2\2\u008c\u069d\3\2\2\2\u008e\u06ae\3\2\2\2\u0090\u06c5\3\2\2\2\u0092"+
		"\u06cc\3\2\2\2\u0094\u06e9\3\2\2\2\u0096\u06f5\3\2\2\2\u0098\u06f7\3\2"+
		"\2\2\u009a\u0712\3\2\2\2\u009c\u0714\3\2\2\2\u009e\u0741\3\2\2\2\u00a0"+
		"\u0751\3\2\2\2\u00a2\u075b\3\2\2\2\u00a4\u075d\3\2\2\2\u00a6\u0766\3\2"+
		"\2\2\u00a8\u076f\3\2\2\2\u00aa\u0778\3\2\2\2\u00ac\u0781\3\2\2\2\u00ae"+
		"\u078a\3\2\2\2\u00b0\u0797\3\2\2\2\u00b2\u0799\3\2\2\2\u00b4\u07a2\3\2"+
		"\2\2\u00b6\u07ab\3\2\2\2\u00b8\u07b1\3\2\2\2\u00ba\u07ba\3\2\2\2\u00bc"+
		"\u07c3\3\2\2\2\u00be\u07cc\3\2\2\2\u00c0\u07d5\3\2\2\2\u00c2\u07de\3\2"+
		"\2\2\u00c4\u07e3\3\2\2\2\u00c6\u07f7\3\2\2\2\u00c8\u07f9\3\2\2\2\u00ca"+
		"\u07fd\3\2\2\2\u00cc\u0800\3\2\2\2\u00ce\u080a\3\2\2\2\u00d0\u082f\3\2"+
		"\2\2\u00d2\u0831\3\2\2\2\u00d4\u0835\3\2\2\2\u00d6\u0837\3\2\2\2\u00d8"+
		"\u0862\3\2\2\2\u00da\u0872\3\2\2\2\u00dc\u08cf\3\2\2\2\u00de\u08d1\3\2"+
		"\2\2\u00e0\u08dc\3\2\2\2\u00e2\u08f9\3\2\2\2\u00e4\u090b\3\2\2\2\u00e6"+
		"\u093d\3\2\2\2\u00e8\u094a\3\2\2\2\u00ea\u094c\3\2\2\2\u00ec\u0955\3\2"+
		"\2\2\u00ee\u095f\3\2\2\2\u00f0\u0961\3\2\2\2\u00f2\u096e\3\2\2\2\u00f4"+
		"\u0970\3\2\2\2\u00f6\u0972\3\2\2\2\u00f8\u0974\3\2\2\2\u00fa\u0976\3\2"+
		"\2\2\u00fc\u0978\3\2\2\2\u00fe\u097a\3\2\2\2\u0100\u097c\3\2\2\2\u0102"+
		"\u097e\3\2\2\2\u0104\u0980\3\2\2\2\u0106\u0982\3\2\2\2\u0108\u0986\3\2"+
		"\2\2\u010a\u0988\3\2\2\2\u010c\u0992\3\2\2\2\u010e\u099e\3\2\2\2\u0110"+
		"\u09a0\3\2\2\2\u0112\u09a4\3\2\2\2\u0114\u09a6\3\2\2\2\u0116\u09aa\3\2"+
		"\2\2\u0118\u09cc\3\2\2\2\u011a\u09e0\3\2\2\2\u011c\u09f5\3\2\2\2\u011e"+
		"\u0a02\3\2\2\2\u0120\u0a0f\3\2\2\2\u0122\u0a1c\3\2\2\2\u0124\u0a29\3\2"+
		"\2\2\u0126\u0a36\3\2\2\2\u0128\u0a43\3\2\2\2\u012a\u0a50\3\2\2\2\u012c"+
		"\u0a5d\3\2\2\2\u012e\u0a6a\3\2\2\2\u0130\u0a77\3\2\2\2\u0132\u0a84\3\2"+
		"\2\2\u0134\u0a91\3\2\2\2\u0136\u0a9e\3\2\2\2\u0138\u0aab\3\2\2\2\u013a"+
		"\u0ab5\3\2\2\2\u013c\u0abc\3\2\2\2\u013e\u0abe\3\2\2\2\u0140\u0ac0\3\2"+
		"\2\2\u0142\u0ac8\3\2\2\2\u0144\u0acb\3\2\2\2\u0146\u0ad2\3\2\2\2\u0148"+
		"\u0ad6\3\2\2\2\u014a\u0adf\3\2\2\2\u014c\u0b02\3\2\2\2\u014e\u0b08\3\2"+
		"\2\2\u0150\u0b12\3\2\2\2\u0152\u0b23\3\2\2\2\u0154\u0b25\3\2\2\2\u0156"+
		"\u0b27\3\2\2\2\u0158\u0b29\3\2\2\2\u015a\u0b2b\3\2\2\2\u015c\u0b36\3\2"+
		"\2\2\u015e\u0b39\3\2\2\2\u0160\u0b51\3\2\2\2\u0162\u0b55\3\2\2\2\u0164"+
		"\u0b69\3\2\2\2\u0166\u0b7d\3\2\2\2\u0168\u016a\7\7\2\2\u0169\u0168\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0172\5\4\3\2\u016f\u0171\7\7"+
		"\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0183\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0180\5\24"+
		"\13\2\u0176\u0178\5\u0166\u00b4\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u017d\5\24\13\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3"+
		"\2\2\2\u017e\u0177\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0175\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\2\2\3\u0186"+
		"\3\3\2\2\2\u0187\u0189\5\6\4\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018b\5\b\5\2\u018b\5\3\2\2\2\u018c\u018e\5"+
		"\u0162\u00b2\2\u018d\u018f\5\u0166\u00b4\2\u018e\u018d\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\7\3\2\2\2\u0190\u0192\5\n\6\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\t\3\2\2\2"+
		"\u0195\u0193\3\2\2\2\u0196\u0197\7\b\2\2\u0197\u019c\5\f\7\2\u0198\u0199"+
		"\7f\2\2\u0199\u019b\5\f\7\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u01a1\5\u0166\u00b4\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\13\3\2\2\2\u01a4\u01a8"+
		"\5\22\n\2\u01a5\u01a8\5\16\b\2\u01a6\u01a8\5\20\t\2\u01a7\u01a4\3\2\2"+
		"\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\r\3\2\2\2\u01a9\u01aa"+
		"\5\u0162\u00b2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7X\2\2\u01ac\17\3\2\2"+
		"\2\u01ad\u01ae\5\u0162\u00b2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7L\2\2\u01b0"+
		"\u01b5\5\22\n\2\u01b1\u01b2\7f\2\2\u01b2\u01b4\5\22\n\2\u01b3\u01b1\3"+
		"\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7M\2\2\u01b9\21\3\2\2\2"+
		"\u01ba\u01bd\5\u0162\u00b2\2\u01bb\u01bc\7\t\2\2\u01bc\u01be\5\u0164\u00b3"+
		"\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\23\3\2\2\2\u01bf\u01ca"+
		"\5\26\f\2\u01c0\u01ca\5\30\r\2\u01c1\u01ca\5\32\16\2\u01c2\u01ca\5\34"+
		"\17\2\u01c3\u01ca\5`\61\2\u01c4\u01ca\5f\64\2\u01c5\u01ca\5n8\2\u01c6"+
		"\u01ca\5\u0082B\2\u01c7\u01ca\5t;\2\u01c8\u01ca\5\u008cG\2\u01c9\u01bf"+
		"\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c1\3\2\2\2\u01c9\u01c2\3\2\2\2\u01c9"+
		"\u01c3\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\25\3\2\2\2\u01cb\u01cc"+
		"\5\u0150\u00a9\2\u01cc\u01d0\7\n\2\2\u01cd\u01cf\7\7\2\2\u01ce\u01cd\3"+
		"\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01db\5\u0164\u00b3\2\u01d4\u01d6"+
		"\7\7\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\5F"+
		"$\2\u01db\u01d7\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e4\3\2\2\2\u01dd"+
		"\u01df\7\7\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e5\5\36\20\2\u01e4\u01e0\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f4\3"+
		"\2\2\2\u01e6\u01e8\7\7\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01f0\7\u0084\2\2\u01ed\u01ef\7\7\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\5&\24\2\u01f4\u01e9\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01fd\3\2\2\2\u01f6\u01f8\7\7\2\2\u01f7\u01f6\3\2"+
		"\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fe\5\64\33\2\u01fd\u01f9\3"+
		"\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\27\3\2\2\2\u01ff\u0200\5\u0150\u00a9"+
		"\2\u0200\u0204\7\13\2\2\u0201\u0203\7\7\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0207\u020f\5\u0164\u00b3\2\u0208\u020a\7\7\2"+
		"\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\5F$\2\u020f"+
		"\u020b\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u021f\3\2\2\2\u0211\u0213\7\7"+
		"\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u021b\7\u0084"+
		"\2\2\u0218\u021a\7\7\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u0220\5*\26\2\u021f\u0214\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0228\3\2\2\2\u0221\u0223\7\7\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0229\5\64\33\2\u0228\u0224\3\2\2\2\u0228\u0229\3"+
		"\2\2\2\u0229\31\3\2\2\2\u022a\u022b\5\u0150\u00a9\2\u022b\u022f\7\20\2"+
		"\2\u022c\u022e\7\7\2\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232"+
		"\u023a\5\u0164\u00b3\2\u0233\u0235\7\7\2\2\u0234\u0233\3\2\2\2\u0235\u0238"+
		"\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023b\5\36\20\2\u023a\u0236\3\2\2\2\u023a\u023b\3"+
		"\2\2\2\u023b\u0243\3\2\2\2\u023c\u023e\7\7\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0244\5\64\33\2\u0243\u023f\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\33\3\2\2\2\u0245\u0246\5\u0150\u00a9\2\u0246\u024a"+
		"\7\r\2\2\u0247\u0249\7\7\2\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u0255\5\u0164\u00b3\2\u024e\u0250\7\7\2\2\u024f\u024e\3\2\2"+
		"\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\5F$\2\u0255\u0251\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u025a\3\2\2\2\u0257\u0259\7\7\2\2\u0258\u0257\3\2"+
		"\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0265\5\36\20\2\u025e\u0260\7"+
		"\7\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0266\5\64"+
		"\33\2\u0265\u0261\3\2\2\2\u0265\u0266\3\2\2\2\u0266\35\3\2\2\2\u0267\u0268"+
		"\5\u0150\u00a9\2\u0268\u026c\7\27\2\2\u0269\u026b\7\7\2\2\u026a\u0269"+
		"\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271\u0272\5 \21\2\u0272\37\3\2\2\2\u0273\u0277"+
		"\7J\2\2\u0274\u0276\7\7\2\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u028e\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u027a\u028b\5\"\22\2\u027b\u027d\7\7\2\2\u027c\u027b\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2"+
		"\2\2\u0280\u027e\3\2\2\2\u0281\u0285\7f\2\2\u0282\u0284\7\7\2\2\u0283"+
		"\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0288\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a\5\"\22\2\u0289"+
		"\u027e\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u027a\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0293\3\2\2\2\u0290\u0292\7\7\2\2\u0291\u0290\3\2"+
		"\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7K\2\2\u0297!\3\2\2\2\u0298"+
		"\u029a\5\u0150\u00a9\2\u0299\u029b\5$\23\2\u029a\u0299\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029f\3\2\2\2\u029c\u029e\7\7\2\2\u029d\u029c\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a6\5\u0164\u00b3\2\u02a3\u02a5\7\7\2"+
		"\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ad\7m\2\2\u02aa"+
		"\u02ac\7\7\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02bf\5R*\2\u02b1\u02b3\7\7\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2"+
		"\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4"+
		"\3\2\2\2\u02b7\u02bb\7P\2\2\u02b8\u02ba\7\7\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c0\5\u00a2R\2\u02bf\u02b4\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0#\3\2\2\2\u02c1\u02c2\t\2\2\2\u02c2%\3\2\2\2\u02c3"+
		"\u02d4\5(\25\2\u02c4\u02c6\7\7\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2"+
		"\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02ca\u02ce\7f\2\2\u02cb\u02cd\7\7\2\2\u02cc\u02cb\3\2"+
		"\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\5(\25\2\u02d2\u02c7\3\2"+
		"\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\'\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\5\u0162\u00b2\2\u02d8\u02da"+
		"\5> \2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02dd\5,\27\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd)\3\2\2\2"+
		"\u02de\u02ef\5\u0162\u00b2\2\u02df\u02e1\7\7\2\2\u02e0\u02df\3\2\2\2\u02e1"+
		"\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2"+
		"\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\7f\2\2\u02e6\u02e8\7\7\2\2\u02e7"+
		"\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ee\5\u0162\u00b2"+
		"\2\u02ed\u02e2\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0+\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f6\7J\2\2\u02f3\u02f5"+
		"\7\7\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u0313\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u030a\5."+
		"\30\2\u02fa\u02fc\7\7\2\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fd\3\2"+
		"\2\2\u0300\u0304\7f\2\2\u0301\u0303\7\7\2\2\u0302\u0301\3\2\2\2\u0303"+
		"\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2"+
		"\2\2\u0306\u0304\3\2\2\2\u0307\u0309\5.\30\2\u0308\u02fd\3\2\2\2\u0309"+
		"\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0310\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030d\u030f\7\7\2\2\u030e\u030d\3\2\2\2\u030f"+
		"\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0313\u02f9\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\7K\2\2\u0316-\3\2\2\2\u0317\u0318\5\u015c\u00af"+
		"\2\u0318\u0319\5\u00a2R\2\u0319/\3\2\2\2\u031a\u031b\5\u0150\u00a9\2\u031b"+
		"\u031f\7\27\2\2\u031c\u031e\7\7\2\2\u031d\u031c\3\2\2\2\u031e\u0321\3"+
		"\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0322\u0331\5\u0084C\2\u0323\u0325\7\7\2\2\u0324\u0323"+
		"\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032d\7m\2\2\u032a\u032c\7\7"+
		"\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0332\5\62"+
		"\32\2\u0331\u0326\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0336\3\2\2\2\u0333"+
		"\u0335\7\7\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u033b\5\u0092J\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\61\3\2"+
		"\2\2\u033c\u0340\t\3\2\2\u033d\u033f\7\7\2\2\u033e\u033d\3\2\2\2\u033f"+
		"\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2"+
		"\2\2\u0342\u0340\3\2\2\2\u0343\u0344\5,\27\2\u0344\63\3\2\2\2\u0345\u0349"+
		"\7N\2\2\u0346\u0348\7\7\2\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034f\3\2\2\2\u034b\u0349\3\2"+
		"\2\2\u034c\u034e\5\66\34\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0355\3\2\2\2\u0351\u034f\3\2"+
		"\2\2\u0352\u0354\7\7\2\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358\u0359\7O\2\2\u0359\65\3\2\2\2\u035a\u0360\5\24\13\2\u035b\u0360"+
		"\5\60\31\2\u035c\u0360\58\35\2\u035d\u0360\5:\36\2\u035e\u0360\5<\37\2"+
		"\u035f\u035a\3\2\2\2\u035f\u035b\3\2\2\2\u035f\u035c\3\2\2\2\u035f\u035d"+
		"\3\2\2\2\u035f\u035e\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u0363\5\u0166\u00b4"+
		"\2\u0362\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\67\3\2\2\2\u0366\u036a\7\30\2\2\u0367\u0369\7\7\2\2\u0368"+
		"\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2"+
		"\2\2\u036b\u036d\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\5\u0092J\2\u036e"+
		"9\3\2\2\2\u036f\u0373\7\27\2\2\u0370\u0372\7\7\2\2\u0371\u0370\3\2\2\2"+
		"\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376"+
		"\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\5\u0092J\2\u0377;\3\2\2\2\u0378"+
		"\u0379\5\u0150\u00a9\2\u0379\u0381\7\21\2\2\u037a\u037c\7\7\2\2\u037b"+
		"\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0382\5\64\33\2\u0381"+
		"\u037d\3\2\2\2\u0381\u0382\3\2\2\2\u0382=\3\2\2\2\u0383\u0387\7|\2\2\u0384"+
		"\u0386\7\7\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a"+
		"\u0395\5@!\2\u038b\u038d\7\7\2\2\u038c\u038b\3\2\2\2\u038d\u0390\3\2\2"+
		"\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u038e"+
		"\3\2\2\2\u0391\u0392\7f\2\2\u0392\u0394\5@!\2\u0393\u038e\3\2\2\2\u0394"+
		"\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039b\3\2"+
		"\2\2\u0397\u0395\3\2\2\2\u0398\u039a\7\7\2\2\u0399\u0398\3\2\2\2\u039a"+
		"\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2"+
		"\2\2\u039d\u039b\3\2\2\2\u039e\u039f\7\u0080\2\2\u039f?\3\2\2\2\u03a0"+
		"\u03a1\5B\"\2\u03a1\u03a2\5R*\2\u03a2\u03a5\3\2\2\2\u03a3\u03a5\7r\2\2"+
		"\u03a4\u03a0\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5A\3\2\2\2\u03a6\u03a8\5"+
		"\u015c\u00af\2\u03a7\u03a9\5D#\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2"+
		"\2\u03a9C\3\2\2\2\u03aa\u03ab\5P)\2\u03abE\3\2\2\2\u03ac\u03b0\7|\2\2"+
		"\u03ad\u03af\7\7\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3"+
		"\u03c4\5H%\2\u03b4\u03b6\7\7\2\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2"+
		"\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7"+
		"\3\2\2\2\u03ba\u03be\7f\2\2\u03bb\u03bd\7\7\2\2\u03bc\u03bb\3\2\2\2\u03bd"+
		"\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2"+
		"\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c3\5H%\2\u03c2\u03b7\3\2\2\2\u03c3\u03c6"+
		"\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03ca\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c7\u03c9\7\7\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03cc\3\2"+
		"\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc"+
		"\u03ca\3\2\2\2\u03cd\u03ce\7\u0080\2\2\u03ceG\3\2\2\2\u03cf\u03d3\5J&"+
		"\2\u03d0\u03d2\7\7\2\2\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6"+
		"\u03f8\5\u0164\u00b3\2\u03d7\u03d9\7\7\2\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dd\u03e1\7m\2\2\u03de\u03e0\7\7\2\2\u03df\u03de\3\2"+
		"\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e4\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03f5\5R*\2\u03e5\u03e7\7\7\2"+
		"\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ef\7`\2\2\u03ec"+
		"\u03ee\7\7\2\2\u03ed\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f4\5R*\2\u03f3\u03e8\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2"+
		"\2\u03f5\u03f6\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03da"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9I\3\2\2\2\u03fa\u03fc\5\u015c\u00af"+
		"\2\u03fb\u03fd\5L\'\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fdK\3"+
		"\2\2\2\u03fe\u0401\5N(\2\u03ff\u0401\5P)\2\u0400\u03fe\3\2\2\2\u0400\u03ff"+
		"\3\2\2\2\u0401M\3\2\2\2\u0402\u0403\7\26\2\2\u0403O\3\2\2\2\u0404\u0405"+
		"\t\4\2\2\u0405Q\3\2\2\2\u0406\u040f\5\u015c\u00af\2\u0407\u0410\5T+\2"+
		"\u0408\u0410\5Z.\2\u0409\u0410\5\\/\2\u040a\u0410\5^\60\2\u040b\u040d"+
		"\5\u0162\u00b2\2\u040c\u040e\5> \2\u040d\u040c\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u0410\3\2\2\2\u040f\u0407\3\2\2\2\u040f\u0408\3\2\2\2\u040f"+
		"\u0409\3\2\2\2\u040f\u040a\3\2\2\2\u040f\u040b\3\2\2\2\u0410S\3\2\2\2"+
		"\u0411\u0415\5X-\2\u0412\u0414\7\7\2\2\u0413\u0412\3\2\2\2\u0414\u0417"+
		"\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0418\u041c\7\u0086\2\2\u0419\u041b\7\7\2\2\u041a\u0419"+
		"\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041f\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0420\5R*\2\u0420U\3\2\2\2\u0421"+
		"\u0425\5Z.\2\u0422\u0425\5^\60\2\u0423\u0425\5\u0162\u00b2\2\u0424\u0421"+
		"\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0423\3\2\2\2\u0425W\3\2\2\2\u0426"+
		"\u042a\7J\2\2\u0427\u0429\7\7\2\2\u0428\u0427\3\2\2\2\u0429\u042c\3\2"+
		"\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0441\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042d\u043e\5R*\2\u042e\u0430\7\7\2\2\u042f\u042e\3\2\2"+
		"\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434"+
		"\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0438\7f\2\2\u0435\u0437\7\7\2\2\u0436"+
		"\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2"+
		"\2\2\u0439\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5R*\2\u043c\u0431"+
		"\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f"+
		"\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u042d\3\2\2\2\u0441\u0442\3\2"+
		"\2\2\u0442\u0446\3\2\2\2\u0443\u0445\7\7\2\2\u0444\u0443\3\2\2\2\u0445"+
		"\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0449\u044a\7K\2\2\u044aY\3\2\2\2\u044b\u044f"+
		"\7J\2\2\u044c\u044e\7\7\2\2\u044d\u044c\3\2\2\2\u044e\u0451\3\2\2\2\u044f"+
		"\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u044f\3\2"+
		"\2\2\u0452\u0456\5R*\2\u0453\u0455\7\7\2\2\u0454\u0453\3\2\2\2\u0455\u0458"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0459\u045a\7K\2\2\u045a[\3\2\2\2\u045b\u045f\7L\2\2\u045c"+
		"\u045e\7\7\2\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462"+
		"\u0466\5R*\2\u0463\u0465\7\7\2\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2"+
		"\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466"+
		"\3\2\2\2\u0469\u046a\7M\2\2\u046a]\3\2\2\2\u046b\u046d\5\u0162\u00b2\2"+
		"\u046c\u046e\5> \2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0472"+
		"\3\2\2\2\u046f\u0472\5Z.\2\u0470\u0472\5\\/\2\u0471\u046b\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7r"+
		"\2\2\u0474_\3\2\2\2\u0475\u0476\5\u0150\u00a9\2\u0476\u047a\7\f\2\2\u0477"+
		"\u0479\7\7\2\2\u0478\u0477\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d"+
		"\u048c\5\u0164\u00b3\2\u047e\u0480\7\7\2\2\u047f\u047e\3\2\2\2\u0480\u0483"+
		"\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0484\u0488\7\u0084\2\2\u0485\u0487\7\7\2\2\u0486\u0485"+
		"\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048d\5&\24\2\u048c\u0481\3\2"+
		"\2\2\u048c\u048d\3\2\2\2\u048d\u0495\3\2\2\2\u048e\u0490\7\7\2\2\u048f"+
		"\u048e\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2"+
		"\2\2\u0492\u0494\3\2\2\2\u0493\u0491\3\2\2\2\u0494\u0496\5b\62\2\u0495"+
		"\u0491\3\2\2\2\u0495\u0496\3\2\2\2\u0496a\3\2\2\2\u0497\u049b\7N\2\2\u0498"+
		"\u049a\7\7\2\2\u0499\u0498\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2"+
		"\2\2\u049b\u049c\3\2\2\2\u049c\u04a1\3\2\2\2\u049d\u049b\3\2\2\2\u049e"+
		"\u04a0\5d\63\2\u049f\u049e\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a7\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a6\7\7\2\2\u04a5\u04a4\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa"+
		"\u04ab\7O\2\2\u04abc\3\2\2\2\u04ac\u04b0\5\24\13\2\u04ad\u04b0\58\35\2"+
		"\u04ae\u04b0\5:\36\2\u04af\u04ac\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04ae"+
		"\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04b3\5\u0166\u00b4\2\u04b2\u04b1\3"+
		"\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"e\3\2\2\2\u04b6\u04b7\5\u0150\u00a9\2\u04b7\u04bb\7\17\2\2\u04b8\u04ba"+
		"\7\7\2\2\u04b9\u04b8\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04c6\5\u0164"+
		"\u00b3\2\u04bf\u04c1\7\7\2\2\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2"+
		"\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2"+
		"\2\2\u04c5\u04c7\5\36\20\2\u04c6\u04c2\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7"+
		"\u04cb\3\2\2\2\u04c8\u04ca\7\7\2\2\u04c9\u04c8\3\2\2\2\u04ca\u04cd\3\2"+
		"\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04ce\u04cf\5h\65\2\u04cfg\3\2\2\2\u04d0\u04d4\7N\2\2\u04d1"+
		"\u04d3\7\7\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2"+
		"\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7"+
		"\u04d9\5j\66\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04ed\3\2"+
		"\2\2\u04da\u04dc\7\7\2\2\u04db\u04da\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd"+
		"\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04dd\3\2"+
		"\2\2\u04e0\u04e4\7o\2\2\u04e1\u04e3\7\7\2\2\u04e2\u04e1\3\2\2\2\u04e3"+
		"\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04ea\3\2"+
		"\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e9\5\66\34\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ee\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04dd\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04f2\3\2\2\2\u04ef\u04f1\7\7\2\2\u04f0\u04ef\3\2\2\2\u04f1\u04f4\3\2"+
		"\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4"+
		"\u04f2\3\2\2\2\u04f5\u04f6\7O\2\2\u04f6i\3\2\2\2\u04f7\u0508\5l\67\2\u04f8"+
		"\u04fa\7\7\2\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2"+
		"\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe"+
		"\u0502\7f\2\2\u04ff\u0501\7\7\2\2\u0500\u04ff\3\2\2\2\u0501\u0504\3\2"+
		"\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0505\u0507\5l\67\2\u0506\u04fb\3\2\2\2\u0507\u050a\3\2"+
		"\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509k\3\2\2\2\u050a\u0508"+
		"\3\2\2\2\u050b\u050c\5\u0150\u00a9\2\u050c\u0514\5\u0164\u00b3\2\u050d"+
		"\u050f\7\7\2\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513"+
		"\u0515\5,\27\2\u0514\u0510\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u051d\3\2"+
		"\2\2\u0516\u0518\7\7\2\2\u0517\u0516\3\2\2\2\u0518\u051b\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u0519\3\2"+
		"\2\2\u051c\u051e\5\64\33\2\u051d\u0519\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"m\3\2\2\2\u051f\u0520\5\u0150\u00a9\2\u0520\u0528\7-\2\2\u0521\u0523\7"+
		"\7\2\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524"+
		"\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0529\5F"+
		"$\2\u0528\u0524\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052d\3\2\2\2\u052a"+
		"\u052c\7\7\2\2\u052b\u052a\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2"+
		"\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2\2\2\u0530"+
		"\u0538\5V,\2\u0531\u0533\7\7\2\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2\2"+
		"\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0534"+
		"\3\2\2\2\u0537\u0539\5p9\2\u0538\u0534\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"o\3\2\2\2\u053a\u053e\7N\2\2\u053b\u053d\7\7\2\2\u053c\u053b\3\2\2\2\u053d"+
		"\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0544\3\2"+
		"\2\2\u0540\u053e\3\2\2\2\u0541\u0543\5r:\2\u0542\u0541\3\2\2\2\u0543\u0546"+
		"\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u054a\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u0549\7\7\2\2\u0548\u0547\3\2\2\2\u0549\u054c\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u054e\7O\2\2\u054eq\3\2\2\2\u054f\u0551\5\u0082B"+
		"\2\u0550\u0552\5\u0166\u00b4\2\u0551\u0550\3\2\2\2\u0552\u0553\3\2\2\2"+
		"\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554s\3\2\2\2\u0555\u0556\5"+
		"\u0150\u00a9\2\u0556\u055a\t\5\2\2\u0557\u0559\7\7\2\2\u0558\u0557\3\2"+
		"\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055d\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u056c\5v<\2\u055e\u0560\7\7\2"+
		"\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562"+
		"\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0568\7P\2\2\u0565"+
		"\u0567\7\7\2\2\u0566\u0565\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2"+
		"\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u0568\3\2\2\2\u056b"+
		"\u056d\5\u00a2R\2\u056c\u0561\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0575"+
		"\3\2\2\2\u056e\u0570\7\7\2\2\u056f\u056e\3\2\2\2\u0570\u0573\3\2\2\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0571\3\2"+
		"\2\2\u0574\u0576\5x=\2\u0575\u0571\3\2\2\2\u0575\u0576\3\2\2\2\u0576u"+
		"\3\2\2\2\u0577\u0578\5\u015c\u00af\2\u0578\u0587\5\u0164\u00b3\2\u0579"+
		"\u057b\7\7\2\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2"+
		"\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f"+
		"\u0583\7m\2\2\u0580\u0582\7\7\2\2\u0581\u0580\3\2\2\2\u0582\u0585\3\2"+
		"\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u0583\3\2\2\2\u0586\u0588\5R*\2\u0587\u057c\3\2\2\2\u0587\u0588\3\2\2"+
		"\2\u0588w\3\2\2\2\u0589\u058d\7N\2\2\u058a\u058c\7\7\2\2\u058b\u058a\3"+
		"\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u059c\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0593\5z>\2\u0591\u0593\5|?\2"+
		"\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u0597\3\2\2\2\u0594\u0596"+
		"\5\u0166\u00b4\2\u0595\u0594\3\2\2\2\u0596\u0599\3\2\2\2\u0597\u0595\3"+
		"\2\2\2\u0597\u0598\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u059a"+
		"\u0592\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2"+
		"\2\2\u059d\u05a2\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a1\7\7\2\2\u05a0"+
		"\u059f\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2"+
		"\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a6\7O\2\2\u05a6"+
		"y\3\2\2\2\u05a7\u05a8\5\u0150\u00a9\2\u05a8\u05b7\7\35\2\2\u05a9\u05ab"+
		"\7\7\2\2\u05aa\u05a9\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac"+
		"\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b3\7J"+
		"\2\2\u05b0\u05b2\7\7\2\2\u05b1\u05b0\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3"+
		"\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b3\3\2"+
		"\2\2\u05b6\u05b8\7K\2\2\u05b7\u05ac\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\u05c7\3\2\2\2\u05b9\u05bb\7\7\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05be\3\2"+
		"\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be"+
		"\u05bc\3\2\2\2\u05bf\u05c3\7\u0085\2\2\u05c0\u05c2\7\7\2\2\u05c1\u05c0"+
		"\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c6\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05c8\5R*\2\u05c7\u05bc\3\2\2"+
		"\2\u05c7\u05c8\3\2\2\2\u05c8\u05cc\3\2\2\2\u05c9\u05cb\7\7\2\2\u05ca\u05c9"+
		"\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05d1\5\u008aF\2\u05d0\u05cf"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1{\3\2\2\2\u05d2\u05d3\5\u0150\u00a9"+
		"\2\u05d3\u05d7\7\36\2\2\u05d4\u05d6\7\7\2\2\u05d5\u05d4\3\2\2\2\u05d6"+
		"\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u0603\3\2"+
		"\2\2\u05d9\u05d7\3\2\2\2\u05da\u05de\7J\2\2\u05db\u05dd\7\7\2\2\u05dc"+
		"\u05db\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e1\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e5\5~@\2\u05e2\u05e4"+
		"\7\7\2\2\u05e3\u05e2\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05e9\7K"+
		"\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05da\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb"+
		"\u05fa\3\2\2\2\u05ec\u05ee\7\7\2\2\u05ed\u05ec\3\2\2\2\u05ee\u05f1\3\2"+
		"\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\3\2\2\2\u05f1"+
		"\u05ef\3\2\2\2\u05f2\u05f6\7\u0085\2\2\u05f3\u05f5\7\7\2\2\u05f4\u05f3"+
		"\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f9\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fb\5R*\2\u05fa\u05ef\3\2\2"+
		"\2\u05fa\u05fb\3\2\2\2\u05fb\u05ff\3\2\2\2\u05fc\u05fe\7\7\2\2\u05fd\u05fc"+
		"\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0604\5\u008aF\2\u0603\u05ea"+
		"\3\2\2\2\u0603\u0604\3\2\2\2\u0604}\3\2\2\2\u0605\u0606\5\u0150\u00a9"+
		"\2\u0606\u0607\5\u0080A\2\u0607\177\3\2\2\2\u0608\u0617\5\u0164\u00b3"+
		"\2\u0609\u060b\7\7\2\2\u060a\u0609\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a"+
		"\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e\u060c\3\2\2\2\u060f"+
		"\u0613\7m\2\2\u0610\u0612\7\7\2\2\u0611\u0610\3\2\2\2\u0612\u0615\3\2"+
		"\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0616\3\2\2\2\u0615"+
		"\u0613\3\2\2\2\u0616\u0618\5R*\2\u0617\u060c\3\2\2\2\u0617\u0618\3\2\2"+
		"\2\u0618\u0081\3\2\2\2\u0619\u061a\5\u0150\u00a9\2\u061a\u0622\t\6\2\2"+
		"\u061b\u061d\7\7\2\2\u061c\u061b\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c"+
		"\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u061e\3\2\2\2\u0621"+
		"\u0623\5F$\2\u0622\u061e\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0627\3\2\2"+
		"\2\u0624\u0626\7\7\2\2\u0625\u0624\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625"+
		"\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u0627\3\2\2\2\u062a"+
		"\u062e\5\u0164\u00b3\2\u062b\u062d\7\7\2\2\u062c\u062b\3\2\2\2\u062d\u0630"+
		"\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0631\3\2\2\2\u0630"+
		"\u062e\3\2\2\2\u0631\u0640\5\u0084C\2\u0632\u0634\7\7\2\2\u0633\u0632"+
		"\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0638\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063c\7\u0085\2\2\u0639\u063b"+
		"\7\7\2\2\u063a\u0639\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0641\5R"+
		"*\2\u0640\u0635\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0649\3\2\2\2\u0642"+
		"\u0644\7\7\2\2\u0643\u0642\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643\3\2"+
		"\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0645\3\2\2\2\u0648"+
		"\u064a\5\u008aF\2\u0649\u0645\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0083"+
		"\3\2\2\2\u064b\u064f\7J\2\2\u064c\u064e\7\7\2\2\u064d\u064c\3\2\2\2\u064e"+
		"\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0666\3\2"+
		"\2\2\u0651\u064f\3\2\2\2\u0652\u0663\5\u0086D\2\u0653\u0655\7\7\2\2\u0654"+
		"\u0653\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2"+
		"\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065d\7f\2\2\u065a"+
		"\u065c\7\7\2\2\u065b\u065a\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065b\3\2"+
		"\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u065d\3\2\2\2\u0660"+
		"\u0662\5\u0086D\2\u0661\u0656\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0666"+
		"\u0652\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u066b\3\2\2\2\u0668\u066a\7\7"+
		"\2\2\u0669\u0668\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u066f\7K"+
		"\2\2\u066f\u0085\3\2\2\2\u0670\u0671\5\u0150\u00a9\2\u0671\u0680\5\u0088"+
		"E\2\u0672\u0674\7\7\2\2\u0673\u0672\3\2\2\2\u0674\u0677\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0675\3\2"+
		"\2\2\u0678\u067c\7P\2\2\u0679\u067b\7\7\2\2\u067a\u0679\3\2\2\2\u067b"+
		"\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2"+
		"\2\2\u067e\u067c\3\2\2\2\u067f\u0681\5\u00a2R\2\u0680\u0675\3\2\2\2\u0680"+
		"\u0681\3\2\2\2\u0681\u0087\3\2\2\2\u0682\u0686\5\u0164\u00b3\2\u0683\u0685"+
		"\7\7\2\2\u0684\u0683\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068d\7m"+
		"\2\2\u068a\u068c\7\7\2\2\u068b\u068a\3\2\2\2\u068c\u068f\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u068d\3\2"+
		"\2\2\u0690\u0691\5R*\2\u0691\u0089\3\2\2\2\u0692\u069c\5\u0092J\2\u0693"+
		"\u0697\7P\2\2\u0694\u0696\7\7\2\2\u0695\u0694\3\2\2\2\u0696\u0699\3\2"+
		"\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699"+
		"\u0697\3\2\2\2\u069a\u069c\5\u00a2R\2\u069b\u0692\3\2\2\2\u069b\u0693"+
		"\3\2\2\2\u069c\u008b\3\2\2\2\u069d\u069e\5\u0150\u00a9\2\u069e\u06a2\7"+
		"\22\2\2\u069f\u06a1\7\7\2\2\u06a0\u069f\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2"+
		"\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a2\3\2"+
		"\2\2\u06a5\u06a9\5\u0164\u00b3\2\u06a6\u06a8\7\7\2\2\u06a7\u06a6\3\2\2"+
		"\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ac"+
		"\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u06ad\5\u008eH\2\u06ad\u008d\3\2\2"+
		"\2\u06ae\u06b2\7N\2\2\u06af\u06b1\7\7\2\2\u06b0\u06af\3\2\2\2\u06b1\u06b4"+
		"\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b8\3\2\2\2\u06b4"+
		"\u06b2\3\2\2\2\u06b5\u06b7\5\u0090I\2\u06b6\u06b5\3\2\2\2\u06b7\u06ba"+
		"\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06be\3\2\2\2\u06ba"+
		"\u06b8\3\2\2\2\u06bb\u06bd\7\7\2\2\u06bc\u06bb\3\2\2\2\u06bd\u06c0\3\2"+
		"\2\2\u06be\u06bc\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1\3\2\2\2\u06c0"+
		"\u06be\3\2\2\2\u06c1\u06c2\7O\2\2\u06c2\u008f\3\2\2\2\u06c3\u06c6\5\u0082"+
		"B\2\u06c4\u06c6\5t;\2\u06c5\u06c3\3\2\2\2\u06c5\u06c4\3\2\2\2\u06c6\u06c8"+
		"\3\2\2\2\u06c7\u06c9\5\u0166\u00b4\2\u06c8\u06c7\3\2\2\2\u06c9\u06ca\3"+
		"\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u0091\3\2\2\2\u06cc"+
		"\u06d0\7N\2\2\u06cd\u06cf\7\7\2\2\u06ce\u06cd\3\2\2\2\u06cf\u06d2\3\2"+
		"\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2"+
		"\u06d0\3\2\2\2\u06d3\u06d7\5\u0094K\2\u06d4\u06d6\7\7\2\2\u06d5\u06d4"+
		"\3\2\2\2\u06d6\u06d9\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8"+
		"\u06da\3\2\2\2\u06d9\u06d7\3\2\2\2\u06da\u06db\7O\2\2\u06db\u0093\3\2"+
		"\2\2\u06dc\u06e6\5\u0096L\2\u06dd\u06df\5\u0166\u00b4\2\u06de\u06dd\3"+
		"\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u06e2\3\2\2\2\u06e2\u06e3\5\u0096L\2\u06e3\u06e5\3\2\2\2\u06e4\u06de"+
		"\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7"+
		"\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06dc\3\2\2\2\u06e9\u06ea\3\2"+
		"\2\2\u06ea\u06ee\3\2\2\2\u06eb\u06ed\5\u0166\u00b4\2\u06ec\u06eb\3\2\2"+
		"\2\u06ed\u06f0\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u0095"+
		"\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f1\u06f6\5\u0098M\2\u06f2\u06f6\5\u00a0"+
		"Q\2\u06f3\u06f6\5\u009aN\2\u06f4\u06f6\5\u00a2R\2\u06f5\u06f1\3\2\2\2"+
		"\u06f5\u06f2\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f4\3\2\2\2\u06f6\u0097"+
		"\3\2\2\2\u06f7\u06f8\5\u015c\u00af\2\u06f8\u06fc\t\5\2\2\u06f9\u06fb\7"+
		"\7\2\2\u06fa\u06f9\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc"+
		"\u06fd\3\2\2\2\u06fd\u06ff\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u070e\5v"+
		"<\2\u0700\u0702\7\7\2\2\u0701\u0700\3\2\2\2\u0702\u0705\3\2\2\2\u0703"+
		"\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0706\3\2\2\2\u0705\u0703\3\2"+
		"\2\2\u0706\u070a\7P\2\2\u0707\u0709\7\7\2\2\u0708\u0707\3\2\2\2\u0709"+
		"\u070c\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2"+
		"\2\2\u070c\u070a\3\2\2\2\u070d\u070f\5\u00a2R\2\u070e\u0703\3\2\2\2\u070e"+
		"\u070f\3\2\2\2\u070f\u0099\3\2\2\2\u0710\u0713\5\u009cO\2\u0711\u0713"+
		"\5\u009eP\2\u0712\u0710\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u009b\3\2\2"+
		"\2\u0714\u0718\7\63\2\2\u0715\u0717\7\7\2\2\u0716\u0715\3\2\2\2\u0717"+
		"\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b\3\2"+
		"\2\2\u071a\u0718\3\2\2\2\u071b\u071f\7J\2\2\u071c\u071e\7\7\2\2\u071d"+
		"\u071c\3\2\2\2\u071e\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2"+
		"\2\2\u0720\u0722\3\2\2\2\u0721\u071f\3\2\2\2\u0722\u0723\5\u015c\u00af"+
		"\2\u0723\u0727\5v<\2\u0724\u0726\7\7\2\2\u0725\u0724\3\2\2\2\u0726\u0729"+
		"\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729"+
		"\u0727\3\2\2\2\u072a\u072e\7?\2\2\u072b\u072d\7\7\2\2\u072c\u072b\3\2"+
		"\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0731\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0735\5\u00a2R\2\u0732\u0734"+
		"\7\7\2\2\u0733\u0732\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u073c\7K"+
		"\2\2\u0739\u073b\7\7\2\2\u073a\u0739\3\2\2\2\u073b\u073e\3\2\2\2\u073c"+
		"\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u073c\3\2"+
		"\2\2\u073f\u0740\5\u0092J\2\u0740\u009d\3\2\2\2\u0741\u0745\7\67\2\2\u0742"+
		"\u0744\7\7\2\2\u0743\u0742\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2"+
		"\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u0745\3\2\2\2\u0748"+
		"\u074c\5\u00a2R\2\u0749\u074b\7\7\2\2\u074a\u0749\3\2\2\2\u074b\u074e"+
		"\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074f\u0750\5\u0092J\2\u0750\u009f\3\2\2\2\u0751\u0755"+
		"\5\u0140\u00a1\2\u0752\u0754\7\7\2\2\u0753\u0752\3\2\2\2\u0754\u0757\3"+
		"\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\3\2\2\2\u0757"+
		"\u0755\3\2\2\2\u0758\u0759\5\u011c\u008f\2\u0759\u075a\5\u00a2R\2\u075a"+
		"\u00a1\3\2\2\2\u075b\u075c\5\u00a4S\2\u075c\u00a3\3\2\2\2\u075d\u0763"+
		"\5\u00a6T\2\u075e\u075f\5\u011e\u0090\2\u075f\u0760\5\u00a6T\2\u0760\u0762"+
		"\3\2\2\2\u0761\u075e\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763"+
		"\u0764\3\2\2\2\u0764\u00a5\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u076c\5\u00a8"+
		"U\2\u0767\u0768\5\u0120\u0091\2\u0768\u0769\5\u00a8U\2\u0769\u076b\3\2"+
		"\2\2\u076a\u0767\3\2\2\2\u076b\u076e\3\2\2\2\u076c\u076a\3\2\2\2\u076c"+
		"\u076d\3\2\2\2\u076d\u00a7\3\2\2\2\u076e\u076c\3\2\2\2\u076f\u0775\5\u00aa"+
		"V\2\u0770\u0771\5\u0122\u0092\2\u0771\u0772\5\u00aaV\2\u0772\u0774\3\2"+
		"\2\2\u0773\u0770\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u00a9\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u077e\5\u00ac"+
		"W\2\u0779\u077a\5\u0124\u0093\2\u077a\u077b\5\u00acW\2\u077b\u077d\3\2"+
		"\2\2\u077c\u0779\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e"+
		"\u077f\3\2\2\2\u077f\u00ab\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0787\5\u00ae"+
		"X\2\u0782\u0783\5\u0126\u0094\2\u0783\u0784\5\u00aeX\2\u0784\u0786\3\2"+
		"\2\2\u0785\u0782\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2\2\2\u0787"+
		"\u0788\3\2\2\2\u0788\u00ad\3\2\2\2\u0789\u0787\3\2\2\2\u078a\u078e\5\u00b2"+
		"Z\2\u078b\u078d\5\u00b0Y\2\u078c\u078b\3\2\2\2\u078d\u0790\3\2\2\2\u078e"+
		"\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u00af\3\2\2\2\u0790\u078e\3\2"+
		"\2\2\u0791\u0792\5\u0128\u0095\2\u0792\u0793\5\u00b2Z\2\u0793\u0798\3"+
		"\2\2\2\u0794\u0795\5\u012a\u0096\2\u0795\u0796\5R*\2\u0796\u0798\3\2\2"+
		"\2\u0797\u0791\3\2\2\2\u0797\u0794\3\2\2\2\u0798\u00b1\3\2\2\2\u0799\u079f"+
		"\5\u00b4[\2\u079a\u079b\5\u012c\u0097\2\u079b\u079c\5\u00b4[\2\u079c\u079e"+
		"\3\2\2\2\u079d\u079a\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f"+
		"\u07a0\3\2\2\2\u07a0\u00b3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a8\5\u00b6"+
		"\\\2\u07a3\u07a4\5\u0164\u00b3\2\u07a4\u07a5\5\u00b6\\\2\u07a5\u07a7\3"+
		"\2\2\2\u07a6\u07a3\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8"+
		"\u07a9\3\2\2\2\u07a9\u00b5\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab\u07af\5\u00b8"+
		"]\2\u07ac\u07ad\5\u012e\u0098\2\u07ad\u07ae\5\u00b8]\2\u07ae\u07b0\3\2"+
		"\2\2\u07af\u07ac\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u00b7\3\2\2\2\u07b1"+
		"\u07b7\5\u00ba^\2\u07b2\u07b3\5\u0130\u0099\2\u07b3\u07b4\5\u00ba^\2\u07b4"+
		"\u07b6\3\2\2\2\u07b5\u07b2\3\2\2\2\u07b6\u07b9\3\2\2\2\u07b7\u07b5\3\2"+
		"\2\2\u07b7\u07b8\3\2\2\2\u07b8\u00b9\3\2\2\2\u07b9\u07b7\3\2\2\2\u07ba"+
		"\u07c0\5\u00bc_\2\u07bb\u07bc\5\u0132\u009a\2\u07bc\u07bd\5\u00bc_\2\u07bd"+
		"\u07bf\3\2\2\2\u07be\u07bb\3\2\2\2\u07bf\u07c2\3\2\2\2\u07c0\u07be\3\2"+
		"\2\2\u07c0\u07c1\3\2\2\2\u07c1\u00bb\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c3"+
		"\u07c9\5\u00be`\2\u07c4\u07c5\5\u0134\u009b\2\u07c5\u07c6\5\u00be`\2\u07c6"+
		"\u07c8\3\2\2\2\u07c7\u07c4\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2"+
		"\2\2\u07c9\u07ca\3\2\2\2\u07ca\u00bd\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc"+
		"\u07d2\5\u00c0a\2\u07cd\u07ce\5\u0136\u009c\2\u07ce\u07cf\5\u00c0a\2\u07cf"+
		"\u07d1\3\2\2\2\u07d0\u07cd\3\2\2\2\u07d1\u07d4\3\2\2\2\u07d2\u07d0\3\2"+
		"\2\2\u07d2\u07d3\3\2\2\2\u07d3\u00bf\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5"+
		"\u07d9\5\u00c2b\2\u07d6\u07d7\5\u0138\u009d\2\u07d7\u07d8\5R*\2\u07d8"+
		"\u07da\3\2\2\2\u07d9\u07d6\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u00c1\3\2"+
		"\2\2\u07db\u07dd\5\u013a\u009e\2\u07dc\u07db\3\2\2\2\u07dd\u07e0\3\2\2"+
		"\2\u07de\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e1\3\2\2\2\u07e0\u07de"+
		"\3\2\2\2\u07e1\u07e2\5\u00c4c\2\u07e2\u00c3\3\2\2\2\u07e3\u07e7\5\u00c6"+
		"d\2\u07e4\u07e6\5\u013c\u009f\2\u07e5\u07e4\3\2\2\2\u07e6\u07e9\3\2\2"+
		"\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00c5\3\2\2\2\u07e9\u07e7"+
		"\3\2\2\2\u07ea\u07f8\5\u00c8e\2\u07eb\u07f8\5\u0162\u00b2\2\u07ec\u07f8"+
		"\5\u00f2z\2\u07ed\u07f8\5\u00caf\2\u07ee\u07f8\5\u00ccg\2\u07ef\u07f8"+
		"\5\u0116\u008c\2\u07f0\u07f8\5\u00ceh\2\u07f1\u07f8\5\u00d0i\2\u07f2\u07f8"+
		"\5\u00d2j\2\u07f3\u07f8\5\u00d4k\2\u07f4\u07f8\5\u00dep\2\u07f5\u07f8"+
		"\5\u00e0q\2\u07f6\u07f8\5\u00e8u\2\u07f7\u07ea\3\2\2\2\u07f7\u07eb\3\2"+
		"\2\2\u07f7\u07ec\3\2\2\2\u07f7\u07ed\3\2\2\2\u07f7\u07ee\3\2\2\2\u07f7"+
		"\u07ef\3\2\2\2\u07f7\u07f0\3\2\2\2\u07f7\u07f1\3\2\2\2\u07f7\u07f2\3\2"+
		"\2\2\u07f7\u07f3\3\2\2\2\u07f7\u07f4\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7"+
		"\u07f6\3\2\2\2\u07f8\u00c7\3\2\2\2\u07f9\u07fa\7J\2\2\u07fa\u07fb\5\u00a2"+
		"R\2\u07fb\u07fc\7K\2\2\u07fc\u00c9\3\2\2\2\u07fd\u07fe\7g\2\2\u07fe\u07ff"+
		"\5\u0162\u00b2\2\u07ff\u00cb\3\2\2\2\u0800\u0801\5V,\2\u0801\u0805\7n"+
		"\2\2\u0802\u0804\7\7\2\2\u0803\u0802\3\2\2\2\u0804\u0807\3\2\2\2\u0805"+
		"\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807\u0805\3\2"+
		"\2\2\u0808\u0809\5\u0164\u00b3\2\u0809\u00cd\3\2\2\2\u080a\u080e\7L\2"+
		"\2\u080b\u080d\7\7\2\2\u080c\u080b\3\2\2\2\u080d\u0810\3\2\2\2\u080e\u080c"+
		"\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0812\3\2\2\2\u0810\u080e\3\2\2\2\u0811"+
		"\u0813\5\u00a2R\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0824"+
		"\3\2\2\2\u0814\u0816\7\7\2\2\u0815\u0814\3\2\2\2\u0816\u0819\3\2\2\2\u0817"+
		"\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\3\2\2\2\u0819\u0817\3\2"+
		"\2\2\u081a\u081e\7f\2\2\u081b\u081d\7\7\2\2\u081c\u081b\3\2\2\2\u081d"+
		"\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821\3\2"+
		"\2\2\u0820\u081e\3\2\2\2\u0821\u0823\5\u00a2R\2\u0822\u0817\3\2\2\2\u0823"+
		"\u0826\3\2\2\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u082a\3\2"+
		"\2\2\u0826\u0824\3\2\2\2\u0827\u0829\7\7\2\2\u0828\u0827\3\2\2\2\u0829"+
		"\u082c\3\2\2\2\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082d\3\2"+
		"\2\2\u082c\u082a\3\2\2\2\u082d\u082e\7M\2\2\u082e\u00cf\3\2\2\2\u082f"+
		"\u0830\7\23\2\2\u0830\u00d1\3\2\2\2\u0831\u0832\7\24\2\2\u0832\u00d3\3"+
		"\2\2\2\u0833\u0836\5\u00d6l\2\u0834\u0836\5\u00dan\2\u0835\u0833\3\2\2"+
		"\2\u0835\u0834\3\2\2\2\u0836\u00d5\3\2\2\2\u0837\u083b\t\7\2\2\u0838\u083a"+
		"\7\7\2\2\u0839\u0838\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b"+
		"\u083c\3\2\2\2\u083c\u083e\3\2\2\2\u083d\u083b\3\2\2\2\u083e\u0842\5\u00a2"+
		"R\2\u083f\u0841\7\7\2\2\u0840\u083f\3\2\2\2\u0841\u0844\3\2\2\2\u0842"+
		"\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845\3\2\2\2\u0844\u0842\3\2"+
		"\2\2\u0845\u084f\5\u0092J\2\u0846\u0848\7\7\2\2\u0847\u0846\3\2\2\2\u0848"+
		"\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084c\3\2"+
		"\2\2\u084b\u0849\3\2\2\2\u084c\u084e\5\u00d8m\2\u084d\u0849\3\2\2\2\u084e"+
		"\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0860\3\2"+
		"\2\2\u0851\u084f\3\2\2\2\u0852\u0854\7\7\2\2\u0853\u0852\3\2\2\2\u0854"+
		"\u0857\3\2\2\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2"+
		"\2\2\u0857\u0855\3\2\2\2\u0858\u085c\7\62\2\2\u0859\u085b\7\7\2\2\u085a"+
		"\u0859\3\2\2\2\u085b\u085e\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2"+
		"\2\2\u085d\u085f\3\2\2\2\u085e\u085c\3\2\2\2\u085f\u0861\5\u0092J\2\u0860"+
		"\u0855\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u00d7\3\2\2\2\u0862\u0866\7\61"+
		"\2\2\u0863\u0865\7\7\2\2\u0864\u0863\3\2\2\2\u0865\u0868\3\2\2\2\u0866"+
		"\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u0866\3\2"+
		"\2\2\u0869\u086d\5\u00a2R\2\u086a\u086c\7\7\2\2\u086b\u086a\3\2\2\2\u086c"+
		"\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2"+
		"\2\2\u086f\u086d\3\2\2\2\u0870\u0871\5\u0092J\2\u0871\u00d9\3\2\2\2\u0872"+
		"\u0876\7\64\2\2\u0873\u0875\7\7\2\2\u0874\u0873\3\2\2\2\u0875\u0878\3"+
		"\2\2\2\u0876\u0874\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0879\3\2\2\2\u0878"+
		"\u0876\3\2\2\2\u0879\u087d\5\u00a2R\2\u087a\u087c\7\7\2\2\u087b\u087a"+
		"\3\2\2\2\u087c\u087f\3\2\2\2\u087d\u087b\3\2\2\2\u087d\u087e\3\2\2\2\u087e"+
		"\u0880\3\2\2\2\u087f\u087d\3\2\2\2\u0880\u0888\7N\2\2\u0881\u0883\7\7"+
		"\2\2\u0882\u0881\3\2\2\2\u0883\u0886\3\2\2\2\u0884\u0882\3\2\2\2\u0884"+
		"\u0885\3\2\2\2\u0885\u0887\3\2\2\2\u0886\u0884\3\2\2\2\u0887\u0889\5\u00dc"+
		"o\2\u0888\u0884\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u0888\3\2\2\2\u088a"+
		"\u088b\3\2\2\2\u088b\u088f\3\2\2\2\u088c\u088e\7\7\2\2\u088d\u088c\3\2"+
		"\2\2\u088e\u0891\3\2\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u0892\3\2\2\2\u0891\u088f\3\2\2\2\u0892\u0893\7O\2\2\u0893\u00db\3\2"+
		"\2\2\u0894\u0898\7\65\2\2\u0895\u0897\7\7\2\2\u0896\u0895\3\2\2\2\u0897"+
		"\u089a\3\2\2\2\u0898\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089b\3\2"+
		"\2\2\u089a\u0898\3\2\2\2\u089b\u08ac\5\u00f2z\2\u089c\u089e\7\7\2\2\u089d"+
		"\u089c\3\2\2\2\u089e\u08a1\3\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2"+
		"\2\2\u08a0\u08a2\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2\u08a6\7f\2\2\u08a3"+
		"\u08a5\7\7\2\2\u08a4\u08a3\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2"+
		"\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a9\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9"+
		"\u08ab\5\u00f2z\2\u08aa\u089f\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa"+
		"\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08b2\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af"+
		"\u08b1\7\7\2\2\u08b0\u08af\3\2\2\2\u08b1\u08b4\3\2\2\2\u08b2\u08b0\3\2"+
		"\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b5\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b5"+
		"\u08b9\7\u0086\2\2\u08b6\u08b8\7\7\2\2\u08b7\u08b6\3\2\2\2\u08b8\u08bb"+
		"\3\2\2\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bc\3\2\2\2\u08bb"+
		"\u08b9\3\2\2\2\u08bc\u08be\5\u0092J\2\u08bd\u08bf\5\u0166\u00b4\2\u08be"+
		"\u08bd\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08d0\3\2\2\2\u08c0\u08c4\7\62"+
		"\2\2\u08c1\u08c3\7\7\2\2\u08c2\u08c1\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4"+
		"\u08c2\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\3\2\2\2\u08c6\u08c4\3\2"+
		"\2\2\u08c7\u08cb\7\u0086\2\2\u08c8\u08ca\7\7\2\2\u08c9\u08c8\3\2\2\2\u08ca"+
		"\u08cd\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\3\2"+
		"\2\2\u08cd\u08cb\3\2\2\2\u08ce\u08d0\5\u0092J\2\u08cf\u0894\3\2\2\2\u08cf"+
		"\u08c0\3\2\2\2\u08d0\u00dd\3\2\2\2\u08d1\u08d5\7B\2\2\u08d2\u08d4\7\7"+
		"\2\2\u08d3\u08d2\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5"+
		"\u08d6\3\2\2\2\u08d6\u08da\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d8\u08db\5\u0092"+
		"J\2\u08d9\u08db\5\u00a2R\2\u08da\u08d8\3\2\2\2\u08da\u08d9\3\2\2\2\u08db"+
		"\u00df\3\2\2\2\u08dc\u08e0\7A\2\2\u08dd\u08df\7\7\2\2\u08de\u08dd\3\2"+
		"\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u08e3\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3\u08ed\5\u0092J\2\u08e4\u08e6"+
		"\7\7\2\2\u08e5\u08e4\3\2\2\2\u08e6\u08e9\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7"+
		"\u08e8\3\2\2\2\u08e8\u08ea\3\2\2\2\u08e9\u08e7\3\2\2\2\u08ea\u08ec\5\u00e2"+
		"r\2\u08eb\u08e7\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed"+
		"\u08ee\3\2\2\2\u08ee\u08f7\3\2\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08f2\7\7"+
		"\2\2\u08f1\u08f0\3\2\2\2\u08f2\u08f5\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f3"+
		"\u08f4\3\2\2\2\u08f4\u08f6\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f6\u08f8\5\u00e6"+
		"t\2\u08f7\u08f3\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u00e1\3\2\2\2\u08f9"+
		"\u0907\7C\2\2\u08fa\u08fc\7\7\2\2\u08fb\u08fa\3\2\2\2\u08fc\u08ff\3\2"+
		"\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\3\2\2\2\u08ff"+
		"\u08fd\3\2\2\2\u0900\u0904\5\u00e4s\2\u0901\u0903\7\7\2\2\u0902\u0901"+
		"\3\2\2\2\u0903\u0906\3\2\2\2\u0904\u0902\3\2\2\2\u0904\u0905\3\2\2\2\u0905"+
		"\u0908\3\2\2\2\u0906\u0904\3\2\2\2\u0907\u08fd\3\2\2\2\u0907\u0908\3\2"+
		"\2\2\u0908\u0909\3\2\2\2\u0909\u090a\5\u0092J\2\u090a\u00e3\3\2\2\2\u090b"+
		"\u090f\7J\2\2\u090c\u090e\7\7\2\2\u090d\u090c\3\2\2\2\u090e\u0911\3\2"+
		"\2\2\u090f\u090d\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0912\3\2\2\2\u0911"+
		"\u090f\3\2\2\2\u0912\u0913\5\u015c\u00af\2\u0913\u0917\5\u0164\u00b3\2"+
		"\u0914\u0916\7\7\2\2\u0915\u0914\3\2\2\2\u0916\u0919\3\2\2\2\u0917\u0915"+
		"\3\2\2\2\u0917\u0918\3\2\2\2\u0918";
	private static final String _serializedATNSegment1 =
		"\u091a\3\2\2\2\u0919\u0917\3\2\2\2\u091a\u091e\7m\2\2\u091b\u091d\7\7"+
		"\2\2\u091c\u091b\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c\3\2\2\2\u091e"+
		"\u091f\3\2\2\2\u091f\u0921\3\2\2\2\u0920\u091e\3\2\2\2\u0921\u0932\5R"+
		"*\2\u0922\u0924\7\7\2\2\u0923\u0922\3\2\2\2\u0924\u0927\3\2\2\2\u0925"+
		"\u0923\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0928\3\2\2\2\u0927\u0925\3\2"+
		"\2\2\u0928\u092c\7`\2\2\u0929\u092b\7\7\2\2\u092a\u0929\3\2\2\2\u092b"+
		"\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092f\3\2"+
		"\2\2\u092e\u092c\3\2\2\2\u092f\u0931\5R*\2\u0930\u0925\3\2\2\2\u0931\u0934"+
		"\3\2\2\2\u0932\u0930\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0938\3\2\2\2\u0934"+
		"\u0932\3\2\2\2\u0935\u0937\7\7\2\2\u0936\u0935\3\2\2\2\u0937\u093a\3\2"+
		"\2\2\u0938\u0936\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093b\3\2\2\2\u093a"+
		"\u0938\3\2\2\2\u093b\u093c\7K\2\2\u093c\u00e5\3\2\2\2\u093d\u0941\7D\2"+
		"\2\u093e\u0940\7\7\2\2\u093f\u093e\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f"+
		"\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u0941\3\2\2\2\u0944"+
		"\u0945\5\u0092J\2\u0945\u00e7\3\2\2\2\u0946\u094b\5\u00eav\2\u0947\u094b"+
		"\5\u00ecw\2\u0948\u094b\5\u00eex\2\u0949\u094b\5\u00f0y\2\u094a\u0946"+
		"\3\2\2\2\u094a\u0947\3\2\2\2\u094a\u0948\3\2\2\2\u094a\u0949\3\2\2\2\u094b"+
		"\u00e9\3\2\2\2\u094c\u0950\7E\2\2\u094d\u094f\7\7\2\2\u094e\u094d\3\2"+
		"\2\2\u094f\u0952\3\2\2\2\u0950\u094e\3\2\2\2\u0950\u0951\3\2\2\2\u0951"+
		"\u0953\3\2\2\2\u0952\u0950\3\2\2\2\u0953\u0954\5\u00a2R\2\u0954\u00eb"+
		"\3\2\2\2\u0955\u0959\78\2\2\u0956\u0958\7\7\2\2\u0957\u0956\3\2\2\2\u0958"+
		"\u095b\3\2\2\2\u0959\u0957\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095d\3\2"+
		"\2\2\u095b\u0959\3\2\2\2\u095c\u095e\5\u00a2R\2\u095d\u095c\3\2\2\2\u095d"+
		"\u095e\3\2\2\2\u095e\u00ed\3\2\2\2\u095f\u0960\7:\2\2\u0960\u00ef\3\2"+
		"\2\2\u0961\u0962\79\2\2\u0962\u00f1\3\2\2\2\u0963\u096f\5\u00f4{\2\u0964"+
		"\u096f\5\u00f6|\2\u0965\u096f\5\u00f8}\2\u0966\u096f\5\u00fa~\2\u0967"+
		"\u096f\5\u00fc\177\2\u0968\u096f\5\u00fe\u0080\2\u0969\u096f\5\u0100\u0081"+
		"\2\u096a\u096f\5\u0102\u0082\2\u096b\u096f\5\u0104\u0083\2\u096c\u096f"+
		"\5\u0106\u0084\2\u096d\u096f\5\u0108\u0085\2\u096e\u0963\3\2\2\2\u096e"+
		"\u0964\3\2\2\2\u096e\u0965\3\2\2\2\u096e\u0966\3\2\2\2\u096e\u0967\3\2"+
		"\2\2\u096e\u0968\3\2\2\2\u096e\u0969\3\2\2\2\u096e\u096a\3\2\2\2\u096e"+
		"\u096b\3\2\2\2\u096e\u096c\3\2\2\2\u096e\u096d\3\2\2\2\u096f\u00f3\3\2"+
		"\2\2\u0970\u0971\7I\2\2\u0971\u00f5\3\2\2\2\u0972\u0973\t\b\2\2\u0973"+
		"\u00f7\3\2\2\2\u0974\u0975\7\u008a\2\2\u0975\u00f9\3\2\2\2\u0976\u0977"+
		"\7\u008b\2\2\u0977\u00fb\3\2\2\2\u0978\u0979\7\u008c\2\2\u0979\u00fd\3"+
		"\2\2\2\u097a\u097b\7\u008d\2\2\u097b\u00ff\3\2\2\2\u097c\u097d\7\u008e"+
		"\2\2\u097d\u0101\3\2\2\2\u097e\u097f\7\u008f\2\2\u097f\u0103\3\2\2\2\u0980"+
		"\u0981\7\u0090\2\2\u0981\u0105\3\2\2\2\u0982\u0983\7\u0098\2\2\u0983\u0107"+
		"\3\2\2\2\u0984\u0987\5\u010a\u0086\2\u0985\u0987\5\u010c\u0087\2\u0986"+
		"\u0984\3\2\2\2\u0986\u0985\3\2\2\2\u0987\u0109\3\2\2\2\u0988\u098d\7\u0088"+
		"\2\2\u0989\u098c\5\u010e\u0088\2\u098a\u098c\5\u0110\u0089\2\u098b\u0989"+
		"\3\2\2\2\u098b\u098a\3\2\2\2\u098c\u098f\3\2\2\2\u098d\u098b\3\2\2\2\u098d"+
		"\u098e\3\2\2\2\u098e\u0990\3\2\2\2\u098f\u098d\3\2\2\2\u0990\u0991\7\u00a0"+
		"\2\2\u0991\u010b\3\2\2\2\u0992\u0999\7\u0089\2\2\u0993\u0998\5\u0112\u008a"+
		"\2\u0994\u0998\5\u0114\u008b\2\u0995\u0998\5\u010a\u0086\2\u0996\u0998"+
		"\7\u00a6\2\2\u0997\u0993\3\2\2\2\u0997\u0994\3\2\2\2\u0997\u0995\3\2\2"+
		"\2\u0997\u0996\3\2\2\2\u0998\u099b\3\2\2\2\u0999\u0997\3\2\2\2\u0999\u099a"+
		"\3\2\2\2\u099a\u099c\3\2\2\2\u099b\u0999\3\2\2\2\u099c\u099d\7\u00a5\2"+
		"\2\u099d\u010d\3\2\2\2\u099e\u099f\t\t\2\2\u099f\u010f\3\2\2\2\u09a0\u09a1"+
		"\7\u00a4\2\2\u09a1\u09a2\5\u00a2R\2\u09a2\u09a3\7O\2\2\u09a3\u0111\3\2"+
		"\2\2\u09a4\u09a5\t\n\2\2\u09a5\u0113\3\2\2\2\u09a6\u09a7\7\u00aa\2\2\u09a7"+
		"\u09a8\5\u00a2R\2\u09a8\u09a9\7O\2\2\u09a9\u0115\3\2\2\2\u09aa\u09ae\7"+
		"N\2\2\u09ab\u09ad\7\7\2\2\u09ac\u09ab\3\2\2\2\u09ad\u09b0\3\2\2\2\u09ae"+
		"\u09ac\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09c1\3\2\2\2\u09b0\u09ae\3\2"+
		"\2\2\u09b1\u09b3\5\u0118\u008d\2\u09b2\u09b1\3\2\2\2\u09b2\u09b3\3\2\2"+
		"\2\u09b3\u09b7\3\2\2\2\u09b4\u09b6\7\7\2\2\u09b5\u09b4\3\2\2\2\u09b6\u09b9"+
		"\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09ba\3\2\2\2\u09b9"+
		"\u09b7\3\2\2\2\u09ba\u09be\7\u0086\2\2\u09bb\u09bd\7\7\2\2\u09bc\u09bb"+
		"\3\2\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf"+
		"\u09c2\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09b2\3\2\2\2\u09c1\u09c2\3\2"+
		"\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c7\5\u0094K\2\u09c4\u09c6\7\7\2\2\u09c5"+
		"\u09c4\3\2\2\2\u09c6\u09c9\3\2\2\2\u09c7\u09c5\3\2\2\2\u09c7\u09c8\3\2"+
		"\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c7\3\2\2\2\u09ca\u09cb\7O\2\2\u09cb"+
		"\u0117\3\2\2\2\u09cc\u09dd\5\u011a\u008e\2\u09cd\u09cf\7\7\2\2\u09ce\u09cd"+
		"\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"+
		"\u09d3\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d3\u09d7\7f\2\2\u09d4\u09d6\7\7"+
		"\2\2\u09d5\u09d4\3\2\2\2\u09d6\u09d9\3\2\2\2\u09d7\u09d5\3\2\2\2\u09d7"+
		"\u09d8\3\2\2\2\u09d8\u09da\3\2\2\2\u09d9\u09d7\3\2\2\2\u09da\u09dc\5\u011a"+
		"\u008e\2\u09db\u09d0\3\2\2\2\u09dc\u09df\3\2\2\2\u09dd\u09db\3\2\2\2\u09dd"+
		"\u09de\3\2\2\2\u09de\u0119\3\2\2\2\u09df\u09dd\3\2\2\2\u09e0\u09e1\5\u015c"+
		"\u00af\2\u09e1\u09f0\5\u0164\u00b3\2\u09e2\u09e4\7\7\2\2\u09e3\u09e2\3"+
		"\2\2\2\u09e4\u09e7\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6"+
		"\u09e8\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8\u09ec\7m\2\2\u09e9\u09eb\7\7"+
		"\2\2\u09ea\u09e9\3\2\2\2\u09eb\u09ee\3\2\2\2\u09ec\u09ea\3\2\2\2\u09ec"+
		"\u09ed\3\2\2\2\u09ed\u09ef\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ef\u09f1\5R"+
		"*\2\u09f0\u09e5\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u011b\3\2\2\2\u09f2"+
		"\u09f4\7\7\2\2\u09f3\u09f2\3\2\2\2\u09f4\u09f7\3\2\2\2\u09f5\u09f3\3\2"+
		"\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f8\3\2\2\2\u09f7\u09f5\3\2\2\2\u09f8"+
		"\u09fc\t\13\2\2\u09f9\u09fb\7\7\2\2\u09fa\u09f9\3\2\2\2\u09fb\u09fe\3"+
		"\2\2\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u011d\3\2\2\2\u09fe"+
		"\u09fc\3\2\2\2\u09ff\u0a01\7\7\2\2\u0a00\u09ff\3\2\2\2\u0a01\u0a04\3\2"+
		"\2\2\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a05\3\2\2\2\u0a04"+
		"\u0a02\3\2\2\2\u0a05\u0a09\7b\2\2\u0a06\u0a08\7\7\2\2\u0a07\u0a06\3\2"+
		"\2\2\u0a08\u0a0b\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a"+
		"\u011f\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0c\u0a0e\7\7\2\2\u0a0d\u0a0c\3\2"+
		"\2\2\u0a0e\u0a11\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10"+
		"\u0a12\3\2\2\2\u0a11\u0a0f\3\2\2\2\u0a12\u0a16\7`\2\2\u0a13\u0a15\7\7"+
		"\2\2\u0a14\u0a13\3\2\2\2\u0a15\u0a18\3\2\2\2\u0a16\u0a14\3\2\2\2\u0a16"+
		"\u0a17\3\2\2\2\u0a17\u0121\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a19\u0a1b\7\7"+
		"\2\2\u0a1a\u0a19\3\2\2\2\u0a1b\u0a1e\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1c"+
		"\u0a1d\3\2\2\2\u0a1d\u0a1f\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f\u0a23\t\f"+
		"\2\2\u0a20\u0a22\7\7\2\2\u0a21\u0a20\3\2\2\2\u0a22\u0a25\3\2\2\2\u0a23"+
		"\u0a21\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0123\3\2\2\2\u0a25\u0a23\3\2"+
		"\2\2\u0a26\u0a28\7\7\2\2\u0a27\u0a26\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2c\3\2\2\2\u0a2b\u0a29\3\2"+
		"\2\2\u0a2c\u0a30\t\r\2\2\u0a2d\u0a2f\7\7\2\2\u0a2e\u0a2d\3\2\2\2\u0a2f"+
		"\u0a32\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0125\3\2"+
		"\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a35\7\7\2\2\u0a34\u0a33\3\2\2\2\u0a35"+
		"\u0a38\3\2\2\2\u0a36\u0a34\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a39\3\2"+
		"\2\2\u0a38\u0a36\3\2\2\2\u0a39\u0a3d\t\16\2\2\u0a3a\u0a3c\7\7\2\2\u0a3b"+
		"\u0a3a\3\2\2\2\u0a3c\u0a3f\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3d\u0a3e\3\2"+
		"\2\2\u0a3e\u0127\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a40\u0a42\7\7\2\2\u0a41"+
		"\u0a40\3\2\2\2\u0a42\u0a45\3\2\2\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2"+
		"\2\2\u0a44\u0a46\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a46\u0a4a\t\17\2\2\u0a47"+
		"\u0a49\7\7\2\2\u0a48\u0a47\3\2\2\2\u0a49\u0a4c\3\2\2\2\u0a4a\u0a48\3\2"+
		"\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u0129\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4d"+
		"\u0a4f\7\7\2\2\u0a4e\u0a4d\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2"+
		"\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a53\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53"+
		"\u0a57\t\20\2\2\u0a54\u0a56\7\7\2\2\u0a55\u0a54\3\2\2\2\u0a56\u0a59\3"+
		"\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u012b\3\2\2\2\u0a59"+
		"\u0a57\3\2\2\2\u0a5a\u0a5c\7\7\2\2\u0a5b\u0a5a\3\2\2\2\u0a5c\u0a5f\3\2"+
		"\2\2\u0a5d\u0a5b\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a60\3\2\2\2\u0a5f"+
		"\u0a5d\3\2\2\2\u0a60\u0a64\7v\2\2\u0a61\u0a63\7\7\2\2\u0a62\u0a61\3\2"+
		"\2\2\u0a63\u0a66\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65"+
		"\u012d\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a67\u0a69\7\7\2\2\u0a68\u0a67\3\2"+
		"\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6d\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a71\t\21\2\2\u0a6e\u0a70\7"+
		"\7\2\2\u0a6f\u0a6e\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71"+
		"\u0a72\3\2\2\2\u0a72\u012f\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a76\7\7"+
		"\2\2\u0a75\u0a74\3\2\2\2\u0a76\u0a79\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a77"+
		"\u0a78\3\2\2\2\u0a78\u0a7a\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a7a\u0a7e\7d"+
		"\2\2\u0a7b\u0a7d\7\7\2\2\u0a7c\u0a7b\3\2\2\2\u0a7d\u0a80\3\2\2\2\u0a7e"+
		"\u0a7c\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0131\3\2\2\2\u0a80\u0a7e\3\2"+
		"\2\2\u0a81\u0a83\7\7\2\2\u0a82\u0a81\3\2\2\2\u0a83\u0a86\3\2\2\2\u0a84"+
		"\u0a82\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u0a87\3\2\2\2\u0a86\u0a84\3\2"+
		"\2\2\u0a87\u0a8b\t\22\2\2\u0a88\u0a8a\7\7\2\2\u0a89\u0a88\3\2\2\2\u0a8a"+
		"\u0a8d\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0133\3\2"+
		"\2\2\u0a8d\u0a8b\3\2\2\2\u0a8e\u0a90\7\7\2\2\u0a8f\u0a8e\3\2\2\2\u0a90"+
		"\u0a93\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a91\u0a92\3\2\2\2\u0a92\u0a94\3\2"+
		"\2\2\u0a93\u0a91\3\2\2\2\u0a94\u0a98\t\23\2\2\u0a95\u0a97\7\7\2\2\u0a96"+
		"\u0a95\3\2\2\2\u0a97\u0a9a\3\2\2\2\u0a98\u0a96\3\2\2\2\u0a98\u0a99\3\2"+
		"\2\2\u0a99\u0135\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9b\u0a9d\7\7\2\2\u0a9c"+
		"\u0a9b\3\2\2\2\u0a9d\u0aa0\3\2\2\2\u0a9e\u0a9c\3\2\2\2\u0a9e\u0a9f\3\2"+
		"\2\2\u0a9f\u0aa1\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa1\u0aa5\7^\2\2\u0aa2"+
		"\u0aa4\7\7\2\2\u0aa3\u0aa2\3\2\2\2\u0aa4\u0aa7\3\2\2\2\u0aa5\u0aa3\3\2"+
		"\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0137\3\2\2\2\u0aa7\u0aa5\3\2\2\2\u0aa8"+
		"\u0aaa\7\7\2\2\u0aa9\u0aa8\3\2\2\2\u0aaa\u0aad\3\2\2\2\u0aab\u0aa9\3\2"+
		"\2\2\u0aab\u0aac\3\2\2\2\u0aac\u0aae\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aae"+
		"\u0ab2\t\24\2\2\u0aaf\u0ab1\7\7\2\2\u0ab0\u0aaf\3\2\2\2\u0ab1\u0ab4\3"+
		"\2\2\2\u0ab2\u0ab0\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0139\3\2\2\2\u0ab4"+
		"\u0ab2\3\2\2\2\u0ab5\u0ab6\t\25\2\2\u0ab6\u013b\3\2\2\2\u0ab7\u0abd\5"+
		"\u013e\u00a0\2\u0ab8\u0abd\5> \2\u0ab9\u0abd\5\u0144\u00a3\2\u0aba\u0abd"+
		"\5\u014a\u00a6\2\u0abb\u0abd\5\u014c\u00a7\2\u0abc\u0ab7\3\2\2\2\u0abc"+
		"\u0ab8\3\2\2\2\u0abc\u0ab9\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abb\3\2"+
		"\2\2\u0abd\u013d\3\2\2\2\u0abe\u0abf\t\26\2\2\u0abf\u013f\3\2\2\2\u0ac0"+
		"\u0ac2\5\u00a2R\2\u0ac1\u0ac3\5\u0142\u00a2\2\u0ac2\u0ac1\3\2\2\2\u0ac3"+
		"\u0ac4\3\2\2\2\u0ac4\u0ac2\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0141\3\2"+
		"\2\2\u0ac6\u0ac9\5\u014a\u00a6\2\u0ac7\u0ac9\5\u014c\u00a7\2\u0ac8\u0ac6"+
		"\3\2\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u0143\3\2\2\2\u0aca\u0acc\5> \2\u0acb"+
		"\u0aca\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acf\3\2\2\2\u0acd\u0ad0\5\u0146"+
		"\u00a4\2\u0ace\u0ad0\5,\27\2\u0acf\u0acd\3\2\2\2\u0acf\u0ace\3\2\2\2\u0ad0"+
		"\u0145\3\2\2\2\u0ad1\u0ad3\5,\27\2\u0ad2\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2"+
		"\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ad5\5\u0148\u00a5\2\u0ad5\u0147\3\2\2"+
		"\2\u0ad6\u0ada\5\u015c\u00af\2\u0ad7\u0ad9\7\7\2\2\u0ad8\u0ad7\3\2\2\2"+
		"\u0ad9\u0adc\3\2\2\2\u0ada\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0add"+
		"\3\2\2\2\u0adc\u0ada\3\2\2\2\u0add\u0ade\5\u0116\u008c\2\u0ade\u0149\3"+
		"\2\2\2\u0adf\u0ae3\7L\2\2\u0ae0\u0ae2\7\7\2\2\u0ae1\u0ae0\3\2\2\2\u0ae2"+
		"\u0ae5\3\2\2\2\u0ae3\u0ae1\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0ae6\3\2"+
		"\2\2\u0ae5\u0ae3\3\2\2\2\u0ae6\u0af7\5\u00a2R\2\u0ae7\u0ae9\7\7\2\2\u0ae8"+
		"\u0ae7\3\2\2\2\u0ae9\u0aec\3\2\2\2\u0aea\u0ae8\3\2\2\2\u0aea\u0aeb\3\2"+
		"\2\2\u0aeb\u0aed\3\2\2\2\u0aec\u0aea\3\2\2\2\u0aed\u0af1\7f\2\2\u0aee"+
		"\u0af0\7\7\2\2\u0aef\u0aee\3\2\2\2\u0af0\u0af3\3\2\2\2\u0af1\u0aef\3\2"+
		"\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af4\3\2\2\2\u0af3\u0af1\3\2\2\2\u0af4"+
		"\u0af6\5\u00a2R\2\u0af5\u0aea\3\2\2\2\u0af6\u0af9\3\2\2\2\u0af7\u0af5"+
		"\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u0afd\3\2\2\2\u0af9\u0af7\3\2\2\2\u0afa"+
		"\u0afc\7\7\2\2\u0afb\u0afa\3\2\2\2\u0afc\u0aff\3\2\2\2\u0afd\u0afb\3\2"+
		"\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0b00\3\2\2\2\u0aff\u0afd\3\2\2\2\u0b00"+
		"\u0b01\7M\2\2\u0b01\u014b\3\2\2\2\u0b02\u0b03\5\u014e\u00a8\2\u0b03\u0b04"+
		"\5\u0164\u00b3\2\u0b04\u014d\3\2\2\2\u0b05\u0b07\7\7\2\2\u0b06\u0b05\3"+
		"\2\2\2\u0b07\u0b0a\3\2\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09"+
		"\u0b0b\3\2\2\2\u0b0a\u0b08\3\2\2\2\u0b0b\u0b0f\t\27\2\2\u0b0c\u0b0e\7"+
		"\7\2\2\u0b0d\u0b0c\3\2\2\2\u0b0e\u0b11\3\2\2\2\u0b0f\u0b0d\3\2\2\2\u0b0f"+
		"\u0b10\3\2\2\2\u0b10\u014f\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b12\u0b1c\5\u015c"+
		"\u00af\2\u0b13\u0b17\5\u0152\u00aa\2\u0b14\u0b16\7\7\2\2\u0b15\u0b14\3"+
		"\2\2\2\u0b16\u0b19\3\2\2\2\u0b17\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18"+
		"\u0b1b\3\2\2\2\u0b19\u0b17\3\2\2\2\u0b1a\u0b13\3\2\2\2\u0b1b\u0b1e\3\2"+
		"\2\2\u0b1c\u0b1a\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0151\3\2\2\2\u0b1e"+
		"\u0b1c\3\2\2\2\u0b1f\u0b24\5\u0154\u00ab\2\u0b20\u0b24\5\u0156\u00ac\2"+
		"\u0b21\u0b24\5\u0158\u00ad\2\u0b22\u0b24\5\u015a\u00ae\2\u0b23\u0b1f\3"+
		"\2\2\2\u0b23\u0b20\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b23\u0b22\3\2\2\2\u0b24"+
		"\u0153\3\2\2\2\u0b25\u0b26\t\30\2\2\u0b26\u0155\3\2\2\2\u0b27\u0b28\t"+
		"\31\2\2\u0b28\u0157\3\2\2\2\u0b29\u0b2a\7.\2\2\u0b2a\u0159\3\2\2\2\u0b2b"+
		"\u0b2c\t\32\2\2\u0b2c\u015b\3\2\2\2\u0b2d\u0b31\5\u015e\u00b0\2\u0b2e"+
		"\u0b30\7\7\2\2\u0b2f\u0b2e\3\2\2\2\u0b30\u0b33\3\2\2\2\u0b31\u0b2f\3\2"+
		"\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b34"+
		"\u0b2d\3\2\2\2\u0b35\u0b38\3\2\2\2\u0b36\u0b34\3\2\2\2\u0b36\u0b37\3\2"+
		"\2\2\u0b37\u015d\3\2\2\2\u0b38\u0b36\3\2\2\2\u0b39\u0b4f\7s\2\2\u0b3a"+
		"\u0b50\5\u0160\u00b1\2\u0b3b\u0b3f\7L\2\2\u0b3c\u0b3e\7\7\2\2\u0b3d\u0b3c"+
		"\3\2\2\2\u0b3e\u0b41\3\2\2\2\u0b3f\u0b3d\3\2\2\2\u0b3f\u0b40\3\2\2\2\u0b40"+
		"\u0b43\3\2\2\2\u0b41\u0b3f\3\2\2\2\u0b42\u0b44\5\u0160\u00b1\2\u0b43\u0b42"+
		"\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b43\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46"+
		"\u0b4a\3\2\2\2\u0b47\u0b49\7\7\2\2\u0b48\u0b47\3\2\2\2\u0b49\u0b4c\3\2"+
		"\2\2\u0b4a\u0b48\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b\u0b4d\3\2\2\2\u0b4c"+
		"\u0b4a\3\2\2\2\u0b4d\u0b4e\7M\2\2\u0b4e\u0b50\3\2\2\2\u0b4f\u0b3a\3\2"+
		"\2\2\u0b4f\u0b3b\3\2\2\2\u0b50\u015f\3\2\2\2\u0b51\u0b53\5\u0162\u00b2"+
		"\2\u0b52\u0b54\5,\27\2\u0b53\u0b52\3\2\2\2\u0b53\u0b54\3\2\2\2\u0b54\u0161"+
		"\3\2\2\2\u0b55\u0b66\5\u0164\u00b3\2\u0b56\u0b58\7\7\2\2\u0b57\u0b56\3"+
		"\2\2\2\u0b58\u0b5b\3\2\2\2\u0b59\u0b57\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a"+
		"\u0b5c\3\2\2\2\u0b5b\u0b59\3\2\2\2\u0b5c\u0b60\7g\2\2\u0b5d\u0b5f\7\7"+
		"\2\2\u0b5e\u0b5d\3\2\2\2\u0b5f\u0b62\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b60"+
		"\u0b61\3\2\2\2\u0b61\u0b63\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b63\u0b65\5\u0164"+
		"\u00b3\2\u0b64\u0b59\3\2\2\2\u0b65\u0b68\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66"+
		"\u0b67\3\2\2\2\u0b67\u0163\3\2\2\2\u0b68\u0b66\3\2\2\2\u0b69\u0b6a\7\u0096"+
		"\2\2\u0b6a\u0165\3\2\2\2\u0b6b\u0b6d\7\7\2\2\u0b6c\u0b6b\3\2\2\2\u0b6d"+
		"\u0b6e\3\2\2\2\u0b6e\u0b6c\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f\u0b7e\3\2"+
		"\2\2\u0b70\u0b72\7\7\2\2\u0b71\u0b70\3\2\2\2\u0b72\u0b75\3\2\2\2\u0b73"+
		"\u0b71\3\2\2\2\u0b73\u0b74\3\2\2\2\u0b74\u0b76\3\2\2\2\u0b75\u0b73\3\2"+
		"\2\2\u0b76\u0b7a\7o\2\2\u0b77\u0b79\7\7\2\2\u0b78\u0b77\3\2\2\2\u0b79"+
		"\u0b7c\3\2\2\2\u0b7a\u0b78\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u0b7e\3\2"+
		"\2\2\u0b7c\u0b7a\3\2\2\2\u0b7d\u0b6c\3\2\2\2\u0b7d\u0b73\3\2\2\2\u0b7e"+
		"\u0167\3\2\2\2\u0191\u016b\u0172\u0179\u017c\u0180\u0183\u0188\u018e\u0193"+
		"\u019c\u01a2\u01a7\u01b5\u01bd\u01c9\u01d0\u01d7\u01db\u01e0\u01e4\u01e9"+
		"\u01f0\u01f4\u01f9\u01fd\u0204\u020b\u020f\u0214\u021b\u021f\u0224\u0228"+
		"\u022f\u0236\u023a\u023f\u0243\u024a\u0251\u0255\u025a\u0261\u0265\u026c"+
		"\u026f\u0277\u027e\u0285\u028b\u028e\u0293\u029a\u029f\u02a6\u02ad\u02b4"+
		"\u02bb\u02bf\u02c7\u02ce\u02d4\u02d9\u02dc\u02e2\u02e9\u02ef\u02f6\u02fd"+
		"\u0304\u030a\u0310\u0313\u031f\u0326\u032d\u0331\u0336\u033a\u0340\u0349"+
		"\u034f\u0355\u035f\u0364\u036a\u0373\u037d\u0381\u0387\u038e\u0395\u039b"+
		"\u03a4\u03a8\u03b0\u03b7\u03be\u03c4\u03ca\u03d3\u03da\u03e1\u03e8\u03ef"+
		"\u03f5\u03f8\u03fc\u0400\u040d\u040f\u0415\u041c\u0424\u042a\u0431\u0438"+
		"\u043e\u0441\u0446\u044f\u0456\u045f\u0466\u046d\u0471\u047a\u0481\u0488"+
		"\u048c\u0491\u0495\u049b\u04a1\u04a7\u04af\u04b4\u04bb\u04c2\u04c6\u04cb"+
		"\u04d4\u04d8\u04dd\u04e4\u04ea\u04ed\u04f2\u04fb\u0502\u0508\u0510\u0514"+
		"\u0519\u051d\u0524\u0528\u052d\u0534\u0538\u053e\u0544\u054a\u0553\u055a"+
		"\u0561\u0568\u056c\u0571\u0575\u057c\u0583\u0587\u058d\u0592\u0597\u059c"+
		"\u05a2\u05ac\u05b3\u05b7\u05bc\u05c3\u05c7\u05cc\u05d0\u05d7\u05de\u05e5"+
		"\u05ea\u05ef\u05f6\u05fa\u05ff\u0603\u060c\u0613\u0617\u061e\u0622\u0627"+
		"\u062e\u0635\u063c\u0640\u0645\u0649\u064f\u0656\u065d\u0663\u0666\u066b"+
		"\u0675\u067c\u0680\u0686\u068d\u0697\u069b\u06a2\u06a9\u06b2\u06b8\u06be"+
		"\u06c5\u06ca\u06d0\u06d7\u06e0\u06e6\u06e9\u06ee\u06f5\u06fc\u0703\u070a"+
		"\u070e\u0712\u0718\u071f\u0727\u072e\u0735\u073c\u0745\u074c\u0755\u0763"+
		"\u076c\u0775\u077e\u0787\u078e\u0797\u079f\u07a8\u07af\u07b7\u07c0\u07c9"+
		"\u07d2\u07d9\u07de\u07e7\u07f7\u0805\u080e\u0812\u0817\u081e\u0824\u082a"+
		"\u0835\u083b\u0842\u0849\u084f\u0855\u085c\u0860\u0866\u086d\u0876\u087d"+
		"\u0884\u088a\u088f\u0898\u089f\u08a6\u08ac\u08b2\u08b9\u08be\u08c4\u08cb"+
		"\u08cf\u08d5\u08da\u08e0\u08e7\u08ed\u08f3\u08f7\u08fd\u0904\u0907\u090f"+
		"\u0917\u091e\u0925\u092c\u0932\u0938\u0941\u094a\u0950\u0959\u095d\u096e"+
		"\u0986\u098b\u098d\u0997\u0999\u09ae\u09b2\u09b7\u09be\u09c1\u09c7\u09d0"+
		"\u09d7\u09dd\u09e5\u09ec\u09f0\u09f5\u09fc\u0a02\u0a09\u0a0f\u0a16\u0a1c"+
		"\u0a23\u0a29\u0a30\u0a36\u0a3d\u0a43\u0a4a\u0a50\u0a57\u0a5d\u0a64\u0a6a"+
		"\u0a71\u0a77\u0a7e\u0a84\u0a8b\u0a91\u0a98\u0a9e\u0aa5\u0aab\u0ab2\u0abc"+
		"\u0ac4\u0ac8\u0acb\u0acf\u0ad2\u0ada\u0ae3\u0aea\u0af1\u0af7\u0afd\u0b08"+
		"\u0b0f\u0b17\u0b1c\u0b23\u0b31\u0b36\u0b3f\u0b45\u0b4a\u0b4f\u0b53\u0b59"+
		"\u0b60\u0b66\u0b6e\u0b73\u0b7a\u0b7d";
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