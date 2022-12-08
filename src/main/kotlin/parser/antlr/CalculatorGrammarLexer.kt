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
    const val VARIABLE = 2
    const val LPAREN = 3
    const val RPAREN = 4
    const val MUL = 5
    const val DIV = 6
    const val ADD = 7
    const val SUB = 8
    const val POINT = 9
    const val WS = 10
    var channelNames = arrayOf(
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    )
    var modeNames = arrayOf(
        "DEFAULT_MODE"
    )

    private fun makeRuleNames(): Array<String> {
      return arrayOf(
          "NUMBER", "VARIABLE", "VALID_OBJECT", "VALID_ID", "VALID_OBJECT_ID",
          "VALID_OBJECT_PROPERTY", "LPAREN", "RPAREN", "MUL", "DIV", "ADD", "SUB",
          "POINT", "WS"
      )
    }

    val ruleNames = makeRuleNames()
    private fun makeLiteralNames(): Array<String?> {
      return arrayOf(
          null, null, null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'.'"
      )
    }

    private val _LITERAL_NAMES = makeLiteralNames()
    private fun makeSymbolicNames(): Array<String?> {
      return arrayOf(
          null, "NUMBER", "VARIABLE", "LPAREN", "RPAREN", "MUL", "DIV", "ADD",
          "SUB", "POINT", "WS"
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
        "\u0004\u0000\ng\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
            "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
            "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
            "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
            "\u0007\u000b\u0002\u000c\u0007\u000c\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001f" +
            "\b\u0000\u000b\u0000\u000c\u0000 \u0001\u0000\u0001\u0000\u0004\u0000%\b\u0000" +
            "\u000b\u0000\u000c\u0000&\u0003\u0000)\b\u0000\u0001\u0001\u0001\u0001\u0001" +
            "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004" +
            "\u00023\b\u0002\u000b\u0002\u000c\u00024\u0001\u0002\u0001\u0002\u0004\u0002" +
            "9\b\u0002\u000b\u0002\u000c\u0002:\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
            "\u0002\u0001\u0002\u0001\u0002\u0004\u0002C\b\u0002\u000b\u0002\u000c\u0002" +
            "D\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
            "\u0003\u0004M\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005\u0001" +
            "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001" +
            "\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\r\u0004" +
            "\rb\b\r\u000b\r\u000c\rc\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003" +
            "\u0002\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0003\u000f\u0004" +
            "\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b\u0019\t\u001b\n\u0001\u0000" +
            "\u0001\u0003\u0000\t\n\r\r  l\u0000\u0001\u0001\u0000\u0000\u0000\u0000" +
            "\u0003\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
            "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
            "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
            "\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b" +
            "\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0003*\u0001" +
            "\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007H\u0001\u0000\u0000" +
            "\u0000\tL\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rR\u0001" +
            "\u0000\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000" +
            "\u0000\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017" +
            "\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001ba\u0001" +
            "\u0000\u0000\u0000\u001d\u001f\u000209\u0000\u001e\u001d\u0001\u0000\u0000" +
            "\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 " +
            "!\u0001\u0000\u0000\u0000!(\u0001\u0000\u0000\u0000\"$\u0005.\u0000\u0000" +
            "#%\u000209\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&" +
            "$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000" +
            "\u0000(\"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0002\u0001" +
            "\u0000\u0000\u0000*+\u0003\u0005\u0002\u0000+\u0004\u0001\u0000\u0000" +
            "\u0000,-\u0005I\u0000\u0000-.\u0005D\u0000\u0000./\u0005V\u0000\u0000" +
            "/0\u0005_\u0000\u000002\u0001\u0000\u0000\u000013\u0003\t\u0004\u0000" +
            "21\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000" +
            "\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0003\u0019" +
            "\u000c\u000079\u0003\u000b\u0005\u000087\u0001\u0000\u0000\u00009:\u0001\u0000" +
            "\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;G\u0001" +
            "\u0000\u0000\u0000<=\u0005I\u0000\u0000=>\u0005D\u0000\u0000>?\u0005E" +
            "\u0000\u0000?@\u0005_\u0000\u0000@B\u0001\u0000\u0000\u0000AC\u0003\u0007" +
            "\u0003\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001" +
            "\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000" +
            "F,\u0001\u0000\u0000\u0000F<\u0001\u0000\u0000\u0000G\u0006\u0001\u0000" +
            "\u0000\u0000HI\u000209\u0000I\b\u0001\u0000\u0000\u0000JM\u0003\u0007" +
            "\u0003\u0000KM\u0002AZ\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000" +
            "\u0000M\n\u0001\u0000\u0000\u0000NQ\u0003\t\u0004\u0000OQ\u0002az\u0000" +
            "PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u000c\u0001\u0000\u0000" +
            "\u0000RS\u0005(\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005)\u0000" +
            "\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000W\u0012\u0001" +
            "\u0000\u0000\u0000XY\u0005/\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000" +
            "Z[\u0005+\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000" +
            "]\u0018\u0001\u0000\u0000\u0000^_\u0005.\u0000\u0000_\u001a\u0001\u0000" +
            "\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001" +
            "\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000" +
            "de\u0001\u0000\u0000\u0000ef\u0006\r\u0000\u0000f\u001c\u0001\u0000\u0000" +
            "\u0000\u000b\u0000 &(4:DFLPc\u0001\u0006\u0000\u0000"
    val _ATN = ATNDeserializer().deserialize(_serializedATN.toCharArray())

    init {
      _decisionToDFA = arrayOfNulls(_ATN.numberOfDecisions)
      for (i in 0 until _ATN.numberOfDecisions) {
        _decisionToDFA[i] = DFA(_ATN.getDecisionState(i), i)
      }
    }
  }
}