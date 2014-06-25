/**
 */
package org.redsalt.core.appmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.redsalt.core.datamodel.Account;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.appmodel.Accounts#getAccounts <em>Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.appmodel.AppmodelPackage#getAccounts()
 * @model
 * @generated
 */
public interface Accounts extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.redsalt.core.datamodel.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.redsalt.core.appmodel.AppmodelPackage#getAccounts_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Find an account given its account number or iban, returns null if none found
	 * <!-- end-model-doc -->
	 * @model unique="false" accountNumberUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	Account findAccountByAccountNumberOrIban(String accountNumber);

} // Accounts
