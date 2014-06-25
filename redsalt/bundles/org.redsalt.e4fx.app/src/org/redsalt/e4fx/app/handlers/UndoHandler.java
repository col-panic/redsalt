package org.redsalt.e4fx.app.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.redsalt.core.services.RedSaltModelService;

public class UndoHandler {
	
	@Execute
	public void execute(RedSaltModelService applicationManager) {
		applicationManager.getEditingDomain().getCommandStack().undo();
	}
	
	@CanExecute
	public boolean canExecute(RedSaltModelService applicationManager) {
		return applicationManager.getEditingDomain().getCommandStack().canUndo();
	}
}
