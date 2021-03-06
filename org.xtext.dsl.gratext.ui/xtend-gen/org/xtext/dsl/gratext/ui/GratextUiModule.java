/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * @author :Jose antonio de Benito Suarez
 * Utilizada para modificar componentes dentro de la interface
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class GratextUiModule extends AbstractGratextUiModule {
  public GratextUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {

		return GratextHighlightConfiguration.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {

		return GratextHighlightCalculator.class;
	}

	public Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {

		return GratextOnlineTransformer.class;

	}
}
