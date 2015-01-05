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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'.'", "'entity'", "'{'", "'}'", "'extends'", "'attribute'", "':'", "'abstract'"
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




    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:60:1: entryRuleNamespaceDefinition : ruleNamespaceDefinition EOF ;
    public final void entryRuleNamespaceDefinition() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:61:1: ( ruleNamespaceDefinition EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:62:1: ruleNamespaceDefinition EOF
            {
             before(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition61);
            ruleNamespaceDefinition();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition68); 

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
    // $ANTLR end "entryRuleNamespaceDefinition"


    // $ANTLR start "ruleNamespaceDefinition"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:69:1: ruleNamespaceDefinition : ( ( rule__NamespaceDefinition__Group__0 ) ) ;
    public final void ruleNamespaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:73:2: ( ( ( rule__NamespaceDefinition__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:74:1: ( ( rule__NamespaceDefinition__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:75:1: ( rule__NamespaceDefinition__Group__0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:76:1: ( rule__NamespaceDefinition__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:76:2: rule__NamespaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0_in_ruleNamespaceDefinition94);
            rule__NamespaceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:88:1: entryRuleNamespaceDeclaration : ruleNamespaceDeclaration EOF ;
    public final void entryRuleNamespaceDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:89:1: ( ruleNamespaceDeclaration EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:90:1: ruleNamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration121);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration128); 

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
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:97:1: ruleNamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void ruleNamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:101:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:102:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:102:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:103:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:104:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:104:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration154);
            rule__NamespaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleQualifedName"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:116:1: entryRuleQualifedName : ruleQualifedName EOF ;
    public final void entryRuleQualifedName() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:117:1: ( ruleQualifedName EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:118:1: ruleQualifedName EOF
            {
             before(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_ruleQualifedName_in_entryRuleQualifedName181);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getQualifedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifedName188); 

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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:125:1: ruleQualifedName : ( ( rule__QualifedName__Group__0 ) ) ;
    public final void ruleQualifedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:129:2: ( ( ( rule__QualifedName__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:130:1: ( ( rule__QualifedName__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:130:1: ( ( rule__QualifedName__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:131:1: ( rule__QualifedName__Group__0 )
            {
             before(grammarAccess.getQualifedNameAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:132:1: ( rule__QualifedName__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:132:2: rule__QualifedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName214);
            rule__QualifedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifedName"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:146:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:147:1: ( ruleEntity EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:148:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity243);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity250); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:155:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:159:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:160:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:160:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:161:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:162:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:162:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity276);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:174:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:175:1: ( ruleAttribute EOF )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:176:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute303);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute310); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:183:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:187:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:188:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:188:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:189:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:190:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:190:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute336);
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


    // $ANTLR start "rule__NamespaceDefinition__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:204:1: rule__NamespaceDefinition__Group__0 : rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 ;
    public final void rule__NamespaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:208:1: ( rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:209:2: rule__NamespaceDefinition__Group__0__Impl rule__NamespaceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0370);
            rule__NamespaceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0373);
            rule__NamespaceDefinition__Group__1();

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
    // $ANTLR end "rule__NamespaceDefinition__Group__0"


    // $ANTLR start "rule__NamespaceDefinition__Group__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:216:1: rule__NamespaceDefinition__Group__0__Impl : ( ( rule__NamespaceDefinition__NamespaceAssignment_0 ) ) ;
    public final void rule__NamespaceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:220:1: ( ( ( rule__NamespaceDefinition__NamespaceAssignment_0 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:221:1: ( ( rule__NamespaceDefinition__NamespaceAssignment_0 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:221:1: ( ( rule__NamespaceDefinition__NamespaceAssignment_0 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:222:1: ( rule__NamespaceDefinition__NamespaceAssignment_0 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceAssignment_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:223:1: ( rule__NamespaceDefinition__NamespaceAssignment_0 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:223:2: rule__NamespaceDefinition__NamespaceAssignment_0
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__NamespaceAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl400);
            rule__NamespaceDefinition__NamespaceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getNamespaceAssignment_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__Group__0__Impl"


    // $ANTLR start "rule__NamespaceDefinition__Group__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:233:1: rule__NamespaceDefinition__Group__1 : rule__NamespaceDefinition__Group__1__Impl ;
    public final void rule__NamespaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:237:1: ( rule__NamespaceDefinition__Group__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:238:2: rule__NamespaceDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1430);
            rule__NamespaceDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__NamespaceDefinition__Group__1"


    // $ANTLR start "rule__NamespaceDefinition__Group__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:244:1: rule__NamespaceDefinition__Group__1__Impl : ( ( rule__NamespaceDefinition__EntitiesAssignment_1 ) ) ;
    public final void rule__NamespaceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:248:1: ( ( ( rule__NamespaceDefinition__EntitiesAssignment_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:249:1: ( ( rule__NamespaceDefinition__EntitiesAssignment_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:249:1: ( ( rule__NamespaceDefinition__EntitiesAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:250:1: ( rule__NamespaceDefinition__EntitiesAssignment_1 )
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getEntitiesAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:251:1: ( rule__NamespaceDefinition__EntitiesAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:251:2: rule__NamespaceDefinition__EntitiesAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDefinition__EntitiesAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl457);
            rule__NamespaceDefinition__EntitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDefinitionAccess().getEntitiesAssignment_1()); 

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
    // $ANTLR end "rule__NamespaceDefinition__Group__1__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:265:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:269:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:270:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0491);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0494);
            rule__NamespaceDeclaration__Group__1();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:277:1: rule__NamespaceDeclaration__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:281:1: ( ( 'namespace' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:282:1: ( 'namespace' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:282:1: ( 'namespace' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:283:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__NamespaceDeclaration__Group__0__Impl522); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:296:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:300:1: ( rule__NamespaceDeclaration__Group__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:301:2: rule__NamespaceDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1553);
            rule__NamespaceDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:307:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:311:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:312:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:312:1: ( ( rule__NamespaceDeclaration__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:313:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:314:1: ( rule__NamespaceDeclaration__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:314:2: rule__NamespaceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl580);
            rule__NamespaceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__QualifedName__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:328:1: rule__QualifedName__Group__0 : rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 ;
    public final void rule__QualifedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:332:1: ( rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:333:2: rule__QualifedName__Group__0__Impl rule__QualifedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__0614);
            rule__QualifedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__0617);
            rule__QualifedName__Group__1();

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
    // $ANTLR end "rule__QualifedName__Group__0"


    // $ANTLR start "rule__QualifedName__Group__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:340:1: rule__QualifedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:344:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:345:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:345:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:346:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl644); 
             after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifedName__Group__0__Impl"


    // $ANTLR start "rule__QualifedName__Group__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:357:1: rule__QualifedName__Group__1 : rule__QualifedName__Group__1__Impl ;
    public final void rule__QualifedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:361:1: ( rule__QualifedName__Group__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:362:2: rule__QualifedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__1673);
            rule__QualifedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifedName__Group__1"


    // $ANTLR start "rule__QualifedName__Group__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:368:1: rule__QualifedName__Group__1__Impl : ( ( rule__QualifedName__Group_1__0 )* ) ;
    public final void rule__QualifedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:372:1: ( ( ( rule__QualifedName__Group_1__0 )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:373:1: ( ( rule__QualifedName__Group_1__0 )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:373:1: ( ( rule__QualifedName__Group_1__0 )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:374:1: ( rule__QualifedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifedNameAccess().getGroup_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:375:1: ( rule__QualifedName__Group_1__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:375:2: rule__QualifedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl700);
            	    rule__QualifedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQualifedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifedName__Group__1__Impl"


    // $ANTLR start "rule__QualifedName__Group_1__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:389:1: rule__QualifedName__Group_1__0 : rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 ;
    public final void rule__QualifedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:393:1: ( rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:394:2: rule__QualifedName__Group_1__0__Impl rule__QualifedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__0735);
            rule__QualifedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__0738);
            rule__QualifedName__Group_1__1();

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
    // $ANTLR end "rule__QualifedName__Group_1__0"


    // $ANTLR start "rule__QualifedName__Group_1__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:401:1: rule__QualifedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:405:1: ( ( '.' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:406:1: ( '.' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:406:1: ( '.' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:407:1: '.'
            {
             before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifedName__Group_1__0__Impl766); 
             after(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifedName__Group_1__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:420:1: rule__QualifedName__Group_1__1 : rule__QualifedName__Group_1__1__Impl ;
    public final void rule__QualifedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:424:1: ( rule__QualifedName__Group_1__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:425:2: rule__QualifedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__1797);
            rule__QualifedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifedName__Group_1__1"


    // $ANTLR start "rule__QualifedName__Group_1__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:431:1: rule__QualifedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:435:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:436:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:436:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:437:1: RULE_ID
            {
             before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl824); 
             after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifedName__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:453:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:457:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:458:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0858);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0861);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:465:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AbstractAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:469:1: ( ( ( rule__Entity__AbstractAssignment_0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:470:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:470:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:471:1: ( rule__Entity__AbstractAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:472:1: ( rule__Entity__AbstractAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:472:2: rule__Entity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl888);
                    rule__Entity__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:482:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:486:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:487:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1919);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1922);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:494:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:498:1: ( ( 'entity' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:499:1: ( 'entity' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:499:1: ( 'entity' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:500:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__1__Impl950); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:513:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:517:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:518:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2981);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2984);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:525:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:529:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:530:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:530:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:531:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:532:1: ( rule__Entity__NameAssignment_2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:532:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1011);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:542:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:546:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:547:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31041);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31044);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:554:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:558:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:559:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:559:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:560:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:561:1: ( rule__Entity__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:561:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1071);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:571:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:575:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:576:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41102);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41105);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:583:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:587:1: ( ( '{' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:588:1: ( '{' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:588:1: ( '{' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:589:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__4__Impl1133); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:602:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:606:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:607:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51164);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51167);
            rule__Entity__Group__6();

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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:614:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:618:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:619:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:619:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:620:1: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:621:1: ( rule__Entity__AttributesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:621:2: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl1194);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 

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


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:631:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:635:1: ( rule__Entity__Group__6__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:636:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61225);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:642:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:646:1: ( ( '}' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:647:1: ( '}' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:647:1: ( '}' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:648:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__6__Impl1253); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:675:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:679:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:680:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01298);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01301);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:687:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:691:1: ( ( 'extends' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:692:1: ( 'extends' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:692:1: ( 'extends' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:693:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group_3__0__Impl1329); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:706:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:710:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:711:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11360);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:717:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__ParentAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:721:1: ( ( ( rule__Entity__ParentAssignment_3_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:722:1: ( ( rule__Entity__ParentAssignment_3_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:722:1: ( ( rule__Entity__ParentAssignment_3_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:723:1: ( rule__Entity__ParentAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getParentAssignment_3_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:724:1: ( rule__Entity__ParentAssignment_3_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:724:2: rule__Entity__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__ParentAssignment_3_1_in_rule__Entity__Group_3__1__Impl1387);
            rule__Entity__ParentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getParentAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:738:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:742:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:743:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01421);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01424);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:750:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:754:1: ( ( 'attribute' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:755:1: ( 'attribute' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:755:1: ( 'attribute' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:756:1: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group__0__Impl1452); 
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:769:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:773:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:774:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11483);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11486);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:781:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:785:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:786:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:786:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:787:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:788:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:788:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1513);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:798:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:802:1: ( rule__Attribute__Group__2__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:803:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21543);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:809:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:813:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:814:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:814:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:815:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:816:1: ( rule__Attribute__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:816:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl1570);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:832:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:836:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:837:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__01607);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__01610);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:844:1: rule__Attribute__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:848:1: ( ( ':' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:849:1: ( ':' )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:849:1: ( ':' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:850:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group_2__0__Impl1638); 
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:863:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:867:1: ( rule__Attribute__Group_2__1__Impl )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:868:2: rule__Attribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__11669);
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:874:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__TypeAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:878:1: ( ( ( rule__Attribute__TypeAssignment_2_1 ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:879:1: ( ( rule__Attribute__TypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:879:1: ( ( rule__Attribute__TypeAssignment_2_1 ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:880:1: ( rule__Attribute__TypeAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2_1()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:881:1: ( rule__Attribute__TypeAssignment_2_1 )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:881:2: rule__Attribute__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_1_in_rule__Attribute__Group_2__1__Impl1696);
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


    // $ANTLR start "rule__NamespaceDefinition__NamespaceAssignment_0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:896:1: rule__NamespaceDefinition__NamespaceAssignment_0 : ( ruleNamespaceDeclaration ) ;
    public final void rule__NamespaceDefinition__NamespaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:900:1: ( ( ruleNamespaceDeclaration ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:901:1: ( ruleNamespaceDeclaration )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:901:1: ( ruleNamespaceDeclaration )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:902:1: ruleNamespaceDeclaration
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getNamespaceNamespaceDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceAssignment_01735);
            ruleNamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getNamespaceNamespaceDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__NamespaceAssignment_0"


    // $ANTLR start "rule__NamespaceDefinition__EntitiesAssignment_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:911:1: rule__NamespaceDefinition__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__NamespaceDefinition__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:915:1: ( ( ruleEntity ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:916:1: ( ruleEntity )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:916:1: ( ruleEntity )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:917:1: ruleEntity
            {
             before(grammarAccess.getNamespaceDefinitionAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__NamespaceDefinition__EntitiesAssignment_11766);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getNamespaceDefinitionAccess().getEntitiesEntityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamespaceDefinition__EntitiesAssignment_1"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:926:1: rule__NamespaceDeclaration__NameAssignment_1 : ( ruleQualifedName ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:930:1: ( ( ruleQualifedName ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:931:1: ( ruleQualifedName )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:931:1: ( ruleQualifedName )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:932:1: ruleQualifedName
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_11797);
            ruleQualifedName();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Entity__AbstractAssignment_0"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:941:1: rule__Entity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:945:1: ( ( ( 'abstract' ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:946:1: ( ( 'abstract' ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:946:1: ( ( 'abstract' ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:947:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:948:1: ( 'abstract' )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:949:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__AbstractAssignment_01833); 
             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__Entity__AbstractAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:964:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:968:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:969:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:969:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:970:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_21872); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__ParentAssignment_3_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:979:1: rule__Entity__ParentAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:983:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:984:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:984:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:985:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getParentEntityCrossReference_3_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:986:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:987:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ParentAssignment_3_11907); 
             after(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getParentEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__ParentAssignment_3_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:998:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1002:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1003:1: ( ruleAttribute )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1003:1: ( ruleAttribute )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1004:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_51942);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1013:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1017:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1018:1: ( RULE_ID )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1018:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1019:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11973); 
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
    // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1028:1: rule__Attribute__TypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1032:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1033:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1033:1: ( ( RULE_ID ) )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1034:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1035:1: ( RULE_ID )
            // ../org.xtext.example.entity.ui/src-gen/org/xtext/example/entity/ui/contentassist/antlr/internal/InternalEntityDSL.g:1036:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_2_12008); 
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


 

    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0_in_ruleNamespaceDefinition94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_ruleNamespaceDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_entryRuleQualifedName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifedName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0_in_ruleQualifedName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__0__Impl_in_rule__NamespaceDefinition__Group__0370 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1_in_rule__NamespaceDefinition__Group__0373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__NamespaceAssignment_0_in_rule__NamespaceDefinition__Group__0__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__Group__1__Impl_in_rule__NamespaceDefinition__Group__1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDefinition__EntitiesAssignment_1_in_rule__NamespaceDefinition__Group__1__Impl457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NamespaceDeclaration__Group__0__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_in_rule__NamespaceDeclaration__Group__1__Impl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__0__Impl_in_rule__QualifedName__Group__0614 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1_in_rule__QualifedName__Group__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group__0__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group__1__Impl_in_rule__QualifedName__Group__1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0_in_rule__QualifedName__Group__1__Impl700 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__0__Impl_in_rule__QualifedName__Group_1__0735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1_in_rule__QualifedName__Group_1__0738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifedName__Group_1__0__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifedName__Group_1__1__Impl_in_rule__QualifedName__Group_1__1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifedName__Group_1__1__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0858 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__1__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2981 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31041 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41102 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__4__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51164 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_5_in_rule__Entity__Group__5__Impl1194 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__6__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group_3__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ParentAssignment_3_1_in_rule__Entity__Group_3__1__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group__0__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__01607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__01610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group_2__0__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_1_in_rule__Attribute__Group_2__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_rule__NamespaceDefinition__NamespaceAssignment_01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__NamespaceDefinition__EntitiesAssignment_11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifedName_in_rule__NamespaceDeclaration__NameAssignment_11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__AbstractAssignment_01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_21872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ParentAssignment_3_11907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_51942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_2_12008 = new BitSet(new long[]{0x0000000000000002L});

}