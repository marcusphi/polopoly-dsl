/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.util;

import com.polopoly.ps.dsl.textContent.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage
 * @generated
 */
public class TextContentAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextContentPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContentAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextContentPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextContentSwitch<Adapter> modelSwitch =
    new TextContentSwitch<Adapter>()
    {
      @Override
      public Adapter caseTextContent(TextContent object)
      {
        return createTextContentAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseListElement(ListElement object)
      {
        return createListElementAdapter();
      }
      @Override
      public Adapter caseDefaultListElement(DefaultListElement object)
      {
        return createDefaultListElementAdapter();
      }
      @Override
      public Adapter caseAbstractNamedListElement(AbstractNamedListElement object)
      {
        return createAbstractNamedListElementAdapter();
      }
      @Override
      public Adapter caseNamedListElement(NamedListElement object)
      {
        return createNamedListElementAdapter();
      }
      @Override
      public Adapter caseNamedListElementWithRefMetadata(NamedListElementWithRefMetadata object)
      {
        return createNamedListElementWithRefMetadataAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.TextContent
   * @generated
   */
  public Adapter createTextContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.ListElement <em>List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.ListElement
   * @generated
   */
  public Adapter createListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.DefaultListElement <em>Default List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.DefaultListElement
   * @generated
   */
  public Adapter createDefaultListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.AbstractNamedListElement <em>Abstract Named List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.AbstractNamedListElement
   * @generated
   */
  public Adapter createAbstractNamedListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.NamedListElement <em>Named List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.NamedListElement
   * @generated
   */
  public Adapter createNamedListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata <em>Named List Element With Ref Metadata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata
   * @generated
   */
  public Adapter createNamedListElementWithRefMetadataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TextContentAdapterFactory
