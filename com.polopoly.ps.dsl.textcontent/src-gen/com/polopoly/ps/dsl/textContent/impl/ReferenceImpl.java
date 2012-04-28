/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.Reference;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.ReferenceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.ReferenceImpl#getReferredId <em>Referred Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference
{
  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected ReferenceImpl()
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
    return TextContentPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(String newGroup)
  {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.REFERENCE__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.REFERENCE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.REFERENCE__REFERRED_ID, oldReferredId, referredId));
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
      case TextContentPackage.REFERENCE__GROUP:
        return getGroup();
      case TextContentPackage.REFERENCE__NAME:
        return getName();
      case TextContentPackage.REFERENCE__REFERRED_ID:
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
      case TextContentPackage.REFERENCE__GROUP:
        setGroup((String)newValue);
        return;
      case TextContentPackage.REFERENCE__NAME:
        setName((String)newValue);
        return;
      case TextContentPackage.REFERENCE__REFERRED_ID:
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
      case TextContentPackage.REFERENCE__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case TextContentPackage.REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TextContentPackage.REFERENCE__REFERRED_ID:
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
      case TextContentPackage.REFERENCE__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case TextContentPackage.REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TextContentPackage.REFERENCE__REFERRED_ID:
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
    result.append(" (group: ");
    result.append(group);
    result.append(", name: ");
    result.append(name);
    result.append(", referredId: ");
    result.append(referredId);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
