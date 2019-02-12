// Generated from Bonus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BonusParser}.
 */
public interface BonusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BonusParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void enterMainNode(BonusParser.MainNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void exitMainNode(BonusParser.MainNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(BonusParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(BonusParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#bracketNode}.
	 * @param ctx the parse tree
	 */
	void enterBracketNode(BonusParser.BracketNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#bracketNode}.
	 * @param ctx the parse tree
	 */
	void exitBracketNode(BonusParser.BracketNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#divNode}.
	 * @param ctx the parse tree
	 */
	void enterDivNode(BonusParser.DivNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#divNode}.
	 * @param ctx the parse tree
	 */
	void exitDivNode(BonusParser.DivNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#plusNode}.
	 * @param ctx the parse tree
	 */
	void enterPlusNode(BonusParser.PlusNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#plusNode}.
	 * @param ctx the parse tree
	 */
	void exitPlusNode(BonusParser.PlusNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#notNode}.
	 * @param ctx the parse tree
	 */
	void enterNotNode(BonusParser.NotNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#notNode}.
	 * @param ctx the parse tree
	 */
	void exitNotNode(BonusParser.NotNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#greaterNode}.
	 * @param ctx the parse tree
	 */
	void enterGreaterNode(BonusParser.GreaterNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#greaterNode}.
	 * @param ctx the parse tree
	 */
	void exitGreaterNode(BonusParser.GreaterNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#andNode}.
	 * @param ctx the parse tree
	 */
	void enterAndNode(BonusParser.AndNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#andNode}.
	 * @param ctx the parse tree
	 */
	void exitAndNode(BonusParser.AndNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(BonusParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(BonusParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(BonusParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(BonusParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#seqNode}.
	 * @param ctx the parse tree
	 */
	void enterSeqNode(BonusParser.SeqNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#seqNode}.
	 * @param ctx the parse tree
	 */
	void exitSeqNode(BonusParser.SeqNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#blockNode}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(BonusParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#blockNode}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(BonusParser.BlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#assigNode}.
	 * @param ctx the parse tree
	 */
	void enterAssigNode(BonusParser.AssigNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#assigNode}.
	 * @param ctx the parse tree
	 */
	void exitAssigNode(BonusParser.AssigNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#ifNode}.
	 * @param ctx the parse tree
	 */
	void enterIfNode(BonusParser.IfNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#ifNode}.
	 * @param ctx the parse tree
	 */
	void exitIfNode(BonusParser.IfNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BonusParser#whileNode}.
	 * @param ctx the parse tree
	 */
	void enterWhileNode(BonusParser.WhileNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BonusParser#whileNode}.
	 * @param ctx the parse tree
	 */
	void exitWhileNode(BonusParser.WhileNodeContext ctx);
}