/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.validation;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.GratextPackage;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.validation.AbstractGratextValidator;

/**
 * This class contains custom validation rules.
 * @author : Jose antonio de Benito Suarez
 * Esta clase contiene los validadores necesarios para  el programa funcione correctamente
 */
@SuppressWarnings("all")
public class GratextValidator extends AbstractGratextValidator {
  /**
   * Parametros estaticos que sirven para diferenciar los errores
   */
  public final static String INVALID_NAME = "invalidName";
  
  public final static String NAME_LONG = "Nombre_Largo";
  
  public final static String ACCION_INCORRECTA = "Accion_incorrecta";
  
  public final static String TEMPERATURA_INCORRECTA = "Temperatura_incorrecta";
  
  public final static String NUMERO_INCORRECTO = "Numero_incorrecto";
  
  public final static String ACCION_ESTADO = "Accion_estado";
  
  public final static String NUMERO_ENTERO = "Numero_entero";
  
  public final static String ACCION_BARRERA = "Accion_Barrera";
  
  public final static String TEMPERATURA_LUGAR = "Temperatura_Lugar";
  
  public final static String ACCION_ADE = "Accion_ADE";
  
  public final static String ACCION_AUMENTAR_DISMINUIR = "Accion_aumentar_disminuir";
  
  public final static String ACCION_CAMARA = "Accion_camara";
  
  public final static String DISPOSITIVO_INCORRECTO = "Dispositivo_incorrecto";
  
  protected int i = 0;
  
