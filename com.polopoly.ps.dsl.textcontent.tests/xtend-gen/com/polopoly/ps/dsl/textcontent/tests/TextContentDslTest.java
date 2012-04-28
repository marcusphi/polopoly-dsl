package com.polopoly.ps.dsl.textcontent.tests;

import com.google.inject.Inject;
import com.polopoly.ps.dsl.TextContentInjectorProvider;
import com.polopoly.ps.dsl.textContent.Component;
import com.polopoly.ps.dsl.textContent.DefaultListElement;
import com.polopoly.ps.dsl.textContent.ListElement;
import com.polopoly.ps.dsl.textContent.NamedListElement;
import com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata;
import com.polopoly.ps.dsl.textContent.Reference;
import com.polopoly.ps.dsl.textContent.TextContent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(TextContentInjectorProvider.class)
@RunWith(XtextRunner.class)
public class TextContentDslTest {
  private TextContent model;
  
  @Inject
  private ParseHelper<TextContent> parser;
  
  @Before
  public void setUp() {
    try {
      TextContent _parse = this.parser.parse("\n\t\t\tid:dsl.article\n\t\t\tinputtemplate:Dsl.Test\n\t\t\tsecurityparent:p.SecurityRootDepartment\n\t\t\tname:\"DSL Test Article Name\"\n\t\t\t# A comment\n\t\t\tcomponent:group:compName:\"value string\"\n\t\t\tcomponent:group:compName.2:\"value string\"\n\t\t\t#component:group:compName:\"commented out\"\n\t\t\tref:group:refName:referredId\n\t\t\tref:group:refName:referredId.2\n\t\t\t#ref:group:refName:commentedOut\n\t\t\tlist:.element.1\n\t\t\tlist:qualified.element\n\t\t\tlist:listName:listNameElement\n\t\t\tlist:listName:listNameElement:refMeta\n\t\t\t#list:commentedOut\n\t\t");
      this.model = _parse;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMandatoryElements() {
      String _id = this.model.getId();
      Assert.assertEquals("dsl.article", _id);
      String _inputtemplate = this.model.getInputtemplate();
      Assert.assertEquals("Dsl.Test", _inputtemplate);
      String _securityparent = this.model.getSecurityparent();
      Assert.assertEquals("p.SecurityRootDepartment", _securityparent);
      String _name = this.model.getName();
      Assert.assertEquals("DSL Test Article Name", _name);
  }
  
  @Test
  public void testLists() {
      EList<ListElement> _listElements = this.model.getListElements();
      int _size = _listElements.size();
      Assert.assertEquals(4, _size);
      EList<ListElement> _listElements_1 = this.model.getListElements();
      ListElement _get = _listElements_1.get(0);
      String _referredId = _get.getReferredId();
      Assert.assertEquals(".element.1", _referredId);
      EList<ListElement> _listElements_2 = this.model.getListElements();
      ListElement _get_1 = _listElements_2.get(1);
      String _referredId_1 = _get_1.getReferredId();
      Assert.assertEquals("qualified.element", _referredId_1);
      EList<ListElement> _listElements_3 = this.model.getListElements();
      ListElement _get_2 = _listElements_3.get(1);
      Assert.assertTrue((_get_2 instanceof DefaultListElement));
      EList<ListElement> _listElements_4 = this.model.getListElements();
      ListElement _get_3 = _listElements_4.get(2);
      final NamedListElement namedListElement = ((NamedListElement) _get_3);
      String _listName = namedListElement.getListName();
      Assert.assertEquals("listName", _listName);
      String _referredId_2 = namedListElement.getReferredId();
      Assert.assertEquals("listNameElement", _referredId_2);
      EList<ListElement> _listElements_5 = this.model.getListElements();
      ListElement _get_4 = _listElements_5.get(3);
      final NamedListElementWithRefMetadata ListElemWithRefMeta = ((NamedListElementWithRefMetadata) _get_4);
      String _listName_1 = ListElemWithRefMeta.getListName();
      Assert.assertEquals("listName", _listName_1);
      String _referredId_3 = ListElemWithRefMeta.getReferredId();
      Assert.assertEquals("listNameElement", _referredId_3);
      String _referenceMetadataId = ListElemWithRefMeta.getReferenceMetadataId();
      Assert.assertEquals("refMeta", _referenceMetadataId);
  }
  
  @Test
  public void testComponents() {
      EList<Component> _components = this.model.getComponents();
      int _size = _components.size();
      Assert.assertEquals(2, _size);
      EList<Component> _components_1 = this.model.getComponents();
      Component _get = _components_1.get(0);
      final Component component0 = ((Component) _get);
      String _group = component0.getGroup();
      Assert.assertEquals("group", _group);
      String _name = component0.getName();
      Assert.assertEquals("compName", _name);
      String _value = component0.getValue();
      Assert.assertEquals("value string", _value);
  }
  
  @Test
  public void testRefrences() {
      EList<Reference> _references = this.model.getReferences();
      int _size = _references.size();
      Assert.assertEquals(2, _size);
      EList<Reference> _references_1 = this.model.getReferences();
      Reference _get = _references_1.get(0);
      final Reference ref0 = ((Reference) _get);
      String _group = ref0.getGroup();
      Assert.assertEquals("group", _group);
      String _name = ref0.getName();
      Assert.assertEquals("refName", _name);
      String _referredId = ref0.getReferredId();
      Assert.assertEquals("referredId", _referredId);
  }
}
