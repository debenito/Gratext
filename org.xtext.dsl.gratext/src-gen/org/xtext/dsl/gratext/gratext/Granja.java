/**
 * generated by Xtext 2.10.0
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
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.Granja#getContrasena <em>Contrasena</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * Returns the value of the '<em><b>Usuario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usuario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usuario</em>' containment reference.
   * @see #setUsuario(usuario)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Usuario()
   * @model containment="true"
   * @generated
   */
  usuario getUsuario();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getUsuario <em>Usuario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usuario</em>' containment reference.
   * @see #getUsuario()
   * @generated
   */
  void setUsuario(usuario value);

  /**
   * Returns the value of the '<em><b>Contrasena</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contrasena</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrasena</em>' containment reference.
   * @see #setContrasena(contrasena)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getGranja_Contrasena()
   * @model containment="true"
   * @generated
   */
  contrasena getContrasena();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.Granja#getContrasena <em>Contrasena</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contrasena</em>' containment reference.
   * @see #getContrasena()
   * @generated
   */
  void setContrasena(contrasena value);

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
