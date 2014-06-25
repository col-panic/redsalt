/**
 */
package org.redsalt.core.datamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contact Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.redsalt.core.datamodel.DatamodelPackage#getContactType()
 * @model
 * @generated
 */
public enum ContactType implements Enumerator {
	/**
	 * The '<em><b>GENERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(0, "GENERIC", "GENERIC"),

	/**
	 * The '<em><b>CUSTOMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER(10, "CUSTOMER", "CUSTOMER"),

	/**
	 * The '<em><b>EMPLOYEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYEE_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYEE(20, "EMPLOYEE", "EMPLOYEE"),

	/**
	 * The '<em><b>LEGAL ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL_ENTITY(30, "LEGAL_ENTITY", "LEGAL_ENTITY"),

	/**
	 * The '<em><b>BANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_VALUE
	 * @generated
	 * @ordered
	 */
	BANK(40, "BANK", "BANK"),

	/**
	 * The '<em><b>VENDOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDOR_VALUE
	 * @generated
	 * @ordered
	 */
	VENDOR(50, "VENDOR", "VENDOR"),

	/**
	 * The '<em><b>USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(999, "USER", "USER");

	/**
	 * The '<em><b>GENERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENERIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 0;

	/**
	 * The '<em><b>CUSTOMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOMER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_VALUE = 10;

	/**
	 * The '<em><b>EMPLOYEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMPLOYEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPLOYEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_VALUE = 20;

	/**
	 * The '<em><b>LEGAL ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGAL ENTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_ENTITY_VALUE = 30;

	/**
	 * The '<em><b>BANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANK_VALUE = 40;

	/**
	 * The '<em><b>VENDOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VENDOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENDOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_VALUE = 50;

	/**
	 * The '<em><b>USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 999;

	/**
	 * An array of all the '<em><b>Contact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactType[] VALUES_ARRAY =
		new ContactType[] {
			GENERIC,
			CUSTOMER,
			EMPLOYEE,
			LEGAL_ENTITY,
			BANK,
			VENDOR,
			USER,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContactType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactType get(int value) {
		switch (value) {
			case GENERIC_VALUE: return GENERIC;
			case CUSTOMER_VALUE: return CUSTOMER;
			case EMPLOYEE_VALUE: return EMPLOYEE;
			case LEGAL_ENTITY_VALUE: return LEGAL_ENTITY;
			case BANK_VALUE: return BANK;
			case VENDOR_VALUE: return VENDOR;
			case USER_VALUE: return USER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContactType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ContactType
