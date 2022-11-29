import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import parser.AntlrCalculatorParcer
import kotlin.test.assertNotNull

class AntlrCalculatorParcerTest {
  @Test
  fun parserTestsWithotException(){
    assertNotNull(AntlrCalculatorParcer.parse("2 * 2"))
    assertNotNull(AntlrCalculatorParcer.parse("2 / 2"))
    assertNotNull(AntlrCalculatorParcer.parse("2 + 2"))
    assertNotNull(AntlrCalculatorParcer.parse("2 - 2"))
    assertNotNull(AntlrCalculatorParcer.parse("(2 + 2) * 2"))
    assertNotNull(AntlrCalculatorParcer.parse("(2 + 2) * (2 / 2)"))
    assertNotNull(AntlrCalculatorParcer.parse("((2 + 2) * (2 / 2)) - 2"))
    assertNotNull(AntlrCalculatorParcer.parse("(2 ^ 2 * (2 / 2)) - 2"))
  }

  @Test
  fun parserTestsWithException(){
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 /* 2") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 / (2 + 2") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 = 2") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 > 2") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 ^> 2") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 < 2 =") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("2 + 2 = 4") }
    assertThrows<Exception> {  AntlrCalculatorParcer.parse("(2 + 2) * 2 / 2)") }
  }
}