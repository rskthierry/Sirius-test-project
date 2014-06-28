package org.xtext.example.entity.ui.contentassist.antlr.internal; 

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
import org.xtext.example.entity.services.EntityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'extends'", "'attribute'", "':'"
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
    public String getGrammarFileName() { return "../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g"; }


     
     	private EntityDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntityModel"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:60:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:61:1: ( ruleEntityModel EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:62:1: ruleEntityModel EOF
            {
             before(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_ruleEntityModel_in_entryRuleEntityModel61);
            ruleEntityModel();

            state._fsp--;

             after(grammarAccess.getEntityModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityModel68); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:69:1: ruleEntityModel : ( ( rule__EntityModel__EntitiesAssignment )* ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:73:2: ( ( ( rule__EntityModel__EntitiesAssignment )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:74:1: ( ( rule__EntityModel__EntitiesAssignment )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:74:1: ( ( rule__EntityModel__EntitiesAssignment )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:75:1: ( rule__EntityModel__EntitiesAssignment )*
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:76:1: ( rule__EntityModel__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:76:2: rule__EntityModel__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_in_ruleEntityModel94);
            	    rule__EntityModel__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment()); 

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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:89:1: ( ruleEntity EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity122);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity129); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:104:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity155);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:117:1: ( ruleAttribute EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute182);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute189); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:125:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:129:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:130:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:130:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:131:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:132:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:132:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute215);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:146:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:150:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:151:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0249);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0252);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:158:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:162:1: ( ( 'entity' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:163:1: ( 'entity' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:163:1: ( 'entity' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:164:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Entity__Group__0__Impl280); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:177:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:181:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:182:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1311);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1314);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:189:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:193:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:194:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:194:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:195:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:196:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:196:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl341);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:206:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:210:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:211:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2371);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2374);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:218:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:222:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:223:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:223:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:224:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:225:1: ( rule__Entity__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:225:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl401);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:235:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:239:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:240:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3432);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3435);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:247:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:251:1: ( ( '{' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:252:1: ( '{' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:252:1: ( '{' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:253:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__3__Impl463); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:266:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:270:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:271:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4494);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4497);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:278:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:282:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:283:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:283:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:284:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:285:1: ( rule__Entity__AttributesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:285:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl524);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:295:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:299:1: ( rule__Entity__Group__5__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:300:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5555);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:306:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:310:1: ( ( '}' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:311:1: ( '}' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:311:1: ( '}' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:312:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__5__Impl583); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:337:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:341:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:342:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0626);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0629);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:349:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:353:1: ( ( 'extends' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:354:1: ( 'extends' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:354:1: ( 'extends' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:355:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group_2__0__Impl657); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:368:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:372:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:373:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__1688);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:379:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ParentAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:383:1: ( ( ( rule__Entity__ParentAssignment_2_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:384:1: ( ( rule__Entity__ParentAssignment_2_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:384:1: ( ( rule__Entity__ParentAssignment_2_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:385:1: ( rule__Entity__ParentAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getParentAssignment_2_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:386:1: ( rule__Entity__ParentAssignment_2_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:386:2: rule__Entity__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ParentAssignment_2_1_in_rule__Entity__Group_2__1__Impl715);
            rule__Entity__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getParentAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:400:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:404:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:405:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0749);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0752);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:412:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:416:1: ( ( 'attribute' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:417:1: ( 'attribute' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:417:1: ( 'attribute' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:418:1: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Attribute__Group__0__Impl780); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:431:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:435:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:436:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1811);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1814);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:443:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:447:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:448:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:448:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:449:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:450:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:450:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl841);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:460:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:464:1: ( rule__Attribute__Group__2__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:465:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2871);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:471:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:475:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:476:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:476:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:477:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:478:1: ( rule__Attribute__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:478:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl898);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:494:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:498:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:499:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__0935);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__0938);
            rule__Attribute__Group_2__1();

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
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:506:1: rule__Attribute__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:510:1: ( ( ':' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:511:1: ( ':' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:511:1: ( ':' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:512:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Attribute__Group_2__0__Impl966); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:525:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:529:1: ( rule__Attribute__Group_2__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:530:2: rule__Attribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__1997);
            rule__Attribute__Group_2__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:536:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__TypeAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:540:1: ( ( ( rule__Attribute__TypeAssignment_2_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:541:1: ( ( rule__Attribute__TypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:541:1: ( ( rule__Attribute__TypeAssignment_2_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:542:1: ( rule__Attribute__TypeAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:543:1: ( rule__Attribute__TypeAssignment_2_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:543:2: rule__Attribute__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_1_in_rule__Attribute__Group_2__1__Impl1024);
            rule__Attribute__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__EntityModel__EntitiesAssignment"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:558:1: rule__EntityModel__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__EntityModel__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:562:1: ( ( ruleEntity ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:563:1: ( ruleEntity )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:563:1: ( ruleEntity )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:564:1: ruleEntity
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment1063);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_0()); 

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
    // $ANTLR end "rule__EntityModel__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:573:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:577:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:578:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:578:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:579:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11094); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ParentAssignment_2_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:588:1: rule__Entity__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:592:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:593:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:593:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:594:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:595:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:596:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ParentAssignment_2_11129); 
             after(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__ParentAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:607:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:611:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:612:1: ( ruleAttribute )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:612:1: ( ruleAttribute )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:613:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41164);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:622:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:626:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:627:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:627:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:628:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11195); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:637:1: rule__Attribute__TypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:641:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:642:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:642:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:643:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:644:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:645:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_2_11230); 
             after(grammarAccess.getAttributeAccess().getTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_in_ruleEntityModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Entity__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1311 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2371 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3432 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__3__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4494 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl524 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__5__Impl583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group_2__0__Impl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ParentAssignment_2_1_in_rule__Entity__Group_2__1__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group__0__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1811 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__0935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__0938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__Group_2__0__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_1_in_rule__Attribute__Group_2__1__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ParentAssignment_2_11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_2_11230 = new BitSet(new long[]{0x0000000000000002L});

}