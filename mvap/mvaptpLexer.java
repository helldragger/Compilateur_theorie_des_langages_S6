// Generated from mvaptp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mvaptpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		OR=10, AND=11, NOT=12, INF=13, INFEQ=14, SUP=15, SUPEQ=16, EQUAL=17, NEQ=18, 
		TRUE=19, FALSE=20, READ=21, WRITE=22, WHILE=23, FOR=24, ENTIER=25, REEL=26, 
		TYPE=27, IDENTIFIANT=28, EOL=29, NEWLINE=30, WS=31, UNMATCH=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"WORD", "INT", "FLOAT", "CHIFFRE", "OR", "AND", "NOT", "INF", "INFEQ", 
		"SUP", "SUPEQ", "EQUAL", "NEQ", "TRUE", "FALSE", "READ", "WRITE", "WHILE", 
		"FOR", "ENTIER", "REEL", "TYPE", "IDENTIFIANT", "EOL", "NEWLINE", "WS", 
		"UNMATCH"
	};


	public mvaptpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mvaptp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13_\n\13\r\13\16\13`\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\6\36\u00af\n\36\r\36\16\36\u00b0\3\37\6\37\u00b4\n\37\r\37"+
		"\16\37\u00b5\3\37\3\37\7\37\u00ba\n\37\f\37\16\37\u00bd\13\37\3 \3 \5"+
		" \u00c1\n \3!\3!\3\"\3\"\3#\3#\3#\5#\u00ca\n#\3#\3#\3$\3$\6$\u00d0\n$"+
		"\r$\16$\u00d1\3$\3$\3%\3%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\2\27\2\31\2\33\2\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25"+
		"\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"\3\2\3\4\2\13\13"+
		"\"\"\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2"+
		"\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2"+
		"\2\2\25^\3\2\2\2\27b\3\2\2\2\31f\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37q\3"+
		"\2\2\2!u\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'~\3\2\2\2)\u0080\3\2\2\2+\u0083"+
		"\3\2\2\2-\u0086\3\2\2\2/\u0089\3\2\2\2\61\u008e\3\2\2\2\63\u0094\3\2\2"+
		"\2\65\u009b\3\2\2\2\67\u00a3\3\2\2\29\u00a9\3\2\2\2;\u00ae\3\2\2\2=\u00b3"+
		"\3\2\2\2?\u00c0\3\2\2\2A\u00c2\3\2\2\2C\u00c4\3\2\2\2E\u00c9\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00d5\3\2\2\2KL\7\61\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2"+
		"\2OP\7+\2\2P\b\3\2\2\2QR\7,\2\2R\n\3\2\2\2ST\7}\2\2T\f\3\2\2\2UV\7-\2"+
		"\2V\16\3\2\2\2WX\7\177\2\2X\20\3\2\2\2YZ\7?\2\2Z\22\3\2\2\2[\\\7/\2\2"+
		"\\\24\3\2\2\2]_\4c|\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26\3\2"+
		"\2\2bc\7k\2\2cd\7p\2\2de\7v\2\2e\30\3\2\2\2fg\7h\2\2gh\7n\2\2hi\7q\2\2"+
		"ij\7c\2\2jk\7v\2\2k\32\3\2\2\2lm\4\62;\2m\34\3\2\2\2no\7q\2\2op\7t\2\2"+
		"p\36\3\2\2\2qr\7c\2\2rs\7p\2\2st\7f\2\2t \3\2\2\2uv\7p\2\2vw\7q\2\2wx"+
		"\7v\2\2x\"\3\2\2\2yz\7>\2\2z$\3\2\2\2{|\7>\2\2|}\7?\2\2}&\3\2\2\2~\177"+
		"\7@\2\2\177(\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082*\3\2"+
		"\2\2\u0083\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085,\3\2\2\2\u0086\u0087"+
		"\7#\2\2\u0087\u0088\7?\2\2\u0088.\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d\60\3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7g\2\2\u0093\62\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7f\2\2\u0098\u0099\7n\2\2\u0099\u009a\7p\2\2"+
		"\u009a\64\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7"+
		"k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7p\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a88\3\2\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac:\3\2\2\2\u00ad\u00af"+
		"\5\33\16\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1<\3\2\2\2\u00b2\u00b4\5\33\16\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bb\7\60\2\2\u00b8\u00ba\5\33\16\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		">\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\5\27\f\2\u00bf\u00c1\5\31\r"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1@\3\2\2\2\u00c2\u00c3"+
		"\5\25\13\2\u00c3B\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5D\3\2\2\2\u00c6\u00c7"+
		"\7\17\2\2\u00c7\u00ca\7\f\2\2\u00c8\u00ca\7\f\2\2\u00c9\u00c6\3\2\2\2"+
		"\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b#\2\2\u00ccF\3\2"+
		"\2\2\u00cd\u00d0\t\2\2\2\u00ce\u00d0\5E#\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\b$\2\2\u00d4H\3\2\2\2\u00d5\u00d6\13\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b%\2\2\u00d8J\3\2\2\2\13\2`\u00b0\u00b5"+
		"\u00bb\u00c0\u00c9\u00cf\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}