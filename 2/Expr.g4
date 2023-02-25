grammar Expr;
prog: '(' expr ')';
expr: operador expr+ 
    | INT
    | '(' expr ')'
    ;
operador:'^'| '*' | '/' | '+' | '-' ;
INT:[0-9]+;