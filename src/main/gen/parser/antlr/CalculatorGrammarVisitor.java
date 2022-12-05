// Generated from java-escape by ANTLR 4.11.1
package parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorGrammarParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(CalculatorGrammarParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CalculatorGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorGrammarParser.NumberContext ctx);
}