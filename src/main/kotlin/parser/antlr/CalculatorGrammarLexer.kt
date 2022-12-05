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
    const val SNUMBER = 1
    const val LPAREN = 2
    const val RPAREN = 3
    const val PLUS = 4
    const val MINUS = 5
    const val MULT = 6
    const val DIV = 7
    const val POINT = 8
    const val POW = 9
    const val WS = 10
    var channelNames = arrayOf(
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    )
    var modeNames = arrayOf(
        "DEFAULT_MODE"
    )

    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "SNUMBER", "NUMBER", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT",
          "DIV", "POINT", "POW", "WS"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'", "'^'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "SNUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT", "DIV",
          "POINT", "POW", "WS"
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
        "\u0004\u0000\nD\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
            "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
            "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
            "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
            "\u0007\u000b\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0001\u0000" +
            "\u0001\u0001\u0004\u0001 \b\u0001\u000b\u0001\u000c\u0001!\u0001\u0001\u0001" +
            "\u0001\u0004\u0001&\b\u0001\u000b\u0001\u000c\u0001\'\u0003\u0001*\b\u0001" +
            "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
            "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
            "\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b" +
            "?\b\u000b\u000b\u000b\u000c\u000b@\u0001\u000b\u0001\u000b\u0000\u0000\u000c\u0001" +
            "\u0001\u0003\u0000\u0005\u0000\u0007\u0002\t\u0003\u000b\u0004\r\u0005" +
            "\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0001\u0000\u0002\u0002" +
            "\u0000++--\u0003\u0000\t\n\r\r  F\u0000\u0001\u0001\u0000\u0000\u0000" +
            "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
            "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
            "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
            "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
            "\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000\u0000\u0003\u001f" +
            "\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000" +
            "\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000" +
            "\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u00117\u0001" +
            "\u0000\u0000\u0000\u00139\u0001\u0000\u0000\u0000\u0015;\u0001\u0000\u0000" +
            "\u0000\u0017>\u0001\u0000\u0000\u0000\u0019\u001b\u0003\u0005\u0002\u0000" +
            "\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000" +
            "\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0003\u0001\u0000" +
            "\u001d\u0002\u0001\u0000\u0000\u0000\u001e \u000209\u0000\u001f\u001e" +
            "\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000" +
            "\u0000\u0000!\"\u0001\u0000\u0000\u0000\")\u0001\u0000\u0000\u0000#%\u0005" +
            ".\u0000\u0000$&\u000209\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000" +
            "\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001" +
            "\u0000\u0000\u0000)#\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000" +
            "*\u0004\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000,\u0006\u0001" +
            "\u0000\u0000\u0000-.\u0005(\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005" +
            ")\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005+\u0000\u00002\u000c\u0001" +
            "\u0000\u0000\u000034\u0005-\u0000\u00004\u000e\u0001\u0000\u0000\u0000" +
            "56\u0005*\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005/\u0000\u0000" +
            "8\u0012\u0001\u0000\u0000\u00009:\u0005.\u0000\u0000:\u0014\u0001\u0000" +
            "\u0000\u0000;<\u0005^\u0000\u0000<\u0016\u0001\u0000\u0000\u0000=?\u0007" +
            "\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000" +
            "@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000" +
            "\u0000BC\u0006\u000b\u0000\u0000C\u0018\u0001\u0000\u0000\u0000\u0006" +
            "\u0000\u001a!\')@\u0001\u0006\u0000\u0000"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}