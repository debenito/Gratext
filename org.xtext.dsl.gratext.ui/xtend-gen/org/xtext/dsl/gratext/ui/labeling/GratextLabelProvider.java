/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class GratextLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GratextLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}