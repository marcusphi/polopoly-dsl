/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getId <em>Id</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getInputtemplate <em>Inputtemplate</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getSecurityparent <em>Securityparent</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getName <em>Name</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getComponents <em>Components</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getReferences <em>References</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.TextContent#getListElements <em>List Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent()
 * @model
 * @generated
 */
public interface TextContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.TextContent#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Inputtemplate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputtemplate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputtemplate</em>' attribute.
   * @see #setInputtemplate(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_Inputtemplate()
   * @model
   * @generated
   */
  String getInputtemplate();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.TextContent#getInputtemplate <em>Inputtemplate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputtemplate</em>' attribute.
   * @see #getInputtemplate()
   * @generated
   */
  void setInputtemplate(String value);

  /**
   * Returns the value of the '<em><b>Securityparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Securityparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Securityparent</em>' attribute.
   * @see #setSecurityparent(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_Securityparent()
   * @model
   * @generated
   */
  String getSecurityparent();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.TextContent#getSecurityparent <em>Securityparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Securityparent</em>' attribute.
   * @see #getSecurityparent()
   * @generated
   */
  void setSecurityparent(String value);

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
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.TextContent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link com.polopoly.ps.dsl.textContent.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link com.polopoly.ps.dsl.textContent.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_References()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReferences();

  /**
   * Returns the value of the '<em><b>List Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.polopoly.ps.dsl.textContent.ListElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Elements</em>' containment reference list.
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getTextContent_ListElements()
   * @model containment="true"
   * @generated
   */
  EList<ListElement> getListElements();

} // TextContent
