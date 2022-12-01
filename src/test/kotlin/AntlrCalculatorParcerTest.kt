import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.AntlrCalculatorParser
import kotlin.test.assertNotNull

class AntlrCalculatorParcerTest {
  @Test
  fun parserTestsWithotException(){
    assertNotNull(AntlrCalculatorParser(stringToParse = "2 * 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "2 / 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "2 + 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "2 - 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "(2 + 2) * 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "(2 + 2) * (2 / 2)").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "((2 + 2) * (2 / 2)) - 2").parseTree)
    assertNotNull(AntlrCalculatorParser(stringToParse = "(2 ^ 2 * (2 / 2)) - 2").parseTree)
  }

  @Test
  fun parserTestsWithException(){
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 /* 2").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 / (2 + 2").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 = 2").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 > 2").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 ^> 2").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 < 2 =").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "2 + 2 = 4").parseTree }
    assertThrows<Exception> {  AntlrCalculatorParser(stringToParse = "(2 + 2) * 2 / 2)").parseTree }
  }
}