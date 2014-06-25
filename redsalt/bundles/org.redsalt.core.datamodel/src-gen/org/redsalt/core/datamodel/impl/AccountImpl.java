/**
 */
package org.redsalt.core.datamodel.impl;

import com.google.common.base.Objects;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import org.joda.money.CurrencyUnit;

import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.AccountType;
import org.redsalt.core.datamodel.Booking;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.DatamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getManagingContact <em>Managing Contact</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getOwningContact <em>Owning Contact</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.AccountImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected static final AccountType ACCOUNT_TYPE_EDEFAULT = AccountType.CASH;

	/**
	 * The cached value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected AccountType accountType = ACCOUNT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManagingContact() <em>Managing Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingContact()
	 * @generated
	 * @ordered
	 */
	protected Contact managingContact;

	/**
	 * The cached value of the '{@link #getOwningContact() <em>Owning Contact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningContact()
	 * @generated
	 * @ordered
	 */
	protected Contact owningContact;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CurrencyUnit CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected CurrencyUnit currency = CURRENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final Double BALANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected String iban = IBAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected String bic = BIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountType(AccountType newAccountType) {
		AccountType oldAccountType = accountType;
		accountType = newAccountType == null ? ACCOUNT_TYPE_EDEFAULT : newAccountType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__ACCOUNT_TYPE, oldAccountType, accountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getManagingContact() {
		if (managingContact != null && managingContact.eIsProxy()) {
			InternalEObject oldManagingContact = (InternalEObject)managingContact;
			managingContact = (Contact)eResolveProxy(oldManagingContact);
			if (managingContact != oldManagingContact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.ACCOUNT__MANAGING_CONTACT, oldManagingContact, managingContact));
			}
		}
		return managingContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact basicGetManagingContact() {
		return managingContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingContact(Contact newManagingContact) {
		Contact oldManagingContact = managingContact;
		managingContact = newManagingContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__MANAGING_CONTACT, oldManagingContact, managingContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getOwningContact() {
		if (owningContact != null && owningContact.eIsProxy()) {
			InternalEObject oldOwningContact = (InternalEObject)owningContact;
			owningContact = (Contact)eResolveProxy(oldOwningContact);
			if (owningContact != oldOwningContact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.ACCOUNT__OWNING_CONTACT, oldOwningContact, owningContact));
			}
		}
		return owningContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact basicGetOwningContact() {
		return owningContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningContact(Contact newOwningContact) {
		Contact oldOwningContact = owningContact;
		owningContact = newOwningContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__OWNING_CONTACT, oldOwningContact, owningContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountNumber(String newAccountNumber) {
		String oldAccountNumber = accountNumber;
		accountNumber = newAccountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__ACCOUNT_NUMBER, oldAccountNumber, accountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyUnit getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(CurrencyUnit newCurrency) {
		CurrencyUnit oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentWithInverseEList<Booking>(Booking.class, this, DatamodelPackage.ACCOUNT__BOOKINGS, DatamodelPackage.BOOKING__ACCOUNT);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBalance() {
		EList<Booking> _bookings = this.getBookings();
		final Function1<Booking, Double> _function = new Function1<Booking, Double>() {
			public Double apply(final Booking b1) {
				return b1.getAmount();
			}
		};
		EList<Double> _map = XcoreEListExtensions.<Booking, Double>map(_bookings, _function);
		final Function2<Double, Double, Double> _function_1 = new Function2<Double, Double, Double>() {
			public Double apply(final Double p1, final Double p2) {
				return Double.valueOf(DoubleExtensions.operator_plus(p1, p2));
			}
		};
		final Double value = IterableExtensions.<Double>reduce(_map, _function_1);
		Double _xifexpression = null;
		boolean _notEquals = (!Objects.equal(value, null));
		if (_notEquals) {
			_xifexpression = value;
		}
		else {
			_xifexpression = Double.valueOf(0d);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIban(String newIban) {
		String oldIban = iban;
		iban = newIban;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__IBAN, oldIban, iban));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBic(String newBic) {
		String oldBic = bic;
		bic = newBic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(String newRemark) {
		String oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.ACCOUNT__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		Double _balance = this.getBalance();
		String _plus = ("(" + _balance);
		String _plus_1 = (_plus + ") ");
		String _description = this.getDescription();
		return (_plus_1 + _description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBookings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__ACCOUNT_TYPE:
				return getAccountType();
			case DatamodelPackage.ACCOUNT__MANAGING_CONTACT:
				if (resolve) return getManagingContact();
				return basicGetManagingContact();
			case DatamodelPackage.ACCOUNT__OWNING_CONTACT:
				if (resolve) return getOwningContact();
				return basicGetOwningContact();
			case DatamodelPackage.ACCOUNT__DESCRIPTION:
				return getDescription();
			case DatamodelPackage.ACCOUNT__ACCOUNT_NUMBER:
				return getAccountNumber();
			case DatamodelPackage.ACCOUNT__CURRENCY:
				return getCurrency();
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				return getBookings();
			case DatamodelPackage.ACCOUNT__BALANCE:
				return getBalance();
			case DatamodelPackage.ACCOUNT__IBAN:
				return getIban();
			case DatamodelPackage.ACCOUNT__BIC:
				return getBic();
			case DatamodelPackage.ACCOUNT__REMARK:
				return getRemark();
			case DatamodelPackage.ACCOUNT__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__ACCOUNT_TYPE:
				setAccountType((AccountType)newValue);
				return;
			case DatamodelPackage.ACCOUNT__MANAGING_CONTACT:
				setManagingContact((Contact)newValue);
				return;
			case DatamodelPackage.ACCOUNT__OWNING_CONTACT:
				setOwningContact((Contact)newValue);
				return;
			case DatamodelPackage.ACCOUNT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatamodelPackage.ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
				return;
			case DatamodelPackage.ACCOUNT__CURRENCY:
				setCurrency((CurrencyUnit)newValue);
				return;
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case DatamodelPackage.ACCOUNT__IBAN:
				setIban((String)newValue);
				return;
			case DatamodelPackage.ACCOUNT__BIC:
				setBic((String)newValue);
				return;
			case DatamodelPackage.ACCOUNT__REMARK:
				setRemark((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__ACCOUNT_TYPE:
				setAccountType(ACCOUNT_TYPE_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__MANAGING_CONTACT:
				setManagingContact((Contact)null);
				return;
			case DatamodelPackage.ACCOUNT__OWNING_CONTACT:
				setOwningContact((Contact)null);
				return;
			case DatamodelPackage.ACCOUNT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber(ACCOUNT_NUMBER_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				getBookings().clear();
				return;
			case DatamodelPackage.ACCOUNT__IBAN:
				setIban(IBAN_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__BIC:
				setBic(BIC_EDEFAULT);
				return;
			case DatamodelPackage.ACCOUNT__REMARK:
				setRemark(REMARK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatamodelPackage.ACCOUNT__ACCOUNT_TYPE:
				return accountType != ACCOUNT_TYPE_EDEFAULT;
			case DatamodelPackage.ACCOUNT__MANAGING_CONTACT:
				return managingContact != null;
			case DatamodelPackage.ACCOUNT__OWNING_CONTACT:
				return owningContact != null;
			case DatamodelPackage.ACCOUNT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatamodelPackage.ACCOUNT__ACCOUNT_NUMBER:
				return ACCOUNT_NUMBER_EDEFAULT == null ? accountNumber != null : !ACCOUNT_NUMBER_EDEFAULT.equals(accountNumber);
			case DatamodelPackage.ACCOUNT__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case DatamodelPackage.ACCOUNT__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case DatamodelPackage.ACCOUNT__BALANCE:
				return BALANCE_EDEFAULT == null ? getBalance() != null : !BALANCE_EDEFAULT.equals(getBalance());
			case DatamodelPackage.ACCOUNT__IBAN:
				return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
			case DatamodelPackage.ACCOUNT__BIC:
				return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
			case DatamodelPackage.ACCOUNT__REMARK:
				return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
			case DatamodelPackage.ACCOUNT__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accountType: ");
		result.append(accountType);
		result.append(", description: ");
		result.append(description);
		result.append(", accountNumber: ");
		result.append(accountNumber);
		result.append(", currency: ");
		result.append(currency);
		result.append(", iban: ");
		result.append(iban);
		result.append(", bic: ");
		result.append(bic);
		result.append(", remark: ");
		result.append(remark);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
