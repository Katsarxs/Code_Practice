grammar Tabloid; // Onoma grammatikhs

/*======================================*/
/*=============Parser Rules=============*/
/*======================================*/

/*Top parser kanonas*/
compilationUnit
    : statement* EOF
    ;

/*Ta statements tis glossas tabloid*/
statement
    : declaration NEWLINE*
    | expressionStatement NEWLINE*
    | controlFlowStatement NEWLINE*
    | functionCall NEWLINE*
    | commentStatement NEWLINE*
    | inputStatement NEWLINE*
    ;

/*Dhloah metablhths*/
declaration
    : 'EXPERTS CLAIM' identifier 'TO BE' NEWLINE* declarationBody
    ;

expressionStatement
    : 'YOU WON\'T WANT TO MISS' expression //Dilosh metablhths
    | 'DISCOVER HOW TO' discoverThing NEWLINE* 'RUMOR HAS IT' NEWLINE* statement* NEWLINE* 'END OF STORY' //Dilosh sunarthshs
    | 'PLEASE LIKE AND SUBSCRIBE' //Telos programmtos
    ;

controlFlowStatement
    : 'WHAT IF' conditionBlock NEWLINE* 'RUMOR HAS IT'? NEWLINE* statement* NEWLINE* 'END OF STORY'? // To if statement
    | 'LIES!' NEWLINE* 'RUMOR HAS IT'? NEWLINE* statement* NEWLINE* 'END OF STORY'? // To else statement
    | 'STAY TUNED WHILE' conditionBlock NEWLINE* 'RUMOR HAS IT'? NEWLINE* statement* NEWLINE* 'END OF STORY'? // To while statement
    | 'SHOCKING DEVELOPMENT' NEWLINE* (expression | functionCall)? // To return statement
    ;

/*Input Statement*/
inputStatement
    : 'LATEST NEWS ON' identifier
    ;

/*Kalesma sinarthshs me orismata*/
functionCall
    : expression 'OF' arguments
    ;

/*Sxolia*/
commentStatement
    : COMMENT 
    ;

/*Statements pou akolouthoun meta ti dilwsi metablitis*/
declarationBody
    : expression
    | functionCall
    | inputStatement
    ;

/*Gia to funtion*/
discoverThing
    : identifier 'WITH' arguments;

/*Gia to condition*/
conditionBlock
    : expression conditionalOp expression;

/*Ta Arhuments*/
arguments
    : argument (',' argument)* ;

/*Argument*/
argument
    : expression;

/*Expressions*/
expression
    : booleanExpression ;

booleanExpression
    : conditionalExpression (booleanOp conditionalExpression)* ;

conditionalExpression
    : comparisonExpression (conditionalOp comparisonExpression)* ;

comparisonExpression
    : additionExpression (conditionalOp additionExpression)* ;

additionExpression
    : multiplicationExpression (binaryLowOp multiplicationExpression)* ;

multiplicationExpression
    : factor (binaryHighOp factor)* ;

factor
    : '(' expression ')'
    | identifier
    | booleanLiteral
    ;

/*Sinthikes Sugriseis*/
conditionalOp
    : 'SMALLER THAN' 
    | 'IS ACTUALLY'
    | 'BEATS'
    | 'IS SMALLER THAN'
    ;

/*Mathimatikoi telestes (+, -) */
binaryLowOp
    : 'PLUS' | 'MINUS'
    ;

/*Mathimatikoi telestes (*, %, /)*/
binaryHighOp
    : 'TIMES' | 'DIVIDED BY' | 'MODULO'
    ;

/*Logika Telestes */
booleanOp
    : 'AND'
    | 'OR'
    ;

/*Logikes ekfraseis*/
booleanLiteral
    : 'TOTALLY RIGHT'
    | 'COMPLETELY WRONG'
    ;

/*Anagnoristiko*/
identifier
    : WORD
    | STRING_LITERAL
    | INT_LITERAL
    | FLOAT_LITERAL
    ;

/*======================================*/
/*=============Lexer Rules==============*/
/*======================================*/

/*Sxolia*/
COMMENT
    : 'UNCONFIRMED RUMOR:' ~[\r\n]*
    ;

/*String se aytakia*/
STRING_LITERAL
    : '\'' (ESC | .)*? '\''
    ;
/*To \' */
ESC
    : '\\\''
    ;

/*Lexi*/
WORD
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

/*Akeraioi*/
INT_LITERAL
    : [0-9]+
    ;

/*Dekadikoi*/
FLOAT_LITERAL
    : [0-9]+ '.' [0-9]*
    ;

/*Allagh grammhs*/
NEWLINE
    : [\n]
    ;

/*Skiparoyme spaces, tabs kai kersora */
WS
    : [ \t\r]+ -> skip
    ;