package parser

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserInterpreter
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.tool.Grammar
import org.apache.logging.log4j.LogManager
import parser.listener.ThrowingErrorListener

object AntlrCalculatorParcer {
  private val logger = LogManager.getLogger()
  private val defaultAntlrGrammarFileName = "src/main/antlr/calculatorGrammar.g4"

  fun parse(str: String ,
    combinedGrammarFileName: String = defaultAntlrGrammarFileName,
    startRule: String = "calculation") : ParseTree {
    val grammar = Grammar.load(combinedGrammarFileName)
    val lexerInterpreter = grammar.createLexerInterpreter(CharStreams.fromString(str))
    lexerInterpreter.addErrorListener(ThrowingErrorListener())
    val tokens = CommonTokenStream(lexerInterpreter)
    val parser: ParserInterpreter = grammar.createParserInterpreter(tokens)
    parser.addErrorListener(ThrowingErrorListener())
    val parseTree: ParseTree = parser.parse(grammar.getRule(startRule).index)
    logger.info ("parse tree: " + parseTree.toStringTree(parser))
    return parseTree
  }
}