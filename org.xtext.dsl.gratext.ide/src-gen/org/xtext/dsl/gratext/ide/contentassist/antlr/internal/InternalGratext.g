/*
 * generated by Xtext 2.10.0
 */
grammar InternalGratext;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.dsl.gratext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleGranja
entryRuleGranja
:
{ before(grammarAccess.getGranjaRule()); }
	 ruleGranja
{ after(grammarAccess.getGranjaRule()); } 
	 EOF 
;

// Rule Granja
ruleGranja 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGranjaAccess().getGroup()); }
		(rule__Granja__Group__0)
		{ after(grammarAccess.getGranjaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulelogin
entryRulelogin
:
{ before(grammarAccess.getLoginRule()); }
	 rulelogin
{ after(grammarAccess.getLoginRule()); } 
	 EOF 
;

// Rule login
rulelogin 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoginAccess().getGroup()); }
		(rule__Login__Group__0)
		{ after(grammarAccess.getLoginAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDispositivos
entryRuleDispositivos
:
{ before(grammarAccess.getDispositivosRule()); }
	 ruleDispositivos
{ after(grammarAccess.getDispositivosRule()); } 
	 EOF 
;

// Rule Dispositivos
ruleDispositivos 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDispositivosAccess().getGroup()); }
		(rule__Dispositivos__Group__0)
		{ after(grammarAccess.getDispositivosAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleaccion
entryRuleaccion
:
{ before(grammarAccess.getAccionRule()); }
	 ruleaccion
{ after(grammarAccess.getAccionRule()); } 
	 EOF 
;

// Rule accion
ruleaccion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAccionAccess().getGroup()); }
		(rule__Accion__Group__0)
		{ after(grammarAccess.getAccionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulenumero
entryRulenumero
:
{ before(grammarAccess.getNumeroRule()); }
	 rulenumero
{ after(grammarAccess.getNumeroRule()); } 
	 EOF 
;

// Rule numero
rulenumero 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumeroAccess().getGroup()); }
		(rule__Numero__Group__0)
		{ after(grammarAccess.getNumeroAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Tipo
ruleTipo
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoAccess().getAlternatives()); }
		(rule__Tipo__Alternatives)
		{ after(grammarAccess.getTipoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TiposDispositivo
ruleTiposDispositivo
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getAlternatives()); }
		(rule__TiposDispositivo__Alternatives)
		{ after(grammarAccess.getTiposDispositivoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule NombreAccion
ruleNombreAccion
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNombreAccionAccess().getAlternatives()); }
		(rule__NombreAccion__Alternatives)
		{ after(grammarAccess.getNombreAccionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tipo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); }
		('DELAVAL')
		{ after(grammarAccess.getTipoAccess().getDELAVALEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); }
		('SIEMENS')
		{ after(grammarAccess.getTipoAccess().getSIEMENSEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); }
		('TABLET')
		{ after(grammarAccess.getTipoAccess().getTABLETEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); }
		('MOVIL')
		{ after(grammarAccess.getTipoAccess().getMOVILEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); }
		('ORDENADOR')
		{ after(grammarAccess.getTipoAccess().getORDENADOREnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TiposDispositivo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); }
		('CAMARA')
		{ after(grammarAccess.getTiposDispositivoAccess().getCAMARAEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); }
		('TEMPERATURA')
		{ after(grammarAccess.getTiposDispositivoAccess().getTEMPERATURAEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); }
		('FUEGO_HUMO')
		{ after(grammarAccess.getTiposDispositivoAccess().getFUEGO_HUMOEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); }
		('CO2')
		{ after(grammarAccess.getTiposDispositivoAccess().getCO2EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); }
		('GAS')
		{ after(grammarAccess.getTiposDispositivoAccess().getGASEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); }
		('PRESENCIA')
		{ after(grammarAccess.getTiposDispositivoAccess().getPRESENCIAEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); }
		('MAGNETICO')
		{ after(grammarAccess.getTiposDispositivoAccess().getMAGNETICOEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); }
		('ROTURA_CRISTAL')
		{ after(grammarAccess.getTiposDispositivoAccess().getROTURA_CRISTALEnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); }
		('BARRERA_SEGURIDAD')
		{ after(grammarAccess.getTiposDispositivoAccess().getBARRERA_SEGURIDADEnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); }
		('LUMINOSIDAD')
		{ after(grammarAccess.getTiposDispositivoAccess().getLUMINOSIDADEnumLiteralDeclaration_9()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); }
		('EMERGENCIA')
		{ after(grammarAccess.getTiposDispositivoAccess().getEMERGENCIAEnumLiteralDeclaration_10()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); }
		('INUNDACION')
		{ after(grammarAccess.getTiposDispositivoAccess().getINUNDACIONEnumLiteralDeclaration_11()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); }
		('VIENTO')
		{ after(grammarAccess.getTiposDispositivoAccess().getVIENTOEnumLiteralDeclaration_12()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); }
		('LLUVIA')
		{ after(grammarAccess.getTiposDispositivoAccess().getLLUVIAEnumLiteralDeclaration_13()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); }
		('ESTACION_METEOROLOGICA')
		{ after(grammarAccess.getTiposDispositivoAccess().getESTACION_METEOROLOGICAEnumLiteralDeclaration_14()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); }
		('SISTEMA_IDENTIFICACION')
		{ after(grammarAccess.getTiposDispositivoAccess().getSISTEMA_IDENTIFICACIONEnumLiteralDeclaration_15()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); }
		('INFRARROJOS')
		{ after(grammarAccess.getTiposDispositivoAccess().getINFRARROJOSEnumLiteralDeclaration_16()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); }
		('RADIOFRECUENCIA')
		{ after(grammarAccess.getTiposDispositivoAccess().getRADIOFRECUENCIAEnumLiteralDeclaration_17()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); }
		('MECEDORA')
		{ after(grammarAccess.getTiposDispositivoAccess().getMECEDORAEnumLiteralDeclaration_18()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); }
		('PULSOMETRO_GANADO')
		{ after(grammarAccess.getTiposDispositivoAccess().getPULSOMETRO_GANADOEnumLiteralDeclaration_19()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); }
		('DEPOSITO_LECHE')
		{ after(grammarAccess.getTiposDispositivoAccess().getDEPOSITO_LECHEEnumLiteralDeclaration_20()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); }
		('ROBOT_LIMPIADOR')
		{ after(grammarAccess.getTiposDispositivoAccess().getROBOT_LIMPIADOREnumLiteralDeclaration_21()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); }
		('NEVERAS')
		{ after(grammarAccess.getTiposDispositivoAccess().getNEVERASEnumLiteralDeclaration_22()); }
	)
	|
	(
		{ before(grammarAccess.getTiposDispositivoAccess().getLUZEnumLiteralDeclaration_23()); }
		('LUZ')
		{ after(grammarAccess.getTiposDispositivoAccess().getLUZEnumLiteralDeclaration_23()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NombreAccion__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); }
		('ABRIR')
		{ after(grammarAccess.getNombreAccionAccess().getABRIREnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); }
		('ENVIAR')
		{ after(grammarAccess.getNombreAccionAccess().getENVIAREnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); }
		('SACAR')
		{ after(grammarAccess.getNombreAccionAccess().getSACAREnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); }
		('CERRAR')
		{ after(grammarAccess.getNombreAccionAccess().getCERRAREnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); }
		('ESTADO')
		{ after(grammarAccess.getNombreAccionAccess().getESTADOEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); }
		('GRABAR')
		{ after(grammarAccess.getNombreAccionAccess().getGRABAREnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); }
		('DETECTAR')
		{ after(grammarAccess.getNombreAccionAccess().getDETECTAREnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); }
		('ENCENDER')
		{ after(grammarAccess.getNombreAccionAccess().getENCENDEREnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); }
		('APAGAR')
		{ after(grammarAccess.getNombreAccionAccess().getAPAGAREnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); }
		('AUMENTAR')
		{ after(grammarAccess.getNombreAccionAccess().getAUMENTAREnumLiteralDeclaration_9()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); }
		('DISMINUIR')
		{ after(grammarAccess.getNombreAccionAccess().getDISMINUIREnumLiteralDeclaration_10()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); }
		('COMPROBAR')
		{ after(grammarAccess.getNombreAccionAccess().getCOMPROBAREnumLiteralDeclaration_11()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); }
		('ACTIVAR')
		{ after(grammarAccess.getNombreAccionAccess().getACTIVAREnumLiteralDeclaration_12()); }
	)
	|
	(
		{ before(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); }
		('DESACTIVAR')
		{ after(grammarAccess.getNombreAccionAccess().getDESACTIVAREnumLiteralDeclaration_13()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__0__Impl
	rule__Granja__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getGranjaKeyword_0()); }
	'Granja:'
	{ after(grammarAccess.getGranjaAccess().getGranjaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__1__Impl
	rule__Granja__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getNombreGranjaAssignment_1()); }
	(rule__Granja__NombreGranjaAssignment_1)
	{ after(grammarAccess.getGranjaAccess().getNombreGranjaAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__2__Impl
	rule__Granja__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getCentralitaKeyword_2()); }
	'Centralita:'
	{ after(grammarAccess.getGranjaAccess().getCentralitaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__3__Impl
	rule__Granja__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getTipoAssignment_3()); }
	(rule__Granja__TipoAssignment_3)
	{ after(grammarAccess.getGranjaAccess().getTipoAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__4__Impl
	rule__Granja__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getLoginAssignment_4()); }
	(rule__Granja__LoginAssignment_4)?
	{ after(grammarAccess.getGranjaAccess().getLoginAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__5__Impl
	rule__Granja__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getDispositivosKeyword_5()); }
	'Dispositivos{'
	{ after(grammarAccess.getGranjaAccess().getDispositivosKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__6__Impl
	rule__Granja__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getDispositivosAssignment_6()); }
	(rule__Granja__DispositivosAssignment_6)*
	{ after(grammarAccess.getGranjaAccess().getDispositivosAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Granja__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getGranjaAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Login__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Login__Group__0__Impl
	rule__Login__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccess().getUsuarioKeyword_0()); }
	'Usuario:'
	{ after(grammarAccess.getLoginAccess().getUsuarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Login__Group__1__Impl
	rule__Login__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccess().getUsuarioAssignment_1()); }
	(rule__Login__UsuarioAssignment_1)
	{ after(grammarAccess.getLoginAccess().getUsuarioAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Login__Group__2__Impl
	rule__Login__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccess().getContraseAKeyword_2()); }
	'Contrase\u00F1a:'
	{ after(grammarAccess.getLoginAccess().getContraseAKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Login__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccess().getContrasenaAssignment_3()); }
	(rule__Login__ContrasenaAssignment_3)
	{ after(grammarAccess.getLoginAccess().getContrasenaAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Dispositivos__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__0__Impl
	rule__Dispositivos__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); }
	'Codigo:'
	{ after(grammarAccess.getDispositivosAccess().getCodigoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__1__Impl
	rule__Dispositivos__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); }
	(rule__Dispositivos__CodigoAssignment_1)
	{ after(grammarAccess.getDispositivosAccess().getCodigoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__2__Impl
	rule__Dispositivos__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); }
	'Sensor'
	{ after(grammarAccess.getDispositivosAccess().getSensorKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__3__Impl
	rule__Dispositivos__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); }
	(rule__Dispositivos__NombreAssignment_3)
	{ after(grammarAccess.getDispositivosAccess().getNombreAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__4__Impl
	rule__Dispositivos__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); }
	(rule__Dispositivos__TemperaturaAssignment_4)?
	{ after(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dispositivos__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); }
	(rule__Dispositivos__AccionAssignment_5)
	{ after(grammarAccess.getDispositivosAccess().getAccionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Accion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Accion__Group__0__Impl
	rule__Accion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccionAccess().getQuieroKeyword_0()); }
	'quiero'
	{ after(grammarAccess.getAccionAccess().getQuieroKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Accion__Group__1__Impl
	rule__Accion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); }
	(rule__Accion__NombreAccionAssignment_1)
	{ after(grammarAccess.getAccionAccess().getNombreAccionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Accion__Group__2__Impl
	rule__Accion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccionAccess().getNumeroAssignment_2()); }
	(rule__Accion__NumeroAssignment_2)?
	{ after(grammarAccess.getAccionAccess().getNumeroAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Accion__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); }
	(rule__Accion__DescripcionAssignment_3)?
	{ after(grammarAccess.getAccionAccess().getDescripcionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Numero__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Numero__Group__0__Impl
	rule__Numero__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Numero__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); }
		(RULE_INT)
		{ after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); }
	)
	(
		{ before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); }
		(RULE_INT)*
		{ after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Numero__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Numero__Group__1__Impl
	rule__Numero__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Numero__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); }
	('.')?
	{ after(grammarAccess.getNumeroAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Numero__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Numero__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Numero__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); }
	(RULE_INT)*
	{ after(grammarAccess.getNumeroAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Granja__NombreGranjaAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGranjaAccess().getNombreGranjaIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGranjaAccess().getNombreGranjaIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__TipoAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0()); }
		ruleTipo
		{ after(grammarAccess.getGranjaAccess().getTipoTipoEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__LoginAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGranjaAccess().getLoginLoginParserRuleCall_4_0()); }
		rulelogin
		{ after(grammarAccess.getGranjaAccess().getLoginLoginParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Granja__DispositivosAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_6_0()); }
		ruleDispositivos
		{ after(grammarAccess.getGranjaAccess().getDispositivosDispositivosParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__UsuarioAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccess().getUsuarioIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLoginAccess().getUsuarioIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Login__ContrasenaAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccess().getContrasenaSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getLoginAccess().getContrasenaSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__CodigoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDispositivosAccess().getCodigoIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__NombreAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0()); }
		ruleTiposDispositivo
		{ after(grammarAccess.getDispositivosAccess().getNombreTiposDispositivoEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__TemperaturaAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDispositivosAccess().getTemperaturaSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDispositivosAccess().getTemperaturaSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dispositivos__AccionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0()); }
		ruleaccion
		{ after(grammarAccess.getDispositivosAccess().getAccionAccionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__NombreAccionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0()); }
		ruleNombreAccion
		{ after(grammarAccess.getAccionAccess().getNombreAccionNombreAccionEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__NumeroAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0()); }
		rulenumero
		{ after(grammarAccess.getAccionAccess().getNumeroNumeroParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Accion__DescripcionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getAccionAccess().getDescripcionSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
