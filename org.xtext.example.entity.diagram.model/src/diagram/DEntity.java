/**
 */
package diagram;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.entity.entityDSL.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagram.DEntity#getEntity <em>Entity</em>}</li>
 *   <li>{@link diagram.DEntity#getParent <em>Parent</em>}</li>
 *   <li>{@link diagram.DEntity#getTPort <em>TPort</em>}</li>
 *   <li>{@link diagram.DEntity#getBPort <em>BPort</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagram.DiagramPackage#getDEntity()
 * @model
 * @generated
 */
public interface DEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see diagram.DiagramPackage#getDEntity_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link diagram.DEntity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DEntity)
	 * @see diagram.DiagramPackage#getDEntity_Parent()
	 * @model
	 * @generated
	 */
	DEntity getParent();

	/**
	 * Sets the value of the '{@link diagram.DEntity#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DEntity value);

	/**
	 * Returns the value of the '<em><b>TPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TPort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TPort</em>' reference.
	 * @see #setTPort(DPort)
	 * @see diagram.DiagramPackage#getDEntity_TPort()
	 * @model
	 * @generated
	 */
	DPort getTPort();

	/**
	 * Sets the value of the '{@link diagram.DEntity#getTPort <em>TPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TPort</em>' reference.
	 * @see #getTPort()
	 * @generated
	 */
	void setTPort(DPort value);

	/**
	 * Returns the value of the '<em><b>BPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPort</em>' reference.
	 * @see #setBPort(DPort)
	 * @see diagram.DiagramPackage#getDEntity_BPort()
	 * @model
	 * @generated
	 */
	DPort getBPort();

	/**
	 * Sets the value of the '{@link diagram.DEntity#getBPort <em>BPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPort</em>' reference.
	 * @see #getBPort()
	 * @generated
	 */
	void setBPort(DPort value);

} // DEntity
