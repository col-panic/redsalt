package org.redsalt.core.appmodel;

import org.redsalt.core.datamodel.Account;

public class RedSaltApplicationMethods {

	public static Account findAccountByAccountNumberOrIban(
			Accounts accounts, String accountNumber) {
		if (accountNumber == null || accountNumber.length() == 0)
			return null;
		long accountNumberInt = Long.parseLong(accountNumber.replaceAll(
				"[^0-9]", ""));
		for (Account account :accounts.getAccounts()) {
			long accountInt = Long.parseLong(account.getAccountNumber()
					.replaceAll("[^0-9]", ""));
			if (accountNumberInt == accountInt)
				return account;
		}
		return null;
	}
}
