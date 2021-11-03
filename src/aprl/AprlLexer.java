// Generated from C:/Users/erik-/IdeaProjects/AprlC/src/aprl\AprlLexer.g4 by ANTLR 4.9.1
package aprl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AprlLexer extends Lexer {
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
		LineString=1, MultiLineString=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "LineString", "MultiLineString"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DelimitedComment", "DocComment", "LineComment", "WS", "NL", "USING", 
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
			"SINGLE_QUOTE", "QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", "DecDigit", "IntegerLiteral", 
			"LongLiteral", "ShortLiteral", "ByteLiteral", "WholeIntegerLiteral", 
			"NaturalNumberLiteral", "FloatingPointLiteral", "FloatLiteral", "DoubleLiteral", 
			"ScientificNumberLiteral", "ComplexLiteral", "HexLiteral", "HexDigit", 
			"HexCharacter", "BinLiteral", "BinDigit", "BinCharacter", "OctalLiteral", 
			"OctalDigit", "OctalCharacter", "BooleanLiteral", "TrileanLiteral", "Identifier", 
			"FieldIdentifier", "CharacterLiteral", "EscapeSeq", "UniCharacterLiteral", 
			"EscapedIdentifier", "Letter", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", 
			"UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", 
			"UNICODE_CLASS_NL", "QUOTE_CLOSE", "LineStrRef", "LineStrText", "LineStrEscapedChar", 
			"LineStrExprStart", "TRIPLE_QUOTE_CLOSE", "MultiLineStrQuote", "MultiLineStrRef", 
			"MultiLineStrText", "MultiLineStrEscapedChar", "MultiLineStrExprStart", 
			"MultiLineNL"
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


	public AprlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AprlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00aa\u0513\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR"+
		"\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4"+
		"^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\t"+
		"i\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4"+
		"u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177"+
		"\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084"+
		"\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088"+
		"\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d"+
		"\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091"+
		"\4\u0092\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096"+
		"\t\u0096\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a"+
		"\4\u009b\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f"+
		"\t\u009f\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3"+
		"\4\u00a4\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8"+
		"\t\u00a8\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac"+
		"\4\u00ad\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1"+
		"\t\u00b1\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5"+
		"\4\u00b6\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\u0179\n\2\f\2\16\2\u017c\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u0188\n\3\f\3\16\3\u018b\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4\u0196\n\4\f\4\16\4\u0199\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6\u01a4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\3:\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3Q\3R\3"+
		"R\3R\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3"+
		"[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\5^\u0370\n^\3_\3_\3_\3_\3_\5_\u0377"+
		"\n_\3`\3`\3`\5`\u037c\n`\3a\3a\3a\3a\3a\5a\u0383\na\3b\3b\3b\5b\u0388"+
		"\nb\3c\3c\3c\3c\3c\5c\u038f\nc\3d\3d\3e\3e\3f\3f\3f\3g\3g\3g\3g\3h\3h"+
		"\3h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3l\3l\3l\3m\3m\3n\3n\3o\3o\3o\3p\3p"+
		"\3q\3q\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x"+
		"\3y\3y\3y\3y\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3}\3~\3~\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0403"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u040a\n\u008b"+
		"\3\u008c\3\u008c\5\u008c\u040e\n\u008c\3\u008d\5\u008d\u0411\n\u008d\3"+
		"\u008d\3\u008d\3\u008e\6\u008e\u0416\n\u008e\r\u008e\16\u008e\u0417\3"+
		"\u008e\3\u008e\3\u008e\7\u008e\u041d\n\u008e\f\u008e\16\u008e\u0420\13"+
		"\u008e\3\u008e\3\u008e\5\u008e\u0424\n\u008e\3\u008f\5\u008f\u0427\n\u008f"+
		"\3\u008f\5\u008f\u042a\n\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0432\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091"+
		"\u0438\n\u0091\3\u0091\5\u0091\u043b\n\u0091\3\u0091\3\u0091\3\u0091\5"+
		"\u0091\u0440\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5"+
		"\u0093\u0448\n\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u044d\n\u0093\3\u0094"+
		"\5\u0094\u0450\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094"+
		"\u0457\n\u0094\f\u0094\16\u0094\u045a\13\u0094\3\u0094\3\u0094\5\u0094"+
		"\u045e\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u0464\n\u0096\3"+
		"\u0097\5\u0097\u0467\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\7"+
		"\u0097\u046e\n\u0097\f\u0097\16\u0097\u0471\13\u0097\3\u0097\3\u0097\5"+
		"\u0097\u0475\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u047b\n\u0099"+
		"\3\u009a\5\u009a\u047e\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u0485\n\u009a\f\u009a\16\u009a\u0488\13\u009a\3\u009a\3\u009a"+
		"\5\u009a\u048c\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u0492\n"+
		"\u009c\3\u009d\3\u009d\5\u009d\u0496\n\u009d\3\u009e\3\u009e\5\u009e\u049a"+
		"\n\u009e\3\u009f\3\u009f\5\u009f\u049e\n\u009f\3\u009f\3\u009f\3\u009f"+
		"\7\u009f\u04a3\n\u009f\f\u009f\16\u009f\u04a6\13\u009f\3\u009f\3\u009f"+
		"\6\u009f\u04aa\n\u009f\r\u009f\16\u009f\u04ab\3\u009f\5\u009f\u04af\n"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u04b7\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u04bd\n\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u04cf\n\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa"+
		"\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00af\6\u00af\u04e6\n\u00af\r\u00af\16\u00af\u04e7"+
		"\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u04ed\n\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\5\u00b2\u04f3\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b3\6\u00b3\u04fc\n\u00b3\r\u00b3\16\u00b3\u04fd\3\u00b4"+
		"\3\u00b4\3\u00b5\6\u00b5\u0503\n\u00b5\r\u00b5\16\u00b5\u0504\3\u00b5"+
		"\5\u00b5\u0508\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\4\u017a\u0189\2\u00b9\5\3\7\4\t\5\13"+
		"\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177"+
		"@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093"+
		"J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7"+
		"T\u00a9U\u00abV\u00adW\u00afX\u00b1Y\u00b3Z\u00b5[\u00b7\\\u00b9]\u00bb"+
		"^\u00bd_\u00bf`\u00c1a\u00c3b\u00c5c\u00c7d\u00c9e\u00cbf\u00cdg\u00cf"+
		"h\u00d1i\u00d3j\u00d5k\u00d7l\u00d9m\u00dbn\u00ddo\u00dfp\u00e1q\u00e3"+
		"r\u00e5s\u00e7t\u00e9u\u00ebv\u00edw\u00efx\u00f1y\u00f3z\u00f5{\u00f7"+
		"|\u00f9}\u00fb~\u00fd\177\u00ff\u0080\u0101\u0081\u0103\u0082\u0105\u0083"+
		"\u0107\u0084\u0109\u0085\u010b\u0086\u010d\u0087\u010f\u0088\u0111\2\u0113"+
		"\u0089\u0115\u008a\u0117\u008b\u0119\u008c\u011b\2\u011d\2\u011f\2\u0121"+
		"\u008d\u0123\u008e\u0125\2\u0127\u008f\u0129\u0090\u012b\2\u012d\2\u012f"+
		"\u0091\u0131\2\u0133\2\u0135\u0092\u0137\2\u0139\2\u013b\u0093\u013d\u0094"+
		"\u013f\u0095\u0141\u0096\u0143\u0097\u0145\2\u0147\2\u0149\2\u014b\2\u014d"+
		"\u0098\u014f\u0099\u0151\u009a\u0153\u009b\u0155\u009c\u0157\u009d\u0159"+
		"\u009e\u015b\u009f\u015d\u00a0\u015f\u00a1\u0161\u00a2\u0163\u00a3\u0165"+
		"\u00a4\u0167\u00a5\u0169\u00a6\u016b\u00a7\u016d\u00a8\u016f\u00a9\u0171"+
		"\u00aa\5\2\3\4\34\4\2\f\f\17\17\5\2\13\13\16\16\"\"\3\2\62;\4\2NNnn\4"+
		"\2UUuu\4\2DDdd\3\2//\4\2HHhh\4\2FFff\4\2GGgg\4\2LLll\4\2ZZzz\5\2\62;C"+
		"Hch\3\2\62\63\4\2QQqq\3\2\629\3\2bb\n\2$$&&))^^ddppttvv\u0248\2c|\u00b7"+
		"\u00b7\u00e1\u00f8\u00fa\u0101\u0103\u0103\u0105\u0105\u0107\u0107\u0109"+
		"\u0109\u010b\u010b\u010d\u010d\u010f\u010f\u0111\u0111\u0113\u0113\u0115"+
		"\u0115\u0117\u0117\u0119\u0119\u011b\u011b\u011d\u011d\u011f\u011f\u0121"+
		"\u0121\u0123\u0123\u0125\u0125\u0127\u0127\u0129\u0129\u012b\u012b\u012d"+
		"\u012d\u012f\u012f\u0131\u0131\u0133\u0133\u0135\u0135\u0137\u0137\u0139"+
		"\u013a\u013c\u013c\u013e\u013e\u0140\u0140\u0142\u0142\u0144\u0144\u0146"+
		"\u0146\u0148\u0148\u014a\u014b\u014d\u014d\u014f\u014f\u0151\u0151\u0153"+
		"\u0153\u0155\u0155\u0157\u0157\u0159\u0159\u015b\u015b\u015d\u015d\u015f"+
		"\u015f\u0161\u0161\u0163\u0163\u0165\u0165\u0167\u0167\u0169\u0169\u016b"+
		"\u016b\u016d\u016d\u016f\u016f\u0171\u0171\u0173\u0173\u0175\u0175\u0177"+
		"\u0177\u0179\u0179\u017c\u017c\u017e\u017e\u0180\u0182\u0185\u0185\u0187"+
		"\u0187\u018a\u018a\u018e\u018f\u0194\u0194\u0197\u0197\u019b\u019d\u01a0"+
		"\u01a0\u01a3\u01a3\u01a5\u01a5\u01a7\u01a7\u01aa\u01aa\u01ac\u01ad\u01af"+
		"\u01af\u01b2\u01b2\u01b6\u01b6\u01b8\u01b8\u01bb\u01bc\u01bf\u01c1\u01c8"+
		"\u01c8\u01cb\u01cb\u01ce\u01ce\u01d0\u01d0\u01d2\u01d2\u01d4\u01d4\u01d6"+
		"\u01d6\u01d8\u01d8\u01da\u01da\u01dc\u01dc\u01de\u01df\u01e1\u01e1\u01e3"+
		"\u01e3\u01e5\u01e5\u01e7\u01e7\u01e9\u01e9\u01eb\u01eb\u01ed\u01ed\u01ef"+
		"\u01ef\u01f1\u01f2\u01f5\u01f5\u01f7\u01f7\u01fb\u01fb\u01fd\u01fd\u01ff"+
		"\u01ff\u0201\u0201\u0203\u0203\u0205\u0205\u0207\u0207\u0209\u0209\u020b"+
		"\u020b\u020d\u020d\u020f\u020f\u0211\u0211\u0213\u0213\u0215\u0215\u0217"+
		"\u0217\u0219\u0219\u021b\u021b\u021d\u021d\u021f\u021f\u0221\u0221\u0223"+
		"\u0223\u0225\u0225\u0227\u0227\u0229\u0229\u022b\u022b\u022d\u022d\u022f"+
		"\u022f\u0231\u0231\u0233\u0233\u0235\u023b\u023e\u023e\u0241\u0242\u0244"+
		"\u0244\u0249\u0249\u024b\u024b\u024d\u024d\u024f\u024f\u0251\u0295\u0297"+
		"\u02b1\u0373\u0373\u0375\u0375\u0379\u0379\u037d\u037f\u0392\u0392\u03ae"+
		"\u03d0\u03d2\u03d3\u03d7\u03d9\u03db\u03db\u03dd\u03dd\u03df\u03df\u03e1"+
		"\u03e1\u03e3\u03e3\u03e5\u03e5\u03e7\u03e7\u03e9\u03e9\u03eb\u03eb\u03ed"+
		"\u03ed\u03ef\u03ef\u03f1\u03f5\u03f7\u03f7\u03fa\u03fa\u03fd\u03fe\u0432"+
		"\u0461\u0463\u0463\u0465\u0465\u0467\u0467\u0469\u0469\u046b\u046b\u046d"+
		"\u046d\u046f\u046f\u0471\u0471\u0473\u0473\u0475\u0475\u0477\u0477\u0479"+
		"\u0479\u047b\u047b\u047d\u047d\u047f\u047f\u0481\u0481\u0483\u0483\u048d"+
		"\u048d\u048f\u048f\u0491\u0491\u0493\u0493\u0495\u0495\u0497\u0497\u0499"+
		"\u0499\u049b\u049b\u049d\u049d\u049f\u049f\u04a1\u04a1\u04a3\u04a3\u04a5"+
		"\u04a5\u04a7\u04a7\u04a9\u04a9\u04ab\u04ab\u04ad\u04ad\u04af\u04af\u04b1"+
		"\u04b1\u04b3\u04b3\u04b5\u04b5\u04b7\u04b7\u04b9\u04b9\u04bb\u04bb\u04bd"+
		"\u04bd\u04bf\u04bf\u04c1\u04c1\u04c4\u04c4\u04c6\u04c6\u04c8\u04c8\u04ca"+
		"\u04ca\u04cc\u04cc\u04ce\u04ce\u04d0\u04d1\u04d3\u04d3\u04d5\u04d5\u04d7"+
		"\u04d7\u04d9\u04d9\u04db\u04db\u04dd\u04dd\u04df\u04df\u04e1\u04e1\u04e3"+
		"\u04e3\u04e5\u04e5\u04e7\u04e7\u04e9\u04e9\u04eb\u04eb\u04ed\u04ed\u04ef"+
		"\u04ef\u04f1\u04f1\u04f3\u04f3\u04f5\u04f5\u04f7\u04f7\u04f9\u04f9\u04fb"+
		"\u04fb\u04fd\u04fd\u04ff\u04ff\u0501\u0501\u0503\u0503\u0505\u0505\u0507"+
		"\u0507\u0509\u0509\u050b\u050b\u050d\u050d\u050f\u050f\u0511\u0511\u0513"+
		"\u0513\u0515\u0515\u0517\u0517\u0519\u0519\u051b\u051b\u051d\u051d\u051f"+
		"\u051f\u0521\u0521\u0523\u0523\u0525\u0525\u0527\u0527\u0529\u0529\u0563"+
		"\u0589\u1d02\u1d2d\u1d6d\u1d79\u1d7b\u1d9c\u1e03\u1e03\u1e05\u1e05\u1e07"+
		"\u1e07\u1e09\u1e09\u1e0b\u1e0b\u1e0d\u1e0d\u1e0f\u1e0f\u1e11\u1e11\u1e13"+
		"\u1e13\u1e15\u1e15\u1e17\u1e17\u1e19\u1e19\u1e1b\u1e1b\u1e1d\u1e1d\u1e1f"+
		"\u1e1f\u1e21\u1e21\u1e23\u1e23\u1e25\u1e25\u1e27\u1e27\u1e29\u1e29\u1e2b"+
		"\u1e2b\u1e2d\u1e2d\u1e2f\u1e2f\u1e31\u1e31\u1e33\u1e33\u1e35\u1e35\u1e37"+
		"\u1e37\u1e39\u1e39\u1e3b\u1e3b\u1e3d\u1e3d\u1e3f\u1e3f\u1e41\u1e41\u1e43"+
		"\u1e43\u1e45\u1e45\u1e47\u1e47\u1e49\u1e49\u1e4b\u1e4b\u1e4d\u1e4d\u1e4f"+
		"\u1e4f\u1e51\u1e51\u1e53\u1e53\u1e55\u1e55\u1e57\u1e57\u1e59\u1e59\u1e5b"+
		"\u1e5b\u1e5d\u1e5d\u1e5f\u1e5f\u1e61\u1e61\u1e63\u1e63\u1e65\u1e65\u1e67"+
		"\u1e67\u1e69\u1e69\u1e6b\u1e6b\u1e6d\u1e6d\u1e6f\u1e6f\u1e71\u1e71\u1e73"+
		"\u1e73\u1e75\u1e75\u1e77\u1e77\u1e79\u1e79\u1e7b\u1e7b\u1e7d\u1e7d\u1e7f"+
		"\u1e7f\u1e81\u1e81\u1e83\u1e83\u1e85\u1e85\u1e87\u1e87\u1e89\u1e89\u1e8b"+
		"\u1e8b\u1e8d\u1e8d\u1e8f\u1e8f\u1e91\u1e91\u1e93\u1e93\u1e95\u1e95\u1e97"+
		"\u1e9f\u1ea1\u1ea1\u1ea3\u1ea3\u1ea5\u1ea5\u1ea7\u1ea7\u1ea9\u1ea9\u1eab"+
		"\u1eab\u1ead\u1ead\u1eaf\u1eaf\u1eb1\u1eb1\u1eb3\u1eb3\u1eb5\u1eb5\u1eb7"+
		"\u1eb7\u1eb9\u1eb9\u1ebb\u1ebb\u1ebd\u1ebd\u1ebf\u1ebf\u1ec1\u1ec1\u1ec3"+
		"\u1ec3\u1ec5\u1ec5\u1ec7\u1ec7\u1ec9\u1ec9\u1ecb\u1ecb\u1ecd\u1ecd\u1ecf"+
		"\u1ecf\u1ed1\u1ed1\u1ed3\u1ed3\u1ed5\u1ed5\u1ed7\u1ed7\u1ed9\u1ed9\u1edb"+
		"\u1edb\u1edd\u1edd\u1edf\u1edf\u1ee1\u1ee1\u1ee3\u1ee3\u1ee5\u1ee5\u1ee7"+
		"\u1ee7\u1ee9\u1ee9\u1eeb\u1eeb\u1eed\u1eed\u1eef\u1eef\u1ef1\u1ef1\u1ef3"+
		"\u1ef3\u1ef5\u1ef5\u1ef7\u1ef7\u1ef9\u1ef9\u1efb\u1efb\u1efd\u1efd\u1eff"+
		"\u1eff\u1f01\u1f09\u1f12\u1f17\u1f22\u1f29\u1f32\u1f39\u1f42\u1f47\u1f52"+
		"\u1f59\u1f62\u1f69\u1f72\u1f7f\u1f82\u1f89\u1f92\u1f99\u1fa2\u1fa9\u1fb2"+
		"\u1fb6\u1fb8\u1fb9\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fc9\u1fd2\u1fd5\u1fd8"+
		"\u1fd9\u1fe2\u1fe9\u1ff4\u1ff6\u1ff8\u1ff9\u210c\u210c\u2110\u2111\u2115"+
		"\u2115\u2131\u2131\u2136\u2136\u213b\u213b\u213e\u213f\u2148\u214b\u2150"+
		"\u2150\u2186\u2186\u2c32\u2c60\u2c63\u2c63\u2c67\u2c68\u2c6a\u2c6a\u2c6c"+
		"\u2c6c\u2c6e\u2c6e\u2c73\u2c73\u2c75\u2c76\u2c78\u2c7d\u2c83\u2c83\u2c85"+
		"\u2c85\u2c87\u2c87\u2c89\u2c89\u2c8b\u2c8b\u2c8d\u2c8d\u2c8f\u2c8f\u2c91"+
		"\u2c91\u2c93\u2c93\u2c95\u2c95\u2c97\u2c97\u2c99\u2c99\u2c9b\u2c9b\u2c9d"+
		"\u2c9d\u2c9f\u2c9f\u2ca1\u2ca1\u2ca3\u2ca3\u2ca5\u2ca5\u2ca7\u2ca7\u2ca9"+
		"\u2ca9\u2cab\u2cab\u2cad\u2cad\u2caf\u2caf\u2cb1\u2cb1\u2cb3\u2cb3\u2cb5"+
		"\u2cb5\u2cb7\u2cb7\u2cb9\u2cb9\u2cbb\u2cbb\u2cbd\u2cbd\u2cbf\u2cbf\u2cc1"+
		"\u2cc1\u2cc3\u2cc3\u2cc5\u2cc5\u2cc7\u2cc7\u2cc9\u2cc9\u2ccb\u2ccb\u2ccd"+
		"\u2ccd\u2ccf\u2ccf\u2cd1\u2cd1\u2cd3\u2cd3\u2cd5\u2cd5\u2cd7\u2cd7\u2cd9"+
		"\u2cd9\u2cdb\u2cdb\u2cdd\u2cdd\u2cdf\u2cdf\u2ce1\u2ce1\u2ce3\u2ce3\u2ce5"+
		"\u2ce6\u2cee\u2cee\u2cf0\u2cf0\u2cf5\u2cf5\u2d02\u2d27\u2d29\u2d29\u2d2f"+
		"\u2d2f\ua643\ua643\ua645\ua645\ua647\ua647\ua649\ua649\ua64b\ua64b\ua64d"+
		"\ua64d\ua64f\ua64f\ua651\ua651\ua653\ua653\ua655\ua655\ua657\ua657\ua659"+
		"\ua659\ua65b\ua65b\ua65d\ua65d\ua65f\ua65f\ua661\ua661\ua663\ua663\ua665"+
		"\ua665\ua667\ua667\ua669\ua669\ua66b\ua66b\ua66d\ua66d\ua66f\ua66f\ua683"+
		"\ua683\ua685\ua685\ua687\ua687\ua689\ua689\ua68b\ua68b\ua68d\ua68d\ua68f"+
		"\ua68f\ua691\ua691\ua693\ua693\ua695\ua695\ua697\ua697\ua699\ua699\ua725"+
		"\ua725\ua727\ua727\ua729\ua729\ua72b\ua72b\ua72d\ua72d\ua72f\ua72f\ua731"+
		"\ua733\ua735\ua735\ua737\ua737\ua739\ua739\ua73b\ua73b\ua73d\ua73d\ua73f"+
		"\ua73f\ua741\ua741\ua743\ua743\ua745\ua745\ua747\ua747\ua749\ua749\ua74b"+
		"\ua74b\ua74d\ua74d\ua74f\ua74f\ua751\ua751\ua753\ua753\ua755\ua755\ua757"+
		"\ua757\ua759\ua759\ua75b\ua75b\ua75d\ua75d\ua75f\ua75f\ua761\ua761\ua763"+
		"\ua763\ua765\ua765\ua767\ua767\ua769\ua769\ua76b\ua76b\ua76d\ua76d\ua76f"+
		"\ua76f\ua771\ua771\ua773\ua77a\ua77c\ua77c\ua77e\ua77e\ua781\ua781\ua783"+
		"\ua783\ua785\ua785\ua787\ua787\ua789\ua789\ua78e\ua78e\ua790\ua790\ua793"+
		"\ua793\ua795\ua795\ua7a3\ua7a3\ua7a5\ua7a5\ua7a7\ua7a7\ua7a9\ua7a9\ua7ab"+
		"\ua7ab\ua7fc\ua7fc\ufb02\ufb08\ufb15\ufb19\uff43\uff5c\65\2\u02b2\u02c3"+
		"\u02c8\u02d3\u02e2\u02e6\u02ee\u02ee\u02f0\u02f0\u0376\u0376\u037c\u037c"+
		"\u055b\u055b\u0642\u0642\u06e7\u06e8\u07f6\u07f7\u07fc\u07fc\u081c\u081c"+
		"\u0826\u0826\u082a\u082a\u0973\u0973\u0e48\u0e48\u0ec8\u0ec8\u10fe\u10fe"+
		"\u17d9\u17d9\u1845\u1845\u1aa9\u1aa9\u1c7a\u1c7f\u1d2e\u1d6c\u1d7a\u1d7a"+
		"\u1d9d\u1dc1\u2073\u2073\u2081\u2081\u2092\u209e\u2c7e\u2c7f\u2d71\u2d71"+
		"\u2e31\u2e31\u3007\u3007\u3033\u3037\u303d\u303d\u309f\u30a0\u30fe\u3100"+
		"\ua017\ua017\ua4fa\ua4ff\ua60e\ua60e\ua681\ua681\ua719\ua721\ua772\ua772"+
		"\ua78a\ua78a\ua7fa\ua7fb\ua9d1\ua9d1\uaa72\uaa72\uaadf\uaadf\uaaf5\uaaf6"+
		"\uff72\uff72\uffa0\uffa1\u0123\2\u00ac\u00ac\u00bc\u00bc\u01bd\u01bd\u01c2"+
		"\u01c5\u0296\u0296\u05d2\u05ec\u05f2\u05f4\u0622\u0641\u0643\u064c\u0670"+
		"\u0671\u0673\u06d5\u06d7\u06d7\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712"+
		"\u0712\u0714\u0731\u074f\u07a7\u07b3\u07b3\u07cc\u07ec\u0802\u0817\u0842"+
		"\u085a\u08a2\u08a2\u08a4\u08ae\u0906\u093b\u093f\u093f\u0952\u0952\u095a"+
		"\u0963\u0974\u0979\u097b\u0981\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac"+
		"\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1"+
		"\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34"+
		"\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87"+
		"\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf"+
		"\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c"+
		"\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73"+
		"\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e"+
		"\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0bd2\u0bd2\u0c07"+
		"\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c3f\u0c3f\u0c5a"+
		"\u0c5b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e\u0d10"+
		"\u0d12\u0d14\u0d3c\u0d3f\u0d3f\u0d50\u0d50\u0d62\u0d63\u0d7c\u0d81\u0d87"+
		"\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34"+
		"\u0e35\u0e42\u0e47\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f"+
		"\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac"+
		"\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ede\u0ee1\u0f02"+
		"\u0f02\u0f42\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c\u1041\u1041\u1052"+
		"\u1057\u105c\u105f\u1063\u1063\u1067\u1068\u1070\u1072\u1077\u1083\u1090"+
		"\u1090\u10d2\u10fc\u10ff\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c"+
		"\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2"+
		"\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382"+
		"\u1391\u13a2\u13f6\u1403\u166e\u1671\u1681\u1683\u169c\u16a2\u16ec\u1702"+
		"\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782"+
		"\u17b5\u17de\u17de\u1822\u1844\u1846\u1879\u1882\u18aa\u18ac\u18ac\u18b2"+
		"\u18f7\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ad\u19c3\u19c9\u1a02"+
		"\u1a18\u1a22\u1a56\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1\u1bbc"+
		"\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c79\u1ceb\u1cee\u1cf0\u1cf3\u1cf7"+
		"\u1cf8\u2137\u213a\u2d32\u2d69\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2"+
		"\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3008"+
		"\u3008\u303e\u303e\u3043\u3098\u30a1\u30a1\u30a3\u30fc\u3101\u3101\u3107"+
		"\u312f\u3133\u3190\u31a2\u31bc\u31f2\u3201\u3402\u3402\u4db7\u4db7\u4e02"+
		"\u4e02\u9fce\u9fce\ua002\ua016\ua018\ua48e\ua4d2\ua4f9\ua502\ua60d\ua612"+
		"\ua621\ua62c\ua62d\ua670\ua670\ua6a2\ua6e7\ua7fd\ua803\ua805\ua807\ua809"+
		"\ua80c\ua80e\ua824\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua8fd\ua90c"+
		"\ua927\ua932\ua948\ua962\ua97e\ua986\ua9b4\uaa02\uaa2a\uaa42\uaa44\uaa46"+
		"\uaa4d\uaa62\uaa71\uaa73\uaa78\uaa7c\uaa7c\uaa82\uaab1\uaab3\uaab3\uaab7"+
		"\uaab8\uaabb\uaabf\uaac2\uaac2\uaac4\uaac4\uaadd\uaade\uaae2\uaaec\uaaf4"+
		"\uaaf4\uab03\uab08\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a\uab30\uabc2"+
		"\uabe4\uac02\uac02\ud7a5\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72"+
		"\ufadb\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42"+
		"\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2"+
		"\ufdfd\ufe72\ufe76\ufe78\ufefe\uff68\uff71\uff73\uff9f\uffa2\uffc0\uffc4"+
		"\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\f\2\u01c7\u01c7\u01ca\u01ca"+
		"\u01cd\u01cd\u01f4\u01f4\u1f8a\u1f91\u1f9a\u1fa1\u1faa\u1fb1\u1fbe\u1fbe"+
		"\u1fce\u1fce\u1ffe\u1ffe\u0242\2C\\\u00c2\u00d8\u00da\u00e0\u0102\u0102"+
		"\u0104\u0104\u0106\u0106\u0108\u0108\u010a\u010a\u010c\u010c\u010e\u010e"+
		"\u0110\u0110\u0112\u0112\u0114\u0114\u0116\u0116\u0118\u0118\u011a\u011a"+
		"\u011c\u011c\u011e\u011e\u0120\u0120\u0122\u0122\u0124\u0124\u0126\u0126"+
		"\u0128\u0128\u012a\u012a\u012c\u012c\u012e\u012e\u0130\u0130\u0132\u0132"+
		"\u0134\u0134\u0136\u0136\u0138\u0138\u013b\u013b\u013d\u013d\u013f\u013f"+
		"\u0141\u0141\u0143\u0143\u0145\u0145\u0147\u0147\u0149\u0149\u014c\u014c"+
		"\u014e\u014e\u0150\u0150\u0152\u0152\u0154\u0154\u0156\u0156\u0158\u0158"+
		"\u015a\u015a\u015c\u015c\u015e\u015e\u0160\u0160\u0162\u0162\u0164\u0164"+
		"\u0166\u0166\u0168\u0168\u016a\u016a\u016c\u016c\u016e\u016e\u0170\u0170"+
		"\u0172\u0172\u0174\u0174\u0176\u0176\u0178\u0178\u017a\u017b\u017d\u017d"+
		"\u017f\u017f\u0183\u0184\u0186\u0186\u0188\u0189\u018b\u018d\u0190\u0193"+
		"\u0195\u0196\u0198\u019a\u019e\u019f\u01a1\u01a2\u01a4\u01a4\u01a6\u01a6"+
		"\u01a8\u01a9\u01ab\u01ab\u01ae\u01ae\u01b0\u01b1\u01b3\u01b5\u01b7\u01b7"+
		"\u01b9\u01ba\u01be\u01be\u01c6\u01c6\u01c9\u01c9\u01cc\u01cc\u01cf\u01cf"+
		"\u01d1\u01d1\u01d3\u01d3\u01d5\u01d5\u01d7\u01d7\u01d9\u01d9\u01db\u01db"+
		"\u01dd\u01dd\u01e0\u01e0\u01e2\u01e2\u01e4\u01e4\u01e6\u01e6\u01e8\u01e8"+
		"\u01ea\u01ea\u01ec\u01ec\u01ee\u01ee\u01f0\u01f0\u01f3\u01f3\u01f6\u01f6"+
		"\u01f8\u01fa\u01fc\u01fc\u01fe\u01fe\u0200\u0200\u0202\u0202\u0204\u0204"+
		"\u0206\u0206\u0208\u0208\u020a\u020a\u020c\u020c\u020e\u020e\u0210\u0210"+
		"\u0212\u0212\u0214\u0214\u0216\u0216\u0218\u0218\u021a\u021a\u021c\u021c"+
		"\u021e\u021e\u0220\u0220\u0222\u0222\u0224\u0224\u0226\u0226\u0228\u0228"+
		"\u022a\u022a\u022c\u022c\u022e\u022e\u0230\u0230\u0232\u0232\u0234\u0234"+
		"\u023c\u023d\u023f\u0240\u0243\u0243\u0245\u0248\u024a\u024a\u024c\u024c"+
		"\u024e\u024e\u0250\u0250\u0372\u0372\u0374\u0374\u0378\u0378\u0388\u0388"+
		"\u038a\u038c\u038e\u038e\u0390\u0391\u0393\u03a3\u03a5\u03ad\u03d1\u03d1"+
		"\u03d4\u03d6\u03da\u03da\u03dc\u03dc\u03de\u03de\u03e0\u03e0\u03e2\u03e2"+
		"\u03e4\u03e4\u03e6\u03e6\u03e8\u03e8\u03ea\u03ea\u03ec\u03ec\u03ee\u03ee"+
		"\u03f0\u03f0\u03f6\u03f6\u03f9\u03f9\u03fb\u03fc\u03ff\u0431\u0462\u0462"+
		"\u0464\u0464\u0466\u0466\u0468\u0468\u046a\u046a\u046c\u046c\u046e\u046e"+
		"\u0470\u0470\u0472\u0472\u0474\u0474\u0476\u0476\u0478\u0478\u047a\u047a"+
		"\u047c\u047c\u047e\u047e\u0480\u0480\u0482\u0482\u048c\u048c\u048e\u048e"+
		"\u0490\u0490\u0492\u0492\u0494\u0494\u0496\u0496\u0498\u0498\u049a\u049a"+
		"\u049c\u049c\u049e\u049e\u04a0\u04a0\u04a2\u04a2\u04a4\u04a4\u04a6\u04a6"+
		"\u04a8\u04a8\u04aa\u04aa\u04ac\u04ac\u04ae\u04ae\u04b0\u04b0\u04b2\u04b2"+
		"\u04b4\u04b4\u04b6\u04b6\u04b8\u04b8\u04ba\u04ba\u04bc\u04bc\u04be\u04be"+
		"\u04c0\u04c0\u04c2\u04c3\u04c5\u04c5\u04c7\u04c7\u04c9\u04c9\u04cb\u04cb"+
		"\u04cd\u04cd\u04cf\u04cf\u04d2\u04d2\u04d4\u04d4\u04d6\u04d6\u04d8\u04d8"+
		"\u04da\u04da\u04dc\u04dc\u04de\u04de\u04e0\u04e0\u04e2\u04e2\u04e4\u04e4"+
		"\u04e6\u04e6\u04e8\u04e8\u04ea\u04ea\u04ec\u04ec\u04ee\u04ee\u04f0\u04f0"+
		"\u04f2\u04f2\u04f4\u04f4\u04f6\u04f6\u04f8\u04f8\u04fa\u04fa\u04fc\u04fc"+
		"\u04fe\u04fe\u0500\u0500\u0502\u0502\u0504\u0504\u0506\u0506\u0508\u0508"+
		"\u050a\u050a\u050c\u050c\u050e\u050e\u0510\u0510\u0512\u0512\u0514\u0514"+
		"\u0516\u0516\u0518\u0518\u051a\u051a\u051c\u051c\u051e\u051e\u0520\u0520"+
		"\u0522\u0522\u0524\u0524\u0526\u0526\u0528\u0528\u0533\u0558\u10a2\u10c7"+
		"\u10c9\u10c9\u10cf\u10cf\u1e02\u1e02\u1e04\u1e04\u1e06\u1e06\u1e08\u1e08"+
		"\u1e0a\u1e0a\u1e0c\u1e0c\u1e0e\u1e0e\u1e10\u1e10\u1e12\u1e12\u1e14\u1e14"+
		"\u1e16\u1e16\u1e18\u1e18\u1e1a\u1e1a\u1e1c\u1e1c\u1e1e\u1e1e\u1e20\u1e20"+
		"\u1e22\u1e22\u1e24\u1e24\u1e26\u1e26\u1e28\u1e28\u1e2a\u1e2a\u1e2c\u1e2c"+
		"\u1e2e\u1e2e\u1e30\u1e30\u1e32\u1e32\u1e34\u1e34\u1e36\u1e36\u1e38\u1e38"+
		"\u1e3a\u1e3a\u1e3c\u1e3c\u1e3e\u1e3e\u1e40\u1e40\u1e42\u1e42\u1e44\u1e44"+
		"\u1e46\u1e46\u1e48\u1e48\u1e4a\u1e4a\u1e4c\u1e4c\u1e4e\u1e4e\u1e50\u1e50"+
		"\u1e52\u1e52\u1e54\u1e54\u1e56\u1e56\u1e58\u1e58\u1e5a\u1e5a\u1e5c\u1e5c"+
		"\u1e5e\u1e5e\u1e60\u1e60\u1e62\u1e62\u1e64\u1e64\u1e66\u1e66\u1e68\u1e68"+
		"\u1e6a\u1e6a\u1e6c\u1e6c\u1e6e\u1e6e\u1e70\u1e70\u1e72\u1e72\u1e74\u1e74"+
		"\u1e76\u1e76\u1e78\u1e78\u1e7a\u1e7a\u1e7c\u1e7c\u1e7e\u1e7e\u1e80\u1e80"+
		"\u1e82\u1e82\u1e84\u1e84\u1e86\u1e86\u1e88\u1e88\u1e8a\u1e8a\u1e8c\u1e8c"+
		"\u1e8e\u1e8e\u1e90\u1e90\u1e92\u1e92\u1e94\u1e94\u1e96\u1e96\u1ea0\u1ea0"+
		"\u1ea2\u1ea2\u1ea4\u1ea4\u1ea6\u1ea6\u1ea8\u1ea8\u1eaa\u1eaa\u1eac\u1eac"+
		"\u1eae\u1eae\u1eb0\u1eb0\u1eb2\u1eb2\u1eb4\u1eb4\u1eb6\u1eb6\u1eb8\u1eb8"+
		"\u1eba\u1eba\u1ebc\u1ebc\u1ebe\u1ebe\u1ec0\u1ec0\u1ec2\u1ec2\u1ec4\u1ec4"+
		"\u1ec6\u1ec6\u1ec8\u1ec8\u1eca\u1eca\u1ecc\u1ecc\u1ece\u1ece\u1ed0\u1ed0"+
		"\u1ed2\u1ed2\u1ed4\u1ed4\u1ed6\u1ed6\u1ed8\u1ed8\u1eda\u1eda\u1edc\u1edc"+
		"\u1ede\u1ede\u1ee0\u1ee0\u1ee2\u1ee2\u1ee4\u1ee4\u1ee6\u1ee6\u1ee8\u1ee8"+
		"\u1eea\u1eea\u1eec\u1eec\u1eee\u1eee\u1ef0\u1ef0\u1ef2\u1ef2\u1ef4\u1ef4"+
		"\u1ef6\u1ef6\u1ef8\u1ef8\u1efa\u1efa\u1efc\u1efc\u1efe\u1efe\u1f00\u1f00"+
		"\u1f0a\u1f11\u1f1a\u1f1f\u1f2a\u1f31\u1f3a\u1f41\u1f4a\u1f4f\u1f5b\u1f5b"+
		"\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f61\u1f6a\u1f71\u1fba\u1fbd\u1fca\u1fcd"+
		"\u1fda\u1fdd\u1fea\u1fee\u1ffa\u1ffd\u2104\u2104\u2109\u2109\u210d\u210f"+
		"\u2112\u2114\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a"+
		"\u212c\u212f\u2132\u2135\u2140\u2141\u2147\u2147\u2185\u2185\u2c02\u2c30"+
		"\u2c62\u2c62\u2c64\u2c66\u2c69\u2c69\u2c6b\u2c6b\u2c6d\u2c6d\u2c6f\u2c72"+
		"\u2c74\u2c74\u2c77\u2c77\u2c80\u2c82\u2c84\u2c84\u2c86\u2c86\u2c88\u2c88"+
		"\u2c8a\u2c8a\u2c8c\u2c8c\u2c8e\u2c8e\u2c90\u2c90\u2c92\u2c92\u2c94\u2c94"+
		"\u2c96\u2c96\u2c98\u2c98\u2c9a\u2c9a\u2c9c\u2c9c\u2c9e\u2c9e\u2ca0\u2ca0"+
		"\u2ca2\u2ca2\u2ca4\u2ca4\u2ca6\u2ca6\u2ca8\u2ca8\u2caa\u2caa\u2cac\u2cac"+
		"\u2cae\u2cae\u2cb0\u2cb0\u2cb2\u2cb2\u2cb4\u2cb4\u2cb6\u2cb6\u2cb8\u2cb8"+
		"\u2cba\u2cba\u2cbc\u2cbc\u2cbe\u2cbe\u2cc0\u2cc0\u2cc2\u2cc2\u2cc4\u2cc4"+
		"\u2cc6\u2cc6\u2cc8\u2cc8\u2cca\u2cca\u2ccc\u2ccc\u2cce\u2cce\u2cd0\u2cd0"+
		"\u2cd2\u2cd2\u2cd4\u2cd4\u2cd6\u2cd6\u2cd8\u2cd8\u2cda\u2cda\u2cdc\u2cdc"+
		"\u2cde\u2cde\u2ce0\u2ce0\u2ce2\u2ce2\u2ce4\u2ce4\u2ced\u2ced\u2cef\u2cef"+
		"\u2cf4\u2cf4\ua642\ua642\ua644\ua644\ua646\ua646\ua648\ua648\ua64a\ua64a"+
		"\ua64c\ua64c\ua64e\ua64e\ua650\ua650\ua652\ua652\ua654\ua654\ua656\ua656"+
		"\ua658\ua658\ua65a\ua65a\ua65c\ua65c\ua65e\ua65e\ua660\ua660\ua662\ua662"+
		"\ua664\ua664\ua666\ua666\ua668\ua668\ua66a\ua66a\ua66c\ua66c\ua66e\ua66e"+
		"\ua682\ua682\ua684\ua684\ua686\ua686\ua688\ua688\ua68a\ua68a\ua68c\ua68c"+
		"\ua68e\ua68e\ua690\ua690\ua692\ua692\ua694\ua694\ua696\ua696\ua698\ua698"+
		"\ua724\ua724\ua726\ua726\ua728\ua728\ua72a\ua72a\ua72c\ua72c\ua72e\ua72e"+
		"\ua730\ua730\ua734\ua734\ua736\ua736\ua738\ua738\ua73a\ua73a\ua73c\ua73c"+
		"\ua73e\ua73e\ua740\ua740\ua742\ua742\ua744\ua744\ua746\ua746\ua748\ua748"+
		"\ua74a\ua74a\ua74c\ua74c\ua74e\ua74e\ua750\ua750\ua752\ua752\ua754\ua754"+
		"\ua756\ua756\ua758\ua758\ua75a\ua75a\ua75c\ua75c\ua75e\ua75e\ua760\ua760"+
		"\ua762\ua762\ua764\ua764\ua766\ua766\ua768\ua768\ua76a\ua76a\ua76c\ua76c"+
		"\ua76e\ua76e\ua770\ua770\ua77b\ua77b\ua77d\ua77d\ua77f\ua780\ua782\ua782"+
		"\ua784\ua784\ua786\ua786\ua788\ua788\ua78d\ua78d\ua78f\ua78f\ua792\ua792"+
		"\ua794\ua794\ua7a2\ua7a2\ua7a4\ua7a4\ua7a6\ua7a6\ua7a8\ua7a8\ua7aa\ua7aa"+
		"\ua7ac\ua7ac\uff23\uff3c%\2\62;\u0662\u066b\u06f2\u06fb\u07c2\u07cb\u0968"+
		"\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be8\u0bf1\u0c68"+
		"\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042"+
		"\u104b\u1092\u109b\u17e2\u17eb\u1812\u181b\u1948\u1951\u19d2\u19db\u1a82"+
		"\u1a8b\u1a92\u1a9b\u1b52\u1b5b\u1bb2\u1bbb\u1c42\u1c4b\u1c52\u1c5b\ua622"+
		"\ua62b\ua8d2\ua8db\ua902\ua90b\ua9d2\ua9db\uaa52\uaa5b\uabf2\uabfb\uff12"+
		"\uff1b\t\2\u16f0\u16f2\u2162\u2184\u2187\u218a\u3009\u3009\u3023\u302b"+
		"\u303a\u303c\ua6e8\ua6f1\5\2$$&&^^\2\u0540\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff"+
		"\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2"+
		"\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0113"+
		"\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u0121\3\2\2"+
		"\2\2\u0123\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012f\3\2\2\2\2\u0135"+
		"\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2"+
		"\2\2\u0143\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0151\3\2\2\2\2\u0153"+
		"\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159\3\2\2\2\3\u015b\3\2\2"+
		"\2\3\u015d\3\2\2\2\3\u015f\3\2\2\2\3\u0161\3\2\2\2\3\u0163\3\2\2\2\4\u0165"+
		"\3\2\2\2\4\u0167\3\2\2\2\4\u0169\3\2\2\2\4\u016b\3\2\2\2\4\u016d\3\2\2"+
		"\2\4\u016f\3\2\2\2\4\u0171\3\2\2\2\5\u0173\3\2\2\2\7\u0182\3\2\2\2\t\u0191"+
		"\3\2\2\2\13\u019c\3\2\2\2\r\u01a3\3\2\2\2\17\u01a5\3\2\2\2\21\u01ab\3"+
		"\2\2\2\23\u01b1\3\2\2\2\25\u01b7\3\2\2\2\27\u01c1\3\2\2\2\31\u01c8\3\2"+
		"\2\2\33\u01d1\3\2\2\2\35\u01db\3\2\2\2\37\u01e0\3\2\2\2!\u01eb\3\2\2\2"+
		"#\u01f3\3\2\2\2%\u01f8\3\2\2\2\'\u01fe\3\2\2\2)\u0202\3\2\2\2+\u0209\3"+
		"\2\2\2-\u020e\3\2\2\2/\u0213\3\2\2\2\61\u021b\3\2\2\2\63\u0223\3\2\2\2"+
		"\65\u0229\3\2\2\2\67\u0230\3\2\2\29\u0237\3\2\2\2;\u023e\3\2\2\2=\u0242"+
		"\3\2\2\2?\u0248\3\2\2\2A\u024c\3\2\2\2C\u0250\3\2\2\2E\u0259\3\2\2\2G"+
		"\u025f\3\2\2\2I\u0264\3\2\2\2K\u026a\3\2\2\2M\u0271\3\2\2\2O\u027a\3\2"+
		"\2\2Q\u027f\3\2\2\2S\u0288\3\2\2\2U\u028f\3\2\2\2W\u0298\3\2\2\2Y\u02a2"+
		"\3\2\2\2[\u02a9\3\2\2\2]\u02ac\3\2\2\2_\u02b3\3\2\2\2a\u02b9\3\2\2\2c"+
		"\u02be\3\2\2\2e\u02c2\3\2\2\2g\u02c8\3\2\2\2i\u02cd\3\2\2\2k\u02d0\3\2"+
		"\2\2m\u02d6\3\2\2\2o\u02dd\3\2\2\2q\u02e3\3\2\2\2s\u02ec\3\2\2\2u\u02ef"+
		"\3\2\2\2w\u02f3\3\2\2\2y\u02f6\3\2\2\2{\u02fa\3\2\2\2}\u02fd\3\2\2\2\177"+
		"\u0301\3\2\2\2\u0081\u0305\3\2\2\2\u0083\u030a\3\2\2\2\u0085\u0310\3\2"+
		"\2\2\u0087\u0318\3\2\2\2\u0089\u0320\3\2\2\2\u008b\u0325\3\2\2\2\u008d"+
		"\u032b\3\2\2\2\u008f\u0330\3\2\2\2\u0091\u0335\3\2\2\2\u0093\u0337\3\2"+
		"\2\2\u0095\u0339\3\2\2\2\u0097\u033b\3\2\2\2\u0099\u033d\3\2\2\2\u009b"+
		"\u033f\3\2\2\2\u009d\u0341\3\2\2\2\u009f\u0343\3\2\2\2\u00a1\u0346\3\2"+
		"\2\2\u00a3\u0348\3\2\2\2\u00a5\u034b\3\2\2\2\u00a7\u034e\3\2\2\2\u00a9"+
		"\u0350\3\2\2\2\u00ab\u0353\3\2\2\2\u00ad\u0356\3\2\2\2\u00af\u0358\3\2"+
		"\2\2\u00b1\u035b\3\2\2\2\u00b3\u035d\3\2\2\2\u00b5\u0360\3\2\2\2\u00b7"+
		"\u0362\3\2\2\2\u00b9\u0365\3\2\2\2\u00bb\u0368\3\2\2\2\u00bd\u036f\3\2"+
		"\2\2\u00bf\u0376\3\2\2\2\u00c1\u037b\3\2\2\2\u00c3\u0382\3\2\2\2\u00c5"+
		"\u0387\3\2\2\2\u00c7\u038e\3\2\2\2\u00c9\u0390\3\2\2\2\u00cb\u0392\3\2"+
		"\2\2\u00cd\u0394\3\2\2\2\u00cf\u0397\3\2\2\2\u00d1\u039b\3\2\2\2\u00d3"+
		"\u039e\3\2\2\2\u00d5\u03a2\3\2\2\2\u00d7\u03a6\3\2\2\2\u00d9\u03a8\3\2"+
		"\2\2\u00db\u03ab\3\2\2\2\u00dd\u03ad\3\2\2\2\u00df\u03af\3\2\2\2\u00e1"+
		"\u03b2\3\2\2\2\u00e3\u03b4\3\2\2\2\u00e5\u03b6\3\2\2\2\u00e7\u03b8\3\2"+
		"\2\2\u00e9\u03bb\3\2\2\2\u00eb\u03be\3\2\2\2\u00ed\u03c1\3\2\2\2\u00ef"+
		"\u03c4\3\2\2\2\u00f1\u03c7\3\2\2\2\u00f3\u03cb\3\2\2\2\u00f5\u03cf\3\2"+
		"\2\2\u00f7\u03d1\3\2\2\2\u00f9\u03d4\3\2\2\2\u00fb\u03d7\3\2\2\2\u00fd"+
		"\u03db\3\2\2\2\u00ff\u03dd\3\2\2\2\u0101\u03e0\3\2\2\2\u0103\u03e3\3\2"+
		"\2\2\u0105\u03e7\3\2\2\2\u0107\u03ea\3\2\2\2\u0109\u03ed\3\2\2\2\u010b"+
		"\u03f0\3\2\2\2\u010d\u03f2\3\2\2\2\u010f\u03f6\3\2\2\2\u0111\u03fc\3\2"+
		"\2\2\u0113\u0402\3\2\2\2\u0115\u0404\3\2\2\2\u0117\u0407\3\2\2\2\u0119"+
		"\u040b\3\2\2\2\u011b\u0410\3\2\2\2\u011d\u0423\3\2\2\2\u011f\u0426\3\2"+
		"\2\2\u0121\u0431\3\2\2\2\u0123\u043f\3\2\2\2\u0125\u0441\3\2\2\2\u0127"+
		"\u0447\3\2\2\2\u0129\u044f\3\2\2\2\u012b\u045f\3\2\2\2\u012d\u0463\3\2"+
		"\2\2\u012f\u0466\3\2\2\2\u0131\u0476\3\2\2\2\u0133\u047a\3\2\2\2\u0135"+
		"\u047d\3\2\2\2\u0137\u048d\3\2\2\2\u0139\u0491\3\2\2\2\u013b\u0495\3\2"+
		"\2\2\u013d\u0499\3\2\2\2\u013f\u04ae\3\2\2\2\u0141\u04b0\3\2\2\2\u0143"+
		"\u04b3\3\2\2\2\u0145\u04bc\3\2\2\2\u0147\u04be\3\2\2\2\u0149\u04c5\3\2"+
		"\2\2\u014b\u04ce\3\2\2\2\u014d\u04d0\3\2\2\2\u014f\u04d2\3\2\2\2\u0151"+
		"\u04d4\3\2\2\2\u0153\u04d6\3\2\2\2\u0155\u04d8\3\2\2\2\u0157\u04da\3\2"+
		"\2\2\u0159\u04dc\3\2\2\2\u015b\u04de\3\2\2\2\u015d\u04e2\3\2\2\2\u015f"+
		"\u04e5\3\2\2\2\u0161\u04ec\3\2\2\2\u0163\u04ee\3\2\2\2\u0165\u04f2\3\2"+
		"\2\2\u0167\u04fb\3\2\2\2\u0169\u04ff\3\2\2\2\u016b\u0507\3\2\2\2\u016d"+
		"\u0509\3\2\2\2\u016f\u050c\3\2\2\2\u0171\u050f\3\2\2\2\u0173\u0174\7\61"+
		"\2\2\u0174\u0175\7,\2\2\u0175\u017a\3\2\2\2\u0176\u0179\5\5\2\2\u0177"+
		"\u0179\13\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\7,\2\2\u017e\u017f\7\61\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0181\b\2\2\2\u0181\6\3\2\2\2\u0182\u0183\7\61\2\2\u0183\u0184"+
		"\7,\2\2\u0184\u0185\7,\2\2\u0185\u0189\3\2\2\2\u0186\u0188\13\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7,\2\2\u018d"+
		"\u018e\7\61\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b\3\2\2\u0190\b\3\2\2"+
		"\2\u0191\u0192\7\61\2\2\u0192\u0193\7\61\2\2\u0193\u0197\3\2\2\2\u0194"+
		"\u0196\n\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\b\4\2\2\u019b\n\3\2\2\2\u019c\u019d\t\3\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u019f\b\5\3\2\u019f\f\3\2\2\2\u01a0\u01a4\7\f\2\2\u01a1\u01a2\7"+
		"\17\2\2\u01a2\u01a4\7\f\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\16\3\2\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7k\2\2\u01a8"+
		"\u01a9\7p\2\2\u01a9\u01aa\7i\2\2\u01aa\20\3\2\2\2\u01ab\u01ac\7c\2\2\u01ac"+
		"\u01ad\7n\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7u\2\2"+
		"\u01b0\22\3\2\2\2\u01b1\u01b2\7e\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7"+
		"c\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7u\2\2\u01b6\24\3\2\2\2\u01b7\u01b8"+
		"\7k\2\2\u01b8\u01b9\7p\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"\u01bc\7t\2\2\u01bc\u01bd\7h\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7e\2\2"+
		"\u01bf\u01c0\7g\2\2\u01c0\26\3\2\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7"+
		"v\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7w\2\2\u01c5\u01c6\7e\2\2\u01c6\u01c7"+
		"\7v\2\2\u01c7\30\3\2\2\2\u01c8\u01c9\7f\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb"+
		"\7e\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\7o\2\2\u01cd\u01ce\7g\2\2\u01ce"+
		"\u01cf\7p\2\2\u01cf\u01d0\7v\2\2\u01d0\32\3\2\2\2\u01d1\u01d2\7c\2\2\u01d2"+
		"\u01d3\7p\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7{\2\2"+
		"\u01d6\u01d7\7o\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da"+
		"\7u\2\2\u01da\34\3\2\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de"+
		"\7w\2\2\u01de\u01df\7o\2\2\u01df\36\3\2\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2"+
		"\7p\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7v\2\2\u01e5"+
		"\u01e6\7c\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7q\2\2"+
		"\u01e9\u01ea\7p\2\2\u01ea \3\2\2\2\u01eb\u01ec\7r\2\2\u01ec\u01ed\7c\2"+
		"\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7v\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1"+
		"\7g\2\2\u01f1\u01f2\7t\2\2\u01f2\"\3\2\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5"+
		"\7j\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7u\2\2\u01f7$\3\2\2\2\u01f8\u01f9"+
		"\7u\2\2\u01f9\u01fa\7w\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7g\2\2\u01fc"+
		"\u01fd\7t\2\2\u01fd&\3\2\2\2\u01fe\u01ff\7u\2\2\u01ff\u0200\7w\2\2\u0200"+
		"\u0201\7d\2\2\u0201(\3\2\2\2\u0202\u0203\7c\2\2\u0203\u0204\7e\2\2\u0204"+
		"\u0205\7v\2\2\u0205\u0206\7w\2\2\u0206\u0207\7c\2\2\u0207\u0208\7n\2\2"+
		"\u0208*\3\2\2\2\u0209\u020a\7k\2\2\u020a\u020b\7p\2\2\u020b\u020c\7k\2"+
		"\2\u020c\u020d\7v\2\2\u020d,\3\2\2\2\u020e\u020f\7g\2\2\u020f\u0210\7"+
		"z\2\2\u0210\u0211\7g\2\2\u0211\u0212\7e\2\2\u0212.\3\2\2\2\u0213\u0214"+
		"\7r\2\2\u0214\u0215\7t\2\2\u0215\u0216\7k\2\2\u0216\u0217\7x\2\2\u0217"+
		"\u0218\7c\2\2\u0218\u0219\7v\2\2\u0219\u021a\7g\2\2\u021a\60\3\2\2\2\u021b"+
		"\u021c\7d\2\2\u021c\u021d\7q\2\2\u021d\u021e\7w\2\2\u021e\u021f\7p\2\2"+
		"\u021f\u0220\7f\2\2\u0220\u0221\7g\2\2\u0221\u0222\7f\2\2\u0222\62\3\2"+
		"\2\2\u0223\u0224\7n\2\2\u0224\u0225\7q\2\2\u0225\u0226\7e\2\2\u0226\u0227"+
		"\7c\2\2\u0227\u0228\7n\2\2\u0228\64\3\2\2\2\u0229\u022a\7r\2\2\u022a\u022b"+
		"\7w\2\2\u022b\u022c\7d\2\2\u022c\u022d\7n\2\2\u022d\u022e\7k\2\2\u022e"+
		"\u022f\7e\2\2\u022f\66\3\2\2\2\u0230\u0231\7i\2\2\u0231\u0232\7g\2\2\u0232"+
		"\u0233\7v\2\2\u0233\u0234\7v\2\2\u0234\u0235\7g\2\2\u0235\u0236\7t\2\2"+
		"\u02368\3\2\2\2\u0237\u0238\7u\2\2\u0238\u0239\7g\2\2\u0239\u023a\7v\2"+
		"\2\u023a\u023b\7v\2\2\u023b\u023c\7g\2\2\u023c\u023d\7t\2\2\u023d:\3\2"+
		"\2\2\u023e\u023f\7f\2\2\u023f\u0240\7g\2\2\u0240\u0241\7h\2\2\u0241<\3"+
		"\2\2\2\u0242\u0243\7e\2\2\u0243\u0244\7q\2\2\u0244\u0245\7p\2\2\u0245"+
		"\u0246\7u\2\2\u0246\u0247\7v\2\2\u0247>\3\2\2\2\u0248\u0249\7x\2\2\u0249"+
		"\u024a\7c\2\2\u024a\u024b\7t\2\2\u024b@\3\2\2\2\u024c\u024d\7x\2\2\u024d"+
		"\u024e\7c\2\2\u024e\u024f\7n\2\2\u024fB\3\2\2\2\u0250\u0251\7c\2\2\u0251"+
		"\u0252\7d\2\2\u0252\u0253\7u\2\2\u0253\u0254\7v\2\2\u0254\u0255\7t\2\2"+
		"\u0255\u0256\7c\2\2\u0256\u0257\7e\2\2\u0257\u0258\7v\2\2\u0258D\3\2\2"+
		"\2\u0259\u025a\7e\2\2\u025a\u025b\7q\2\2\u025b\u025c\7x\2\2\u025c\u025d"+
		"\7g\2\2\u025d\u025e\7t\2\2\u025eF\3\2\2\2\u025f\u0260\7q\2\2\u0260\u0261"+
		"\7r\2\2\u0261\u0262\7g\2\2\u0262\u0263\7p\2\2\u0263H\3\2\2\2\u0264\u0265"+
		"\7h\2\2\u0265\u0266\7k\2\2\u0266\u0267\7p\2\2\u0267\u0268\7c\2\2\u0268"+
		"\u0269\7n\2\2\u0269J\3\2\2\2\u026a\u026b\7k\2\2\u026b\u026c\7p\2\2\u026c"+
		"\u026d\7n\2\2\u026d\u026e\7k\2\2\u026e\u026f\7p\2\2\u026f\u0270\7g\2\2"+
		"\u0270L\3\2\2\2\u0271\u0272\7g\2\2\u0272\u0273\7z\2\2\u0273\u0274\7v\2"+
		"\2\u0274\u0275\7g\2\2\u0275\u0276\7t\2\2\u0276\u0277\7p\2\2\u0277\u0278"+
		"\7c\2\2\u0278\u0279\7n\2\2\u0279N\3\2\2\2\u027a\u027b\7u\2\2\u027b\u027c"+
		"\7{\2\2\u027c\u027d\7p\2\2\u027d\u027e\7e\2\2\u027eP\3\2\2\2\u027f\u0280"+
		"\7h\2\2\u0280\u0281\7w\2\2\u0281\u0282\7p\2\2\u0282\u0283\7e\2\2\u0283"+
		"\u0284\7v\2\2\u0284\u0285\7k\2\2\u0285\u0286\7q\2\2\u0286\u0287\7p\2\2"+
		"\u0287R\3\2\2\2\u0288\u0289\7u\2\2\u0289\u028a\7e\2\2\u028a\u028b\7t\2"+
		"\2\u028b\u028c\7k\2\2\u028c\u028d\7r\2\2\u028d\u028e\7v\2\2\u028eT\3\2"+
		"\2\2\u028f\u0290\7q\2\2\u0290\u0291\7r\2\2\u0291\u0292\7g\2\2\u0292\u0293"+
		"\7t\2\2\u0293\u0294\7c\2\2\u0294\u0295\7v\2\2\u0295\u0296\7q\2\2\u0296"+
		"\u0297\7t\2\2\u0297V\3\2\2\2\u0298\u0299\7g\2\2\u0299\u029a\7z\2\2\u029a"+
		"\u029b\7v\2\2\u029b\u029c\7g\2\2\u029c\u029d\7p\2\2\u029d\u029e\7u\2\2"+
		"\u029e\u029f\7k\2\2\u029f\u02a0\7q\2\2\u02a0\u02a1\7p\2\2\u02a1X\3\2\2"+
		"\2\u02a2\u02a3\7r\2\2\u02a3\u02a4\7c\2\2\u02a4\u02a5\7t\2\2\u02a5\u02a6"+
		"\7c\2\2\u02a6\u02a7\7o\2\2\u02a7\u02a8\7u\2\2\u02a8Z\3\2\2\2\u02a9\u02aa"+
		"\7k\2\2\u02aa\u02ab\7h\2\2\u02ab\\\3\2\2\2\u02ac\u02ad\7w\2\2\u02ad\u02ae"+
		"\7p\2\2\u02ae\u02af\7n\2\2\u02af\u02b0\7g\2\2\u02b0\u02b1\7u\2\2\u02b1"+
		"\u02b2\7u\2\2\u02b2^\3\2\2\2\u02b3\u02b4\7g\2\2\u02b4\u02b5\7n\2\2\u02b5"+
		"\u02b6\7u\2\2\u02b6\u02b7\7k\2\2\u02b7\u02b8\7h\2\2\u02b8`\3\2\2\2\u02b9"+
		"\u02ba\7g\2\2\u02ba\u02bb\7n\2\2\u02bb\u02bc\7u\2\2\u02bc\u02bd\7g\2\2"+
		"\u02bdb\3\2\2\2\u02be\u02bf\7h\2\2\u02bf\u02c0\7q\2\2\u02c0\u02c1\7t\2"+
		"\2\u02c1d\3\2\2\2\u02c2\u02c3\7o\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7"+
		"v\2\2\u02c5\u02c6\7e\2\2\u02c6\u02c7\7j\2\2\u02c7f\3\2\2\2\u02c8\u02c9"+
		"\7y\2\2\u02c9\u02ca\7j\2\2\u02ca\u02cb\7g\2\2\u02cb\u02cc\7p\2\2\u02cc"+
		"h\3\2\2\2\u02cd\u02ce\7f\2\2\u02ce\u02cf\7q\2\2\u02cfj\3\2\2\2\u02d0\u02d1"+
		"\7y\2\2\u02d1\u02d2\7j\2\2\u02d2\u02d3\7k\2\2\u02d3\u02d4\7n\2\2\u02d4"+
		"\u02d5\7g\2\2\u02d5l\3\2\2\2\u02d6\u02d7\7t\2\2\u02d7\u02d8\7g\2\2\u02d8"+
		"\u02d9\7v\2\2\u02d9\u02da\7w\2\2\u02da\u02db\7t\2\2\u02db\u02dc\7p\2\2"+
		"\u02dcn\3\2\2\2\u02dd\u02de\7d\2\2\u02de\u02df\7t\2\2\u02df\u02e0\7g\2"+
		"\2\u02e0\u02e1\7c\2\2\u02e1\u02e2\7m\2\2\u02e2p\3\2\2\2\u02e3\u02e4\7"+
		"e\2\2\u02e4\u02e5\7q\2\2\u02e5\u02e6\7p\2\2\u02e6\u02e7\7v\2\2\u02e7\u02e8"+
		"\7k\2\2\u02e8\u02e9\7p\2\2\u02e9\u02ea\7w\2\2\u02ea\u02eb\7g\2\2\u02eb"+
		"r\3\2\2\2\u02ec\u02ed\7c\2\2\u02ed\u02ee\7u\2\2\u02eet\3\2\2\2\u02ef\u02f0"+
		"\7c\2\2\u02f0\u02f1\7u\2\2\u02f1\u02f2\7A\2\2\u02f2v\3\2\2\2\u02f3\u02f4"+
		"\7k\2\2\u02f4\u02f5\7u\2\2\u02f5x\3\2\2\2\u02f6\u02f7\7#\2\2\u02f7\u02f8"+
		"\7k\2\2\u02f8\u02f9\7u\2\2\u02f9z\3\2\2\2\u02fa\u02fb\7k\2\2\u02fb\u02fc"+
		"\7p\2\2\u02fc|\3\2\2\2\u02fd\u02fe\7#\2\2\u02fe\u02ff\7k\2\2\u02ff\u0300"+
		"\7p\2\2\u0300~\3\2\2\2\u0301\u0302\7v\2\2\u0302\u0303\7t\2\2\u0303\u0304"+
		"\7{\2\2\u0304\u0080\3\2\2\2\u0305\u0306\7v\2\2\u0306\u0307\7t\2\2\u0307"+
		"\u0308\7{\2\2\u0308\u0309\7A\2\2\u0309\u0082\3\2\2\2\u030a\u030b\7e\2"+
		"\2\u030b\u030c\7c\2\2\u030c\u030d\7v\2\2\u030d\u030e\7e\2\2\u030e\u030f"+
		"\7j\2\2\u030f\u0084\3\2\2\2\u0310\u0311\7h\2\2\u0311\u0312\7k\2\2\u0312"+
		"\u0313\7p\2\2\u0313\u0314\7c\2\2\u0314\u0315\7n\2\2\u0315\u0316\7n\2\2"+
		"\u0316\u0317\7{\2\2\u0317\u0086\3\2\2\2\u0318\u0319\7v\2\2\u0319\u031a"+
		"\7t\2\2\u031a\u031b\7k\2\2\u031b\u031c\7i\2\2\u031c\u031d\7i\2\2\u031d"+
		"\u031e\7g\2\2\u031e\u031f\7t\2\2\u031f\u0088\3\2\2\2\u0320\u0321\7v\2"+
		"\2\u0321\u0322\7t\2\2\u0322\u0323\7w\2\2\u0323\u0324\7g\2\2\u0324\u008a"+
		"\3\2\2\2\u0325\u0326\7h\2\2\u0326\u0327\7c\2\2\u0327\u0328\7n\2\2\u0328"+
		"\u0329\7u\2\2\u0329\u032a\7g\2\2\u032a\u008c\3\2\2\2\u032b\u032c\7p\2"+
		"\2\u032c\u032d\7q\2\2\u032d\u032e\7p\2\2\u032e\u032f\7g\2\2\u032f\u008e"+
		"\3\2\2\2\u0330\u0331\7p\2\2\u0331\u0332\7w\2\2\u0332\u0333\7n\2\2\u0333"+
		"\u0334\7n\2\2\u0334\u0090\3\2\2\2\u0335\u0336\7*\2\2\u0336\u0092\3\2\2"+
		"\2\u0337\u0338\7+\2\2\u0338\u0094\3\2\2\2\u0339\u033a\7]\2\2\u033a\u0096"+
		"\3\2\2\2\u033b\u033c\7_\2\2\u033c\u0098\3\2\2\2\u033d\u033e\7}\2\2\u033e"+
		"\u009a\3\2\2\2\u033f\u0340\7\177\2\2\u0340\u009c\3\2\2\2\u0341\u0342\7"+
		"?\2\2\u0342\u009e\3\2\2\2\u0343\u0344\7<\2\2\u0344\u0345\7?\2\2\u0345"+
		"\u00a0\3\2\2\2\u0346\u0347\7-\2\2\u0347\u00a2\3\2\2\2\u0348\u0349\7-\2"+
		"\2\u0349\u034a\7?\2\2\u034a\u00a4\3\2\2\2\u034b\u034c\7-\2\2\u034c\u034d"+
		"\7-\2\2\u034d\u00a6\3\2\2\2\u034e\u034f\7/\2\2\u034f\u00a8\3\2\2\2\u0350"+
		"\u0351\7/\2\2\u0351\u0352\7?\2\2\u0352\u00aa\3\2\2\2\u0353\u0354\7/\2"+
		"\2\u0354\u0355\7/\2\2\u0355\u00ac\3\2\2\2\u0356\u0357\7,\2\2\u0357\u00ae"+
		"\3\2\2\2\u0358\u0359\7,\2\2\u0359\u035a\7?\2\2\u035a\u00b0\3\2\2\2\u035b"+
		"\u035c\7\61\2\2\u035c\u00b2\3\2\2\2\u035d\u035e\7\61\2\2\u035e\u035f\7"+
		"?\2\2\u035f\u00b4\3\2\2\2\u0360\u0361\7\'\2\2\u0361\u00b6\3\2\2\2\u0362"+
		"\u0363\7\'\2\2\u0363\u0364\7?\2\2\u0364\u00b8\3\2\2\2\u0365\u0366\7,\2"+
		"\2\u0366\u0367\7,\2\2\u0367\u00ba\3\2\2\2\u0368\u0369\7,\2\2\u0369\u036a"+
		"\7,\2\2\u036a\u036b\7?\2\2\u036b\u00bc\3\2\2\2\u036c\u0370\7(\2\2\u036d"+
		"\u036e\7(\2\2\u036e\u0370\7(\2\2\u036f\u036c\3\2\2\2\u036f\u036d\3\2\2"+
		"\2\u0370\u00be\3\2\2\2\u0371\u0372\7(\2\2\u0372\u0377\7?\2\2\u0373\u0374"+
		"\7(\2\2\u0374\u0375\7(\2\2\u0375\u0377\7?\2\2\u0376\u0371\3\2\2\2\u0376"+
		"\u0373\3\2\2\2\u0377\u00c0\3\2\2\2\u0378\u037c\7~\2\2\u0379\u037a\7~\2"+
		"\2\u037a\u037c\7~\2\2\u037b\u0378\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u00c2"+
		"\3\2\2\2\u037d\u037e\7~\2\2\u037e\u0383\7?\2\2\u037f\u0380\7~\2\2\u0380"+
		"\u0381\7~\2\2\u0381\u0383\7?\2\2\u0382\u037d\3\2\2\2\u0382\u037f\3\2\2"+
		"\2\u0383\u00c4\3\2\2\2\u0384\u0388\7\u0080\2\2\u0385\u0386\7\u0080\2\2"+
		"\u0386\u0388\7\u0080\2\2\u0387\u0384\3\2\2\2\u0387\u0385\3\2\2\2\u0388"+
		"\u00c6\3\2\2\2\u0389\u038a\7\u0080\2\2\u038a\u038f\7?\2\2\u038b\u038c"+
		"\7\u0080\2\2\u038c\u038d\7\u0080\2\2\u038d\u038f\7?\2\2\u038e\u0389\3"+
		"\2\2\2\u038e\u038b\3\2\2\2\u038f\u00c8\3\2\2\2\u0390\u0391\7.\2\2\u0391"+
		"\u00ca\3\2\2\2\u0392\u0393\7\60\2\2\u0393\u00cc\3\2\2\2\u0394\u0395\7"+
		"A\2\2\u0395\u0396\7\60\2\2\u0396\u00ce\3\2\2\2\u0397\u0398\7@\2\2\u0398"+
		"\u0399\7\60\2\2\u0399\u039a\7\60\2\2\u039a\u00d0\3\2\2\2\u039b\u039c\7"+
		"\60\2\2\u039c\u039d\7\60\2\2\u039d\u00d2\3\2\2\2\u039e\u039f\7\60\2\2"+
		"\u039f\u03a0\7\60\2\2\u03a0\u03a1\7>\2\2\u03a1\u00d4\3\2\2\2\u03a2\u03a3"+
		"\7\60\2\2\u03a3\u03a4\7\60\2\2\u03a4\u03a5\7\60\2\2\u03a5\u00d6\3\2\2"+
		"\2\u03a6\u03a7\7<\2\2\u03a7\u00d8\3\2\2\2\u03a8\u03a9\7<\2\2\u03a9\u03aa"+
		"\7<\2\2\u03aa\u00da\3\2\2\2\u03ab\u03ac\7=\2\2\u03ac\u00dc\3\2\2\2\u03ad"+
		"\u03ae\7#\2\2\u03ae\u00de\3\2\2\2\u03af\u03b0\7#\2\2\u03b0\u03b1\7#\2"+
		"\2\u03b1\u00e0\3\2\2\2\u03b2\u03b3\7A\2\2\u03b3\u00e2\3\2\2\2\u03b4\u03b5"+
		"\7%\2\2\u03b5\u00e4\3\2\2\2\u03b6\u03b7\7B\2\2\u03b7\u00e6\3\2\2\2\u03b8"+
		"\u03b9\7B\2\2\u03b9\u03ba\7B\2\2\u03ba\u00e8\3\2\2\2\u03bb\u03bc\7A\2"+
		"\2\u03bc\u03bd\7<\2\2\u03bd\u00ea\3\2\2\2\u03be\u03bf\7A\2\2\u03bf\u03c0"+
		"\7?\2\2\u03c0\u00ec\3\2\2\2\u03c1\u03c2\7?\2\2\u03c2\u03c3\7?\2\2\u03c3"+
		"\u00ee\3\2\2\2\u03c4\u03c5\7#\2\2\u03c5\u03c6\7?\2\2\u03c6\u00f0\3\2\2"+
		"\2\u03c7\u03c8\7?\2\2\u03c8\u03c9\7?\2\2\u03c9\u03ca\7?\2\2\u03ca\u00f2"+
		"\3\2\2\2\u03cb\u03cc\7#\2\2\u03cc\u03cd\7?\2\2\u03cd\u03ce\7?\2\2\u03ce"+
		"\u00f4\3\2\2\2\u03cf\u03d0\7>\2\2\u03d0\u00f6\3\2\2\2\u03d1\u03d2\7#\2"+
		"\2\u03d2\u03d3\7>\2\2\u03d3\u00f8\3\2\2\2\u03d4\u03d5\7>\2\2\u03d5\u03d6"+
		"\7?\2\2\u03d6\u00fa\3\2\2\2\u03d7\u03d8\7#\2\2\u03d8\u03d9\7>\2\2\u03d9"+
		"\u03da\7?\2\2\u03da\u00fc\3\2\2\2\u03db\u03dc\7@\2\2\u03dc\u00fe\3\2\2"+
		"\2\u03dd\u03de\7#\2\2\u03de\u03df\7@\2\2\u03df\u0100\3\2\2\2\u03e0\u03e1"+
		"\7@\2\2\u03e1\u03e2\7?\2\2\u03e2\u0102\3\2\2\2\u03e3\u03e4\7#\2\2\u03e4"+
		"\u03e5\7@\2\2\u03e5\u03e6\7?\2\2\u03e6\u0104\3\2\2\2\u03e7\u03e8\7>\2"+
		"\2\u03e8\u03e9\7/\2\2\u03e9\u0106\3\2\2\2\u03ea\u03eb\7/\2\2\u03eb\u03ec"+
		"\7@\2\2\u03ec\u0108\3\2\2\2\u03ed\u03ee\7?\2\2\u03ee\u03ef\7@\2\2\u03ef"+
		"\u010a\3\2\2\2\u03f0\u03f1\7)\2\2\u03f1\u010c\3\2\2\2\u03f2\u03f3\7$\2"+
		"\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\b\u0086\4\2\u03f5\u010e\3\2\2\2\u03f6"+
		"\u03f7\7$\2\2\u03f7\u03f8\7$\2\2\u03f8\u03f9\7$\2\2\u03f9\u03fa\3\2\2"+
		"\2\u03fa\u03fb\b\u0087\5\2\u03fb\u0110\3\2\2\2\u03fc\u03fd\t\4\2\2\u03fd"+
		"\u0112\3\2\2\2\u03fe\u0403\5\u011b\u008d\2\u03ff\u0403\5\u0129\u0094\2"+
		"\u0400\u0403\5\u012f\u0097\2\u0401\u0403\5\u0135\u009a\2\u0402\u03fe\3"+
		"\2\2\2\u0402\u03ff\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2\2\2\u0403"+
		"\u0114\3\2\2\2\u0404\u0405\5\u0113\u0089\2\u0405\u0406\t\5\2\2\u0406\u0116"+
		"\3\2\2\2\u0407\u0409\5\u0113\u0089\2\u0408\u040a\t\6\2\2\u0409\u0408\3"+
		"\2\2\2\u0409\u040a\3\2\2\2\u040a\u0118\3\2\2\2\u040b\u040d\5\u0113\u0089"+
		"\2\u040c\u040e\t\7\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u011a"+
		"\3\2\2\2\u040f\u0411\t\b\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0413\5\u011d\u008e\2\u0413\u011c\3\2\2\2\u0414\u0416"+
		"\5\u0111\u0088\2\u0415\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0415\3"+
		"\2\2\2\u0417\u0418\3\2\2\2\u0418\u0424\3\2\2\2\u0419\u041e\5\u0111\u0088"+
		"\2\u041a\u041d\5\u0111\u0088\2\u041b\u041d\7a\2\2\u041c\u041a\3\2\2\2"+
		"\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0422\5\u0111\u0088"+
		"\2\u0422\u0424\3\2\2\2\u0423\u0415\3\2\2\2\u0423\u0419\3\2\2\2\u0424\u011e"+
		"\3\2\2\2\u0425\u0427\t\b\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u042a\5\u011d\u008e\2\u0429\u0428\3\2\2\2\u0429\u042a"+
		"\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\7\60\2\2\u042c\u042d\5\u011d"+
		"\u008e\2\u042d\u0120\3\2\2\2\u042e\u0432\5\u011f\u008f\2\u042f\u0432\5"+
		"\u0125\u0092\2\u0430\u0432\5\u0113\u0089\2\u0431\u042e\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\t\t\2\2\u0434"+
		"\u0122\3\2\2\2\u0435\u0438\5\u011f\u008f\2\u0436\u0438\5\u0125\u0092\2"+
		"\u0437\u0435\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u043a\3\2\2\2\u0439\u043b"+
		"\t\n\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0440\3\2\2\2\u043c"+
		"\u043d\5\u0113\u0089\2\u043d\u043e\t\n\2\2\u043e\u0440\3\2\2\2\u043f\u0437"+
		"\3\2\2\2\u043f\u043c\3\2\2\2\u0440\u0124\3\2\2\2\u0441\u0442\5\u011f\u008f"+
		"\2\u0442\u0443\t\13\2\2\u0443\u0444\5\u011b\u008d\2\u0444\u0126\3\2\2"+
		"\2\u0445\u0448\5\u011b\u008d\2\u0446\u0448\5\u011f\u008f\2\u0447\u0445"+
		"\3\2\2\2\u0447\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044c\t\f\2\2\u044a"+
		"\u044d\5\u011b\u008d\2\u044b\u044d\5\u011f\u008f\2\u044c\u044a\3\2\2\2"+
		"\u044c\u044b\3\2\2\2\u044d\u0128\3\2\2\2\u044e\u0450\t\b\2\2\u044f\u044e"+
		"\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\7\62\2\2"+
		"\u0452\u045d\t\r\2\2\u0453\u045e\5\u012b\u0095\2\u0454\u0458\5\u012b\u0095"+
		"\2\u0455\u0457\5\u012d\u0096\2\u0456\u0455\3\2\2\2\u0457\u045a\3\2\2\2"+
		"\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a\u0458"+
		"\3\2\2\2\u045b\u045c\5\u012b\u0095\2\u045c\u045e\3\2\2\2\u045d\u0453\3"+
		"\2\2\2\u045d\u0454\3\2\2\2\u045e\u012a\3\2\2\2\u045f\u0460\t\16\2\2\u0460"+
		"\u012c\3\2\2\2\u0461\u0464\5\u012b\u0095\2\u0462\u0464\7a\2\2\u0463\u0461"+
		"\3\2\2\2\u0463\u0462\3\2\2\2\u0464\u012e\3\2\2\2\u0465\u0467\t\b\2\2\u0466"+
		"\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\62"+
		"\2\2\u0469\u0474\t\7\2\2\u046a\u0475\5\u0131\u0098\2\u046b\u046f\5\u0131"+
		"\u0098\2\u046c\u046e\5\u0133\u0099\2\u046d\u046c\3\2\2\2\u046e\u0471\3"+
		"\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0473\5\u0131\u0098\2\u0473\u0475\3\2\2\2\u0474\u046a"+
		"\3\2\2\2\u0474\u046b\3\2\2\2\u0475\u0130\3\2\2\2\u0476\u0477\t\17\2\2"+
		"\u0477\u0132\3\2\2\2\u0478\u047b\5\u0131\u0098\2\u0479\u047b\7a\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u0479\3\2\2\2\u047b\u0134\3\2\2\2\u047c\u047e\t\b"+
		"\2\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0480\7\62\2\2\u0480\u048b\t\20\2\2\u0481\u048c\5\u0137\u009b\2\u0482"+
		"\u0486\5\u0137\u009b\2\u0483\u0485\5\u0139\u009c\2\u0484\u0483\3\2\2\2"+
		"\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489"+
		"\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\5\u0137\u009b\2\u048a\u048c\3"+
		"\2\2\2\u048b\u0481\3\2\2\2\u048b\u0482\3\2\2\2\u048c\u0136\3\2\2\2\u048d"+
		"\u048e\t\21\2\2\u048e\u0138\3\2\2\2\u048f\u0492\5\u0137\u009b\2\u0490"+
		"\u0492\7a\2\2\u0491\u048f\3\2\2\2\u0491\u0490\3\2\2\2\u0492\u013a\3\2"+
		"\2\2\u0493\u0496\5\u0089D\2\u0494\u0496\5\u008bE\2\u0495\u0493\3\2\2\2"+
		"\u0495\u0494\3\2\2\2\u0496\u013c\3\2\2\2\u0497\u049a\5\u013b\u009d\2\u0498"+
		"\u049a\5\u008dF\2\u0499\u0497\3\2\2\2\u0499\u0498\3\2\2\2\u049a\u013e"+
		"\3\2\2\2\u049b\u049e\5\u014b\u00a5\2\u049c\u049e\7a\2\2\u049d\u049b\3"+
		"\2\2\2\u049d\u049c\3\2\2\2\u049e\u04a4\3\2\2\2\u049f\u04a3\5\u014b\u00a5"+
		"\2\u04a0\u04a3\7a\2\2\u04a1\u04a3\5\u0111\u0088\2\u04a2\u049f\3\2\2\2"+
		"\u04a2\u04a0\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2"+
		"\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04af\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7"+
		"\u04a9\7b\2\2\u04a8\u04aa\n\22\2\2\u04a9\u04a8\3\2\2\2\u04aa\u04ab\3\2"+
		"\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"\u04af\7b\2\2\u04ae\u049d\3\2\2\2\u04ae\u04a7\3\2\2\2\u04af\u0140\3\2"+
		"\2\2\u04b0\u04b1\7&\2\2\u04b1\u04b2\5\u013f\u009f\2\u04b2\u0142\3\2\2"+
		"\2\u04b3\u04b6\7)\2\2\u04b4\u04b7\5\u0145\u00a2\2\u04b5\u04b7\13\2\2\2"+
		"\u04b6\u04b4\3\2\2\2\u04b6\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9"+
		"\7)\2\2\u04b9\u0144\3\2\2\2\u04ba\u04bd\5\u0147\u00a3\2\u04bb\u04bd\5"+
		"\u0149\u00a4\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u0146\3\2"+
		"\2\2\u04be\u04bf\7^\2\2\u04bf\u04c0\7w\2\2\u04c0\u04c1\5\u012b\u0095\2"+
		"\u04c1\u04c2\5\u012b\u0095\2\u04c2\u04c3\5\u012b\u0095\2\u04c3\u04c4\5"+
		"\u012b\u0095\2\u04c4\u0148\3\2\2\2\u04c5\u04c6\7^\2\2\u04c6\u04c7\t\23"+
		"\2\2\u04c7\u014a\3\2\2\2\u04c8\u04cf\5\u014d\u00a6\2\u04c9\u04cf\5\u014f"+
		"\u00a7\2\u04ca\u04cf\5\u0151\u00a8\2\u04cb\u04cf\5\u0153\u00a9\2\u04cc"+
		"\u04cf\5\u0155\u00aa\2\u04cd\u04cf\5\u0159\u00ac\2\u04ce\u04c8\3\2\2\2"+
		"\u04ce\u04c9\3\2\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc"+
		"\3\2\2\2\u04ce\u04cd\3\2\2\2\u04cf\u014c\3\2\2\2\u04d0\u04d1\t\24\2\2"+
		"\u04d1\u014e\3\2\2\2\u04d2\u04d3\t\25\2\2\u04d3\u0150\3\2\2\2\u04d4\u04d5"+
		"\t\26\2\2\u04d5\u0152\3\2\2\2\u04d6\u04d7\t\27\2\2\u04d7\u0154\3\2\2\2"+
		"\u04d8\u04d9\t\30\2\2\u04d9\u0156\3\2\2\2\u04da\u04db\t\31\2\2\u04db\u0158"+
		"\3\2\2\2\u04dc\u04dd\t\32\2\2\u04dd\u015a\3\2\2\2\u04de\u04df\7$\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\b\u00ad\6\2\u04e1\u015c\3\2\2\2\u04e2\u04e3"+
		"\5\u0141\u00a0\2\u04e3\u015e\3\2\2\2\u04e4\u04e6\n\33\2\2\u04e5\u04e4"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u0160\3\2\2\2\u04e9\u04ea\7^\2\2\u04ea\u04ed\13\2\2\2\u04eb\u04ed\5\u0147"+
		"\u00a3\2\u04ec\u04e9\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u0162\3\2\2\2\u04ee"+
		"\u04ef\7&\2\2\u04ef\u04f0\7}\2\2\u04f0\u0164\3\2\2\2\u04f1\u04f3\5\u0167"+
		"\u00b3\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04f5\7$\2\2\u04f5\u04f6\7$\2\2\u04f6\u04f7\7$\2\2\u04f7\u04f8\3\2\2"+
		"\2\u04f8\u04f9\b\u00b2\6\2\u04f9\u0166\3\2\2\2\u04fa\u04fc\7$\2\2\u04fb"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u0168\3\2\2\2\u04ff\u0500\5\u0141\u00a0\2\u0500\u016a\3\2\2"+
		"\2\u0501\u0503\n\33\2\2\u0502\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0508\7&"+
		"\2\2\u0507\u0502\3\2\2\2\u0507\u0506\3\2\2\2\u0508\u016c\3\2\2\2\u0509"+
		"\u050a\7^\2\2\u050a\u050b\13\2\2\2\u050b\u016e\3\2\2\2\u050c\u050d\7&"+
		"\2\2\u050d\u050e\7}\2\2\u050e\u0170\3\2\2\2\u050f\u0510\5\r\6\2\u0510"+
		"\u0511\3\2\2\2\u0511\u0512\b\u00b8\3\2\u0512\u0172\3\2\2\2<\2\3\4\u0178"+
		"\u017a\u0189\u0197\u01a3\u036f\u0376\u037b\u0382\u0387\u038e\u0402\u0409"+
		"\u040d\u0410\u0417\u041c\u041e\u0423\u0426\u0429\u0431\u0437\u043a\u043f"+
		"\u0447\u044c\u044f\u0458\u045d\u0463\u0466\u046f\u0474\u047a\u047d\u0486"+
		"\u048b\u0491\u0495\u0499\u049d\u04a2\u04a4\u04ab\u04ae\u04b6\u04bc\u04ce"+
		"\u04e7\u04ec\u04f2\u04fd\u0504\u0507\7\2\3\2\b\2\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}