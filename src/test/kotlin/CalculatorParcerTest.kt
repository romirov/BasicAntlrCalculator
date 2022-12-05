
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.ExpressionParser
import kotlin.test.assertNotNull

class CalculatorParcerTest {
  @Test
  fun parserTestsWithotException(){
    assertNotNull(ExpressionParser.parse(stringToParse = "2 * 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "2 / 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "2 + 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "2 - 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "(2 + 2) * 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "(2 + 2) * (2 / 2)"))
    assertNotNull(ExpressionParser.parse(stringToParse = "((2 + 2) * (2 / 2)) - 2"))
    assertNotNull(ExpressionParser.parse(stringToParse = "(2 ^ 2 * (2 / 2)) - 2"))
  }

  @Test
  fun parserTestsWithException(){
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 /* 2") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 / (2 + 2") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 = 2") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 > 2") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 ^> 2") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 < 2 =") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "2 + 2 = 4") }
    assertThrows<Exception> {  ExpressionParser.parse(stringToParse = "(2 + 2) * 2 / 2)") }
  }
}