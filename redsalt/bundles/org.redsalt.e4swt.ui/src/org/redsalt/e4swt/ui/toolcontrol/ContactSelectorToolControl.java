package org.redsalt.e4swt.ui.toolcontrol;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class ContactSelectorToolControl {
	@PostConstruct
	public void createControls(Composite parent) {
		ComboViewer comboViewer = new ComboViewer(parent, SWT.NONE);
		Combo contactSelectorComboViewer = comboViewer.getCombo();
	}
}
