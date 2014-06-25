/**
 */
package org.redsalt.core.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.joda.money.CurrencyUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An account is a logical container for money. It allows to
 * book amounts of money from and to it. The account is associated
 * with a contact that is responsible for managing this account and
 * a contact owning it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.Account#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getManagingContact <em>Managing Contact</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getOwningContact <em>Owning Contact</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getDescription <em>Description</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getBookings <em>Bookings</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getIban <em>Iban</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getBic <em>Bic</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Account#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel labelFeature='label'"
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.redsalt.core.datamodel.AccountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Type</em>' attribute.
	 * @see org.redsalt.core.datamodel.AccountType
	 * @see #setAccountType(AccountType)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_AccountType()
	 * @model unique="false"
	 * @generated
	 */
	AccountType getAccountType();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getAccountType <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Type</em>' attribute.
	 * @see org.redsalt.core.datamodel.AccountType
	 * @see #getAccountType()
	 * @generated
	 */
	void setAccountType(AccountType value);

	/**
	 * Returns the value of the '<em><b>Managing Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The contact responsible for managing the account,
	 * e.g. the bank institute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Contact</em>' reference.
	 * @see #setManagingContact(Contact)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_ManagingContact()
	 * @model
	 * @generated
	 */
	Contact getManagingContact();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getManagingContact <em>Managing Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Contact</em>' reference.
	 * @see #getManagingContact()
	 * @generated
	 */
	void setManagingContact(Contact value);

	/**
	 * Returns the value of the '<em><b>Owning Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The contact owning the account, that is the
	 * contact the money on the account belongs to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Contact</em>' reference.
	 * @see #setOwningContact(Contact)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_OwningContact()
	 * @model
	 * @generated
	 */
	Contact getOwningContact();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getOwningContact <em>Owning Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Contact</em>' reference.
	 * @see #getOwningContact()
	 * @generated
	 */
	void setOwningContact(Contact value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_AccountNumber()
	 * @model
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(CurrencyUnit)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Currency()
	 * @model unique="false" dataType="org.redsalt.core.datamodel.CurrencyUnit"
	 * @generated
	 */
	CurrencyUnit getCurrency();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(CurrencyUnit value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link org.redsalt.core.datamodel.Booking}.
	 * It is bidirectional and its opposite is '{@link org.redsalt.core.datamodel.Booking#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Bookings()
	 * @see org.redsalt.core.datamodel.Booking#getAccount
	 * @model opposite="account" containment="true"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  the current balance on the account, calculated out of all bookings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Balance()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%org.redsalt.core.datamodel.Booking%>> _bookings = this.getBookings();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.redsalt.core.datamodel.Booking%>, <%java.lang.Double%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.redsalt.core.datamodel.Booking%>, <%java.lang.Double%>>()\n{\n\tpublic <%java.lang.Double%> apply(final <%org.redsalt.core.datamodel.Booking%> b1)\n\t{\n\t\treturn b1.getAmount();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%java.lang.Double%>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%org.redsalt.core.datamodel.Booking%>, <%java.lang.Double%>>map(_bookings, _function);\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Double%>, <%java.lang.Double%>, <%java.lang.Double%>>()\n{\n\tpublic <%java.lang.Double%> apply(final <%java.lang.Double%> p1, final <%java.lang.Double%> p2)\n\t{\n\t\treturn <%java.lang.Double%>.valueOf(<%org.eclipse.xtext.xbase.lib.DoubleExtensions%>.operator_plus(p1, p2));\n\t}\n};\nfinal <%java.lang.Double%> value = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Double%>>reduce(_map, _function_1);\n<%java.lang.Double%> _xifexpression = null;\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(value, null));\nif (_notEquals)\n{\n\t_xifexpression = value;\n}\nelse\n{\n\t_xifexpression = <%java.lang.Double%>.valueOf(0d);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	Double getBalance();

	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iban</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #setIban(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Iban()
	 * @model unique="false"
	 * @generated
	 */
	String getIban();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iban</em>' attribute.
	 * @see #getIban()
	 * @generated
	 */
	void setIban(String value);

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #setBic(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Bic()
	 * @model unique="false"
	 * @generated
	 */
	String getBic();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  user generated remarks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Remark()
	 * @model unique="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Account#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccount_Label()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Double%> _balance = this.getBalance();\n<%java.lang.String%> _plus = (\"(\" + _balance);\n<%java.lang.String%> _plus_1 = (_plus + \") \");\n<%java.lang.String%> _description = this.getDescription();\nreturn (_plus_1 + _description);'"
	 * @generated
	 */
	String getLabel();

} // Account
