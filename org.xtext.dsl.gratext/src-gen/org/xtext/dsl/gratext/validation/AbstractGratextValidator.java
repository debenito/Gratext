/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGratextValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.dsl.gratext.gratext.GratextPackage.eINSTANCE);
		return result;
	}
	
}