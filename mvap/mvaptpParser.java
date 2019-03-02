// Generated from mvaptp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mvaptpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		OR=10, AND=11, NOT=12, INF=13, INFEQ=14, SUP=15, SUPEQ=16, EQUAL=17, NEQ=18, 
		TRUE=19, FALSE=20, READ=21, WRITE=22, WHILE=23, FOR=24, ENTIER=25, REEL=26, 
		TYPE=27, IDENTIFIANT=28, EOL=29, NEWLINE=30, WS=31, UNMATCH=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'('", "')'", "'*'", "'{'", "'+'", "'}'", "'='", "'-'", 
		"'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'true'", "'false'", "'readln'", "'println'", "'while'", "'for'", "ENTIER", 
		"REEL", "TYPE", "IDENTIFIANT", "';'", "NEWLINE", "WS", "UNMATCH"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_boolexpr = 2, RULE_condition = 3, 
		RULE_assignation = 4, RULE_instruction = 5, RULE_block = 6, RULE_whileloop = 7, 
		RULE_calcul = 8, RULE_finInstruction = 9;
	public static final String[] ruleNames = {
		"start", "expression", "boolexpr", "condition", "assignation", "instruction", 
		"block", "whileloop", "calcul", "finInstruction"
	};

	@Override
	public String getGrammarFileName() { return "mvaptp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private final int INT_MEM_ADDR = 10;
	    private final int FLOAT_MEM_ADDR = 30;
	    private final int REG_A_INT_ADDR = 0;
	    private final int REG_B_INT_ADDR = 1;
	    private final int REG_A_FLOAT_ADDR = 0;
	    private final int REG_B_FLOAT_ADDR = 2;

	    private TablesSymboles globalSymbols = new TablesSymboles();
	    private TablesSymboles localsSymbols = new TablesSymboles();

	    private TableSymboles tablesSymboles = new TableSymboles();
	    private double evalexpr (Double x, String op, Double y) {
	        if ( op.equals("*") ){
	            return x*y;
	        } else if ( op.equals("/") ){
	            return x/y;
	        } else if ( op.equals("%") ){
	            return x%y;
	        } else if ( op.equals("+") ){
	            return x+y;
	        } else if ( op.equals("-") ){
	            return x-y;
	        } else {
	            System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
	            throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
	        }
	   }

	   private String evalMathOperation(String op){
	        if ( op.equals("*") ){
	            return "MUL\n";
	        } else if ( op.equals("/") ){
	            return "DIV\n";
	        } else if ( op.equals("+") ){
	            return "ADD\n";
	        } else if ( op.equals("-") ){
	            return "SUB\n";
	        } else {
	            System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
	            throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
	        }
	   }

	    private int getRealGlobalAddress(String symbol){
	        return getRealGlobalAddress(tablesSymboles.getAdresseType(symbol));
	    }

	    private int getRealGlobalAddress(AdresseType at){
	        return getRealGlobalAddress(at.adresse);
	    }

	    private int getRealGlobalAddress(int addr){
	        return addr + 2;
	    }

	   private String evalType(String type){
	        if (type.equals("int"))
	            return "int";
	        else if (type.equals("float"))
	            return "float";
	        else
	            throw new IllegalArgumentException("Unknown type :'"+type+"'");
	   }
	    private int _label = 0;
	    /** générateur de nom d'étiquettes */
	    private int nextLabel() { return _label++; }

	public mvaptpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul;
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mvaptpParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); ((StartContext)_localctx).calcul = calcul();
			setState(21); match(EOF);
			System.out.println(((StartContext)_localctx).calcul.code);
			}
		}
		catch (RecognitionException re) {
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
		public String code;
		public ExpressionContext l;
		public Token ENTIER;
		public Token REEL;
		public Token IDENTIFIANT;
		public ExpressionContext r;
		public TerminalNode REEL() { return getToken(mvaptpParser.REEL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ENTIER() { return getToken(mvaptpParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(mvaptpParser.IDENTIFIANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		 ((ExpressionContext)_localctx).code =  new String(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(25); match(T__7);
				setState(26); ((ExpressionContext)_localctx).l = expression(0);
				setState(27); match(T__6);
				_localctx.code += ((ExpressionContext)_localctx).l.code;
				}
				break;
			case ENTIER:
				{
				setState(30); ((ExpressionContext)_localctx).ENTIER = match(ENTIER);
				_localctx.code += "PUSHI "+(((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null)+"\n";
				}
				break;
			case REEL:
				{
				setState(32); ((ExpressionContext)_localctx).REEL = match(REEL);
				_localctx.code += "PUSHF "+(((ExpressionContext)_localctx).REEL!=null?((ExpressionContext)_localctx).REEL.getText():null)+"\n";
				}
				break;
			case IDENTIFIANT:
				{
				setState(34); ((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            int addr = getRealGlobalAddress((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));
				            _localctx.code += "PUSHG " + addr+"\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(39); match(T__8);
						setState(40); ((ExpressionContext)_localctx).r = expression(8);
						_localctx.code += ((ExpressionContext)_localctx).l.code+((ExpressionContext)_localctx).r.code+"DIV\n";
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44); match(T__5);
						setState(45); ((ExpressionContext)_localctx).r = expression(7);
						_localctx.code += ((ExpressionContext)_localctx).l.code+((ExpressionContext)_localctx).r.code+"MUL\n";
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49); match(T__0);
						setState(50); ((ExpressionContext)_localctx).r = expression(6);
						_localctx.code += ((ExpressionContext)_localctx).l.code+((ExpressionContext)_localctx).r.code+"SUB\n";
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54); match(T__3);
						setState(55); ((ExpressionContext)_localctx).r = expression(5);
						_localctx.code += ((ExpressionContext)_localctx).l.code+((ExpressionContext)_localctx).r.code+"ADD\n";
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolexprContext extends ParserRuleContext {
		public String code;
		public BoolexprContext l;
		public BoolexprContext r;
		public BoolexprContext c;
		public ConditionContext condition;
		public TerminalNode NOT() { return getToken(mvaptpParser.NOT, 0); }
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode FALSE() { return getToken(mvaptpParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(mvaptpParser.TRUE, 0); }
		public TerminalNode AND() { return getToken(mvaptpParser.AND, 0); }
		public TerminalNode OR() { return getToken(mvaptpParser.OR, 0); }
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitBoolexpr(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_boolexpr, _p);
		 ((BoolexprContext)_localctx).code =  new String(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(64); match(NOT);
				setState(65); ((BoolexprContext)_localctx).r = boolexpr(3);

				        _localctx.code += ((BoolexprContext)_localctx).r.code;
				        _localctx.code += "PUSHI 0\n";
				        _localctx.code += "EQUAL\n";
				    
				}
				break;
			case 2:
				{
				setState(68); match(T__7);
				setState(69); ((BoolexprContext)_localctx).c = boolexpr(0);
				setState(70); match(T__6);
				 _localctx.code += ((BoolexprContext)_localctx).c.code;
				}
				break;
			case 3:
				{
				setState(73); ((BoolexprContext)_localctx).condition = condition();
				_localctx.code += ((BoolexprContext)_localctx).condition.code;
				}
				break;
			case 4:
				{
				setState(76); match(TRUE);
				 _localctx.code += "PUSHI 1\n"; 
				}
				break;
			case 5:
				{
				setState(78); match(FALSE);
				 _localctx.code += "PUSHI 0\n"; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83); match(AND);
						setState(84); ((BoolexprContext)_localctx).r = boolexpr(3);

						                  _localctx.code += ((BoolexprContext)_localctx).l.code;
						                  _localctx.code += ((BoolexprContext)_localctx).r.code;
						                  _localctx.code += "EQUAL\n";
						              
						}
						break;
					case 2:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(87);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(88); match(OR);
						setState(89); ((BoolexprContext)_localctx).r = boolexpr(2);

						                  _localctx.code += ((BoolexprContext)_localctx).l.code;
						                  _localctx.code += ((BoolexprContext)_localctx).r.code;
						                  _localctx.code += "ADD\n";
						                  _localctx.code += "PUSHI 0\n";
						                  _localctx.code += "SUP\n";
						              
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext c;
		public ExpressionContext l;
		public ExpressionContext r;
		public TerminalNode SUPEQ() { return getToken(mvaptpParser.SUPEQ, 0); }
		public TerminalNode EQUAL() { return getToken(mvaptpParser.EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(mvaptpParser.NEQ, 0); }
		public TerminalNode SUP() { return getToken(mvaptpParser.SUP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INF() { return getToken(mvaptpParser.INF, 0); }
		public TerminalNode INFEQ() { return getToken(mvaptpParser.INFEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		 ((ConditionContext)_localctx).code =  new String(); 
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(T__7);
				setState(98); ((ConditionContext)_localctx).c = condition();
				setState(99); match(T__6);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).c.code;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); ((ConditionContext)_localctx).l = expression(0);
				setState(103); match(INF);
				setState(104); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "INF\n";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); ((ConditionContext)_localctx).l = expression(0);
				setState(108); match(INFEQ);
				setState(109); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "INFEQ\n";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); ((ConditionContext)_localctx).l = expression(0);
				setState(113); match(SUP);
				setState(114); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "SUP\n";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117); ((ConditionContext)_localctx).l = expression(0);
				setState(118); match(SUPEQ);
				setState(119); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "SUPEQ\n";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122); ((ConditionContext)_localctx).l = expression(0);
				setState(123); match(EQUAL);
				setState(124); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "EQUAL\n";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127); ((ConditionContext)_localctx).l = expression(0);
				setState(128); match(NEQ);
				setState(129); ((ConditionContext)_localctx).r = expression(0);
				 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).l.code + ((ConditionContext)_localctx).r.code + "NEQ\n";
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(mvaptpParser.TYPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(mvaptpParser.IDENTIFIANT, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignation);
		 ((AssignationContext)_localctx).code =  new String(); 
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); ((AssignationContext)_localctx).TYPE = match(TYPE);
				setState(135); ((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            String type = evalType((((AssignationContext)_localctx).TYPE!=null?((AssignationContext)_localctx).TYPE.getText():null));
				            tablesSymboles.putVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null), evalType((((AssignationContext)_localctx).TYPE!=null?((AssignationContext)_localctx).TYPE.getText():null)));
				            int addr = getRealGlobalAddress((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            if (type.equals("int"))
				                ((AssignationContext)_localctx).code =  "PUSHI 0\nSTOREG "+addr+"\n";
				            else if (type.equals("float"))
				                ((AssignationContext)_localctx).code =  "PUSHF 0.0\nSTOREG "+addr+"\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); ((AssignationContext)_localctx).TYPE = match(TYPE);
				setState(138); ((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(139); match(T__1);
				setState(140); ((AssignationContext)_localctx).expression = expression(0);

				            String type = evalType((((AssignationContext)_localctx).TYPE!=null?((AssignationContext)_localctx).TYPE.getText():null));
				            tablesSymboles.putVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null), evalType((((AssignationContext)_localctx).TYPE!=null?((AssignationContext)_localctx).TYPE.getText():null)));
				            int addr = getRealGlobalAddress((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));

				            _localctx.code += ((AssignationContext)_localctx).expression.code;
				            _localctx.code += "STOREG "+addr+"\n";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); ((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(144); match(T__1);
				setState(145); ((AssignationContext)_localctx).expression = expression(0);

				            int addr = getRealGlobalAddress((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            _localctx.code += ((AssignationContext)_localctx).expression.code;
				            _localctx.code += "STOREG "+addr+"\n";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public Token IDENTIFIANT;
		public WhileloopContext whileloop;
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(mvaptpParser.WRITE, 0); }
		public TerminalNode READ() { return getToken(mvaptpParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIANT() { return getToken(mvaptpParser.IDENTIFIANT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		 ((InstructionContext)_localctx).code =  new String(); 
		try {
			int _alt;
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); ((InstructionContext)_localctx).expression = expression(0);
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            _localctx.code += ((InstructionContext)_localctx).expression.code+"POP\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); ((InstructionContext)_localctx).assignation = assignation();
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(160); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            _localctx.code += ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); match(READ);
				setState(168); match(T__7);
				setState(169); ((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(170); match(T__6);
				setState(172); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(174); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            int addr = getRealGlobalAddress((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null));
				            _localctx.code += "READ\n";
				            _localctx.code += "STOREG "+addr+"\n";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(WRITE);
				setState(179); match(T__7);
				setState(180); ((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(181); match(T__6);
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            int addr = getRealGlobalAddress((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null));
				            _localctx.code += "PUSHG " + addr+"\n";
				            _localctx.code += "WRITE\nPOP\n";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189); ((InstructionContext)_localctx).whileloop = whileloop();
				setState(191); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(190); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(193); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            _localctx.code += ((InstructionContext)_localctx).whileloop.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197); block();
				setState(199); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(198); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(201); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(203); finInstruction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		 ((BlockContext)_localctx).code =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(T__4);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__4) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << ENTIER) | (1L << REEL) | (1L << TYPE) | (1L << IDENTIFIANT) | (1L << EOL) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(211); ((BlockContext)_localctx).instruction = instruction();
				_localctx.code += ((BlockContext)_localctx).instruction.code;
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public String code;
		public int startlabel;
		public int endlabel;
		public BoolexprContext c;
		public BlockContext b;
		public TerminalNode WHILE() { return getToken(mvaptpParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileloop);
		 ((WhileloopContext)_localctx).code =  ""; ((WhileloopContext)_localctx).startlabel =  nextLabel(); ((WhileloopContext)_localctx).endlabel =  nextLabel();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(WHILE);
			setState(222); match(T__7);
			setState(223); ((WhileloopContext)_localctx).c = boolexpr(0);
			setState(224); match(T__6);
			setState(225); ((WhileloopContext)_localctx).b = block();

			            _localctx.code += "LABEL " + _localctx.startlabel + "\n";
			            _localctx.code += ((WhileloopContext)_localctx).c.code;
			            _localctx.code += "JUMPF "+_localctx.endlabel+"\n";
			            _localctx.code += ((WhileloopContext)_localctx).b.code;
			            _localctx.code += "JUMP " + _localctx.startlabel + "\n";
			            _localctx.code += "LABEL " + _localctx.endlabel + "\n";
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_calcul);
		 ((CalculContext)_localctx).code =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__4) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << ENTIER) | (1L << REEL) | (1L << TYPE) | (1L << IDENTIFIANT) | (1L << EOL) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(228); ((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code;
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            _localctx.code += "HALT\n";
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinInstructionContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(mvaptpParser.WS, i);
		}
		public List<TerminalNode> EOL() { return getTokens(mvaptpParser.EOL); }
		public List<TerminalNode> WS() { return getTokens(mvaptpParser.WS); }
		public List<TerminalNode> NEWLINE() { return getTokens(mvaptpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(mvaptpParser.NEWLINE, i);
		}
		public TerminalNode EOL(int i) {
			return getToken(mvaptpParser.EOL, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvaptpListener ) ((mvaptpListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(238); match(WS);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(244);
					_la = _input.LA(1);
					if ( !(_la==EOL || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 2: return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0087\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0098\n\6\3\7\3\7"+
		"\6\7\u009c\n\7\r\7\16\7\u009d\3\7\3\7\3\7\3\7\6\7\u00a4\n\7\r\7\16\7\u00a5"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00af\n\7\r\7\16\7\u00b0\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7\u00ba\n\7\r\7\16\7\u00bb\3\7\3\7\3\7\3\7\6\7\u00c2"+
		"\n\7\r\7\16\7\u00c3\3\7\3\7\3\7\3\7\6\7\u00ca\n\7\r\7\16\7\u00cb\3\7\6"+
		"\7\u00cf\n\7\r\7\16\7\u00d0\5\7\u00d3\n\7\3\b\3\b\3\b\3\b\7\b\u00d9\n"+
		"\b\f\b\16\b\u00dc\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\n\3\n\3\13\7\13\u00f2\n\13\f\13\16"+
		"\13\u00f5\13\13\3\13\6\13\u00f8\n\13\r\13\16\13\u00f9\3\13\2\4\4\6\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\3\3\2\37 \u0118\2\26\3\2\2\2\4&\3\2\2\2\6R\3"+
		"\2\2\2\b\u0086\3\2\2\2\n\u0097\3\2\2\2\f\u00d2\3\2\2\2\16\u00d4\3\2\2"+
		"\2\20\u00df\3\2\2\2\22\u00eb\3\2\2\2\24\u00f3\3\2\2\2\26\27\5\22\n\2\27"+
		"\30\7\2\2\3\30\31\b\2\1\2\31\3\3\2\2\2\32\33\b\3\1\2\33\34\7\4\2\2\34"+
		"\35\5\4\3\2\35\36\7\5\2\2\36\37\b\3\1\2\37\'\3\2\2\2 !\7\33\2\2!\'\b\3"+
		"\1\2\"#\7\34\2\2#\'\b\3\1\2$%\7\36\2\2%\'\b\3\1\2&\32\3\2\2\2& \3\2\2"+
		"\2&\"\3\2\2\2&$\3\2\2\2\'>\3\2\2\2()\f\t\2\2)*\7\3\2\2*+\5\4\3\n+,\b\3"+
		"\1\2,=\3\2\2\2-.\f\b\2\2./\7\6\2\2/\60\5\4\3\t\60\61\b\3\1\2\61=\3\2\2"+
		"\2\62\63\f\7\2\2\63\64\7\13\2\2\64\65\5\4\3\b\65\66\b\3\1\2\66=\3\2\2"+
		"\2\678\f\6\2\289\7\b\2\29:\5\4\3\7:;\b\3\1\2;=\3\2\2\2<(\3\2\2\2<-\3\2"+
		"\2\2<\62\3\2\2\2<\67\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2"+
		"@>\3\2\2\2AB\b\4\1\2BC\7\16\2\2CD\5\6\4\5DE\b\4\1\2ES\3\2\2\2FG\7\4\2"+
		"\2GH\5\6\4\2HI\7\5\2\2IJ\b\4\1\2JS\3\2\2\2KL\5\b\5\2LM\b\4\1\2MS\3\2\2"+
		"\2NO\7\25\2\2OS\b\4\1\2PQ\7\26\2\2QS\b\4\1\2RA\3\2\2\2RF\3\2\2\2RK\3\2"+
		"\2\2RN\3\2\2\2RP\3\2\2\2S`\3\2\2\2TU\f\4\2\2UV\7\r\2\2VW\5\6\4\5WX\b\4"+
		"\1\2X_\3\2\2\2YZ\f\3\2\2Z[\7\f\2\2[\\\5\6\4\4\\]\b\4\1\2]_\3\2\2\2^T\3"+
		"\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\7\3\2\2\2b`\3\2\2\2cd"+
		"\7\4\2\2de\5\b\5\2ef\7\5\2\2fg\b\5\1\2g\u0087\3\2\2\2hi\5\4\3\2ij\7\17"+
		"\2\2jk\5\4\3\2kl\b\5\1\2l\u0087\3\2\2\2mn\5\4\3\2no\7\20\2\2op\5\4\3\2"+
		"pq\b\5\1\2q\u0087\3\2\2\2rs\5\4\3\2st\7\21\2\2tu\5\4\3\2uv\b\5\1\2v\u0087"+
		"\3\2\2\2wx\5\4\3\2xy\7\22\2\2yz\5\4\3\2z{\b\5\1\2{\u0087\3\2\2\2|}\5\4"+
		"\3\2}~\7\23\2\2~\177\5\4\3\2\177\u0080\b\5\1\2\u0080\u0087\3\2\2\2\u0081"+
		"\u0082\5\4\3\2\u0082\u0083\7\24\2\2\u0083\u0084\5\4\3\2\u0084\u0085\b"+
		"\5\1\2\u0085\u0087\3\2\2\2\u0086c\3\2\2\2\u0086h\3\2\2\2\u0086m\3\2\2"+
		"\2\u0086r\3\2\2\2\u0086w\3\2\2\2\u0086|\3\2\2\2\u0086\u0081\3\2\2\2\u0087"+
		"\t\3\2\2\2\u0088\u0089\7\35\2\2\u0089\u008a\7\36\2\2\u008a\u0098\b\6\1"+
		"\2\u008b\u008c\7\35\2\2\u008c\u008d\7\36\2\2\u008d\u008e\7\n\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\u0090\b\6\1\2\u0090\u0098\3\2\2\2\u0091\u0092\7\36"+
		"\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5\4\3\2\u0094\u0095\b\6\1\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u008b\3\2"+
		"\2\2\u0097\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098\13\3\2\2\2\u0099\u009b"+
		"\5\4\3\2\u009a\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\b\7\1\2\u00a0\u00d3\3\2\2\2\u00a1\u00a3\5\n\6\2\u00a2\u00a4\5\24\13\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\7\1\2\u00a8\u00d3\3\2\2\2\u00a9"+
		"\u00aa\7\27\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00ae\7"+
		"\5\2\2\u00ad\u00af\5\24\13\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\7"+
		"\1\2\u00b3\u00d3\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\7\4\2\2\u00b6"+
		"\u00b7\7\36\2\2\u00b7\u00b9\7\5\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\b\7\1\2\u00be\u00d3\3\2\2\2\u00bf\u00c1\5\20"+
		"\t\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\7"+
		"\1\2\u00c6\u00d3\3\2\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00ca\5\24\13\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u0099\3\2\2\2\u00d2\u00a1\3\2\2\2\u00d2\u00a9\3\2\2\2\u00d2"+
		"\u00b4\3\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d3\r\3\2\2\2\u00d4\u00da\7\7\2\2\u00d5\u00d6\5\f\7\2\u00d6\u00d7"+
		"\b\b\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\t\2\2\u00de\17\3\2\2\2\u00df\u00e0\7\31\2\2\u00e0\u00e1"+
		"\7\4\2\2\u00e1\u00e2\5\6\4\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\5\16\b\2"+
		"\u00e4\u00e5\b\t\1\2\u00e5\21\3\2\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8"+
		"\b\n\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\b\n\1\2\u00ef\23\3\2\2\2\u00f0\u00f2\7!\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\25\3\2\2\2\26&<>R^`\u0086\u0097\u009d\u00a5\u00b0\u00bb\u00c3\u00cb\u00d0"+
		"\u00d2\u00da\u00eb\u00f3\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}