package org.xtext.dsl.gratext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.gratext.services.GratextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGratextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GRANJA'", "'CENTRALITA:'", "'Usuario:'", "'Contrase\\u00F1a:'", "'Dispositivos{'", "'}'", "'Codigo:'", "'Sensor'", "'quiero'", "'.'", "'DELAVAL'", "'SIEMENS'", "'TABLET'", "'MOVIL'", "'ORDENADOR'", "'CAMARA'", "'TEMPERATURA'", "'FUEGO_HUMO'", "'CO2'", "'GAS'", "'PRESENCIA'", "'MAGNETICO'", "'ROTURA_CRISTAL'", "'BARRERA_SEGURIDAD'", "'LUMINOSIDAD'", "'EMERGENCIA'", "'INUNDACION'", "'VIENTO'", "'LLUVIA'", "'ESTACION_METEOROLOGICA'", "'SISTEMA_IDENTIFICACION'", "'INFRARROJOS'", "'RADIOFRECUENCIA'", "'MECEDORA'", "'PULSOMETRO_GANADO'", "'DEPOSITO_LECHE'", "'ROBOT_LIMPIADOR'", "'NEVERAS'", "'ABRIR'", "'ENVIAR'", "'SACAR'", "'CERRAR'", "'ESTADO'", "'GRABAR'", "'DETECTAR'", "'ENCENDER'", "'APAGAR'", "'AUMENTAR'", "'DISMINUIR'", "'COMPROBAR'", "'ACTIVAR'", "'DESACTIVAR'", "'AMBIENTE'", "'INTERNA'", "'NEVERA'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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

        public InternalGratextParser(TokenStream input, GratextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Granja";
       	}

       	@Override
       	protected GratextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGranja"
    // InternalGratext.g:65:1: entryRuleGranja returns [EObject current=null] : iv_ruleGranja= ruleGranja EOF ;
    public final EObject entryRuleGranja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGranja = null;


        try {
            // InternalGratext.g:65:47: (iv_ruleGranja= ruleGranja EOF )
            // InternalGratext.g:66:2: iv_ruleGranja= ruleGranja EOF
            {
             newCompositeNode(grammarAccess.getGranjaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGranja=ruleGranja();

            state._fsp--;

             current =iv_ruleGranja; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGranja"


    // $ANTLR start "ruleGranja"
    // InternalGratext.g:72:1: ruleGranja returns [EObject current=null] : (otherlv_0= 'GRANJA' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'CENTRALITA:' ( (lv_tipo_3_0= ruleTipo ) ) otherlv_4= 'Usuario:' ( (lv_usuario_5_0= ruleusuario ) ) otherlv_6= 'Contrase\\u00F1a:' ( (lv_contrasena_7_0= rulecontrasena ) ) otherlv_8= 'Dispositivos{' ( (lv_dispositivos_9_0= ruleDispositivos ) )* otherlv_10= '}' ) ;
    public final EObject ruleGranja() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_tipo_3_0 = null;

        EObject lv_usuario_5_0 = null;

        EObject lv_contrasena_7_0 = null;

        EObject lv_dispositivos_9_0 = null;



        	enterRule();

        try {
            // InternalGratext.g:78:2: ( (otherlv_0= 'GRANJA' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'CENTRALITA:' ( (lv_tipo_3_0= ruleTipo ) ) otherlv_4= 'Usuario:' ( (lv_usuario_5_0= ruleusuario ) ) otherlv_6= 'Contrase\\u00F1a:' ( (lv_contrasena_7_0= rulecontrasena ) ) otherlv_8= 'Dispositivos{' ( (lv_dispositivos_9_0= ruleDispositivos ) )* otherlv_10= '}' ) )
            // InternalGratext.g:79:2: (otherlv_0= 'GRANJA' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'CENTRALITA:' ( (lv_tipo_3_0= ruleTipo ) ) otherlv_4= 'Usuario:' ( (lv_usuario_5_0= ruleusuario ) ) otherlv_6= 'Contrase\\u00F1a:' ( (lv_contrasena_7_0= rulecontrasena ) ) otherlv_8= 'Dispositivos{' ( (lv_dispositivos_9_0= ruleDispositivos ) )* otherlv_10= '}' )
            {
            // InternalGratext.g:79:2: (otherlv_0= 'GRANJA' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'CENTRALITA:' ( (lv_tipo_3_0= ruleTipo ) ) otherlv_4= 'Usuario:' ( (lv_usuario_5_0= ruleusuario ) ) otherlv_6= 'Contrase\\u00F1a:' ( (lv_contrasena_7_0= rulecontrasena ) ) otherlv_8= 'Dispositivos{' ( (lv_dispositivos_9_0= ruleDispositivos ) )* otherlv_10= '}' )
            // InternalGratext.g:80:3: otherlv_0= 'GRANJA' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'CENTRALITA:' ( (lv_tipo_3_0= ruleTipo ) ) otherlv_4= 'Usuario:' ( (lv_usuario_5_0= ruleusuario ) ) otherlv_6= 'Contrase\\u00F1a:' ( (lv_contrasena_7_0= rulecontrasena ) ) otherlv_8= 'Dispositivos{' ( (lv_dispositivos_9_0= ruleDispositivos ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGranjaAccess().getGRANJAKeyword_0());
            		
            // InternalGratext.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGratext.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGratext.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalGratext.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGranjaAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGranjaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGranjaAccess().getCENTRALITAKeyword_2());
            		
            // InternalGratext.g:106:3: ( (lv_tipo_3_0= ruleTipo ) )
            // InternalGratext.g:107:4: (lv_tipo_3_0= ruleTipo )
            {
            // InternalGratext.g:107:4: (lv_tipo_3_0= ruleTipo )
            // InternalGratext.g:108:5: lv_tipo_3_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipo_3_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGranjaRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_3_0,
            						"org.xtext.dsl.gratext.Gratext.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGranjaAccess().getUsuarioKeyword_4());
            		
            // InternalGratext.g:129:3: ( (lv_usuario_5_0= ruleusuario ) )
            // InternalGratext.g:130:4: (lv_usuario_5_0= ruleusuario )
            {
            // InternalGratext.g:130:4: (lv_usuario_5_0= ruleusuario )
            // InternalGratext.g:131:5: lv_usuario_5_0= ruleusuario
            {

            					newCompositeNode(grammarAccess.getGranjaAccess().getUsuarioUsuarioParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_usuario_5_0=ruleusuario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGranjaRule());
            					}
            					set(
            						current,
            						"usuario",
            						lv_usuario_5_0,
            						"org.xtext.dsl.gratext.Gratext.usuario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGranjaAccess().getContraseAKeyword_6());
            		
            // InternalGratext.g:152:3: ( (lv_contrasena_7_0= rulecontrasena ) )
            // InternalGratext.g:153:4: (lv_contrasena_7_0= rulecontrasena )
            {
            // InternalGratext.g:153:4: (lv_contrasena_7_0= rulecontrasena )
            // InternalGratext.g:154:5: lv_contrasena_7_0= rulecontrasena
            {

            					newCompositeNode(grammarAccess.getGranjaAccess().getContrasenaContrasenaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_contrasena_7_0=rulecontrasena();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGranjaRule());
            					}
            					set(
            						current,
            						"contrasena",
            						lv_contrasena_7_0,
            						"org.xtext.dsl.gratext.Gratext.contrasena");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getGranjaAccess().getDispositivosKeyword_8());
            		
            // InternalGratext.g:175:3: ( (lv_dispositivos_9_0= ruleDispositivos ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGratext.g:176:4: (lv_dispositivos_9_0= ruleDispositivos )
            	    {
            	    // InternalGratext.g:176:4: (lv_dispositivos_9_0= ruleDispositivos )
            	    // InternalGratext.g:177:5: lv_dispositivos_9_0= ruleDispositivos
            	    {

            	    					newCompositeNode(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_dispositivos_9_0=ruleDispositivos();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGranjaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dispositivos",
            	    						lv_dispositivos_9_0,
            	    						"org.xtext.dsl.gratext.Gratext.Dispositivos");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGranja"


    // $ANTLR start "entryRuleDispositivos"
    // InternalGratext.g:202:1: entryRuleDispositivos returns [EObject current=null] : iv_ruleDispositivos= ruleDispositivos EOF ;
    public final EObject entryRuleDispositivos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispositivos = null;


        try {
            // InternalGratext.g:202:53: (iv_ruleDispositivos= ruleDispositivos EOF )
            // InternalGratext.g:203:2: iv_ruleDispositivos= ruleDispositivos EOF
            {
             newCompositeNode(grammarAccess.getDispositivosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDispositivos=ruleDispositivos();

            state._fsp--;

             current =iv_ruleDispositivos; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDispositivos"


    // $ANTLR start "ruleDispositivos"
    // InternalGratext.g:209:1: ruleDispositivos returns [EObject current=null] : (otherlv_0= 'Codigo:' ( (lv_codigo_1_0= RULE_ID ) ) otherlv_2= 'Sensor' ( (lv_nombre_3_0= ruleTiposDispositivo ) ) ( (lv_temperatura_4_0= ruleEstado ) )? ( (lv_accion_5_0= ruleaccion ) ) ) ;
    public final EObject ruleDispositivos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_codigo_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_nombre_3_0 = null;

        Enumerator lv_temperatura_4_0 = null;

        EObject lv_accion_5_0 = null;



        	enterRule();

        try {
            // InternalGratext.g:215:2: ( (otherlv_0= 'Codigo:' ( (lv_codigo_1_0= RULE_ID ) ) otherlv_2= 'Sensor' ( (lv_nombre_3_0= ruleTiposDispositivo ) ) ( (lv_temperatura_4_0= ruleEstado ) )? ( (lv_accion_5_0= ruleaccion ) ) ) )
            // InternalGratext.g:216:2: (otherlv_0= 'Codigo:' ( (lv_codigo_1_0= RULE_ID ) ) otherlv_2= 'Sensor' ( (lv_nombre_3_0= ruleTiposDispositivo ) ) ( (lv_temperatura_4_0= ruleEstado ) )? ( (lv_accion_5_0= ruleaccion ) ) )
            {
            // InternalGratext.g:216:2: (otherlv_0= 'Codigo:' ( (lv_codigo_1_0= RULE_ID ) ) otherlv_2= 'Sensor' ( (lv_nombre_3_0= ruleTiposDispositivo ) ) ( (lv_temperatura_4_0= ruleEstado ) )? ( (lv_accion_5_0= ruleaccion ) ) )
            // InternalGratext.g:217:3: otherlv_0= 'Codigo:' ( (lv_codigo_1_0= RULE_ID ) ) otherlv_2= 'Sensor' ( (lv_nombre_3_0= ruleTiposDispositivo ) ) ( (lv_temperatura_4_0= ruleEstado ) )? ( (lv_accion_5_0= ruleaccion ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDispositivosAccess().getCodigoKeyword_0());
            		
            // InternalGratext.g:221:3: ( (lv_codigo_1_0= RULE_ID ) )
            // InternalGratext.g:222:4: (lv_codigo_1_0= RULE_ID )
            {
            // InternalGratext.g:222:4: (lv_codigo_1_0= RULE_ID )
            // InternalGratext.g:223:5: lv_codigo_1_0= RULE_ID
            {
            lv_codigo_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_codigo_1_0, grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDispositivosRule());
            					}
            					setWithLastConsumed(
            						current,
            						"codigo",
            						lv_codigo_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDispositivosAccess().getSensorKeyword_2());
            		
            // InternalGratext.g:243:3: ( (lv_nombre_3_0= ruleTiposDispositivo ) )
            // InternalGratext.g:244:4: (lv_nombre_3_0= ruleTiposDispositivo )
            {
            // InternalGratext.g:244:4: (lv_nombre_3_0= ruleTiposDispositivo )
            // InternalGratext.g:245:5: lv_nombre_3_0= ruleTiposDispositivo
            {

            					newCompositeNode(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_nombre_3_0=ruleTiposDispositivo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDispositivosRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_3_0,
            						"org.xtext.dsl.gratext.Gratext.TiposDispositivo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGratext.g:262:3: ( (lv_temperatura_4_0= ruleEstado ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44||LA2_0==46||(LA2_0>=63 && LA2_0<=65)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGratext.g:263:4: (lv_temperatura_4_0= ruleEstado )
                    {
                    // InternalGratext.g:263:4: (lv_temperatura_4_0= ruleEstado )
                    // InternalGratext.g:264:5: lv_temperatura_4_0= ruleEstado
                    {

                    					newCompositeNode(grammarAccess.getDispositivosAccess().getTemperaturaEstadoEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_temperatura_4_0=ruleEstado();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDispositivosRule());
                    					}
                    					set(
                    						current,
                    						"temperatura",
                    						lv_temperatura_4_0,
                    						"org.xtext.dsl.gratext.Gratext.Estado");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGratext.g:281:3: ( (lv_accion_5_0= ruleaccion ) )
            // InternalGratext.g:282:4: (lv_accion_5_0= ruleaccion )
            {
            // InternalGratext.g:282:4: (lv_accion_5_0= ruleaccion )
            // InternalGratext.g:283:5: lv_accion_5_0= ruleaccion
            {

            					newCompositeNode(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_accion_5_0=ruleaccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDispositivosRule());
            					}
            					set(
            						current,
            						"accion",
            						lv_accion_5_0,
            						"org.xtext.dsl.gratext.Gratext.accion");
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
    // $ANTLR end "ruleDispositivos"


    // $ANTLR start "entryRuleaccion"
    // InternalGratext.g:304:1: entryRuleaccion returns [EObject current=null] : iv_ruleaccion= ruleaccion EOF ;
    public final EObject entryRuleaccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaccion = null;


        try {
            // InternalGratext.g:304:47: (iv_ruleaccion= ruleaccion EOF )
            // InternalGratext.g:305:2: iv_ruleaccion= ruleaccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaccion=ruleaccion();

            state._fsp--;

             current =iv_ruleaccion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleaccion"


    // $ANTLR start "ruleaccion"
    // InternalGratext.g:311:1: ruleaccion returns [EObject current=null] : (otherlv_0= 'quiero' ( (lv_nombreAccion_1_0= ruleNombreAccion ) ) ( (lv_numero_2_0= rulenumero ) )? ( (lv_descripcion_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleaccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_descripcion_3_0=null;
        Enumerator lv_nombreAccion_1_0 = null;

        AntlrDatatypeRuleToken lv_numero_2_0 = null;



        	enterRule();

        try {
            // InternalGratext.g:317:2: ( (otherlv_0= 'quiero' ( (lv_nombreAccion_1_0= ruleNombreAccion ) ) ( (lv_numero_2_0= rulenumero ) )? ( (lv_descripcion_3_0= RULE_STRING ) )? ) )
            // InternalGratext.g:318:2: (otherlv_0= 'quiero' ( (lv_nombreAccion_1_0= ruleNombreAccion ) ) ( (lv_numero_2_0= rulenumero ) )? ( (lv_descripcion_3_0= RULE_STRING ) )? )
            {
            // InternalGratext.g:318:2: (otherlv_0= 'quiero' ( (lv_nombreAccion_1_0= ruleNombreAccion ) ) ( (lv_numero_2_0= rulenumero ) )? ( (lv_descripcion_3_0= RULE_STRING ) )? )
            // InternalGratext.g:319:3: otherlv_0= 'quiero' ( (lv_nombreAccion_1_0= ruleNombreAccion ) ) ( (lv_numero_2_0= rulenumero ) )? ( (lv_descripcion_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAccionAccess().getQuieroKeyword_0());
            		
            // InternalGratext.g:323:3: ( (lv_nombreAccion_1_0= ruleNombreAccion ) )
            // InternalGratext.g:324:4: (lv_nombreAccion_1_0= ruleNombreAccion )
            {
            // InternalGratext.g:324:4: (lv_nombreAccion_1_0= ruleNombreAccion )
            // InternalGratext.g:325:5: lv_nombreAccion_1_0= ruleNombreAccion
            {

            					newCompositeNode(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_nombreAccion_1_0=ruleNombreAccion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccionRule());
            					}
            					set(
            						current,
            						"nombreAccion",
            						lv_nombreAccion_1_0,
            						"org.xtext.dsl.gratext.Gratext.NombreAccion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGratext.g:342:3: ( (lv_numero_2_0= rulenumero ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGratext.g:343:4: (lv_numero_2_0= rulenumero )
                    {
                    // InternalGratext.g:343:4: (lv_numero_2_0= rulenumero )
                    // InternalGratext.g:344:5: lv_numero_2_0= rulenumero
                    {

                    					newCompositeNode(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_numero_2_0=rulenumero();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAccionRule());
                    					}
                    					set(
                    						current,
                    						"numero",
                    						lv_numero_2_0,
                    						"org.xtext.dsl.gratext.Gratext.numero");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGratext.g:361:3: ( (lv_descripcion_3_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGratext.g:362:4: (lv_descripcion_3_0= RULE_STRING )
                    {
                    // InternalGratext.g:362:4: (lv_descripcion_3_0= RULE_STRING )
                    // InternalGratext.g:363:5: lv_descripcion_3_0= RULE_STRING
                    {
                    lv_descripcion_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_descripcion_3_0, grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAccionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"descripcion",
                    						lv_descripcion_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleaccion"


    // $ANTLR start "entryRulenumero"
    // InternalGratext.g:383:1: entryRulenumero returns [String current=null] : iv_rulenumero= rulenumero EOF ;
    public final String entryRulenumero() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumero = null;


        try {
            // InternalGratext.g:383:46: (iv_rulenumero= rulenumero EOF )
            // InternalGratext.g:384:2: iv_rulenumero= rulenumero EOF
            {
             newCompositeNode(grammarAccess.getNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumero=rulenumero();

            state._fsp--;

             current =iv_rulenumero.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulenumero"


    // $ANTLR start "rulenumero"
    // InternalGratext.g:390:1: rulenumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ (kw= '.' )? (this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken rulenumero() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGratext.g:396:2: ( ( (this_INT_0= RULE_INT )+ (kw= '.' )? (this_INT_2= RULE_INT )* ) )
            // InternalGratext.g:397:2: ( (this_INT_0= RULE_INT )+ (kw= '.' )? (this_INT_2= RULE_INT )* )
            {
            // InternalGratext.g:397:2: ( (this_INT_0= RULE_INT )+ (kw= '.' )? (this_INT_2= RULE_INT )* )
            // InternalGratext.g:398:3: (this_INT_0= RULE_INT )+ (kw= '.' )? (this_INT_2= RULE_INT )*
            {
            // InternalGratext.g:398:3: (this_INT_0= RULE_INT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGratext.g:399:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalGratext.g:407:3: (kw= '.' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGratext.g:408:4: kw= '.'
                    {
                    kw=(Token)match(input,20,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumeroAccess().getFullStopKeyword_1());
                    			

                    }
                    break;

            }

            // InternalGratext.g:414:3: (this_INT_2= RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGratext.g:415:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "rulenumero"


    // $ANTLR start "entryRuleusuario"
    // InternalGratext.g:427:1: entryRuleusuario returns [EObject current=null] : iv_ruleusuario= ruleusuario EOF ;
    public final EObject entryRuleusuario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusuario = null;


        try {
            // InternalGratext.g:427:48: (iv_ruleusuario= ruleusuario EOF )
            // InternalGratext.g:428:2: iv_ruleusuario= ruleusuario EOF
            {
             newCompositeNode(grammarAccess.getUsuarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusuario=ruleusuario();

            state._fsp--;

             current =iv_ruleusuario; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleusuario"


    // $ANTLR start "ruleusuario"
    // InternalGratext.g:434:1: ruleusuario returns [EObject current=null] : ( (lv_usuario_0_0= RULE_ID ) ) ;
    public final EObject ruleusuario() throws RecognitionException {
        EObject current = null;

        Token lv_usuario_0_0=null;


        	enterRule();

        try {
            // InternalGratext.g:440:2: ( ( (lv_usuario_0_0= RULE_ID ) ) )
            // InternalGratext.g:441:2: ( (lv_usuario_0_0= RULE_ID ) )
            {
            // InternalGratext.g:441:2: ( (lv_usuario_0_0= RULE_ID ) )
            // InternalGratext.g:442:3: (lv_usuario_0_0= RULE_ID )
            {
            // InternalGratext.g:442:3: (lv_usuario_0_0= RULE_ID )
            // InternalGratext.g:443:4: lv_usuario_0_0= RULE_ID
            {
            lv_usuario_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_usuario_0_0, grammarAccess.getUsuarioAccess().getUsuarioIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUsuarioRule());
            				}
            				setWithLastConsumed(
            					current,
            					"usuario",
            					lv_usuario_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleusuario"


    // $ANTLR start "entryRulecontrasena"
    // InternalGratext.g:462:1: entryRulecontrasena returns [EObject current=null] : iv_rulecontrasena= rulecontrasena EOF ;
    public final EObject entryRulecontrasena() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontrasena = null;


        try {
            // InternalGratext.g:462:51: (iv_rulecontrasena= rulecontrasena EOF )
            // InternalGratext.g:463:2: iv_rulecontrasena= rulecontrasena EOF
            {
             newCompositeNode(grammarAccess.getContrasenaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecontrasena=rulecontrasena();

            state._fsp--;

             current =iv_rulecontrasena; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecontrasena"


    // $ANTLR start "rulecontrasena"
    // InternalGratext.g:469:1: rulecontrasena returns [EObject current=null] : ( (lv_contrasena_0_0= RULE_STRING ) ) ;
    public final EObject rulecontrasena() throws RecognitionException {
        EObject current = null;

        Token lv_contrasena_0_0=null;


        	enterRule();

        try {
            // InternalGratext.g:475:2: ( ( (lv_contrasena_0_0= RULE_STRING ) ) )
            // InternalGratext.g:476:2: ( (lv_contrasena_0_0= RULE_STRING ) )
            {
            // InternalGratext.g:476:2: ( (lv_contrasena_0_0= RULE_STRING ) )
            // InternalGratext.g:477:3: (lv_contrasena_0_0= RULE_STRING )
            {
            // InternalGratext.g:477:3: (lv_contrasena_0_0= RULE_STRING )
            // InternalGratext.g:478:4: lv_contrasena_0_0= RULE_STRING
            {
            lv_contrasena_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_contrasena_0_0, grammarAccess.getContrasenaAccess().getContrasenaSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getContrasenaRule());
            				}
            				setWithLastConsumed(
            					current,
            					"contrasena",
            					lv_contrasena_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "rulecontrasena"


    // $ANTLR start "ruleTipo"
    // InternalGratext.g:497:1: ruleTipo returns [Enumerator current=null] : ( (enumLiteral_0= 'DELAVAL' ) | (enumLiteral_1= 'SIEMENS' ) | (enumLiteral_2= 'TABLET' ) | (enumLiteral_3= 'MOVIL' ) | (enumLiteral_4= 'ORDENADOR' ) ) ;
    public final Enumerator ruleTipo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalGratext.g:503:2: ( ( (enumLiteral_0= 'DELAVAL' ) | (enumLiteral_1= 'SIEMENS' ) | (enumLiteral_2= 'TABLET' ) | (enumLiteral_3= 'MOVIL' ) | (enumLiteral_4= 'ORDENADOR' ) ) )
            // InternalGratext.g:504:2: ( (enumLiteral_0= 'DELAVAL' ) | (enumLiteral_1= 'SIEMENS' ) | (enumLiteral_2= 'TABLET' ) | (enumLiteral_3= 'MOVIL' ) | (enumLiteral_4= 'ORDENADOR' ) )
            {
            // InternalGratext.g:504:2: ( (enumLiteral_0= 'DELAVAL' ) | (enumLiteral_1= 'SIEMENS' ) | (enumLiteral_2= 'TABLET' ) | (enumLiteral_3= 'MOVIL' ) | (enumLiteral_4= 'ORDENADOR' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGratext.g:505:3: (enumLiteral_0= 'DELAVAL' )
                    {
                    // InternalGratext.g:505:3: (enumLiteral_0= 'DELAVAL' )
                    // InternalGratext.g:506:4: enumLiteral_0= 'DELAVAL'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:513:3: (enumLiteral_1= 'SIEMENS' )
                    {
                    // InternalGratext.g:513:3: (enumLiteral_1= 'SIEMENS' )
                    // InternalGratext.g:514:4: enumLiteral_1= 'SIEMENS'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:521:3: (enumLiteral_2= 'TABLET' )
                    {
                    // InternalGratext.g:521:3: (enumLiteral_2= 'TABLET' )
                    // InternalGratext.g:522:4: enumLiteral_2= 'TABLET'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:529:3: (enumLiteral_3= 'MOVIL' )
                    {
                    // InternalGratext.g:529:3: (enumLiteral_3= 'MOVIL' )
                    // InternalGratext.g:530:4: enumLiteral_3= 'MOVIL'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:537:3: (enumLiteral_4= 'ORDENADOR' )
                    {
                    // InternalGratext.g:537:3: (enumLiteral_4= 'ORDENADOR' )
                    // InternalGratext.g:538:4: enumLiteral_4= 'ORDENADOR'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "ruleTiposDispositivo"
    // InternalGratext.g:548:1: ruleTiposDispositivo returns [Enumerator current=null] : ( (enumLiteral_0= 'CAMARA' ) | (enumLiteral_1= 'TEMPERATURA' ) | (enumLiteral_2= 'FUEGO_HUMO' ) | (enumLiteral_3= 'CO2' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'PRESENCIA' ) | (enumLiteral_6= 'MAGNETICO' ) | (enumLiteral_7= 'ROTURA_CRISTAL' ) | (enumLiteral_8= 'BARRERA_SEGURIDAD' ) | (enumLiteral_9= 'LUMINOSIDAD' ) | (enumLiteral_10= 'EMERGENCIA' ) | (enumLiteral_11= 'INUNDACION' ) | (enumLiteral_12= 'VIENTO' ) | (enumLiteral_13= 'LLUVIA' ) | (enumLiteral_14= 'ESTACION_METEOROLOGICA' ) | (enumLiteral_15= 'SISTEMA_IDENTIFICACION' ) | (enumLiteral_16= 'INFRARROJOS' ) | (enumLiteral_17= 'RADIOFRECUENCIA' ) | (enumLiteral_18= 'MECEDORA' ) | (enumLiteral_19= 'PULSOMETRO_GANADO' ) | (enumLiteral_20= 'DEPOSITO_LECHE' ) | (enumLiteral_21= 'ROBOT_LIMPIADOR' ) | (enumLiteral_22= 'NEVERAS' ) ) ;
    public final Enumerator ruleTiposDispositivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;


        	enterRule();

        try {
            // InternalGratext.g:554:2: ( ( (enumLiteral_0= 'CAMARA' ) | (enumLiteral_1= 'TEMPERATURA' ) | (enumLiteral_2= 'FUEGO_HUMO' ) | (enumLiteral_3= 'CO2' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'PRESENCIA' ) | (enumLiteral_6= 'MAGNETICO' ) | (enumLiteral_7= 'ROTURA_CRISTAL' ) | (enumLiteral_8= 'BARRERA_SEGURIDAD' ) | (enumLiteral_9= 'LUMINOSIDAD' ) | (enumLiteral_10= 'EMERGENCIA' ) | (enumLiteral_11= 'INUNDACION' ) | (enumLiteral_12= 'VIENTO' ) | (enumLiteral_13= 'LLUVIA' ) | (enumLiteral_14= 'ESTACION_METEOROLOGICA' ) | (enumLiteral_15= 'SISTEMA_IDENTIFICACION' ) | (enumLiteral_16= 'INFRARROJOS' ) | (enumLiteral_17= 'RADIOFRECUENCIA' ) | (enumLiteral_18= 'MECEDORA' ) | (enumLiteral_19= 'PULSOMETRO_GANADO' ) | (enumLiteral_20= 'DEPOSITO_LECHE' ) | (enumLiteral_21= 'ROBOT_LIMPIADOR' ) | (enumLiteral_22= 'NEVERAS' ) ) )
            // InternalGratext.g:555:2: ( (enumLiteral_0= 'CAMARA' ) | (enumLiteral_1= 'TEMPERATURA' ) | (enumLiteral_2= 'FUEGO_HUMO' ) | (enumLiteral_3= 'CO2' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'PRESENCIA' ) | (enumLiteral_6= 'MAGNETICO' ) | (enumLiteral_7= 'ROTURA_CRISTAL' ) | (enumLiteral_8= 'BARRERA_SEGURIDAD' ) | (enumLiteral_9= 'LUMINOSIDAD' ) | (enumLiteral_10= 'EMERGENCIA' ) | (enumLiteral_11= 'INUNDACION' ) | (enumLiteral_12= 'VIENTO' ) | (enumLiteral_13= 'LLUVIA' ) | (enumLiteral_14= 'ESTACION_METEOROLOGICA' ) | (enumLiteral_15= 'SISTEMA_IDENTIFICACION' ) | (enumLiteral_16= 'INFRARROJOS' ) | (enumLiteral_17= 'RADIOFRECUENCIA' ) | (enumLiteral_18= 'MECEDORA' ) | (enumLiteral_19= 'PULSOMETRO_GANADO' ) | (enumLiteral_20= 'DEPOSITO_LECHE' ) | (enumLiteral_21= 'ROBOT_LIMPIADOR' ) | (enumLiteral_22= 'NEVERAS' ) )
            {
            // InternalGratext.g:555:2: ( (enumLiteral_0= 'CAMARA' ) | (enumLiteral_1= 'TEMPERATURA' ) | (enumLiteral_2= 'FUEGO_HUMO' ) | (enumLiteral_3= 'CO2' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'PRESENCIA' ) | (enumLiteral_6= 'MAGNETICO' ) | (enumLiteral_7= 'ROTURA_CRISTAL' ) | (enumLiteral_8= 'BARRERA_SEGURIDAD' ) | (enumLiteral_9= 'LUMINOSIDAD' ) | (enumLiteral_10= 'EMERGENCIA' ) | (enumLiteral_11= 'INUNDACION' ) | (enumLiteral_12= 'VIENTO' ) | (enumLiteral_13= 'LLUVIA' ) | (enumLiteral_14= 'ESTACION_METEOROLOGICA' ) | (enumLiteral_15= 'SISTEMA_IDENTIFICACION' ) | (enumLiteral_16= 'INFRARROJOS' ) | (enumLiteral_17= 'RADIOFRECUENCIA' ) | (enumLiteral_18= 'MECEDORA' ) | (enumLiteral_19= 'PULSOMETRO_GANADO' ) | (enumLiteral_20= 'DEPOSITO_LECHE' ) | (enumLiteral_21= 'ROBOT_LIMPIADOR' ) | (enumLiteral_22= 'NEVERAS' ) )
            int alt9=23;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 34:
                {
                alt9=9;
                }
                break;
            case 35:
                {
                alt9=10;
                }
                break;
            case 36:
                {
                alt9=11;
                }
                break;
            case 37:
                {
                alt9=12;
                }
                break;
            case 38:
                {
                alt9=13;
                }
                break;
            case 39:
                {
                alt9=14;
                }
                break;
            case 40:
                {
                alt9=15;
                }
                break;
            case 41:
                {
                alt9=16;
                }
                break;
            case 42:
                {
                alt9=17;
                }
                break;
            case 43:
                {
                alt9=18;
                }
                break;
            case 44:
                {
                alt9=19;
                }
                break;
            case 45:
                {
                alt9=20;
                }
                break;
            case 46:
                {
                alt9=21;
                }
                break;
            case 47:
                {
                alt9=22;
                }
                break;
            case 48:
                {
                alt9=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGratext.g:556:3: (enumLiteral_0= 'CAMARA' )
                    {
                    // InternalGratext.g:556:3: (enumLiteral_0= 'CAMARA' )
                    // InternalGratext.g:557:4: enumLiteral_0= 'CAMARA'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:564:3: (enumLiteral_1= 'TEMPERATURA' )
                    {
                    // InternalGratext.g:564:3: (enumLiteral_1= 'TEMPERATURA' )
                    // InternalGratext.g:565:4: enumLiteral_1= 'TEMPERATURA'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:572:3: (enumLiteral_2= 'FUEGO_HUMO' )
                    {
                    // InternalGratext.g:572:3: (enumLiteral_2= 'FUEGO_HUMO' )
                    // InternalGratext.g:573:4: enumLiteral_2= 'FUEGO_HUMO'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:580:3: (enumLiteral_3= 'CO2' )
                    {
                    // InternalGratext.g:580:3: (enumLiteral_3= 'CO2' )
                    // InternalGratext.g:581:4: enumLiteral_3= 'CO2'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:588:3: (enumLiteral_4= 'GAS' )
                    {
                    // InternalGratext.g:588:3: (enumLiteral_4= 'GAS' )
                    // InternalGratext.g:589:4: enumLiteral_4= 'GAS'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:596:3: (enumLiteral_5= 'PRESENCIA' )
                    {
                    // InternalGratext.g:596:3: (enumLiteral_5= 'PRESENCIA' )
                    // InternalGratext.g:597:4: enumLiteral_5= 'PRESENCIA'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:604:3: (enumLiteral_6= 'MAGNETICO' )
                    {
                    // InternalGratext.g:604:3: (enumLiteral_6= 'MAGNETICO' )
                    // InternalGratext.g:605:4: enumLiteral_6= 'MAGNETICO'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:612:3: (enumLiteral_7= 'ROTURA_CRISTAL' )
                    {
                    // InternalGratext.g:612:3: (enumLiteral_7= 'ROTURA_CRISTAL' )
                    // InternalGratext.g:613:4: enumLiteral_7= 'ROTURA_CRISTAL'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:620:3: (enumLiteral_8= 'BARRERA_SEGURIDAD' )
                    {
                    // InternalGratext.g:620:3: (enumLiteral_8= 'BARRERA_SEGURIDAD' )
                    // InternalGratext.g:621:4: enumLiteral_8= 'BARRERA_SEGURIDAD'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:628:3: (enumLiteral_9= 'LUMINOSIDAD' )
                    {
                    // InternalGratext.g:628:3: (enumLiteral_9= 'LUMINOSIDAD' )
                    // InternalGratext.g:629:4: enumLiteral_9= 'LUMINOSIDAD'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:636:3: (enumLiteral_10= 'EMERGENCIA' )
                    {
                    // InternalGratext.g:636:3: (enumLiteral_10= 'EMERGENCIA' )
                    // InternalGratext.g:637:4: enumLiteral_10= 'EMERGENCIA'
                    {
                    enumLiteral_10=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:644:3: (enumLiteral_11= 'INUNDACION' )
                    {
                    // InternalGratext.g:644:3: (enumLiteral_11= 'INUNDACION' )
                    // InternalGratext.g:645:4: enumLiteral_11= 'INUNDACION'
                    {
                    enumLiteral_11=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:652:3: (enumLiteral_12= 'VIENTO' )
                    {
                    // InternalGratext.g:652:3: (enumLiteral_12= 'VIENTO' )
                    // InternalGratext.g:653:4: enumLiteral_12= 'VIENTO'
                    {
                    enumLiteral_12=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:660:3: (enumLiteral_13= 'LLUVIA' )
                    {
                    // InternalGratext.g:660:3: (enumLiteral_13= 'LLUVIA' )
                    // InternalGratext.g:661:4: enumLiteral_13= 'LLUVIA'
                    {
                    enumLiteral_13=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalGratext.g:668:3: (enumLiteral_14= 'ESTACION_METEOROLOGICA' )
                    {
                    // InternalGratext.g:668:3: (enumLiteral_14= 'ESTACION_METEOROLOGICA' )
                    // InternalGratext.g:669:4: enumLiteral_14= 'ESTACION_METEOROLOGICA'
                    {
                    enumLiteral_14=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalGratext.g:676:3: (enumLiteral_15= 'SISTEMA_IDENTIFICACION' )
                    {
                    // InternalGratext.g:676:3: (enumLiteral_15= 'SISTEMA_IDENTIFICACION' )
                    // InternalGratext.g:677:4: enumLiteral_15= 'SISTEMA_IDENTIFICACION'
                    {
                    enumLiteral_15=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalGratext.g:684:3: (enumLiteral_16= 'INFRARROJOS' )
                    {
                    // InternalGratext.g:684:3: (enumLiteral_16= 'INFRARROJOS' )
                    // InternalGratext.g:685:4: enumLiteral_16= 'INFRARROJOS'
                    {
                    enumLiteral_16=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalGratext.g:692:3: (enumLiteral_17= 'RADIOFRECUENCIA' )
                    {
                    // InternalGratext.g:692:3: (enumLiteral_17= 'RADIOFRECUENCIA' )
                    // InternalGratext.g:693:4: enumLiteral_17= 'RADIOFRECUENCIA'
                    {
                    enumLiteral_17=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalGratext.g:700:3: (enumLiteral_18= 'MECEDORA' )
                    {
                    // InternalGratext.g:700:3: (enumLiteral_18= 'MECEDORA' )
                    // InternalGratext.g:701:4: enumLiteral_18= 'MECEDORA'
                    {
                    enumLiteral_18=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalGratext.g:708:3: (enumLiteral_19= 'PULSOMETRO_GANADO' )
                    {
                    // InternalGratext.g:708:3: (enumLiteral_19= 'PULSOMETRO_GANADO' )
                    // InternalGratext.g:709:4: enumLiteral_19= 'PULSOMETRO_GANADO'
                    {
                    enumLiteral_19=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalGratext.g:716:3: (enumLiteral_20= 'DEPOSITO_LECHE' )
                    {
                    // InternalGratext.g:716:3: (enumLiteral_20= 'DEPOSITO_LECHE' )
                    // InternalGratext.g:717:4: enumLiteral_20= 'DEPOSITO_LECHE'
                    {
                    enumLiteral_20=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalGratext.g:724:3: (enumLiteral_21= 'ROBOT_LIMPIADOR' )
                    {
                    // InternalGratext.g:724:3: (enumLiteral_21= 'ROBOT_LIMPIADOR' )
                    // InternalGratext.g:725:4: enumLiteral_21= 'ROBOT_LIMPIADOR'
                    {
                    enumLiteral_21=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalGratext.g:732:3: (enumLiteral_22= 'NEVERAS' )
                    {
                    // InternalGratext.g:732:3: (enumLiteral_22= 'NEVERAS' )
                    // InternalGratext.g:733:4: enumLiteral_22= 'NEVERAS'
                    {
                    enumLiteral_22=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22());
                    			

                    }


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
    // $ANTLR end "ruleTiposDispositivo"


    // $ANTLR start "ruleNombreAccion"
    // InternalGratext.g:743:1: ruleNombreAccion returns [Enumerator current=null] : ( (enumLiteral_0= 'ABRIR' ) | (enumLiteral_1= 'ENVIAR' ) | (enumLiteral_2= 'SACAR' ) | (enumLiteral_3= 'CERRAR' ) | (enumLiteral_4= 'ESTADO' ) | (enumLiteral_5= 'GRABAR' ) | (enumLiteral_6= 'DETECTAR' ) | (enumLiteral_7= 'ENCENDER' ) | (enumLiteral_8= 'APAGAR' ) | (enumLiteral_9= 'AUMENTAR' ) | (enumLiteral_10= 'DISMINUIR' ) | (enumLiteral_11= 'COMPROBAR' ) | (enumLiteral_12= 'ACTIVAR' ) | (enumLiteral_13= 'DESACTIVAR' ) ) ;
    public final Enumerator ruleNombreAccion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalGratext.g:749:2: ( ( (enumLiteral_0= 'ABRIR' ) | (enumLiteral_1= 'ENVIAR' ) | (enumLiteral_2= 'SACAR' ) | (enumLiteral_3= 'CERRAR' ) | (enumLiteral_4= 'ESTADO' ) | (enumLiteral_5= 'GRABAR' ) | (enumLiteral_6= 'DETECTAR' ) | (enumLiteral_7= 'ENCENDER' ) | (enumLiteral_8= 'APAGAR' ) | (enumLiteral_9= 'AUMENTAR' ) | (enumLiteral_10= 'DISMINUIR' ) | (enumLiteral_11= 'COMPROBAR' ) | (enumLiteral_12= 'ACTIVAR' ) | (enumLiteral_13= 'DESACTIVAR' ) ) )
            // InternalGratext.g:750:2: ( (enumLiteral_0= 'ABRIR' ) | (enumLiteral_1= 'ENVIAR' ) | (enumLiteral_2= 'SACAR' ) | (enumLiteral_3= 'CERRAR' ) | (enumLiteral_4= 'ESTADO' ) | (enumLiteral_5= 'GRABAR' ) | (enumLiteral_6= 'DETECTAR' ) | (enumLiteral_7= 'ENCENDER' ) | (enumLiteral_8= 'APAGAR' ) | (enumLiteral_9= 'AUMENTAR' ) | (enumLiteral_10= 'DISMINUIR' ) | (enumLiteral_11= 'COMPROBAR' ) | (enumLiteral_12= 'ACTIVAR' ) | (enumLiteral_13= 'DESACTIVAR' ) )
            {
            // InternalGratext.g:750:2: ( (enumLiteral_0= 'ABRIR' ) | (enumLiteral_1= 'ENVIAR' ) | (enumLiteral_2= 'SACAR' ) | (enumLiteral_3= 'CERRAR' ) | (enumLiteral_4= 'ESTADO' ) | (enumLiteral_5= 'GRABAR' ) | (enumLiteral_6= 'DETECTAR' ) | (enumLiteral_7= 'ENCENDER' ) | (enumLiteral_8= 'APAGAR' ) | (enumLiteral_9= 'AUMENTAR' ) | (enumLiteral_10= 'DISMINUIR' ) | (enumLiteral_11= 'COMPROBAR' ) | (enumLiteral_12= 'ACTIVAR' ) | (enumLiteral_13= 'DESACTIVAR' ) )
            int alt10=14;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            case 53:
                {
                alt10=5;
                }
                break;
            case 54:
                {
                alt10=6;
                }
                break;
            case 55:
                {
                alt10=7;
                }
                break;
            case 56:
                {
                alt10=8;
                }
                break;
            case 57:
                {
                alt10=9;
                }
                break;
            case 58:
                {
                alt10=10;
                }
                break;
            case 59:
                {
                alt10=11;
                }
                break;
            case 60:
                {
                alt10=12;
                }
                break;
            case 61:
                {
                alt10=13;
                }
                break;
            case 62:
                {
                alt10=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGratext.g:751:3: (enumLiteral_0= 'ABRIR' )
                    {
                    // InternalGratext.g:751:3: (enumLiteral_0= 'ABRIR' )
                    // InternalGratext.g:752:4: enumLiteral_0= 'ABRIR'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:759:3: (enumLiteral_1= 'ENVIAR' )
                    {
                    // InternalGratext.g:759:3: (enumLiteral_1= 'ENVIAR' )
                    // InternalGratext.g:760:4: enumLiteral_1= 'ENVIAR'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:767:3: (enumLiteral_2= 'SACAR' )
                    {
                    // InternalGratext.g:767:3: (enumLiteral_2= 'SACAR' )
                    // InternalGratext.g:768:4: enumLiteral_2= 'SACAR'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:775:3: (enumLiteral_3= 'CERRAR' )
                    {
                    // InternalGratext.g:775:3: (enumLiteral_3= 'CERRAR' )
                    // InternalGratext.g:776:4: enumLiteral_3= 'CERRAR'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:783:3: (enumLiteral_4= 'ESTADO' )
                    {
                    // InternalGratext.g:783:3: (enumLiteral_4= 'ESTADO' )
                    // InternalGratext.g:784:4: enumLiteral_4= 'ESTADO'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGratext.g:791:3: (enumLiteral_5= 'GRABAR' )
                    {
                    // InternalGratext.g:791:3: (enumLiteral_5= 'GRABAR' )
                    // InternalGratext.g:792:4: enumLiteral_5= 'GRABAR'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGratext.g:799:3: (enumLiteral_6= 'DETECTAR' )
                    {
                    // InternalGratext.g:799:3: (enumLiteral_6= 'DETECTAR' )
                    // InternalGratext.g:800:4: enumLiteral_6= 'DETECTAR'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGratext.g:807:3: (enumLiteral_7= 'ENCENDER' )
                    {
                    // InternalGratext.g:807:3: (enumLiteral_7= 'ENCENDER' )
                    // InternalGratext.g:808:4: enumLiteral_7= 'ENCENDER'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGratext.g:815:3: (enumLiteral_8= 'APAGAR' )
                    {
                    // InternalGratext.g:815:3: (enumLiteral_8= 'APAGAR' )
                    // InternalGratext.g:816:4: enumLiteral_8= 'APAGAR'
                    {
                    enumLiteral_8=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGratext.g:823:3: (enumLiteral_9= 'AUMENTAR' )
                    {
                    // InternalGratext.g:823:3: (enumLiteral_9= 'AUMENTAR' )
                    // InternalGratext.g:824:4: enumLiteral_9= 'AUMENTAR'
                    {
                    enumLiteral_9=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGratext.g:831:3: (enumLiteral_10= 'DISMINUIR' )
                    {
                    // InternalGratext.g:831:3: (enumLiteral_10= 'DISMINUIR' )
                    // InternalGratext.g:832:4: enumLiteral_10= 'DISMINUIR'
                    {
                    enumLiteral_10=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGratext.g:839:3: (enumLiteral_11= 'COMPROBAR' )
                    {
                    // InternalGratext.g:839:3: (enumLiteral_11= 'COMPROBAR' )
                    // InternalGratext.g:840:4: enumLiteral_11= 'COMPROBAR'
                    {
                    enumLiteral_11=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGratext.g:847:3: (enumLiteral_12= 'ACTIVAR' )
                    {
                    // InternalGratext.g:847:3: (enumLiteral_12= 'ACTIVAR' )
                    // InternalGratext.g:848:4: enumLiteral_12= 'ACTIVAR'
                    {
                    enumLiteral_12=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGratext.g:855:3: (enumLiteral_13= 'DESACTIVAR' )
                    {
                    // InternalGratext.g:855:3: (enumLiteral_13= 'DESACTIVAR' )
                    // InternalGratext.g:856:4: enumLiteral_13= 'DESACTIVAR'
                    {
                    enumLiteral_13=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13());
                    			

                    }


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
    // $ANTLR end "ruleNombreAccion"


    // $ANTLR start "ruleEstado"
    // InternalGratext.g:866:1: ruleEstado returns [Enumerator current=null] : ( (enumLiteral_0= 'AMBIENTE' ) | (enumLiteral_1= 'INTERNA' ) | (enumLiteral_2= 'NEVERA' ) | (enumLiteral_3= 'MECEDORA' ) | (enumLiteral_4= 'DEPOSITO_LECHE' ) ) ;
    public final Enumerator ruleEstado() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalGratext.g:872:2: ( ( (enumLiteral_0= 'AMBIENTE' ) | (enumLiteral_1= 'INTERNA' ) | (enumLiteral_2= 'NEVERA' ) | (enumLiteral_3= 'MECEDORA' ) | (enumLiteral_4= 'DEPOSITO_LECHE' ) ) )
            // InternalGratext.g:873:2: ( (enumLiteral_0= 'AMBIENTE' ) | (enumLiteral_1= 'INTERNA' ) | (enumLiteral_2= 'NEVERA' ) | (enumLiteral_3= 'MECEDORA' ) | (enumLiteral_4= 'DEPOSITO_LECHE' ) )
            {
            // InternalGratext.g:873:2: ( (enumLiteral_0= 'AMBIENTE' ) | (enumLiteral_1= 'INTERNA' ) | (enumLiteral_2= 'NEVERA' ) | (enumLiteral_3= 'MECEDORA' ) | (enumLiteral_4= 'DEPOSITO_LECHE' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt11=1;
                }
                break;
            case 64:
                {
                alt11=2;
                }
                break;
            case 65:
                {
                alt11=3;
                }
                break;
            case 44:
                {
                alt11=4;
                }
                break;
            case 46:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGratext.g:874:3: (enumLiteral_0= 'AMBIENTE' )
                    {
                    // InternalGratext.g:874:3: (enumLiteral_0= 'AMBIENTE' )
                    // InternalGratext.g:875:4: enumLiteral_0= 'AMBIENTE'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGratext.g:882:3: (enumLiteral_1= 'INTERNA' )
                    {
                    // InternalGratext.g:882:3: (enumLiteral_1= 'INTERNA' )
                    // InternalGratext.g:883:4: enumLiteral_1= 'INTERNA'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGratext.g:890:3: (enumLiteral_2= 'NEVERA' )
                    {
                    // InternalGratext.g:890:3: (enumLiteral_2= 'NEVERA' )
                    // InternalGratext.g:891:4: enumLiteral_2= 'NEVERA'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGratext.g:898:3: (enumLiteral_3= 'MECEDORA' )
                    {
                    // InternalGratext.g:898:3: (enumLiteral_3= 'MECEDORA' )
                    // InternalGratext.g:899:4: enumLiteral_3= 'MECEDORA'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGratext.g:906:3: (enumLiteral_4= 'DEPOSITO_LECHE' )
                    {
                    // InternalGratext.g:906:3: (enumLiteral_4= 'DEPOSITO_LECHE' )
                    // InternalGratext.g:907:4: enumLiteral_4= 'DEPOSITO_LECHE'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleEstado"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FFFFFC000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8000500000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x7FFE000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});

}