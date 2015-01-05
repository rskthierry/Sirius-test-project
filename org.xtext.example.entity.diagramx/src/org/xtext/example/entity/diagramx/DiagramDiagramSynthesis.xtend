package org.xtext.example.entity.diagramx

import com.google.common.collect.Maps
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.EdgeType
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.util.KlighdSemanticDiagramData
import diagram.DEntity
import diagram.DNamespace
import diagram.Diagram
import javax.inject.Inject
import org.eclipse.emf.common.util.EList
import org.xtext.example.entity.entityDSL.Attribute
import de.cau.cs.kieler.core.krendering.LineJoin

class DiagramDiagramSynthesis extends AbstractDiagramSynthesis<Diagram> {

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(Diagram diagram) {
		return createNode().associateWith(diagram) => [
			it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
			it.addLayoutParam(LayoutOptions::SPACING, 75f);
			it.addLayoutParam(LayoutOptions::DIRECTION, Direction::UP);
			it.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.POLYLINE);
			// Create figures for the Namesapce definitions
			diagram.DNamespaces.createElementFigures(it);
		];
	}

	def void createElementFigures(EList<DNamespace> namespaces, KNode parentNode) {
		namespaces.createNamespaces(parentNode);

	//namespaces.createNamespaceFigures(parentNode);
	}

	def void createNamespaces(EList<DNamespace> namespaces, KNode parentNode) {
		val namespaceNodeMap = Maps::<String, KNode>newHashMap()

		namespaces.forEach [ DNamespace dNamespace |
			if (dNamespace.parent != null) {
				val KNode parent = namespaceNodeMap.get(dNamespace.parent.name)
				dNamespace.createNamespace(parent)
			} else {
				val KNode node = dNamespace.createNamespace(parentNode)
				namespaceNodeMap.put(dNamespace.name, node)
			}
		]
	}

	def KNode createNamespace(DNamespace namespace, KNode parentNode) {
		val namespaceNode = namespace.createNode()
		parentNode.children += namespaceNode.associateWith(namespace) => [
			it.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
			it.addLayoutParam(LayoutOptions::SPACING, 75f);
			it.addLayoutParam(LayoutOptions::DIRECTION, Direction::UP);
			it.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::POLYLINE);
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
							entityNode.setLayoutOption(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
							createPort().associateWith(dEntity.BPort) => [
								it.setPortSize(10, 5);
								it.setLayoutOption(LayoutOptions.OFFSET, -3f);
								it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.NORTH);
								it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
								entityNode.ports.add(it)
							]
							createPort().associateWith(dEntity.TPort) => [
								it.setPortSize(10, 5);
								it.setLayoutOption(LayoutOptions.OFFSET, -3f);
								it.setLayoutOption(LayoutOptions.PORT_SIDE, PortSide.WEST);
								it.addRectangle.setBackground("black".color).lineJoin = LineJoin.JOIN_ROUND;
								entityNode.ports.add(it)
							]
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

	def void createInheritanceConnection(DEntity child, DEntity parent) {
		if (parent != null) {
			new Pair(child, parent).createEdge() => [
				it.addLayoutParam(LayoutOptions::EDGE_TYPE, EdgeType::GENERALIZATION);
				// add semantic data
				it.getData(typeof(KLayoutData)).setProperty(KlighdProperties.SEMANTIC_DATA,
					KlighdSemanticDiagramData.of(KlighdConstants.SEMANTIC_DATA_CLASS, "inheritence"))
				it.source = child.node;
				it.sourcePort = source.ports.head
				it.target = parent.node;
				it.targetPort = target.ports.last
				addRoundedBendsPolyline(3) => [
					it.lineWidth = 2;
					it.foreground = "gray25".color
					it.addInheritanceTriangleArrowDecorator();
				];
			];
		}
	}
}
