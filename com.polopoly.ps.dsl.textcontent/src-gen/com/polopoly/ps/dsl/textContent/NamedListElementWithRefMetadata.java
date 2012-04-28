/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named List Element With Ref Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata#getReferenceMetadataId <em>Reference Metadata Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getNamedListElementWithRefMetadata()
 * @model
 * @generated
 */
public interface NamedListElementWithRefMetadata extends AbstractNamedListElement
{
  /**
   * Returns the value of the '<em><b>Reference Metadata Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Metadata Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Metadata Id</em>' attribute.
   * @see #setReferenceMetadataId(String)
   * @see com.polopoly.ps.dsl.textContent.TextContentPackage#getNamedListElementWithRefMetadata_ReferenceMetadataId()
   * @model
   * @generated
   */
  String getReferenceMetadataId();

  /**
   * Sets the value of the '{@link com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata#getReferenceMetadataId <em>Reference Metadata Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Metadata Id</em>' attribute.
   * @see #getReferenceMetadataId()
   * @generated
   */
  void setReferenceMetadataId(String value);

} // NamedListElementWithRefMetadata
