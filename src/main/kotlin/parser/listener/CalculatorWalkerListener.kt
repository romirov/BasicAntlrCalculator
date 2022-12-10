package parser.listener

import CalculatorGrammarBaseListener
import CalculatorGrammarParser
import mu.KotlinLogging
import org.antlr.v4.runtime.RuleContext

class CalculatorWalkerListener: CalculatorGrammarBaseListener() {
  private lateinit var expr: String
  private val values = mutableListOf<Double>()
  private val resultValuesMap = mutableMapOf<String, Double>()
  private var isCalculationsMade = false

  fun getRezult(): String {
    val reverseKeyList = resultValuesMap.keys.reversed()
    reverseKeyList.forEach{expression ->
      expr = expr.replace(expression, resultValuesMap.get(expression).toString())
    }
    values.clear()
    resultValuesMap.clear()
    val logger = KotlinLogging.logger{}
    logger.info("result: ${expr}")
    return expr
  }

  override fun enterCalculation(ctx: CalculatorGrammarParser.CalculationContext?){
    ctx?.text?.let { expr = it }
  }

  override fun exitNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?) {
    ctx?.number()?.text?.let { value -> values.add(value.toDouble()) }
  }

  override fun exitParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {
    addValuesToResultMapByCondition(ctx)
  }

  override fun exitParentheses(ctx: CalculatorGrammarParser.ParenthesesContext?) {
    addValuesToResultMapByCondition(ctx)
  }

  override fun exitCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {
    addValuesToResultMapByCondition(ctx)
  }

  private fun addValuesToResultMapByCondition(ctx: RuleContext?) {
    if (isCalculationsMade) {
      ctx?.text?.let { resultValuesMap.put(it, values.last()) }
      isCalculationsMade = false
    }
  }
  override fun exitMultiplicationOrDivisionParen(ctx: CalculatorGrammarParser.MultiplicationOrDivisionParenContext?) {
    ctx?.operation?.let { calculate(it.type) }
    addValuesToResultMapByCondition(ctx)
  }

  override fun exitAdditionOrSubtractionParen(ctx: CalculatorGrammarParser.AdditionOrSubtractionParenContext?) {
    ctx?.operation?.let { calculate(it.type) }
    addValuesToResultMapByCondition(ctx)
  }

  override fun exitMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?) {
    ctx?.operation?.let { calculate(it.type) }
  }

  override fun exitAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?) {
    ctx?.operation?.let { calculate(it.type) }
  }

  private fun calculate(operationType: Int) {
    if (values.size > 1) {
      val right = values.get(values.lastIndex - 1)
      values.removeAt(values.lastIndex - 1)

      val left = values.get(values.lastIndex)
      values.removeAt(values.lastIndex)

      when (operationType) {
        CalculatorGrammarParser.MUL -> values.add(right * left)
        CalculatorGrammarParser.DIV -> values.add(right / left)
        CalculatorGrammarParser.ADD -> values.add(right + left)
        CalculatorGrammarParser.SUB -> values.add(right - left)
      }
      isCalculationsMade = true
    }
  }
}