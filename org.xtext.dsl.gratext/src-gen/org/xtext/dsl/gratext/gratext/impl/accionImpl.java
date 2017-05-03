/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.gratext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.gratext.gratext.GratextPackage;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.accion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.accionImpl#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.accionImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.accionImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class accionImpl extends MinimalEObjectImpl.Container implements accion
{
  /**
   * The default value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombreAccion()
   * @generated
   * @ordered
   */
  protected static final NombreAccion NOMBRE_ACCION_EDEFAULT = NombreAccion.ABRIR;

  /**
   * The cached value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombreAccion()
   * @generated
   * @ordered
   */
  protected NombreAccion nombreAccion = NOMBRE_ACCION_EDEFAULT;

  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final String NUMERO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected String numero = NUMERO_EDEFAULT;

  /**
   * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPCION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected String descripcion = DESCRIPCION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected accionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GratextPackage.Literals.ACCION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NombreAccion getNombreAccion()
  {
    return nombreAccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombreAccion(NombreAccion newNombreAccion)
  {
    NombreAccion oldNombreAccion = nombreAccion;
    nombreAccion = newNombreAccion == null ? NOMBRE_ACCION_EDEFAULT : newNombreAccion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.ACCION__NOMBRE_ACCION, oldNombreAccion, nombreAccion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumero(String newNumero)
  {
    String oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.ACCION__NUMERO, oldNumero, numero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescripcion()
  {
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescripcion(String newDescripcion)
  {
    String oldDescripcion = descripcion;
    descripcion = newDescripcion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.ACCION__DESCRIPCION, oldDescripcion, descripcion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GratextPackage.ACCION__NOMBRE_ACCION:
        return getNombreAccion();
      case GratextPackage.ACCION__NUMERO:
        return getNumero();
      case GratextPackage.ACCION__DESCRIPCION:
        return getDescripcion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GratextPackage.ACCION__NOMBRE_ACCION:
        setNombreAccion((NombreAccion)newValue);
        return;
      case GratextPackage.ACCION__NUMERO:
        setNumero((String)newValue);
        return;
      case GratextPackage.ACCION__DESCRIPCION:
        setDescripcion((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GratextPackage.ACCION__NOMBRE_ACCION:
        setNombreAccion(NOMBRE_ACCION_EDEFAULT);
        return;
      case GratextPackage.ACCION__NUMERO:
        setNumero(NUMERO_EDEFAULT);
        return;
      case GratextPackage.ACCION__DESCRIPCION:
        setDescripcion(DESCRIPCION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GratextPackage.ACCION__NOMBRE_ACCION:
        return nombreAccion != NOMBRE_ACCION_EDEFAULT;
      case GratextPackage.ACCION__NUMERO:
        return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
      case GratextPackage.ACCION__DESCRIPCION:
        return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombreAccion: ");
    result.append(nombreAccion);
    result.append(", numero: ");
    result.append(numero);
    result.append(", descripcion: ");
    result.append(descripcion);
    result.append(')');
    return result.toString();
  }

} //accionImpl
