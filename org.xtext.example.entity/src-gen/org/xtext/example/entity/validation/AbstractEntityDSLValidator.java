/*
 * generated by Xtext
 */
package org.xtext.example.entity.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractEntityDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.entity.entityDSL.EntityDSLPackage.eINSTANCE);
		return result;
	}
}
