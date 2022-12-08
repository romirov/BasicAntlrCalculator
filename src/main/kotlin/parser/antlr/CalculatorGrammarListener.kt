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
   * Enter a parse tree produced by the `NumberInExpression`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterNumberInExpression(ctx: NumberInExpressionContext?)

  /**
   * Exit a parse tree produced by the `NumberInExpression`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitNumberInExpression(ctx: NumberInExpressionContext?)

  /**
   * Enter a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterAdditionOrSubtraction(ctx: AdditionOrSubtractionContext?)

  /**
   * Exit a parse tree produced by the `AdditionOrSubtraction`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitAdditionOrSubtraction(ctx: AdditionOrSubtractionContext?)

  /**
   * Enter a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterMultiplicationOrDivision(ctx: MultiplicationOrDivisionContext?)

  /**
   * Exit a parse tree produced by the `MultiplicationOrDivision`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitMultiplicationOrDivision(ctx: MultiplicationOrDivisionContext?)

  /**
   * Enter a parse tree produced by the `Parentheses`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun enterParentheses(ctx: ParenthesesContext?)

  /**
   * Exit a parse tree produced by the `Parentheses`
   * labeled alternative in [CalculatorGrammarParser.expression].
   * @param ctx the parse tree
   */
  fun exitParentheses(ctx: ParenthesesContext?)

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

  /**
   * Enter a parse tree produced by [CalculatorGrammarParser.variable].
   * @param ctx the parse tree
   */
  fun enterVariable(ctx: CalculatorGrammarParser.VariableContext?)

  /**
   * Exit a parse tree produced by [CalculatorGrammarParser.variable].
   * @param ctx the parse tree
   */
  fun exitVariable(ctx: CalculatorGrammarParser.VariableContext?)
}