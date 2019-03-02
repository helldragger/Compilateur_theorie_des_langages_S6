grammar Sexpr;

start
    : sexpr EOF
    ;
 sexpr  returns [ int lg ]
    : AT { $lg = 1; }
    | PO suiteSexpr { $lg = $suiteSexpr.lg; System.out.println($lg); }
    ;

suiteSexpr
    : PF
    | liste PF
    ;
liste
    : sexpr suiteListe
    ;
suiteListe
    : /* vide */
    | liste
    ;

AT  : ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
    ;
PO  : '('
    ;
PF  : ')'
    ;
WS  : ( ' '|  '\t'|'\r'| '\n') -> skip ;