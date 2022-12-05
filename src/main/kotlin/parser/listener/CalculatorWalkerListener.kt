package parser.listener

import CalculatorGrammarBaseListener
import CalculatorGrammarParser
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode
import org.apache.logging.log4j.LogManager

class CalculatorWalkerListener: CalculatorGrammarBaseListener() {
  private val logger = LogManager.getLogger()
  private var stringToCalc = ""
  private var result = ""
  val parentExpressionMap = mutableMapOf<String, String>()
  fun getResult(): String {
    parentExpressionMap.forEach { t, u ->  logger.info("PE: $t ===== $u")}
    return result
  }

  override fun enterCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {
    stringToCalc = ctx?.expression(0)?.text ?: ""
  }

  override fun exitCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {}

  override fun enterExpression(ctx: CalculatorGrammarParser.ExpressionContext?) {
    if(ctx?.childCount == 3){
      if(ctx.expression(0).getChild(0) is CalculatorGrammarParser.NumberContext &&
          ctx.expression(1).getChild(0) is CalculatorGrammarParser.NumberContext){
        val a = (ctx.expression(0).getChild(0) as CalculatorGrammarParser.NumberContext).text.toInt()
        val b = (ctx.expression(1).getChild(0) as CalculatorGrammarParser.NumberContext).text.toInt()
        when(ctx.op?.type){
          CalculatorGrammarParser.POW -> parentExpressionMap.put("$a^$b", (Math.pow(a.toDouble(), b.toDouble())).toString())
          CalculatorGrammarParser.MULT -> parentExpressionMap.put("$a*$b", (a * b).toString())
          CalculatorGrammarParser.DIV -> parentExpressionMap.put("$a/$b", (a / b).toString())
          CalculatorGrammarParser.PLUS -> parentExpressionMap.put("$a+$b", (a + b).toString())
          CalculatorGrammarParser.MINUS -> parentExpressionMap.put("$a-$b", (a - b).toString())
        }
      }else{
        ctx.expression().let { parentExpressionMap.put(it.get(0).text, "") }
      }
    }
  }

  override fun exitExpression(ctx: CalculatorGrammarParser.ExpressionContext?) {}

  override fun enterParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {}

  override fun exitParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {}

  override fun enterNumber(ctx: CalculatorGrammarParser.NumberContext?) {}

  override fun exitNumber(ctx: CalculatorGrammarParser.NumberContext?) {}

  override fun enterEveryRule(ctx: ParserRuleContext) {}

  override fun exitEveryRule(ctx: ParserRuleContext) {}

  override fun visitTerminal(node: TerminalNode) {}

  override fun visitErrorNode(node: ErrorNode) {}
}