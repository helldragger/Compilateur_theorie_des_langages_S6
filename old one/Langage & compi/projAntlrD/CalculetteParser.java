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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IF=19, ELSE=20, PRINTLN=21, READLN=22, WHILE=23, FOR=24, REPEAT=25, 
		UNTIL=26, TYPE=27, NOT=28, OR=29, AND=30, TRUE=31, FALSE=32, RETURN=33, 
		IDENTIFIANT=34, NEWLINE=35, WS=36, FLOAT=37, ENTIER=38, COMMENT=39, UNMATCH=40;
	public static final int
		RULE_calcul = 0, RULE_start = 1, RULE_expression = 2, RULE_finInstruction = 3, 
		RULE_decl = 4, RULE_instruction = 5, RULE_assignation = 6, RULE_condition = 7, 
		RULE_bloc = 8, RULE_fonction = 9, RULE_params = 10, RULE_args = 11;
	public static final String[] ruleNames = {
		"calcul", "start", "expression", "finInstruction", "decl", "instruction", 
		"assignation", "condition", "bloc", "fonction", "params", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'+'", "'*'", "'/'", "'('", "')'", "'='", "';'", "'=='", 
		"'>'", "'>='", "'<>'", "'!='", "'<'", "'<='", "'{'", "'}'", "','", null, 
		null, "'println'", "'readln'", null, null, null, null, null, null, null, 
		null, null, null, "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "IF", "ELSE", "PRINTLN", "READLN", 
		"WHILE", "FOR", "REPEAT", "UNTIL", "TYPE", "NOT", "OR", "AND", "TRUE", 
		"FALSE", "RETURN", "IDENTIFIANT", "NEWLINE", "WS", "FLOAT", "ENTIER", 
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

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int _label = 0;
	    /** generateur de nom d'etiquettes */
	    private int nextLabel() { return _label++; }

	    private TablesSymboles tableSymboles = new TablesSymboles();
	    private String evalexpr (String x, String op, String y) {
	        String result = x + y;
	        if ( op.equals("*") ) {
	            return result + "MUL\n";
	        } else if ( op.equals("/") ){
	            return result + "DIV\n";
	        } else if ( op.equals("+") ){
	            return result + "ADD\n";
	        } else if ( op.equals("-") ){
	            return result + "SUB\n";
	        } else if ( op.equals("==") ){
	            return result + "EQUAL\n";
	        } else if ( op.equals("!=") || op.equals("<>")){
	            return result + "NEQ\n";
	        } else if ( op.equals(">") ){
	            return result + "SUP\n";
	        } else if ( op.equals(">=") ){
	            return result + "SUPEQ\n";
	        } else if ( op.equals("<") ){
	            return result + "INF\n";
	        } else if ( op.equals("<=") ){
	            return result + "INFEQ\n";
	        } else {
	           System.err.println("Operateur arithmetique inconnu : '"+op+"'");
	           throw new IllegalArgumentException("Operateur arithmetique inconnu : '"+op+"'");
	        }
	    }


	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FonctionContext fonction;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			 int entry = nextLabel(); _localctx.code += "  JUMP " + entry + "\n"; 
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					match(NEWLINE);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(39);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code; 
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(NEWLINE);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			 _localctx.code += "LABEL " + entry + "\n"; 
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << IF) | (1L << PRINTLN) | (1L << READLN) | (1L << WHILE) | (1L << FOR) | (1L << REPEAT) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << FLOAT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(54);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
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
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			calcul();
			setState(65);
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

	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expr1;
		public Token ENTIER;
		public Token FLOAT;
		public Token IDENTIFIANT;
		public ArgsContext args;
		public Token op;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode FLOAT() { return getToken(CalculetteParser.FLOAT, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(68);
				match(T__0);
				setState(69);
				((ExpressionContext)_localctx).expr1 = expression(9);
				((ExpressionContext)_localctx).code =   ((ExpressionContext)_localctx).expr1.code + "PUSHI -1\nMUL\n";
				}
				break;
			case 2:
				{
				setState(72);
				match(T__1);
				setState(73);
				((ExpressionContext)_localctx).expr1 = expression(8);
				((ExpressionContext)_localctx).code =   ((ExpressionContext)_localctx).expr1.code ;
				}
				break;
			case 3:
				{
				setState(76);
				match(T__4);
				setState(77);
				((ExpressionContext)_localctx).expr1 = expression(0);
				setState(78);
				match(T__5);
				((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).expr1.code;
				}
				break;
			case 4:
				{
				setState(81);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);
				((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				}
				break;
			case 5:
				{
				setState(83);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				((ExpressionContext)_localctx).code =  "PUSHF " + (((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null) + "\n";
				}
				break;
			case 6:
				{
				setState(85);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				            int adresse = tableSymboles.getAdresseType((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)).adresse;
				            ((ExpressionContext)_localctx).code =  "PUSH" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
				        
				}
				break;
			case 7:
				{
				setState(87);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(88);
				match(T__4);
				setState(89);
				((ExpressionContext)_localctx).args = args();
				setState(90);
				match(T__5);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n";
				            _localctx.code += ((ExpressionContext)_localctx).args.code;
				            _localctx.code += "CALL " + tableSymboles.getFonction((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null)).adresse + "\n";

				            for(int i = 0; i < ((ExpressionContext)_localctx).args.size; i++) {
				                _localctx.code += "POP\n";
				            }
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr1 = _prevctx;
						_localctx.expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						((ExpressionContext)_localctx).expr2 = expression(8);
						((ExpressionContext)_localctx).code =  evalexpr(((ExpressionContext)_localctx).expr1.code, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).expr2.code);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr1 = _prevctx;
						_localctx.expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(101);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						((ExpressionContext)_localctx).expr2 = expression(7);
						((ExpressionContext)_localctx).code =  evalexpr(((ExpressionContext)_localctx).expr1.code, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).expr2.code);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finInstruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(116);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(117);
				finInstruction();

				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            ((DeclContext)_localctx).code = "PUSH"+((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("float") ? "F 0." : "I 0") +"\n";
				            _localctx.code+="#"+(((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)+" \n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(121);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(122);
				match(T__6);
				setState(123);
				((DeclContext)_localctx).expression = expression(0);
				setState(124);
				finInstruction();

				            tableSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), (((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null));
				            ((DeclContext)_localctx).code =  ((DeclContext)_localctx).expression.code;
				        
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
		public BlocContext bloc;
		public ConditionContext cond;
		public InstructionContext instru;
		public InstructionContext instru2;
		public AssignationContext assigna1;
		public AssignationContext assigna2;
		public Token IDENTIFIANT;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(CalculetteParser.PRINTLN, 0); }
		public TerminalNode RETURN() { return getToken(CalculetteParser.RETURN, 0); }
		public TerminalNode WHILE() { return getToken(CalculetteParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode IF() { return getToken(CalculetteParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(CalculetteParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(CalculetteParser.FOR, 0); }
		public TerminalNode REPEAT() { return getToken(CalculetteParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(CalculetteParser.UNTIL, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public TerminalNode READLN() { return getToken(CalculetteParser.READLN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((InstructionContext)_localctx).expression = expression(0);
				setState(130);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code ;

				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((InstructionContext)_localctx).assignation = assignation();
				setState(134);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code ;

				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				finInstruction();

				            ((InstructionContext)_localctx).code = "";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				((InstructionContext)_localctx).bloc = bloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(PRINTLN);
				setState(144);
				match(T__4);
				setState(145);
				((InstructionContext)_localctx).expression = expression(0);
				setState(146);
				match(T__5);
				setState(147);
				finInstruction();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        _localctx.code += "WRITE\nPOP \n";
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(RETURN);
				setState(151);
				((InstructionContext)_localctx).expression = expression(0);
				setState(152);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				            _localctx.code += "STOREL " + tableSymboles.getAdresseType("return").adresse + "\n";
				            _localctx.code += "RETURN\n";
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(WHILE);
				setState(156);
				match(T__4);
				setState(157);
				((InstructionContext)_localctx).cond = condition(0);
				setState(158);
				match(T__5);
				setState(159);
				((InstructionContext)_localctx).instru = instruction();

				            int i = nextLabel();
				            int j = nextLabel();


				            ((InstructionContext)_localctx).code =  "LABEL " + i + "\n";
				            _localctx.code += ((InstructionContext)_localctx).cond.code + "\n";
				            _localctx.code += "JUMPF " + j + "\n";
				            _localctx.code += ((InstructionContext)_localctx).instru.code + "\n";
				            _localctx.code += "JUMP " + i + "\n";
				            _localctx.code += "LABEL " + j + "\n";
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				match(IF);
				setState(163);
				match(T__4);
				setState(164);
				((InstructionContext)_localctx).cond = condition(0);
				setState(165);
				match(T__5);
				setState(166);
				((InstructionContext)_localctx).instru = instruction();

				            int insElse = nextLabel();
				            int insEndif = nextLabel();

				            ((InstructionContext)_localctx).code =  "# IF\n";

				            _localctx.code += ((InstructionContext)_localctx).cond.code + "\n";
				            _localctx.code += "JUMPF " + insElse + "\n";
				            _localctx.code += "# THEN\n";
				            _localctx.code += ((InstructionContext)_localctx).instru.code;
				            _localctx.code += "JUMP " + insEndif + "\n";
				            _localctx.code += "LABEL " + insElse + "\n";
				        
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(168);
					match(ELSE);
					setState(169);
					((InstructionContext)_localctx).instru2 = instruction();

					             _localctx.code += "# ELSE\n";
					             _localctx.code += ((InstructionContext)_localctx).instru2.code;
					         
					}
					break;
				}

				             _localctx.code += "LABEL " + insEndif + "\n";
				         
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(FOR);
				setState(177);
				match(T__4);
				setState(178);
				((InstructionContext)_localctx).assigna1 = assignation();
				setState(179);
				match(T__7);
				setState(180);
				((InstructionContext)_localctx).cond = condition(0);
				setState(181);
				match(T__7);
				setState(182);
				((InstructionContext)_localctx).assigna2 = assignation();
				setState(183);
				match(T__5);
				setState(184);
				((InstructionContext)_localctx).instru = instruction();

				            int i =nextLabel();
				            int j = nextLabel();

				            ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assigna1.code;
				            _localctx.code+="LABEL "+j+"\n";
				            _localctx.code+=((InstructionContext)_localctx).cond.code;
				            _localctx.code+="JUMPF "+i+"\n";
				            _localctx.code+=((InstructionContext)_localctx).instru.code;
				            _localctx.code+=((InstructionContext)_localctx).assigna2.code;
				            _localctx.code+="JUMP "+j+"\n";
				            _localctx.code+="LABEL "+i+"\n";
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
				match(REPEAT);
				setState(188);
				((InstructionContext)_localctx).instru = instruction();
				setState(189);
				match(UNTIL);
				setState(190);
				match(T__4);
				setState(191);
				((InstructionContext)_localctx).cond = condition(0);
				setState(192);
				match(T__5);
				setState(193);
				finInstruction();

				            int i = nextLabel();
				            int j = nextLabel();


				            ((InstructionContext)_localctx).code =  "LABEL " + i + "\n";
				            _localctx.code += ((InstructionContext)_localctx).instru.code + "\n";
				            _localctx.code += ((InstructionContext)_localctx).cond.code + "\n";
				            _localctx.code += "JUMPF " + i + "\n";


				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(196);
				match(PRINTLN);
				setState(197);
				match(T__4);
				setState(198);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(199);
				match(T__5);
				setState(200);
				finInstruction();
				   
				        int adresse = tableSymboles.getAdresseType((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null)).adresse;
				        ((InstructionContext)_localctx).code =  "PUSH" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
				        _localctx.code += "WRITE \nPOP \n";
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				match(READLN);
				setState(204);
				match(T__4);
				setState(205);
				((InstructionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(206);
				match(T__5);
				setState(207);
				finInstruction();
				   
				        ((InstructionContext)_localctx).code =  "READ\n";
				        int adresse = tableSymboles.getAdresseType((((InstructionContext)_localctx).IDENTIFIANT!=null?((InstructionContext)_localctx).IDENTIFIANT.getText():null)).adresse;
				        _localctx.code += "STORE" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
				    
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
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(213);
			match(T__6);
			setState(214);
			((AssignationContext)_localctx).expression = expression(0);

			            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code;

			            int adresse = tableSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null)).adresse;
			            _localctx.code += "STORE" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
			        
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext cond1;
		public ConditionContext cond;
		public ExpressionContext expr1;
		public Token op;
		public ExpressionContext expr2;
		public ConditionContext cond2;
		public TerminalNode NOT() { return getToken(CalculetteParser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TRUE() { return getToken(CalculetteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CalculetteParser.FALSE, 0); }
		public TerminalNode AND() { return getToken(CalculetteParser.AND, 0); }
		public TerminalNode OR() { return getToken(CalculetteParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(218);
				match(NOT);
				setState(219);
				((ConditionContext)_localctx).cond = condition(7);

				            ((ConditionContext)_localctx).code =  "# Condition d'egalite : not\n";
				            _localctx.code += ((ConditionContext)_localctx).cond.code + "\n";
				            _localctx.code += "PUSHI 0\n";
				            _localctx.code += "EQUAL\n";
				        
				}
				break;
			case 2:
				{
				setState(222);
				((ConditionContext)_localctx).expr1 = expression(0);
				setState(223);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				((ConditionContext)_localctx).expr2 = expression(0);

				        ((ConditionContext)_localctx).code =  "# Condition d'egalite : expr1 " +  (((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null) + " expr2\n";
				        _localctx.code += evalexpr(((ConditionContext)_localctx).expr1.code, (((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null), ((ConditionContext)_localctx).expr2.code); 
				}
				break;
			case 3:
				{
				setState(227);
				match(TRUE);

				        ((ConditionContext)_localctx).code =  "# Condition : true\n";
				        _localctx.code += "PUSHI 1\n"; 
				}
				break;
			case 4:
				{
				setState(229);
				match(FALSE);

				        ((ConditionContext)_localctx).code =  "# Condition : false\n";
				        _localctx.code += "PUSHI 0\n"; 
				}
				break;
			case 5:
				{
				setState(231);
				match(T__4);
				setState(232);
				((ConditionContext)_localctx).cond = condition(0);
				setState(233);
				match(T__5);

				            ((ConditionContext)_localctx).code =  "# Condition : cond\n";
				            _localctx.code += ((ConditionContext)_localctx).cond.code + "\n";
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.cond1 = _prevctx;
						_localctx.cond1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(238);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(239);
						match(AND);
						setState(240);
						((ConditionContext)_localctx).cond2 = condition(7);

						                      ((ConditionContext)_localctx).code =  "# Condition d'egalite : cond1 and cond2\n";

						                      int i = nextLabel();
						                      int j = nextLabel();

						                      _localctx.code += ((ConditionContext)_localctx).cond1.code + "\n";
						                      _localctx.code += "JUMPF " + i + "\n";
						                      _localctx.code += ((ConditionContext)_localctx).cond2.code + "\n";
						                      _localctx.code += "JUMP " + j +"\n";
						                      _localctx.code += "LABEL " + i + "\n";
						                      _localctx.code += "PUSHI 0\n";
						                      _localctx.code += "LABEL " + j + "\n";
						                  
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.cond1 = _prevctx;
						_localctx.cond1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(243);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(244);
						match(OR);
						setState(245);
						((ConditionContext)_localctx).cond2 = condition(6);

						                      ((ConditionContext)_localctx).code =  "# Condition d'egalite : cond1 or cond2\n";

						                      int i = nextLabel();
						                      int j = nextLabel();

						                      _localctx.code += ((ConditionContext)_localctx).cond1.code + "\n";
						                      _localctx.code += "JUMPF " + i + "\n";
						                      _localctx.code += "PUSHI 1\n";
						                      _localctx.code += "JUMP " + j +"\n";
						                      _localctx.code += "LABEL " + i + "\n";
						                      _localctx.code += ((ConditionContext)_localctx).cond2.code + "\n";
						                      _localctx.code += "LABEL " + j + "\n";
						                  
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloc);

		        ((BlocContext)_localctx).code =  new String();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__15);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << IF) | (1L << PRINTLN) | (1L << READLN) | (1L << WHILE) | (1L << FOR) | (1L << REPEAT) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << FLOAT) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(254);
				((BlocContext)_localctx).instruction = instruction();
				_localctx.code += ((BlocContext)_localctx).instruction.code;
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(T__16);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					match(NEWLINE);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public InstructionContext instruction;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<FinInstructionContext> finInstruction() {
			return getRuleContexts(FinInstructionContext.class);
		}
		public FinInstructionContext finInstruction(int i) {
			return getRuleContext(FinInstructionContext.class,i);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fonction);

		        tableSymboles.newTableLocale();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(270);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			 tableSymboles.putVar("return", (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null)); 
			setState(272);
			match(T__4);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(273);
				params();
				}
			}

			setState(276);
			match(T__5);

			            int l = nextLabel();
			            ((FonctionContext)_localctx).code =  "LABEL " + l + "\n";
			            tableSymboles.nouvelleFonction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null),l,(((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			        
			setState(278);
			((FonctionContext)_localctx).instruction = instruction();

			            _localctx.code += ((FonctionContext)_localctx).instruction.code;
			            _localctx.code += "RETURN\n";
			        
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					finInstruction();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);

			        tableSymboles.dropTableLocale();
			    
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

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculetteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(287);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            // code java gerant une variable locale (argi)
			            tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
			        
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(289);
				match(T__17);
				setState(290);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(291);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				                // code java gerant une variable locale (argi)
				                tableSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));
				            
				}
				}
				setState(297);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << IDENTIFIANT) | (1L << FLOAT) | (1L << ENTIER))) != 0)) {
				{
				setState(298);
				((ArgsContext)_localctx).expression = expression(0);

				        // code java pour première expression pour arg1
				        ((ArgsContext)_localctx).code =  ((ArgsContext)_localctx).expression.code;
				        _localctx.size ++;
				    
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(300);
					match(T__17);
					setState(301);
					((ArgsContext)_localctx).expression = expression(0);

					        // code java pour expression suivante pour argi
					        _localctx.code += ((ArgsContext)_localctx).expression.code;
					        _localctx.size ++;
					    
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\5\6\5r\n\5\r\5\16"+
		"\5s\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d5\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00ef\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00fb\n\t\f\t\16\t\u00fe\13\t\3\n\3\n\3\n\3\n\7\n\u0104\n\n\f\n\16"+
		"\n\u0107\13\n\3\n\3\n\7\n\u010b\n\n\f\n\16\n\u010e\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0115\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u011c\n\13\f"+
		"\13\16\13\u011f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0128\n\f\f\f\16"+
		"\f\u012b\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0133\n\r\f\r\16\r\u0136\13"+
		"\r\5\r\u0138\n\r\3\r\2\4\6\20\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2"+
		"\5\6\3\2\3\4\3\2\13\21\2\u0155\2\37\3\2\2\2\4B\3\2\2\2\6_\3\2\2\2\bq\3"+
		"\2\2\2\n\u0081\3\2\2\2\f\u00d4\3\2\2\2\16\u00d6\3\2\2\2\20\u00ee\3\2\2"+
		"\2\22\u00ff\3\2\2\2\24\u010f\3\2\2\2\26\u0120\3\2\2\2\30\u0137\3\2\2\2"+
		"\32\33\5\n\6\2\33\34\b\2\1\2\34\36\3\2\2\2\35\32\3\2\2\2\36!\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"&\b\2\1\2#%\7%\2\2$#\3"+
		"\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2\2\2(&\3\2\2\2)*\5\24\13\2"+
		"*+\b\2\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2"+
		"\2\2\60.\3\2\2\2\61\63\7%\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2"+
		"\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67=\b\2\1\289\5\f\7\29:\b"+
		"\2\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3"+
		"\2\2\2@A\b\2\1\2A\3\3\2\2\2BC\5\2\2\2CD\7\2\2\3D\5\3\2\2\2EF\b\4\1\2F"+
		"G\7\3\2\2GH\5\6\4\13HI\b\4\1\2I`\3\2\2\2JK\7\4\2\2KL\5\6\4\nLM\b\4\1\2"+
		"M`\3\2\2\2NO\7\7\2\2OP\5\6\4\2PQ\7\b\2\2QR\b\4\1\2R`\3\2\2\2ST\7(\2\2"+
		"T`\b\4\1\2UV\7\'\2\2V`\b\4\1\2WX\7$\2\2X`\b\4\1\2YZ\7$\2\2Z[\7\7\2\2["+
		"\\\5\30\r\2\\]\7\b\2\2]^\b\4\1\2^`\3\2\2\2_E\3\2\2\2_J\3\2\2\2_N\3\2\2"+
		"\2_S\3\2\2\2_U\3\2\2\2_W\3\2\2\2_Y\3\2\2\2`m\3\2\2\2ab\f\t\2\2bc\t\2\2"+
		"\2cd\5\6\4\nde\b\4\1\2el\3\2\2\2fg\f\b\2\2gh\t\3\2\2hi\5\6\4\tij\b\4\1"+
		"\2jl\3\2\2\2ka\3\2\2\2kf\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2"+
		"\2\2om\3\2\2\2pr\7%\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2"+
		"\2\2uv\7\35\2\2vw\7$\2\2wx\5\b\5\2xy\b\6\1\2y\u0082\3\2\2\2z{\7\35\2\2"+
		"{|\7$\2\2|}\7\t\2\2}~\5\6\4\2~\177\5\b\5\2\177\u0080\b\6\1\2\u0080\u0082"+
		"\3\2\2\2\u0081u\3\2\2\2\u0081z\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\5"+
		"\6\4\2\u0084\u0085\5\b\5\2\u0085\u0086\b\7\1\2\u0086\u00d5\3\2\2\2\u0087"+
		"\u0088\5\16\b\2\u0088\u0089\5\b\5\2\u0089\u008a\b\7\1\2\u008a\u00d5\3"+
		"\2\2\2\u008b\u008c\5\b\5\2\u008c\u008d\b\7\1\2\u008d\u00d5\3\2\2\2\u008e"+
		"\u008f\5\22\n\2\u008f\u0090\b\7\1\2\u0090\u00d5\3\2\2\2\u0091\u0092\7"+
		"\27\2\2\u0092\u0093\7\7\2\2\u0093\u0094\5\6\4\2\u0094\u0095\7\b\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\b\7\1\2\u0097\u00d5\3\2\2\2\u0098\u0099\7#"+
		"\2\2\u0099\u009a\5\6\4\2\u009a\u009b\5\b\5\2\u009b\u009c\b\7\1\2\u009c"+
		"\u00d5\3\2\2\2\u009d\u009e\7\31\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\5"+
		"\20\t\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\b\7\1\2\u00a3"+
		"\u00d5\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5"+
		"\20\t\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00ae\b\7\1\2\u00aa"+
		"\u00ab\7\26\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\b\7\1\2\u00ad\u00af\3"+
		"\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\7\1\2\u00b1\u00d5\3\2\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\7"+
		"\7\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5\20\t\2\u00b7"+
		"\u00b8\7\n\2\2\u00b8\u00b9\5\16\b\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5"+
		"\f\7\2\u00bb\u00bc\b\7\1\2\u00bc\u00d5\3\2\2\2\u00bd\u00be\7\33\2\2\u00be"+
		"\u00bf\5\f\7\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5"+
		"\20\t\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5\b\7\1\2\u00c5"+
		"\u00d5\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\7"+
		"$\2\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\b\7\1\2\u00cc"+
		"\u00d5\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\7"+
		"$\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\b\7\1\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u0083\3\2\2\2\u00d4\u0087\3\2\2\2\u00d4\u008b\3\2"+
		"\2\2\u00d4\u008e\3\2\2\2\u00d4\u0091\3\2\2\2\u00d4\u0098\3\2\2\2\u00d4"+
		"\u009d\3\2\2\2\u00d4\u00a4\3\2\2\2\u00d4\u00b2\3\2\2\2\u00d4\u00bd\3\2"+
		"\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5\r\3\2\2\2\u00d6\u00d7"+
		"\7$\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00da\b\b\1\2\u00da"+
		"\17\3\2\2\2\u00db\u00dc\b\t\1\2\u00dc\u00dd\7\36\2\2\u00dd\u00de\5\20"+
		"\t\t\u00de\u00df\b\t\1\2\u00df\u00ef\3\2\2\2\u00e0\u00e1\5\6\4\2\u00e1"+
		"\u00e2\t\4\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\b\t\1\2\u00e4\u00ef\3\2"+
		"\2\2\u00e5\u00e6\7!\2\2\u00e6\u00ef\b\t\1\2\u00e7\u00e8\7\"\2\2\u00e8"+
		"\u00ef\b\t\1\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\7"+
		"\b\2\2\u00ec\u00ed\b\t\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee"+
		"\u00e0\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e9\3\2"+
		"\2\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\f\b\2\2\u00f1\u00f2\7 \2\2\u00f2"+
		"\u00f3\5\20\t\t\u00f3\u00f4\b\t\1\2\u00f4\u00fb\3\2\2\2\u00f5\u00f6\f"+
		"\7\2\2\u00f6\u00f7\7\37\2\2\u00f7\u00f8\5\20\t\b\u00f8\u00f9\b\t\1\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\21\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0105\7\22\2\2\u0100\u0101\5\f\7\2\u0101\u0102\b\n\1\2"+
		"\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010c\7\23\2\2\u0109\u010b\7%\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\23\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0110\7\35\2\2\u0110\u0111\7$\2\2\u0111\u0112\b\13\1\2"+
		"\u0112\u0114\7\7\2\2\u0113\u0115\5\26\f\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\b\2\2\u0117\u0118\b\13\1\2"+
		"\u0118\u0119\5\f\7\2\u0119\u011d\b\13\1\2\u011a\u011c\5\b\5\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\25\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\35\2\2\u0121\u0122\7$\2"+
		"\2\u0122\u0129\b\f\1\2\u0123\u0124\7\24\2\2\u0124\u0125\7\35\2\2\u0125"+
		"\u0126\7$\2\2\u0126\u0128\b\f\1\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\27\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012d\5\6\4\2\u012d\u0134\b\r\1\2\u012e\u012f\7\24\2\2"+
		"\u012f\u0130\5\6\4\2\u0130\u0131\b\r\1\2\u0131\u0133\3\2\2\2\u0132\u012e"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\31\3\2\2\2\30\37&.\64=_kms\u0081\u00ae\u00d4\u00ee\u00fa\u00fc"+
		"\u0105\u010c\u0114\u011d\u0129\u0134\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}