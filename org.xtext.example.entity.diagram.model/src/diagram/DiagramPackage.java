/**
 */
package diagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.zafinlabs.com/mirev/jewel/dsl/diagram/model/Diagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramPackage eINSTANCE = diagram.impl.DiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.DiagramImpl
	 * @see diagram.impl.DiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>DNamespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DNAMESPACES = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.DNamespaceImpl <em>DNamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.DNamespaceImpl
	 * @see diagram.impl.DiagramPackageImpl#getDNamespace()
	 * @generated
	 */
	int DNAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>DEntities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__DENTITIES = 2;

	/**
	 * The number of structural features of the '<em>DNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.DEntityImpl <em>DEntity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.DEntityImpl
	 * @see diagram.impl.DiagramPackageImpl#getDEntity()
	 * @generated
	 */
	int DENTITY = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY__PARENT = 1;

	/**
	 * The feature id for the '<em><b>TPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY__TPORT = 2;

	/**
	 * The feature id for the '<em><b>BPort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY__BPORT = 3;

	/**
	 * The number of structural features of the '<em>DEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link diagram.impl.DPortImpl <em>DPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.DPortImpl
	 * @see diagram.impl.DiagramPackageImpl#getDPort()
	 * @generated
	 */
	int DPORT = 3;

	/**
	 * The number of structural features of the '<em>DPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link diagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see diagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.Diagram#getDNamespaces <em>DNamespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DNamespaces</em>'.
	 * @see diagram.Diagram#getDNamespaces()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_DNamespaces();

	/**
	 * Returns the meta object for class '{@link diagram.DNamespace <em>DNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNamespace</em>'.
	 * @see diagram.DNamespace
	 * @generated
	 */
	EClass getDNamespace();

	/**
	 * Returns the meta object for the attribute '{@link diagram.DNamespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagram.DNamespace#getName()
	 * @see #getDNamespace()
	 * @generated
	 */
	EAttribute getDNamespace_Name();

	/**
	 * Returns the meta object for the reference '{@link diagram.DNamespace#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see diagram.DNamespace#getParent()
	 * @see #getDNamespace()
	 * @generated
	 */
	EReference getDNamespace_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.DNamespace#getDEntities <em>DEntities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DEntities</em>'.
	 * @see diagram.DNamespace#getDEntities()
	 * @see #getDNamespace()
	 * @generated
	 */
	EReference getDNamespace_DEntities();

	/**
	 * Returns the meta object for class '{@link diagram.DEntity <em>DEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEntity</em>'.
	 * @see diagram.DEntity
	 * @generated
	 */
	EClass getDEntity();

	/**
	 * Returns the meta object for the reference '{@link diagram.DEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see diagram.DEntity#getEntity()
	 * @see #getDEntity()
	 * @generated
	 */
	EReference getDEntity_Entity();

	/**
	 * Returns the meta object for the reference '{@link diagram.DEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see diagram.DEntity#getParent()
	 * @see #getDEntity()
	 * @generated
	 */
	EReference getDEntity_Parent();

	/**
	 * Returns the meta object for the reference '{@link diagram.DEntity#getTPort <em>TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TPort</em>'.
	 * @see diagram.DEntity#getTPort()
	 * @see #getDEntity()
	 * @generated
	 */
	EReference getDEntity_TPort();

	/**
	 * Returns the meta object for the reference '{@link diagram.DEntity#getBPort <em>BPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>BPort</em>'.
	 * @see diagram.DEntity#getBPort()
	 * @see #getDEntity()
	 * @generated
	 */
	EReference getDEntity_BPort();

	/**
	 * Returns the meta object for class '{@link diagram.DPort <em>DPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPort</em>'.
	 * @see diagram.DPort
	 * @generated
	 */
	EClass getDPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramFactory getDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.DiagramImpl
		 * @see diagram.impl.DiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>DNamespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__DNAMESPACES = eINSTANCE.getDiagram_DNamespaces();

		/**
		 * The meta object literal for the '{@link diagram.impl.DNamespaceImpl <em>DNamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.DNamespaceImpl
		 * @see diagram.impl.DiagramPackageImpl#getDNamespace()
		 * @generated
		 */
		EClass DNAMESPACE = eINSTANCE.getDNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAMESPACE__NAME = eINSTANCE.getDNamespace_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMESPACE__PARENT = eINSTANCE.getDNamespace_Parent();

		/**
		 * The meta object literal for the '<em><b>DEntities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMESPACE__DENTITIES = eINSTANCE.getDNamespace_DEntities();

		/**
		 * The meta object literal for the '{@link diagram.impl.DEntityImpl <em>DEntity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.DEntityImpl
		 * @see diagram.impl.DiagramPackageImpl#getDEntity()
		 * @generated
		 */
		EClass DENTITY = eINSTANCE.getDEntity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY__ENTITY = eINSTANCE.getDEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY__PARENT = eINSTANCE.getDEntity_Parent();

		/**
		 * The meta object literal for the '<em><b>TPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY__TPORT = eINSTANCE.getDEntity_TPort();

		/**
		 * The meta object literal for the '<em><b>BPort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY__BPORT = eINSTANCE.getDEntity_BPort();

		/**
		 * The meta object literal for the '{@link diagram.impl.DPortImpl <em>DPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.DPortImpl
		 * @see diagram.impl.DiagramPackageImpl#getDPort()
		 * @generated
		 */
		EClass DPORT = eINSTANCE.getDPort();

	}

} //DiagramPackage
