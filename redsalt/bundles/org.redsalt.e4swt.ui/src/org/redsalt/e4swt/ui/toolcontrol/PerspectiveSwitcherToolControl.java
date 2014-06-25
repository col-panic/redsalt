package org.redsalt.e4swt.ui.toolcontrol;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class PerspectiveSwitcherToolControl extends SelectionAdapter {

	private MPerspectiveStack perspectiveStack;
	private Button[] perspectiveButtons;

	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;
	
	@PostConstruct
	public void createControls(Composite parent, MWindow window) {
		findStack(window);
		if (perspectiveStack == null)
			throw new IllegalStateException("Cannot find PerspectiveStack");
		
		createButtons(parent);

	}

	private void createButtons(Composite parent) {
		List<MPerspective> children = perspectiveStack.getChildren();

		perspectiveButtons = new Button[children.size()];
		for (int i = 0; i < children.size(); i++) {
			MPerspective mPerspective = children.get(i);
			perspectiveButtons[i] = new Button(parent, SWT.RADIO);
			perspectiveButtons[i].setText(mPerspective.getLocalizedLabel());
			perspectiveButtons[i].setData(mPerspective);
			perspectiveButtons[i].setSelection((mPerspective
					.equals(perspectiveStack.getSelectedElement())));
			perspectiveButtons[i].addSelectionListener(this);
			
		}

	}

	private void findStack(MWindow window) {
		for (MWindowElement elem : window.getChildren())
			if (elem instanceof MPerspectiveStack) {
				perspectiveStack = (MPerspectiveStack) elem;
				return;
			}
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		System.out.println(e);
		
	}

}
