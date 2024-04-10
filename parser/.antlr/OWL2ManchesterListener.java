// Generated from /home/nasro/souslesens/manchesterSyntaxParser/parser/OWL2Manchester.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OWL2ManchesterParser}.
 */
public interface OWL2ManchesterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(OWL2ManchesterParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(OWL2ManchesterParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#disjuction}.
	 * @param ctx the parse tree
	 */
	void enterDisjuction(OWL2ManchesterParser.DisjuctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#disjuction}.
	 * @param ctx the parse tree
	 */
	void exitDisjuction(OWL2ManchesterParser.DisjuctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(OWL2ManchesterParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(OWL2ManchesterParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(OWL2ManchesterParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(OWL2ManchesterParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(OWL2ManchesterParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(OWL2ManchesterParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#restriction}.
	 * @param ctx the parse tree
	 */
	void enterRestriction(OWL2ManchesterParser.RestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#restriction}.
	 * @param ctx the parse tree
	 */
	void exitRestriction(OWL2ManchesterParser.RestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(OWL2ManchesterParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(OWL2ManchesterParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OWL2ManchesterParser#axiom}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(OWL2ManchesterParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link OWL2ManchesterParser#axiom}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(OWL2ManchesterParser.AxiomContext ctx);
}