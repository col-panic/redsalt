/**
 */
package org.redsalt.core.datamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Account Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.redsalt.core.datamodel.DatamodelPackage#getAccountType()
 * @model
 * @generated
 */
public enum AccountType implements Enumerator {
	/**
	 * The '<em><b>CASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH_VALUE
	 * @generated
	 * @ordered
	 */
	CASH(0, "CASH", "CASH"),

	/**
	 * The '<em><b>BANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_VALUE
	 * @generated
	 * @ordered
	 */
	BANK(1, "BANK", "BANK"),

	/**
	 * The '<em><b>BANK GIRO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_GIRO_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_GIRO(10, "BANK_GIRO", "BANK_GIRO"),

	/**
	 * The '<em><b>BANK CREDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_CREDIT(11, "BANK_CREDIT", "BANK_CREDIT"),

	/**
	 * The '<em><b>PAYPAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYPAL_VALUE
	 * @generated
	 * @ordered
	 */
	PAYPAL(2, "PAYPAL", "PAYPAL"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(99, "OTHER", "OTHER");

	/**
	 * The '<em><b>CASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASH_VALUE = 0;

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
	public static final int BANK_VALUE = 1;

	/**
	 * The '<em><b>BANK GIRO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANK GIRO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANK_GIRO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANK_GIRO_VALUE = 10;

	/**
	 * The '<em><b>BANK CREDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANK CREDIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANK_CREDIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANK_CREDIT_VALUE = 11;

	/**
	 * The '<em><b>PAYPAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAYPAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYPAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAYPAL_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 99;

	/**
	 * An array of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccountType[] VALUES_ARRAY =
		new AccountType[] {
			CASH,
			BANK,
			BANK_GIRO,
			BANK_CREDIT,
			PAYPAL,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType get(int value) {
		switch (value) {
			case CASH_VALUE: return CASH;
			case BANK_VALUE: return BANK;
			case BANK_GIRO_VALUE: return BANK_GIRO;
			case BANK_CREDIT_VALUE: return BANK_CREDIT;
			case PAYPAL_VALUE: return PAYPAL;
			case OTHER_VALUE: return OTHER;
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
	private AccountType(int value, String name, String literal) {
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
	
} //AccountType