  /**
   * Metodo que checkea si el dispositivo es la barrera y la accion es correcta
   */
  @Check
  public void checkDispositvoBarrerar(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("BARRERA_SEGURIDAD") && (!this.checkBarrera(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo barrera", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_BARRERA);
    }
  }
  
  /**
   * Metodo que checkea  la accion es correcta de la barrera
   */
  public boolean checkBarrera(final accion accion) {
    boolean _xifexpression = false;
    if (((accion.getNombreAccion().getName().equals("ABRIR") || accion.getNombreAccion().getName().equals("CERRAR")) || 
      accion.getNombreAccion().getName().equals("ESTADO"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  /**
   * Metodo que checkea si el codigo del dispositivo
   */
  @Check
  public void checkCodigo(final Dispositivos dispositivo) {
    int _length = dispositivo.getCodigo().length();
    boolean _greaterThan = (_length > 20);
    if (_greaterThan) {
      this.warning(
        "No se recomiendan nombres de codigos de mas de 20 carcateres", 
        GratextPackage.Literals.DISPOSITIVOS__CODIGO, 
        GratextValidator.NAME_LONG);
    }
  }
  
  /**
   * Metodo que checkea si el dispositivo es la camara y la accion es correcta
   */
  @Check
  public void checkDispositivoCamara(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("CAMARA") && (!this.checkCamara(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo solo camara", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_CAMARA);
    }
  }
  
  /**
   * Metodo que checkea  la accion es correcta de la carmara
   */
  public boolean checkCamara(final accion accion) {
    boolean _xifexpression = false;
    if ((((((accion.getNombreAccion().getName().equals("ABRIR") || accion.getNombreAccion().getName().equals("CERRAR")) || 
      accion.getNombreAccion().getName().equals("SACAR")) || accion.getNombreAccion().getName().equals("GRABAR")) || 
      accion.getNombreAccion().getName().equals("ACTIVAR")) || accion.getNombreAccion().getName().equals("DESACTIVAR"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  /**
   * Metodo que checkea los dispositivo que solo pueden tener la accion de estado
   */
  @Check
  public void checkDispositivoEstado(final Dispositivos dispositivo) {
    if (((((((((((((((dispositivo.getNombre().getName().equals("DEPOSITO_LECHE") || dispositivo.getNombre().getName().equals("EMERGENCIA")) || 
      dispositivo.getNombre().getName().equals("FUEGO_HUMO")) || dispositivo.getNombre().getName().equals("INUNDACION")) || 
      dispositivo.getNombre().getName().equals("VIENTO")) || dispositivo.getNombre().getName().equals("ROTURA_CRISTAL")) || 
      dispositivo.getNombre().getName().equals("CO2")) || dispositivo.getNombre().getName().equals("LLUVIA")) || 
      dispositivo.getNombre().getName().equals("ESTACION_METEOROLOGICA")) || 
      dispositivo.getNombre().getName().equals("TEMPERATURA")) || 
      dispositivo.getNombre().getName().equals("GAS")) || 
      dispositivo.getNombre().getName().equals("PRESENCIA")) || 
      dispositivo.getNombre().getName().equals("MECEDORA")) || 
      dispositivo.getNombre().getName().equals("PULSOMETRO_GANADO")) && (!this.checkEstado(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo estados", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_ESTADO);
    }
  }
  
  /**
   * Metodo que checkea la accion de estado
   */
  public boolean checkEstado(final accion accion) {
    boolean _xifexpression = false;
    boolean _equals = accion.getNombreAccion().getName().equals("ESTADO");
    if (_equals) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  /**
   * Metodo que checkea los dispositivos con acciones de abrir, cerrar, desactivar, activar
   */
  @Check
  public void checkDispositivoADE(final Dispositivos dispositivo) {
    if (((((dispositivo.getNombre().getName().equals("ROBOT_LIMPIADOR") || dispositivo.getNombre().getName().equals("LUMINOSIDAD")) || 
      dispositivo.getNombre().getName().equals("NEVERAS")) || dispositivo.getNombre().getName().equals("RADIOFRECUENCIA")) && 
      (!this.checkADE(dispositivo.getAccion())))) {
      this.error("La accion no es la correcta para este dispositivo ADE", GratextPackage.Literals.DISPOSITIVOS__ACCION, 
        GratextValidator.ACCION_ADE);
    }
  }
  
  /**
   * Metodo que checkea las acciones de abrir, cerrar, desactivar, activar
   */
  public boolean checkADE(final accion accion) {
    boolean _xifexpression = false;
    if (((((this.checkEstado(accion) || accion.getNombreAccion().getName().equals("APAGAR")) || 
      accion.getNombreAccion().getName().equals("ENCENDER")) || accion.getNombreAccion().getName().equals("ACTIVAR")) || 
      accion.getNombreAccion().getName().equals("DESCATIVAR"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  /**
   * Metodo que checkea los dispositivos con datos numericos
   */
  @Check
  public void checkDispositivosNumerosEnteros(final Dispositivos dispositivo) {
    if (((!this.comprobarDispositivosNumericos(dispositivo)) && (!StringExtensions.isNullOrEmpty(dispositivo.getAccion().getNumero().getIdNumero())))) {
      TiposDispositivo _nombre = dispositivo.getNombre();
      String _plus = ("No se pueden poner valores numericos " + _nombre);
      this.error(_plus, 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.NUMERO_INCORRECTO);
    } else {
      if ((dispositivo.getNombre().getName().equals("CAMARA") && 
        this.comprobarNumero(dispositivo.getAccion().getNumero().getIdNumero()).equals("float"))) {
        TiposDispositivo _nombre_1 = dispositivo.getNombre();
        String _plus_1 = ("El dispositivo " + _nombre_1);
        String _plus_2 = (_plus_1 + " no admite valores decimales");
        this.error(_plus_2, 
          GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.NUMERO_ENTERO);
      }
    }
  }
  
  /**
   * Metodo que comrpueba el tipo de dato que se transmite
   */
  public String comprobarNumero(final String numero) {
    while ((this.i < numero.length())) {
      {
        boolean _isDigit = Character.isDigit(numero.charAt(this.i));
        boolean _not = (!_isDigit);
        if (_not) {
          return "float";
        }
        this.i++;
      }
    }
    this.i = 0;
    return "int";
  }
  
  /**
   * Metodo que checkea los dispositivos con datos numericos
   */
  public boolean comprobarDispositivosNumericos(final Dispositivos dispositivo) {
    boolean _xifexpression = false;
    if (((dispositivo.getNombre().getName().equals("TERMOSTATO") || dispositivo.getNombre().getName().equals("CAMARA")) || 
      dispositivo.getNombre().getName().equals("LUZ"))) {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  /**
   * Metodo que checkea el dispositivo temperatura
   */
  @Check
  public void checkDispositivoTemperatura(final Dispositivos dispositivo) {
    if ((this.checkIsTemperatura(dispositivo) && Objects.equal(dispositivo.getTemperatura(), null))) {
      this.warning("Recuerde que necesita el lugar AMBIENTE/INTERNA/NEVERA/MECEDORA/DEPOSITO_LECHE", GratextPackage.Literals.DISPOSITIVOS__NOMBRE, GratextValidator.TEMPERATURA_INCORRECTA);
    } else {
      if (((!this.checkIsTemperatura(dispositivo)) && (!Objects.equal(dispositivo.getTemperatura(), null)))) {
        String _temperatura = dispositivo.getTemperatura();
        String _plus = ("No es posible poner esto" + _temperatura);
        String _plus_1 = (_plus + " para ");
        TiposDispositivo _nombre = dispositivo.getNombre();
        String _plus_2 = (_plus_1 + _nombre);
        String _plus_3 = (_plus_2 + " solo se de poner para el dispositivo TEMPERATURA");
        this.error(_plus_3, 
          GratextPackage.Literals.DISPOSITIVOS__TEMPERATURA, GratextValidator.TEMPERATURA_INCORRECTA);
      } else {
        if ((((!this.checkTemperatura(dispositivo.getTemperatura())) && this.checkIsTemperatura(dispositivo)) && (!Objects.equal(dispositivo.getTemperatura(), null)))) {
          String _temperatura_1 = dispositivo.getTemperatura();
          String _plus_4 = ("Error existe el valor " + _temperatura_1);
          String _plus_5 = (_plus_4 + " debe de poner  AMBIENTE/INTERNA/NEVERA/MECEDORA/DEPOSITO_LECHE");
          this.error(_plus_5, 
            GratextPackage.Literals.DISPOSITIVOS__TEMPERATURA, GratextValidator.TEMPERATURA_LUGAR);
        }
      }
    }
  }
  
  /**
   * Metodo que checkea los lugares donde se puede medir la temperatura
   */
  public boolean checkTemperatura(final String estado) {
    if ((((((estado.toUpperCase().equals("AMBIENTE") || estado.toUpperCase().equals("INTERNA")) || 
      estado.toUpperCase().equals("NEVERA")) || estado.toUpperCase().equals("MECEDORA")) || 
      estado.toUpperCase().equals("DEPOSITO_LECHE")) || estado.toUpperCase().equals("EXTERNA"))) {
      return true;
    }
    return false;
  }
  
  /**
   * Metodo que checkea los dispositivos de temperatura o termostato
   */
  public boolean checkIsTemperatura(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("TEMPERATURA") || dispositivo.getNombre().getName().equals("TERMOSTATO"))) {
      return true;
    }
    return false;
  }
  
  /**
   * Metodo que checkea los dispositivos con acciones de amuento y disminucion
   */
  @Check
  public void checkAumentarDisminuir(final Dispositivos dispositivo) {
    if (((this.checkDispositivosAumento(dispositivo) && this.checkAumentoDisminu(dispositivo.getAccion())) && Objects.equal(dispositivo.getAccion().getNumero(), null))) {
      TiposDispositivo _nombre = dispositivo.getNombre();
      String _plus = ("Acuerdese del valor que quiere AUMENTAR/ DISMINUIR " + _nombre);
      this.warning(_plus, 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_INCORRECTA);
    } else {
      if (((!this.checkDispositivosAumento(dispositivo)) && this.checkAumentoDisminu(dispositivo.getAccion()))) {
        this.error("Error al poner el dispositivo solo puede aumentar y disminuir el termostato o la luz", 
          GratextPackage.Literals.DISPOSITIVOS__NOMBRE, GratextValidator.DISPOSITIVO_INCORRECTO);
      } else {
        if ((this.checkDispositivosAumento(dispositivo) && (!this.checkAumentoDisminu(dispositivo.getAccion())))) {
          this.error("Error al realizar la accion solo es aumentar o disminuir", 
            GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_AUMENTAR_DISMINUIR);
        }
      }
    }
  }
  
  /**
   * Metodo que checkea las  acciones de aumento y disminucion
   */
  public boolean checkAumentoDisminu(final accion accion) {
    if ((accion.getNombreAccion().getName().equals("AUMENTAR") || accion.getNombreAccion().getName().equals("DISMINUIR"))) {
      return true;
    }
    return false;
  }
  
  /**
   * Metodo que checkea los dispositivos con acciones de aumento y disminucion
   */
  public boolean checkDispositivosAumento(final Dispositivos dispositivo) {
    if ((dispositivo.getNombre().getName().equals("TERMOSTATO") || 
      dispositivo.getNombre().getName().equals("LUZ"))) {
      return true;
    }
    return false;
  }
  
  /**
   * Metodo que checkea los tipo de datos enviados por el dispositivo
   */
  @Check
  public void checkDatos(final Dispositivos dispositivo) {
    if (((!Objects.equal(dispositivo.getAccion().getNumero().getDatos(), null)) && (!this.checkDato(dispositivo)))) {
      this.error("Error en el dato ", 
        GratextPackage.Literals.DISPOSITIVOS__ACCION, GratextValidator.ACCION_INCORRECTA);
    }
  }
  
  /**
   * Metodo que checkea los dispositivos con posiblidad de mandar datos
   */
  public boolean checkDato(final Dispositivos dispositivo) {
    if ((((dispositivo.getNombre().getName().equals("CAMARA") && dispositivo.getAccion().getNumero().getDatos().getName().equals("FOTOS")) || (dispositivo.getNombre().getName().equals("TERMOSTATO") && dispositivo.getAccion().getNumero().getDatos().getName().equals("GRADOS"))) || (dispositivo.getNombre().getName().equals("LUZ") && dispositivo.getAccion().getNumero().getDatos().getName().equals("VOLTIOS")))) {
      return true;
    } else {
      return false;
    }
  }
}
