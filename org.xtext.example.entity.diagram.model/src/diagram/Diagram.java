/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagram.Diagram#getDNamespaces <em>DNamespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagram.DiagramPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>DNamespaces</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.DNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DNamespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DNamespaces</em>' containment reference list.
	 * @see diagram.DiagramPackage#getDiagram_DNamespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamespace> getDNamespaces();

} // Diagram
