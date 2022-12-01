package parser.walker

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.*
import parser.listener.CalculatorParseTreeWalkerListener

class CalculatorParseTreeWalker: ParseTreeWalker() {
  fun walk( calculatorParseTreeWalkerListener: CalculatorParseTreeWalkerListener, parseTree: ParseTree){
    super.walk(calculatorParseTreeWalkerListener, parseTree)
  }
}