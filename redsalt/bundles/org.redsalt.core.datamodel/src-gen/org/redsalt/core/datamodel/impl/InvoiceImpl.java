/**
 */
package org.redsalt.core.datamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.DatamodelPackage;
import org.redsalt.core.datamodel.Invoice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.impl.InvoiceImpl#isOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.InvoiceImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.InvoiceImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.redsalt.core.datamodel.impl.InvoiceImpl#getReferenceId <em>Reference Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvoiceImpl extends MinimalEObjectImpl.Container implements Invoice {
	/**
	 * The default value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTGOING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutgoing()
	 * @generated
	 * @ordered
	 */
	protected boolean outgoing = OUTGOING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Contact sender;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Contact recipient;

	/**
	 * The default value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceId() <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String referenceId = REFERENCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(boolean newOutgoing) {
		boolean oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INVOICE__OUTGOING, oldOutgoing, outgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (Contact)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.INVOICE__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Contact newSender) {
		Contact oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INVOICE__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (Contact)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.INVOICE__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact basicGetRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(Contact newRecipient) {
		Contact oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INVOICE__RECIPIENT, oldRecipient, recipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceId(String newReferenceId) {
		String oldReferenceId = referenceId;
		referenceId = newReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INVOICE__REFERENCE_ID, oldReferenceId, referenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.INVOICE__OUTGOING:
				return isOutgoing();
			case DatamodelPackage.INVOICE__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case DatamodelPackage.INVOICE__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
			case DatamodelPackage.INVOICE__REFERENCE_ID:
				return getReferenceId();
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
			case DatamodelPackage.INVOICE__OUTGOING:
				setOutgoing((Boolean)newValue);
				return;
			case DatamodelPackage.INVOICE__SENDER:
				setSender((Contact)newValue);
				return;
			case DatamodelPackage.INVOICE__RECIPIENT:
				setRecipient((Contact)newValue);
				return;
			case DatamodelPackage.INVOICE__REFERENCE_ID:
				setReferenceId((String)newValue);
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
			case DatamodelPackage.INVOICE__OUTGOING:
				setOutgoing(OUTGOING_EDEFAULT);
				return;
			case DatamodelPackage.INVOICE__SENDER:
				setSender((Contact)null);
				return;
			case DatamodelPackage.INVOICE__RECIPIENT:
				setRecipient((Contact)null);
				return;
			case DatamodelPackage.INVOICE__REFERENCE_ID:
				setReferenceId(REFERENCE_ID_EDEFAULT);
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
			case DatamodelPackage.INVOICE__OUTGOING:
				return outgoing != OUTGOING_EDEFAULT;
			case DatamodelPackage.INVOICE__SENDER:
				return sender != null;
			case DatamodelPackage.INVOICE__RECIPIENT:
				return recipient != null;
			case DatamodelPackage.INVOICE__REFERENCE_ID:
				return REFERENCE_ID_EDEFAULT == null ? referenceId != null : !REFERENCE_ID_EDEFAULT.equals(referenceId);
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
		result.append(" (outgoing: ");
		result.append(outgoing);
		result.append(", referenceId: ");
		result.append(referenceId);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
