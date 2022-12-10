package parser

import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.listener.CalculatorWalkerListener

class CalculatorService {
  fun calculate(expressionToCalculate: String): Double {
    var parseTree = ExpressionParser.parse(stringToParse = expressionToCalculate)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    while (parseTree.getChild(0).childCount != 1) {
      walker.walk(listener, parseTree)
      parseTree = ExpressionParser.parse(stringToParse = listener.getRezult())
    }
    return parseTree.text.toDouble()
  }
}