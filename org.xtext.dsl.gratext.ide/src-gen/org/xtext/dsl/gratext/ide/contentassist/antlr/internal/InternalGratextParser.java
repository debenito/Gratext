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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DELAVAL'", "'SIEMENS'", "'TABLET'", "'MOVIL'", "'ORDENADOR'", "'CAMARA'", "'TEMPERATURA'", "'FUEGO_HUMO'", "'CO2'", "'GAS'", "'PRESENCIA'", "'MAGNETICO'", "'ROTURA_CRISTAL'", "'BARRERA_SEGURIDAD'", "'LUMINOSIDAD'", "'EMERGENCIA'", "'INUNDACION'", "'VIENTO'", "'LLUVIA'", "'ESTACION_METEOROLOGICA'", "'SISTEMA_IDENTIFICACION'", "'INFRARROJOS'", "'RADIOFRECUENCIA'", "'MECEDORA'", "'PULSOMETRO_GANADO'", "'DEPOSITO_LECHE'", "'ROBOT_LIMPIADOR'", "'NEVERAS'", "'ABRIR'", "'ENVIAR'", "'SACAR'", "'CERRAR'", "'ESTADO'", "'GRABAR'", "'DETECTAR'", "'ENCENDER'", "'APAGAR'", "'AUMENTAR'", "'DISMINUIR'", "'COMPROBAR'", "'ACTIVAR'", "'DESACTIVAR'", "'GRANJA'", "'CENTRALITA:'", "'Usuario:'", "'Contrase\\u00F1a:'", "'Dispositivos{'", "'}'", "'Codigo:'", "'Sensor'", "'quiero'", "'.'"
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
    public static final int RULE_ID=6;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleDispositivos"
    // InternalGratext.g:78:1: entryRuleDispositivos : ruleDispositivos EOF ;
    public final void entryRuleDispositivos() throws RecognitionException {
        try {
            // InternalGratext.g:79:1: ( ruleDispositivos EOF )
            // InternalGratext.g:80:1: ruleDispositivos EOF
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
    // InternalGratext.g:87:1: ruleDispositivos : ( ( rule__Dispositivos__Group__0 ) ) ;
    public final void ruleDispositivos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:91:2: ( ( ( rule__Dispositivos__Group__0 ) ) )
            // InternalGratext.g:92:2: ( ( rule__Dispositivos__Group__0 ) )
            {
            // InternalGratext.g:92:2: ( ( rule__Dispositivos__Group__0 ) )
            // InternalGratext.g:93:3: ( rule__Dispositivos__Group__0 )
            {
             before(grammarAccess.getDispositivosAccess().getGroup()); 
            // InternalGratext.g:94:3: ( rule__Dispositivos__Group__0 )
            // InternalGratext.g:94:4: rule__Dispositivos__Group__0
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
    // InternalGratext.g:103:1: entryRuleaccion : ruleaccion EOF ;
    public final void entryRuleaccion() throws RecognitionException {
        try {
            // InternalGratext.g:104:1: ( ruleaccion EOF )
            // InternalGratext.g:105:1: ruleaccion EOF
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
    // InternalGratext.g:112:1: ruleaccion : ( ( rule__Accion__Group__0 ) ) ;
    public final void ruleaccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:116:2: ( ( ( rule__Accion__Group__0 ) ) )
            // InternalGratext.g:117:2: ( ( rule__Accion__Group__0 ) )
            {
            // InternalGratext.g:117:2: ( ( rule__Accion__Group__0 ) )
            // InternalGratext.g:118:3: ( rule__Accion__Group__0 )
            {
             before(grammarAccess.getAccionAccess().getGroup()); 
            // InternalGratext.g:119:3: ( rule__Accion__Group__0 )
            // InternalGratext.g:119:4: rule__Accion__Group__0
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
    // InternalGratext.g:128:1: entryRulenumero : rulenumero EOF ;
    public final void entryRulenumero() throws RecognitionException {
        try {
            // InternalGratext.g:129:1: ( rulenumero EOF )
            // InternalGratext.g:130:1: rulenumero EOF
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
    // InternalGratext.g:137:1: rulenumero : ( ( rule__Numero__Group__0 ) ) ;
    public final void rulenumero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:141:2: ( ( ( rule__Numero__Group__0 ) ) )
            // InternalGratext.g:142:2: ( ( rule__Numero__Group__0 ) )
            {
            // InternalGratext.g:142:2: ( ( rule__Numero__Group__0 ) )
            // InternalGratext.g:143:3: ( rule__Numero__Group__0 )
            {
             before(grammarAccess.getNumeroAccess().getGroup()); 
            // InternalGratext.g:144:3: ( rule__Numero__Group__0 )
            // InternalGratext.g:144:4: rule__Numero__Group__0
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


    // $ANTLR start "entryRuleusuario"
    // InternalGratext.g:153:1: entryRuleusuario : ruleusuario EOF ;
    public final void entryRuleusuario() throws RecognitionException {
        try {
            // InternalGratext.g:154:1: ( ruleusuario EOF )
            // InternalGratext.g:155:1: ruleusuario EOF
            {
             before(grammarAccess.getUsuarioRule()); 
            pushFollow(FOLLOW_1);
            ruleusuario();

            state._fsp--;

             after(grammarAccess.getUsuarioRule()); 
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
    // $ANTLR end "entryRuleusuario"


    // $ANTLR start "ruleusuario"
    // InternalGratext.g:162:1: ruleusuario : ( ( rule__Usuario__UsuarioAssignment ) ) ;
    public final void ruleusuario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:166:2: ( ( ( rule__Usuario__UsuarioAssignment ) ) )
            // InternalGratext.g:167:2: ( ( rule__Usuario__UsuarioAssignment ) )
            {
            // InternalGratext.g:167:2: ( ( rule__Usuario__UsuarioAssignment ) )
            // InternalGratext.g:168:3: ( rule__Usuario__UsuarioAssignment )
            {
             before(grammarAccess.getUsuarioAccess().getUsuarioAssignment()); 
            // InternalGratext.g:169:3: ( rule__Usuario__UsuarioAssignment )
            // InternalGratext.g:169:4: rule__Usuario__UsuarioAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Usuario__UsuarioAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioAccess().getUsuarioAssignment()); 

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
    // $ANTLR end "ruleusuario"


    // $ANTLR start "entryRulecontrasena"
    // InternalGratext.g:178:1: entryRulecontrasena : rulecontrasena EOF ;
    public final void entryRulecontrasena() throws RecognitionException {
        try {
            // InternalGratext.g:179:1: ( rulecontrasena EOF )
            // InternalGratext.g:180:1: rulecontrasena EOF
            {
             before(grammarAccess.getContrasenaRule()); 
            pushFollow(FOLLOW_1);
            rulecontrasena();

            state._fsp--;

             after(grammarAccess.getContrasenaRule()); 
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
    // $ANTLR end "entryRulecontrasena"


    // $ANTLR start "rulecontrasena"
    // InternalGratext.g:187:1: rulecontrasena : ( ( rule__Contrasena__ContrasenaAssignment ) ) ;
    public final void rulecontrasena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:191:2: ( ( ( rule__Contrasena__ContrasenaAssignment ) ) )
            // InternalGratext.g:192:2: ( ( rule__Contrasena__ContrasenaAssignment ) )
            {
            // InternalGratext.g:192:2: ( ( rule__Contrasena__ContrasenaAssignment ) )
            // InternalGratext.g:193:3: ( rule__Contrasena__ContrasenaAssignment )
            {
             before(grammarAccess.getContrasenaAccess().getContrasenaAssignment()); 
            // InternalGratext.g:194:3: ( rule__Contrasena__ContrasenaAssignment )
            // InternalGratext.g:194:4: rule__Contrasena__ContrasenaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Contrasena__ContrasenaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContrasenaAccess().getContrasenaAssignment()); 

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
    // $ANTLR end "rulecontrasena"


    // $ANTLR start "ruleTipo"
    // InternalGratext.g:203:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:207:1: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalGratext.g:208:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalGratext.g:208:2: ( ( rule__Tipo__Alternatives ) )
            // InternalGratext.g:209:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalGratext.g:210:3: ( rule__Tipo__Alternatives )
            // InternalGratext.g:210:4: rule__Tipo__Alternatives
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
    // InternalGratext.g:219:1: ruleTiposDispositivo : ( ( rule__TiposDispositivo__Alternatives ) ) ;
    public final void ruleTiposDispositivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:223:1: ( ( ( rule__TiposDispositivo__Alternatives ) ) )
            // InternalGratext.g:224:2: ( ( rule__TiposDispositivo__Alternatives ) )
            {
            // InternalGratext.g:224:2: ( ( rule__TiposDispositivo__Alternatives ) )
            // InternalGratext.g:225:3: ( rule__TiposDispositivo__Alternatives )
            {
             before(grammarAccess.getTiposDispositivoAccess().getAlternatives()); 
            // InternalGratext.g:226:3: ( rule__TiposDispositivo__Alternatives )
            // InternalGratext.g:226:4: rule__TiposDispositivo__Alternatives
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
    // InternalGratext.g:235:1: ruleNombreAccion : ( ( rule__NombreAccion__Alternatives ) ) ;
    public final void ruleNombreAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:239:1: ( ( ( rule__NombreAccion__Alternatives ) ) )
            // InternalGratext.g:240:2: ( ( rule__NombreAccion__Alternatives ) )
            {
            // InternalGratext.g:240:2: ( ( rule__NombreAccion__Alternatives ) )
            // InternalGratext.g:241:3: ( rule__NombreAccion__Alternatives )
            {
             before(grammarAccess.getNombreAccionAccess().getAlternatives()); 
            // InternalGratext.g:242:3: ( rule__NombreAccion__Alternatives )
            // InternalGratext.g:242:4: rule__NombreAccion__Alternatives
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
    // InternalGratext.g:250:1: rule__Tipo__Alternatives : ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:254:1: ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) )
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
                    // InternalGratext.g:255:2: ( ( 'DELAVAL' ) )
                    {
                    // InternalGratext.g:255:2: ( ( 'DELAVAL' ) )
                    // InternalGratext.g:256:3: ( 'DELAVAL' )
                    {
                     before(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:257:3: ( 'DELAVAL' )
                    // InternalGratext.g:257:4: 'DELAVAL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:261:2: ( ( 'SIEMENS' ) )
                    {
                    // InternalGratext.g:261:2: ( ( 'SIEMENS' ) )
                    // InternalGratext.g:262:3: ( 'SIEMENS' )
                    {
                     before(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:263:3: ( 'SIEMENS' )
                    // InternalGratext.g:263:4: 'SIEMENS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:267:2: ( ( 'TABLET' ) )
                    {
                    // InternalGratext.g:267:2: ( ( 'TABLET' ) )
                    // InternalGratext.g:268:3: ( 'TABLET' )
                    {
                     before(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:269:3: ( 'TABLET' )
                    // InternalGratext.g:269:4: 'TABLET'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:273:2: ( ( 'MOVIL' ) )
                    {
                    // InternalGratext.g:273:2: ( ( 'MOVIL' ) )
                    // InternalGratext.g:274:3: ( 'MOVIL' )
                    {
                     before(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 
                    // InternalGratext.g:275:3: ( 'MOVIL' )
                    // InternalGratext.g:275:4: 'MOVIL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:279:2: ( ( 'ORDENADOR' ) )
                    {
                    // InternalGratext.g:279:2: ( ( 'ORDENADOR' ) )
                    // InternalGratext.g:280:3: ( 'ORDENADOR' )
                    {
                     before(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); 
                    // InternalGratext.g:281:3: ( 'ORDENADOR' )
                    // InternalGratext.g:281:4: 'ORDENADOR'
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
    // InternalGratext.g:289:1: rule__TiposDispositivo__Alternatives : ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) );
    public final void rule__TiposDispositivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:293:1: ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) )
            int alt2=23;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGratext.g:294:2: ( ( 'CAMARA' ) )
                    {
                    // InternalGratext.g:294:2: ( ( 'CAMARA' ) )
                    // InternalGratext.g:295:3: ( 'CAMARA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:296:3: ( 'CAMARA' )
                    // InternalGratext.g:296:4: 'CAMARA'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:300:2: ( ( 'TEMPERATURA' ) )
                    {
                    // InternalGratext.g:300:2: ( ( 'TEMPERATURA' ) )
                    // InternalGratext.g:301:3: ( 'TEMPERATURA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:302:3: ( 'TEMPERATURA' )
                    // InternalGratext.g:302:4: 'TEMPERATURA'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:306:2: ( ( 'FUEGO_HUMO' ) )
                    {
                    // InternalGratext.g:306:2: ( ( 'FUEGO_HUMO' ) )
                    // InternalGratext.g:307:3: ( 'FUEGO_HUMO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:308:3: ( 'FUEGO_HUMO' )
                    // InternalGratext.g:308:4: 'FUEGO_HUMO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:312:2: ( ( 'CO2' ) )
                    {
                    // InternalGratext.g:312:2: ( ( 'CO2' ) )
                    // InternalGratext.g:313:3: ( 'CO2' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 
                    // InternalGratext.g:314:3: ( 'CO2' )
                    // InternalGratext.g:314:4: 'CO2'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:318:2: ( ( 'GAS' ) )
                    {
                    // InternalGratext.g:318:2: ( ( 'GAS' ) )
                    // InternalGratext.g:319:3: ( 'GAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:320:3: ( 'GAS' )
                    // InternalGratext.g:320:4: 'GAS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:324:2: ( ( 'PRESENCIA' ) )
                    {
                    // InternalGratext.g:324:2: ( ( 'PRESENCIA' ) )
                    // InternalGratext.g:325:3: ( 'PRESENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 
                    // InternalGratext.g:326:3: ( 'PRESENCIA' )
                    // InternalGratext.g:326:4: 'PRESENCIA'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:330:2: ( ( 'MAGNETICO' ) )
                    {
                    // InternalGratext.g:330:2: ( ( 'MAGNETICO' ) )
                    // InternalGratext.g:331:3: ( 'MAGNETICO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 
                    // InternalGratext.g:332:3: ( 'MAGNETICO' )
                    // InternalGratext.g:332:4: 'MAGNETICO'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:336:2: ( ( 'ROTURA_CRISTAL' ) )
                    {
                    // InternalGratext.g:336:2: ( ( 'ROTURA_CRISTAL' ) )
                    // InternalGratext.g:337:3: ( 'ROTURA_CRISTAL' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 
                    // InternalGratext.g:338:3: ( 'ROTURA_CRISTAL' )
                    // InternalGratext.g:338:4: 'ROTURA_CRISTAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:342:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    {
                    // InternalGratext.g:342:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    // InternalGratext.g:343:3: ( 'BARRERA_SEGURIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 
                    // InternalGratext.g:344:3: ( 'BARRERA_SEGURIDAD' )
                    // InternalGratext.g:344:4: 'BARRERA_SEGURIDAD'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:348:2: ( ( 'LUMINOSIDAD' ) )
                    {
                    // InternalGratext.g:348:2: ( ( 'LUMINOSIDAD' ) )
                    // InternalGratext.g:349:3: ( 'LUMINOSIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 
                    // InternalGratext.g:350:3: ( 'LUMINOSIDAD' )
                    // InternalGratext.g:350:4: 'LUMINOSIDAD'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:354:2: ( ( 'EMERGENCIA' ) )
                    {
                    // InternalGratext.g:354:2: ( ( 'EMERGENCIA' ) )
                    // InternalGratext.g:355:3: ( 'EMERGENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 
                    // InternalGratext.g:356:3: ( 'EMERGENCIA' )
                    // InternalGratext.g:356:4: 'EMERGENCIA'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:360:2: ( ( 'INUNDACION' ) )
                    {
                    // InternalGratext.g:360:2: ( ( 'INUNDACION' ) )
                    // InternalGratext.g:361:3: ( 'INUNDACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 
                    // InternalGratext.g:362:3: ( 'INUNDACION' )
                    // InternalGratext.g:362:4: 'INUNDACION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:366:2: ( ( 'VIENTO' ) )
                    {
                    // InternalGratext.g:366:2: ( ( 'VIENTO' ) )
                    // InternalGratext.g:367:3: ( 'VIENTO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 
                    // InternalGratext.g:368:3: ( 'VIENTO' )
                    // InternalGratext.g:368:4: 'VIENTO'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:372:2: ( ( 'LLUVIA' ) )
                    {
                    // InternalGratext.g:372:2: ( ( 'LLUVIA' ) )
                    // InternalGratext.g:373:3: ( 'LLUVIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 
                    // InternalGratext.g:374:3: ( 'LLUVIA' )
                    // InternalGratext.g:374:4: 'LLUVIA'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGratext.g:378:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    {
                    // InternalGratext.g:378:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    // InternalGratext.g:379:3: ( 'ESTACION_METEOROLOGICA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 
                    // InternalGratext.g:380:3: ( 'ESTACION_METEOROLOGICA' )
                    // InternalGratext.g:380:4: 'ESTACION_METEOROLOGICA'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGratext.g:384:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    {
                    // InternalGratext.g:384:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    // InternalGratext.g:385:3: ( 'SISTEMA_IDENTIFICACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 
                    // InternalGratext.g:386:3: ( 'SISTEMA_IDENTIFICACION' )
                    // InternalGratext.g:386:4: 'SISTEMA_IDENTIFICACION'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGratext.g:390:2: ( ( 'INFRARROJOS' ) )
                    {
                    // InternalGratext.g:390:2: ( ( 'INFRARROJOS' ) )
                    // InternalGratext.g:391:3: ( 'INFRARROJOS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 
                    // InternalGratext.g:392:3: ( 'INFRARROJOS' )
                    // InternalGratext.g:392:4: 'INFRARROJOS'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGratext.g:396:2: ( ( 'RADIOFRECUENCIA' ) )
                    {
                    // InternalGratext.g:396:2: ( ( 'RADIOFRECUENCIA' ) )
                    // InternalGratext.g:397:3: ( 'RADIOFRECUENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 
                    // InternalGratext.g:398:3: ( 'RADIOFRECUENCIA' )
                    // InternalGratext.g:398:4: 'RADIOFRECUENCIA'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGratext.g:402:2: ( ( 'MECEDORA' ) )
                    {
                    // InternalGratext.g:402:2: ( ( 'MECEDORA' ) )
                    // InternalGratext.g:403:3: ( 'MECEDORA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 
                    // InternalGratext.g:404:3: ( 'MECEDORA' )
                    // InternalGratext.g:404:4: 'MECEDORA'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalGratext.g:408:2: ( ( 'PULSOMETRO_GANADO' ) )
                    {
                    // InternalGratext.g:408:2: ( ( 'PULSOMETRO_GANADO' ) )
                    // InternalGratext.g:409:3: ( 'PULSOMETRO_GANADO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 
                    // InternalGratext.g:410:3: ( 'PULSOMETRO_GANADO' )
                    // InternalGratext.g:410:4: 'PULSOMETRO_GANADO'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalGratext.g:414:2: ( ( 'DEPOSITO_LECHE' ) )
                    {
                    // InternalGratext.g:414:2: ( ( 'DEPOSITO_LECHE' ) )
                    // InternalGratext.g:415:3: ( 'DEPOSITO_LECHE' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 
                    // InternalGratext.g:416:3: ( 'DEPOSITO_LECHE' )
                    // InternalGratext.g:416:4: 'DEPOSITO_LECHE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalGratext.g:420:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    {
                    // InternalGratext.g:420:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    // InternalGratext.g:421:3: ( 'ROBOT_LIMPIADOR' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 
                    // InternalGratext.g:422:3: ( 'ROBOT_LIMPIADOR' )
                    // InternalGratext.g:422:4: 'ROBOT_LIMPIADOR'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalGratext.g:426:2: ( ( 'NEVERAS' ) )
                    {
                    // InternalGratext.g:426:2: ( ( 'NEVERAS' ) )
                    // InternalGratext.g:427:3: ( 'NEVERAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); 
                    // InternalGratext.g:428:3: ( 'NEVERAS' )
                    // InternalGratext.g:428:4: 'NEVERAS'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); 

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
    // InternalGratext.g:436:1: rule__NombreAccion__Alternatives : ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) );
    public final void rule__NombreAccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:440:1: ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 43:
                {
                alt3=5;
                }
                break;
            case 44:
                {
                alt3=6;
                }
                break;
            case 45:
                {
                alt3=7;
                }
                break;
            case 46:
                {
                alt3=8;
                }
                break;
            case 47:
                {
                alt3=9;
                }
                break;
            case 48:
                {
                alt3=10;
                }
                break;
            case 49:
                {
                alt3=11;
                }
                break;
            case 50:
                {
                alt3=12;
                }
                break;
            case 51:
                {
                alt3=13;
                }
                break;
            case 52:
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
                    // InternalGratext.g:441:2: ( ( 'ABRIR' ) )
                    {
                    // InternalGratext.g:441:2: ( ( 'ABRIR' ) )
                    // InternalGratext.g:442:3: ( 'ABRIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 
                    // InternalGratext.g:443:3: ( 'ABRIR' )
                    // InternalGratext.g:443:4: 'ABRIR'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:447:2: ( ( 'ENVIAR' ) )
                    {
                    // InternalGratext.g:447:2: ( ( 'ENVIAR' ) )
                    // InternalGratext.g:448:3: ( 'ENVIAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 
                    // InternalGratext.g:449:3: ( 'ENVIAR' )
                    // InternalGratext.g:449:4: 'ENVIAR'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:453:2: ( ( 'SACAR' ) )
                    {
                    // InternalGratext.g:453:2: ( ( 'SACAR' ) )
                    // InternalGratext.g:454:3: ( 'SACAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 
                    // InternalGratext.g:455:3: ( 'SACAR' )
                    // InternalGratext.g:455:4: 'SACAR'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:459:2: ( ( 'CERRAR' ) )
                    {
                    // InternalGratext.g:459:2: ( ( 'CERRAR' ) )
                    // InternalGratext.g:460:3: ( 'CERRAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 
                    // InternalGratext.g:461:3: ( 'CERRAR' )
                    // InternalGratext.g:461:4: 'CERRAR'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:465:2: ( ( 'ESTADO' ) )
                    {
                    // InternalGratext.g:465:2: ( ( 'ESTADO' ) )
                    // InternalGratext.g:466:3: ( 'ESTADO' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:467:3: ( 'ESTADO' )
                    // InternalGratext.g:467:4: 'ESTADO'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:471:2: ( ( 'GRABAR' ) )
                    {
                    // InternalGratext.g:471:2: ( ( 'GRABAR' ) )
                    // InternalGratext.g:472:3: ( 'GRABAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 
                    // InternalGratext.g:473:3: ( 'GRABAR' )
                    // InternalGratext.g:473:4: 'GRABAR'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:477:2: ( ( 'DETECTAR' ) )
                    {
                    // InternalGratext.g:477:2: ( ( 'DETECTAR' ) )
                    // InternalGratext.g:478:3: ( 'DETECTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 
                    // InternalGratext.g:479:3: ( 'DETECTAR' )
                    // InternalGratext.g:479:4: 'DETECTAR'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:483:2: ( ( 'ENCENDER' ) )
                    {
                    // InternalGratext.g:483:2: ( ( 'ENCENDER' ) )
                    // InternalGratext.g:484:3: ( 'ENCENDER' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 
                    // InternalGratext.g:485:3: ( 'ENCENDER' )
                    // InternalGratext.g:485:4: 'ENCENDER'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:489:2: ( ( 'APAGAR' ) )
                    {
                    // InternalGratext.g:489:2: ( ( 'APAGAR' ) )
                    // InternalGratext.g:490:3: ( 'APAGAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 
                    // InternalGratext.g:491:3: ( 'APAGAR' )
                    // InternalGratext.g:491:4: 'APAGAR'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:495:2: ( ( 'AUMENTAR' ) )
                    {
                    // InternalGratext.g:495:2: ( ( 'AUMENTAR' ) )
                    // InternalGratext.g:496:3: ( 'AUMENTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 
                    // InternalGratext.g:497:3: ( 'AUMENTAR' )
                    // InternalGratext.g:497:4: 'AUMENTAR'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:501:2: ( ( 'DISMINUIR' ) )
                    {
                    // InternalGratext.g:501:2: ( ( 'DISMINUIR' ) )
                    // InternalGratext.g:502:3: ( 'DISMINUIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 
                    // InternalGratext.g:503:3: ( 'DISMINUIR' )
                    // InternalGratext.g:503:4: 'DISMINUIR'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:507:2: ( ( 'COMPROBAR' ) )
                    {
                    // InternalGratext.g:507:2: ( ( 'COMPROBAR' ) )
                    // InternalGratext.g:508:3: ( 'COMPROBAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 
                    // InternalGratext.g:509:3: ( 'COMPROBAR' )
                    // InternalGratext.g:509:4: 'COMPROBAR'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:513:2: ( ( 'ACTIVAR' ) )
                    {
                    // InternalGratext.g:513:2: ( ( 'ACTIVAR' ) )
                    // InternalGratext.g:514:3: ( 'ACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 
                    // InternalGratext.g:515:3: ( 'ACTIVAR' )
                    // InternalGratext.g:515:4: 'ACTIVAR'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:519:2: ( ( 'DESACTIVAR' ) )
                    {
                    // InternalGratext.g:519:2: ( ( 'DESACTIVAR' ) )
                    // InternalGratext.g:520:3: ( 'DESACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); 
                    // InternalGratext.g:521:3: ( 'DESACTIVAR' )
                    // InternalGratext.g:521:4: 'DESACTIVAR'
                    {
                    match(input,52,FOLLOW_2); 

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
    // InternalGratext.g:529:1: rule__Granja__Group__0 : rule__Granja__Group__0__Impl rule__Granja__Group__1 ;
    public final void rule__Granja__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:533:1: ( rule__Granja__Group__0__Impl rule__Granja__Group__1 )
            // InternalGratext.g:534:2: rule__Granja__Group__0__Impl rule__Granja__Group__1
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
    // InternalGratext.g:541:1: rule__Granja__Group__0__Impl : ( 'GRANJA' ) ;
    public final void rule__Granja__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:545:1: ( ( 'GRANJA' ) )
            // InternalGratext.g:546:1: ( 'GRANJA' )
            {
            // InternalGratext.g:546:1: ( 'GRANJA' )
            // InternalGratext.g:547:2: 'GRANJA'
            {
             before(grammarAccess.getGranjaAccess().getGRANJAKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getGRANJAKeyword_0()); 

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
    // InternalGratext.g:556:1: rule__Granja__Group__1 : rule__Granja__Group__1__Impl rule__Granja__Group__2 ;
    public final void rule__Granja__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:560:1: ( rule__Granja__Group__1__Impl rule__Granja__Group__2 )
            // InternalGratext.g:561:2: rule__Granja__Group__1__Impl rule__Granja__Group__2
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
    // InternalGratext.g:568:1: rule__Granja__Group__1__Impl : ( ( rule__Granja__NameAssignment_1 ) ) ;
    public final void rule__Granja__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:572:1: ( ( ( rule__Granja__NameAssignment_1 ) ) )
            // InternalGratext.g:573:1: ( ( rule__Granja__NameAssignment_1 ) )
            {
            // InternalGratext.g:573:1: ( ( rule__Granja__NameAssignment_1 ) )
            // InternalGratext.g:574:2: ( rule__Granja__NameAssignment_1 )
            {
             before(grammarAccess.getGranjaAccess().getNameAssignment_1()); 
            // InternalGratext.g:575:2: ( rule__Granja__NameAssignment_1 )
            // InternalGratext.g:575:3: rule__Granja__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Granja__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getNameAssignment_1()); 

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
    // InternalGratext.g:583:1: rule__Granja__Group__2 : rule__Granja__Group__2__Impl rule__Granja__Group__3 ;
    public final void rule__Granja__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:587:1: ( rule__Granja__Group__2__Impl rule__Granja__Group__3 )
            // InternalGratext.g:588:2: rule__Granja__Group__2__Impl rule__Granja__Group__3
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
    // InternalGratext.g:595:1: rule__Granja__Group__2__Impl : ( 'CENTRALITA:' ) ;
    public final void rule__Granja__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:599:1: ( ( 'CENTRALITA:' ) )
            // InternalGratext.g:600:1: ( 'CENTRALITA:' )
            {
            // InternalGratext.g:600:1: ( 'CENTRALITA:' )
            // InternalGratext.g:601:2: 'CENTRALITA:'
            {
             before(grammarAccess.getGranjaAccess().getCENTRALITAKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getCENTRALITAKeyword_2()); 

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
    // InternalGratext.g:610:1: rule__Granja__Group__3 : rule__Granja__Group__3__Impl rule__Granja__Group__4 ;
    public final void rule__Granja__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:614:1: ( rule__Granja__Group__3__Impl rule__Granja__Group__4 )
            // InternalGratext.g:615:2: rule__Granja__Group__3__Impl rule__Granja__Group__4
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
    // InternalGratext.g:622:1: rule__Granja__Group__3__Impl : ( ( rule__Granja__TipoAssignment_3 ) ) ;
    public final void rule__Granja__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:626:1: ( ( ( rule__Granja__TipoAssignment_3 ) ) )
            // InternalGratext.g:627:1: ( ( rule__Granja__TipoAssignment_3 ) )
            {
            // InternalGratext.g:627:1: ( ( rule__Granja__TipoAssignment_3 ) )
            // InternalGratext.g:628:2: ( rule__Granja__TipoAssignment_3 )
            {
             before(grammarAccess.getGranjaAccess().getTipoAssignment_3()); 
            // InternalGratext.g:629:2: ( rule__Granja__TipoAssignment_3 )
            // InternalGratext.g:629:3: rule__Granja__TipoAssignment_3
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
    // InternalGratext.g:637:1: rule__Granja__Group__4 : rule__Granja__Group__4__Impl rule__Granja__Group__5 ;
    public final void rule__Granja__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:641:1: ( rule__Granja__Group__4__Impl rule__Granja__Group__5 )
            // InternalGratext.g:642:2: rule__Granja__Group__4__Impl rule__Granja__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalGratext.g:649:1: rule__Granja__Group__4__Impl : ( 'Usuario:' ) ;
    public final void rule__Granja__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:653:1: ( ( 'Usuario:' ) )
            // InternalGratext.g:654:1: ( 'Usuario:' )
            {
            // InternalGratext.g:654:1: ( 'Usuario:' )
            // InternalGratext.g:655:2: 'Usuario:'
            {
             before(grammarAccess.getGranjaAccess().getUsuarioKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getUsuarioKeyword_4()); 

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
    // InternalGratext.g:664:1: rule__Granja__Group__5 : rule__Granja__Group__5__Impl rule__Granja__Group__6 ;
    public final void rule__Granja__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:668:1: ( rule__Granja__Group__5__Impl rule__Granja__Group__6 )
            // InternalGratext.g:669:2: rule__Granja__Group__5__Impl rule__Granja__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalGratext.g:676:1: rule__Granja__Group__5__Impl : ( ( rule__Granja__UsuarioAssignment_5 ) ) ;
    public final void rule__Granja__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:680:1: ( ( ( rule__Granja__UsuarioAssignment_5 ) ) )
            // InternalGratext.g:681:1: ( ( rule__Granja__UsuarioAssignment_5 ) )
            {
            // InternalGratext.g:681:1: ( ( rule__Granja__UsuarioAssignment_5 ) )
            // InternalGratext.g:682:2: ( rule__Granja__UsuarioAssignment_5 )
            {
             before(grammarAccess.getGranjaAccess().getUsuarioAssignment_5()); 
            // InternalGratext.g:683:2: ( rule__Granja__UsuarioAssignment_5 )
            // InternalGratext.g:683:3: rule__Granja__UsuarioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Granja__UsuarioAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getUsuarioAssignment_5()); 

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
    // InternalGratext.g:691:1: rule__Granja__Group__6 : rule__Granja__Group__6__Impl rule__Granja__Group__7 ;
    public final void rule__Granja__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:695:1: ( rule__Granja__Group__6__Impl rule__Granja__Group__7 )
            // InternalGratext.g:696:2: rule__Granja__Group__6__Impl rule__Granja__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalGratext.g:703:1: rule__Granja__Group__6__Impl : ( 'Contrase\\u00F1a:' ) ;
    public final void rule__Granja__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:707:1: ( ( 'Contrase\\u00F1a:' ) )
            // InternalGratext.g:708:1: ( 'Contrase\\u00F1a:' )
            {
            // InternalGratext.g:708:1: ( 'Contrase\\u00F1a:' )
            // InternalGratext.g:709:2: 'Contrase\\u00F1a:'
            {
             before(grammarAccess.getGranjaAccess().getContraseAKeyword_6()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getContraseAKeyword_6()); 

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
    // InternalGratext.g:718:1: rule__Granja__Group__7 : rule__Granja__Group__7__Impl rule__Granja__Group__8 ;
    public final void rule__Granja__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:722:1: ( rule__Granja__Group__7__Impl rule__Granja__Group__8 )
            // InternalGratext.g:723:2: rule__Granja__Group__7__Impl rule__Granja__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Granja__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__8();

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
    // InternalGratext.g:730:1: rule__Granja__Group__7__Impl : ( ( rule__Granja__ContrasenaAssignment_7 ) ) ;
    public final void rule__Granja__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:734:1: ( ( ( rule__Granja__ContrasenaAssignment_7 ) ) )
            // InternalGratext.g:735:1: ( ( rule__Granja__ContrasenaAssignment_7 ) )
            {
            // InternalGratext.g:735:1: ( ( rule__Granja__ContrasenaAssignment_7 ) )
            // InternalGratext.g:736:2: ( rule__Granja__ContrasenaAssignment_7 )
            {
             before(grammarAccess.getGranjaAccess().getContrasenaAssignment_7()); 
            // InternalGratext.g:737:2: ( rule__Granja__ContrasenaAssignment_7 )
            // InternalGratext.g:737:3: rule__Granja__ContrasenaAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Granja__ContrasenaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGranjaAccess().getContrasenaAssignment_7()); 

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


    // $ANTLR start "rule__Granja__Group__8"
    // InternalGratext.g:745:1: rule__Granja__Group__8 : rule__Granja__Group__8__Impl rule__Granja__Group__9 ;
    public final void rule__Granja__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:749:1: ( rule__Granja__Group__8__Impl rule__Granja__Group__9 )
            // InternalGratext.g:750:2: rule__Granja__Group__8__Impl rule__Granja__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Granja__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__9();

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
    // $ANTLR end "rule__Granja__Group__8"


    // $ANTLR start "rule__Granja__Group__8__Impl"
    // InternalGratext.g:757:1: rule__Granja__Group__8__Impl : ( 'Dispositivos{' ) ;
    public final void rule__Granja__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:761:1: ( ( 'Dispositivos{' ) )
            // InternalGratext.g:762:1: ( 'Dispositivos{' )
            {
            // InternalGratext.g:762:1: ( 'Dispositivos{' )
            // InternalGratext.g:763:2: 'Dispositivos{'
            {
             before(grammarAccess.getGranjaAccess().getDispositivosKeyword_8()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getDispositivosKeyword_8()); 

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
    // $ANTLR end "rule__Granja__Group__8__Impl"


    // $ANTLR start "rule__Granja__Group__9"
    // InternalGratext.g:772:1: rule__Granja__Group__9 : rule__Granja__Group__9__Impl rule__Granja__Group__10 ;
    public final void rule__Granja__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:776:1: ( rule__Granja__Group__9__Impl rule__Granja__Group__10 )
            // InternalGratext.g:777:2: rule__Granja__Group__9__Impl rule__Granja__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Granja__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Granja__Group__10();

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
    // $ANTLR end "rule__Granja__Group__9"


    // $ANTLR start "rule__Granja__Group__9__Impl"
    // InternalGratext.g:784:1: rule__Granja__Group__9__Impl : ( ( rule__Granja__DispositivosAssignment_9 )* ) ;
    public final void rule__Granja__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:788:1: ( ( ( rule__Granja__DispositivosAssignment_9 )* ) )
            // InternalGratext.g:789:1: ( ( rule__Granja__DispositivosAssignment_9 )* )
            {
            // InternalGratext.g:789:1: ( ( rule__Granja__DispositivosAssignment_9 )* )
            // InternalGratext.g:790:2: ( rule__Granja__DispositivosAssignment_9 )*
            {
             before(grammarAccess.getGranjaAccess().getDispositivosAssignment_9()); 
            // InternalGratext.g:791:2: ( rule__Granja__DispositivosAssignment_9 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==59) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGratext.g:791:3: rule__Granja__DispositivosAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Granja__DispositivosAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGranjaAccess().getDispositivosAssignment_9()); 

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
    // $ANTLR end "rule__Granja__Group__9__Impl"


    // $ANTLR start "rule__Granja__Group__10"
    // InternalGratext.g:799:1: rule__Granja__Group__10 : rule__Granja__Group__10__Impl ;
    public final void rule__Granja__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:803:1: ( rule__Granja__Group__10__Impl )
            // InternalGratext.g:804:2: rule__Granja__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Granja__Group__10__Impl();

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
    // $ANTLR end "rule__Granja__Group__10"


    // $ANTLR start "rule__Granja__Group__10__Impl"
    // InternalGratext.g:810:1: rule__Granja__Group__10__Impl : ( '}' ) ;
    public final void rule__Granja__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:814:1: ( ( '}' ) )
            // InternalGratext.g:815:1: ( '}' )
            {
            // InternalGratext.g:815:1: ( '}' )
            // InternalGratext.g:816:2: '}'
            {
             before(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_10()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Granja__Group__10__Impl"


    // $ANTLR start "rule__Dispositivos__Group__0"
    // InternalGratext.g:826:1: rule__Dispositivos__Group__0 : rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 ;
    public final void rule__Dispositivos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:830:1: ( rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 )
            // InternalGratext.g:831:2: rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGratext.g:838:1: rule__Dispositivos__Group__0__Impl : ( 'Codigo:' ) ;
    public final void rule__Dispositivos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:842:1: ( ( 'Codigo:' ) )
            // InternalGratext.g:843:1: ( 'Codigo:' )
            {
            // InternalGratext.g:843:1: ( 'Codigo:' )
            // InternalGratext.g:844:2: 'Codigo:'
            {
             before(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalGratext.g:853:1: rule__Dispositivos__Group__1 : rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 ;
    public final void rule__Dispositivos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:857:1: ( rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 )
            // InternalGratext.g:858:2: rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGratext.g:865:1: rule__Dispositivos__Group__1__Impl : ( ( rule__Dispositivos__CodigoAssignment_1 ) ) ;
    public final void rule__Dispositivos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:869:1: ( ( ( rule__Dispositivos__CodigoAssignment_1 ) ) )
            // InternalGratext.g:870:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            {
            // InternalGratext.g:870:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            // InternalGratext.g:871:2: ( rule__Dispositivos__CodigoAssignment_1 )
            {
             before(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); 
            // InternalGratext.g:872:2: ( rule__Dispositivos__CodigoAssignment_1 )
            // InternalGratext.g:872:3: rule__Dispositivos__CodigoAssignment_1
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
    // InternalGratext.g:880:1: rule__Dispositivos__Group__2 : rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 ;
    public final void rule__Dispositivos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:884:1: ( rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 )
            // InternalGratext.g:885:2: rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGratext.g:892:1: rule__Dispositivos__Group__2__Impl : ( 'Sensor' ) ;
    public final void rule__Dispositivos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:896:1: ( ( 'Sensor' ) )
            // InternalGratext.g:897:1: ( 'Sensor' )
            {
            // InternalGratext.g:897:1: ( 'Sensor' )
            // InternalGratext.g:898:2: 'Sensor'
            {
             before(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalGratext.g:907:1: rule__Dispositivos__Group__3 : rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 ;
    public final void rule__Dispositivos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:911:1: ( rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 )
            // InternalGratext.g:912:2: rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGratext.g:919:1: rule__Dispositivos__Group__3__Impl : ( ( rule__Dispositivos__NombreAssignment_3 ) ) ;
    public final void rule__Dispositivos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:923:1: ( ( ( rule__Dispositivos__NombreAssignment_3 ) ) )
            // InternalGratext.g:924:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            {
            // InternalGratext.g:924:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            // InternalGratext.g:925:2: ( rule__Dispositivos__NombreAssignment_3 )
            {
             before(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); 
            // InternalGratext.g:926:2: ( rule__Dispositivos__NombreAssignment_3 )
            // InternalGratext.g:926:3: rule__Dispositivos__NombreAssignment_3
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
    // InternalGratext.g:934:1: rule__Dispositivos__Group__4 : rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 ;
    public final void rule__Dispositivos__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:938:1: ( rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 )
            // InternalGratext.g:939:2: rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGratext.g:946:1: rule__Dispositivos__Group__4__Impl : ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) ;
    public final void rule__Dispositivos__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:950:1: ( ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) )
            // InternalGratext.g:951:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            {
            // InternalGratext.g:951:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            // InternalGratext.g:952:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            {
             before(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); 
            // InternalGratext.g:953:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGratext.g:953:3: rule__Dispositivos__TemperaturaAssignment_4
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
    // InternalGratext.g:961:1: rule__Dispositivos__Group__5 : rule__Dispositivos__Group__5__Impl ;
    public final void rule__Dispositivos__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:965:1: ( rule__Dispositivos__Group__5__Impl )
            // InternalGratext.g:966:2: rule__Dispositivos__Group__5__Impl
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
    // InternalGratext.g:972:1: rule__Dispositivos__Group__5__Impl : ( ( rule__Dispositivos__AccionAssignment_5 ) ) ;
    public final void rule__Dispositivos__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:976:1: ( ( ( rule__Dispositivos__AccionAssignment_5 ) ) )
            // InternalGratext.g:977:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            {
            // InternalGratext.g:977:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            // InternalGratext.g:978:2: ( rule__Dispositivos__AccionAssignment_5 )
            {
             before(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); 
            // InternalGratext.g:979:2: ( rule__Dispositivos__AccionAssignment_5 )
            // InternalGratext.g:979:3: rule__Dispositivos__AccionAssignment_5
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
    // InternalGratext.g:988:1: rule__Accion__Group__0 : rule__Accion__Group__0__Impl rule__Accion__Group__1 ;
    public final void rule__Accion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:992:1: ( rule__Accion__Group__0__Impl rule__Accion__Group__1 )
            // InternalGratext.g:993:2: rule__Accion__Group__0__Impl rule__Accion__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGratext.g:1000:1: rule__Accion__Group__0__Impl : ( 'quiero' ) ;
    public final void rule__Accion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1004:1: ( ( 'quiero' ) )
            // InternalGratext.g:1005:1: ( 'quiero' )
            {
            // InternalGratext.g:1005:1: ( 'quiero' )
            // InternalGratext.g:1006:2: 'quiero'
            {
             before(grammarAccess.getAccionAccess().getQuieroKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalGratext.g:1015:1: rule__Accion__Group__1 : rule__Accion__Group__1__Impl rule__Accion__Group__2 ;
    public final void rule__Accion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1019:1: ( rule__Accion__Group__1__Impl rule__Accion__Group__2 )
            // InternalGratext.g:1020:2: rule__Accion__Group__1__Impl rule__Accion__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGratext.g:1027:1: rule__Accion__Group__1__Impl : ( ( rule__Accion__NombreAccionAssignment_1 ) ) ;
    public final void rule__Accion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1031:1: ( ( ( rule__Accion__NombreAccionAssignment_1 ) ) )
            // InternalGratext.g:1032:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            {
            // InternalGratext.g:1032:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            // InternalGratext.g:1033:2: ( rule__Accion__NombreAccionAssignment_1 )
            {
             before(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); 
            // InternalGratext.g:1034:2: ( rule__Accion__NombreAccionAssignment_1 )
            // InternalGratext.g:1034:3: rule__Accion__NombreAccionAssignment_1
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
    // InternalGratext.g:1042:1: rule__Accion__Group__2 : rule__Accion__Group__2__Impl rule__Accion__Group__3 ;
    public final void rule__Accion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1046:1: ( rule__Accion__Group__2__Impl rule__Accion__Group__3 )
            // InternalGratext.g:1047:2: rule__Accion__Group__2__Impl rule__Accion__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGratext.g:1054:1: rule__Accion__Group__2__Impl : ( ( rule__Accion__NumeroAssignment_2 )? ) ;
    public final void rule__Accion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1058:1: ( ( ( rule__Accion__NumeroAssignment_2 )? ) )
            // InternalGratext.g:1059:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            {
            // InternalGratext.g:1059:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            // InternalGratext.g:1060:2: ( rule__Accion__NumeroAssignment_2 )?
            {
             before(grammarAccess.getAccionAccess().getNumeroAssignment_2()); 
            // InternalGratext.g:1061:2: ( rule__Accion__NumeroAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGratext.g:1061:3: rule__Accion__NumeroAssignment_2
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
    // InternalGratext.g:1069:1: rule__Accion__Group__3 : rule__Accion__Group__3__Impl ;
    public final void rule__Accion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1073:1: ( rule__Accion__Group__3__Impl )
            // InternalGratext.g:1074:2: rule__Accion__Group__3__Impl
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
    // InternalGratext.g:1080:1: rule__Accion__Group__3__Impl : ( ( rule__Accion__DescripcionAssignment_3 )? ) ;
    public final void rule__Accion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1084:1: ( ( ( rule__Accion__DescripcionAssignment_3 )? ) )
            // InternalGratext.g:1085:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            {
            // InternalGratext.g:1085:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            // InternalGratext.g:1086:2: ( rule__Accion__DescripcionAssignment_3 )?
            {
             before(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); 
            // InternalGratext.g:1087:2: ( rule__Accion__DescripcionAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGratext.g:1087:3: rule__Accion__DescripcionAssignment_3
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
    // InternalGratext.g:1096:1: rule__Numero__Group__0 : rule__Numero__Group__0__Impl rule__Numero__Group__1 ;
    public final void rule__Numero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1100:1: ( rule__Numero__Group__0__Impl rule__Numero__Group__1 )
            // InternalGratext.g:1101:2: rule__Numero__Group__0__Impl rule__Numero__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGratext.g:1108:1: rule__Numero__Group__0__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Numero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1112:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGratext.g:1113:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGratext.g:1113:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGratext.g:1114:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGratext.g:1114:2: ( ( RULE_INT ) )
            // InternalGratext.g:1115:3: ( RULE_INT )
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1116:3: ( RULE_INT )
            // InternalGratext.g:1116:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_18); 

            }

             after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 

            }

            // InternalGratext.g:1119:2: ( ( RULE_INT )* )
            // InternalGratext.g:1120:3: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1121:3: ( RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGratext.g:1121:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_18); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalGratext.g:1130:1: rule__Numero__Group__1 : rule__Numero__Group__1__Impl rule__Numero__Group__2 ;
    public final void rule__Numero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1134:1: ( rule__Numero__Group__1__Impl rule__Numero__Group__2 )
            // InternalGratext.g:1135:2: rule__Numero__Group__1__Impl rule__Numero__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGratext.g:1142:1: rule__Numero__Group__1__Impl : ( ( '.' )? ) ;
    public final void rule__Numero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1146:1: ( ( ( '.' )? ) )
            // InternalGratext.g:1147:1: ( ( '.' )? )
            {
            // InternalGratext.g:1147:1: ( ( '.' )? )
            // InternalGratext.g:1148:2: ( '.' )?
            {
             before(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); 
            // InternalGratext.g:1149:2: ( '.' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==62) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGratext.g:1149:3: '.'
                    {
                    match(input,62,FOLLOW_2); 

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
    // InternalGratext.g:1157:1: rule__Numero__Group__2 : rule__Numero__Group__2__Impl ;
    public final void rule__Numero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1161:1: ( rule__Numero__Group__2__Impl )
            // InternalGratext.g:1162:2: rule__Numero__Group__2__Impl
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
    // InternalGratext.g:1168:1: rule__Numero__Group__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Numero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1172:1: ( ( ( RULE_INT )* ) )
            // InternalGratext.g:1173:1: ( ( RULE_INT )* )
            {
            // InternalGratext.g:1173:1: ( ( RULE_INT )* )
            // InternalGratext.g:1174:2: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); 
            // InternalGratext.g:1175:2: ( RULE_INT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGratext.g:1175:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_18); 

            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Granja__NameAssignment_1"
    // InternalGratext.g:1184:1: rule__Granja__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Granja__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1188:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1189:2: ( RULE_STRING )
            {
            // InternalGratext.g:1189:2: ( RULE_STRING )
            // InternalGratext.g:1190:3: RULE_STRING
            {
             before(grammarAccess.getGranjaAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGranjaAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Granja__NameAssignment_1"


    // $ANTLR start "rule__Granja__TipoAssignment_3"
    // InternalGratext.g:1199:1: rule__Granja__TipoAssignment_3 : ( ruleTipo ) ;
    public final void rule__Granja__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1203:1: ( ( ruleTipo ) )
            // InternalGratext.g:1204:2: ( ruleTipo )
            {
            // InternalGratext.g:1204:2: ( ruleTipo )
            // InternalGratext.g:1205:3: ruleTipo
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


    // $ANTLR start "rule__Granja__UsuarioAssignment_5"
    // InternalGratext.g:1214:1: rule__Granja__UsuarioAssignment_5 : ( ruleusuario ) ;
    public final void rule__Granja__UsuarioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1218:1: ( ( ruleusuario ) )
            // InternalGratext.g:1219:2: ( ruleusuario )
            {
            // InternalGratext.g:1219:2: ( ruleusuario )
            // InternalGratext.g:1220:3: ruleusuario
            {
             before(grammarAccess.getGranjaAccess().getUsuarioUsuarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleusuario();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getUsuarioUsuarioParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Granja__UsuarioAssignment_5"


    // $ANTLR start "rule__Granja__ContrasenaAssignment_7"
    // InternalGratext.g:1229:1: rule__Granja__ContrasenaAssignment_7 : ( rulecontrasena ) ;
    public final void rule__Granja__ContrasenaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1233:1: ( ( rulecontrasena ) )
            // InternalGratext.g:1234:2: ( rulecontrasena )
            {
            // InternalGratext.g:1234:2: ( rulecontrasena )
            // InternalGratext.g:1235:3: rulecontrasena
            {
             before(grammarAccess.getGranjaAccess().getContrasenaContrasenaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulecontrasena();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getContrasenaContrasenaParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Granja__ContrasenaAssignment_7"


    // $ANTLR start "rule__Granja__DispositivosAssignment_9"
    // InternalGratext.g:1244:1: rule__Granja__DispositivosAssignment_9 : ( ruleDispositivos ) ;
    public final void rule__Granja__DispositivosAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1248:1: ( ( ruleDispositivos ) )
            // InternalGratext.g:1249:2: ( ruleDispositivos )
            {
            // InternalGratext.g:1249:2: ( ruleDispositivos )
            // InternalGratext.g:1250:3: ruleDispositivos
            {
             before(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDispositivos();

            state._fsp--;

             after(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Granja__DispositivosAssignment_9"


    // $ANTLR start "rule__Dispositivos__CodigoAssignment_1"
    // InternalGratext.g:1259:1: rule__Dispositivos__CodigoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dispositivos__CodigoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1263:1: ( ( RULE_ID ) )
            // InternalGratext.g:1264:2: ( RULE_ID )
            {
            // InternalGratext.g:1264:2: ( RULE_ID )
            // InternalGratext.g:1265:3: RULE_ID
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
    // InternalGratext.g:1274:1: rule__Dispositivos__NombreAssignment_3 : ( ruleTiposDispositivo ) ;
    public final void rule__Dispositivos__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1278:1: ( ( ruleTiposDispositivo ) )
            // InternalGratext.g:1279:2: ( ruleTiposDispositivo )
            {
            // InternalGratext.g:1279:2: ( ruleTiposDispositivo )
            // InternalGratext.g:1280:3: ruleTiposDispositivo
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
    // InternalGratext.g:1289:1: rule__Dispositivos__TemperaturaAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Dispositivos__TemperaturaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1293:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1294:2: ( RULE_STRING )
            {
            // InternalGratext.g:1294:2: ( RULE_STRING )
            // InternalGratext.g:1295:3: RULE_STRING
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
    // InternalGratext.g:1304:1: rule__Dispositivos__AccionAssignment_5 : ( ruleaccion ) ;
    public final void rule__Dispositivos__AccionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1308:1: ( ( ruleaccion ) )
            // InternalGratext.g:1309:2: ( ruleaccion )
            {
            // InternalGratext.g:1309:2: ( ruleaccion )
            // InternalGratext.g:1310:3: ruleaccion
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
    // InternalGratext.g:1319:1: rule__Accion__NombreAccionAssignment_1 : ( ruleNombreAccion ) ;
    public final void rule__Accion__NombreAccionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1323:1: ( ( ruleNombreAccion ) )
            // InternalGratext.g:1324:2: ( ruleNombreAccion )
            {
            // InternalGratext.g:1324:2: ( ruleNombreAccion )
            // InternalGratext.g:1325:3: ruleNombreAccion
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
    // InternalGratext.g:1334:1: rule__Accion__NumeroAssignment_2 : ( rulenumero ) ;
    public final void rule__Accion__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1338:1: ( ( rulenumero ) )
            // InternalGratext.g:1339:2: ( rulenumero )
            {
            // InternalGratext.g:1339:2: ( rulenumero )
            // InternalGratext.g:1340:3: rulenumero
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
    // InternalGratext.g:1349:1: rule__Accion__DescripcionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Accion__DescripcionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1353:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1354:2: ( RULE_STRING )
            {
            // InternalGratext.g:1354:2: ( RULE_STRING )
            // InternalGratext.g:1355:3: RULE_STRING
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


    // $ANTLR start "rule__Usuario__UsuarioAssignment"
    // InternalGratext.g:1364:1: rule__Usuario__UsuarioAssignment : ( RULE_ID ) ;
    public final void rule__Usuario__UsuarioAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1368:1: ( ( RULE_ID ) )
            // InternalGratext.g:1369:2: ( RULE_ID )
            {
            // InternalGratext.g:1369:2: ( RULE_ID )
            // InternalGratext.g:1370:3: RULE_ID
            {
             before(grammarAccess.getUsuarioAccess().getUsuarioIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsuarioAccess().getUsuarioIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Usuario__UsuarioAssignment"


    // $ANTLR start "rule__Contrasena__ContrasenaAssignment"
    // InternalGratext.g:1379:1: rule__Contrasena__ContrasenaAssignment : ( RULE_STRING ) ;
    public final void rule__Contrasena__ContrasenaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1383:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1384:2: ( RULE_STRING )
            {
            // InternalGratext.g:1384:2: ( RULE_STRING )
            // InternalGratext.g:1385:3: RULE_STRING
            {
             before(grammarAccess.getContrasenaAccess().getContrasenaSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContrasenaAccess().getContrasenaSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Contrasena__ContrasenaAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007FFFFF0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001FFF8000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});

}