package com.polopoly.ps.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.polopoly.ps.dsl.services.TextContentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextContentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PP_ID", "RULE_STRING", "RULE_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'id:'", "'inputtemplate:'", "'securityparent:'", "'name:'", "'component:'", "':'", "'ref:'", "'list:'"
    };
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


        public InternalTextContentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextContentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextContentParser.tokenNames; }
    public String getGrammarFileName() { return "../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g"; }


     
     	private TextContentGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TextContentGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTextContent"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:60:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_COMMENT", "RULE_WS");

        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:64:1: ( ruleTextContent EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:65:1: ruleTextContent EOF
            {
             before(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent66);
            ruleTextContent();

            state._fsp--;

             after(grammarAccess.getTextContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:75:1: ruleTextContent : ( ( rule__TextContent__Group__0 ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_COMMENT", "RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:80:2: ( ( ( rule__TextContent__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:81:1: ( ( rule__TextContent__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:81:1: ( ( rule__TextContent__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:82:1: ( rule__TextContent__Group__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:83:1: ( rule__TextContent__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:83:2: rule__TextContent__Group__0
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0_in_ruleTextContent103);
            rule__TextContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleComponent"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:96:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:97:1: ( ruleComponent EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:98:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent130);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent137); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:105:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:109:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:110:1: ( ( rule__Component__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:110:1: ( ( rule__Component__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:111:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:112:1: ( rule__Component__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:112:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent163);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleReference"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:124:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:125:1: ( ruleReference EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:126:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference190);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference197); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:133:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:137:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:138:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:138:1: ( ( rule__Reference__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:139:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:140:1: ( rule__Reference__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:140:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference223);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:152:1: entryRuleListElement : ruleListElement EOF ;
    public final void entryRuleListElement() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:153:1: ( ruleListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:154:1: ruleListElement EOF
            {
             before(grammarAccess.getListElementRule()); 
            pushFollow(FOLLOW_ruleListElement_in_entryRuleListElement250);
            ruleListElement();

            state._fsp--;

             after(grammarAccess.getListElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListElement257); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListElement"


    // $ANTLR start "ruleListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:161:1: ruleListElement : ( ( rule__ListElement__Alternatives ) ) ;
    public final void ruleListElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:165:2: ( ( ( rule__ListElement__Alternatives ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:166:1: ( ( rule__ListElement__Alternatives ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:166:1: ( ( rule__ListElement__Alternatives ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:167:1: ( rule__ListElement__Alternatives )
            {
             before(grammarAccess.getListElementAccess().getAlternatives()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:168:1: ( rule__ListElement__Alternatives )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:168:2: rule__ListElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ListElement__Alternatives_in_ruleListElement283);
            rule__ListElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElement"


    // $ANTLR start "entryRuleDefaultListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:180:1: entryRuleDefaultListElement : ruleDefaultListElement EOF ;
    public final void entryRuleDefaultListElement() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:181:1: ( ruleDefaultListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:182:1: ruleDefaultListElement EOF
            {
             before(grammarAccess.getDefaultListElementRule()); 
            pushFollow(FOLLOW_ruleDefaultListElement_in_entryRuleDefaultListElement310);
            ruleDefaultListElement();

            state._fsp--;

             after(grammarAccess.getDefaultListElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultListElement317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultListElement"


    // $ANTLR start "ruleDefaultListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:189:1: ruleDefaultListElement : ( ( rule__DefaultListElement__Group__0 ) ) ;
    public final void ruleDefaultListElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:193:2: ( ( ( rule__DefaultListElement__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:194:1: ( ( rule__DefaultListElement__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:194:1: ( ( rule__DefaultListElement__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:195:1: ( rule__DefaultListElement__Group__0 )
            {
             before(grammarAccess.getDefaultListElementAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:196:1: ( rule__DefaultListElement__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:196:2: rule__DefaultListElement__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultListElement__Group__0_in_ruleDefaultListElement343);
            rule__DefaultListElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultListElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultListElement"


    // $ANTLR start "entryRuleAbstractNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:208:1: entryRuleAbstractNamedListElement : ruleAbstractNamedListElement EOF ;
    public final void entryRuleAbstractNamedListElement() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:209:1: ( ruleAbstractNamedListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:210:1: ruleAbstractNamedListElement EOF
            {
             before(grammarAccess.getAbstractNamedListElementRule()); 
            pushFollow(FOLLOW_ruleAbstractNamedListElement_in_entryRuleAbstractNamedListElement370);
            ruleAbstractNamedListElement();

            state._fsp--;

             after(grammarAccess.getAbstractNamedListElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNamedListElement377); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNamedListElement"


    // $ANTLR start "ruleAbstractNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:217:1: ruleAbstractNamedListElement : ( ( rule__AbstractNamedListElement__Alternatives ) ) ;
    public final void ruleAbstractNamedListElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:221:2: ( ( ( rule__AbstractNamedListElement__Alternatives ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:222:1: ( ( rule__AbstractNamedListElement__Alternatives ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:222:1: ( ( rule__AbstractNamedListElement__Alternatives ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:223:1: ( rule__AbstractNamedListElement__Alternatives )
            {
             before(grammarAccess.getAbstractNamedListElementAccess().getAlternatives()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:224:1: ( rule__AbstractNamedListElement__Alternatives )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:224:2: rule__AbstractNamedListElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractNamedListElement__Alternatives_in_ruleAbstractNamedListElement403);
            rule__AbstractNamedListElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNamedListElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNamedListElement"


    // $ANTLR start "entryRuleNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:236:1: entryRuleNamedListElement : ruleNamedListElement EOF ;
    public final void entryRuleNamedListElement() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:237:1: ( ruleNamedListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:238:1: ruleNamedListElement EOF
            {
             before(grammarAccess.getNamedListElementRule()); 
            pushFollow(FOLLOW_ruleNamedListElement_in_entryRuleNamedListElement430);
            ruleNamedListElement();

            state._fsp--;

             after(grammarAccess.getNamedListElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedListElement437); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedListElement"


    // $ANTLR start "ruleNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:245:1: ruleNamedListElement : ( ( rule__NamedListElement__Group__0 ) ) ;
    public final void ruleNamedListElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:249:2: ( ( ( rule__NamedListElement__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:250:1: ( ( rule__NamedListElement__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:250:1: ( ( rule__NamedListElement__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:251:1: ( rule__NamedListElement__Group__0 )
            {
             before(grammarAccess.getNamedListElementAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:252:1: ( rule__NamedListElement__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:252:2: rule__NamedListElement__Group__0
            {
            pushFollow(FOLLOW_rule__NamedListElement__Group__0_in_ruleNamedListElement463);
            rule__NamedListElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedListElement"


    // $ANTLR start "entryRuleNamedListElementWithRefMetadata"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:264:1: entryRuleNamedListElementWithRefMetadata : ruleNamedListElementWithRefMetadata EOF ;
    public final void entryRuleNamedListElementWithRefMetadata() throws RecognitionException {
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:265:1: ( ruleNamedListElementWithRefMetadata EOF )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:266:1: ruleNamedListElementWithRefMetadata EOF
            {
             before(grammarAccess.getNamedListElementWithRefMetadataRule()); 
            pushFollow(FOLLOW_ruleNamedListElementWithRefMetadata_in_entryRuleNamedListElementWithRefMetadata490);
            ruleNamedListElementWithRefMetadata();

            state._fsp--;

             after(grammarAccess.getNamedListElementWithRefMetadataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedListElementWithRefMetadata497); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedListElementWithRefMetadata"


    // $ANTLR start "ruleNamedListElementWithRefMetadata"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:273:1: ruleNamedListElementWithRefMetadata : ( ( rule__NamedListElementWithRefMetadata__Group__0 ) ) ;
    public final void ruleNamedListElementWithRefMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:277:2: ( ( ( rule__NamedListElementWithRefMetadata__Group__0 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:278:1: ( ( rule__NamedListElementWithRefMetadata__Group__0 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:278:1: ( ( rule__NamedListElementWithRefMetadata__Group__0 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:279:1: ( rule__NamedListElementWithRefMetadata__Group__0 )
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getGroup()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:280:1: ( rule__NamedListElementWithRefMetadata__Group__0 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:280:2: rule__NamedListElementWithRefMetadata__Group__0
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__0_in_ruleNamedListElementWithRefMetadata523);
            rule__NamedListElementWithRefMetadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedListElementWithRefMetadata"


    // $ANTLR start "rule__ListElement__Alternatives"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:292:1: rule__ListElement__Alternatives : ( ( ruleDefaultListElement ) | ( ruleAbstractNamedListElement ) );
    public final void rule__ListElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:296:1: ( ( ruleDefaultListElement ) | ( ruleAbstractNamedListElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_PP_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==EOF||LA1_2==20) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==18) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:297:1: ( ruleDefaultListElement )
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:297:1: ( ruleDefaultListElement )
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:298:1: ruleDefaultListElement
                    {
                     before(grammarAccess.getListElementAccess().getDefaultListElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultListElement_in_rule__ListElement__Alternatives559);
                    ruleDefaultListElement();

                    state._fsp--;

                     after(grammarAccess.getListElementAccess().getDefaultListElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:303:6: ( ruleAbstractNamedListElement )
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:303:6: ( ruleAbstractNamedListElement )
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:304:1: ruleAbstractNamedListElement
                    {
                     before(grammarAccess.getListElementAccess().getAbstractNamedListElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractNamedListElement_in_rule__ListElement__Alternatives576);
                    ruleAbstractNamedListElement();

                    state._fsp--;

                     after(grammarAccess.getListElementAccess().getAbstractNamedListElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Alternatives"


    // $ANTLR start "rule__AbstractNamedListElement__Alternatives"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:314:1: rule__AbstractNamedListElement__Alternatives : ( ( ruleNamedListElement ) | ( ruleNamedListElementWithRefMetadata ) );
    public final void rule__AbstractNamedListElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:318:1: ( ( ruleNamedListElement ) | ( ruleNamedListElementWithRefMetadata ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_PP_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==18) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==RULE_PP_ID) ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4==EOF||LA2_4==20) ) {
                                alt2=1;
                            }
                            else if ( (LA2_4==18) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:319:1: ( ruleNamedListElement )
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:319:1: ( ruleNamedListElement )
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:320:1: ruleNamedListElement
                    {
                     before(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNamedListElement_in_rule__AbstractNamedListElement__Alternatives608);
                    ruleNamedListElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:325:6: ( ruleNamedListElementWithRefMetadata )
                    {
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:325:6: ( ruleNamedListElementWithRefMetadata )
                    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:326:1: ruleNamedListElementWithRefMetadata
                    {
                     before(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementWithRefMetadataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNamedListElementWithRefMetadata_in_rule__AbstractNamedListElement__Alternatives625);
                    ruleNamedListElementWithRefMetadata();

                    state._fsp--;

                     after(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementWithRefMetadataParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractNamedListElement__Alternatives"


    // $ANTLR start "rule__TextContent__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:338:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:342:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:343:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__0655);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__0658);
            rule__TextContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0"


    // $ANTLR start "rule__TextContent__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:350:1: rule__TextContent__Group__0__Impl : ( 'id:' ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:354:1: ( ( 'id:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:355:1: ( 'id:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:355:1: ( 'id:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:356:1: 'id:'
            {
             before(grammarAccess.getTextContentAccess().getIdKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__TextContent__Group__0__Impl686); 
             after(grammarAccess.getTextContentAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0__Impl"


    // $ANTLR start "rule__TextContent__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:369:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl rule__TextContent__Group__2 ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:373:1: ( rule__TextContent__Group__1__Impl rule__TextContent__Group__2 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:374:2: rule__TextContent__Group__1__Impl rule__TextContent__Group__2
            {
            pushFollow(FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__1717);
            rule__TextContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__2_in_rule__TextContent__Group__1720);
            rule__TextContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__1"


    // $ANTLR start "rule__TextContent__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:381:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__IdAssignment_1 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:385:1: ( ( ( rule__TextContent__IdAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:386:1: ( ( rule__TextContent__IdAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:386:1: ( ( rule__TextContent__IdAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:387:1: ( rule__TextContent__IdAssignment_1 )
            {
             before(grammarAccess.getTextContentAccess().getIdAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:388:1: ( rule__TextContent__IdAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:388:2: rule__TextContent__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__TextContent__IdAssignment_1_in_rule__TextContent__Group__1__Impl747);
            rule__TextContent__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__1__Impl"


    // $ANTLR start "rule__TextContent__Group__2"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:398:1: rule__TextContent__Group__2 : rule__TextContent__Group__2__Impl rule__TextContent__Group__3 ;
    public final void rule__TextContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:402:1: ( rule__TextContent__Group__2__Impl rule__TextContent__Group__3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:403:2: rule__TextContent__Group__2__Impl rule__TextContent__Group__3
            {
            pushFollow(FOLLOW_rule__TextContent__Group__2__Impl_in_rule__TextContent__Group__2777);
            rule__TextContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__3_in_rule__TextContent__Group__2780);
            rule__TextContent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__2"


    // $ANTLR start "rule__TextContent__Group__2__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:410:1: rule__TextContent__Group__2__Impl : ( 'inputtemplate:' ) ;
    public final void rule__TextContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:414:1: ( ( 'inputtemplate:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:415:1: ( 'inputtemplate:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:415:1: ( 'inputtemplate:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:416:1: 'inputtemplate:'
            {
             before(grammarAccess.getTextContentAccess().getInputtemplateKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__TextContent__Group__2__Impl808); 
             after(grammarAccess.getTextContentAccess().getInputtemplateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__2__Impl"


    // $ANTLR start "rule__TextContent__Group__3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:429:1: rule__TextContent__Group__3 : rule__TextContent__Group__3__Impl rule__TextContent__Group__4 ;
    public final void rule__TextContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:433:1: ( rule__TextContent__Group__3__Impl rule__TextContent__Group__4 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:434:2: rule__TextContent__Group__3__Impl rule__TextContent__Group__4
            {
            pushFollow(FOLLOW_rule__TextContent__Group__3__Impl_in_rule__TextContent__Group__3839);
            rule__TextContent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__4_in_rule__TextContent__Group__3842);
            rule__TextContent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__3"


    // $ANTLR start "rule__TextContent__Group__3__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:441:1: rule__TextContent__Group__3__Impl : ( ( rule__TextContent__InputtemplateAssignment_3 ) ) ;
    public final void rule__TextContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:445:1: ( ( ( rule__TextContent__InputtemplateAssignment_3 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:446:1: ( ( rule__TextContent__InputtemplateAssignment_3 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:446:1: ( ( rule__TextContent__InputtemplateAssignment_3 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:447:1: ( rule__TextContent__InputtemplateAssignment_3 )
            {
             before(grammarAccess.getTextContentAccess().getInputtemplateAssignment_3()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:448:1: ( rule__TextContent__InputtemplateAssignment_3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:448:2: rule__TextContent__InputtemplateAssignment_3
            {
            pushFollow(FOLLOW_rule__TextContent__InputtemplateAssignment_3_in_rule__TextContent__Group__3__Impl869);
            rule__TextContent__InputtemplateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getInputtemplateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__3__Impl"


    // $ANTLR start "rule__TextContent__Group__4"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:458:1: rule__TextContent__Group__4 : rule__TextContent__Group__4__Impl rule__TextContent__Group__5 ;
    public final void rule__TextContent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:462:1: ( rule__TextContent__Group__4__Impl rule__TextContent__Group__5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:463:2: rule__TextContent__Group__4__Impl rule__TextContent__Group__5
            {
            pushFollow(FOLLOW_rule__TextContent__Group__4__Impl_in_rule__TextContent__Group__4899);
            rule__TextContent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__5_in_rule__TextContent__Group__4902);
            rule__TextContent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__4"


    // $ANTLR start "rule__TextContent__Group__4__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:470:1: rule__TextContent__Group__4__Impl : ( 'securityparent:' ) ;
    public final void rule__TextContent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:474:1: ( ( 'securityparent:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:475:1: ( 'securityparent:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:475:1: ( 'securityparent:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:476:1: 'securityparent:'
            {
             before(grammarAccess.getTextContentAccess().getSecurityparentKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__TextContent__Group__4__Impl930); 
             after(grammarAccess.getTextContentAccess().getSecurityparentKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__4__Impl"


    // $ANTLR start "rule__TextContent__Group__5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:489:1: rule__TextContent__Group__5 : rule__TextContent__Group__5__Impl rule__TextContent__Group__6 ;
    public final void rule__TextContent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:493:1: ( rule__TextContent__Group__5__Impl rule__TextContent__Group__6 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:494:2: rule__TextContent__Group__5__Impl rule__TextContent__Group__6
            {
            pushFollow(FOLLOW_rule__TextContent__Group__5__Impl_in_rule__TextContent__Group__5961);
            rule__TextContent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__6_in_rule__TextContent__Group__5964);
            rule__TextContent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__5"


    // $ANTLR start "rule__TextContent__Group__5__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:501:1: rule__TextContent__Group__5__Impl : ( ( rule__TextContent__SecurityparentAssignment_5 ) ) ;
    public final void rule__TextContent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:505:1: ( ( ( rule__TextContent__SecurityparentAssignment_5 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:506:1: ( ( rule__TextContent__SecurityparentAssignment_5 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:506:1: ( ( rule__TextContent__SecurityparentAssignment_5 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:507:1: ( rule__TextContent__SecurityparentAssignment_5 )
            {
             before(grammarAccess.getTextContentAccess().getSecurityparentAssignment_5()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:508:1: ( rule__TextContent__SecurityparentAssignment_5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:508:2: rule__TextContent__SecurityparentAssignment_5
            {
            pushFollow(FOLLOW_rule__TextContent__SecurityparentAssignment_5_in_rule__TextContent__Group__5__Impl991);
            rule__TextContent__SecurityparentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getSecurityparentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__5__Impl"


    // $ANTLR start "rule__TextContent__Group__6"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:518:1: rule__TextContent__Group__6 : rule__TextContent__Group__6__Impl rule__TextContent__Group__7 ;
    public final void rule__TextContent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:522:1: ( rule__TextContent__Group__6__Impl rule__TextContent__Group__7 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:523:2: rule__TextContent__Group__6__Impl rule__TextContent__Group__7
            {
            pushFollow(FOLLOW_rule__TextContent__Group__6__Impl_in_rule__TextContent__Group__61021);
            rule__TextContent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__7_in_rule__TextContent__Group__61024);
            rule__TextContent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__6"


    // $ANTLR start "rule__TextContent__Group__6__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:530:1: rule__TextContent__Group__6__Impl : ( 'name:' ) ;
    public final void rule__TextContent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:534:1: ( ( 'name:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:535:1: ( 'name:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:535:1: ( 'name:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:536:1: 'name:'
            {
             before(grammarAccess.getTextContentAccess().getNameKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__TextContent__Group__6__Impl1052); 
             after(grammarAccess.getTextContentAccess().getNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__6__Impl"


    // $ANTLR start "rule__TextContent__Group__7"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:549:1: rule__TextContent__Group__7 : rule__TextContent__Group__7__Impl rule__TextContent__Group__8 ;
    public final void rule__TextContent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:553:1: ( rule__TextContent__Group__7__Impl rule__TextContent__Group__8 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:554:2: rule__TextContent__Group__7__Impl rule__TextContent__Group__8
            {
            pushFollow(FOLLOW_rule__TextContent__Group__7__Impl_in_rule__TextContent__Group__71083);
            rule__TextContent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__8_in_rule__TextContent__Group__71086);
            rule__TextContent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__7"


    // $ANTLR start "rule__TextContent__Group__7__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:561:1: rule__TextContent__Group__7__Impl : ( ( rule__TextContent__NameAssignment_7 ) ) ;
    public final void rule__TextContent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:565:1: ( ( ( rule__TextContent__NameAssignment_7 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:566:1: ( ( rule__TextContent__NameAssignment_7 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:566:1: ( ( rule__TextContent__NameAssignment_7 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:567:1: ( rule__TextContent__NameAssignment_7 )
            {
             before(grammarAccess.getTextContentAccess().getNameAssignment_7()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:568:1: ( rule__TextContent__NameAssignment_7 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:568:2: rule__TextContent__NameAssignment_7
            {
            pushFollow(FOLLOW_rule__TextContent__NameAssignment_7_in_rule__TextContent__Group__7__Impl1113);
            rule__TextContent__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__7__Impl"


    // $ANTLR start "rule__TextContent__Group__8"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:578:1: rule__TextContent__Group__8 : rule__TextContent__Group__8__Impl rule__TextContent__Group__9 ;
    public final void rule__TextContent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:582:1: ( rule__TextContent__Group__8__Impl rule__TextContent__Group__9 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:583:2: rule__TextContent__Group__8__Impl rule__TextContent__Group__9
            {
            pushFollow(FOLLOW_rule__TextContent__Group__8__Impl_in_rule__TextContent__Group__81143);
            rule__TextContent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__9_in_rule__TextContent__Group__81146);
            rule__TextContent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__8"


    // $ANTLR start "rule__TextContent__Group__8__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:590:1: rule__TextContent__Group__8__Impl : ( ( rule__TextContent__ComponentsAssignment_8 )* ) ;
    public final void rule__TextContent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:594:1: ( ( ( rule__TextContent__ComponentsAssignment_8 )* ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:595:1: ( ( rule__TextContent__ComponentsAssignment_8 )* )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:595:1: ( ( rule__TextContent__ComponentsAssignment_8 )* )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:596:1: ( rule__TextContent__ComponentsAssignment_8 )*
            {
             before(grammarAccess.getTextContentAccess().getComponentsAssignment_8()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:597:1: ( rule__TextContent__ComponentsAssignment_8 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:597:2: rule__TextContent__ComponentsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__ComponentsAssignment_8_in_rule__TextContent__Group__8__Impl1173);
            	    rule__TextContent__ComponentsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTextContentAccess().getComponentsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__8__Impl"


    // $ANTLR start "rule__TextContent__Group__9"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:607:1: rule__TextContent__Group__9 : rule__TextContent__Group__9__Impl rule__TextContent__Group__10 ;
    public final void rule__TextContent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:611:1: ( rule__TextContent__Group__9__Impl rule__TextContent__Group__10 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:612:2: rule__TextContent__Group__9__Impl rule__TextContent__Group__10
            {
            pushFollow(FOLLOW_rule__TextContent__Group__9__Impl_in_rule__TextContent__Group__91204);
            rule__TextContent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__10_in_rule__TextContent__Group__91207);
            rule__TextContent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__9"


    // $ANTLR start "rule__TextContent__Group__9__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:619:1: rule__TextContent__Group__9__Impl : ( ( rule__TextContent__ReferencesAssignment_9 )* ) ;
    public final void rule__TextContent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:623:1: ( ( ( rule__TextContent__ReferencesAssignment_9 )* ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:624:1: ( ( rule__TextContent__ReferencesAssignment_9 )* )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:624:1: ( ( rule__TextContent__ReferencesAssignment_9 )* )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:625:1: ( rule__TextContent__ReferencesAssignment_9 )*
            {
             before(grammarAccess.getTextContentAccess().getReferencesAssignment_9()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:626:1: ( rule__TextContent__ReferencesAssignment_9 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:626:2: rule__TextContent__ReferencesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__ReferencesAssignment_9_in_rule__TextContent__Group__9__Impl1234);
            	    rule__TextContent__ReferencesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTextContentAccess().getReferencesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__9__Impl"


    // $ANTLR start "rule__TextContent__Group__10"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:636:1: rule__TextContent__Group__10 : rule__TextContent__Group__10__Impl ;
    public final void rule__TextContent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:640:1: ( rule__TextContent__Group__10__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:641:2: rule__TextContent__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group__10__Impl_in_rule__TextContent__Group__101265);
            rule__TextContent__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__10"


    // $ANTLR start "rule__TextContent__Group__10__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:647:1: rule__TextContent__Group__10__Impl : ( ( rule__TextContent__ListElementsAssignment_10 )* ) ;
    public final void rule__TextContent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:651:1: ( ( ( rule__TextContent__ListElementsAssignment_10 )* ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:652:1: ( ( rule__TextContent__ListElementsAssignment_10 )* )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:652:1: ( ( rule__TextContent__ListElementsAssignment_10 )* )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:653:1: ( rule__TextContent__ListElementsAssignment_10 )*
            {
             before(grammarAccess.getTextContentAccess().getListElementsAssignment_10()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:654:1: ( rule__TextContent__ListElementsAssignment_10 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:654:2: rule__TextContent__ListElementsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__ListElementsAssignment_10_in_rule__TextContent__Group__10__Impl1292);
            	    rule__TextContent__ListElementsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTextContentAccess().getListElementsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:686:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:690:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:691:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01345);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01348);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:698:1: rule__Component__Group__0__Impl : ( 'component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:702:1: ( ( 'component:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:703:1: ( 'component:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:703:1: ( 'component:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:704:1: 'component:'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Component__Group__0__Impl1376); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:717:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:721:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:722:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11407);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11410);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:729:1: rule__Component__Group__1__Impl : ( ( rule__Component__GroupAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:733:1: ( ( ( rule__Component__GroupAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:734:1: ( ( rule__Component__GroupAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:734:1: ( ( rule__Component__GroupAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:735:1: ( rule__Component__GroupAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getGroupAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:736:1: ( rule__Component__GroupAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:736:2: rule__Component__GroupAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__GroupAssignment_1_in_rule__Component__Group__1__Impl1437);
            rule__Component__GroupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroupAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:746:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:750:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:751:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21467);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21470);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:758:1: rule__Component__Group__2__Impl : ( ':' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:762:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:763:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:763:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:764:1: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__2__Impl1498); 
             after(grammarAccess.getComponentAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:777:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:781:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:782:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31529);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31532);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:789:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:793:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:794:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:794:1: ( ( rule__Component__NameAssignment_3 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:795:1: ( rule__Component__NameAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:796:1: ( rule__Component__NameAssignment_3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:796:2: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl1559);
            rule__Component__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:806:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:810:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:811:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41589);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41592);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:818:1: rule__Component__Group__4__Impl : ( ':' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:822:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:823:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:823:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:824:1: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__4__Impl1620); 
             after(grammarAccess.getComponentAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:837:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:841:1: ( rule__Component__Group__5__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:842:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51651);
            rule__Component__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:848:1: rule__Component__Group__5__Impl : ( ( rule__Component__ValueAssignment_5 ) ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:852:1: ( ( ( rule__Component__ValueAssignment_5 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:853:1: ( ( rule__Component__ValueAssignment_5 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:853:1: ( ( rule__Component__ValueAssignment_5 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:854:1: ( rule__Component__ValueAssignment_5 )
            {
             before(grammarAccess.getComponentAccess().getValueAssignment_5()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:855:1: ( rule__Component__ValueAssignment_5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:855:2: rule__Component__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__Component__ValueAssignment_5_in_rule__Component__Group__5__Impl1678);
            rule__Component__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:877:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:881:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:882:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__01720);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__01723);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:889:1: rule__Reference__Group__0__Impl : ( 'ref:' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:893:1: ( ( 'ref:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:894:1: ( 'ref:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:894:1: ( 'ref:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:895:1: 'ref:'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Reference__Group__0__Impl1751); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:908:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:912:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:913:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__11782);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__11785);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:920:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__GroupAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:924:1: ( ( ( rule__Reference__GroupAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:925:1: ( ( rule__Reference__GroupAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:925:1: ( ( rule__Reference__GroupAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:926:1: ( rule__Reference__GroupAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getGroupAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:927:1: ( rule__Reference__GroupAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:927:2: rule__Reference__GroupAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__GroupAssignment_1_in_rule__Reference__Group__1__Impl1812);
            rule__Reference__GroupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroupAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:937:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:941:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:942:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__21842);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__21845);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:949:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:953:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:954:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:954:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:955:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Reference__Group__2__Impl1873); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:968:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:972:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:973:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__31904);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__31907);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:980:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__NameAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:984:1: ( ( ( rule__Reference__NameAssignment_3 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:985:1: ( ( rule__Reference__NameAssignment_3 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:985:1: ( ( rule__Reference__NameAssignment_3 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:986:1: ( rule__Reference__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_3()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:987:1: ( rule__Reference__NameAssignment_3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:987:2: rule__Reference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_3_in_rule__Reference__Group__3__Impl1934);
            rule__Reference__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:997:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1001:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1002:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__41964);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__41967);
            rule__Reference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1009:1: rule__Reference__Group__4__Impl : ( ':' ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1013:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1014:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1014:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1015:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Reference__Group__4__Impl1995); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1028:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1032:1: ( rule__Reference__Group__5__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1033:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52026);
            rule__Reference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1039:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__ReferredIdAssignment_5 ) ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1043:1: ( ( ( rule__Reference__ReferredIdAssignment_5 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1044:1: ( ( rule__Reference__ReferredIdAssignment_5 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1044:1: ( ( rule__Reference__ReferredIdAssignment_5 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1045:1: ( rule__Reference__ReferredIdAssignment_5 )
            {
             before(grammarAccess.getReferenceAccess().getReferredIdAssignment_5()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1046:1: ( rule__Reference__ReferredIdAssignment_5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1046:2: rule__Reference__ReferredIdAssignment_5
            {
            pushFollow(FOLLOW_rule__Reference__ReferredIdAssignment_5_in_rule__Reference__Group__5__Impl2053);
            rule__Reference__ReferredIdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferredIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__DefaultListElement__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1068:1: rule__DefaultListElement__Group__0 : rule__DefaultListElement__Group__0__Impl rule__DefaultListElement__Group__1 ;
    public final void rule__DefaultListElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1072:1: ( rule__DefaultListElement__Group__0__Impl rule__DefaultListElement__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1073:2: rule__DefaultListElement__Group__0__Impl rule__DefaultListElement__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultListElement__Group__0__Impl_in_rule__DefaultListElement__Group__02095);
            rule__DefaultListElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultListElement__Group__1_in_rule__DefaultListElement__Group__02098);
            rule__DefaultListElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultListElement__Group__0"


    // $ANTLR start "rule__DefaultListElement__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1080:1: rule__DefaultListElement__Group__0__Impl : ( 'list:' ) ;
    public final void rule__DefaultListElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1084:1: ( ( 'list:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1085:1: ( 'list:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1085:1: ( 'list:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1086:1: 'list:'
            {
             before(grammarAccess.getDefaultListElementAccess().getListKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DefaultListElement__Group__0__Impl2126); 
             after(grammarAccess.getDefaultListElementAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultListElement__Group__0__Impl"


    // $ANTLR start "rule__DefaultListElement__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1099:1: rule__DefaultListElement__Group__1 : rule__DefaultListElement__Group__1__Impl ;
    public final void rule__DefaultListElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1103:1: ( rule__DefaultListElement__Group__1__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1104:2: rule__DefaultListElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefaultListElement__Group__1__Impl_in_rule__DefaultListElement__Group__12157);
            rule__DefaultListElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultListElement__Group__1"


    // $ANTLR start "rule__DefaultListElement__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1110:1: rule__DefaultListElement__Group__1__Impl : ( ( rule__DefaultListElement__ReferredIdAssignment_1 ) ) ;
    public final void rule__DefaultListElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1114:1: ( ( ( rule__DefaultListElement__ReferredIdAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1115:1: ( ( rule__DefaultListElement__ReferredIdAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1115:1: ( ( rule__DefaultListElement__ReferredIdAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1116:1: ( rule__DefaultListElement__ReferredIdAssignment_1 )
            {
             before(grammarAccess.getDefaultListElementAccess().getReferredIdAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1117:1: ( rule__DefaultListElement__ReferredIdAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1117:2: rule__DefaultListElement__ReferredIdAssignment_1
            {
            pushFollow(FOLLOW_rule__DefaultListElement__ReferredIdAssignment_1_in_rule__DefaultListElement__Group__1__Impl2184);
            rule__DefaultListElement__ReferredIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultListElementAccess().getReferredIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultListElement__Group__1__Impl"


    // $ANTLR start "rule__NamedListElement__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1131:1: rule__NamedListElement__Group__0 : rule__NamedListElement__Group__0__Impl rule__NamedListElement__Group__1 ;
    public final void rule__NamedListElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1135:1: ( rule__NamedListElement__Group__0__Impl rule__NamedListElement__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1136:2: rule__NamedListElement__Group__0__Impl rule__NamedListElement__Group__1
            {
            pushFollow(FOLLOW_rule__NamedListElement__Group__0__Impl_in_rule__NamedListElement__Group__02218);
            rule__NamedListElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElement__Group__1_in_rule__NamedListElement__Group__02221);
            rule__NamedListElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__0"


    // $ANTLR start "rule__NamedListElement__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1143:1: rule__NamedListElement__Group__0__Impl : ( 'list:' ) ;
    public final void rule__NamedListElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1147:1: ( ( 'list:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1148:1: ( 'list:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1148:1: ( 'list:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1149:1: 'list:'
            {
             before(grammarAccess.getNamedListElementAccess().getListKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__NamedListElement__Group__0__Impl2249); 
             after(grammarAccess.getNamedListElementAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__0__Impl"


    // $ANTLR start "rule__NamedListElement__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1162:1: rule__NamedListElement__Group__1 : rule__NamedListElement__Group__1__Impl rule__NamedListElement__Group__2 ;
    public final void rule__NamedListElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1166:1: ( rule__NamedListElement__Group__1__Impl rule__NamedListElement__Group__2 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1167:2: rule__NamedListElement__Group__1__Impl rule__NamedListElement__Group__2
            {
            pushFollow(FOLLOW_rule__NamedListElement__Group__1__Impl_in_rule__NamedListElement__Group__12280);
            rule__NamedListElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElement__Group__2_in_rule__NamedListElement__Group__12283);
            rule__NamedListElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__1"


    // $ANTLR start "rule__NamedListElement__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1174:1: rule__NamedListElement__Group__1__Impl : ( ( rule__NamedListElement__ListNameAssignment_1 ) ) ;
    public final void rule__NamedListElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1178:1: ( ( ( rule__NamedListElement__ListNameAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1179:1: ( ( rule__NamedListElement__ListNameAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1179:1: ( ( rule__NamedListElement__ListNameAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1180:1: ( rule__NamedListElement__ListNameAssignment_1 )
            {
             before(grammarAccess.getNamedListElementAccess().getListNameAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1181:1: ( rule__NamedListElement__ListNameAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1181:2: rule__NamedListElement__ListNameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedListElement__ListNameAssignment_1_in_rule__NamedListElement__Group__1__Impl2310);
            rule__NamedListElement__ListNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementAccess().getListNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__1__Impl"


    // $ANTLR start "rule__NamedListElement__Group__2"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1191:1: rule__NamedListElement__Group__2 : rule__NamedListElement__Group__2__Impl rule__NamedListElement__Group__3 ;
    public final void rule__NamedListElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1195:1: ( rule__NamedListElement__Group__2__Impl rule__NamedListElement__Group__3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1196:2: rule__NamedListElement__Group__2__Impl rule__NamedListElement__Group__3
            {
            pushFollow(FOLLOW_rule__NamedListElement__Group__2__Impl_in_rule__NamedListElement__Group__22340);
            rule__NamedListElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElement__Group__3_in_rule__NamedListElement__Group__22343);
            rule__NamedListElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__2"


    // $ANTLR start "rule__NamedListElement__Group__2__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1203:1: rule__NamedListElement__Group__2__Impl : ( ':' ) ;
    public final void rule__NamedListElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1207:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1208:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1208:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1209:1: ':'
            {
             before(grammarAccess.getNamedListElementAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__NamedListElement__Group__2__Impl2371); 
             after(grammarAccess.getNamedListElementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__2__Impl"


    // $ANTLR start "rule__NamedListElement__Group__3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1222:1: rule__NamedListElement__Group__3 : rule__NamedListElement__Group__3__Impl ;
    public final void rule__NamedListElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1226:1: ( rule__NamedListElement__Group__3__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1227:2: rule__NamedListElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedListElement__Group__3__Impl_in_rule__NamedListElement__Group__32402);
            rule__NamedListElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__3"


    // $ANTLR start "rule__NamedListElement__Group__3__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1233:1: rule__NamedListElement__Group__3__Impl : ( ( rule__NamedListElement__ReferredIdAssignment_3 ) ) ;
    public final void rule__NamedListElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1237:1: ( ( ( rule__NamedListElement__ReferredIdAssignment_3 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1238:1: ( ( rule__NamedListElement__ReferredIdAssignment_3 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1238:1: ( ( rule__NamedListElement__ReferredIdAssignment_3 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1239:1: ( rule__NamedListElement__ReferredIdAssignment_3 )
            {
             before(grammarAccess.getNamedListElementAccess().getReferredIdAssignment_3()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1240:1: ( rule__NamedListElement__ReferredIdAssignment_3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1240:2: rule__NamedListElement__ReferredIdAssignment_3
            {
            pushFollow(FOLLOW_rule__NamedListElement__ReferredIdAssignment_3_in_rule__NamedListElement__Group__3__Impl2429);
            rule__NamedListElement__ReferredIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementAccess().getReferredIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__Group__3__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__0"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1258:1: rule__NamedListElementWithRefMetadata__Group__0 : rule__NamedListElementWithRefMetadata__Group__0__Impl rule__NamedListElementWithRefMetadata__Group__1 ;
    public final void rule__NamedListElementWithRefMetadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1262:1: ( rule__NamedListElementWithRefMetadata__Group__0__Impl rule__NamedListElementWithRefMetadata__Group__1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1263:2: rule__NamedListElementWithRefMetadata__Group__0__Impl rule__NamedListElementWithRefMetadata__Group__1
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__0__Impl_in_rule__NamedListElementWithRefMetadata__Group__02467);
            rule__NamedListElementWithRefMetadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__1_in_rule__NamedListElementWithRefMetadata__Group__02470);
            rule__NamedListElementWithRefMetadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__0"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__0__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1270:1: rule__NamedListElementWithRefMetadata__Group__0__Impl : ( 'list:' ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1274:1: ( ( 'list:' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1275:1: ( 'list:' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1275:1: ( 'list:' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1276:1: 'list:'
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getListKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__NamedListElementWithRefMetadata__Group__0__Impl2498); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__0__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1289:1: rule__NamedListElementWithRefMetadata__Group__1 : rule__NamedListElementWithRefMetadata__Group__1__Impl rule__NamedListElementWithRefMetadata__Group__2 ;
    public final void rule__NamedListElementWithRefMetadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1293:1: ( rule__NamedListElementWithRefMetadata__Group__1__Impl rule__NamedListElementWithRefMetadata__Group__2 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1294:2: rule__NamedListElementWithRefMetadata__Group__1__Impl rule__NamedListElementWithRefMetadata__Group__2
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__1__Impl_in_rule__NamedListElementWithRefMetadata__Group__12529);
            rule__NamedListElementWithRefMetadata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__2_in_rule__NamedListElementWithRefMetadata__Group__12532);
            rule__NamedListElementWithRefMetadata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__1"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__1__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1301:1: rule__NamedListElementWithRefMetadata__Group__1__Impl : ( ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 ) ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1305:1: ( ( ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1306:1: ( ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1306:1: ( ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1307:1: ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 )
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getListNameAssignment_1()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1308:1: ( rule__NamedListElementWithRefMetadata__ListNameAssignment_1 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1308:2: rule__NamedListElementWithRefMetadata__ListNameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__ListNameAssignment_1_in_rule__NamedListElementWithRefMetadata__Group__1__Impl2559);
            rule__NamedListElementWithRefMetadata__ListNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getListNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__1__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__2"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1318:1: rule__NamedListElementWithRefMetadata__Group__2 : rule__NamedListElementWithRefMetadata__Group__2__Impl rule__NamedListElementWithRefMetadata__Group__3 ;
    public final void rule__NamedListElementWithRefMetadata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1322:1: ( rule__NamedListElementWithRefMetadata__Group__2__Impl rule__NamedListElementWithRefMetadata__Group__3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1323:2: rule__NamedListElementWithRefMetadata__Group__2__Impl rule__NamedListElementWithRefMetadata__Group__3
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__2__Impl_in_rule__NamedListElementWithRefMetadata__Group__22589);
            rule__NamedListElementWithRefMetadata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__3_in_rule__NamedListElementWithRefMetadata__Group__22592);
            rule__NamedListElementWithRefMetadata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__2"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__2__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1330:1: rule__NamedListElementWithRefMetadata__Group__2__Impl : ( ':' ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1334:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1335:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1335:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1336:1: ':'
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__NamedListElementWithRefMetadata__Group__2__Impl2620); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__2__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1349:1: rule__NamedListElementWithRefMetadata__Group__3 : rule__NamedListElementWithRefMetadata__Group__3__Impl rule__NamedListElementWithRefMetadata__Group__4 ;
    public final void rule__NamedListElementWithRefMetadata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1353:1: ( rule__NamedListElementWithRefMetadata__Group__3__Impl rule__NamedListElementWithRefMetadata__Group__4 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1354:2: rule__NamedListElementWithRefMetadata__Group__3__Impl rule__NamedListElementWithRefMetadata__Group__4
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__3__Impl_in_rule__NamedListElementWithRefMetadata__Group__32651);
            rule__NamedListElementWithRefMetadata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__4_in_rule__NamedListElementWithRefMetadata__Group__32654);
            rule__NamedListElementWithRefMetadata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__3"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__3__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1361:1: rule__NamedListElementWithRefMetadata__Group__3__Impl : ( ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 ) ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1365:1: ( ( ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1366:1: ( ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1366:1: ( ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1367:1: ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 )
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdAssignment_3()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1368:1: ( rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1368:2: rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3_in_rule__NamedListElementWithRefMetadata__Group__3__Impl2681);
            rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__3__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__4"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1378:1: rule__NamedListElementWithRefMetadata__Group__4 : rule__NamedListElementWithRefMetadata__Group__4__Impl rule__NamedListElementWithRefMetadata__Group__5 ;
    public final void rule__NamedListElementWithRefMetadata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1382:1: ( rule__NamedListElementWithRefMetadata__Group__4__Impl rule__NamedListElementWithRefMetadata__Group__5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1383:2: rule__NamedListElementWithRefMetadata__Group__4__Impl rule__NamedListElementWithRefMetadata__Group__5
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__4__Impl_in_rule__NamedListElementWithRefMetadata__Group__42711);
            rule__NamedListElementWithRefMetadata__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__5_in_rule__NamedListElementWithRefMetadata__Group__42714);
            rule__NamedListElementWithRefMetadata__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__4"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__4__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1390:1: rule__NamedListElementWithRefMetadata__Group__4__Impl : ( ':' ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1394:1: ( ( ':' ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1395:1: ( ':' )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1395:1: ( ':' )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1396:1: ':'
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__NamedListElementWithRefMetadata__Group__4__Impl2742); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__4__Impl"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1409:1: rule__NamedListElementWithRefMetadata__Group__5 : rule__NamedListElementWithRefMetadata__Group__5__Impl ;
    public final void rule__NamedListElementWithRefMetadata__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1413:1: ( rule__NamedListElementWithRefMetadata__Group__5__Impl )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1414:2: rule__NamedListElementWithRefMetadata__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__Group__5__Impl_in_rule__NamedListElementWithRefMetadata__Group__52773);
            rule__NamedListElementWithRefMetadata__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__5"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__Group__5__Impl"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1420:1: rule__NamedListElementWithRefMetadata__Group__5__Impl : ( ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 ) ) ;
    public final void rule__NamedListElementWithRefMetadata__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1424:1: ( ( ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 ) ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1425:1: ( ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 ) )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1425:1: ( ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1426:1: ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 )
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdAssignment_5()); 
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1427:1: ( rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1427:2: rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5
            {
            pushFollow(FOLLOW_rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5_in_rule__NamedListElementWithRefMetadata__Group__5__Impl2800);
            rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__Group__5__Impl"


    // $ANTLR start "rule__TextContent__IdAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1450:1: rule__TextContent__IdAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__TextContent__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1454:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1455:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1455:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1456:1: RULE_PP_ID
            {
             before(grammarAccess.getTextContentAccess().getIdPP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__TextContent__IdAssignment_12847); 
             after(grammarAccess.getTextContentAccess().getIdPP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__IdAssignment_1"


    // $ANTLR start "rule__TextContent__InputtemplateAssignment_3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1465:1: rule__TextContent__InputtemplateAssignment_3 : ( RULE_PP_ID ) ;
    public final void rule__TextContent__InputtemplateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1469:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1470:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1470:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1471:1: RULE_PP_ID
            {
             before(grammarAccess.getTextContentAccess().getInputtemplatePP_IDTerminalRuleCall_3_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__TextContent__InputtemplateAssignment_32878); 
             after(grammarAccess.getTextContentAccess().getInputtemplatePP_IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__InputtemplateAssignment_3"


    // $ANTLR start "rule__TextContent__SecurityparentAssignment_5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1480:1: rule__TextContent__SecurityparentAssignment_5 : ( RULE_PP_ID ) ;
    public final void rule__TextContent__SecurityparentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1484:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1485:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1485:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1486:1: RULE_PP_ID
            {
             before(grammarAccess.getTextContentAccess().getSecurityparentPP_IDTerminalRuleCall_5_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__TextContent__SecurityparentAssignment_52909); 
             after(grammarAccess.getTextContentAccess().getSecurityparentPP_IDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__SecurityparentAssignment_5"


    // $ANTLR start "rule__TextContent__NameAssignment_7"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1495:1: rule__TextContent__NameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__TextContent__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1499:1: ( ( RULE_STRING ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1500:1: ( RULE_STRING )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1500:1: ( RULE_STRING )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1501:1: RULE_STRING
            {
             before(grammarAccess.getTextContentAccess().getNameSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextContent__NameAssignment_72940); 
             after(grammarAccess.getTextContentAccess().getNameSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__NameAssignment_7"


    // $ANTLR start "rule__TextContent__ComponentsAssignment_8"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1510:1: rule__TextContent__ComponentsAssignment_8 : ( ruleComponent ) ;
    public final void rule__TextContent__ComponentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1514:1: ( ( ruleComponent ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1515:1: ( ruleComponent )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1515:1: ( ruleComponent )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1516:1: ruleComponent
            {
             before(grammarAccess.getTextContentAccess().getComponentsComponentParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__TextContent__ComponentsAssignment_82971);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getComponentsComponentParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ComponentsAssignment_8"


    // $ANTLR start "rule__TextContent__ReferencesAssignment_9"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1525:1: rule__TextContent__ReferencesAssignment_9 : ( ruleReference ) ;
    public final void rule__TextContent__ReferencesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1529:1: ( ( ruleReference ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1530:1: ( ruleReference )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1530:1: ( ruleReference )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1531:1: ruleReference
            {
             before(grammarAccess.getTextContentAccess().getReferencesReferenceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__TextContent__ReferencesAssignment_93002);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getReferencesReferenceParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ReferencesAssignment_9"


    // $ANTLR start "rule__TextContent__ListElementsAssignment_10"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1540:1: rule__TextContent__ListElementsAssignment_10 : ( ruleListElement ) ;
    public final void rule__TextContent__ListElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1544:1: ( ( ruleListElement ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1545:1: ( ruleListElement )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1545:1: ( ruleListElement )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1546:1: ruleListElement
            {
             before(grammarAccess.getTextContentAccess().getListElementsListElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleListElement_in_rule__TextContent__ListElementsAssignment_103033);
            ruleListElement();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getListElementsListElementParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ListElementsAssignment_10"


    // $ANTLR start "rule__Component__GroupAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1555:1: rule__Component__GroupAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__Component__GroupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1559:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1560:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1560:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1561:1: RULE_PP_ID
            {
             before(grammarAccess.getComponentAccess().getGroupPP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__Component__GroupAssignment_13064); 
             after(grammarAccess.getComponentAccess().getGroupPP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__GroupAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1570:1: rule__Component__NameAssignment_3 : ( RULE_PP_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1574:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1575:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1575:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1576:1: RULE_PP_ID
            {
             before(grammarAccess.getComponentAccess().getNamePP_IDTerminalRuleCall_3_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__Component__NameAssignment_33095); 
             after(grammarAccess.getComponentAccess().getNamePP_IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_3"


    // $ANTLR start "rule__Component__ValueAssignment_5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1585:1: rule__Component__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Component__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1589:1: ( ( RULE_STRING ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1590:1: ( RULE_STRING )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1590:1: ( RULE_STRING )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1591:1: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Component__ValueAssignment_53126); 
             after(grammarAccess.getComponentAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ValueAssignment_5"


    // $ANTLR start "rule__Reference__GroupAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1600:1: rule__Reference__GroupAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__Reference__GroupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1604:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1605:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1605:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1606:1: RULE_PP_ID
            {
             before(grammarAccess.getReferenceAccess().getGroupPP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__Reference__GroupAssignment_13157); 
             after(grammarAccess.getReferenceAccess().getGroupPP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__GroupAssignment_1"


    // $ANTLR start "rule__Reference__NameAssignment_3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1615:1: rule__Reference__NameAssignment_3 : ( RULE_PP_ID ) ;
    public final void rule__Reference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1619:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1620:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1620:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1621:1: RULE_PP_ID
            {
             before(grammarAccess.getReferenceAccess().getNamePP_IDTerminalRuleCall_3_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__Reference__NameAssignment_33188); 
             after(grammarAccess.getReferenceAccess().getNamePP_IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_3"


    // $ANTLR start "rule__Reference__ReferredIdAssignment_5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1630:1: rule__Reference__ReferredIdAssignment_5 : ( RULE_PP_ID ) ;
    public final void rule__Reference__ReferredIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1634:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1635:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1635:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1636:1: RULE_PP_ID
            {
             before(grammarAccess.getReferenceAccess().getReferredIdPP_IDTerminalRuleCall_5_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__Reference__ReferredIdAssignment_53219); 
             after(grammarAccess.getReferenceAccess().getReferredIdPP_IDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferredIdAssignment_5"


    // $ANTLR start "rule__DefaultListElement__ReferredIdAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1645:1: rule__DefaultListElement__ReferredIdAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__DefaultListElement__ReferredIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1649:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1650:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1650:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1651:1: RULE_PP_ID
            {
             before(grammarAccess.getDefaultListElementAccess().getReferredIdPP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__DefaultListElement__ReferredIdAssignment_13250); 
             after(grammarAccess.getDefaultListElementAccess().getReferredIdPP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultListElement__ReferredIdAssignment_1"


    // $ANTLR start "rule__NamedListElement__ListNameAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1660:1: rule__NamedListElement__ListNameAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__NamedListElement__ListNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1664:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1665:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1665:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1666:1: RULE_PP_ID
            {
             before(grammarAccess.getNamedListElementAccess().getListNamePP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__NamedListElement__ListNameAssignment_13281); 
             after(grammarAccess.getNamedListElementAccess().getListNamePP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__ListNameAssignment_1"


    // $ANTLR start "rule__NamedListElement__ReferredIdAssignment_3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1675:1: rule__NamedListElement__ReferredIdAssignment_3 : ( RULE_PP_ID ) ;
    public final void rule__NamedListElement__ReferredIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1679:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1680:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1680:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1681:1: RULE_PP_ID
            {
             before(grammarAccess.getNamedListElementAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__NamedListElement__ReferredIdAssignment_33312); 
             after(grammarAccess.getNamedListElementAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElement__ReferredIdAssignment_3"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__ListNameAssignment_1"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1690:1: rule__NamedListElementWithRefMetadata__ListNameAssignment_1 : ( RULE_PP_ID ) ;
    public final void rule__NamedListElementWithRefMetadata__ListNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1694:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1695:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1695:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1696:1: RULE_PP_ID
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getListNamePP_IDTerminalRuleCall_1_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ListNameAssignment_13343); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getListNamePP_IDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__ListNameAssignment_1"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1705:1: rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3 : ( RULE_PP_ID ) ;
    public final void rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1709:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1710:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1710:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1711:1: RULE_PP_ID
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ReferredIdAssignment_33374); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3"


    // $ANTLR start "rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5"
    // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1720:1: rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5 : ( RULE_PP_ID ) ;
    public final void rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1724:1: ( ( RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1725:1: ( RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1725:1: ( RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent.ui/src-gen/com/polopoly/ps/dsl/ui/contentassist/antlr/internal/InternalTextContent.g:1726:1: RULE_PP_ID
            {
             before(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdPP_IDTerminalRuleCall_5_0()); 
            match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_53405); 
             after(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdPP_IDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0_in_ruleTextContent103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElement_in_entryRuleListElement250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListElement257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElement__Alternatives_in_ruleListElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultListElement_in_entryRuleDefaultListElement310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultListElement317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultListElement__Group__0_in_ruleDefaultListElement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNamedListElement_in_entryRuleAbstractNamedListElement370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNamedListElement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractNamedListElement__Alternatives_in_ruleAbstractNamedListElement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElement_in_entryRuleNamedListElement430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedListElement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__0_in_ruleNamedListElement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElementWithRefMetadata_in_entryRuleNamedListElementWithRefMetadata490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedListElementWithRefMetadata497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__0_in_ruleNamedListElementWithRefMetadata523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultListElement_in_rule__ListElement__Alternatives559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNamedListElement_in_rule__ListElement__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElement_in_rule__AbstractNamedListElement__Alternatives608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElementWithRefMetadata_in_rule__AbstractNamedListElement__Alternatives625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__0655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__0658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TextContent__Group__0__Impl686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__1717 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__2_in_rule__TextContent__Group__1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__IdAssignment_1_in_rule__TextContent__Group__1__Impl747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__2__Impl_in_rule__TextContent__Group__2777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextContent__Group__3_in_rule__TextContent__Group__2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TextContent__Group__2__Impl808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__3__Impl_in_rule__TextContent__Group__3839 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__4_in_rule__TextContent__Group__3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__InputtemplateAssignment_3_in_rule__TextContent__Group__3__Impl869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__4__Impl_in_rule__TextContent__Group__4899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextContent__Group__5_in_rule__TextContent__Group__4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TextContent__Group__4__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__5__Impl_in_rule__TextContent__Group__5961 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__6_in_rule__TextContent__Group__5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__SecurityparentAssignment_5_in_rule__TextContent__Group__5__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__6__Impl_in_rule__TextContent__Group__61021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextContent__Group__7_in_rule__TextContent__Group__61024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TextContent__Group__6__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__7__Impl_in_rule__TextContent__Group__71083 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__8_in_rule__TextContent__Group__71086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__NameAssignment_7_in_rule__TextContent__Group__7__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__8__Impl_in_rule__TextContent__Group__81143 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__9_in_rule__TextContent__Group__81146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ComponentsAssignment_8_in_rule__TextContent__Group__8__Impl1173 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__9__Impl_in_rule__TextContent__Group__91204 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__10_in_rule__TextContent__Group__91207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ReferencesAssignment_9_in_rule__TextContent__Group__9__Impl1234 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__10__Impl_in_rule__TextContent__Group__101265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ListElementsAssignment_10_in_rule__TextContent__Group__10__Impl1292 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Component__Group__0__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11407 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__GroupAssignment_1_in_rule__Component__Group__1__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__2__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_3_in_rule__Component__Group__3__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__4__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ValueAssignment_5_in_rule__Component__Group__5__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__01720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Reference__Group__0__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__11782 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__GroupAssignment_1_in_rule__Reference__Group__1__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__21842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__21845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Reference__Group__2__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__31904 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__31907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_3_in_rule__Reference__Group__3__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__41964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__41967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Reference__Group__4__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferredIdAssignment_5_in_rule__Reference__Group__5__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultListElement__Group__0__Impl_in_rule__DefaultListElement__Group__02095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefaultListElement__Group__1_in_rule__DefaultListElement__Group__02098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DefaultListElement__Group__0__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultListElement__Group__1__Impl_in_rule__DefaultListElement__Group__12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultListElement__ReferredIdAssignment_1_in_rule__DefaultListElement__Group__1__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__0__Impl_in_rule__NamedListElement__Group__02218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__1_in_rule__NamedListElement__Group__02221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NamedListElement__Group__0__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__1__Impl_in_rule__NamedListElement__Group__12280 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__2_in_rule__NamedListElement__Group__12283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__ListNameAssignment_1_in_rule__NamedListElement__Group__1__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__2__Impl_in_rule__NamedListElement__Group__22340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__3_in_rule__NamedListElement__Group__22343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamedListElement__Group__2__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__Group__3__Impl_in_rule__NamedListElement__Group__32402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElement__ReferredIdAssignment_3_in_rule__NamedListElement__Group__3__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__0__Impl_in_rule__NamedListElementWithRefMetadata__Group__02467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__1_in_rule__NamedListElementWithRefMetadata__Group__02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NamedListElementWithRefMetadata__Group__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__1__Impl_in_rule__NamedListElementWithRefMetadata__Group__12529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__2_in_rule__NamedListElementWithRefMetadata__Group__12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__ListNameAssignment_1_in_rule__NamedListElementWithRefMetadata__Group__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__2__Impl_in_rule__NamedListElementWithRefMetadata__Group__22589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__3_in_rule__NamedListElementWithRefMetadata__Group__22592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamedListElementWithRefMetadata__Group__2__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__3__Impl_in_rule__NamedListElementWithRefMetadata__Group__32651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__4_in_rule__NamedListElementWithRefMetadata__Group__32654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__ReferredIdAssignment_3_in_rule__NamedListElementWithRefMetadata__Group__3__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__4__Impl_in_rule__NamedListElementWithRefMetadata__Group__42711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__5_in_rule__NamedListElementWithRefMetadata__Group__42714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamedListElementWithRefMetadata__Group__4__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__Group__5__Impl_in_rule__NamedListElementWithRefMetadata__Group__52773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_5_in_rule__NamedListElementWithRefMetadata__Group__5__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__TextContent__IdAssignment_12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__TextContent__InputtemplateAssignment_32878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__TextContent__SecurityparentAssignment_52909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextContent__NameAssignment_72940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__TextContent__ComponentsAssignment_82971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__TextContent__ReferencesAssignment_93002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElement_in_rule__TextContent__ListElementsAssignment_103033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__Component__GroupAssignment_13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__Component__NameAssignment_33095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Component__ValueAssignment_53126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__Reference__GroupAssignment_13157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__Reference__NameAssignment_33188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__Reference__ReferredIdAssignment_53219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__DefaultListElement__ReferredIdAssignment_13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__NamedListElement__ListNameAssignment_13281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__NamedListElement__ReferredIdAssignment_33312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ListNameAssignment_13343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ReferredIdAssignment_33374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_rule__NamedListElementWithRefMetadata__ReferenceMetadataIdAssignment_53405 = new BitSet(new long[]{0x0000000000000002L});

}