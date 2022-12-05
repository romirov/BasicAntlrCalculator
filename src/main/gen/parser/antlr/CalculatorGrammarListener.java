// Generated from java-escape by ANTLR 4.11.1
package parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorGrammarParser}.
 */
public interface CalculatorGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorGrammarParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(CalculatorGrammarParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGrammarParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(CalculatorGrammarParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorGrammarParser.NumberContext ctx);
}