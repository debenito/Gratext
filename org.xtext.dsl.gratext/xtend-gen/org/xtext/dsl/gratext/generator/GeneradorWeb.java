package org.xtext.dsl.gratext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.xtext.dsl.gratext.gratext.accion;

@SuppressWarnings("all")
public class GeneradorWeb {
  private Resource resource;
  
  private IFileSystemAccess2 fsa;
  
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
  
  public void compilar() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Granja> _filter = Iterables.<Granja>filter(_iterable, Granja.class);
    for (final Granja r : _filter) {
      {
        this.compilarTexto(r);
        this.identificadores++;
      }
    }
  }
  
  public CharSequence compilarTexto(final Granja granja) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compilarGranja = this.compilarGranja(granja);
    this.fsa.generateFile("scripts/granja_gen.xml", _compilarGranja);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarGranja(final Granja r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<registro>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispositivo>\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispositivo_id>dispositivo");
    _builder.append(this.identificadores, "\t");
    _builder.append("<dispositivo_id>");
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
    EList<Dispositivos> _dispositivos = r.getDispositivos();
    CharSequence _compilarDispositivos = this.compilarDispositivos(_dispositivos);
    _builder.append(_compilarDispositivos, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</registro>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarDispositivos(final List<Dispositivos> dispositivos) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    {
      for(final Dispositivos d : dispositivos) {
        {
          accion _accion = d.getAccion();
          NombreAccion _nombreAccion = _accion.getNombreAccion();
          String _name = _nombreAccion.getName();
          boolean _equals = _name.equals("ESTADO");
          if (_equals) {
            _builder.append("<servicio>");
            _builder.newLine();
            CharSequence _compilarDispositivo = this.compilarDispositivo(d);
            _builder.append(_compilarDispositivo, "");
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
  
  public CharSequence compilarAccion(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("<id_action> dispositivoAccion");
    _builder.append(this.identificadores, "");
    _builder.append("-");
    int _plusPlus = this.identificador_accion++;
    _builder.append(_plusPlus, "");
    _builder.append("</id_action>");
    _builder.newLineIfNotEmpty();
    _builder.append("<action_name>");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre, "");
    _builder.append("</action_name>");
    _builder.newLineIfNotEmpty();
    {
      accion _accion = i.getAccion();
      String _descripcion = _accion.getDescripcion();
      boolean _notEquals = (!Objects.equal(_descripcion, null));
      if (_notEquals) {
        _builder.append("<action_descripcion>");
        accion _accion_1 = i.getAccion();
        String _descripcion_1 = _accion_1.getDescripcion();
        _builder.append(_descripcion_1, "");
        _builder.append("</action_descripcion>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<action_descripcion>");
        accion _accion_2 = i.getAccion();
        NombreAccion _nombreAccion = _accion_2.getNombreAccion();
        _builder.append(_nombreAccion, "");
        _builder.append("</action_descripcion>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      accion _accion_3 = i.getAccion();
      String _numero = _accion_3.getNumero();
      boolean _notEquals_1 = (!Objects.equal(_numero, null));
      if (_notEquals_1) {
        _builder.append("<has_menssage>");
        accion _accion_4 = i.getAccion();
        String _numero_1 = _accion_4.getNumero();
        String _comprobarNumero = this.comprobarNumero(_numero_1);
        _builder.append(_comprobarNumero, "");
        _builder.append("</has_message>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<has_menssage>-</has_message>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public String comprobarNumero(final String numero) {
    while ((this.i < numero.length())) {
      {
        char _charAt = numero.charAt(this.i);
        boolean _isDigit = Character.isDigit(_charAt);
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
