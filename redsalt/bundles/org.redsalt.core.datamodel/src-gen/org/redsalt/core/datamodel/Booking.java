/**
 */
package org.redsalt.core.datamodel;

import java.time.LocalDate;

import org.eclipse.emf.ecore.EObject;

import org.joda.money.CurrencyUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Booking is a flow of money from a referenced contact
 * to or from an Account.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getBookingDate <em>Booking Date</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getAvailabilityDate <em>Availability Date</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getDescription <em>Description</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getAdditionalText <em>Additional Text</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getAccount <em>Account</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getRemoteAccount <em>Remote Account</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getCategory <em>Category</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getEntryReference <em>Entry Reference</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Booking#getRemark <em>Remark</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The date the booking is initiated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Booking Date</em>' attribute.
	 * @see #setBookingDate(LocalDate)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_BookingDate()
	 * @model unique="false" dataType="org.redsalt.core.datamodel.LocalDate"
	 * @generated
	 */
	LocalDate getBookingDate();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getBookingDate <em>Booking Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Date</em>' attribute.
	 * @see #getBookingDate()
	 * @generated
	 */
	void setBookingDate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Availability Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The date the amount is counted on the receiving account
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Date</em>' attribute.
	 * @see #setAvailabilityDate(LocalDate)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_AvailabilityDate()
	 * @model unique="false" dataType="org.redsalt.core.datamodel.LocalDate"
	 * @generated
	 */
	LocalDate getAvailabilityDate();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getAvailabilityDate <em>Availability Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Date</em>' attribute.
	 * @see #getAvailabilityDate()
	 * @generated
	 */
	void setAvailabilityDate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The amount transferred to or from the remote account
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(Double)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Amount()
	 * @model unique="false"
	 * @generated
	 */
	Double getAmount();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Double value);

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
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Currency()
	 * @model unique="false" dataType="org.redsalt.core.datamodel.CurrencyUnit"
	 * @generated
	 */
	CurrencyUnit getCurrency();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(CurrencyUnit value);

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
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Item</em>' attribute.
	 * @see #setLineItem(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_LineItem()
	 * @model unique="false"
	 * @generated
	 */
	String getLineItem();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getLineItem <em>Line Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Item</em>' attribute.
	 * @see #getLineItem()
	 * @generated
	 */
	void setLineItem(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text</em>' attribute.
	 * @see #setAdditionalText(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_AdditionalText()
	 * @model unique="false"
	 * @generated
	 */
	String getAdditionalText();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getAdditionalText <em>Additional Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text</em>' attribute.
	 * @see #getAdditionalText()
	 * @generated
	 */
	void setAdditionalText(String value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.redsalt.core.datamodel.Account#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' container reference.
	 * @see #setAccount(Account)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Account()
	 * @see org.redsalt.core.datamodel.Account#getBookings
	 * @model opposite="bookings" transient="false"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getAccount <em>Account</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' container reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Remote Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Account</em>' reference.
	 * @see #setRemoteAccount(Account)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_RemoteAccount()
	 * @model
	 * @generated
	 */
	Account getRemoteAccount();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getRemoteAccount <em>Remote Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Account</em>' reference.
	 * @see #getRemoteAccount()
	 * @generated
	 */
	void setRemoteAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Entry Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Reference</em>' attribute.
	 * @see #setEntryReference(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_EntryReference()
	 * @model
	 * @generated
	 */
	String getEntryReference();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getEntryReference <em>Entry Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Reference</em>' attribute.
	 * @see #getEntryReference()
	 * @generated
	 */
	void setEntryReference(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  user generated remarks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getBooking_Remark()
	 * @model unique="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Booking#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

} // Booking
