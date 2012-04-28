/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.AbstractNamedListElement;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Named List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.AbstractNamedListElementImpl#getListName <em>List Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractNamedListElementImpl extends ListElementImpl implements AbstractNamedListElement
{
  /**
   * The default value of the '{@link #getListName() <em>List Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListName()
   * @generated
   * @ordered
   */
  protected static final String LIST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getListName() <em>List Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListName()
   * @generated
   * @ordered
   */
  protected String listName = LIST_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractNamedListElementImpl()
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
    return TextContentPackage.Literals.ABSTRACT_NAMED_LIST_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getListName()
  {
    return listName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListName(String newListName)
  {
    String oldListName = listName;
    listName = newListName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME, oldListName, listName));
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
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME:
        return getListName();
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
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME:
        setListName((String)newValue);
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
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME:
        setListName(LIST_NAME_EDEFAULT);
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
      case TextContentPackage.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME:
        return LIST_NAME_EDEFAULT == null ? listName != null : !LIST_NAME_EDEFAULT.equals(listName);
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
    result.append(" (listName: ");
    result.append(listName);
    result.append(')');
    return result.toString();
  }

} //AbstractNamedListElementImpl
