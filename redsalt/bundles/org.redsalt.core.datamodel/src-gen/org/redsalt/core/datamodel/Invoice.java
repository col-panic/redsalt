/**
 */
package org.redsalt.core.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.Invoice#isOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Invoice#getSender <em>Sender</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Invoice#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.Invoice#getReferenceId <em>Reference Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.datamodel.DatamodelPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' attribute.
	 * @see #setOutgoing(boolean)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getInvoice_Outgoing()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOutgoing();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Invoice#isOutgoing <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' attribute.
	 * @see #isOutgoing()
	 * @generated
	 */
	void setOutgoing(boolean value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Contact)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getInvoice_Sender()
	 * @model
	 * @generated
	 */
	Contact getSender();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Invoice#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Contact value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' reference.
	 * @see #setRecipient(Contact)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getInvoice_Recipient()
	 * @model
	 * @generated
	 */
	Contact getRecipient();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Invoice#getRecipient <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Contact value);

	/**
	 * Returns the value of the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Id</em>' attribute.
	 * @see #setReferenceId(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getInvoice_ReferenceId()
	 * @model
	 * @generated
	 */
	String getReferenceId();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Invoice#getReferenceId <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Id</em>' attribute.
	 * @see #getReferenceId()
	 * @generated
	 */
	void setReferenceId(String value);

} // Invoice
