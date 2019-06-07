//LEXER

grammar sov;
PROGRAM: 'sov';
VAR: 'type';
PRINTLN: 'show';
READ_SOV: 'reader';

ABS_FUN: 'absolute';
SIN_FUN: 'sin';
COS_FUN: 'cos';
SQRT_FUN: 'squareRoot';
POW_FUN: 'elevated';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';
COMA: ',';


BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';
COMMENTSTART:'//';
NUMBER_NAT: [0-9]+;
STRING
    : '"' ~('"')* '"'
    ;

NUMERIC_TYPE : 'numeric';
BOOLEAN_TYPE: 'logic';
STRING_TYPE: 'chain';


FOR_SOV: 'fromTo';
WHILE_SOV: 'asLongAs';
IF_SOV: 'inCaseOf';
ELSIF_SOV: 'inCaseOfAnother';
ELSE_SOV: 'otherWise';


TRUE_LITERAL: 'valid';
FALSE_LITERAL: 'invalid';

CONST_SOV: 'const';

r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT: '/*' (COMMENT|.)*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' .*? '\n' -> channel(HIDDEN);


//PARSER


sov: PROGRAM ID BRACKET_OPEN
	sentence*
	BRACKET_CLOSE;
	
	
sentence: numeric_assign |numeric_declaration | declaration | booleanassign | booleandeclaration | operaciones | condicion | print | loopwhile | read | funcionesmat| fromTo | string_assign| inCaseOf | otherwise;
			  
funcionesmat: (ABS_FUN | SIN_FUN | COS_FUN | SQRT_FUN | POW_FUN) PAR_OPEN (ID | NUMBER_NAT) PAR_CLOSE; // FUNCIONES MAT
condicion: (ID | NUMBER_NAT | TRUE_LITERAL | FALSE_LITERAL) (EQ | GT | LT | GEQ | LEQ | NEQ) (ID | NUMBER_NAT | TRUE_LITERAL | FALSE_LITERAL); // CONDICION
operaciones: (ID | NUMBER_NAT) ASSIGN ID ( PLUS | MINUS | MULT | DIV) (NUMBER_NAT | ID) SEMICOLON; // OPERACIONES MATEMATICAS

numeric_declaration: NUMERIC_TYPE ID ((ASSIGN (NUMBER_NAT | funcionesmat ) (COMA ID ASSIGN (NUMBER_NAT|funcionesmat))*)| (COMA ID)*) SEMICOLON;

numeric_assign: ID ASSIGN (NUMBER_NAT | funcionesmat) SEMICOLON;

print: PRINTLN PAR_OPEN (ID|NUMBER_NAT|STRING) PAR_CLOSE SEMICOLON;

inCaseOf: (IF_SOV|ELSIF_SOV) PAR_OPEN condicion PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE;

otherwise: ELSE_SOV BRACKET_OPEN sentence* BRACKET_CLOSE;

declaration: VAR ID SEMICOLON;

booleanassign: ID ASSIGN (TRUE_LITERAL | FALSE_LITERAL) SEMICOLON;

booleandeclaration: BOOLEAN_TYPE ID ASSIGN (TRUE_LITERAL | FALSE_LITERAL)SEMICOLON ; // ASIGNACION VARIABLE BOOLEANA

string_assign: ID ASSIGN (ID | STRING) SEMICOLON ; // ASIGNACION VARIABLE STRING

loopwhile: WHILE_SOV PAR_OPEN condicion PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE ; // WHILE

read: READ_SOV PAR_OPEN ID PAR_CLOSE SEMICOLON; // LECTURA

doubleoperator: (ID | NUMBER_NAT ) (PLUS PLUS | MINUS MINUS); 

fromTo: FOR_SOV PAR_OPEN numeric_declaration condicion SEMICOLON (doubleoperator) PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE; // FOR
		
