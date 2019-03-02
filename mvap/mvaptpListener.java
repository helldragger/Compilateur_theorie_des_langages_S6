// Generated from mvaptp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mvaptpParser}.
 */
public interface mvaptpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(@NotNull mvaptpParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(@NotNull mvaptpParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(@NotNull mvaptpParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(@NotNull mvaptpParser.FinInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull mvaptpParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull mvaptpParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull mvaptpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull mvaptpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(@NotNull mvaptpParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(@NotNull mvaptpParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(@NotNull mvaptpParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(@NotNull mvaptpParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull mvaptpParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull mvaptpParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull mvaptpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull mvaptpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull mvaptpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull mvaptpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvaptpParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(@NotNull mvaptpParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvaptpParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(@NotNull mvaptpParser.BoolexprContext ctx);
}