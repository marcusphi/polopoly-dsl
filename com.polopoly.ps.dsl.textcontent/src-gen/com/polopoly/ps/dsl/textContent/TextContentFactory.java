/**
 * <copyright>
 * </copyright>
 *
 */
package com.polopoly.ps.dsl.textContent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.polopoly.ps.dsl.textContent.TextContentPackage
 * @generated
 */
public interface TextContentFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextContentFactory eINSTANCE = com.polopoly.ps.dsl.textContent.impl.TextContentFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Text Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Content</em>'.
   * @generated
   */
  TextContent createTextContent();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Element</em>'.
   * @generated
   */
  ListElement createListElement();

  /**
   * Returns a new object of class '<em>Default List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default List Element</em>'.
   * @generated
   */
  DefaultListElement createDefaultListElement();

  /**
   * Returns a new object of class '<em>Abstract Named List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Named List Element</em>'.
   * @generated
   */
  AbstractNamedListElement createAbstractNamedListElement();

  /**
   * Returns a new object of class '<em>Named List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named List Element</em>'.
   * @generated
   */
  NamedListElement createNamedListElement();

  /**
   * Returns a new object of class '<em>Named List Element With Ref Metadata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named List Element With Ref Metadata</em>'.
   * @generated
   */
  NamedListElementWithRefMetadata createNamedListElementWithRefMetadata();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TextContentPackage getTextContentPackage();

} //TextContentFactory
