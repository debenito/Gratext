/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GratextStandaloneSetup extends GratextStandaloneSetupGenerated {

	def static void doSetup() {
		new GratextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}