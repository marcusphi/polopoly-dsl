/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Named List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.AbstractNamedListElement#getListName <em>List Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getAbstractNamedListElement()
 * @model
 * @generated
 */
public interface AbstractNamedListElement extends ListElement
{
  /**
   * Returns the value of the '<em><b>List Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Name</em>' attribute.
   * @see #setListName(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getAbstractNamedListElement_ListName()
   * @model
   * @generated
   */
  String getListName();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.AbstractNamedListElement#getListName <em>List Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Name</em>' attribute.
   * @see #getListName()
   * @generated
   */
  void setListName(String value);

} // AbstractNamedListElement
