package parser

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserInterpreter
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.tool.Grammar
import org.apache.logging.log4j.LogManager
import parser.listener.ThrowingErrorListener

class AntlrCalculatorParser(
  val combinedGrammarFileName: String = "src/main/antlr/calculatorGrammar.g4",
  val startRule: String = "calculation",
  val  stringToParse: String ) {

  private val logger = LogManager.getLogger()
  val grammar = Grammar.load(combinedGrammarFileName)
  val parserInterpreter = getParser()
  val parseTree = getTree()

  private fun getParser(): ParserInterpreter {
    val lexerInterpreter = grammar.createLexerInterpreter(CharStreams.fromString(stringToParse))
    lexerInterpreter.addErrorListener(ThrowingErrorListener())
    val tokens = CommonTokenStream(lexerInterpreter)
    val parserInterpreter = grammar.createParserInterpreter(tokens)
    parserInterpreter.addErrorListener(ThrowingErrorListener())
    return parserInterpreter
  }

  private fun getTree() : ParseTree {
    val parseTree: ParseTree = parserInterpreter.parse(grammar.getRule(startRule).index)
    logger.info ("parse tree: " + parseTree.toStringTree(parserInterpreter))
    return parseTree
  }
}