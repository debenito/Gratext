/**
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.gratext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Granja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getNombreGranja <em>Nombre Granja</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getLogin <em>Login</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getDispositivos <em>Dispositivos</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja()
 * @model
 * @generated
 */
public interface Granja extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre Granja</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre Granja</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre Granja</em>' attribute.
   * @see #setNombreGranja(String)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_NombreGranja()
   * @model
   * @generated
   */
  String getNombreGranja();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getNombreGranja <em>Nombre Granja</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre Granja</em>' attribute.
   * @see #getNombreGranja()
   * @generated
   */
  void setNombreGranja(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.dsl.gratext.gratext.Tipo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.Tipo
   * @see #setTipo(Tipo)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Tipo()
   * @model
   * @generated
   */
  Tipo getTipo();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.Tipo
   * @see #getTipo()
   * @generated
   */
  void setTipo(Tipo value);

  /**
   * Returns the value of the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Login</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Login</em>' containment reference.
   * @see #setLogin(login)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Login()
   * @model containment="true"
   * @generated
   */
  login getLogin();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getLogin <em>Login</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Login</em>' containment reference.
   * @see #getLogin()
   * @generated
   */
  void setLogin(login value);

  /**
   * Returns the value of the '<em><b>Dispositivos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.dsl.gratext.gratext.Dispositivos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dispositivos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dispositivos</em>' containment reference list.
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Dispositivos()
   * @model containment="true"
   * @generated
   */
  EList<Dispositivos> getDispositivos();

} // Granja
