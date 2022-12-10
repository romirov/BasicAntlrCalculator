import mu.KotlinLogging
import parser.CalculatorService

fun main(args: Array<String>) {
  val logger = KotlinLogging.logger{}
  readLine()?.let{logger.info(CalculatorService().calculate(it).toString())}
}