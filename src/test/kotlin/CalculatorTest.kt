import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.Test
import parser.CalculatorService
import parser.ExpressionParser
import parser.listener.CalculatorWalkerListener
import java.util.logging.Logger
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CalculatorTest {
  private val calculatorService = CalculatorService()
  @Test
  fun simpleTest(){
    assertEquals(calculatorService.calculate("1 + 1"), 2.0)
    assertEquals(calculatorService.calculate("(1 + 1) / 2"), 1.0)
    assertEquals(calculatorService.calculate("(1 + 1) * (1 + 1)"), 4.0)
    assertEquals(calculatorService.calculate("((1 + 1) * (1 + 1) + (1 + 1)) / 2"), 3.0)
    assertEquals(calculatorService.calculate("(1 + 1) * (1 + 1) + (1 + 1) * (1 + 1) + 1"), 9.0)
    assertEquals(calculatorService.calculate("((1 + 1) * (1 + 1) + (1 + 1)) + ((1 + 1) + 1)"), 9.0)
  }
}