package org.xtext.example.entity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.entity.services.EntityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'.'", "'abstract'", "'entity'", "'extends'", "'{'", "'}'", "'attribute'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEntityDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g"; }



     	private EntityDSLGrammarAccess grammarAccess;
     	
        public InternalEntityDSLParser(TokenStream input, EntityDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NamespaceDefinition";	
       	}
       	
       	@Override
       	protected EntityDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:67:1: entryRuleNamespaceDefinition returns [EObject current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final EObject entryRuleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDefinition = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:68:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:69:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition75);
            iv_ruleNamespaceDefinition=ruleNamespaceDefinition();

            state._fsp--;

             current =iv_ruleNamespaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition85); 

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
    // $ANTLR end "entryRuleNamespaceDefinition"


    // $ANTLR start "ruleNamespaceDefinition"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:76:1: ruleNamespaceDefinition returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleNamespaceDeclaration ) ) ( (lv_entities_1_0= ruleEntity ) ) ) ;
    public final EObject ruleNamespaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_namespace_0_0 = null;

        EObject lv_entities_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:79:28: ( ( ( (lv_namespace_0_0= ruleNamespaceDeclaration ) ) ( (lv_entities_1_0= ruleEntity ) ) ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:1: ( ( (lv_namespace_0_0= ruleNamespaceDeclaration ) ) ( (lv_entities_1_0= ruleEntity ) ) )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:1: ( ( (lv_namespace_0_0= ruleNamespaceDeclaration ) ) ( (lv_entities_1_0= ruleEntity ) ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:2: ( (lv_namespace_0_0= ruleNamespaceDeclaration ) ) ( (lv_entities_1_0= ruleEntity ) )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:2: ( (lv_namespace_0_0= ruleNamespaceDeclaration ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:81:1: (lv_namespace_0_0= ruleNamespaceDeclaration )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:81:1: (lv_namespace_0_0= ruleNamespaceDeclaration )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:82:3: lv_namespace_0_0= ruleNamespaceDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getNamespaceNamespaceDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_ruleNamespaceDefinition131);
            lv_namespace_0_0=ruleNamespaceDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_0_0, 
                    		"NamespaceDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:98:2: ( (lv_entities_1_0= ruleEntity ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:99:1: (lv_entities_1_0= ruleEntity )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:99:1: (lv_entities_1_0= ruleEntity )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:100:3: lv_entities_1_0= ruleEntity
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getEntitiesEntityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEntity_in_ruleNamespaceDefinition152);
            lv_entities_1_0=ruleEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"entities",
                    		lv_entities_1_0, 
                    		"Entity");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:124:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:125:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:126:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration188);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration198); 

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
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:133:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:136:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:137:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:137:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:137:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespaceDeclaration235); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:141:1: ( (lv_name_1_0= ruleQualifedName ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:142:1: (lv_name_1_0= ruleQualifedName )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:142:1: (lv_name_1_0= ruleQualifedName )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:143:3: lv_name_1_0= ruleQualifedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration256);
            lv_name_1_0=ruleQualifedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleQualifedName"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:167:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:168:2: (iv_ruleQualifedName= ruleQualifedName EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:169:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName293);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName304); 

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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:176:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:179:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:180:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName344); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:187:1: (kw= '.' this_ID_2= RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:188:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifedName363); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifedName378); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifedName"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:210:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:211:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:212:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity427);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity437); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:219:1: ruleEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:222:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:223:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:223:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:223:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:223:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:224:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:224:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:225:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,13,FOLLOW_13_in_ruleEntity480); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEntity506); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:242:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:243:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:243:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:244:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity523); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:260:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:260:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity541); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:264:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:265:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:265:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:266:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity561); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getParentEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEntity575); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:281:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:282:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:282:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:283:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity596);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEntity609); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:311:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:312:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:313:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute645);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute655); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:320:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:323:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:324:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:324:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:324:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAttribute692); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:329:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:329:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute709); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:346:2: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:346:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAttribute727); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2_0());
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:350:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:351:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:351:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:352:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute747); 

                    		newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_ruleNamespaceDefinition131 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleNamespaceDefinition152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespaceDeclaration235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifedName_in_ruleNamespaceDeclaration256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName344 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifedName363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifedName378 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEntity480 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity523 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEntity541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity575 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity596 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleEntity609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAttribute692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute709 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute747 = new BitSet(new long[]{0x0000000000000002L});

}