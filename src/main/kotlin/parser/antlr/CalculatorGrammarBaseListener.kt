import CalculatorGrammarParser.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode

/**
 * This class provides an empty implementation of [CalculatorGrammarListener],
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
open class CalculatorGrammarBaseListener : CalculatorGrammarListener {
  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterCalculation(ctx: CalculationContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitCalculation(ctx: CalculationContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterExpression(ctx: CalculatorGrammarParser.ExpressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitExpression(ctx: CalculatorGrammarParser.ExpressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterParen_expression(ctx: Paren_expressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitParen_expression(ctx: Paren_expressionContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterNumber(ctx: NumberContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitNumber(ctx: NumberContext?) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun enterEveryRule(ctx: ParserRuleContext) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun exitEveryRule(ctx: ParserRuleContext) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun visitTerminal(node: TerminalNode) {}

  /**
   * {@inheritDoc}
   *
   *
   * The default implementation does nothing.
   */
  override fun visitErrorNode(node: ErrorNode) {}
}