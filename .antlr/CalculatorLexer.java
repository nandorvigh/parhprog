// Generated from D:/msc/fordproggyak/kodok/kotprog\CalculatorLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LF=1, WS=2, POLYNOM=3, NUMBER=4, SHOW=5, X=6, SZAM=7, OPASSIGN=8, OPADD=9, 
		OPMUL=10, OPPWR=11, LPAR=12, RPAR=13, LBRACKET=14, RBRACKET=15, OPLST=16, 
		ID=17, ENDL=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LF", "WS", "POLYNOM", "NUMBER", "SHOW", "X", "SZAM", "OPASSIGN", "OPADD", 
			"OPMUL", "OPPWR", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "OPLST", "ID", 
			"ENDL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, "'polynom'", "'number'", "'show'", "'x'", null, "'='", 
			null, null, "'^'", "'('", "')'", "'['", "']'", "','", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LF", "WS", "POLYNOM", "NUMBER", "SHOW", "X", "SZAM", "OPASSIGN", 
			"OPADD", "OPMUL", "OPPWR", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "OPLST", 
			"ID", "ENDL"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\6\bH\n\b\r\b\16\bI\3\b\3\b\6\bN\n\b\r\b\16\bO\5\bR\n\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\7\22h\n\22\f\22\16\22k\13\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\b\5\2\13\13\17\17\"\"\3\2\62;\4\2--//\4\2,,\61\61\4\2C\\c|\6"+
		"\2\62;C\\aac|\2r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7\60\3\2\2\2\t"+
		"8\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25"+
		"W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2"+
		"!c\3\2\2\2#e\3\2\2\2%l\3\2\2\2\'(\7\f\2\2(\4\3\2\2\2)+\t\2\2\2*)\3\2\2"+
		"\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\b\3\2\2/\6\3\2\2\2\60\61"+
		"\7r\2\2\61\62\7q\2\2\62\63\7n\2\2\63\64\7{\2\2\64\65\7p\2\2\65\66\7q\2"+
		"\2\66\67\7o\2\2\67\b\3\2\2\289\7p\2\29:\7w\2\2:;\7o\2\2;<\7d\2\2<=\7g"+
		"\2\2=>\7t\2\2>\n\3\2\2\2?@\7u\2\2@A\7j\2\2AB\7q\2\2BC\7y\2\2C\f\3\2\2"+
		"\2DE\7z\2\2E\16\3\2\2\2FH\t\3\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JQ\3\2\2\2KM\7\60\2\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2PR\3\2\2\2QK\3\2\2\2QR\3\2\2\2R\20\3\2\2\2ST\7?\2\2T\22\3\2\2\2"+
		"UV\t\4\2\2V\24\3\2\2\2WX\t\5\2\2X\26\3\2\2\2YZ\7`\2\2Z\30\3\2\2\2[\\\7"+
		"*\2\2\\\32\3\2\2\2]^\7+\2\2^\34\3\2\2\2_`\7]\2\2`\36\3\2\2\2ab\7_\2\2"+
		"b \3\2\2\2cd\7.\2\2d\"\3\2\2\2ei\t\6\2\2fh\t\7\2\2gf\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2j$\3\2\2\2ki\3\2\2\2lm\7=\2\2m&\3\2\2\2\b\2,IOQi\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}