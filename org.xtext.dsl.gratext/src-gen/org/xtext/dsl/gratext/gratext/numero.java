/**
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.gratext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>numero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.gratext.gratext.numero#getIdNumero <em>Id Numero</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.numero#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.gratext.gratext.GratextPackage#getnumero()
 * @model
 * @generated
 */
public interface numero extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Numero</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Numero</em>' attribute.
   * @see #setIdNumero(String)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getnumero_IdNumero()
   * @model
   * @generated
   */
  String getIdNumero();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.numero#getIdNumero <em>Id Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Numero</em>' attribute.
   * @see #getIdNumero()
   * @generated
   */
  void setIdNumero(String value);

  /**
   * Returns the value of the '<em><b>Datos</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.dsl.gratext.gratext.Datos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datos</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.Datos
   * @see #setDatos(Datos)
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#getnumero_Datos()
   * @model
   * @generated
   */
  Datos getDatos();

  /**
   * Sets the value of the '{@link org.xtext.dsl.gratext.gratext.numero#getDatos <em>Datos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datos</em>' attribute.
   * @see org.xtext.dsl.gratext.gratext.Datos
   * @see #getDatos()
   * @generated
   */
  void setDatos(Datos value);

} // numero
