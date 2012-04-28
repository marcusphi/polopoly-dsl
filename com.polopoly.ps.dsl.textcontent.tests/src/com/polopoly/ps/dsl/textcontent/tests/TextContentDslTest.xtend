package com.polopoly.ps.dsl.textcontent.tests

import static org.junit.Assert.*

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import com.polopoly.ps.dsl.TextContentInjectorProvider
import com.polopoly.ps.dsl.textContent.TextContent
import com.polopoly.ps.dsl.textContent.DefaultListElement
import com.polopoly.ps.dsl.textContent.NamedListElement
import com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata
import com.polopoly.ps.dsl.textContent.Component
import org.junit.Before
import com.polopoly.ps.dsl.textContent.Reference


@InjectWith(typeof(TextContentInjectorProvider))
@RunWith(typeof(XtextRunner))
class TextContentDslTest {
	
	TextContent model

	@Inject
	ParseHelper<TextContent> parser
	
	@Before
	def void setUp() {
		model = parser.parse("
			id:dsl.article
			inputtemplate:Dsl.Test
			securityparent:p.SecurityRootDepartment
			name:\"DSL Test Article Name\"
			# A comment
			component:group:compName:\"value string\"
			component:group:compName.2:\"value string\"
			#component:group:compName:\"commented out\"
			ref:group:refName:referredId
			ref:group:refName:referredId.2
			#ref:group:refName:commentedOut
			list:.element.1
			list:qualified.element
			list:listName:listNameElement
			list:listName:listNameElement:refMeta
			#list:commentedOut
		")
	}
	
	@Test 
	def void testMandatoryElements() {
		assertEquals("dsl.article", model.id)
		assertEquals("Dsl.Test", model.inputtemplate)
		assertEquals("p.SecurityRootDepartment", model.securityparent)
		assertEquals("DSL Test Article Name", model.name)
	}
	
	@Test 
	def void testLists() {
		assertEquals(4, model.listElements.size)
		
		assertEquals(".element.1", model.listElements.get(0).referredId)
		
		assertEquals("qualified.element", model.listElements.get(1).referredId)
		assertTrue(model.listElements.get(1) instanceof DefaultListElement)
		
		val namedListElement = model.listElements.get(2) as NamedListElement
		assertEquals("listName", namedListElement.listName)
		assertEquals("listNameElement", namedListElement.referredId)
		
		val ListElemWithRefMeta = model.listElements.get(3) as NamedListElementWithRefMetadata
		assertEquals("listName", ListElemWithRefMeta.listName)
		assertEquals("listNameElement", ListElemWithRefMeta.referredId)
		assertEquals("refMeta", ListElemWithRefMeta.referenceMetadataId)
	}
	
	@Test 
	def void testComponents() {
		assertEquals(2, model.components.size);
		val component0 = model.components.get(0) as Component
		assertEquals("group", component0.group)
		assertEquals("compName", component0.name)
		assertEquals("value string", component0.value)
	}

	@Test 
	def void testRefrences() {
		assertEquals(2, model.references.size);
		val ref0 = model.references.get(0) as Reference
		assertEquals("group", ref0.group)
		assertEquals("refName", ref0.name)
		assertEquals("referredId", ref0.referredId)
	}	
}