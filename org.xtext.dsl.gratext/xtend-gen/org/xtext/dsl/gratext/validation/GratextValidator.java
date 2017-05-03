/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.validation;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Estado;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.GratextPackage;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.validation.AbstractGratextValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GratextValidator extends AbstractGratextValidator {
  public final static String INVALID_NAME = "invalidName";
  
  public final static String NAME_LONG = "Nombre_Largo";
  
  public final static String ACCION_INCORRECTA = "Accion_incorrecta";
  
  public final static String TEMPERATURA_INCORRECTA = "Temperatura_incorrecta";
  
  @Check
  public void checkGreetingStartsWithCapital(final Granja granja) {
    String _name = granja.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Nombre de la granja demasiado largo", 
        GratextPackage.Literals.GRANJA__NAME, 
        GratextValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkDispositvoBarrerar(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("BARRERA_SEGURIDAD") && (!this.checkBarrera(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, 
        GratextValidator.ACCION_INCORRECTA);
    }
  }
  
  @Check
  public void checkDispositivoTemperatura(final Dispositivos dispositivo) {
    if (((!dispositivo.getNombre().getName().equals("TEMPERATURA")) && 
      (!Objects.equal(dispositivo.getTemperatura(), null)))) {
      this.warning("Recuerde que necesita el lugar INTERIOR/EXTERIOR ", 
        GratextPackage.Literals.DISPOSITIVOS__NOMBRE, 
        GratextValidator.TEMPERATURA_INCORRECTA);
    }
  }
  
  public boolean checkTemperatura(final Estado estado) {
    if (((((estado.getName().equals("AMBIENTE") || 
      estado.getName().equals("INTERNA")) || 
      estado.getName().equals("NEVERA")) || 
      estado.getName().equals("MECEDORA")) || 
      estado.getName().equals("DEPOSITO_LECHE"))) {
      return true;
    }
    return false;
  }
  
  @Check
  public void checkCodigo(final Dispositivos dispositivo) {
    String _codigo = dispositivo.getCodigo();
    int _length = _codigo.length();
    boolean _greaterThan = (_length > 20);
    if (_greaterThan) {
      this.warning("No se recomiendan nombres de codigos de mas de 20 carcateres", 
        GratextPackage.Literals.DISPOSITIVOS__CODIGO, GratextValidator.NAME_LONG);
    }
  }
  
  @Check
  public void checkDispositivoCamara(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("CAMARA") && (!this.checkCamara(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, 
        GratextValidator.ACCION_INCORRECTA);
    }
  }
  
  public boolean checkCamara(final accion accion) {
    boolean _xifexpression = false;
    if ((((((accion.getNombreAccion().getName().equals("ABRIR") || 
      accion.getNombreAccion().getName().equals("CERRAR")) || 
      accion.getNombreAccion().getName().equals("SACAR")) || 
      accion.getNombreAccion().getName().equals("GRABAR")) || 
      accion.getNombreAccion().getName().equals("ACTIVAR")) || 
      accion.getNombreAccion().getName().equals("DESACTIVAR"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkDispositivoEstado(final Dispositivos dispositivo) {
    if ((((((((((dispositivo.getNombre().getName().equals("DEPOSITO_LECHE") || 
      dispositivo.getNombre().getName().equals("EMERGENCIA")) || 
      dispositivo.getNombre().getName().equals("FUEGO_HUMO")) || 
      dispositivo.getNombre().getName().equals("INUNDACION")) || 
      dispositivo.getNombre().getName().equals("VIENTO")) || 
      dispositivo.getNombre().getName().equals("ROTURA_CRISTAL")) || 
      dispositivo.getNombre().getName().equals("CO2")) || 
      dispositivo.getNombre().getName().equals("LLUVIA")) || 
      dispositivo.getNombre().getName().equals("ESTACION_METEOROLOGICA")) && (!this.checkEstado(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, 
        GratextValidator.ACCION_INCORRECTA);
    }
  }
  
  public boolean checkEstado(final accion accion) {
    boolean _xifexpression = false;
    NombreAccion _nombreAccion = accion.getNombreAccion();
    String _name = _nombreAccion.getName();
    boolean _equals = _name.equals("ESTADO");
    if (_equals) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkDispositivoADE(final Dispositivos dispositivo) {
    if (((((dispositivo.getNombre().getName().equals("ROBOT_LIMPIADOR") || 
      dispositivo.getNombre().getName().equals("LUMINOSIDAD")) || 
      dispositivo.getNombre().getName().equals("NEVERAS")) || 
      dispositivo.getNombre().getName().equals("RADIOFRECUENCIA")) && (!this.checkADE(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, 
        GratextValidator.ACCION_INCORRECTA);
    }
  }
  
  public boolean checkADE(final accion accion) {
    boolean _xifexpression = false;
    if (((((this.checkEstado(accion) || accion.getNombreAccion().getName().equals("APAGAR")) || 
      accion.getNombreAccion().getName().equals("ENCENDER")) || accion.getNombreAccion().getName().equals("ACTIVAR")) || 
      accion.getNombreAccion().getName().equals("DESCATIVAR"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  public boolean checkBarrera(final accion accion) {
    boolean _xifexpression = false;
    if (((accion.getNombreAccion().getName().equals("ABRIR") || 
      accion.getNombreAccion().getName().equals("CERRAR")) || 
      accion.getNombreAccion().getName().equals("ESTADO"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
}
