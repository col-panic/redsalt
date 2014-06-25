package org.redsalt.e4fx.ui.views;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.services.RedSaltModelService;
import org.redsalt.e4fx.ui.views.controllers.ContactDetailsViewController;

public class ContactDetailsView {

	ContactDetailsViewController controller;

	@Inject
	RedSaltModelService applicationManager;

	@Inject
	public ContactDetailsView(Pane parent, final MApplication application) {

		URL location = getClass().getResource("contactDetails.fxml");

		FXMLLoader fxmlLoader = new FXMLLoader(location);
		controller = new ContactDetailsViewController();
		fxmlLoader.setController(controller);

		Pane root = null;
		try {
			root = (Pane) fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		parent.getChildren().add(root);
	}

	@Inject
	public void setSelection(@Optional Contact selectedItem) {
//		Contact contact = selectedItem instanceof Contact ? (Contact) selectedItem
//				: null;
		controller.updateBindings(selectedItem,
				applicationManager.getEditingDomain());
	}

}
