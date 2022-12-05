import CalculatorGrammarParser.*
import org.antlr.v4.runtime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * [CalculatorGrammarParser].
 */
interface CalculatorGrammarListener : ParseTreeListener {
  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun enterCalculation(ctx: CalculationContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.calculation].
   * @param ctx the parse tree
   */
  fun exitCalculation(ctx: CalculationContext?)

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterExpression(ctx: CalculatorGrammarParser.ExpressionContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitExpression(ctx: CalculatorGrammarParser.ExpressionContext?)

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun enterParen_expression(ctx: Paren_expressionContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.paren_expression].
   * @param ctx the parse tree
   */
  fun exitParen_expression(ctx: Paren_expressionContext?)

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun enterNumber(ctx: NumberContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.number].
   * @param ctx the parse tree
   */
  fun exitNumber(ctx: NumberContext?)
}