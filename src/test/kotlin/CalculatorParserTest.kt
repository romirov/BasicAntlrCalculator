
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.CalculatorExpressionParser
import kotlin.test.assertNotNull

class CalculatorParserTest {
  @Test
  fun parserTestsWithotException(){
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "2 * 2"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "2 / 2"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "2 + 2"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "2 - 2"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "(2 + 2) * 2"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "(2 + 2) * (2 / 2)"))
    assertNotNull(CalculatorExpressionParser.parse(stringToParse = "((2 + 2) * (2 / 2)) - 2"))
  }

  @Test
  fun parserTestsWithException(){
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 /* 2") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 / (2 + 2") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 = 2") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 > 2") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 ^> 2") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 < 2 =") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "2 + 2 = 4") }
    assertThrows<Exception> {  CalculatorExpressionParser.parse(stringToParse = "(2 + 2) * 2 / 2)") }
  }
}