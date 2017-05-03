/*
 * generated by Xtext 2.10.0
 */
grammar InternalGratext;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.dsl.gratext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGranja
entryRuleGranja returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGranjaRule()); }
	iv_ruleGranja=ruleGranja
	{ $current=$iv_ruleGranja.current; }
	EOF;

// Rule Granja
ruleGranja returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GRANJA'
		{
			newLeafNode(otherlv_0, grammarAccess.getGranjaAccess().getGRANJAKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGranjaAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGranjaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='CENTRALITA:'
		{
			newLeafNode(otherlv_2, grammarAccess.getGranjaAccess().getCENTRALITAKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0());
				}
				lv_tipo_3_0=ruleTipo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGranjaRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_3_0,
						"org.xtext.dsl.gratext.Gratext.Tipo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='Usuario:'
		{
			newLeafNode(otherlv_4, grammarAccess.getGranjaAccess().getUsuarioKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGranjaAccess().getUsuarioUsuarioParserRuleCall_5_0());
				}
				lv_usuario_5_0=ruleusuario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGranjaRule());
					}
					set(
						$current,
						"usuario",
						lv_usuario_5_0,
						"org.xtext.dsl.gratext.Gratext.usuario");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='Contrase\u00F1a:'
		{
			newLeafNode(otherlv_6, grammarAccess.getGranjaAccess().getContraseAKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGranjaAccess().getContrasenaContrasenaParserRuleCall_7_0());
				}
				lv_contrasena_7_0=rulecontrasena
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGranjaRule());
					}
					set(
						$current,
						"contrasena",
						lv_contrasena_7_0,
						"org.xtext.dsl.gratext.Gratext.contrasena");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='Dispositivos{'
		{
			newLeafNode(otherlv_8, grammarAccess.getGranjaAccess().getDispositivosKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_9_0());
				}
				lv_dispositivos_9_0=ruleDispositivos
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGranjaRule());
					}
					add(
						$current,
						"dispositivos",
						lv_dispositivos_9_0,
						"org.xtext.dsl.gratext.Gratext.Dispositivos");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleDispositivos
entryRuleDispositivos returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDispositivosRule()); }
	iv_ruleDispositivos=ruleDispositivos
	{ $current=$iv_ruleDispositivos.current; }
	EOF;

// Rule Dispositivos
ruleDispositivos returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Codigo:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDispositivosAccess().getCodigoKeyword_0());
		}
		(
			(
				lv_codigo_1_0=RULE_ID
				{
					newLeafNode(lv_codigo_1_0, grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDispositivosRule());
					}
					setWithLastConsumed(
						$current,
						"codigo",
						lv_codigo_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='Sensor'
		{
			newLeafNode(otherlv_2, grammarAccess.getDispositivosAccess().getSensorKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0());
				}
				lv_nombre_3_0=ruleTiposDispositivo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDispositivosRule());
					}
					set(
						$current,
						"nombre",
						lv_nombre_3_0,
						"org.xtext.dsl.gratext.Gratext.TiposDispositivo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDispositivosAccess().getTemperaturaEstadoEnumRuleCall_4_0());
				}
				lv_temperatura_4_0=ruleEstado
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDispositivosRule());
					}
					set(
						$current,
						"temperatura",
						lv_temperatura_4_0,
						"org.xtext.dsl.gratext.Gratext.Estado");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0());
				}
				lv_accion_5_0=ruleaccion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDispositivosRule());
					}
					set(
						$current,
						"accion",
						lv_accion_5_0,
						"org.xtext.dsl.gratext.Gratext.accion");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleaccion
entryRuleaccion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAccionRule()); }
	iv_ruleaccion=ruleaccion
	{ $current=$iv_ruleaccion.current; }
	EOF;

// Rule accion
ruleaccion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='quiero'
		{
			newLeafNode(otherlv_0, grammarAccess.getAccionAccess().getQuieroKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0());
				}
				lv_nombreAccion_1_0=ruleNombreAccion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAccionRule());
					}
					set(
						$current,
						"nombreAccion",
						lv_nombreAccion_1_0,
						"org.xtext.dsl.gratext.Gratext.NombreAccion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0());
				}
				lv_numero_2_0=rulenumero
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAccionRule());
					}
					set(
						$current,
						"numero",
						lv_numero_2_0,
						"org.xtext.dsl.gratext.Gratext.numero");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_descripcion_3_0=RULE_STRING
				{
					newLeafNode(lv_descripcion_3_0, grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAccionRule());
					}
					setWithLastConsumed(
						$current,
						"descripcion",
						lv_descripcion_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
	)
