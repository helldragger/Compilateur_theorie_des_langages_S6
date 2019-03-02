// Generated from AnBn.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnBnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, B=2, C=3, UNMATCH=4;
	public static final int
		RULE_anbn_ = 0, RULE_file = 1, RULE_anbn = 2;
	public static final String[] ruleNames = {
		"anbn_", "file", "anbn"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'a'", "'b'", "'c'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "A", "B", "C", "UNMATCH"
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

	@Override
	public String getGrammarFileName() { return "AnBn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnBnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Anbn_Context extends ParserRuleContext {
		public AnbnContext anbn() {
			return getRuleContext(AnbnContext.class,0);
		}
		public Anbn_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbn_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).enterAnbn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).exitAnbn_(this);
		}
	}

	public final Anbn_Context anbn_() throws RecognitionException {
		Anbn_Context _localctx = new Anbn_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_anbn_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			anbn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public AnbnContext anbn() {
			return getRuleContext(AnbnContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AnBnParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			anbn();
			setState(9);
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

	public static class AnbnContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(AnBnParser.A, 0); }
		public AnbnContext anbn() {
			return getRuleContext(AnbnContext.class,0);
		}
		public TerminalNode B() { return getToken(AnBnParser.B, 0); }
		public AnbnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).enterAnbn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnBnListener ) ((AnBnListener)listener).exitAnbn(this);
		}
	}

	public final AnbnContext anbn() throws RecognitionException {
		AnbnContext _localctx = new AnbnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anbn);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(A);
				setState(12);
				anbn();
				setState(13);
				match(B);
				}
				break;
			case EOF:
			case B:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\25\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\23\n\4\3\4\2"+
		"\2\5\2\4\6\2\2\2\22\2\b\3\2\2\2\4\n\3\2\2\2\6\22\3\2\2\2\b\t\5\6\4\2\t"+
		"\3\3\2\2\2\n\13\5\6\4\2\13\f\7\2\2\3\f\5\3\2\2\2\r\16\7\3\2\2\16\17\5"+
		"\6\4\2\17\20\7\4\2\2\20\23\3\2\2\2\21\23\3\2\2\2\22\r\3\2\2\2\22\21\3"+
		"\2\2\2\23\7\3\2\2\2\3\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}