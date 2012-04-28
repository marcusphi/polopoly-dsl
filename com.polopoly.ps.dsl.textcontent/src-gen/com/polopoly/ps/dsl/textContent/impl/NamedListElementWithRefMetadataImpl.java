/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named List Element With Ref Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.NamedListElementWithRefMetadataImpl#getReferenceMetadataId <em>Reference Metadata Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedListElementWithRefMetadataImpl extends AbstractNamedListElementImpl implements NamedListElementWithRefMetadata
{
  /**
   * The default value of the '{@link #getReferenceMetadataId() <em>Reference Metadata Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceMetadataId()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_METADATA_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceMetadataId() <em>Reference Metadata Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceMetadataId()
   * @generated
   * @ordered
   */
  protected String referenceMetadataId = REFERENCE_METADATA_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedListElementWithRefMetadataImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextContentPackage.Literals.NAMED_LIST_ELEMENT_WITH_REF_METADATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceMetadataId()
  {
    return referenceMetadataId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceMetadataId(String newReferenceMetadataId)
  {
    String oldReferenceMetadataId = referenceMetadataId;
    referenceMetadataId = newReferenceMetadataId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID, oldReferenceMetadataId, referenceMetadataId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID:
        return getReferenceMetadataId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID:
        setReferenceMetadataId((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID:
        setReferenceMetadataId(REFERENCE_METADATA_ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID:
        return REFERENCE_METADATA_ID_EDEFAULT == null ? referenceMetadataId != null : !REFERENCE_METADATA_ID_EDEFAULT.equals(referenceMetadataId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (referenceMetadataId: ");
    result.append(referenceMetadataId);
    result.append(')');
    return result.toString();
  }

} //NamedListElementWithRefMetadataImpl
