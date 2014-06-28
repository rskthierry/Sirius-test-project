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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "'attribute'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
        	return "EntityModel";	
       	}
       	
       	@Override
       	protected EntityDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntityModel"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:67:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:68:2: (iv_ruleEntityModel= ruleEntityModel EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:69:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
             newCompositeNode(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_ruleEntityModel_in_entryRuleEntityModel75);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;

             current =iv_ruleEntityModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityModel85); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:76:1: ruleEntityModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:79:28: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:1: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:80:1: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:81:1: (lv_entities_0_0= ruleEntity )
            	    {
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:81:1: (lv_entities_0_0= ruleEntity )
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:82:3: lv_entities_0_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleEntityModel130);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_0_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:106:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:107:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:108:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity166);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity176); 

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
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:115:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:118:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:119:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:119:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:119:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity213); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:141:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:141:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity248); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:146:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:147:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity268); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity282); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:162:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:163:1: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:163:1: (lv_attributes_5_0= ruleAttribute )
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:164:3: lv_attributes_5_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity303);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEntity316); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:192:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:193:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:194:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute352);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute362); 

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
    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:201:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:204:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:205:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:205:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:205:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAttribute399); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:209:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:210:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:210:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:211:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute416); 

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

            // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:227:2: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:227:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAttribute434); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2_0());
                        
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:231:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:232:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:232:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/entity/parser/antlr/internal/InternalEntityDSL.g:233:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute454); 

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


 

    public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity230 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleEntity248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity282 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity303 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleEntity316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAttribute399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute416 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAttribute434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute454 = new BitSet(new long[]{0x0000000000000002L});

}