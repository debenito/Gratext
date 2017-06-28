package org.xtext.dsl.gratext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.gratext.gratext.Datos;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.NombreAccion;
import org.xtext.dsl.gratext.gratext.Tipo;
import org.xtext.dsl.gratext.gratext.TiposDispositivo;
import org.xtext.dsl.gratext.gratext.login;
import org.xtext.dsl.gratext.gratext.numero;

/**
 * @author : Jose antonio de Benito Suarez
 * Clase creada para generar el fichero de salida de texto
 */
@SuppressWarnings("all")
public class GeneradorTexto {
  /**
   * Componentes Resource y IFileSystem acces extendidos del generator
   */
  private Resource resource;
  
  private IFileSystemAccess2 fsa;
  
  public GeneradorTexto(final Resource resource, final IFileSystemAccess2 fsa) {
    this.fsa = fsa;
    this.resource = resource;
  }
  
  /**
   * Metodo compilar definido para la generacion del fichero de salida recorriendo el arbol
   * generado por el programa y llamando a compilarGranja
   */
  public void compilar() {
    StringBuilder sb = new StringBuilder();
    long time_start = System.currentTimeMillis();
    Iterable<Granja> _filter = Iterables.<Granja>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Granja.class);
    for (final Granja i : _filter) {
      sb.append(this.compilarGranja(i));
    }
    this.fsa.generateFile("granja.txt", sb.toString());
    long time_end = System.currentTimeMillis();
    System.out.println((("the task has taken " + Long.valueOf((time_end - time_start))) + " milliseconds"));
  }
  
  /**
   * Metodo compilar granja el cual recibe un argumento de tipo granja y saca los valores  de la misma.
   */
  public CharSequence compilarGranja(final Granja granja) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("nombre:");
    String _nombreGranja = granja.getNombreGranja();
    _builder.append(_nombreGranja, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("centralita:");
    Tipo _tipo = granja.getTipo();
    _builder.append(_tipo, " ");
    _builder.newLineIfNotEmpty();
    {
      login _login = granja.getLogin();
      boolean _notEquals = (!Objects.equal(_login, null));
      if (_notEquals) {
        _builder.append("usuario:");
        String _usuario = granja.getLogin().getUsuario();
        _builder.append(_usuario);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("contraseña: ");
        String _contrasena = granja.getLogin().getContrasena();
        _builder.append(_contrasena);
        _builder.newLineIfNotEmpty();
      }
    }
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
  
  /**
   * Metodo definido para sacar los valores de un dispositivo.
   * Tiene un parametro de entrada que es de tipo dispotitivo
   */
  public CharSequence compilarTexto(final Dispositivos i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Dispositivo: ");
    TiposDispositivo _nombre = i.getNombre();
    _builder.append(_nombre);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("codigo: ");
    String _codigo = i.getCodigo();
    _builder.append(_codigo);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    {
      String _temperatura = i.getTemperatura();
      boolean _notEquals = (!Objects.equal(_temperatura, null));
      if (_notEquals) {
        _builder.append("accion: ");
        NombreAccion _nombreAccion = i.getAccion().getNombreAccion();
        _builder.append(_nombreAccion);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("temperatura : ");
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
        _builder.append("accion: ");
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
        _builder.append("numero: ");
        String _idNumero = i.getAccion().getNumero().getIdNumero();
        _builder.append(_idNumero);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("datos:");
        Datos _datos = i.getAccion().getNumero().getDatos();
        _builder.append(_datos);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _descripcion = i.getAccion().getDescripcion();
      boolean _notEquals_2 = (!Objects.equal(_descripcion, null));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("descripcion: ");
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
