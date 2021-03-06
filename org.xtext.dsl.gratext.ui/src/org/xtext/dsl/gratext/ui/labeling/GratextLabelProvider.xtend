/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja
import org.xtext.dsl.gratext.gratext.accion
import org.xtext.dsl.gratext.gratext.login

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 * 
 * @author :Jose antonio de Benito Suarez
 * Clase utilizada para el esquema en linea que se muestra a la izquierda
 */
 
class GratextLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
/** Metodo para la inserccion de una imagen de la granja */
	// Labels and icons can be computed like this:
	def image(Granja gr) {
		'granja.GIF'
	}
/** Metodo para la inserccion de una texto de la granja */
	def text(Granja gr) {
		'Granja de ' + gr.nombreGranja + ' Tipo :' + gr.tipo
		
		
	}
/** Metodo para la inserccion del texto de dispositivo*/
	def text(Dispositivos i) {
		 'Dispositivos' +'(' + i.codigo + ')'
	}
	
	/** Metodo para la inserccion de una imagen de dispositivo*/
	def image(Dispositivos i) {
		'dispositivos.GIF'
	}
/** Metodo para la inserccion de una imagen de accion*/
	def image(accion numero) {
		'acciones.gif'
	}
/** Metodo para la inserccion de un texto de accion*/
	def text(accion accion) {
		'Accion : ' + accion.nombreAccion
		
		

	}
	
/** Metodo para la inserccion de una imagen de usuario o login*/
	def image(login user) {
		'usuario.gif'
	}
/** Metodo para la inserccion el texto de login o usuario*/
	def text(login user) {
		'Usuario:' + user.usuario
	}

//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
