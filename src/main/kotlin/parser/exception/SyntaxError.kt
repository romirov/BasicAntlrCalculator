package parser.exception

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RecognitionException

class SyntaxError(message: String?, exception: RecognitionException) :
  RecognitionException(message, exception.recognizer, exception.inputStream, exception.ctx as ParserRuleContext) {
  init {
    offendingToken = exception.offendingToken
    initCause(exception)
  }
}