grammar Calculette;

@parser::members {
    private int _label = 0;
    /** générateur de nom d'étiquettes */
    private int nextLabel() { return _label++; }

    private TablesSymboles tableSymboles = new TablesSymboles();
    private String evalexpr (String x, String op, String y) {
        String result = x + y;
        if ( op.equals("*") ) {
            return result + "MUL\n";
        } else if ( op.equals("/") ){
            return result + "DIV\n";
        } else if ( op.equals("+") ){
            return result + "ADD\n";
        } else if ( op.equals("-") ){
            return result + "SUB\n";
        } else if ( op.equals("==") ){
            return result + "EQUAL\n";
        } else if ( op.equals("!=") || op.equals("<>")){
            return result + "NEQ\n";
        } else if ( op.equals(">") ){
            return result + "SUP\n";
        } else if ( op.equals(">=") ){
            return result + "SUPEQ\n";
        } else if ( op.equals("<") ){
            return result + "INF\n";
        } else if ( op.equals("<=") ){
            return result + "INFEQ\n";
        } else {
           System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
        }
    }

}

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*
        { int entry = nextLabel(); $code += "  JUMP " + entry + "\n"; }
        NEWLINE*

        (fonction { $code += $fonction.code; })*
        NEWLINE*

        { $code += "LABEL " + entry + "\n"; }
        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;

////////////
// Parser //
////////////
start
    :
    calcul EOF
    ;
expression returns [ String code ]
    : '-' expr1=expression {$code =  $expr1.code + "PUSHI -1\nMUL\n";}
    | '+' expr1=expression {$code =  $expr1.code ;}
    | expr1=expression op=('*' | '/') expr2=expression {$code = evalexpr($expr1.code, $op.text, $expr2.code);}
    | expr1=expression op=('+' | '-') expr2=expression {$code = evalexpr($expr1.code, $op.text, $expr2.code);}
    | '(' expr1=expression ')' {$code = $expr1.code;}
    | ENTIER {$code = "PUSHI " + $ENTIER.text + "\n";}
    | FLOAT {$code = "PUSHF " + $FLOAT.text + "\n";}
    | IDENTIFIANT
        {
            int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
            $code = "PUSH" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
        }
    | IDENTIFIANT '(' args ')' // appel de fonction
        {
            $code = "PUSHI 0\n";
            $code += $args.code;
            $code += "CALL " + tableSymboles.getFonction($IDENTIFIANT.text).adresse + "\n";

            // On nétoie les arguments
            for(int i = 0; i < $args.size; i++) {
                $code += "POP\n";
            }
        }
    ;

// Support des variables
finInstruction
    : NEWLINE+
    ;

decl returns [ String code ]
    :
        TYPE IDENTIFIANT finInstruction
        {
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            $code="PUSHI 0" +"\n";
        }
    |   TYPE IDENTIFIANT '=' expression finInstruction
        {
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            $code = $expression.code;
        }
    ;

instruction returns [ String code ]
    : expression finInstruction
        {
            $code = $expression.code ;

        }
    | assignation finInstruction
        {
            $code = $assignation.code ;

        }
    | finInstruction
        {
            $code="";
        }
    | bloc
        {
            $code = $bloc.code;
        }
    | PRINTLN '(' expression ')' finInstruction {
        $code = $expression.code;
        $code += "WRITE\nPOP \n";
    }
    | RETURN expression finInstruction
        {
            $code = $expression.code;
            $code += "STOREL " + tableSymboles.getAdresseType("return").adresse + "\n";
            $code += "RETURN\n";
        }
    | IDENTIFIANT STREAM_OUT finInstruction
        {
            int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
            $code = "PUSH" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";

            $code += "WRITE" + (tableSymboles.getAdresseType($IDENTIFIANT.text).type.equals("float") ? "F" : "") + "\n";
            $code += "POP\n";
        }
    | WHILE '(' cond=condition ')' instru=instruction
        {
            int i = nextLabel();
            int j = nextLabel();


            $code = "LABEL " + i + "\n";
            $code += $cond.code + "\n";
            $code += "JUMPF " + j + "\n";
            $code += $instru.code + "\n";
            $code += "JUMP " + i + "\n";
            $code += "LABEL " + j + "\n";
        }
    | IF '(' cond=condition ')' instru=instruction
        {
            int insElse = nextLabel();
            int insEndif = nextLabel();

            /*$code = "LABEL " + i + "\n";*/
            $code = "# IF\n";

            $code += $cond.code + "\n";
            $code += "JUMPF " + insElse + "\n";
            $code += "# THEN\n";
            $code += $instru.code;
            $code += "JUMP " + insEndif + "\n";
            $code += "LABEL " + insElse + "\n";
        }
        (ELSE instru2=instruction
         {
             $code += "# ELSE\n";
             $code += $instru2.code;
         }
         )?
         {
             $code += "LABEL " + insEndif + "\n";
         }
    | FOR '(' assigna1=assignation ';' cond=condition ';' assigna2=assignation ')' instru=instruction
        {
            int i =nextLabel();
            int j = nextLabel();

            $code=$assigna1.code;
            $code+="LABEL "+j+"\n";
            $code+=$cond.code;
            $code+="JUMPF "+i+"\n";
            $code+=$instru.code;
            $code+=$assigna2.code;
            $code+="JUMP "+j+"\n";
            $code+="LABEL "+i+"\n";
        }
    | REPEAT instru=instruction UNTIL '(' cond=condition ')' finInstruction
        {
            int i = nextLabel();
            int j = nextLabel();


            $code = "LABEL " + i + "\n";
            //
            $code += $instru.code + "\n";
            //
            $code += $cond.code + "\n";
            $code += "JUMPF " + i + "\n";


        }
      | PRINTLN '(' IDENTIFIANT ')' finInstruction
    {   
        int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
        $code = "PUSH" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
        $code += "WRITE \nPOP \n";
    }
    | READLN '(' IDENTIFIANT ')' finInstruction
    {   
        $code = "READ\n";
        int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
        $code += "STORE" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
    }
    ;

