/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.dsl.gratext.gratext.Granja

@RunWith(XtextRunner)
@InjectWith(GratextInjectorProvider)
class GratextParsingTest{

	@Inject
	ParseHelper<Granja> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
