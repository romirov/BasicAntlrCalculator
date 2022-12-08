import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.junit.jupiter.api.Test
import parser.ExpressionParser
import parser.listener.CalculatorWalkerListener

class CalculatorTest {
  @Test
  fun simpleTest(){
    val str = "((1 + 1) * (1 + 1) + (1 + 1)) + ((1 + 1) + 1)"
    var parseTree = ExpressionParser.parse(stringToParse = str)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    while (parseTree.getChild(0).childCount != 1) {
      walker.walk(listener, parseTree)
      parseTree = ExpressionParser.parse(stringToParse = listener.getRezult())
    }
  }
}