// Generated from Bonus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BonusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOL=15, VAR=16, NUMBER=17, 
		WS=18;
	public static final int
		RULE_mainNode = 0, RULE_parse = 1, RULE_bracketNode = 2, RULE_divNode = 3, 
		RULE_plusNode = 4, RULE_notNode = 5, RULE_greaterNode = 6, RULE_andNode = 7, 
		RULE_aexpr = 8, RULE_bexpr = 9, RULE_seqNode = 10, RULE_blockNode = 11, 
		RULE_assigNode = 12, RULE_ifNode = 13, RULE_whileNode = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"mainNode", "parse", "bracketNode", "divNode", "plusNode", "notNode", 
			"greaterNode", "andNode", "aexpr", "bexpr", "seqNode", "blockNode", "assigNode", 
			"ifNode", "whileNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'/'", "'+'", "'!'", "'>'", "'&&'", "'{'", "'}'", 
			"'='", "';'", "'if'", "'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOL", "VAR", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Bonus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BonusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainNodeContext extends ParserRuleContext {
		public ParseContext parse() {
			return getRuleContext(ParseContext.class,0);
		}
		public MainNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterMainNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitMainNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitMainNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainNodeContext mainNode() throws RecognitionException {
		MainNodeContext _localctx = new MainNodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			parse();
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

	public static class ParseContext extends ParserRuleContext {
		public SeqNodeContext seqNode() {
			return getRuleContext(SeqNodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BonusParser.EOF, 0); }
		public AssigNodeContext assigNode() {
			return getRuleContext(AssigNodeContext.class,0);
		}
		public IfNodeContext ifNode() {
			return getRuleContext(IfNodeContext.class,0);
		}
		public WhileNodeContext whileNode() {
			return getRuleContext(WhileNodeContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parse);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				seqNode();
				setState(33);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				assigNode();
				setState(36);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				ifNode();
				setState(39);
				match(EOF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				whileNode();
				setState(42);
				match(EOF);
				}
				break;
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

	public static class BracketNodeContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BracketNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterBracketNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitBracketNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitBracketNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketNodeContext bracketNode() throws RecognitionException {
		BracketNodeContext _localctx = new BracketNodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bracketNode);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__0);
				setState(47);
				aexpr();
				setState(48);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__0);
				setState(51);
				bexpr();
				setState(52);
				match(T__1);
				}
				break;
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

	public static class DivNodeContext extends ParserRuleContext {
		public List<BracketNodeContext> bracketNode() {
			return getRuleContexts(BracketNodeContext.class);
		}
		public BracketNodeContext bracketNode(int i) {
			return getRuleContext(BracketNodeContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(BonusParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(BonusParser.VAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(BonusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BonusParser.NUMBER, i);
		}
		public List<DivNodeContext> divNode() {
			return getRuleContexts(DivNodeContext.class);
		}
		public DivNodeContext divNode(int i) {
			return getRuleContext(DivNodeContext.class,i);
		}
		public DivNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterDivNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitDivNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitDivNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivNodeContext divNode() throws RecognitionException {
		return divNode(0);
	}

	private DivNodeContext divNode(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivNodeContext _localctx = new DivNodeContext(_ctx, _parentState);
		DivNodeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_divNode, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(57);
				bracketNode();
				}
				break;
			case VAR:
				{
				setState(58);
				match(VAR);
				}
				break;
			case NUMBER:
				{
				setState(59);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62);
			match(T__2);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(63);
				bracketNode();
				}
				break;
			case VAR:
				{
				setState(64);
				match(VAR);
				}
				break;
			case NUMBER:
				{
				setState(65);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivNodeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_divNode);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69);
					match(T__2);
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(70);
						bracketNode();
						}
						break;
					case 2:
						{
						setState(71);
						divNode(0);
						}
						break;
					case 3:
						{
						setState(72);
						match(VAR);
						}
						break;
					case 4:
						{
						setState(73);
						match(NUMBER);
						}
						break;
					}
					}
					} 
				}
				setState(80);
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

	public static class PlusNodeContext extends ParserRuleContext {
		public List<BracketNodeContext> bracketNode() {
			return getRuleContexts(BracketNodeContext.class);
		}
		public BracketNodeContext bracketNode(int i) {
			return getRuleContext(BracketNodeContext.class,i);
		}
		public List<DivNodeContext> divNode() {
			return getRuleContexts(DivNodeContext.class);
		}
		public DivNodeContext divNode(int i) {
			return getRuleContext(DivNodeContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(BonusParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(BonusParser.VAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(BonusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BonusParser.NUMBER, i);
		}
		public PlusNodeContext plusNode() {
			return getRuleContext(PlusNodeContext.class,0);
		}
		public PlusNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterPlusNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitPlusNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitPlusNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusNodeContext plusNode() throws RecognitionException {
		return plusNode(0);
	}

	private PlusNodeContext plusNode(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusNodeContext _localctx = new PlusNodeContext(_ctx, _parentState);
		PlusNodeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_plusNode, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(82);
				bracketNode();
				}
				break;
			case 2:
				{
				setState(83);
				divNode(0);
				}
				break;
			case 3:
				{
				setState(84);
				match(VAR);
				}
				break;
			case 4:
				{
				setState(85);
				match(NUMBER);
				}
				break;
			}
			setState(88);
			match(T__3);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(89);
				bracketNode();
				}
				break;
			case 2:
				{
				setState(90);
				divNode(0);
				}
				break;
			case 3:
				{
				setState(91);
				match(VAR);
				}
				break;
			case 4:
				{
				setState(92);
				match(NUMBER);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusNodeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_plusNode);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					match(T__3);
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(97);
						bracketNode();
						}
						break;
					case 2:
						{
						setState(98);
						divNode(0);
						}
						break;
					case 3:
						{
						setState(99);
						match(VAR);
						}
						break;
					case 4:
						{
						setState(100);
						match(NUMBER);
						}
						break;
					}
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class NotNodeContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NotNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterNotNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitNotNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitNotNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNodeContext notNode() throws RecognitionException {
		NotNodeContext _localctx = new NotNodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(109);
			bexpr();
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

	public static class GreaterNodeContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(BonusParser.NUMBER, 0); }
		public TerminalNode VAR() { return getToken(BonusParser.VAR, 0); }
		public BracketNodeContext bracketNode() {
			return getRuleContext(BracketNodeContext.class,0);
		}
		public PlusNodeContext plusNode() {
			return getRuleContext(PlusNodeContext.class,0);
		}
		public DivNodeContext divNode() {
			return getRuleContext(DivNodeContext.class,0);
		}
		public GreaterNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterGreaterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitGreaterNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitGreaterNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterNodeContext greaterNode() throws RecognitionException {
		GreaterNodeContext _localctx = new GreaterNodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_greaterNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(111);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(112);
				match(VAR);
				}
				break;
			case 3:
				{
				setState(113);
				bracketNode();
				}
				break;
			case 4:
				{
				setState(114);
				plusNode(0);
				}
				break;
			case 5:
				{
				setState(115);
				divNode(0);
				}
				break;
			}
			setState(118);
			match(T__5);
			setState(119);
			aexpr();
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

	public static class AndNodeContext extends ParserRuleContext {
		public List<BracketNodeContext> bracketNode() {
			return getRuleContexts(BracketNodeContext.class);
		}
		public BracketNodeContext bracketNode(int i) {
			return getRuleContext(BracketNodeContext.class,i);
		}
		public List<NotNodeContext> notNode() {
			return getRuleContexts(NotNodeContext.class);
		}
		public NotNodeContext notNode(int i) {
			return getRuleContext(NotNodeContext.class,i);
		}
		public List<GreaterNodeContext> greaterNode() {
			return getRuleContexts(GreaterNodeContext.class);
		}
		public GreaterNodeContext greaterNode(int i) {
			return getRuleContext(GreaterNodeContext.class,i);
		}
		public List<TerminalNode> BOOL() { return getTokens(BonusParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(BonusParser.BOOL, i);
		}
		public AndNodeContext andNode() {
			return getRuleContext(AndNodeContext.class,0);
		}
		public AndNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterAndNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitAndNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitAndNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndNodeContext andNode() throws RecognitionException {
		return andNode(0);
	}

	private AndNodeContext andNode(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndNodeContext _localctx = new AndNodeContext(_ctx, _parentState);
		AndNodeContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_andNode, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122);
				bracketNode();
				}
				break;
			case 2:
				{
				setState(123);
				notNode();
				}
				break;
			case 3:
				{
				setState(124);
				greaterNode();
				}
				break;
			case 4:
				{
				setState(125);
				match(BOOL);
				}
				break;
			}
			setState(128);
			match(T__6);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(129);
				bracketNode();
				}
				break;
			case 2:
				{
				setState(130);
				notNode();
				}
				break;
			case 3:
				{
				setState(131);
				greaterNode();
				}
				break;
			case 4:
				{
				setState(132);
				match(BOOL);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndNodeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andNode);
					setState(135);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(136);
					match(T__6);
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(137);
						bracketNode();
						}
						break;
					case 2:
						{
						setState(138);
						notNode();
						}
						break;
					case 3:
						{
						setState(139);
						greaterNode();
						}
						break;
					case 4:
						{
						setState(140);
						match(BOOL);
						}
						break;
					}
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AexprContext extends ParserRuleContext {
		public BracketNodeContext bracketNode() {
			return getRuleContext(BracketNodeContext.class,0);
		}
		public DivNodeContext divNode() {
			return getRuleContext(DivNodeContext.class,0);
		}
		public PlusNodeContext plusNode() {
			return getRuleContext(PlusNodeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(BonusParser.NUMBER, 0); }
		public TerminalNode VAR() { return getToken(BonusParser.VAR, 0); }
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitAexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aexpr);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				bracketNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				divNode(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				plusNode(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(VAR);
				}
				break;
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

	public static class BexprContext extends ParserRuleContext {
		public BracketNodeContext bracketNode() {
			return getRuleContext(BracketNodeContext.class,0);
		}
		public AndNodeContext andNode() {
			return getRuleContext(AndNodeContext.class,0);
		}
		public NotNodeContext notNode() {
			return getRuleContext(NotNodeContext.class,0);
		}
		public GreaterNodeContext greaterNode() {
			return getRuleContext(GreaterNodeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(BonusParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(BonusParser.BOOL, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitBexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bexpr);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				bracketNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				andNode(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				notNode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				greaterNode();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(VAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(BOOL);
				}
				break;
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

	public static class SeqNodeContext extends ParserRuleContext {
		public List<AssigNodeContext> assigNode() {
			return getRuleContexts(AssigNodeContext.class);
		}
		public AssigNodeContext assigNode(int i) {
			return getRuleContext(AssigNodeContext.class,i);
		}
		public List<IfNodeContext> ifNode() {
			return getRuleContexts(IfNodeContext.class);
		}
		public IfNodeContext ifNode(int i) {
			return getRuleContext(IfNodeContext.class,i);
		}
		public List<WhileNodeContext> whileNode() {
			return getRuleContexts(WhileNodeContext.class);
		}
		public WhileNodeContext whileNode(int i) {
			return getRuleContext(WhileNodeContext.class,i);
		}
		public SeqNodeContext seqNode() {
			return getRuleContext(SeqNodeContext.class,0);
		}
		public SeqNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterSeqNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitSeqNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitSeqNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqNodeContext seqNode() throws RecognitionException {
		SeqNodeContext _localctx = new SeqNodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seqNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(163);
				assigNode();
				}
				break;
			case T__11:
				{
				setState(164);
				ifNode();
				}
				break;
			case T__13:
				{
				setState(165);
				whileNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(168);
				seqNode();
				}
				break;
			case 2:
				{
				setState(169);
				assigNode();
				}
				break;
			case 3:
				{
				setState(170);
				ifNode();
				}
				break;
			case 4:
				{
				setState(171);
				whileNode();
				}
				break;
			}
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

	public static class BlockNodeContext extends ParserRuleContext {
		public AssigNodeContext assigNode() {
			return getRuleContext(AssigNodeContext.class,0);
		}
		public IfNodeContext ifNode() {
			return getRuleContext(IfNodeContext.class,0);
		}
		public WhileNodeContext whileNode() {
			return getRuleContext(WhileNodeContext.class,0);
		}
		public List<SeqNodeContext> seqNode() {
			return getRuleContexts(SeqNodeContext.class);
		}
		public SeqNodeContext seqNode(int i) {
			return getRuleContext(SeqNodeContext.class,i);
		}
		public BlockNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNodeContext blockNode() throws RecognitionException {
		BlockNodeContext _localctx = new BlockNodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__7);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(175);
				assigNode();
				}
				break;
			case 2:
				{
				setState(176);
				ifNode();
				}
				break;
			case 3:
				{
				setState(177);
				whileNode();
				}
				break;
			case 4:
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << VAR))) != 0)) {
					{
					{
					setState(178);
					seqNode();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(186);
			match(T__8);
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

	public static class AssigNodeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BonusParser.VAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public AssigNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterAssigNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitAssigNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitAssigNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigNodeContext assigNode() throws RecognitionException {
		AssigNodeContext _localctx = new AssigNodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(VAR);
			setState(189);
			match(T__9);
			setState(190);
			aexpr();
			setState(191);
			match(T__10);
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

	public static class IfNodeContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<BlockNodeContext> blockNode() {
			return getRuleContexts(BlockNodeContext.class);
		}
		public BlockNodeContext blockNode(int i) {
			return getRuleContext(BlockNodeContext.class,i);
		}
		public IfNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterIfNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitIfNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitIfNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNodeContext ifNode() throws RecognitionException {
		IfNodeContext _localctx = new IfNodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__11);
			setState(194);
			bexpr();
			setState(195);
			blockNode();
			setState(196);
			match(T__12);
			setState(197);
			blockNode();
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

	public static class WhileNodeContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockNodeContext blockNode() {
			return getRuleContext(BlockNodeContext.class,0);
		}
		public WhileNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).enterWhileNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BonusListener ) ((BonusListener)listener).exitWhileNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BonusVisitor ) return ((BonusVisitor<? extends T>)visitor).visitWhileNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileNodeContext whileNode() throws RecognitionException {
		WhileNodeContext _localctx = new WhileNodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__13);
			setState(200);
			bexpr();
			setState(201);
			blockNode();
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
		case 3:
			return divNode_sempred((DivNodeContext)_localctx, predIndex);
		case 4:
			return plusNode_sempred((PlusNodeContext)_localctx, predIndex);
		case 7:
			return andNode_sempred((AndNodeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean divNode_sempred(DivNodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean plusNode_sempred(PlusNodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andNode_sempred(AndNodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\5\5E\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\7\5O\n\5\f\5\16\5R\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6h\n\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"w\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\7\t\u0092\n\t\f"+
		"\t\16\t\u0095\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\3\f\5\f\u00a9\n\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r"+
		"\5\r\u00bb\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\2\5\b\n\20\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\2\2\u00f4\2 \3\2\2\2\4.\3\2\2\2\68\3\2\2\2\b:\3\2\2"+
		"\2\nS\3\2\2\2\fn\3\2\2\2\16v\3\2\2\2\20{\3\2\2\2\22\u009b\3\2\2\2\24\u00a3"+
		"\3\2\2\2\26\u00a8\3\2\2\2\30\u00b0\3\2\2\2\32\u00be\3\2\2\2\34\u00c3\3"+
		"\2\2\2\36\u00c9\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"#\5\26\f\2#$\7\2\2\3$/\3"+
		"\2\2\2%&\5\32\16\2&\'\7\2\2\3\'/\3\2\2\2()\5\34\17\2)*\7\2\2\3*/\3\2\2"+
		"\2+,\5\36\20\2,-\7\2\2\3-/\3\2\2\2.\"\3\2\2\2.%\3\2\2\2.(\3\2\2\2.+\3"+
		"\2\2\2/\5\3\2\2\2\60\61\7\3\2\2\61\62\5\22\n\2\62\63\7\4\2\2\639\3\2\2"+
		"\2\64\65\7\3\2\2\65\66\5\24\13\2\66\67\7\4\2\2\679\3\2\2\28\60\3\2\2\2"+
		"8\64\3\2\2\29\7\3\2\2\2:>\b\5\1\2;?\5\6\4\2<?\7\22\2\2=?\7\23\2\2>;\3"+
		"\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@D\7\5\2\2AE\5\6\4\2BE\7\22\2\2CE"+
		"\7\23\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2EP\3\2\2\2FG\f\4\2\2GL\7\5\2\2"+
		"HM\5\6\4\2IM\5\b\5\2JM\7\22\2\2KM\7\23\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2"+
		"\2LK\3\2\2\2MO\3\2\2\2NF\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2"+
		"\2\2RP\3\2\2\2SX\b\6\1\2TY\5\6\4\2UY\5\b\5\2VY\7\22\2\2WY\7\23\2\2XT\3"+
		"\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z_\7\6\2\2[`\5\6\4\2\\`"+
		"\5\b\5\2]`\7\22\2\2^`\7\23\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2"+
		"\2`k\3\2\2\2ab\f\4\2\2bg\7\6\2\2ch\5\6\4\2dh\5\b\5\2eh\7\22\2\2fh\7\23"+
		"\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hj\3\2\2\2ia\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2no\7\7\2\2op\5\24\13\2p"+
		"\r\3\2\2\2qw\7\23\2\2rw\7\22\2\2sw\5\6\4\2tw\5\n\6\2uw\5\b\5\2vq\3\2\2"+
		"\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\7\b\2\2yz\5\22"+
		"\n\2z\17\3\2\2\2{\u0080\b\t\1\2|\u0081\5\6\4\2}\u0081\5\f\7\2~\u0081\5"+
		"\16\b\2\177\u0081\7\21\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\7\t\2\2\u0083\u0088"+
		"\5\6\4\2\u0084\u0088\5\f\7\2\u0085\u0088\5\16\b\2\u0086\u0088\7\21\2\2"+
		"\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0093\3\2\2\2\u0089\u008a\f\4\2\2\u008a\u008f\7\t\2\2\u008b"+
		"\u0090\5\6\4\2\u008c\u0090\5\f\7\2\u008d\u0090\5\16\b\2\u008e\u0090\7"+
		"\21\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0089\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u009c\5\6\4\2\u0097\u009c\5\b\5\2\u0098\u009c\5\n\6\2\u0099"+
		"\u009c\7\23\2\2\u009a\u009c\7\22\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3"+
		"\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\23\3\2\2\2\u009d\u00a4\5\6\4\2\u009e\u00a4\5\20\t\2\u009f\u00a4\5\f\7"+
		"\2\u00a0\u00a4\5\16\b\2\u00a1\u00a4\7\22\2\2\u00a2\u00a4\7\21\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a9"+
		"\5\32\16\2\u00a6\u00a9\5\34\17\2\u00a7\u00a9\5\36\20\2\u00a8\u00a5\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa"+
		"\u00af\5\26\f\2\u00ab\u00af\5\32\16\2\u00ac\u00af\5\34\17\2\u00ad\u00af"+
		"\5\36\20\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00ba\7\n\2\2\u00b1\u00bb"+
		"\5\32\16\2\u00b2\u00bb\5\34\17\2\u00b3\u00bb\5\36\20\2\u00b4\u00b6\5\26"+
		"\f\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b1\3\2"+
		"\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\7\13\2\2\u00bd\31\3\2\2\2\u00be\u00bf\7\22"+
		"\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7\r\2\2\u00c2"+
		"\33\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\5\30"+
		"\r\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5\30\r\2\u00c8\35\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\5\30\r\2\u00cc\37\3"+
		"\2\2\2\27.8>DLPX_gkv\u0080\u0087\u008f\u0093\u009b\u00a3\u00a8\u00ae\u00b7"+
		"\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}