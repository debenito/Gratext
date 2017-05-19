/**
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.gratext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.gratext.gratext.GratextFactory
 * @model kind="package"
 * @generated
 */
public interface GratextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gratext";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/dsl/gratext/Gratext";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gratext";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GratextPackage eINSTANCE = org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.impl.GranjaImpl <em>Granja</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.impl.GranjaImpl
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getGranja()
   * @generated
   */
  int GRANJA = 0;

  /**
   * The feature id for the '<em><b>Nombre Granja</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANJA__NOMBRE_GRANJA = 0;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANJA__TIPO = 1;

  /**
   * The feature id for the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANJA__LOGIN = 2;

  /**
   * The feature id for the '<em><b>Dispositivos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANJA__DISPOSITIVOS = 3;

  /**
   * The number of structural features of the '<em>Granja</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRANJA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.impl.loginImpl <em>login</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.impl.loginImpl
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getlogin()
   * @generated
   */
  int LOGIN = 1;

  /**
   * The feature id for the '<em><b>Usuario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIN__USUARIO = 0;

  /**
   * The feature id for the '<em><b>Contrasena</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIN__CONTRASENA = 1;

  /**
   * The number of structural features of the '<em>login</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl <em>Dispositivos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.impl.DispositivosImpl
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getDispositivos()
   * @generated
   */
  int DISPOSITIVOS = 2;

  /**
   * The feature id for the '<em><b>Codigo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIVOS__CODIGO = 0;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIVOS__NOMBRE = 1;

  /**
   * The feature id for the '<em><b>Temperatura</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIVOS__TEMPERATURA = 2;

  /**
   * The feature id for the '<em><b>Accion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIVOS__ACCION = 3;

  /**
   * The number of structural features of the '<em>Dispositivos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIVOS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.impl.accionImpl <em>accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.impl.accionImpl
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getaccion()
   * @generated
   */
  int ACCION = 3;

  /**
   * The feature id for the '<em><b>Nombre Accion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION__NOMBRE_ACCION = 0;

  /**
   * The feature id for the '<em><b>Numero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION__NUMERO = 1;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION__DESCRIPCION = 2;

  /**
   * The number of structural features of the '<em>accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.impl.numeroImpl <em>numero</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.impl.numeroImpl
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getnumero()
   * @generated
   */
  int NUMERO = 4;

  /**
   * The feature id for the '<em><b>Id Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERO__ID_NUMERO = 0;

  /**
   * The feature id for the '<em><b>Datos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERO__DATOS = 1;

  /**
   * The number of structural features of the '<em>numero</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.Datos <em>Datos</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.Datos
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getDatos()
   * @generated
   */
  int DATOS = 5;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.Tipo <em>Tipo</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.Tipo
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getTipo()
   * @generated
   */
  int TIPO = 6;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.TiposDispositivo <em>Tipos Dispositivo</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.TiposDispositivo
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getTiposDispositivo()
   * @generated
   */
  int TIPOS_DISPOSITIVO = 7;

  /**
   * The meta object id for the '{@link org.xtext.dsl.gratext.gratext.NombreAccion <em>Nombre Accion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.dsl.gratext.gratext.NombreAccion
   * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getNombreAccion()
   * @generated
   */
  int NOMBRE_ACCION = 8;


  /**
   * Returns the meta object for class '{@link org.xtext.dsl.gratext.gratext.Granja <em>Granja</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Granja</em>'.
   * @see org.xtext.dsl.gratext.gratext.Granja
   * @generated
   */
  EClass getGranja();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.Granja#getNombreGranja <em>Nombre Granja</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre Granja</em>'.
   * @see org.xtext.dsl.gratext.gratext.Granja#getNombreGranja()
   * @see #getGranja()
   * @generated
   */
  EAttribute getGranja_NombreGranja();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.Granja#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see org.xtext.dsl.gratext.gratext.Granja#getTipo()
   * @see #getGranja()
   * @generated
   */
  EAttribute getGranja_Tipo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.dsl.gratext.gratext.Granja#getLogin <em>Login</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Login</em>'.
   * @see org.xtext.dsl.gratext.gratext.Granja#getLogin()
   * @see #getGranja()
   * @generated
   */
  EReference getGranja_Login();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.dsl.gratext.gratext.Granja#getDispositivos <em>Dispositivos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dispositivos</em>'.
   * @see org.xtext.dsl.gratext.gratext.Granja#getDispositivos()
   * @see #getGranja()
   * @generated
   */
  EReference getGranja_Dispositivos();

  /**
   * Returns the meta object for class '{@link org.xtext.dsl.gratext.gratext.login <em>login</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>login</em>'.
   * @see org.xtext.dsl.gratext.gratext.login
   * @generated
   */
  EClass getlogin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.login#getUsuario <em>Usuario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Usuario</em>'.
   * @see org.xtext.dsl.gratext.gratext.login#getUsuario()
   * @see #getlogin()
   * @generated
   */
  EAttribute getlogin_Usuario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.login#getContrasena <em>Contrasena</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contrasena</em>'.
   * @see org.xtext.dsl.gratext.gratext.login#getContrasena()
   * @see #getlogin()
   * @generated
   */
  EAttribute getlogin_Contrasena();

  /**
   * Returns the meta object for class '{@link org.xtext.dsl.gratext.gratext.Dispositivos <em>Dispositivos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dispositivos</em>'.
   * @see org.xtext.dsl.gratext.gratext.Dispositivos
   * @generated
   */
  EClass getDispositivos();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.Dispositivos#getCodigo <em>Codigo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Codigo</em>'.
   * @see org.xtext.dsl.gratext.gratext.Dispositivos#getCodigo()
   * @see #getDispositivos()
   * @generated
   */
  EAttribute getDispositivos_Codigo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.Dispositivos#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see org.xtext.dsl.gratext.gratext.Dispositivos#getNombre()
   * @see #getDispositivos()
   * @generated
   */
  EAttribute getDispositivos_Nombre();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.Dispositivos#getTemperatura <em>Temperatura</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temperatura</em>'.
   * @see org.xtext.dsl.gratext.gratext.Dispositivos#getTemperatura()
   * @see #getDispositivos()
   * @generated
   */
  EAttribute getDispositivos_Temperatura();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.dsl.gratext.gratext.Dispositivos#getAccion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accion</em>'.
   * @see org.xtext.dsl.gratext.gratext.Dispositivos#getAccion()
   * @see #getDispositivos()
   * @generated
   */
  EReference getDispositivos_Accion();

  /**
   * Returns the meta object for class '{@link org.xtext.dsl.gratext.gratext.accion <em>accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>accion</em>'.
   * @see org.xtext.dsl.gratext.gratext.accion
   * @generated
   */
  EClass getaccion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.accion#getNombreAccion <em>Nombre Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre Accion</em>'.
   * @see org.xtext.dsl.gratext.gratext.accion#getNombreAccion()
   * @see #getaccion()
   * @generated
   */
  EAttribute getaccion_NombreAccion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.dsl.gratext.gratext.accion#getNumero <em>Numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numero</em>'.
   * @see org.xtext.dsl.gratext.gratext.accion#getNumero()
   * @see #getaccion()
   * @generated
   */
  EReference getaccion_Numero();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.accion#getDescripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descripcion</em>'.
   * @see org.xtext.dsl.gratext.gratext.accion#getDescripcion()
   * @see #getaccion()
   * @generated
   */
  EAttribute getaccion_Descripcion();

  /**
   * Returns the meta object for class '{@link org.xtext.dsl.gratext.gratext.numero <em>numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>numero</em>'.
   * @see org.xtext.dsl.gratext.gratext.numero
   * @generated
   */
  EClass getnumero();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.numero#getIdNumero <em>Id Numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Numero</em>'.
   * @see org.xtext.dsl.gratext.gratext.numero#getIdNumero()
   * @see #getnumero()
   * @generated
   */
  EAttribute getnumero_IdNumero();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.dsl.gratext.gratext.numero#getDatos <em>Datos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datos</em>'.
   * @see org.xtext.dsl.gratext.gratext.numero#getDatos()
   * @see #getnumero()
   * @generated
   */
  EAttribute getnumero_Datos();

  /**
   * Returns the meta object for enum '{@link org.xtext.dsl.gratext.gratext.Datos <em>Datos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Datos</em>'.
   * @see org.xtext.dsl.gratext.gratext.Datos
   * @generated
   */
  EEnum getDatos();

  /**
   * Returns the meta object for enum '{@link org.xtext.dsl.gratext.gratext.Tipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Tipo</em>'.
   * @see org.xtext.dsl.gratext.gratext.Tipo
   * @generated
   */
  EEnum getTipo();

  /**
   * Returns the meta object for enum '{@link org.xtext.dsl.gratext.gratext.TiposDispositivo <em>Tipos Dispositivo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Tipos Dispositivo</em>'.
   * @see org.xtext.dsl.gratext.gratext.TiposDispositivo
   * @generated
   */
  EEnum getTiposDispositivo();

  /**
   * Returns the meta object for enum '{@link org.xtext.dsl.gratext.gratext.NombreAccion <em>Nombre Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Nombre Accion</em>'.
   * @see org.xtext.dsl.gratext.gratext.NombreAccion
   * @generated
   */
  EEnum getNombreAccion();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GratextFactory getGratextFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.impl.GranjaImpl <em>Granja</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.impl.GranjaImpl
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getGranja()
     * @generated
     */
    EClass GRANJA = eINSTANCE.getGranja();

    /**
     * The meta object literal for the '<em><b>Nombre Granja</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRANJA__NOMBRE_GRANJA = eINSTANCE.getGranja_NombreGranja();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRANJA__TIPO = eINSTANCE.getGranja_Tipo();

    /**
     * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRANJA__LOGIN = eINSTANCE.getGranja_Login();

    /**
     * The meta object literal for the '<em><b>Dispositivos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRANJA__DISPOSITIVOS = eINSTANCE.getGranja_Dispositivos();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.impl.loginImpl <em>login</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.impl.loginImpl
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getlogin()
     * @generated
     */
    EClass LOGIN = eINSTANCE.getlogin();

    /**
     * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIN__USUARIO = eINSTANCE.getlogin_Usuario();

    /**
     * The meta object literal for the '<em><b>Contrasena</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIN__CONTRASENA = eINSTANCE.getlogin_Contrasena();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.impl.DispositivosImpl <em>Dispositivos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.impl.DispositivosImpl
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getDispositivos()
     * @generated
     */
    EClass DISPOSITIVOS = eINSTANCE.getDispositivos();

    /**
     * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPOSITIVOS__CODIGO = eINSTANCE.getDispositivos_Codigo();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPOSITIVOS__NOMBRE = eINSTANCE.getDispositivos_Nombre();

    /**
     * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPOSITIVOS__TEMPERATURA = eINSTANCE.getDispositivos_Temperatura();

    /**
     * The meta object literal for the '<em><b>Accion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPOSITIVOS__ACCION = eINSTANCE.getDispositivos_Accion();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.impl.accionImpl <em>accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.impl.accionImpl
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getaccion()
     * @generated
     */
    EClass ACCION = eINSTANCE.getaccion();

    /**
     * The meta object literal for the '<em><b>Nombre Accion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCION__NOMBRE_ACCION = eINSTANCE.getaccion_NombreAccion();

    /**
     * The meta object literal for the '<em><b>Numero</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCION__NUMERO = eINSTANCE.getaccion_Numero();

    /**
     * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCION__DESCRIPCION = eINSTANCE.getaccion_Descripcion();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.impl.numeroImpl <em>numero</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.impl.numeroImpl
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getnumero()
     * @generated
     */
    EClass NUMERO = eINSTANCE.getnumero();

    /**
     * The meta object literal for the '<em><b>Id Numero</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERO__ID_NUMERO = eINSTANCE.getnumero_IdNumero();

    /**
     * The meta object literal for the '<em><b>Datos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERO__DATOS = eINSTANCE.getnumero_Datos();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.Datos <em>Datos</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.Datos
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getDatos()
     * @generated
     */
    EEnum DATOS = eINSTANCE.getDatos();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.Tipo <em>Tipo</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.Tipo
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getTipo()
     * @generated
     */
    EEnum TIPO = eINSTANCE.getTipo();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.TiposDispositivo <em>Tipos Dispositivo</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.TiposDispositivo
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getTiposDispositivo()
     * @generated
     */
    EEnum TIPOS_DISPOSITIVO = eINSTANCE.getTiposDispositivo();

    /**
     * The meta object literal for the '{@link org.xtext.dsl.gratext.gratext.NombreAccion <em>Nombre Accion</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.dsl.gratext.gratext.NombreAccion
     * @see org.xtext.dsl.gratext.gratext.impl.GratextPackageImpl#getNombreAccion()
     * @generated
     */
    EEnum NOMBRE_ACCION = eINSTANCE.getNombreAccion();

  }

} //GratextPackage
