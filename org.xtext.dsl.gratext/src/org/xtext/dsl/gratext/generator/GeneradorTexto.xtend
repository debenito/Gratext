package org.xtext.dsl.gratext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.dsl.gratext.gratext.Dispositivos

class GeneradorTexto {
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
	def compilar(){
		// Salida a un Archivo TXT con informacion de los ingredientes
		var sb = new StringBuilder();
		for(i: resource.allContents.toIterable.filter(typeof (Dispositivos))){
		sb.append(i.compilarTexto)	
		}
		fsa.generateFile('granja.txt',sb.toString);
	}
	
	//def int compilarTexto(Ingredientes ingredientes)
	def compilarTexto(Dispositivos i)'''
		Dispositivo: «i.nombre» con el siguiente codigo del dispositivo «i.codigo»
		
	«IF i.temperatura != null »
	Se desea «i.accion.nombreAccion» la temperatura del : «i.temperatura» 
	«ENDIF»
	«IF i.temperatura == null»
	Se desea la siguiente accion «i.accion.nombreAccion»  
	«ENDIF»
	«IF i.accion.numero != null»
		"Con el siguiente valor:"«i.accion.numero»
		«ENDIF»
		«IF i.accion.descripcion != null»
		El dispositivo contiene la siguiente descripcion: «i.accion.descripcion»
		«ENDIF»
		
		
	'''
	
	
	
	
	
	
	
	
}
