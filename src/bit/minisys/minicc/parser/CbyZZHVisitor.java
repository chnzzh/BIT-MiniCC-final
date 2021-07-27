// Generated from D:/Documents/JavaProjects/CbyZZH/src/bit/minisys/minicc\CbyZZH.g4 by ANTLR 4.9.1
package bit.minisys.minicc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CbyZZHParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CbyZZHVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CbyZZHParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#programList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramList(CbyZZHParser.ProgramListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(CbyZZHParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CbyZZHParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CbyZZHParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CbyZZHParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CbyZZHParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CbyZZHParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CbyZZHParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CbyZZHParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CbyZZHParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CbyZZHParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(CbyZZHParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CbyZZHParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CbyZZHParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(CbyZZHParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#fordeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordeclaration(CbyZZHParser.FordeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CbyZZHParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CbyZZHParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CbyZZHParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CbyZZHParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CbyZZHParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CbyZZHParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CbyZZHParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CbyZZHParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CbyZZHParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(CbyZZHParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CbyZZHParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(CbyZZHParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CbyZZHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CbyZZHParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CbyZZHParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CbyZZHParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CbyZZHParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CbyZZHParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CbyZZHParser.TypeSpecifierContext ctx);
}