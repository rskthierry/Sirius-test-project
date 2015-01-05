/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNamespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagram.DNamespace#getName <em>Name</em>}</li>
 *   <li>{@link diagram.DNamespace#getParent <em>Parent</em>}</li>
 *   <li>{@link diagram.DNamespace#getDEntities <em>DEntities</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagram.DiagramPackage#getDNamespace()
 * @model
 * @generated
 */
public interface DNamespace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diagram.DiagramPackage#getDNamespace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagram.DNamespace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DNamespace)
	 * @see diagram.DiagramPackage#getDNamespace_Parent()
	 * @model
	 * @generated
	 */
	DNamespace getParent();

	/**
	 * Sets the value of the '{@link diagram.DNamespace#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DNamespace value);

	/**
	 * Returns the value of the '<em><b>DEntities</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.DEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEntities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEntities</em>' containment reference list.
	 * @see diagram.DiagramPackage#getDNamespace_DEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DEntity> getDEntities();

} // DNamespace
