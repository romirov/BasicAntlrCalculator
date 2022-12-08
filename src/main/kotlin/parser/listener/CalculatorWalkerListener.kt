package parser.listener

import CalculatorGrammarBaseListener
import CalculatorGrammarParser
import org.apache.logging.log4j.LogManager

class CalculatorWalkerListener: CalculatorGrammarBaseListener() {
  private val logger = LogManager.getLogger()
  private val values = mutableListOf<Double>()
  private lateinit var expr:String
  private val parenthesesValuesMap = mutableMapOf<String, String>()
  private var isCalculationsMade = false

  fun getRezult(): String {
    parenthesesValuesMap.forEach {key, value ->
      expr = expr.replace(key,value)
    }
    parenthesesValuesMap.clear()
    logger.info(expr)
    return expr
  }

  override fun enterCalculation(ctx: CalculatorGrammarParser.CalculationContext?){
    ctx?.text?.let { expr = it }
  }

  override fun exitNumberInExpression(ctx: CalculatorGrammarParser.NumberInExpressionContext?) {
    ctx?.number()?.text?.let { value -> values.add(value.toDouble()) }
  }

  override fun exitParen_expression(ctx: CalculatorGrammarParser.Paren_expressionContext?) {
    if (isCalculationsMade) {
      ctx?.text?.let { parenthesesValuesMap.put(it, values.last().toString()) }
      isCalculationsMade = false
    }
    if (values.isNotEmpty())
      values.removeLast()
  }

  override fun exitCalculation(ctx: CalculatorGrammarParser.CalculationContext?) {
    if (isCalculationsMade) {
      ctx?.text?.let { parenthesesValuesMap.put(it, values.last().toString()) }
      isCalculationsMade = false
    }
    if (values.isNotEmpty())
      values.removeLast()
  }

  override fun exitMultiplicationOrDivision(ctx: CalculatorGrammarParser.MultiplicationOrDivisionContext?) {
    if (values.size > 1) {
      val valuesIterator = values.iterator()
      val right = valuesIterator.next()
      valuesIterator.remove()
      val left = valuesIterator.next()
      valuesIterator.remove()

      when (ctx?.operation?.type) {
        CalculatorGrammarParser.MUL -> values.add(right * left)
        CalculatorGrammarParser.DIV -> values.add(right / left)
      }

      isCalculationsMade = true
    }
  }

  override fun exitAdditionOrSubtraction(ctx: CalculatorGrammarParser.AdditionOrSubtractionContext?) {
    if (values.size > 1) {
      val valuesIterator = values.iterator()
      val right = valuesIterator.next()
      valuesIterator.remove()
      val left = valuesIterator.next()
      valuesIterator.remove()
      when (ctx?.operation?.type) {
        CalculatorGrammarParser.ADD -> values.add(right + left)
        CalculatorGrammarParser.SUB -> values.add(right - left)
      }

      isCalculationsMade = true
    }
  }
}