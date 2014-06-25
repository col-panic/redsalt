/**
 */
package org.redsalt.core.datamodel;

import java.time.LocalDate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contact is a entity we can communicate with, being
 * either a person or an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.Contact#isOrganization <em>Organization</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#isFavourite <em>Favourite</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getName <em>Name</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getName2 <em>Name2</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getTitle <em>Title</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getTitleSuffix <em>Title Suffix</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getStreet <em>Street</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getCity <em>City</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getZip <em>Zip</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getRegion <em>Region</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getCountry <em>Country</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getFax <em>Fax</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getVatNo <em>Vat No</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getOwnedAccounts <em>Owned Accounts</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Contact#getRemark <em>Remark</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(boolean)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Organization()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOrganization();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#isOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #isOrganization()
	 * @generated
	 */
	void setOrganization(boolean value);

	/**
	 * Returns the value of the '<em><b>Favourite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favourite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Favourite</em>' attribute.
	 * @see #setFavourite(boolean)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Favourite()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFavourite();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#isFavourite <em>Favourite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Favourite</em>' attribute.
	 * @see #isFavourite()
	 * @generated
	 */
	void setFavourite(boolean value);

	/**
	 * Returns the value of the '<em><b>Contact Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.redsalt.core.datamodel.ContactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Type</em>' attribute.
	 * @see org.redsalt.core.datamodel.ContactType
	 * @see #setContactType(ContactType)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_ContactType()
	 * @model unique="false"
	 * @generated
	 */
	ContactType getContactType();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getContactType <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Type</em>' attribute.
	 * @see org.redsalt.core.datamodel.ContactType
	 * @see #getContactType()
	 * @generated
	 */
	void setContactType(ContactType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name2</em>' attribute.
	 * @see #setName2(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Name2()
	 * @model unique="false"
	 * @generated
	 */
	String getName2();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getName2 <em>Name2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name2</em>' attribute.
	 * @see #getName2()
	 * @generated
	 */
	void setName2(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Title Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Suffix</em>' attribute.
	 * @see #setTitleSuffix(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_TitleSuffix()
	 * @model unique="false"
	 * @generated
	 */
	String getTitleSuffix();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getTitleSuffix <em>Title Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Suffix</em>' attribute.
	 * @see #getTitleSuffix()
	 * @generated
	 */
	void setTitleSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(LocalDate)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_DateOfBirth()
	 * @model unique="false" dataType="org.redsalt.core.datamodel.LocalDate"
	 * @generated
	 */
	LocalDate getDateOfBirth();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Street()
	 * @model unique="false"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_City()
	 * @model unique="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Zip()
	 * @model unique="false"
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Region()
	 * @model unique="false"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Country()
	 * @model unique="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Telephone()
	 * @model unique="false"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Fax()
	 * @model unique="false"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Page</em>' attribute.
	 * @see #setWebPage(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_WebPage()
	 * @model unique="false"
	 * @generated
	 */
	String getWebPage();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getWebPage <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Page</em>' attribute.
	 * @see #getWebPage()
	 * @generated
	 */
	void setWebPage(String value);

	/**
	 * Returns the value of the '<em><b>Vat No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat No</em>' attribute.
	 * @see #setVatNo(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_VatNo()
	 * @model unique="false"
	 * @generated
	 */
	String getVatNo();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getVatNo <em>Vat No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat No</em>' attribute.
	 * @see #getVatNo()
	 * @generated
	 */
	void setVatNo(String value);

	/**
	 * Returns the value of the '<em><b>Owned Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.redsalt.core.datamodel.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Accounts</em>' reference list.
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_OwnedAccounts()
	 * @model
	 * @generated
	 */
	EList<Account> getOwnedAccounts();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  user generated remarks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getContact_Remark()
	 * @model unique="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Contact#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

} // Contact
