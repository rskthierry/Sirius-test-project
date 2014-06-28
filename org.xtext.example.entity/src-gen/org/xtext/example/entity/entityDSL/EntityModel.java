/**
 */
package org.xtext.example.entity.entityDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.entity.entityDSL.EntityModel#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.entity.entityDSL.EntityDSLPackage#getEntityModel()
 * @model
 * @generated
 */
public interface EntityModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.entity.entityDSL.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.xtext.example.entity.entityDSL.EntityDSLPackage#getEntityModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // EntityModel
