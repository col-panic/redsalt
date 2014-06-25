/**
 */
package org.redsalt.core.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.redsalt.core.datamodel.Category#getCategoryName <em>Category Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.redsalt.core.datamodel.DatamodelPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.redsalt.core.datamodel.DatamodelPackage#getCategory_CategoryName()
	 * @model unique="false"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.redsalt.core.datamodel.Category#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

} // Category
