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
        while (_la and 0x3f.inv() == 0 && 1L shl _la and 198L != 0L) {
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

  open class ExpressionContext : ParserRuleContext {
    constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {}

    override fun getRuleIndex(): Int {
      return RULE_expression
    }

    constructor() {}

    fun copyFrom(ctx: ExpressionContext?) {
      super.copyFrom(ctx)
    }
  }

  class NumberInExpressionContext(ctx: ExpressionContext?) : ExpressionContext() {
    fun number(): NumberContext {
      return getRuleContext(NumberContext::class.java, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterNumberInExpression(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitNumberInExpression(this)
    }
  }

  class AdditionOrSubtractionContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(
          ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun ADD(): TerminalNode {
      return getToken(ADD, 0)
    }

    fun SUB(): TerminalNode {
      return getToken(SUB, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterAdditionOrSubtraction(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitAdditionOrSubtraction(this)
    }
  }

  class MultiplicationOrDivisionContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: ExpressionContext? = null
    var operation: Token? = null
    var right_expr: ExpressionContext? = null
    fun expression(): List<ExpressionContext> {
      return getRuleContexts(
          ExpressionContext::class.java)
    }

    fun expression(i: Int): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, i)
    }

    fun MUL(): TerminalNode {
      return getToken(MUL, 0)
    }

    fun DIV(): TerminalNode {
      return getToken(DIV, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterMultiplicationOrDivision(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitMultiplicationOrDivision(this)
    }
  }

  class MultiplicationOrDivisionParenContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: Paren_expressionContext? = null
    var operation: Token? = null
    var right_expr: Paren_expressionContext? = null
    fun paren_expression(): List<Paren_expressionContext> {
      return getRuleContexts(Paren_expressionContext::class.java)
    }

    fun paren_expression(i: Int): Paren_expressionContext {
      return getRuleContext(Paren_expressionContext::class.java, i)
    }

    fun MUL(): TerminalNode {
      return getToken(MUL, 0)
    }

    fun DIV(): TerminalNode {
      return getToken(DIV, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterMultiplicationOrDivisionParen(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitMultiplicationOrDivisionParen(this)
    }
  }

  class AdditionOrSubtractionParenContext(ctx: ExpressionContext?) : ExpressionContext() {
    var left_expr: Paren_expressionContext? = null
    var operation: Token? = null
    var right_expr: Paren_expressionContext? = null
    fun paren_expression(): List<Paren_expressionContext> {
      return getRuleContexts(Paren_expressionContext::class.java)
    }

    fun paren_expression(i: Int): Paren_expressionContext {
      return getRuleContext(Paren_expressionContext::class.java, i)
    }

    fun ADD(): TerminalNode {
      return getToken(ADD, 0)
    }

    fun SUB(): TerminalNode {
      return getToken(SUB, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterAdditionOrSubtractionParen(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitAdditionOrSubtractionParen(this)
    }
  }

  class ParenthesesContext(ctx: ExpressionContext?) : ExpressionContext() {
    fun paren_expression(): Paren_expressionContext {
      return getRuleContext(Paren_expressionContext::class.java, 0)
    }

    init {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.enterParentheses(this)
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is CalculatorGrammarListener) listener.exitParentheses(this)
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
        state = 27
        _errHandler.sync(this)
        when (interpreter.adaptivePredict(_input, 1, _ctx)) {
          1 -> {
            _localctx = MultiplicationOrDivisionParenContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 17
            (_localctx as MultiplicationOrDivisionParenContext).left_expr = paren_expression()
            state = 18
            (_localctx as MultiplicationOrDivisionParenContext).operation = _input.LT(1)
            _la = _input.LA(1)
            if (!(_la == MUL || _la == DIV)) {
              (_localctx as MultiplicationOrDivisionParenContext).operation =
                  _errHandler.recoverInline(this) as Token
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true
              _errHandler.reportMatch(this)
              consume()
            }
            state = 19
            (_localctx as MultiplicationOrDivisionParenContext).right_expr = paren_expression()
          }

          2 -> {
            _localctx = AdditionOrSubtractionParenContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 21
            (_localctx as AdditionOrSubtractionParenContext).left_expr = paren_expression()
            state = 22
            (_localctx as AdditionOrSubtractionParenContext).operation = _input.LT(1)
            _la = _input.LA(1)
            if (!(_la == ADD || _la == SUB)) {
              (_localctx as AdditionOrSubtractionParenContext).operation =
                  _errHandler.recoverInline(this) as Token
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true
              _errHandler.reportMatch(this)
              consume()
            }
            state = 23
            (_localctx as AdditionOrSubtractionParenContext).right_expr = paren_expression()
          }

          3 -> {
            _localctx = ParenthesesContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 25
            paren_expression()
          }

          4 -> {
            _localctx = NumberInExpressionContext(_localctx)
            _ctx = _localctx
            _prevctx = _localctx
            state = 26
            number()
          }
        }
        _ctx.stop = _input.LT(-1)
        state = 37
        _errHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 3, _ctx)
        while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent()
            _prevctx = _localctx
            run {
              state = 35
              _errHandler.sync(this)
              when (interpreter.adaptivePredict(_input, 2, _ctx)) {
                1 -> {
                  _localctx =
                      MultiplicationOrDivisionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as MultiplicationOrDivisionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 29
                  if (!precpred(_ctx, 3)) throw FailedPredicateException(this, "precpred(_ctx, 3)")
                  state = 30
                  (_localctx as MultiplicationOrDivisionContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == MUL || _la == DIV)) {
                    (_localctx as MultiplicationOrDivisionContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 31
                  (_localctx as MultiplicationOrDivisionContext).right_expr = expression(4)
                }

                2 -> {
                  _localctx =
                      AdditionOrSubtractionContext(ExpressionContext(_parentctx, _parentState))
                  (_localctx as AdditionOrSubtractionContext).left_expr = _prevctx
                  pushNewRecursionContext(_localctx, _startState, RULE_expression)
                  state = 32
                  if (!precpred(_ctx, 2)) throw FailedPredicateException(this, "precpred(_ctx, 2)")
                  state = 33
                  (_localctx as AdditionOrSubtractionContext).operation = _input.LT(1)
                  _la = _input.LA(1)
                  if (!(_la == ADD || _la == SUB)) {
                    (_localctx as AdditionOrSubtractionContext).operation =
                        _errHandler.recoverInline(this) as Token
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true
                    _errHandler.reportMatch(this)
                    consume()
                  }
                  state = 34
                  (_localctx as AdditionOrSubtractionContext).right_expr = expression(3)
                }
              }
            }
          }
          state = 39
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
    var inner: ExpressionContext? = null
    fun LPAREN(): TerminalNode {
      return getToken(LPAREN, 0)
    }

    fun RPAREN(): TerminalNode {
      return getToken(RPAREN, 0)
    }

    fun expression(): ExpressionContext {
      return getRuleContext(ExpressionContext::class.java, 0)
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
        state = 40
        match(LPAREN)
        state = 41
        _localctx.inner = expression(0)
        state = 42
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
    fun NUMBER(): TerminalNode {
      return getToken(NUMBER, 0)
    }

    fun ADD(): List<TerminalNode> {
      return getTokens(ADD)
    }

    fun ADD(i: Int): TerminalNode {
      return getToken(ADD, i)
    }

    fun SUB(): List<TerminalNode> {
      return getTokens(SUB)
    }

    fun SUB(i: Int): TerminalNode {
      return getToken(SUB, i)
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
    var _la: Int
    try {
      enterOuterAlt(_localctx, 1)
      run {
        state = 47
        _errHandler.sync(this)
        _la = _input.LA(1)
        while (_la == ADD || _la == SUB) {
          run {
            run {
              state = 44
              _la = _input.LA(1)
              if (!(_la == ADD || _la == SUB)) {
                _errHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true
                _errHandler.reportMatch(this)
                consume()
              }
            }
          }
          state = 49
          _errHandler.sync(this)
          _la = _input.LA(1)
        }
        state = 50
        match(NUMBER)
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
      0 -> return precpred(_ctx, 3)
      1 -> return precpred(_ctx, 2)
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
    const val NUMBER = 1
    const val LPAREN = 2
    const val RPAREN = 3
    const val MUL = 4
    const val DIV = 5
    const val ADD = 6
    const val SUB = 7
    const val POINT = 8
    const val WS = 9
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
          null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'.'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "NUMBER", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB", "POINT",
          "WS"
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
        "\u0004\u0001\t5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b" +
            "\u0000\n\u0000\u000c\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005" +
            "\u0001$\b\u0001\n\u0001\u000c\u0001\'\t\u0001\u0001\u0002\u0001\u0002\u0001" +
            "\u0002\u0001\u0002\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\u000c\u00031\t" +
            "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0001\u0002\u0004\u0000" +
            "\u0002\u0004\u0006\u0000\u0002\u0001\u0000\u0004\u0005\u0001\u0000\u0006" +
            "\u00077\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000" +
            "\u0000\u0004(\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b" +
            "\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\r\u0001\u0000" +
            "\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\u000c\u0001\u0000\u0000" +
            "\u0000\u000c\u000e\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000" +
            "\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0001\u0001\u0000\u0000\u0000" +
            "\u0010\u0011\u0006\u0001\uffff\uffff\u0000\u0011\u0012\u0003\u0004\u0002" +
            "\u0000\u0012\u0013\u0007\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002" +
            "\u0000\u0014\u001c\u0001\u0000\u0000\u0000\u0015\u0016\u0003\u0004\u0002" +
            "\u0000\u0016\u0017\u0007\u0001\u0000\u0000\u0017\u0018\u0003\u0004\u0002" +
            "\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001c\u0003\u0004\u0002" +
            "\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u0010\u0001\u0000\u0000" +
            "\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000" +
            "\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c%\u0001\u0000\u0000\u0000" +
            "\u001d\u001e\n\u0003\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f" +
            "$\u0003\u0002\u0001\u0004 !\n\u0002\u0000\u0000!\"\u0007\u0001\u0000\u0000" +
            "\"$\u0003\u0002\u0001\u0003#\u001d\u0001\u0000\u0000\u0000# \u0001\u0000" +
            "\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001" +
            "\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000" +
            "\u0000()\u0005\u0002\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0005\u0003" +
            "\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,.\u0007\u0001\u0000\u0000" +
            "-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000" +
            "\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000" +
            "\u0000\u000023\u0005\u0001\u0000\u00003\u0007\u0001\u0000\u0000\u0000" +
            "\u0005\u000b\u001b#%/"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}