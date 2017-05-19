package org.xtext.dsl.gratext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
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
import org.xtext.dsl.gratext.gratext.login;
import org.xtext.dsl.gratext.gratext.numero;

@SuppressWarnings("all")
public class GeneradorTexto {
  private Resource resource;
  
  private IFileSystemAccess2 fsa;
  
  public GeneradorTexto(final Resource resource, final IFileSystemAccess2 fsa) {
    this.fsa = fsa;
    this.resource = resource;
  }
  
  /**
   * fsa.generateFile('granja.txt', 'Dispositivos de la granja: ' +
   * resource.allContents
   * .filter(typeof(Granja))
   * .map[name]
   * .join(', '))
   */
  public void compilar() {
    StringBuilder sb = new StringBuilder();
    Iterable<Granja> _filter = Iterables.<Granja>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Granja.class);
    for (final Granja i : _filter) {
      sb.append(this.compilarGranja(i));
    }
    this.fsa.generateFile("granja.txt", sb.toString());
  }
  
  public CharSequence compilarGranja(final Granja granja) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Nombre de la granja registrada: ");
    String _nombreGranja = granja.getNombreGranja();
    _builder.append(_nombreGranja);
    _builder.append(" tipo de dispositivo o centralita:");
    Tipo _tipo = granja.getTipo();
    _builder.append(_tipo);
    _builder.newLineIfNotEmpty();
    {
      login _login = granja.getLogin();
      boolean _notEquals = (!Objects.equal(_login, null));
      if (_notEquals) {
        _builder.append("Su usuario es el siguiente:");
        String _usuario = granja.getLogin().getUsuario();
        _builder.append(_usuario);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("Su contraseña es la siguiente: ");
        String _contrasena = granja.getLogin().getContrasena();
        _builder.append(_contrasena);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("Los dispositivos conectados en la granja ");
    String _nombreGranja_1 = granja.getNombreGranja();
    _builder.append(_nombreGranja_1);
    _builder.append(" son los siguientes:");
    _builder.newLineIfNotEmpty();
    _builder.append("LISTA DE DISPOSITIVOS");
    _builder.newLine();
    _builder.append("=========================================================");
    _builder.newLine();
    {
      EList<Dispositivos> _dispositivos = granja.getDispositivos();
      for(final Dispositivos i : _dispositivos) {
        CharSequence _compilarTexto = this.compilarTexto(i);
        _builder.append(_compilarTexto);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compilarTexto(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Dispositivo: ");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre);
    _builder.append(" con el siguiente codigo del dispositivo ");
    String _codigo = i.getCodigo();
    _builder.append(_codigo);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    {
      String _temperatura = i.getTemperatura();
      boolean _notEquals = (!Objects.equal(_temperatura, null));
      if (_notEquals) {
        _builder.append("Se desea ");
        NombreAccion _nombreAccion = i.getAccion().getNombreAccion();
        _builder.append(_nombreAccion);
        _builder.append(" la temperatura del : ");
        String _temperatura_1 = i.getTemperatura();
        _builder.append(_temperatura_1);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _temperatura_2 = i.getTemperatura();
      boolean _equals = Objects.equal(_temperatura_2, null);
      if (_equals) {
        _builder.append("Se desea la siguiente accion ");
        NombreAccion _nombreAccion_1 = i.getAccion().getNombreAccion();
        _builder.append(_nombreAccion_1);
        _builder.append("  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      numero _numero = i.getAccion().getNumero();
      boolean _notEquals_1 = (!Objects.equal(_numero, null));
      if (_notEquals_1) {
        _builder.append("\"Con el siguiente valor:\"");
        numero _numero_1 = i.getAccion().getNumero();
        _builder.append(_numero_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _descripcion = i.getAccion().getDescripcion();
      boolean _notEquals_2 = (!Objects.equal(_descripcion, null));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("El dispositivo contiene la siguiente descripcion: ");
        String _descripcion_1 = i.getAccion().getDescripcion();
        _builder.append(_descripcion_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
