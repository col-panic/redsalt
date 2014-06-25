/**
 */
package org.redsalt.core.datamodel.impl;

import java.time.LocalDate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.joda.money.CurrencyUnit;

import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.Booking;
import org.redsalt.core.datamodel.Category;
import org.redsalt.core.datamodel.DatamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getBookingDate <em>Booking Date</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getAvailabilityDate <em>Availability Date</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getAdditionalText <em>Additional Text</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getRemoteAccount <em>Remote Account</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getEntryReference <em>Entry Reference</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.BookingImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingDate() <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate BOOKING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingDate() <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate bookingDate = BOOKING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityDate() <em>Availability Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate AVAILABILITY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityDate() <em>Availability Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate availabilityDate = AVAILABILITY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Double AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Double amount = AMOUNT_EDEFAULT;

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
	 * The default value of the '{@link #getLineItem() <em>Line Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItem()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineItem() <em>Line Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItem()
	 * @generated
	 * @ordered
	 */
	protected String lineItem = LINE_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalText() <em>Additional Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalText()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalText() <em>Additional Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalText()
	 * @generated
	 * @ordered
	 */
	protected String additionalText = ADDITIONAL_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemoteAccount() <em>Remote Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAccount()
	 * @generated
	 * @ordered
	 */
	protected Account remoteAccount;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The default value of the '{@link #getEntryReference() <em>Entry Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryReference() <em>Entry Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReference()
	 * @generated
	 * @ordered
	 */
	protected String entryReference = ENTRY_REFERENCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingDate(LocalDate newBookingDate) {
		LocalDate oldBookingDate = bookingDate;
		bookingDate = newBookingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__BOOKING_DATE, oldBookingDate, bookingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getAvailabilityDate() {
		return availabilityDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityDate(LocalDate newAvailabilityDate) {
		LocalDate oldAvailabilityDate = availabilityDate;
		availabilityDate = newAvailabilityDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__AVAILABILITY_DATE, oldAvailabilityDate, availabilityDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Double newAmount) {
		Double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__CURRENCY, oldCurrency, currency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineItem() {
		return lineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineItem(String newLineItem) {
		String oldLineItem = lineItem;
		lineItem = newLineItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__LINE_ITEM, oldLineItem, lineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalText() {
		return additionalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalText(String newAdditionalText) {
		String oldAdditionalText = additionalText;
		additionalText = newAdditionalText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__ADDITIONAL_TEXT, oldAdditionalText, additionalText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (eContainerFeatureID() != DatamodelPackage.BOOKING__ACCOUNT) return null;
		return (Account)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetAccount() {
		if (eContainerFeatureID() != DatamodelPackage.BOOKING__ACCOUNT) return null;
		return (Account)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAccount, DatamodelPackage.BOOKING__ACCOUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		if (newAccount != eInternalContainer() || (eContainerFeatureID() != DatamodelPackage.BOOKING__ACCOUNT && newAccount != null)) {
			if (EcoreUtil.isAncestor(this, newAccount))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, DatamodelPackage.ACCOUNT__BOOKINGS, Account.class, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getRemoteAccount() {
		if (remoteAccount != null && remoteAccount.eIsProxy()) {
			InternalEObject oldRemoteAccount = (InternalEObject)remoteAccount;
			remoteAccount = (Account)eResolveProxy(oldRemoteAccount);
			if (remoteAccount != oldRemoteAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.BOOKING__REMOTE_ACCOUNT, oldRemoteAccount, remoteAccount));
			}
		}
		return remoteAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetRemoteAccount() {
		return remoteAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteAccount(Account newRemoteAccount) {
		Account oldRemoteAccount = remoteAccount;
		remoteAccount = newRemoteAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__REMOTE_ACCOUNT, oldRemoteAccount, remoteAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.BOOKING__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryReference() {
		return entryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryReference(String newEntryReference) {
		String oldEntryReference = entryReference;
		entryReference = newEntryReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__ENTRY_REFERENCE, oldEntryReference, entryReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.BOOKING__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.BOOKING__ACCOUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccount((Account)otherEnd, msgs);
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
			case DatamodelPackage.BOOKING__ACCOUNT:
				return basicSetAccount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatamodelPackage.BOOKING__ACCOUNT:
				return eInternalContainer().eInverseRemove(this, DatamodelPackage.ACCOUNT__BOOKINGS, Account.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.BOOKING__BOOKING_DATE:
				return getBookingDate();
			case DatamodelPackage.BOOKING__AVAILABILITY_DATE:
				return getAvailabilityDate();
			case DatamodelPackage.BOOKING__AMOUNT:
				return getAmount();
			case DatamodelPackage.BOOKING__CURRENCY:
				return getCurrency();
			case DatamodelPackage.BOOKING__DESCRIPTION:
				return getDescription();
			case DatamodelPackage.BOOKING__LINE_ITEM:
				return getLineItem();
			case DatamodelPackage.BOOKING__ADDITIONAL_TEXT:
				return getAdditionalText();
			case DatamodelPackage.BOOKING__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case DatamodelPackage.BOOKING__REMOTE_ACCOUNT:
				if (resolve) return getRemoteAccount();
				return basicGetRemoteAccount();
			case DatamodelPackage.BOOKING__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case DatamodelPackage.BOOKING__ENTRY_REFERENCE:
				return getEntryReference();
			case DatamodelPackage.BOOKING__REMARK:
				return getRemark();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatamodelPackage.BOOKING__BOOKING_DATE:
				setBookingDate((LocalDate)newValue);
				return;
			case DatamodelPackage.BOOKING__AVAILABILITY_DATE:
				setAvailabilityDate((LocalDate)newValue);
				return;
			case DatamodelPackage.BOOKING__AMOUNT:
				setAmount((Double)newValue);
				return;
			case DatamodelPackage.BOOKING__CURRENCY:
				setCurrency((CurrencyUnit)newValue);
				return;
			case DatamodelPackage.BOOKING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatamodelPackage.BOOKING__LINE_ITEM:
				setLineItem((String)newValue);
				return;
			case DatamodelPackage.BOOKING__ADDITIONAL_TEXT:
				setAdditionalText((String)newValue);
				return;
			case DatamodelPackage.BOOKING__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case DatamodelPackage.BOOKING__REMOTE_ACCOUNT:
				setRemoteAccount((Account)newValue);
				return;
			case DatamodelPackage.BOOKING__CATEGORY:
				setCategory((Category)newValue);
				return;
			case DatamodelPackage.BOOKING__ENTRY_REFERENCE:
				setEntryReference((String)newValue);
				return;
			case DatamodelPackage.BOOKING__REMARK:
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
			case DatamodelPackage.BOOKING__BOOKING_DATE:
				setBookingDate(BOOKING_DATE_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__AVAILABILITY_DATE:
				setAvailabilityDate(AVAILABILITY_DATE_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__LINE_ITEM:
				setLineItem(LINE_ITEM_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__ADDITIONAL_TEXT:
				setAdditionalText(ADDITIONAL_TEXT_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__ACCOUNT:
				setAccount((Account)null);
				return;
			case DatamodelPackage.BOOKING__REMOTE_ACCOUNT:
				setRemoteAccount((Account)null);
				return;
			case DatamodelPackage.BOOKING__CATEGORY:
				setCategory((Category)null);
				return;
			case DatamodelPackage.BOOKING__ENTRY_REFERENCE:
				setEntryReference(ENTRY_REFERENCE_EDEFAULT);
				return;
			case DatamodelPackage.BOOKING__REMARK:
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
			case DatamodelPackage.BOOKING__BOOKING_DATE:
				return BOOKING_DATE_EDEFAULT == null ? bookingDate != null : !BOOKING_DATE_EDEFAULT.equals(bookingDate);
			case DatamodelPackage.BOOKING__AVAILABILITY_DATE:
				return AVAILABILITY_DATE_EDEFAULT == null ? availabilityDate != null : !AVAILABILITY_DATE_EDEFAULT.equals(availabilityDate);
			case DatamodelPackage.BOOKING__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case DatamodelPackage.BOOKING__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case DatamodelPackage.BOOKING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatamodelPackage.BOOKING__LINE_ITEM:
				return LINE_ITEM_EDEFAULT == null ? lineItem != null : !LINE_ITEM_EDEFAULT.equals(lineItem);
			case DatamodelPackage.BOOKING__ADDITIONAL_TEXT:
				return ADDITIONAL_TEXT_EDEFAULT == null ? additionalText != null : !ADDITIONAL_TEXT_EDEFAULT.equals(additionalText);
			case DatamodelPackage.BOOKING__ACCOUNT:
				return basicGetAccount() != null;
			case DatamodelPackage.BOOKING__REMOTE_ACCOUNT:
				return remoteAccount != null;
			case DatamodelPackage.BOOKING__CATEGORY:
				return category != null;
			case DatamodelPackage.BOOKING__ENTRY_REFERENCE:
				return ENTRY_REFERENCE_EDEFAULT == null ? entryReference != null : !ENTRY_REFERENCE_EDEFAULT.equals(entryReference);
			case DatamodelPackage.BOOKING__REMARK:
				return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
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
		result.append(" (bookingDate: ");
		result.append(bookingDate);
		result.append(", availabilityDate: ");
		result.append(availabilityDate);
		result.append(", amount: ");
		result.append(amount);
		result.append(", currency: ");
		result.append(currency);
		result.append(", description: ");
		result.append(description);
		result.append(", lineItem: ");
		result.append(lineItem);
		result.append(", additionalText: ");
		result.append(additionalText);
		result.append(", entryReference: ");
		result.append(entryReference);
		result.append(", remark: ");
		result.append(remark);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