assignation returns [ String code ]
    : IDENTIFIANT '=' expression
        {
            $code = $expression.code;

            int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
            $code += "STORE" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
        }
    |   IDENTIFIANT STREAM_IN
        {
            $code = "READ\n";

            int adresse = tableSymboles.getAdresseType($IDENTIFIANT.text).adresse;
            $code += "STORE" + (adresse >= 0 ? "G" : "L") + " " + adresse + "\n";
        }
    ;

condition returns [String code]
    : NOT cond=condition
        {
            $code = "# Condition d'égalité : not\n";

            $code += $cond.code + "\n";
            $code += "PUSHI 0\n";
            $code += "EQUAL\n";
        }
    | cond1=condition AND cond2=condition
        {
            $code = "# Condition d'égalité : cond1 and cond2\n";

            // Version naive
            /*$code +=  $cond1.code + "\n";
            $code +=  $cond2.code + "\n";
            $code += "MUL\n";*/

            int i = nextLabel();
            int j = nextLabel();

            $code += $cond1.code + "\n";
            $code += "JUMPF " + i + "\n";
            $code += $cond2.code + "\n";
            $code += "JUMP " + j +"\n";
            $code += "LABEL " + i + "\n";
            $code += "PUSHI 0\n";
            $code += "LABEL " + j + "\n";
        }
    | cond1=condition OR cond2=condition
        {
            $code = "# Condition d'égalité : cond1 or cond2\n";

            // Version naive
            /*$code +=  $cond1.code + "\n";
            $code +=  $cond2.code + "\n";
            $code += "ADD\n";
            $code += "PUSHI 1\n";
            $code += "SUPEQ\n";*/

            int i = nextLabel();
            int j = nextLabel();

            $code += $cond1.code + "\n";
            $code += "JUMPF " + i + "\n";
            $code += "PUSHI 1\n";
            $code += "JUMP " + j +"\n";
            $code += "LABEL " + i + "\n";
            $code += $cond2.code + "\n";
            $code += "LABEL " + j + "\n";
        }
    | expr1=expression op=('=='|'!='|'<>'|'>'|'>='|'<'|'<=') expr2=expression {
        $code = "# Condition d'égalité : expr1 " +  $op.text + " expr2\n";
        $code += evalexpr($expr1.code, $op.text, $expr2.code); }
    | TRUE  {
        $code = "# Condition : true\n";
        $code += "PUSHI 1\n"; }
    | FALSE {
        $code = "# Condition : false\n";
        $code += "PUSHI 0\n"; }
    | '(' cond=condition ')'
        {
            $code = "# Condition : cond\n";
            $code += $cond.code + "\n";
        }
    ;

// Bloc d'instructions
bloc returns [ String code ]
    @init{
        $code = new String();
    }
    : '{' (instruction {$code += $instruction.code;})* '}' NEWLINE*
    ;

// Fonctions
fonction returns [ String code ]
    @init{
        tableSymboles.newTableLocale();
    }
    @after{
        tableSymboles.dropTableLocale();
    }
    : TYPE IDENTIFIANT { tableSymboles.putVar("return", $TYPE.text); } '('  params ? ')'
        {
            int l = nextLabel();
            $code = "LABEL " + l + "\n";
            tableSymboles.nouvelleFonction($IDENTIFIANT.text,l,$TYPE.text);
        }
        instruction
        {
            // corps de la fonction
            $code += $instruction.code;
            $code += "RETURN\n";
        }
        finInstruction*
    ;


params
    : TYPE IDENTIFIANT
        {
            // code java gérant la déclaration de "la variable" de retour de la fonction
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }
        ( ',' TYPE IDENTIFIANT
            {
                // code java gérant une variable locale (argi)
                tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            }
        )*
    ;

 // init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null)
args returns [ String code, int size] @init{ $code = new String(); $size = 0; }
    : ( expression
    {
        // code java pour première expression pour arg1
        $code = $expression.code;
        $size ++;
    }
    ( ',' expression
    {
        // code java pour expression suivante pour argi
        $code += $expression.code;
        $size ++;
    }
    )*
      )?
    ;

///////////
// lexer //
///////////

// Support des variables
STREAM_IN : '<<';
STREAM_OUT : '>>';

// Support des condition (partie k)
IF : 'if';
ELSE : 'else';

//PRINTLN READLN
PRINTLN:'println';
READLN :'readln';

// Support des boucles for et do while (partie L)
WHILE : 'while';
FOR : 'for';
REPEAT : 'repeat';
UNTIL : 'until';

TYPE : 'int' | 'float' ;

// Condition booleen
NOT : 'not' | 'non';
OR : 'or' | 'ou';
AND : 'and' | 'et';
TRUE : 'true' | 'vrai';
FALSE : 'false' | 'faux';

RETURN : 'return';
IDENTIFIANT : [a-zA-Z]+;

// Base
NEWLINE : (';' ('\r'? '\n')?) | ('\r'? '\n');

WS :   (' '|'\t')+ -> skip  ;

FLOAT : ('0'..'9')+ ('.') ('0'..'9')* ;
ENTIER : ('0'..'9')+  ;
COMMENT : '#' + ~('\n')* -> skip;
UNMATCH : . -> skip ;