// Generated from sov.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sovParser}.
 */
public interface sovListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sovParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(sovParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(sovParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#sov}.
	 * @param ctx the parse tree
	 */
	void enterSov(sovParser.SovContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#sov}.
	 * @param ctx the parse tree
	 */
	void exitSov(sovParser.SovContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(sovParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(sovParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#funcionesmat}.
	 * @param ctx the parse tree
	 */
	void enterFuncionesmat(sovParser.FuncionesmatContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#funcionesmat}.
	 * @param ctx the parse tree
	 */
	void exitFuncionesmat(sovParser.FuncionesmatContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(sovParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(sovParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(sovParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(sovParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#numeric_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_declaration(sovParser.Numeric_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#numeric_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_declaration(sovParser.Numeric_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#numeric_assign}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_assign(sovParser.Numeric_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#numeric_assign}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_assign(sovParser.Numeric_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(sovParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(sovParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#inCaseOf}.
	 * @param ctx the parse tree
	 */
	void enterInCaseOf(sovParser.InCaseOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#inCaseOf}.
	 * @param ctx the parse tree
	 */
	void exitInCaseOf(sovParser.InCaseOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#otherwise}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise(sovParser.OtherwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#otherwise}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise(sovParser.OtherwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(sovParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(sovParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#booleanassign}.
	 * @param ctx the parse tree
	 */
	void enterBooleanassign(sovParser.BooleanassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#booleanassign}.
	 * @param ctx the parse tree
	 */
	void exitBooleanassign(sovParser.BooleanassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleandeclaration(sovParser.BooleandeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleandeclaration(sovParser.BooleandeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void enterString_assign(sovParser.String_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void exitString_assign(sovParser.String_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(sovParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(sovParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(sovParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(sovParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#doubleoperator}.
	 * @param ctx the parse tree
	 */
	void enterDoubleoperator(sovParser.DoubleoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#doubleoperator}.
	 * @param ctx the parse tree
	 */
	void exitDoubleoperator(sovParser.DoubleoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sovParser#fromTo}.
	 * @param ctx the parse tree
	 */
	void enterFromTo(sovParser.FromToContext ctx);
	/**
	 * Exit a parse tree produced by {@link sovParser#fromTo}.
	 * @param ctx the parse tree
	 */
	void exitFromTo(sovParser.FromToContext ctx);
}