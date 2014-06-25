package org.redsalt.core.services;

import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.redsalt.core.appmodel.Accounts;
import org.redsalt.core.appmodel.Contacts;
import org.redsalt.core.appmodel.RedSaltApplication;

public interface RedSaltModelService {
	
	AdapterFactory getAdapterFactory();

	EditingDomain getEditingDomain();
	
	Map<String, String> getResourceSaveOptions();

	RedSaltApplication getAppModel();
	
	Contacts getContacts();
	
	Accounts getAccounts();
}
