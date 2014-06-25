package org.redsalt.core;

import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;
import org.redsalt.core.appmodel.RedSaltApplication;
import org.redsalt.core.appmodel.impl.AppmodelPackageImpl;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.ContactType;
import org.redsalt.core.datamodel.DatamodelFactory;
import org.redsalt.core.datamodel.impl.DatamodelPackageImpl;
import org.redsalt.core.services.RedSaltModelService;
import org.redsalt.core.services.model.RedSaltModelServiceImpl;

public class RedSaltModelTest extends TestCase {

	RedSaltModelService modelService = new RedSaltModelServiceImpl();
	
	@BeforeClass
	public void beforeClass() {
		DatamodelPackageImpl.init();
		AppmodelPackageImpl.init();
	}
	
	@Test
	public void testBasicModelContstraints() throws IOException {
		RedSaltApplication appRes = modelService.getAppModel();
		assertNotNull(appRes.getAccounts());
		assertNotNull(appRes.getContacts());
	}

	@Test
	public void testLoadOrInitAppModelFromResourcePopulateAndStore()
			throws IOException {
		// DatamodelPackage.eINSTANCE.eClass();
		RedSaltApplication appRes = modelService.getAppModel();

		Contact cMedevit = DatamodelFactory.eINSTANCE.createContact();
		cMedevit.setName("MEDEVIT OG");
		cMedevit.setOrganization(true);
		cMedevit.setCity("Götzis");
		cMedevit.setStreet("St. Ulrich-Strasse 40");
		cMedevit.setContactType(ContactType.USER);
		cMedevit.setEmail("office@medevit.at");
		cMedevit.setVatNo("ATU 66118916");

		Contact cBank = DatamodelFactory.eINSTANCE.createContact();
		cBank.setName("Sparkasse der Stadt Feldkirch");
		cBank.setOrganization(true);
		cBank.setContactType(ContactType.BANK);

		Account acc = DatamodelFactory.eINSTANCE.createAccount();
		acc.setOwningContact(cMedevit);
		acc.setManagingContact(cBank);
		acc.setAccountNumber("03100-733223 EUR");
		acc.setIban("AT562060403100733223");
		acc.setBic("SPFKAT2BXXX");

		modelService.getContacts().getContacts().add(cMedevit);
		modelService.getContacts().getContacts().add(cBank);
		modelService.getAccounts().getAccounts().add(acc);

		modelService.getAppModel().eResource().save(modelService.getResourceSaveOptions());
	}

	@Test
	public void testLoadAccountByIban() throws MalformedURLException,
			IOException {
//		RedSalt.loadOrInitAppModelFromURL(CommonTestConstants.XMI_CA_FILE
//				.toURI().toURL());
//		RedSaltApplication appRes = RedSalt.getAppmodel();
//		assertNotNull(appRes
//				.findAccountByAccountNumberOrIban("03100-733223 EUR"));
//		assertNotNull(appRes
//				.findAccountByAccountNumberOrIban("03100-733223EUR"));
	}

}
