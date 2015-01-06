package org.xtext.example.entity.diagramx

import com.google.common.collect.ImmutableList
import com.google.common.collect.Maps
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.EdgeType
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSemanticDiagramData
import diagram.DEntity
import diagram.DNamespace
import diagram.Diagram
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.xtext.example.entity.entityDSL.Attribute

class DiagramDiagramSynthesis extends AbstractDiagramSynthesis<Diagram> {

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions

	private static val SynthesisOption GENERAL_SEPARATOR = SynthesisOption::createSeparator("General")
	private static val SynthesisOption VISUALIZE_ALL = SynthesisOption::createCheckOption("Packaged Entity Hierarchy",
		true)
	private static val SynthesisOption VISUALIZE_ENTITIES = SynthesisOption::createCheckOption("Entity Hierarchy", false)

	//	private static val SynthesisOption VISUALIZE_ENTITIES_PLUS_ATTRIBUTES = SynthesisOption::
	//		createCheckOption("Entity + Attributes", false)
	/**
     * Returns our list of synthesis options to be displayed.
     */
	override getDisplayedSynthesisOptions() {
		return ImmutableList::of(
			GENERAL_SEPARATOR,
			VISUALIZE_ALL,
			VISUALIZE_ENTITIES
		/*VISUALIZE_ENTITIES_PLUS_ATTRIBUTES*/
		)
	}

	/**
     * Returns the list of layout options we want to provide to the user.
     */
	override public getDisplayedLayoutOptions() {
		return ImmutableList::of(
			specifyLayoutOption(LayoutOptions::SPACING, newArrayList(0, 255))
		);
	}

