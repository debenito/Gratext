/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.gratext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.GratextFactory;
import org.xtext.dsl.gratext.gratext.GratextPackage;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.Tipo;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.gratext.contrasena;
import org.xtext.dsl.gratext.gratext.usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GratextPackageImpl extends EPackageImpl implements GratextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass granjaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dispositivosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usuarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contrasenaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tipoEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tiposDispositivoEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nombreAccionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.dsl.gratext.gratext.GratextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GratextPackageImpl()
  {
    super(eNS_URI, GratextFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GratextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GratextPackage init()
  {
    if (isInited) return (GratextPackage)EPackage.Registry.INSTANCE.getEPackage(GratextPackage.eNS_URI);

    // Obtain or create and register package
    GratextPackageImpl theGratextPackage = (GratextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GratextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GratextPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGratextPackage.createPackageContents();

    // Initialize created meta-data
    theGratextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGratextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GratextPackage.eNS_URI, theGratextPackage);
    return theGratextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGranja()
  {
    return granjaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGranja_Name()
  {
    return (EAttribute)granjaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGranja_Tipo()
  {
    return (EAttribute)granjaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGranja_Usuario()
  {
    return (EReference)granjaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGranja_Contrasena()
  {
    return (EReference)granjaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGranja_Dispositivos()
  {
    return (EReference)granjaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDispositivos()
  {
    return dispositivosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDispositivos_Codigo()
  {
    return (EAttribute)dispositivosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDispositivos_Nombre()
  {
    return (EAttribute)dispositivosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDispositivos_Temperatura()
  {
    return (EAttribute)dispositivosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDispositivos_Accion()
  {
    return (EReference)dispositivosEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaccion()
  {
    return accionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaccion_NombreAccion()
  {
    return (EAttribute)accionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaccion_Numero()
  {
    return (EAttribute)accionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaccion_Descripcion()
  {
    return (EAttribute)accionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getusuario()
  {
    return usuarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getusuario_Usuario()
  {
    return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcontrasena()
  {
    return contrasenaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcontrasena_Contrasena()
  {
    return (EAttribute)contrasenaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTipo()
  {
    return tipoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTiposDispositivo()
  {
    return tiposDispositivoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNombreAccion()
  {
    return nombreAccionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GratextFactory getGratextFactory()
  {
    return (GratextFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    granjaEClass = createEClass(GRANJA);
    createEAttribute(granjaEClass, GRANJA__NAME);
    createEAttribute(granjaEClass, GRANJA__TIPO);
    createEReference(granjaEClass, GRANJA__USUARIO);
    createEReference(granjaEClass, GRANJA__CONTRASENA);
    createEReference(granjaEClass, GRANJA__DISPOSITIVOS);

    dispositivosEClass = createEClass(DISPOSITIVOS);
    createEAttribute(dispositivosEClass, DISPOSITIVOS__CODIGO);
    createEAttribute(dispositivosEClass, DISPOSITIVOS__NOMBRE);
    createEAttribute(dispositivosEClass, DISPOSITIVOS__TEMPERATURA);
    createEReference(dispositivosEClass, DISPOSITIVOS__ACCION);

    accionEClass = createEClass(ACCION);
    createEAttribute(accionEClass, ACCION__NOMBRE_ACCION);
    createEAttribute(accionEClass, ACCION__NUMERO);
    createEAttribute(accionEClass, ACCION__DESCRIPCION);

    usuarioEClass = createEClass(USUARIO);
    createEAttribute(usuarioEClass, USUARIO__USUARIO);

    contrasenaEClass = createEClass(CONTRASENA);
    createEAttribute(contrasenaEClass, CONTRASENA__CONTRASENA);

    // Create enums
    tipoEEnum = createEEnum(TIPO);
    tiposDispositivoEEnum = createEEnum(TIPOS_DISPOSITIVO);
    nombreAccionEEnum = createEEnum(NOMBRE_ACCION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(granjaEClass, Granja.class, "Granja", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGranja_Name(), ecorePackage.getEString(), "name", null, 0, 1, Granja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGranja_Tipo(), this.getTipo(), "tipo", null, 0, 1, Granja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGranja_Usuario(), this.getusuario(), null, "usuario", null, 0, 1, Granja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGranja_Contrasena(), this.getcontrasena(), null, "contrasena", null, 0, 1, Granja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGranja_Dispositivos(), this.getDispositivos(), null, "dispositivos", null, 0, -1, Granja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dispositivosEClass, Dispositivos.class, "Dispositivos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDispositivos_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Dispositivos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDispositivos_Nombre(), this.getTiposDispositivo(), "nombre", null, 0, 1, Dispositivos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDispositivos_Temperatura(), ecorePackage.getEString(), "temperatura", null, 0, 1, Dispositivos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDispositivos_Accion(), this.getaccion(), null, "accion", null, 0, 1, Dispositivos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accionEClass, accion.class, "accion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaccion_NombreAccion(), this.getNombreAccion(), "nombreAccion", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaccion_Numero(), ecorePackage.getEString(), "numero", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaccion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usuarioEClass, usuario.class, "usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getusuario_Usuario(), ecorePackage.getEString(), "usuario", null, 0, 1, usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contrasenaEClass, contrasena.class, "contrasena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcontrasena_Contrasena(), ecorePackage.getEString(), "contrasena", null, 0, 1, contrasena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(tipoEEnum, Tipo.class, "Tipo");
    addEEnumLiteral(tipoEEnum, Tipo.DELAVAL);
    addEEnumLiteral(tipoEEnum, Tipo.SIEMENS);
    addEEnumLiteral(tipoEEnum, Tipo.TABLET);
    addEEnumLiteral(tipoEEnum, Tipo.MOVIL);
    addEEnumLiteral(tipoEEnum, Tipo.ORDENADOR);

    initEEnum(tiposDispositivoEEnum, TiposDispositivo.class, "TiposDispositivo");
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.CAMARA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.TEMPERATURA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.FUEGO_HUMO);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.CO2);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.GAS);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.PRESENCIA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.MAGNETICO);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.ROTURA_CRISTAL);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.BARRERA_SEGURIDAD);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.LUMINOSIDAD);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.EMERGENCIA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.INUNDACION);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.VIENTO);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.LLUVIA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.ESTACION_METEOROLOGICA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.SISTEMA_IDENTIFICACION);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.INFRARROJOS);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.RADIOFRECUENCIA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.MECEDORA);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.PULSOMETRO_GANADO);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.DEPOSITO_LECHE);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.ROBOT_LIMPIADOR);
    addEEnumLiteral(tiposDispositivoEEnum, TiposDispositivo.NEVERAS);

    initEEnum(nombreAccionEEnum, NombreAccion.class, "NombreAccion");
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.ABRIR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.ENVIAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.SACAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.CERRAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.ESTADO);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.GRABAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.DETECTAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.ENCENDER);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.APAGAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.AUMENTAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.DISMINUIR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.COMPROBAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.ACTIVAR);
    addEEnumLiteral(nombreAccionEEnum, NombreAccion.DESACTIVAR);

    // Create resource
    createResource(eNS_URI);
  }

} //GratextPackageImpl