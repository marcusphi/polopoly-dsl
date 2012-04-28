package com.polopoly.ps.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.polopoly.ps.dsl.services.TextContentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextContentParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g"; }



     	private TextContentGrammarAccess grammarAccess;
     	
        public InternalTextContentParser(TokenStream input, TextContentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TextContent";	
       	}
       	
       	@Override
       	protected TextContentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTextContent"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:67:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_COMMENT", "RULE_WS");
        	
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:71:2: (iv_ruleTextContent= ruleTextContent EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:72:2: iv_ruleTextContent= ruleTextContent EOF
            {
             newCompositeNode(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent81);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;

             current =iv_ruleTextContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:82:1: ruleTextContent returns [EObject current=null] : (otherlv_0= 'id:' ( (lv_id_1_0= RULE_PP_ID ) ) otherlv_2= 'inputtemplate:' ( (lv_inputtemplate_3_0= RULE_PP_ID ) ) otherlv_4= 'securityparent:' ( (lv_securityparent_5_0= RULE_PP_ID ) ) otherlv_6= 'name:' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_components_8_0= ruleComponent ) )* ( (lv_references_9_0= ruleReference ) )* ( (lv_listElements_10_0= ruleListElement ) )* ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_inputtemplate_3_0=null;
        Token otherlv_4=null;
        Token lv_securityparent_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        EObject lv_components_8_0 = null;

        EObject lv_references_9_0 = null;

        EObject lv_listElements_10_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_COMMENT", "RULE_WS");
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:86:28: ( (otherlv_0= 'id:' ( (lv_id_1_0= RULE_PP_ID ) ) otherlv_2= 'inputtemplate:' ( (lv_inputtemplate_3_0= RULE_PP_ID ) ) otherlv_4= 'securityparent:' ( (lv_securityparent_5_0= RULE_PP_ID ) ) otherlv_6= 'name:' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_components_8_0= ruleComponent ) )* ( (lv_references_9_0= ruleReference ) )* ( (lv_listElements_10_0= ruleListElement ) )* ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:87:1: (otherlv_0= 'id:' ( (lv_id_1_0= RULE_PP_ID ) ) otherlv_2= 'inputtemplate:' ( (lv_inputtemplate_3_0= RULE_PP_ID ) ) otherlv_4= 'securityparent:' ( (lv_securityparent_5_0= RULE_PP_ID ) ) otherlv_6= 'name:' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_components_8_0= ruleComponent ) )* ( (lv_references_9_0= ruleReference ) )* ( (lv_listElements_10_0= ruleListElement ) )* )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:87:1: (otherlv_0= 'id:' ( (lv_id_1_0= RULE_PP_ID ) ) otherlv_2= 'inputtemplate:' ( (lv_inputtemplate_3_0= RULE_PP_ID ) ) otherlv_4= 'securityparent:' ( (lv_securityparent_5_0= RULE_PP_ID ) ) otherlv_6= 'name:' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_components_8_0= ruleComponent ) )* ( (lv_references_9_0= ruleReference ) )* ( (lv_listElements_10_0= ruleListElement ) )* )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:87:3: otherlv_0= 'id:' ( (lv_id_1_0= RULE_PP_ID ) ) otherlv_2= 'inputtemplate:' ( (lv_inputtemplate_3_0= RULE_PP_ID ) ) otherlv_4= 'securityparent:' ( (lv_securityparent_5_0= RULE_PP_ID ) ) otherlv_6= 'name:' ( (lv_name_7_0= RULE_STRING ) ) ( (lv_components_8_0= ruleComponent ) )* ( (lv_references_9_0= ruleReference ) )* ( (lv_listElements_10_0= ruleListElement ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTextContent132); 

                	newLeafNode(otherlv_0, grammarAccess.getTextContentAccess().getIdKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:91:1: ( (lv_id_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:92:1: (lv_id_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:92:1: (lv_id_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:93:3: lv_id_1_0= RULE_PP_ID
            {
            lv_id_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleTextContent149); 

            			newLeafNode(lv_id_1_0, grammarAccess.getTextContentAccess().getIdPP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTextContent166); 

                	newLeafNode(otherlv_2, grammarAccess.getTextContentAccess().getInputtemplateKeyword_2());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:113:1: ( (lv_inputtemplate_3_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:114:1: (lv_inputtemplate_3_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:114:1: (lv_inputtemplate_3_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:115:3: lv_inputtemplate_3_0= RULE_PP_ID
            {
            lv_inputtemplate_3_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleTextContent183); 

            			newLeafNode(lv_inputtemplate_3_0, grammarAccess.getTextContentAccess().getInputtemplatePP_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"inputtemplate",
                    		lv_inputtemplate_3_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTextContent200); 

                	newLeafNode(otherlv_4, grammarAccess.getTextContentAccess().getSecurityparentKeyword_4());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:135:1: ( (lv_securityparent_5_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:136:1: (lv_securityparent_5_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:136:1: (lv_securityparent_5_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:137:3: lv_securityparent_5_0= RULE_PP_ID
            {
            lv_securityparent_5_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleTextContent217); 

            			newLeafNode(lv_securityparent_5_0, grammarAccess.getTextContentAccess().getSecurityparentPP_IDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"securityparent",
                    		lv_securityparent_5_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTextContent234); 

                	newLeafNode(otherlv_6, grammarAccess.getTextContentAccess().getNameKeyword_6());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:157:1: ( (lv_name_7_0= RULE_STRING ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:158:1: (lv_name_7_0= RULE_STRING )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:158:1: (lv_name_7_0= RULE_STRING )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:159:3: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextContent251); 

            			newLeafNode(lv_name_7_0, grammarAccess.getTextContentAccess().getNameSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:175:2: ( (lv_components_8_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:176:1: (lv_components_8_0= ruleComponent )
            	    {
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:176:1: (lv_components_8_0= ruleComponent )
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:177:3: lv_components_8_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getComponentsComponentParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleTextContent277);
            	    lv_components_8_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_8_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:193:3: ( (lv_references_9_0= ruleReference ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:194:1: (lv_references_9_0= ruleReference )
            	    {
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:194:1: (lv_references_9_0= ruleReference )
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:195:3: lv_references_9_0= ruleReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getReferencesReferenceParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReference_in_ruleTextContent299);
            	    lv_references_9_0=ruleReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"references",
            	            		lv_references_9_0, 
            	            		"Reference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:211:3: ( (lv_listElements_10_0= ruleListElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:212:1: (lv_listElements_10_0= ruleListElement )
            	    {
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:212:1: (lv_listElements_10_0= ruleListElement )
            	    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:213:3: lv_listElements_10_0= ruleListElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getListElementsListElementParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleListElement_in_ruleTextContent321);
            	    lv_listElements_10_0=ruleListElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"listElements",
            	            		lv_listElements_10_0, 
            	            		"ListElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleComponent"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:240:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:241:2: (iv_ruleComponent= ruleComponent EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:242:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent362);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:249:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:252:28: ( (otherlv_0= 'component:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:253:1: (otherlv_0= 'component:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:253:1: (otherlv_0= 'component:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:253:3: otherlv_0= 'component:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleComponent409); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:257:1: ( (lv_group_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:258:1: (lv_group_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:258:1: (lv_group_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:259:3: lv_group_1_0= RULE_PP_ID
            {
            lv_group_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleComponent426); 

            			newLeafNode(lv_group_1_0, grammarAccess.getComponentAccess().getGroupPP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"group",
                    		lv_group_1_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleComponent443); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonKeyword_2());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:279:1: ( (lv_name_3_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:280:1: (lv_name_3_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:280:1: (lv_name_3_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:281:3: lv_name_3_0= RULE_PP_ID
            {
            lv_name_3_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleComponent460); 

            			newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNamePP_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleComponent477); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_4());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:301:1: ( (lv_value_5_0= RULE_STRING ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:302:1: (lv_value_5_0= RULE_STRING )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:302:1: (lv_value_5_0= RULE_STRING )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:303:3: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComponent494); 

            			newLeafNode(lv_value_5_0, grammarAccess.getComponentAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleReference"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:327:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:328:2: (iv_ruleReference= ruleReference EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:329:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference535);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:336:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referredId_5_0= RULE_PP_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_referredId_5_0=null;

         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:339:28: ( (otherlv_0= 'ref:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referredId_5_0= RULE_PP_ID ) ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:340:1: (otherlv_0= 'ref:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referredId_5_0= RULE_PP_ID ) ) )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:340:1: (otherlv_0= 'ref:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referredId_5_0= RULE_PP_ID ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:340:3: otherlv_0= 'ref:' ( (lv_group_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referredId_5_0= RULE_PP_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleReference582); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:344:1: ( (lv_group_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:345:1: (lv_group_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:345:1: (lv_group_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:346:3: lv_group_1_0= RULE_PP_ID
            {
            lv_group_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleReference599); 

            			newLeafNode(lv_group_1_0, grammarAccess.getReferenceAccess().getGroupPP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"group",
                    		lv_group_1_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReference616); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:366:1: ( (lv_name_3_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:367:1: (lv_name_3_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:367:1: (lv_name_3_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:368:3: lv_name_3_0= RULE_PP_ID
            {
            lv_name_3_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleReference633); 

            			newLeafNode(lv_name_3_0, grammarAccess.getReferenceAccess().getNamePP_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleReference650); 

                	newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getColonKeyword_4());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:388:1: ( (lv_referredId_5_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:389:1: (lv_referredId_5_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:389:1: (lv_referredId_5_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:390:3: lv_referredId_5_0= RULE_PP_ID
            {
            lv_referredId_5_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleReference667); 

            			newLeafNode(lv_referredId_5_0, grammarAccess.getReferenceAccess().getReferredIdPP_IDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referredId",
                    		lv_referredId_5_0, 
                    		"PP_ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:414:1: entryRuleListElement returns [EObject current=null] : iv_ruleListElement= ruleListElement EOF ;
    public final EObject entryRuleListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElement = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:415:2: (iv_ruleListElement= ruleListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:416:2: iv_ruleListElement= ruleListElement EOF
            {
             newCompositeNode(grammarAccess.getListElementRule()); 
            pushFollow(FOLLOW_ruleListElement_in_entryRuleListElement708);
            iv_ruleListElement=ruleListElement();

            state._fsp--;

             current =iv_ruleListElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListElement718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListElement"


    // $ANTLR start "ruleListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:423:1: ruleListElement returns [EObject current=null] : (this_DefaultListElement_0= ruleDefaultListElement | this_AbstractNamedListElement_1= ruleAbstractNamedListElement ) ;
    public final EObject ruleListElement() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultListElement_0 = null;

        EObject this_AbstractNamedListElement_1 = null;


         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:426:28: ( (this_DefaultListElement_0= ruleDefaultListElement | this_AbstractNamedListElement_1= ruleAbstractNamedListElement ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:427:1: (this_DefaultListElement_0= ruleDefaultListElement | this_AbstractNamedListElement_1= ruleAbstractNamedListElement )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:427:1: (this_DefaultListElement_0= ruleDefaultListElement | this_AbstractNamedListElement_1= ruleAbstractNamedListElement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_PP_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==EOF||LA4_2==20) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:428:5: this_DefaultListElement_0= ruleDefaultListElement
                    {
                     
                            newCompositeNode(grammarAccess.getListElementAccess().getDefaultListElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultListElement_in_ruleListElement765);
                    this_DefaultListElement_0=ruleDefaultListElement();

                    state._fsp--;

                     
                            current = this_DefaultListElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:438:5: this_AbstractNamedListElement_1= ruleAbstractNamedListElement
                    {
                     
                            newCompositeNode(grammarAccess.getListElementAccess().getAbstractNamedListElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractNamedListElement_in_ruleListElement792);
                    this_AbstractNamedListElement_1=ruleAbstractNamedListElement();

                    state._fsp--;

                     
                            current = this_AbstractNamedListElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListElement"


    // $ANTLR start "entryRuleDefaultListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:454:1: entryRuleDefaultListElement returns [EObject current=null] : iv_ruleDefaultListElement= ruleDefaultListElement EOF ;
    public final EObject entryRuleDefaultListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultListElement = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:455:2: (iv_ruleDefaultListElement= ruleDefaultListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:456:2: iv_ruleDefaultListElement= ruleDefaultListElement EOF
            {
             newCompositeNode(grammarAccess.getDefaultListElementRule()); 
            pushFollow(FOLLOW_ruleDefaultListElement_in_entryRuleDefaultListElement827);
            iv_ruleDefaultListElement=ruleDefaultListElement();

            state._fsp--;

             current =iv_ruleDefaultListElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultListElement837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultListElement"


    // $ANTLR start "ruleDefaultListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:463:1: ruleDefaultListElement returns [EObject current=null] : (otherlv_0= 'list:' ( (lv_referredId_1_0= RULE_PP_ID ) ) ) ;
    public final EObject ruleDefaultListElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_referredId_1_0=null;

         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:466:28: ( (otherlv_0= 'list:' ( (lv_referredId_1_0= RULE_PP_ID ) ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:467:1: (otherlv_0= 'list:' ( (lv_referredId_1_0= RULE_PP_ID ) ) )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:467:1: (otherlv_0= 'list:' ( (lv_referredId_1_0= RULE_PP_ID ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:467:3: otherlv_0= 'list:' ( (lv_referredId_1_0= RULE_PP_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDefaultListElement874); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultListElementAccess().getListKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:471:1: ( (lv_referredId_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:472:1: (lv_referredId_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:472:1: (lv_referredId_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:473:3: lv_referredId_1_0= RULE_PP_ID
            {
            lv_referredId_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleDefaultListElement891); 

            			newLeafNode(lv_referredId_1_0, grammarAccess.getDefaultListElementAccess().getReferredIdPP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultListElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referredId",
                    		lv_referredId_1_0, 
                    		"PP_ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultListElement"


    // $ANTLR start "entryRuleAbstractNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:497:1: entryRuleAbstractNamedListElement returns [EObject current=null] : iv_ruleAbstractNamedListElement= ruleAbstractNamedListElement EOF ;
    public final EObject entryRuleAbstractNamedListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamedListElement = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:498:2: (iv_ruleAbstractNamedListElement= ruleAbstractNamedListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:499:2: iv_ruleAbstractNamedListElement= ruleAbstractNamedListElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractNamedListElementRule()); 
            pushFollow(FOLLOW_ruleAbstractNamedListElement_in_entryRuleAbstractNamedListElement932);
            iv_ruleAbstractNamedListElement=ruleAbstractNamedListElement();

            state._fsp--;

             current =iv_ruleAbstractNamedListElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNamedListElement942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNamedListElement"


    // $ANTLR start "ruleAbstractNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:506:1: ruleAbstractNamedListElement returns [EObject current=null] : (this_NamedListElement_0= ruleNamedListElement | this_NamedListElementWithRefMetadata_1= ruleNamedListElementWithRefMetadata ) ;
    public final EObject ruleAbstractNamedListElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamedListElement_0 = null;

        EObject this_NamedListElementWithRefMetadata_1 = null;


         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:509:28: ( (this_NamedListElement_0= ruleNamedListElement | this_NamedListElementWithRefMetadata_1= ruleNamedListElementWithRefMetadata ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:510:1: (this_NamedListElement_0= ruleNamedListElement | this_NamedListElementWithRefMetadata_1= ruleNamedListElementWithRefMetadata )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:510:1: (this_NamedListElement_0= ruleNamedListElement | this_NamedListElementWithRefMetadata_1= ruleNamedListElementWithRefMetadata )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_PP_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==18) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==RULE_PP_ID) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==18) ) {
                                alt5=2;
                            }
                            else if ( (LA5_4==EOF||LA5_4==20) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:511:5: this_NamedListElement_0= ruleNamedListElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamedListElement_in_ruleAbstractNamedListElement989);
                    this_NamedListElement_0=ruleNamedListElement();

                    state._fsp--;

                     
                            current = this_NamedListElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:521:5: this_NamedListElementWithRefMetadata_1= ruleNamedListElementWithRefMetadata
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamedListElementAccess().getNamedListElementWithRefMetadataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedListElementWithRefMetadata_in_ruleAbstractNamedListElement1016);
                    this_NamedListElementWithRefMetadata_1=ruleNamedListElementWithRefMetadata();

                    state._fsp--;

                     
                            current = this_NamedListElementWithRefMetadata_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNamedListElement"


    // $ANTLR start "entryRuleNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:537:1: entryRuleNamedListElement returns [EObject current=null] : iv_ruleNamedListElement= ruleNamedListElement EOF ;
    public final EObject entryRuleNamedListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedListElement = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:538:2: (iv_ruleNamedListElement= ruleNamedListElement EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:539:2: iv_ruleNamedListElement= ruleNamedListElement EOF
            {
             newCompositeNode(grammarAccess.getNamedListElementRule()); 
            pushFollow(FOLLOW_ruleNamedListElement_in_entryRuleNamedListElement1051);
            iv_ruleNamedListElement=ruleNamedListElement();

            state._fsp--;

             current =iv_ruleNamedListElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedListElement1061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedListElement"


    // $ANTLR start "ruleNamedListElement"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:546:1: ruleNamedListElement returns [EObject current=null] : (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) ) ;
    public final EObject ruleNamedListElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_listName_1_0=null;
        Token otherlv_2=null;
        Token lv_referredId_3_0=null;

         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:549:28: ( (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:550:1: (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:550:1: (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:550:3: otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNamedListElement1098); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedListElementAccess().getListKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:554:1: ( (lv_listName_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:555:1: (lv_listName_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:555:1: (lv_listName_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:556:3: lv_listName_1_0= RULE_PP_ID
            {
            lv_listName_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleNamedListElement1115); 

            			newLeafNode(lv_listName_1_0, grammarAccess.getNamedListElementAccess().getListNamePP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedListElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"listName",
                    		lv_listName_1_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNamedListElement1132); 

                	newLeafNode(otherlv_2, grammarAccess.getNamedListElementAccess().getColonKeyword_2());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:576:1: ( (lv_referredId_3_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:577:1: (lv_referredId_3_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:577:1: (lv_referredId_3_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:578:3: lv_referredId_3_0= RULE_PP_ID
            {
            lv_referredId_3_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleNamedListElement1149); 

            			newLeafNode(lv_referredId_3_0, grammarAccess.getNamedListElementAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedListElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referredId",
                    		lv_referredId_3_0, 
                    		"PP_ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedListElement"


    // $ANTLR start "entryRuleNamedListElementWithRefMetadata"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:602:1: entryRuleNamedListElementWithRefMetadata returns [EObject current=null] : iv_ruleNamedListElementWithRefMetadata= ruleNamedListElementWithRefMetadata EOF ;
    public final EObject entryRuleNamedListElementWithRefMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedListElementWithRefMetadata = null;


        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:603:2: (iv_ruleNamedListElementWithRefMetadata= ruleNamedListElementWithRefMetadata EOF )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:604:2: iv_ruleNamedListElementWithRefMetadata= ruleNamedListElementWithRefMetadata EOF
            {
             newCompositeNode(grammarAccess.getNamedListElementWithRefMetadataRule()); 
            pushFollow(FOLLOW_ruleNamedListElementWithRefMetadata_in_entryRuleNamedListElementWithRefMetadata1190);
            iv_ruleNamedListElementWithRefMetadata=ruleNamedListElementWithRefMetadata();

            state._fsp--;

             current =iv_ruleNamedListElementWithRefMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedListElementWithRefMetadata1200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedListElementWithRefMetadata"


    // $ANTLR start "ruleNamedListElementWithRefMetadata"
    // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:611:1: ruleNamedListElementWithRefMetadata returns [EObject current=null] : (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) ) ) ;
    public final EObject ruleNamedListElementWithRefMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_listName_1_0=null;
        Token otherlv_2=null;
        Token lv_referredId_3_0=null;
        Token otherlv_4=null;
        Token lv_referenceMetadataId_5_0=null;

         enterRule(); 
            
        try {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:614:28: ( (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:615:1: (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) ) )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:615:1: (otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:615:3: otherlv_0= 'list:' ( (lv_listName_1_0= RULE_PP_ID ) ) otherlv_2= ':' ( (lv_referredId_3_0= RULE_PP_ID ) ) otherlv_4= ':' ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleNamedListElementWithRefMetadata1237); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedListElementWithRefMetadataAccess().getListKeyword_0());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:619:1: ( (lv_listName_1_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:620:1: (lv_listName_1_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:620:1: (lv_listName_1_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:621:3: lv_listName_1_0= RULE_PP_ID
            {
            lv_listName_1_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1254); 

            			newLeafNode(lv_listName_1_0, grammarAccess.getNamedListElementWithRefMetadataAccess().getListNamePP_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedListElementWithRefMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"listName",
                    		lv_listName_1_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNamedListElementWithRefMetadata1271); 

                	newLeafNode(otherlv_2, grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_2());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:641:1: ( (lv_referredId_3_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:642:1: (lv_referredId_3_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:642:1: (lv_referredId_3_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:643:3: lv_referredId_3_0= RULE_PP_ID
            {
            lv_referredId_3_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1288); 

            			newLeafNode(lv_referredId_3_0, grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdPP_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedListElementWithRefMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referredId",
                    		lv_referredId_3_0, 
                    		"PP_ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNamedListElementWithRefMetadata1305); 

                	newLeafNode(otherlv_4, grammarAccess.getNamedListElementWithRefMetadataAccess().getColonKeyword_4());
                
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:663:1: ( (lv_referenceMetadataId_5_0= RULE_PP_ID ) )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:664:1: (lv_referenceMetadataId_5_0= RULE_PP_ID )
            {
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:664:1: (lv_referenceMetadataId_5_0= RULE_PP_ID )
            // ../com.polopoly.ps.dsl.textcontent/src-gen/com/polopoly/ps/dsl/parser/antlr/internal/InternalTextContent.g:665:3: lv_referenceMetadataId_5_0= RULE_PP_ID
            {
            lv_referenceMetadataId_5_0=(Token)match(input,RULE_PP_ID,FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1322); 

            			newLeafNode(lv_referenceMetadataId_5_0, grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdPP_IDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedListElementWithRefMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceMetadataId",
                    		lv_referenceMetadataId_5_0, 
                    		"PP_ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedListElementWithRefMetadata"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTextContent132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleTextContent149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTextContent166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleTextContent183 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTextContent200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleTextContent217 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTextContent234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextContent251 = new BitSet(new long[]{0x00000000001A0002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleTextContent277 = new BitSet(new long[]{0x00000000001A0002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleTextContent299 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleListElement_in_ruleTextContent321 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponent409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleComponent426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponent443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleComponent460 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponent477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComponent494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReference582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleReference599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReference616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleReference633 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReference650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleReference667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElement_in_entryRuleListElement708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListElement718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultListElement_in_ruleListElement765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNamedListElement_in_ruleListElement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultListElement_in_entryRuleDefaultListElement827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultListElement837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefaultListElement874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleDefaultListElement891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNamedListElement_in_entryRuleAbstractNamedListElement932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNamedListElement942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElement_in_ruleAbstractNamedListElement989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElementWithRefMetadata_in_ruleAbstractNamedListElement1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElement_in_entryRuleNamedListElement1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedListElement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNamedListElement1098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleNamedListElement1115 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNamedListElement1132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleNamedListElement1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedListElementWithRefMetadata_in_entryRuleNamedListElementWithRefMetadata1190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedListElementWithRefMetadata1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNamedListElementWithRefMetadata1237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNamedListElementWithRefMetadata1271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNamedListElementWithRefMetadata1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PP_ID_in_ruleNamedListElementWithRefMetadata1322 = new BitSet(new long[]{0x0000000000000002L});

}