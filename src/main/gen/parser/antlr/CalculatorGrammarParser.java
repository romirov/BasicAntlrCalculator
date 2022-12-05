// Generated from java-escape by ANTLR 4.11.1
package parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SNUMBER=1, LPAREN=2, RPAREN=3, PLUS=4, MINUS=5, MULT=6, DIV=7, POINT=8, 
		POW=9, WS=10;
	public static final int
		RULE_calculation = 0, RULE_expression = 1, RULE_number = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculation", "expression", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SNUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT", "DIV", 
			"POINT", "POW", "WS"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalculationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalculatorGrammarParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).exitCalculation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SNUMBER || _la==LPAREN) {
				{
				{
				setState(6);
				expression(0);
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LPAREN() { return getToken(CalculatorGrammarParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorGrammarParser.RPAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode POW() { return getToken(CalculatorGrammarParser.POW, 0); }
		public TerminalNode MULT() { return getToken(CalculatorGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CalculatorGrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorGrammarParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(15);
				match(LPAREN);
				setState(16);
				expression(0);
				setState(17);
				match(RPAREN);
				}
				break;
			case SNUMBER:
				{
				setState(19);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(22);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(23);
						((ExpressionContext)_localctx).op = match(POW);
						setState(24);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(25);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(26);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(27);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(30);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode SNUMBER() { return getToken(CalculatorGrammarParser.SNUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGrammarListener ) ((CalculatorGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(SNUMBER);
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0000\u0001\u0002\u0003\u0000\u0002\u0004"+
		"\u0000\u0002\u0001\u0000\u0006\u0007\u0001\u0000\u0004\u0005(\u0000\t"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004$\u0001"+
		"\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000"+
		"\u0000\u0000\b\u000b\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000"+
		"\u0000\t\n\u0001\u0000\u0000\u0000\n\f\u0001\u0000\u0000\u0000\u000b\t"+
		"\u0001\u0000\u0000\u0000\f\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0006\u0001\uffff\uffff\u0000\u000f\u0010\u0005"+
		"\u0002\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005"+
		"\u0003\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0015\u0003"+
		"\u0004\u0002\u0000\u0014\u000e\u0001\u0000\u0000\u0000\u0014\u0013\u0001"+
		"\u0000\u0000\u0000\u0015!\u0001\u0000\u0000\u0000\u0016\u0017\n\u0005"+
		"\u0000\u0000\u0017\u0018\u0005\t\u0000\u0000\u0018 \u0003\u0002\u0001"+
		"\u0006\u0019\u001a\n\u0004\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000"+
		"\u001b \u0003\u0002\u0001\u0005\u001c\u001d\n\u0003\u0000\u0000\u001d"+
		"\u001e\u0007\u0001\u0000\u0000\u001e \u0003\u0002\u0001\u0004\u001f\u0016"+
		"\u0001\u0000\u0000\u0000\u001f\u0019\u0001\u0000\u0000\u0000\u001f\u001c"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%\u0005\u0001\u0000"+
		"\u0000\u0000\u0004\t\u0014\u001f!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}