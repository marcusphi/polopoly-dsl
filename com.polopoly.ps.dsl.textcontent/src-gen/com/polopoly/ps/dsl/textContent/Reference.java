/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Reference#getGroup <em>Group</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Reference#getName <em>Name</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.Reference#getReferredId <em>Referred Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
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
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getReference_Group()
   * @model
   * @generated
   */
  String getGroup();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Reference#getGroup <em>Group</em>}' attribute.
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
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Reference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getReference_ReferredId()
   * @model
   * @generated
   */
  String getReferredId();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.Reference#getReferredId <em>Referred Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Id</em>' attribute.
   * @see #getReferredId()
   * @generated
   */
  void setReferredId(String value);

} // Reference
