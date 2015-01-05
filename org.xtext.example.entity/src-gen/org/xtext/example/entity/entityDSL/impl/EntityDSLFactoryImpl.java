/**
 */
package org.xtext.example.entity.entityDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.entity.entityDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityDSLFactoryImpl extends EFactoryImpl implements EntityDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityDSLFactory init()
  {
    try
    {
      EntityDSLFactory theEntityDSLFactory = (EntityDSLFactory)EPackage.Registry.INSTANCE.getEFactory(EntityDSLPackage.eNS_URI);
      if (theEntityDSLFactory != null)
      {
        return theEntityDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EntityDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EntityDSLPackage.NAMESPACE_DEFINITION: return createNamespaceDefinition();
      case EntityDSLPackage.NAMESPACE_DECLARATION: return createNamespaceDeclaration();
      case EntityDSLPackage.ENTITY: return createEntity();
      case EntityDSLPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDefinition createNamespaceDefinition()
  {
    NamespaceDefinitionImpl namespaceDefinition = new NamespaceDefinitionImpl();
    return namespaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration createNamespaceDeclaration()
  {
    NamespaceDeclarationImpl namespaceDeclaration = new NamespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDSLPackage getEntityDSLPackage()
  {
    return (EntityDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EntityDSLPackage getPackage()
  {
    return EntityDSLPackage.eINSTANCE;
  }

} //EntityDSLFactoryImpl
