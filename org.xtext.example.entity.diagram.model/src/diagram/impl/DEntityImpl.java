/**
 */
package diagram.impl;

import diagram.DEntity;
import diagram.DPort;
import diagram.DiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.entity.entityDSL.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diagram.impl.DEntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link diagram.impl.DEntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link diagram.impl.DEntityImpl#getTPort <em>TPort</em>}</li>
 *   <li>{@link diagram.impl.DEntityImpl#getBPort <em>BPort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEntityImpl extends MinimalEObjectImpl.Container implements DEntity {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected DEntity parent;

	/**
	 * The cached value of the '{@link #getTPort() <em>TPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTPort()
	 * @generated
	 * @ordered
	 */
	protected DPort tPort;

	/**
	 * The cached value of the '{@link #getBPort() <em>BPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPort()
	 * @generated
	 * @ordered
	 */
	protected DPort bPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.DENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.DENTITY__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DENTITY__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEntity getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (DEntity)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.DENTITY__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEntity basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DEntity newParent) {
		DEntity oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DENTITY__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPort getTPort() {
		if (tPort != null && tPort.eIsProxy()) {
			InternalEObject oldTPort = (InternalEObject)tPort;
			tPort = (DPort)eResolveProxy(oldTPort);
			if (tPort != oldTPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.DENTITY__TPORT, oldTPort, tPort));
			}
		}
		return tPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPort basicGetTPort() {
		return tPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTPort(DPort newTPort) {
		DPort oldTPort = tPort;
		tPort = newTPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DENTITY__TPORT, oldTPort, tPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPort getBPort() {
		if (bPort != null && bPort.eIsProxy()) {
			InternalEObject oldBPort = (InternalEObject)bPort;
			bPort = (DPort)eResolveProxy(oldBPort);
			if (bPort != oldBPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.DENTITY__BPORT, oldBPort, bPort));
			}
		}
		return bPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPort basicGetBPort() {
		return bPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPort(DPort newBPort) {
		DPort oldBPort = bPort;
		bPort = newBPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DENTITY__BPORT, oldBPort, bPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.DENTITY__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case DiagramPackage.DENTITY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DiagramPackage.DENTITY__TPORT:
				if (resolve) return getTPort();
				return basicGetTPort();
			case DiagramPackage.DENTITY__BPORT:
				if (resolve) return getBPort();
				return basicGetBPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.DENTITY__ENTITY:
				setEntity((Entity)newValue);
				return;
			case DiagramPackage.DENTITY__PARENT:
				setParent((DEntity)newValue);
				return;
			case DiagramPackage.DENTITY__TPORT:
				setTPort((DPort)newValue);
				return;
			case DiagramPackage.DENTITY__BPORT:
				setBPort((DPort)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.DENTITY__ENTITY:
				setEntity((Entity)null);
				return;
			case DiagramPackage.DENTITY__PARENT:
				setParent((DEntity)null);
				return;
			case DiagramPackage.DENTITY__TPORT:
				setTPort((DPort)null);
				return;
			case DiagramPackage.DENTITY__BPORT:
				setBPort((DPort)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.DENTITY__ENTITY:
				return entity != null;
			case DiagramPackage.DENTITY__PARENT:
				return parent != null;
			case DiagramPackage.DENTITY__TPORT:
				return tPort != null;
			case DiagramPackage.DENTITY__BPORT:
				return bPort != null;
		}
		return super.eIsSet(featureID);
	}

} //DEntityImpl
