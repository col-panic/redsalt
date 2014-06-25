package org.redsalt.core.importer.smooks.decoders;

import org.redsalt.core.datamodel.Account;

public class AccountDecoder {

	// https://github.com/jboss-wise/wise-core/blob/225e5799081f0562b32189bdb9faea4e98438617/core/src/main/java/org/jboss/wise/smooks/decoders/XMLGregorianCalendarDecoder.java
	// https://github.com/jboss-wise/wise-core/blob/225e5799081f0562b32189bdb9faea4e98438617/integration-testsuite/common/src/test/resources/META-INF/smooks/smooks-config-XMLGregorianCalendar.xml
//	public Object decode(String data) throws DataDecodeException {
//		RedSaltModelService service = RedSaltModelServiceConsumer.getService();
//		Account account = service.getAccounts().findAccountByAccountNumberOrIban(data);
//		
//		if(account == null) {
//			account = DatamodelFactory.eINSTANCE.createAccount();
//			account.setAccountNumber(data);
//		}
//		return account;
//	}

}
