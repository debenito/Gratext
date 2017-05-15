/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.Tipo;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.gratext.login;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class GratextLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GratextLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String image(final Granja gr) {
    return "granja.GIF";
  }
  
  public String text(final Granja gr) {
    String _nombreGranja = gr.getNombreGranja();
    String _plus = ("Granja de" + _nombreGranja);
    String _plus_1 = (_plus + " Tipo :");
    Tipo _tipo = gr.getTipo();
    return (_plus_1 + _tipo);
  }
  
  public String text(final Dispositivos i) {
    String _codigo = i.getCodigo();
    String _plus = (("Dispositivos" + "(") + _codigo);
    return (_plus + ")");
  }
  
  public String image(final Dispositivos i) {
    return "dispositivos.GIF";
  }
  
  public String image(final accion numero) {
    return "acciones.gif";
  }
  
  public String text(final accion accion) {
    NombreAccion _nombreAccion = accion.getNombreAccion();
    return ("Accion : " + _nombreAccion);
  }
  
  public String image(final login user) {
    return "usuario.gif";
  }
  
  public String text(final login user) {
    String _usuario = user.getUsuario();
    return ("Usuario:" + _usuario);
  }
}
