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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
		TYPE=10, IDENTIFIANT=11, WS=12, ENTIER=13, PARENTHESEG=14, PARENTHESED=15, 
		UNMATCH=16;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_instruction = 3, 
		RULE_boucleWhile = 4, RULE_finInstruction = 5, RULE_assignation = 6, RULE_condition = 7, 
		RULE_expr = 8, RULE_sousExpr = 9, RULE_nb = 10;
	public static final String[] ruleNames = {
		"start", "calcul", "decl", "instruction", "boucleWhile", "finInstruction", 
		"assignation", "condition", "expr", "sousExpr", "nb"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'while'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
		null, null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NEWLINE", "TYPE", 
		"IDENTIFIANT", "WS", "ENTIER", "PARENTHESEG", "PARENTHESED", "UNMATCH"
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



	        private String evalexpr (String x, String op, String y) {
	            if ( op.equals("*") ){
	                return "PUSHI x \n PUSHI y \n MUL \n";
	            } else if ( op.equals("+") ){
	                return "PUSHI "+ x+" \n PUSHI "+ y+" \n ADD \n";
	            } else if ( op.equals("/") ){
	                return "PUSHI "+ x +"\n PUSHI "+ y +"\n DIV \n";
	            } else if ( op.equals("-") ){
	                return "PUSHI "+ x+" \n PUSHI "+ y+" \n SUB \n";
	            } else {
	               System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
	               throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
	            }
	        }

	       private TablesSymboles tablesSymboles = new TablesSymboles();

	       private int _label = 0;
	       /** générateur de nom d'étiquettes */
	       private int nextLabel() { return _label++; }



	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			calcul();
			setState(23);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
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
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(25);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << NEWLINE) | (1L << IDENTIFIANT) | (1L << ENTIER) | (1L << PARENTHESEG))) != 0)) {
				{
				{
				setState(39);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += " HALT\n"; 
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

	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public Token ENTIER;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
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
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(TYPE);
				setState(50);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(51);
				finInstruction();

				            ((DeclContext)_localctx).code = "PUSHI 0 \n";
				            tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(TYPE);
				setState(55);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(56);
				match(T__0);
				setState(57);
				((DeclContext)_localctx).ENTIER = match(ENTIER);
				setState(58);
				finInstruction();

				             ((DeclContext)_localctx).code = "PUSHI "+(((DeclContext)_localctx).ENTIER!=null?((DeclContext)_localctx).ENTIER.getText():null)+" \n";
				             tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				        
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
		public BoucleWhileContext b;
		public ExprContext a;
		public AssignationContext assignation;
		public BoucleWhileContext boucleWhile() {
			return getRuleContext(BoucleWhileContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((InstructionContext)_localctx).b = boucleWhile();

				            ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).b.code;
				        
				}
				break;
			case T__4:
			case T__5:
			case ENTIER:
			case PARENTHESEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((InstructionContext)_localctx).a = expr();
				setState(67);
				finInstruction();

				            ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).a.code;
				        
				}
				break;
			case IDENTIFIANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				((InstructionContext)_localctx).assignation = assignation();
				setState(71);
				finInstruction();

				            ((InstructionContext)_localctx).code = ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				finInstruction();

				            ((InstructionContext)_localctx).code = "";
				        
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

	public static class BoucleWhileContext extends ParserRuleContext {
		public String code;
		public ConditionContext c;
		public InstructionContext ins;
		public TerminalNode PARENTHESEG() { return getToken(CalculetteParser.PARENTHESEG, 0); }
		public TerminalNode PARENTHESED() { return getToken(CalculetteParser.PARENTHESED, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BoucleWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucleWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBoucleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBoucleWhile(this);
		}
	}

	public final BoucleWhileContext boucleWhile() throws RecognitionException {
		BoucleWhileContext _localctx = new BoucleWhileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boucleWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__1);
			setState(80);
			match(PARENTHESEG);
			setState(81);
			((BoucleWhileContext)_localctx).c = condition();
			setState(82);
			match(PARENTHESED);
			setState(83);
			((BoucleWhileContext)_localctx).ins = instruction();

			        int lab1=nextLabel();
			        int lab2=nextLabel();

			        ((BoucleWhileContext)_localctx).code = "LABEL "+lab1+"\n"+
			        ((BoucleWhileContext)_localctx).c.code+
			        "JUMPF "+lab2+"\n"+
			        ((BoucleWhileContext)_localctx).ins.code+ "\n JUMP "+ lab1 +
			        "\nLABEL "+lab2+"\n";

			    
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
		public TerminalNode NEWLINE() { return getToken(CalculetteParser.NEWLINE, 0); }
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
		enterRule(_localctx, 10, RULE_finInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NEWLINE);
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
		public ExprContext expr;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(88);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(89);
			match(T__0);
			setState(90);
			((AssignationContext)_localctx).expr = expr();

			           AdresseType at=tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
			           ((AssignationContext)_localctx).code = ((AssignationContext)_localctx).expr.code+" STOREG "+ at.adresse ;
			        
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
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__2);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__3);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
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

	public static class ExprContext extends ParserRuleContext {
		public String code;
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
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((ExprContext)_localctx).a = sousExpr();
				setState(100);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				((ExprContext)_localctx).b = sousExpr();
				_localctx.code+=evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);System.out.println(_localctx.code);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((ExprContext)_localctx).a = sousExpr();
				setState(105);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				((ExprContext)_localctx).b = sousExpr();
				_localctx.code+=evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);System.out.println(_localctx.code);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				((ExprContext)_localctx).a = sousExpr();
				((ExprContext)_localctx).code = ((ExprContext)_localctx).a.code;
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
		public String code;
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
		enterRule(_localctx, 18, RULE_sousExpr);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((SousExprContext)_localctx).a = nb();
				setState(115);
				((SousExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((SousExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				((SousExprContext)_localctx).b = expr();
				_localctx.code+=evalexpr(((SousExprContext)_localctx).a.code,(((SousExprContext)_localctx).op!=null?((SousExprContext)_localctx).op.getText():null),((SousExprContext)_localctx).b.code);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((SousExprContext)_localctx).a = nb();
				setState(120);
				((SousExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((SousExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				((SousExprContext)_localctx).b = expr();
				_localctx.code+=evalexpr(((SousExprContext)_localctx).a.code,(((SousExprContext)_localctx).op!=null?((SousExprContext)_localctx).op.getText():null),((SousExprContext)_localctx).b.code);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(124);
				match(T__5);
				}
				setState(125);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).code = "-"+((SousExprContext)_localctx).c.code;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(128);
				match(T__4);
				}
				setState(129);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).code = ((SousExprContext)_localctx).c.code;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				((SousExprContext)_localctx).c = nb();
				((SousExprContext)_localctx).code = ((SousExprContext)_localctx).c.code;
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
		public String code;
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
		enterRule(_localctx, 20, RULE_nb);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((NbContext)_localctx).ENTIER = match(ENTIER);
				((NbContext)_localctx).code =  (((NbContext)_localctx).ENTIER!=null?((NbContext)_localctx).ENTIER.getText():null);
				}
				break;
			case PARENTHESEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(PARENTHESEG);
				setState(140);
				((NbContext)_localctx).expr = expr();
				setState(141);
				match(PARENTHESED);
				((NbContext)_localctx).code =  ((NbContext)_localctx).expr.code;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\td\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0093"+
		"\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\7\b\3\2\t\n\2\u0098"+
		"\2\30\3\2\2\2\4 \3\2\2\2\6?\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fX\3\2\2\2\16"+
		"Z\3\2\2\2\20c\3\2\2\2\22r\3\2\2\2\24\u0089\3\2\2\2\26\u0092\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34\35\b\3\1\2\35"+
		"\37\3\2\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!&\3\2\2\2"+
		"\" \3\2\2\2#%\7\13\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2"+
		"\2\2(&\3\2\2\2)*\5\b\5\2*+\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3"+
		"\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\b\3\1\2\62\5\3\2\2\2\63"+
		"\64\7\f\2\2\64\65\7\r\2\2\65\66\5\f\7\2\66\67\b\4\1\2\67@\3\2\2\289\7"+
		"\f\2\29:\7\r\2\2:;\7\3\2\2;<\7\17\2\2<=\5\f\7\2=>\b\4\1\2>@\3\2\2\2?\63"+
		"\3\2\2\2?8\3\2\2\2@\7\3\2\2\2AB\5\n\6\2BC\b\5\1\2CP\3\2\2\2DE\5\22\n\2"+
		"EF\5\f\7\2FG\b\5\1\2GP\3\2\2\2HI\5\16\b\2IJ\5\f\7\2JK\b\5\1\2KP\3\2\2"+
		"\2LM\5\f\7\2MN\b\5\1\2NP\3\2\2\2OA\3\2\2\2OD\3\2\2\2OH\3\2\2\2OL\3\2\2"+
		"\2P\t\3\2\2\2QR\7\4\2\2RS\7\20\2\2ST\5\20\t\2TU\7\21\2\2UV\5\b\5\2VW\b"+
		"\6\1\2W\13\3\2\2\2XY\7\13\2\2Y\r\3\2\2\2Z[\7\r\2\2[\\\7\3\2\2\\]\5\22"+
		"\n\2]^\b\b\1\2^\17\3\2\2\2_`\7\5\2\2`d\b\t\1\2ab\7\6\2\2bd\b\t\1\2c_\3"+
		"\2\2\2ca\3\2\2\2d\21\3\2\2\2ef\5\24\13\2fg\t\2\2\2gh\5\24\13\2hi\b\n\1"+
		"\2is\3\2\2\2jk\5\24\13\2kl\t\3\2\2lm\5\24\13\2mn\b\n\1\2ns\3\2\2\2op\5"+
		"\24\13\2pq\b\n\1\2qs\3\2\2\2re\3\2\2\2rj\3\2\2\2ro\3\2\2\2s\23\3\2\2\2"+
		"tu\5\26\f\2uv\t\3\2\2vw\5\22\n\2wx\b\13\1\2x\u008a\3\2\2\2yz\5\26\f\2"+
		"z{\t\2\2\2{|\5\22\n\2|}\b\13\1\2}\u008a\3\2\2\2~\177\7\b\2\2\177\u0080"+
		"\5\26\f\2\u0080\u0081\b\13\1\2\u0081\u008a\3\2\2\2\u0082\u0083\7\7\2\2"+
		"\u0083\u0084\5\26\f\2\u0084\u0085\b\13\1\2\u0085\u008a\3\2\2\2\u0086\u0087"+
		"\5\26\f\2\u0087\u0088\b\13\1\2\u0088\u008a\3\2\2\2\u0089t\3\2\2\2\u0089"+
		"y\3\2\2\2\u0089~\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0086\3\2\2\2\u008a"+
		"\25\3\2\2\2\u008b\u008c\7\17\2\2\u008c\u0093\b\f\1\2\u008d\u008e\7\20"+
		"\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\21\2\2\u0090\u0091\b\f\1\2\u0091"+
		"\u0093\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008d\3\2\2\2\u0093\27\3\2\2"+
		"\2\13 &.?Ocr\u0089\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}