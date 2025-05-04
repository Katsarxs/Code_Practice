// Generated from Cooker.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CookerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WHOLEWITHFRACTION=7, INT=8, 
		DIGIT=9, TIMEUNIT=10, VERB=11, UNIT=12, TEXT=13, NEWLINE=14, WS=15, COMMENT=16;
	public static final int
		RULE_parse = 0, RULE_title = 1, RULE_titleName = 2, RULE_preparationTime = 3, 
		RULE_preparationTimeNumber = 4, RULE_preparationTimeUnit = 5, RULE_cookingTime = 6, 
		RULE_cookingTimeNumber = 7, RULE_cookingTimeUnit = 8, RULE_servings = 9, 
		RULE_servingsNumber = 10, RULE_ingredients = 11, RULE_ingredient = 12, 
		RULE_quantity = 13, RULE_ingredientUnit = 14, RULE_ingredientName = 15, 
		RULE_instructions = 16, RULE_instruction = 17, RULE_instructionVerb = 18, 
		RULE_instructionText = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "title", "titleName", "preparationTime", "preparationTimeNumber", 
			"preparationTimeUnit", "cookingTime", "cookingTimeNumber", "cookingTimeUnit", 
			"servings", "servingsNumber", "ingredients", "ingredient", "quantity", 
			"ingredientUnit", "ingredientName", "instructions", "instruction", "instructionVerb", 
			"instructionText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Title:'", "'Preparation Time:'", "'Cooking Time:'", "'Servings:'", 
			"'Ingredients:'", "'Instructions:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WHOLEWITHFRACTION", "INT", 
			"DIGIT", "TIMEUNIT", "VERB", "UNIT", "TEXT", "NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Cooker.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CookerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public PreparationTimeContext preparationTime() {
			return getRuleContext(PreparationTimeContext.class,0);
		}
		public ServingsContext servings() {
			return getRuleContext(ServingsContext.class,0);
		}
		public IngredientsContext ingredients() {
			return getRuleContext(IngredientsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public CookingTimeContext cookingTime() {
			return getRuleContext(CookingTimeContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			title();
			setState(41);
			preparationTime();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(42);
				cookingTime();
				}
			}

			setState(45);
			servings();
			setState(46);
			ingredients();
			setState(47);
			instructions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TitleNameContext titleName() {
			return getRuleContext(TitleNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CookerParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			titleName();
			setState(51);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleNameContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(CookerParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CookerParser.TEXT, i);
		}
		public TitleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterTitleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitTitleName(this);
		}
	}

	public final TitleNameContext titleName() throws RecognitionException {
		TitleNameContext _localctx = new TitleNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(53);
				match(TEXT);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreparationTimeContext extends ParserRuleContext {
		public PreparationTimeNumberContext preparationTimeNumber() {
			return getRuleContext(PreparationTimeNumberContext.class,0);
		}
		public PreparationTimeUnitContext preparationTimeUnit() {
			return getRuleContext(PreparationTimeUnitContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CookerParser.NEWLINE, 0); }
		public PreparationTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparationTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterPreparationTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitPreparationTime(this);
		}
	}

	public final PreparationTimeContext preparationTime() throws RecognitionException {
		PreparationTimeContext _localctx = new PreparationTimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preparationTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(60);
			preparationTimeNumber();
			setState(61);
			preparationTimeUnit();
			setState(62);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreparationTimeNumberContext extends ParserRuleContext {
		public List<TerminalNode> WHOLEWITHFRACTION() { return getTokens(CookerParser.WHOLEWITHFRACTION); }
		public TerminalNode WHOLEWITHFRACTION(int i) {
			return getToken(CookerParser.WHOLEWITHFRACTION, i);
		}
		public PreparationTimeNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparationTimeNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterPreparationTimeNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitPreparationTimeNumber(this);
		}
	}

	public final PreparationTimeNumberContext preparationTimeNumber() throws RecognitionException {
		PreparationTimeNumberContext _localctx = new PreparationTimeNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preparationTimeNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				match(WHOLEWITHFRACTION);
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHOLEWITHFRACTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreparationTimeUnitContext extends ParserRuleContext {
		public TerminalNode TIMEUNIT() { return getToken(CookerParser.TIMEUNIT, 0); }
		public PreparationTimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparationTimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterPreparationTimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitPreparationTimeUnit(this);
		}
	}

	public final PreparationTimeUnitContext preparationTimeUnit() throws RecognitionException {
		PreparationTimeUnitContext _localctx = new PreparationTimeUnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preparationTimeUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TIMEUNIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CookingTimeContext extends ParserRuleContext {
		public CookingTimeNumberContext cookingTimeNumber() {
			return getRuleContext(CookingTimeNumberContext.class,0);
		}
		public CookingTimeUnitContext cookingTimeUnit() {
			return getRuleContext(CookingTimeUnitContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CookerParser.NEWLINE, 0); }
		public CookingTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookingTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterCookingTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitCookingTime(this);
		}
	}

	public final CookingTimeContext cookingTime() throws RecognitionException {
		CookingTimeContext _localctx = new CookingTimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cookingTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__2);
			setState(72);
			cookingTimeNumber();
			setState(73);
			cookingTimeUnit();
			setState(74);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CookingTimeNumberContext extends ParserRuleContext {
		public List<TerminalNode> WHOLEWITHFRACTION() { return getTokens(CookerParser.WHOLEWITHFRACTION); }
		public TerminalNode WHOLEWITHFRACTION(int i) {
			return getToken(CookerParser.WHOLEWITHFRACTION, i);
		}
		public CookingTimeNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookingTimeNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterCookingTimeNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitCookingTimeNumber(this);
		}
	}

	public final CookingTimeNumberContext cookingTimeNumber() throws RecognitionException {
		CookingTimeNumberContext _localctx = new CookingTimeNumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cookingTimeNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(WHOLEWITHFRACTION);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHOLEWITHFRACTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CookingTimeUnitContext extends ParserRuleContext {
		public TerminalNode TIMEUNIT() { return getToken(CookerParser.TIMEUNIT, 0); }
		public CookingTimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookingTimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterCookingTimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitCookingTimeUnit(this);
		}
	}

	public final CookingTimeUnitContext cookingTimeUnit() throws RecognitionException {
		CookingTimeUnitContext _localctx = new CookingTimeUnitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cookingTimeUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TIMEUNIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ServingsContext extends ParserRuleContext {
		public ServingsNumberContext servingsNumber() {
			return getRuleContext(ServingsNumberContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CookerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CookerParser.NEWLINE, i);
		}
		public ServingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_servings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterServings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitServings(this);
		}
	}

	public final ServingsContext servings() throws RecognitionException {
		ServingsContext _localctx = new ServingsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_servings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__3);
			setState(84);
			servingsNumber();
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				match(NEWLINE);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ServingsNumberContext extends ParserRuleContext {
		public TerminalNode WHOLEWITHFRACTION() { return getToken(CookerParser.WHOLEWITHFRACTION, 0); }
		public ServingsNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_servingsNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterServingsNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitServingsNumber(this);
		}
	}

	public final ServingsNumberContext servingsNumber() throws RecognitionException {
		ServingsNumberContext _localctx = new ServingsNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_servingsNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(WHOLEWITHFRACTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CookerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CookerParser.NEWLINE, i);
		}
		public List<IngredientContext> ingredient() {
			return getRuleContexts(IngredientContext.class);
		}
		public IngredientContext ingredient(int i) {
			return getRuleContext(IngredientContext.class,i);
		}
		public IngredientsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredients; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterIngredients(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitIngredients(this);
		}
	}

	public final IngredientsContext ingredients() throws RecognitionException {
		IngredientsContext _localctx = new IngredientsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ingredients);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__4);
			setState(93);
			match(NEWLINE);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				ingredient();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHOLEWITHFRACTION );
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(NEWLINE);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientContext extends ParserRuleContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public IngredientNameContext ingredientName() {
			return getRuleContext(IngredientNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CookerParser.NEWLINE, 0); }
		public IngredientUnitContext ingredientUnit() {
			return getRuleContext(IngredientUnitContext.class,0);
		}
		public IngredientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterIngredient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitIngredient(this);
		}
	}

	public final IngredientContext ingredient() throws RecognitionException {
		IngredientContext _localctx = new IngredientContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ingredient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			quantity();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIT) {
				{
				setState(105);
				ingredientUnit();
				}
			}

			setState(108);
			ingredientName();
			setState(109);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuantityContext extends ParserRuleContext {
		public List<TerminalNode> WHOLEWITHFRACTION() { return getTokens(CookerParser.WHOLEWITHFRACTION); }
		public TerminalNode WHOLEWITHFRACTION(int i) {
			return getToken(CookerParser.WHOLEWITHFRACTION, i);
		}
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_quantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(WHOLEWITHFRACTION);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHOLEWITHFRACTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientUnitContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(CookerParser.UNIT, 0); }
		public IngredientUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterIngredientUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitIngredientUnit(this);
		}
	}

	public final IngredientUnitContext ingredientUnit() throws RecognitionException {
		IngredientUnitContext _localctx = new IngredientUnitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ingredientUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(UNIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientNameContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(CookerParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CookerParser.TEXT, i);
		}
		public IngredientNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterIngredientName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitIngredientName(this);
		}
	}

	public final IngredientNameContext ingredientName() throws RecognitionException {
		IngredientNameContext _localctx = new IngredientNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ingredientName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(118);
				match(TEXT);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CookerParser.NEWLINE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			match(NEWLINE);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				instruction();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VERB );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionVerbContext instructionVerb() {
			return getRuleContext(InstructionVerbContext.class,0);
		}
		public InstructionTextContext instructionText() {
			return getRuleContext(InstructionTextContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CookerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CookerParser.NEWLINE, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			instructionVerb();
			setState(132);
			instructionText();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(133);
				match(NEWLINE);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionVerbContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(CookerParser.VERB, 0); }
		public InstructionVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterInstructionVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitInstructionVerb(this);
		}
	}

	public final InstructionVerbContext instructionVerb() throws RecognitionException {
		InstructionVerbContext _localctx = new InstructionVerbContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instructionVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VERB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(CookerParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CookerParser.TEXT, i);
		}
		public List<TerminalNode> WHOLEWITHFRACTION() { return getTokens(CookerParser.WHOLEWITHFRACTION); }
		public TerminalNode WHOLEWITHFRACTION(int i) {
			return getToken(CookerParser.WHOLEWITHFRACTION, i);
		}
		public List<TerminalNode> UNIT() { return getTokens(CookerParser.UNIT); }
		public TerminalNode UNIT(int i) {
			return getToken(CookerParser.UNIT, i);
		}
		public InstructionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).enterInstructionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookerListener ) ((CookerListener)listener).exitInstructionText(this);
		}
	}

	public final InstructionTextContext instructionText() throws RecognitionException {
		InstructionTextContext _localctx = new InstructionTextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instructionText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000,\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u00027\b"+
		"\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004"+
		"C\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007O\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\tW\b\t\u000b\t\f\tX\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b`\b\u000b\u000b\u000b"+
		"\f\u000ba\u0001\u000b\u0004\u000be\b\u000b\u000b\u000b\f\u000bf\u0001"+
		"\f\u0001\f\u0003\fk\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rq\b\r\u000b"+
		"\r\f\rr\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000fx\b\u000f\n\u000f"+
		"\f\u000f{\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0080"+
		"\b\u0010\u000b\u0010\f\u0010\u0081\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0087\b\u0011\n\u0011\f\u0011\u008a\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0005\u0013\u008f\b\u0013\n\u0013\f\u0013\u0092\t\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0002\u0000"+
		"\u0007\u0007\f\r\u008c\u0000(\u0001\u0000\u0000\u0000\u00021\u0001\u0000"+
		"\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000"+
		"\bA\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fG\u0001\u0000"+
		"\u0000\u0000\u000eM\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000"+
		"\u0012S\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016\\"+
		"\u0001\u0000\u0000\u0000\u0018h\u0001\u0000\u0000\u0000\u001ap\u0001\u0000"+
		"\u0000\u0000\u001ct\u0001\u0000\u0000\u0000\u001ey\u0001\u0000\u0000\u0000"+
		" |\u0001\u0000\u0000\u0000\"\u0083\u0001\u0000\u0000\u0000$\u008b\u0001"+
		"\u0000\u0000\u0000&\u0090\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)+\u0003\u0006\u0003\u0000*,\u0003\f\u0006\u0000+*\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0003\u0012"+
		"\t\u0000./\u0003\u0016\u000b\u0000/0\u0003 \u0010\u00000\u0001\u0001\u0000"+
		"\u0000\u000012\u0005\u0001\u0000\u000023\u0003\u0004\u0002\u000034\u0005"+
		"\u000e\u0000\u00004\u0003\u0001\u0000\u0000\u000057\u0005\r\u0000\u0000"+
		"65\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0002\u0000\u0000<=\u0003\b\u0004\u0000=>\u0003"+
		"\n\u0005\u0000>?\u0005\u000e\u0000\u0000?\u0007\u0001\u0000\u0000\u0000"+
		"@B\u0005\u0007\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\t\u0001\u0000"+
		"\u0000\u0000EF\u0005\n\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0003\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0003\u0010\b\u0000JK\u0005"+
		"\u000e\u0000\u0000K\r\u0001\u0000\u0000\u0000LN\u0005\u0007\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QR\u0005"+
		"\n\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\u0004\u0000\u0000"+
		"TV\u0003\u0014\n\u0000UW\u0005\u000e\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[\u0015"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0005\u0000\u0000]_\u0005\u000e\u0000"+
		"\u0000^`\u0003\u0018\f\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000ce\u0005\u000e\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u0017\u0001\u0000\u0000\u0000hj\u0003\u001a\r\u0000ik\u0003\u001c\u000e"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0003\u001e\u000f\u0000mn\u0005\u000e\u0000\u0000n\u0019"+
		"\u0001\u0000\u0000\u0000oq\u0005\u0007\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000s\u001b\u0001\u0000\u0000\u0000tu\u0005\f\u0000\u0000u\u001d"+
		"\u0001\u0000\u0000\u0000vx\u0005\r\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u001f\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0006\u0000\u0000}\u007f\u0005\u000e\u0000\u0000~\u0080\u0003\"\u0011"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082!\u0001\u0000\u0000\u0000\u0083\u0084\u0003$\u0012\u0000\u0084\u0088"+
		"\u0003&\u0013\u0000\u0085\u0087\u0005\u000e\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089#\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u000b"+
		"\u0000\u0000\u008c%\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0000\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\'\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\r+8COXafjry\u0081\u0088\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}