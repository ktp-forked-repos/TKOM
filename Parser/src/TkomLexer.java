

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TkomLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TkomLexer() {} 
    public TkomLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TkomLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g"; }

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:2:7: ( '*' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:2:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:3:7: ( '+' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:3:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:7: ( '.' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:4:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:5:7: ( '/' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:5:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:6:7: ( 'FALSE' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:6:9: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:7:7: ( 'TRUE' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:7:9: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:8:7: ( 'false' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:8:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:9:7: ( 'true' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:9:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:174:7: ( '-' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:174:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "QUOTATION_MARK"
    public final void mQUOTATION_MARK() throws RecognitionException {
        try {
            int _type = QUOTATION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:177:2: ( '\"' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:177:4: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTATION_MARK"

    // $ANTLR start "ROUND_LEFT_BRACKET"
    public final void mROUND_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = ROUND_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:180:2: ( '(' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:180:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROUND_LEFT_BRACKET"

    // $ANTLR start "ROUND_RIGHT_BRACKET"
    public final void mROUND_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = ROUND_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:183:2: ( ')' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:183:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROUND_RIGHT_BRACKET"

    // $ANTLR start "CURLY_LEFT_BRACKET"
    public final void mCURLY_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = CURLY_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:186:2: ( '{' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:186:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLY_LEFT_BRACKET"

    // $ANTLR start "CURLY_RIGHT_BRACKET"
    public final void mCURLY_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = CURLY_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:189:2: ( '}' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:189:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLY_RIGHT_BRACKET"

    // $ANTLR start "COMA"
    public final void mCOMA() throws RecognitionException {
        try {
            int _type = COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:191:6: ( ',' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:191:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMA"

    // $ANTLR start "EQUALS_SIGN"
    public final void mEQUALS_SIGN() throws RecognitionException {
        try {
            int _type = EQUALS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:194:2: ( '=' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:194:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS_SIGN"

    // $ANTLR start "EXTENSION_IN"
    public final void mEXTENSION_IN() throws RecognitionException {
        try {
            int _type = EXTENSION_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:2: ( 'jpg' | 'jpeg' | 'bmp' | 'gif' | 'png' | 'JPG' | 'JPEG' | 'BMP' | 'GIF' | 'PNG' )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 'j':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='p') ) {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9=='g') ) {
                        alt1=1;
                    }
                    else if ( (LA1_9=='e') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            case 'g':
                {
                alt1=4;
                }
                break;
            case 'p':
                {
                alt1=5;
                }
                break;
            case 'J':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='P') ) {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10=='G') ) {
                        alt1=6;
                    }
                    else if ( (LA1_10=='E') ) {
                        alt1=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 10, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'B':
                {
                alt1=8;
                }
                break;
            case 'G':
                {
                alt1=9;
                }
                break;
            case 'P':
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:4: 'jpg'
                    {
                    match("jpg"); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:12: 'jpeg'
                    {
                    match("jpeg"); 



                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:21: 'bmp'
                    {
                    match("bmp"); 



                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:29: 'gif'
                    {
                    match("gif"); 



                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:37: 'png'
                    {
                    match("png"); 



                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:45: 'JPG'
                    {
                    match("JPG"); 



                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:53: 'JPEG'
                    {
                    match("JPEG"); 



                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:62: 'BMP'
                    {
                    match("BMP"); 



                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:70: 'GIF'
                    {
                    match("GIF"); 



                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:197:78: 'PNG'
                    {
                    match("PNG"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENSION_IN"

    // $ANTLR start "EXTENSION_OUT"
    public final void mEXTENSION_OUT() throws RecognitionException {
        try {
            int _type = EXTENSION_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:200:2: ( 'svg' | 'SVG' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='s') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:200:4: 'svg'
                    {
                    match("svg"); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:200:12: 'SVG'
                    {
                    match("SVG"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENSION_OUT"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:202:6: ( 'load' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:202:8: 'load'
            {
            match("load"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "SAVE"
    public final void mSAVE() throws RecognitionException {
        try {
            int _type = SAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:204:6: ( 'save' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:204:8: 'save'
            {
            match("save"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAVE"

    // $ANTLR start "ASS"
    public final void mASS() throws RecognitionException {
        try {
            int _type = ASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:206:5: ( 'ass' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:206:7: 'ass'
            {
            match("ass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASS"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:208:5: ( 'mod' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:208:7: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "HOUGHC"
    public final void mHOUGHC() throws RecognitionException {
        try {
            int _type = HOUGHC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:210:8: ( 'houghC' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:210:10: 'houghC'
            {
            match("houghC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOUGHC"

    // $ANTLR start "HOUGHL"
    public final void mHOUGHL() throws RecognitionException {
        try {
            int _type = HOUGHL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:212:8: ( 'houghL' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:212:10: 'houghL'
            {
            match("houghL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOUGHL"

    // $ANTLR start "HARRIS"
    public final void mHARRIS() throws RecognitionException {
        try {
            int _type = HARRIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:214:8: ( 'harris' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:214:10: 'harris'
            {
            match("harris"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HARRIS"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:216:4: ( 'do' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:216:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:218:7: ( 'while' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:218:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "PROGRESS"
    public final void mPROGRESS() throws RecognitionException {
        try {
            int _type = PROGRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:220:9: ( 'progress' )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:220:11: 'progress'
            {
            match("progress"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRESS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:222:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:222:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:222:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:5: ( '<' | '>' | '<=' | '>=' | '==' | '!=' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='=') ) {
                    alt4=3;
                }
                else {
                    alt4=1;
                }
                }
                break;
            case '>':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=2;
                }
                }
                break;
            case '=':
                {
                alt4=5;
                }
                break;
            case '!':
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:8: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:14: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:20: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:27: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:34: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:224:41: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REL"

    // $ANTLR start "VARDEP"
    public final void mVARDEP() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:228:8: ( OPERATOR VAR )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:228:10: OPERATOR VAR
            {
            mOPERATOR(); 


            mVAR(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARDEP"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:230:2: ( '-=' | '+=' | '*=' | '/=' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt5=1;
                }
                break;
            case '+':
                {
                alt5=2;
                }
                break;
            case '*':
                {
                alt5=3;
                }
                break;
            case '/':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:230:4: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:231:4: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:232:4: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:233:4: '/='
                    {
                    match("/="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken a1=null;
            CommonToken a2=null;

            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:237:2: (a1= INT |a2= DBL )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:237:4: a1= INT
                    {
                    int a1Start366 = getCharIndex();
                    int a1StartLine366 = getLine();
                    int a1StartCharPos366 = getCharPositionInLine();
                    mINT(); 
                    a1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, a1Start366, getCharIndex()-1);
                    a1.setLine(a1StartLine366);
                    a1.setCharPositionInLine(a1StartCharPos366);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:238:4: a2= DBL
                    {
                    int a2Start375 = getCharIndex();
                    int a2StartLine375 = getLine();
                    int a2StartCharPos375 = getCharPositionInLine();
                    mDBL(); 
                    a2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, a2Start375, getCharIndex()-1);
                    a2.setLine(a2StartLine375);
                    a2.setCharPositionInLine(a2StartCharPos375);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:243:5: ( ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:243:7: ( '0' .. '9' )+
            {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:243:7: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DBL"
    public final void mDBL() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:246:5: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:246:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:246:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:247:3: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:247:3: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match('.'); 

                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:247:19: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:247:31: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:247:31: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:248:8: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:248:12: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:248:24: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:248:24: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:249:8: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:249:8: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DBL"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:254:9: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:254:11: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:254:21: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:254:32: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:255:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='/') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='/') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='*') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:255:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:255:16: (~ ( '\\n' | '\\r' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:255:30: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:255:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:256:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:256:13: ( options {greedy=false; } : . )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='*') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='/') ) {
                                alt19=2;
                            }
                            else if ( ((LA19_1 >= '\u0000' && LA19_1 <= '.')||(LA19_1 >= '0' && LA19_1 <= '\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0 >= '\u0000' && LA19_0 <= ')')||(LA19_0 >= '+' && LA19_0 <= '\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:256:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:259:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:259:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | MINUS | QUOTATION_MARK | ROUND_LEFT_BRACKET | ROUND_RIGHT_BRACKET | CURLY_LEFT_BRACKET | CURLY_RIGHT_BRACKET | COMA | EQUALS_SIGN | EXTENSION_IN | EXTENSION_OUT | LOAD | SAVE | ASS | MOD | HOUGHC | HOUGHL | HARRIS | DO | WHILE | PROGRESS | VAR | REL | OPERATOR | NUM | COMMENT | WS )
        int alt21=34;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:10: T__34
                {
                mT__34(); 


                }
                break;
            case 2 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:16: T__35
                {
                mT__35(); 


                }
                break;
            case 3 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:22: T__36
                {
                mT__36(); 


                }
                break;
            case 4 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:28: T__37
                {
                mT__37(); 


                }
                break;
            case 5 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:34: T__38
                {
                mT__38(); 


                }
                break;
            case 6 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:40: T__39
                {
                mT__39(); 


                }
                break;
            case 7 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:46: T__40
                {
                mT__40(); 


                }
                break;
            case 8 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:52: T__41
                {
                mT__41(); 


                }
                break;
            case 9 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:58: MINUS
                {
                mMINUS(); 


                }
                break;
            case 10 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:64: QUOTATION_MARK
                {
                mQUOTATION_MARK(); 


                }
                break;
            case 11 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:79: ROUND_LEFT_BRACKET
                {
                mROUND_LEFT_BRACKET(); 


                }
                break;
            case 12 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:98: ROUND_RIGHT_BRACKET
                {
                mROUND_RIGHT_BRACKET(); 


                }
                break;
            case 13 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:118: CURLY_LEFT_BRACKET
                {
                mCURLY_LEFT_BRACKET(); 


                }
                break;
            case 14 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:137: CURLY_RIGHT_BRACKET
                {
                mCURLY_RIGHT_BRACKET(); 


                }
                break;
            case 15 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:157: COMA
                {
                mCOMA(); 


                }
                break;
            case 16 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:162: EQUALS_SIGN
                {
                mEQUALS_SIGN(); 


                }
                break;
            case 17 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:174: EXTENSION_IN
                {
                mEXTENSION_IN(); 


                }
                break;
            case 18 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:187: EXTENSION_OUT
                {
                mEXTENSION_OUT(); 


                }
                break;
            case 19 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:201: LOAD
                {
                mLOAD(); 


                }
                break;
            case 20 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:206: SAVE
                {
                mSAVE(); 


                }
                break;
            case 21 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:211: ASS
                {
                mASS(); 


                }
                break;
            case 22 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:215: MOD
                {
                mMOD(); 


                }
                break;
            case 23 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:219: HOUGHC
                {
                mHOUGHC(); 


                }
                break;
            case 24 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:226: HOUGHL
                {
                mHOUGHL(); 


                }
                break;
            case 25 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:233: HARRIS
                {
                mHARRIS(); 


                }
                break;
            case 26 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:240: DO
                {
                mDO(); 


                }
                break;
            case 27 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:243: WHILE
                {
                mWHILE(); 


                }
                break;
            case 28 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:249: PROGRESS
                {
                mPROGRESS(); 


                }
                break;
            case 29 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:258: VAR
                {
                mVAR(); 


                }
                break;
            case 30 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:262: REL
                {
                mREL(); 


                }
                break;
            case 31 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:266: OPERATOR
                {
                mOPERATOR(); 


                }
                break;
            case 32 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:275: NUM
                {
                mNUM(); 


                }
                break;
            case 33 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:279: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 34 :
                // C:\\Documents and Settings\\samsung\\Pulpit\\TKOM\\Tkom.g:1:287: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA6_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\56\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "236:1: NUM : (a1= INT |a2= DBL );";
        }
    }
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\2\56\3\uffff";
    static final String DFA14_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "246:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\46\1\47\1\50\1\52\4\41\1\57\6\uffff\1\60\20\41\12\uffff"+
        "\4\41\2\uffff\21\41\1\133\5\41\1\141\1\41\3\141\1\41\1\141\1\41"+
        "\3\141\1\145\1\41\1\145\1\41\1\150\1\151\2\41\1\uffff\2\41\1\156"+
        "\1\41\1\160\1\uffff\1\141\1\41\1\141\1\uffff\1\162\1\163\2\uffff"+
        "\3\41\1\167\1\uffff\1\170\1\uffff\1\41\2\uffff\2\41\1\175\2\uffff"+
        "\1\41\1\177\1\u0080\1\u0081\1\uffff\1\41\3\uffff\1\u0083\1\uffff";
    static final String DFA21_eofS =
        "\u0084\uffff";
    static final String DFA21_minS =
        "\1\11\2\75\1\60\1\52\1\101\1\122\1\141\1\162\1\75\6\uffff\1\75\1"+
        "\160\1\155\1\151\1\156\1\120\1\115\1\111\1\116\1\141\1\126\1\157"+
        "\1\163\1\157\1\141\1\157\1\150\12\uffff\1\114\1\125\1\154\1\165"+
        "\2\uffff\1\145\1\160\1\146\1\147\1\157\1\105\1\120\1\106\1\107\1"+
        "\147\1\166\1\107\1\141\1\163\1\144\1\165\1\162\1\60\1\151\1\123"+
        "\1\105\1\163\1\145\1\60\1\147\3\60\1\147\1\60\1\107\4\60\1\145\1"+
        "\60\1\144\2\60\1\147\1\162\1\uffff\1\154\1\105\1\60\1\145\1\60\1"+
        "\uffff\1\60\1\162\1\60\1\uffff\2\60\2\uffff\1\150\1\151\1\145\1"+
        "\60\1\uffff\1\60\1\uffff\1\145\2\uffff\1\103\1\163\1\60\2\uffff"+
        "\1\163\3\60\1\uffff\1\163\3\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\175\2\75\1\71\1\75\1\101\1\122\1\141\1\162\1\75\6\uffff\1\75"+
        "\1\160\1\155\1\151\1\162\1\120\1\115\1\111\1\116\1\166\1\126\1\157"+
        "\1\163\3\157\1\150\12\uffff\1\114\1\125\1\154\1\165\2\uffff\1\147"+
        "\1\160\1\146\1\147\1\157\1\107\1\120\1\106\1\107\1\147\1\166\1\107"+
        "\1\141\1\163\1\144\1\165\1\162\1\172\1\151\1\123\1\105\1\163\1\145"+
        "\1\172\1\147\3\172\1\147\1\172\1\107\4\172\1\145\1\172\1\144\2\172"+
        "\1\147\1\162\1\uffff\1\154\1\105\1\172\1\145\1\172\1\uffff\1\172"+
        "\1\162\1\172\1\uffff\2\172\2\uffff\1\150\1\151\1\145\1\172\1\uffff"+
        "\1\172\1\uffff\1\145\2\uffff\1\114\1\163\1\172\2\uffff\1\163\3\172"+
        "\1\uffff\1\163\3\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\12\uffff\1\12\1\13\1\14\1\15\1\16\1\17\21\uffff\1\35\1\36\1\40"+
        "\1\42\1\37\1\1\1\2\1\3\1\41\1\4\4\uffff\1\11\1\20\52\uffff\1\32"+
        "\5\uffff\1\21\3\uffff\1\22\2\uffff\1\25\1\26\4\uffff\1\6\1\uffff"+
        "\1\10\1\uffff\1\24\1\23\3\uffff\1\5\1\7\4\uffff\1\33\1\uffff\1\27"+
        "\1\30\1\31\1\uffff\1\34";
    static final String DFA21_specialS =
        "\u0084\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\42\1\12\5\uffff\1\13\1\14"+
            "\1\1\1\2\1\17\1\11\1\3\1\4\12\43\2\uffff\1\42\1\20\1\42\2\uffff"+
            "\1\41\1\26\3\41\1\5\1\27\2\41\1\25\5\41\1\30\2\41\1\32\1\6\6"+
            "\41\6\uffff\1\34\1\22\1\41\1\37\1\41\1\7\1\23\1\36\1\41\1\21"+
            "\1\41\1\33\1\35\2\41\1\24\2\41\1\31\1\10\2\41\1\40\3\41\1\15"+
            "\1\uffff\1\16",
            "\1\45",
            "\1\45",
            "\12\43",
            "\1\51\4\uffff\1\51\15\uffff\1\45",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\3\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\24\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\15\uffff\1\100",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\111\1\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\1\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\142",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\146",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\157",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\171",
            "",
            "",
            "\1\172\10\uffff\1\173",
            "\1\174",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\176",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | MINUS | QUOTATION_MARK | ROUND_LEFT_BRACKET | ROUND_RIGHT_BRACKET | CURLY_LEFT_BRACKET | CURLY_RIGHT_BRACKET | COMA | EQUALS_SIGN | EXTENSION_IN | EXTENSION_OUT | LOAD | SAVE | ASS | MOD | HOUGHC | HOUGHL | HARRIS | DO | WHILE | PROGRESS | VAR | REL | OPERATOR | NUM | COMMENT | WS );";
        }
    }
 

}