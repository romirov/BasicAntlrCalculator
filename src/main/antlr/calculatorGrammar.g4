grammar calculatorGrammar;

calculation
   : expression* EOF
   ;

expression
   : expression POW expression
   | expression (TIMES | DIV) expression
   | expression (PLUS | MINUS) expression
   | LPAREN expression RPAREN
   | number
   ;

number
   : SNUMBER
   ;

SNUMBER
  :SIGN? NUMBER
  ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment SIGN
   : ('+' | '-')
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

TIMES
   : '*'
   ;

DIV
   : '/'
   ;

POINT
   : '.'
   ;

POW
   : '^'
   ;

WS
   : [ \r\n\t] + -> skip
   ;