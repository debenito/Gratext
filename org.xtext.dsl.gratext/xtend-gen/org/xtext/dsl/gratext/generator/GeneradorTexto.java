package org.xtext.dsl.gratext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.accion;

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
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Dispositivos> _filter = Iterables.<Dispositivos>filter(_iterable, Dispositivos.class);
    for (final Dispositivos i : _filter) {
      CharSequence _compilarTexto = this.compilarTexto(i);
      sb.append(_compilarTexto);
    }
    String _string = sb.toString();
    this.fsa.generateFile("granja.txt", _string);
  }
  
  public CharSequence compilarTexto(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("Dispositivo: ");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append(" con el siguiente codigo del dispositivo ");
    String _codigo = i.getCodigo();
    _builder.append(_codigo, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      String _temperatura = i.getTemperatura();
      boolean _notEquals = (!Objects.equal(_temperatura, null));
      if (_notEquals) {
        _builder.append("Se desea ");
        accion _accion = i.getAccion();
        NombreAccion _nombreAccion = _accion.getNombreAccion();
        _builder.append(_nombreAccion, "");
        _builder.append(" la temperatura del : ");
        String _temperatura_1 = i.getTemperatura();
        _builder.append(_temperatura_1, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _temperatura_2 = i.getTemperatura();
      boolean _equals = Objects.equal(_temperatura_2, null);
      if (_equals) {
        _builder.append("Se desea la siguiente accion ");
        accion _accion_1 = i.getAccion();
        NombreAccion _nombreAccion_1 = _accion_1.getNombreAccion();
        _builder.append(_nombreAccion_1, "");
        _builder.append("  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      accion _accion_2 = i.getAccion();
      String _numero = _accion_2.getNumero();
      boolean _notEquals_1 = (!Objects.equal(_numero, null));
      if (_notEquals_1) {
        _builder.append("\"Con el siguiente valor:\"");
        accion _accion_3 = i.getAccion();
        String _numero_1 = _accion_3.getNumero();
        _builder.append(_numero_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      accion _accion_4 = i.getAccion();
      String _descripcion = _accion_4.getDescripcion();
      boolean _notEquals_2 = (!Objects.equal(_descripcion, null));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("El dispositivo contiene la siguiente descripcion: ");
        accion _accion_5 = i.getAccion();
        String _descripcion_1 = _accion_5.getDescripcion();
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
