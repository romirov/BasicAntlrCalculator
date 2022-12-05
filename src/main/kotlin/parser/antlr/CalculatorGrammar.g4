grammar CalculatorGrammar;

calculation
   : expression* EOF
   ;

expression
   : expression op=POW expression
   | expression op=(MULT | DIV) expression
   | expression op=(PLUS | MINUS) expression
   | paren_expression
   | number
   ;

paren_expression
  : LPAREN expression RPAREN
  ;

number
   : SNUMBER
   ;

SNUMBER
  : SIGN? NUMBER
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

MULT
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