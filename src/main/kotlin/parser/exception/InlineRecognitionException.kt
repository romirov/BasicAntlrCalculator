package parser.exception

import org.antlr.v4.runtime.*

class InlineRecognitionException(
  message: String?,
  recognizer: Recognizer<*, *>?,
  input: IntStream?,
  parserRuleContext: ParserRuleContext?,
  offendingToken: Token?
) : RecognitionException(message, recognizer, input, parserRuleContext) {
  init {
    this.offendingToken = offendingToken
  }
}