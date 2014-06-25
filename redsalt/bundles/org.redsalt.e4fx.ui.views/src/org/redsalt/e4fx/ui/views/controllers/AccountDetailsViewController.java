package org.redsalt.e4fx.ui.views.controllers;

import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryListCellFactory;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.DatamodelPackage;
import org.redsalt.core.services.RedSaltModelService;

public class AccountDetailsViewController extends AbstractDetailsViewController {

	@FXML
	private TextField accountNumber;
	private Property<String> accountNumberProperty;
	
	@FXML
	private ComboBox accountType;
	private Property<?> accountTypeProperty;

	@FXML
	private TextField label;
	private Property<String> labelProperty;

	@FXML
	private TextField iban;
	private Property<String> ibanProperty;

	@FXML
	private TextField bic;
	private Property<String> bicProperty;

	@FXML
	private TextField remark;
	private Property<String> remarkProperty;

	@FXML
	private ComboBox managingContact;
	private Property<?> managingContactProperty;

	@FXML
	private ComboBox owningContact;
	private Property<?> owningContactProperty;

	RedSaltModelService applicationManager;

	public AccountDetailsViewController(RedSaltModelService applicationManager) {
		this.applicationManager = applicationManager;
	}

	public void updateBindings(Account account, EditingDomain editingDomain) {
		labelProperty = rebindTextField(label, labelProperty, account,
				DatamodelPackage.eINSTANCE.getAccount_Label(), editingDomain);

		bicProperty = rebindTextField(bic, bicProperty, account,
				DatamodelPackage.eINSTANCE.getAccount_Bic(), editingDomain);

		ibanProperty = rebindTextField(iban, ibanProperty, account,
				DatamodelPackage.eINSTANCE.getAccount_Iban(), editingDomain);

		remarkProperty = rebindTextField(remark, remarkProperty, account,
				DatamodelPackage.eINSTANCE.getAccount_Remark(), editingDomain);

		accountNumberProperty = rebindTextField(accountNumber,
				accountNumberProperty, account,
				DatamodelPackage.eINSTANCE.getAccount_AccountNumber(),
				editingDomain);

		managingContactProperty = rebindComboBox(managingContact,
				managingContactProperty, applicationManager.getContacts()
						.getContacts(), account,
				DatamodelPackage.eINSTANCE.getAccount_ManagingContact(),
				editingDomain);

		owningContactProperty = rebindComboBox(owningContact,
				owningContactProperty, applicationManager.getContacts()
						.getContacts(), account,
				DatamodelPackage.eINSTANCE.getAccount_OwningContact(),
				editingDomain);

	}

	public void initialize() {
		AdapterFactoryListCellFactory listCellFactory = new AdapterFactoryListCellFactory(
				applicationManager.getAdapterFactory());
		managingContact.setCellFactory(listCellFactory);
		managingContact.setButtonCell(listCellFactory.call(null));
		owningContact.setCellFactory(listCellFactory);
		owningContact.setButtonCell(listCellFactory.call(null));
	}

}
