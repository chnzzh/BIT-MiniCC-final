// Generated from D:/Documents/JavaProjects/CbyZZH/src/bit/minisys/minicc\CbyZZH.g4 by ANTLR 4.9.1
package bit.minisys.minicc.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CbyZZHLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, AUTO=4, BREAK=5, CASE=6, CHAR=7, CONST=8, CONTINUE=9, 
		DEFAULT=10, DO=11, DOUBLE=12, ELSE=13, ENUM=14, EXTERN=15, FLOAT=16, FOR=17, 
		GOTO=18, IF=19, INLINE=20, INT=21, LONG=22, REGISTER=23, RESTRICT=24, 
		RETURN=25, SHORT=26, SIGNED=27, SIZEOF=28, STATIC=29, STRUCT=30, SWITCH=31, 
		TYPEDEF=32, UNION=33, UNSIGNED=34, VOID=35, VOLATILE=36, WHILE=37, ADD=38, 
		SUB=39, MUL=40, QUO=41, INC=42, DEC=43, ASSIGN=44, ADD_ASSIGN=45, SUB_ASSIGN=46, 
		MUL_ASSIGN=47, QUO_ASSIGN=48, REM_ASSIGN=49, LAND=50, LOR=51, NOT=52, 
		EQL=53, NEQ=54, LSS=55, GTR=56, LEQ=57, GEQ=58, LPAREN=59, LBRACK=60, 
		LBRACE=61, COMMA=62, PERIOD=63, RPAREN=64, RBRACK=65, RBRACE=66, SEMICOLON=67, 
		COLON=68, Identifier=69, IntegerConstant=70, FloatConstant=71, Character=72, 
		String=73, BlockComment=74, LineComment=75, Whitespace=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", 
			"GOTO", "IF", "INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", 
			"UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "ADD", "SUB", "MUL", 
			"QUO", "INC", "DEC", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"QUO_ASSIGN", "REM_ASSIGN", "LAND", "LOR", "NOT", "EQL", "NEQ", "LSS", 
			"GTR", "LEQ", "GEQ", "LPAREN", "LBRACK", "LBRACE", "COMMA", "PERIOD", 
			"RPAREN", "RBRACK", "RBRACE", "SEMICOLON", "COLON", "Identifier", "IntegerConstant", 
			"FloatConstant", "Character", "String", "BlockComment", "LineComment", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", "'~'", "'bool'", "'auto'", "'break'", "'case'", "'char'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
			"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
			"'unsigned'", "'void'", "'volatile'", "'while'", "'+'", "'-'", "'*'", 
			"'/'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'&&'", "'||'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'('", "'['", "'{'", "','", "'.'", "')'", "']'", "'}'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", 
			"GOTO", "IF", "INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", 
			"UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "ADD", "SUB", "MUL", 
			"QUO", "INC", "DEC", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"QUO_ASSIGN", "REM_ASSIGN", "LAND", "LOR", "NOT", "EQL", "NEQ", "LSS", 
			"GTR", "LEQ", "GEQ", "LPAREN", "LBRACK", "LBRACE", "COMMA", "PERIOD", 
			"RPAREN", "RBRACK", "RBRACE", "SEMICOLON", "COLON", "Identifier", "IntegerConstant", 
			"FloatConstant", "Character", "String", "BlockComment", "LineComment", 
			"Whitespace"
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


	public CbyZZHLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CbyZZH.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3."+
		"\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39"+
		"\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C"+
		"\3D\3D\3E\3E\3F\3F\7F\u01c8\nF\fF\16F\u01cb\13F\3G\3G\3G\7G\u01d0\nG\f"+
		"G\16G\u01d3\13G\5G\u01d5\nG\3H\5H\u01d8\nH\3H\3H\3H\3I\3I\5I\u01df\nI"+
		"\3I\3I\3J\3J\6J\u01e5\nJ\rJ\16J\u01e6\3J\3J\3K\3K\3K\3K\7K\u01ef\nK\f"+
		"K\16K\u01f2\13K\3K\3K\3K\3K\3K\3L\3L\3L\3L\7L\u01fd\nL\fL\16L\u0200\13"+
		"L\3L\3L\3M\6M\u0205\nM\rM\16M\u0206\3M\3M\3\u01f0\2N\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62"+
		";\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0212\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\3\u009b\3\2\2\2\5\u009d\3\2\2\2\7\u009f\3\2\2\2\t\u00a4\3\2\2"+
		"\2\13\u00a9\3\2\2\2\r\u00af\3\2\2\2\17\u00b4\3\2\2\2\21\u00b9\3\2\2\2"+
		"\23\u00bf\3\2\2\2\25\u00c8\3\2\2\2\27\u00d0\3\2\2\2\31\u00d3\3\2\2\2\33"+
		"\u00da\3\2\2\2\35\u00df\3\2\2\2\37\u00e4\3\2\2\2!\u00eb\3\2\2\2#\u00f1"+
		"\3\2\2\2%\u00f5\3\2\2\2\'\u00fa\3\2\2\2)\u00fd\3\2\2\2+\u0104\3\2\2\2"+
		"-\u0108\3\2\2\2/\u010d\3\2\2\2\61\u0116\3\2\2\2\63\u011f\3\2\2\2\65\u0126"+
		"\3\2\2\2\67\u012c\3\2\2\29\u0133\3\2\2\2;\u013a\3\2\2\2=\u0141\3\2\2\2"+
		"?\u0148\3\2\2\2A\u014f\3\2\2\2C\u0157\3\2\2\2E\u015d\3\2\2\2G\u0166\3"+
		"\2\2\2I\u016b\3\2\2\2K\u0174\3\2\2\2M\u017a\3\2\2\2O\u017c\3\2\2\2Q\u017e"+
		"\3\2\2\2S\u0180\3\2\2\2U\u0182\3\2\2\2W\u0185\3\2\2\2Y\u0188\3\2\2\2["+
		"\u018a\3\2\2\2]\u018d\3\2\2\2_\u0190\3\2\2\2a\u0193\3\2\2\2c\u0196\3\2"+
		"\2\2e\u0199\3\2\2\2g\u019c\3\2\2\2i\u019f\3\2\2\2k\u01a1\3\2\2\2m\u01a4"+
		"\3\2\2\2o\u01a7\3\2\2\2q\u01a9\3\2\2\2s\u01ab\3\2\2\2u\u01ae\3\2\2\2w"+
		"\u01b1\3\2\2\2y\u01b3\3\2\2\2{\u01b5\3\2\2\2}\u01b7\3\2\2\2\177\u01b9"+
		"\3\2\2\2\u0081\u01bb\3\2\2\2\u0083\u01bd\3\2\2\2\u0085\u01bf\3\2\2\2\u0087"+
		"\u01c1\3\2\2\2\u0089\u01c3\3\2\2\2\u008b\u01c5\3\2\2\2\u008d\u01d4\3\2"+
		"\2\2\u008f\u01d7\3\2\2\2\u0091\u01dc\3\2\2\2\u0093\u01e2\3\2\2\2\u0095"+
		"\u01ea\3\2\2\2\u0097\u01f8\3\2\2\2\u0099\u0204\3\2\2\2\u009b\u009c\7\'"+
		"\2\2\u009c\4\3\2\2\2\u009d\u009e\7\u0080\2\2\u009e\6\3\2\2\2\u009f\u00a0"+
		"\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\b\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7m\2\2\u00ae\f\3\2\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\16\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7"+
		"c\2\2\u00b7\u00b8\7t\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\22\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7w\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7"+
		"g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7v\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\30\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\32\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\34\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7o\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7z\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7t\2\2"+
		"\u00e9\u00ea\7p\2\2\u00ea \3\2\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7n\2"+
		"\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7v\2\2\u00f0\"\3"+
		"\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"$\3\2\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7h\2\2\u00fc"+
		"(\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7n\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7g\2\2\u0103*\3\2\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107,\3\2\2\2\u0108"+
		"\u0109\7n\2\2\u0109\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b\u010c\7i\2\2"+
		"\u010c.\3\2\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7i\2"+
		"\2\u0110\u0111\7k\2\2\u0111\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7g\2\2\u0114\u0115\7t\2\2\u0115\60\3\2\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7u\2\2\u0119\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7k\2\2\u011c\u011d\7e\2\2\u011d\u011e\7v\2\2\u011e\62\3\2\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7v\2\2\u0122\u0123\7w\2\2"+
		"\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2\u0125\64\3\2\2\2\u0126\u0127\7"+
		"u\2\2\u0127\u0128\7j\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7v\2\2\u012b\66\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e\7k\2\2\u012e\u012f"+
		"\7i\2\2\u012f\u0130\7p\2\2\u0130\u0131\7g\2\2\u0131\u0132\7f\2\2\u0132"+
		"8\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7k\2\2\u0135\u0136\7|\2\2\u0136"+
		"\u0137\7g\2\2\u0137\u0138\7q\2\2\u0138\u0139\7h\2\2\u0139:\3\2\2\2\u013a"+
		"\u013b\7u\2\2\u013b\u013c\7v\2\2\u013c\u013d\7c\2\2\u013d\u013e\7v\2\2"+
		"\u013e\u013f\7k\2\2\u013f\u0140\7e\2\2\u0140<\3\2\2\2\u0141\u0142\7u\2"+
		"\2\u0142\u0143\7v\2\2\u0143\u0144\7t\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7e\2\2\u0146\u0147\7v\2\2\u0147>\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a"+
		"\7y\2\2\u014a\u014b\7k\2\2\u014b\u014c\7v\2\2\u014c\u014d\7e\2\2\u014d"+
		"\u014e\7j\2\2\u014e@\3\2\2\2\u014f\u0150\7v\2\2\u0150\u0151\7{\2\2\u0151"+
		"\u0152\7r\2\2\u0152\u0153\7g\2\2\u0153\u0154\7f\2\2\u0154\u0155\7g\2\2"+
		"\u0155\u0156\7h\2\2\u0156B\3\2\2\2\u0157\u0158\7w\2\2\u0158\u0159\7p\2"+
		"\2\u0159\u015a\7k\2\2\u015a\u015b\7q\2\2\u015b\u015c\7p\2\2\u015cD\3\2"+
		"\2\2\u015d\u015e\7w\2\2\u015e\u015f\7p\2\2\u015f\u0160\7u\2\2\u0160\u0161"+
		"\7k\2\2\u0161\u0162\7i\2\2\u0162\u0163\7p\2\2\u0163\u0164\7g\2\2\u0164"+
		"\u0165\7f\2\2\u0165F\3\2\2\2\u0166\u0167\7x\2\2\u0167\u0168\7q\2\2\u0168"+
		"\u0169\7k\2\2\u0169\u016a\7f\2\2\u016aH\3\2\2\2\u016b\u016c\7x\2\2\u016c"+
		"\u016d\7q\2\2\u016d\u016e\7n\2\2\u016e\u016f\7c\2\2\u016f\u0170\7v\2\2"+
		"\u0170\u0171\7k\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173J\3\2\2"+
		"\2\u0174\u0175\7y\2\2\u0175\u0176\7j\2\2\u0176\u0177\7k\2\2\u0177\u0178"+
		"\7n\2\2\u0178\u0179\7g\2\2\u0179L\3\2\2\2\u017a\u017b\7-\2\2\u017bN\3"+
		"\2\2\2\u017c\u017d\7/\2\2\u017dP\3\2\2\2\u017e\u017f\7,\2\2\u017fR\3\2"+
		"\2\2\u0180\u0181\7\61\2\2\u0181T\3\2\2\2\u0182\u0183\7-\2\2\u0183\u0184"+
		"\7-\2\2\u0184V\3\2\2\2\u0185\u0186\7/\2\2\u0186\u0187\7/\2\2\u0187X\3"+
		"\2\2\2\u0188\u0189\7?\2\2\u0189Z\3\2\2\2\u018a\u018b\7-\2\2\u018b\u018c"+
		"\7?\2\2\u018c\\\3\2\2\2\u018d\u018e\7/\2\2\u018e\u018f\7?\2\2\u018f^\3"+
		"\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7?\2\2\u0192`\3\2\2\2\u0193\u0194"+
		"\7\61\2\2\u0194\u0195\7?\2\2\u0195b\3\2\2\2\u0196\u0197\7\'\2\2\u0197"+
		"\u0198\7?\2\2\u0198d\3\2\2\2\u0199\u019a\7(\2\2\u019a\u019b\7(\2\2\u019b"+
		"f\3\2\2\2\u019c\u019d\7~\2\2\u019d\u019e\7~\2\2\u019eh\3\2\2\2\u019f\u01a0"+
		"\7#\2\2\u01a0j\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2\u01a3\7?\2\2\u01a3l\3"+
		"\2\2\2\u01a4\u01a5\7#\2\2\u01a5\u01a6\7?\2\2\u01a6n\3\2\2\2\u01a7\u01a8"+
		"\7>\2\2\u01a8p\3\2\2\2\u01a9\u01aa\7@\2\2\u01aar\3\2\2\2\u01ab\u01ac\7"+
		">\2\2\u01ac\u01ad\7?\2\2\u01adt\3\2\2\2\u01ae\u01af\7@\2\2\u01af\u01b0"+
		"\7?\2\2\u01b0v\3\2\2\2\u01b1\u01b2\7*\2\2\u01b2x\3\2\2\2\u01b3\u01b4\7"+
		"]\2\2\u01b4z\3\2\2\2\u01b5\u01b6\7}\2\2\u01b6|\3\2\2\2\u01b7\u01b8\7."+
		"\2\2\u01b8~\3\2\2\2\u01b9\u01ba\7\60\2\2\u01ba\u0080\3\2\2\2\u01bb\u01bc"+
		"\7+\2\2\u01bc\u0082\3\2\2\2\u01bd\u01be\7_\2\2\u01be\u0084\3\2\2\2\u01bf"+
		"\u01c0\7\177\2\2\u01c0\u0086\3\2\2\2\u01c1\u01c2\7=\2\2\u01c2\u0088\3"+
		"\2\2\2\u01c3\u01c4\7<\2\2\u01c4\u008a\3\2\2\2\u01c5\u01c9\t\2\2\2\u01c6"+
		"\u01c8\t\3\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u008c\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01d5\7\62\2\2\u01cd\u01d1\t\4\2\2\u01ce\u01d0\t\5\2\2\u01cf\u01ce\3"+
		"\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d4\u01cd\3\2"+
		"\2\2\u01d5\u008e\3\2\2\2\u01d6\u01d8\5\u008dG\2\u01d7\u01d6\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7\60\2\2\u01da\u01db\5"+
		"\u008dG\2\u01db\u0090\3\2\2\2\u01dc\u01de\7)\2\2\u01dd\u01df\n\6\2\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7)"+
		"\2\2\u01e1\u0092\3\2\2\2\u01e2\u01e4\7$\2\2\u01e3\u01e5\n\7\2\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7$\2\2\u01e9\u0094\3\2\2\2\u01ea"+
		"\u01eb\7\61\2\2\u01eb\u01ec\7,\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01ef\13"+
		"\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7,"+
		"\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\bK\2\2\u01f7"+
		"\u0096\3\2\2\2\u01f8\u01f9\7\61\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fe\3"+
		"\2\2\2\u01fb\u01fd\n\b\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0201\u0202\bL\2\2\u0202\u0098\3\2\2\2\u0203\u0205\t\t\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u0209\bM\2\2\u0209\u009a\3\2\2\2\f\2\u01c9"+
		"\u01d1\u01d4\u01d7\u01de\u01e6\u01f0\u01fe\u0206\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}