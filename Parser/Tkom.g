grammar Tkom;

eval	returns [boolean v1]
	:	(loadV = load 		{$v1 = ScriptInterpreter._load($loadV.str);}
		|saveV = save 		{$v1 = ScriptInterpreter._save($saveV.str);}
		|houghcV = houghc 	{$v1 = ScriptInterpreter._houghC($houghcV.v1, $houghcV.v2, $houghcV.v3, $houghcV.v4);}
		|houghlV = houghl 	{$v1 = ScriptInterpreter._houghL($houghlV.v1, $houghlV.v2, $houghlV.v3, $houghlV.v4, $houghlV.v5, $houghlV.v6, $houghlV.v7);}
		|harrisV = harris	{$v1 = ScriptInterpreter._harris($harrisV.v1, $harrisV.v2, $harrisV.v3, $harrisV.v4, $harrisV.v5, $harrisV.v6);}
		|doWhileLoop 	
		|assV = ass 		{$v1 = ScriptInterpreter._ass($assV.v1, $assV.v2);}
		|modV = mod 		{$v1 = ScriptInterpreter._mod($modV.v1, $modV.v2, $modV.v3);}
		|PROGRESS 		{$v1 = ScriptInterpreter._progress();}
		)+
		;
	
load	returns [String str]
	:	LOAD
		ROUND_LEFT_BRACKET
		QUOTATION_MARK
		a1 = path {$str = $a1.v1;}
		a2 = EXTENSION_IN {$str += "." + $a2.text;}
		QUOTATION_MARK
		ROUND_RIGHT_BRACKET
		;
		
save	returns [String str]
	: 	SAVE
		ROUND_LEFT_BRACKET
		QUOTATION_MARK
		a1 = path {$str = $a1.v1;}
		a2 = EXTENSION_OUT{$str += "."+$a2.text;}
		QUOTATION_MARK
		ROUND_RIGHT_BRACKET
		;	
		
path	returns [String v1]
	:	{$v1 ="";}
		(a1 = pathPart {$v1 += $a1.v1;})+
		(
		'+'
		a2 = VAR {$v1 += String.valueOf(ScriptInterpreter._get($a2.text));} //do poprawy!
		'+'
		)?
		'.'
		;

fragment
pathPart returns [String v1]
	:	'/'{$v1 = "/";}
		 a1 = ( VAR | INT )+ {$v1 += $a1.text;}
		 ;
		 
houghc	returns [double v1, double v2, double v3, double v4]
	:	HOUGHC
		ROUND_LEFT_BRACKET
		a1 = additionExp {$v1 = $a1.v1;}
		COMA
		a2 = additionExp {$v2 = $a2.v1;}
		COMA
		a3 = additionExp {$v3 = $a3.v1;}
		COMA
		a4 = additionExp {$v4 = $a4.v1;}
		ROUND_RIGHT_BRACKET
		;
		
houghl	returns [double v1, double v2, double v3, double v4, double v5, double v6, double v7]
	:	HOUGHL
		ROUND_LEFT_BRACKET
		a1 = additionExp {$v1 = $a1.v1;}
		COMA
		a2 = additionExp {$v2 = $a2.v1;}
		COMA
		a3 = additionExp {$v3 = $a3.v1;}
		COMA
		a4 = additionExp {$v4 = $a4.v1;}
		COMA
		a5 = additionExp {$v5 = $a5.v1;}
		COMA
		a6 = additionExp {$v6 = $a6.v1;}
		COMA
		a7 = additionExp {$v7 = $a7.v1;} 
		ROUND_RIGHT_BRACKET
		;

harris	returns [double v1, double v2, double v3, double v4, boolean v5, double v6]
	:	HARRIS
		ROUND_LEFT_BRACKET
		a1 = additionExp {$v1 = $a1.v1;}
		COMA
		a2 = additionExp {$v2 = $a2.v1;}
		COMA
		a3 = additionExp {$v3 = $a3.v1;}
		COMA
		a4 = additionExp {$v4 = $a4.v1;}
		COMA
		a5 = logic_val {$v5 = $a5.v1;}
		COMA
		a6 = additionExp {$v6 = $a6.v1;}
		ROUND_RIGHT_BRACKET
		;
		
