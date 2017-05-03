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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DELAVAL'", "'SIEMENS'", "'TABLET'", "'MOVIL'", "'ORDENADOR'", "'CAMARA'", "'TEMPERATURA'", "'FUEGO_HUMO'", "'CO2'", "'GAS'", "'PRESENCIA'", "'MAGNETICO'", "'ROTURA_CRISTAL'", "'BARRERA_SEGURIDAD'", "'LUMINOSIDAD'", "'EMERGENCIA'", "'INUNDACION'", "'VIENTO'", "'LLUVIA'", "'ESTACION_METEOROLOGICA'", "'SISTEMA_IDENTIFICACION'", "'INFRARROJOS'", "'RADIOFRECUENCIA'", "'MECEDORA'", "'PULSOMETRO_GANADO'", "'DEPOSITO_LECHE'", "'ROBOT_LIMPIADOR'", "'NEVERAS'", "'ABRIR'", "'ENVIAR'", "'SACAR'", "'CERRAR'", "'ESTADO'", "'GRABAR'", "'DETECTAR'", "'ENCENDER'", "'APAGAR'", "'AUMENTAR'", "'DISMINUIR'", "'COMPROBAR'", "'ACTIVAR'", "'DESACTIVAR'", "'AMBIENTE'", "'INTERNA'", "'NEVERA'", "'GRANJA'", "'CENTRALITA:'", "'Usuario:'", "'Contrase\\u00F1a:'", "'Dispositivos{'", "'}'", "'Codigo:'", "'Sensor'", "'quiero'", "'.'"
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
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "ruleEstado"
    // InternalGratext.g:251:1: ruleEstado : ( ( rule__Estado__Alternatives ) ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:255:1: ( ( ( rule__Estado__Alternatives ) ) )
            // InternalGratext.g:256:2: ( ( rule__Estado__Alternatives ) )
            {
            // InternalGratext.g:256:2: ( ( rule__Estado__Alternatives ) )
            // InternalGratext.g:257:3: ( rule__Estado__Alternatives )
            {
             before(grammarAccess.getEstadoAccess().getAlternatives()); 
            // InternalGratext.g:258:3: ( rule__Estado__Alternatives )
            // InternalGratext.g:258:4: rule__Estado__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEstado"


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalGratext.g:266:1: rule__Tipo__Alternatives : ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:270:1: ( ( ( 'DELAVAL' ) ) | ( ( 'SIEMENS' ) ) | ( ( 'TABLET' ) ) | ( ( 'MOVIL' ) ) | ( ( 'ORDENADOR' ) ) )
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
                    // InternalGratext.g:271:2: ( ( 'DELAVAL' ) )
                    {
                    // InternalGratext.g:271:2: ( ( 'DELAVAL' ) )
                    // InternalGratext.g:272:3: ( 'DELAVAL' )
                    {
                     before(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:273:3: ( 'DELAVAL' )
                    // InternalGratext.g:273:4: 'DELAVAL'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:277:2: ( ( 'SIEMENS' ) )
                    {
                    // InternalGratext.g:277:2: ( ( 'SIEMENS' ) )
                    // InternalGratext.g:278:3: ( 'SIEMENS' )
                    {
                     before(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:279:3: ( 'SIEMENS' )
                    // InternalGratext.g:279:4: 'SIEMENS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:283:2: ( ( 'TABLET' ) )
                    {
                    // InternalGratext.g:283:2: ( ( 'TABLET' ) )
                    // InternalGratext.g:284:3: ( 'TABLET' )
                    {
                     before(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:285:3: ( 'TABLET' )
                    // InternalGratext.g:285:4: 'TABLET'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:289:2: ( ( 'MOVIL' ) )
                    {
                    // InternalGratext.g:289:2: ( ( 'MOVIL' ) )
                    // InternalGratext.g:290:3: ( 'MOVIL' )
                    {
                     before(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 
                    // InternalGratext.g:291:3: ( 'MOVIL' )
                    // InternalGratext.g:291:4: 'MOVIL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:295:2: ( ( 'ORDENADOR' ) )
                    {
                    // InternalGratext.g:295:2: ( ( 'ORDENADOR' ) )
                    // InternalGratext.g:296:3: ( 'ORDENADOR' )
                    {
                     before(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); 
                    // InternalGratext.g:297:3: ( 'ORDENADOR' )
                    // InternalGratext.g:297:4: 'ORDENADOR'
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
    // InternalGratext.g:305:1: rule__TiposDispositivo__Alternatives : ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) );
    public final void rule__TiposDispositivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:309:1: ( ( ( 'CAMARA' ) ) | ( ( 'TEMPERATURA' ) ) | ( ( 'FUEGO_HUMO' ) ) | ( ( 'CO2' ) ) | ( ( 'GAS' ) ) | ( ( 'PRESENCIA' ) ) | ( ( 'MAGNETICO' ) ) | ( ( 'ROTURA_CRISTAL' ) ) | ( ( 'BARRERA_SEGURIDAD' ) ) | ( ( 'LUMINOSIDAD' ) ) | ( ( 'EMERGENCIA' ) ) | ( ( 'INUNDACION' ) ) | ( ( 'VIENTO' ) ) | ( ( 'LLUVIA' ) ) | ( ( 'ESTACION_METEOROLOGICA' ) ) | ( ( 'SISTEMA_IDENTIFICACION' ) ) | ( ( 'INFRARROJOS' ) ) | ( ( 'RADIOFRECUENCIA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'PULSOMETRO_GANADO' ) ) | ( ( 'DEPOSITO_LECHE' ) ) | ( ( 'ROBOT_LIMPIADOR' ) ) | ( ( 'NEVERAS' ) ) )
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
                    // InternalGratext.g:310:2: ( ( 'CAMARA' ) )
                    {
                    // InternalGratext.g:310:2: ( ( 'CAMARA' ) )
                    // InternalGratext.g:311:3: ( 'CAMARA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:312:3: ( 'CAMARA' )
                    // InternalGratext.g:312:4: 'CAMARA'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:316:2: ( ( 'TEMPERATURA' ) )
                    {
                    // InternalGratext.g:316:2: ( ( 'TEMPERATURA' ) )
                    // InternalGratext.g:317:3: ( 'TEMPERATURA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:318:3: ( 'TEMPERATURA' )
                    // InternalGratext.g:318:4: 'TEMPERATURA'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:322:2: ( ( 'FUEGO_HUMO' ) )
                    {
                    // InternalGratext.g:322:2: ( ( 'FUEGO_HUMO' ) )
                    // InternalGratext.g:323:3: ( 'FUEGO_HUMO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:324:3: ( 'FUEGO_HUMO' )
                    // InternalGratext.g:324:4: 'FUEGO_HUMO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:328:2: ( ( 'CO2' ) )
                    {
                    // InternalGratext.g:328:2: ( ( 'CO2' ) )
                    // InternalGratext.g:329:3: ( 'CO2' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 
                    // InternalGratext.g:330:3: ( 'CO2' )
                    // InternalGratext.g:330:4: 'CO2'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:334:2: ( ( 'GAS' ) )
                    {
                    // InternalGratext.g:334:2: ( ( 'GAS' ) )
                    // InternalGratext.g:335:3: ( 'GAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:336:3: ( 'GAS' )
                    // InternalGratext.g:336:4: 'GAS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:340:2: ( ( 'PRESENCIA' ) )
                    {
                    // InternalGratext.g:340:2: ( ( 'PRESENCIA' ) )
                    // InternalGratext.g:341:3: ( 'PRESENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 
                    // InternalGratext.g:342:3: ( 'PRESENCIA' )
                    // InternalGratext.g:342:4: 'PRESENCIA'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:346:2: ( ( 'MAGNETICO' ) )
                    {
                    // InternalGratext.g:346:2: ( ( 'MAGNETICO' ) )
                    // InternalGratext.g:347:3: ( 'MAGNETICO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 
                    // InternalGratext.g:348:3: ( 'MAGNETICO' )
                    // InternalGratext.g:348:4: 'MAGNETICO'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:352:2: ( ( 'ROTURA_CRISTAL' ) )
                    {
                    // InternalGratext.g:352:2: ( ( 'ROTURA_CRISTAL' ) )
                    // InternalGratext.g:353:3: ( 'ROTURA_CRISTAL' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 
                    // InternalGratext.g:354:3: ( 'ROTURA_CRISTAL' )
                    // InternalGratext.g:354:4: 'ROTURA_CRISTAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:358:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    {
                    // InternalGratext.g:358:2: ( ( 'BARRERA_SEGURIDAD' ) )
                    // InternalGratext.g:359:3: ( 'BARRERA_SEGURIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 
                    // InternalGratext.g:360:3: ( 'BARRERA_SEGURIDAD' )
                    // InternalGratext.g:360:4: 'BARRERA_SEGURIDAD'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:364:2: ( ( 'LUMINOSIDAD' ) )
                    {
                    // InternalGratext.g:364:2: ( ( 'LUMINOSIDAD' ) )
                    // InternalGratext.g:365:3: ( 'LUMINOSIDAD' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 
                    // InternalGratext.g:366:3: ( 'LUMINOSIDAD' )
                    // InternalGratext.g:366:4: 'LUMINOSIDAD'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:370:2: ( ( 'EMERGENCIA' ) )
                    {
                    // InternalGratext.g:370:2: ( ( 'EMERGENCIA' ) )
                    // InternalGratext.g:371:3: ( 'EMERGENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 
                    // InternalGratext.g:372:3: ( 'EMERGENCIA' )
                    // InternalGratext.g:372:4: 'EMERGENCIA'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:376:2: ( ( 'INUNDACION' ) )
                    {
                    // InternalGratext.g:376:2: ( ( 'INUNDACION' ) )
                    // InternalGratext.g:377:3: ( 'INUNDACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 
                    // InternalGratext.g:378:3: ( 'INUNDACION' )
                    // InternalGratext.g:378:4: 'INUNDACION'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:382:2: ( ( 'VIENTO' ) )
                    {
                    // InternalGratext.g:382:2: ( ( 'VIENTO' ) )
                    // InternalGratext.g:383:3: ( 'VIENTO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 
                    // InternalGratext.g:384:3: ( 'VIENTO' )
                    // InternalGratext.g:384:4: 'VIENTO'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:388:2: ( ( 'LLUVIA' ) )
                    {
                    // InternalGratext.g:388:2: ( ( 'LLUVIA' ) )
                    // InternalGratext.g:389:3: ( 'LLUVIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 
                    // InternalGratext.g:390:3: ( 'LLUVIA' )
                    // InternalGratext.g:390:4: 'LLUVIA'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGratext.g:394:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    {
                    // InternalGratext.g:394:2: ( ( 'ESTACION_METEOROLOGICA' ) )
                    // InternalGratext.g:395:3: ( 'ESTACION_METEOROLOGICA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 
                    // InternalGratext.g:396:3: ( 'ESTACION_METEOROLOGICA' )
                    // InternalGratext.g:396:4: 'ESTACION_METEOROLOGICA'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGratext.g:400:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    {
                    // InternalGratext.g:400:2: ( ( 'SISTEMA_IDENTIFICACION' ) )
                    // InternalGratext.g:401:3: ( 'SISTEMA_IDENTIFICACION' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 
                    // InternalGratext.g:402:3: ( 'SISTEMA_IDENTIFICACION' )
                    // InternalGratext.g:402:4: 'SISTEMA_IDENTIFICACION'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGratext.g:406:2: ( ( 'INFRARROJOS' ) )
                    {
                    // InternalGratext.g:406:2: ( ( 'INFRARROJOS' ) )
                    // InternalGratext.g:407:3: ( 'INFRARROJOS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 
                    // InternalGratext.g:408:3: ( 'INFRARROJOS' )
                    // InternalGratext.g:408:4: 'INFRARROJOS'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGratext.g:412:2: ( ( 'RADIOFRECUENCIA' ) )
                    {
                    // InternalGratext.g:412:2: ( ( 'RADIOFRECUENCIA' ) )
                    // InternalGratext.g:413:3: ( 'RADIOFRECUENCIA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 
                    // InternalGratext.g:414:3: ( 'RADIOFRECUENCIA' )
                    // InternalGratext.g:414:4: 'RADIOFRECUENCIA'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGratext.g:418:2: ( ( 'MECEDORA' ) )
                    {
                    // InternalGratext.g:418:2: ( ( 'MECEDORA' ) )
                    // InternalGratext.g:419:3: ( 'MECEDORA' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 
                    // InternalGratext.g:420:3: ( 'MECEDORA' )
                    // InternalGratext.g:420:4: 'MECEDORA'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalGratext.g:424:2: ( ( 'PULSOMETRO_GANADO' ) )
                    {
                    // InternalGratext.g:424:2: ( ( 'PULSOMETRO_GANADO' ) )
                    // InternalGratext.g:425:3: ( 'PULSOMETRO_GANADO' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 
                    // InternalGratext.g:426:3: ( 'PULSOMETRO_GANADO' )
                    // InternalGratext.g:426:4: 'PULSOMETRO_GANADO'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalGratext.g:430:2: ( ( 'DEPOSITO_LECHE' ) )
                    {
                    // InternalGratext.g:430:2: ( ( 'DEPOSITO_LECHE' ) )
                    // InternalGratext.g:431:3: ( 'DEPOSITO_LECHE' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 
                    // InternalGratext.g:432:3: ( 'DEPOSITO_LECHE' )
                    // InternalGratext.g:432:4: 'DEPOSITO_LECHE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalGratext.g:436:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    {
                    // InternalGratext.g:436:2: ( ( 'ROBOT_LIMPIADOR' ) )
                    // InternalGratext.g:437:3: ( 'ROBOT_LIMPIADOR' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 
                    // InternalGratext.g:438:3: ( 'ROBOT_LIMPIADOR' )
                    // InternalGratext.g:438:4: 'ROBOT_LIMPIADOR'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalGratext.g:442:2: ( ( 'NEVERAS' ) )
                    {
                    // InternalGratext.g:442:2: ( ( 'NEVERAS' ) )
                    // InternalGratext.g:443:3: ( 'NEVERAS' )
                    {
                     before(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); 
                    // InternalGratext.g:444:3: ( 'NEVERAS' )
                    // InternalGratext.g:444:4: 'NEVERAS'
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
    // InternalGratext.g:452:1: rule__NombreAccion__Alternatives : ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) );
    public final void rule__NombreAccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:456:1: ( ( ( 'ABRIR' ) ) | ( ( 'ENVIAR' ) ) | ( ( 'SACAR' ) ) | ( ( 'CERRAR' ) ) | ( ( 'ESTADO' ) ) | ( ( 'GRABAR' ) ) | ( ( 'DETECTAR' ) ) | ( ( 'ENCENDER' ) ) | ( ( 'APAGAR' ) ) | ( ( 'AUMENTAR' ) ) | ( ( 'DISMINUIR' ) ) | ( ( 'COMPROBAR' ) ) | ( ( 'ACTIVAR' ) ) | ( ( 'DESACTIVAR' ) ) )
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
                    // InternalGratext.g:457:2: ( ( 'ABRIR' ) )
                    {
                    // InternalGratext.g:457:2: ( ( 'ABRIR' ) )
                    // InternalGratext.g:458:3: ( 'ABRIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 
                    // InternalGratext.g:459:3: ( 'ABRIR' )
                    // InternalGratext.g:459:4: 'ABRIR'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:463:2: ( ( 'ENVIAR' ) )
                    {
                    // InternalGratext.g:463:2: ( ( 'ENVIAR' ) )
                    // InternalGratext.g:464:3: ( 'ENVIAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 
                    // InternalGratext.g:465:3: ( 'ENVIAR' )
                    // InternalGratext.g:465:4: 'ENVIAR'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:469:2: ( ( 'SACAR' ) )
                    {
                    // InternalGratext.g:469:2: ( ( 'SACAR' ) )
                    // InternalGratext.g:470:3: ( 'SACAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 
                    // InternalGratext.g:471:3: ( 'SACAR' )
                    // InternalGratext.g:471:4: 'SACAR'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:475:2: ( ( 'CERRAR' ) )
                    {
                    // InternalGratext.g:475:2: ( ( 'CERRAR' ) )
                    // InternalGratext.g:476:3: ( 'CERRAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 
                    // InternalGratext.g:477:3: ( 'CERRAR' )
                    // InternalGratext.g:477:4: 'CERRAR'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:481:2: ( ( 'ESTADO' ) )
                    {
                    // InternalGratext.g:481:2: ( ( 'ESTADO' ) )
                    // InternalGratext.g:482:3: ( 'ESTADO' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:483:3: ( 'ESTADO' )
                    // InternalGratext.g:483:4: 'ESTADO'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:487:2: ( ( 'GRABAR' ) )
                    {
                    // InternalGratext.g:487:2: ( ( 'GRABAR' ) )
                    // InternalGratext.g:488:3: ( 'GRABAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 
                    // InternalGratext.g:489:3: ( 'GRABAR' )
                    // InternalGratext.g:489:4: 'GRABAR'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:493:2: ( ( 'DETECTAR' ) )
                    {
                    // InternalGratext.g:493:2: ( ( 'DETECTAR' ) )
                    // InternalGratext.g:494:3: ( 'DETECTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 
                    // InternalGratext.g:495:3: ( 'DETECTAR' )
                    // InternalGratext.g:495:4: 'DETECTAR'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:499:2: ( ( 'ENCENDER' ) )
                    {
                    // InternalGratext.g:499:2: ( ( 'ENCENDER' ) )
                    // InternalGratext.g:500:3: ( 'ENCENDER' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 
                    // InternalGratext.g:501:3: ( 'ENCENDER' )
                    // InternalGratext.g:501:4: 'ENCENDER'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:505:2: ( ( 'APAGAR' ) )
                    {
                    // InternalGratext.g:505:2: ( ( 'APAGAR' ) )
                    // InternalGratext.g:506:3: ( 'APAGAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 
                    // InternalGratext.g:507:3: ( 'APAGAR' )
                    // InternalGratext.g:507:4: 'APAGAR'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:511:2: ( ( 'AUMENTAR' ) )
                    {
                    // InternalGratext.g:511:2: ( ( 'AUMENTAR' ) )
                    // InternalGratext.g:512:3: ( 'AUMENTAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 
                    // InternalGratext.g:513:3: ( 'AUMENTAR' )
                    // InternalGratext.g:513:4: 'AUMENTAR'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:517:2: ( ( 'DISMINUIR' ) )
                    {
                    // InternalGratext.g:517:2: ( ( 'DISMINUIR' ) )
                    // InternalGratext.g:518:3: ( 'DISMINUIR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 
                    // InternalGratext.g:519:3: ( 'DISMINUIR' )
                    // InternalGratext.g:519:4: 'DISMINUIR'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:523:2: ( ( 'COMPROBAR' ) )
                    {
                    // InternalGratext.g:523:2: ( ( 'COMPROBAR' ) )
                    // InternalGratext.g:524:3: ( 'COMPROBAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 
                    // InternalGratext.g:525:3: ( 'COMPROBAR' )
                    // InternalGratext.g:525:4: 'COMPROBAR'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:529:2: ( ( 'ACTIVAR' ) )
                    {
                    // InternalGratext.g:529:2: ( ( 'ACTIVAR' ) )
                    // InternalGratext.g:530:3: ( 'ACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 
                    // InternalGratext.g:531:3: ( 'ACTIVAR' )
                    // InternalGratext.g:531:4: 'ACTIVAR'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:535:2: ( ( 'DESACTIVAR' ) )
                    {
                    // InternalGratext.g:535:2: ( ( 'DESACTIVAR' ) )
                    // InternalGratext.g:536:3: ( 'DESACTIVAR' )
                    {
                     before(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); 
                    // InternalGratext.g:537:3: ( 'DESACTIVAR' )
                    // InternalGratext.g:537:4: 'DESACTIVAR'
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


    // $ANTLR start "rule__Estado__Alternatives"
    // InternalGratext.g:545:1: rule__Estado__Alternatives : ( ( ( 'AMBIENTE' ) ) | ( ( 'INTERNA' ) ) | ( ( 'NEVERA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'DEPOSITO_LECHE' ) ) );
    public final void rule__Estado__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:549:1: ( ( ( 'AMBIENTE' ) ) | ( ( 'INTERNA' ) ) | ( ( 'NEVERA' ) ) | ( ( 'MECEDORA' ) ) | ( ( 'DEPOSITO_LECHE' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt4=1;
                }
                break;
            case 54:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGratext.g:550:2: ( ( 'AMBIENTE' ) )
                    {
                    // InternalGratext.g:550:2: ( ( 'AMBIENTE' ) )
                    // InternalGratext.g:551:3: ( 'AMBIENTE' )
                    {
                     before(grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0()); 
                    // InternalGratext.g:552:3: ( 'AMBIENTE' )
                    // InternalGratext.g:552:4: 'AMBIENTE'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:556:2: ( ( 'INTERNA' ) )
                    {
                    // InternalGratext.g:556:2: ( ( 'INTERNA' ) )
                    // InternalGratext.g:557:3: ( 'INTERNA' )
                    {
                     before(grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1()); 
                    // InternalGratext.g:558:3: ( 'INTERNA' )
                    // InternalGratext.g:558:4: 'INTERNA'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:562:2: ( ( 'NEVERA' ) )
                    {
                    // InternalGratext.g:562:2: ( ( 'NEVERA' ) )
                    // InternalGratext.g:563:3: ( 'NEVERA' )
                    {
                     before(grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2()); 
                    // InternalGratext.g:564:3: ( 'NEVERA' )
                    // InternalGratext.g:564:4: 'NEVERA'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:568:2: ( ( 'MECEDORA' ) )
                    {
                    // InternalGratext.g:568:2: ( ( 'MECEDORA' ) )
                    // InternalGratext.g:569:3: ( 'MECEDORA' )
                    {
                     before(grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3()); 
                    // InternalGratext.g:570:3: ( 'MECEDORA' )
                    // InternalGratext.g:570:4: 'MECEDORA'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:574:2: ( ( 'DEPOSITO_LECHE' ) )
                    {
                    // InternalGratext.g:574:2: ( ( 'DEPOSITO_LECHE' ) )
                    // InternalGratext.g:575:3: ( 'DEPOSITO_LECHE' )
                    {
                     before(grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4()); 
                    // InternalGratext.g:576:3: ( 'DEPOSITO_LECHE' )
                    // InternalGratext.g:576:4: 'DEPOSITO_LECHE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Estado__Alternatives"


    // $ANTLR start "rule__Granja__Group__0"
    // InternalGratext.g:584:1: rule__Granja__Group__0 : rule__Granja__Group__0__Impl rule__Granja__Group__1 ;
    public final void rule__Granja__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:588:1: ( rule__Granja__Group__0__Impl rule__Granja__Group__1 )
            // InternalGratext.g:589:2: rule__Granja__Group__0__Impl rule__Granja__Group__1
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
    // InternalGratext.g:596:1: rule__Granja__Group__0__Impl : ( 'GRANJA' ) ;
    public final void rule__Granja__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:600:1: ( ( 'GRANJA' ) )
            // InternalGratext.g:601:1: ( 'GRANJA' )
            {
            // InternalGratext.g:601:1: ( 'GRANJA' )
            // InternalGratext.g:602:2: 'GRANJA'
            {
             before(grammarAccess.getGranjaAccess().getGRANJAKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalGratext.g:611:1: rule__Granja__Group__1 : rule__Granja__Group__1__Impl rule__Granja__Group__2 ;
    public final void rule__Granja__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:615:1: ( rule__Granja__Group__1__Impl rule__Granja__Group__2 )
            // InternalGratext.g:616:2: rule__Granja__Group__1__Impl rule__Granja__Group__2
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
    // InternalGratext.g:623:1: rule__Granja__Group__1__Impl : ( ( rule__Granja__NameAssignment_1 ) ) ;
    public final void rule__Granja__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:627:1: ( ( ( rule__Granja__NameAssignment_1 ) ) )
            // InternalGratext.g:628:1: ( ( rule__Granja__NameAssignment_1 ) )
            {
            // InternalGratext.g:628:1: ( ( rule__Granja__NameAssignment_1 ) )
            // InternalGratext.g:629:2: ( rule__Granja__NameAssignment_1 )
            {
             before(grammarAccess.getGranjaAccess().getNameAssignment_1()); 
            // InternalGratext.g:630:2: ( rule__Granja__NameAssignment_1 )
            // InternalGratext.g:630:3: rule__Granja__NameAssignment_1
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
    // InternalGratext.g:638:1: rule__Granja__Group__2 : rule__Granja__Group__2__Impl rule__Granja__Group__3 ;
    public final void rule__Granja__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:642:1: ( rule__Granja__Group__2__Impl rule__Granja__Group__3 )
            // InternalGratext.g:643:2: rule__Granja__Group__2__Impl rule__Granja__Group__3
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
    // InternalGratext.g:650:1: rule__Granja__Group__2__Impl : ( 'CENTRALITA:' ) ;
    public final void rule__Granja__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:654:1: ( ( 'CENTRALITA:' ) )
            // InternalGratext.g:655:1: ( 'CENTRALITA:' )
            {
            // InternalGratext.g:655:1: ( 'CENTRALITA:' )
            // InternalGratext.g:656:2: 'CENTRALITA:'
            {
             before(grammarAccess.getGranjaAccess().getCENTRALITAKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalGratext.g:665:1: rule__Granja__Group__3 : rule__Granja__Group__3__Impl rule__Granja__Group__4 ;
    public final void rule__Granja__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:669:1: ( rule__Granja__Group__3__Impl rule__Granja__Group__4 )
            // InternalGratext.g:670:2: rule__Granja__Group__3__Impl rule__Granja__Group__4
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
    // InternalGratext.g:677:1: rule__Granja__Group__3__Impl : ( ( rule__Granja__TipoAssignment_3 ) ) ;
    public final void rule__Granja__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:681:1: ( ( ( rule__Granja__TipoAssignment_3 ) ) )
            // InternalGratext.g:682:1: ( ( rule__Granja__TipoAssignment_3 ) )
            {
            // InternalGratext.g:682:1: ( ( rule__Granja__TipoAssignment_3 ) )
            // InternalGratext.g:683:2: ( rule__Granja__TipoAssignment_3 )
            {
             before(grammarAccess.getGranjaAccess().getTipoAssignment_3()); 
            // InternalGratext.g:684:2: ( rule__Granja__TipoAssignment_3 )
            // InternalGratext.g:684:3: rule__Granja__TipoAssignment_3
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
    // InternalGratext.g:692:1: rule__Granja__Group__4 : rule__Granja__Group__4__Impl rule__Granja__Group__5 ;
    public final void rule__Granja__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:696:1: ( rule__Granja__Group__4__Impl rule__Granja__Group__5 )
            // InternalGratext.g:697:2: rule__Granja__Group__4__Impl rule__Granja__Group__5
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
    // InternalGratext.g:704:1: rule__Granja__Group__4__Impl : ( 'Usuario:' ) ;
    public final void rule__Granja__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:708:1: ( ( 'Usuario:' ) )
            // InternalGratext.g:709:1: ( 'Usuario:' )
            {
            // InternalGratext.g:709:1: ( 'Usuario:' )
            // InternalGratext.g:710:2: 'Usuario:'
            {
             before(grammarAccess.getGranjaAccess().getUsuarioKeyword_4()); 
            match(input,58,FOLLOW_2); 
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
    // InternalGratext.g:719:1: rule__Granja__Group__5 : rule__Granja__Group__5__Impl rule__Granja__Group__6 ;
    public final void rule__Granja__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:723:1: ( rule__Granja__Group__5__Impl rule__Granja__Group__6 )
            // InternalGratext.g:724:2: rule__Granja__Group__5__Impl rule__Granja__Group__6
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
    // InternalGratext.g:731:1: rule__Granja__Group__5__Impl : ( ( rule__Granja__UsuarioAssignment_5 ) ) ;
    public final void rule__Granja__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:735:1: ( ( ( rule__Granja__UsuarioAssignment_5 ) ) )
            // InternalGratext.g:736:1: ( ( rule__Granja__UsuarioAssignment_5 ) )
            {
            // InternalGratext.g:736:1: ( ( rule__Granja__UsuarioAssignment_5 ) )
            // InternalGratext.g:737:2: ( rule__Granja__UsuarioAssignment_5 )
            {
             before(grammarAccess.getGranjaAccess().getUsuarioAssignment_5()); 
            // InternalGratext.g:738:2: ( rule__Granja__UsuarioAssignment_5 )
            // InternalGratext.g:738:3: rule__Granja__UsuarioAssignment_5
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
    // InternalGratext.g:746:1: rule__Granja__Group__6 : rule__Granja__Group__6__Impl rule__Granja__Group__7 ;
    public final void rule__Granja__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:750:1: ( rule__Granja__Group__6__Impl rule__Granja__Group__7 )
            // InternalGratext.g:751:2: rule__Granja__Group__6__Impl rule__Granja__Group__7
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
    // InternalGratext.g:758:1: rule__Granja__Group__6__Impl : ( 'Contrase\\u00F1a:' ) ;
    public final void rule__Granja__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:762:1: ( ( 'Contrase\\u00F1a:' ) )
            // InternalGratext.g:763:1: ( 'Contrase\\u00F1a:' )
            {
            // InternalGratext.g:763:1: ( 'Contrase\\u00F1a:' )
            // InternalGratext.g:764:2: 'Contrase\\u00F1a:'
            {
             before(grammarAccess.getGranjaAccess().getContraseAKeyword_6()); 
            match(input,59,FOLLOW_2); 
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
    // InternalGratext.g:773:1: rule__Granja__Group__7 : rule__Granja__Group__7__Impl rule__Granja__Group__8 ;
    public final void rule__Granja__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:777:1: ( rule__Granja__Group__7__Impl rule__Granja__Group__8 )
            // InternalGratext.g:778:2: rule__Granja__Group__7__Impl rule__Granja__Group__8
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
    // InternalGratext.g:785:1: rule__Granja__Group__7__Impl : ( ( rule__Granja__ContrasenaAssignment_7 ) ) ;
    public final void rule__Granja__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:789:1: ( ( ( rule__Granja__ContrasenaAssignment_7 ) ) )
            // InternalGratext.g:790:1: ( ( rule__Granja__ContrasenaAssignment_7 ) )
            {
            // InternalGratext.g:790:1: ( ( rule__Granja__ContrasenaAssignment_7 ) )
            // InternalGratext.g:791:2: ( rule__Granja__ContrasenaAssignment_7 )
            {
             before(grammarAccess.getGranjaAccess().getContrasenaAssignment_7()); 
            // InternalGratext.g:792:2: ( rule__Granja__ContrasenaAssignment_7 )
            // InternalGratext.g:792:3: rule__Granja__ContrasenaAssignment_7
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
    // InternalGratext.g:800:1: rule__Granja__Group__8 : rule__Granja__Group__8__Impl rule__Granja__Group__9 ;
    public final void rule__Granja__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:804:1: ( rule__Granja__Group__8__Impl rule__Granja__Group__9 )
            // InternalGratext.g:805:2: rule__Granja__Group__8__Impl rule__Granja__Group__9
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
    // InternalGratext.g:812:1: rule__Granja__Group__8__Impl : ( 'Dispositivos{' ) ;
    public final void rule__Granja__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:816:1: ( ( 'Dispositivos{' ) )
            // InternalGratext.g:817:1: ( 'Dispositivos{' )
            {
            // InternalGratext.g:817:1: ( 'Dispositivos{' )
            // InternalGratext.g:818:2: 'Dispositivos{'
            {
             before(grammarAccess.getGranjaAccess().getDispositivosKeyword_8()); 
            match(input,60,FOLLOW_2); 
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
    // InternalGratext.g:827:1: rule__Granja__Group__9 : rule__Granja__Group__9__Impl rule__Granja__Group__10 ;
    public final void rule__Granja__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:831:1: ( rule__Granja__Group__9__Impl rule__Granja__Group__10 )
            // InternalGratext.g:832:2: rule__Granja__Group__9__Impl rule__Granja__Group__10
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
    // InternalGratext.g:839:1: rule__Granja__Group__9__Impl : ( ( rule__Granja__DispositivosAssignment_9 )* ) ;
    public final void rule__Granja__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:843:1: ( ( ( rule__Granja__DispositivosAssignment_9 )* ) )
            // InternalGratext.g:844:1: ( ( rule__Granja__DispositivosAssignment_9 )* )
            {
            // InternalGratext.g:844:1: ( ( rule__Granja__DispositivosAssignment_9 )* )
            // InternalGratext.g:845:2: ( rule__Granja__DispositivosAssignment_9 )*
            {
             before(grammarAccess.getGranjaAccess().getDispositivosAssignment_9()); 
            // InternalGratext.g:846:2: ( rule__Granja__DispositivosAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGratext.g:846:3: rule__Granja__DispositivosAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Granja__DispositivosAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalGratext.g:854:1: rule__Granja__Group__10 : rule__Granja__Group__10__Impl ;
    public final void rule__Granja__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:858:1: ( rule__Granja__Group__10__Impl )
            // InternalGratext.g:859:2: rule__Granja__Group__10__Impl
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
    // InternalGratext.g:865:1: rule__Granja__Group__10__Impl : ( '}' ) ;
    public final void rule__Granja__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:869:1: ( ( '}' ) )
            // InternalGratext.g:870:1: ( '}' )
            {
            // InternalGratext.g:870:1: ( '}' )
            // InternalGratext.g:871:2: '}'
            {
             before(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_10()); 
            match(input,61,FOLLOW_2); 
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
    // InternalGratext.g:881:1: rule__Dispositivos__Group__0 : rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 ;
    public final void rule__Dispositivos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:885:1: ( rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1 )
            // InternalGratext.g:886:2: rule__Dispositivos__Group__0__Impl rule__Dispositivos__Group__1
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
    // InternalGratext.g:893:1: rule__Dispositivos__Group__0__Impl : ( 'Codigo:' ) ;
    public final void rule__Dispositivos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:897:1: ( ( 'Codigo:' ) )
            // InternalGratext.g:898:1: ( 'Codigo:' )
            {
            // InternalGratext.g:898:1: ( 'Codigo:' )
            // InternalGratext.g:899:2: 'Codigo:'
            {
             before(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalGratext.g:908:1: rule__Dispositivos__Group__1 : rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 ;
    public final void rule__Dispositivos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:912:1: ( rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2 )
            // InternalGratext.g:913:2: rule__Dispositivos__Group__1__Impl rule__Dispositivos__Group__2
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
    // InternalGratext.g:920:1: rule__Dispositivos__Group__1__Impl : ( ( rule__Dispositivos__CodigoAssignment_1 ) ) ;
    public final void rule__Dispositivos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:924:1: ( ( ( rule__Dispositivos__CodigoAssignment_1 ) ) )
            // InternalGratext.g:925:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            {
            // InternalGratext.g:925:1: ( ( rule__Dispositivos__CodigoAssignment_1 ) )
            // InternalGratext.g:926:2: ( rule__Dispositivos__CodigoAssignment_1 )
            {
             before(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); 
            // InternalGratext.g:927:2: ( rule__Dispositivos__CodigoAssignment_1 )
            // InternalGratext.g:927:3: rule__Dispositivos__CodigoAssignment_1
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
    // InternalGratext.g:935:1: rule__Dispositivos__Group__2 : rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 ;
    public final void rule__Dispositivos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:939:1: ( rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3 )
            // InternalGratext.g:940:2: rule__Dispositivos__Group__2__Impl rule__Dispositivos__Group__3
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
    // InternalGratext.g:947:1: rule__Dispositivos__Group__2__Impl : ( 'Sensor' ) ;
    public final void rule__Dispositivos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:951:1: ( ( 'Sensor' ) )
            // InternalGratext.g:952:1: ( 'Sensor' )
            {
            // InternalGratext.g:952:1: ( 'Sensor' )
            // InternalGratext.g:953:2: 'Sensor'
            {
             before(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalGratext.g:962:1: rule__Dispositivos__Group__3 : rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 ;
    public final void rule__Dispositivos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:966:1: ( rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4 )
            // InternalGratext.g:967:2: rule__Dispositivos__Group__3__Impl rule__Dispositivos__Group__4
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
    // InternalGratext.g:974:1: rule__Dispositivos__Group__3__Impl : ( ( rule__Dispositivos__NombreAssignment_3 ) ) ;
    public final void rule__Dispositivos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:978:1: ( ( ( rule__Dispositivos__NombreAssignment_3 ) ) )
            // InternalGratext.g:979:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            {
            // InternalGratext.g:979:1: ( ( rule__Dispositivos__NombreAssignment_3 ) )
            // InternalGratext.g:980:2: ( rule__Dispositivos__NombreAssignment_3 )
            {
             before(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); 
            // InternalGratext.g:981:2: ( rule__Dispositivos__NombreAssignment_3 )
            // InternalGratext.g:981:3: rule__Dispositivos__NombreAssignment_3
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
    // InternalGratext.g:989:1: rule__Dispositivos__Group__4 : rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 ;
    public final void rule__Dispositivos__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:993:1: ( rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5 )
            // InternalGratext.g:994:2: rule__Dispositivos__Group__4__Impl rule__Dispositivos__Group__5
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
    // InternalGratext.g:1001:1: rule__Dispositivos__Group__4__Impl : ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) ;
    public final void rule__Dispositivos__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1005:1: ( ( ( rule__Dispositivos__TemperaturaAssignment_4 )? ) )
            // InternalGratext.g:1006:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            {
            // InternalGratext.g:1006:1: ( ( rule__Dispositivos__TemperaturaAssignment_4 )? )
            // InternalGratext.g:1007:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            {
             before(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); 
            // InternalGratext.g:1008:2: ( rule__Dispositivos__TemperaturaAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34||LA6_0==36||(LA6_0>=53 && LA6_0<=55)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGratext.g:1008:3: rule__Dispositivos__TemperaturaAssignment_4
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
    // InternalGratext.g:1016:1: rule__Dispositivos__Group__5 : rule__Dispositivos__Group__5__Impl ;
    public final void rule__Dispositivos__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1020:1: ( rule__Dispositivos__Group__5__Impl )
            // InternalGratext.g:1021:2: rule__Dispositivos__Group__5__Impl
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
    // InternalGratext.g:1027:1: rule__Dispositivos__Group__5__Impl : ( ( rule__Dispositivos__AccionAssignment_5 ) ) ;
    public final void rule__Dispositivos__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1031:1: ( ( ( rule__Dispositivos__AccionAssignment_5 ) ) )
            // InternalGratext.g:1032:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            {
            // InternalGratext.g:1032:1: ( ( rule__Dispositivos__AccionAssignment_5 ) )
            // InternalGratext.g:1033:2: ( rule__Dispositivos__AccionAssignment_5 )
            {
             before(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); 
            // InternalGratext.g:1034:2: ( rule__Dispositivos__AccionAssignment_5 )
            // InternalGratext.g:1034:3: rule__Dispositivos__AccionAssignment_5
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
    // InternalGratext.g:1043:1: rule__Accion__Group__0 : rule__Accion__Group__0__Impl rule__Accion__Group__1 ;
    public final void rule__Accion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1047:1: ( rule__Accion__Group__0__Impl rule__Accion__Group__1 )
            // InternalGratext.g:1048:2: rule__Accion__Group__0__Impl rule__Accion__Group__1
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
    // InternalGratext.g:1055:1: rule__Accion__Group__0__Impl : ( 'quiero' ) ;
    public final void rule__Accion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1059:1: ( ( 'quiero' ) )
            // InternalGratext.g:1060:1: ( 'quiero' )
            {
            // InternalGratext.g:1060:1: ( 'quiero' )
            // InternalGratext.g:1061:2: 'quiero'
            {
             before(grammarAccess.getAccionAccess().getQuieroKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalGratext.g:1070:1: rule__Accion__Group__1 : rule__Accion__Group__1__Impl rule__Accion__Group__2 ;
    public final void rule__Accion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1074:1: ( rule__Accion__Group__1__Impl rule__Accion__Group__2 )
            // InternalGratext.g:1075:2: rule__Accion__Group__1__Impl rule__Accion__Group__2
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
    // InternalGratext.g:1082:1: rule__Accion__Group__1__Impl : ( ( rule__Accion__NombreAccionAssignment_1 ) ) ;
    public final void rule__Accion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1086:1: ( ( ( rule__Accion__NombreAccionAssignment_1 ) ) )
            // InternalGratext.g:1087:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            {
            // InternalGratext.g:1087:1: ( ( rule__Accion__NombreAccionAssignment_1 ) )
            // InternalGratext.g:1088:2: ( rule__Accion__NombreAccionAssignment_1 )
            {
             before(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); 
            // InternalGratext.g:1089:2: ( rule__Accion__NombreAccionAssignment_1 )
            // InternalGratext.g:1089:3: rule__Accion__NombreAccionAssignment_1
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
    // InternalGratext.g:1097:1: rule__Accion__Group__2 : rule__Accion__Group__2__Impl rule__Accion__Group__3 ;
    public final void rule__Accion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1101:1: ( rule__Accion__Group__2__Impl rule__Accion__Group__3 )
            // InternalGratext.g:1102:2: rule__Accion__Group__2__Impl rule__Accion__Group__3
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
    // InternalGratext.g:1109:1: rule__Accion__Group__2__Impl : ( ( rule__Accion__NumeroAssignment_2 )? ) ;
    public final void rule__Accion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1113:1: ( ( ( rule__Accion__NumeroAssignment_2 )? ) )
            // InternalGratext.g:1114:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            {
            // InternalGratext.g:1114:1: ( ( rule__Accion__NumeroAssignment_2 )? )
            // InternalGratext.g:1115:2: ( rule__Accion__NumeroAssignment_2 )?
            {
             before(grammarAccess.getAccionAccess().getNumeroAssignment_2()); 
            // InternalGratext.g:1116:2: ( rule__Accion__NumeroAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGratext.g:1116:3: rule__Accion__NumeroAssignment_2
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
    // InternalGratext.g:1124:1: rule__Accion__Group__3 : rule__Accion__Group__3__Impl ;
    public final void rule__Accion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1128:1: ( rule__Accion__Group__3__Impl )
            // InternalGratext.g:1129:2: rule__Accion__Group__3__Impl
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
    // InternalGratext.g:1135:1: rule__Accion__Group__3__Impl : ( ( rule__Accion__DescripcionAssignment_3 )? ) ;
    public final void rule__Accion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1139:1: ( ( ( rule__Accion__DescripcionAssignment_3 )? ) )
            // InternalGratext.g:1140:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            {
            // InternalGratext.g:1140:1: ( ( rule__Accion__DescripcionAssignment_3 )? )
            // InternalGratext.g:1141:2: ( rule__Accion__DescripcionAssignment_3 )?
            {
             before(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); 
            // InternalGratext.g:1142:2: ( rule__Accion__DescripcionAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGratext.g:1142:3: rule__Accion__DescripcionAssignment_3
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
    // InternalGratext.g:1151:1: rule__Numero__Group__0 : rule__Numero__Group__0__Impl rule__Numero__Group__1 ;
    public final void rule__Numero__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1155:1: ( rule__Numero__Group__0__Impl rule__Numero__Group__1 )
            // InternalGratext.g:1156:2: rule__Numero__Group__0__Impl rule__Numero__Group__1
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
    // InternalGratext.g:1163:1: rule__Numero__Group__0__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Numero__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1167:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGratext.g:1168:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGratext.g:1168:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGratext.g:1169:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGratext.g:1169:2: ( ( RULE_INT ) )
            // InternalGratext.g:1170:3: ( RULE_INT )
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1171:3: ( RULE_INT )
            // InternalGratext.g:1171:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_18); 

            }

             after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 

            }

            // InternalGratext.g:1174:2: ( ( RULE_INT )* )
            // InternalGratext.g:1175:3: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); 
            // InternalGratext.g:1176:3: ( RULE_INT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGratext.g:1176:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_18); 

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
    // InternalGratext.g:1185:1: rule__Numero__Group__1 : rule__Numero__Group__1__Impl rule__Numero__Group__2 ;
    public final void rule__Numero__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1189:1: ( rule__Numero__Group__1__Impl rule__Numero__Group__2 )
            // InternalGratext.g:1190:2: rule__Numero__Group__1__Impl rule__Numero__Group__2
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
    // InternalGratext.g:1197:1: rule__Numero__Group__1__Impl : ( ( '.' )? ) ;
    public final void rule__Numero__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1201:1: ( ( ( '.' )? ) )
            // InternalGratext.g:1202:1: ( ( '.' )? )
            {
            // InternalGratext.g:1202:1: ( ( '.' )? )
            // InternalGratext.g:1203:2: ( '.' )?
            {
             before(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); 
            // InternalGratext.g:1204:2: ( '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==65) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGratext.g:1204:3: '.'
                    {
                    match(input,65,FOLLOW_2); 

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
    // InternalGratext.g:1212:1: rule__Numero__Group__2 : rule__Numero__Group__2__Impl ;
    public final void rule__Numero__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1216:1: ( rule__Numero__Group__2__Impl )
            // InternalGratext.g:1217:2: rule__Numero__Group__2__Impl
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
    // InternalGratext.g:1223:1: rule__Numero__Group__2__Impl : ( ( RULE_INT )* ) ;
    public final void rule__Numero__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1227:1: ( ( ( RULE_INT )* ) )
            // InternalGratext.g:1228:1: ( ( RULE_INT )* )
            {
            // InternalGratext.g:1228:1: ( ( RULE_INT )* )
            // InternalGratext.g:1229:2: ( RULE_INT )*
            {
             before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); 
            // InternalGratext.g:1230:2: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGratext.g:1230:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_18); 

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


    // $ANTLR start "rule__Granja__NameAssignment_1"
    // InternalGratext.g:1239:1: rule__Granja__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Granja__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1243:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1244:2: ( RULE_STRING )
            {
            // InternalGratext.g:1244:2: ( RULE_STRING )
            // InternalGratext.g:1245:3: RULE_STRING
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
    // InternalGratext.g:1254:1: rule__Granja__TipoAssignment_3 : ( ruleTipo ) ;
    public final void rule__Granja__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1258:1: ( ( ruleTipo ) )
            // InternalGratext.g:1259:2: ( ruleTipo )
            {
            // InternalGratext.g:1259:2: ( ruleTipo )
            // InternalGratext.g:1260:3: ruleTipo
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
    // InternalGratext.g:1269:1: rule__Granja__UsuarioAssignment_5 : ( ruleusuario ) ;
    public final void rule__Granja__UsuarioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1273:1: ( ( ruleusuario ) )
            // InternalGratext.g:1274:2: ( ruleusuario )
            {
            // InternalGratext.g:1274:2: ( ruleusuario )
            // InternalGratext.g:1275:3: ruleusuario
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
    // InternalGratext.g:1284:1: rule__Granja__ContrasenaAssignment_7 : ( rulecontrasena ) ;
    public final void rule__Granja__ContrasenaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1288:1: ( ( rulecontrasena ) )
            // InternalGratext.g:1289:2: ( rulecontrasena )
            {
            // InternalGratext.g:1289:2: ( rulecontrasena )
            // InternalGratext.g:1290:3: rulecontrasena
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
    // InternalGratext.g:1299:1: rule__Granja__DispositivosAssignment_9 : ( ruleDispositivos ) ;
    public final void rule__Granja__DispositivosAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1303:1: ( ( ruleDispositivos ) )
            // InternalGratext.g:1304:2: ( ruleDispositivos )
            {
            // InternalGratext.g:1304:2: ( ruleDispositivos )
            // InternalGratext.g:1305:3: ruleDispositivos
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
    // InternalGratext.g:1314:1: rule__Dispositivos__CodigoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dispositivos__CodigoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1318:1: ( ( RULE_ID ) )
            // InternalGratext.g:1319:2: ( RULE_ID )
            {
            // InternalGratext.g:1319:2: ( RULE_ID )
            // InternalGratext.g:1320:3: RULE_ID
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
    // InternalGratext.g:1329:1: rule__Dispositivos__NombreAssignment_3 : ( ruleTiposDispositivo ) ;
    public final void rule__Dispositivos__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1333:1: ( ( ruleTiposDispositivo ) )
            // InternalGratext.g:1334:2: ( ruleTiposDispositivo )
            {
            // InternalGratext.g:1334:2: ( ruleTiposDispositivo )
            // InternalGratext.g:1335:3: ruleTiposDispositivo
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
    // InternalGratext.g:1344:1: rule__Dispositivos__TemperaturaAssignment_4 : ( ruleEstado ) ;
    public final void rule__Dispositivos__TemperaturaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1348:1: ( ( ruleEstado ) )
            // InternalGratext.g:1349:2: ( ruleEstado )
            {
            // InternalGratext.g:1349:2: ( ruleEstado )
            // InternalGratext.g:1350:3: ruleEstado
            {
             before(grammarAccess.getDispositivosAccess().getTemperaturaEstadoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getDispositivosAccess().getTemperaturaEstadoEnumRuleCall_4_0()); 

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
    // InternalGratext.g:1359:1: rule__Dispositivos__AccionAssignment_5 : ( ruleaccion ) ;
    public final void rule__Dispositivos__AccionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1363:1: ( ( ruleaccion ) )
            // InternalGratext.g:1364:2: ( ruleaccion )
            {
            // InternalGratext.g:1364:2: ( ruleaccion )
            // InternalGratext.g:1365:3: ruleaccion
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
    // InternalGratext.g:1374:1: rule__Accion__NombreAccionAssignment_1 : ( ruleNombreAccion ) ;
    public final void rule__Accion__NombreAccionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1378:1: ( ( ruleNombreAccion ) )
            // InternalGratext.g:1379:2: ( ruleNombreAccion )
            {
            // InternalGratext.g:1379:2: ( ruleNombreAccion )
            // InternalGratext.g:1380:3: ruleNombreAccion
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
    // InternalGratext.g:1389:1: rule__Accion__NumeroAssignment_2 : ( rulenumero ) ;
    public final void rule__Accion__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1393:1: ( ( rulenumero ) )
            // InternalGratext.g:1394:2: ( rulenumero )
            {
            // InternalGratext.g:1394:2: ( rulenumero )
            // InternalGratext.g:1395:3: rulenumero
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
    // InternalGratext.g:1404:1: rule__Accion__DescripcionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Accion__DescripcionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1408:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1409:2: ( RULE_STRING )
            {
            // InternalGratext.g:1409:2: ( RULE_STRING )
            // InternalGratext.g:1410:3: RULE_STRING
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
    // InternalGratext.g:1419:1: rule__Usuario__UsuarioAssignment : ( RULE_ID ) ;
    public final void rule__Usuario__UsuarioAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1423:1: ( ( RULE_ID ) )
            // InternalGratext.g:1424:2: ( RULE_ID )
            {
            // InternalGratext.g:1424:2: ( RULE_ID )
            // InternalGratext.g:1425:3: RULE_ID
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
    // InternalGratext.g:1434:1: rule__Contrasena__ContrasenaAssignment : ( RULE_STRING ) ;
    public final void rule__Contrasena__ContrasenaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGratext.g:1438:1: ( ( RULE_STRING ) )
            // InternalGratext.g:1439:2: ( RULE_STRING )
            {
            // InternalGratext.g:1439:2: ( RULE_STRING )
            // InternalGratext.g:1440:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007FFFFF0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00E0001400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001FFF8000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});

}