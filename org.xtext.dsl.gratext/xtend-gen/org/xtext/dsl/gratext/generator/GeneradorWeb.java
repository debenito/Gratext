package org.xtext.dsl.gratext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.Tipo;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.numero;

/**
 * @author : Jose antonio de Benito Suarez
 * Clase creada para generar el fichero de salida de xml
 */
@SuppressWarnings("all")
public class GeneradorWeb {
  /**
   * Componentes Resource y IFileSystem acces extendidos del generator
   */
  private Resource resource;
  
  private IFileSystemAccess2 fsa;
  
  /**
   * Atributos necesarios para transmitir fichero xml
   */
  private int identificadores;
  
  private int identificador_servicio;
  
  private int identificador_accion;
  
  private int i = 0;
  
  public GeneradorWeb(final Resource resource, final IFileSystemAccess2 fsa) {
    this.fsa = fsa;
    this.resource = resource;
    this.identificadores = 0;
    this.identificador_servicio = 0;
    this.identificador_accion = 0;
  }
  
  /**
   * Metodo compilar definido para la generacion del fichero de salida recorriendo el arbol
   * generado por el programa y llamando a compilarGranja
   */
  public void compilar() {
    Iterable<Granja> _filter = Iterables.<Granja>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Granja.class);
    for (final Granja r : _filter) {
      {
        this.compilarTexto(r);
        this.identificadores++;
      }
    }
  }
  
  /**
   * Metodo compilar granja el cual recibe un argumento de tipo granja para generar la ruta de salida
   * del fichero y llamar otro metodo que saque los valores
   */
  public CharSequence compilarTexto(final Granja granja) {
    StringConcatenation _builder = new StringConcatenation();
    this.fsa.generateFile("scripts/granja_gen.xml", this.compilarGranja(granja));
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Metodo compilar granja el cual recibe un argumento de tipo granja y saca los valores de los dispositivos.
   */
  public CharSequence compilarGranja(final Granja r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<registro>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispositivo>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispositivo_id>dispositivo");
    _builder.append(this.identificadores, "\t");
    _builder.append("</dispositivo_id>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<dispositivo_descripcion>Es el ");
    Tipo _tipo = r.getTipo();
    _builder.append(_tipo, "\t");
    _builder.append("</dispositivo_descripcion>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</dispositivo>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compilarDispositivos = this.compilarDispositivos(r.getDispositivos());
    _builder.append(_compilarDispositivos, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</registro>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Metodo encargado de sacar las acciones o servidos de los dispositivos
   */
  public CharSequence compilarDispositivos(final List<Dispositivos> dispositivos) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    {
      for(final Dispositivos d : dispositivos) {
        {
          boolean _equals = d.getAccion().getNombreAccion().getName().equals("ESTADO");
          if (_equals) {
            _builder.append("<servicio>");
            _builder.newLine();
            CharSequence _compilarDispositivo = this.compilarDispositivo(d);
            _builder.append(_compilarDispositivo);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("</servicio>");
            _builder.newLine();
          } else {
            _builder.append("<action>");
            _builder.newLine();
            _builder.append("\t\t\t");
            CharSequence _compilarAccion = this.compilarAccion(d);
            _builder.append(_compilarAccion, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.newLine();
            _builder.append("</action>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Metodo encargado de sacar servicios
   */
  public CharSequence compilarDispositivo(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<idservicio>dispositivoServicio");
    _builder.append(this.identificadores, "\t");
    _builder.append("-");
    int _plusPlus = this.identificador_servicio++;
    _builder.append(_plusPlus, "\t");
    _builder.append("</idservicio>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<descripcion>");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append("</descripcion>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<enviaTipo>");
    String _serviciosConDatos = this.serviciosConDatos(i);
    _builder.append(_serviciosConDatos, "\t");
    _builder.append("<enviaTipo>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Metodo que comprueba el tipo de datos a sacar por el servicio
   */
  public String serviciosConDatos(final Dispositivos dispositivo) {
    if ((((dispositivo.getNombre().getName().equals("DEPOSITO_LECHE") || dispositivo.getNombre().getName().equals("FUEGO_HUMO")) || 
      dispositivo.getNombre().getName().equals("ESTACION_METEOROLOGICA")) || dispositivo.getNombre().getName().equals("CO2"))) {
      return "float";
    } else {
      if ((dispositivo.getNombre().getName().equals("EMERGENCIA") || dispositivo.getNombre().getName().equals("VIENTO"))) {
        return "int";
      } else {
        if (((dispositivo.getNombre().getName().equals("INUNDACION") || 
          dispositivo.getNombre().getName().equals("ROTURA_CRISTAL")) || dispositivo.getNombre().getName().equals("LLUVIA"))) {
          return "boolean";
        } else {
          return "-";
        }
      }
    }
  }
  
  /**
   * Metodo que saca las acciones de los dispositivos
   */
  public CharSequence compilarAccion(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("<id_action> dispositivoAccion");
    _builder.append(this.identificadores);
    _builder.append("-");
    int _plusPlus = this.identificador_accion++;
    _builder.append(_plusPlus);
    _builder.append("</id_action>");
    _builder.newLineIfNotEmpty();
    _builder.append("<action_name>");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre);
    _builder.append("</action_name>");
    _builder.newLineIfNotEmpty();
    {
      String _descripcion = i.getAccion().getDescripcion();
      boolean _notEquals = (!Objects.equal(_descripcion, null));
      if (_notEquals) {
        _builder.append("<action_descripcion>");
        String _descripcion_1 = i.getAccion().getDescripcion();
        _builder.append(_descripcion_1);
        _builder.append("</action_descripcion>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<action_descripcion>");
        NombreAccion _nombreAccion = i.getAccion().getNombreAccion();
        _builder.append(_nombreAccion);
        _builder.append("</action_descripcion>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      numero _numero = i.getAccion().getNumero();
      boolean _notEquals_1 = (!Objects.equal(_numero, null));
      if (_notEquals_1) {
        _builder.append("<has_menssage>");
        String _comprobarNumero = this.comprobarNumero(i.getAccion().getNumero().getIdNumero());
        _builder.append(_comprobarNumero);
        _builder.append("</has_message>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<has_menssage>-</has_message>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Comprobador de numeros si son de tipo flotante o entero
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
}
