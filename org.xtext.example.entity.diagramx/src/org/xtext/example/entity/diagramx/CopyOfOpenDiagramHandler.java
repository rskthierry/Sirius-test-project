package org.xtext.example.entity.diagramx;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
import org.xtext.example.entity.diagramx.util.WorkspaceUtil;
import org.xtext.example.entity.entityDSL.Entity;
import org.xtext.example.entity.entityDSL.NamespaceDefinition;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import diagram.DEntity;
import diagram.DNamespace;
import diagram.Diagram;
import diagram.DiagramFactory;

/**
 * A simple handler for opening diagrams.
 */
public class CopyOfOpenDiagramHandler extends AbstractHandler {

	private final DiagramFactory DIAGRAMFACTORY = DiagramFactory.eINSTANCE;

	private final Map<String, DNamespace> dNamespaceMap = Maps.newHashMap();

	private final Map<String, DEntity> dEntityMap = Maps.newHashMap();

	/**
	 * {@inheritDoc}
	 */
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection sSelection = (IStructuredSelection) selection;
			final Diagram diagram = DIAGRAMFACTORY.createDiagram();

			if (sSelection.getFirstElement() instanceof IProject) {
				try {
					final IProject project = (IProject) sSelection.getFirstElement();
					final List<IFile> modelFiles = WorkspaceUtil.getFilesFromWorkspace(Collections.singleton(project), "entity");

					for (final IFile modelFile : modelFiles) {
						final ResourceSet rs = new ResourceSetImpl();
						final Resource r = rs.getResource(URI.createFileURI(modelFile.getFullPath().toString()), true);
						if (r.getContents().size() > 0) {
							final NamespaceDefinition namespaceDefinition = (NamespaceDefinition) r.getContents().get(0);

							final DEntity dEntity = getDEntity(namespaceDefinition.getEntities().getName());
							dEntity.setEntity(namespaceDefinition.getEntities());

							if (namespaceDefinition.getEntities().getParent() != null) {
								final Entity parent = namespaceDefinition.getEntities().getParent();
								final DEntity parentDEntity = getDEntity(parent.getName());

								dEntity.setParent(parentDEntity);
							}

							final DNamespace dNamespace = getDNamespace(namespaceDefinition.getNamespace().getName());
							dNamespace.getDEntities().add(dEntity);

							diagram.getDNamespaces().add(dNamespace);
						}
					}

					dNamespaceMap.clear();
					dEntityMap.clear();
				} catch (Exception e) {
					StatusManager.getManager().handle(
							new Status(IStatus.ERROR, this.getClass().getCanonicalName(), "Could not load selected file.", e), StatusManager.SHOW);
				}
			}

			DiagramViewManager.createView("org.xtext.example.entity.diagram.NamespaceDefinitionDiagram", "NamespaceDefinition Diagram", diagram,
					KlighdSynthesisProperties.create());
		} else {
			MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unsupported element",
					"KLighD diagram synthesis is unsupported for the current selection " + selection.toString() + ".");
		}
		return null;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private DNamespace getDNamespace(String name) {
		if (dNamespaceMap.containsKey(name)) {
			return dNamespaceMap.get(name);
		} else {
			final DNamespace dNamespace = DIAGRAMFACTORY.createDNamespace();
			dNamespace.setName(name);
			dNamespaceMap.put(name, dNamespace);
			return dNamespace;
		}
	}

	private DEntity getDEntity(String entityName) {
		if (dEntityMap.containsKey(entityName)) {
			return dEntityMap.get(entityName);
		} else {
			final DEntity dEntity = DIAGRAMFACTORY.createDEntity();
			dEntityMap.put(entityName, dEntity);
			return dEntity;
		}
	}

	private void sort(final List<Resource> resources) {
		Collections.sort(resources, new Comparator<Resource>() {

			public int compare(Resource source, Resource target) {
				final NamespaceDefinition sourceNsd = (NamespaceDefinition) source.getContents().get(0);
				final NamespaceDefinition targetNsd = (NamespaceDefinition) target.getContents().get(0);

				if (sourceNsd.getNamespace().getName().equals(targetNsd.getNamespace().getName())) {
					return 0;
				} else if (sourceNsd.getNamespace().getName().contains(targetNsd.getNamespace().getName())) {
					return 1;
				}

				return -1;
			}
		});
	}
}