doWhileLoop returns [double v1, String v2, double v3]
@init {int mark = input.mark();	}
	:	      
	        DO
	        CURLY_LEFT_BRACKET
		eval
	      	CURLY_RIGHT_BRACKET
	        WHILE
		ROUND_LEFT_BRACKET
		a1=additionExp {$v1 = $a1.v1;}
		a2=REL {$v2 = $a2.text;}
		a3=additionExp {$v3 = $a3.v1;}
		ROUND_RIGHT_BRACKET
	       {
			if ($a2.text.equals("==") && $a1.v1 == $a3.v1)
				input.rewind(mark);
			else if ($a2.text.equals("!=") && $a1.v1 != $a3.v1)
				input.rewind(mark);
			else if ($a2.text.equals(">") && $a1.v1 > $a3.v1)
				input.rewind(mark);
			else if ($a2.text.equals("<") && $a1.v1 < $a3.v1)
				input.rewind(mark);
			else if ($a2.text.equals(">=") && $a1.v1 >= $a3.v1)
				input.rewind(mark);
			else if ($a2.text.equals("<=") && $a1.v1 <= $a3.v1)
				input.rewind(mark);
	        }
		;

ass	returns [String v1, double v2]
	:	a1 = VAR {$v1 = $a1.text;}
		EQUALS_SIGN
		a2 = additionExp {$v2 = $a2.v1;}
		;

mod	returns [String v1, String v2, double v3]
	:	a1 = VAR {$v1 = $a1.text;}
		a2 = OPERATOR {$v2 = $a2.text;}
		a3 = additionExp {$v3 = $a3.v1;}
		;
	
additionExp returns [double v1]
	:	a1=multiplyExp {$v1 = $a1.v1;} 
         	(
         	'-' a2=multiplyExp {$v1 -= $a2.v1;}
         	|'+' a2=multiplyExp {$v1 += $a2.v1;} 
         	)* 
		;

multiplyExp returns [double v1]
	:	a1=atomExp {$v1 =  $a1.v1;}
		(
		'*' a2=atomExp {$v1 *= $a2.v1;} 
         	| '/' a2=atomExp {$v1 /= $a2.v1;}
         	)* 
    		;

atomExp returns [double v1]
@init {int inv=1;}
	:	(min+=MINUS)? {inv = ($min!=null)?(($min.size() \% 2 !=0)? -1:1) : 1;}
		(
		a1=NUM {$v1 = inv*Double.parseDouble($a1.text);}
		| a1=VAR {$v1 = inv*ScriptInterpreter._get($a1.text);}
		|'(' a1=additionExp ')' {$v1 = inv*$a1.v1;}
		)
		;

logic_val returns [boolean v1]
	:	('TRUE' | 'true') {$v1 = true;}
		|
		('FALSE' | 'false') {$v1 = false;}
		;

MINUS	:	'-';
					
QUOTATION_MARK
	:	'"';

ROUND_LEFT_BRACKET
	:	'(';
	
ROUND_RIGHT_BRACKET
	:	')';
	
CURLY_LEFT_BRACKET
	:	'{';
	
CURLY_RIGHT_BRACKET
	:	'}';
	
COMA	:	',';

EQUALS_SIGN
	:	'=';	

EXTENSION_IN
	:	'jpg' | 'jpeg' | 'bmp' | 'gif' | 'png' | 'JPG' | 'JPEG' | 'BMP' | 'GIF' | 'PNG';
	
EXTENSION_OUT
	:	'svg' | 'SVG';
	
LOAD	:	'load';

SAVE	:	'save';

ASS	:	'ass';

MOD	:	'mod';

HOUGHC	:	'houghC';

HOUGHL	:	'houghL';

HARRIS	:	'harris';

DO	:	'do';

WHILE	:	'while';

PROGRESS:	'progress';

VAR	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

REL	:	 '<' | '>' | '<=' | '>=' | '==' | '!=' ;

fragment
VARDEP	:	OPERATOR VAR;

OPERATOR
	:	'-='
		|'+='
		|'*='
		|'/='
		;
	
NUM
	:	a1 = INT
		|a2 = DBL
		;

fragment
INT	:	('0'..'9')+;

fragment
DBL	:	(
		('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    		|'.' ('0'..'9')+ EXPONENT?
    		|('0'..'9')+ EXPONENT
    		)
    		;

fragment
EXPONENT:	('e'|'E') ('+'|'-')? ('0'..'9')+ ;

COMMENT	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		|'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
		;

WS	:	( ' '
        	| '\t'
        	| '\r'
        	| '\n'
        	) {$channel=HIDDEN;}
    		;