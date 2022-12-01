import org.junit.jupiter.api.Test
import parser.AntlrCalculatorParser
import parser.listener.CalculatorParseTreeWalkerListener
import parser.walker.CalculatorParseTreeWalker

class CalculatorTest {
  @Test
  fun simpleTest(){
    val str = "(2 + 2) * 1"
    val antlrCalculatorParcer = AntlrCalculatorParser(stringToParse = str)
    val grammar = antlrCalculatorParcer.grammar
    val parcer = antlrCalculatorParcer.parserInterpreter
    val parseTree = antlrCalculatorParcer.parseTree
    val walker = CalculatorParseTreeWalker()
    walker.walk(CalculatorParseTreeWalkerListener(), parseTree)
  }
}