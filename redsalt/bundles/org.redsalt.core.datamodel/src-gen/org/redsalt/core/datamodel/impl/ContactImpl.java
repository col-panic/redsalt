/**
 */
package org.redsalt.core.datamodel.impl;

import java.time.LocalDate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.ContactType;
import org.redsalt.core.datamodel.DatamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#isOrganization <em>Organization</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#isFavourite <em>Favourite</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getTitleSuffix <em>Title Suffix</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getVatNo <em>Vat No</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getOwnedAccounts <em>Owned Accounts</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.ContactImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The default value of the '{@link #isOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORGANIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrganization()
	 * @generated
	 * @ordered
	 */
	protected boolean organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFavourite() <em>Favourite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFavourite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAVOURITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFavourite() <em>Favourite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFavourite()
	 * @generated
	 * @ordered
	 */
	protected boolean favourite = FAVOURITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected static final ContactType CONTACT_TYPE_EDEFAULT = ContactType.GENERIC;

	/**
	 * The cached value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected ContactType contactType = CONTACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName2() <em>Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName2()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName2() <em>Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName2()
	 * @generated
	 * @ordered
	 */
	protected String name2 = NAME2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleSuffix() <em>Title Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleSuffix() <em>Title Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSuffix()
	 * @generated
	 * @ordered
	 */
	protected String titleSuffix = TITLE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected LocalDate dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected String webPage = WEB_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVatNo() <em>Vat No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatNo()
	 * @generated
	 * @ordered
	 */
	protected static final String VAT_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVatNo() <em>Vat No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatNo()
	 * @generated
	 * @ordered
	 */
	protected String vatNo = VAT_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAccounts() <em>Owned Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> ownedAccounts;

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
	public ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(boolean newOrganization) {
		boolean oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFavourite() {
		return favourite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFavourite(boolean newFavourite) {
		boolean oldFavourite = favourite;
		favourite = newFavourite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__FAVOURITE, oldFavourite, favourite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType getContactType() {
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactType(ContactType newContactType) {
		ContactType oldContactType = contactType;
		contactType = newContactType == null ? CONTACT_TYPE_EDEFAULT : newContactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__CONTACT_TYPE, oldContactType, contactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName2(String newName2) {
		String oldName2 = name2;
		name2 = newName2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__NAME2, oldName2, name2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleSuffix() {
		return titleSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleSuffix(String newTitleSuffix) {
		String oldTitleSuffix = titleSuffix;
		titleSuffix = newTitleSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__TITLE_SUFFIX, oldTitleSuffix, titleSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(LocalDate newDateOfBirth) {
		LocalDate oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebPage() {
		return webPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebPage(String newWebPage) {
		String oldWebPage = webPage;
		webPage = newWebPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__WEB_PAGE, oldWebPage, webPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVatNo() {
		return vatNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVatNo(String newVatNo) {
		String oldVatNo = vatNo;
		vatNo = newVatNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__VAT_NO, oldVatNo, vatNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getOwnedAccounts() {
		if (ownedAccounts == null) {
			ownedAccounts = new EObjectResolvingEList<Account>(Account.class, this, DatamodelPackage.CONTACT__OWNED_ACCOUNTS);
		}
		return ownedAccounts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.CONTACT__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.CONTACT__ORGANIZATION:
				return isOrganization();
			case DatamodelPackage.CONTACT__FAVOURITE:
				return isFavourite();
			case DatamodelPackage.CONTACT__CONTACT_TYPE:
				return getContactType();
			case DatamodelPackage.CONTACT__NAME:
				return getName();
			case DatamodelPackage.CONTACT__NAME2:
				return getName2();
			case DatamodelPackage.CONTACT__TITLE:
				return getTitle();
			case DatamodelPackage.CONTACT__TITLE_SUFFIX:
				return getTitleSuffix();
			case DatamodelPackage.CONTACT__DATE_OF_BIRTH:
				return getDateOfBirth();
			case DatamodelPackage.CONTACT__STREET:
				return getStreet();
			case DatamodelPackage.CONTACT__CITY:
				return getCity();
			case DatamodelPackage.CONTACT__ZIP:
				return getZip();
			case DatamodelPackage.CONTACT__REGION:
				return getRegion();
			case DatamodelPackage.CONTACT__COUNTRY:
				return getCountry();
			case DatamodelPackage.CONTACT__TELEPHONE:
				return getTelephone();
			case DatamodelPackage.CONTACT__FAX:
				return getFax();
			case DatamodelPackage.CONTACT__EMAIL:
				return getEmail();
			case DatamodelPackage.CONTACT__WEB_PAGE:
				return getWebPage();
			case DatamodelPackage.CONTACT__VAT_NO:
				return getVatNo();
			case DatamodelPackage.CONTACT__OWNED_ACCOUNTS:
				return getOwnedAccounts();
			case DatamodelPackage.CONTACT__REMARK:
				return getRemark();
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
			case DatamodelPackage.CONTACT__ORGANIZATION:
				setOrganization((Boolean)newValue);
				return;
			case DatamodelPackage.CONTACT__FAVOURITE:
				setFavourite((Boolean)newValue);
				return;
			case DatamodelPackage.CONTACT__CONTACT_TYPE:
				setContactType((ContactType)newValue);
				return;
			case DatamodelPackage.CONTACT__NAME:
				setName((String)newValue);
				return;
			case DatamodelPackage.CONTACT__NAME2:
				setName2((String)newValue);
				return;
			case DatamodelPackage.CONTACT__TITLE:
				setTitle((String)newValue);
				return;
			case DatamodelPackage.CONTACT__TITLE_SUFFIX:
				setTitleSuffix((String)newValue);
				return;
			case DatamodelPackage.CONTACT__DATE_OF_BIRTH:
				setDateOfBirth((LocalDate)newValue);
				return;
			case DatamodelPackage.CONTACT__STREET:
				setStreet((String)newValue);
				return;
			case DatamodelPackage.CONTACT__CITY:
				setCity((String)newValue);
				return;
			case DatamodelPackage.CONTACT__ZIP:
				setZip((String)newValue);
				return;
			case DatamodelPackage.CONTACT__REGION:
				setRegion((String)newValue);
				return;
			case DatamodelPackage.CONTACT__COUNTRY:
				setCountry((String)newValue);
				return;
			case DatamodelPackage.CONTACT__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case DatamodelPackage.CONTACT__FAX:
				setFax((String)newValue);
				return;
			case DatamodelPackage.CONTACT__EMAIL:
				setEmail((String)newValue);
				return;
			case DatamodelPackage.CONTACT__WEB_PAGE:
				setWebPage((String)newValue);
				return;
			case DatamodelPackage.CONTACT__VAT_NO:
				setVatNo((String)newValue);
				return;
			case DatamodelPackage.CONTACT__OWNED_ACCOUNTS:
				getOwnedAccounts().clear();
				getOwnedAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case DatamodelPackage.CONTACT__REMARK:
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
			case DatamodelPackage.CONTACT__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__FAVOURITE:
				setFavourite(FAVOURITE_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__CONTACT_TYPE:
				setContactType(CONTACT_TYPE_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__NAME2:
				setName2(NAME2_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__TITLE_SUFFIX:
				setTitleSuffix(TITLE_SUFFIX_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__WEB_PAGE:
				setWebPage(WEB_PAGE_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__VAT_NO:
				setVatNo(VAT_NO_EDEFAULT);
				return;
			case DatamodelPackage.CONTACT__OWNED_ACCOUNTS:
				getOwnedAccounts().clear();
				return;
			case DatamodelPackage.CONTACT__REMARK:
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
			case DatamodelPackage.CONTACT__ORGANIZATION:
				return organization != ORGANIZATION_EDEFAULT;
			case DatamodelPackage.CONTACT__FAVOURITE:
				return favourite != FAVOURITE_EDEFAULT;
			case DatamodelPackage.CONTACT__CONTACT_TYPE:
				return contactType != CONTACT_TYPE_EDEFAULT;
			case DatamodelPackage.CONTACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatamodelPackage.CONTACT__NAME2:
				return NAME2_EDEFAULT == null ? name2 != null : !NAME2_EDEFAULT.equals(name2);
			case DatamodelPackage.CONTACT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatamodelPackage.CONTACT__TITLE_SUFFIX:
				return TITLE_SUFFIX_EDEFAULT == null ? titleSuffix != null : !TITLE_SUFFIX_EDEFAULT.equals(titleSuffix);
			case DatamodelPackage.CONTACT__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case DatamodelPackage.CONTACT__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case DatamodelPackage.CONTACT__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case DatamodelPackage.CONTACT__ZIP:
				return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
			case DatamodelPackage.CONTACT__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DatamodelPackage.CONTACT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case DatamodelPackage.CONTACT__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case DatamodelPackage.CONTACT__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case DatamodelPackage.CONTACT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DatamodelPackage.CONTACT__WEB_PAGE:
				return WEB_PAGE_EDEFAULT == null ? webPage != null : !WEB_PAGE_EDEFAULT.equals(webPage);
			case DatamodelPackage.CONTACT__VAT_NO:
				return VAT_NO_EDEFAULT == null ? vatNo != null : !VAT_NO_EDEFAULT.equals(vatNo);
			case DatamodelPackage.CONTACT__OWNED_ACCOUNTS:
				return ownedAccounts != null && !ownedAccounts.isEmpty();
			case DatamodelPackage.CONTACT__REMARK:
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
		result.append(" (organization: ");
		result.append(organization);
		result.append(", favourite: ");
		result.append(favourite);
		result.append(", contactType: ");
		result.append(contactType);
		result.append(", name: ");
		result.append(name);
		result.append(", name2: ");
		result.append(name2);
		result.append(", title: ");
		result.append(title);
		result.append(", titleSuffix: ");
		result.append(titleSuffix);
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", street: ");
		result.append(street);
		result.append(", city: ");
		result.append(city);
		result.append(", zip: ");
		result.append(zip);
		result.append(", region: ");
		result.append(region);
		result.append(", country: ");
		result.append(country);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", webPage: ");
		result.append(webPage);
		result.append(", vatNo: ");
		result.append(vatNo);
		result.append(", remark: ");
		result.append(remark);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
