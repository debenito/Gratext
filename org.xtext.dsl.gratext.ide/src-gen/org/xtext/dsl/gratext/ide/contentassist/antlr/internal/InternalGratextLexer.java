package org.xtext.dsl.gratext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGratextLexer extends Lexer {
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

    public InternalGratextLexer() {;} 
    public InternalGratextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGratextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGratext.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:11:7: ( 'DELAVAL' )
            // InternalGratext.g:11:9: 'DELAVAL'
            {
            match("DELAVAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:12:7: ( 'SIEMENS' )
            // InternalGratext.g:12:9: 'SIEMENS'
            {
            match("SIEMENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:13:7: ( 'TABLET' )
            // InternalGratext.g:13:9: 'TABLET'
            {
            match("TABLET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:14:7: ( 'MOVIL' )
            // InternalGratext.g:14:9: 'MOVIL'
            {
            match("MOVIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:15:7: ( 'ORDENADOR' )
            // InternalGratext.g:15:9: 'ORDENADOR'
            {
            match("ORDENADOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:16:7: ( 'CAMARA' )
            // InternalGratext.g:16:9: 'CAMARA'
            {
            match("CAMARA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:17:7: ( 'TEMPERATURA' )
            // InternalGratext.g:17:9: 'TEMPERATURA'
            {
            match("TEMPERATURA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:18:7: ( 'FUEGO_HUMO' )
            // InternalGratext.g:18:9: 'FUEGO_HUMO'
            {
            match("FUEGO_HUMO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:19:7: ( 'CO2' )
            // InternalGratext.g:19:9: 'CO2'
            {
            match("CO2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:20:7: ( 'GAS' )
            // InternalGratext.g:20:9: 'GAS'
            {
            match("GAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:21:7: ( 'PRESENCIA' )
            // InternalGratext.g:21:9: 'PRESENCIA'
            {
            match("PRESENCIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:22:7: ( 'MAGNETICO' )
            // InternalGratext.g:22:9: 'MAGNETICO'
            {
            match("MAGNETICO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:23:7: ( 'ROTURA_CRISTAL' )
            // InternalGratext.g:23:9: 'ROTURA_CRISTAL'
            {
            match("ROTURA_CRISTAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:24:7: ( 'BARRERA_SEGURIDAD' )
            // InternalGratext.g:24:9: 'BARRERA_SEGURIDAD'
            {
            match("BARRERA_SEGURIDAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:25:7: ( 'LUMINOSIDAD' )
            // InternalGratext.g:25:9: 'LUMINOSIDAD'
            {
            match("LUMINOSIDAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:26:7: ( 'EMERGENCIA' )
            // InternalGratext.g:26:9: 'EMERGENCIA'
            {
            match("EMERGENCIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:27:7: ( 'INUNDACION' )
            // InternalGratext.g:27:9: 'INUNDACION'
            {
            match("INUNDACION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:28:7: ( 'VIENTO' )
            // InternalGratext.g:28:9: 'VIENTO'
            {
            match("VIENTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:29:7: ( 'LLUVIA' )
            // InternalGratext.g:29:9: 'LLUVIA'
            {
            match("LLUVIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:30:7: ( 'ESTACION_METEOROLOGICA' )
            // InternalGratext.g:30:9: 'ESTACION_METEOROLOGICA'
            {
            match("ESTACION_METEOROLOGICA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:31:7: ( 'SISTEMA_IDENTIFICACION' )
            // InternalGratext.g:31:9: 'SISTEMA_IDENTIFICACION'
            {
            match("SISTEMA_IDENTIFICACION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:32:7: ( 'INFRARROJOS' )
            // InternalGratext.g:32:9: 'INFRARROJOS'
            {
            match("INFRARROJOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:33:7: ( 'RADIOFRECUENCIA' )
            // InternalGratext.g:33:9: 'RADIOFRECUENCIA'
            {
            match("RADIOFRECUENCIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:34:7: ( 'MECEDORA' )
            // InternalGratext.g:34:9: 'MECEDORA'
            {
            match("MECEDORA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:35:7: ( 'PULSOMETRO_GANADO' )
            // InternalGratext.g:35:9: 'PULSOMETRO_GANADO'
            {
            match("PULSOMETRO_GANADO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:36:7: ( 'DEPOSITO_LECHE' )
            // InternalGratext.g:36:9: 'DEPOSITO_LECHE'
            {
            match("DEPOSITO_LECHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:37:7: ( 'ROBOT_LIMPIADOR' )
            // InternalGratext.g:37:9: 'ROBOT_LIMPIADOR'
            {
            match("ROBOT_LIMPIADOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:38:7: ( 'NEVERAS' )
            // InternalGratext.g:38:9: 'NEVERAS'
            {
            match("NEVERAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:39:7: ( 'ABRIR' )
            // InternalGratext.g:39:9: 'ABRIR'
            {
            match("ABRIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:40:7: ( 'ENVIAR' )
            // InternalGratext.g:40:9: 'ENVIAR'
            {
            match("ENVIAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:41:7: ( 'SACAR' )
            // InternalGratext.g:41:9: 'SACAR'
            {
            match("SACAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:42:7: ( 'CERRAR' )
            // InternalGratext.g:42:9: 'CERRAR'
            {
            match("CERRAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:43:7: ( 'ESTADO' )
            // InternalGratext.g:43:9: 'ESTADO'
            {
            match("ESTADO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:44:7: ( 'GRABAR' )
            // InternalGratext.g:44:9: 'GRABAR'
            {
            match("GRABAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:45:7: ( 'DETECTAR' )
            // InternalGratext.g:45:9: 'DETECTAR'
            {
            match("DETECTAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:46:7: ( 'ENCENDER' )
            // InternalGratext.g:46:9: 'ENCENDER'
            {
            match("ENCENDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:47:7: ( 'APAGAR' )
            // InternalGratext.g:47:9: 'APAGAR'
            {
            match("APAGAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:48:7: ( 'AUMENTAR' )
            // InternalGratext.g:48:9: 'AUMENTAR'
            {
            match("AUMENTAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:49:7: ( 'DISMINUIR' )
            // InternalGratext.g:49:9: 'DISMINUIR'
            {
            match("DISMINUIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:50:7: ( 'COMPROBAR' )
            // InternalGratext.g:50:9: 'COMPROBAR'
            {
            match("COMPROBAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:51:7: ( 'ACTIVAR' )
            // InternalGratext.g:51:9: 'ACTIVAR'
            {
            match("ACTIVAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:52:7: ( 'DESACTIVAR' )
            // InternalGratext.g:52:9: 'DESACTIVAR'
            {
            match("DESACTIVAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:53:7: ( 'AMBIENTE' )
            // InternalGratext.g:53:9: 'AMBIENTE'
            {
            match("AMBIENTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:54:7: ( 'INTERNA' )
            // InternalGratext.g:54:9: 'INTERNA'
            {
            match("INTERNA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:55:7: ( 'NEVERA' )
            // InternalGratext.g:55:9: 'NEVERA'
            {
            match("NEVERA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:56:7: ( 'GRANJA' )
            // InternalGratext.g:56:9: 'GRANJA'
            {
            match("GRANJA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:57:7: ( 'CENTRALITA:' )
            // InternalGratext.g:57:9: 'CENTRALITA:'
            {
            match("CENTRALITA:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:58:7: ( 'Usuario:' )
            // InternalGratext.g:58:9: 'Usuario:'
            {
            match("Usuario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:59:7: ( 'Contrase\\u00F1a:' )
            // InternalGratext.g:59:9: 'Contrase\\u00F1a:'
            {
            match("Contrase\u00F1a:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:60:7: ( 'Dispositivos{' )
            // InternalGratext.g:60:9: 'Dispositivos{'
            {
            match("Dispositivos{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:61:7: ( '}' )
            // InternalGratext.g:61:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:62:7: ( 'Codigo:' )
            // InternalGratext.g:62:9: 'Codigo:'
            {
            match("Codigo:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:63:7: ( 'Sensor' )
            // InternalGratext.g:63:9: 'Sensor'
            {
            match("Sensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:64:7: ( 'quiero' )
            // InternalGratext.g:64:9: 'quiero'
            {
            match("quiero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:65:7: ( '.' )
            // InternalGratext.g:65:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1449:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGratext.g:1449:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGratext.g:1449:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGratext.g:1449:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGratext.g:1449:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGratext.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1451:10: ( ( '0' .. '9' )+ )
            // InternalGratext.g:1451:12: ( '0' .. '9' )+
            {
            // InternalGratext.g:1451:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGratext.g:1451:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1453:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGratext.g:1453:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGratext.g:1453:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGratext.g:1453:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGratext.g:1453:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGratext.g:1453:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGratext.g:1453:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGratext.g:1453:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGratext.g:1453:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGratext.g:1453:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGratext.g:1453:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1455:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGratext.g:1455:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGratext.g:1455:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGratext.g:1455:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1457:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGratext.g:1457:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGratext.g:1457:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGratext.g:1457:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGratext.g:1457:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGratext.g:1457:41: ( '\\r' )? '\\n'
                    {
                    // InternalGratext.g:1457:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGratext.g:1457:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1459:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGratext.g:1459:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGratext.g:1459:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGratext.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGratext.g:1461:16: ( . )
            // InternalGratext.g:1461:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGratext.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=62;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGratext.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalGratext.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalGratext.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalGratext.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalGratext.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalGratext.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalGratext.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalGratext.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalGratext.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalGratext.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalGratext.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalGratext.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalGratext.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalGratext.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalGratext.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalGratext.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalGratext.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalGratext.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalGratext.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalGratext.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalGratext.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalGratext.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalGratext.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalGratext.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalGratext.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalGratext.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalGratext.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalGratext.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalGratext.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalGratext.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalGratext.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalGratext.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalGratext.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalGratext.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalGratext.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalGratext.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalGratext.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalGratext.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalGratext.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalGratext.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalGratext.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalGratext.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalGratext.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalGratext.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalGratext.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalGratext.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalGratext.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalGratext.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalGratext.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalGratext.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalGratext.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalGratext.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalGratext.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalGratext.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalGratext.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalGratext.g:1:340: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalGratext.g:1:348: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // InternalGratext.g:1:357: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalGratext.g:1:369: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalGratext.g:1:385: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalGratext.g:1:401: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // InternalGratext.g:1:409: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\22\41\1\uffff\1\41\1\uffff\1\35\2\uffff\3\35\2\uffff\3\41\1\uffff\43\41\1\uffff\1\41\6\uffff\21\41\1\u0090\6\41\1\u0097\52\41\1\uffff\6\41\1\uffff\42\41\1\u00ec\3\41\1\u00f0\36\41\1\u010f\16\41\1\uffff\1\u011e\1\u011f\1\41\1\uffff\3\41\1\u0124\1\41\1\u0126\4\41\1\u012b\1\u012c\7\41\1\u0134\2\41\1\u0137\1\u0138\4\41\1\u013d\1\u013f\1\uffff\1\u0140\4\41\1\u0145\1\u0146\5\41\1\u014c\1\41\2\uffff\4\41\1\uffff\1\41\1\uffff\2\41\1\uffff\1\41\2\uffff\7\41\1\uffff\2\41\2\uffff\3\41\1\u0162\1\uffff\1\u0163\2\uffff\1\41\1\u0165\2\41\2\uffff\1\41\1\u0169\3\41\1\uffff\3\41\1\u0170\16\41\1\u017f\2\41\2\uffff\1\u0182\1\uffff\1\u0183\1\uffff\1\41\1\uffff\1\41\1\u0186\3\41\1\u018a\1\uffff\1\u018b\1\u018c\1\41\1\uffff\1\41\1\u018f\10\41\1\uffff\2\41\2\uffff\1\41\1\u019b\1\uffff\3\41\3\uffff\1\41\1\u01a0\1\uffff\6\41\1\u01a7\1\41\1\u01a9\2\41\1\uffff\2\41\1\u01ae\2\uffff\5\41\1\u01b4\1\uffff\1\41\1\uffff\1\u01b6\3\41\1\uffff\5\41\1\uffff\1\41\1\uffff\1\41\1\uffff\7\41\1\u01c8\2\41\1\u01cb\4\41\1\uffff\2\41\1\uffff\1\u01d2\1\u01d3\4\41\2\uffff\3\41\1\u01db\1\u01dc\2\41\2\uffff\7\41\1\u01e6\1\u01e7\2\uffff";
    static final String DFA12_eofS =
        "\u01e8\uffff";
    static final String DFA12_minS =
        "\1\0\1\105\3\101\1\122\1\101\1\125\1\101\1\122\2\101\1\114\1\115\1\116\1\111\1\105\1\102\1\163\1\uffff\1\165\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\114\1\123\1\163\1\uffff\1\105\1\103\1\156\1\102\1\115\1\126\1\107\1\103\1\104\1\115\1\62\1\116\1\144\1\105\1\123\1\101\1\105\1\114\1\102\1\104\1\122\1\115\1\125\1\105\1\124\1\103\1\106\1\105\1\126\1\122\1\101\1\115\1\124\1\102\1\165\1\uffff\1\151\6\uffff\1\101\1\117\1\105\1\101\1\115\1\160\1\115\1\124\1\101\1\163\1\114\1\120\1\111\1\116\2\105\1\101\1\60\1\120\1\122\1\124\1\164\1\151\1\107\1\60\1\102\2\123\1\125\1\117\1\111\1\122\1\111\1\126\1\122\1\101\1\111\1\105\1\116\1\122\1\105\1\116\1\105\1\111\1\107\1\105\2\111\1\141\1\145\1\126\1\123\2\103\1\111\1\157\2\105\1\122\1\157\2\105\1\114\1\105\1\104\1\116\1\122\1\uffff\1\122\1\101\1\122\1\162\1\147\1\117\1\uffff\1\101\1\112\1\105\1\117\1\122\1\124\1\117\1\105\1\116\1\111\1\107\1\103\1\101\1\116\1\104\1\101\1\122\1\124\2\122\1\101\1\116\1\126\1\105\2\162\1\101\1\111\2\124\1\116\1\163\1\116\1\115\1\60\1\162\1\124\1\122\1\60\1\124\1\117\2\101\1\117\1\122\1\101\1\141\1\157\1\137\1\122\1\101\1\116\1\115\1\101\1\137\1\106\1\122\1\117\1\101\1\105\1\111\1\117\1\122\1\104\1\101\1\122\1\116\1\117\1\101\1\60\1\122\1\124\1\101\1\116\1\151\1\157\1\114\1\124\1\101\1\111\1\125\1\151\1\123\1\101\1\uffff\2\60\1\101\1\uffff\1\111\1\122\1\104\1\60\1\102\1\60\1\114\1\163\1\72\1\110\2\60\1\103\1\105\1\137\1\114\1\122\1\101\1\123\1\60\1\116\1\117\2\60\1\105\1\103\1\122\1\101\2\60\1\uffff\1\60\1\101\1\122\1\124\1\157\2\60\1\117\1\122\1\126\1\111\1\164\1\60\1\137\2\uffff\1\124\1\103\1\101\1\117\1\uffff\1\101\1\uffff\1\111\1\145\1\uffff\1\125\2\uffff\1\111\1\124\1\103\1\111\1\105\1\137\1\111\1\uffff\1\103\1\116\2\uffff\1\122\1\111\1\117\1\60\1\uffff\1\60\2\uffff\1\122\1\60\1\105\1\72\2\uffff\1\137\1\60\1\101\1\122\1\151\1\uffff\1\111\1\125\1\117\1\60\2\122\1\124\1\u00f1\1\115\1\101\2\122\1\115\1\103\1\123\1\104\1\111\1\137\1\60\1\117\1\112\2\uffff\1\60\1\uffff\1\60\1\uffff\1\114\1\uffff\1\122\1\60\1\166\1\104\1\122\1\60\1\uffff\2\60\1\101\1\uffff\1\117\1\60\1\117\1\111\1\120\1\125\1\105\2\101\1\115\1\uffff\1\116\1\117\2\uffff\1\105\1\60\1\uffff\1\157\1\105\1\101\3\uffff\1\72\1\60\1\uffff\1\137\1\123\1\111\1\105\1\107\1\104\1\60\1\105\1\60\1\123\1\103\1\uffff\1\163\1\116\1\60\2\uffff\1\107\1\124\1\101\1\116\1\125\1\60\1\uffff\1\124\1\uffff\1\60\1\110\1\173\1\124\1\uffff\2\101\1\104\1\103\1\122\1\uffff\1\105\1\uffff\1\105\1\uffff\1\111\1\116\1\114\1\117\2\111\1\117\1\60\1\106\1\101\1\60\1\122\1\101\1\104\1\122\1\uffff\1\111\1\104\1\uffff\2\60\1\101\1\117\1\103\1\117\2\uffff\1\104\1\114\1\101\2\60\1\117\1\103\2\uffff\1\107\2\111\1\117\1\103\1\116\1\101\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\1\145\1\105\1\117\1\122\1\157\1\125\1\122\1\125\1\117\1\101\1\125\1\123\1\116\1\111\1\105\1\125\1\163\1\uffff\1\165\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\124\1\123\1\163\1\uffff\1\123\1\103\1\156\1\102\1\115\1\126\1\107\1\103\1\104\2\115\1\122\1\156\1\105\1\123\1\101\1\105\1\114\1\124\1\104\1\122\1\115\1\125\1\105\1\124\1\126\1\125\1\105\1\126\1\122\1\101\1\115\1\124\1\102\1\165\1\uffff\1\151\6\uffff\1\101\1\117\1\105\1\101\1\115\1\160\1\115\1\124\1\101\1\163\1\114\1\120\1\111\1\116\2\105\1\101\1\172\1\120\1\122\1\124\1\164\1\151\1\107\1\172\1\116\2\123\1\125\1\117\1\111\1\122\1\111\1\126\1\122\1\101\1\111\1\105\1\116\1\122\1\105\1\116\1\105\1\111\1\107\1\105\2\111\1\141\1\145\1\126\1\123\2\103\1\111\1\157\2\105\1\122\1\157\2\105\1\114\1\105\1\104\1\116\1\122\1\uffff\1\122\1\101\1\122\1\162\1\147\1\117\1\uffff\1\101\1\112\1\105\1\117\1\122\1\124\1\117\1\105\1\116\1\111\1\107\1\104\1\101\1\116\1\104\1\101\1\122\1\124\2\122\1\101\1\116\1\126\1\105\2\162\1\101\1\111\2\124\1\116\1\163\1\116\1\115\1\172\1\162\1\124\1\122\1\172\1\124\1\117\2\101\1\117\1\122\1\101\1\141\1\157\1\137\1\122\1\101\1\116\1\115\1\101\1\137\1\106\1\122\1\117\1\101\1\105\1\111\1\117\1\122\1\104\1\101\1\122\1\116\1\117\1\101\1\172\1\122\1\124\1\101\1\116\1\151\1\157\1\114\1\124\1\101\1\111\1\125\1\151\1\123\1\101\1\uffff\2\172\1\101\1\uffff\1\111\1\122\1\104\1\172\1\102\1\172\1\114\1\163\1\72\1\110\2\172\1\103\1\105\1\137\1\114\1\122\1\101\1\123\1\172\1\116\1\117\2\172\1\105\1\103\1\122\1\101\2\172\1\uffff\1\172\1\101\1\122\1\124\1\157\2\172\1\117\1\122\1\126\1\111\1\164\1\172\1\137\2\uffff\1\124\1\103\1\101\1\117\1\uffff\1\101\1\uffff\1\111\1\145\1\uffff\1\125\2\uffff\1\111\1\124\1\103\1\111\1\105\1\137\1\111\1\uffff\1\103\1\116\2\uffff\1\122\1\111\1\117\1\172\1\uffff\1\172\2\uffff\1\122\1\172\1\105\1\72\2\uffff\1\137\1\172\1\101\1\122\1\151\1\uffff\1\111\1\125\1\117\1\172\2\122\1\124\1\u00f1\1\115\1\101\2\122\1\115\1\103\1\123\1\104\1\111\1\137\1\172\1\117\1\112\2\uffff\1\172\1\uffff\1\172\1\uffff\1\114\1\uffff\1\122\1\172\1\166\1\104\1\122\1\172\1\uffff\2\172\1\101\1\uffff\1\117\1\172\1\117\1\111\1\120\1\125\1\105\2\101\1\115\1\uffff\1\116\1\117\2\uffff\1\105\1\172\1\uffff\1\157\1\105\1\101\3\uffff\1\72\1\172\1\uffff\1\137\1\123\1\111\1\105\1\107\1\104\1\172\1\105\1\172\1\123\1\103\1\uffff\1\163\1\116\1\172\2\uffff\1\107\1\124\1\101\1\116\1\125\1\172\1\uffff\1\124\1\uffff\1\172\1\110\1\173\1\124\1\uffff\2\101\1\104\1\103\1\122\1\uffff\1\105\1\uffff\1\105\1\uffff\1\111\1\116\1\114\1\117\2\111\1\117\1\172\1\106\1\101\1\172\1\122\1\101\1\104\1\122\1\uffff\1\111\1\104\1\uffff\2\172\1\101\1\117\1\103\1\117\2\uffff\1\104\1\114\1\101\2\172\1\117\1\103\2\uffff\1\107\2\111\1\117\1\103\1\116\1\101\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\23\uffff\1\63\1\uffff\1\67\1\uffff\1\70\1\71\3\uffff\1\75\1\76\3\uffff\1\70\43\uffff\1\63\1\uffff\1\67\1\71\1\72\1\73\1\74\1\75\103\uffff\1\11\6\uffff\1\12\124\uffff\1\37\3\uffff\1\4\36\uffff\1\35\16\uffff\1\65\1\3\4\uffff\1\6\1\uffff\1\40\2\uffff\1\64\1\uffff\1\42\1\56\7\uffff\1\23\2\uffff\1\41\1\36\4\uffff\1\22\1\uffff\1\55\1\45\4\uffff\1\66\1\1\5\uffff\1\2\25\uffff\1\54\1\34\1\uffff\1\51\1\uffff\1\60\1\uffff\1\43\6\uffff\1\30\3\uffff\1\61\12\uffff\1\44\2\uffff\1\46\1\53\2\uffff\1\47\3\uffff\1\14\1\5\1\50\2\uffff\1\13\13\uffff\1\52\3\uffff\1\57\1\10\6\uffff\1\20\1\uffff\1\21\4\uffff\1\7\5\uffff\1\17\1\uffff\1\26\1\uffff\1\62\17\uffff\1\32\2\uffff\1\15\6\uffff\1\33\1\27\7\uffff\1\31\1\16\11\uffff\1\25\1\24";
    static final String DFA12_specialS =
        "\1\0\30\uffff\1\1\1\2\u01cd\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\6\35\1\25\1\33\12\30\7\35\1\21\1\13\1\6\1\1\1\15\1\7\1\10\1\27\1\16\2\27\1\14\1\4\1\20\1\5\1\11\1\27\1\12\1\2\1\3\1\22\1\17\4\27\3\35\1\26\1\27\1\35\20\27\1\24\11\27\2\35\1\23\uff82\35",
            "\1\36\3\uffff\1\37\37\uffff\1\40",
            "\1\43\7\uffff\1\42\33\uffff\1\44",
            "\1\45\3\uffff\1\46",
            "\1\50\3\uffff\1\51\11\uffff\1\47",
            "\1\52",
            "\1\53\3\uffff\1\55\11\uffff\1\54\37\uffff\1\56",
            "\1\57",
            "\1\60\20\uffff\1\61",
            "\1\62\2\uffff\1\63",
            "\1\65\15\uffff\1\64",
            "\1\66",
            "\1\70\10\uffff\1\67",
            "\1\71\1\73\4\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\1\102\11\uffff\1\103\2\uffff\1\100\4\uffff\1\101",
            "\1\104",
            "",
            "\1\106",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\115\3\uffff\1\116\2\uffff\1\120\1\117",
            "\1\121",
            "\1\122",
            "",
            "\1\123\15\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136\32\uffff\1\137",
            "\1\141\3\uffff\1\140",
            "\1\143\11\uffff\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\152\21\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\22\uffff\1\161",
            "\1\164\15\uffff\1\165\1\163",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0098\13\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0135",
            "\1\u0136",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\22\41\1\u013e\7\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0164",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0166",
            "\1\u0167",
            "",
            "",
            "\1\u0168",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0184",
            "",
            "\1\u0185",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u018d",
            "",
            "\1\u018e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "",
            "",
            "\1\u019a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "",
            "",
            "\1\u019f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01a8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u01b5",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01c9",
            "\1\u01ca",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u01dd",
            "\1\u01de",
            "",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='D') ) {s = 1;}

                        else if ( (LA12_0=='S') ) {s = 2;}

                        else if ( (LA12_0=='T') ) {s = 3;}

                        else if ( (LA12_0=='M') ) {s = 4;}

                        else if ( (LA12_0=='O') ) {s = 5;}

                        else if ( (LA12_0=='C') ) {s = 6;}

                        else if ( (LA12_0=='F') ) {s = 7;}

                        else if ( (LA12_0=='G') ) {s = 8;}

                        else if ( (LA12_0=='P') ) {s = 9;}

                        else if ( (LA12_0=='R') ) {s = 10;}

                        else if ( (LA12_0=='B') ) {s = 11;}

                        else if ( (LA12_0=='L') ) {s = 12;}

                        else if ( (LA12_0=='E') ) {s = 13;}

                        else if ( (LA12_0=='I') ) {s = 14;}

                        else if ( (LA12_0=='V') ) {s = 15;}

                        else if ( (LA12_0=='N') ) {s = 16;}

                        else if ( (LA12_0=='A') ) {s = 17;}

                        else if ( (LA12_0=='U') ) {s = 18;}

                        else if ( (LA12_0=='}') ) {s = 19;}

                        else if ( (LA12_0=='q') ) {s = 20;}

                        else if ( (LA12_0=='.') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( (LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='Q'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='p')||(LA12_0>='r' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='|')||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 73;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 73;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}