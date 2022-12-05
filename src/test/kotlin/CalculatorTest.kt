import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.junit.jupiter.api.Test
import parser.ExpressionParser
import parser.listener.CalculatorWalkerListener

class CalculatorTest {
  @Test
  fun simpleTest(){
    val str = "(2 + (2 + 2)) * (1 - 1)"
    val parseTree = ExpressionParser.parse(stringToParse = str)
    val walker = ParseTreeWalker.DEFAULT
    val listener = CalculatorWalkerListener()
    walker.walk(listener, parseTree)
    listener.getResult()
  }
}