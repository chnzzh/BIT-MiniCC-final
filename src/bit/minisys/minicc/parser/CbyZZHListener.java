// Generated from D:/Documents/JavaProjects/CbyZZH/src/bit/minisys/minicc\CbyZZH.g4 by ANTLR 4.9.1
package bit.minisys.minicc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CbyZZHParser}.
 */
public interface CbyZZHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CbyZZHParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CbyZZHParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#programList}.
	 * @param ctx the parse tree
	 */
	void enterProgramList(CbyZZHParser.ProgramListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#programList}.
	 * @param ctx the parse tree
	 */
	void exitProgramList(CbyZZHParser.ProgramListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CbyZZHParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CbyZZHParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CbyZZHParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CbyZZHParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CbyZZHParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CbyZZHParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CbyZZHParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CbyZZHParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CbyZZHParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CbyZZHParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CbyZZHParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CbyZZHParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CbyZZHParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CbyZZHParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CbyZZHParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CbyZZHParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CbyZZHParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CbyZZHParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CbyZZHParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CbyZZHParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CbyZZHParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CbyZZHParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CbyZZHParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CbyZZHParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CbyZZHParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CbyZZHParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(CbyZZHParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(CbyZZHParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#fordeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFordeclaration(CbyZZHParser.FordeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#fordeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFordeclaration(CbyZZHParser.FordeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CbyZZHParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CbyZZHParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CbyZZHParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CbyZZHParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CbyZZHParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CbyZZHParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CbyZZHParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CbyZZHParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CbyZZHParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CbyZZHParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CbyZZHParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CbyZZHParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CbyZZHParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CbyZZHParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CbyZZHParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CbyZZHParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CbyZZHParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CbyZZHParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(CbyZZHParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(CbyZZHParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CbyZZHParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CbyZZHParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(CbyZZHParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(CbyZZHParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CbyZZHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CbyZZHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CbyZZHParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CbyZZHParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CbyZZHParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CbyZZHParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CbyZZHParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CbyZZHParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CbyZZHParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CbyZZHParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CbyZZHParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CbyZZHParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CbyZZHParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CbyZZHParser.TypeSpecifierContext ctx);
}