// Generated from sov.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sovLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "PROGRAM", "VAR", "PRINTLN", "READ_SOV", "ABS_FUN", "SIN_FUN", 
		"COS_FUN", "SQRT_FUN", "POW_FUN", "PLUS", "MINUS", "MULT", "DIV", "AND", 
		"OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "COMA", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
		"COMMENTSTART", "NUMBER_NAT", "STRING", "NUMERIC_TYPE", "BOOLEAN_TYPE", 
		"STRING_TYPE", "FOR_SOV", "WHILE_SOV", "IF_SOV", "ELSIF_SOV", "ELSE_SOV", 
		"TRUE_LITERAL", "FALSE_LITERAL", "CONST_SOV", "ID", "WS", "COMMENT", "LINE_COMMENT"
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


	public sovLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sov.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0167\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\6!\u00d6\n!"+
		"\r!\16!\u00d7\3\"\3\"\7\"\u00dc\n\"\f\"\16\"\u00df\13\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\7.\u0140\n.\f.\16.\u0143\13.\3/\6/\u0146\n/\r/\16/\u0147\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u0151\n\60\f\60\16\60\u0154\13\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015f\n\61\f\61\16\61\u0162"+
		"\13\61\3\61\3\61\3\61\3\61\4\u0152\u0160\2\62\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62\3\2\7\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5i\3\2\2\2\7m\3\2\2\2\tr\3\2\2"+
		"\2\13w\3\2\2\2\r~\3\2\2\2\17\u0087\3\2\2\2\21\u008b\3\2\2\2\23\u008f\3"+
		"\2\2\2\25\u009a\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2"+
		"\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%"+
		"\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00ba\3\2\2\2-\u00bd\3"+
		"\2\2\2/\u00c0\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2\2"+
		"\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf\3\2\2\2?\u00d1"+
		"\3\2\2\2A\u00d5\3\2\2\2C\u00d9\3\2\2\2E\u00e2\3\2\2\2G\u00ea\3\2\2\2I"+
		"\u00f0\3\2\2\2K\u00f6\3\2\2\2M\u00fd\3\2\2\2O\u0106\3\2\2\2Q\u010f\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0129\3\2\2\2W\u012f\3\2\2\2Y\u0137\3\2\2\2[\u013d"+
		"\3\2\2\2]\u0145\3\2\2\2_\u014b\3\2\2\2a\u015a\3\2\2\2cd\7j\2\2de\7g\2"+
		"\2ef\7n\2\2fg\7n\2\2gh\7q\2\2h\4\3\2\2\2ij\7u\2\2jk\7q\2\2kl\7x\2\2l\6"+
		"\3\2\2\2mn\7v\2\2no\7{\2\2op\7r\2\2pq\7g\2\2q\b\3\2\2\2rs\7u\2\2st\7j"+
		"\2\2tu\7q\2\2uv\7y\2\2v\n\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z{\7f\2\2"+
		"{|\7g\2\2|}\7t\2\2}\f\3\2\2\2~\177\7c\2\2\177\u0080\7d\2\2\u0080\u0081"+
		"\7u\2\2\u0081\u0082\7q\2\2\u0082\u0083\7n\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7v\2\2\u0085\u0086\7g\2\2\u0086\16\3\2\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\20\3\2\2\2\u008b\u008c\7e\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7u\2\2\u008e\22\3\2\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7s\2\2\u0091\u0092\7w\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7T\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7v\2\2\u0099\24\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7x\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7f\2\2\u00a2\26\3\2\2\2\u00a3"+
		"\u00a4\7-\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\32\3\2\2\2\u00a7"+
		"\u00a8\7,\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\36\3\2\2\2\u00ab"+
		"\u00ac\7(\2\2\u00ac\u00ad\7(\2\2\u00ad \3\2\2\2\u00ae\u00af\7~\2\2\u00af"+
		"\u00b0\7~\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2$\3\2\2\2\u00b3"+
		"\u00b4\7@\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6(\3\2\2\2\u00b7\u00b8"+
		"\7@\2\2\u00b8\u00b9\7?\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc,\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\7?\2\2\u00bf.\3"+
		"\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7?\2\2\u00c2\60\3\2\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6\64\3\2\2\2\u00c7\u00c8"+
		"\7}\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7\177\2\2\u00ca8\3\2\2\2\u00cb\u00cc"+
		"\7*\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7"+
		"=\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2\u00d3@"+
		"\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8B\3\2\2\2\u00d9\u00dd\7$\2\2\u00da"+
		"\u00dc\n\3\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2"+
		"\u00e8\u00e9\7e\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7q\2"+
		"\2\u00ec\u00ed\7i\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7e\2\2\u00efH\3\2"+
		"\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7p\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7V\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7u\2\2\u00ff"+
		"\u0100\7N\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102\u0103\7i\2\2"+
		"\u0103\u0104\7C\2\2\u0104\u0105\7u\2\2\u0105N\3\2\2\2\u0106\u0107\7k\2"+
		"\2\u0107\u0108\7p\2\2\u0108\u0109\7E\2\2\u0109\u010a\7c\2\2\u010a\u010b"+
		"\7u\2\2\u010b\u010c\7g\2\2\u010c\u010d\7Q\2\2\u010d\u010e\7h\2\2\u010e"+
		"P\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7E\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115\u0116\7Q\2\2"+
		"\u0116\u0117\7h\2\2\u0117\u0118\7C\2\2\u0118\u0119\7p\2\2\u0119\u011a"+
		"\7q\2\2\u011a\u011b\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7t\2\2\u011eR\3\2\2\2\u011f\u0120\7q\2\2\u0120\u0121\7v\2\2\u0121"+
		"\u0122\7j\2\2\u0122\u0123\7g\2\2\u0123\u0124\7t\2\2\u0124\u0125\7Y\2\2"+
		"\u0125\u0126\7k\2\2\u0126\u0127\7u\2\2\u0127\u0128\7g\2\2\u0128T\3\2\2"+
		"\2\u0129\u012a\7x\2\2\u012a\u012b\7c\2\2\u012b\u012c\7n\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7f\2\2\u012eV\3\2\2\2\u012f\u0130\7k\2\2\u0130\u0131"+
		"\7p\2\2\u0131\u0132\7x\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7f\2\2\u0136X\3\2\2\2\u0137\u0138\7e\2\2\u0138"+
		"\u0139\7q\2\2\u0139\u013a\7p\2\2\u013a\u013b\7u\2\2\u013b\u013c\7v\2\2"+
		"\u013cZ\3\2\2\2\u013d\u0141\t\4\2\2\u013e\u0140\t\5\2\2\u013f\u013e\3"+
		"\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\\\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\t\6\2\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\b/\2\2\u014a^\3\2\2\2\u014b\u014c\7\61\2\2\u014c"+
		"\u014d\7,\2\2\u014d\u0152\3\2\2\2\u014e\u0151\5_\60\2\u014f\u0151\13\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0156\7,\2\2\u0156\u0157\7\61\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\b\60\3\2\u0159`\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c\7\61\2"+
		"\2\u015c\u0160\3\2\2\2\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\f\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\b\61\3\2\u0166b\3\2\2\2\n\2\u00d7\u00dd\u0141\u0147\u0150\u0152"+
		"\u0160\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}