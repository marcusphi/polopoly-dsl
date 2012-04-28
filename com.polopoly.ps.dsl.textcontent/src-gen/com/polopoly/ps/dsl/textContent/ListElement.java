/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.ListElement#getReferredId <em>Referred Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getListElement()
 * @model
 * @generated
 */
public interface ListElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Referred Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Id</em>' attribute.
   * @see #setReferredId(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getListElement_ReferredId()
   * @model
   * @generated
   */
  String getReferredId();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.ListElement#getReferredId <em>Referred Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Id</em>' attribute.
   * @see #getReferredId()
   * @generated
   */
  void setReferredId(String value);

} // ListElement
