/*
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.dsl.gratext.ui.internal.GratextActivator;

public class GratextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GratextActivator.getInstance().getInjector("org.xtext.dsl.gratext.Gratext");
	}

}
