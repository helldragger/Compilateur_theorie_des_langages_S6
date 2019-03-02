grammar mvaptp;

/*

symbols:
symbols table

register de calcul: a, b, 4 cases, 2 pour des int, 4 pour des floats
mem stack addr = 4


call stack: 100 size
memory stack: dynamic size, determined at launch time, depends on the context

context at addr a:
a+0 = memorystack size
a+memorystacksize = start of code block

0       :   INT A REGISTER
1       :   INT B REGISTER
2-3     :   FLOAT A REGISTER
4-5     :   FLOAT B REGISTER
6       :   VAR INT MEMORY SIZE
7       :   VAR INT MEMORY ADDR
8       :   VAR FLOAT MEMORY SIZE
9       :   VAR FLOAT MEMORY ADDR
10      :   MEM ADDR REGISTER
11      :   MEM DATA REGISTER
12      :   FETCH FUNCTION
13      :   ADD FUNCTION


VAR INT MEMORY ADDR + VAR INT ADDR: VAR INT DATA
VAR FLOAT MEMORY ADDR + VAR FLOAT ADDR: VAR FLOAT DATA

contains the last call point
when calling, add the current stack pointer to the call stack and go to the
function corpus

when returning, fetch the last pointer value from the call stack and return
to it






*/
@parser::members {
    private final int INT_MEM_ADDR = 10;
    private final int FLOAT_MEM_ADDR = 30;
    private final int REG_A_INT_ADDR = 0;
    private final int REG_B_INT_ADDR = 1;
    private final int REG_A_FLOAT_ADDR = 0;
    private final int REG_B_FLOAT_ADDR = 2;

    private TablesSymboles globalSymbols = new TablesSymboles();
    private TablesSymboles localsSymbols = new TablesSymboles();

    private TableSymboles tablesSymboles = new TableSymboles();
    private double evalexpr (Double x, String op, Double y) {
        if ( op.equals("*") ){
            return x*y;
        } else if ( op.equals("/") ){
            return x/y;
        } else if ( op.equals("%") ){
            return x%y;
        } else if ( op.equals("+") ){
            return x+y;
        } else if ( op.equals("-") ){
            return x-y;
        } else {
            System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
            throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
        }
   }

   private String evalMathOperation(String op){
        if ( op.equals("*") ){
            return "MUL\n";
        } else if ( op.equals("/") ){
            return "DIV\n";
        } else if ( op.equals("+") ){
            return "ADD\n";
        } else if ( op.equals("-") ){
            return "SUB\n";
        } else {
            System.err.println("Opérateur arithmétique inconnu : '"+op+"'");
            throw new IllegalArgumentException("Opérateur arithmétique inconnu : '"+op+"'");
        }
   }

    private int getRealGlobalAddress(String symbol){
        return getRealGlobalAddress(tablesSymboles.getAdresseType(symbol));
    }

    private int getRealGlobalAddress(AdresseType at){
        return getRealGlobalAddress(at.adresse);
    }

    private int getRealGlobalAddress(int addr){
        return addr + 2;
    }

   private String evalType(String type){
        if (type.equals("int"))
            return "int";
        else if (type.equals("float"))
            return "float";
        else
            throw new IllegalArgumentException("Unknown type :'"+type+"'");
   }
    private int _label = 0;
    /** générateur de nom d'étiquettes */
    private int nextLabel() { return _label++; }
}

start
    : calcul EOF{System.out.println($calcul.code);};


expression returns [String code]
@init{ $code = new String(); }
    :
   '(' l=expression ')' {$code += $l.code;}
    |   l=expression '/' r=expression
    {$code += $l.code+$r.code+"DIV\n";}
    |   l=expression '*' r=expression
    {$code += $l.code+$r.code+"MUL\n";}
    |   l=expression '-' r=expression
    {$code += $l.code+$r.code+"SUB\n";}
    |   l=expression '+' r=expression
    {$code += $l.code+$r.code+"ADD\n";}
    |   ENTIER {$code += "PUSHI "+$ENTIER.text+"\n";}
    |   REEL {$code += "PUSHF "+$REEL.text+"\n";}
    |   IDENTIFIANT
        {
            int addr = getRealGlobalAddress($IDENTIFIANT.text);
            $code += "PUSHG " + addr+"\n";
        }
    ;


boolexpr returns [String code]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
    :   '(' c=boolexpr ')' { $code += $c.code;}
    |   condition {$code += $condition.code;}
    |   TRUE { $code += "PUSHI 1\n"; }
    |   FALSE{ $code += "PUSHI 0\n"; }
    |    NOT r=boolexpr
    {
        $code += $r.code;
        $code += "PUSHI 0\n";
        $code += "EQUAL\n";
    }
    |   l=boolexpr AND r=boolexpr
    {
        $code += $l.code;
        $code += $r.code;
        $code += "EQUAL\n";
    }
    |   l=boolexpr OR r=boolexpr
    {
        $code += $l.code;
        $code += $r.code;
        $code += "ADD\n";
        $code += "PUSHI 0\n";
        $code += "SUP\n";
    }
    ;

