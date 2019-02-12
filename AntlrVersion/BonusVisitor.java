// Generated from Bonus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BonusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BonusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BonusParser#mainNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainNode(BonusParser.MainNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(BonusParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#bracketNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketNode(BonusParser.BracketNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#divNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivNode(BonusParser.DivNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#plusNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusNode(BonusParser.PlusNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#notNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNode(BonusParser.NotNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#greaterNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterNode(BonusParser.GreaterNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#andNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNode(BonusParser.AndNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(BonusParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(BonusParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#seqNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqNode(BonusParser.SeqNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#blockNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNode(BonusParser.BlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#assigNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigNode(BonusParser.AssigNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#ifNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNode(BonusParser.IfNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BonusParser#whileNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileNode(BonusParser.WhileNodeContext ctx);
}