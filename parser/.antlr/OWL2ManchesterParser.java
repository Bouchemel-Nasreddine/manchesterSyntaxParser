// Generated from /home/nasro/souslesens/manchesterSyntaxParser/parser/OWL2Manchester.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OWL2ManchesterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, NONNEGATIVEINTEGER=2, AND=3, OR=4, NOT=5, SOME=6, ONLY=7, VALUE=8, 
		MIN=9, MAX=10, EXACTLY=11, SELF=12, CONCEPT=13, OBJECT_PROPERTY=14, WS=15, 
		LPAREN=16, RPAREN=17;
	public static final int
		RULE_classExpression = 0, RULE_axiom = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"classExpression", "axiom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'and'", "'or'", "'not'", "'some'", "'only'", "'value'", 
			"'min'", "'max'", "'exactly'", "'self'", null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIGIT", "NONNEGATIVEINTEGER", "AND", "OR", "NOT", "SOME", "ONLY", 
			"VALUE", "MIN", "MAX", "EXACTLY", "SELF", "CONCEPT", "OBJECT_PROPERTY", 
			"WS", "LPAREN", "RPAREN"
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

	@Override
	public String getGrammarFileName() { return "OWL2Manchester.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OWL2ManchesterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExpressionContext extends ParserRuleContext {
		public TerminalNode CONCEPT() { return getToken(OWL2ManchesterParser.CONCEPT, 0); }
		public TerminalNode LPAREN() { return getToken(OWL2ManchesterParser.LPAREN, 0); }
		public List<ClassExpressionContext> classExpression() {
			return getRuleContexts(ClassExpressionContext.class);
		}
		public ClassExpressionContext classExpression(int i) {
			return getRuleContext(ClassExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OWL2ManchesterParser.RPAREN, 0); }
		public TerminalNode OBJECT_PROPERTY() { return getToken(OWL2ManchesterParser.OBJECT_PROPERTY, 0); }
		public TerminalNode SOME() { return getToken(OWL2ManchesterParser.SOME, 0); }
		public TerminalNode ONLY() { return getToken(OWL2ManchesterParser.ONLY, 0); }
		public TerminalNode VALUE() { return getToken(OWL2ManchesterParser.VALUE, 0); }
		public TerminalNode SELF() { return getToken(OWL2ManchesterParser.SELF, 0); }
		public TerminalNode MIN() { return getToken(OWL2ManchesterParser.MIN, 0); }
		public TerminalNode NONNEGATIVEINTEGER() { return getToken(OWL2ManchesterParser.NONNEGATIVEINTEGER, 0); }
		public TerminalNode MAX() { return getToken(OWL2ManchesterParser.MAX, 0); }
		public TerminalNode EXACTLY() { return getToken(OWL2ManchesterParser.EXACTLY, 0); }
		public TerminalNode AND() { return getToken(OWL2ManchesterParser.AND, 0); }
		public TerminalNode OR() { return getToken(OWL2ManchesterParser.OR, 0); }
		public ClassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpression; }
	}

	public final ClassExpressionContext classExpression() throws RecognitionException {
		return classExpression(0);
	}

	private ClassExpressionContext classExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassExpressionContext _localctx = new ClassExpressionContext(_ctx, _parentState);
		ClassExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_classExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(5);
				match(CONCEPT);
				}
				break;
			case 2:
				{
				setState(6);
				match(LPAREN);
				setState(7);
				classExpression(0);
				setState(8);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(10);
				match(OBJECT_PROPERTY);
				setState(11);
				match(SOME);
				setState(12);
				classExpression(7);
				}
				break;
			case 4:
				{
				setState(13);
				match(OBJECT_PROPERTY);
				setState(14);
				match(ONLY);
				setState(15);
				classExpression(6);
				}
				break;
			case 5:
				{
				setState(16);
				match(OBJECT_PROPERTY);
				setState(17);
				match(VALUE);
				setState(18);
				match(CONCEPT);
				}
				break;
			case 6:
				{
				setState(19);
				match(OBJECT_PROPERTY);
				setState(20);
				match(SELF);
				}
				break;
			case 7:
				{
				setState(21);
				match(OBJECT_PROPERTY);
				setState(22);
				match(MIN);
				setState(23);
				match(NONNEGATIVEINTEGER);
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					classExpression(0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(27);
				match(OBJECT_PROPERTY);
				setState(28);
				match(MAX);
				setState(29);
				match(NONNEGATIVEINTEGER);
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(30);
					classExpression(0);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(33);
				match(OBJECT_PROPERTY);
				setState(34);
				match(EXACTLY);
				setState(35);
				match(NONNEGATIVEINTEGER);
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(36);
					classExpression(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ClassExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classExpression);
						setState(41);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(42);
						match(AND);
						setState(43);
						classExpression(10);
						}
						break;
					case 2:
						{
						_localctx = new ClassExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classExpression);
						setState(44);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(45);
						match(OR);
						setState(46);
						classExpression(9);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OWL2ManchesterParser.EOF, 0); }
		public List<ClassExpressionContext> classExpression() {
			return getRuleContexts(ClassExpressionContext.class);
		}
		public ClassExpressionContext classExpression(int i) {
			return getRuleContext(ClassExpressionContext.class,i);
		}
		public AxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiom; }
	}

	public final AxiomContext axiom() throws RecognitionException {
		AxiomContext _localctx = new AxiomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_axiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				classExpression(0);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 90112L) != 0) );
			setState(57);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return classExpression_sempred((ClassExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean classExpression_sempred(ClassExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000&\b\u0000\u0003\u0000(\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00000\b\u0000\n\u0000\f\u00003\t\u0000\u0001\u0001\u0004\u0001"+
		"6\b\u0001\u000b\u0001\f\u00017\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0001\u0000\u0002\u0000\u0002\u0000\u0000G\u0000\'\u0001\u0000\u0000"+
		"\u0000\u00025\u0001\u0000\u0000\u0000\u0004\u0005\u0006\u0000\uffff\uffff"+
		"\u0000\u0005(\u0005\r\u0000\u0000\u0006\u0007\u0005\u0010\u0000\u0000"+
		"\u0007\b\u0003\u0000\u0000\u0000\b\t\u0005\u0011\u0000\u0000\t(\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0005\u000e\u0000\u0000\u000b\f\u0005\u0006"+
		"\u0000\u0000\f(\u0003\u0000\u0000\u0007\r\u000e\u0005\u000e\u0000\u0000"+
		"\u000e\u000f\u0005\u0007\u0000\u0000\u000f(\u0003\u0000\u0000\u0006\u0010"+
		"\u0011\u0005\u000e\u0000\u0000\u0011\u0012\u0005\b\u0000\u0000\u0012("+
		"\u0005\r\u0000\u0000\u0013\u0014\u0005\u000e\u0000\u0000\u0014(\u0005"+
		"\f\u0000\u0000\u0015\u0016\u0005\u000e\u0000\u0000\u0016\u0017\u0005\t"+
		"\u0000\u0000\u0017\u0019\u0005\u0002\u0000\u0000\u0018\u001a\u0003\u0000"+
		"\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a(\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u000e\u0000"+
		"\u0000\u001c\u001d\u0005\n\u0000\u0000\u001d\u001f\u0005\u0002\u0000\u0000"+
		"\u001e \u0003\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 (\u0001\u0000\u0000\u0000!\"\u0005\u000e\u0000"+
		"\u0000\"#\u0005\u000b\u0000\u0000#%\u0005\u0002\u0000\u0000$&\u0003\u0000"+
		"\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000\'\u0006\u0001\u0000"+
		"\u0000\u0000\'\n\u0001\u0000\u0000\u0000\'\r\u0001\u0000\u0000\u0000\'"+
		"\u0010\u0001\u0000\u0000\u0000\'\u0013\u0001\u0000\u0000\u0000\'\u0015"+
		"\u0001\u0000\u0000\u0000\'\u001b\u0001\u0000\u0000\u0000\'!\u0001\u0000"+
		"\u0000\u0000(1\u0001\u0000\u0000\u0000)*\n\t\u0000\u0000*+\u0005\u0003"+
		"\u0000\u0000+0\u0003\u0000\u0000\n,-\n\b\u0000\u0000-.\u0005\u0004\u0000"+
		"\u0000.0\u0003\u0000\u0000\t/)\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u00002\u0001\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"46\u0003\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0005\u0000\u0000\u0001:\u0003\u0001\u0000\u0000\u0000"+
		"\u0007\u0019\u001f%\'/17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}