	/**
     * Configure general layout options for a parent node (the diagram node or a namespace node).
     */
	def void configureLayout(KNode parentNode) {
		val parentLayout = parentNode.getData(typeof(KShapeLayout))
		parentLayout.setProperty(LayoutOptions.SPACING, 75f)
		parentLayout.setProperty(LayoutOptions.DIRECTION, Direction.UP)

		if (VISUALIZE_ALL.booleanValue) {
			parentLayout.setProperty(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered")
			parentLayout.setProperty(LayoutOptions::LAYOUT_HIERARCHY, true)
			parentLayout.setProperty(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
		} else {
			parentLayout.setProperty(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
		}

	//it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.layoutHierarchy");
	}

	/**
     * Transforms a given Diagram model into a Entity Relation Diagram.
     */
	override KNode transform(Diagram diagram) {
		return diagram.createNode.associateWith(diagram) => [ diagramNode |
			if (DiagramDiagramSynthesis.VISUALIZE_ALL.booleanValue) {
				diagram.DNamespaces.createNamespaceFigures(diagramNode);
			} else if (DiagramDiagramSynthesis.VISUALIZE_ENTITIES.booleanValue) {

				diagram.DNamespaces.forEach [ dNamespace |
					dNamespace.DEntities.createEntityFigures(diagramNode);
				]

				// Create Connections
				diagram.DNamespaces.forEach [ dNamespace |
					dNamespace.DEntities.forEach [ DEntity entity |
						entity.createInheritanceConnection(entity.parent)
					]
				]

			}
			// Configure diagram layout
			diagramNode.configureLayout
		];
	}

	/**
	 * Iterates throw all the DNamespace instances and created figures for the same
	 */
	def private void createNamespaceFigures(EList<DNamespace> namespaces, KNode diagramNode) {
		val namespaceNodeMap = Maps::<String, KNode>newHashMap()

		namespaces.forEach [ dNamespace |
			var KNode namespaceNode = null;
			if (dNamespace.parent != null) {
				val parentNamespaceNode = namespaceNodeMap.get(dNamespace.parent.name)
				namespaceNode = dNamespace.createNamespaceFigure(parentNamespaceNode)
				parentNamespaceNode.children += namespaceNode
			} else {
				namespaceNode = dNamespace.createNamespaceFigure(diagramNode)
				diagramNode.children += namespaceNode
				namespaceNodeMap.put(dNamespace.name, namespaceNode)
			}
			// Create Entity Figures
			if (namespaceNode != null) {
				dNamespace.DEntities.createEntityFigures(namespaceNode);
			}
		]

		// Create Connections
		namespaces.forEach [ dNamespace |
			dNamespace.DEntities.forEach [ DEntity entity |
				entity.createInheritanceConnection(entity.parent)
			]
		]
	}

	/**
	 * 
	 */
	def private void createEntityFigures(EList<DEntity> dEntities, KNode namespaceNode) {
		dEntities.forEach [ dEntity |
			val entityNode = dEntity.createEntityFigure(namespaceNode)
			namespaceNode.children += entityNode
		]
	}

	/**
	 * 
	 */
	def private KNode createNamespaceFigure(DNamespace dNamespace, KNode parentNode) {
		return dNamespace.createNode.associateWith(dNamespace) => [ namespaceNode |
			namespaceNode.addRectangle => [ rect |
				rect.invisible = false
				rect.lineStyle = LineStyle::DASH
				rect.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
				rect.shadow = "black".color;
				rect.shadow.XOffset = 4;
				rect.shadow.YOffset = 4;
				rect.setGridPlacement(1).from(LEFT, 5, 0, TOP, 5, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
				// First rectangle that represents the grid layout cell
				val cell = rect.addRectangle() => [
					it.invisible = true
					it.setGridPlacementData(0, 0, createKPosition(LEFT, 0, 0, TOP, 0, 0),
						createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
				]
				// free-floating, centrally-aligned container
				val actualContainer = cell.addRectangle() => [
					it.invisible = true
					it.setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0.5f, H_CENTRAL, V_CENTRAL, 0, 0, 0, 0)
				]
				// Namespace name
				actualContainer.addText(dNamespace.name) => [ text |
					text.fontName = KlighdConstants.DEFAULT_FONT_NAME
					text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 8
					text.fontBold = true
					text.setPointPlacementData(LEFT, 5, 0, TOP, 0, 0.5f, H_LEFT, V_CENTRAL, 0, 0, 0, 0)
				]
				//rect.addDottedSeparator
				rect.addChildArea().setGridPlacementData() => [
					from(LEFT, 5, 0, TOP, 5, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
				]
			]
			// Copy the root node properties and then configure the layout
			namespaceNode.getData(typeof(KShapeLayout)).copyProperties(parentNode.getData(typeof(KShapeLayout)))
			namespaceNode.configureLayout
		]
	}

	def private KContainerRendering addSeparator(KContainerRendering container) {
		container.children += RENDERING_FACTORY.createKPolyline() => [
			it.setGridPlacementData(0, 0, createKPosition(LEFT, 0, 0, TOP, 0, 0),
				createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
			it.points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0)
			it.points += createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0)
			it.foreground = "black".color
		]

		return container
	}

	def private KContainerRendering addDottedSeparator(KContainerRendering container) {
		container.children += RENDERING_FACTORY.createKPolyline() => [
			it.setGridPlacementData(0, 0, createKPosition(LEFT, 0, 0, TOP, 0, 0),
				createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
			it.points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0)
			it.points += createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0)
			it.foreground = "black".color
			it.lineStyle = LineStyle::DASH
		]

		return container
	}

	def private KNode createEntityFigure(DEntity dEntity, KNode parentNode) {
		return dEntity.createNode.associateWith(dEntity) => [ entityNode |
			entityNode.addRoundedRectangle(10, 10) => [ rect |
				rect.invisible = false
				rect.foreground = "gray".color
				rect.setBackgroundGradient("#f8f9fd".color, "#cddcf3".color, 90)
				rect.shadow = "black".color;
				rect.shadow.XOffset = 4;
				rect.shadow.YOffset = 4;
				rect.setGridPlacement(1).from(LEFT, 5, 0, TOP, 5, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
				// First rectangle that represents the grid layout cell
				val cell = rect.addRectangle() => [
					it.invisible = true
					it.setGridPlacementData(0, 0, createKPosition(LEFT, 0, 0, TOP, 0, 0),
						createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
				]
				// free-floating, centrally-aligned container
				val actualContainer = cell.addRectangle() => [
					it.invisible = true
					it.setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0.5f, H_CENTRAL, V_CENTRAL, 0, 0, 0, 0)
				]
				// Entity name
				actualContainer.addText(dEntity.entity.name) => [ text |
					text.fontName = KlighdConstants.DEFAULT_FONT_NAME
					text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 5
					text.setPointPlacementData(LEFT, 5, 0, TOP, 0, 0.5f, H_LEFT, V_CENTRAL, 0, 0, 0, 0)
				]
				//if (VISUALIZE_ENTITIES_PLUS_ATTRIBUTES.booleanValue) {
				rect.addSeparator
				dEntity.entity.attributes.forEach [ attribute |
					attribute.createAttributeFigure(rect)
				]
			//}
			]
		]
	}

	/**
	 * 
	 */
	def private KContainerRendering createAttributeFigure(Attribute attribute, KContainerRendering container) {
		val actualContainer = container.addRectangle() => [
			it.invisible = true
			it.setGridPlacementData(0, 0, createKPosition(LEFT, 0, 0, TOP, 2, 0),
				createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
		]

		actualContainer.addText(attribute.name + " : " + attribute.type.name) => [ text |
			text.fontName = KlighdConstants.DEFAULT_FONT_NAME
			text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 5
			text.setPointPlacementData(LEFT, 5, 0, TOP, 0, 0.5f, H_LEFT, V_CENTRAL, 0, 0, 0, 0)
		]

		return actualContainer
	}

	def private KNode createNamespace(DNamespace namespace, KNode parentNode) {
		val namespaceNode = namespace.createNode()
		parentNode.children += namespaceNode.associateWith(namespace) => [
			//it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
			it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
			it.addLayoutParam(LayoutOptions::SPACING, 75f);
			it.addLayoutParam(LayoutOptions::LAYOUT_HIERARCHY, true);
			it.addLayoutParam(LayoutOptions::DIRECTION, Direction::UP);
			it.addLayoutParam(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
			it.addRectangle => [
				it.lineWidth = 2
				it.lineStyle = LineStyle::DASH
				it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
				it.shadow = "black".color;
				it.addText(namespace.name) => [
					it.fontSize = 13;
					it.fontBold = true;
					it.setAreaPlacementData.from(LEFT, 10, 0, TOP, 10, 0).to(RIGHT, 10, 0, BOTTOM, 10, 0);
				]
				val entities = namespace.DEntities
				if (!entities.empty) {
					it.setGridPlacement(1);
					it.addHorizontalSeperatorLine(2, 5).setForeground("black".color).lineStyle = LineStyle::DASH
					it.addChildArea().setGridPlacementData() => [
						from(LEFT, 5, 0, TOP, 5, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
						entities.forEach [ DEntity dEntity |
							val entityNode = dEntity.createNode()
							namespaceNode.children += entityNode.associateWith(namespace) => [
								it.addRectangle => [
									it.lineWidth = 2;
									it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
									it.shadow = "black".color;
									it.setGridPlacement(1).from(LEFT, 2, 0, TOP, 2, 0).to(RIGHT, 2, 0, BOTTOM, 2, 0);
									it.addRectangle => [
										it.invisible = true;
										it.setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0.5f, H_CENTRAL, V_CENTRAL,
											0, 0, 0, 0);
										it.addImage("org.xtext.example.entity.diagramx", "icons/Class.png").
											setPointPlacementData(LEFT, 20, 0, TOP, 0, 0.5f, H_CENTRAL, V_CENTRAL,
												10, 10, 20, 20).addEllipticalClip; //.setAreaPlacementData.from(LEFT, 3, 0, TOP, 3, 0).to(RIGHT, 3, 0, BOTTOM, 3, 0);
										it.addText(dEntity.entity.name).associateWith(entityNode) => [
											// add semantic data to a rendering
											it.setProperty(KlighdProperties.SEMANTIC_DATA,
												KlighdSemanticDiagramData.of(KlighdConstants.SEMANTIC_DATA_CLASS,
													"classifierText"))
											it.fontSize = 15;
											it.fontBold = true;
											it.cursorSelectable = true;
											it.setPointPlacementData(LEFT, 40, 0, TOP, 0, 0.5f, H_LEFT, V_CENTRAL,
												10, 10, 0, 0);
										]
									]
									//Attributes
									val attributes = dEntity.entity.attributes
									if (!attributes.empty) {
										it.addHorizontalLine(1, 1.5f);
										it.addRectangle => [
											it.invisible = true;
											it.foreground = "red".color;
											it.setSurroundingSpaceGrid(7, 0)
											it.setGridPlacement(1).from(LEFT, 0, 0, TOP, -2, 0);
											attributes.forEach [ Attribute attribute |
												it.addRectangle => [
													it.invisible = true;
													it.addText(attribute.name + " : " + attribute.type.name) => [
														it.fontSize = 13;
														it.horizontalAlignment = H_LEFT
														it.verticalAlignment = V_CENTRAL
														it.cursorSelectable = true;
														it.setPointPlacementData(LEFT, 25, 0, TOP, 0, 0.5f, H_LEFT,
															V_CENTRAL, 20, 5, 0, 0);
													];
												]
											]
										]
									}
								]
							]
						]
					]

					entities.forEach [ DEntity entity |
						entity.createInheritanceConnection(entity.parent)
					]
				}
			]
		]

		return namespaceNode
	}

	def private void createInheritanceConnection(DEntity child, DEntity parent) {
		if (parent != null) {
			new Pair(child, parent).createEdge() => [
				it.addLayoutParam(LayoutOptions::EDGE_TYPE, EdgeType::GENERALIZATION);
				// add semantic data
				it.getData(typeof(KLayoutData)).setProperty(KlighdProperties.SEMANTIC_DATA,
					KlighdSemanticDiagramData.of(KlighdConstants.SEMANTIC_DATA_CLASS, "inheritence"))
				it.source = child.node;
				it.target = parent.node;
				addPolyline() => [
					it.lineWidth = 2;
					//it.foreground = "gray25".color
					it.addInheritanceTriangleArrowDecorator() => [
						it.foreground = "#404040".color
					]
					it.foreground = "#404040".color
				];
			];
		}
	}

}
