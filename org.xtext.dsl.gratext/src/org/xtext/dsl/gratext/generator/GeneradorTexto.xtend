package org.xtext.dsl.gratext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja
/**
 * @author : Jose antonio de Benito Suarez
 * Clase creada para generar el fichero de salida de texto
 */
class GeneradorTexto {
	/** Componentes Resource y IFileSystem acces extendidos del generator  */
	Resource resource;
	IFileSystemAccess2 fsa;

	new (Resource resource, IFileSystemAccess2 fsa){
		this.fsa=fsa;
		this.resource=resource;
		
	}
	
	/*fsa.generateFile('granja.txt', 'Dispositivos de la granja: ' + 
			resource.allContents
				.filter(typeof(Granja))
								.map[name]
				.join(', '))*/
				/**
				 * Metodo compilar definido para la generacion del fichero de salida recorriendo el arbol
				 * generado por el programa y llamando a compilarGranja 
				 */
	def compilar(){
		// Salida a un Archivo TXT con informacion de los ingredientes
	
		var sb = new StringBuilder();
			var time_start = System.currentTimeMillis();
		for(i: resource.allContents.toIterable.filter(typeof (Granja))){
			

		sb.append(compilarGranja(i))
		}
		fsa.generateFile('granja.txt',sb.toString);
		var time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");	
		
	}
	
	//def int compilarTexto(Ingredientes ingredientes)
	/**
	 * Metodo compilar granja el cual recibe un argumento de tipo granja y saca los valores  de la misma.
	 */
	def compilarGranja(Granja granja)'''
		 nombre:«granja.nombreGranja»
		 centralita:«granja.tipo»
		«IF granja.login!= null»
			usuario:«granja.login.usuario» 
			contraseña: «granja.login.contrasena»
		«ENDIF»
		«FOR i: granja.dispositivos»
			«compilarTexto(i)»
		«ENDFOR»
	'''
	
	/**
	 * Metodo definido para sacar los valores de un dispositivo.
	 * Tiene un parametro de entrada que es de tipo dispotitivo
	 */
	def compilarTexto(Dispositivos i)'''
		Dispositivo: «i.nombre» 
		codigo: «i.codigo»	
		«IF i.temperatura != null »
			accion: «i.accion.nombreAccion» 
			temperatura : «i.temperatura» 
		«ENDIF»
		«IF i.temperatura == null»
			accion: «i.accion.nombreAccion»  
		«ENDIF»
		«IF i.accion.numero != null»
			numero: «i.accion.numero.idNumero» 
			datos:«i.accion.numero.datos»
			«ENDIF»
			«IF i.accion.descripcion != null»
			descripcion: «i.accion.descripcion»
			«ENDIF»
			
			
	'''
	
	
	
	
	
	
	
	
}
