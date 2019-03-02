grammar Calculette;

@parser::members {




    private int evalexpr (int x, String op, int y) {
        if ( op.equals("*") ){
            return x*y;
        } else if ( op.equals("+") ){
            return x+y;
        } else if ( op.equals("/") ){
            return x/y;
        } else if ( op.equals("-") ){
            return x-y;
        } else {
           System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
        }
    }

}


start
    : expr EOF;

expr returns [int value]
    :a=sousExpr op=('+'|'-') b=sousExpr {$value+=evalexpr($a.value,$op.text,$b.value);System.out.println($value);}
    |a=sousExpr op=('*'|'/') b=sousExpr {$value+=evalexpr($a.value,$op.text,$b.value);System.out.println($value);}
    |a=sousExpr {$value =$a.value;System.out.println($value);}
    ;

sousExpr returns [int value]
    :a=nb op=('*'|'/') b=expr {$value+=evalexpr($a.value,$op.text,$b.value);System.out.println($value);}
    |a=nb op=('+'|'-') b=expr {$value+=evalexpr($a.value,$op.text,$b.value);System.out.println($value);}
    |('-') c=nb {$value =$c.value*(-1);System.out.println($value);}
    |('+') c=nb {$value =$c.value;System.out.println($value);}
    | c=nb {$value =$c.value;System.out.println($value);}
    ;

nb returns[int value]
    :	ENTIER				{$value = Integer.parseInt($ENTIER.text);}
    |	PARENTHESEG expr PARENTHESED {$value = $expr.value;}
    ;

// lexer
NEWLINE : '\r'? '\n'  -> skip;

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;
PARENTHESEG :'(';
PARENTHESED : ')';

UNMATCH : . -> skip ;




