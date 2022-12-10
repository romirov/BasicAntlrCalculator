import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATN
import org.antlr.v4.runtime.atn.ATNDeserializer
import org.antlr.v4.runtime.atn.LexerATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.dfa.DFA

class CalculatorGrammarLexer(input: CharStream?) : Lexer(input) {
  @Deprecated("")
  override fun getTokenNames(): Array<String?> {
    return Companion.tokenNames
  }

  override fun getVocabulary(): Vocabulary {
    return VOCABULARY
  }

  override fun getGrammarFileName(): String {
    return "CalculatorGrammar.g4"
  }

  override fun getRuleNames(): Array<String> {
    return Companion.ruleNames
  }

  override fun getSerializedATN(): String {
    return _serializedATN
  }

  override fun getChannelNames(): Array<String> {
    return Companion.channelNames
  }

  override fun getModeNames(): Array<String> {
    return Companion.modeNames
  }

  override fun getATN(): ATN {
    return _ATN
  }

  init {
    _interp = LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache)
  }

  companion object {
    init {
      RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION)
    }

    protected val _decisionToDFA: Array<DFA?>
    protected val _sharedContextCache = PredictionContextCache()
    const val NUMBER = 1
    const val LPAREN = 2
    const val RPAREN = 3
    const val MUL = 4
    const val DIV = 5
    const val ADD = 6
    const val SUB = 7
    const val POINT = 8
    const val WS = 9
    var channelNames = arrayOf(
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    )
    var modeNames = arrayOf(
        "DEFAULT_MODE"
    )

    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "NUMBER", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB", "POINT", "WS"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'.'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "NUMBER", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB", "POINT",
          "WS"
      )
    }

    private val _SYMBOLIC_NAMES = makeSymbolicNames()
    val VOCABULARY: Vocabulary = VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES)

    @Deprecated("Use {@link #VOCABULARY} instead.")
    val tokenNames: Array<String?>

    init {
      tokenNames = arrayOfNulls(_SYMBOLIC_NAMES.size)
      for (i in tokenNames.indices) {
        tokenNames[i] = VOCABULARY.getLiteralName(i)
        if (tokenNames[i] == null) {
          tokenNames[i] = VOCABULARY.getSymbolicName(i)
        }
        if (tokenNames[i] == null) {
          tokenNames[i] = "<INVALID>"
        }
      }
    }

    const val _serializedATN =
        "\u0004\u0000\t5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
            "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
            "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
            "\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b" +
            "\u0000\u000c\u0000\u0016\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000" +
            "\u000b\u0000\u000c\u0000\u001c\u0003\u0000\u001f\b\u0000\u0001\u0001\u0001" +
            "\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001" +
            "\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001" +
            "\u0007\u0001\b\u0004\b0\b\b\u000b\b\u000c\b1\u0001\b\u0001\b\u0000\u0000\t" +
            "\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r" +
            "\u0007\u000f\b\u0011\t\u0001\u0000\u0001\u0003\u0000\t\n\r\r  8\u0000" +
            "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000" +
            "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000" +
            "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r" +
            "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
            "\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0003 \u0001" +
            "\u0000\u0000\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007$\u0001\u0000" +
            "\u0000\u0000\t&\u0001\u0000\u0000\u0000\u000b(\u0001\u0000\u0000\u0000" +
            "\r*\u0001\u0000\u0000\u0000\u000f,\u0001\u0000\u0000\u0000\u0011/\u0001" +
            "\u0000\u0000\u0000\u0013\u0015\u000209\u0000\u0014\u0013\u0001\u0000\u0000" +
            "\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000" +
            "\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u001e\u0001\u0000\u0000" +
            "\u0000\u0018\u001a\u0005.\u0000\u0000\u0019\u001b\u000209\u0000\u001a" +
            "\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c" +
            "\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d" +
            "\u001f\u0001\u0000\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e" +
            "\u001f\u0001\u0000\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !\u0005" +
            "(\u0000\u0000!\u0004\u0001\u0000\u0000\u0000\"#\u0005)\u0000\u0000#\u0006" +
            "\u0001\u0000\u0000\u0000$%\u0005*\u0000\u0000%\b\u0001\u0000\u0000\u0000" +
            "&\'\u0005/\u0000\u0000\'\n\u0001\u0000\u0000\u0000()\u0005+\u0000\u0000" +
            ")\u000c\u0001\u0000\u0000\u0000*+\u0005-\u0000\u0000+\u000e\u0001\u0000\u0000" +
            "\u0000,-\u0005.\u0000\u0000-\u0010\u0001\u0000\u0000\u0000.0\u0007\u0000" +
            "\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001" +
            "\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000" +
            "34\u0006\b\u0000\u00004\u0012\u0001\u0000\u0000\u0000\u0005\u0000\u0016" +
            "\u001c\u001e1\u0001\u0006\u0000\u0000"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}