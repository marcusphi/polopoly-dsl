/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.ListElement;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.ListElementImpl#getReferredId <em>Referred Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListElementImpl extends MinimalEObjectImpl.Container implements ListElement
{
  /**
   * The default value of the '{@link #getReferredId() <em>Referred Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferredId()
   * @generated
   * @ordered
   */
  protected static final String REFERRED_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferredId() <em>Referred Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferredId()
   * @generated
   * @ordered
   */
  protected String referredId = REFERRED_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListElementImpl()
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
    return TextContentPackage.Literals.LIST_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferredId()
  {
    return referredId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferredId(String newReferredId)
  {
    String oldReferredId = referredId;
    referredId = newReferredId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.LIST_ELEMENT__REFERRED_ID, oldReferredId, referredId));
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
      case TextContentPackage.LIST_ELEMENT__REFERRED_ID:
        return getReferredId();
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
      case TextContentPackage.LIST_ELEMENT__REFERRED_ID:
        setReferredId((String)newValue);
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
      case TextContentPackage.LIST_ELEMENT__REFERRED_ID:
        setReferredId(REFERRED_ID_EDEFAULT);
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
      case TextContentPackage.LIST_ELEMENT__REFERRED_ID:
        return REFERRED_ID_EDEFAULT == null ? referredId != null : !REFERRED_ID_EDEFAULT.equals(referredId);
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
    result.append(" (referredId: ");
    result.append(referredId);
    result.append(')');
    return result.toString();
  }

} //ListElementImpl
