grammar CalculatorGrammar;

calculation
   : expression* EOF
   ;

/*
 * The order in which expressions are evaluated
 * is determined by the order in which possible
 * matching rules are defined.
 *
 * Multiplication and division are on the
 * same precedence level, so they are grouped.
 * The same goes for addition and subtraction.
 *
 * Labels (e.g. "# Parentheses") are added to each rule
 * to provide context to which rule is being parsed.
 * This is can be used in a Listener or Visitor
 * to allow for separate control over Listener or Visitor actions.
 *
 * Likewise, inner labels (e.g. "left_expr=expression")
 * can be added to child nodes of the rule.
 * This makes them identifiable in a
 * Listener's or Visitor's parsing of the rule,
 * allowing for even more fine-grained control.
 */
expression
   : left_expr=paren_expression operation=(MUL | DIV) right_expr=paren_expression               # MultiplicationOrDivisionParen
   | left_expr=paren_expression operation=(ADD | SUB) right_expr=paren_expression               # AdditionOrSubtractionParen
   | paren_expression                                                                           # Parentheses
   | left_expr=expression operation=(MUL | DIV) right_expr=expression                           # MultiplicationOrDivision
   | left_expr=expression operation=(ADD | SUB) right_expr=expression                           # AdditionOrSubtraction
   | number                                                                                     # NumberInExpression
   ;

paren_expression
    : LPAREN inner=expression RPAREN
    ;

number
   : ('+' | '-')* NUMBER
   ;

NUMBER
   : ('0' .. '9')+ ('.' ('0' .. '9') +)?
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

MUL
   : '*'
   ;

DIV
   : '/'
   ;

ADD
   : '+'
   ;

SUB
   : '-'
   ;

POINT
   : '.'
   ;

WS
   : [ \r\n\t]+ -> skip
   ;