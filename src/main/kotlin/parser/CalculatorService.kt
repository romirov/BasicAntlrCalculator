package parser

import org.antlr.v4.runtime.tree.ParseTreeWalker
import parser.listener.CalculatorWalkerListener

class CalculatorService {
  fun calculate(expressionToCalculate: String): Double {
    var parseTree = CalculatorExpressionParser.parse(stringToParse = expressionToCalculate)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    while (parseTree.getChild(0).childCount != 1) {
      walker.walk(listener, parseTree)
      parseTree = CalculatorExpressionParser.parse(stringToParse = listener.getRezult().replace("<EOF>", ""))
    }
    val result = parseTree.text.replace("<EOF>", "")
    return result.toDouble()
  }
}