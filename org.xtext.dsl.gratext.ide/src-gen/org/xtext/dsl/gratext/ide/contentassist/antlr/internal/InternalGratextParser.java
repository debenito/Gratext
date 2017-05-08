package org.xtext.dsl.gratext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.dsl.gratext.services.GratextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGratextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DELAVAL'", "'SIEMENS'", "'TABLET'", "'MOVIL'", "'ORDENADOR'", "'CAMARA'", "'TEMPERATURA'", "'FUEGO_HUMO'", "'CO2'", "'GAS'", "'PRESENCIA'", "'MAGNETICO'", "'ROTURA_CRISTAL'", "'BARRERA_SEGURIDAD'", "'LUMINOSIDAD'", "'EMERGENCIA'", "'INUNDACION'", "'VIENTO'", "'LLUVIA'", "'ESTACION_METEOROLOGICA'", "'SISTEMA_IDENTIFICACION'", "'INFRARROJOS'", "'RADIOFRECUENCIA'", "'MECEDORA'", "'PULSOMETRO_GANADO'", "'DEPOSITO_LECHE'", "'ROBOT_LIMPIADOR'", "'NEVERAS'", "'LUZ'", "'ABRIR'", "'ENVIAR'", "'SACAR'", "'CERRAR'", "'ESTADO'", "'GRABAR'", "'DETECTAR'", "'ENCENDER'", "'APAGAR'", "'AUMENTAR'", "'DISMINUIR'", "'COMPROBAR'", "'ACTIVAR'", "'DESACTIVAR'", "'Granja:'", "'Centralita:'", "'Dispositivos{'", "'}'", "'Usuario:'", "'Contrase\\u00F1a:'", "'Codigo:'", "'Sensor'", "'quiero'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGratextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGratextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGratextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGratext.g"; }


    	private GratextGrammarAccess grammarAccess;

    	public void setGrammarAccess(GratextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGranja"
    // InternalGratext.g:53:1: entryRuleGranja : ruleGranja EOF ;
    public final void entryRuleGranja() throws RecognitionException {
        try {
            // InternalGratext.g:54:1: ( ruleGranja EOF )
            // InternalGratext.g:55:1: ruleGranja EOF
            {
             before(grammarAccess.getGranjaRule()); 
            pushFollow(FOLLOW_1);
            ruleGranja();

            state._fsp--;

             after(grammarAccess.getGranjaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGranja"


    // $ANTLR start "ruleGranja"
    // InternalGratext.g:62:1: ruleGranja : ( ( rule__Granja__Group__0 ) ) ;
    public final void ruleGranja() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:66:2: ( ( ( rule__Granja__Group__0 ) ) )
            // InternalGratext.g:67:2: ( ( rule__Granja__Group__0 ) )
            {
            // InternalGratext.g:67:2: ( ( rule__Granja__Group__0 ) )
            // InternalGratext.g:68:3: ( rule__Granja__Group__0 )
            {
             before(grammarAccess.getGranjaAccess().getGroup()); 
            // InternalGratext.g:69:3: ( rule__Granja__Group__0 )
            // InternalGratext.g:69:4: rule__Granja__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Granja__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getGroup()); 

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
    // $ANTLR end "ruleGranja"


    // $ANTLR start "entryRulelogin"
    // InternalGratext.g:78:1: entryRulelogin : rulelogin EOF ;
    public final void entryRulelogin() throws RecognitionException {
        try {
            // InternalGratext.g:79:1: ( rulelogin EOF )
            // InternalGratext.g:80:1: rulelogin EOF
            {
             before(grammarAccess.getLoginRule()); 
            pushFollow(FOLLOW_1);
            rulelogin();

            state._fsp--;

             after(grammarAccess.getLoginRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelogin"


    // $ANTLR start "rulelogin"
    // InternalGratext.g:87:1: rulelogin : ( ( rule__Login__Group__0 ) ) ;
    public final void rulelogin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:91:2: ( ( ( rule__Login__Group__0 ) ) )
            // InternalGratext.g:92:2: ( ( rule__Login__Group__0 ) )
            {
            // InternalGratext.g:92:2: ( ( rule__Login__Group__0 ) )
            // InternalGratext.g:93:3: ( rule__Login__Group__0 )
            {
             before(grammarAccess.getLoginAccess().getGroup()); 
            // InternalGratext.g:94:3: ( rule__Login__Group__0 )
            // InternalGratext.g:94:4: rule__Login__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getGroup()); 

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
    // $ANTLR end "rulelogin"


    // $ANTLR start "entryRuleDispositivos"
    // InternalGratext.g:103:1: entryRuleDispositivos : ruleDispositivos EOF ;
    public final void entryRuleDispositivos() throws RecognitionException {
        try {
            // InternalGratext.g:104:1: ( ruleDispositivos EOF )
            // InternalGratext.g:105:1: ruleDispositivos EOF
            {
             before(grammarAccess.getDispositivosRule()); 
            pushFollow(FOLLOW_1);
            ruleDispositivos();

            state._fsp--;

             after(grammarAccess.getDispositivosRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDispositivos"


    // $ANTLR start "ruleDispositivos"
    // InternalGratext.g:112:1: ruleDispositivos : ( ( rule__Dispositivos__Group__0 ) ) ;
    public final void ruleDispositivos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:116:2: ( ( ( rule__Dispositivos__Group__0 ) ) )
            // InternalGratext.g:117:2: ( ( rule__Dispositivos__Group__0 ) )
            {
            // InternalGratext.g:117:2: ( ( rule__Dispositivos__Group__0 ) )
            // InternalGratext.g:118:3: ( rule__Dispositivos__Group__0 )
            {
             before(grammarAccess.getDispositivosAccess().getGroup()); 
            // InternalGratext.g:119:3: ( rule__Dispositivos__Group__0 )
            // InternalGratext.g:119:4: rule__Dispositivos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDispositivosAccess().getGroup()); 

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
    // $ANTLR end "ruleDispositivos"


    // $ANTLR start "entryRuleaccion"
    // InternalGratext.g:128:1: entryRuleaccion : ruleaccion EOF ;
    public final void entryRuleaccion() throws RecognitionException {
        try {
            // InternalGratext.g:129:1: ( ruleaccion EOF )
            // InternalGratext.g:130:1: ruleaccion EOF
            {
             before(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_1);
            ruleaccion();

            state._fsp--;

             after(grammarAccess.getAccionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleaccion"


    // $ANTLR start "ruleaccion"
    // InternalGratext.g:137:1: ruleaccion : ( ( rule__Accion__Group__0 ) ) ;
    public final void ruleaccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:141:2: ( ( ( rule__Accion__Group__0 ) ) )
            // InternalGratext.g:142:2: ( ( rule__Accion__Group__0 ) )
            {
            // InternalGratext.g:142:2: ( ( rule__Accion__Group__0 ) )
            // InternalGratext.g:143:3: ( rule__Accion__Group__0 )
            {
             before(grammarAccess.getAccionAccess().getGroup()); 
            // InternalGratext.g:144:3: ( rule__Accion__Group__0 )
            // InternalGratext.g:144:4: rule__Accion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Accion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccionAccess().getGroup()); 

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
    // $ANTLR end "ruleaccion"


    // $ANTLR start "entryRulenumero"
    // InternalGratext.g:153:1: entryRulenumero : rulenumero EOF ;
    public final void entryRulenumero() throws RecognitionException {
        try {
            // InternalGratext.g:154:1: ( rulenumero EOF )
            // InternalGratext.g:155:1: rulenumero EOF
            {
             before(grammarAccess.getNumeroRule()); 
            pushFollow(FOLLOW_1);
            rulenumero();

            state._fsp--;

             after(grammarAccess.getNumeroRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulenumero"


    // $ANTLR start "rulenumero"
    // InternalGratext.g:162:1: rulenumero : ( ( rule__Numero__Group__0 ) ) ;
    public final void rulenumero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:166:2: ( ( ( rule__Numero__Group__0 ) ) )
            // InternalGratext.g:167:2: ( ( rule__Numero__Group__0 ) )
            {
            // InternalGratext.g:167:2: ( ( rule__Numero__Group__0 ) )
            // InternalGratext.g:168:3: ( rule__Numero__Group__0 )
            {
             before(grammarAccess.getNumeroAccess().getGroup()); 
            // InternalGratext.g:169:3: ( rule__Numero__Group__0 )
            // InternalGratext.g:169:4: rule__Numero__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Numero__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumeroAccess().getGroup()); 

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
    // $ANTLR end "rulenumero"


    // $ANTLR start "ruleTipo"
    // InternalGratext.g:178:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:182:1: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalGratext.g:183:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalGratext.g:183:2: ( ( rule__Tipo__Alternatives ) )
            // InternalGratext.g:184:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalGratext.g:185:3: ( rule__Tipo__Alternatives )
            // InternalGratext.g:185:4: rule__Tipo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tipo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "ruleTiposDispositivo"
    // InternalGratext.g:194:1: ruleTiposDispositivo : ( ( rule__TiposDispositivo__Alternatives ) ) ;
    public final void ruleTiposDispositivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:198:1: ( ( ( rule__TiposDispositivo__Alternatives ) ) )
            // InternalGratext.g:199:2: ( ( rule__TiposDispositivo__Alternatives ) )
            {
            // InternalGratext.g:199:2: ( ( rule__TiposDispositivo__Alternatives ) )
            // InternalGratext.g:200:3: ( rule__TiposDispositivo__Alternatives )
            {
             before(grammarAccess.getTiposDispositivoAccess().getAlternatives()); 
            // InternalGratext.g:201:3: ( rule__TiposDispositivo__Alternatives )
            // InternalGratext.g:201:4: rule__TiposDispositivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TiposDispositivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTiposDispositivoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTiposDispositivo"


    // $ANTLR start "ruleNombreAccion"
    // InternalGratext.g:210:1: ruleNombreAccion : ( ( rule__NombreAccion__Alternatives ) ) ;
    public final void ruleNombreAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:214:1: ( ( ( rule__NombreAccion__Alternatives ) ) )
            // InternalGratext.g:215:2: ( ( rule__NombreAccion__Alternatives ) )
            {
            // InternalGratext.g:215:2: ( ( rule__NombreAccion__Alternatives ) )
            // InternalGratext.g:216:3: ( rule__NombreAccion__Alternatives )
            {
             before(grammarAccess.getNombreAccionAccess().getAlternatives()); 
            // InternalGratext.g:217:3: ( rule__NombreAccion__Alternatives )
            // InternalGratext.g:217:4: rule__NombreAccion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NombreAccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombreAccionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNombreAccion"


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalGratext.g:225:1: rule__Tipo__Alternatives : ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:229:1: ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGratext.g:230:2: ( ( 'DELAVAL' ) )
                    {
                    // InternalGratext.g:230:2: ( ( 'DELAVAL' ) )
                    // InternalGratext.g:231:3: ( 'DELAVAL' )
                    {
                     before(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:232:3: ( 'DELAVAL' )
                    // InternalGratext.g:232:4: 'DELAVAL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:236:2: ( ( 'SIEMENS' ) )
                    {
                    // InternalGratext.g:236:2: ( ( 'SIEMENS' ) )
                    // InternalGratext.g:237:3: ( 'SIEMENS' )
                    {
                     before(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:238:3: ( 'SIEMENS' )
                    // InternalGratext.g:238:4: 'SIEMENS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:242:2: ( ( 'TABLET' ) )
                    {
                    // InternalGratext.g:242:2: ( ( 'TABLET' ) )
                    // InternalGratext.g:243:3: ( 'TABLET' )
                    {
                     before(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:244:3: ( 'TABLET' )
                    // InternalGratext.g:244:4: 'TABLET'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:248:2: ( ( 'MOVIL' ) )
                    {
                    // InternalGratext.g:248:2: ( ( 'MOVIL' ) )
                    // InternalGratext.g:249:3: ( 'MOVIL' )
                    {
                     before(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 
                    // InternalGratext.g:250:3: ( 'MOVIL' )
                    // InternalGratext.g:250:4: 'MOVIL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:254:2: ( ( 'ORDENADOR' ) )
                    {
                    // InternalGratext.g:254:2: ( ( 'ORDENADOR' ) )
                    // InternalGratext.g:255:3: ( 'ORDENADOR' )
                    {
                     before(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); 
                    // InternalGratext.g:256:3: ( 'ORDENADOR' )
                    // InternalGratext.g:256:4: 'ORDENADOR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Tipo__Alternatives"


    // $ANTLR start "rule__TiposDispositivo__Alternatives"
    // InternalGratext.g:264:1: rule__TiposDispositivo__Alternatives : ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) | ( ( 'LUZ' ) ) );
    public final void rule__TiposDispositivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:268:1: ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) | ( ( 'LUZ' ) ) )
            int alt2=24;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case 24:
                {
                alt2=9;
                }
                break;
            case 25:
                {
                alt2=10;
                }
                break;
            case 26:
                {
                alt2=11;
                }
                break;
            case 27:
                {
                alt2=12;
                }
                break;
            case 28:
                {
                alt2=13;
                }
                break;
            case 29:
                {
                alt2=14;
                }
                break;
            case 30:
                {
                alt2=15;
                }
                break;
            case 31:
                {
                alt2=16;
                }
                break;
            case 32:
                {
                alt2=17;
                }
                break;
            case 33:
                {
                alt2=18;
                }
                break;
            case 34:
                {
                alt2=19;
                }
                break;
            case 35:
                {
                alt2=20;
                }
                break;
            case 36:
                {
                alt2=21;
                }
                break;
            case 37:
                {
                alt2=22;
                }
                break;
            case 38:
                {
                alt2=23;
                }
                break;
            case 39:
                {
                alt2=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGratext.g:269:2: ( ( 'CAMARA' ) )
                    {
                    // InternalGratext.g:269:2: ( ( 'CAMARA' ) )
                    // InternalGratext.g:270:3: ( 'CAMARA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:271:3: ( 'CAMARA' )
                    // InternalGratext.g:271:4: 'CAMARA'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:275:2: ( ( 'TEMPERATURA' ) )
                    {
                    // InternalGratext.g:275:2: ( ( 'TEMPERATURA' ) )
                    // InternalGratext.g:276:3: ( 'TEMPERATURA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:277:3: ( 'TEMPERATURA' )
                    // InternalGratext.g:277:4: 'TEMPERATURA'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:281:2: ( ( 'FUEGO_HUMO' ) )
                    {
                    // InternalGratext.g:281:2: ( ( 'FUEGO_HUMO' ) )
                    // InternalGratext.g:282:3: ( 'FUEGO_HUMO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:283:3: ( 'FUEGO_HUMO' )
                    // InternalGratext.g:283:4: 'FUEGO_HUMO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:287:2: ( ( 'CO2' ) )
                    {
                    // InternalGratext.g:287:2: ( ( 'CO2' ) )
                    // InternalGratext.g:288:3: ( 'CO2' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 
                    // InternalGratext.g:289:3: ( 'CO2' )
                    // InternalGratext.g:289:4: 'CO2'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:293:2: ( ( 'GAS' ) )
                    {
                    // InternalGratext.g:293:2: ( ( 'GAS' ) )
                    // InternalGratext.g:294:3: ( 'GAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:295:3: ( 'GAS' )
                    // InternalGratext.g:295:4: 'GAS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:299:2: ( ( 'PRESENCIA' ) )
                    {
                    // InternalGratext.g:299:2: ( ( 'PRESENCIA' ) )
                    // InternalGratext.g:300:3: ( 'PRESENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 
                    // InternalGratext.g:301:3: ( 'PRESENCIA' )
                    // InternalGratext.g:301:4: 'PRESENCIA'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:305:2: ( ( 'MAGNETICO' ) )
                    {
                    // InternalGratext.g:305:2: ( ( 'MAGNETICO' ) )
                    // InternalGratext.g:306:3: ( 'MAGNETICO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 
                    // InternalGratext.g:307:3: ( 'MAGNETICO' )
                    // InternalGratext.g:307:4: 'MAGNETICO'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:311:2: ( ( 'ROTURA_CRISTAL' ) )
                    {
                    // InternalGratext.g:311:2: ( ( 'ROTURA_CRISTAL' ) )
                    // InternalGratext.g:312:3: ( 'ROTURA_CRISTAL' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 
                    // InternalGratext.g:313:3: ( 'ROTURA_CRISTAL' )
                    // InternalGratext.g:313:4: 'ROTURA_CRISTAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:317:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    {
                    // InternalGratext.g:317:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    // InternalGratext.g:318:3: ( 'BARRERA_SEGURIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 
                    // InternalGratext.g:319:3: ( 'BARRERA_SEGURIDAD' )
                    // InternalGratext.g:319:4: 'BARRERA_SEGURIDAD'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:323:2: ( ( 'LUMINOSIDAD' ) )
                    {
                    // InternalGratext.g:323:2: ( ( 'LUMINOSIDAD' ) )
                    // InternalGratext.g:324:3: ( 'LUMINOSIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 
                    // InternalGratext.g:325:3: ( 'LUMINOSIDAD' )
                    // InternalGratext.g:325:4: 'LUMINOSIDAD'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:329:2: ( ( 'EMERGENCIA' ) )
                    {
                    // InternalGratext.g:329:2: ( ( 'EMERGENCIA' ) )
                    // InternalGratext.g:330:3: ( 'EMERGENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 
                    // InternalGratext.g:331:3: ( 'EMERGENCIA' )
                    // InternalGratext.g:331:4: 'EMERGENCIA'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:335:2: ( ( 'INUNDACION' ) )
                    {
                    // InternalGratext.g:335:2: ( ( 'INUNDACION' ) )
                    // InternalGratext.g:336:3: ( 'INUNDACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 
                    // InternalGratext.g:337:3: ( 'INUNDACION' )
                    // InternalGratext.g:337:4: 'INUNDACION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:341:2: ( ( 'VIENTO' ) )
                    {
                    // InternalGratext.g:341:2: ( ( 'VIENTO' ) )
                    // InternalGratext.g:342:3: ( 'VIENTO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 
                    // InternalGratext.g:343:3: ( 'VIENTO' )
                    // InternalGratext.g:343:4: 'VIENTO'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:347:2: ( ( 'LLUVIA' ) )
                    {
                    // InternalGratext.g:347:2: ( ( 'LLUVIA' ) )
                    // InternalGratext.g:348:3: ( 'LLUVIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 
                    // InternalGratext.g:349:3: ( 'LLUVIA' )
                    // InternalGratext.g:349:4: 'LLUVIA'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGratext.g:353:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    {
                    // InternalGratext.g:353:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    // InternalGratext.g:354:3: ( 'ESTACION_METEOROLOGICA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 
                    // InternalGratext.g:355:3: ( 'ESTACION_METEOROLOGICA' )
                    // InternalGratext.g:355:4: 'ESTACION_METEOROLOGICA'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGratext.g:359:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    {
                    // InternalGratext.g:359:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    // InternalGratext.g:360:3: ( 'SISTEMA_IDENTIFICACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 
                    // InternalGratext.g:361:3: ( 'SISTEMA_IDENTIFICACION' )
                    // InternalGratext.g:361:4: 'SISTEMA_IDENTIFICACION'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGratext.g:365:2: ( ( 'INFRARROJOS' ) )
                    {
                    // InternalGratext.g:365:2: ( ( 'INFRARROJOS' ) )
                    // InternalGratext.g:366:3: ( 'INFRARROJOS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 
                    // InternalGratext.g:367:3: ( 'INFRARROJOS' )
                    // InternalGratext.g:367:4: 'INFRARROJOS'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGratext.g:371:2: ( ( 'RADIOFRECUENCIA' ) )
                    {
                    // InternalGratext.g:371:2: ( ( 'RADIOFRECUENCIA' ) )
                    // InternalGratext.g:372:3: ( 'RADIOFRECUENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 
                    // InternalGratext.g:373:3: ( 'RADIOFRECUENCIA' )
                    // InternalGratext.g:373:4: 'RADIOFRECUENCIA'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGratext.g:377:2: ( ( 'MECEDORA' ) )
                    {
                    // InternalGratext.g:377:2: ( ( 'MECEDORA' ) )
                    // InternalGratext.g:378:3: ( 'MECEDORA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 
                    // InternalGratext.g:379:3: ( 'MECEDORA' )
                    // InternalGratext.g:379:4: 'MECEDORA'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalGratext.g:383:2: ( ( 'PULSOMETRO_GANADO' ) )
                    {
                    // InternalGratext.g:383:2: ( ( 'PULSOMETRO_GANADO' ) )
                    // InternalGratext.g:384:3: ( 'PULSOMETRO_GANADO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 
                    // InternalGratext.g:385:3: ( 'PULSOMETRO_GANADO' )
                    // InternalGratext.g:385:4: 'PULSOMETRO_GANADO'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalGratext.g:389:2: ( ( 'DEPOSITO_LECHE' ) )
                    {
                    // InternalGratext.g:389:2: ( ( 'DEPOSITO_LECHE' ) )
                    // InternalGratext.g:390:3: ( 'DEPOSITO_LECHE' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 
                    // InternalGratext.g:391:3: ( 'DEPOSITO_LECHE' )
                    // InternalGratext.g:391:4: 'DEPOSITO_LECHE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalGratext.g:395:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    {
                    // InternalGratext.g:395:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    // InternalGratext.g:396:3: ( 'ROBOT_LIMPIADOR' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 
                    // InternalGratext.g:397:3: ( 'ROBOT_LIMPIADOR' )
                    // InternalGratext.g:397:4: 'ROBOT_LIMPIADOR'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalGratext.g:401:2: ( ( 'NEVERAS' ) )
                    {
                    // InternalGratext.g:401:2: ( ( 'NEVERAS' ) )
                    // InternalGratext.g:402:3: ( 'NEVERAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); 
                    // InternalGratext.g:403:3: ( 'NEVERAS' )
                    // InternalGratext.g:403:4: 'NEVERAS'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalGratext.g:407:2: ( ( 'LUZ' ) )
                    {
                    // InternalGratext.g:407:2: ( ( 'LUZ' ) )
                    // InternalGratext.g:408:3: ( 'LUZ' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLUZEnumLiteralDeclaration_23()); 
                    // InternalGratext.g:409:3: ( 'LUZ' )
                    // InternalGratext.g:409:4: 'LUZ'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLUZEnumLiteralDeclaration_23()); 

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
    // $ANTLR end "rule__TiposDispositivo__Alternatives"


    // $ANTLR start "rule__NombreAccion__Alternatives"
    // InternalGratext.g:417:1: rule__NombreAccion__Alternatives : ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) );
    public final void rule__NombreAccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:421:1: ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            case 45:
                {
                alt3=6;
                }
                break;
            case 46:
                {
                alt3=7;
                }
                break;
            case 47:
                {
                alt3=8;
                }
                break;
            case 48:
                {
                alt3=9;
                }
                break;
            case 49:
                {
                alt3=10;
                }
                break;
            case 50:
                {
                alt3=11;
                }
                break;
            case 51:
                {
                alt3=12;
                }
                break;
            case 52:
                {
                alt3=13;
                }
                break;
            case 53:
                {
                alt3=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGratext.g:422:2: ( ( 'ABRIR' ) )
                    {
                    // InternalGratext.g:422:2: ( ( 'ABRIR' ) )
                    // InternalGratext.g:423:3: ( 'ABRIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 
                    // InternalGratext.g:424:3: ( 'ABRIR' )
                    // InternalGratext.g:424:4: 'ABRIR'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:428:2: ( ( 'ENVIAR' ) )
                    {
                    // InternalGratext.g:428:2: ( ( 'ENVIAR' ) )
                    // InternalGratext.g:429:3: ( 'ENVIAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 
                    // InternalGratext.g:430:3: ( 'ENVIAR' )
                    // InternalGratext.g:430:4: 'ENVIAR'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:434:2: ( ( 'SACAR' ) )
                    {
                    // InternalGratext.g:434:2: ( ( 'SACAR' ) )
                    // InternalGratext.g:435:3: ( 'SACAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 
                    // InternalGratext.g:436:3: ( 'SACAR' )
                    // InternalGratext.g:436:4: 'SACAR'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:440:2: ( ( 'CERRAR' ) )
                    {
                    // InternalGratext.g:440:2: ( ( 'CERRAR' ) )
                    // InternalGratext.g:441:3: ( 'CERRAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 
                    // InternalGratext.g:442:3: ( 'CERRAR' )
                    // InternalGratext.g:442:4: 'CERRAR'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:446:2: ( ( 'ESTADO' ) )
                    {
                    // InternalGratext.g:446:2: ( ( 'ESTADO' ) )
                    // InternalGratext.g:447:3: ( 'ESTADO' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:448:3: ( 'ESTADO' )
                    // InternalGratext.g:448:4: 'ESTADO'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:452:2: ( ( 'GRABAR' ) )
                    {
                    // InternalGratext.g:452:2: ( ( 'GRABAR' ) )
                    // InternalGratext.g:453:3: ( 'GRABAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 
                    // InternalGratext.g:454:3: ( 'GRABAR' )
                    // InternalGratext.g:454:4: 'GRABAR'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:458:2: ( ( 'DETECTAR' ) )
                    {
                    // InternalGratext.g:458:2: ( ( 'DETECTAR' ) )
                    // InternalGratext.g:459:3: ( 'DETECTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 
                    // InternalGratext.g:460:3: ( 'DETECTAR' )
                    // InternalGratext.g:460:4: 'DETECTAR'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:464:2: ( ( 'ENCENDER' ) )
                    {
                    // InternalGratext.g:464:2: ( ( 'ENCENDER' ) )
                    // InternalGratext.g:465:3: ( 'ENCENDER' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 
                    // InternalGratext.g:466:3: ( 'ENCENDER' )
                    // InternalGratext.g:466:4: 'ENCENDER'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:470:2: ( ( 'APAGAR' ) )
                    {
                    // InternalGratext.g:470:2: ( ( 'APAGAR' ) )
                    // InternalGratext.g:471:3: ( 'APAGAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 
                    // InternalGratext.g:472:3: ( 'APAGAR' )
                    // InternalGratext.g:472:4: 'APAGAR'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:476:2: ( ( 'AUMENTAR' ) )
                    {
                    // InternalGratext.g:476:2: ( ( 'AUMENTAR' ) )
                    // InternalGratext.g:477:3: ( 'AUMENTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 
                    // InternalGratext.g:478:3: ( 'AUMENTAR' )
                    // InternalGratext.g:478:4: 'AUMENTAR'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:482:2: ( ( 'DISMINUIR' ) )
                    {
                    // InternalGratext.g:482:2: ( ( 'DISMINUIR' ) )
                    // InternalGratext.g:483:3: ( 'DISMINUIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 
                    // InternalGratext.g:484:3: ( 'DISMINUIR' )
                    // InternalGratext.g:484:4: 'DISMINUIR'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:488:2: ( ( 'COMPROBAR' ) )
                    {
                    // InternalGratext.g:488:2: ( ( 'COMPROBAR' ) )
                    // InternalGratext.g:489:3: ( 'COMPROBAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 
                    // InternalGratext.g:490:3: ( 'COMPROBAR' )
                    // InternalGratext.g:490:4: 'COMPROBAR'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:494:2: ( ( 'ACTIVAR' ) )
                    {
                    // InternalGratext.g:494:2: ( ( 'ACTIVAR' ) )
                    // InternalGratext.g:495:3: ( 'ACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 
                    // InternalGratext.g:496:3: ( 'ACTIVAR' )
                    // InternalGratext.g:496:4: 'ACTIVAR'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:500:2: ( ( 'DESACTIVAR' ) )
                    {
                    // InternalGratext.g:500:2: ( ( 'DESACTIVAR' ) )
                    // InternalGratext.g:501:3: ( 'DESACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); 
                    // InternalGratext.g:502:3: ( 'DESACTIVAR' )
                    // InternalGratext.g:502:4: 'DESACTIVAR'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); 

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
    // $ANTLR end "rule__NombreAccion__Alternatives"


    // $ANTLR start "rule__Granja__Group__0"
    // InternalGratext.g:510:1: rule__Granja__Group__0 : rule__Granja__Group__0__Impl rule__Granja__Group__1 ;
    public final void rule__Granja__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:514:1: ( rule__Granja__Group__0__Impl rule__Granja__Group__1 )
            // InternalGratext.g:515:2: rule__Granja__Group__0__Impl rule__Granja__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Granja__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__1();

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
    // $ANTLR end "rule__Granja__Group__0"


    // $ANTLR start "rule__Granja__Group__0__Impl"
    // InternalGratext.g:522:1: rule__Granja__Group__0__Impl : ( 'Granja:' ) ;
    public final void rule__Granja__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:526:1: ( ( 'Granja:' ) )
            // InternalGratext.g:527:1: ( 'Granja:' )
            {
            // InternalGratext.g:527:1: ( 'Granja:' )
            // InternalGratext.g:528:2: 'Granja:'
            {
             before(grammarAccess.getGranjaAccess().getGranjaKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getGranjaKeyword_0()); 

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
    // $ANTLR end "rule__Granja__Group__0__Impl"


    // $ANTLR start "rule__Granja__Group__1"
    // InternalGratext.g:537:1: rule__Granja__Group__1 : rule__Granja__Group__1__Impl rule__Granja__Group__2 ;
    public final void rule__Granja__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:541:1: ( rule__Granja__Group__1__Impl rule__Granja__Group__2 )
            // InternalGratext.g:542:2: rule__Granja__Group__1__Impl rule__Granja__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Granja__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__2();

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
    // $ANTLR end "rule__Granja__Group__1"


    // $ANTLR start "rule__Granja__Group__1__Impl"
    // InternalGratext.g:549:1: rule__Granja__Group__1__Impl : ( ( rule__Granja__NombreGranjaAssignment_1 ) ) ;
    public final void rule__Granja__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:553:1: ( ( ( rule__Granja__NombreGranjaAssignment_1 ) ) )
            // InternalGratext.g:554:1: ( ( rule__Granja__NombreGranjaAssignment_1 ) )
            {
            // InternalGratext.g:554:1: ( ( rule__Granja__NombreGranjaAssignment_1 ) )
            // InternalGratext.g:555:2: ( rule__Granja__NombreGranjaAssignment_1 )
            {
             before(grammarAccess.getGranjaAccess().getNombreGranjaAssignment_1()); 
            // InternalGratext.g:556:2: ( rule__Granja__NombreGranjaAssignment_1 )
            // InternalGratext.g:556:3: rule__Granja__NombreGranjaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Granja__NombreGranjaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getNombreGranjaAssignment_1()); 

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
    // $ANTLR end "rule__Granja__Group__1__Impl"


    // $ANTLR start "rule__Granja__Group__2"
    // InternalGratext.g:564:1: rule__Granja__Group__2 : rule__Granja__Group__2__Impl rule__Granja__Group__3 ;
    public final void rule__Granja__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:568:1: ( rule__Granja__Group__2__Impl rule__Granja__Group__3 )
            // InternalGratext.g:569:2: rule__Granja__Group__2__Impl rule__Granja__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Granja__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__3();

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
    // $ANTLR end "rule__Granja__Group__2"


    // $ANTLR start "rule__Granja__Group__2__Impl"
    // InternalGratext.g:576:1: rule__Granja__Group__2__Impl : ( 'Centralita:' ) ;
    public final void rule__Granja__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:580:1: ( ( 'Centralita:' ) )
            // InternalGratext.g:581:1: ( 'Centralita:' )
            {
            // InternalGratext.g:581:1: ( 'Centralita:' )
            // InternalGratext.g:582:2: 'Centralita:'
            {
             before(grammarAccess.getGranjaAccess().getCentralitaKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getCentralitaKeyword_2()); 

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
    // $ANTLR end "rule__Granja__Group__2__Impl"


    // $ANTLR start "rule__Granja__Group__3"
    // InternalGratext.g:591:1: rule__Granja__Group__3 : rule__Granja__Group__3__Impl rule__Granja__Group__4 ;
    public final void rule__Granja__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:595:1: ( rule__Granja__Group__3__Impl rule__Granja__Group__4 )
            // InternalGratext.g:596:2: rule__Granja__Group__3__Impl rule__Granja__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Granja__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__4();

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
    // $ANTLR end "rule__Granja__Group__3"


    // $ANTLR start "rule__Granja__Group__3__Impl"
    // InternalGratext.g:603:1: rule__Granja__Group__3__Impl : ( ( rule__Granja__TipoAssignment_3 ) ) ;
    public final void rule__Granja__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:607:1: ( ( ( rule__Granja__TipoAssignment_3 ) ) )
            // InternalGratext.g:608:1: ( ( rule__Granja__TipoAssignment_3 ) )
            {
            // InternalGratext.g:608:1: ( ( rule__Granja__TipoAssignment_3 ) )
            // InternalGratext.g:609:2: ( rule__Granja__TipoAssignment_3 )
            {
             before(grammarAccess.getGranjaAccess().getTipoAssignment_3()); 
            // InternalGratext.g:610:2: ( rule__Granja__TipoAssignment_3 )
            // InternalGratext.g:610:3: rule__Granja__TipoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Granja__TipoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getTipoAssignment_3()); 

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
    // $ANTLR end "rule__Granja__Group__3__Impl"


    // $ANTLR start "rule__Granja__Group__4"
    // InternalGratext.g:618:1: rule__Granja__Group__4 : rule__Granja__Group__4__Impl rule__Granja__Group__5 ;
    public final void rule__Granja__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:622:1: ( rule__Granja__Group__4__Impl rule__Granja__Group__5 )
            // InternalGratext.g:623:2: rule__Granja__Group__4__Impl rule__Granja__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Granja__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__5();

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
    // $ANTLR end "rule__Granja__Group__4"


    // $ANTLR start "rule__Granja__Group__4__Impl"
    // InternalGratext.g:630:1: rule__Granja__Group__4__Impl : ( ( rule__Granja__LoginAssignment_4 )? ) ;
    public final void rule__Granja__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:634:1: ( ( ( rule__Granja__LoginAssignment_4 )? ) )
            // InternalGratext.g:635:1: ( ( rule__Granja__LoginAssignment_4 )? )
            {
            // InternalGratext.g:635:1: ( ( rule__Granja__LoginAssignment_4 )? )
            // InternalGratext.g:636:2: ( rule__Granja__LoginAssignment_4 )?
            {
             before(grammarAccess.getGranjaAccess().getLoginAssignment_4()); 
            // InternalGratext.g:637:2: ( rule__Granja__LoginAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==58) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGratext.g:637:3: rule__Granja__LoginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Granja__LoginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGranjaAccess().getLoginAssignment_4()); 

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
    // $ANTLR end "rule__Granja__Group__4__Impl"


    // $ANTLR start "rule__Granja__Group__5"
    // InternalGratext.g:645:1: rule__Granja__Group__5 : rule__Granja__Group__5__Impl rule__Granja__Group__6 ;
    public final void rule__Granja__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:649:1: ( rule__Granja__Group__5__Impl rule__Granja__Group__6 )
            // InternalGratext.g:650:2: rule__Granja__Group__5__Impl rule__Granja__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Granja__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__6();

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
    // $ANTLR end "rule__Granja__Group__5"


    // $ANTLR start "rule__Granja__Group__5__Impl"
    // InternalGratext.g:657:1: rule__Granja__Group__5__Impl : ( 'Dispositivos{' ) ;
    public final void rule__Granja__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:661:1: ( ( 'Dispositivos{' ) )
            // InternalGratext.g:662:1: ( 'Dispositivos{' )
            {
            // InternalGratext.g:662:1: ( 'Dispositivos{' )
            // InternalGratext.g:663:2: 'Dispositivos{'
            {
             before(grammarAccess.getGranjaAccess().getDispositivosKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getDispositivosKeyword_5()); 

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
    // $ANTLR end "rule__Granja__Group__5__Impl"


    // $ANTLR start "rule__Granja__Group__6"
    // InternalGratext.g:672:1: rule__Granja__Group__6 : rule__Granja__Group__6__Impl rule__Granja__Group__7 ;
    public final void rule__Granja__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:676:1: ( rule__Granja__Group__6__Impl rule__Granja__Group__7 )
            // InternalGratext.g:677:2: rule__Granja__Group__6__Impl rule__Granja__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Granja__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__7();

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
    // $ANTLR end "rule__Granja__Group__6"


    // $ANTLR start "rule__Granja__Group__6__Impl"
    // InternalGratext.g:684:1: rule__Granja__Group__6__Impl : ( ( rule__Granja__DispositivosAssignment_6 )* ) ;
    public final void rule__Granja__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:688:1: ( ( ( rule__Granja__DispositivosAssignment_6 )* ) )
            // InternalGratext.g:689:1: ( ( rule__Granja__DispositivosAssignment_6 )* )
            {
            // InternalGratext.g:689:1: ( ( rule__Granja__DispositivosAssignment_6 )* )
            // InternalGratext.g:690:2: ( rule__Granja__DispositivosAssignment_6 )*
            {
             before(grammarAccess.getGranjaAccess().getDispositivosAssignment_6()); 
            // InternalGratext.g:691:2: ( rule__Granja__DispositivosAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==60) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGratext.g:691:3: rule__Granja__DispositivosAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Granja__DispositivosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGranjaAccess().getDispositivosAssignment_6()); 

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
    // $ANTLR end "rule__Granja__Group__6__Impl"


    // $ANTLR start "rule__Granja__Group__7"
    // InternalGratext.g:699:1: rule__Granja__Group__7 : rule__Granja__Group__7__Impl ;
    public final void rule__Granja__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:703:1: ( rule__Granja__Group__7__Impl )
            // InternalGratext.g:704:2: rule__Granja__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Granja__Group__7__Impl();

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
    // $ANTLR end "rule__Granja__Group__7"


    // $ANTLR start "rule__Granja__Group__7__Impl"
    // InternalGratext.g:710:1: rule__Granja__Group__7__Impl : ( '}' ) ;
    public final void rule__Granja__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:714:1: ( ( '}' ) )
            // InternalGratext.g:715:1: ( '}' )
            {
            // InternalGratext.g:715:1: ( '}' )
            // InternalGratext.g:716:2: '}'
            {
             before(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Granja__Group__7__Impl"


    // $ANTLR start "rule__Login__Group__0"
    // InternalGratext.g:726:1: rule__Login__Group__0 : rule__Login__Group__0__Impl rule__Login__Group__1 ;
    public final void rule__Login__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:730:1: ( rule__Login__Group__0__Impl rule__Login__Group__1 )
            // InternalGratext.g:731:2: rule__Login__Group__0__Impl rule__Login__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Login__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__1();

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
    // $ANTLR end "rule__Login__Group__0"


    // $ANTLR start "rule__Login__Group__0__Impl"
    // InternalGratext.g:738:1: rule__Login__Group__0__Impl : ( 'Usuario:' ) ;
    public final void rule__Login__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:742:1: ( ( 'Usuario:' ) )
            // InternalGratext.g:743:1: ( 'Usuario:' )
            {
            // InternalGratext.g:743:1: ( 'Usuario:' )
            // InternalGratext.g:744:2: 'Usuario:'
            {
             before(grammarAccess.getLoginAccess().getUsuarioKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getUsuarioKeyword_0()); 

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
    // $ANTLR end "rule__Login__Group__0__Impl"


    // $ANTLR start "rule__Login__Group__1"
    // InternalGratext.g:753:1: rule__Login__Group__1 : rule__Login__Group__1__Impl rule__Login__Group__2 ;
    public final void rule__Login__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:757:1: ( rule__Login__Group__1__Impl rule__Login__Group__2 )
            // InternalGratext.g:758:2: rule__Login__Group__1__Impl rule__Login__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Login__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__2();

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
    // $ANTLR end "rule__Login__Group__1"


    // $ANTLR start "rule__Login__Group__1__Impl"
    // InternalGratext.g:765:1: rule__Login__Group__1__Impl : ( ( rule__Login__UsuarioAssignment_1 ) ) ;
    public final void rule__Login__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:769:1: ( ( ( rule__Login__UsuarioAssignment_1 ) ) )
            // InternalGratext.g:770:1: ( ( rule__Login__UsuarioAssignment_1 ) )
            {
            // InternalGratext.g:770:1: ( ( rule__Login__UsuarioAssignment_1 ) )
            // InternalGratext.g:771:2: ( rule__Login__UsuarioAssignment_1 )
            {
             before(grammarAccess.getLoginAccess().getUsuarioAssignment_1()); 
            // InternalGratext.g:772:2: ( rule__Login__UsuarioAssignment_1 )
            // InternalGratext.g:772:3: rule__Login__UsuarioAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Login__UsuarioAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getUsuarioAssignment_1()); 

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
    // $ANTLR end "rule__Login__Group__1__Impl"


    // $ANTLR start "rule__Login__Group__2"
    // InternalGratext.g:780:1: rule__Login__Group__2 : rule__Login__Group__2__Impl rule__Login__Group__3 ;
    public final void rule__Login__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:784:1: ( rule__Login__Group__2__Impl rule__Login__Group__3 )
            // InternalGratext.g:785:2: rule__Login__Group__2__Impl rule__Login__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Login__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__3();

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
    // $ANTLR end "rule__Login__Group__2"


    // $ANTLR start "rule__Login__Group__2__Impl"
    // InternalGratext.g:792:1: rule__Login__Group__2__Impl : ( 'Contrase\\u00F1a:' ) ;
    public final void rule__Login__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:796:1: ( ( 'Contrase\\u00F1a:' ) )
            // InternalGratext.g:797:1: ( 'Contrase\\u00F1a:' )
            {
            // InternalGratext.g:797:1: ( 'Contrase\\u00F1a:' )
            // InternalGratext.g:798:2: 'Contrase\\u00F1a:'
            {
             before(grammarAccess.getLoginAccess().getContraseAKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getContraseAKeyword_2()); 

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
    // $ANTLR end "rule__Login__Group__2__Impl"


    // $ANTLR start "rule__Login__Group__3"
    // InternalGratext.g:807:1: rule__Login__Group__3 : rule__Login__Group__3__Impl ;
    public final void rule__Login__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:811:1: ( rule__Login__Group__3__Impl )
            // InternalGratext.g:812:2: rule__Login__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__3__Impl();

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
    // $ANTLR end "rule__Login__Group__3"


    // $ANTLR start "rule__Login__Group__3__Impl"
    // InternalGratext.g:818:1: rule__Login__Group__3__Impl : ( ( rule__Login__ContrasenaAssignment_3 ) ) ;
    public final void rule__Login__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:822:1: ( ( ( rule__Login__ContrasenaAssignment_3 ) ) )
            // InternalGratext.g:823:1: ( ( rule__Login__ContrasenaAssignment_3 ) )
            {
            // InternalGratext.g:823:1: ( ( rule__Login__ContrasenaAssignment_3 ) )
            // InternalGratext.g:824:2: ( rule__Login__ContrasenaAssignment_3 )
            {
             before(grammarAccess.getLoginAccess().getContrasenaAssignment_3()); 
            // InternalGratext.g:825:2: ( rule__Login__ContrasenaAssignment_3 )
            // InternalGratext.g:825:3: rule__Login__ContrasenaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Login__ContrasenaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getContrasenaAssignment_3()); 

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
    // $ANTLR end "rule__Login__Group__3__Impl"


    // $ANTLR start "rule__Dispositivos__Group__0"
    // InternalGratext.g:834:1: rule__Dispositivos__Group__0 : rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 ;
    public final void rule__Dispositivos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:838:1: ( rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 )
            // InternalGratext.g:839:2: rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dispositivos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__1();

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
    // $ANTLR end "rule__Dispositivos__Group__0"


    // $ANTLR start "rule__Dispositivos__Group__0__Impl"
    // InternalGratext.g:846:1: rule__Dispositivos__Group__0__Impl : ( 'Codigo:' ) ;
    public final void rule__Dispositivos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:850:1: ( ( 'Codigo:' ) )
            // InternalGratext.g:851:1: ( 'Codigo:' )
            {
            // InternalGratext.g:851:1: ( 'Codigo:' )
            // InternalGratext.g:852:2: 'Codigo:'
            {
             before(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); 

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
    // $ANTLR end "rule__Dispositivos__Group__0__Impl"


    // $ANTLR start "rule__Dispositivos__Group__1"
    // InternalGratext.g:861:1: rule__Dispositivos__Group__1 : rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 ;
    public final void rule__Dispositivos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:865:1: ( rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 )
            // InternalGratext.g:866:2: rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Dispositivos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__2();

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
    // $ANTLR end "rule__Dispositivos__Group__1"


    // $ANTLR start "rule__Dispositivos__Group__1__Impl"
    // InternalGratext.g:873:1: rule__Dispositivos__Group__1__Impl : ( ( rule__Dispositivos__CodigoAssignment_1 ) ) ;
    public final void rule__Dispositivos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:877:1: ( ( ( rule__Dispositivos__CodigoAssignment_1 ) ) )
            // InternalGratext.g:878:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            {
            // InternalGratext.g:878:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            // InternalGratext.g:879:2: ( rule__Dispositivos__CodigoAssignment_1 )
            {
             before(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); 
            // InternalGratext.g:880:2: ( rule__Dispositivos__CodigoAssignment_1 )
            // InternalGratext.g:880:3: rule__Dispositivos__CodigoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dispositivos__CodigoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); 

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
    // $ANTLR end "rule__Dispositivos__Group__1__Impl"


    // $ANTLR start "rule__Dispositivos__Group__2"
    // InternalGratext.g:888:1: rule__Dispositivos__Group__2 : rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 ;
    public final void rule__Dispositivos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:892:1: ( rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 )
            // InternalGratext.g:893:2: rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Dispositivos__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__3();

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
    // $ANTLR end "rule__Dispositivos__Group__2"


    // $ANTLR start "rule__Dispositivos__Group__2__Impl"
    // InternalGratext.g:900:1: rule__Dispositivos__Group__2__Impl : ( 'Sensor' ) ;
    public final void rule__Dispositivos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:904:1: ( ( 'Sensor' ) )
            // InternalGratext.g:905:1: ( 'Sensor' )
            {
            // InternalGratext.g:905:1: ( 'Sensor' )
            // InternalGratext.g:906:2: 'Sensor'
            {
             before(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); 

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
    // $ANTLR end "rule__Dispositivos__Group__2__Impl"


    // $ANTLR start "rule__Dispositivos__Group__3"
    // InternalGratext.g:915:1: rule__Dispositivos__Group__3 : rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 ;
    public final void rule__Dispositivos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:919:1: ( rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 )
            // InternalGratext.g:920:2: rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Dispositivos__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__4();

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
    // $ANTLR end "rule__Dispositivos__Group__3"


    // $ANTLR start "rule__Dispositivos__Group__3__Impl"
    // InternalGratext.g:927:1: rule__Dispositivos__Group__3__Impl : ( ( rule__Dispositivos__NombreAssignment_3 ) ) ;
    public final void rule__Dispositivos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:931:1: ( ( ( rule__Dispositivos__NombreAssignment_3 ) ) )
            // InternalGratext.g:932:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            {
            // InternalGratext.g:932:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            // InternalGratext.g:933:2: ( rule__Dispositivos__NombreAssignment_3 )
            {
             before(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); 
            // InternalGratext.g:934:2: ( rule__Dispositivos__NombreAssignment_3 )
            // InternalGratext.g:934:3: rule__Dispositivos__NombreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Dispositivos__NombreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); 

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
    // $ANTLR end "rule__Dispositivos__Group__3__Impl"


    // $ANTLR start "rule__Dispositivos__Group__4"
    // InternalGratext.g:942:1: rule__Dispositivos__Group__4 : rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 ;
    public final void rule__Dispositivos__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:946:1: ( rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 )
            // InternalGratext.g:947:2: rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Dispositivos__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__5();

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
    // $ANTLR end "rule__Dispositivos__Group__4"


    // $ANTLR start "rule__Dispositivos__Group__4__Impl"
    // InternalGratext.g:954:1: rule__Dispositivos__Group__4__Impl : ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) ;
    public final void rule__Dispositivos__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:958:1: ( ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) )
            // InternalGratext.g:959:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            {
            // InternalGratext.g:959:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            // InternalGratext.g:960:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            {
             before(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); 
            // InternalGratext.g:961:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGratext.g:961:3: rule__Dispositivos__TemperaturaAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dispositivos__TemperaturaAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); 

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
    // $ANTLR end "rule__Dispositivos__Group__4__Impl"


    // $ANTLR start "rule__Dispositivos__Group__5"
    // InternalGratext.g:969:1: rule__Dispositivos__Group__5 : rule__Dispositivos__Group__5__Impl ;
    public final void rule__Dispositivos__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:973:1: ( rule__Dispositivos__Group__5__Impl )
            // InternalGratext.g:974:2: rule__Dispositivos__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dispositivos__Group__5__Impl();

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
    // $ANTLR end "rule__Dispositivos__Group__5"


    // $ANTLR start "rule__Dispositivos__Group__5__Impl"
    // InternalGratext.g:980:1: rule__Dispositivos__Group__5__Impl : ( ( rule__Dispositivos__AccionAssignment_5 ) ) ;
    public final void rule__Dispositivos__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:984:1: ( ( ( rule__Dispositivos__AccionAssignment_5 ) ) )
            // InternalGratext.g:985:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            {
            // InternalGratext.g:985:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            // InternalGratext.g:986:2: ( rule__Dispositivos__AccionAssignment_5 )
            {
             before(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); 
            // InternalGratext.g:987:2: ( rule__Dispositivos__AccionAssignment_5 )
            // InternalGratext.g:987:3: rule__Dispositivos__AccionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Dispositivos__AccionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); 

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
    // $ANTLR end "rule__Dispositivos__Group__5__Impl"


    // $ANTLR start "rule__Accion__Group__0"
    // InternalGratext.g:996:1: rule__Accion__Group__0 : rule__Accion__Group__0__Impl rule__Accion__Group__1 ;
    public final void rule__Accion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1000:1: ( rule__Accion__Group__0__Impl rule__Accion__Group__1 )
            // InternalGratext.g:1001:2: rule__Accion__Group__0__Impl rule__Accion__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Accion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accion__Group__1();

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
    // $ANTLR end "rule__Accion__Group__0"


    // $ANTLR start "rule__Accion__Group__0__Impl"
    // InternalGratext.g:1008:1: rule__Accion__Group__0__Impl : ( 'quiero' ) ;
    public final void rule__Accion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1012:1: ( ( 'quiero' ) )
            // InternalGratext.g:1013:1: ( 'quiero' )
            {
            // InternalGratext.g:1013:1: ( 'quiero' )
            // InternalGratext.g:1014:2: 'quiero'
            {
             before(grammarAccess.getAccionAccess().getQuieroKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAccionAccess().getQuieroKeyword_0()); 

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
    // $ANTLR end "rule__Accion__Group__0__Impl"


    // $ANTLR start "rule__Accion__Group__1"
    // InternalGratext.g:1023:1: rule__Accion__Group__1 : rule__Accion__Group__1__Impl rule__Accion__Group__2 ;
    public final void rule__Accion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1027:1: ( rule__Accion__Group__1__Impl rule__Accion__Group__2 )
            // InternalGratext.g:1028:2: rule__Accion__Group__1__Impl rule__Accion__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Accion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accion__Group__2();

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
    // $ANTLR end "rule__Accion__Group__1"


    // $ANTLR start "rule__Accion__Group__1__Impl"
    // InternalGratext.g:1035:1: rule__Accion__Group__1__Impl : ( ( rule__Accion__NombreAccionAssignment_1 ) ) ;
    public final void rule__Accion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1039:1: ( ( ( rule__Accion__NombreAccionAssignment_1 ) ) )
            // InternalGratext.g:1040:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            {
            // InternalGratext.g:1040:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            // InternalGratext.g:1041:2: ( rule__Accion__NombreAccionAssignment_1 )
            {
             before(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); 
            // InternalGratext.g:1042:2: ( rule__Accion__NombreAccionAssignment_1 )
            // InternalGratext.g:1042:3: rule__Accion__NombreAccionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Accion__NombreAccionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); 

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
    // $ANTLR end "rule__Accion__Group__1__Impl"


    // $ANTLR start "rule__Accion__Group__2"
    // InternalGratext.g:1050:1: rule__Accion__Group__2 : rule__Accion__Group__2__Impl rule__Accion__Group__3 ;
    public final void rule__Accion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1054:1: ( rule__Accion__Group__2__Impl rule__Accion__Group__3 )
            // InternalGratext.g:1055:2: rule__Accion__Group__2__Impl rule__Accion__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Accion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accion__Group__3();

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
    // $ANTLR end "rule__Accion__Group__2"


    // $ANTLR start "rule__Accion__Group__2__Impl"
    // InternalGratext.g:1062:1: rule__Accion__Group__2__Impl : ( ( rule__Accion__NumeroAssignment_2 )? ) ;
    public final void rule__Accion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1066:1: ( ( ( rule__Accion__NumeroAssignment_2 )? ) )
            // InternalGratext.g:1067:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            {
            // InternalGratext.g:1067:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            // InternalGratext.g:1068:2: ( rule__Accion__NumeroAssignment_2 )?
            {
             before(grammarAccess.getAccionAccess().getNumeroAssignment_2()); 
            // InternalGratext.g:1069:2: ( rule__Accion__NumeroAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGratext.g:1069:3: rule__Accion__NumeroAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accion__NumeroAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccionAccess().getNumeroAssignment_2()); 

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
    // $ANTLR end "rule__Accion__Group__2__Impl"


    // $ANTLR start "rule__Accion__Group__3"
    // InternalGratext.g:1077:1: rule__Accion__Group__3 : rule__Accion__Group__3__Impl ;
    public final void rule__Accion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1081:1: ( rule__Accion__Group__3__Impl )
            // InternalGratext.g:1082:2: rule__Accion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Accion__Group__3__Impl();

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
    // $ANTLR end "rule__Accion__Group__3"


    // $ANTLR start "rule__Accion__Group__3__Impl"
    // InternalGratext.g:1088:1: rule__Accion__Group__3__Impl : ( ( rule__Accion__DescripcionAssignment_3 )? ) ;
    public final void rule__Accion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1092:1: ( ( ( rule__Accion__DescripcionAssignment_3 )? ) )
            // InternalGratext.g:1093:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            {
            // InternalGratext.g:1093:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            // InternalGratext.g:1094:2: ( rule__Accion__DescripcionAssignment_3 )?
            {
             before(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); 
            // InternalGratext.g:1095:2: ( rule__Accion__DescripcionAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGratext.g:1095:3: rule__Accion__DescripcionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accion__DescripcionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); 

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
    // $ANTLR end "rule__Accion__Group__3__Impl"


    // $ANTLR start "rule__Numero__Group__0"
    // InternalGratext.g:1104:1: rule__Numero__Group__0 : rule__Numero__Group__0__Impl rule__Numero__Group__1 ;
    public final void rule__Numero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1108:1: ( rule__Numero__Group__0__Impl rule__Numero__Group__1 )
            // InternalGratext.g:1109:2: rule__Numero__Group__0__Impl rule__Numero__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Numero__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Numero__Group__1();

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
    // $ANTLR end "rule__Numero__Group__0"


    // $ANTLR start "rule__Numero__Group__0__Impl"
    // InternalGratext.g:1116:1: rule__Numero__Group__0__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Numero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1120:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGratext.g:1121:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGratext.g:1121:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGratext.g:1122:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGratext.g:1122:2: ( ( RULE_INT ) )
            // InternalGratext.g:1123:3: ( RULE_INT )
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1124:3: ( RULE_INT )
            // InternalGratext.g:1124:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_17); 

            }

             after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 

            }

            // InternalGratext.g:1127:2: ( ( RULE_INT )* )
            // InternalGratext.g:1128:3: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1129:3: ( RULE_INT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGratext.g:1129:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 

            }


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
    // $ANTLR end "rule__Numero__Group__0__Impl"


    // $ANTLR start "rule__Numero__Group__1"
    // InternalGratext.g:1138:1: rule__Numero__Group__1 : rule__Numero__Group__1__Impl rule__Numero__Group__2 ;
    public final void rule__Numero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1142:1: ( rule__Numero__Group__1__Impl rule__Numero__Group__2 )
            // InternalGratext.g:1143:2: rule__Numero__Group__1__Impl rule__Numero__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Numero__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Numero__Group__2();

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
    // $ANTLR end "rule__Numero__Group__1"


    // $ANTLR start "rule__Numero__Group__1__Impl"
    // InternalGratext.g:1150:1: rule__Numero__Group__1__Impl : ( ( '.' )? ) ;
    public final void rule__Numero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1154:1: ( ( ( '.' )? ) )
            // InternalGratext.g:1155:1: ( ( '.' )? )
            {
            // InternalGratext.g:1155:1: ( ( '.' )? )
            // InternalGratext.g:1156:2: ( '.' )?
            {
             before(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); 
            // InternalGratext.g:1157:2: ( '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==63) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGratext.g:1157:3: '.'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Numero__Group__1__Impl"


    // $ANTLR start "rule__Numero__Group__2"
    // InternalGratext.g:1165:1: rule__Numero__Group__2 : rule__Numero__Group__2__Impl ;
    public final void rule__Numero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1169:1: ( rule__Numero__Group__2__Impl )
            // InternalGratext.g:1170:2: rule__Numero__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Numero__Group__2__Impl();

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
    // $ANTLR end "rule__Numero__Group__2"


    // $ANTLR start "rule__Numero__Group__2__Impl"
    // InternalGratext.g:1176:1: rule__Numero__Group__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Numero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1180:1: ( ( ( RULE_INT )* ) )
            // InternalGratext.g:1181:1: ( ( RULE_INT )* )
            {
            // InternalGratext.g:1181:1: ( ( RULE_INT )* )
            // InternalGratext.g:1182:2: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); 
            // InternalGratext.g:1183:2: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGratext.g:1183:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Numero__Group__2__Impl"


    // $ANTLR start "rule__Granja__NombreGranjaAssignment_1"
    // InternalGratext.g:1192:1: rule__Granja__NombreGranjaAssignment_1 : ( RULE_ID ) ;
    public final void rule__Granja__NombreGranjaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1196:1: ( ( RULE_ID ) )
            // InternalGratext.g:1197:2: ( RULE_ID )
            {
            // InternalGratext.g:1197:2: ( RULE_ID )
            // InternalGratext.g:1198:3: RULE_ID
            {
             before(grammarAccess.getGranjaAccess().getNombreGranjaIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getNombreGranjaIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Granja__NombreGranjaAssignment_1"


    // $ANTLR start "rule__Granja__TipoAssignment_3"
    // InternalGratext.g:1207:1: rule__Granja__TipoAssignment_3 : ( ruleTipo ) ;
    public final void rule__Granja__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1211:1: ( ( ruleTipo ) )
            // InternalGratext.g:1212:2: ( ruleTipo )
            {
            // InternalGratext.g:1212:2: ( ruleTipo )
            // InternalGratext.g:1213:3: ruleTipo
            {
             before(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Granja__TipoAssignment_3"


    // $ANTLR start "rule__Granja__LoginAssignment_4"
    // InternalGratext.g:1222:1: rule__Granja__LoginAssignment_4 : ( rulelogin ) ;
    public final void rule__Granja__LoginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1226:1: ( ( rulelogin ) )
            // InternalGratext.g:1227:2: ( rulelogin )
            {
            // InternalGratext.g:1227:2: ( rulelogin )
            // InternalGratext.g:1228:3: rulelogin
            {
             before(grammarAccess.getGranjaAccess().getLoginLoginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulelogin();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getLoginLoginParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Granja__LoginAssignment_4"


    // $ANTLR start "rule__Granja__DispositivosAssignment_6"
    // InternalGratext.g:1237:1: rule__Granja__DispositivosAssignment_6 : ( ruleDispositivos ) ;
    public final void rule__Granja__DispositivosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1241:1: ( ( ruleDispositivos ) )
            // InternalGratext.g:1242:2: ( ruleDispositivos )
            {
            // InternalGratext.g:1242:2: ( ruleDispositivos )
            // InternalGratext.g:1243:3: ruleDispositivos
            {
             before(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDispositivos();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Granja__DispositivosAssignment_6"


    // $ANTLR start "rule__Login__UsuarioAssignment_1"
    // InternalGratext.g:1252:1: rule__Login__UsuarioAssignment_1 : ( RULE_ID ) ;
    public final void rule__Login__UsuarioAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1256:1: ( ( RULE_ID ) )
            // InternalGratext.g:1257:2: ( RULE_ID )
            {
            // InternalGratext.g:1257:2: ( RULE_ID )
            // InternalGratext.g:1258:3: RULE_ID
            {
             before(grammarAccess.getLoginAccess().getUsuarioIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getUsuarioIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Login__UsuarioAssignment_1"


    // $ANTLR start "rule__Login__ContrasenaAssignment_3"
    // InternalGratext.g:1267:1: rule__Login__ContrasenaAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Login__ContrasenaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1271:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1272:2: ( RULE_STRING )
            {
            // InternalGratext.g:1272:2: ( RULE_STRING )
            // InternalGratext.g:1273:3: RULE_STRING
            {
             before(grammarAccess.getLoginAccess().getContrasenaSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getContrasenaSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Login__ContrasenaAssignment_3"


    // $ANTLR start "rule__Dispositivos__CodigoAssignment_1"
    // InternalGratext.g:1282:1: rule__Dispositivos__CodigoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dispositivos__CodigoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1286:1: ( ( RULE_ID ) )
            // InternalGratext.g:1287:2: ( RULE_ID )
            {
            // InternalGratext.g:1287:2: ( RULE_ID )
            // InternalGratext.g:1288:3: RULE_ID
            {
             before(grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dispositivos__CodigoAssignment_1"


    // $ANTLR start "rule__Dispositivos__NombreAssignment_3"
    // InternalGratext.g:1297:1: rule__Dispositivos__NombreAssignment_3 : ( ruleTiposDispositivo ) ;
    public final void rule__Dispositivos__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1301:1: ( ( ruleTiposDispositivo ) )
            // InternalGratext.g:1302:2: ( ruleTiposDispositivo )
            {
            // InternalGratext.g:1302:2: ( ruleTiposDispositivo )
            // InternalGratext.g:1303:3: ruleTiposDispositivo
            {
             before(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTiposDispositivo();

            state._fsp--;

             after(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dispositivos__NombreAssignment_3"


    // $ANTLR start "rule__Dispositivos__TemperaturaAssignment_4"
    // InternalGratext.g:1312:1: rule__Dispositivos__TemperaturaAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Dispositivos__TemperaturaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1316:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1317:2: ( RULE_STRING )
            {
            // InternalGratext.g:1317:2: ( RULE_STRING )
            // InternalGratext.g:1318:3: RULE_STRING
            {
             before(grammarAccess.getDispositivosAccess().getTemperaturaSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDispositivosAccess().getTemperaturaSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Dispositivos__TemperaturaAssignment_4"


    // $ANTLR start "rule__Dispositivos__AccionAssignment_5"
    // InternalGratext.g:1327:1: rule__Dispositivos__AccionAssignment_5 : ( ruleaccion ) ;
    public final void rule__Dispositivos__AccionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1331:1: ( ( ruleaccion ) )
            // InternalGratext.g:1332:2: ( ruleaccion )
            {
            // InternalGratext.g:1332:2: ( ruleaccion )
            // InternalGratext.g:1333:3: ruleaccion
            {
             before(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleaccion();

            state._fsp--;

             after(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Dispositivos__AccionAssignment_5"


    // $ANTLR start "rule__Accion__NombreAccionAssignment_1"
    // InternalGratext.g:1342:1: rule__Accion__NombreAccionAssignment_1 : ( ruleNombreAccion ) ;
    public final void rule__Accion__NombreAccionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1346:1: ( ( ruleNombreAccion ) )
            // InternalGratext.g:1347:2: ( ruleNombreAccion )
            {
            // InternalGratext.g:1347:2: ( ruleNombreAccion )
            // InternalGratext.g:1348:3: ruleNombreAccion
            {
             before(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreAccion();

            state._fsp--;

             after(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Accion__NombreAccionAssignment_1"


    // $ANTLR start "rule__Accion__NumeroAssignment_2"
    // InternalGratext.g:1357:1: rule__Accion__NumeroAssignment_2 : ( rulenumero ) ;
    public final void rule__Accion__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1361:1: ( ( rulenumero ) )
            // InternalGratext.g:1362:2: ( rulenumero )
            {
            // InternalGratext.g:1362:2: ( rulenumero )
            // InternalGratext.g:1363:3: rulenumero
            {
             before(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulenumero();

            state._fsp--;

             after(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Accion__NumeroAssignment_2"


    // $ANTLR start "rule__Accion__DescripcionAssignment_3"
    // InternalGratext.g:1372:1: rule__Accion__DescripcionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Accion__DescripcionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1376:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1377:2: ( RULE_STRING )
            {
            // InternalGratext.g:1377:2: ( RULE_STRING )
            // InternalGratext.g:1378:3: RULE_STRING
            {
             before(grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Accion__DescripcionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000FFFFFF0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x4000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x003FFF0000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});

}