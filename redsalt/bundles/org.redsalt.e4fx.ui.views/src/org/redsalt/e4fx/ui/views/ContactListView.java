package org.redsalt.e4fx.ui.views;

import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.EMenuService;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.services.RedSaltModelService;

public class ContactListView extends AbstractListView {

	@Inject
	public ContactListView(BorderPane parent, final MApplication application,
			final RedSaltModelService applicationManager, final EMenuService menuService) {
		super(parent, application, applicationManager, menuService, applicationManager.getContacts(), Contact.class, "contactListView.popupMenu");
	}
}
