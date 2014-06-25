package org.redsalt.e4fx.app.toolcontrol;

import javafx.scene.Group;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class PerspectiveTabs {

	private MPerspectiveStack mStack;
	private TabPane mFolder;

	@Inject
	IEclipseContext context;
	
	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;
	
	@Inject
	MApplication application;

	@PostConstruct
	public void createUI(Group parent, MWindow window, EModelService service) {
		mFolder = new TabPane();
		findStack(window);
		if (mStack == null)
			return;
		updateTabs();
		// called to make sure initial perspective is set in context
		doTabClick();
		mFolder.getSelectionModel().selectedItemProperty().addListener(e -> doTabClick());
		parent.getChildren().add(mFolder);
	}

	private void updateTabs() {
		for (MPerspective perspective : mStack.getChildren()) {
			Tab ti = new Tab();
			ti.setText(perspective.getLocalizedLabel());
			ti.setUserData(perspective.getElementId());
//			if (ti.getGraphic() == null) {
//				try {
//					if (perspective.getIconURI() != null)
//						ti.setImage(ImageDescriptor.createFromURL(
//								new URL(perspective.getIconURI()))
//								.createImage());
//				} catch (MalformedURLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			mFolder.getTabs().add(ti);
		}
	}

	private void doTabClick() {
		Tab ti = mFolder.getSelectionModel().getSelectedItem();
		
		MPerspective perspective = (MPerspective) modelService.find((String) ti.getUserData(), application);
		
//		MPerspective perspective = (MPerspective) ti.getUserData();
		mStack.setSelectedElement(perspective);
	
		if(perspective.getContext()!=null) {
			partService.switchPerspective(perspective);
		}

		
//		List<MPart> findElements = modelService.findElements(perspective, null, MPart.class, null);
//		if(findElements.size()>0) partService.showPart(findElements.get(0), PartState.ACTIVATE);
		
		// essential for core expressions
		context.set("activePerspective", perspective.getElementId());
	}

	private void findStack(MWindow window) {
		for (MWindowElement elem : window.getChildren())
			if (elem instanceof MPerspectiveStack) {
				mStack = (MPerspectiveStack) elem;
				return;
			}
	}

}
