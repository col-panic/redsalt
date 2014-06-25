package org.redsalt.e4fx.ui.views;

import javax.inject.Inject;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.EMenuService;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.services.RedSaltModelService;

public class AccountListView extends AbstractListView {

	@Inject
	public AccountListView(BorderPane parent, MApplication application,
			RedSaltModelService applicationManager, EMenuService menuService) {
		super(parent, application, applicationManager, menuService, applicationManager.getAccounts(), Account.class, "accountListView.popupMenu");
	}

}
