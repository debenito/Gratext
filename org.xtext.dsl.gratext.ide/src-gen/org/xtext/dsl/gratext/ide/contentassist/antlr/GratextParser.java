/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.dsl.gratext.ide.contentassist.antlr.internal.InternalGratextParser;
import org.xtext.dsl.gratext.services.GratextGrammarAccess;

public class GratextParser extends AbstractContentAssistParser {

	@Inject
	private GratextGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGratextParser createParser() {
		InternalGratextParser result = new InternalGratextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTipoAccess().getAlternatives(), "rule__Tipo__Alternatives");
					put(grammarAccess.getTiposDispositivoAccess().getAlternatives(), "rule__TiposDispositivo__Alternatives");
					put(grammarAccess.getNombreAccionAccess().getAlternatives(), "rule__NombreAccion__Alternatives");
					put(grammarAccess.getEstadoAccess().getAlternatives(), "rule__Estado__Alternatives");
					put(grammarAccess.getGranjaAccess().getGroup(), "rule__Granja__Group__0");
					put(grammarAccess.getDispositivosAccess().getGroup(), "rule__Dispositivos__Group__0");
					put(grammarAccess.getAccionAccess().getGroup(), "rule__Accion__Group__0");
					put(grammarAccess.getNumeroAccess().getGroup(), "rule__Numero__Group__0");
					put(grammarAccess.getGranjaAccess().getNameAssignment_1(), "rule__Granja__NameAssignment_1");
					put(grammarAccess.getGranjaAccess().getTipoAssignment_3(), "rule__Granja__TipoAssignment_3");
					put(grammarAccess.getGranjaAccess().getUsuarioAssignment_5(), "rule__Granja__UsuarioAssignment_5");
					put(grammarAccess.getGranjaAccess().getContrasenaAssignment_7(), "rule__Granja__ContrasenaAssignment_7");
					put(grammarAccess.getGranjaAccess().getDispositivosAssignment_9(), "rule__Granja__DispositivosAssignment_9");
					put(grammarAccess.getDispositivosAccess().getCodigoAssignment_1(), "rule__Dispositivos__CodigoAssignment_1");
					put(grammarAccess.getDispositivosAccess().getNombreAssignment_3(), "rule__Dispositivos__NombreAssignment_3");
					put(grammarAccess.getDispositivosAccess().getTemperaturaAssignment_4(), "rule__Dispositivos__TemperaturaAssignment_4");
					put(grammarAccess.getDispositivosAccess().getAccionAssignment_5(), "rule__Dispositivos__AccionAssignment_5");
					put(grammarAccess.getAccionAccess().getNombreAccionAssignment_1(), "rule__Accion__NombreAccionAssignment_1");
					put(grammarAccess.getAccionAccess().getNumeroAssignment_2(), "rule__Accion__NumeroAssignment_2");
					put(grammarAccess.getAccionAccess().getDescripcionAssignment_3(), "rule__Accion__DescripcionAssignment_3");
					put(grammarAccess.getUsuarioAccess().getUsuarioAssignment(), "rule__Usuario__UsuarioAssignment");
					put(grammarAccess.getContrasenaAccess().getContrasenaAssignment(), "rule__Contrasena__ContrasenaAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGratextParser typedParser = (InternalGratextParser) parser;
			typedParser.entryRuleGranja();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GratextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GratextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
