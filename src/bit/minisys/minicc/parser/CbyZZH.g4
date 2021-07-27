// encoding: UTF-8
// author: Zheng Zhihan

grammar CbyZZH;

// 语法定义

program
    :   programList EOF
    ;

programList
    :   externalDeclaration
    |   externalDeclaration programList
    ;

// 包含普通定义和函数
externalDeclaration
    :   functionDefinition
    |   declaration
    ;

functionDefinition
    :   typeSpecifier declarator compoundStatement
    ;

declarator
    :   Identifier
    |   '(' declarator ')'
    |   declarator '[' assignmentExpression? ']'
    |   declarator '(' identifierList? ')'  // 函数调用
    |   declarator '(' parameterList? ')'  // 函数定义
    ;

identifierList
    :   Identifier
    |   Identifier ',' identifierList
    ;

parameterList
    :   parameterDeclaration
    |   parameterDeclaration ',' parameterList
    ;

parameterDeclaration
    :   typeSpecifier declarator
    |   'void'
    ;

// 语句-------------------------------------------------------------------
statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   loopStatement
    |   jumpStatement
    ;

// 标签语句
labeledStatement
    :   Identifier ':' statement
    |   'case' conditionalExpression ':' statement
    |   'default' ':' statement
    ;

// 复合语句
compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItem blockItemList
    ;

blockItem
    :   statement
    |   declaration
    ;

// 表达式语句
expressionStatement
    :   expression? ';'
    ;

// 选择语句
selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    |   'switch' '(' expression ')' statement
    ;

// 循环语句
loopStatement
    :   'while' '(' expression ')' statement
    |   'do' statement 'while' '(' expression ')' ';'
    |   'for' '(' fordeclaration? ';' expression? ';' expression? ')' statement
    |   'for' '(' expression? ';' expression? ';' expression? ')' statement
    ;

// for第一个元素的声明(没有分号)
fordeclaration
    :   typeSpecifier initDeclaratorList
    ;

// 跳转语句
jumpStatement
    :   'goto' Identifier ';'
    |   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    ;

// 声明----------------------------------------------------------------
declaration
    :   typeSpecifier initDeclaratorList ';'
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclarator ',' initDeclaratorList
    ;

initDeclarator
    :   declarator
    |   declarator '=' initializer
    ;

initializer
    :   assignmentExpression    // 常量
    |   '{' initializerList '}'
    ;

initializerList
    :   initializer
    |   initializer ',' initializerList
    ;

// 表达式--------------------------------------------------------------
expression
    :   assignmentExpression
    |   expression ',' assignmentExpression
    ;

// 赋值表达式
assignmentExpression
    :   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    ;

// 条件表达式
conditionalExpression
    :   logicalExpression
    ;
// 逻辑表达式
logicalExpression
    :   relationalExpression
    |   logicalExpression '||' relationalExpression
    |   logicalExpression '&&' relationalExpression
    ;

// 关系表达式
relationalExpression
    :   arithmeticExpression
    |   relationalExpression '<' arithmeticExpression
    |   relationalExpression '>' arithmeticExpression
    |   relationalExpression '<=' arithmeticExpression
    |   relationalExpression '>=' arithmeticExpression
    |   relationalExpression '==' arithmeticExpression
    |   relationalExpression '!=' arithmeticExpression
    ;

// 运算表达式
arithmeticExpression
    :   additiveExpression
    ;

multiplicativeExpression
    :   unaryExpression
    |   multiplicativeExpression '*' unaryExpression
    |   multiplicativeExpression '/' unaryExpression
    |   multiplicativeExpression '%' unaryExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

// 一元表达式
unaryExpression
    :   primaryExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   '!' unaryExpression
    |   '~' unaryExpression
    |   unaryExpression '++'
    |   unaryExpression '--'
    |   unaryExpression '[' conditionalExpression ']' // 数组中的元素
    |   unaryExpression '(' expression? ')'   // 函数返回值
    ;

// 基础表达式
primaryExpression
    :   Identifier
    |   IntegerConstant
    |   FloatConstant
    |   Character
    |   String
    |   '(' expression ')'
    ;


// 赋值运算符
assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-='
    ;

// 变量类型标识符
typeSpecifier
    :   'void'
    |   'bool'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;
// 词法定义

AUTO     : 'auto' ;
BREAK    : 'break' ;
CASE     : 'case' ;
CHAR     : 'char' ;
CONST    : 'const' ;
CONTINUE : 'continue' ;
DEFAULT  : 'default' ;
DO       : 'do' ;
DOUBLE   : 'double' ;
ELSE     : 'else' ;
ENUM     : 'enum' ;
EXTERN   : 'extern' ;
FLOAT    : 'float' ;
FOR      : 'for' ;
GOTO     : 'goto' ;
IF       : 'if' ;
INLINE   : 'inline' ;
INT      : 'int' ;
LONG     : 'long' ;
REGISTER : 'register' ;
RESTRICT : 'restrict' ;
RETURN   : 'return' ;
SHORT    : 'short' ;
SIGNED   : 'signed' ;
SIZEOF   : 'sizeof' ;
STATIC   : 'static' ;
STRUCT   : 'struct' ;
SWITCH   : 'switch' ;
TYPEDEF  : 'typedef' ;
UNION    : 'union' ;
UNSIGNED : 'unsigned' ;
VOID     : 'void' ;
VOLATILE : 'volatile' ;
WHILE    : 'while' ;

ADD        : '+' ;
SUB        : '-' ;
MUL        : '*' ;
QUO        : '/' ;
INC        : '++' ;
DEC        : '--' ;
ASSIGN     : '=' ;
ADD_ASSIGN : '+=' ;
SUB_ASSIGN : '-=' ;
MUL_ASSIGN : '*=' ;
QUO_ASSIGN : '/=' ;
REM_ASSIGN : '%=' ;
LAND       : '&&' ;
LOR        : '||' ;
NOT        : '!' ;
EQL        : '==' ;
NEQ        : '!=' ;
LSS        : '<' ;
GTR        : '>' ;
LEQ        : '<=' ;
GEQ        : '>=' ;
LPAREN     : '(' ;
LBRACK     : '[' ;
LBRACE     : '{' ;
COMMA      : ',' ;
PERIOD     : '.' ;
RPAREN     : ')' ;
RBRACK     : ']' ;
RBRACE     : '}' ;
SEMICOLON  : ';' ;
COLON      : ':' ;

Identifier : [a-zA-Z_][a-zA-Z_0-9]* ;
IntegerConstant : '0' | [1-9][0-9]* ;
FloatConstant : IntegerConstant? '.' IntegerConstant ;
Character : '\'' ~[']? '\'' ;
String : '"'  ~["]+ '"';
BlockComment : '/*' .*? '*/' -> skip ;
LineComment : '//' ~[\r\n]* -> skip ;
Whitespace : [ \r\t\n]+  -> skip ;