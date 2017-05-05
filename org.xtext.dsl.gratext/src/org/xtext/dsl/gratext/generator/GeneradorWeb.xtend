package org.xtext.dsl.gratext.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja

class GeneradorWeb {
	Resource resource;
	IFileSystemAccess2 fsa;

	int identificadores;
	int identificador_servicio;
	int identificador_accion;
	int i = 0;

	new(Resource resource, IFileSystemAccess2 fsa) {
		this.fsa = fsa;
		this.resource = resource;
		this.identificadores = 0;
		this.identificador_servicio = 0;
		this.identificador_accion = 0;
		
	}

	def compilar() {
		// Salida a un Archivo TXT con informacion de los ingredientes
		// var sb = new StringBuilder();
		for (r : resource.allContents.toIterable.filter(typeof(Granja))) {
			r.compilarTexto;
			identificadores++;
		}

	}

	// def int compilarTexto(Ingredientes ingredientes)
	def compilarTexto(Granja granja) '''
«fsa.generateFile("scripts/granja.xml",compilarGranja(granja))»;
		'''

	def compilarGranja(Granja r) '''
		var code = '<registro>\
			<dispositivo>\
			<dispositivo_id>dispositivo«identificadores»<dispositivo_id>
			<dispositivo_descripcion>Es el «r.name»</dispositivo_descripcion>
			</dispositivo>\
			
				«compilarDispositivos(r.dispositivos)»
		
			</registro>'
	'''

	def compilarDispositivos(List<Dispositivos> dispositivos) '''
		
		
		«FOR d : dispositivos»
			«IF (d.accion.nombreAccion.equals("ESTADO"))»
				<servicio>/
				«d.compilarDispositivo»
				«identificador_servicio++»
				</servicio>
			«ENDIF»
			<action>/
			«d.compilarAccion»
			«identificador_accion++»
			</action>
		«ENDFOR»
		
		
	'''

	def compilarDispositivo(Dispositivos i) '''
		
			<idservicio>dispositivo«identificadores»-«identificador_servicio»</idservicio>
			<descripcion>«i.nombre»</descripcion>
			<enviaTipo>«serviciosConDatos(i)»<enviaTipo>
			
			
	'''

	def serviciosConDatos(Dispositivos dispositivo) {
		if (dispositivo.nombre.getName.equals("DEPOSITO_LECHE") || dispositivo.nombre.getName.equals("FUEGO_HUMO") ||
			dispositivo.nombre.getName.equals("ESTACION_METEOROLOGICA") || dispositivo.nombre.getName.equals("CO2"))
			return "float"
		else if (dispositivo.nombre.getName.equals("EMERGENCIA") || dispositivo.nombre.getName.equals("VIENTO")) {
			return "int"
		} else if (dispositivo.nombre.getName.equals("INUNDACION") ||
			dispositivo.nombre.getName.equals("ROTURA_CRISTAL") || dispositivo.nombre.getName.equals("LLUVIA")) {
			return "boolean"
		} else {
			return "-"
		}

	}

	def compilarAccion(Dispositivos i) '''
		<action>/
		<id_action> «identificadores»-«identificador_accion»</id_action>
		<action_name>«i.accion.nombreAccion»</action_name>
		«IF i.accion.descripcion != null || !i.accion.descripcion.empty»
			<action_descripcion>«i.accion.descripcion»</action_descripcion>
		«ELSE»
			<action_descripcion>«i.accion.nombreAccion»</action_descripcion>
		«ENDIF»
		«IF i.accion.numero != null || !i.accion.numero.empty»
			<has_menssage>«comprobarNumero(i.accion.numero)»</has_message>
			«ELSE»
			<has_menssage>-</has_message>
			«ENDIF»
		
	'''

	def comprobarNumero(String numero) {
		while (i < numero.length) {
			if (numero.charAt(i).equals(".")) {
				return "float";
			} else if (!Character.isDigit(numero.charAt(i))) {

				return "-";
			}
			i++;
		}
		i = 0;

		return "int"
	}

}
