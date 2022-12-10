package parser

import CalculatorGrammarLexer
import CalculatorGrammarParser
import mu.KotlinLogging
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.listener.ThrowingErrorListener

object CalculatorExpressionParser {
  fun parse(stringToParse: String): ParseTree {
    val logger = KotlinLogging.logger{}
    val lexerInterpreter = CalculatorGrammarLexer(CharStreams.fromString(stringToParse))
    lexerInterpreter.addErrorListener(ThrowingErrorListener())
    val tokens = CommonTokenStream(lexerInterpreter)
    val parserInterpreter = CalculatorGrammarParser(tokens)
    parserInterpreter.addErrorListener(ThrowingErrorListener())
    val parseTree: ParseTree = parserInterpreter.calculation()
    logger.info ("parse tree: " + parseTree.toStringTree(parserInterpreter))
    return parseTree
  }
}