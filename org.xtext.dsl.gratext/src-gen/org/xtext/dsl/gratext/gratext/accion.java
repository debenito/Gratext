/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.gratext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.gratext.gratext.accion#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.accion#getNumero <em>Numero</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.accion#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.gratext.gratext.GratextPackage#getaccion()
 * @model
 * @generated
 */
public interface accion extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre Accion</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.dsl.gratext.gratext.NombreAccion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre Accion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre Accion</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.NombreAccion
   * @see #setNombreAccion(NombreAccion)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getaccion_NombreAccion()
   * @model
   * @generated
   */
  NombreAccion getNombreAccion();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.accion#getNombreAccion <em>Nombre Accion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre Accion</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.NombreAccion
   * @see #getNombreAccion()
   * @generated
   */
  void setNombreAccion(NombreAccion value);

  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numero</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(String)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getaccion_Numero()
   * @model
   * @generated
   */
  String getNumero();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.accion#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(String value);

  /**
   * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descripcion</em>' attribute.
   * @see #setDescripcion(String)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getaccion_Descripcion()
   * @model
   * @generated
   */
  String getDescripcion();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.accion#getDescripcion <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descripcion</em>' attribute.
   * @see #getDescripcion()
   * @generated
   */
  void setDescripcion(String value);

} // accion
