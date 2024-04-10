// Generated from /home/nasro/souslesens/manchesterSyntaxParser/parser/OWL2Manchesterv1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OWL2ManchesterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, KW_AND=2, KW_OR=3, KW_NOT=4, KW_SOME=5, KW_ONLY=6, KW_MIN=7, KW_MAX=8, 
		KW_EXACTLY=9, KW_VALUE=10, KW_COMPARISONOPERATOR=11, KW_INVERSE=12, WS=13, 
		LPAREN=14, RPAREN=15, ClassIRI=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "INT", "KW_AND", "KW_OR", "KW_NOT", "KW_SOME", "KW_ONLY", 
			"KW_MIN", "KW_MAX", "KW_EXACTLY", "KW_VALUE", "KW_COMPARISONOPERATOR", 
			"KW_INVERSE", "WS", "LPAREN", "RPAREN", "ClassIRI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'and'", "'or'", "'not'", "'some'", "'only'", "'min'", "'max'", 
			"'exactly'", "'value'", null, "'inverse'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "KW_AND", "KW_OR", "KW_NOT", "KW_SOME", "KW_ONLY", "KW_MIN", 
			"KW_MAX", "KW_EXACTLY", "KW_VALUE", "KW_COMPARISONOPERATOR", "KW_INVERSE", 
			"WS", "LPAREN", "RPAREN", "ClassIRI"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public OWL2ManchesterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OWL2Manchesterv1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002+\b"+
		"\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f`\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000ek\b\u000e\u000b"+
		"\u000e\f\u000el\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011y\b\u0011\n\u0011\f\u0011|\t\u0011\u0000\u0000\u0012\u0001\u0000"+
		"\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f"+
		"\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r"+
		"\u001f\u000e!\u000f#\u0010\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0082\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000"+
		"\u0005*\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t2\u0001"+
		"\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f>\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017S\u0001"+
		"\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000"+
		"\u0000\u001dj\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000!"+
		"r\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000\u0000%&\u0007\u0000\u0000"+
		"\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0007\u0001\u0000\u0000(\u0004"+
		"\u0001\u0000\u0000\u0000)+\u0007\u0001\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005a\u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005d\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005"+
		"o\u0000\u000034\u0005r\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"+
		"n\u0000\u000067\u0005o\u0000\u000078\u0005t\u0000\u00008\f\u0001\u0000"+
		"\u0000\u00009:\u0005s\u0000\u0000:;\u0005o\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005e\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005o\u0000"+
		"\u0000?@\u0005n\u0000\u0000@A\u0005l\u0000\u0000AB\u0005y\u0000\u0000"+
		"B\u0010\u0001\u0000\u0000\u0000CD\u0005m\u0000\u0000DE\u0005i\u0000\u0000"+
		"EF\u0005n\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005m\u0000\u0000"+
		"HI\u0005a\u0000\u0000IJ\u0005x\u0000\u0000J\u0014\u0001\u0000\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005x\u0000\u0000MN\u0005a\u0000\u0000NO\u0005"+
		"c\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005y\u0000"+
		"\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005v\u0000\u0000TU\u0005a\u0000"+
		"\u0000UV\u0005l\u0000\u0000VW\u0005u\u0000\u0000WX\u0005e\u0000\u0000"+
		"X\u0018\u0001\u0000\u0000\u0000Y`\u0005<\u0000\u0000Z[\u0005<\u0000\u0000"+
		"[`\u0005=\u0000\u0000\\`\u0005>\u0000\u0000]^\u0005>\u0000\u0000^`\u0005"+
		"=\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`\u001a\u0001\u0000\u0000"+
		"\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005v\u0000\u0000"+
		"de\u0005e\u0000\u0000ef\u0005r\u0000\u0000fg\u0005s\u0000\u0000gh\u0005"+
		"e\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u000e"+
		"\u0000\u0000o\u001e\u0001\u0000\u0000\u0000pq\u0005(\u0000\u0000q \u0001"+
		"\u0000\u0000\u0000rs\u0005)\u0000\u0000s\"\u0001\u0000\u0000\u0000tz\u0003"+
		"\u0001\u0000\u0000uy\u0003\u0001\u0000\u0000vy\u0003\u0003\u0001\u0000"+
		"wy\u0005_\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{$\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000\u0006\u0000,_lxz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}