lexer grammar JetonsJava;


OPERATEUR
    : ('<'|'<='|'>'|'>='|'=='|'!='|'=')
    { System.out.print("<span style='color: purple'>"+getText()+"</span>"); }
    ;

MOTCLE
    : ( 'break' | 'class' | 'double' | 'else' | 'if' | 'import' | 'public' | 'static' | 'throws' )
      { System.out.print("<span style='color: green'>[motcle : "+getText()+" ]</span>"); }
    ;

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    { System.out.print("<span style='color: orange'>[ident : "+getText()+" ]</span>"); }
    ;

WHITE_SPACE
    : (' '|'\n'|'\t'|'\r')+
    { System.out.print("<br>"); }
    ;

INDENTDOUBLESLASH
    :('//')~('\n')*
    {System.out.print("");}
    ;

INDENTCOMMENTAIRE
    :'/*' .*? '*/'
    {System.out.print("");}
    ;

NOMBRE
    :('0'..'9')+
    { System.out.print("<span style='color: red'>[nombre : "+getText()+" ]</span>"); }
    ;

UNMATCH
    : .
    { System.out.print(getText()); }
    ;
