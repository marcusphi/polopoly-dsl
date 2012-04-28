package com.polopoly.ps.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextContentLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_PP_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__20=20;
    public static final int RULE_COMMENT=6;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalTextContentLexer() {;} 
    public InternalTextContentLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTextContentLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:11:7: ( 'id:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:11:9: 'id:'
            {
            match("id:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:12:7: ( 'inputtemplate:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:12:9: 'inputtemplate:'
            {
            match("inputtemplate:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:13:7: ( 'securityparent:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:13:9: 'securityparent:'
            {
            match("securityparent:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:14:7: ( 'name:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:14:9: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:15:7: ( 'component:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:15:9: 'component:'
            {
            match("component:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:16:7: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:17:7: ( 'ref:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:17:9: 'ref:'
            {
            match("ref:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:18:7: ( 'list:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:18:9: 'list:'
            {
            match("list:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_PP_ID"
    public final void mRULE_PP_ID() throws RecognitionException {
        try {
            int _type = RULE_PP_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1736:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )+ )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1736:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )+
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1736:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PP_ID"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:14: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:16: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:20: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:36: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:37: ( '\\r' )? '\\n'
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:37: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1738:37: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1740:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1740:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1740:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1740:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1740:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1742:10: ( ( '0' .. '9' )+ )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1742:12: ( '0' .. '9' )+
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1742:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1742:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1744:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1746:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1746:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1746:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1746:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:41: ( '\\r' )? '\\n'
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1748:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1750:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1750:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1750:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1752:16: ( . )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1752:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_PP_ID | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=17;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:58: RULE_PP_ID
                {
                mRULE_PP_ID(); 

                }
                break;
            case 10 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:69: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 11 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\4\24\1\uffff\3\24\1\uffff\1\21\1\24\1\uffff\3\21\2\uffff"+
        "\2\24\1\uffff\4\24\1\uffff\2\24\2\uffff\1\24\5\uffff\12\24\1\uffff"+
        "\3\24\1\uffff\1\24\1\uffff\16\24\1\uffff\6\24\1\uffff\1\24\1\uffff";
    static final String DFA16_eofS =
        "\115\uffff";
    static final String DFA16_minS =
        "\1\0\4\60\1\uffff\3\60\1\uffff\1\101\1\60\1\uffff\2\0\1\52\2\uffff"+
        "\2\60\1\uffff\4\60\1\uffff\2\60\2\uffff\1\60\5\uffff\12\60\1\uffff"+
        "\3\60\1\uffff\1\60\1\uffff\16\60\1\uffff\6\60\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\4\172\1\uffff\3\172\1\uffff\1\172\1\71\1\uffff\2\uffff"+
        "\1\57\2\uffff\2\172\1\uffff\4\172\1\uffff\2\172\2\uffff\1\71\5\uffff"+
        "\12\172\1\uffff\3\172\1\uffff\1\172\1\uffff\16\172\1\uffff\6\172"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\6\3\uffff\1\12\2\uffff\1\11\3\uffff\1\20\1\21\2\uffff"+
        "\1\11\4\uffff\1\6\2\uffff\1\12\1\13\1\uffff\1\15\1\16\1\17\1\20"+
        "\1\1\12\uffff\1\7\3\uffff\1\4\1\uffff\1\10\16\uffff\1\5\6\uffff"+
        "\1\2\1\uffff\1\3";
    static final String DFA16_specialS =
        "\1\1\14\uffff\1\2\1\0\76\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\1\11\3\21\1\16\6"+
            "\21\1\14\1\17\12\13\1\5\6\21\32\10\3\21\1\12\1\10\1\21\2\10"+
            "\1\4\5\10\1\1\2\10\1\7\1\10\1\3\3\10\1\6\1\2\7\10\uff85\21",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\3\25\1\22\11\25\1"+
            "\23\14\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\26\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\27\31\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\16\25\1\30\13\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\32\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\10\25\1\33\21\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\36",
            "",
            "\0\37",
            "\0\37",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\12\25\1\43\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\44\12\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\2\25\1\45\27\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\14\25\1\46\15\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\14\25\1\47\15\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\5\25\1\50\24\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\22\25\1\51\7\25",
            "",
            "",
            "\12\36",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\24\25\1\52\5\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\24\25\1\53\5\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\54\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\55\12\25",
            "\12\25\1\56\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\57\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\60\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\21\25\1\61\10\25",
            "\12\25\1\62\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\16\25\1\63\13\25",
            "",
            "\12\25\1\64\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\65\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\10\25\1\66\21\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\15\25\1\67\14\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\70\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\71\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\72\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\14\25\1\73\15\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\30\25\1\74\1\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\15\25\1\75\14\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\76\12\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\77\12\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\100\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\101\16\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\102\31\25",
            "\12\25\1\103\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\104\31\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\21\25\1\105\10\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\106\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\107\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\110\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\15\25\1\111\14\25",
            "\12\25\1\112\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\113\6\25",
            "",
            "\12\25\1\114\6\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_PP_ID | RULE_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_14 = input.LA(1);

                        s = -1;
                        if ( ((LA16_14>='\u0000' && LA16_14<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='i') ) {s = 1;}

                        else if ( (LA16_0=='s') ) {s = 2;}

                        else if ( (LA16_0=='n') ) {s = 3;}

                        else if ( (LA16_0=='c') ) {s = 4;}

                        else if ( (LA16_0==':') ) {s = 5;}

                        else if ( (LA16_0=='r') ) {s = 6;}

                        else if ( (LA16_0=='l') ) {s = 7;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='b')||(LA16_0>='d' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='o' && LA16_0<='q')||(LA16_0>='t' && LA16_0<='z')) ) {s = 8;}

                        else if ( (LA16_0=='#') ) {s = 9;}

                        else if ( (LA16_0=='^') ) {s = 10;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 11;}

                        else if ( (LA16_0=='.') ) {s = 12;}

                        else if ( (LA16_0=='\"') ) {s = 13;}

                        else if ( (LA16_0=='\'') ) {s = 14;}

                        else if ( (LA16_0=='/') ) {s = 15;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 16;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='$' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='-')||(LA16_0>=';' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_13 = input.LA(1);

                        s = -1;
                        if ( ((LA16_13>='\u0000' && LA16_13<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}