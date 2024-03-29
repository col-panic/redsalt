/**
 */
package org.redsalt.core.appmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.redsalt.core.datamodel.Contact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.appmodel.Contacts#getContacts <em>Contacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.appmodel.AppmodelPackage#getContacts()
 * @model
 * @generated
 */
public interface Contacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.redsalt.core.datamodel.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.redsalt.core.appmodel.AppmodelPackage#getContacts_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

} // Contacts
