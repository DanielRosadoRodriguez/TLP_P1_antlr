grammar test1;

prog: '(' expr ')';
expr: operator expr+ 
    | INT
    | '(' expr ')'
    ;
operator:'^'| '*' | '/' | '+' | '-' ;
INT:[0-9]+;