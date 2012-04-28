
package com.polopoly.ps.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TextContentStandaloneSetup extends TextContentStandaloneSetupGenerated{

	public static void doSetup() {
		new TextContentStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

