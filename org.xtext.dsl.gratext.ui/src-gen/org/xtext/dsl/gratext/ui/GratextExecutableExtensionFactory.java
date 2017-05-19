/*
 * generated by Xtext 2.11.0
 */
package org.xtext.dsl.gratext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.dsl.gratext.ui.internal.GratextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GratextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GratextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GratextActivator.getInstance().getInjector(GratextActivator.ORG_XTEXT_DSL_GRATEXT_GRATEXT);
	}
	
}
