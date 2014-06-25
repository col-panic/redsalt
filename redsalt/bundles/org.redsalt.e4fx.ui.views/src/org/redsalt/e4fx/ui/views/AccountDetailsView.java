package org.redsalt.e4fx.ui.views;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.services.RedSaltModelService;
import org.redsalt.e4fx.ui.views.controllers.AccountDetailsViewController;

public class AccountDetailsView {

	AccountDetailsViewController controller;

	@Inject
	RedSaltModelService applicationManager;

	@Inject
	public AccountDetailsView(BorderPane parent, final MApplication application, RedSaltModelService applicationManager) {

		URL location = getClass().getResource("accountDetailsView.fxml");

		FXMLLoader fxmlLoader = new FXMLLoader(location);
		controller = new AccountDetailsViewController(applicationManager);
		fxmlLoader.setController(controller);

		Pane root = null;
		try {
			root = (Pane) fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		controller.initialize();

		parent.setCenter(root);
	}

	@Inject
	public void setSelection(@Optional Account account) {
		controller.updateBindings(account,
				applicationManager.getEditingDomain());
	}

}
