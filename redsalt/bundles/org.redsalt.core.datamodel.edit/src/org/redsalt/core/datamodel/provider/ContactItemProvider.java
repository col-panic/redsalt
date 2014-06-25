/**
 */
package org.redsalt.core.datamodel.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.DatamodelPackage;

/**
 * This is the item provider adapter for a {@link org.redsalt.core.datamodel.Contact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContactItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrganizationPropertyDescriptor(object);
			addFavouritePropertyDescriptor(object);
			addContactTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addName2PropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTitleSuffixPropertyDescriptor(object);
			addDateOfBirthPropertyDescriptor(object);
			addStreetPropertyDescriptor(object);
			addCityPropertyDescriptor(object);
			addZipPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addCountryPropertyDescriptor(object);
			addTelephonePropertyDescriptor(object);
			addFaxPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addWebPagePropertyDescriptor(object);
			addVatNoPropertyDescriptor(object);
			addOwnedAccountsPropertyDescriptor(object);
			addRemarkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Organization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_organization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_organization_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__ORGANIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Favourite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFavouritePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_favourite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_favourite_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__FAVOURITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_contactType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_contactType_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__CONTACT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_name_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_name2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_name2_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__NAME2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_title_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_titleSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_titleSuffix_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__TITLE_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Of Birth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateOfBirthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_dateOfBirth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_dateOfBirth_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__DATE_OF_BIRTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Street feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStreetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_street_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_street_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__STREET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the City feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_city_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_city_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__CITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_zip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_zip_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__ZIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_region_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_country_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_country_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Telephone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTelephonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_telephone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_telephone_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__TELEPHONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_fax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_fax_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__FAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_email_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_webPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_webPage_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__WEB_PAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vat No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVatNoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_vatNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_vatNo_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__VAT_NO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_remark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_remark_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__REMARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Accounts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAccountsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contact_ownedAccounts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contact_ownedAccounts_feature", "_UI_Contact_type"),
				 DatamodelPackage.Literals.CONTACT__OWNED_ACCOUNTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Contact.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Contact"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Contact)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Contact_type") :
			getString("_UI_Contact_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Contact.class)) {
			case DatamodelPackage.CONTACT__ORGANIZATION:
			case DatamodelPackage.CONTACT__FAVOURITE:
			case DatamodelPackage.CONTACT__CONTACT_TYPE:
			case DatamodelPackage.CONTACT__NAME:
			case DatamodelPackage.CONTACT__NAME2:
			case DatamodelPackage.CONTACT__TITLE:
			case DatamodelPackage.CONTACT__TITLE_SUFFIX:
			case DatamodelPackage.CONTACT__DATE_OF_BIRTH:
			case DatamodelPackage.CONTACT__STREET:
			case DatamodelPackage.CONTACT__CITY:
			case DatamodelPackage.CONTACT__ZIP:
			case DatamodelPackage.CONTACT__REGION:
			case DatamodelPackage.CONTACT__COUNTRY:
			case DatamodelPackage.CONTACT__TELEPHONE:
			case DatamodelPackage.CONTACT__FAX:
			case DatamodelPackage.CONTACT__EMAIL:
			case DatamodelPackage.CONTACT__WEB_PAGE:
			case DatamodelPackage.CONTACT__VAT_NO:
			case DatamodelPackage.CONTACT__REMARK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatamodelEditPlugin.INSTANCE;
	}

}
