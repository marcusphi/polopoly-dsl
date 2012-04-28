/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent.impl;

import com.polopoly.ps.dsl.textContent.Component;
import com.polopoly.ps.dsl.textContent.ListElement;
import com.polopoly.ps.dsl.textContent.Reference;
import com.polopoly.ps.dsl.textContent.TextContent;
import com.polopoly.ps.dsl.textContent.TextContentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getInputtemplate <em>Inputtemplate</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getSecurityparent <em>Securityparent</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getReferences <em>References</em>}</li>
 *   <li>{@link com.polopoly.ps.dsl.textContent.impl.TextContentImpl#getListElements <em>List Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextContentImpl extends MinimalEObjectImpl.Container implements TextContent
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getInputtemplate() <em>Inputtemplate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputtemplate()
   * @generated
   * @ordered
   */
  protected static final String INPUTTEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputtemplate() <em>Inputtemplate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputtemplate()
   * @generated
   * @ordered
   */
  protected String inputtemplate = INPUTTEMPLATE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecurityparent() <em>Securityparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityparent()
   * @generated
   * @ordered
   */
  protected static final String SECURITYPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecurityparent() <em>Securityparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityparent()
   * @generated
   * @ordered
   */
  protected String securityparent = SECURITYPARENT_EDEFAULT;

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
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * The cached value of the '{@link #getListElements() <em>List Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListElements()
   * @generated
   * @ordered
   */
  protected EList<ListElement> listElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextContentImpl()
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
    return TextContentPackage.Literals.TEXT_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.TEXT_CONTENT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputtemplate()
  {
    return inputtemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputtemplate(String newInputtemplate)
  {
    String oldInputtemplate = inputtemplate;
    inputtemplate = newInputtemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.TEXT_CONTENT__INPUTTEMPLATE, oldInputtemplate, inputtemplate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecurityparent()
  {
    return securityparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecurityparent(String newSecurityparent)
  {
    String oldSecurityparent = securityparent;
    securityparent = newSecurityparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.TEXT_CONTENT__SECURITYPARENT, oldSecurityparent, securityparent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextContentPackage.TEXT_CONTENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, TextContentPackage.TEXT_CONTENT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, TextContentPackage.TEXT_CONTENT__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListElement> getListElements()
  {
    if (listElements == null)
    {
      listElements = new EObjectContainmentEList<ListElement>(ListElement.class, this, TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS);
    }
    return listElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextContentPackage.TEXT_CONTENT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case TextContentPackage.TEXT_CONTENT__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS:
        return ((InternalEList<?>)getListElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TextContentPackage.TEXT_CONTENT__ID:
        return getId();
      case TextContentPackage.TEXT_CONTENT__INPUTTEMPLATE:
        return getInputtemplate();
      case TextContentPackage.TEXT_CONTENT__SECURITYPARENT:
        return getSecurityparent();
      case TextContentPackage.TEXT_CONTENT__NAME:
        return getName();
      case TextContentPackage.TEXT_CONTENT__COMPONENTS:
        return getComponents();
      case TextContentPackage.TEXT_CONTENT__REFERENCES:
        return getReferences();
      case TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS:
        return getListElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextContentPackage.TEXT_CONTENT__ID:
        setId((String)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__INPUTTEMPLATE:
        setInputtemplate((String)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__SECURITYPARENT:
        setSecurityparent((String)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__NAME:
        setName((String)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
        return;
      case TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS:
        getListElements().clear();
        getListElements().addAll((Collection<? extends ListElement>)newValue);
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
      case TextContentPackage.TEXT_CONTENT__ID:
        setId(ID_EDEFAULT);
        return;
      case TextContentPackage.TEXT_CONTENT__INPUTTEMPLATE:
        setInputtemplate(INPUTTEMPLATE_EDEFAULT);
        return;
      case TextContentPackage.TEXT_CONTENT__SECURITYPARENT:
        setSecurityparent(SECURITYPARENT_EDEFAULT);
        return;
      case TextContentPackage.TEXT_CONTENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TextContentPackage.TEXT_CONTENT__COMPONENTS:
        getComponents().clear();
        return;
      case TextContentPackage.TEXT_CONTENT__REFERENCES:
        getReferences().clear();
        return;
      case TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS:
        getListElements().clear();
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
      case TextContentPackage.TEXT_CONTENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TextContentPackage.TEXT_CONTENT__INPUTTEMPLATE:
        return INPUTTEMPLATE_EDEFAULT == null ? inputtemplate != null : !INPUTTEMPLATE_EDEFAULT.equals(inputtemplate);
      case TextContentPackage.TEXT_CONTENT__SECURITYPARENT:
        return SECURITYPARENT_EDEFAULT == null ? securityparent != null : !SECURITYPARENT_EDEFAULT.equals(securityparent);
      case TextContentPackage.TEXT_CONTENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TextContentPackage.TEXT_CONTENT__COMPONENTS:
        return components != null && !components.isEmpty();
      case TextContentPackage.TEXT_CONTENT__REFERENCES:
        return references != null && !references.isEmpty();
      case TextContentPackage.TEXT_CONTENT__LIST_ELEMENTS:
        return listElements != null && !listElements.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", inputtemplate: ");
    result.append(inputtemplate);
    result.append(", securityparent: ");
    result.append(securityparent);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TextContentImpl
