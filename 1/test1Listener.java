// Generated from test1.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link test1Parser}.
 */
public interface test1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link test1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(test1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link test1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(test1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link test1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(test1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link test1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(test1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link test1Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(test1Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link test1Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(test1Parser.OperatorContext ctx);
}