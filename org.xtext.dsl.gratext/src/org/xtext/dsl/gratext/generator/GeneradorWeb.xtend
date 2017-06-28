package org.xtext.dsl.gratext.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja
/**
 * @author : Jose antonio de Benito Suarez
 * Clase creada para generar el fichero de salida de xml
 */
class GeneradorWeb {
/** Componentes Resource y IFileSystem acces extendidos del generator  */
	Resource resource;
	IFileSystemAccess2 fsa;
/** Atributos necesarios para transmitir fichero xml */
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

/**
				 * Metodo compilar definido para la generacion del fichero de salida recorriendo el arbol
				 * generado por el programa y llamando a compilarGranja 
				 */
	def compilar() {
		// Salida a un Archivo TXT con informacion de los ingredientes
		// var sb = new StringBuilder();
		for (r : resource.allContents.toIterable.filter(typeof(Granja))) {
			compilarTexto(r);
			identificadores++;
		}

	}
/**
	 * Metodo compilar granja el cual recibe un argumento de tipo granja para generar la ruta de salida
	 * del fichero y llamar otro metodo que saque los valores
	 */
	// def int compilarTexto(Ingredientes ingredientes)
	def compilarTexto(Granja granja) '''
«fsa.generateFile("scripts/granja_gen.xml",compilarGranja(granja))»;
		'''
/**
	 * Metodo compilar granja el cual recibe un argumento de tipo granja y saca los valores de los dispositivos.
	 */
	def compilarGranja(Granja r) '''
		<registro>
			<dispositivo>
			<dispositivo_id>dispositivo«identificadores»</dispositivo_id>
			<dispositivo_descripcion>Es el «r.tipo»</dispositivo_descripcion>
			</dispositivo>
			
				«compilarDispositivos(r.dispositivos)»
		
			</registro>
	'''
/** Metodo encargado de sacar las acciones o servidos de los dispositivos */
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
/** Metodo encargado de sacar servicios */
	def compilarDispositivo(Dispositivos i) '''
		
			<idservicio>dispositivoServicio«identificadores»-«identificador_servicio++»</idservicio>
			<descripcion>«i.nombre»</descripcion>
			<enviaTipo>«serviciosConDatos(i)»<enviaTipo>
			
			
	'''
/** Metodo que comprueba el tipo de datos a sacar por el servicio*/
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

/** Metodo que saca las acciones de los dispositivos */
	def compilarAccion(Dispositivos i) '''
		
		<id_action> dispositivoAccion«identificadores»-«identificador_accion++»</id_action>
		<action_name>«i.nombre»</action_name>
		«IF i.accion.descripcion!= null»
			<action_descripcion>«i.accion.descripcion»</action_descripcion>
		«ELSE»
			<action_descripcion>«i.accion.nombreAccion»</action_descripcion>
		«ENDIF»
		«IF i.accion.numero!= null»
			<has_menssage>«comprobarNumero(i.accion.numero.idNumero)»</has_message>
		«ELSE»
			<has_menssage>-</has_message>
		«ENDIF»
	'''

/** Comprobador de numeros si son de tipo flotante o entero */
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
