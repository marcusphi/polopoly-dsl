/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Component#getName <em>Name</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Component#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see #setGroup(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getComponent_Group()
   * @model
   * @generated
   */
  String getGroup();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Component#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see #getGroup()
   * @generated
   */
  void setGroup(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getComponent_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Component#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Component
