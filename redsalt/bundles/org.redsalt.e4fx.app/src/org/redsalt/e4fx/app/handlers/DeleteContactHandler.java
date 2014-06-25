 
package org.redsalt.e4fx.app.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.services.RedSaltModelService;

public class DeleteContactHandler {
	
	@Inject
	RedSaltModelService applicationManager;
	
	@Execute
	public void execute(@Optional Contact selectedItem) {
		Command command = DeleteCommand.create(applicationManager.getEditingDomain(), selectedItem);
		if (command != null && command.canExecute())
			applicationManager.getEditingDomain().getCommandStack()
					.execute(command);
	}
	
	
	@CanExecute
	public boolean canExecute(@Optional Contact selectedItem) {
		if(selectedItem == null) return false;
		
		
		return true;
	}
		
}