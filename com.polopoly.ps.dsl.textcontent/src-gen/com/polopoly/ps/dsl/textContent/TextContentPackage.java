/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.polopoly.ps.dsl.textContent.TextContentFactory
 * @model kind="package"
 * @generated
 */
public interface TextContentPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textContent";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polopoly.com/ps/dsl/TextContent";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textContent";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextContentPackage eINSTANCE = com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl.init();

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl <em>Text Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getTextContent()
   * @generated
   */
  int TEXT_CONTENT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__ID = 0;

  /**
   * The feature id for the '<em><b>Inputtemplate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__INPUTTEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Securityparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__SECURITYPARENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__NAME = 3;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__COMPONENTS = 4;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__REFERENCES = 5;

  /**
   * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__LIST_ELEMENTS = 6;

  /**
   * The number of structural features of the '<em>Text Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.ComponentImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__GROUP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.ReferenceImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFERRED_ID = 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.ListElementImpl <em>List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.ListElementImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getListElement()
   * @generated
   */
  int LIST_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT__REFERRED_ID = 0;

  /**
   * The number of structural features of the '<em>List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.DefaultListElementImpl <em>Default List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.DefaultListElementImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getDefaultListElement()
   * @generated
   */
  int DEFAULT_LIST_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LIST_ELEMENT__REFERRED_ID = LIST_ELEMENT__REFERRED_ID;

  /**
   * The number of structural features of the '<em>Default List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_LIST_ELEMENT_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.AbstractNamedListElementImpl <em>Abstract Named List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.AbstractNamedListElementImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getAbstractNamedListElement()
   * @generated
   */
  int ABSTRACT_NAMED_LIST_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_NAMED_LIST_ELEMENT__REFERRED_ID = LIST_ELEMENT__REFERRED_ID;

  /**
   * The feature id for the '<em><b>List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME = LIST_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Named List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_NAMED_LIST_ELEMENT_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.NamedListElementImpl <em>Named List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.NamedListElementImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getNamedListElement()
   * @generated
   */
  int NAMED_LIST_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT__REFERRED_ID = ABSTRACT_NAMED_LIST_ELEMENT__REFERRED_ID;

  /**
   * The feature id for the '<em><b>List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT__LIST_NAME = ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME;

  /**
   * The number of structural features of the '<em>Named List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT_FEATURE_COUNT = ABSTRACT_NAMED_LIST_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.polopoly.ps.dsl.textContent.impl.NamedListElementWithRefMetadataImpl <em>Named List Element With Ref Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.polopoly.ps.dsl.textContent.impl.NamedListElementWithRefMetadataImpl
   * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getNamedListElementWithRefMetadata()
   * @generated
   */
  int NAMED_LIST_ELEMENT_WITH_REF_METADATA = 7;

  /**
   * The feature id for the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERRED_ID = ABSTRACT_NAMED_LIST_ELEMENT__REFERRED_ID;

  /**
   * The feature id for the '<em><b>List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT_WITH_REF_METADATA__LIST_NAME = ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME;

  /**
   * The feature id for the '<em><b>Reference Metadata Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID = ABSTRACT_NAMED_LIST_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named List Element With Ref Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_LIST_ELEMENT_WITH_REF_METADATA_FEATURE_COUNT = ABSTRACT_NAMED_LIST_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Content</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent
   * @generated
   */
  EClass getTextContent();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.TextContent#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getId()
   * @see #getTextContent()
   * @generated
   */
  EAttribute getTextContent_Id();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.TextContent#getInputtemplate <em>Inputtemplate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inputtemplate</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getInputtemplate()
   * @see #getTextContent()
   * @generated
   */
  EAttribute getTextContent_Inputtemplate();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.TextContent#getSecurityparent <em>Securityparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Securityparent</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getSecurityparent()
   * @see #getTextContent()
   * @generated
   */
  EAttribute getTextContent_Securityparent();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.TextContent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getName()
   * @see #getTextContent()
   * @generated
   */
  EAttribute getTextContent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.polopoly.ps.dsl.textContent.TextContent#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getComponents()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_Components();

  /**
   * Returns the meta object for the containment reference list '{@link com.polopoly.ps.dsl.textContent.TextContent#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getReferences()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_References();

  /**
   * Returns the meta object for the containment reference list '{@link com.polopoly.ps.dsl.textContent.TextContent#getListElements <em>List Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List Elements</em>'.
   * @see com.polopoly.ps.dsl.textContent.TextContent#getListElements()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_ListElements();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.polopoly.ps.dsl.textContent.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Component#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see com.polopoly.ps.dsl.textContent.Component#getGroup()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Group();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.polopoly.ps.dsl.textContent.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Component#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.polopoly.ps.dsl.textContent.Component#getValue()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Value();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.polopoly.ps.dsl.textContent.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Reference#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see com.polopoly.ps.dsl.textContent.Reference#getGroup()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Group();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.polopoly.ps.dsl.textContent.Reference#getName()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Name();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.Reference#getReferredId <em>Referred Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referred Id</em>'.
   * @see com.polopoly.ps.dsl.textContent.Reference#getReferredId()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_ReferredId();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.ListElement <em>List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Element</em>'.
   * @see com.polopoly.ps.dsl.textContent.ListElement
   * @generated
   */
  EClass getListElement();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.ListElement#getReferredId <em>Referred Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referred Id</em>'.
   * @see com.polopoly.ps.dsl.textContent.ListElement#getReferredId()
   * @see #getListElement()
   * @generated
   */
  EAttribute getListElement_ReferredId();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.DefaultListElement <em>Default List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default List Element</em>'.
   * @see com.polopoly.ps.dsl.textContent.DefaultListElement
   * @generated
   */
  EClass getDefaultListElement();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.AbstractNamedListElement <em>Abstract Named List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Named List Element</em>'.
   * @see com.polopoly.ps.dsl.textContent.AbstractNamedListElement
   * @generated
   */
  EClass getAbstractNamedListElement();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.AbstractNamedListElement#getListName <em>List Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Name</em>'.
   * @see com.polopoly.ps.dsl.textContent.AbstractNamedListElement#getListName()
   * @see #getAbstractNamedListElement()
   * @generated
   */
  EAttribute getAbstractNamedListElement_ListName();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.NamedListElement <em>Named List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named List Element</em>'.
   * @see com.polopoly.ps.dsl.textContent.NamedListElement
   * @generated
   */
  EClass getNamedListElement();

  /**
   * Returns the meta object for class '{@link com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata <em>Named List Element With Ref Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named List Element With Ref Metadata</em>'.
   * @see com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata
   * @generated
   */
  EClass getNamedListElementWithRefMetadata();

  /**
   * Returns the meta object for the attribute '{@link com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata#getReferenceMetadataId <em>Reference Metadata Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Metadata Id</em>'.
   * @see com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata#getReferenceMetadataId()
   * @see #getNamedListElementWithRefMetadata()
   * @generated
   */
  EAttribute getNamedListElementWithRefMetadata_ReferenceMetadataId();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextContentFactory getTextContentFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl <em>Text Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getTextContent()
     * @generated
     */
    EClass TEXT_CONTENT = eINSTANCE.getTextContent();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_CONTENT__ID = eINSTANCE.getTextContent_Id();

    /**
     * The meta object literal for the '<em><b>Inputtemplate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_CONTENT__INPUTTEMPLATE = eINSTANCE.getTextContent_Inputtemplate();

    /**
     * The meta object literal for the '<em><b>Securityparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_CONTENT__SECURITYPARENT = eINSTANCE.getTextContent_Securityparent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_CONTENT__NAME = eINSTANCE.getTextContent_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_CONTENT__COMPONENTS = eINSTANCE.getTextContent_Components();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_CONTENT__REFERENCES = eINSTANCE.getTextContent_References();

    /**
     * The meta object literal for the '<em><b>List Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_CONTENT__LIST_ELEMENTS = eINSTANCE.getTextContent_ListElements();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.ComponentImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__GROUP = eINSTANCE.getComponent_Group();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__VALUE = eINSTANCE.getComponent_Value();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.ReferenceImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__GROUP = eINSTANCE.getReference_Group();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

    /**
     * The meta object literal for the '<em><b>Referred Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__REFERRED_ID = eINSTANCE.getReference_ReferredId();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.ListElementImpl <em>List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.ListElementImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getListElement()
     * @generated
     */
    EClass LIST_ELEMENT = eINSTANCE.getListElement();

    /**
     * The meta object literal for the '<em><b>Referred Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ELEMENT__REFERRED_ID = eINSTANCE.getListElement_ReferredId();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.DefaultListElementImpl <em>Default List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.DefaultListElementImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getDefaultListElement()
     * @generated
     */
    EClass DEFAULT_LIST_ELEMENT = eINSTANCE.getDefaultListElement();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.AbstractNamedListElementImpl <em>Abstract Named List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.AbstractNamedListElementImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getAbstractNamedListElement()
     * @generated
     */
    EClass ABSTRACT_NAMED_LIST_ELEMENT = eINSTANCE.getAbstractNamedListElement();

    /**
     * The meta object literal for the '<em><b>List Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME = eINSTANCE.getAbstractNamedListElement_ListName();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.NamedListElementImpl <em>Named List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.NamedListElementImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getNamedListElement()
     * @generated
     */
    EClass NAMED_LIST_ELEMENT = eINSTANCE.getNamedListElement();

    /**
     * The meta object literal for the '{@link com.polopoly.ps.dsl.textContent.impl.NamedListElementWithRefMetadataImpl <em>Named List Element With Ref Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.polopoly.ps.dsl.textContent.impl.NamedListElementWithRefMetadataImpl
     * @see com.polopoly.ps.dsl.textContent.impl.TextContentPackageImpl#getNamedListElementWithRefMetadata()
     * @generated
     */
    EClass NAMED_LIST_ELEMENT_WITH_REF_METADATA = eINSTANCE.getNamedListElementWithRefMetadata();

    /**
     * The meta object literal for the '<em><b>Reference Metadata Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID = eINSTANCE.getNamedListElementWithRefMetadata_ReferenceMetadataId();

  }

} //TextContentPackage
