package org.xtext.dsl.gratext.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl;

public class GratextOnlineTransformer extends DefaultOutlineTreeProvider {

	@Override
	protected void createNode(IOutlineNode parent, EObject modelElement) {
		if(modelElement instanceof Granja){
			createEObjectNode(parent, modelElement);
			
		//super.createNode(parent, modelElement);
	} else if(modelElement instanceof Dispositivos){
		createEObjectNode(parent, modelElement);
		int posicion = parent.getChildren().size()-1;
		IOutlineNode nodoActual =parent.getChildren().get(posicion);
		
		Dispositivos dispositivo = (Dispositivos) modelElement;
		EAttribute codigo = GratextPackageImpl.eINSTANCE.getDispositivos_Codigo();
		codigo.setDefaultValue(dispositivo.getCodigo());
		codigo.setName("Codigo : "+ dispositivo.getCodigo());
		createEObjectNode(nodoActual, codigo);
		

		EAttribute nombre = GratextPackageImpl.eINSTANCE.getDispositivos_Nombre();
		nombre.setDefaultValue(dispositivo.getNombre());
		nombre.setName("Nombre : "+ dispositivo.getNombre());
		createEObjectNode(nodoActual, nombre);
		
		if(dispositivo.getTemperatura()!= null){
		EAttribute temp = GratextPackageImpl.eINSTANCE.getDispositivos_Temperatura();
		temp.setDefaultValue(dispositivo.getTemperatura());
		temp.setName("Temperatura"+ dispositivo.getTemperatura());
		createEObjectNode(nodoActual, temp);
		}
		
		EAttribute nombreAccion = GratextPackageImpl.eINSTANCE.getaccion_NombreAccion();
		nombreAccion.setDefaultValue(dispositivo.getAccion().getNombreAccion());
		nombreAccion.setName("Accion : "+ dispositivo.getAccion().getNombreAccion());
		createEObjectNode(nodoActual, nombreAccion);
		
		if(dispositivo.getAccion().getDescripcion() != null){
		EAttribute nombreDescripcion = GratextPackageImpl.eINSTANCE.getaccion_Descripcion();
		nombreDescripcion.setDefaultValue(dispositivo.getAccion().getDescripcion());
		nombreDescripcion.setName("Descripcion : "+ dispositivo.getAccion().getDescripcion());
		createEObjectNode(nodoActual, nombreDescripcion);
		}
		
	}
	
	
	

}
}
