// Generated from sov.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sovParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAM=2, VAR=3, PRINTLN=4, READ_SOV=5, ABS_FUN=6, SIN_FUN=7, 
		COS_FUN=8, SQRT_FUN=9, POW_FUN=10, PLUS=11, MINUS=12, MULT=13, DIV=14, 
		AND=15, OR=16, NOT=17, GT=18, LT=19, GEQ=20, LEQ=21, EQ=22, NEQ=23, ASSIGN=24, 
		COMA=25, BRACKET_OPEN=26, BRACKET_CLOSE=27, PAR_OPEN=28, PAR_CLOSE=29, 
		SEMICOLON=30, COMMENTSTART=31, NUMBER_NAT=32, STRING=33, NUMERIC_TYPE=34, 
		BOOLEAN_TYPE=35, STRING_TYPE=36, FOR_SOV=37, WHILE_SOV=38, IF_SOV=39, 
		ELSIF_SOV=40, ELSE_SOV=41, TRUE_LITERAL=42, FALSE_LITERAL=43, CONST_SOV=44, 
		ID=45, WS=46, COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_r = 0, RULE_sov = 1, RULE_sentence = 2, RULE_funcionesmat = 3, RULE_condicion = 4, 
		RULE_operaciones = 5, RULE_numeric_declaration = 6, RULE_numeric_assign = 7, 
		RULE_print = 8, RULE_inCaseOf = 9, RULE_otherwise = 10, RULE_declaration = 11, 
		RULE_booleanassign = 12, RULE_booleandeclaration = 13, RULE_string_assign = 14, 
		RULE_loopwhile = 15, RULE_read = 16, RULE_doubleoperator = 17, RULE_fromTo = 18;
	public static final String[] ruleNames = {
		"r", "sov", "sentence", "funcionesmat", "condicion", "operaciones", "numeric_declaration", 
		"numeric_assign", "print", "inCaseOf", "otherwise", "declaration", "booleanassign", 
		"booleandeclaration", "string_assign", "loopwhile", "read", "doubleoperator", 
		"fromTo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", "'sov'", "'type'", "'show'", "'reader'", "'absolute'", 
		"'sin'", "'cos'", "'squareRoot'", "'elevated'", "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"','", "'{'", "'}'", "'('", "')'", "';'", "'//'", null, null, "'numeric'", 
		"'logic'", "'chain'", "'fromTo'", "'asLongAs'", "'inCaseOf'", "'inCaseOfAnother'", 
		"'otherWise'", "'valid'", "'invalid'", "'const'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PROGRAM", "VAR", "PRINTLN", "READ_SOV", "ABS_FUN", "SIN_FUN", 
		"COS_FUN", "SQRT_FUN", "POW_FUN", "PLUS", "MINUS", "MULT", "DIV", "AND", 
		"OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "COMA", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
		"COMMENTSTART", "NUMBER_NAT", "STRING", "NUMERIC_TYPE", "BOOLEAN_TYPE", 
		"STRING_TYPE", "FOR_SOV", "WHILE_SOV", "IF_SOV", "ELSIF_SOV", "ELSE_SOV", 
		"TRUE_LITERAL", "FALSE_LITERAL", "CONST_SOV", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "sov.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sovParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(ID);
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

	public static class SovContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(sovParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(sovParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(sovParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterSov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitSov(this);
		}
	}

	public final SovContext sov() throws RecognitionException {
		SovContext _localctx = new SovContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sov);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PROGRAM);
			setState(42);
			match(ID);
			setState(43);
			match(BRACKET_OPEN);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << READ_SOV) | (1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN) | (1L << NUMBER_NAT) | (1L << NUMERIC_TYPE) | (1L << BOOLEAN_TYPE) | (1L << FOR_SOV) | (1L << WHILE_SOV) | (1L << IF_SOV) | (1L << ELSIF_SOV) | (1L << ELSE_SOV) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				sentence();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(BRACKET_CLOSE);
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

	public static class SentenceContext extends ParserRuleContext {
		public Numeric_assignContext numeric_assign() {
			return getRuleContext(Numeric_assignContext.class,0);
		}
		public Numeric_declarationContext numeric_declaration() {
			return getRuleContext(Numeric_declarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BooleanassignContext booleanassign() {
			return getRuleContext(BooleanassignContext.class,0);
		}
		public BooleandeclarationContext booleandeclaration() {
			return getRuleContext(BooleandeclarationContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LoopwhileContext loopwhile() {
			return getRuleContext(LoopwhileContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public FuncionesmatContext funcionesmat() {
			return getRuleContext(FuncionesmatContext.class,0);
		}
		public FromToContext fromTo() {
			return getRuleContext(FromToContext.class,0);
		}
		public String_assignContext string_assign() {
			return getRuleContext(String_assignContext.class,0);
		}
		public InCaseOfContext inCaseOf() {
			return getRuleContext(InCaseOfContext.class,0);
		}
		public OtherwiseContext otherwise() {
			return getRuleContext(OtherwiseContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				numeric_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				numeric_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				booleanassign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				booleandeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				operaciones();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				condicion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				print();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				loopwhile();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(62);
				funcionesmat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(63);
				fromTo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(64);
				string_assign();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(65);
				inCaseOf();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(66);
				otherwise();
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

	public static class FuncionesmatContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode ABS_FUN() { return getToken(sovParser.ABS_FUN, 0); }
		public TerminalNode SIN_FUN() { return getToken(sovParser.SIN_FUN, 0); }
		public TerminalNode COS_FUN() { return getToken(sovParser.COS_FUN, 0); }
		public TerminalNode SQRT_FUN() { return getToken(sovParser.SQRT_FUN, 0); }
		public TerminalNode POW_FUN() { return getToken(sovParser.POW_FUN, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode NUMBER_NAT() { return getToken(sovParser.NUMBER_NAT, 0); }
		public FuncionesmatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionesmat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterFuncionesmat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitFuncionesmat(this);
		}
	}

	public final FuncionesmatContext funcionesmat() throws RecognitionException {
		FuncionesmatContext _localctx = new FuncionesmatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcionesmat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(PAR_OPEN);
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_NAT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			match(PAR_CLOSE);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sovParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sovParser.ID, i);
		}
		public List<TerminalNode> NUMBER_NAT() { return getTokens(sovParser.NUMBER_NAT); }
		public TerminalNode NUMBER_NAT(int i) {
			return getToken(sovParser.NUMBER_NAT, i);
		}
		public List<TerminalNode> TRUE_LITERAL() { return getTokens(sovParser.TRUE_LITERAL); }
		public TerminalNode TRUE_LITERAL(int i) {
			return getToken(sovParser.TRUE_LITERAL, i);
		}
		public List<TerminalNode> FALSE_LITERAL() { return getTokens(sovParser.FALSE_LITERAL); }
		public TerminalNode FALSE_LITERAL(int i) {
			return getToken(sovParser.FALSE_LITERAL, i);
		}
		public TerminalNode EQ() { return getToken(sovParser.EQ, 0); }
		public TerminalNode GT() { return getToken(sovParser.GT, 0); }
		public TerminalNode LT() { return getToken(sovParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(sovParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(sovParser.LEQ, 0); }
		public TerminalNode NEQ() { return getToken(sovParser.NEQ, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_NAT) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_NAT) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(sovParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(sovParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sovParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER_NAT() { return getTokens(sovParser.NUMBER_NAT); }
		public TerminalNode NUMBER_NAT(int i) {
			return getToken(sovParser.NUMBER_NAT, i);
		}
		public TerminalNode PLUS() { return getToken(sovParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sovParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(sovParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(sovParser.DIV, 0); }
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitOperaciones(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_NAT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			match(ASSIGN);
			setState(80);
			match(ID);
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_NAT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(SEMICOLON);
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

	public static class Numeric_declarationContext extends ParserRuleContext {
		public TerminalNode NUMERIC_TYPE() { return getToken(sovParser.NUMERIC_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(sovParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sovParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(sovParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(sovParser.ASSIGN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(sovParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sovParser.COMA, i);
		}
		public List<TerminalNode> NUMBER_NAT() { return getTokens(sovParser.NUMBER_NAT); }
		public TerminalNode NUMBER_NAT(int i) {
			return getToken(sovParser.NUMBER_NAT, i);
		}
		public List<FuncionesmatContext> funcionesmat() {
			return getRuleContexts(FuncionesmatContext.class);
		}
		public FuncionesmatContext funcionesmat(int i) {
			return getRuleContext(FuncionesmatContext.class,i);
		}
		public Numeric_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterNumeric_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitNumeric_declaration(this);
		}
	}

	public final Numeric_declarationContext numeric_declaration() throws RecognitionException {
		Numeric_declarationContext _localctx = new Numeric_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numeric_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(NUMERIC_TYPE);
			setState(86);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(87);
				match(ASSIGN);
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_NAT:
					{
					setState(88);
					match(NUMBER_NAT);
					}
					break;
				case ABS_FUN:
				case SIN_FUN:
				case COS_FUN:
				case SQRT_FUN:
				case POW_FUN:
					{
					setState(89);
					funcionesmat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(92);
					match(COMA);
					setState(93);
					match(ID);
					setState(94);
					match(ASSIGN);
					setState(97);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMBER_NAT:
						{
						setState(95);
						match(NUMBER_NAT);
						}
						break;
					case ABS_FUN:
					case SIN_FUN:
					case COS_FUN:
					case SQRT_FUN:
					case POW_FUN:
						{
						setState(96);
						funcionesmat();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case COMA:
			case SEMICOLON:
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(104);
					match(COMA);
					setState(105);
					match(ID);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(SEMICOLON);
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

	public static class Numeric_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(sovParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode NUMBER_NAT() { return getToken(sovParser.NUMBER_NAT, 0); }
		public FuncionesmatContext funcionesmat() {
			return getRuleContext(FuncionesmatContext.class,0);
		}
		public Numeric_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterNumeric_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitNumeric_assign(this);
		}
	}

	public final Numeric_assignContext numeric_assign() throws RecognitionException {
		Numeric_assignContext _localctx = new Numeric_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(ASSIGN);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_NAT:
				{
				setState(117);
				match(NUMBER_NAT);
				}
				break;
			case ABS_FUN:
			case SIN_FUN:
			case COS_FUN:
			case SQRT_FUN:
			case POW_FUN:
				{
				setState(118);
				funcionesmat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			match(SEMICOLON);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(sovParser.PRINTLN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode NUMBER_NAT() { return getToken(sovParser.NUMBER_NAT, 0); }
		public TerminalNode STRING() { return getToken(sovParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PRINTLN);
			setState(124);
			match(PAR_OPEN);
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_NAT) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(PAR_CLOSE);
			setState(127);
			match(SEMICOLON);
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

	public static class InCaseOfContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(sovParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(sovParser.BRACKET_CLOSE, 0); }
		public TerminalNode IF_SOV() { return getToken(sovParser.IF_SOV, 0); }
		public TerminalNode ELSIF_SOV() { return getToken(sovParser.ELSIF_SOV, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public InCaseOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inCaseOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterInCaseOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitInCaseOf(this);
		}
	}

	public final InCaseOfContext inCaseOf() throws RecognitionException {
		InCaseOfContext _localctx = new InCaseOfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inCaseOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==IF_SOV || _la==ELSIF_SOV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			match(PAR_OPEN);
			setState(131);
			condicion();
			setState(132);
			match(PAR_CLOSE);
			setState(133);
			match(BRACKET_OPEN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << READ_SOV) | (1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN) | (1L << NUMBER_NAT) | (1L << NUMERIC_TYPE) | (1L << BOOLEAN_TYPE) | (1L << FOR_SOV) | (1L << WHILE_SOV) | (1L << IF_SOV) | (1L << ELSIF_SOV) | (1L << ELSE_SOV) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(134);
				sentence();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(BRACKET_CLOSE);
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

	public static class OtherwiseContext extends ParserRuleContext {
		public TerminalNode ELSE_SOV() { return getToken(sovParser.ELSE_SOV, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(sovParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(sovParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public OtherwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterOtherwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitOtherwise(this);
		}
	}

	public final OtherwiseContext otherwise() throws RecognitionException {
		OtherwiseContext _localctx = new OtherwiseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_otherwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ELSE_SOV);
			setState(143);
			match(BRACKET_OPEN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << READ_SOV) | (1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN) | (1L << NUMBER_NAT) | (1L << NUMERIC_TYPE) | (1L << BOOLEAN_TYPE) | (1L << FOR_SOV) | (1L << WHILE_SOV) | (1L << IF_SOV) | (1L << ELSIF_SOV) | (1L << ELSE_SOV) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(144);
				sentence();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(BRACKET_CLOSE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sovParser.VAR, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(VAR);
			setState(153);
			match(ID);
			setState(154);
			match(SEMICOLON);
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

	public static class BooleanassignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(sovParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode TRUE_LITERAL() { return getToken(sovParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(sovParser.FALSE_LITERAL, 0); }
		public BooleanassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterBooleanassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitBooleanassign(this);
		}
	}

	public final BooleanassignContext booleanassign() throws RecognitionException {
		BooleanassignContext _localctx = new BooleanassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(ASSIGN);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==TRUE_LITERAL || _la==FALSE_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(SEMICOLON);
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

	public static class BooleandeclarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_TYPE() { return getToken(sovParser.BOOLEAN_TYPE, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(sovParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode TRUE_LITERAL() { return getToken(sovParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(sovParser.FALSE_LITERAL, 0); }
		public BooleandeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleandeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterBooleandeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitBooleandeclaration(this);
		}
	}

	public final BooleandeclarationContext booleandeclaration() throws RecognitionException {
		BooleandeclarationContext _localctx = new BooleandeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleandeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(BOOLEAN_TYPE);
			setState(162);
			match(ID);
			setState(163);
			match(ASSIGN);
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==TRUE_LITERAL || _la==FALSE_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			match(SEMICOLON);
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

	public static class String_assignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sovParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sovParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(sovParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(sovParser.STRING, 0); }
		public String_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterString_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitString_assign(this);
		}
	}

	public final String_assignContext string_assign() throws RecognitionException {
		String_assignContext _localctx = new String_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(ASSIGN);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			match(SEMICOLON);
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

	public static class LoopwhileContext extends ParserRuleContext {
		public TerminalNode WHILE_SOV() { return getToken(sovParser.WHILE_SOV, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(sovParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(sovParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public LoopwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterLoopwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitLoopwhile(this);
		}
	}

	public final LoopwhileContext loopwhile() throws RecognitionException {
		LoopwhileContext _localctx = new LoopwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE_SOV);
			setState(173);
			match(PAR_OPEN);
			setState(174);
			condicion();
			setState(175);
			match(PAR_CLOSE);
			setState(176);
			match(BRACKET_OPEN);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << READ_SOV) | (1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN) | (1L << NUMBER_NAT) | (1L << NUMERIC_TYPE) | (1L << BOOLEAN_TYPE) | (1L << FOR_SOV) | (1L << WHILE_SOV) | (1L << IF_SOV) | (1L << ELSIF_SOV) | (1L << ELSE_SOV) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(177);
				sentence();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(BRACKET_CLOSE);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ_SOV() { return getToken(sovParser.READ_SOV, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(READ_SOV);
			setState(186);
			match(PAR_OPEN);
			setState(187);
			match(ID);
			setState(188);
			match(PAR_CLOSE);
			setState(189);
			match(SEMICOLON);
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

	public static class DoubleoperatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sovParser.ID, 0); }
		public TerminalNode NUMBER_NAT() { return getToken(sovParser.NUMBER_NAT, 0); }
		public List<TerminalNode> PLUS() { return getTokens(sovParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(sovParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(sovParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(sovParser.MINUS, i);
		}
		public DoubleoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterDoubleoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitDoubleoperator(this);
		}
	}

	public final DoubleoperatorContext doubleoperator() throws RecognitionException {
		DoubleoperatorContext _localctx = new DoubleoperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doubleoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_NAT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(192);
				match(PLUS);
				setState(193);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(194);
				match(MINUS);
				setState(195);
				match(MINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FromToContext extends ParserRuleContext {
		public TerminalNode FOR_SOV() { return getToken(sovParser.FOR_SOV, 0); }
		public TerminalNode PAR_OPEN() { return getToken(sovParser.PAR_OPEN, 0); }
		public Numeric_declarationContext numeric_declaration() {
			return getRuleContext(Numeric_declarationContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(sovParser.SEMICOLON, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(sovParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(sovParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(sovParser.BRACKET_CLOSE, 0); }
		public DoubleoperatorContext doubleoperator() {
			return getRuleContext(DoubleoperatorContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FromToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).enterFromTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sovListener ) ((sovListener)listener).exitFromTo(this);
		}
	}

	public final FromToContext fromTo() throws RecognitionException {
		FromToContext _localctx = new FromToContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fromTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(FOR_SOV);
			setState(199);
			match(PAR_OPEN);
			setState(200);
			numeric_declaration();
			setState(201);
			condicion();
			setState(202);
			match(SEMICOLON);
			{
			setState(203);
			doubleoperator();
			}
			setState(204);
			match(PAR_CLOSE);
			setState(205);
			match(BRACKET_OPEN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << READ_SOV) | (1L << ABS_FUN) | (1L << SIN_FUN) | (1L << COS_FUN) | (1L << SQRT_FUN) | (1L << POW_FUN) | (1L << NUMBER_NAT) | (1L << NUMERIC_TYPE) | (1L << BOOLEAN_TYPE) | (1L << FOR_SOV) | (1L << WHILE_SOV) | (1L << IF_SOV) | (1L << ELSIF_SOV) | (1L << ELSE_SOV) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(206);
				sentence();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(BRACKET_CLOSE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\7\b"+
		"f\n\b\f\b\16\bi\13\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5\br\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d2"+
		"\n\24\f\24\16\24\u00d5\13\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\13\3\2\b\f\4\2\"\"//\5\2\"\",-//\3\2\24\31\3"+
		"\2\r\20\4\2\"#//\3\2)*\3\2,-\4\2##//\u00df\2(\3\2\2\2\4+\3\2\2\2\6E\3"+
		"\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16W\3\2\2\2\20u\3\2\2\2\22}\3"+
		"\2\2\2\24\u0083\3\2\2\2\26\u0090\3\2\2\2\30\u009a\3\2\2\2\32\u009e\3\2"+
		"\2\2\34\u00a3\3\2\2\2\36\u00a9\3\2\2\2 \u00ae\3\2\2\2\"\u00bb\3\2\2\2"+
		"$\u00c1\3\2\2\2&\u00c8\3\2\2\2()\7\3\2\2)*\7/\2\2*\3\3\2\2\2+,\7\4\2\2"+
		",-\7/\2\2-\61\7\34\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\35\2\2\65\5\3\2\2\2"+
		"\66F\5\20\t\2\67F\5\16\b\28F\5\30\r\29F\5\32\16\2:F\5\34\17\2;F\5\f\7"+
		"\2<F\5\n\6\2=F\5\22\n\2>F\5 \21\2?F\5\"\22\2@F\5\b\5\2AF\5&\24\2BF\5\36"+
		"\20\2CF\5\24\13\2DF\5\26\f\2E\66\3\2\2\2E\67\3\2\2\2E8\3\2\2\2E9\3\2\2"+
		"\2E:\3\2\2\2E;\3\2\2\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2"+
		"\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\t\2\2\2HI\7\36"+
		"\2\2IJ\t\3\2\2JK\7\37\2\2K\t\3\2\2\2LM\t\4\2\2MN\t\5\2\2NO\t\4\2\2O\13"+
		"\3\2\2\2PQ\t\3\2\2QR\7\32\2\2RS\7/\2\2ST\t\6\2\2TU\t\3\2\2UV\7 \2\2V\r"+
		"\3\2\2\2WX\7$\2\2Xq\7/\2\2Y\\\7\32\2\2Z]\7\"\2\2[]\5\b\5\2\\Z\3\2\2\2"+
		"\\[\3\2\2\2]g\3\2\2\2^_\7\33\2\2_`\7/\2\2`c\7\32\2\2ad\7\"\2\2bd\5\b\5"+
		"\2ca\3\2\2\2cb\3\2\2\2df\3\2\2\2e^\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hr\3\2\2\2ig\3\2\2\2jk\7\33\2\2km\7/\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qY\3\2\2\2qn\3\2\2\2rs\3\2\2\2st\7 \2"+
		"\2t\17\3\2\2\2uv\7/\2\2vy\7\32\2\2wz\7\"\2\2xz\5\b\5\2yw\3\2\2\2yx\3\2"+
		"\2\2z{\3\2\2\2{|\7 \2\2|\21\3\2\2\2}~\7\6\2\2~\177\7\36\2\2\177\u0080"+
		"\t\7\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7 \2\2\u0082\23\3\2\2\2\u0083"+
		"\u0084\t\b\2\2\u0084\u0085\7\36\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7"+
		"\37\2\2\u0087\u008b\7\34\2\2\u0088\u008a\5\6\4\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\35\2\2\u008f\25\3\2\2\2\u0090\u0091"+
		"\7+\2\2\u0091\u0095\7\34\2\2\u0092\u0094\5\6\4\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\35\2\2\u0099\27\3\2\2\2\u009a\u009b"+
		"\7\5\2\2\u009b\u009c\7/\2\2\u009c\u009d\7 \2\2\u009d\31\3\2\2\2\u009e"+
		"\u009f\7/\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\t\t\2\2\u00a1\u00a2\7 "+
		"\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7%\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6"+
		"\7\32\2\2\u00a6\u00a7\t\t\2\2\u00a7\u00a8\7 \2\2\u00a8\35\3\2\2\2\u00a9"+
		"\u00aa\7/\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad\7 "+
		"\2\2\u00ad\37\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b1"+
		"\5\n\6\2\u00b1\u00b2\7\37\2\2\u00b2\u00b6\7\34\2\2\u00b3\u00b5\5\6\4\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\35\2\2"+
		"\u00ba!\3\2\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00bd\7\36\2\2\u00bd\u00be\7"+
		"/\2\2\u00be\u00bf\7\37\2\2\u00bf\u00c0\7 \2\2\u00c0#\3\2\2\2\u00c1\u00c6"+
		"\t\3\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c7\7\r\2\2\u00c4\u00c5\7\16\2\2"+
		"\u00c5\u00c7\7\16\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7%\3"+
		"\2\2\2\u00c8\u00c9\7\'\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cb\5\16\b\2\u00cb"+
		"\u00cc\5\n\6\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7\37"+
		"\2\2\u00cf\u00d3\7\34\2\2\u00d0\u00d2\5\6\4\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\'\3\2\2\2\17\61E\\"+
		"cgnqy\u008b\u0095\u00b6\u00c6\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}