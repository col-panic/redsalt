package org.redsalt.e4fx.app.handlers;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.redsalt.core.appmodel.AppmodelPackage;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.DatamodelFactory;
import org.redsalt.core.services.RedSaltModelService;

public class AddAccountHandler {

	@Inject
	RedSaltModelService applicationManager;

	@Execute
	void execute() {
		Account account = DatamodelFactory.eINSTANCE.createAccount();
		Command command = AddCommand.create(applicationManager.getEditingDomain(),
				applicationManager.getAppModel().getAccounts(),
				AppmodelPackage.Literals.ACCOUNTS__ACCOUNTS, account);
		if (command != null && command.canExecute())
			applicationManager.getEditingDomain().getCommandStack()
					.execute(command);
	}

	@Inject
	public void bla(
			@Optional @Active @Named("handler::command.add") Object value,
			MApplication application, EModelService modelService) {
		if(value==null) return;
		if(value.getClass()!=this.getClass()) return;
		System.out.println("AddAccount " + value);

		List<MHandledItem> findElements = modelService.findElements(
				application, null, MHandledItem.class, null);
		for (MHandledItem mHandledItem : findElements) {
			mHandledItem.setTooltip("Add account");
		}

	}
}
