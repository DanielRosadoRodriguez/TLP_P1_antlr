grammar PrefixExpr;
prog
    : '(' SumaResta ')'
    ;
SumaResta
    : ('+'|'-') SumaResta ' ' SumaResta
    | ProductoDivision
    ;
ProductoDivision
    : ('*'|'/') ProductoDivision ' ' ProductoDivision
    | Potencia
    ;
Potencia
    : '^' Num ' ' Num
    | Num
    | '(' SumaResta ')'
    ;
Num
    : DIG
    | DIG '.' DIG
    ;
DIG:[0-9]+;