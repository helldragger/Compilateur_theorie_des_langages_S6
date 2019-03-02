// Generated from Calculette.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, STREAM_IN=19, STREAM_OUT=20, IF=21, ELSE=22, WHILE=23, FOR=24, 
		REPEAT=25, UNTIL=26, TYPE=27, NOT=28, OR=29, AND=30, TRUE=31, FALSE=32, 
		RETURN=33, IDENTIFIANT=34, NEWLINE=35, WS=36, FLOAT=37, ENTIER=38, COMMENT=39, 
		UNMATCH=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "STREAM_IN", "STREAM_OUT", "IF", "ELSE", "WHILE", "FOR", "REPEAT", 
		"UNTIL", "TYPE", "NOT", "OR", "AND", "TRUE", "FALSE", "RETURN", "IDENTIFIANT", 
		"NEWLINE", "WS", "FLOAT", "ENTIER", "COMMENT", "UNMATCH"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'+'", "'*'", "'/'", "'('", "')'", "'='", "';'", "'=='", 
		"'!='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'{'", "'}'", "','", "'<<'", 
		"'>>'", "'if'", "'else'", "'while'", "'for'", "'repeat'", "'until'", null, 
		null, null, null, null, null, "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "STREAM_IN", "STREAM_OUT", "IF", 
		"ELSE", "WHILE", "FOR", "REPEAT", "UNTIL", "TYPE", "NOT", "OR", "AND", 
		"TRUE", "FALSE", "RETURN", "IDENTIFIANT", "NEWLINE", "WS", "FLOAT", "ENTIER", 
		"COMMENT", "UNMATCH"
	};
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


	public CalculetteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00aa\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u00b2\n\35\3\36\3\36\3\36\3\36\5\36\u00b8\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u00bf\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u00c9\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00d4\n!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\6#\u00de\n#\r#\16#\u00df\3$\3$\5$\u00e4\n$\3$\5$\u00e7\n$"+
		"\3$\5$\u00ea\n$\3$\5$\u00ed\n$\3%\6%\u00f0\n%\r%\16%\u00f1\3%\3%\3&\6"+
		"&\u00f7\n&\r&\16&\u00f8\3&\3&\7&\u00fd\n&\f&\16&\u0100\13&\3\'\6\'\u0103"+
		"\n\'\r\'\16\'\u0104\3(\6(\u0108\n(\r(\16(\u0109\3(\7(\u010d\n(\f(\16("+
		"\u0110\13(\3(\3(\3)\3)\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\5\4\2C\\"+
		"c|\4\2\13\13\"\"\3\2\f\f\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3"+
		"\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25f\3\2\2\2\27i"+
		"\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!v\3\2\2\2#x\3"+
		"\2\2\2%z\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0082\3\2\2\2-\u0085\3\2\2\2"+
		"/\u008a\3\2\2\2\61\u0090\3\2\2\2\63\u0094\3\2\2\2\65\u009b\3\2\2\2\67"+
		"\u00a9\3\2\2\29\u00b1\3\2\2\2;\u00b7\3\2\2\2=\u00be\3\2\2\2?\u00c8\3\2"+
		"\2\2A\u00d3\3\2\2\2C\u00d5\3\2\2\2E\u00dd\3\2\2\2G\u00ec\3\2\2\2I\u00ef"+
		"\3\2\2\2K\u00f6\3\2\2\2M\u0102\3\2\2\2O\u0107\3\2\2\2Q\u0113\3\2\2\2S"+
		"T\7/\2\2T\4\3\2\2\2UV\7-\2\2V\6\3\2\2\2WX\7,\2\2X\b\3\2\2\2YZ\7\61\2\2"+
		"Z\n\3\2\2\2[\\\7*\2\2\\\f\3\2\2\2]^\7+\2\2^\16\3\2\2\2_`\7?\2\2`\20\3"+
		"\2\2\2ab\7=\2\2b\22\3\2\2\2cd\7?\2\2de\7?\2\2e\24\3\2\2\2fg\7#\2\2gh\7"+
		"?\2\2h\26\3\2\2\2ij\7>\2\2jk\7@\2\2k\30\3\2\2\2lm\7@\2\2m\32\3\2\2\2n"+
		"o\7@\2\2op\7?\2\2p\34\3\2\2\2qr\7>\2\2r\36\3\2\2\2st\7>\2\2tu\7?\2\2u"+
		" \3\2\2\2vw\7}\2\2w\"\3\2\2\2xy\7\177\2\2y$\3\2\2\2z{\7.\2\2{&\3\2\2\2"+
		"|}\7>\2\2}~\7>\2\2~(\3\2\2\2\177\u0080\7@\2\2\u0080\u0081\7@\2\2\u0081"+
		"*\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084,\3\2\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089"+
		".\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\60\3\2\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093\62\3\2\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7r\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2"+
		"\u0099\u009a\7v\2\2\u009a\64\3\2\2\2\u009b\u009c\7w\2\2\u009c\u009d\7"+
		"p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\66"+
		"\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00aa\7v\2\2\u00a4"+
		"\u00a5\7h\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00aa\7v\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa8\3\2"+
		"\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7q\2\2\u00ad\u00b2\7v\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7q\2\2\u00b0\u00b2\7p\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b8\7t\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b8\7w\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8<\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bf\7"+
		"f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00bf\7v\2\2\u00be\u00b9\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00c9\7g\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7c\2\2\u00c7\u00c9\7k\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4"+
		"\3\2\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00d4\7g\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d4\7z\2\2\u00d3\u00ca\3\2\2"+
		"\2\u00d3\u00cf\3\2\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7"+
		"g\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7p\2\2\u00dbD\3\2\2\2\u00dc\u00de\t\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0F\3\2\2\2\u00e1"+
		"\u00e6\7=\2\2\u00e2\u00e4\7\17\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\f\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00ea\7\17\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\7\f\2\2\u00ec"+
		"\u00e1\3\2\2\2\u00ec\u00e9\3\2\2\2\u00edH\3\2\2\2\u00ee\u00f0\t\3\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b%\2\2\u00f4J\3\2\2\2\u00f5\u00f7"+
		"\4\62;\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\7\60\2\2\u00fb\u00fd\4"+
		"\62;\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ffL\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\4\62;\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105N\3\2\2\2\u0106\u0108\7%\2\2\u0107\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b"+
		"\u010d\n\4\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\b(\2\2\u0112P\3\2\2\2\u0113\u0114\13\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0116\b)\2\2\u0116R\3\2\2\2\24\2\u00a9\u00b1\u00b7\u00be\u00c8"+
		"\u00d3\u00df\u00e3\u00e6\u00e9\u00ec\u00f1\u00f8\u00fe\u0104\u0109\u010e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}