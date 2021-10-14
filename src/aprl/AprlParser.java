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
		FINAL=36, DIRECT=37, EXTERNAL=38, SYNC=39, FUNCTION=40, SCRIPT=41, OPERATOR=42, 
		EXTENSION=43, PARAMS=44, IF=45, UNLESS=46, ELSIF=47, ELSE=48, FOR=49, 
		MATCH=50, WHEN=51, DO=52, WHILE=53, RETURN=54, BREAK=55, CONTINUE=56, 
		RETURN_AT=57, BREAK_AT=58, CONTINUE_AT=59, OR=60, AND=61, NOT=62, AS=63, 
		AS_QUEST=64, IS=65, NOT_IS=66, IN=67, NOT_IN=68, TO=69, BY=70, TRY=71, 
		TRY_QUEST=72, CATCH=73, FINALLY=74, TRIGGER=75, TRUE=76, FALSE=77, NONE=78, 
		NULL=79, LPAREN=80, RPAREN=81, LSQUARE=82, RSQUARE=83, LCURLY=84, RCURLY=85, 
		ASSIGN=86, DEFINE=87, ADD=88, ADD_ASSIGN=89, INCR=90, SUB=91, SUB_ASSIGN=92, 
		DECR=93, MUL=94, MUL_ASSIGN=95, DIV=96, DIV_ASSIGN=97, MOD=98, MOD_ASSIGN=99, 
		EXP=100, EXP_ASSIGN=101, CONJ=102, CONJ_ASSIGN=103, DISJ=104, DISJ_ASSIGN=105, 
		XOR=106, XOR_ASSIGN=107, COMMA=108, PERIOD=109, QUEST_PERIOD=110, DOUBLE_PERIOD=111, 
		TRIPLE_PERIOD=112, COLON=113, DOUBLE_COLON=114, SEMICOLON=115, EXCL=116, 
		DOUBLE_EXCL=117, QUEST=118, HASH=119, AT=120, DOUBLE_AT=121, ELVIS=122, 
		ELVIS_ASSIGN=123, EQUAL=124, NEQUAL=125, IDENTICAL=126, NIDENTICAL=127, 
		LANGLE=128, NLANGLE=129, LEQ=130, NLEQ=131, RANGLE=132, NRANGLE=133, GEQ=134, 
		NGEQ=135, LARROW=136, RARROW=137, RARROW_THICK=138, SPACESHIP=139, SINGLE_QUOTE=140, 
		QUOTE_OPEN=141, TRIPLE_QUOTE_OPEN=142, IntegerLiteral=143, LongLiteral=144, 
		ShortLiteral=145, ByteLiteral=146, FloatLiteral=147, DoubleLiteral=148, 
		ComplexLiteral=149, HexLiteral=150, BinLiteral=151, OctalLiteral=152, 
		BooleanLiteral=153, TrileanLiteral=154, Identifier=155, LabelReference=156, 
		LabelDefinition=157, FieldIdentifier=158, CharacterLiteral=159, UNICODE_CLASS_LL=160, 
		UNICODE_CLASS_LM=161, UNICODE_CLASS_LO=162, UNICODE_CLASS_LT=163, UNICODE_CLASS_LU=164, 
		UNICODE_CLASS_ND=165, UNICODE_CLASS_NL=166, QUOTE_CLOSE=167, LineStrRef=168, 
		LineStrText=169, LineStrEscapedChar=170, LineStrExprStart=171, TRIPLE_QUOTE_CLOSE=172, 
		MultiLineStrQuote=173, MultiLineStrRef=174, MultiLineStrText=175, MultiLineStrEscapedChar=176, 
		MultiLineStrExprStart=177, MultiLineNL=178;
	public static final int
		RULE_aprlFile = 0, RULE_preamble = 1, RULE_namespaceHeader = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_importIdentifier = 5, RULE_subImportIdentifier = 6, 
		RULE_singleImport = 7, RULE_importAlias = 8, RULE_topLevelObject = 9, 
		RULE_classDeclaration = 10, RULE_interfaceDeclaration = 11, RULE_annotationDeclaration = 12, 
		RULE_documentDeclaration = 13, RULE_primaryConstructor = 14, RULE_classParameters = 15, 
		RULE_classParameter = 16, RULE_delegationSpecifiers = 17, RULE_annotatedDelegationSpecifier = 18, 
		RULE_delegationSpecifier = 19, RULE_interfaceDelegationSpecifiers = 20, 
		RULE_annotatedInterfaceDelegationSpecifier = 21, RULE_constructorInvocation = 22, 
		RULE_valueArguments = 23, RULE_valueArgument = 24, RULE_secondaryConstructor = 25, 
		RULE_constructorDelegationCall = 26, RULE_classBody = 27, RULE_classMember = 28, 
		RULE_loadScript = 29, RULE_initializerBody = 30, RULE_partnerDeclaration = 31, 
		RULE_typeArguments = 32, RULE_typeProjection = 33, RULE_typeProjectionModifierList = 34, 
		RULE_typeProjectionModifier = 35, RULE_typeParameters = 36, RULE_typeParameter = 37, 
		RULE_typeParameterModifierList = 38, RULE_typeParameterModifier = 39, 
		RULE_reificationModifier = 40, RULE_varianceModifier = 41, RULE_type = 42, 
		RULE_functionType = 43, RULE_receiverType = 44, RULE_functionTypeParameters = 45, 
		RULE_parenthesizedType = 46, RULE_arrayType = 47, RULE_nullableType = 48, 
		RULE_userType = 49, RULE_simpleUserType = 50, RULE_structDeclaration = 51, 
		RULE_structBody = 52, RULE_structMember = 53, RULE_enumDeclaration = 54, 
		RULE_enumBody = 55, RULE_enumEntries = 56, RULE_enumEntry = 57, RULE_extensionDeclaration = 58, 
		RULE_extensionBody = 59, RULE_extensionMember = 60, RULE_propertyDeclaration = 61, 
		RULE_variableDeclaration = 62, RULE_multiVariableDeclaration = 63, RULE_propertyBody = 64, 
		RULE_getter = 65, RULE_setter = 66, RULE_functionValueParameterWithOptionalType = 67, 
		RULE_parameterModifiers = 68, RULE_parameterWithOptionalType = 69, RULE_functionDeclaration = 70, 
		RULE_functionValueParameters = 71, RULE_functionValueParameter = 72, RULE_parameter = 73, 
		RULE_functionBody = 74, RULE_block = 75, RULE_statements = 76, RULE_statement = 77, 
		RULE_loopStatement = 78, RULE_forStatement = 79, RULE_whileStatement = 80, 
		RULE_doWhileStatement = 81, RULE_assignment = 82, RULE_expression = 83, 
		RULE_disjunction = 84, RULE_conjunction = 85, RULE_equalityComparison = 86, 
		RULE_identityComparison = 87, RULE_comparison = 88, RULE_callExpression = 89, 
		RULE_namedInfixExpression = 90, RULE_elvisExpression = 91, RULE_infixFunctionCall = 92, 
		RULE_rangeExpression = 93, RULE_xorExpression = 94, RULE_additiveExpression = 95, 
		RULE_multiplicativeExpression = 96, RULE_exponentialExpression = 97, RULE_asExpression = 98, 
		RULE_prefixUnaryExpression = 99, RULE_postfixUnaryExpression = 100, RULE_atomicExpression = 101, 
		RULE_parenthesizedExpression = 102, RULE_contextualReference = 103, RULE_callableReference = 104, 
		RULE_anonymousObjectLiteral = 105, RULE_collectionLiteral = 106, RULE_thisExpression = 107, 
		RULE_superExpression = 108, RULE_conditionalExpression = 109, RULE_ifExpression = 110, 
		RULE_controlStructureBody = 111, RULE_matchExpression = 112, RULE_matchEntry = 113, 
		RULE_optionalTryExpression = 114, RULE_tryExpression = 115, RULE_catchBlock = 116, 
		RULE_finallyBlock = 117, RULE_jumpExpression = 118, RULE_triggerExpression = 119, 
		RULE_returnExpression = 120, RULE_continueExpression = 121, RULE_breakExpression = 122, 
		RULE_labelDefinition = 123, RULE_labelReference = 124, RULE_literalConstant = 125, 
		RULE_nullLiteral = 126, RULE_boolLiteral = 127, RULE_trileanLiteral = 128, 
		RULE_integerLiteral = 129, RULE_longLiteral = 130, RULE_shortLiteral = 131, 
		RULE_byteLiteral = 132, RULE_floatLiteral = 133, RULE_doubleLiteral = 134, 
		RULE_complexLiteral = 135, RULE_characterLiteral = 136, RULE_stringLiteral = 137, 
		RULE_lineStringLiteral = 138, RULE_multiLineStringLiteral = 139, RULE_lineStringContent = 140, 
		RULE_lineStringExpression = 141, RULE_multiLineStringContent = 142, RULE_multiLineStringExpression = 143, 
		RULE_functionLiteral = 144, RULE_lambdaLiteral = 145, RULE_lambdaParameters = 146, 
		RULE_lambdaParameter = 147, RULE_anonymousFunction = 148, RULE_assignmentOperator = 149, 
		RULE_disjunctionOperator = 150, RULE_conjunctionOperator = 151, RULE_equalityOperator = 152, 
		RULE_identityOperator = 153, RULE_comparisonOperator = 154, RULE_inOperator = 155, 
		RULE_isOperator = 156, RULE_elvisOperator = 157, RULE_toOperator = 158, 
		RULE_byOperator = 159, RULE_xorOperator = 160, RULE_additiveOperator = 161, 
		RULE_multiplicativeOperator = 162, RULE_exponentialOperator = 163, RULE_asOperator = 164, 
		RULE_unaryPrefix = 165, RULE_prefixUnaryOperator = 166, RULE_unaryPostfix = 167, 
		RULE_postfixUnaryOperator = 168, RULE_assignableExpression = 169, RULE_parenthesizedAssignableExpression = 170, 
		RULE_assignableSuffix = 171, RULE_callSuffix = 172, RULE_annotatedLambda = 173, 
		RULE_indexingSuffix = 174, RULE_navigationSuffix = 175, RULE_memberAccessOperator = 176, 
		RULE_modifierList = 177, RULE_modifier = 178, RULE_visibilityModifier = 179, 
		RULE_inheritanceModifier = 180, RULE_parameterModifier = 181, RULE_functionModifier = 182, 
		RULE_annotations = 183, RULE_annotation = 184, RULE_unescapedAnnotation = 185, 
		RULE_identifier = 186, RULE_simpleIdentifier = 187, RULE_semi = 188;
	private static String[] makeRuleNames() {
		return new String[] {
			"aprlFile", "preamble", "namespaceHeader", "importList", "importHeader", 
			"importIdentifier", "subImportIdentifier", "singleImport", "importAlias", 
			"topLevelObject", "classDeclaration", "interfaceDeclaration", "annotationDeclaration", 
			"documentDeclaration", "primaryConstructor", "classParameters", "classParameter", 
			"delegationSpecifiers", "annotatedDelegationSpecifier", "delegationSpecifier", 
			"interfaceDelegationSpecifiers", "annotatedInterfaceDelegationSpecifier", 
			"constructorInvocation", "valueArguments", "valueArgument", "secondaryConstructor", 
			"constructorDelegationCall", "classBody", "classMember", "loadScript", 
			"initializerBody", "partnerDeclaration", "typeArguments", "typeProjection", 
			"typeProjectionModifierList", "typeProjectionModifier", "typeParameters", 
			"typeParameter", "typeParameterModifierList", "typeParameterModifier", 
			"reificationModifier", "varianceModifier", "type", "functionType", "receiverType", 
			"functionTypeParameters", "parenthesizedType", "arrayType", "nullableType", 
			"userType", "simpleUserType", "structDeclaration", "structBody", "structMember", 
			"enumDeclaration", "enumBody", "enumEntries", "enumEntry", "extensionDeclaration", 
			"extensionBody", "extensionMember", "propertyDeclaration", "variableDeclaration", 
			"multiVariableDeclaration", "propertyBody", "getter", "setter", "functionValueParameterWithOptionalType", 
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
			"elvisOperator", "toOperator", "byOperator", "xorOperator", "additiveOperator", 
			"multiplicativeOperator", "exponentialOperator", "asOperator", "unaryPrefix", 
			"prefixUnaryOperator", "unaryPostfix", "postfixUnaryOperator", "assignableExpression", 
			"parenthesizedAssignableExpression", "assignableSuffix", "callSuffix", 
			"annotatedLambda", "indexingSuffix", "navigationSuffix", "memberAccessOperator", 
			"modifierList", "modifier", "visibilityModifier", "inheritanceModifier", 
			"parameterModifier", "functionModifier", "annotations", "annotation", 
			"unescapedAnnotation", "identifier", "simpleIdentifier", "semi"
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
			"'cover'", "'open'", "'final'", "'direct'", "'external'", "'sync'", "'function'", 
			"'script'", "'operator'", "'extension'", "'params'", "'if'", "'unless'", 
			"'elsif'", "'else'", "'for'", "'match'", "'when'", "'do'", "'while'", 
			"'return'", "'break'", "'continue'", null, null, null, "'or'", "'and'", 
			"'not'", "'as'", "'as?'", "'is'", "'!is'", "'in'", "'!in'", "'to'", "'by'", 
			"'try'", "'try?'", "'catch'", "'finally'", "'trigger'", "'true'", "'false'", 
			"'none'", "'null'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", 
			"':='", "'+'", "'+='", "'++'", "'-'", "'-='", "'--'", "'*'", "'*='", 
			"'/'", "'/='", "'%'", "'%='", "'^'", "'^='", null, null, null, null, 
			null, null, "','", "'.'", "'?.'", "'..'", "'...'", "':'", "'::'", "';'", 
			"'!'", "'!!'", "'?'", "'#'", "'@'", "'@@'", "'?:'", "'?='", "'=='", "'!='", 
			"'==='", "'!=='", "'<'", "'!<'", "'<='", "'!<='", "'>'", "'!>'", "'>='", 
			"'!>='", "'<-'", "'->'", "'=>'", "'<=>'", "'''", null, "'\"\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "DocComment", "LineComment", "WS", "NL", "NAMESPACE", 
			"USING", "ALIAS", "CLASS", "INTERFACE", "STRUCT", "DOCUMENT", "ANONYMOUS", 
			"ENUM", "ANNOTATION", "PARTNER", "THIS", "SUPER", "SUB_", "ACTUAL", "INIT", 
			"EXEC", "PRIVATE", "BOUNDED", "LOCAL", "PUBLIC", "GETTER", "SETTER", 
			"DEF", "CONST", "VAR", "VAL", "SAMPLE", "COVER", "OPEN", "FINAL", "DIRECT", 
			"EXTERNAL", "SYNC", "FUNCTION", "SCRIPT", "OPERATOR", "EXTENSION", "PARAMS", 
			"IF", "UNLESS", "ELSIF", "ELSE", "FOR", "MATCH", "WHEN", "DO", "WHILE", 
			"RETURN", "BREAK", "CONTINUE", "RETURN_AT", "BREAK_AT", "CONTINUE_AT", 
			"OR", "AND", "NOT", "AS", "AS_QUEST", "IS", "NOT_IS", "IN", "NOT_IN", 
			"TO", "BY", "TRY", "TRY_QUEST", "CATCH", "FINALLY", "TRIGGER", "TRUE", 
			"FALSE", "NONE", "NULL", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", 
			"RCURLY", "ASSIGN", "DEFINE", "ADD", "ADD_ASSIGN", "INCR", "SUB", "SUB_ASSIGN", 
			"DECR", "MUL", "MUL_ASSIGN", "DIV", "DIV_ASSIGN", "MOD", "MOD_ASSIGN", 
			"EXP", "EXP_ASSIGN", "CONJ", "CONJ_ASSIGN", "DISJ", "DISJ_ASSIGN", "XOR", 
			"XOR_ASSIGN", "COMMA", "PERIOD", "QUEST_PERIOD", "DOUBLE_PERIOD", "TRIPLE_PERIOD", 
			"COLON", "DOUBLE_COLON", "SEMICOLON", "EXCL", "DOUBLE_EXCL", "QUEST", 
			"HASH", "AT", "DOUBLE_AT", "ELVIS", "ELVIS_ASSIGN", "EQUAL", "NEQUAL", 
			"IDENTICAL", "NIDENTICAL", "LANGLE", "NLANGLE", "LEQ", "NLEQ", "RANGLE", 
			"NRANGLE", "GEQ", "NGEQ", "LARROW", "RARROW", "RARROW_THICK", "SPACESHIP", 
			"SINGLE_QUOTE", "QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", "IntegerLiteral", 
			"LongLiteral", "ShortLiteral", "ByteLiteral", "FloatLiteral", "DoubleLiteral", 
			"ComplexLiteral", "HexLiteral", "BinLiteral", "OctalLiteral", "BooleanLiteral", 
			"TrileanLiteral", "Identifier", "LabelReference", "LabelDefinition", 
			"FieldIdentifier", "CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", 
			"UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", 
			"UNICODE_CLASS_NL", "QUOTE_CLOSE", "LineStrRef", "LineStrText", "LineStrEscapedChar", 
			"LineStrExprStart", "TRIPLE_QUOTE_CLOSE", "MultiLineStrQuote", "MultiLineStrRef", 
			"MultiLineStrText", "MultiLineStrEscapedChar", "MultiLineStrExprStart", 
			"MultiLineNL"
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
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(NL);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(384);
			preamble();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(385);
				match(NL);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(391);
				topLevelObject();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(393); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(392);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(395); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
						{
						setState(397);
						topLevelObject();
						}
					}

					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(407);
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
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMESPACE) {
				{
				setState(409);
				namespaceHeader();
				}
			}

			setState(412);
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
			setState(414);
			match(NAMESPACE);
			setState(415);
			identifier();
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(416);
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
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(419);
				importHeader();
				}
				}
				setState(424);
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
			setState(425);
			match(USING);
			setState(426);
			importIdentifier();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(427);
				match(COMMA);
				setState(428);
				importIdentifier();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(434);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				singleImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				identifier();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(439);
					match(PERIOD);
					setState(452);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(440);
						match(MUL);
						}
						break;
					case LSQUARE:
						{
						setState(441);
						match(LSQUARE);
						setState(442);
						subImportIdentifier();
						setState(447);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(443);
							match(COMMA);
							setState(444);
							subImportIdentifier();
							}
							}
							setState(449);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(450);
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
			setState(458);
			simpleIdentifier();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(459);
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
			setState(462);
			identifier();
			setState(463);
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
			setState(465);
			match(ALIAS);
			setState(466);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				annotationDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				documentDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(474);
				extensionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(475);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(476);
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
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(479);
				modifierList();
				}
			}

			setState(482);
			match(CLASS);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(483);
				match(NL);
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			simpleIdentifier();
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(490);
					match(NL);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				typeParameters();
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(499);
					match(NL);
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				primaryConstructor();
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(508);
					match(NL);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				match(LARROW);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(515);
					match(NL);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				delegationSpecifiers();
				}
				break;
			}
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(524);
					match(NL);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(530);
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
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(533);
				modifierList();
				}
			}

			setState(536);
			match(INTERFACE);
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
			simpleIdentifier();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(544);
					match(NL);
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				typeParameters();
				}
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(553);
					match(NL);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(LARROW);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(560);
					match(NL);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				interfaceDelegationSpecifiers();
				}
				break;
			}
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(569);
					match(NL);
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
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
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(578);
				modifierList();
				}
			}

			setState(581);
			match(ANNOTATION);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(582);
				match(NL);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			simpleIdentifier();
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(589);
					match(NL);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				primaryConstructor();
				}
				break;
			}
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(598);
					match(NL);
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
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
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(607);
				modifierList();
				}
			}

			setState(610);
			match(DOCUMENT);
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
			simpleIdentifier();
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(618);
					match(NL);
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624);
				typeParameters();
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(627);
				match(NL);
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			primaryConstructor();
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(634);
					match(NL);
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(640);
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
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					setState(643);
					modifierList();
					}
				}

				setState(646);
				match(INIT);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(647);
					match(NL);
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(655);
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
			setState(657);
			match(LPAREN);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(NL);
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(664);
				classParameter();
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(665);
							match(NL);
							}
							}
							setState(670);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(671);
						match(COMMA);
						setState(675);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(672);
								match(NL);
								}
								} 
							}
							setState(677);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						}
						setState(678);
						classParameter();
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(686);
				match(NL);
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
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
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(694);
				modifierList();
				}
			}

			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==VAL) {
				{
				setState(697);
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

			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(700);
				match(NL);
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			simpleIdentifier();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(707);
				match(NL);
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(713);
			match(COLON);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(714);
				match(NL);
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			type();
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(721);
					match(NL);
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				match(ASSIGN);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(728);
					match(NL);
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(734);
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
			setState(737);
			annotatedDelegationSpecifier();
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(738);
						match(NL);
						}
						}
						setState(743);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(744);
					match(COMMA);
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(745);
						match(NL);
						}
						}
						setState(750);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(751);
					annotatedDelegationSpecifier();
					}
					} 
				}
				setState(756);
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
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(757);
				annotations();
				}
			}

			setState(760);
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
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
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
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				functionType();
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
			setState(767);
			annotatedInterfaceDelegationSpecifier();
			setState(784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(768);
						match(NL);
						}
						}
						setState(773);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(774);
					match(COMMA);
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(775);
						match(NL);
						}
						}
						setState(780);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(781);
					annotatedInterfaceDelegationSpecifier();
					}
					} 
				}
				setState(786);
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
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
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(787);
				annotations();
				}
			}

			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(790);
				userType();
				}
				break;
			case LPAREN:
				{
				setState(791);
				functionType();
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			userType();
			setState(795);
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
		enterRule(_localctx, 46, RULE_valueArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(LPAREN);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					match(NL);
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << ANONYMOUS) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN_AT) | (1L << BREAK_AT) | (1L << CONTINUE_AT) | (1L << NOT))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRY - 71)) | (1L << (TRY_QUEST - 71)) | (1L << (TRIGGER - 71)) | (1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NONE - 71)) | (1L << (NULL - 71)) | (1L << (LPAREN - 71)) | (1L << (LSQUARE - 71)) | (1L << (LCURLY - 71)) | (1L << (ADD - 71)) | (1L << (INCR - 71)) | (1L << (SUB - 71)) | (1L << (DECR - 71)) | (1L << (PERIOD - 71)) | (1L << (TRIPLE_PERIOD - 71)) | (1L << (DOUBLE_COLON - 71)) | (1L << (EXCL - 71)) | (1L << (HASH - 71)) | (1L << (DOUBLE_AT - 71)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (QUOTE_OPEN - 141)) | (1L << (TRIPLE_QUOTE_OPEN - 141)) | (1L << (IntegerLiteral - 141)) | (1L << (LongLiteral - 141)) | (1L << (ShortLiteral - 141)) | (1L << (ByteLiteral - 141)) | (1L << (FloatLiteral - 141)) | (1L << (DoubleLiteral - 141)) | (1L << (ComplexLiteral - 141)) | (1L << (Identifier - 141)) | (1L << (CharacterLiteral - 141)))) != 0)) {
				{
				setState(804);
				valueArgument();
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(808);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(805);
							match(NL);
							}
							}
							setState(810);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(811);
						match(COMMA);
						setState(815);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(812);
								match(NL);
								}
								} 
							}
							setState(817);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
						}
						setState(818);
						valueArgument();
						}
						} 
					}
					setState(823);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(824);
					match(NL);
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(832);
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
		enterRule(_localctx, 48, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(834);
				annotations();
				}
				break;
			}
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(837);
				simpleIdentifier();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(838);
					match(NL);
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(844);
				match(ASSIGN);
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(845);
						match(NL);
						}
						} 
					}
					setState(850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRIPLE_PERIOD) {
				{
				setState(853);
				match(TRIPLE_PERIOD);
				}
			}

			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(856);
				match(NL);
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
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
		enterRule(_localctx, 50, RULE_secondaryConstructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(864);
				modifierList();
				}
			}

			setState(867);
			match(INIT);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(868);
				match(NL);
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			functionValueParameters();
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(875);
					match(NL);
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(881);
				match(COLON);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(882);
					match(NL);
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				constructorDelegationCall();
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(891);
					match(NL);
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(897);
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
		enterRule(_localctx, 52, RULE_constructorDelegationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==SUPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(901);
				match(NL);
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
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
		enterRule(_localctx, 54, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(LCURLY);
			setState(913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(910);
					match(NL);
					}
					} 
				}
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(916);
				classMember();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(922);
				match(NL);
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
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
		enterRule(_localctx, 56, RULE_classMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(930);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(931);
				secondaryConstructor();
				}
				break;
			case 3:
				{
				setState(932);
				loadScript();
				}
				break;
			case 4:
				{
				setState(933);
				initializerBody();
				}
				break;
			case 5:
				{
				setState(934);
				partnerDeclaration();
				}
				break;
			}
			setState(938); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(937);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(940); 
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
		enterRule(_localctx, 58, RULE_loadScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(EXEC);
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
		enterRule(_localctx, 60, RULE_initializerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(INIT);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(952);
				match(NL);
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(958);
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
		enterRule(_localctx, 62, RULE_partnerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(960);
				modifierList();
				}
			}

			setState(963);
			match(PARTNER);
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(964);
					match(NL);
					}
					}
					setState(969);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(970);
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
		enterRule(_localctx, 64, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(LANGLE);
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
			typeProjection();
			setState(991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
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
					match(COMMA);
					setState(988);
					typeProjection();
					}
					} 
				}
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(994);
				match(NL);
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
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
		enterRule(_localctx, 66, RULE_typeProjection);
		try {
			setState(1007);
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
				setState(1003);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1002);
					typeProjectionModifierList();
					}
					break;
				}
				setState(1005);
				type();
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
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
		enterRule(_localctx, 68, RULE_typeProjectionModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1009);
					typeProjectionModifier();
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1010);
						match(NL);
						}
						}
						setState(1015);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1018); 
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
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
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
		enterRule(_localctx, 70, RULE_typeProjectionModifier);
		try {
			int _alt;
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case SUB_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				varianceModifier();
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1021);
						match(NL);
						}
						} 
					}
					setState(1026);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
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
		enterRule(_localctx, 72, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(LANGLE);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1031);
				match(NL);
				}
				}
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1037);
			typeParameter();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1038);
						match(NL);
						}
						}
						setState(1043);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1044);
					match(COMMA);
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1045);
						match(NL);
						}
						}
						setState(1050);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1051);
					typeParameter();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1057);
				match(NL);
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
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
		enterRule(_localctx, 74, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << SUB_) | (1L << ACTUAL))) != 0) || _la==HASH) {
				{
				setState(1065);
				typeParameterModifierList();
				}
			}

			setState(1068);
			simpleIdentifier();
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1069);
					match(NL);
					}
					}
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1075);
				match(COLON);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1076);
					match(NL);
					}
					}
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1082);
				type();
				setState(1099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1083);
							match(NL);
							}
							}
							setState(1088);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1089);
						match(CONJ);
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
						setState(1096);
						type();
						}
						} 
					}
					setState(1101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
		enterRule(_localctx, 76, RULE_typeParameterModifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1104);
				typeParameterModifier();
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
				}
				}
				setState(1113); 
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
		enterRule(_localctx, 78, RULE_typeParameterModifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTUAL:
				{
				setState(1115);
				reificationModifier();
				}
				break;
			case SUPER:
			case SUB_:
				{
				setState(1116);
				varianceModifier();
				}
				break;
			case HASH:
				{
				setState(1117);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					match(NL);
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_reificationModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
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
		enterRule(_localctx, 82, RULE_varianceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 84, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1130);
				annotations();
				}
			}

			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1133);
				functionType();
				}
				break;
			case 2:
				{
				setState(1134);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1135);
				arrayType();
				}
				break;
			case 4:
				{
				setState(1136);
				nullableType();
				}
				break;
			case 5:
				{
				setState(1137);
				userType();
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
		enterRule(_localctx, 86, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			functionTypeParameters();
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
			match(RARROW_THICK);
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
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
		enterRule(_localctx, 88, RULE_receiverType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1156);
				annotations();
				}
			}

			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1159);
				parenthesizedType();
				}
				break;
			case 2:
				{
				setState(1160);
				nullableType();
				}
				break;
			case 3:
				{
				setState(1161);
				userType();
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		enterRule(_localctx, 90, RULE_functionTypeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(LPAREN);
			setState(1168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					match(NL);
					}
					} 
				}
				setState(1170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LPAREN - 80)) | (1L << (LSQUARE - 80)) | (1L << (HASH - 80)))) != 0) || _la==Identifier) {
				{
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1171);
					parameter();
					}
					break;
				case 2:
					{
					setState(1172);
					type();
					}
					break;
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1175);
							match(NL);
							}
							}
							setState(1180);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1181);
						match(COMMA);
						setState(1185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1182);
							match(NL);
							}
							}
							setState(1187);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
						case 1:
							{
							setState(1188);
							parameter();
							}
							break;
						case 2:
							{
							setState(1189);
							type();
							}
							break;
						}
						}
						} 
					}
					setState(1196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
			}

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
		enterRule(_localctx, 92, RULE_parenthesizedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(LPAREN);
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
			type();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1215);
				match(NL);
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1221);
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
		enterRule(_localctx, 94, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(LSQUARE);
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1224);
				match(NL);
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1230);
			type();
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1231);
				match(NL);
				}
				}
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1237);
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(AprlParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(AprlParser.QUEST, i);
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
		enterRule(_localctx, 96, RULE_nullableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1239);
				userType();
				}
				break;
			case LPAREN:
				{
				setState(1240);
				parenthesizedType();
				}
				break;
			case LSQUARE:
				{
				setState(1241);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1244);
				match(NL);
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1250);
				match(QUEST);
				}
				}
				setState(1253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUEST );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserTypeContext extends ParserRuleContext {
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(AprlParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(AprlParser.PERIOD, i);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			simpleUserType();
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1256);
						match(NL);
						}
						}
						setState(1261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1262);
					match(PERIOD);
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1263);
						match(NL);
						}
						}
						setState(1268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1269);
					simpleUserType();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitSimpleUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitSimpleUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			simpleIdentifier();
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1276);
					match(NL);
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1282);
				typeArguments();
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
		enterRule(_localctx, 102, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1285);
				modifierList();
				}
			}

			setState(1288);
			match(STRUCT);
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1289);
				match(NL);
				}
				}
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1295);
			simpleIdentifier();
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1296);
					match(NL);
					}
					}
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1302);
				match(LARROW);
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1303);
					match(NL);
					}
					}
					setState(1308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1309);
				delegationSpecifiers();
				}
				break;
			}
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1312);
					match(NL);
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
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
		enterRule(_localctx, 104, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(LCURLY);
			setState(1325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1322);
					match(NL);
					}
					} 
				}
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1328);
				structMember();
				}
				}
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1334);
				match(NL);
				}
				}
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1340);
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
		enterRule(_localctx, 106, RULE_structMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
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
			case DIRECT:
			case EXTERNAL:
			case SYNC:
			case FUNCTION:
			case SCRIPT:
			case OPERATOR:
			case EXTENSION:
			case PARAMS:
			case HASH:
				{
				setState(1342);
				topLevelObject();
				}
				break;
			case EXEC:
				{
				setState(1343);
				loadScript();
				}
				break;
			case INIT:
				{
				setState(1344);
				initializerBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1348); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1347);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1350); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 108, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1352);
				modifierList();
				}
			}

			setState(1355);
			match(ENUM);
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1356);
				match(NL);
				}
				}
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362);
			simpleIdentifier();
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1363);
					match(NL);
					}
					}
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1369);
				primaryConstructor();
				}
				break;
			}
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
		enterRule(_localctx, 110, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(LCURLY);
			setState(1384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381);
					match(NL);
					}
					} 
				}
				setState(1386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH || _la==Identifier) {
				{
				setState(1387);
				enumEntries();
				}
			}

			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1390);
					match(NL);
					}
					}
					setState(1395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1396);
				match(SEMICOLON);
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1397);
						match(NL);
						}
						} 
					}
					setState(1402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << STRUCT) | (1L << DOCUMENT) | (1L << ENUM) | (1L << ANNOTATION) | (1L << PARTNER) | (1L << INIT) | (1L << EXEC) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << EXTENSION) | (1L << PARAMS))) != 0) || _la==HASH) {
					{
					{
					setState(1403);
					classMember();
					}
					}
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
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
		enterRule(_localctx, 112, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			enumEntry();
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(COMMA);
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
					enumEntry();
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1439);
				modifierList();
				}
			}

			setState(1442);
			simpleIdentifier();
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1443);
					match(NL);
					}
					}
					setState(1448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1449);
				valueArguments();
				}
				break;
			}
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1452);
					match(NL);
					}
					}
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1458);
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
		enterRule(_localctx, 116, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1461);
				modifierList();
				}
			}

			setState(1464);
			match(EXTENSION);
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1465);
				match(NL);
				}
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1471);
			receiverType();
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1472);
					match(NL);
					}
					}
					setState(1477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1478);
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
		enterRule(_localctx, 118, RULE_extensionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(LCURLY);
			setState(1485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1482);
					match(NL);
					}
					} 
				}
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				{
				setState(1488);
				extensionMember();
				}
				}
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1494);
				match(NL);
				}
				}
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1500);
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
		enterRule(_localctx, 120, RULE_extensionMember);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1502);
				functionDeclaration();
				}
				break;
			case 2:
				{
				setState(1503);
				propertyDeclaration();
				}
				break;
			case 3:
				{
				setState(1504);
				secondaryConstructor();
				}
				break;
			}
			setState(1508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1507);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
		enterRule(_localctx, 122, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1512);
				modifierList();
				}
			}

			setState(1515);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << CONST) | (1L << VAR) | (1L << VAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1516);
					match(NL);
					}
					}
					setState(1521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1522);
				typeParameters();
				}
				break;
			}
			{
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1525);
				match(NL);
				}
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				{
				setState(1531);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1532);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1535);
					match(NL);
					}
					}
					setState(1540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1541);
				match(ASSIGN);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1542);
					match(NL);
					}
					}
					setState(1547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1548);
				expression();
				}
				break;
			}
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1551);
					match(NL);
					}
					}
					setState(1556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1557);
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
		enterRule(_localctx, 124, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1560);
				annotations();
				}
			}

			setState(1563);
			simpleIdentifier();
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1564);
					match(NL);
					}
					}
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1570);
				match(COLON);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1571);
					match(NL);
					}
					}
					setState(1576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1577);
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
		enterRule(_localctx, 126, RULE_multiVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(LPAREN);
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1581);
				match(NL);
				}
				}
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1587);
			variableDeclaration();
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1588);
						match(NL);
						}
						}
						setState(1593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1594);
					match(COMMA);
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
					variableDeclaration();
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1607);
				match(NL);
				}
				}
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1613);
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
		enterRule(_localctx, 128, RULE_propertyBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(LCURLY);
			setState(1619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1616);
					match(NL);
					}
					} 
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1622);
				getter();
				setState(1630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1623);
						semi();
						}
						}
						setState(1628);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1629);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1632);
				setter();
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL || _la==SEMICOLON) {
						{
						{
						setState(1633);
						semi();
						}
						}
						setState(1638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1639);
					getter();
					}
					break;
				}
				}
				break;
			}
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1644);
				match(NL);
				}
				}
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1650);
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
		enterRule(_localctx, 130, RULE_getter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1652);
				modifierList();
				}
			}

			setState(1655);
			match(GETTER);
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1656);
					match(NL);
					}
					}
					setState(1661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
				match(RPAREN);
				}
				break;
			}
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
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
				match(RARROW);
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1679);
					match(NL);
					}
					}
					setState(1684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1685);
				type();
				}
				break;
			}
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1688);
					match(NL);
					}
					} 
				}
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==ASSIGN) {
				{
				setState(1694);
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
		enterRule(_localctx, 132, RULE_setter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1697);
				modifierList();
				}
			}

			setState(1700);
			match(SETTER);
			setState(1704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1701);
					match(NL);
					}
					} 
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1707);
					match(LPAREN);
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
					functionValueParameterWithOptionalType();
					setState(1718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1715);
						match(NL);
						}
						}
						setState(1720);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1721);
					match(RPAREN);
					}
				}

				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1725);
						match(NL);
						}
						}
						setState(1730);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1731);
					match(RARROW);
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
					type();
					}
					break;
				}
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
		enterRule(_localctx, 134, RULE_functionValueParameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH) {
				{
				setState(1750);
				parameterModifiers();
				}
			}

			setState(1753);
			parameterWithOptionalType();
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1754);
					match(NL);
					}
					}
					setState(1759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1760);
				match(ASSIGN);
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
		enterRule(_localctx, 136, RULE_parameterModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1772);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(1770);
					annotation();
					}
					break;
				case PARAMS:
					{
					setState(1771);
					parameterModifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1774); 
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
		enterRule(_localctx, 138, RULE_parameterWithOptionalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			simpleIdentifier();
			setState(1791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1777);
					match(NL);
					}
					}
					setState(1782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1783);
				match(COLON);
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1784);
					match(NL);
					}
					}
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1790);
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
		enterRule(_localctx, 140, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH) {
				{
				setState(1793);
				modifierList();
				}
			}

			setState(1796);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << SCRIPT) | (1L << OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
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
				typeParameters();
				}
				break;
			}
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1806);
				match(NL);
				}
				}
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1812);
			simpleIdentifier();
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1813);
				match(NL);
				}
				}
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1819);
			functionValueParameters();
			setState(1834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1820);
					match(NL);
					}
					}
					setState(1825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1826);
				match(RARROW);
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1827);
					match(NL);
					}
					}
					setState(1832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1833);
				type();
				}
				break;
			}
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1836);
					match(NL);
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1842);
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
		enterRule(_localctx, 142, RULE_functionValueParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(LPAREN);
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1846);
					match(NL);
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH || _la==Identifier) {
				{
				setState(1852);
				functionValueParameter();
				setState(1869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1856);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1853);
							match(NL);
							}
							}
							setState(1858);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1859);
						match(COMMA);
						setState(1863);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1860);
							match(NL);
							}
							}
							setState(1865);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1866);
						functionValueParameter();
						}
						} 
					}
					setState(1871);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				}
				}
			}

			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1874);
				match(NL);
				}
				}
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1880);
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
		enterRule(_localctx, 144, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAMS || _la==HASH) {
				{
				setState(1882);
				parameterModifiers();
				}
			}

			setState(1885);
			parameter();
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
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
				match(ASSIGN);
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
		enterRule(_localctx, 146, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			simpleIdentifier();
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1903);
				match(NL);
				}
				}
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1909);
			match(COLON);
			setState(1913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1910);
				match(NL);
				}
				}
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1916);
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
		enterRule(_localctx, 148, RULE_functionBody);
		int _la;
		try {
			setState(1927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				match(ASSIGN);
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1920);
					match(NL);
					}
					}
					setState(1925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1926);
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
		enterRule(_localctx, 150, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(LCURLY);
			setState(1933);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1930);
					match(NL);
					}
					} 
				}
				setState(1935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			setState(1936);
			statements();
			setState(1940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1937);
				match(NL);
				}
				}
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1943);
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
		enterRule(_localctx, 152, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1945);
				statement();
				setState(1955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1947); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1946);
								semi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1949); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1951);
						statement();
						}
						} 
					}
					setState(1957);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				}
				}
				break;
			}
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1960);
					semi();
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1968);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(1966);
						labelDefinition();
						}
						break;
					case HASH:
						{
						setState(1967);
						annotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
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
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(1979);
				topLevelObject();
				}
				break;
			case 2:
				{
				setState(1980);
				assignment();
				}
				break;
			case 3:
				{
				setState(1981);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(1982);
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
		enterRule(_localctx, 156, RULE_loopStatement);
		try {
			setState(1988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1986);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1987);
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
		enterRule(_localctx, 158, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(FOR);
			setState(1994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1991);
				match(NL);
				}
				}
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1997);
			match(LPAREN);
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1998);
				match(NL);
				}
				}
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2004);
				annotations();
				}
				break;
			}
			setState(2009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				{
				setState(2007);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2008);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2011);
				match(NL);
				}
				}
				setState(2016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2017);
			match(IN);
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2018);
				match(NL);
				}
				}
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2024);
			expression();
			setState(2028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2025);
				match(NL);
				}
				}
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2031);
			match(RPAREN);
			setState(2035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2032);
				match(NL);
				}
				}
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2038);
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
		enterRule(_localctx, 160, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(WHILE);
			setState(2044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2041);
				match(NL);
				}
				}
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2047);
			match(LPAREN);
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
			expression();
			setState(2058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2055);
				match(NL);
				}
				}
				setState(2060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2061);
			match(RPAREN);
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2062);
				match(NL);
				}
				}
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2068);
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
		enterRule(_localctx, 162, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(DO);
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2071);
				match(NL);
				}
				}
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2077);
			controlStructureBody();
			setState(2081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2078);
				match(NL);
				}
				}
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2084);
			match(WHILE);
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
			match(LPAREN);
			setState(2095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2092);
				match(NL);
				}
				}
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2098);
			expression();
			setState(2102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2099);
				match(NL);
				}
				}
				setState(2104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2105);
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
		enterRule(_localctx, 164, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2107);
				assignableExpression();
				setState(2111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2108);
						match(NL);
						}
						} 
					}
					setState(2113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				}
				setState(2114);
				assignmentOperator();
				}
				break;
			}
			setState(2118);
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
		enterRule(_localctx, 166, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
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
		enterRule(_localctx, 168, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			conjunction();
			setState(2128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2123);
					disjunctionOperator();
					setState(2124);
					conjunction();
					}
					} 
				}
				setState(2130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			equalityComparison();
			setState(2137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2132);
					conjunctionOperator();
					setState(2133);
					equalityComparison();
					}
					} 
				}
				setState(2139);
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
		enterRule(_localctx, 172, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			identityComparison();
			setState(2146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2141);
					equalityOperator();
					setState(2142);
					identityComparison();
					}
					} 
				}
				setState(2148);
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
		enterRule(_localctx, 174, RULE_identityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			comparison();
			setState(2155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2150);
					identityOperator();
					setState(2151);
					comparison();
					}
					} 
				}
				setState(2157);
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
		enterRule(_localctx, 176, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2158);
			callExpression();
			setState(2164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2159);
					comparisonOperator();
					setState(2160);
					callExpression();
					}
					} 
				}
				setState(2166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 178, RULE_callExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			namedInfixExpression();
			setState(2171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2168);
					callSuffix();
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
		enterRule(_localctx, 180, RULE_namedInfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			elvisExpression();
			setState(2183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						setState(2175);
						inOperator();
						setState(2176);
						elvisExpression();
						}
						break;
					case 2:
						{
						setState(2178);
						isOperator();
						setState(2179);
						type();
						}
						break;
					}
					} 
				}
				setState(2185);
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
		enterRule(_localctx, 182, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			infixFunctionCall();
			setState(2192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2187);
					elvisOperator();
					setState(2188);
					infixFunctionCall();
					}
					} 
				}
				setState(2194);
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
		enterRule(_localctx, 184, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			rangeExpression();
			setState(2201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2196);
					simpleIdentifier();
					setState(2197);
					rangeExpression();
					}
					} 
				}
				setState(2203);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<XorExpressionContext> xorExpression() {
			return getRuleContexts(XorExpressionContext.class);
		}
		public XorExpressionContext xorExpression(int i) {
			return getRuleContext(XorExpressionContext.class,i);
		}
		public List<ToOperatorContext> toOperator() {
			return getRuleContexts(ToOperatorContext.class);
		}
		public ToOperatorContext toOperator(int i) {
			return getRuleContext(ToOperatorContext.class,i);
		}
		public List<ByOperatorContext> byOperator() {
			return getRuleContexts(ByOperatorContext.class);
		}
		public ByOperatorContext byOperator(int i) {
			return getRuleContext(ByOperatorContext.class,i);
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
		enterRule(_localctx, 186, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			xorExpression();
			setState(2214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2205);
					toOperator();
					setState(2206);
					xorExpression();
					setState(2210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						setState(2207);
						byOperator();
						setState(2208);
						xorExpression();
						}
						break;
					}
					}
					} 
				}
				setState(2216);
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
		enterRule(_localctx, 188, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			additiveExpression();
			setState(2223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2218);
					xorOperator();
					setState(2219);
					additiveExpression();
					}
					} 
				}
				setState(2225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			multiplicativeExpression();
			setState(2232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2227);
					additiveOperator();
					setState(2228);
					multiplicativeExpression();
					}
					} 
				}
				setState(2234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			exponentialExpression();
			setState(2241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2236);
					multiplicativeOperator();
					setState(2237);
					exponentialExpression();
					}
					} 
				}
				setState(2243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 194, RULE_exponentialExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			asExpression();
			setState(2250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2245);
					exponentialOperator();
					setState(2246);
					asExpression();
					}
					} 
				}
				setState(2252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 196, RULE_asExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			prefixUnaryExpression();
			setState(2259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2254);
					asOperator();
					setState(2255);
					type();
					}
					} 
				}
				setState(2261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 198, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2262);
					unaryPrefix();
					}
					} 
				}
				setState(2267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2268);
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
		enterRule(_localctx, 200, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			atomicExpression();
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2271);
					unaryPostfix();
					}
					} 
				}
				setState(2276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_atomicExpression);
		try {
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
				simpleIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2279);
				literalConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2280);
				contextualReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2281);
				callableReference();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2282);
				functionLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2283);
				anonymousObjectLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2284);
				collectionLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2285);
				thisExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2286);
				superExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2287);
				conditionalExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2288);
				optionalTryExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2289);
				tryExpression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2290);
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
		enterRule(_localctx, 204, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(LPAREN);
			setState(2294);
			expression();
			setState(2295);
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
		enterRule(_localctx, 206, RULE_contextualReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			match(PERIOD);
			setState(2298);
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
		enterRule(_localctx, 208, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LPAREN - 80)) | (1L << (LSQUARE - 80)) | (1L << (HASH - 80)))) != 0) || _la==Identifier) {
				{
				setState(2300);
				receiverType();
				}
			}

			setState(2303);
			match(DOUBLE_COLON);
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2304);
				match(NL);
				}
				}
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(2310);
				simpleIdentifier();
				}
				break;
			case CLASS:
				{
				setState(2311);
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
		enterRule(_localctx, 210, RULE_anonymousObjectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			match(ANONYMOUS);
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2315);
					match(NL);
					}
					}
					setState(2320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2321);
				match(LARROW);
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
				delegationSpecifiers();
				}
				break;
			}
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
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
		enterRule(_localctx, 212, RULE_collectionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(LSQUARE);
			setState(2344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2341);
					match(NL);
					}
					} 
				}
				setState(2346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			}
			setState(2348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << IF) | (1L << UNLESS) | (1L << MATCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN_AT) | (1L << BREAK_AT) | (1L << CONTINUE_AT) | (1L << NOT))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRY - 71)) | (1L << (TRY_QUEST - 71)) | (1L << (TRIGGER - 71)) | (1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NONE - 71)) | (1L << (NULL - 71)) | (1L << (LPAREN - 71)) | (1L << (LSQUARE - 71)) | (1L << (LCURLY - 71)) | (1L << (ADD - 71)) | (1L << (INCR - 71)) | (1L << (SUB - 71)) | (1L << (DECR - 71)) | (1L << (PERIOD - 71)) | (1L << (DOUBLE_COLON - 71)) | (1L << (EXCL - 71)) | (1L << (HASH - 71)) | (1L << (DOUBLE_AT - 71)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (QUOTE_OPEN - 141)) | (1L << (TRIPLE_QUOTE_OPEN - 141)) | (1L << (IntegerLiteral - 141)) | (1L << (LongLiteral - 141)) | (1L << (ShortLiteral - 141)) | (1L << (ByteLiteral - 141)) | (1L << (FloatLiteral - 141)) | (1L << (DoubleLiteral - 141)) | (1L << (ComplexLiteral - 141)) | (1L << (Identifier - 141)) | (1L << (CharacterLiteral - 141)))) != 0)) {
				{
				setState(2347);
				expression();
				}
			}

			setState(2366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2350);
						match(NL);
						}
						}
						setState(2355);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2356);
					match(COMMA);
					setState(2360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2357);
						match(NL);
						}
						}
						setState(2362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2363);
					expression();
					}
					} 
				}
				setState(2368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			}
			setState(2372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2369);
				match(NL);
				}
				}
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2375);
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
		enterRule(_localctx, 214, RULE_thisExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(THIS);
			setState(2379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2378);
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
		enterRule(_localctx, 216, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(SUPER);
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2382);
				match(LANGLE);
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2383);
					match(NL);
					}
					}
					setState(2388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2389);
				type();
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
				match(RANGLE);
				}
				break;
			}
			setState(2401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2400);
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
		enterRule(_localctx, 218, RULE_conditionalExpression);
		try {
			setState(2405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case UNLESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				ifExpression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
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
		enterRule(_localctx, 220, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==UNLESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2408);
				match(NL);
				}
				}
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2414);
			match(LPAREN);
			setState(2418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2415);
				match(NL);
				}
				}
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2421);
			expression();
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2422);
				match(NL);
				}
				}
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2428);
			match(RPAREN);
			setState(2432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2429);
				match(NL);
				}
				}
				setState(2434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2435);
			controlStructureBody();
			setState(2474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2436);
						match(NL);
						}
						}
						setState(2441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2442);
					match(ELSIF);
					setState(2446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2443);
						match(NL);
						}
						}
						setState(2448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2449);
					match(LPAREN);
					setState(2453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2450);
						match(NL);
						}
						}
						setState(2455);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2456);
					expression();
					setState(2460);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2457);
						match(NL);
						}
						}
						setState(2462);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2463);
					match(RPAREN);
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
					controlStructureBody();
					}
					} 
				}
				setState(2476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			setState(2491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				{
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2477);
					match(NL);
					}
					}
					setState(2482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2483);
				match(ELSE);
				setState(2487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2484);
					match(NL);
					}
					}
					setState(2489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2490);
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
		enterRule(_localctx, 222, RULE_controlStructureBody);
		try {
			setState(2495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2493);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2494);
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
		enterRule(_localctx, 224, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(MATCH);
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
			match(LPAREN);
			setState(2508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2505);
				match(NL);
				}
				}
				setState(2510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2511);
			expression();
			setState(2515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2512);
				match(NL);
				}
				}
				setState(2517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2518);
			match(RPAREN);
			setState(2522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2519);
				match(NL);
				}
				}
				setState(2524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2525);
			match(LCURLY);
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
			setState(2539); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2532);
				matchEntry();
				setState(2536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2533);
						match(NL);
						}
						} 
					}
					setState(2538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
				}
				}
				}
				setState(2541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ELSE || _la==WHEN );
			setState(2546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2543);
				match(NL);
				}
				}
				setState(2548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2549);
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
		enterRule(_localctx, 226, RULE_matchEntry);
		int _la;
		try {
			int _alt;
			setState(2610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				match(WHEN);
				setState(2555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2552);
					match(NL);
					}
					}
					setState(2557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2558);
				literalConstant();
				setState(2575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2562);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2559);
							match(NL);
							}
							}
							setState(2564);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2565);
						match(COMMA);
						setState(2569);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2566);
							match(NL);
							}
							}
							setState(2571);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2572);
						literalConstant();
						}
						} 
					}
					setState(2577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
				}
				setState(2581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2578);
					match(NL);
					}
					}
					setState(2583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2584);
				match(RARROW_THICK);
				setState(2588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2585);
					match(NL);
					}
					}
					setState(2590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2591);
				controlStructureBody();
				setState(2593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(2592);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2595);
				match(ELSE);
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
				match(RARROW_THICK);
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
				setState(2609);
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
		enterRule(_localctx, 228, RULE_optionalTryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			match(TRY_QUEST);
			setState(2616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2613);
				match(NL);
				}
				}
				setState(2618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				{
				setState(2619);
				block();
				}
				break;
			case 2:
				{
				setState(2620);
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
		enterRule(_localctx, 230, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			match(TRY);
			setState(2627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2624);
				match(NL);
				}
				}
				setState(2629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2630);
			block();
			setState(2640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2631);
						match(NL);
						}
						}
						setState(2636);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2637);
					catchBlock();
					}
					} 
				}
				setState(2642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			}
			setState(2650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				{
				setState(2646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2643);
					match(NL);
					}
					}
					setState(2648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2649);
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
		public List<UserTypeContext> userType() {
			return getRuleContexts(UserTypeContext.class);
		}
		public UserTypeContext userType(int i) {
			return getRuleContext(UserTypeContext.class,i);
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
		enterRule(_localctx, 232, RULE_catchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			match(CATCH);
			setState(2656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2653);
				match(NL);
				}
				}
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2659);
			match(LPAREN);
			setState(2663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2660);
				match(NL);
				}
				}
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(2666);
				annotations();
				}
			}

			setState(2669);
			simpleIdentifier();
			setState(2673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2670);
				match(NL);
				}
				}
				setState(2675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2676);
			match(COLON);
			setState(2680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2677);
				match(NL);
				}
				}
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2683);
			userType();
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2684);
						match(NL);
						}
						}
						setState(2689);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2690);
					match(CONJ);
					setState(2694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2691);
						match(NL);
						}
						}
						setState(2696);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2697);
					userType();
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			}
			setState(2706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2703);
				match(NL);
				}
				}
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2709);
			match(RPAREN);
			setState(2713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2710);
				match(NL);
				}
				}
				setState(2715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2716);
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
		enterRule(_localctx, 234, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
			match(FINALLY);
			setState(2722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2719);
				match(NL);
				}
				}
				setState(2724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2725);
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
		enterRule(_localctx, 236, RULE_jumpExpression);
		try {
			setState(2731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2727);
				triggerExpression();
				}
				break;
			case RETURN:
			case RETURN_AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
				returnExpression();
				}
				break;
			case CONTINUE:
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2729);
				continueExpression();
				}
				break;
			case BREAK:
			case BREAK_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2730);
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
		enterRule(_localctx, 238, RULE_triggerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			match(TRIGGER);
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
		enterRule(_localctx, 240, RULE_returnExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2742);
			_la = _input.LA(1);
			if ( !(_la==RETURN || _la==RETURN_AT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2743);
					match(NL);
					}
					} 
				}
				setState(2748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			}
			setState(2750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				{
				setState(2749);
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
		enterRule(_localctx, 242, RULE_continueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2752);
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
		enterRule(_localctx, 244, RULE_breakExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2754);
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
		enterRule(_localctx, 246, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2756);
			simpleIdentifier();
			setState(2757);
			match(AT);
			setState(2761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2758);
					match(NL);
					}
					} 
				}
				setState(2763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 248, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2764);
			match(AT);
			setState(2765);
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
		enterRule(_localctx, 250, RULE_literalConstant);
		try {
			setState(2779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2767);
				nullLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2768);
				boolLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2769);
				trileanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2770);
				integerLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2771);
				longLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2772);
				shortLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2773);
				byteLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2774);
				floatLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2775);
				doubleLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2776);
				complexLiteral();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2777);
				characterLiteral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2778);
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
		enterRule(_localctx, 252, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
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
		enterRule(_localctx, 254, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
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
		enterRule(_localctx, 256, RULE_trileanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (TRUE - 76)) | (1L << (FALSE - 76)) | (1L << (NONE - 76)))) != 0)) ) {
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
		enterRule(_localctx, 258, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
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
		enterRule(_localctx, 260, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
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
		enterRule(_localctx, 262, RULE_shortLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
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
		enterRule(_localctx, 264, RULE_byteLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
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
		enterRule(_localctx, 266, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
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
		enterRule(_localctx, 268, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
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
		enterRule(_localctx, 270, RULE_complexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
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
		enterRule(_localctx, 272, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
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
		enterRule(_localctx, 274, RULE_stringLiteral);
		try {
			setState(2805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2803);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2804);
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
		enterRule(_localctx, 276, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			match(QUOTE_OPEN);
			setState(2812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (LineStrRef - 168)) | (1L << (LineStrText - 168)) | (1L << (LineStrEscapedChar - 168)) | (1L << (LineStrExprStart - 168)))) != 0)) {
				{
				setState(2810);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(2808);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(2809);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2815);
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
		enterRule(_localctx, 278, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			match(TRIPLE_QUOTE_OPEN);
			setState(2824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (QUOTE_OPEN - 141)) | (1L << (MultiLineStrQuote - 141)) | (1L << (MultiLineStrRef - 141)) | (1L << (MultiLineStrText - 141)) | (1L << (MultiLineStrEscapedChar - 141)) | (1L << (MultiLineStrExprStart - 141)))) != 0)) {
				{
				setState(2822);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(2818);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(2819);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(2820);
					lineStringLiteral();
					}
					break;
				case MultiLineStrQuote:
					{
					setState(2821);
					match(MultiLineStrQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2827);
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
		enterRule(_localctx, 280, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
			_la = _input.LA(1);
			if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (LineStrRef - 168)) | (1L << (LineStrText - 168)) | (1L << (LineStrEscapedChar - 168)))) != 0)) ) {
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
		enterRule(_localctx, 282, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2831);
			match(LineStrExprStart);
			setState(2832);
			expression();
			setState(2833);
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
		enterRule(_localctx, 284, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2835);
			_la = _input.LA(1);
			if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (MultiLineStrRef - 174)) | (1L << (MultiLineStrText - 174)) | (1L << (MultiLineStrEscapedChar - 174)))) != 0)) ) {
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
		enterRule(_localctx, 286, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837);
			match(MultiLineStrExprStart);
			setState(2838);
			expression();
			setState(2839);
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
		enterRule(_localctx, 288, RULE_functionLiteral);
		try {
			setState(2843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2841);
				lambdaLiteral();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(2842);
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
		enterRule(_localctx, 290, RULE_lambdaLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
			match(LCURLY);
			setState(2849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2846);
					match(NL);
					}
					} 
				}
				setState(2851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
			}
			setState(2868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				{
				setState(2853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==HASH || _la==Identifier) {
					{
					setState(2852);
					lambdaParameters();
					}
				}

				setState(2858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2855);
					match(NL);
					}
					}
					setState(2860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2861);
				match(RARROW_THICK);
				setState(2865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2862);
						match(NL);
						}
						} 
					}
					setState(2867);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
				}
				}
				break;
			}
			setState(2870);
			statements();
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
			setState(2877);
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
		enterRule(_localctx, 292, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			lambdaParameter();
			setState(2896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2880);
						match(NL);
						}
						}
						setState(2885);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2886);
					match(COMMA);
					setState(2890);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2887);
						match(NL);
						}
						}
						setState(2892);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2893);
					lambdaParameter();
					}
					} 
				}
				setState(2898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 294, RULE_lambdaParameter);
		int _la;
		try {
			setState(2917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2899);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2900);
				multiVariableDeclaration();
				setState(2915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
				case 1:
					{
					setState(2904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2901);
						match(NL);
						}
						}
						setState(2906);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2907);
					match(COLON);
					setState(2911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2908);
						match(NL);
						}
						}
						setState(2913);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2914);
					type();
					}
					break;
				}
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

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AprlParser.FUNCTION, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(AprlParser.PERIOD, 0); }
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
		enterRule(_localctx, 296, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
			match(FUNCTION);
			setState(2935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
			case 1:
				{
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
				setState(2926);
				receiverType();
				setState(2930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2927);
					match(NL);
					}
					}
					setState(2932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2933);
				match(PERIOD);
				}
				break;
			}
			setState(2940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2937);
				match(NL);
				}
				}
				setState(2942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2943);
			functionValueParameters();
			setState(2958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				{
				setState(2947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2944);
					match(NL);
					}
					}
					setState(2949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2950);
				match(RARROW);
				setState(2954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2951);
					match(NL);
					}
					}
					setState(2956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2957);
				type();
				}
				break;
			}
			setState(2967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(2963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2960);
					match(NL);
					}
					}
					setState(2965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2966);
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
		enterRule(_localctx, 298, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2969);
				match(NL);
				}
				}
				setState(2974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2975);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ASSIGN - 86)) | (1L << (DEFINE - 86)) | (1L << (ADD_ASSIGN - 86)) | (1L << (SUB_ASSIGN - 86)) | (1L << (MUL_ASSIGN - 86)) | (1L << (DIV_ASSIGN - 86)) | (1L << (MOD_ASSIGN - 86)) | (1L << (EXP_ASSIGN - 86)) | (1L << (CONJ_ASSIGN - 86)) | (1L << (DISJ_ASSIGN - 86)) | (1L << (XOR_ASSIGN - 86)) | (1L << (ELVIS_ASSIGN - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2976);
				match(NL);
				}
				}
				setState(2981);
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
		public TerminalNode OR() { return getToken(AprlParser.OR, 0); }
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
		enterRule(_localctx, 300, RULE_disjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2982);
				match(NL);
				}
				}
				setState(2987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2988);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==DISJ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2989);
				match(NL);
				}
				}
				setState(2994);
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
		public TerminalNode AND() { return getToken(AprlParser.AND, 0); }
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
		enterRule(_localctx, 302, RULE_conjunctionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2995);
				match(NL);
				}
				}
				setState(3000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3001);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==CONJ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3002);
				match(NL);
				}
				}
				setState(3007);
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
		enterRule(_localctx, 304, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3008);
				match(NL);
				}
				}
				setState(3013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3014);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3015);
				match(NL);
				}
				}
				setState(3020);
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
		enterRule(_localctx, 306, RULE_identityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3021);
				match(NL);
				}
				}
				setState(3026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3027);
			_la = _input.LA(1);
			if ( !(_la==IDENTICAL || _la==NIDENTICAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3028);
				match(NL);
				}
				}
				setState(3033);
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
		enterRule(_localctx, 308, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3034);
				match(NL);
				}
				}
				setState(3039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3040);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LANGLE - 128)) | (1L << (NLANGLE - 128)) | (1L << (LEQ - 128)) | (1L << (NLEQ - 128)) | (1L << (RANGLE - 128)) | (1L << (NRANGLE - 128)) | (1L << (GEQ - 128)) | (1L << (NGEQ - 128)) | (1L << (SPACESHIP - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3041);
				match(NL);
				}
				}
				setState(3046);
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
		enterRule(_localctx, 310, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3047);
				match(NL);
				}
				}
				setState(3052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3053);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3054);
				match(NL);
				}
				}
				setState(3059);
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
		enterRule(_localctx, 312, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3060);
				match(NL);
				}
				}
				setState(3065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3066);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3067);
				match(NL);
				}
				}
				setState(3072);
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
		enterRule(_localctx, 314, RULE_elvisOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3073);
				match(NL);
				}
				}
				setState(3078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3079);
			match(ELVIS);
			setState(3083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3080);
				match(NL);
				}
				}
				setState(3085);
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
		public TerminalNode DOUBLE_PERIOD() { return getToken(AprlParser.DOUBLE_PERIOD, 0); }
		public TerminalNode TO() { return getToken(AprlParser.TO, 0); }
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
		enterRule(_localctx, 316, RULE_toOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3086);
				match(NL);
				}
				}
				setState(3091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3092);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOUBLE_PERIOD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3093);
				match(NL);
				}
				}
				setState(3098);
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

	public static class ByOperatorContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(AprlParser.BY, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(AprlParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> NL() { return getTokens(AprlParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AprlParser.NL, i);
		}
		public ByOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).enterByOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprlParserListener ) ((AprlParserListener)listener).exitByOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprlParserVisitor ) return ((AprlParserVisitor<? extends T>)visitor).visitByOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByOperatorContext byOperator() throws RecognitionException {
		ByOperatorContext _localctx = new ByOperatorContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_byOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3099);
				match(NL);
				}
				}
				setState(3104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3105);
			_la = _input.LA(1);
			if ( !(_la==BY || _la==DOUBLE_COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3106);
				match(NL);
				}
				}
				setState(3111);
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
		enterRule(_localctx, 320, RULE_xorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3112);
				match(NL);
				}
				}
				setState(3117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3118);
			match(XOR);
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 322, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3125);
				match(NL);
				}
				}
				setState(3130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3131);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3132);
				match(NL);
				}
				}
				setState(3137);
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
		enterRule(_localctx, 324, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3138);
				match(NL);
				}
				}
				setState(3143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3144);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3145);
				match(NL);
				}
				}
				setState(3150);
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
		enterRule(_localctx, 326, RULE_exponentialOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3151);
				match(NL);
				}
				}
				setState(3156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3157);
			match(EXP);
			setState(3161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3158);
				match(NL);
				}
				}
				setState(3163);
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
		enterRule(_localctx, 328, RULE_asOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3164);
				match(NL);
				}
				}
				setState(3169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3170);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==AS_QUEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3171);
				match(NL);
				}
				}
				setState(3176);
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
		enterRule(_localctx, 330, RULE_unaryPrefix);
		try {
			setState(3180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(3177);
				annotation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3178);
				labelDefinition();
				}
				break;
			case NOT:
			case ADD:
			case INCR:
			case SUB:
			case DECR:
			case EXCL:
			case DOUBLE_AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3179);
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
		public TerminalNode NOT() { return getToken(AprlParser.NOT, 0); }
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
		enterRule(_localctx, 332, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3182);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NOT - 62)) | (1L << (ADD - 62)) | (1L << (INCR - 62)) | (1L << (SUB - 62)) | (1L << (DECR - 62)) | (1L << (EXCL - 62)) | (1L << (DOUBLE_AT - 62)))) != 0)) ) {
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
		enterRule(_localctx, 334, RULE_unaryPostfix);
		try {
			setState(3189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3184);
				postfixUnaryOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3185);
				typeArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3186);
				callSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3187);
				indexingSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3188);
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
		enterRule(_localctx, 336, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3191);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (INCR - 90)) | (1L << (DECR - 90)) | (1L << (DOUBLE_EXCL - 90)))) != 0)) ) {
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
		enterRule(_localctx, 338, RULE_assignableExpression);
		try {
			setState(3198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3193);
				postfixUnaryExpression();
				setState(3194);
				assignableSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3196);
				simpleIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3197);
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
		enterRule(_localctx, 340, RULE_parenthesizedAssignableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3200);
			match(LPAREN);
			setState(3204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3201);
				match(NL);
				}
				}
				setState(3206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3207);
			assignableExpression();
			setState(3211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3208);
				match(NL);
				}
				}
				setState(3213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3214);
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
		enterRule(_localctx, 342, RULE_assignableSuffix);
		try {
			setState(3219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3216);
				typeArguments();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3217);
				indexingSuffix();
				}
				break;
			case NL:
			case PERIOD:
			case QUEST_PERIOD:
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(3218);
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
		public AnnotatedLambdaContext annotatedLambda() {
			return getRuleContext(AnnotatedLambdaContext.class,0);
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
		enterRule(_localctx, 344, RULE_callSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(3221);
				typeArguments();
				}
			}

			setState(3229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
			case 1:
				{
				setState(3225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(3224);
					valueArguments();
					}
				}

				setState(3227);
				annotatedLambda();
				}
				break;
			case 2:
				{
				setState(3228);
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
		enterRule(_localctx, 346, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(3231);
				annotations();
				}
			}

			setState(3235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(3234);
				labelDefinition();
				}
			}

			setState(3240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3237);
				match(NL);
				}
				}
				setState(3242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3243);
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
		enterRule(_localctx, 348, RULE_indexingSuffix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3245);
			match(LSQUARE);
			setState(3249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3246);
				match(NL);
				}
				}
				setState(3251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3252);
			expression();
			setState(3269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3253);
						match(NL);
						}
						}
						setState(3258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3259);
					match(COMMA);
					setState(3263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3260);
						match(NL);
						}
						}
						setState(3265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3266);
					expression();
					}
					} 
				}
				setState(3271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			}
			setState(3275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3272);
				match(NL);
				}
				}
				setState(3277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3278);
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
		enterRule(_localctx, 350, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3280);
			memberAccessOperator();
			setState(3283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(3281);
				simpleIdentifier();
				}
				break;
			case LPAREN:
				{
				setState(3282);
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
		enterRule(_localctx, 352, RULE_memberAccessOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3285);
				match(NL);
				}
				}
				setState(3290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3291);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (PERIOD - 109)) | (1L << (QUEST_PERIOD - 109)) | (1L << (DOUBLE_COLON - 109)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(3292);
				match(NL);
				}
				}
				setState(3297);
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
		enterRule(_localctx, 354, RULE_modifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(3298);
					annotations();
					setState(3302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3299);
							match(NL);
							}
							} 
						}
						setState(3304);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
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
				case DIRECT:
				case EXTERNAL:
				case SYNC:
				case PARAMS:
					{
					setState(3305);
					modifier();
					setState(3309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,485,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3306);
							match(NL);
							}
							} 
						}
						setState(3311);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,485,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << BOUNDED) | (1L << LOCAL) | (1L << PUBLIC) | (1L << SAMPLE) | (1L << COVER) | (1L << OPEN) | (1L << FINAL) | (1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC) | (1L << PARAMS))) != 0) || _la==HASH );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 356, RULE_modifier);
		try {
			setState(3320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case BOUNDED:
			case LOCAL:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3316);
				visibilityModifier();
				}
				break;
			case SAMPLE:
			case COVER:
			case OPEN:
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3317);
				inheritanceModifier();
				}
				break;
			case PARAMS:
				enterOuterAlt(_localctx, 3);
				{
				setState(3318);
				parameterModifier();
				}
				break;
			case DIRECT:
			case EXTERNAL:
			case SYNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(3319);
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
		enterRule(_localctx, 358, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3322);
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
		enterRule(_localctx, 360, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3324);
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
		enterRule(_localctx, 362, RULE_parameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3326);
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
		public TerminalNode DIRECT() { return getToken(AprlParser.DIRECT, 0); }
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
		enterRule(_localctx, 364, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIRECT) | (1L << EXTERNAL) | (1L << SYNC))) != 0)) ) {
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
		enterRule(_localctx, 366, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3330);
					annotation();
					setState(3334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,489,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3331);
							match(NL);
							}
							} 
						}
						setState(3336);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,489,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3339); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,490,_ctx);
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
		enterRule(_localctx, 368, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3341);
			match(HASH);
			setState(3363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(3342);
				unescapedAnnotation();
				}
				break;
			case LSQUARE:
				{
				setState(3343);
				match(LSQUARE);
				setState(3347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3344);
					match(NL);
					}
					}
					setState(3349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3350);
					unescapedAnnotation();
					}
					}
					setState(3353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier );
				setState(3358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3355);
					match(NL);
					}
					}
					setState(3360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3361);
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
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
		enterRule(_localctx, 370, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3365);
			identifier();
			setState(3367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(3366);
				typeArguments();
				}
			}

			setState(3370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,496,_ctx) ) {
			case 1:
				{
				setState(3369);
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
		enterRule(_localctx, 372, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3372);
			simpleIdentifier();
			setState(3389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,499,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3373);
						match(NL);
						}
						}
						setState(3378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3379);
					match(PERIOD);
					setState(3383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(3380);
						match(NL);
						}
						}
						setState(3385);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3386);
					simpleIdentifier();
					}
					} 
				}
				setState(3391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,499,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 374, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3392);
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
		enterRule(_localctx, 376, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(3412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,503,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3395); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3394);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3397); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,500,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(3399);
					match(NL);
					}
					}
					setState(3404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3405);
				match(SEMICOLON);
				setState(3409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,502,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3406);
						match(NL);
						}
						} 
					}
					setState(3411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,502,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b4\u0d59\4\2\t"+
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
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\3\2\7\2\u017e"+
		"\n\2\f\2\16\2\u0181\13\2\3\2\3\2\7\2\u0185\n\2\f\2\16\2\u0188\13\2\3\2"+
		"\3\2\6\2\u018c\n\2\r\2\16\2\u018d\3\2\5\2\u0191\n\2\7\2\u0193\n\2\f\2"+
		"\16\2\u0196\13\2\5\2\u0198\n\2\3\2\3\2\3\3\5\3\u019d\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\5\4\u01a4\n\4\3\5\7\5\u01a7\n\5\f\5\16\5\u01aa\13\5\3\6\3\6\3\6"+
		"\3\6\7\6\u01b0\n\6\f\6\16\6\u01b3\13\6\3\6\5\6\u01b6\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u01c0\n\7\f\7\16\7\u01c3\13\7\3\7\3\7\5\7\u01c7"+
		"\n\7\5\7\u01c9\n\7\5\7\u01cb\n\7\3\b\3\b\5\b\u01cf\n\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01e0\n\13"+
		"\3\f\5\f\u01e3\n\f\3\f\3\f\7\f\u01e7\n\f\f\f\16\f\u01ea\13\f\3\f\3\f\7"+
		"\f\u01ee\n\f\f\f\16\f\u01f1\13\f\3\f\5\f\u01f4\n\f\3\f\7\f\u01f7\n\f\f"+
		"\f\16\f\u01fa\13\f\3\f\5\f\u01fd\n\f\3\f\7\f\u0200\n\f\f\f\16\f\u0203"+
		"\13\f\3\f\3\f\7\f\u0207\n\f\f\f\16\f\u020a\13\f\3\f\5\f\u020d\n\f\3\f"+
		"\7\f\u0210\n\f\f\f\16\f\u0213\13\f\3\f\5\f\u0216\n\f\3\r\5\r\u0219\n\r"+
		"\3\r\3\r\7\r\u021d\n\r\f\r\16\r\u0220\13\r\3\r\3\r\7\r\u0224\n\r\f\r\16"+
		"\r\u0227\13\r\3\r\5\r\u022a\n\r\3\r\7\r\u022d\n\r\f\r\16\r\u0230\13\r"+
		"\3\r\3\r\7\r\u0234\n\r\f\r\16\r\u0237\13\r\3\r\5\r\u023a\n\r\3\r\7\r\u023d"+
		"\n\r\f\r\16\r\u0240\13\r\3\r\5\r\u0243\n\r\3\16\5\16\u0246\n\16\3\16\3"+
		"\16\7\16\u024a\n\16\f\16\16\16\u024d\13\16\3\16\3\16\7\16\u0251\n\16\f"+
		"\16\16\16\u0254\13\16\3\16\5\16\u0257\n\16\3\16\7\16\u025a\n\16\f\16\16"+
		"\16\u025d\13\16\3\16\5\16\u0260\n\16\3\17\5\17\u0263\n\17\3\17\3\17\7"+
		"\17\u0267\n\17\f\17\16\17\u026a\13\17\3\17\3\17\7\17\u026e\n\17\f\17\16"+
		"\17\u0271\13\17\3\17\5\17\u0274\n\17\3\17\7\17\u0277\n\17\f\17\16\17\u027a"+
		"\13\17\3\17\3\17\7\17\u027e\n\17\f\17\16\17\u0281\13\17\3\17\5\17\u0284"+
		"\n\17\3\20\5\20\u0287\n\20\3\20\3\20\7\20\u028b\n\20\f\20\16\20\u028e"+
		"\13\20\5\20\u0290\n\20\3\20\3\20\3\21\3\21\7\21\u0296\n\21\f\21\16\21"+
		"\u0299\13\21\3\21\3\21\7\21\u029d\n\21\f\21\16\21\u02a0\13\21\3\21\3\21"+
		"\7\21\u02a4\n\21\f\21\16\21\u02a7\13\21\3\21\7\21\u02aa\n\21\f\21\16\21"+
		"\u02ad\13\21\5\21\u02af\n\21\3\21\7\21\u02b2\n\21\f\21\16\21\u02b5\13"+
		"\21\3\21\3\21\3\22\5\22\u02ba\n\22\3\22\5\22\u02bd\n\22\3\22\7\22\u02c0"+
		"\n\22\f\22\16\22\u02c3\13\22\3\22\3\22\7\22\u02c7\n\22\f\22\16\22\u02ca"+
		"\13\22\3\22\3\22\7\22\u02ce\n\22\f\22\16\22\u02d1\13\22\3\22\3\22\7\22"+
		"\u02d5\n\22\f\22\16\22\u02d8\13\22\3\22\3\22\7\22\u02dc\n\22\f\22\16\22"+
		"\u02df\13\22\3\22\5\22\u02e2\n\22\3\23\3\23\7\23\u02e6\n\23\f\23\16\23"+
		"\u02e9\13\23\3\23\3\23\7\23\u02ed\n\23\f\23\16\23\u02f0\13\23\3\23\7\23"+
		"\u02f3\n\23\f\23\16\23\u02f6\13\23\3\24\5\24\u02f9\n\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u0300\n\25\3\26\3\26\7\26\u0304\n\26\f\26\16\26\u0307"+
		"\13\26\3\26\3\26\7\26\u030b\n\26\f\26\16\26\u030e\13\26\3\26\7\26\u0311"+
		"\n\26\f\26\16\26\u0314\13\26\3\27\5\27\u0317\n\27\3\27\3\27\5\27\u031b"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\7\31\u0322\n\31\f\31\16\31\u0325\13\31"+
		"\3\31\3\31\7\31\u0329\n\31\f\31\16\31\u032c\13\31\3\31\3\31\7\31\u0330"+
		"\n\31\f\31\16\31\u0333\13\31\3\31\7\31\u0336\n\31\f\31\16\31\u0339\13"+
		"\31\3\31\7\31\u033c\n\31\f\31\16\31\u033f\13\31\5\31\u0341\n\31\3\31\3"+
		"\31\3\32\5\32\u0346\n\32\3\32\3\32\7\32\u034a\n\32\f\32\16\32\u034d\13"+
		"\32\3\32\3\32\7\32\u0351\n\32\f\32\16\32\u0354\13\32\5\32\u0356\n\32\3"+
		"\32\5\32\u0359\n\32\3\32\7\32\u035c\n\32\f\32\16\32\u035f\13\32\3\32\3"+
		"\32\3\33\5\33\u0364\n\33\3\33\3\33\7\33\u0368\n\33\f\33\16\33\u036b\13"+
		"\33\3\33\3\33\7\33\u036f\n\33\f\33\16\33\u0372\13\33\3\33\3\33\7\33\u0376"+
		"\n\33\f\33\16\33\u0379\13\33\3\33\5\33\u037c\n\33\3\33\7\33\u037f\n\33"+
		"\f\33\16\33\u0382\13\33\3\33\5\33\u0385\n\33\3\34\3\34\7\34\u0389\n\34"+
		"\f\34\16\34\u038c\13\34\3\34\3\34\3\35\3\35\7\35\u0392\n\35\f\35\16\35"+
		"\u0395\13\35\3\35\7\35\u0398\n\35\f\35\16\35\u039b\13\35\3\35\7\35\u039e"+
		"\n\35\f\35\16\35\u03a1\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u03aa"+
		"\n\36\3\36\6\36\u03ad\n\36\r\36\16\36\u03ae\3\37\3\37\7\37\u03b3\n\37"+
		"\f\37\16\37\u03b6\13\37\3\37\3\37\3 \3 \7 \u03bc\n \f \16 \u03bf\13 \3"+
		" \3 \3!\5!\u03c4\n!\3!\3!\7!\u03c8\n!\f!\16!\u03cb\13!\3!\5!\u03ce\n!"+
		"\3\"\3\"\7\"\u03d2\n\"\f\"\16\"\u03d5\13\"\3\"\3\"\7\"\u03d9\n\"\f\"\16"+
		"\"\u03dc\13\"\3\"\3\"\7\"\u03e0\n\"\f\"\16\"\u03e3\13\"\3\"\7\"\u03e6"+
		"\n\"\f\"\16\"\u03e9\13\"\3\"\3\"\3#\5#\u03ee\n#\3#\3#\5#\u03f2\n#\3$\3"+
		"$\7$\u03f6\n$\f$\16$\u03f9\13$\6$\u03fb\n$\r$\16$\u03fc\3%\3%\7%\u0401"+
		"\n%\f%\16%\u0404\13%\3%\5%\u0407\n%\3&\3&\7&\u040b\n&\f&\16&\u040e\13"+
		"&\3&\3&\7&\u0412\n&\f&\16&\u0415\13&\3&\3&\7&\u0419\n&\f&\16&\u041c\13"+
		"&\3&\7&\u041f\n&\f&\16&\u0422\13&\3&\7&\u0425\n&\f&\16&\u0428\13&\3&\3"+
		"&\3\'\5\'\u042d\n\'\3\'\3\'\7\'\u0431\n\'\f\'\16\'\u0434\13\'\3\'\3\'"+
		"\7\'\u0438\n\'\f\'\16\'\u043b\13\'\3\'\3\'\7\'\u043f\n\'\f\'\16\'\u0442"+
		"\13\'\3\'\3\'\7\'\u0446\n\'\f\'\16\'\u0449\13\'\3\'\7\'\u044c\n\'\f\'"+
		"\16\'\u044f\13\'\5\'\u0451\n\'\3(\3(\7(\u0455\n(\f(\16(\u0458\13(\6(\u045a"+
		"\n(\r(\16(\u045b\3)\3)\3)\5)\u0461\n)\3)\7)\u0464\n)\f)\16)\u0467\13)"+
		"\3*\3*\3+\3+\3,\5,\u046e\n,\3,\3,\3,\3,\3,\5,\u0475\n,\3-\3-\7-\u0479"+
		"\n-\f-\16-\u047c\13-\3-\3-\7-\u0480\n-\f-\16-\u0483\13-\3-\3-\3.\5.\u0488"+
		"\n.\3.\3.\3.\5.\u048d\n.\3/\3/\7/\u0491\n/\f/\16/\u0494\13/\3/\3/\5/\u0498"+
		"\n/\3/\7/\u049b\n/\f/\16/\u049e\13/\3/\3/\7/\u04a2\n/\f/\16/\u04a5\13"+
		"/\3/\3/\5/\u04a9\n/\7/\u04ab\n/\f/\16/\u04ae\13/\5/\u04b0\n/\3/\7/\u04b3"+
		"\n/\f/\16/\u04b6\13/\3/\3/\3\60\3\60\7\60\u04bc\n\60\f\60\16\60\u04bf"+
		"\13\60\3\60\3\60\7\60\u04c3\n\60\f\60\16\60\u04c6\13\60\3\60\3\60\3\61"+
		"\3\61\7\61\u04cc\n\61\f\61\16\61\u04cf\13\61\3\61\3\61\7\61\u04d3\n\61"+
		"\f\61\16\61\u04d6\13\61\3\61\3\61\3\62\3\62\3\62\5\62\u04dd\n\62\3\62"+
		"\7\62\u04e0\n\62\f\62\16\62\u04e3\13\62\3\62\6\62\u04e6\n\62\r\62\16\62"+
		"\u04e7\3\63\3\63\7\63\u04ec\n\63\f\63\16\63\u04ef\13\63\3\63\3\63\7\63"+
		"\u04f3\n\63\f\63\16\63\u04f6\13\63\3\63\7\63\u04f9\n\63\f\63\16\63\u04fc"+
		"\13\63\3\64\3\64\7\64\u0500\n\64\f\64\16\64\u0503\13\64\3\64\5\64\u0506"+
		"\n\64\3\65\5\65\u0509\n\65\3\65\3\65\7\65\u050d\n\65\f\65\16\65\u0510"+
		"\13\65\3\65\3\65\7\65\u0514\n\65\f\65\16\65\u0517\13\65\3\65\3\65\7\65"+
		"\u051b\n\65\f\65\16\65\u051e\13\65\3\65\5\65\u0521\n\65\3\65\7\65\u0524"+
		"\n\65\f\65\16\65\u0527\13\65\3\65\5\65\u052a\n\65\3\66\3\66\7\66\u052e"+
		"\n\66\f\66\16\66\u0531\13\66\3\66\7\66\u0534\n\66\f\66\16\66\u0537\13"+
		"\66\3\66\7\66\u053a\n\66\f\66\16\66\u053d\13\66\3\66\3\66\3\67\3\67\3"+
		"\67\5\67\u0544\n\67\3\67\6\67\u0547\n\67\r\67\16\67\u0548\38\58\u054c"+
		"\n8\38\38\78\u0550\n8\f8\168\u0553\138\38\38\78\u0557\n8\f8\168\u055a"+
		"\138\38\58\u055d\n8\38\78\u0560\n8\f8\168\u0563\138\38\38\39\39\79\u0569"+
		"\n9\f9\169\u056c\139\39\59\u056f\n9\39\79\u0572\n9\f9\169\u0575\139\3"+
		"9\39\79\u0579\n9\f9\169\u057c\139\39\79\u057f\n9\f9\169\u0582\139\59\u0584"+
		"\n9\39\79\u0587\n9\f9\169\u058a\139\39\39\3:\3:\7:\u0590\n:\f:\16:\u0593"+
		"\13:\3:\3:\7:\u0597\n:\f:\16:\u059a\13:\3:\7:\u059d\n:\f:\16:\u05a0\13"+
		":\3;\5;\u05a3\n;\3;\3;\7;\u05a7\n;\f;\16;\u05aa\13;\3;\5;\u05ad\n;\3;"+
		"\7;\u05b0\n;\f;\16;\u05b3\13;\3;\5;\u05b6\n;\3<\5<\u05b9\n<\3<\3<\7<\u05bd"+
		"\n<\f<\16<\u05c0\13<\3<\3<\7<\u05c4\n<\f<\16<\u05c7\13<\3<\5<\u05ca\n"+
		"<\3=\3=\7=\u05ce\n=\f=\16=\u05d1\13=\3=\7=\u05d4\n=\f=\16=\u05d7\13=\3"+
		"=\7=\u05da\n=\f=\16=\u05dd\13=\3=\3=\3>\3>\3>\5>\u05e4\n>\3>\6>\u05e7"+
		"\n>\r>\16>\u05e8\3?\5?\u05ec\n?\3?\3?\7?\u05f0\n?\f?\16?\u05f3\13?\3?"+
		"\5?\u05f6\n?\3?\7?\u05f9\n?\f?\16?\u05fc\13?\3?\3?\5?\u0600\n?\3?\7?\u0603"+
		"\n?\f?\16?\u0606\13?\3?\3?\7?\u060a\n?\f?\16?\u060d\13?\3?\5?\u0610\n"+
		"?\3?\7?\u0613\n?\f?\16?\u0616\13?\3?\5?\u0619\n?\3@\5@\u061c\n@\3@\3@"+
		"\7@\u0620\n@\f@\16@\u0623\13@\3@\3@\7@\u0627\n@\f@\16@\u062a\13@\3@\5"+
		"@\u062d\n@\3A\3A\7A\u0631\nA\fA\16A\u0634\13A\3A\3A\7A\u0638\nA\fA\16"+
		"A\u063b\13A\3A\3A\7A\u063f\nA\fA\16A\u0642\13A\3A\7A\u0645\nA\fA\16A\u0648"+
		"\13A\3A\7A\u064b\nA\fA\16A\u064e\13A\3A\3A\3B\3B\7B\u0654\nB\fB\16B\u0657"+
		"\13B\3B\3B\7B\u065b\nB\fB\16B\u065e\13B\3B\5B\u0661\nB\3B\3B\7B\u0665"+
		"\nB\fB\16B\u0668\13B\3B\5B\u066b\nB\5B\u066d\nB\3B\7B\u0670\nB\fB\16B"+
		"\u0673\13B\3B\3B\3C\5C\u0678\nC\3C\3C\7C\u067c\nC\fC\16C\u067f\13C\3C"+
		"\3C\7C\u0683\nC\fC\16C\u0686\13C\3C\5C\u0689\nC\3C\7C\u068c\nC\fC\16C"+
		"\u068f\13C\3C\3C\7C\u0693\nC\fC\16C\u0696\13C\3C\5C\u0699\nC\3C\7C\u069c"+
		"\nC\fC\16C\u069f\13C\3C\5C\u06a2\nC\3D\5D\u06a5\nD\3D\3D\7D\u06a9\nD\f"+
		"D\16D\u06ac\13D\3D\3D\7D\u06b0\nD\fD\16D\u06b3\13D\3D\3D\7D\u06b7\nD\f"+
		"D\16D\u06ba\13D\3D\3D\5D\u06be\nD\3D\7D\u06c1\nD\fD\16D\u06c4\13D\3D\3"+
		"D\7D\u06c8\nD\fD\16D\u06cb\13D\3D\5D\u06ce\nD\3D\7D\u06d1\nD\fD\16D\u06d4"+
		"\13D\3D\5D\u06d7\nD\3E\5E\u06da\nE\3E\3E\7E\u06de\nE\fE\16E\u06e1\13E"+
		"\3E\3E\7E\u06e5\nE\fE\16E\u06e8\13E\3E\5E\u06eb\nE\3F\3F\6F\u06ef\nF\r"+
		"F\16F\u06f0\3G\3G\7G\u06f5\nG\fG\16G\u06f8\13G\3G\3G\7G\u06fc\nG\fG\16"+
		"G\u06ff\13G\3G\5G\u0702\nG\3H\5H\u0705\nH\3H\3H\7H\u0709\nH\fH\16H\u070c"+
		"\13H\3H\5H\u070f\nH\3H\7H\u0712\nH\fH\16H\u0715\13H\3H\3H\7H\u0719\nH"+
		"\fH\16H\u071c\13H\3H\3H\7H\u0720\nH\fH\16H\u0723\13H\3H\3H\7H\u0727\n"+
		"H\fH\16H\u072a\13H\3H\5H\u072d\nH\3H\7H\u0730\nH\fH\16H\u0733\13H\3H\5"+
		"H\u0736\nH\3I\3I\7I\u073a\nI\fI\16I\u073d\13I\3I\3I\7I\u0741\nI\fI\16"+
		"I\u0744\13I\3I\3I\7I\u0748\nI\fI\16I\u074b\13I\3I\7I\u074e\nI\fI\16I\u0751"+
		"\13I\5I\u0753\nI\3I\7I\u0756\nI\fI\16I\u0759\13I\3I\3I\3J\5J\u075e\nJ"+
		"\3J\3J\7J\u0762\nJ\fJ\16J\u0765\13J\3J\3J\7J\u0769\nJ\fJ\16J\u076c\13"+
		"J\3J\5J\u076f\nJ\3K\3K\7K\u0773\nK\fK\16K\u0776\13K\3K\3K\7K\u077a\nK"+
		"\fK\16K\u077d\13K\3K\3K\3L\3L\3L\7L\u0784\nL\fL\16L\u0787\13L\3L\5L\u078a"+
		"\nL\3M\3M\7M\u078e\nM\fM\16M\u0791\13M\3M\3M\7M\u0795\nM\fM\16M\u0798"+
		"\13M\3M\3M\3N\3N\6N\u079e\nN\rN\16N\u079f\3N\3N\7N\u07a4\nN\fN\16N\u07a7"+
		"\13N\5N\u07a9\nN\3N\7N\u07ac\nN\fN\16N\u07af\13N\3O\3O\7O\u07b3\nO\fO"+
		"\16O\u07b6\13O\3O\7O\u07b9\nO\fO\16O\u07bc\13O\3O\3O\3O\3O\5O\u07c2\n"+
		"O\3P\3P\3P\5P\u07c7\nP\3Q\3Q\7Q\u07cb\nQ\fQ\16Q\u07ce\13Q\3Q\3Q\7Q\u07d2"+
		"\nQ\fQ\16Q\u07d5\13Q\3Q\5Q\u07d8\nQ\3Q\3Q\5Q\u07dc\nQ\3Q\7Q\u07df\nQ\f"+
		"Q\16Q\u07e2\13Q\3Q\3Q\7Q\u07e6\nQ\fQ\16Q\u07e9\13Q\3Q\3Q\7Q\u07ed\nQ\f"+
		"Q\16Q\u07f0\13Q\3Q\3Q\7Q\u07f4\nQ\fQ\16Q\u07f7\13Q\3Q\3Q\3R\3R\7R\u07fd"+
		"\nR\fR\16R\u0800\13R\3R\3R\7R\u0804\nR\fR\16R\u0807\13R\3R\3R\7R\u080b"+
		"\nR\fR\16R\u080e\13R\3R\3R\7R\u0812\nR\fR\16R\u0815\13R\3R\3R\3S\3S\7"+
		"S\u081b\nS\fS\16S\u081e\13S\3S\3S\7S\u0822\nS\fS\16S\u0825\13S\3S\3S\7"+
		"S\u0829\nS\fS\16S\u082c\13S\3S\3S\7S\u0830\nS\fS\16S\u0833\13S\3S\3S\7"+
		"S\u0837\nS\fS\16S\u083a\13S\3S\3S\3T\3T\7T\u0840\nT\fT\16T\u0843\13T\3"+
		"T\3T\5T\u0847\nT\3T\3T\3U\3U\3V\3V\3V\3V\7V\u0851\nV\fV\16V\u0854\13V"+
		"\3W\3W\3W\3W\7W\u085a\nW\fW\16W\u085d\13W\3X\3X\3X\3X\7X\u0863\nX\fX\16"+
		"X\u0866\13X\3Y\3Y\3Y\3Y\7Y\u086c\nY\fY\16Y\u086f\13Y\3Z\3Z\3Z\3Z\7Z\u0875"+
		"\nZ\fZ\16Z\u0878\13Z\3[\3[\7[\u087c\n[\f[\16[\u087f\13[\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\7\\\u0888\n\\\f\\\16\\\u088b\13\\\3]\3]\3]\3]\7]\u0891"+
		"\n]\f]\16]\u0894\13]\3^\3^\3^\3^\7^\u089a\n^\f^\16^\u089d\13^\3_\3_\3"+
		"_\3_\3_\3_\5_\u08a5\n_\7_\u08a7\n_\f_\16_\u08aa\13_\3`\3`\3`\3`\7`\u08b0"+
		"\n`\f`\16`\u08b3\13`\3a\3a\3a\3a\7a\u08b9\na\fa\16a\u08bc\13a\3b\3b\3"+
		"b\3b\7b\u08c2\nb\fb\16b\u08c5\13b\3c\3c\3c\3c\7c\u08cb\nc\fc\16c\u08ce"+
		"\13c\3d\3d\3d\3d\7d\u08d4\nd\fd\16d\u08d7\13d\3e\7e\u08da\ne\fe\16e\u08dd"+
		"\13e\3e\3e\3f\3f\7f\u08e3\nf\ff\16f\u08e6\13f\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\5g\u08f6\ng\3h\3h\3h\3h\3i\3i\3i\3j\5j\u0900\nj\3j"+
		"\3j\7j\u0904\nj\fj\16j\u0907\13j\3j\3j\5j\u090b\nj\3k\3k\7k\u090f\nk\f"+
		"k\16k\u0912\13k\3k\3k\7k\u0916\nk\fk\16k\u0919\13k\3k\5k\u091c\nk\3k\7"+
		"k\u091f\nk\fk\16k\u0922\13k\3k\5k\u0925\nk\3l\3l\7l\u0929\nl\fl\16l\u092c"+
		"\13l\3l\5l\u092f\nl\3l\7l\u0932\nl\fl\16l\u0935\13l\3l\3l\7l\u0939\nl"+
		"\fl\16l\u093c\13l\3l\7l\u093f\nl\fl\16l\u0942\13l\3l\7l\u0945\nl\fl\16"+
		"l\u0948\13l\3l\3l\3m\3m\5m\u094e\nm\3n\3n\3n\7n\u0953\nn\fn\16n\u0956"+
		"\13n\3n\3n\7n\u095a\nn\fn\16n\u095d\13n\3n\3n\5n\u0961\nn\3n\5n\u0964"+
		"\nn\3o\3o\5o\u0968\no\3p\3p\7p\u096c\np\fp\16p\u096f\13p\3p\3p\7p\u0973"+
		"\np\fp\16p\u0976\13p\3p\3p\7p\u097a\np\fp\16p\u097d\13p\3p\3p\7p\u0981"+
		"\np\fp\16p\u0984\13p\3p\3p\7p\u0988\np\fp\16p\u098b\13p\3p\3p\7p\u098f"+
		"\np\fp\16p\u0992\13p\3p\3p\7p\u0996\np\fp\16p\u0999\13p\3p\3p\7p\u099d"+
		"\np\fp\16p\u09a0\13p\3p\3p\7p\u09a4\np\fp\16p\u09a7\13p\3p\3p\7p\u09ab"+
		"\np\fp\16p\u09ae\13p\3p\7p\u09b1\np\fp\16p\u09b4\13p\3p\3p\7p\u09b8\n"+
		"p\fp\16p\u09bb\13p\3p\5p\u09be\np\3q\3q\5q\u09c2\nq\3r\3r\7r\u09c6\nr"+
		"\fr\16r\u09c9\13r\3r\3r\7r\u09cd\nr\fr\16r\u09d0\13r\3r\3r\7r\u09d4\n"+
		"r\fr\16r\u09d7\13r\3r\3r\7r\u09db\nr\fr\16r\u09de\13r\3r\3r\7r\u09e2\n"+
		"r\fr\16r\u09e5\13r\3r\3r\7r\u09e9\nr\fr\16r\u09ec\13r\6r\u09ee\nr\rr\16"+
		"r\u09ef\3r\7r\u09f3\nr\fr\16r\u09f6\13r\3r\3r\3s\3s\7s\u09fc\ns\fs\16"+
		"s\u09ff\13s\3s\3s\7s\u0a03\ns\fs\16s\u0a06\13s\3s\3s\7s\u0a0a\ns\fs\16"+
		"s\u0a0d\13s\3s\7s\u0a10\ns\fs\16s\u0a13\13s\3s\7s\u0a16\ns\fs\16s\u0a19"+
		"\13s\3s\3s\7s\u0a1d\ns\fs\16s\u0a20\13s\3s\3s\5s\u0a24\ns\3s\3s\7s\u0a28"+
		"\ns\fs\16s\u0a2b\13s\3s\3s\7s\u0a2f\ns\fs\16s\u0a32\13s\3s\5s\u0a35\n"+
		"s\3t\3t\7t\u0a39\nt\ft\16t\u0a3c\13t\3t\3t\5t\u0a40\nt\3u\3u\7u\u0a44"+
		"\nu\fu\16u\u0a47\13u\3u\3u\7u\u0a4b\nu\fu\16u\u0a4e\13u\3u\7u\u0a51\n"+
		"u\fu\16u\u0a54\13u\3u\7u\u0a57\nu\fu\16u\u0a5a\13u\3u\5u\u0a5d\nu\3v\3"+
		"v\7v\u0a61\nv\fv\16v\u0a64\13v\3v\3v\7v\u0a68\nv\fv\16v\u0a6b\13v\3v\5"+
		"v\u0a6e\nv\3v\3v\7v\u0a72\nv\fv\16v\u0a75\13v\3v\3v\7v\u0a79\nv\fv\16"+
		"v\u0a7c\13v\3v\3v\7v\u0a80\nv\fv\16v\u0a83\13v\3v\3v\7v\u0a87\nv\fv\16"+
		"v\u0a8a\13v\3v\7v\u0a8d\nv\fv\16v\u0a90\13v\3v\7v\u0a93\nv\fv\16v\u0a96"+
		"\13v\3v\3v\7v\u0a9a\nv\fv\16v\u0a9d\13v\3v\3v\3w\3w\7w\u0aa3\nw\fw\16"+
		"w\u0aa6\13w\3w\3w\3x\3x\3x\3x\5x\u0aae\nx\3y\3y\7y\u0ab2\ny\fy\16y\u0ab5"+
		"\13y\3y\3y\3z\3z\7z\u0abb\nz\fz\16z\u0abe\13z\3z\5z\u0ac1\nz\3{\3{\3|"+
		"\3|\3}\3}\3}\7}\u0aca\n}\f}\16}\u0acd\13}\3~\3~\3~\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0ade\n\177"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u0af8\n\u008b"+
		"\3\u008c\3\u008c\3\u008c\7\u008c\u0afd\n\u008c\f\u008c\16\u008c\u0b00"+
		"\13\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u0b09\n\u008d\f\u008d\16\u008d\u0b0c\13\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\5\u0092\u0b1e\n\u0092\3\u0093\3\u0093"+
		"\7\u0093\u0b22\n\u0093\f\u0093\16\u0093\u0b25\13\u0093\3\u0093\5\u0093"+
		"\u0b28\n\u0093\3\u0093\7\u0093\u0b2b\n\u0093\f\u0093\16\u0093\u0b2e\13"+
		"\u0093\3\u0093\3\u0093\7\u0093\u0b32\n\u0093\f\u0093\16\u0093\u0b35\13"+
		"\u0093\5\u0093\u0b37\n\u0093\3\u0093\3\u0093\7\u0093\u0b3b\n\u0093\f\u0093"+
		"\16\u0093\u0b3e\13\u0093\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u0b44"+
		"\n\u0094\f\u0094\16\u0094\u0b47\13\u0094\3\u0094\3\u0094\7\u0094\u0b4b"+
		"\n\u0094\f\u0094\16\u0094\u0b4e\13\u0094\3\u0094\7\u0094\u0b51\n\u0094"+
		"\f\u0094\16\u0094\u0b54\13\u0094\3\u0095\3\u0095\3\u0095\7\u0095\u0b59"+
		"\n\u0095\f\u0095\16\u0095\u0b5c\13\u0095\3\u0095\3\u0095\7\u0095\u0b60"+
		"\n\u0095\f\u0095\16\u0095\u0b63\13\u0095\3\u0095\5\u0095\u0b66\n\u0095"+
		"\5\u0095\u0b68\n\u0095\3\u0096\3\u0096\7\u0096\u0b6c\n\u0096\f\u0096\16"+
		"\u0096\u0b6f\13\u0096\3\u0096\3\u0096\7\u0096\u0b73\n\u0096\f\u0096\16"+
		"\u0096\u0b76\13\u0096\3\u0096\3\u0096\5\u0096\u0b7a\n\u0096\3\u0096\7"+
		"\u0096\u0b7d\n\u0096\f\u0096\16\u0096\u0b80\13\u0096\3\u0096\3\u0096\7"+
		"\u0096\u0b84\n\u0096\f\u0096\16\u0096\u0b87\13\u0096\3\u0096\3\u0096\7"+
		"\u0096\u0b8b\n\u0096\f\u0096\16\u0096\u0b8e\13\u0096\3\u0096\5\u0096\u0b91"+
		"\n\u0096\3\u0096\7\u0096\u0b94\n\u0096\f\u0096\16\u0096\u0b97\13\u0096"+
		"\3\u0096\5\u0096\u0b9a\n\u0096\3\u0097\7\u0097\u0b9d\n\u0097\f\u0097\16"+
		"\u0097\u0ba0\13\u0097\3\u0097\3\u0097\7\u0097\u0ba4\n\u0097\f\u0097\16"+
		"\u0097\u0ba7\13\u0097\3\u0098\7\u0098\u0baa\n\u0098\f\u0098\16\u0098\u0bad"+
		"\13\u0098\3\u0098\3\u0098\7\u0098\u0bb1\n\u0098\f\u0098\16\u0098\u0bb4"+
		"\13\u0098\3\u0099\7\u0099\u0bb7\n\u0099\f\u0099\16\u0099\u0bba\13\u0099"+
		"\3\u0099\3\u0099\7\u0099\u0bbe\n\u0099\f\u0099\16\u0099\u0bc1\13\u0099"+
		"\3\u009a\7\u009a\u0bc4\n\u009a\f\u009a\16\u009a\u0bc7\13\u009a\3\u009a"+
		"\3\u009a\7\u009a\u0bcb\n\u009a\f\u009a\16\u009a\u0bce\13\u009a\3\u009b"+
		"\7\u009b\u0bd1\n\u009b\f\u009b\16\u009b\u0bd4\13\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0bd8\n\u009b\f\u009b\16\u009b\u0bdb\13\u009b\3\u009c\7\u009c"+
		"\u0bde\n\u009c\f\u009c\16\u009c\u0be1\13\u009c\3\u009c\3\u009c\7\u009c"+
		"\u0be5\n\u009c\f\u009c\16\u009c\u0be8\13\u009c\3\u009d\7\u009d\u0beb\n"+
		"\u009d\f\u009d\16\u009d\u0bee\13\u009d\3\u009d\3\u009d\7\u009d\u0bf2\n"+
		"\u009d\f\u009d\16\u009d\u0bf5\13\u009d\3\u009e\7\u009e\u0bf8\n\u009e\f"+
		"\u009e\16\u009e\u0bfb\13\u009e\3\u009e\3\u009e\7\u009e\u0bff\n\u009e\f"+
		"\u009e\16\u009e\u0c02\13\u009e\3\u009f\7\u009f\u0c05\n\u009f\f\u009f\16"+
		"\u009f\u0c08\13\u009f\3\u009f\3\u009f\7\u009f\u0c0c\n\u009f\f\u009f\16"+
		"\u009f\u0c0f\13\u009f\3\u00a0\7\u00a0\u0c12\n\u00a0\f\u00a0\16\u00a0\u0c15"+
		"\13\u00a0\3\u00a0\3\u00a0\7\u00a0\u0c19\n\u00a0\f\u00a0\16\u00a0\u0c1c"+
		"\13\u00a0\3\u00a1\7\u00a1\u0c1f\n\u00a1\f\u00a1\16\u00a1\u0c22\13\u00a1"+
		"\3\u00a1\3\u00a1\7\u00a1\u0c26\n\u00a1\f\u00a1\16\u00a1\u0c29\13\u00a1"+
		"\3\u00a2\7\u00a2\u0c2c\n\u00a2\f\u00a2\16\u00a2\u0c2f\13\u00a2\3\u00a2"+
		"\3\u00a2\7\u00a2\u0c33\n\u00a2\f\u00a2\16\u00a2\u0c36\13\u00a2\3\u00a3"+
		"\7\u00a3\u0c39\n\u00a3\f\u00a3\16\u00a3\u0c3c\13\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u0c40\n\u00a3\f\u00a3\16\u00a3\u0c43\13\u00a3\3\u00a4\7\u00a4"+
		"\u0c46\n\u00a4\f\u00a4\16\u00a4\u0c49\13\u00a4\3\u00a4\3\u00a4\7\u00a4"+
		"\u0c4d\n\u00a4\f\u00a4\16\u00a4\u0c50\13\u00a4\3\u00a5\7\u00a5\u0c53\n"+
		"\u00a5\f\u00a5\16\u00a5\u0c56\13\u00a5\3\u00a5\3\u00a5\7\u00a5\u0c5a\n"+
		"\u00a5\f\u00a5\16\u00a5\u0c5d\13\u00a5\3\u00a6\7\u00a6\u0c60\n\u00a6\f"+
		"\u00a6\16\u00a6\u0c63\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0c67\n\u00a6\f"+
		"\u00a6\16\u00a6\u0c6a\13\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0c6f\n"+
		"\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0c78\n\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0c81\n\u00ab\3\u00ac\3\u00ac\7\u00ac\u0c85\n\u00ac\f\u00ac\16"+
		"\u00ac\u0c88\13\u00ac\3\u00ac\3\u00ac\7\u00ac\u0c8c\n\u00ac\f\u00ac\16"+
		"\u00ac\u0c8f\13\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad"+
		"\u0c96\n\u00ad\3\u00ae\5\u00ae\u0c99\n\u00ae\3\u00ae\5\u00ae\u0c9c\n\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u0ca0\n\u00ae\3\u00af\5\u00af\u0ca3\n\u00af\3"+
		"\u00af\5\u00af\u0ca6\n\u00af\3\u00af\7\u00af\u0ca9\n\u00af\f\u00af\16"+
		"\u00af\u0cac\13\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\7\u00b0\u0cb2\n"+
		"\u00b0\f\u00b0\16\u00b0\u0cb5\13\u00b0\3\u00b0\3\u00b0\7\u00b0\u0cb9\n"+
		"\u00b0\f\u00b0\16\u00b0\u0cbc\13\u00b0\3\u00b0\3\u00b0\7\u00b0\u0cc0\n"+
		"\u00b0\f\u00b0\16\u00b0\u0cc3\13\u00b0\3\u00b0\7\u00b0\u0cc6\n\u00b0\f"+
		"\u00b0\16\u00b0\u0cc9\13\u00b0\3\u00b0\7\u00b0\u0ccc\n\u00b0\f\u00b0\16"+
		"\u00b0\u0ccf\13\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u0cd6\n\u00b1\3\u00b2\7\u00b2\u0cd9\n\u00b2\f\u00b2\16\u00b2\u0cdc\13"+
		"\u00b2\3\u00b2\3\u00b2\7\u00b2\u0ce0\n\u00b2\f\u00b2\16\u00b2\u0ce3\13"+
		"\u00b2\3\u00b3\3\u00b3\7\u00b3\u0ce7\n\u00b3\f\u00b3\16\u00b3\u0cea\13"+
		"\u00b3\3\u00b3\3\u00b3\7\u00b3\u0cee\n\u00b3\f\u00b3\16\u00b3\u0cf1\13"+
		"\u00b3\6\u00b3\u0cf3\n\u00b3\r\u00b3\16\u00b3\u0cf4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\5\u00b4\u0cfb\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3"+
		"\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\7\u00b9\u0d07\n\u00b9\f"+
		"\u00b9\16\u00b9\u0d0a\13\u00b9\6\u00b9\u0d0c\n\u00b9\r\u00b9\16\u00b9"+
		"\u0d0d\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u0d14\n\u00ba\f\u00ba\16"+
		"\u00ba\u0d17\13\u00ba\3\u00ba\6\u00ba\u0d1a\n\u00ba\r\u00ba\16\u00ba\u0d1b"+
		"\3\u00ba\7\u00ba\u0d1f\n\u00ba\f\u00ba\16\u00ba\u0d22\13\u00ba\3\u00ba"+
		"\3\u00ba\5\u00ba\u0d26\n\u00ba\3\u00bb\3\u00bb\5\u00bb\u0d2a\n\u00bb\3"+
		"\u00bb\5\u00bb\u0d2d\n\u00bb\3\u00bc\3\u00bc\7\u00bc\u0d31\n\u00bc\f\u00bc"+
		"\16\u00bc\u0d34\13\u00bc\3\u00bc\3\u00bc\7\u00bc\u0d38\n\u00bc\f\u00bc"+
		"\16\u00bc\u0d3b\13\u00bc\3\u00bc\7\u00bc\u0d3e\n\u00bc\f\u00bc\16\u00bc"+
		"\u0d41\13\u00bc\3\u00bd\3\u00bd\3\u00be\6\u00be\u0d46\n\u00be\r\u00be"+
		"\16\u00be\u0d47\3\u00be\7\u00be\u0d4b\n\u00be\f\u00be\16\u00be\u0d4e\13"+
		"\u00be\3\u00be\3\u00be\7\u00be\u0d52\n\u00be\f\u00be\16\u00be\u0d55\13"+
		"\u00be\5\u00be\u0d57\n\u00be\3\u00be\2\2\u00bf\2\4\6\b\n\f\16\20\22\24"+
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
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\2\"\3\2!\"\3\2\23\24\3\2\24"+
		"\25\3\2\37\"\3\2*,\3\2/\60\4\288;;\4\2::==\4\299<<\3\2NO\3\2NP\3\2\u00aa"+
		"\u00ac\3\2\u00b0\u00b2\r\2XY[[^^aacceeggiikkmm}}\4\2>>jj\4\2??hh\3\2~"+
		"\177\3\2\u0080\u0081\4\2\u0082\u0089\u008d\u008d\3\2EF\3\2CD\4\2GGqq\4"+
		"\2HHtt\4\2ZZ]]\5\2``bbdd\3\2AB\b\2@@ZZ\\]__vv{{\5\2\\\\__ww\4\2optt\3"+
		"\2\31\34\3\2#&\3\2\')\2\u0ecc\2\u017f\3\2\2\2\4\u019c\3\2\2\2\6\u01a0"+
		"\3\2\2\2\b\u01a8\3\2\2\2\n\u01ab\3\2\2\2\f\u01ca\3\2\2\2\16\u01cc\3\2"+
		"\2\2\20\u01d0\3\2\2\2\22\u01d3\3\2\2\2\24\u01df\3\2\2\2\26\u01e2\3\2\2"+
		"\2\30\u0218\3\2\2\2\32\u0245\3\2\2\2\34\u0262\3\2\2\2\36\u028f\3\2\2\2"+
		" \u0293\3\2\2\2\"\u02b9\3\2\2\2$\u02e3\3\2\2\2&\u02f8\3\2\2\2(\u02ff\3"+
		"\2\2\2*\u0301\3\2\2\2,\u0316\3\2\2\2.\u031c\3\2\2\2\60\u031f\3\2\2\2\62"+
		"\u0345\3\2\2\2\64\u0363\3\2\2\2\66\u0386\3\2\2\28\u038f\3\2\2\2:\u03a9"+
		"\3\2\2\2<\u03b0\3\2\2\2>\u03b9\3\2\2\2@\u03c3\3\2\2\2B\u03cf\3\2\2\2D"+
		"\u03f1\3\2\2\2F\u03fa\3\2\2\2H\u0406\3\2\2\2J\u0408\3\2\2\2L\u042c\3\2"+
		"\2\2N\u0459\3\2\2\2P\u0460\3\2\2\2R\u0468\3\2\2\2T\u046a\3\2\2\2V\u046d"+
		"\3\2\2\2X\u0476\3\2\2\2Z\u0487\3\2\2\2\\\u048e\3\2\2\2^\u04b9\3\2\2\2"+
		"`\u04c9\3\2\2\2b\u04dc\3\2\2\2d\u04e9\3\2\2\2f\u04fd\3\2\2\2h\u0508\3"+
		"\2\2\2j\u052b\3\2\2\2l\u0543\3\2\2\2n\u054b\3\2\2\2p\u0566\3\2\2\2r\u058d"+
		"\3\2\2\2t\u05a2\3\2\2\2v\u05b8\3\2\2\2x\u05cb\3\2\2\2z\u05e3\3\2\2\2|"+
		"\u05eb\3\2\2\2~\u061b\3\2\2\2\u0080\u062e\3\2\2\2\u0082\u0651\3\2\2\2"+
		"\u0084\u0677\3\2\2\2\u0086\u06a4\3\2\2\2\u0088\u06d9\3\2\2\2\u008a\u06ee"+
		"\3\2\2\2\u008c\u06f2\3\2\2\2\u008e\u0704\3\2\2\2\u0090\u0737\3\2\2\2\u0092"+
		"\u075d\3\2\2\2\u0094\u0770\3\2\2\2\u0096\u0789\3\2\2\2\u0098\u078b\3\2"+
		"\2\2\u009a\u07a8\3\2\2\2\u009c\u07b4\3\2\2\2\u009e\u07c6\3\2\2\2\u00a0"+
		"\u07c8\3\2\2\2\u00a2\u07fa\3\2\2\2\u00a4\u0818\3\2\2\2\u00a6\u0846\3\2"+
		"\2\2\u00a8\u084a\3\2\2\2\u00aa\u084c\3\2\2\2\u00ac\u0855\3\2\2\2\u00ae"+
		"\u085e\3\2\2\2\u00b0\u0867\3\2\2\2\u00b2\u0870\3\2\2\2\u00b4\u0879\3\2"+
		"\2\2\u00b6\u0880\3\2\2\2\u00b8\u088c\3\2\2\2\u00ba\u0895\3\2\2\2\u00bc"+
		"\u089e\3\2\2\2\u00be\u08ab\3\2\2\2\u00c0\u08b4\3\2\2\2\u00c2\u08bd\3\2"+
		"\2\2\u00c4\u08c6\3\2\2\2\u00c6\u08cf\3\2\2\2\u00c8\u08db\3\2\2\2\u00ca"+
		"\u08e0\3\2\2\2\u00cc\u08f5\3\2\2\2\u00ce\u08f7\3\2\2\2\u00d0\u08fb\3\2"+
		"\2\2\u00d2\u08ff\3\2\2\2\u00d4\u090c\3\2\2\2\u00d6\u0926\3\2\2\2\u00d8"+
		"\u094b\3\2\2\2\u00da\u094f\3\2\2\2\u00dc\u0967\3\2\2\2\u00de\u0969\3\2"+
		"\2\2\u00e0\u09c1\3\2\2\2\u00e2\u09c3\3\2\2\2\u00e4\u0a34\3\2\2\2\u00e6"+
		"\u0a36\3\2\2\2\u00e8\u0a41\3\2\2\2\u00ea\u0a5e\3\2\2\2\u00ec\u0aa0\3\2"+
		"\2\2\u00ee\u0aad\3\2\2\2\u00f0\u0aaf\3\2\2\2\u00f2\u0ab8\3\2\2\2\u00f4"+
		"\u0ac2\3\2\2\2\u00f6\u0ac4\3\2\2\2\u00f8\u0ac6\3\2\2\2\u00fa\u0ace\3\2"+
		"\2\2\u00fc\u0add\3\2\2\2\u00fe\u0adf\3\2\2\2\u0100\u0ae1\3\2\2\2\u0102"+
		"\u0ae3\3\2\2\2\u0104\u0ae5\3\2\2\2\u0106\u0ae7\3\2\2\2\u0108\u0ae9\3\2"+
		"\2\2\u010a\u0aeb\3\2\2\2\u010c\u0aed\3\2\2\2\u010e\u0aef\3\2\2\2\u0110"+
		"\u0af1\3\2\2\2\u0112\u0af3\3\2\2\2\u0114\u0af7\3\2\2\2\u0116\u0af9\3\2"+
		"\2\2\u0118\u0b03\3\2\2\2\u011a\u0b0f\3\2\2\2\u011c\u0b11\3\2\2\2\u011e"+
		"\u0b15\3\2\2\2\u0120\u0b17\3\2\2\2\u0122\u0b1d\3\2\2\2\u0124\u0b1f\3\2"+
		"\2\2\u0126\u0b41\3\2\2\2\u0128\u0b67\3\2\2\2\u012a\u0b69\3\2\2\2\u012c"+
		"\u0b9e\3\2\2\2\u012e\u0bab\3\2\2\2\u0130\u0bb8\3\2\2\2\u0132\u0bc5\3\2"+
		"\2\2\u0134\u0bd2\3\2\2\2\u0136\u0bdf\3\2\2\2\u0138\u0bec\3\2\2\2\u013a"+
		"\u0bf9\3\2\2\2\u013c\u0c06\3\2\2\2\u013e\u0c13\3\2\2\2\u0140\u0c20\3\2"+
		"\2\2\u0142\u0c2d\3\2\2\2\u0144\u0c3a\3\2\2\2\u0146\u0c47\3\2\2\2\u0148"+
		"\u0c54\3\2\2\2\u014a\u0c61\3\2\2\2\u014c\u0c6e\3\2\2\2\u014e\u0c70\3\2"+
		"\2\2\u0150\u0c77\3\2\2\2\u0152\u0c79\3\2\2\2\u0154\u0c80\3\2\2\2\u0156"+
		"\u0c82\3\2\2\2\u0158\u0c95\3\2\2\2\u015a\u0c98\3\2\2\2\u015c\u0ca2\3\2"+
		"\2\2\u015e\u0caf\3\2\2\2\u0160\u0cd2\3\2\2\2\u0162\u0cda\3\2\2\2\u0164"+
		"\u0cf2\3\2\2\2\u0166\u0cfa\3\2\2\2\u0168\u0cfc\3\2\2\2\u016a\u0cfe\3\2"+
		"\2\2\u016c\u0d00\3\2\2\2\u016e\u0d02\3\2\2\2\u0170\u0d0b\3\2\2\2\u0172"+
		"\u0d0f\3\2\2\2\u0174\u0d27\3\2\2\2\u0176\u0d2e\3\2\2\2\u0178\u0d42\3\2"+
		"\2\2\u017a\u0d56\3\2\2\2\u017c\u017e\7\7\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0182\u0186\5\4\3\2\u0183\u0185\7\7\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0197\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u0194\5\24\13\2\u018a"+
		"\u018c\5\u017a\u00be\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0191\5\24\13\2"+
		"\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u018b"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7\2\2\3\u019a\3\3\2\2\2\u019b\u019d"+
		"\5\6\4\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\5\b\5\2\u019f\5\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1\u01a3\5\u0176"+
		"\u00bc\2\u01a2\u01a4\5\u017a\u00be\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\7\3\2\2\2\u01a5\u01a7\5\n\6\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\t\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7\t\2\2\u01ac\u01b1\5\f\7\2\u01ad\u01ae\7n"+
		"\2\2\u01ae\u01b0\5\f\7\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b4\u01b6\5\u017a\u00be\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2"+
		"\2\u01b6\13\3\2\2\2\u01b7\u01cb\5\20\t\2\u01b8\u01c8\5\u0176\u00bc\2\u01b9"+
		"\u01c6\7o\2\2\u01ba\u01c7\7`\2\2\u01bb\u01bc\7T\2\2\u01bc\u01c1\5\16\b"+
		"\2\u01bd\u01be\7n\2\2\u01be\u01c0\5\16\b\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c5\7U\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01ba\3\2"+
		"\2\2\u01c6\u01bb\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01b9\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01b7\3\2\2\2\u01ca\u01b8\3\2"+
		"\2\2\u01cb\r\3\2\2\2\u01cc\u01ce\5\u0178\u00bd\2\u01cd\u01cf\5\22\n\2"+
		"\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\17\3\2\2\2\u01d0\u01d1"+
		"\5\u0176\u00bc\2\u01d1\u01d2\5\22\n\2\u01d2\21\3\2\2\2\u01d3\u01d4\7\n"+
		"\2\2\u01d4\u01d5\5\u0178\u00bd\2\u01d5\23\3\2\2\2\u01d6\u01e0\5\26\f\2"+
		"\u01d7\u01e0\5\30\r\2\u01d8\u01e0\5\32\16\2\u01d9\u01e0\5\34\17\2\u01da"+
		"\u01e0\5h\65\2\u01db\u01e0\5n8\2\u01dc\u01e0\5v<\2\u01dd\u01e0\5\u008e"+
		"H\2\u01de\u01e0\5|?\2\u01df\u01d6\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01d8"+
		"\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2\2\u01df"+
		"\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\25\3\2\2"+
		"\2\u01e1\u01e3\5\u0164\u00b3\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2"+
		"\u01e3\u01e4\3\2\2\2\u01e4\u01e8\7\13\2\2\u01e5\u01e7\7\7\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01f3\5\u0178\u00bd\2\u01ec\u01ee"+
		"\7\7\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\5J"+
		"&\2\u01f3\u01ef\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fc\3\2\2\2\u01f5"+
		"\u01f7\7\7\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fd\5\36\20\2\u01fc\u01f8\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u020c\3"+
		"\2\2\2\u01fe\u0200\7\7\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0208\7\u008a\2\2\u0205\u0207\7\7\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020b\u020d\5$\23\2\u020c\u0201\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u0215\3\2\2\2\u020e\u0210\7\7\2\2\u020f\u020e\3\2"+
		"\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\58\35\2\u0215\u0211\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\27\3\2\2\2\u0217\u0219\5\u0164\u00b3\2"+
		"\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021e"+
		"\7\f\2\2\u021b\u021d\7\7\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0229\5\u0178\u00bd\2\u0222\u0224\7\7\2\2\u0223\u0222\3\2\2"+
		"\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022a\5J&\2\u0229\u0225\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u0239\3\2\2\2\u022b\u022d\7\7\2\2\u022c\u022b\3\2"+
		"\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0235\7\u008a\2\2\u0232\u0234"+
		"\7\7\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\5*"+
		"\26\2\u0239\u022e\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0242\3\2\2\2\u023b"+
		"\u023d\7\7\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0243\58\35\2\u0242\u023e\3\2\2\2\u0242\u0243\3\2\2\2\u0243\31\3\2\2"+
		"\2\u0244\u0246\5\u0164\u00b3\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2"+
		"\u0246\u0247\3\2\2\2\u0247\u024b\7\21\2\2\u0248\u024a\7\7\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0256\5\u0178\u00bd\2\u024f\u0251"+
		"\7\7\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\5\36"+
		"\20\2\u0256\u0252\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025f\3\2\2\2\u0258"+
		"\u025a\7\7\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u0260\58\35\2\u025f\u025b\3\2\2\2\u025f\u0260\3\2\2\2\u0260\33\3\2\2"+
		"\2\u0261\u0263\5\u0164\u00b3\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2"+
		"\u0263\u0264\3\2\2\2\u0264\u0268\7\16\2\2\u0265\u0267\7\7\2\2\u0266\u0265"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u0273\5\u0178\u00bd\2\u026c\u026e"+
		"\7\7\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0274\5J"+
		"&\2\u0273\u026f\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0278\3\2\2\2\u0275"+
		"\u0277\7\7\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u0283\5\36\20\2\u027c\u027e\7\7\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3"+
		"\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0284\58\35\2\u0283\u027f\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\35\3\2\2\2\u0285\u0287\5\u0164\u00b3\2\u0286\u0285\3\2\2\2"+
		"\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028c\7\27\2\2\u0289\u028b"+
		"\7\7\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0286\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\5 \21\2\u0292"+
		"\37\3\2\2\2\u0293\u0297\7R\2\2\u0294\u0296\7\7\2\2\u0295\u0294\3\2\2\2"+
		"\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02ae"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u02ab\5\"\22\2\u029b\u029d\7\7\2\2"+
		"\u029c\u029b\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a5\7n\2\2\u02a2"+
		"\u02a4\7\7\2\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02aa\5\"\22\2\u02a9\u029e\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3"+
		"\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u029a\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02b2\7\7"+
		"\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7S"+
		"\2\2\u02b7!\3\2\2\2\u02b8\u02ba\5\u0164\u00b3\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02bd\t\2\2\2\u02bc\u02bb\3\2"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c1\3\2\2\2\u02be\u02c0\7\7\2\2\u02bf"+
		"\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c8\5\u0178\u00bd"+
		"\2\u02c5\u02c7\7\7\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02cf\7s\2\2\u02cc\u02ce\7\7\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2"+
		"\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02e1\5V,\2\u02d3\u02d5\7\7\2\2\u02d4\u02d3\3\2\2"+
		"\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02dd\7X\2\2\u02da\u02dc\7\7\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\5\u00a8U\2\u02e1"+
		"\u02d6\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2#\3\2\2\2\u02e3\u02f4\5&\24\2"+
		"\u02e4\u02e6\7\7\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02ee\7n\2\2\u02eb\u02ed\7\7\2\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f1\u02f3\5&\24\2\u02f2\u02e7\3\2\2\2\u02f3\u02f6\3\2"+
		"\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5%\3\2\2\2\u02f6\u02f4"+
		"\3\2\2\2\u02f7\u02f9\5\u0170\u00b9\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3"+
		"\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\5(\25\2\u02fb\'\3\2\2\2\u02fc\u0300"+
		"\5.\30\2\u02fd\u0300\5d\63\2\u02fe\u0300\5X-\2\u02ff\u02fc\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300)\3\2\2\2\u0301\u0312\5,\27\2"+
		"\u0302\u0304\7\7\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u030c\7n\2\2\u0309\u030b\7\7\2\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0311\5,\27\2\u0310\u0305\3\2\2\2\u0311\u0314\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313+\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0315\u0317\5\u0170\u00b9\2\u0316\u0315\3\2\2\2\u0316\u0317\3"+
		"\2\2\2\u0317\u031a\3\2\2\2\u0318\u031b\5d\63\2\u0319\u031b\5X-\2\u031a"+
		"\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031b-\3\2\2\2\u031c\u031d\5d\63\2"+
		"\u031d\u031e\5\60\31\2\u031e/\3\2\2\2\u031f\u0323\7R\2\2\u0320\u0322\7"+
		"\7\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0340\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0337\5\62"+
		"\32\2\u0327\u0329\7\7\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d\u0331\7n\2\2\u032e\u0330\7\7\2\2\u032f\u032e\3\2\2\2\u0330"+
		"\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2"+
		"\2\2\u0333\u0331\3\2\2\2\u0334\u0336\5\62\32\2\u0335\u032a\3\2\2\2\u0336"+
		"\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033d\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u033a\u033c\7\7\2\2\u033b\u033a\3\2\2\2\u033c"+
		"\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u0340\u0326\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\7S\2\2\u0343\61\3\2\2\2\u0344\u0346\5\u0170"+
		"\u00b9\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0355\3\2\2\2\u0347"+
		"\u034b\5\u0178\u00bd\2\u0348\u034a\7\7\2\2\u0349\u0348\3\2\2\2\u034a\u034d"+
		"\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034e\u0352\7X\2\2\u034f\u0351\7\7\2\2\u0350\u034f\3\2"+
		"\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0347\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u0358\3\2\2\2\u0357\u0359\7r\2\2\u0358\u0357\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035d\3\2\2\2\u035a\u035c\7\7\2\2\u035b\u035a\3\2"+
		"\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361\5\u00a8U\2\u0361\63\3\2"+
		"\2\2\u0362\u0364\5\u0164\u00b3\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u0369\7\27\2\2\u0366\u0368\7\7\2\2\u0367"+
		"\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u037b\5\u0090I\2\u036d"+
		"\u036f\7\7\2\2\u036e\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0377\7s\2\2\u0374\u0376\7\7\2\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2"+
		"\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379"+
		"\u0377\3\2\2\2\u037a\u037c\5\66\34\2\u037b\u0370\3\2\2\2\u037b\u037c\3"+
		"\2\2\2\u037c\u0380\3\2\2\2\u037d\u037f\7\7\2\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0384\3\2"+
		"\2\2\u0382\u0380\3\2\2\2\u0383\u0385\5\u0098M\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\65\3\2\2\2\u0386\u038a\t\3\2\2\u0387\u0389\7\7\2"+
		"\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038e\5\60\31\2"+
		"\u038e\67\3\2\2\2\u038f\u0393\7V\2\2\u0390\u0392\7\7\2\2\u0391\u0390\3"+
		"\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0399\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0398\5:\36\2\u0397\u0396\3\2"+
		"\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039f\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039e\7\7\2\2\u039d\u039c\3\2"+
		"\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7W\2\2\u03a39\3\2\2\2\u03a4"+
		"\u03aa\5\24\13\2\u03a5\u03aa\5\64\33\2\u03a6\u03aa\5<\37\2\u03a7\u03aa"+
		"\5> \2\u03a8\u03aa\5@!\2\u03a9\u03a4\3\2\2\2\u03a9\u03a5\3\2\2\2\u03a9"+
		"\u03a6\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ac\3\2"+
		"\2\2\u03ab\u03ad\5\u017a\u00be\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae\3\2\2"+
		"\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af;\3\2\2\2\u03b0\u03b4"+
		"\7\30\2\2\u03b1\u03b3\7\7\2\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2"+
		"\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b7\u03b8\5\u0098M\2\u03b8=\3\2\2\2\u03b9\u03bd\7\27\2\2\u03ba"+
		"\u03bc\7\7\2\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0"+
		"\u03c1\5\u0098M\2\u03c1?\3\2\2\2\u03c2\u03c4\5\u0164\u00b3\2\u03c3\u03c2"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03cd\7\22\2\2"+
		"\u03c6\u03c8\7\7\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc"+
		"\u03ce\58\35\2\u03cd\u03c9\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ceA\3\2\2\2"+
		"\u03cf\u03d3\7\u0082\2\2\u03d0\u03d2\7\7\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2"+
		"\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03e1\5D#\2\u03d7\u03d9\7\7\2\2\u03d8\u03d7"+
		"\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7n\2\2\u03de\u03e0\5D#"+
		"\2\u03df\u03da\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2"+
		"\3\2\2\2\u03e2\u03e7\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e6\7\7\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\7\u0086\2\2\u03eb"+
		"C\3\2\2\2\u03ec\u03ee\5F$\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f2\5V,\2\u03f0\u03f2\7x\2\2\u03f1\u03ed\3\2\2"+
		"\2\u03f1\u03f0\3\2\2\2\u03f2E\3\2\2\2\u03f3\u03f7\5H%\2\u03f4\u03f6\7"+
		"\7\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03f3\3\2"+
		"\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"G\3\2\2\2\u03fe\u0402\5T+\2\u03ff\u0401\7\7\2\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0407\3\2"+
		"\2\2\u0404\u0402\3\2\2\2\u0405\u0407\5\u0172\u00ba\2\u0406\u03fe\3\2\2"+
		"\2\u0406\u0405\3\2\2\2\u0407I\3\2\2\2\u0408\u040c\7\u0082\2\2\u0409\u040b"+
		"\7\7\2\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0420\5L"+
		"\'\2\u0410\u0412\7\7\2\2\u0411\u0410\3\2\2\2\u0412\u0415\3\2\2\2\u0413"+
		"\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0413\3\2"+
		"\2\2\u0416\u041a\7n\2\2\u0417\u0419\7\7\2\2\u0418\u0417\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2"+
		"\2\2\u041c\u041a\3\2\2\2\u041d\u041f\5L\'\2\u041e\u0413\3\2\2\2\u041f"+
		"\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0426\3\2"+
		"\2\2\u0422\u0420\3\2\2\2\u0423\u0425\7\7\2\2\u0424\u0423\3\2\2\2\u0425"+
		"\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429\u042a\7\u0086\2\2\u042aK\3\2\2\2\u042b"+
		"\u042d\5N(\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2\2"+
		"\2\u042e\u0450\5\u0178\u00bd\2\u042f\u0431\7\7\2\2\u0430\u042f\3\2\2\2"+
		"\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435"+
		"\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0439\7s\2\2\u0436\u0438\7\7\2\2\u0437"+
		"\u0436\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2"+
		"\2\2\u043a\u043c\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u044d\5V,\2\u043d\u043f"+
		"\7\7\2\2\u043e\u043d\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440"+
		"\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0447\7h"+
		"\2\2\u0444\u0446\7\7\2\2\u0445\u0444\3\2\2\2\u0446\u0449\3\2\2\2\u0447"+
		"\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u0447\3\2"+
		"\2\2\u044a\u044c\5V,\2\u044b\u0440\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u0450"+
		"\u0432\3\2\2\2\u0450\u0451\3\2\2\2\u0451M\3\2\2\2\u0452\u0456\5P)\2\u0453"+
		"\u0455\7\7\2\2\u0454\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2"+
		"\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0459"+
		"\u0452\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045cO\3\2\2\2\u045d\u0461\5R*\2\u045e\u0461\5T+\2\u045f\u0461\5"+
		"\u0172\u00ba\2\u0460\u045d\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u045f\3\2"+
		"\2\2\u0461\u0465\3\2\2\2\u0462\u0464\7\7\2\2\u0463\u0462\3\2\2\2\u0464"+
		"\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466Q\3\2\2\2"+
		"\u0467\u0465\3\2\2\2\u0468\u0469\7\26\2\2\u0469S\3\2\2\2\u046a\u046b\t"+
		"\4\2\2\u046bU\3\2\2\2\u046c\u046e\5\u0170\u00b9\2\u046d\u046c\3\2\2\2"+
		"\u046d\u046e\3\2\2\2\u046e\u0474\3\2\2\2\u046f\u0475\5X-\2\u0470\u0475"+
		"\5^\60\2\u0471\u0475\5`\61\2\u0472\u0475\5b\62\2\u0473\u0475\5d\63\2\u0474"+
		"\u046f\3\2\2\2\u0474\u0470\3\2\2\2\u0474\u0471\3\2\2\2\u0474\u0472\3\2"+
		"\2\2\u0474\u0473\3\2\2\2\u0475W\3\2\2\2\u0476\u047a\5\\/\2\u0477\u0479"+
		"\7\7\2\2\u0478\u0477\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u0481\7\u008c"+
		"\2\2\u047e\u0480\7\7\2\2\u047f\u047e\3\2\2\2\u0480\u0483\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0481\3\2"+
		"\2\2\u0484\u0485\5V,\2\u0485Y\3\2\2\2\u0486\u0488\5\u0170\u00b9\2\u0487"+
		"\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048c\3\2\2\2\u0489\u048d\5^"+
		"\60\2\u048a\u048d\5b\62\2\u048b\u048d\5d\63\2\u048c\u0489\3\2\2\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048b\3\2\2\2\u048d[\3\2\2\2\u048e\u0492\7R\2\2\u048f"+
		"\u0491\7\7\2\2\u0490\u048f\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2"+
		"\2\2\u0492\u0493\3\2\2\2\u0493\u04af\3\2\2\2\u0494\u0492\3\2\2\2\u0495"+
		"\u0498\5\u0094K\2\u0496\u0498\5V,\2\u0497\u0495\3\2\2\2\u0497\u0496\3"+
		"\2\2\2\u0498\u04ac\3\2\2\2\u0499\u049b\7\7\2\2\u049a\u0499\3\2\2\2\u049b"+
		"\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049f\3\2"+
		"\2\2\u049e\u049c\3\2\2\2\u049f\u04a3\7n\2\2\u04a0\u04a2\7\7\2\2\u04a1"+
		"\u04a0\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2"+
		"\2\2\u04a4\u04a8\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\5\u0094K\2\u04a7"+
		"\u04a9\5V,\2\u04a8\u04a6\3\2\2\2\u04a8\u04a7\3\2\2\2\u04a9\u04ab\3\2\2"+
		"\2\u04aa\u049c\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u0497\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b4\3\2\2\2\u04b1\u04b3\7\7\2\2\u04b2\u04b1\3\2"+
		"\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b8\7S\2\2\u04b8]\3\2\2\2\u04b9"+
		"\u04bd\7R\2\2\u04ba\u04bc\7\7\2\2\u04bb\u04ba\3\2\2\2\u04bc\u04bf\3\2"+
		"\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf"+
		"\u04bd\3\2\2\2\u04c0\u04c4\5V,\2\u04c1\u04c3\7\7\2\2\u04c2\u04c1\3\2\2"+
		"\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7"+
		"\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04c8\7S\2\2\u04c8_\3\2\2\2\u04c9\u04cd"+
		"\7T\2\2\u04ca\u04cc\7\7\2\2\u04cb\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04cd\3\2"+
		"\2\2\u04d0\u04d4\5V,\2\u04d1\u04d3\7\7\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6"+
		"\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6"+
		"\u04d4\3\2\2\2\u04d7\u04d8\7U\2\2\u04d8a\3\2\2\2\u04d9\u04dd\5d\63\2\u04da"+
		"\u04dd\5^\60\2\u04db\u04dd\5`\61\2\u04dc\u04d9\3\2\2\2\u04dc\u04da\3\2"+
		"\2\2\u04dc\u04db\3\2\2\2\u04dd\u04e1\3\2\2\2\u04de\u04e0\7\7\2\2\u04df"+
		"\u04de\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2"+
		"\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e6\7x\2\2\u04e5"+
		"\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2"+
		"\2\2\u04e8c\3\2\2\2\u04e9\u04fa\5f\64\2\u04ea\u04ec\7\7\2\2\u04eb\u04ea"+
		"\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04f0\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f4\7o\2\2\u04f1\u04f3\7\7"+
		"\2\2\u04f2\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04f9\5f"+
		"\64\2\u04f8\u04ed\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fbe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u0505\5\u0178"+
		"\u00bd\2\u04fe\u0500\7\7\2\2\u04ff\u04fe\3\2\2\2\u0500\u0503\3\2\2\2\u0501"+
		"\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503\u0501\3\2"+
		"\2\2\u0504\u0506\5B\"\2\u0505\u0501\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"g\3\2\2\2\u0507\u0509\5\u0164\u00b3\2\u0508\u0507\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050e\7\r\2\2\u050b\u050d\7\7\2\2\u050c"+
		"\u050b\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2"+
		"\2\2\u050f\u0511\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0520\5\u0178\u00bd"+
		"\2\u0512\u0514\7\7\2\2\u0513\u0512\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513"+
		"\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0515\3\2\2\2\u0518"+
		"\u051c\7\u008a\2\2\u0519\u051b\7\7\2\2\u051a\u0519\3\2\2\2\u051b\u051e"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051f\u0521\5$\23\2\u0520\u0515\3\2\2\2\u0520\u0521\3\2"+
		"\2\2\u0521\u0529\3\2\2\2\u0522\u0524\7\7\2\2\u0523\u0522\3\2\2\2\u0524"+
		"\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2"+
		"\2\2\u0527\u0525\3\2\2\2\u0528\u052a\5j\66\2\u0529\u0525\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052ai\3\2\2\2\u052b\u052f\7V\2\2\u052c\u052e\7\7\2\2\u052d"+
		"\u052c\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2"+
		"\2\2\u0530\u0535\3\2\2\2\u0531\u052f\3\2\2\2\u0532\u0534\5l\67\2\u0533"+
		"\u0532\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2"+
		"\2\2\u0536\u053b\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u053a\7\7\2\2\u0539"+
		"\u0538\3\2\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2"+
		"\2\2\u053c\u053e\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u053f\7W\2\2\u053f"+
		"k\3\2\2\2\u0540\u0544\5\24\13\2\u0541\u0544\5<\37\2\u0542\u0544\5> \2"+
		"\u0543\u0540\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2\2\u0544\u0546"+
		"\3\2\2\2\u0545\u0547\5\u017a\u00be\2\u0546\u0545\3\2\2\2\u0547\u0548\3"+
		"\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549m\3\2\2\2\u054a\u054c"+
		"\5\u0164\u00b3\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3"+
		"\2\2\2\u054d\u0551\7\20\2\2\u054e\u0550\7\7\2\2\u054f\u054e\3\2\2\2\u0550"+
		"\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2"+
		"\2\2\u0553\u0551\3\2\2\2\u0554\u055c\5\u0178\u00bd\2\u0555\u0557\7\7\2"+
		"\2\u0556\u0555\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559"+
		"\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d\5\36\20\2"+
		"\u055c\u0558\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u0561\3\2\2\2\u055e\u0560"+
		"\7\7\2\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\5p"+
		"9\2\u0565o\3\2\2\2\u0566\u056a\7V\2\2\u0567\u0569\7\7\2\2\u0568\u0567"+
		"\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056f\5r:\2\u056e\u056d\3\2\2"+
		"\2\u056e\u056f\3\2\2\2\u056f\u0583\3\2\2\2\u0570\u0572\7\7\2\2\u0571\u0570"+
		"\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574"+
		"\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u057a\7u\2\2\u0577\u0579\7\7"+
		"\2\2\u0578\u0577\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u0580\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057f\5:"+
		"\36\2\u057e\u057d\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0573\3\2"+
		"\2\2\u0583\u0584\3\2\2\2\u0584\u0588\3\2\2\2\u0585\u0587\7\7\2\2\u0586"+
		"\u0585\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058b\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058c\7W\2\2\u058c"+
		"q\3\2\2\2\u058d\u059e\5t;\2\u058e\u0590\7\7\2\2\u058f\u058e\3\2\2\2\u0590"+
		"\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2"+
		"\2\2\u0593\u0591\3\2\2\2\u0594\u0598\7n\2\2\u0595\u0597\7\7\2\2\u0596"+
		"\u0595\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u059b\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059d\5t;\2\u059c\u0591"+
		"\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"s\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a3\5\u0164\u00b3\2\u05a2\u05a1"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05ac\5\u0178\u00bd"+
		"\2\u05a5\u05a7\7\7\2\2\u05a6\u05a5\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6"+
		"\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab"+
		"\u05ad\5\60\31\2\u05ac\u05a8\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b5\3"+
		"\2\2\2\u05ae\u05b0\7\7\2\2\u05af\u05ae\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b1\3\2"+
		"\2\2\u05b4\u05b6\58\35\2\u05b5\u05b1\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"u\3\2\2\2\u05b7\u05b9\5\u0164\u00b3\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9"+
		"\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05be\7-\2\2\u05bb\u05bd\7\7\2\2\u05bc"+
		"\u05bb\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2"+
		"\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c9\5Z.\2\u05c2\u05c4"+
		"\7\7\2\2\u05c3\u05c2\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05ca\5x"+
		"=\2\u05c9\u05c5\3\2\2\2\u05c9\u05ca\3\2\2\2\u05caw\3\2\2\2\u05cb\u05cf"+
		"\7V\2\2\u05cc\u05ce\7\7\2\2\u05cd\u05cc\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf"+
		"\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d5\3\2\2\2\u05d1\u05cf\3\2"+
		"\2\2\u05d2\u05d4\5z>\2\u05d3\u05d2\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3"+
		"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05db\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8"+
		"\u05da\7\7\2\2\u05d9\u05d8\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2"+
		"\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd\u05db\3\2\2\2\u05de"+
		"\u05df\7W\2\2\u05dfy\3\2\2\2\u05e0\u05e4\5\u008eH\2\u05e1\u05e4\5|?\2"+
		"\u05e2\u05e4\5\64\33\2\u05e3\u05e0\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e2"+
		"\3\2\2\2\u05e4\u05e6\3\2\2\2\u05e5\u05e7\5\u017a\u00be\2\u05e6\u05e5\3"+
		"\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"+
		"{\3\2\2\2\u05ea\u05ec\5\u0164\u00b3\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec"+
		"\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f5\t\5\2\2\u05ee\u05f0\7\7\2\2\u05ef"+
		"\u05ee\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f6\5J&\2\u05f5\u05f1"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05fa\3\2\2\2\u05f7\u05f9\7\7\2\2\u05f8"+
		"\u05f7\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2"+
		"\2\2\u05fb\u05ff\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u0600\5~@\2\u05fe\u0600"+
		"\5\u0080A\2\u05ff\u05fd\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600\u060f\3\2\2"+
		"\2\u0601\u0603\7\7\2\2\u0602\u0601\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2\2\2\u0606\u0604\3\2\2\2\u0607"+
		"\u060b\7X\2\2\u0608\u060a\7\7\2\2\u0609\u0608\3\2\2\2\u060a\u060d\3\2"+
		"\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2\u060d"+
		"\u060b\3\2\2\2\u060e\u0610\5\u00a8U\2\u060f\u0604\3\2\2\2\u060f\u0610"+
		"\3\2\2\2\u0610\u0618\3\2\2\2\u0611\u0613\7\7\2\2\u0612\u0611\3\2\2\2\u0613"+
		"\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\3\2"+
		"\2\2\u0616\u0614\3\2\2\2\u0617\u0619\5\u0082B\2\u0618\u0614\3\2\2\2\u0618"+
		"\u0619\3\2\2\2\u0619}\3\2\2\2\u061a\u061c\5\u0170\u00b9\2\u061b\u061a"+
		"\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u062c\5\u0178\u00bd"+
		"\2\u061e\u0620\7\7\2\2\u061f\u061e\3\2\2\2\u0620\u0623\3\2\2\2\u0621\u061f"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0621\3\2\2\2\u0624"+
		"\u0628\7s\2\2\u0625\u0627\7\7\2\2\u0626\u0625\3\2\2\2\u0627\u062a\3\2"+
		"\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a"+
		"\u0628\3\2\2\2\u062b\u062d\5V,\2\u062c\u0621\3\2\2\2\u062c\u062d\3\2\2"+
		"\2\u062d\177\3\2\2\2\u062e\u0632\7R\2\2\u062f\u0631\7\7\2\2\u0630\u062f"+
		"\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u0635\3\2\2\2\u0634\u0632\3\2\2\2\u0635\u0646\5~@\2\u0636\u0638\7\7\2"+
		"\2\u0637\u0636\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639\u063a"+
		"\3\2\2\2\u063a\u063c\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u0640\7n\2\2\u063d"+
		"\u063f\7\7\2\2\u063e\u063d\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2"+
		"\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0640\3\2\2\2\u0643"+
		"\u0645\5~@\2\u0644\u0639\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2"+
		"\2\u0646\u0647\3\2\2\2\u0647\u064c\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064b"+
		"\7\7\2\2\u064a\u0649\3\2\2\2\u064b\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u064f\3\2\2\2\u064e\u064c\3\2\2\2\u064f\u0650\7S"+
		"\2\2\u0650\u0081\3\2\2\2\u0651\u0655\7V\2\2\u0652\u0654\7\7\2\2\u0653"+
		"\u0652\3\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2"+
		"\2\2\u0656\u066c\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u0660\5\u0084C\2\u0659"+
		"\u065b\5\u017a\u00be\2\u065a\u0659\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a"+
		"\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u065c\3\2\2\2\u065f"+
		"\u0661\5\u0086D\2\u0660\u065c\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u066d"+
		"\3\2\2\2\u0662\u066a\5\u0086D\2\u0663\u0665\5\u017a\u00be\2\u0664\u0663"+
		"\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0669\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066b\5\u0084C\2\u066a\u0666"+
		"\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d\3\2\2\2\u066c\u0658\3\2\2\2\u066c"+
		"\u0662\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0671\3\2\2\2\u066e\u0670\7\7"+
		"\2\2\u066f\u066e\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0671"+
		"\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u0675\7W"+
		"\2\2\u0675\u0083\3\2\2\2\u0676\u0678\5\u0164\u00b3\2\u0677\u0676\3\2\2"+
		"\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u0688\7\35\2\2\u067a"+
		"\u067c\7\7\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2"+
		"\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u067d\3\2\2\2\u0680"+
		"\u0684\7R\2\2\u0681\u0683\7\7\2\2\u0682\u0681\3\2\2\2\u0683\u0686\3\2"+
		"\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686"+
		"\u0684\3\2\2\2\u0687\u0689\7S\2\2\u0688\u067d\3\2\2\2\u0688\u0689\3\2"+
		"\2\2\u0689\u0698\3\2\2\2\u068a\u068c\7\7\2\2\u068b\u068a\3\2\2\2\u068c"+
		"\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2"+
		"\2\2\u068f\u068d\3\2\2\2\u0690\u0694\7\u008b\2\2\u0691\u0693\7\7\2\2\u0692"+
		"\u0691\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2"+
		"\2\2\u0695\u0697\3\2\2\2\u0696\u0694\3\2\2\2\u0697\u0699\5V,\2\u0698\u068d"+
		"\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069d\3\2\2\2\u069a\u069c\7\7\2\2\u069b"+
		"\u069a\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2"+
		"\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u06a0\u06a2\5\u0096L\2\u06a1"+
		"\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u0085\3\2\2\2\u06a3\u06a5\5\u0164"+
		"\u00b3\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6"+
		"\u06aa\7\36\2\2\u06a7\u06a9\7\7\2\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac\3"+
		"\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06d6\3\2\2\2\u06ac"+
		"\u06aa\3\2\2\2\u06ad\u06b1\7R\2\2\u06ae\u06b0\7\7\2\2\u06af\u06ae\3\2"+
		"\2\2\u06b0\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2"+
		"\u06b4\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b4\u06b8\5\u0088E\2\u06b5\u06b7"+
		"\7\7\2\2\u06b6\u06b5\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8"+
		"\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bc\7S"+
		"\2\2\u06bc\u06be\3\2\2\2\u06bd\u06ad\3\2\2\2\u06bd\u06be\3\2\2\2\u06be"+
		"\u06cd\3\2\2\2\u06bf\u06c1\7\7\2\2\u06c0\u06bf\3\2\2\2\u06c1\u06c4\3\2"+
		"\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4"+
		"\u06c2\3\2\2\2\u06c5\u06c9\7\u008b\2\2\u06c6\u06c8\7\7\2\2\u06c7\u06c6"+
		"\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca"+
		"\u06cc\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc\u06ce\5V,\2\u06cd\u06c2\3\2\2"+
		"\2\u06cd\u06ce\3\2\2\2\u06ce\u06d2\3\2\2\2\u06cf\u06d1\7\7\2\2\u06d0\u06cf"+
		"\3\2\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d5\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d7\5\u0096L\2\u06d6\u06bd"+
		"\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u0087\3\2\2\2\u06d8\u06da\5\u008aF"+
		"\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06ea"+
		"\5\u008cG\2\u06dc\u06de\7\7\2\2\u06dd\u06dc\3\2\2\2\u06de\u06e1\3\2\2"+
		"\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df"+
		"\3\2\2\2\u06e2\u06e6\7X\2\2\u06e3\u06e5\7\7\2\2\u06e4\u06e3\3\2\2\2\u06e5"+
		"\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2"+
		"\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06eb\5\u00a8U\2\u06ea\u06df\3\2\2\2\u06ea"+
		"\u06eb\3\2\2\2\u06eb\u0089\3\2\2\2\u06ec\u06ef\5\u0172\u00ba\2\u06ed\u06ef"+
		"\5\u016c\u00b7\2\u06ee\u06ec\3\2\2\2\u06ee\u06ed\3\2\2\2\u06ef\u06f0\3"+
		"\2\2\2\u06f0\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u008b\3\2\2\2\u06f2"+
		"\u0701\5\u0178\u00bd\2\u06f3\u06f5\7\7\2\2\u06f4\u06f3\3\2\2\2\u06f5\u06f8"+
		"\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9\3\2\2\2\u06f8"+
		"\u06f6\3\2\2\2\u06f9\u06fd\7s\2\2\u06fa\u06fc\7\7\2\2\u06fb\u06fa\3\2"+
		"\2\2\u06fc\u06ff\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe"+
		"\u0700\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700\u0702\5V,\2\u0701\u06f6\3\2\2"+
		"\2\u0701\u0702\3\2\2\2\u0702\u008d\3\2\2\2\u0703\u0705\5\u0164\u00b3\2"+
		"\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u070e"+
		"\t\6\2\2\u0707\u0709\7\7\2\2\u0708\u0707\3\2\2\2\u0709\u070c\3\2\2\2\u070a"+
		"\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c\u070a\3\2"+
		"\2\2\u070d\u070f\5J&\2\u070e\u070a\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0713"+
		"\3\2\2\2\u0710\u0712\7\7\2\2\u0711\u0710\3\2\2\2\u0712\u0715\3\2\2\2\u0713"+
		"\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0716\3\2\2\2\u0715\u0713\3\2"+
		"\2\2\u0716\u071a\5\u0178\u00bd\2\u0717\u0719\7\7\2\2\u0718\u0717\3\2\2"+
		"\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071d"+
		"\3\2\2\2\u071c\u071a\3\2\2\2\u071d\u072c\5\u0090I\2\u071e\u0720\7\7\2"+
		"\2\u071f\u071e\3\2\2\2\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722"+
		"\3\2\2\2\u0722\u0724\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0728\7\u008b\2"+
		"\2\u0725\u0727\7\7\2\2\u0726\u0725\3\2\2\2\u0727\u072a\3\2\2\2\u0728\u0726"+
		"\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072b\3\2\2\2\u072a\u0728\3\2\2\2\u072b"+
		"\u072d\5V,\2\u072c\u0721\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u0735\3\2\2"+
		"\2\u072e\u0730\7\7\2\2\u072f\u072e\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f"+
		"\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0731\3\2\2\2\u0734"+
		"\u0736\5\u0096L\2\u0735\u0731\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u008f"+
		"\3\2\2\2\u0737\u073b\7R\2\2\u0738\u073a\7\7\2\2\u0739\u0738\3\2\2\2\u073a"+
		"\u073d\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0752\3\2"+
		"\2\2\u073d\u073b\3\2\2\2\u073e\u074f\5\u0092J\2\u073f\u0741\7\7\2\2\u0740"+
		"\u073f\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2"+
		"\2\2\u0743\u0745\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u0749\7n\2\2\u0746"+
		"\u0748\7\7\2\2\u0747\u0746\3\2\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u0749\3\2\2\2\u074c"+
		"\u074e\5\u0092J\2\u074d\u0742\3\2\2\2\u074e\u0751\3\2\2\2\u074f\u074d"+
		"\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2\2\u0752"+
		"\u073e\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0757\3\2\2\2\u0754\u0756\7\7"+
		"\2\2\u0755\u0754\3\2\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0757"+
		"\u0758\3\2\2\2\u0758\u075a\3\2\2\2\u0759\u0757\3\2\2\2\u075a\u075b\7S"+
		"\2\2\u075b\u0091\3\2\2\2\u075c\u075e\5\u008aF\2\u075d\u075c\3\2\2\2\u075d"+
		"\u075e\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u076e\5\u0094K\2\u0760\u0762"+
		"\7\7\2\2\u0761\u0760\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763"+
		"\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u076a\7X"+
		"\2\2\u0767\u0769\7\7\2\2\u0768\u0767\3\2\2\2\u0769\u076c\3\2\2\2\u076a"+
		"\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2\2\2\u076c\u076a\3\2"+
		"\2\2\u076d\u076f\5\u00a8U\2\u076e\u0763\3\2\2\2\u076e\u076f\3\2\2\2\u076f"+
		"\u0093\3\2\2\2\u0770\u0774\5\u0178\u00bd\2\u0771\u0773\7\7\2\2\u0772\u0771"+
		"\3\2\2\2\u0773\u0776\3\2\2\2\u0774\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0777\3\2\2\2\u0776\u0774\3\2\2\2\u0777\u077b\7s\2\2\u0778\u077a\7\7"+
		"\2\2\u0779\u0778\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077b\3\2\2\2\u077e\u077f\5V"+
		",\2\u077f\u0095\3\2\2\2\u0780\u078a\5\u0098M\2\u0781\u0785\7X\2\2\u0782"+
		"\u0784\7\7\2\2\u0783\u0782\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2"+
		"\2\2\u0785\u0786\3\2\2\2\u0786\u0788\3\2\2\2\u0787\u0785\3\2\2\2\u0788"+
		"\u078a\5\u00a8U\2\u0789\u0780\3\2\2\2\u0789\u0781\3\2\2\2\u078a\u0097"+
		"\3\2\2\2\u078b\u078f\7V\2\2\u078c\u078e\7\7\2\2\u078d\u078c\3\2\2\2\u078e"+
		"\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2"+
		"\2\2\u0791\u078f\3\2\2\2\u0792\u0796\5\u009aN\2\u0793\u0795\7\7\2\2\u0794"+
		"\u0793\3\2\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2"+
		"\2\2\u0797\u0799\3\2\2\2\u0798\u0796\3\2\2\2\u0799\u079a\7W\2\2\u079a"+
		"\u0099\3\2\2\2\u079b\u07a5\5\u009cO\2\u079c\u079e\5\u017a\u00be\2\u079d"+
		"\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2"+
		"\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\5\u009cO\2\u07a2\u07a4\3\2\2\2\u07a3"+
		"\u079d\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2"+
		"\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u079b\3\2\2\2\u07a8"+
		"\u07a9\3\2\2\2\u07a9\u07ad\3\2\2\2\u07aa\u07ac\5\u017a\u00be\2\u07ab\u07aa"+
		"\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u009b\3\2\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b3\5\u00f8}\2\u07b1\u07b3"+
		"\5\u0172\u00ba\2\u07b2\u07b0\3\2\2\2\u07b2\u07b1\3\2\2\2\u07b3\u07b6\3"+
		"\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07ba\3\2\2\2\u07b6"+
		"\u07b4\3\2\2\2\u07b7\u07b9\7\7\2\2\u07b8\u07b7\3\2\2\2\u07b9\u07bc\3\2"+
		"\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07c1\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07c2\5\24\13\2\u07be\u07c2\5\u00a6T\2\u07bf\u07c2"+
		"\5\u009eP\2\u07c0\u07c2\5\u00a8U\2\u07c1\u07bd\3\2\2\2\u07c1\u07be\3\2"+
		"\2\2\u07c1\u07bf\3\2\2\2\u07c1\u07c0\3\2\2\2\u07c2\u009d\3\2\2\2\u07c3"+
		"\u07c7\5\u00a0Q\2\u07c4\u07c7\5\u00a2R\2\u07c5\u07c7\5\u00a4S\2\u07c6"+
		"\u07c3\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c5\3\2\2\2\u07c7\u009f\3\2"+
		"\2\2\u07c8\u07cc\7\63\2\2\u07c9\u07cb\7\7\2\2\u07ca\u07c9\3\2\2\2\u07cb"+
		"\u07ce\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2"+
		"\2\2\u07ce\u07cc\3\2\2\2\u07cf\u07d3\7R\2\2\u07d0\u07d2\7\7\2\2\u07d1"+
		"\u07d0\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3\u07d4\3\2"+
		"\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07d8\5\u0170\u00b9"+
		"\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07dc"+
		"\5~@\2\u07da\u07dc\5\u0080A\2\u07db\u07d9\3\2\2\2\u07db\u07da\3\2\2\2"+
		"\u07dc\u07e0\3\2\2\2\u07dd\u07df\7\7\2\2\u07de\u07dd\3\2\2\2\u07df\u07e2"+
		"\3\2\2\2\u07e0\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2"+
		"\u07e0\3\2\2\2\u07e3\u07e7\7E\2\2\u07e4\u07e6\7\7\2\2\u07e5\u07e4\3\2"+
		"\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8"+
		"\u07ea\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea\u07ee\5\u00a8U\2\u07eb\u07ed"+
		"\7\7\2\2\u07ec\u07eb\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f1\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f1\u07f5\7S"+
		"\2\2\u07f2\u07f4\7\7\2\2\u07f3\u07f2\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5"+
		"\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\3\2\2\2\u07f7\u07f5\3\2"+
		"\2\2\u07f8\u07f9\5\u00e0q\2\u07f9\u00a1\3\2\2\2\u07fa\u07fe\7\67\2\2\u07fb"+
		"\u07fd\7\7\2\2\u07fc\u07fb\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2"+
		"\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u07fe\3\2\2\2\u0801"+
		"\u0805\7R\2\2\u0802\u0804\7\7\2\2\u0803\u0802\3\2\2\2\u0804\u0807\3\2"+
		"\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807"+
		"\u0805\3\2\2\2\u0808\u080c\5\u00a8U\2\u0809\u080b\7\7\2\2\u080a\u0809"+
		"\3\2\2\2\u080b\u080e\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d"+
		"\u080f\3\2\2\2\u080e\u080c\3\2\2\2\u080f\u0813\7S\2\2\u0810\u0812\7\7"+
		"\2\2\u0811\u0810\3\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3\2\2\2\u0813"+
		"\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815\u0813\3\2\2\2\u0816\u0817\5\u00e0"+
		"q\2\u0817\u00a3\3\2\2\2\u0818\u081c\7\66\2\2\u0819\u081b\7\7\2\2\u081a"+
		"\u0819\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081d\3\2"+
		"\2\2\u081d\u081f\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u0823\5\u00e0q\2\u0820"+
		"\u0822\7\7\2\2\u0821\u0820\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0821\3\2"+
		"\2\2\u0823\u0824\3\2\2\2\u0824\u0826\3\2\2\2\u0825\u0823\3\2\2\2\u0826"+
		"\u082a\7\67\2\2\u0827\u0829\7\7\2\2\u0828\u0827\3\2\2\2\u0829\u082c\3"+
		"\2\2\2\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082d\3\2\2\2\u082c"+
		"\u082a\3\2\2\2\u082d\u0831\7R\2\2\u082e\u0830\7\7\2\2\u082f\u082e\3\2"+
		"\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832"+
		"\u0834\3\2\2\2\u0833\u0831\3\2\2\2\u0834\u0838\5\u00a8U\2\u0835\u0837"+
		"\7\7\2\2\u0836\u0835\3\2\2\2\u0837\u083a\3\2\2\2\u0838\u0836\3\2\2\2\u0838"+
		"\u0839\3\2\2\2\u0839\u083b\3\2\2\2\u083a\u0838\3\2\2\2\u083b\u083c\7S"+
		"\2\2\u083c\u00a5\3\2\2\2\u083d\u0841\5\u0154\u00ab\2\u083e\u0840\7\7\2"+
		"\2\u083f\u083e\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842"+
		"\3\2\2\2\u0842\u0844\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0845\5\u012c\u0097"+
		"\2\u0845\u0847\3\2\2\2\u0846\u083d\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u0849\5\u00a8U\2\u0849\u00a7\3\2\2\2\u084a\u084b\5\u00aa"+
		"V\2\u084b\u00a9\3\2\2\2\u084c\u0852\5\u00acW\2\u084d\u084e\5\u012e\u0098"+
		"\2\u084e\u084f\5\u00acW\2\u084f\u0851\3\2\2\2\u0850\u084d\3\2\2\2\u0851"+
		"\u0854\3\2\2\2\u0852\u0850\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u00ab\3\2"+
		"\2\2\u0854\u0852\3\2\2\2\u0855\u085b\5\u00aeX\2\u0856\u0857\5\u0130\u0099"+
		"\2\u0857\u0858\5\u00aeX\2\u0858\u085a\3\2\2\2\u0859\u0856\3\2\2\2\u085a"+
		"\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u00ad\3\2"+
		"\2\2\u085d\u085b\3\2\2\2\u085e\u0864\5\u00b0Y\2\u085f\u0860\5\u0132\u009a"+
		"\2\u0860\u0861\5\u00b0Y\2\u0861\u0863\3\2\2\2\u0862\u085f\3\2\2\2\u0863"+
		"\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u00af\3\2"+
		"\2\2\u0866\u0864\3\2\2\2\u0867\u086d\5\u00b2Z\2\u0868\u0869\5\u0134\u009b"+
		"\2\u0869\u086a\5";
	private static final String _serializedATNSegment1 =
		"\u00b2Z\2\u086a\u086c\3\2\2\2\u086b\u0868\3\2\2\2\u086c\u086f\3\2\2\2"+
		"\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u00b1\3\2\2\2\u086f\u086d"+
		"\3\2\2\2\u0870\u0876\5\u00b4[\2\u0871\u0872\5\u0136\u009c\2\u0872\u0873"+
		"\5\u00b4[\2\u0873\u0875\3\2\2\2\u0874\u0871\3\2\2\2\u0875\u0878\3\2\2"+
		"\2\u0876\u0874\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u00b3\3\2\2\2\u0878\u0876"+
		"\3\2\2\2\u0879\u087d\5\u00b6\\\2\u087a\u087c\5\u015a\u00ae\2\u087b\u087a"+
		"\3\2\2\2\u087c\u087f\3\2\2\2\u087d\u087b\3\2\2\2\u087d\u087e\3\2\2\2\u087e"+
		"\u00b5\3\2\2\2\u087f\u087d\3\2\2\2\u0880\u0889\5\u00b8]\2\u0881\u0882"+
		"\5\u0138\u009d\2\u0882\u0883\5\u00b8]\2\u0883\u0888\3\2\2\2\u0884\u0885"+
		"\5\u013a\u009e\2\u0885\u0886\5V,\2\u0886\u0888\3\2\2\2\u0887\u0881\3\2"+
		"\2\2\u0887\u0884\3\2\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u0889"+
		"\u088a\3\2\2\2\u088a\u00b7\3\2\2\2\u088b\u0889\3\2\2\2\u088c\u0892\5\u00ba"+
		"^\2\u088d\u088e\5\u013c\u009f\2\u088e\u088f\5\u00ba^\2\u088f\u0891\3\2"+
		"\2\2\u0890\u088d\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890\3\2\2\2\u0892"+
		"\u0893\3\2\2\2\u0893\u00b9\3\2\2\2\u0894\u0892\3\2\2\2\u0895\u089b\5\u00bc"+
		"_\2\u0896\u0897\5\u0178\u00bd\2\u0897\u0898\5\u00bc_\2\u0898\u089a\3\2"+
		"\2\2\u0899\u0896\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u0899\3\2\2\2\u089b"+
		"\u089c\3\2\2\2\u089c\u00bb\3\2\2\2\u089d\u089b\3\2\2\2\u089e\u08a8\5\u00be"+
		"`\2\u089f\u08a0\5\u013e\u00a0\2\u08a0\u08a4\5\u00be`\2\u08a1\u08a2\5\u0140"+
		"\u00a1\2\u08a2\u08a3\5\u00be`\2\u08a3\u08a5\3\2\2\2\u08a4\u08a1\3\2\2"+
		"\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\3\2\2\2\u08a6\u089f\3\2\2\2\u08a7\u08aa"+
		"\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u00bd\3\2\2\2\u08aa"+
		"\u08a8\3\2\2\2\u08ab\u08b1\5\u00c0a\2\u08ac\u08ad\5\u0142\u00a2\2\u08ad"+
		"\u08ae\5\u00c0a\2\u08ae\u08b0\3\2\2\2\u08af\u08ac\3\2\2\2\u08b0\u08b3"+
		"\3\2\2\2\u08b1\u08af\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u00bf\3\2\2\2\u08b3"+
		"\u08b1\3\2\2\2\u08b4\u08ba\5\u00c2b\2\u08b5\u08b6\5\u0144\u00a3\2\u08b6"+
		"\u08b7\5\u00c2b\2\u08b7\u08b9\3\2\2\2\u08b8\u08b5\3\2\2\2\u08b9\u08bc"+
		"\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u00c1\3\2\2\2\u08bc"+
		"\u08ba\3\2\2\2\u08bd\u08c3\5\u00c4c\2\u08be\u08bf\5\u0146\u00a4\2\u08bf"+
		"\u08c0\5\u00c4c\2\u08c0\u08c2\3\2\2\2\u08c1\u08be\3\2\2\2\u08c2\u08c5"+
		"\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u00c3\3\2\2\2\u08c5"+
		"\u08c3\3\2\2\2\u08c6\u08cc\5\u00c6d\2\u08c7\u08c8\5\u0148\u00a5\2\u08c8"+
		"\u08c9\5\u00c6d\2\u08c9\u08cb\3\2\2\2\u08ca\u08c7\3\2\2\2\u08cb\u08ce"+
		"\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u00c5\3\2\2\2\u08ce"+
		"\u08cc\3\2\2\2\u08cf\u08d5\5\u00c8e\2\u08d0\u08d1\5\u014a\u00a6\2\u08d1"+
		"\u08d2\5V,\2\u08d2\u08d4\3\2\2\2\u08d3\u08d0\3\2\2\2\u08d4\u08d7\3\2\2"+
		"\2\u08d5\u08d3\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u00c7\3\2\2\2\u08d7\u08d5"+
		"\3\2\2\2\u08d8\u08da\5\u014c\u00a7\2\u08d9\u08d8\3\2\2\2\u08da\u08dd\3"+
		"\2\2\2\u08db\u08d9\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08de\3\2\2\2\u08dd"+
		"\u08db\3\2\2\2\u08de\u08df\5\u00caf\2\u08df\u00c9\3\2\2\2\u08e0\u08e4"+
		"\5\u00ccg\2\u08e1\u08e3\5\u0150\u00a9\2\u08e2\u08e1\3\2\2\2\u08e3\u08e6"+
		"\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u00cb\3\2\2\2\u08e6"+
		"\u08e4\3\2\2\2\u08e7\u08f6\5\u00ceh\2\u08e8\u08f6\5\u0178\u00bd\2\u08e9"+
		"\u08f6\5\u00fc\177\2\u08ea\u08f6\5\u00d0i\2\u08eb\u08f6\5\u00d2j\2\u08ec"+
		"\u08f6\5\u0122\u0092\2\u08ed\u08f6\5\u00d4k\2\u08ee\u08f6\5\u00d6l\2\u08ef"+
		"\u08f6\5\u00d8m\2\u08f0\u08f6\5\u00dan\2\u08f1\u08f6\5\u00dco\2\u08f2"+
		"\u08f6\5\u00e6t\2\u08f3\u08f6\5\u00e8u\2\u08f4\u08f6\5\u00eex\2\u08f5"+
		"\u08e7\3\2\2\2\u08f5\u08e8\3\2\2\2\u08f5\u08e9\3\2\2\2\u08f5\u08ea\3\2"+
		"\2\2\u08f5\u08eb\3\2\2\2\u08f5\u08ec\3\2\2\2\u08f5\u08ed\3\2\2\2\u08f5"+
		"\u08ee\3\2\2\2\u08f5\u08ef\3\2\2\2\u08f5\u08f0\3\2\2\2\u08f5\u08f1\3\2"+
		"\2\2\u08f5\u08f2\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5\u08f4\3\2\2\2\u08f6"+
		"\u00cd\3\2\2\2\u08f7\u08f8\7R\2\2\u08f8\u08f9\5\u00a8U\2\u08f9\u08fa\7"+
		"S\2\2\u08fa\u00cf\3\2\2\2\u08fb\u08fc\7o\2\2\u08fc\u08fd\5\u0176\u00bc"+
		"\2\u08fd\u00d1\3\2\2\2\u08fe\u0900\5Z.\2\u08ff\u08fe\3\2\2\2\u08ff\u0900"+
		"\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0905\7t\2\2\u0902\u0904\7\7\2\2\u0903"+
		"\u0902\3\2\2\2\u0904\u0907\3\2\2\2\u0905\u0903\3\2\2\2\u0905\u0906\3\2"+
		"\2\2\u0906\u090a\3\2\2\2\u0907\u0905\3\2\2\2\u0908\u090b\5\u0178\u00bd"+
		"\2\u0909\u090b\7\13\2\2\u090a\u0908\3\2\2\2\u090a\u0909\3\2\2\2\u090b"+
		"\u00d3\3\2\2\2\u090c\u091b\7\17\2\2\u090d\u090f\7\7\2\2\u090e\u090d\3"+
		"\2\2\2\u090f\u0912\3\2\2\2\u0910\u090e\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0913\3\2\2\2\u0912\u0910\3\2\2\2\u0913\u0917\7\u008a\2\2\u0914\u0916"+
		"\7\7\2\2\u0915\u0914\3\2\2\2\u0916\u0919\3\2\2\2\u0917\u0915\3\2\2\2\u0917"+
		"\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919\u0917\3\2\2\2\u091a\u091c\5$"+
		"\23\2\u091b\u0910\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0924\3\2\2\2\u091d"+
		"\u091f\7\7\2\2\u091e\u091d\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e\3\2"+
		"\2\2\u0920\u0921\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u0920\3\2\2\2\u0923"+
		"\u0925\58\35\2\u0924\u0920\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u00d5\3\2"+
		"\2\2\u0926\u092a\7T\2\2\u0927\u0929\7\7\2\2\u0928\u0927\3\2\2\2\u0929"+
		"\u092c\3\2\2\2\u092a\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092e\3\2"+
		"\2\2\u092c\u092a\3\2\2\2\u092d\u092f\5\u00a8U\2\u092e\u092d\3\2\2\2\u092e"+
		"\u092f\3\2\2\2\u092f\u0940\3\2\2\2\u0930\u0932\7\7\2\2\u0931\u0930\3\2"+
		"\2\2\u0932\u0935\3\2\2\2\u0933\u0931\3\2\2\2\u0933\u0934\3\2\2\2\u0934"+
		"\u0936\3\2\2\2\u0935\u0933\3\2\2\2\u0936\u093a\7n\2\2\u0937\u0939\7\7"+
		"\2\2\u0938\u0937\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2\2\2\u093a"+
		"\u093b\3\2\2\2\u093b\u093d\3\2\2\2\u093c\u093a\3\2\2\2\u093d\u093f\5\u00a8"+
		"U\2\u093e\u0933\3\2\2\2\u093f\u0942\3\2\2\2\u0940\u093e\3\2\2\2\u0940"+
		"\u0941\3\2\2\2\u0941\u0946\3\2\2\2\u0942\u0940\3\2\2\2\u0943\u0945\7\7"+
		"\2\2\u0944\u0943\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0946"+
		"\u0947\3\2\2\2\u0947\u0949\3\2\2\2\u0948\u0946\3\2\2\2\u0949\u094a\7U"+
		"\2\2\u094a\u00d7\3\2\2\2\u094b\u094d\7\23\2\2\u094c\u094e\5\u00fa~\2\u094d"+
		"\u094c\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u00d9\3\2\2\2\u094f\u0960\7\24"+
		"\2\2\u0950\u0954\7\u0082\2\2\u0951\u0953\7\7\2\2\u0952\u0951\3\2\2\2\u0953"+
		"\u0956\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0957\3\2"+
		"\2\2\u0956\u0954\3\2\2\2\u0957\u095b\5V,\2\u0958\u095a\7\7\2\2\u0959\u0958"+
		"\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c"+
		"\u095e\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u095f\7\u0086\2\2\u095f\u0961"+
		"\3\2\2\2\u0960\u0950\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0963\3\2\2\2\u0962"+
		"\u0964\5\u00fa~\2\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u00db"+
		"\3\2\2\2\u0965\u0968\5\u00dep\2\u0966\u0968\5\u00e2r\2\u0967\u0965\3\2"+
		"\2\2\u0967\u0966\3\2\2\2\u0968\u00dd\3\2\2\2\u0969\u096d\t\7\2\2\u096a"+
		"\u096c\7\7\2\2\u096b\u096a\3\2\2\2\u096c\u096f\3\2\2\2\u096d\u096b\3\2"+
		"\2\2\u096d\u096e\3\2\2\2\u096e\u0970\3\2\2\2\u096f\u096d\3\2\2\2\u0970"+
		"\u0974\7R\2\2\u0971\u0973\7\7\2\2\u0972\u0971\3\2\2\2\u0973\u0976\3\2"+
		"\2\2\u0974\u0972\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0977\3\2\2\2\u0976"+
		"\u0974\3\2\2\2\u0977\u097b\5\u00a8U\2\u0978\u097a\7\7\2\2\u0979\u0978"+
		"\3\2\2\2\u097a\u097d\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c"+
		"\u097e\3\2\2\2\u097d\u097b\3\2\2\2\u097e\u0982\7S\2\2\u097f\u0981\7\7"+
		"\2\2\u0980\u097f\3\2\2\2\u0981\u0984\3\2\2\2\u0982\u0980\3\2\2\2\u0982"+
		"\u0983\3\2\2\2\u0983\u0985\3\2\2\2\u0984\u0982\3\2\2\2\u0985\u09ac\5\u00e0"+
		"q\2\u0986\u0988\7\7\2\2\u0987\u0986\3\2\2\2\u0988\u098b\3\2\2\2\u0989"+
		"\u0987\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098c\3\2\2\2\u098b\u0989\3\2"+
		"\2\2\u098c\u0990\7\61\2\2\u098d\u098f\7\7\2\2\u098e\u098d\3\2\2\2\u098f"+
		"\u0992\3\2\2\2\u0990\u098e\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993\3\2"+
		"\2\2\u0992\u0990\3\2\2\2\u0993\u0997\7R\2\2\u0994\u0996\7\7\2\2\u0995"+
		"\u0994\3\2\2\2\u0996\u0999\3\2\2\2\u0997\u0995\3\2\2\2\u0997\u0998\3\2"+
		"\2\2\u0998\u099a\3\2\2\2\u0999\u0997\3\2\2\2\u099a\u099e\5\u00a8U\2\u099b"+
		"\u099d\7\7\2\2\u099c\u099b\3\2\2\2\u099d\u09a0\3\2\2\2\u099e\u099c\3\2"+
		"\2\2\u099e\u099f\3\2\2\2\u099f\u09a1\3\2\2\2\u09a0\u099e\3\2\2\2\u09a1"+
		"\u09a5\7S\2\2\u09a2\u09a4\7\7\2\2\u09a3\u09a2\3\2\2\2\u09a4\u09a7\3\2"+
		"\2\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a8\3\2\2\2\u09a7"+
		"\u09a5\3\2\2\2\u09a8\u09a9\5\u00e0q\2\u09a9\u09ab\3\2\2\2\u09aa\u0989"+
		"\3\2\2\2\u09ab\u09ae\3\2\2\2\u09ac\u09aa\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad"+
		"\u09bd\3\2\2\2\u09ae\u09ac\3\2\2\2\u09af\u09b1\7\7\2\2\u09b0\u09af\3\2"+
		"\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3"+
		"\u09b5\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5\u09b9\7\62\2\2\u09b6\u09b8\7"+
		"\7\2\2\u09b7\u09b6\3\2\2\2\u09b8\u09bb\3\2\2\2\u09b9\u09b7\3\2\2\2\u09b9"+
		"\u09ba\3\2\2\2\u09ba\u09bc\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bc\u09be\5\u00e0"+
		"q\2\u09bd\u09b2\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u00df\3\2\2\2\u09bf"+
		"\u09c2\5\u0098M\2\u09c0\u09c2\5\u00a6T\2\u09c1\u09bf\3\2\2\2\u09c1\u09c0"+
		"\3\2\2\2\u09c2\u00e1\3\2\2\2\u09c3\u09c7\7\64\2\2\u09c4\u09c6\7\7\2\2"+
		"\u09c5\u09c4\3\2\2\2\u09c6\u09c9\3\2\2\2\u09c7\u09c5\3\2\2\2\u09c7\u09c8"+
		"\3\2\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c7\3\2\2\2\u09ca\u09ce\7R\2\2\u09cb"+
		"\u09cd\7\7\2\2\u09cc\u09cb\3\2\2\2\u09cd\u09d0\3\2\2\2\u09ce\u09cc\3\2"+
		"\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d1\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d1"+
		"\u09d5\5\u00a8U\2\u09d2\u09d4\7\7\2\2\u09d3\u09d2\3\2\2\2\u09d4\u09d7"+
		"\3\2\2\2\u09d5\u09d3\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d8\3\2\2\2\u09d7"+
		"\u09d5\3\2\2\2\u09d8\u09dc\7S\2\2\u09d9\u09db\7\7\2\2\u09da\u09d9\3\2"+
		"\2\2\u09db\u09de\3\2\2\2\u09dc\u09da\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd"+
		"\u09df\3\2\2\2\u09de\u09dc\3\2\2\2\u09df\u09e3\7V\2\2\u09e0\u09e2\7\7"+
		"\2\2\u09e1\u09e0\3\2\2\2\u09e2\u09e5\3\2\2\2\u09e3\u09e1\3\2\2\2\u09e3"+
		"\u09e4\3\2\2\2\u09e4\u09ed\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e6\u09ea\5\u00e4"+
		"s\2\u09e7\u09e9\7\7\2\2\u09e8\u09e7\3\2\2\2\u09e9\u09ec\3\2\2\2\u09ea"+
		"\u09e8\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ee\3\2\2\2\u09ec\u09ea\3\2"+
		"\2\2\u09ed\u09e6\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef"+
		"\u09f0\3\2\2\2\u09f0\u09f4\3\2\2\2\u09f1\u09f3\7\7\2\2\u09f2\u09f1\3\2"+
		"\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5"+
		"\u09f7\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f7\u09f8\7W\2\2\u09f8\u00e3\3\2"+
		"\2\2\u09f9\u09fd\7\65\2\2\u09fa\u09fc\7\7\2\2\u09fb\u09fa\3\2\2\2\u09fc"+
		"\u09ff\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u0a00\3\2"+
		"\2\2\u09ff\u09fd\3\2\2\2\u0a00\u0a11\5\u00fc\177\2\u0a01\u0a03\7\7\2\2"+
		"\u0a02\u0a01\3\2\2\2\u0a03\u0a06\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a05"+
		"\3\2\2\2\u0a05\u0a07\3\2\2\2\u0a06\u0a04\3\2\2\2\u0a07\u0a0b\7n\2\2\u0a08"+
		"\u0a0a\7\7\2\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a0d\3\2\2\2\u0a0b\u0a09\3\2"+
		"\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0e"+
		"\u0a10\5\u00fc\177\2\u0a0f\u0a04\3\2\2\2\u0a10\u0a13\3\2\2\2\u0a11\u0a0f"+
		"\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a17\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a14"+
		"\u0a16\7\7\2\2\u0a15\u0a14\3\2\2\2\u0a16\u0a19\3\2\2\2\u0a17\u0a15\3\2"+
		"\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a1a\3\2\2\2\u0a19\u0a17\3\2\2\2\u0a1a"+
		"\u0a1e\7\u008c\2\2\u0a1b\u0a1d\7\7\2\2\u0a1c\u0a1b\3\2\2\2\u0a1d\u0a20"+
		"\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a21\3\2\2\2\u0a20"+
		"\u0a1e\3\2\2\2\u0a21\u0a23\5\u00e0q\2\u0a22\u0a24\5\u017a\u00be\2\u0a23"+
		"\u0a22\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a35\3\2\2\2\u0a25\u0a29\7\62"+
		"\2\2\u0a26\u0a28\7\7\2\2\u0a27\u0a26\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2c\3\2\2\2\u0a2b\u0a29\3\2"+
		"\2\2\u0a2c\u0a30\7\u008c\2\2\u0a2d\u0a2f\7\7\2\2\u0a2e\u0a2d\3\2\2\2\u0a2f"+
		"\u0a32\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a33\3\2"+
		"\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a35\5\u00e0q\2\u0a34\u09f9\3\2\2\2\u0a34"+
		"\u0a25\3\2\2\2\u0a35\u00e5\3\2\2\2\u0a36\u0a3a\7J\2\2\u0a37\u0a39\7\7"+
		"\2\2\u0a38\u0a37\3\2\2\2\u0a39\u0a3c\3\2\2\2\u0a3a\u0a38\3\2\2\2\u0a3a"+
		"\u0a3b\3\2\2\2\u0a3b\u0a3f\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3d\u0a40\5\u0098"+
		"M\2\u0a3e\u0a40\5\u00a8U\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a3e\3\2\2\2\u0a40"+
		"\u00e7\3\2\2\2\u0a41\u0a45\7I\2\2\u0a42\u0a44\7\7\2\2\u0a43\u0a42\3\2"+
		"\2\2\u0a44\u0a47\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a48\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0a52\5\u0098M\2\u0a49\u0a4b"+
		"\7\7\2\2\u0a4a\u0a49\3\2\2\2\u0a4b\u0a4e\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4c"+
		"\u0a4d\3\2\2\2\u0a4d\u0a4f\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4f\u0a51\5\u00ea"+
		"v\2\u0a50\u0a4c\3\2\2\2\u0a51\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a52"+
		"\u0a53\3\2\2\2\u0a53\u0a5c\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a55\u0a57\7\7"+
		"\2\2\u0a56\u0a55\3\2\2\2\u0a57\u0a5a\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a58"+
		"\u0a59\3\2\2\2\u0a59\u0a5b\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0a5d\5\u00ec"+
		"w\2\u0a5c\u0a58\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u00e9\3\2\2\2\u0a5e"+
		"\u0a62\7K\2\2\u0a5f\u0a61\7\7\2\2\u0a60\u0a5f\3\2\2\2\u0a61\u0a64\3\2"+
		"\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a65\3\2\2\2\u0a64"+
		"\u0a62\3\2\2\2\u0a65\u0a69\7R\2\2\u0a66\u0a68\7\7\2\2\u0a67\u0a66\3\2"+
		"\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a"+
		"\u0a6d\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6e\5\u0170\u00b9\2\u0a6d\u0a6c"+
		"\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a73\5\u0178\u00bd"+
		"\2\u0a70\u0a72\7\7\2\2\u0a71\u0a70\3\2\2\2\u0a72\u0a75\3\2\2\2\u0a73\u0a71"+
		"\3\2\2\2\u0a73\u0a74\3\2\2\2\u0a74\u0a76\3\2\2\2\u0a75\u0a73\3\2\2\2\u0a76"+
		"\u0a7a\7s\2\2\u0a77\u0a79\7\7\2\2\u0a78\u0a77\3\2\2\2\u0a79\u0a7c\3\2"+
		"\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7d\3\2\2\2\u0a7c"+
		"\u0a7a\3\2\2\2\u0a7d\u0a8e\5d\63\2\u0a7e\u0a80\7\7\2\2\u0a7f\u0a7e\3\2"+
		"\2\2\u0a80\u0a83\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82"+
		"\u0a84\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a84\u0a88\7h\2\2\u0a85\u0a87\7\7"+
		"\2\2\u0a86\u0a85\3\2\2\2\u0a87\u0a8a\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88"+
		"\u0a89\3\2\2\2\u0a89\u0a8b\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8b\u0a8d\5d"+
		"\63\2\u0a8c\u0a81\3\2\2\2\u0a8d\u0a90\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8e"+
		"\u0a8f\3\2\2\2\u0a8f\u0a94\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a91\u0a93\7\7"+
		"\2\2\u0a92\u0a91\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94\u0a92\3\2\2\2\u0a94"+
		"\u0a95\3\2\2\2\u0a95\u0a97\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a97\u0a9b\7S"+
		"\2\2\u0a98\u0a9a\7\7\2\2\u0a99\u0a98\3\2\2\2\u0a9a\u0a9d\3\2\2\2\u0a9b"+
		"\u0a99\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9e\3\2\2\2\u0a9d\u0a9b\3\2"+
		"\2\2\u0a9e\u0a9f\5\u0098M\2\u0a9f\u00eb\3\2\2\2\u0aa0\u0aa4\7L\2\2\u0aa1"+
		"\u0aa3\7\7\2\2\u0aa2\u0aa1\3\2\2\2\u0aa3\u0aa6\3\2\2\2\u0aa4\u0aa2\3\2"+
		"\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0aa7\3\2\2\2\u0aa6\u0aa4\3\2\2\2\u0aa7"+
		"\u0aa8\5\u0098M\2\u0aa8\u00ed\3\2\2\2\u0aa9\u0aae\5\u00f0y\2\u0aaa\u0aae"+
		"\5\u00f2z\2\u0aab\u0aae\5\u00f4{\2\u0aac\u0aae\5\u00f6|\2\u0aad\u0aa9"+
		"\3\2\2\2\u0aad\u0aaa\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aad\u0aac\3\2\2\2\u0aae"+
		"\u00ef\3\2\2\2\u0aaf\u0ab3\7M\2\2\u0ab0\u0ab2\7\7\2\2\u0ab1\u0ab0\3\2"+
		"\2\2\u0ab2\u0ab5\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4"+
		"\u0ab6\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u0ab7\5\u00a8U\2\u0ab7\u00f1"+
		"\3\2\2\2\u0ab8\u0abc\t\b\2\2\u0ab9\u0abb\7\7\2\2\u0aba\u0ab9\3\2\2\2\u0abb"+
		"\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd\u0ac0\3\2"+
		"\2\2\u0abe\u0abc\3\2\2\2\u0abf\u0ac1\5\u00a8U\2\u0ac0\u0abf\3\2\2\2\u0ac0"+
		"\u0ac1\3\2\2\2\u0ac1\u00f3\3\2\2\2\u0ac2\u0ac3\t\t\2\2\u0ac3\u00f5\3\2"+
		"\2\2\u0ac4\u0ac5\t\n\2\2\u0ac5\u00f7\3\2\2\2\u0ac6\u0ac7\5\u0178\u00bd"+
		"\2\u0ac7\u0acb\7z\2\2\u0ac8\u0aca\7\7\2\2\u0ac9\u0ac8\3\2\2\2\u0aca\u0acd"+
		"\3\2\2\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u00f9\3\2\2\2\u0acd"+
		"\u0acb\3\2\2\2\u0ace\u0acf\7z\2\2\u0acf\u0ad0\5\u0178\u00bd\2\u0ad0\u00fb"+
		"\3\2\2\2\u0ad1\u0ade\5\u00fe\u0080\2\u0ad2\u0ade\5\u0100\u0081\2\u0ad3"+
		"\u0ade\5\u0102\u0082\2\u0ad4\u0ade\5\u0104\u0083\2\u0ad5\u0ade\5\u0106"+
		"\u0084\2\u0ad6\u0ade\5\u0108\u0085\2\u0ad7\u0ade\5\u010a\u0086\2\u0ad8"+
		"\u0ade\5\u010c\u0087\2\u0ad9\u0ade\5\u010e\u0088\2\u0ada\u0ade\5\u0110"+
		"\u0089\2\u0adb\u0ade\5\u0112\u008a\2\u0adc\u0ade\5\u0114\u008b\2\u0add"+
		"\u0ad1\3\2\2\2\u0add\u0ad2\3\2\2\2\u0add\u0ad3\3\2\2\2\u0add\u0ad4\3\2"+
		"\2\2\u0add\u0ad5\3\2\2\2\u0add\u0ad6\3\2\2\2\u0add\u0ad7\3\2\2\2\u0add"+
		"\u0ad8\3\2\2\2\u0add\u0ad9\3\2\2\2\u0add\u0ada\3\2\2\2\u0add\u0adb\3\2"+
		"\2\2\u0add\u0adc\3\2\2\2\u0ade\u00fd\3\2\2\2\u0adf\u0ae0\7Q\2\2\u0ae0"+
		"\u00ff\3\2\2\2\u0ae1\u0ae2\t\13\2\2\u0ae2\u0101\3\2\2\2\u0ae3\u0ae4\t"+
		"\f\2\2\u0ae4\u0103\3\2\2\2\u0ae5\u0ae6\7\u0091\2\2\u0ae6\u0105\3\2\2\2"+
		"\u0ae7\u0ae8\7\u0092\2\2\u0ae8\u0107\3\2\2\2\u0ae9\u0aea\7\u0093\2\2\u0aea"+
		"\u0109\3\2\2\2\u0aeb\u0aec\7\u0094\2\2\u0aec\u010b\3\2\2\2\u0aed\u0aee"+
		"\7\u0095\2\2\u0aee\u010d\3\2\2\2\u0aef\u0af0\7\u0096\2\2\u0af0\u010f\3"+
		"\2\2\2\u0af1\u0af2\7\u0097\2\2\u0af2\u0111\3\2\2\2\u0af3\u0af4\7\u00a1"+
		"\2\2\u0af4\u0113\3\2\2\2\u0af5\u0af8\5\u0116\u008c\2\u0af6\u0af8\5\u0118"+
		"\u008d\2\u0af7\u0af5\3\2\2\2\u0af7\u0af6\3\2\2\2\u0af8\u0115\3\2\2\2\u0af9"+
		"\u0afe\7\u008f\2\2\u0afa\u0afd\5\u011a\u008e\2\u0afb\u0afd\5\u011c\u008f"+
		"\2\u0afc\u0afa\3\2\2\2\u0afc\u0afb\3\2\2\2\u0afd\u0b00\3\2\2\2\u0afe\u0afc"+
		"\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b01\3\2\2\2\u0b00\u0afe\3\2\2\2\u0b01"+
		"\u0b02\7\u00a9\2\2\u0b02\u0117\3\2\2\2\u0b03\u0b0a\7\u0090\2\2\u0b04\u0b09"+
		"\5\u011e\u0090\2\u0b05\u0b09\5\u0120\u0091\2\u0b06\u0b09\5\u0116\u008c"+
		"\2\u0b07\u0b09\7\u00af\2\2\u0b08\u0b04\3\2\2\2\u0b08\u0b05\3\2\2\2\u0b08"+
		"\u0b06\3\2\2\2\u0b08\u0b07\3\2\2\2\u0b09\u0b0c\3\2\2\2\u0b0a\u0b08\3\2"+
		"\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b0d\3\2\2\2\u0b0c\u0b0a\3\2\2\2\u0b0d"+
		"\u0b0e\7\u00ae\2\2\u0b0e\u0119\3\2\2\2\u0b0f\u0b10\t\r\2\2\u0b10\u011b"+
		"\3\2\2\2\u0b11\u0b12\7\u00ad\2\2\u0b12\u0b13\5\u00a8U\2\u0b13\u0b14\7"+
		"W\2\2\u0b14\u011d\3\2\2\2\u0b15\u0b16\t\16\2\2\u0b16\u011f\3\2\2\2\u0b17"+
		"\u0b18\7\u00b3\2\2\u0b18\u0b19\5\u00a8U\2\u0b19\u0b1a\7W\2\2\u0b1a\u0121"+
		"\3\2\2\2\u0b1b\u0b1e\5\u0124\u0093\2\u0b1c\u0b1e\5\u012a\u0096\2\u0b1d"+
		"\u0b1b\3\2\2\2\u0b1d\u0b1c\3\2\2\2\u0b1e\u0123\3\2\2\2\u0b1f\u0b23\7V"+
		"\2\2\u0b20\u0b22\7\7\2\2\u0b21\u0b20\3\2\2\2\u0b22\u0b25\3\2\2\2\u0b23"+
		"\u0b21\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b36\3\2\2\2\u0b25\u0b23\3\2"+
		"\2\2\u0b26\u0b28\5\u0126\u0094\2\u0b27\u0b26\3\2\2\2\u0b27\u0b28\3\2\2"+
		"\2\u0b28\u0b2c\3\2\2\2\u0b29\u0b2b\7\7\2\2\u0b2a\u0b29\3\2\2\2\u0b2b\u0b2e"+
		"\3\2\2\2\u0b2c\u0b2a\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2f\3\2\2\2\u0b2e"+
		"\u0b2c\3\2\2\2\u0b2f\u0b33\7\u008c\2\2\u0b30\u0b32\7\7\2\2\u0b31\u0b30"+
		"\3\2\2\2\u0b32\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34"+
		"\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b27\3\2\2\2\u0b36\u0b37\3\2"+
		"\2\2\u0b37\u0b38\3\2\2\2\u0b38\u0b3c\5\u009aN\2\u0b39\u0b3b\7\7\2\2\u0b3a"+
		"\u0b39\3\2\2\2\u0b3b\u0b3e\3\2\2\2\u0b3c\u0b3a\3\2\2\2\u0b3c\u0b3d\3\2"+
		"\2\2\u0b3d\u0b3f\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3f\u0b40\7W\2\2\u0b40"+
		"\u0125\3\2\2\2\u0b41\u0b52\5\u0128\u0095\2\u0b42\u0b44\7\7\2\2\u0b43\u0b42"+
		"\3\2\2\2\u0b44\u0b47\3\2\2\2\u0b45\u0b43\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46"+
		"\u0b48\3\2\2\2\u0b47\u0b45\3\2\2\2\u0b48\u0b4c\7n\2\2\u0b49\u0b4b\7\7"+
		"\2\2\u0b4a\u0b49\3\2\2\2\u0b4b\u0b4e\3\2\2\2\u0b4c\u0b4a\3\2\2\2\u0b4c"+
		"\u0b4d\3\2\2\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b4c\3\2\2\2\u0b4f\u0b51\5\u0128"+
		"\u0095\2\u0b50\u0b45\3\2\2\2\u0b51\u0b54\3\2\2\2\u0b52\u0b50\3\2\2\2\u0b52"+
		"\u0b53\3\2\2\2\u0b53\u0127\3\2\2\2\u0b54\u0b52\3\2\2\2\u0b55\u0b68\5~"+
		"@\2\u0b56\u0b65\5\u0080A\2\u0b57\u0b59\7\7\2\2\u0b58\u0b57\3\2\2\2\u0b59"+
		"\u0b5c\3\2\2\2\u0b5a\u0b58\3\2\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0b5d\3\2"+
		"\2\2\u0b5c\u0b5a\3\2\2\2\u0b5d\u0b61\7s\2\2\u0b5e\u0b60\7\7\2\2\u0b5f"+
		"\u0b5e\3\2\2\2\u0b60\u0b63\3\2\2\2\u0b61\u0b5f\3\2\2\2\u0b61\u0b62\3\2"+
		"\2\2\u0b62\u0b64\3\2\2\2\u0b63\u0b61\3\2\2\2\u0b64\u0b66\5V,\2\u0b65\u0b5a"+
		"\3\2\2\2\u0b65\u0b66\3\2\2\2\u0b66\u0b68\3\2\2\2\u0b67\u0b55\3\2\2\2\u0b67"+
		"\u0b56\3\2\2\2\u0b68\u0129\3\2\2\2\u0b69\u0b79\7*\2\2\u0b6a\u0b6c\7\7"+
		"\2\2\u0b6b\u0b6a\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d\u0b6b\3\2\2\2\u0b6d"+
		"\u0b6e\3\2\2\2\u0b6e\u0b70\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b70\u0b74\5Z"+
		".\2\u0b71\u0b73\7\7\2\2\u0b72\u0b71\3\2\2\2\u0b73\u0b76\3\2\2\2\u0b74"+
		"\u0b72\3\2\2\2\u0b74\u0b75\3\2\2\2\u0b75\u0b77\3\2\2\2\u0b76\u0b74\3\2"+
		"\2\2\u0b77\u0b78\7o\2\2\u0b78\u0b7a\3\2\2\2\u0b79\u0b6d\3\2\2\2\u0b79"+
		"\u0b7a\3\2\2\2\u0b7a\u0b7e\3\2\2\2\u0b7b\u0b7d\7\7\2\2\u0b7c\u0b7b\3\2"+
		"\2\2\u0b7d\u0b80\3\2\2\2\u0b7e\u0b7c\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f"+
		"\u0b81\3\2\2\2\u0b80\u0b7e\3\2\2\2\u0b81\u0b90\5\u0090I\2\u0b82\u0b84"+
		"\7\7\2\2\u0b83\u0b82\3\2\2\2\u0b84\u0b87\3\2\2\2\u0b85\u0b83\3\2\2\2\u0b85"+
		"\u0b86\3\2\2\2\u0b86\u0b88\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b88\u0b8c\7\u008b"+
		"\2\2\u0b89\u0b8b\7\7\2\2\u0b8a\u0b89\3\2\2\2\u0b8b\u0b8e\3\2\2\2\u0b8c"+
		"\u0b8a\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8f\3\2\2\2\u0b8e\u0b8c\3\2"+
		"\2\2\u0b8f\u0b91\5V,\2\u0b90\u0b85\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u0b99"+
		"\3\2\2\2\u0b92\u0b94\7\7\2\2\u0b93\u0b92\3\2\2\2\u0b94\u0b97\3\2\2\2\u0b95"+
		"\u0b93\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u0b98\3\2\2\2\u0b97\u0b95\3\2"+
		"\2\2\u0b98\u0b9a\5\u0096L\2\u0b99\u0b95\3\2\2\2\u0b99\u0b9a\3\2\2\2\u0b9a"+
		"\u012b\3\2\2\2\u0b9b\u0b9d\7\7\2\2\u0b9c\u0b9b\3\2\2\2\u0b9d\u0ba0\3\2"+
		"\2\2\u0b9e\u0b9c\3\2\2\2\u0b9e\u0b9f\3\2\2\2\u0b9f\u0ba1\3\2\2\2\u0ba0"+
		"\u0b9e\3\2\2\2\u0ba1\u0ba5\t\17\2\2\u0ba2\u0ba4\7\7\2\2\u0ba3\u0ba2\3"+
		"\2\2\2\u0ba4\u0ba7\3\2\2\2\u0ba5\u0ba3\3\2\2\2\u0ba5\u0ba6\3\2\2\2\u0ba6"+
		"\u012d\3\2\2\2\u0ba7\u0ba5\3\2\2\2\u0ba8\u0baa\7\7\2\2\u0ba9\u0ba8\3\2"+
		"\2\2\u0baa\u0bad\3\2\2\2\u0bab\u0ba9\3\2\2\2\u0bab\u0bac\3\2\2\2\u0bac"+
		"\u0bae\3\2\2\2\u0bad\u0bab\3\2\2\2\u0bae\u0bb2\t\20\2\2\u0baf\u0bb1\7"+
		"\7\2\2\u0bb0\u0baf\3\2\2\2\u0bb1\u0bb4\3\2\2\2\u0bb2\u0bb0\3\2\2\2\u0bb2"+
		"\u0bb3\3\2\2\2\u0bb3\u012f\3\2\2\2\u0bb4\u0bb2\3\2\2\2\u0bb5\u0bb7\7\7"+
		"\2\2\u0bb6\u0bb5\3\2\2\2\u0bb7\u0bba\3\2\2\2\u0bb8\u0bb6\3\2\2\2\u0bb8"+
		"\u0bb9\3\2\2\2\u0bb9\u0bbb\3\2\2\2\u0bba\u0bb8\3\2\2\2\u0bbb\u0bbf\t\21"+
		"\2\2\u0bbc\u0bbe\7\7\2\2\u0bbd\u0bbc\3\2\2\2\u0bbe\u0bc1\3\2\2\2\u0bbf"+
		"\u0bbd\3\2\2\2\u0bbf\u0bc0\3\2\2\2\u0bc0\u0131\3\2\2\2\u0bc1\u0bbf\3\2"+
		"\2\2\u0bc2\u0bc4\7\7\2\2\u0bc3\u0bc2\3\2\2\2\u0bc4\u0bc7\3\2\2\2\u0bc5"+
		"\u0bc3\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6\u0bc8\3\2\2\2\u0bc7\u0bc5\3\2"+
		"\2\2\u0bc8\u0bcc\t\22\2\2\u0bc9\u0bcb\7\7\2\2\u0bca\u0bc9\3\2\2\2\u0bcb"+
		"\u0bce\3\2\2\2\u0bcc\u0bca\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0133\3\2"+
		"\2\2\u0bce\u0bcc\3\2\2\2\u0bcf\u0bd1\7\7\2\2\u0bd0\u0bcf\3\2\2\2\u0bd1"+
		"\u0bd4\3\2\2\2\u0bd2\u0bd0\3\2\2\2\u0bd2\u0bd3\3\2\2\2\u0bd3\u0bd5\3\2"+
		"\2\2\u0bd4\u0bd2\3\2\2\2\u0bd5\u0bd9\t\23\2\2\u0bd6\u0bd8\7\7\2\2\u0bd7"+
		"\u0bd6\3\2\2\2\u0bd8\u0bdb\3\2\2\2\u0bd9\u0bd7\3\2\2\2\u0bd9\u0bda\3\2"+
		"\2\2\u0bda\u0135\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0bde\7\7\2\2\u0bdd"+
		"\u0bdc\3\2\2\2\u0bde\u0be1\3\2\2\2\u0bdf\u0bdd\3\2\2\2\u0bdf\u0be0\3\2"+
		"\2\2\u0be0\u0be2\3\2\2\2\u0be1\u0bdf\3\2\2\2\u0be2\u0be6\t\24\2\2\u0be3"+
		"\u0be5\7\7\2\2\u0be4\u0be3\3\2\2\2\u0be5\u0be8\3\2\2\2\u0be6\u0be4\3\2"+
		"\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0137\3\2\2\2\u0be8\u0be6\3\2\2\2\u0be9"+
		"\u0beb\7\7\2\2\u0bea\u0be9\3\2\2\2\u0beb\u0bee\3\2\2\2\u0bec\u0bea\3\2"+
		"\2\2\u0bec\u0bed\3\2\2\2\u0bed\u0bef\3\2\2\2\u0bee\u0bec\3\2\2\2\u0bef"+
		"\u0bf3\t\25\2\2\u0bf0\u0bf2\7\7\2\2\u0bf1\u0bf0\3\2\2\2\u0bf2\u0bf5\3"+
		"\2\2\2\u0bf3\u0bf1\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0139\3\2\2\2\u0bf5"+
		"\u0bf3\3\2\2\2\u0bf6\u0bf8\7\7\2\2\u0bf7\u0bf6\3\2\2\2\u0bf8\u0bfb\3\2"+
		"\2\2\u0bf9\u0bf7\3\2\2\2\u0bf9\u0bfa\3\2\2\2\u0bfa\u0bfc\3\2\2\2\u0bfb"+
		"\u0bf9\3\2\2\2\u0bfc\u0c00\t\26\2\2\u0bfd\u0bff\7\7\2\2\u0bfe\u0bfd\3"+
		"\2\2\2\u0bff\u0c02\3\2\2\2\u0c00\u0bfe\3\2\2\2\u0c00\u0c01\3\2\2\2\u0c01"+
		"\u013b\3\2\2\2\u0c02\u0c00\3\2\2\2\u0c03\u0c05\7\7\2\2\u0c04\u0c03\3\2"+
		"\2\2\u0c05\u0c08\3\2\2\2\u0c06\u0c04\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07"+
		"\u0c09\3\2\2\2\u0c08\u0c06\3\2\2\2\u0c09\u0c0d\7|\2\2\u0c0a\u0c0c\7\7"+
		"\2\2\u0c0b\u0c0a\3\2\2\2\u0c0c\u0c0f\3\2\2\2\u0c0d\u0c0b\3\2\2\2\u0c0d"+
		"\u0c0e\3\2\2\2\u0c0e\u013d\3\2\2\2\u0c0f\u0c0d\3\2\2\2\u0c10\u0c12\7\7"+
		"\2\2\u0c11\u0c10\3\2\2\2\u0c12\u0c15\3\2\2\2\u0c13\u0c11\3\2\2\2\u0c13"+
		"\u0c14\3\2\2\2\u0c14\u0c16\3\2\2\2\u0c15\u0c13\3\2\2\2\u0c16\u0c1a\t\27"+
		"\2\2\u0c17\u0c19\7\7\2\2\u0c18\u0c17\3\2\2\2\u0c19\u0c1c\3\2\2\2\u0c1a"+
		"\u0c18\3\2\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b\u013f\3\2\2\2\u0c1c\u0c1a\3\2"+
		"\2\2\u0c1d\u0c1f\7\7\2\2\u0c1e\u0c1d\3\2\2\2\u0c1f\u0c22\3\2\2\2\u0c20"+
		"\u0c1e\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c23\3\2\2\2\u0c22\u0c20\3\2"+
		"\2\2\u0c23\u0c27\t\30\2\2\u0c24\u0c26\7\7\2\2\u0c25\u0c24\3\2\2\2\u0c26"+
		"\u0c29\3\2\2\2\u0c27\u0c25\3\2\2\2\u0c27\u0c28\3\2\2\2\u0c28\u0141\3\2"+
		"\2\2\u0c29\u0c27\3\2\2\2\u0c2a\u0c2c\7\7\2\2\u0c2b\u0c2a\3\2\2\2\u0c2c"+
		"\u0c2f\3\2\2\2\u0c2d\u0c2b\3\2\2\2\u0c2d\u0c2e\3\2\2\2\u0c2e\u0c30\3\2"+
		"\2\2\u0c2f\u0c2d\3\2\2\2\u0c30\u0c34\7l\2\2\u0c31\u0c33\7\7\2\2\u0c32"+
		"\u0c31\3\2\2\2\u0c33\u0c36\3\2\2\2\u0c34\u0c32\3\2\2\2\u0c34\u0c35\3\2"+
		"\2\2\u0c35\u0143\3\2\2\2\u0c36\u0c34\3\2\2\2\u0c37\u0c39\7\7\2\2\u0c38"+
		"\u0c37\3\2\2\2\u0c39\u0c3c\3\2\2\2\u0c3a\u0c38\3\2\2\2\u0c3a\u0c3b\3\2"+
		"\2\2\u0c3b\u0c3d\3\2\2\2\u0c3c\u0c3a\3\2\2\2\u0c3d\u0c41\t\31\2\2\u0c3e"+
		"\u0c40\7\7\2\2\u0c3f\u0c3e\3\2\2\2\u0c40\u0c43\3\2\2\2\u0c41\u0c3f\3\2"+
		"\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0145\3\2\2\2\u0c43\u0c41\3\2\2\2\u0c44"+
		"\u0c46\7\7\2\2\u0c45\u0c44\3\2\2\2\u0c46\u0c49\3\2\2\2\u0c47\u0c45\3\2"+
		"\2\2\u0c47\u0c48\3\2\2\2\u0c48\u0c4a\3\2\2\2\u0c49\u0c47\3\2\2\2\u0c4a"+
		"\u0c4e\t\32\2\2\u0c4b\u0c4d\7\7\2\2\u0c4c\u0c4b\3\2\2\2\u0c4d\u0c50\3"+
		"\2\2\2\u0c4e\u0c4c\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0147\3\2\2\2\u0c50"+
		"\u0c4e\3\2\2\2\u0c51\u0c53\7\7\2\2\u0c52\u0c51\3\2\2\2\u0c53\u0c56\3\2"+
		"\2\2\u0c54\u0c52\3\2\2\2\u0c54\u0c55\3\2\2\2\u0c55\u0c57\3\2\2\2\u0c56"+
		"\u0c54\3\2\2\2\u0c57\u0c5b\7f\2\2\u0c58\u0c5a\7\7\2\2\u0c59\u0c58\3\2"+
		"\2\2\u0c5a\u0c5d\3\2\2\2\u0c5b\u0c59\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c"+
		"\u0149\3\2\2\2\u0c5d\u0c5b\3\2\2\2\u0c5e\u0c60\7\7\2\2\u0c5f\u0c5e\3\2"+
		"\2\2\u0c60\u0c63\3\2\2\2\u0c61\u0c5f\3\2\2\2\u0c61\u0c62\3\2\2\2\u0c62"+
		"\u0c64\3\2\2\2\u0c63\u0c61\3\2\2\2\u0c64\u0c68\t\33\2\2\u0c65\u0c67\7"+
		"\7\2\2\u0c66\u0c65\3\2\2\2\u0c67\u0c6a\3\2\2\2\u0c68\u0c66\3\2\2\2\u0c68"+
		"\u0c69\3\2\2\2\u0c69\u014b\3\2\2\2\u0c6a\u0c68\3\2\2\2\u0c6b\u0c6f\5\u0172"+
		"\u00ba\2\u0c6c\u0c6f\5\u00f8}\2\u0c6d\u0c6f\5\u014e\u00a8\2\u0c6e\u0c6b"+
		"\3\2\2\2\u0c6e\u0c6c\3\2\2\2\u0c6e\u0c6d\3\2\2\2\u0c6f\u014d\3\2\2\2\u0c70"+
		"\u0c71\t\34\2\2\u0c71\u014f\3\2\2\2\u0c72\u0c78\5\u0152\u00aa\2\u0c73"+
		"\u0c78\5B\"\2\u0c74\u0c78\5\u015a\u00ae\2\u0c75\u0c78\5\u015e\u00b0\2"+
		"\u0c76\u0c78\5\u0160\u00b1\2\u0c77\u0c72\3\2\2\2\u0c77\u0c73\3\2\2\2\u0c77"+
		"\u0c74\3\2\2\2\u0c77\u0c75\3\2\2\2\u0c77\u0c76\3\2\2\2\u0c78\u0151\3\2"+
		"\2\2\u0c79\u0c7a\t\35\2\2\u0c7a\u0153\3\2\2\2\u0c7b\u0c7c\5\u00caf\2\u0c7c"+
		"\u0c7d\5\u0158\u00ad\2\u0c7d\u0c81\3\2\2\2\u0c7e\u0c81\5\u0178\u00bd\2"+
		"\u0c7f\u0c81\5\u0156\u00ac\2\u0c80\u0c7b\3\2\2\2\u0c80\u0c7e\3\2\2\2\u0c80"+
		"\u0c7f\3\2\2\2\u0c81\u0155\3\2\2\2\u0c82\u0c86\7R\2\2\u0c83\u0c85\7\7"+
		"\2\2\u0c84\u0c83\3\2\2\2\u0c85\u0c88\3\2\2\2\u0c86\u0c84\3\2\2\2\u0c86"+
		"\u0c87\3\2\2\2\u0c87\u0c89\3\2\2\2\u0c88\u0c86\3\2\2\2\u0c89\u0c8d\5\u0154"+
		"\u00ab\2\u0c8a\u0c8c\7\7\2\2\u0c8b\u0c8a\3\2\2\2\u0c8c\u0c8f\3\2\2\2\u0c8d"+
		"\u0c8b\3\2\2\2\u0c8d\u0c8e\3\2\2\2\u0c8e\u0c90\3\2\2\2\u0c8f\u0c8d\3\2"+
		"\2\2\u0c90\u0c91\7S\2\2\u0c91\u0157\3\2\2\2\u0c92\u0c96\5B\"\2\u0c93\u0c96"+
		"\5\u015e\u00b0\2\u0c94\u0c96\5\u0160\u00b1\2\u0c95\u0c92\3\2\2\2\u0c95"+
		"\u0c93\3\2\2\2\u0c95\u0c94\3\2\2\2\u0c96\u0159\3\2\2\2\u0c97\u0c99\5B"+
		"\"\2\u0c98\u0c97\3\2\2\2\u0c98\u0c99\3\2\2\2\u0c99\u0c9f\3\2\2\2\u0c9a"+
		"\u0c9c\5\60\31\2\u0c9b\u0c9a\3\2\2\2\u0c9b\u0c9c\3\2\2\2\u0c9c\u0c9d\3"+
		"\2\2\2\u0c9d\u0ca0\5\u015c\u00af\2\u0c9e\u0ca0\5\60\31\2\u0c9f\u0c9b\3"+
		"\2\2\2\u0c9f\u0c9e\3\2\2\2\u0ca0\u015b\3\2\2\2\u0ca1\u0ca3\5\u0170\u00b9"+
		"\2\u0ca2\u0ca1\3\2\2\2\u0ca2\u0ca3\3\2\2\2\u0ca3\u0ca5\3\2\2\2\u0ca4\u0ca6"+
		"\5\u00f8}\2\u0ca5\u0ca4\3\2\2\2\u0ca5\u0ca6\3\2\2\2\u0ca6\u0caa\3\2\2"+
		"\2\u0ca7\u0ca9\7\7\2\2\u0ca8\u0ca7\3\2\2\2\u0ca9\u0cac\3\2\2\2\u0caa\u0ca8"+
		"\3\2\2\2\u0caa\u0cab\3\2\2\2\u0cab\u0cad\3\2\2\2\u0cac\u0caa\3\2\2\2\u0cad"+
		"\u0cae\5\u0124\u0093\2\u0cae\u015d\3\2\2\2\u0caf\u0cb3\7T\2\2\u0cb0\u0cb2"+
		"\7\7\2\2\u0cb1\u0cb0\3\2\2\2\u0cb2\u0cb5\3\2\2\2\u0cb3\u0cb1\3\2\2\2\u0cb3"+
		"\u0cb4\3\2\2\2\u0cb4\u0cb6\3\2\2\2\u0cb5\u0cb3\3\2\2\2\u0cb6\u0cc7\5\u00a8"+
		"U\2\u0cb7\u0cb9\7\7\2\2\u0cb8\u0cb7\3\2\2\2\u0cb9\u0cbc\3\2\2\2\u0cba"+
		"\u0cb8\3\2\2\2\u0cba\u0cbb\3\2\2\2\u0cbb\u0cbd\3\2\2\2\u0cbc\u0cba\3\2"+
		"\2\2\u0cbd\u0cc1\7n\2\2\u0cbe\u0cc0\7\7\2\2\u0cbf\u0cbe\3\2\2\2\u0cc0"+
		"\u0cc3\3\2\2\2\u0cc1\u0cbf\3\2\2\2\u0cc1\u0cc2\3\2\2\2\u0cc2\u0cc4\3\2"+
		"\2\2\u0cc3\u0cc1\3\2\2\2\u0cc4\u0cc6\5\u00a8U\2\u0cc5\u0cba\3\2\2\2\u0cc6"+
		"\u0cc9\3\2\2\2\u0cc7\u0cc5\3\2\2\2\u0cc7\u0cc8\3\2\2\2\u0cc8\u0ccd\3\2"+
		"\2\2\u0cc9\u0cc7\3\2\2\2\u0cca\u0ccc\7\7\2\2\u0ccb\u0cca\3\2\2\2\u0ccc"+
		"\u0ccf\3\2\2\2\u0ccd\u0ccb\3\2\2\2\u0ccd\u0cce\3\2\2\2\u0cce\u0cd0\3\2"+
		"\2\2\u0ccf\u0ccd\3\2\2\2\u0cd0\u0cd1\7U\2\2\u0cd1\u015f\3\2\2\2\u0cd2"+
		"\u0cd5\5\u0162\u00b2\2\u0cd3\u0cd6\5\u0178\u00bd\2\u0cd4\u0cd6\5\u00ce"+
		"h\2\u0cd5\u0cd3\3\2\2\2\u0cd5\u0cd4\3\2\2\2\u0cd6\u0161\3\2\2\2\u0cd7"+
		"\u0cd9\7\7\2\2\u0cd8\u0cd7\3\2\2\2\u0cd9\u0cdc\3\2\2\2\u0cda\u0cd8\3\2"+
		"\2\2\u0cda\u0cdb\3\2\2\2\u0cdb\u0cdd\3\2\2\2\u0cdc\u0cda\3\2\2\2\u0cdd"+
		"\u0ce1\t\36\2\2\u0cde\u0ce0\7\7\2\2\u0cdf\u0cde\3\2\2\2\u0ce0\u0ce3\3"+
		"\2\2\2\u0ce1\u0cdf\3\2\2\2\u0ce1\u0ce2\3\2\2\2\u0ce2\u0163\3\2\2\2\u0ce3"+
		"\u0ce1\3\2\2\2\u0ce4\u0ce8\5\u0170\u00b9\2\u0ce5\u0ce7\7\7\2\2\u0ce6\u0ce5"+
		"\3\2\2\2\u0ce7\u0cea\3\2\2\2\u0ce8\u0ce6\3\2\2\2\u0ce8\u0ce9\3\2\2\2\u0ce9"+
		"\u0cf3\3\2\2\2\u0cea\u0ce8\3\2\2\2\u0ceb\u0cef\5\u0166\u00b4\2\u0cec\u0cee"+
		"\7\7\2\2\u0ced\u0cec\3\2\2\2\u0cee\u0cf1\3\2\2\2\u0cef\u0ced\3\2\2\2\u0cef"+
		"\u0cf0\3\2\2\2\u0cf0\u0cf3\3\2\2\2\u0cf1\u0cef\3\2\2\2\u0cf2\u0ce4\3\2"+
		"\2\2\u0cf2\u0ceb\3\2\2\2\u0cf3\u0cf4\3\2\2\2\u0cf4\u0cf2\3\2\2\2\u0cf4"+
		"\u0cf5\3\2\2\2\u0cf5\u0165\3\2\2\2\u0cf6\u0cfb\5\u0168\u00b5\2\u0cf7\u0cfb"+
		"\5\u016a\u00b6\2\u0cf8\u0cfb\5\u016c\u00b7\2\u0cf9\u0cfb\5\u016e\u00b8"+
		"\2\u0cfa\u0cf6\3\2\2\2\u0cfa\u0cf7\3\2\2\2\u0cfa\u0cf8\3\2\2\2\u0cfa\u0cf9"+
		"\3\2\2\2\u0cfb\u0167\3\2\2\2\u0cfc\u0cfd\t\37\2\2\u0cfd\u0169\3\2\2\2"+
		"\u0cfe\u0cff\t \2\2\u0cff\u016b\3\2\2\2\u0d00\u0d01\7.\2\2\u0d01\u016d"+
		"\3\2\2\2\u0d02\u0d03\t!\2\2\u0d03\u016f\3\2\2\2\u0d04\u0d08\5\u0172\u00ba"+
		"\2\u0d05\u0d07\7\7\2\2\u0d06\u0d05\3\2\2\2\u0d07\u0d0a\3\2\2\2\u0d08\u0d06"+
		"\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d0c\3\2\2\2\u0d0a\u0d08\3\2\2\2\u0d0b"+
		"\u0d04\3\2\2\2\u0d0c\u0d0d\3\2\2\2\u0d0d\u0d0b\3\2\2\2\u0d0d\u0d0e\3\2"+
		"\2\2\u0d0e\u0171\3\2\2\2\u0d0f\u0d25\7y\2\2\u0d10\u0d26\5\u0174\u00bb"+
		"\2\u0d11\u0d15\7T\2\2\u0d12\u0d14\7\7\2\2\u0d13\u0d12\3\2\2\2\u0d14\u0d17"+
		"\3\2\2\2\u0d15\u0d13\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u0d19\3\2\2\2\u0d17"+
		"\u0d15\3\2\2\2\u0d18\u0d1a\5\u0174\u00bb\2\u0d19\u0d18\3\2\2\2\u0d1a\u0d1b"+
		"\3\2\2\2\u0d1b\u0d19\3\2\2\2\u0d1b\u0d1c\3\2\2\2\u0d1c\u0d20\3\2\2\2\u0d1d"+
		"\u0d1f\7\7\2\2\u0d1e\u0d1d\3\2\2\2\u0d1f\u0d22\3\2\2\2\u0d20\u0d1e\3\2"+
		"\2\2\u0d20\u0d21\3\2\2\2\u0d21\u0d23\3\2\2\2\u0d22\u0d20\3\2\2\2\u0d23"+
		"\u0d24\7U\2\2\u0d24\u0d26\3\2\2\2\u0d25\u0d10\3\2\2\2\u0d25\u0d11\3\2"+
		"\2\2\u0d26\u0173\3\2\2\2\u0d27\u0d29\5\u0176\u00bc\2\u0d28\u0d2a\5B\""+
		"\2\u0d29\u0d28\3\2\2\2\u0d29\u0d2a\3\2\2\2\u0d2a\u0d2c\3\2\2\2\u0d2b\u0d2d"+
		"\5\60\31\2\u0d2c\u0d2b\3\2\2\2\u0d2c\u0d2d\3\2\2\2\u0d2d\u0175\3\2\2\2"+
		"\u0d2e\u0d3f\5\u0178\u00bd\2\u0d2f\u0d31\7\7\2\2\u0d30\u0d2f\3\2\2\2\u0d31"+
		"\u0d34\3\2\2\2\u0d32\u0d30\3\2\2\2\u0d32\u0d33\3\2\2\2\u0d33\u0d35\3\2"+
		"\2\2\u0d34\u0d32\3\2\2\2\u0d35\u0d39\7o\2\2\u0d36\u0d38\7\7\2\2\u0d37"+
		"\u0d36\3\2\2\2\u0d38\u0d3b\3\2\2\2\u0d39\u0d37\3\2\2\2\u0d39\u0d3a\3\2"+
		"\2\2\u0d3a\u0d3c\3\2\2\2\u0d3b\u0d39\3\2\2\2\u0d3c\u0d3e\5\u0178\u00bd"+
		"\2\u0d3d\u0d32\3\2\2\2\u0d3e\u0d41\3\2\2\2\u0d3f\u0d3d\3\2\2\2\u0d3f\u0d40"+
		"\3\2\2\2\u0d40\u0177\3\2\2\2\u0d41\u0d3f\3\2\2\2\u0d42\u0d43\7\u009d\2"+
		"\2\u0d43\u0179\3\2\2\2\u0d44\u0d46\7\7\2\2\u0d45\u0d44\3\2\2\2\u0d46\u0d47"+
		"\3\2\2\2\u0d47\u0d45\3\2\2\2\u0d47\u0d48\3\2\2\2\u0d48\u0d57\3\2\2\2\u0d49"+
		"\u0d4b\7\7\2\2\u0d4a\u0d49\3\2\2\2\u0d4b\u0d4e\3\2\2\2\u0d4c\u0d4a\3\2"+
		"\2\2\u0d4c\u0d4d\3\2\2\2\u0d4d\u0d4f\3\2\2\2\u0d4e\u0d4c\3\2\2\2\u0d4f"+
		"\u0d53\7u\2\2\u0d50\u0d52\7\7\2\2\u0d51\u0d50\3\2\2\2\u0d52\u0d55\3\2"+
		"\2\2\u0d53\u0d51\3\2\2\2\u0d53\u0d54\3\2\2\2\u0d54\u0d57\3\2\2\2\u0d55"+
		"\u0d53\3\2\2\2\u0d56\u0d45\3\2\2\2\u0d56\u0d4c\3\2\2\2\u0d57\u017b\3\2"+
		"\2\2\u01fa\u017f\u0186\u018d\u0190\u0194\u0197\u019c\u01a3\u01a8\u01b1"+
		"\u01b5\u01c1\u01c6\u01c8\u01ca\u01ce\u01df\u01e2\u01e8\u01ef\u01f3\u01f8"+
		"\u01fc\u0201\u0208\u020c\u0211\u0215\u0218\u021e\u0225\u0229\u022e\u0235"+
		"\u0239\u023e\u0242\u0245\u024b\u0252\u0256\u025b\u025f\u0262\u0268\u026f"+
		"\u0273\u0278\u027f\u0283\u0286\u028c\u028f\u0297\u029e\u02a5\u02ab\u02ae"+
		"\u02b3\u02b9\u02bc\u02c1\u02c8\u02cf\u02d6\u02dd\u02e1\u02e7\u02ee\u02f4"+
		"\u02f8\u02ff\u0305\u030c\u0312\u0316\u031a\u0323\u032a\u0331\u0337\u033d"+
		"\u0340\u0345\u034b\u0352\u0355\u0358\u035d\u0363\u0369\u0370\u0377\u037b"+
		"\u0380\u0384\u038a\u0393\u0399\u039f\u03a9\u03ae\u03b4\u03bd\u03c3\u03c9"+
		"\u03cd\u03d3\u03da\u03e1\u03e7\u03ed\u03f1\u03f7\u03fc\u0402\u0406\u040c"+
		"\u0413\u041a\u0420\u0426\u042c\u0432\u0439\u0440\u0447\u044d\u0450\u0456"+
		"\u045b\u0460\u0465\u046d\u0474\u047a\u0481\u0487\u048c\u0492\u0497\u049c"+
		"\u04a3\u04a8\u04ac\u04af\u04b4\u04bd\u04c4\u04cd\u04d4\u04dc\u04e1\u04e7"+
		"\u04ed\u04f4\u04fa\u0501\u0505\u0508\u050e\u0515\u051c\u0520\u0525\u0529"+
		"\u052f\u0535\u053b\u0543\u0548\u054b\u0551\u0558\u055c\u0561\u056a\u056e"+
		"\u0573\u057a\u0580\u0583\u0588\u0591\u0598\u059e\u05a2\u05a8\u05ac\u05b1"+
		"\u05b5\u05b8\u05be\u05c5\u05c9\u05cf\u05d5\u05db\u05e3\u05e8\u05eb\u05f1"+
		"\u05f5\u05fa\u05ff\u0604\u060b\u060f\u0614\u0618\u061b\u0621\u0628\u062c"+
		"\u0632\u0639\u0640\u0646\u064c\u0655\u065c\u0660\u0666\u066a\u066c\u0671"+
		"\u0677\u067d\u0684\u0688\u068d\u0694\u0698\u069d\u06a1\u06a4\u06aa\u06b1"+
		"\u06b8\u06bd\u06c2\u06c9\u06cd\u06d2\u06d6\u06d9\u06df\u06e6\u06ea\u06ee"+
		"\u06f0\u06f6\u06fd\u0701\u0704\u070a\u070e\u0713\u071a\u0721\u0728\u072c"+
		"\u0731\u0735\u073b\u0742\u0749\u074f\u0752\u0757\u075d\u0763\u076a\u076e"+
		"\u0774\u077b\u0785\u0789\u078f\u0796\u079f\u07a5\u07a8\u07ad\u07b2\u07b4"+
		"\u07ba\u07c1\u07c6\u07cc\u07d3\u07d7\u07db\u07e0\u07e7\u07ee\u07f5\u07fe"+
		"\u0805\u080c\u0813\u081c\u0823\u082a\u0831\u0838\u0841\u0846\u0852\u085b"+
		"\u0864\u086d\u0876\u087d\u0887\u0889\u0892\u089b\u08a4\u08a8\u08b1\u08ba"+
		"\u08c3\u08cc\u08d5\u08db\u08e4\u08f5\u08ff\u0905\u090a\u0910\u0917\u091b"+
		"\u0920\u0924\u092a\u092e\u0933\u093a\u0940\u0946\u094d\u0954\u095b\u0960"+
		"\u0963\u0967\u096d\u0974\u097b\u0982\u0989\u0990\u0997\u099e\u09a5\u09ac"+
		"\u09b2\u09b9\u09bd\u09c1\u09c7\u09ce\u09d5\u09dc\u09e3\u09ea\u09ef\u09f4"+
		"\u09fd\u0a04\u0a0b\u0a11\u0a17\u0a1e\u0a23\u0a29\u0a30\u0a34\u0a3a\u0a3f"+
		"\u0a45\u0a4c\u0a52\u0a58\u0a5c\u0a62\u0a69\u0a6d\u0a73\u0a7a\u0a81\u0a88"+
		"\u0a8e\u0a94\u0a9b\u0aa4\u0aad\u0ab3\u0abc\u0ac0\u0acb\u0add\u0af7\u0afc"+
		"\u0afe\u0b08\u0b0a\u0b1d\u0b23\u0b27\u0b2c\u0b33\u0b36\u0b3c\u0b45\u0b4c"+
		"\u0b52\u0b5a\u0b61\u0b65\u0b67\u0b6d\u0b74\u0b79\u0b7e\u0b85\u0b8c\u0b90"+
		"\u0b95\u0b99\u0b9e\u0ba5\u0bab\u0bb2\u0bb8\u0bbf\u0bc5\u0bcc\u0bd2\u0bd9"+
		"\u0bdf\u0be6\u0bec\u0bf3\u0bf9\u0c00\u0c06\u0c0d\u0c13\u0c1a\u0c20\u0c27"+
		"\u0c2d\u0c34\u0c3a\u0c41\u0c47\u0c4e\u0c54\u0c5b\u0c61\u0c68\u0c6e\u0c77"+
		"\u0c80\u0c86\u0c8d\u0c95\u0c98\u0c9b\u0c9f\u0ca2\u0ca5\u0caa\u0cb3\u0cba"+
		"\u0cc1\u0cc7\u0ccd\u0cd5\u0cda\u0ce1\u0ce8\u0cef\u0cf2\u0cf4\u0cfa\u0d08"+
		"\u0d0d\u0d15\u0d1b\u0d20\u0d25\u0d29\u0d2c\u0d32\u0d39\u0d3f\u0d47\u0d4c"+
		"\u0d53\u0d56";
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