package org.redsalt.e4.ui.common.handlers;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.redsalt.core.services.RedSaltModelService;

public class SaveHandler {

	@Inject
	RedSaltModelService applicationManager;

	@Execute
	void execute() {
		try {
			applicationManager.getAppModel().eResource().save(applicationManager.getResourceSaveOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
