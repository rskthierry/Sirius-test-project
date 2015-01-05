/**
 */
package org.xtext.example.entity.entityDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.entity.entityDSL.NamespaceDefinition#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.xtext.example.entity.entityDSL.NamespaceDefinition#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.entity.entityDSL.EntityDSLPackage#getNamespaceDefinition()
 * @model
 * @generated
 */
public interface NamespaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(NamespaceDeclaration)
   * @see org.xtext.example.entity.entityDSL.EntityDSLPackage#getNamespaceDefinition_Namespace()
   * @model containment="true"
   * @generated
   */
  NamespaceDeclaration getNamespace();

  /**
   * Sets the value of the '{@link org.xtext.example.entity.entityDSL.NamespaceDefinition#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(NamespaceDeclaration value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference.
   * @see #setEntities(Entity)
   * @see org.xtext.example.entity.entityDSL.EntityDSLPackage#getNamespaceDefinition_Entities()
   * @model containment="true"
   * @generated
   */
  Entity getEntities();

  /**
   * Sets the value of the '{@link org.xtext.example.entity.entityDSL.NamespaceDefinition#getEntities <em>Entities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entities</em>' containment reference.
   * @see #getEntities()
   * @generated
   */
  void setEntities(Entity value);

} // NamespaceDefinition
