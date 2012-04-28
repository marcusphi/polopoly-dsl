/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.AbstractNamedListElement;
import com.polopoly.ps.dsl.textContent.Component;
import com.polopoly.ps.dsl.textContent.DefaultListElement;
import com.polopoly.ps.dsl.textContent.ListElement;
import com.polopoly.ps.dsl.textContent.NamedListElement;
import com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata;
import com.polopoly.ps.dsl.textContent.Reference;
import com.polopoly.ps.dsl.textContent.TextContent;
import com.polopoly.ps.dsl.textContent.TextContentFactory;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextContentPackageImpl extends EPackageImpl implements TextContentPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultListElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractNamedListElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedListElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedListElementWithRefMetadataEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextContentPackageImpl()
  {
    super(eNS_URI, TextContentFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TextContentPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextContentPackage init()
  {
    if (isInited) return (TextContentPackage)EPackage.Registry.INSTANCE.getEPackage(TextContentPackage.eNS_URI);

    // Obtain or create and register package
    TextContentPackageImpl theTextContentPackage = (TextContentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextContentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextContentPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTextContentPackage.createPackageContents();

    // Initialize created meta-data
    theTextContentPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextContentPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextContentPackage.eNS_URI, theTextContentPackage);
    return theTextContentPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextContent()
  {
    return textContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextContent_Id()
  {
    return (EAttribute)textContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextContent_Inputtemplate()
  {
    return (EAttribute)textContentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextContent_Securityparent()
  {
    return (EAttribute)textContentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextContent_Name()
  {
    return (EAttribute)textContentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextContent_Components()
  {
    return (EReference)textContentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextContent_References()
  {
    return (EReference)textContentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextContent_ListElements()
  {
    return (EReference)textContentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Group()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Value()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Group()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Name()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_ReferredId()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListElement()
  {
    return listElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListElement_ReferredId()
  {
    return (EAttribute)listElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultListElement()
  {
    return defaultListElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractNamedListElement()
  {
    return abstractNamedListElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNamedListElement_ListName()
  {
    return (EAttribute)abstractNamedListElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedListElement()
  {
    return namedListElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedListElementWithRefMetadata()
  {
    return namedListElementWithRefMetadataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedListElementWithRefMetadata_ReferenceMetadataId()
  {
    return (EAttribute)namedListElementWithRefMetadataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContentFactory getTextContentFactory()
  {
    return (TextContentFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    textContentEClass = createEClass(TEXT_CONTENT);
    createEAttribute(textContentEClass, TEXT_CONTENT__ID);
    createEAttribute(textContentEClass, TEXT_CONTENT__INPUTTEMPLATE);
    createEAttribute(textContentEClass, TEXT_CONTENT__SECURITYPARENT);
    createEAttribute(textContentEClass, TEXT_CONTENT__NAME);
    createEReference(textContentEClass, TEXT_CONTENT__COMPONENTS);
    createEReference(textContentEClass, TEXT_CONTENT__REFERENCES);
    createEReference(textContentEClass, TEXT_CONTENT__LIST_ELEMENTS);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__GROUP);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEAttribute(componentEClass, COMPONENT__VALUE);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__GROUP);
    createEAttribute(referenceEClass, REFERENCE__NAME);
    createEAttribute(referenceEClass, REFERENCE__REFERRED_ID);

    listElementEClass = createEClass(LIST_ELEMENT);
    createEAttribute(listElementEClass, LIST_ELEMENT__REFERRED_ID);

    defaultListElementEClass = createEClass(DEFAULT_LIST_ELEMENT);

    abstractNamedListElementEClass = createEClass(ABSTRACT_NAMED_LIST_ELEMENT);
    createEAttribute(abstractNamedListElementEClass, ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME);

    namedListElementEClass = createEClass(NAMED_LIST_ELEMENT);

    namedListElementWithRefMetadataEClass = createEClass(NAMED_LIST_ELEMENT_WITH_REF_METADATA);
    createEAttribute(namedListElementWithRefMetadataEClass, NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    defaultListElementEClass.getESuperTypes().add(this.getListElement());
    abstractNamedListElementEClass.getESuperTypes().add(this.getListElement());
    namedListElementEClass.getESuperTypes().add(this.getAbstractNamedListElement());
    namedListElementWithRefMetadataEClass.getESuperTypes().add(this.getAbstractNamedListElement());

    // Initialize classes and features; add operations and parameters
    initEClass(textContentEClass, TextContent.class, "TextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextContent_Id(), ecorePackage.getEString(), "id", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextContent_Inputtemplate(), ecorePackage.getEString(), "inputtemplate", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextContent_Securityparent(), ecorePackage.getEString(), "securityparent", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextContent_Name(), ecorePackage.getEString(), "name", null, 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextContent_Components(), this.getComponent(), null, "components", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextContent_References(), this.getReference(), null, "references", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextContent_ListElements(), this.getListElement(), null, "listElements", null, 0, -1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Group(), ecorePackage.getEString(), "group", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Value(), ecorePackage.getEString(), "value", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_Group(), ecorePackage.getEString(), "group", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_ReferredId(), ecorePackage.getEString(), "referredId", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listElementEClass, ListElement.class, "ListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListElement_ReferredId(), ecorePackage.getEString(), "referredId", null, 0, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultListElementEClass, DefaultListElement.class, "DefaultListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractNamedListElementEClass, AbstractNamedListElement.class, "AbstractNamedListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractNamedListElement_ListName(), ecorePackage.getEString(), "listName", null, 0, 1, AbstractNamedListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedListElementEClass, NamedListElement.class, "NamedListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedListElementWithRefMetadataEClass, NamedListElementWithRefMetadata.class, "NamedListElementWithRefMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedListElementWithRefMetadata_ReferenceMetadataId(), ecorePackage.getEString(), "referenceMetadataId", null, 0, 1, NamedListElementWithRefMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TextContentPackageImpl
