/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextContentFactoryImpl extends EFactoryImpl implements TextContentFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextContentFactory init()
  {
    try
    {
      TextContentFactory theTextContentFactory = (TextContentFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polopoly.com/ps/dsl/TextContent"); 
      if (theTextContentFactory != null)
      {
        return theTextContentFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextContentFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContentFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextContentPackage.TEXT_CONTENT: return createTextContent();
      case TextContentPackage.COMPONENT: return createComponent();
      case TextContentPackage.REFERENCE: return createReference();
      case TextContentPackage.LIST_ELEMENT: return createListElement();
      case TextContentPackage.DEFAULT_LIST_ELEMENT: return createDefaultListElement();
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT: return createAbstractNamedListElement();
      case TextContentPackage.NAMED_LIST_ELEMENT: return createNamedListElement();
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA: return createNamedListElementWithRefMetadata();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContent createTextContent()
  {
    TextContentImpl textContent = new TextContentImpl();
    return textContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElement createListElement()
  {
    ListElementImpl listElement = new ListElementImpl();
    return listElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultListElement createDefaultListElement()
  {
    DefaultListElementImpl defaultListElement = new DefaultListElementImpl();
    return defaultListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractNamedListElement createAbstractNamedListElement()
  {
    AbstractNamedListElementImpl abstractNamedListElement = new AbstractNamedListElementImpl();
    return abstractNamedListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedListElement createNamedListElement()
  {
    NamedListElementImpl namedListElement = new NamedListElementImpl();
    return namedListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedListElementWithRefMetadata createNamedListElementWithRefMetadata()
  {
    NamedListElementWithRefMetadataImpl namedListElementWithRefMetadata = new NamedListElementWithRefMetadataImpl();
    return namedListElementWithRefMetadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContentPackage getTextContentPackage()
  {
    return (TextContentPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextContentPackage getPackage()
  {
    return TextContentPackage.eINSTANCE;
  }

} //TextContentFactoryImpl
