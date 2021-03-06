/*
 * generated by Xtext 2.9.1
 */
package org.xtext.guicemodules.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.guicemodules.ui.internal.GuicemodulesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GuiceModulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GuicemodulesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GuicemodulesActivator.getInstance().getInjector(GuicemodulesActivator.ORG_XTEXT_GUICEMODULES_GUICEMODULES);
	}
	
}
