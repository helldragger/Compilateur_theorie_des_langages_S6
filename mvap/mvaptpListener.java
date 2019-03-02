// Generated from mvaptp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mvaptpParser}.
 */
public interface mvaptpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mvaptpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mvaptpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mvaptpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mvaptpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(mvaptpParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(mvaptpParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(mvaptpParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(mvaptpParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(mvaptpParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(mvaptpParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(mvaptpParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(mvaptpParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(mvaptpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(mvaptpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(mvaptpParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(mvaptpParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(mvaptpParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(mvaptpParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(mvaptpParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(mvaptpParser.FinInstructionContext ctx);
}