import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.ParserATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA
import org.antlr.v4.runtime.tree.ParseTreeListener
import org.antlr.v4.runtime.tree.TerminalNode

class CalculatorGrammarParser(input: TokenStream?) : Parser(input) {
  @Deprecated("")
  override fun getTokenNames(): Array<String?> {
    return Companion.tokenNames
  }

  override fun getVocabulary(): Vocabulary {
    return VOCABULARY
  }

  override fun getGrammarFileName(): String {
    return "java-escape"
  }

  override fun getRuleNames(): Array<String> {
    return Companion.ruleNames
  }

  override fun getSerializedATN(): String {
    return _serializedATN
  }

  override fun getATN(): ATN {
    return _ATN
  }

  class CalculationContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun EOF(): TerminalNode {
      return getToken(EOF, 0)
    }

    fun expression(): List<ExpressionContext> {
      return getRuleContexts(
          ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    override fun getRuleIndex(): Int {
      return RULE_calculation
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterCalculation(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitCalculation(this)
    }
  }

  @Throws(RecognitionException::class)
  fun calculation(): CalculationContext {
    val _localctx = CalculationContext(_ctx, state)
    enterRule(_localctx, 0, RULE_calculation)
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 11
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la == SNUMBER || _la == LPAREN) {
          run {
            run {
              state = 8
              expression(0)
            }
          }
          state = 13
          _errHandler.sync(this)
          _la = _input.LA(1)
        }
        state = 14
        match(EOF)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class ExpressionContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    var op: Token? = null
    fun paren_expression(): Paren_expressionContext {
      return getRuleContext(Paren_expressionContext::class.java, 0)
    }

    fun number(): NumberContext {
      return getRuleContext(NumberContext::class.java, 0)
    }

    fun expression(): List<ExpressionContext> {
      return getRuleContexts(
          ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun POW(): TerminalNode {
      return getToken(POW, 0)
    }

    fun MULT(): TerminalNode {
      return getToken(MULT, 0)
    }

    fun DIV(): TerminalNode {
      return getToken(DIV, 0)
    }

    fun PLUS(): TerminalNode {
      return getToken(PLUS, 0)
    }

    fun MINUS(): TerminalNode {
      return getToken(MINUS, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_expression
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterExpression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitExpression(this)
    }
  }

  @Throws(RecognitionException::class)
  fun expression(): ExpressionContext {
    return expression(0)
  }

  @Throws(RecognitionException::class)
  private fun expression(_p: Int): ExpressionContext {
    val _parentctx = _ctx
    val _parentState = state
    var _localctx = ExpressionContext(_ctx, _parentState)
    var _prevctx = _localctx
    val _startState = 2
    enterRecursionRule(_localctx, 2, RULE_expression, _p)
    var _la: Int
    try {
      var _alt: Int
      enterOuterAlt(_localctx, 1)
      run {
        state = 19
        _errHandler.sync(this)
        when (_input.LA(1)) {
          LPAREN -> {
            state = 17
            paren_expression()
          }

          SNUMBER -> {
            state = 18
            number()
          }

          else -> throw NoViableAltException(this)
        }
        _ctx.stop = _input.LT(-1)
        state = 32
        _errHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 3, _ctx)
        while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent()
            _prevctx = _localctx
            run {
              state = 30
              _errHandler.sync(this)
              when (interpreter.adaptivePredict(_input, 2, _ctx)) {
                1 -> {
                  _localctx = ExpressionContext(_parentctx, _parentState)
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 21
                  if (!precpred(_ctx, 5)) throw FailedPredicateException(this, "precpred(_ctx, 5)")
                  state = 22
                  _localctx.op = match(POW)
                  state = 23
                  expression(6)
                }

                2 -> {
                  _localctx = ExpressionContext(_parentctx, _parentState)
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 24
                  if (!precpred(_ctx, 4)) throw FailedPredicateException(this, "precpred(_ctx, 4)")
                  state = 25
                  _localctx.op = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == MULT || _la == DIV)) {
                    _localctx.op = _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 26
                  expression(5)
                }

                3 -> {
                  _localctx = ExpressionContext(_parentctx, _parentState)
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 27
                  if (!precpred(_ctx, 3)) throw FailedPredicateException(this, "precpred(_ctx, 3)")
                  state = 28
                  _localctx.op = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == PLUS || _la == MINUS)) {
                    _localctx.op = _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 29
                  expression(4)
                }

                else -> {}
              }
            }
          }
          state = 34
          _errHandler.sync(this)
          _alt = interpreter.adaptivePredict(_input, 3, _ctx)
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      unrollRecursionContexts(_parentctx)
    }
    return _localctx
  }

  class Paren_expressionContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun LPAREN(): TerminalNode {
      return getToken(LPAREN, 0)
    }

    fun expression(): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, 0)
    }

    fun RPAREN(): TerminalNode {
      return getToken(RPAREN, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_paren_expression
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterParen_expression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitParen_expression(this)
    }
  }

  @Throws(RecognitionException::class)
  fun paren_expression(): Paren_expressionContext {
    val _localctx = Paren_expressionContext(_ctx, state)
    enterRule(_localctx, 4, RULE_paren_expression)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 35
        match(LPAREN)
        state = 36
        expression(0)
        state = 37
        match(RPAREN)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  class NumberContext(parent: ParserRuleContext?, invokingState: Int) :
    ParserRuleContext(parent, invokingState) {
    fun SNUMBER(): TerminalNode {
      return getToken(SNUMBER, 0)
    }

    override fun getRuleIndex(): Int {
      return RULE_number
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterNumber(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitNumber(this)
    }
  }

  @Throws(RecognitionException::class)
  fun number(): NumberContext {
    val _localctx = NumberContext(_ctx, state)
    enterRule(_localctx, 6, RULE_number)
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 39
        match(SNUMBER)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      _errHandler.reportError(this, re)
      _errHandler.recover(this, re)
    } finally {
      exitRule()
    }
    return _localctx
  }

  override fun sempred(_localctx: RuleContext, ruleIndex: Int, predIndex: Int): Boolean {
    when (ruleIndex) {
      1 -> return expression_sempred(_localctx as ExpressionContext, predIndex)
    }
    return true
  }

  private fun expression_sempred(_localctx: ExpressionContext, predIndex: Int): Boolean {
    when (predIndex) {
      0 -> return precpred(_ctx, 5)
      1 -> return precpred(_ctx, 4)
      2 -> return precpred(_ctx, 3)
    }
    return true
  }

  init {
    _interp = ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache)
  }

  companion object {
    init {
      RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION)
    }

    protected val _decisionToDFA: Array<DFA?>
    protected val _sharedContextCache = PredictionContextCache()
    const val SNUMBER = 1
    const val LPAREN = 2
    const val RPAREN = 3
    const val PLUS = 4
    const val MINUS = 5
    const val MULT = 6
    const val DIV = 7
    const val POINT = 8
    const val POW = 9
    const val WS = 10
    const val RULE_calculation = 0
    const val RULE_expression = 1
    const val RULE_paren_expression = 2
    const val RULE_number = 3
    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "calculation", "expression", "paren_expression", "number"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", "'^'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "SNUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT", "DIV",
          "POINT", "POW", "WS"
      )
    }

    private val _SYMBOLIC_NAMES = makeSymbolicNames()
    val VOCABULARY: Vocabulary = VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES)

    @Deprecated("Use {@link #VOCABULARY} instead.")
    val tokenNames: Array<String?>

    init {
      tokenNames = arrayOfNulls(_SYMBOLIC_NAMES.size)
      for (i in tokenNames.indices) {
        tokenNames[i] = VOCABULARY.getLiteralName(i)
        if (tokenNames[i] == null) {
          tokenNames[i] = VOCABULARY.getSymbolicName(i)
        }
        if (tokenNames[i] == null) {
          tokenNames[i] = "<INVALID>"
        }
      }
    }

    const val _serializedATN =
        "\u0004\u0001\n*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b" +
            "\u0000\n\u0000\u000c\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0005\u0001\u001f\b\u0001\n\u0001\u000c\u0001\"\t\u0001\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
            "\u0000\u0001\u0002\u0004\u0000\u0002\u0004\u0006\u0000\u0002\u0001\u0000" +
            "\u0006\u0007\u0001\u0000\u0004\u0005*\u0000\u000b\u0001\u0000\u0000\u0000" +
            "\u0002\u0013\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006" +
            "\'\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000" +
            "\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000" +
            "\u000b\u000c\u0001\u0000\u0000\u0000\u000c\u000e\u0001\u0000\u0000\u0000\r\u000b" +
            "\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0001" +
            "\u0001\u0000\u0000\u0000\u0010\u0011\u0006\u0001\uffff\uffff\u0000\u0011" +
            "\u0014\u0003\u0004\u0002\u0000\u0012\u0014\u0003\u0006\u0003\u0000\u0013" +
            "\u0010\u0001\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014" +
            " \u0001\u0000\u0000\u0000\u0015\u0016\n\u0005\u0000\u0000\u0016\u0017" +
            "\u0005\t\u0000\u0000\u0017\u001f\u0003\u0002\u0001\u0006\u0018\u0019\n" +
            "\u0004\u0000\u0000\u0019\u001a\u0007\u0000\u0000\u0000\u001a\u001f\u0003" +
            "\u0002\u0001\u0005\u001b\u001c\n\u0003\u0000\u0000\u001c\u001d\u0007\u0001" +
            "\u0000\u0000\u001d\u001f\u0003\u0002\u0001\u0004\u001e\u0015\u0001\u0000" +
            "\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000" +
            "\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000" +
            "\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001" +
            "\u0000\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0003\u0002\u0001\u0000" +
            "%&\u0005\u0003\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0001" +
            "\u0000\u0000(\u0007\u0001\u0000\u0000\u0000\u0004\u000b\u0013\u001e "
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}