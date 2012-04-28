package com.polopoly.ps.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.polopoly.ps.dsl.services.TextContentGrammarAccess;
import com.polopoly.ps.dsl.textContent.Component;
import com.polopoly.ps.dsl.textContent.DefaultListElement;
import com.polopoly.ps.dsl.textContent.NamedListElement;
import com.polopoly.ps.dsl.textContent.NamedListElementWithRefMetadata;
import com.polopoly.ps.dsl.textContent.Reference;
import com.polopoly.ps.dsl.textContent.TextContent;
import com.polopoly.ps.dsl.textContent.TextContentPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractTextContentSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected TextContentGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TextContentPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TextContentPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case TextContentPackage.DEFAULT_LIST_ELEMENT:
				if(context == grammarAccess.getDefaultListElementRule() ||
				   context == grammarAccess.getListElementRule()) {
					sequence_DefaultListElement(context, (DefaultListElement) semanticObject); 
					return; 
				}
				else break;
			case TextContentPackage.NAMED_LIST_ELEMENT:
				if(context == grammarAccess.getAbstractNamedListElementRule() ||
				   context == grammarAccess.getListElementRule() ||
				   context == grammarAccess.getNamedListElementRule()) {
					sequence_NamedListElement(context, (NamedListElement) semanticObject); 
					return; 
				}
				else break;
			case TextContentPackage.NAMED_LIST_ELEMENT_WITH_REF_METADATA:
				if(context == grammarAccess.getAbstractNamedListElementRule() ||
				   context == grammarAccess.getListElementRule() ||
				   context == grammarAccess.getNamedListElementWithRefMetadataRule()) {
					sequence_NamedListElementWithRefMetadata(context, (NamedListElementWithRefMetadata) semanticObject); 
					return; 
				}
				else break;
			case TextContentPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case TextContentPackage.TEXT_CONTENT:
				if(context == grammarAccess.getTextContentRule()) {
					sequence_TextContent(context, (TextContent) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (group=PP_ID name=PP_ID value=STRING)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.COMPONENT__GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.COMPONENT__GROUP));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.COMPONENT__NAME));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.COMPONENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.COMPONENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentAccess().getGroupPP_IDTerminalRuleCall_1_0(), semanticObject.getGroup());
		feeder.accept(grammarAccess.getComponentAccess().getNamePP_IDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentAccess().getValueSTRINGTerminalRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referredId=PP_ID
	 */
	protected void sequence_DefaultListElement(EObject context, DefaultListElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultListElementAccess().getReferredIdPP_IDTerminalRuleCall_1_0(), semanticObject.getReferredId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (listName=PP_ID referredId=PP_ID referenceMetadataId=PP_ID)
	 */
	protected void sequence_NamedListElementWithRefMetadata(EObject context, NamedListElementWithRefMetadata semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.NAMED_LIST_ELEMENT_WITH_REF_METADATA__REFERENCE_METADATA_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedListElementWithRefMetadataAccess().getListNamePP_IDTerminalRuleCall_1_0(), semanticObject.getListName());
		feeder.accept(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferredIdPP_IDTerminalRuleCall_3_0(), semanticObject.getReferredId());
		feeder.accept(grammarAccess.getNamedListElementWithRefMetadataAccess().getReferenceMetadataIdPP_IDTerminalRuleCall_5_0(), semanticObject.getReferenceMetadataId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (listName=PP_ID referredId=PP_ID)
	 */
	protected void sequence_NamedListElement(EObject context, NamedListElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.LIST_ELEMENT__REFERRED_ID));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.ABSTRACT_NAMED_LIST_ELEMENT__LIST_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedListElementAccess().getListNamePP_IDTerminalRuleCall_1_0(), semanticObject.getListName());
		feeder.accept(grammarAccess.getNamedListElementAccess().getReferredIdPP_IDTerminalRuleCall_3_0(), semanticObject.getReferredId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (group=PP_ID name=PP_ID referredId=PP_ID)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.REFERENCE__GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.REFERENCE__GROUP));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.REFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, TextContentPackage.Literals.REFERENCE__REFERRED_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextContentPackage.Literals.REFERENCE__REFERRED_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getGroupPP_IDTerminalRuleCall_1_0(), semanticObject.getGroup());
		feeder.accept(grammarAccess.getReferenceAccess().getNamePP_IDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReferenceAccess().getReferredIdPP_IDTerminalRuleCall_5_0(), semanticObject.getReferredId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=PP_ID 
	 *         inputtemplate=PP_ID 
	 *         securityparent=PP_ID 
	 *         name=STRING 
	 *         components+=Component* 
	 *         references+=Reference* 
	 *         listElements+=ListElement*
	 *     )
	 */
	protected void sequence_TextContent(EObject context, TextContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
