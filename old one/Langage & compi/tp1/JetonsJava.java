// Generated from JetonsJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JetonsJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATEUR=1, MOTCLE=2, IDENTIFIANT=3, WHITE_SPACE=4, INDENTDOUBLESLASH=5, 
		INDENTCOMMENTAIRE=6, NOMBRE=7, UNMATCH=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "INDENTDOUBLESLASH", 
		"INDENTCOMMENTAIRE", "NOMBRE", "UNMATCH"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "INDENTDOUBLESLASH", 
		"INDENTCOMMENTAIRE", "NOMBRE", "UNMATCH"
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


	public JetonsJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JetonsJava.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			OPERATEUR_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			MOTCLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			IDENTIFIANT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			WHITE_SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			INDENTDOUBLESLASH_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			INDENTCOMMENTAIRE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			NOMBRE_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			UNMATCH_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPERATEUR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.print("<span style='color: purple'>"+getText()+"</span>"); 
			break;
		}
	}
	private void MOTCLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 System.out.print("<span style='color: green'>[motcle : "+getText()+" ]</span>"); 
			break;
		}
	}
	private void IDENTIFIANT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 System.out.print("<span style='color: orange'>[ident : "+getText()+" ]</span>"); 
			break;
		}
	}
	private void WHITE_SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 System.out.print("<br>"); 
			break;
		}
	}
	private void INDENTDOUBLESLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.print("");
			break;
		}
	}
	private void INDENTCOMMENTAIRE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.print("");
			break;
		}
	}
	private void NOMBRE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 System.out.print("<span style='color: red'>[nombre : "+getText()+" ]</span>"); 
			break;
		}
	}
	private void UNMATCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 System.out.print(getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u0087\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\3\3\3\3\4\3\4\7\4W\n\4\f\4\16\4"+
		"Z\13\4\3\4\3\4\3\5\6\5_\n\5\r\5\16\5`\3\5\3\5\3\6\3\6\3\6\3\6\7\6i\n\6"+
		"\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\6\b\177\n\b\r\b\16\b\u0080\3\b\3\b\3\t\3\t\3\t\3u\2"+
		"\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\6\5\2C\\aac|\6\2\62;C\\aac|"+
		"\5\2\13\f\17\17\"\"\3\2\f\f\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\36"+
		"\3\2\2\2\5P\3\2\2\2\7T\3\2\2\2\t^\3\2\2\2\13d\3\2\2\2\ro\3\2\2\2\17~\3"+
		"\2\2\2\21\u0084\3\2\2\2\23\37\7>\2\2\24\25\7>\2\2\25\37\7?\2\2\26\37\7"+
		"@\2\2\27\30\7@\2\2\30\37\7?\2\2\31\32\7?\2\2\32\37\7?\2\2\33\34\7#\2\2"+
		"\34\37\7?\2\2\35\37\7?\2\2\36\23\3\2\2\2\36\24\3\2\2\2\36\26\3\2\2\2\36"+
		"\27\3\2\2\2\36\31\3\2\2\2\36\33\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 !\b"+
		"\2\2\2!\4\3\2\2\2\"#\7d\2\2#$\7t\2\2$%\7g\2\2%&\7c\2\2&Q\7m\2\2\'(\7e"+
		"\2\2()\7n\2\2)*\7c\2\2*+\7u\2\2+Q\7u\2\2,-\7f\2\2-.\7q\2\2./\7w\2\2/\60"+
		"\7d\2\2\60\61\7n\2\2\61Q\7g\2\2\62\63\7g\2\2\63\64\7n\2\2\64\65\7u\2\2"+
		"\65Q\7g\2\2\66\67\7k\2\2\67Q\7h\2\289\7k\2\29:\7o\2\2:;\7r\2\2;<\7q\2"+
		"\2<=\7t\2\2=Q\7v\2\2>?\7r\2\2?@\7w\2\2@A\7d\2\2AB\7n\2\2BC\7k\2\2CQ\7"+
		"e\2\2DE\7u\2\2EF\7v\2\2FG\7c\2\2GH\7v\2\2HI\7k\2\2IQ\7e\2\2JK\7v\2\2K"+
		"L\7j\2\2LM\7t\2\2MN\7q\2\2NO\7y\2\2OQ\7u\2\2P\"\3\2\2\2P\'\3\2\2\2P,\3"+
		"\2\2\2P\62\3\2\2\2P\66\3\2\2\2P8\3\2\2\2P>\3\2\2\2PD\3\2\2\2PJ\3\2\2\2"+
		"QR\3\2\2\2RS\b\3\3\2S\6\3\2\2\2TX\t\2\2\2UW\t\3\2\2VU\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\b\4\4\2\\\b\3\2\2\2]_\t"+
		"\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\5\5\2c\n"+
		"\3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2gi\n\5\2\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\b\6\6\2n\f\3\2\2\2op\7\61\2"+
		"\2pq\7,\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b\7\7\2|\16\3\2"+
		"\2\2}\177\4\62;\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\b\b\2\u0083\20\3\2\2\2\u0084"+
		"\u0085\13\2\2\2\u0085\u0086\b\t\t\2\u0086\22\3\2\2\2\n\2\36PX`ju\u0080"+
		"\n\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3\t\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}