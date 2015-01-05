/**
 */
package org.xtext.example.entity.entityDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.entity.entityDSL.EntityDSLPackage
 * @generated
 */
public interface EntityDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDSLFactory eINSTANCE = org.xtext.example.entity.entityDSL.impl.EntityDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Namespace Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Definition</em>'.
   * @generated
   */
  NamespaceDefinition createNamespaceDefinition();

  /**
   * Returns a new object of class '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Declaration</em>'.
   * @generated
   */
  NamespaceDeclaration createNamespaceDeclaration();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EntityDSLPackage getEntityDSLPackage();

} //EntityDSLFactory