;

// Entry rule entryRulenumero
entryRulenumero returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumeroRule()); }
	iv_rulenumero=rulenumero
	{ $current=$iv_rulenumero.current.getText(); }
	EOF;

// Rule numero
rulenumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0());
			}
		)+
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNumeroAccess().getFullStopKeyword_1());
			}
		)?
		(
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2());
			}
		)*
	)
;

// Entry rule entryRuleusuario
entryRuleusuario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsuarioRule()); }
	iv_ruleusuario=ruleusuario
	{ $current=$iv_ruleusuario.current; }
	EOF;

// Rule usuario
ruleusuario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_usuario_0_0=RULE_ID
			{
				newLeafNode(lv_usuario_0_0, grammarAccess.getUsuarioAccess().getUsuarioIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUsuarioRule());
				}
				setWithLastConsumed(
					$current,
					"usuario",
					lv_usuario_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRulecontrasena
entryRulecontrasena returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContrasenaRule()); }
	iv_rulecontrasena=rulecontrasena
	{ $current=$iv_rulecontrasena.current; }
	EOF;

// Rule contrasena
rulecontrasena returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_contrasena_0_0=RULE_STRING
			{
				newLeafNode(lv_contrasena_0_0, grammarAccess.getContrasenaAccess().getContrasenaSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getContrasenaRule());
				}
				setWithLastConsumed(
					$current,
					"contrasena",
					lv_contrasena_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Rule Tipo
ruleTipo returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DELAVAL'
			{
				$current = grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SIEMENS'
			{
				$current = grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='TABLET'
			{
				$current = grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MOVIL'
			{
				$current = grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ORDENADOR'
			{
				$current = grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule TiposDispositivo
ruleTiposDispositivo returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='CAMARA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TEMPERATURA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='FUEGO_HUMO'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='CO2'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='GAS'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='PRESENCIA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='MAGNETICO'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='ROTURA_CRISTAL'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='BARRERA_SEGURIDAD'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='LUMINOSIDAD'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='EMERGENCIA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='INUNDACION'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='VIENTO'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='LLUVIA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13());
			}
		)
		    |
		(
			enumLiteral_14='ESTACION_METEOROLOGICA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_14, grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14());
			}
		)
		    |
		(
			enumLiteral_15='SISTEMA_IDENTIFICACION'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_15, grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15());
			}
		)
		    |
		(
			enumLiteral_16='INFRARROJOS'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_16, grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16());
			}
		)
		    |
		(
			enumLiteral_17='RADIOFRECUENCIA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_17, grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17());
			}
		)
		    |
		(
			enumLiteral_18='MECEDORA'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_18, grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18());
			}
		)
		    |
		(
			enumLiteral_19='PULSOMETRO_GANADO'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_19, grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19());
			}
		)
		    |
		(
			enumLiteral_20='DEPOSITO_LECHE'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_20, grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20());
			}
		)
		    |
		(
			enumLiteral_21='ROBOT_LIMPIADOR'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_21, grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21());
			}
		)
		    |
		(
			enumLiteral_22='NEVERAS'
			{
				$current = grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_22, grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22());
			}
		)
	)
;

// Rule NombreAccion
ruleNombreAccion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ABRIR'
			{
				$current = grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ENVIAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='SACAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='CERRAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ESTADO'
			{
				$current = grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='GRABAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='DETECTAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='ENCENDER'
			{
				$current = grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='APAGAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='AUMENTAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='DISMINUIR'
			{
				$current = grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='COMPROBAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='ACTIVAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='DESACTIVAR'
			{
				$current = grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13());
			}
		)
	)
;

// Rule Estado
ruleEstado returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='AMBIENTE'
			{
				$current = grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEstadoAccess().getAMBIENTEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='INTERNA'
			{
				$current = grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEstadoAccess().getINTERNAEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='NEVERA'
			{
				$current = grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEstadoAccess().getNEVERAEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MECEDORA'
			{
				$current = grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getEstadoAccess().getMECEDORAEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='DEPOSITO_LECHE'
			{
				$current = grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getEstadoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
