package parser.listener

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTreeListener
import org.antlr.v4.runtime.tree.TerminalNode
import org.apache.logging.log4j.LogManager

class CalculatorParseTreeWalkerListener: ParseTreeListener {
  private val logger = LogManager.getLogger()

  override fun visitTerminal(node: TerminalNode?) {
    logger.info(node?.text)
  }

  override fun visitErrorNode(node: ErrorNode?) {
    //TODO("Not yet implemented")
  }

  override fun enterEveryRule(ctx: ParserRuleContext?) {
    //TODO("Not yet implemented")
  }

  override fun exitEveryRule(ctx: ParserRuleContext?) {
    //TODO("Not yet implemented")
  }
}