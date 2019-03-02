// Generated from Calculette.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, WS=6, ENTIER=7, PARENTHESEG=8, 
		PARENTHESED=9, UNMATCH=10;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_sousExpr = 2, RULE_nb = 3;
	public static final String[] ruleNames = {
		"start", "expr", "sousExpr", "nb"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NEWLINE", "WS", "ENTIER", "PARENTHESEG", 
		"PARENTHESED", "UNMATCH"
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
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }






	    private int evalexpr (int x, String op, int y) {
	        if ( op.equals("*") ){
	            return x*y;
	        } else if ( op.equals("+") ){
	            return x+y;
	        } else if ( op.equals("/") ){
	            return x/y;
	        } else if ( op.equals("-") ){
	            return x-y;
	        } else {
	           System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
	           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
	        }
	    }


	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public SousExprContext a;
		public Token op;
		public SousExprContext b;
		public List<SousExprContext> sousExpr() {
			return getRuleContexts(SousExprContext.class);
		}
		public SousExprContext sousExpr(int i) {
			return getRuleContext(SousExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				((ExprContext)_localctx).a = sousExpr();
				setState(12);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(13);
				((ExprContext)_localctx).b = sousExpr();
				_localctx.value+=evalexpr(((ExprContext)_localctx).a.value,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.value);System.out.println(_localctx.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				((ExprContext)_localctx).a = sousExpr();
				setState(17);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				((ExprContext)_localctx).b = sousExpr();
				_localctx.value+=evalexpr(((ExprContext)_localctx).a.value,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.value);System.out.println(_localctx.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				((ExprContext)_localctx).a = sousExpr();
				((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value;System.out.println(_localctx.value);
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

	public static class SousExprContext extends ParserRuleContext {
		public int value;
		public NbContext a;
		public Token op;
		public ExprContext b;
		public NbContext c;
		public NbContext nb() {
			return getRuleContext(NbContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SousExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sousExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterSousExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitSousExpr(this);
		}
	}

	public final SousExprContext sousExpr() throws RecognitionException {
		SousExprContext _localctx = new SousExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sousExpr);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((SousExprContext)_localctx).a = nb();
				setState(27);
				((SousExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((SousExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				((SousExprContext)_localctx).b = expr();
				_localctx.value+=evalexpr(((SousExprContext)_localctx).a.value,(((SousExprContext)_localctx).op!=null?((SousExprContext)_localctx).op.getText():null),((SousExprContext)_localctx).b.value);System.out.println(_localctx.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((SousExprContext)_localctx).a = nb();
				setState(32);
				((SousExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((SousExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				((SousExprContext)_localctx).b = expr();
				_localctx.value+=evalexpr(((SousExprContext)_localctx).a.value,(((SousExprContext)_localctx).op!=null?((SousExprContext)_localctx).op.getText():null),((SousExprContext)_localctx).b.value);System.out.println(_localctx.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(36);
				match(T__1);
				}
				setState(37);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).value = ((SousExprContext)_localctx).c.value*(-1);System.out.println(_localctx.value);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(40);
				match(T__0);
				}
				setState(41);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).value = ((SousExprContext)_localctx).c.value;System.out.println(_localctx.value);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).value = ((SousExprContext)_localctx).c.value;System.out.println(_localctx.value);
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

	public static class NbContext extends ParserRuleContext {
		public int value;
		public Token ENTIER;
		public ExprContext expr;
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode PARENTHESEG() { return getToken(CalculetteParser.PARENTHESEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTHESED() { return getToken(CalculetteParser.PARENTHESED, 0); }
		public NbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterNb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitNb(this);
		}
	}

	public final NbContext nb() throws RecognitionException {
		NbContext _localctx = new NbContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nb);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((NbContext)_localctx).ENTIER = match(ENTIER);
				((NbContext)_localctx).value =  Integer.parseInt((((NbContext)_localctx).ENTIER!=null?((NbContext)_localctx).ENTIER.getText():null));
				}
				break;
			case PARENTHESEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(PARENTHESEG);
				setState(52);
				((NbContext)_localctx).expr = expr();
				setState(53);
				match(PARENTHESED);
				((NbContext)_localctx).value =  ((NbContext)_localctx).expr.value;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5;\n\5\3\5\2\2\6\2\4\6\b\2\4\3\2\3\4\3\2\5\6\2?\2\n\3\2\2\2"+
		"\4\32\3\2\2\2\6\61\3\2\2\2\b:\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3"+
		"\2\2\2\r\16\5\6\4\2\16\17\t\2\2\2\17\20\5\6\4\2\20\21\b\3\1\2\21\33\3"+
		"\2\2\2\22\23\5\6\4\2\23\24\t\3\2\2\24\25\5\6\4\2\25\26\b\3\1\2\26\33\3"+
		"\2\2\2\27\30\5\6\4\2\30\31\b\3\1\2\31\33\3\2\2\2\32\r\3\2\2\2\32\22\3"+
		"\2\2\2\32\27\3\2\2\2\33\5\3\2\2\2\34\35\5\b\5\2\35\36\t\3\2\2\36\37\5"+
		"\4\3\2\37 \b\4\1\2 \62\3\2\2\2!\"\5\b\5\2\"#\t\2\2\2#$\5\4\3\2$%\b\4\1"+
		"\2%\62\3\2\2\2&\'\7\4\2\2\'(\5\b\5\2()\b\4\1\2)\62\3\2\2\2*+\7\3\2\2+"+
		",\5\b\5\2,-\b\4\1\2-\62\3\2\2\2./\5\b\5\2/\60\b\4\1\2\60\62\3\2\2\2\61"+
		"\34\3\2\2\2\61!\3\2\2\2\61&\3\2\2\2\61*\3\2\2\2\61.\3\2\2\2\62\7\3\2\2"+
		"\2\63\64\7\t\2\2\64;\b\5\1\2\65\66\7\n\2\2\66\67\5\4\3\2\678\7\13\2\2"+
		"89\b\5\1\29;\3\2\2\2:\63\3\2\2\2:\65\3\2\2\2;\t\3\2\2\2\5\32\61:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}