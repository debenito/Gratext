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
			compilarTexto(r);
			identificadores++;
		}

	}

	// def int compilarTexto(Ingredientes ingredientes)
	def compilarTexto(Granja granja) '''
«fsa.generateFile("scripts/granja_gen.xml",compilarGranja(granja))»;
		'''

	def compilarGranja(Granja r) '''
		<registro>
			<dispositivo>
			<dispositivo_id>dispositivo«identificadores»</dispositivo_id>
			<dispositivo_descripcion>Es el «r.tipo»</dispositivo_descripcion>
			</dispositivo>
			
				«compilarDispositivos(r.dispositivos)»
		
			</registro>
	'''

	 def compilarDispositivos(List<Dispositivos> dispositivos) '''
		
		
		«FOR d : dispositivos»
			«IF (d.accion.nombreAccion.getName.equals("ESTADO"))»
				<servicio>
				«d.compilarDispositivo»
				
				</servicio>
			«ELSE»
			<action>
						«d.compilarAccion»
						
			</action>
			«ENDIF»
		«ENDFOR»
		
		
	'''

	def compilarDispositivo(Dispositivos i) '''
		
			<idservicio>dispositivoServicio«identificadores»-«identificador_servicio++»</idservicio>
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

		<id_action> dispositivoAccion«identificadores»-«identificador_accion++»</id_action>
		<action_name>«i.nombre»</action_name>
		«IF i.accion.descripcion!= null»
		<action_descripcion>«i.accion.descripcion»</action_descripcion>
		«ELSE»
		<action_descripcion>«i.accion.nombreAccion»</action_descripcion>
		«ENDIF»
		«IF i.accion.numero!= null»
		<has_menssage>«comprobarNumero(i.accion.numero)»</has_message>
		«ELSE»
			<has_menssage>-</has_message>
		«ENDIF»
	'''

	def comprobarNumero(String numero) {
		
		while (i < numero.length) {
			 if (!Character.isDigit(numero.charAt(i))) {

				return "float";
			}
			i++;
		}
		i = 0;

		return "int"
	}
 
}
