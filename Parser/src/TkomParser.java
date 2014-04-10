

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TkomParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASS", "COMA", "COMMENT", "CURLY_LEFT_BRACKET", "CURLY_RIGHT_BRACKET", "DBL", "DO", "EQUALS_SIGN", "EXPONENT", "EXTENSION_IN", "EXTENSION_OUT", "HARRIS", "HOUGHC", "HOUGHL", "INT", "LOAD", "MINUS", "MOD", "NUM", "OPERATOR", "PROGRESS", "QUOTATION_MARK", "REL", "ROUND_LEFT_BRACKET", "ROUND_RIGHT_BRACKET", "SAVE", "VAR", "VARDEP", "WHILE", "WS", "'*'", "'+'", "'.'", "'/'", "'FALSE'", "'TRUE'", "'false'", "'true'"
    };

    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int ASS=4;
    public static final int COMA=5;
    public static final int COMMENT=6;
    public static final int CURLY_LEFT_BRACKET=7;
    public static final int CURLY_RIGHT_BRACKET=8;
    public static final int DBL=9;
    public static final int DO=10;
    public static final int EQUALS_SIGN=11;
    public static final int EXPONENT=12;
    public static final int EXTENSION_IN=13;
    public static final int EXTENSION_OUT=14;
    public static final int HARRIS=15;
    public static final int HOUGHC=16;
    public static final int HOUGHL=17;
    public static final int INT=18;
    public static final int LOAD=19;
    public static final int MINUS=20;
    public static final int MOD=21;
    public static final int NUM=22;
    public static final int OPERATOR=23;
    public static final int PROGRESS=24;
    public static final int QUOTATION_MARK=25;
    public static final int REL=26;
    public static final int ROUND_LEFT_BRACKET=27;
    public static final int ROUND_RIGHT_BRACKET=28;
    public static final int SAVE=29;
    public static final int VAR=30;
    public static final int VARDEP=31;
    public static final int WHILE=32;
    public static final int WS=33;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TkomParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TkomParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TkomParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g"; }



    // $ANTLR start "eval"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:3:1: eval returns [boolean v1] : (loadV= load |saveV= save |houghcV= houghc |houghlV= houghl |harrisV= harris | doWhileLoop |assV= ass |modV= mod | PROGRESS )+ ;
    public final boolean eval() throws RecognitionException {
        boolean v1 = false;


        String loadV =null;

        String saveV =null;

        TkomParser.houghc_return houghcV =null;

        TkomParser.houghl_return houghlV =null;

        TkomParser.harris_return harrisV =null;

        TkomParser.ass_return assV =null;

        TkomParser.mod_return modV =null;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:2: ( (loadV= load |saveV= save |houghcV= houghc |houghlV= houghl |harrisV= harris | doWhileLoop |assV= ass |modV= mod | PROGRESS )+ )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:4: (loadV= load |saveV= save |houghcV= houghc |houghlV= houghl |harrisV= harris | doWhileLoop |assV= ass |modV= mod | PROGRESS )+
            {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:4: (loadV= load |saveV= save |houghcV= houghc |houghlV= houghl |harrisV= harris | doWhileLoop |assV= ass |modV= mod | PROGRESS )+
            int cnt1=0;
            loop1:
            do {
                int alt1=10;
                switch ( input.LA(1) ) {
                case LOAD:
                    {
                    alt1=1;
                    }
                    break;
                case SAVE:
                    {
                    alt1=2;
                    }
                    break;
                case HOUGHC:
                    {
                    alt1=3;
                    }
                    break;
                case HOUGHL:
                    {
                    alt1=4;
                    }
                    break;
                case HARRIS:
                    {
                    alt1=5;
                    }
                    break;
                case DO:
                    {
                    alt1=6;
                    }
                    break;
                case VAR:
                    {
                    int LA1_8 = input.LA(2);

                    if ( (LA1_8==EQUALS_SIGN) ) {
                        alt1=7;
                    }
                    else if ( (LA1_8==OPERATOR) ) {
                        alt1=8;
                    }


                    }
                    break;
                case PROGRESS:
                    {
                    alt1=9;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:5: loadV= load
            	    {
            	    pushFollow(FOLLOW_load_in_eval20);
            	    loadV=load();

            	    state._fsp--;


            	    v1 = Dummies._load(loadV);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:5:4: saveV= save
            	    {
            	    pushFollow(FOLLOW_save_in_eval33);
            	    saveV=save();

            	    state._fsp--;


            	    v1 = Dummies._save(saveV);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:6:4: houghcV= houghc
            	    {
            	    pushFollow(FOLLOW_houghc_in_eval46);
            	    houghcV=houghc();

            	    state._fsp--;


            	    v1 = TkomSemantic._houghC((houghcV!=null?houghcV.v1:0.0), (houghcV!=null?houghcV.v2:0.0), (houghcV!=null?houghcV.v3:0.0), (houghcV!=null?houghcV.v4:0.0));

            	    }
            	    break;
            	case 4 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:7:4: houghlV= houghl
            	    {
            	    pushFollow(FOLLOW_houghl_in_eval58);
            	    houghlV=houghl();

            	    state._fsp--;


            	    v1 = TkomSemantic._houghL((houghlV!=null?houghlV.v1:0.0), (houghlV!=null?houghlV.v2:0.0), (houghlV!=null?houghlV.v3:0.0), (houghlV!=null?houghlV.v4:0.0), (houghlV!=null?houghlV.v5:0.0), (houghlV!=null?houghlV.v6:0.0), (houghlV!=null?houghlV.v7:0.0));

            	    }
            	    break;
            	case 5 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:8:4: harrisV= harris
            	    {
            	    pushFollow(FOLLOW_harris_in_eval70);
            	    harrisV=harris();

            	    state._fsp--;


            	    v1 = TkomSemantic._harris((harrisV!=null?harrisV.v1:0.0), (harrisV!=null?harrisV.v2:0.0), (harrisV!=null?harrisV.v3:0.0), (harrisV!=null?harrisV.v4:0.0), (harrisV!=null?harrisV.v5:false), (harrisV!=null?harrisV.v6:0.0));

            	    }
            	    break;
            	case 6 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:9:4: doWhileLoop
            	    {
            	    pushFollow(FOLLOW_doWhileLoop_in_eval77);
            	    doWhileLoop();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:10:4: assV= ass
            	    {
            	    pushFollow(FOLLOW_ass_in_eval88);
            	    assV=ass();

            	    state._fsp--;


            	    v1 = Dummies._ass((assV!=null?assV.v1:null), (assV!=null?assV.v2:0.0));

            	    }
            	    break;
            	case 8 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:11:4: modV= mod
            	    {
            	    pushFollow(FOLLOW_mod_in_eval101);
            	    modV=mod();

            	    state._fsp--;


            	    v1 = Dummies._mod((modV!=null?modV.v1:null), (modV!=null?modV.v2:null), (modV!=null?modV.v3:0.0));

            	    }
            	    break;
            	case 9 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:12:4: PROGRESS
            	    {
            	    match(input,PROGRESS,FOLLOW_PROGRESS_in_eval110); 

            	    v1 = Dummies._progress();

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "eval"



    // $ANTLR start "load"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:16:1: load returns [String str] : LOAD ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_IN QUOTATION_MARK ROUND_RIGHT_BRACKET ;
    public final String load() throws RecognitionException {
        String str = null;


        Token a2=null;
        String a1 =null;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:17:2: ( LOAD ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_IN QUOTATION_MARK ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:17:4: LOAD ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_IN QUOTATION_MARK ROUND_RIGHT_BRACKET
            {
            match(input,LOAD,FOLLOW_LOAD_in_load136); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_load140); 

            match(input,QUOTATION_MARK,FOLLOW_QUOTATION_MARK_in_load144); 

            pushFollow(FOLLOW_path_in_load152);
            a1=path();

            state._fsp--;


            str = a1;

            a2=(Token)match(input,EXTENSION_IN,FOLLOW_EXTENSION_IN_in_load162); 

            str += "." + (a2!=null?a2.getText():null);

            match(input,QUOTATION_MARK,FOLLOW_QUOTATION_MARK_in_load168); 

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_load172); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "load"



    // $ANTLR start "save"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:25:1: save returns [String str] : SAVE ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_OUT QUOTATION_MARK ROUND_RIGHT_BRACKET ;
    public final String save() throws RecognitionException {
        String str = null;


        Token a2=null;
        String a1 =null;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:26:2: ( SAVE ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_OUT QUOTATION_MARK ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:26:5: SAVE ROUND_LEFT_BRACKET QUOTATION_MARK a1= path a2= EXTENSION_OUT QUOTATION_MARK ROUND_RIGHT_BRACKET
            {
            match(input,SAVE,FOLLOW_SAVE_in_save188); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_save192); 

            match(input,QUOTATION_MARK,FOLLOW_QUOTATION_MARK_in_save196); 

            pushFollow(FOLLOW_path_in_save204);
            a1=path();

            state._fsp--;


            str = a1;

            a2=(Token)match(input,EXTENSION_OUT,FOLLOW_EXTENSION_OUT_in_save214); 

            str += "."+(a2!=null?a2.getText():null);

            match(input,QUOTATION_MARK,FOLLOW_QUOTATION_MARK_in_save219); 

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_save223); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "save"



    // $ANTLR start "path"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:34:1: path returns [String v1] : (a1= pathPart )+ ( '+' a2= VAR '+' )? '.' ;
    public final String path() throws RecognitionException {
        String v1 = null;


        Token a2=null;
        String a1 =null;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:35:2: ( (a1= pathPart )+ ( '+' a2= VAR '+' )? '.' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:35:4: (a1= pathPart )+ ( '+' a2= VAR '+' )? '.'
            {
            v1 ="";

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:36:3: (a1= pathPart )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:36:4: a1= pathPart
            	    {
            	    pushFollow(FOLLOW_pathPart_in_path248);
            	    a1=pathPart();

            	    state._fsp--;


            	    v1 += a1;

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:37:3: ( '+' a2= VAR '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:38:3: '+' a2= VAR '+'
                    {
                    match(input,35,FOLLOW_35_in_path260); 

                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_path268); 

                    v1 += String.valueOf(TkomSemantic._get((a2!=null?a2.getText():null)));

                    match(input,35,FOLLOW_35_in_path275); 

                    }
                    break;

            }


            match(input,36,FOLLOW_36_in_path284); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "path"



    // $ANTLR start "pathPart"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:45:1: fragment pathPart returns [String v1] : '/' (a1= ( VAR | INT ) )+ ;
    public final String pathPart() throws RecognitionException {
        String v1 = null;


        Token a1=null;

        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:46:2: ( '/' (a1= ( VAR | INT ) )+ )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:46:4: '/' (a1= ( VAR | INT ) )+
            {
            match(input,37,FOLLOW_37_in_pathPart300); 

            v1 = "/";

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:47:7: (a1= ( VAR | INT ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==INT||LA4_0==VAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:47:7: a1= ( VAR | INT )
            	    {
            	    a1=(Token)input.LT(1);

            	    if ( input.LA(1)==INT||input.LA(1)==VAR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            v1 += (a1!=null?a1.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "pathPart"


    public static class houghc_return extends ParserRuleReturnScope {
        public double v1;
        public double v2;
        public double v3;
        public double v4;
    };


    // $ANTLR start "houghc"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:50:1: houghc returns [double v1, double v2, double v3, double v4] : HOUGHC ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp ROUND_RIGHT_BRACKET ;
    public final TkomParser.houghc_return houghc() throws RecognitionException {
        TkomParser.houghc_return retval = new TkomParser.houghc_return();
        retval.start = input.LT(1);


        double a1 =0.0;

        double a2 =0.0;

        double a3 =0.0;

        double a4 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:51:2: ( HOUGHC ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:51:4: HOUGHC ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp ROUND_RIGHT_BRACKET
            {
            match(input,HOUGHC,FOLLOW_HOUGHC_in_houghc341); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_houghc345); 

            pushFollow(FOLLOW_additionExp_in_houghc353);
            a1=additionExp();

            state._fsp--;


            retval.v1 = a1;

            match(input,COMA,FOLLOW_COMA_in_houghc359); 

            pushFollow(FOLLOW_additionExp_in_houghc367);
            a2=additionExp();

            state._fsp--;


            retval.v2 = a2;

            match(input,COMA,FOLLOW_COMA_in_houghc373); 

            pushFollow(FOLLOW_additionExp_in_houghc381);
            a3=additionExp();

            state._fsp--;


            retval.v3 = a3;

            match(input,COMA,FOLLOW_COMA_in_houghc387); 

            pushFollow(FOLLOW_additionExp_in_houghc395);
            a4=additionExp();

            state._fsp--;


            retval.v4 = a4;

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_houghc401); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "houghc"


    public static class houghl_return extends ParserRuleReturnScope {
        public double v1;
        public double v2;
        public double v3;
        public double v4;
        public double v5;
        public double v6;
        public double v7;
    };


    // $ANTLR start "houghl"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:63:1: houghl returns [double v1, double v2, double v3, double v4, double v5, double v6, double v7] : HOUGHL ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= additionExp COMA a6= additionExp COMA a7= additionExp ROUND_RIGHT_BRACKET ;
    public final TkomParser.houghl_return houghl() throws RecognitionException {
        TkomParser.houghl_return retval = new TkomParser.houghl_return();
        retval.start = input.LT(1);


        double a1 =0.0;

        double a2 =0.0;

        double a3 =0.0;

        double a4 =0.0;

        double a5 =0.0;

        double a6 =0.0;

        double a7 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:64:2: ( HOUGHL ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= additionExp COMA a6= additionExp COMA a7= additionExp ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:64:4: HOUGHL ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= additionExp COMA a6= additionExp COMA a7= additionExp ROUND_RIGHT_BRACKET
            {
            match(input,HOUGHL,FOLLOW_HOUGHL_in_houghl419); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_houghl423); 

            pushFollow(FOLLOW_additionExp_in_houghl431);
            a1=additionExp();

            state._fsp--;


            retval.v1 = a1;

            match(input,COMA,FOLLOW_COMA_in_houghl437); 

            pushFollow(FOLLOW_additionExp_in_houghl445);
            a2=additionExp();

            state._fsp--;


            retval.v2 = a2;

            match(input,COMA,FOLLOW_COMA_in_houghl451); 

            pushFollow(FOLLOW_additionExp_in_houghl459);
            a3=additionExp();

            state._fsp--;


            retval.v3 = a3;

            match(input,COMA,FOLLOW_COMA_in_houghl465); 

            pushFollow(FOLLOW_additionExp_in_houghl473);
            a4=additionExp();

            state._fsp--;


            retval.v4 = a4;

            match(input,COMA,FOLLOW_COMA_in_houghl479); 

            pushFollow(FOLLOW_additionExp_in_houghl487);
            a5=additionExp();

            state._fsp--;


            retval.v5 = a5;

            match(input,COMA,FOLLOW_COMA_in_houghl493); 

            pushFollow(FOLLOW_additionExp_in_houghl501);
            a6=additionExp();

            state._fsp--;


            retval.v6 = a6;

            match(input,COMA,FOLLOW_COMA_in_houghl507); 

            pushFollow(FOLLOW_additionExp_in_houghl515);
            a7=additionExp();

            state._fsp--;


            retval.v7 = a7;

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_houghl522); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "houghl"


    public static class harris_return extends ParserRuleReturnScope {
        public double v1;
        public double v2;
        public double v3;
        public double v4;
        public boolean v5;
        public double v6;
    };


    // $ANTLR start "harris"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:82:1: harris returns [double v1, double v2, double v3, double v4, boolean v5, double v6] : HARRIS ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= logic_val COMA a6= additionExp ROUND_RIGHT_BRACKET ;
    public final TkomParser.harris_return harris() throws RecognitionException {
        TkomParser.harris_return retval = new TkomParser.harris_return();
        retval.start = input.LT(1);


        double a1 =0.0;

        double a2 =0.0;

        double a3 =0.0;

        double a4 =0.0;

        boolean a5 =false;

        double a6 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:83:2: ( HARRIS ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= logic_val COMA a6= additionExp ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:83:4: HARRIS ROUND_LEFT_BRACKET a1= additionExp COMA a2= additionExp COMA a3= additionExp COMA a4= additionExp COMA a5= logic_val COMA a6= additionExp ROUND_RIGHT_BRACKET
            {
            match(input,HARRIS,FOLLOW_HARRIS_in_harris538); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_harris542); 

            pushFollow(FOLLOW_additionExp_in_harris550);
            a1=additionExp();

            state._fsp--;


            retval.v1 = a1;

            match(input,COMA,FOLLOW_COMA_in_harris556); 

            pushFollow(FOLLOW_additionExp_in_harris564);
            a2=additionExp();

            state._fsp--;


            retval.v2 = a2;

            match(input,COMA,FOLLOW_COMA_in_harris570); 

            pushFollow(FOLLOW_additionExp_in_harris578);
            a3=additionExp();

            state._fsp--;


            retval.v3 = a3;

            match(input,COMA,FOLLOW_COMA_in_harris584); 

            pushFollow(FOLLOW_additionExp_in_harris592);
            a4=additionExp();

            state._fsp--;


            retval.v4 = a4;

            match(input,COMA,FOLLOW_COMA_in_harris598); 

            pushFollow(FOLLOW_logic_val_in_harris606);
            a5=logic_val();

            state._fsp--;


            retval.v5 = a5;

            match(input,COMA,FOLLOW_COMA_in_harris612); 

            pushFollow(FOLLOW_additionExp_in_harris620);
            a6=additionExp();

            state._fsp--;


            retval.v6 = a6;

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_harris626); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "harris"


    public static class doWhileLoop_return extends ParserRuleReturnScope {
        public double v1;
        public String v2;
        public double v3;
    };


    // $ANTLR start "doWhileLoop"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:99:1: doWhileLoop returns [double v1, String v2, double v3] : DO CURLY_LEFT_BRACKET eval CURLY_RIGHT_BRACKET WHILE ROUND_LEFT_BRACKET a1= additionExp a2= REL a3= additionExp ROUND_RIGHT_BRACKET ;
    public final TkomParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
        TkomParser.doWhileLoop_return retval = new TkomParser.doWhileLoop_return();
        retval.start = input.LT(1);


        Token a2=null;
        double a1 =0.0;

        double a3 =0.0;


        int mark = input.mark();	
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:101:2: ( DO CURLY_LEFT_BRACKET eval CURLY_RIGHT_BRACKET WHILE ROUND_LEFT_BRACKET a1= additionExp a2= REL a3= additionExp ROUND_RIGHT_BRACKET )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:102:10: DO CURLY_LEFT_BRACKET eval CURLY_RIGHT_BRACKET WHILE ROUND_LEFT_BRACKET a1= additionExp a2= REL a3= additionExp ROUND_RIGHT_BRACKET
            {
            match(input,DO,FOLLOW_DO_in_doWhileLoop665); 

            match(input,CURLY_LEFT_BRACKET,FOLLOW_CURLY_LEFT_BRACKET_in_doWhileLoop676); 

            pushFollow(FOLLOW_eval_in_doWhileLoop680);
            eval();

            state._fsp--;


            match(input,CURLY_RIGHT_BRACKET,FOLLOW_CURLY_RIGHT_BRACKET_in_doWhileLoop690); 

            match(input,WHILE,FOLLOW_WHILE_in_doWhileLoop701); 

            match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_doWhileLoop705); 

            pushFollow(FOLLOW_additionExp_in_doWhileLoop711);
            a1=additionExp();

            state._fsp--;


            retval.v1 = a1;

            a2=(Token)match(input,REL,FOLLOW_REL_in_doWhileLoop719); 

            retval.v2 = (a2!=null?a2.getText():null);

            pushFollow(FOLLOW_additionExp_in_doWhileLoop727);
            a3=additionExp();

            state._fsp--;


            retval.v3 = a3;

            match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_doWhileLoop733); 


            		if ((a2!=null?a2.getText():null).equals("==") && a1 == a3)
            			input.rewind(mark);
            		else if ((a2!=null?a2.getText():null).equals("!=") && a1 != a3)
            			input.rewind(mark);
            		else if ((a2!=null?a2.getText():null).equals(">") && a1 > a3)
            			input.rewind(mark);
            		else if ((a2!=null?a2.getText():null).equals("<") && a1 < a3)
            			input.rewind(mark);
            		else if ((a2!=null?a2.getText():null).equals(">=") && a1 >= a3)
            			input.rewind(mark);
            		else if ((a2!=null?a2.getText():null).equals("<=") && a1 <= a3)
            			input.rewind(mark);
                    

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doWhileLoop"


    public static class ass_return extends ParserRuleReturnScope {
        public String v1;
        public double v2;
    };


    // $ANTLR start "ass"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:130:1: ass returns [String v1, double v2] : a1= VAR EQUALS_SIGN a2= additionExp ;
    public final TkomParser.ass_return ass() throws RecognitionException {
        TkomParser.ass_return retval = new TkomParser.ass_return();
        retval.start = input.LT(1);


        Token a1=null;
        double a2 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:131:2: (a1= VAR EQUALS_SIGN a2= additionExp )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:131:4: a1= VAR EQUALS_SIGN a2= additionExp
            {
            a1=(Token)match(input,VAR,FOLLOW_VAR_in_ass763); 

            retval.v1 = (a1!=null?a1.getText():null);

            match(input,EQUALS_SIGN,FOLLOW_EQUALS_SIGN_in_ass769); 

            pushFollow(FOLLOW_additionExp_in_ass777);
            a2=additionExp();

            state._fsp--;


            retval.v2 = a2;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ass"


    public static class mod_return extends ParserRuleReturnScope {
        public String v1;
        public String v2;
        public double v3;
    };


    // $ANTLR start "mod"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:136:1: mod returns [String v1, String v2, double v3] : a1= VAR a2= OPERATOR a3= additionExp ;
    public final TkomParser.mod_return mod() throws RecognitionException {
        TkomParser.mod_return retval = new TkomParser.mod_return();
        retval.start = input.LT(1);


        Token a1=null;
        Token a2=null;
        double a3 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:137:2: (a1= VAR a2= OPERATOR a3= additionExp )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:137:4: a1= VAR a2= OPERATOR a3= additionExp
            {
            a1=(Token)match(input,VAR,FOLLOW_VAR_in_mod799); 

            retval.v1 = (a1!=null?a1.getText():null);

            a2=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_mod809); 

            retval.v2 = (a2!=null?a2.getText():null);

            pushFollow(FOLLOW_additionExp_in_mod819);
            a3=additionExp();

            state._fsp--;


            retval.v3 = a3;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mod"



    // $ANTLR start "additionExp"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:142:1: additionExp returns [double v1] : a1= multiplyExp ( '-' a2= multiplyExp | '+' a2= multiplyExp )* ;
    public final double additionExp() throws RecognitionException {
        double v1 = 0.0;


        double a1 =0.0;

        double a2 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:143:2: (a1= multiplyExp ( '-' a2= multiplyExp | '+' a2= multiplyExp )* )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:143:4: a1= multiplyExp ( '-' a2= multiplyExp | '+' a2= multiplyExp )*
            {
            pushFollow(FOLLOW_multiplyExp_in_additionExp840);
            a1=multiplyExp();

            state._fsp--;


            v1 = a1;

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:144:11: ( '-' a2= multiplyExp | '+' a2= multiplyExp )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS) ) {
                    alt5=1;
                }
                else if ( (LA5_0==35) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:145:11: '-' a2= multiplyExp
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_additionExp867); 

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp871);
            	    a2=multiplyExp();

            	    state._fsp--;


            	    v1 -= a2;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:146:12: '+' a2= multiplyExp
            	    {
            	    match(input,35,FOLLOW_35_in_additionExp886); 

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp890);
            	    a2=multiplyExp();

            	    state._fsp--;


            	    v1 += a2;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "additionExp"



    // $ANTLR start "multiplyExp"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:150:1: multiplyExp returns [double v1] : a1= atomExp ( '*' a2= atomExp | '/' a2= atomExp )* ;
    public final double multiplyExp() throws RecognitionException {
        double v1 = 0.0;


        double a1 =0.0;

        double a2 =0.0;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:151:2: (a1= atomExp ( '*' a2= atomExp | '/' a2= atomExp )* )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:151:4: a1= atomExp ( '*' a2= atomExp | '/' a2= atomExp )*
            {
            pushFollow(FOLLOW_atomExp_in_multiplyExp925);
            a1=atomExp();

            state._fsp--;


            v1 =  a1;

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:152:3: ( '*' a2= atomExp | '/' a2= atomExp )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }
                else if ( (LA6_0==37) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:153:3: '*' a2= atomExp
            	    {
            	    match(input,34,FOLLOW_34_in_multiplyExp935); 

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp939);
            	    a2=atomExp();

            	    state._fsp--;


            	    v1 *= a2;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:154:13: '/' a2= atomExp
            	    {
            	    match(input,37,FOLLOW_37_in_multiplyExp956); 

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp960);
            	    a2=atomExp();

            	    state._fsp--;


            	    v1 /= a2;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "multiplyExp"



    // $ANTLR start "atomExp"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:158:1: atomExp returns [double v1] : (min+= MINUS )? (a1= NUM |a1= VAR | '(' exp= additionExp ')' ) ;
    public final double atomExp() throws RecognitionException {
        double v1 = 0.0;


        Token a1=null;
        Token min=null;
        List list_min=null;
        double exp =0.0;


        int inv=1;
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:160:2: ( (min+= MINUS )? (a1= NUM |a1= VAR | '(' exp= additionExp ')' ) )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:160:4: (min+= MINUS )? (a1= NUM |a1= VAR | '(' exp= additionExp ')' )
            {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:160:4: (min+= MINUS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MINUS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:160:5: min+= MINUS
                    {
                    min=(Token)match(input,MINUS,FOLLOW_MINUS_in_atomExp1004); 
                    if (list_min==null) list_min=new ArrayList();
                    list_min.add(min);


                    }
                    break;

            }


            inv = (list_min!=null)?((list_min.size() % 2 !=0)? -1:1) : 1;

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:161:3: (a1= NUM |a1= VAR | '(' exp= additionExp ')' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NUM:
                {
                alt8=1;
                }
                break;
            case VAR:
                {
                alt8=2;
                }
                break;
            case ROUND_LEFT_BRACKET:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:162:3: a1= NUM
                    {
                    a1=(Token)match(input,NUM,FOLLOW_NUM_in_atomExp1018); 

                    v1 = inv*Double.parseDouble((a1!=null?a1.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:163:5: a1= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_atomExp1028); 

                    v1 = inv*TkomSemantic._get((a1!=null?a1.getText():null));

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:164:4: '(' exp= additionExp ')'
                    {
                    match(input,ROUND_LEFT_BRACKET,FOLLOW_ROUND_LEFT_BRACKET_in_atomExp1035); 

                    pushFollow(FOLLOW_additionExp_in_atomExp1039);
                    exp=additionExp();

                    state._fsp--;


                    match(input,ROUND_RIGHT_BRACKET,FOLLOW_ROUND_RIGHT_BRACKET_in_atomExp1041); 

                    v1 = inv*exp;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "atomExp"



    // $ANTLR start "logic_val"
    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:168:1: logic_val returns [boolean v1] : ( ( 'TRUE' | 'true' ) | ( 'FALSE' | 'false' ) );
    public final boolean logic_val() throws RecognitionException {
        boolean v1 = false;


        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:169:2: ( ( 'TRUE' | 'true' ) | ( 'FALSE' | 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39||LA9_0==41) ) {
                alt9=1;
            }
            else if ( (LA9_0==38||LA9_0==40) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:169:4: ( 'TRUE' | 'true' )
                    {
                    if ( input.LA(1)==39||input.LA(1)==41 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    v1 = true;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:171:3: ( 'FALSE' | 'false' )
                    {
                    if ( input.LA(1)==38||input.LA(1)==40 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    v1 = false;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v1;
    }
    // $ANTLR end "logic_val"

    // Delegated rules


 

    public static final BitSet FOLLOW_load_in_eval20 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_save_in_eval33 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_houghc_in_eval46 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_houghl_in_eval58 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_harris_in_eval70 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_doWhileLoop_in_eval77 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_ass_in_eval88 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_mod_in_eval101 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_PROGRESS_in_eval110 = new BitSet(new long[]{0x00000000610B8402L});
    public static final BitSet FOLLOW_LOAD_in_load136 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_load140 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUOTATION_MARK_in_load144 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_path_in_load152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EXTENSION_IN_in_load162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUOTATION_MARK_in_load168 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_load172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_in_save188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_save192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUOTATION_MARK_in_save196 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_path_in_save204 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EXTENSION_OUT_in_save214 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_QUOTATION_MARK_in_save219 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_save223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPart_in_path248 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_35_in_path260 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_path268 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_path275 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_path284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_pathPart300 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_set_in_pathPart310 = new BitSet(new long[]{0x0000000040040002L});
    public static final BitSet FOLLOW_HOUGHC_in_houghc341 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_houghc345 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghc353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghc359 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghc367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghc373 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghc381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghc387 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghc395 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_houghc401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUGHL_in_houghl419 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_houghl423 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl437 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl451 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl465 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl479 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl493 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_houghl507 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_houghl515 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_houghl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HARRIS_in_harris538 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_harris542 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_harris550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_harris556 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_harris564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_harris570 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_harris578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_harris584 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_harris592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_harris598 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_logic_val_in_harris606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_harris612 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_harris620 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_harris626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doWhileLoop665 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CURLY_LEFT_BRACKET_in_doWhileLoop676 = new BitSet(new long[]{0x00000000610B8400L});
    public static final BitSet FOLLOW_eval_in_doWhileLoop680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_RIGHT_BRACKET_in_doWhileLoop690 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WHILE_in_doWhileLoop701 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_doWhileLoop705 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_doWhileLoop711 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_REL_in_doWhileLoop719 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_doWhileLoop727 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_doWhileLoop733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_ass763 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_SIGN_in_ass769 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_ass777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_mod799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_OPERATOR_in_mod809 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_mod819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp840 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_MINUS_in_additionExp867 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp871 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_35_in_additionExp886 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp890 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp925 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_34_in_multiplyExp935 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp939 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_37_in_multiplyExp956 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp960 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_MINUS_in_atomExp1004 = new BitSet(new long[]{0x0000000048400000L});
    public static final BitSet FOLLOW_NUM_in_atomExp1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_atomExp1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_LEFT_BRACKET_in_atomExp1035 = new BitSet(new long[]{0x0000000048500000L});
    public static final BitSet FOLLOW_additionExp_in_atomExp1039 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_RIGHT_BRACKET_in_atomExp1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logic_val1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logic_val1079 = new BitSet(new long[]{0x0000000000000002L});

}