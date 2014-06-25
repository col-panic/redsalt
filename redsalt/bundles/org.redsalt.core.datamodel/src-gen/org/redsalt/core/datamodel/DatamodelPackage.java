/**
 */
package org.redsalt.core.datamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.redsalt.core.datamodel.DatamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel updateClasspath='false' publicConstructors='true' editDirectory='/org.redsalt.core.datamodel.edit/src' basePackage='org.redsalt.core'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface DatamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.redsalt.core.datamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatamodelPackage eINSTANCE = org.redsalt.core.datamodel.impl.DatamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.impl.ContactImpl
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Favourite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__FAVOURITE = 1;

	/**
	 * The feature id for the '<em><b>Contact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CONTACT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME2 = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Title Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TITLE_SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__DATE_OF_BIRTH = 7;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__STREET = 8;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CITY = 9;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ZIP = 10;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__REGION = 11;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__COUNTRY = 12;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TELEPHONE = 13;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__FAX = 14;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 15;

	/**
	 * The feature id for the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__WEB_PAGE = 16;

	/**
	 * The feature id for the '<em><b>Vat No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__VAT_NO = 17;

	/**
	 * The feature id for the '<em><b>Owned Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__OWNED_ACCOUNTS = 18;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__REMARK = 19;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.impl.AccountImpl
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Managing Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__MANAGING_CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Owning Contact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OWNING_CONTACT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CURRENCY = 5;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BOOKINGS = 6;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BALANCE = 7;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__IBAN = 8;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BIC = 9;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__REMARK = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LABEL = 11;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.impl.BookingImpl
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 2;

	/**
	 * The feature id for the '<em><b>Booking Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_DATE = 0;

	/**
	 * The feature id for the '<em><b>Availability Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__AVAILABILITY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Line Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__LINE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Additional Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ADDITIONAL_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Account</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ACCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Remote Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__REMOTE_ACCOUNT = 8;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CATEGORY = 9;

	/**
	 * The feature id for the '<em><b>Entry Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ENTRY_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__REMARK = 11;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.impl.CategoryImpl
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.impl.InvoiceImpl
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__RECIPIENT = 2;

	/**
	 * The feature id for the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__REFERENCE_ID = 3;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.ContactType <em>Contact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.ContactType
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.redsalt.core.datamodel.AccountType <em>Account Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.redsalt.core.datamodel.AccountType
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 6;

	/**
	 * The meta object id for the '<em>Currency Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.joda.money.CurrencyUnit
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getCurrencyUnit()
	 * @generated
	 */
	int CURRENCY_UNIT = 7;

	/**
	 * The meta object id for the '<em>Local Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDate
	 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getLocalDate()
	 * @generated
	 */
	int LOCAL_DATE = 8;


	/**
	 * Returns the meta object for class '{@link org.redsalt.core.datamodel.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.redsalt.core.datamodel.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#isOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.redsalt.core.datamodel.Contact#isOrganization()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#isFavourite <em>Favourite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Favourite</em>'.
	 * @see org.redsalt.core.datamodel.Contact#isFavourite()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Favourite();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Type</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getContactType()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_ContactType();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getName2 <em>Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name2</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getName2()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name2();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getTitle()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getTitleSuffix <em>Title Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Suffix</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getTitleSuffix()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_TitleSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getDateOfBirth()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getStreet()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getCity()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_City();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getZip()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Zip();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getRegion()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getCountry()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getTelephone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getFax()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Fax();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getWebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Page</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getWebPage()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_WebPage();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getVatNo <em>Vat No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vat No</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getVatNo()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_VatNo();

	/**
	 * Returns the meta object for the reference list '{@link org.redsalt.core.datamodel.Contact#getOwnedAccounts <em>Owned Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Accounts</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getOwnedAccounts()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_OwnedAccounts();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Contact#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see org.redsalt.core.datamodel.Contact#getRemark()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Remark();

	/**
	 * Returns the meta object for class '{@link org.redsalt.core.datamodel.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.redsalt.core.datamodel.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getAccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Type</em>'.
	 * @see org.redsalt.core.datamodel.Account#getAccountType()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_AccountType();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Account#getManagingContact <em>Managing Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Managing Contact</em>'.
	 * @see org.redsalt.core.datamodel.Account#getManagingContact()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_ManagingContact();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Account#getOwningContact <em>Owning Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Contact</em>'.
	 * @see org.redsalt.core.datamodel.Account#getOwningContact()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_OwningContact();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.redsalt.core.datamodel.Account#getDescription()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.redsalt.core.datamodel.Account#getAccountNumber()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.redsalt.core.datamodel.Account#getCurrency()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Currency();

	/**
	 * Returns the meta object for the containment reference list '{@link org.redsalt.core.datamodel.Account#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see org.redsalt.core.datamodel.Account#getBookings()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Bookings();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see org.redsalt.core.datamodel.Account#getBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Balance();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see org.redsalt.core.datamodel.Account#getIban()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Iban();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see org.redsalt.core.datamodel.Account#getBic()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Bic();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see org.redsalt.core.datamodel.Account#getRemark()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Remark();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Account#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.redsalt.core.datamodel.Account#getLabel()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Label();

	/**
	 * Returns the meta object for class '{@link org.redsalt.core.datamodel.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see org.redsalt.core.datamodel.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getBookingDate <em>Booking Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Date</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getBookingDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingDate();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getAvailabilityDate <em>Availability Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Date</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getAvailabilityDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_AvailabilityDate();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getAmount()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getCurrency()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getDescription()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getLineItem <em>Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Item</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getLineItem()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_LineItem();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getAdditionalText <em>Additional Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Text</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getAdditionalText()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_AdditionalText();

	/**
	 * Returns the meta object for the container reference '{@link org.redsalt.core.datamodel.Booking#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Account</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getAccount()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Account();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Booking#getRemoteAccount <em>Remote Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Account</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getRemoteAccount()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RemoteAccount();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Booking#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getCategory()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getEntryReference <em>Entry Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Reference</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getEntryReference()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EntryReference();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Booking#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see org.redsalt.core.datamodel.Booking#getRemark()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Remark();

	/**
	 * Returns the meta object for class '{@link org.redsalt.core.datamodel.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.redsalt.core.datamodel.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Category#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see org.redsalt.core.datamodel.Category#getCategoryName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryName();

	/**
	 * Returns the meta object for class '{@link org.redsalt.core.datamodel.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see org.redsalt.core.datamodel.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Invoice#isOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outgoing</em>'.
	 * @see org.redsalt.core.datamodel.Invoice#isOutgoing()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Invoice#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.redsalt.core.datamodel.Invoice#getSender()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.redsalt.core.datamodel.Invoice#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recipient</em>'.
	 * @see org.redsalt.core.datamodel.Invoice#getRecipient()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Recipient();

	/**
	 * Returns the meta object for the attribute '{@link org.redsalt.core.datamodel.Invoice#getReferenceId <em>Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Id</em>'.
	 * @see org.redsalt.core.datamodel.Invoice#getReferenceId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_ReferenceId();

	/**
	 * Returns the meta object for enum '{@link org.redsalt.core.datamodel.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Type</em>'.
	 * @see org.redsalt.core.datamodel.ContactType
	 * @generated
	 */
	EEnum getContactType();

	/**
	 * Returns the meta object for enum '{@link org.redsalt.core.datamodel.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Type</em>'.
	 * @see org.redsalt.core.datamodel.AccountType
	 * @generated
	 */
	EEnum getAccountType();

	/**
	 * Returns the meta object for data type '{@link org.joda.money.CurrencyUnit <em>Currency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Unit</em>'.
	 * @see org.joda.money.CurrencyUnit
	 * @model instanceClass="org.joda.money.CurrencyUnit"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='return <%org.joda.money.CurrencyUnit%>.of(it);'"
	 * @generated
	 */
	EDataType getCurrencyUnit();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Date</em>'.
	 * @see java.time.LocalDate
	 * @model instanceClass="java.time.LocalDate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='return <%java.time.LocalDate%>.parse(it);'"
	 * @generated
	 */
	EDataType getLocalDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatamodelFactory getDatamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.impl.ContactImpl
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ORGANIZATION = eINSTANCE.getContact_Organization();

		/**
		 * The meta object literal for the '<em><b>Favourite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__FAVOURITE = eINSTANCE.getContact_Favourite();

		/**
		 * The meta object literal for the '<em><b>Contact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CONTACT_TYPE = eINSTANCE.getContact_ContactType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME = eINSTANCE.getContact_Name();

		/**
		 * The meta object literal for the '<em><b>Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME2 = eINSTANCE.getContact_Name2();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TITLE = eINSTANCE.getContact_Title();

		/**
		 * The meta object literal for the '<em><b>Title Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TITLE_SUFFIX = eINSTANCE.getContact_TitleSuffix();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__DATE_OF_BIRTH = eINSTANCE.getContact_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__STREET = eINSTANCE.getContact_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CITY = eINSTANCE.getContact_City();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ZIP = eINSTANCE.getContact_Zip();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__REGION = eINSTANCE.getContact_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__COUNTRY = eINSTANCE.getContact_Country();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TELEPHONE = eINSTANCE.getContact_Telephone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__FAX = eINSTANCE.getContact_Fax();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Web Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__WEB_PAGE = eINSTANCE.getContact_WebPage();

		/**
		 * The meta object literal for the '<em><b>Vat No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__VAT_NO = eINSTANCE.getContact_VatNo();

		/**
		 * The meta object literal for the '<em><b>Owned Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__OWNED_ACCOUNTS = eINSTANCE.getContact_OwnedAccounts();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__REMARK = eINSTANCE.getContact_Remark();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.impl.AccountImpl
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ACCOUNT_TYPE = eINSTANCE.getAccount_AccountType();

		/**
		 * The meta object literal for the '<em><b>Managing Contact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__MANAGING_CONTACT = eINSTANCE.getAccount_ManagingContact();

		/**
		 * The meta object literal for the '<em><b>Owning Contact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__OWNING_CONTACT = eINSTANCE.getAccount_OwningContact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__DESCRIPTION = eINSTANCE.getAccount_Description();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ACCOUNT_NUMBER = eINSTANCE.getAccount_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__CURRENCY = eINSTANCE.getAccount_Currency();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__BOOKINGS = eINSTANCE.getAccount_Bookings();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__BALANCE = eINSTANCE.getAccount_Balance();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__IBAN = eINSTANCE.getAccount_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__BIC = eINSTANCE.getAccount_Bic();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__REMARK = eINSTANCE.getAccount_Remark();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__LABEL = eINSTANCE.getAccount_Label();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.impl.BookingImpl
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_DATE = eINSTANCE.getBooking_BookingDate();

		/**
		 * The meta object literal for the '<em><b>Availability Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__AVAILABILITY_DATE = eINSTANCE.getBooking_AvailabilityDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__AMOUNT = eINSTANCE.getBooking_Amount();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CURRENCY = eINSTANCE.getBooking_Currency();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DESCRIPTION = eINSTANCE.getBooking_Description();

		/**
		 * The meta object literal for the '<em><b>Line Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__LINE_ITEM = eINSTANCE.getBooking_LineItem();

		/**
		 * The meta object literal for the '<em><b>Additional Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ADDITIONAL_TEXT = eINSTANCE.getBooking_AdditionalText();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ACCOUNT = eINSTANCE.getBooking_Account();

		/**
		 * The meta object literal for the '<em><b>Remote Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__REMOTE_ACCOUNT = eINSTANCE.getBooking_RemoteAccount();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CATEGORY = eINSTANCE.getBooking_Category();

		/**
		 * The meta object literal for the '<em><b>Entry Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ENTRY_REFERENCE = eINSTANCE.getBooking_EntryReference();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__REMARK = eINSTANCE.getBooking_Remark();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.impl.CategoryImpl
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_NAME = eINSTANCE.getCategory_CategoryName();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.impl.InvoiceImpl
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__OUTGOING = eINSTANCE.getInvoice_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__SENDER = eINSTANCE.getInvoice_Sender();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__RECIPIENT = eINSTANCE.getInvoice_Recipient();

		/**
		 * The meta object literal for the '<em><b>Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__REFERENCE_ID = eINSTANCE.getInvoice_ReferenceId();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.ContactType <em>Contact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.ContactType
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getContactType()
		 * @generated
		 */
		EEnum CONTACT_TYPE = eINSTANCE.getContactType();

		/**
		 * The meta object literal for the '{@link org.redsalt.core.datamodel.AccountType <em>Account Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.redsalt.core.datamodel.AccountType
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getAccountType()
		 * @generated
		 */
		EEnum ACCOUNT_TYPE = eINSTANCE.getAccountType();

		/**
		 * The meta object literal for the '<em>Currency Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.joda.money.CurrencyUnit
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getCurrencyUnit()
		 * @generated
		 */
		EDataType CURRENCY_UNIT = eINSTANCE.getCurrencyUnit();

		/**
		 * The meta object literal for the '<em>Local Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see org.redsalt.core.datamodel.impl.DatamodelPackageImpl#getLocalDate()
		 * @generated
		 */
		EDataType LOCAL_DATE = eINSTANCE.getLocalDate();

	}

} //DatamodelPackage
