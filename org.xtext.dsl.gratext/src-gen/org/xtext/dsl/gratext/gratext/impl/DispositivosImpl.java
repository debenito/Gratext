/**
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.gratext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.GratextPackage;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.accion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispositivos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl#getAccion <em>Accion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispositivosImpl extends MinimalEObjectImpl.Container implements Dispositivos
{
  /**
   * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodigo()
   * @generated
   * @ordered
   */
  protected static final String CODIGO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodigo()
   * @generated
   * @ordered
   */
  protected String codigo = CODIGO_EDEFAULT;

  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final TiposDispositivo NOMBRE_EDEFAULT = TiposDispositivo.CAMARA;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected TiposDispositivo nombre = NOMBRE_EDEFAULT;

  /**
   * The default value of the '{@link #getTemperatura() <em>Temperatura</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatura()
   * @generated
   * @ordered
   */
  protected static final String TEMPERATURA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemperatura() <em>Temperatura</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatura()
   * @generated
   * @ordered
   */
  protected String temperatura = TEMPERATURA_EDEFAULT;

  /**
   * The cached value of the '{@link #getAccion() <em>Accion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccion()
   * @generated
   * @ordered
   */
  protected accion accion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DispositivosImpl()
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
    return GratextPackage.Literals.DISPOSITIVOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodigo()
  {
    return codigo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodigo(String newCodigo)
  {
    String oldCodigo = codigo;
    codigo = newCodigo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.DISPOSITIVOS__CODIGO, oldCodigo, codigo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TiposDispositivo getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(TiposDispositivo newNombre)
  {
    TiposDispositivo oldNombre = nombre;
    nombre = newNombre == null ? NOMBRE_EDEFAULT : newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.DISPOSITIVOS__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTemperatura()
  {
    return temperatura;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemperatura(String newTemperatura)
  {
    String oldTemperatura = temperatura;
    temperatura = newTemperatura;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.DISPOSITIVOS__TEMPERATURA, oldTemperatura, temperatura));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public accion getAccion()
  {
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccion(accion newAccion, NotificationChain msgs)
  {
    accion oldAccion = accion;
    accion = newAccion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GratextPackage.DISPOSITIVOS__ACCION, oldAccion, newAccion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccion(accion newAccion)
  {
    if (newAccion != accion)
    {
      NotificationChain msgs = null;
      if (accion != null)
        msgs = ((InternalEObject)accion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GratextPackage.DISPOSITIVOS__ACCION, null, msgs);
      if (newAccion != null)
        msgs = ((InternalEObject)newAccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GratextPackage.DISPOSITIVOS__ACCION, null, msgs);
      msgs = basicSetAccion(newAccion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GratextPackage.DISPOSITIVOS__ACCION, newAccion, newAccion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GratextPackage.DISPOSITIVOS__ACCION:
        return basicSetAccion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GratextPackage.DISPOSITIVOS__CODIGO:
        return getCodigo();
      case GratextPackage.DISPOSITIVOS__NOMBRE:
        return getNombre();
      case GratextPackage.DISPOSITIVOS__TEMPERATURA:
        return getTemperatura();
      case GratextPackage.DISPOSITIVOS__ACCION:
        return getAccion();
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
      case GratextPackage.DISPOSITIVOS__CODIGO:
        setCodigo((String)newValue);
        return;
      case GratextPackage.DISPOSITIVOS__NOMBRE:
        setNombre((TiposDispositivo)newValue);
        return;
      case GratextPackage.DISPOSITIVOS__TEMPERATURA:
        setTemperatura((String)newValue);
        return;
      case GratextPackage.DISPOSITIVOS__ACCION:
        setAccion((accion)newValue);
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
      case GratextPackage.DISPOSITIVOS__CODIGO:
        setCodigo(CODIGO_EDEFAULT);
        return;
      case GratextPackage.DISPOSITIVOS__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case GratextPackage.DISPOSITIVOS__TEMPERATURA:
        setTemperatura(TEMPERATURA_EDEFAULT);
        return;
      case GratextPackage.DISPOSITIVOS__ACCION:
        setAccion((accion)null);
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
      case GratextPackage.DISPOSITIVOS__CODIGO:
        return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
      case GratextPackage.DISPOSITIVOS__NOMBRE:
        return nombre != NOMBRE_EDEFAULT;
      case GratextPackage.DISPOSITIVOS__TEMPERATURA:
        return TEMPERATURA_EDEFAULT == null ? temperatura != null : !TEMPERATURA_EDEFAULT.equals(temperatura);
      case GratextPackage.DISPOSITIVOS__ACCION:
        return accion != null;
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
    result.append(" (codigo: ");
    result.append(codigo);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(", temperatura: ");
    result.append(temperatura);
    result.append(')');
    return result.toString();
  }

} //DispositivosImpl
