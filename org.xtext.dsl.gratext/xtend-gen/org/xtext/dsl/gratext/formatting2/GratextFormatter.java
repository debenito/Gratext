/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.accion;
import org.xtext.dsl.gratext.gratext.contrasena;
import org.xtext.dsl.gratext.gratext.usuario;
import org.xtext.dsl.gratext.services.GratextGrammarAccess;

@SuppressWarnings("all")
public class GratextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GratextGrammarAccess _gratextGrammarAccess;
  
  protected void _format(final Granja granja, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.autowrap(30);
    };
    document.<Granja>append(granja, _function);
    usuario _usuario = granja.getUsuario();
    document.<usuario>format(_usuario);
    contrasena _contrasena = granja.getContrasena();
    document.<contrasena>format(_contrasena);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      this._gratextGrammarAccess.getML_COMMENTRule();
    };
    Granja _append = document.<Granja>append(granja, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<Granja>append(_append, _function_2);
    EList<Dispositivos> _dispositivos = granja.getDispositivos();
    for (final Dispositivos dispositivos : _dispositivos) {
      document.<Dispositivos>format(dispositivos);
    }
  }
  
  protected void _format(final Dispositivos dispositivos, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(dispositivos);
    ISemanticRegion _keyword = _regionFor.keyword("Codigo :");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_keyword, _function);
    accion _accion = dispositivos.getAccion();
    document.<accion>format(_accion);
  }
  
  public void format(final Object dispositivos, final IFormattableDocument document) {
    if (dispositivos instanceof XtextResource) {
      _format((XtextResource)dispositivos, document);
      return;
    } else if (dispositivos instanceof Dispositivos) {
      _format((Dispositivos)dispositivos, document);
      return;
    } else if (dispositivos instanceof Granja) {
      _format((Granja)dispositivos, document);
      return;
    } else if (dispositivos instanceof EObject) {
      _format((EObject)dispositivos, document);
      return;
    } else if (dispositivos == null) {
      _format((Void)null, document);
      return;
    } else if (dispositivos != null) {
      _format(dispositivos, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dispositivos, document).toString());
    }
  }
}
