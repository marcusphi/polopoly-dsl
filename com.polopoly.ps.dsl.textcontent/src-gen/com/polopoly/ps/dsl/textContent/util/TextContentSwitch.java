/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.util;

import com.polopoly.ps.dsl.textContent.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage
 * @generated
 */
public class TextContentSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextContentPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextContentSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TextContentPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TextContentPackage.TEXT_CONTENT:
      {
        TextContent textContent = (TextContent)theEObject;
        T result = caseTextContent(textContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.LIST_ELEMENT:
      {
        ListElement listElement = (ListElement)theEObject;
        T result = caseListElement(listElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.DEFAULT_LIST_ELEMENT:
      {
        DefaultListElement defaultListElement = (DefaultListElement)theEObject;
        T result = caseDefaultListElement(defaultListElement);
        if (result == null) result = caseListElement(defaultListElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT:
      {
        AbstractNamedListElement abstractNamedListElement = (AbstractNamedListElement)theEObject;
        T result = caseAbstractNamedListElement(abstractNamedListElement);
        if (result == null) result = caseListElement(abstractNamedListElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.NAMED_LIST_ELEMENT:
      {
        NamedListElement namedListElement = (NamedListElement)theEObject;
        T result = caseNamedListElement(namedListElement);
        if (result == null) result = caseAbstractNamedListElement(namedListElement);
        if (result == null) result = caseListElement(namedListElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA:
      {
        NamedListElementWithRefMetadata namedListElementWithRefMetadata = (NamedListElementWithRefMetadata)theEObject;
        T result = caseNamedListElementWithRefMetadata(namedListElementWithRefMetadata);
        if (result == null) result = caseAbstractNamedListElement(namedListElementWithRefMetadata);
        if (result == null) result = caseListElement(namedListElementWithRefMetadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextContent(TextContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListElement(ListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultListElement(DefaultListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Named List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Named List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractNamedListElement(AbstractNamedListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedListElement(NamedListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named List Element With Ref Metadata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named List Element With Ref Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedListElementWithRefMetadata(NamedListElementWithRefMetadata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TextContentSwitch
