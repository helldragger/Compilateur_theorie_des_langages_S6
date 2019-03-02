grammar Calculette;

@parser::members {

        private String evalexpr (String x, String op, String y) {
            if ( op.equals("*") ){
                return "PUSHI x \n PUSHI y \n MUL \n";
            } else if ( op.equals("+") ){
                return "PUSHI "+ x+" \n PUSHI "+ y+" \n ADD \n";
            } else if ( op.equals("/") ){
                return "PUSHI "+ x +"\n PUSHI "+ y +"\n DIV \n";
            } else if ( op.equals("-") ){
                return "PUSHI "+ x+" \n PUSHI "+ y+" \n SUB \n";
            } else {
               System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
               throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
            }
        }

       private TablesSymboles tablesSymboles = new TablesSymboles();

       private int _label = 0;
       /** générateur de nom d'étiquettes */
       private int nextLabel() { return _label++; }


}

start
    : calcul EOF
    ;


calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*

        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += " HALT\n"; }
    ;


decl returns [ String code ]
    :
        TYPE IDENTIFIANT finInstruction
        {
            $code="PUSHI 0 \n";
            tablesSymboles.putVar($IDENTIFIANT.text,"int");
        }
        |TYPE IDENTIFIANT '=' ENTIER finInstruction
        {
            $code="PUSHI "+$ENTIER.text+" \n";
            tablesSymboles.putVar($IDENTIFIANT.text,"int");
        }
    ;



instruction returns [ String code ]
    :b=boucleWhile
        {
            $code=$b.code;
        }
    |a=expr finInstruction
        {
            $code=$a.code;
        }
    | assignation finInstruction
        {
            $code=$assignation.code;
        }
    | finInstruction
        {
            $code="";
        }
    ;

boucleWhile returns [String code]
    :'while' PARENTHESEG c=condition PARENTHESED ins=instruction
    {
        int lab1=nextLabel();
        int lab2=nextLabel();

        $code="LABEL "+lab1+"\n"+
        $c.code+
        "JUMPF "+lab2+"\n"+
        $ins.code+ "\n JUMP "+ lab1 +
        "\nLABEL "+lab2+"\n";

    }
    ;

finInstruction
    :
        NEWLINE
    ;

assignation returns [ String code ]
    : IDENTIFIANT '=' expr
        {
           AdresseType at=tablesSymboles.getAdresseType($IDENTIFIANT.text);
           $code=$expr.code+" STOREG "+ at.adresse ;
        }
    ;

condition returns [String code]
    : 'true'  { $code = "  PUSHI 1\n"; }
    | 'false' { $code = "  PUSHI 0\n"; }
    ;


expr returns [String code]
    :a=sousExpr op=('+'|'-') b=sousExpr {$code+=evalexpr($a.code,$op.text,$b.code);System.out.println($code);}
    |a=sousExpr op=('*'|'/') b=sousExpr {$code+=evalexpr($a.code,$op.text,$b.code);System.out.println($code);}
    |a=sousExpr {$code =$a.code;}
    ;

sousExpr returns [String code]
    :a=nb op=('*'|'/') b=expr {$code+=evalexpr($a.code,$op.text,$b.code);}
    |a=nb op=('+'|'-') b=expr {$code+=evalexpr($a.code,$op.text,$b.code);}
    |('-') c=nb {$code ="-"+$c.code;}
    |('+') c=nb {$code =$c.code;}
    | c=nb {$code =$c.code;}
    ;

nb returns[String code]
    :	ENTIER				{$code = $ENTIER.text;}
    |	PARENTHESEG expr PARENTHESED {$code = $expr.code;}
    ;

// lexer
NEWLINE : '\r'? '\n' ;
TYPE : 'int' | 'float' ;
IDENTIFIANT : ('a'..'z');

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;
PARENTHESEG :'(';
PARENTHESED : ')';

UNMATCH : . -> skip ;
