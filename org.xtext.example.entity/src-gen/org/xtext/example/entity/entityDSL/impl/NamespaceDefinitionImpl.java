/**
 */
package org.xtext.example.entity.entityDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.entity.entityDSL.Entity;
import org.xtext.example.entity.entityDSL.EntityDSLPackage;
import org.xtext.example.entity.entityDSL.NamespaceDeclaration;
import org.xtext.example.entity.entityDSL.NamespaceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.entity.entityDSL.impl.NamespaceDefinitionImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.xtext.example.entity.entityDSL.impl.NamespaceDefinitionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceDefinitionImpl extends MinimalEObjectImpl.Container implements NamespaceDefinition
{
  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected NamespaceDeclaration namespace;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected Entity entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceDefinitionImpl()
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
    return EntityDSLPackage.Literals.NAMESPACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(NamespaceDeclaration newNamespace, NotificationChain msgs)
  {
    NamespaceDeclaration oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(NamespaceDeclaration newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntities()
  {
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntities(Entity newEntities, NotificationChain msgs)
  {
    Entity oldEntities = entities;
    entities = newEntities;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES, oldEntities, newEntities);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntities(Entity newEntities)
  {
    if (newEntities != entities)
    {
      NotificationChain msgs = null;
      if (entities != null)
        msgs = ((InternalEObject)entities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES, null, msgs);
      if (newEntities != null)
        msgs = ((InternalEObject)newEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES, null, msgs);
      msgs = basicSetEntities(newEntities, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES, newEntities, newEntities));
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
      case EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES:
        return basicSetEntities(null, msgs);
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
      case EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE:
        return getNamespace();
      case EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES:
        return getEntities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE:
        setNamespace((NamespaceDeclaration)newValue);
        return;
      case EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES:
        setEntities((Entity)newValue);
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
      case EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE:
        setNamespace((NamespaceDeclaration)null);
        return;
      case EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES:
        setEntities((Entity)null);
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
      case EntityDSLPackage.NAMESPACE_DEFINITION__NAMESPACE:
        return namespace != null;
      case EntityDSLPackage.NAMESPACE_DEFINITION__ENTITIES:
        return entities != null;
    }
    return super.eIsSet(featureID);
  }

} //NamespaceDefinitionImpl
