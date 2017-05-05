/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja
import org.xtext.dsl.gratext.services.GratextGrammarAccess

class GratextFormatter extends AbstractFormatter2 {
	
	@Inject extension GratextGrammarAccess

	def dispatch void format(Granja granja, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		granja.append[autowrap(30)]
		granja.getUsuario.format;
		granja.getContrasena.format;
		granja.append[ML_COMMENTRule].append[newLines = 2];
		for (Dispositivos dispositivos : granja.getDispositivos()) {
			dispositivos.format;
		}
	}

	def dispatch void format(Dispositivos dispositivos, extension IFormattableDocument document) {
	 
	
		dispositivos.regionFor.keyword("Codigo :").append[newLine];
		dispositivos.getAccion.format;
	}
	
	// TODO: implement for 
}
