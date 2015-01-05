package org.xtext.example.entity.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.entity.entityDSL.Attribute;
import org.xtext.example.entity.entityDSL.Entity;
import org.xtext.example.entity.entityDSL.EntityDSLPackage;
import org.xtext.example.entity.entityDSL.NamespaceDeclaration;
import org.xtext.example.entity.entityDSL.NamespaceDefinition;
import org.xtext.example.entity.services.EntityDSLGrammarAccess;

@SuppressWarnings("all")
public class EntityDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntityDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EntityDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EntityDSLPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case EntityDSLPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case EntityDSLPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_NamespaceDeclaration(context, (NamespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case EntityDSLPackage.NAMESPACE_DEFINITION:
				if(context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_NamespaceDefinition(context, (NamespaceDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=[Entity|ID]?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (abstract?='abstract'? name=ID parent=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifedName
	 */
	protected void sequence_NamespaceDeclaration(EObject context, NamespaceDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (namespace=NamespaceDeclaration entities=Entity)
	 */
	protected void sequence_NamespaceDefinition(EObject context, NamespaceDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DEFINITION__NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DEFINITION__NAMESPACE));
			if(transientValues.isValueTransient(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DEFINITION__ENTITIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDSLPackage.Literals.NAMESPACE_DEFINITION__ENTITIES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getNamespaceNamespaceDeclarationParserRuleCall_0_0(), semanticObject.getNamespace());
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getEntitiesEntityParserRuleCall_1_0(), semanticObject.getEntities());
		feeder.finish();
	}
}