condition returns [String code]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
    :   '(' c=condition ')' { $code = $c.code;}
    |   l=expression INF r=expression { $code = $l.code + $r.code + "INF\n";}
    |   l=expression INFEQ r=expression { $code = $l.code + $r.code + "INFEQ\n";}
    |   l=expression SUP r=expression { $code = $l.code + $r.code + "SUP\n";}
    |   l=expression SUPEQ r=expression { $code = $l.code + $r.code + "SUPEQ\n";}
    |   l=expression EQUAL r=expression { $code = $l.code + $r.code + "EQUAL\n";}
    |   l=expression NEQ r=expression { $code = $l.code + $r.code + "NEQ\n";}
    ;



assignation returns [ String code ]
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
    :
            TYPE IDENTIFIANT
        {
            String type = evalType($TYPE.text);
            tablesSymboles.putVar($IDENTIFIANT.text, evalType($TYPE.text));
            int addr = getRealGlobalAddress($IDENTIFIANT.text);
            if (type.equals("int"))
                $code = "PUSHI 0\nSTOREG "+addr+"\n";
            else if (type.equals("float"))
                $code = "PUSHF 0.0\nSTOREG "+addr+"\n";
        }
        |   TYPE IDENTIFIANT '=' expression
        {
            String type = evalType($TYPE.text);
            tablesSymboles.putVar($IDENTIFIANT.text, evalType($TYPE.text));
            int addr = getRealGlobalAddress($IDENTIFIANT.text);

            $code += $expression.code;
            $code += "STOREG "+addr+"\n";
        }
        |   IDENTIFIANT '=' expression
        {
            int addr = getRealGlobalAddress($IDENTIFIANT.text);
            $code += $expression.code;
            $code += "STOREG "+addr+"\n";
        }
        |
    ;

instruction returns [ String code ]
    @init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur
    :   expression finInstruction+
        {
            $code += $expression.code+"POP\n";
        }
    |   assignation finInstruction+
        {
            $code += $assignation.code;
        }
    |   READ '(' IDENTIFIANT  ')'finInstruction+
        {
            int addr = getRealGlobalAddress($IDENTIFIANT.text);
            $code += "READ\n";
            $code += "STOREG "+addr+"\n";
        }
    |   WRITE '(' IDENTIFIANT ')' finInstruction+
        {
            int addr = getRealGlobalAddress($IDENTIFIANT.text);
            $code += "PUSHG " + addr+"\n";
            $code += "WRITE\nPOP\n";
        }
    |   whileloop finInstruction+
        {
            $code += $whileloop.code;
        }
    |   block finInstruction+
    |   finInstruction+
    ;

block returns [ String code ]
@init{ $code = "";}
    :   '{' (instruction {$code += $instruction.code;} )* '}'
    ;

whileloop returns [String code, int startlabel, int endlabel ]
@init{ $code = ""; $startlabel = nextLabel(); $endlabel = nextLabel();}
    :   WHILE '(' c=boolexpr ')'
        b=block
        {
            $code += "LABEL " + $startlabel + "\n";
            $code += $c.code;
            $code += "JUMPF "+$endlabel+"\n";
            $code += $b.code;
            $code += "JUMP " + $startlabel + "\n";
            $code += "LABEL " + $endlabel + "\n";
        }
    ;

calcul returns [ String code ]
@init{ $code = "";}
    :
        (instruction { $code += $instruction.code;})*
        {
            $code += "HALT\n";
        }
    ;

finInstruction : WS* (EOL | NEWLINE)+;

// lexer
fragment WORD : ('a'..'z')+;
fragment INT : 'int' ;
fragment FLOAT : 'float';
fragment CHIFFRE : '0'..'9';

OR: 'or';
AND: 'and';
NOT: 'not';

INF : '<';
INFEQ : '<=';
SUP : '>';
SUPEQ : '>=';
EQUAL : '==';
NEQ : '!=';

TRUE : 'true';
FALSE : 'false';

READ : 'readln';
WRITE : 'println';

WHILE : 'while';
FOR : 'for';

ENTIER : CHIFFRE+;
REEL : CHIFFRE+ '.' CHIFFRE*;

TYPE : INT | FLOAT ;
IDENTIFIANT : WORD;

EOL : ';';
NEWLINE : ('\r\n'|'\n')  -> skip;

WS :   (' '|'\t'|NEWLINE)+ -> skip  ;


UNMATCH : . -> skip ;
//...