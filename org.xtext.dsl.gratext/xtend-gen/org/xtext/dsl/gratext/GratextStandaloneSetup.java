/**
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext;

import org.xtext.dsl.gratext.GratextStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GratextStandaloneSetup extends GratextStandaloneSetupGenerated {
  public static void doSetup() {
    GratextStandaloneSetup _gratextStandaloneSetup = new GratextStandaloneSetup();
    _gratextStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
