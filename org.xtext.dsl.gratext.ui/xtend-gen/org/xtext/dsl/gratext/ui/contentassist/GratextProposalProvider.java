/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ui.contentassist;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.dsl.gratext.gratext.Datos;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.numero;
import org.xtext.dsl.gratext.ui.contentassist.AbstractGratextProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 * 
 * @author :Jose antonio de Benito Suarez
 * Clase utilizada para el asistente de codigo completando
 */
@SuppressWarnings("all")
public class GratextProposalProvider extends AbstractGratextProposalProvider {
  /**
   * Metodo para completar el nombre de la granja y el tipo de centralita
   */
  @Override
  public void complete_Granja(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("Granja: NOMBRE_GRANJA\r\n\t\t\tCentralita: TIPO_DISPOSITIVO", context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para completar el login de un usuario
   */
  @Override
  public void complete_login(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("Usuario: NOMBRE_USUARIO\r\n\t\t Contraseņa: \'CONTRASEŅA\'", context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para completar los dispositivos simples sin numeros
   */
  @Override
  public void complete_Dispositivos(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("Codigo: CODIGO Sensor  NOMBRE_SENSOR quiero ACCION \'DESCRIPCION\' ", context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para completar el codigo y ayudar a la generacion del siguiente formato CODI1
   */
  public void completeDispositivos_Codigo(final Dispositivos i, final Assignment a, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EObject _eContainer = i.eContainer();
    Granja r = ((Granja) _eContainer);
    int _size = IterableExtensions.size(Iterables.<Dispositivos>filter(r.getDispositivos(), Dispositivos.class));
    String id = ("CODI" + Integer.valueOf(_size));
    ICompletionProposal propuesta = this.createCompletionProposal(id, context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para completar el numero y el dato
   */
  @Override
  public void complete_numero(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal(" 0  DATO", context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para insertar un numero
   */
  @Override
  public void complete_idNumero(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("0.0", context);
    acceptor.accept(propuesta);
  }
  
  /**
   * Metodo para completar la descripcion de un dispositivo
   */
  @Override
  public void completeAccion_Descripcion(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EObject _eContainer = model.eContainer();
    Dispositivos r = ((Dispositivos) _eContainer);
    NombreAccion _nombreAccion = r.getAccion().getNombreAccion();
    String _plus = ("\' " + _nombreAccion);
    String _plus_1 = (_plus + " el/la ");
    TiposDispositivo _nombre = r.getNombre();
    String _plus_2 = (_plus_1 + _nombre);
    String descripcion = (_plus_2 + "\'");
    numero _numero = r.getAccion().getNumero();
    boolean _notEquals = (!Objects.equal(_numero, null));
    if (_notEquals) {
      NombreAccion _nombreAccion_1 = r.getAccion().getNombreAccion();
      String _plus_3 = ("\' " + _nombreAccion_1);
      String _idNumero = r.getAccion().getNumero().getIdNumero();
      String _plus_4 = (_plus_3 + _idNumero);
      String _plus_5 = (_plus_4 + " ");
      Datos _datos = r.getAccion().getNumero().getDatos();
      String _plus_6 = (_plus_5 + _datos);
      String _plus_7 = (_plus_6 + " del dispositivo ");
      TiposDispositivo _nombre_1 = r.getNombre();
      String _plus_8 = (_plus_7 + _nombre_1);
      String _plus_9 = (_plus_8 + "\'");
      descripcion = _plus_9;
    }
    ICompletionProposal propuesta = this.createCompletionProposal(descripcion, context);
    acceptor.accept(propuesta);
  }
}
