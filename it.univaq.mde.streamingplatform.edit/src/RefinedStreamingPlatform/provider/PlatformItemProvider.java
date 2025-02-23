/**
 */
package RefinedStreamingPlatform.provider;


import RefinedStreamingPlatform.Platform;
import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link RefinedStreamingPlatform.Platform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformItemProvider extends AuditableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPlatformIDPropertyDescriptor(object);
			addRevenuePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addSupportedRegionsPropertyDescriptor(object);
			addSupportedLanguagesPropertyDescriptor(object);
			addSupportedDevicesPropertyDescriptor(object);
			addSupportedVideoQualitiesPropertyDescriptor(object);
			addTotalRevenuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 RefinedStreamingPlatformPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Platform ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_platformID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_platformID_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__PLATFORM_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revenue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevenuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_revenue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_revenue_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__REVENUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_version_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Regions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedRegionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_supportedRegions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_supportedRegions_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_REGIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_supportedLanguages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_supportedLanguages_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_LANGUAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_supportedDevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_supportedDevices_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_DEVICES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Video Qualities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedVideoQualitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_supportedVideoQualities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_supportedVideoQualities_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_VIDEO_QUALITIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Revenue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalRevenuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_totalRevenue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_totalRevenue_feature", "_UI_Platform_type"),
				 RefinedStreamingPlatformPackage.Literals.PLATFORM__TOTAL_REVENUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.PLATFORM__USERS);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.PLATFORM__CHANNELS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Platform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Platform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Platform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Platform_type") :
			getString("_UI_Platform_type") + " " + label;
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

		switch (notification.getFeatureID(Platform.class)) {
			case RefinedStreamingPlatformPackage.PLATFORM__NAME:
			case RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID:
			case RefinedStreamingPlatformPackage.PLATFORM__REVENUE:
			case RefinedStreamingPlatformPackage.PLATFORM__VERSION:
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES:
			case RefinedStreamingPlatformPackage.PLATFORM__TOTAL_REVENUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.PLATFORM__USERS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.PLATFORM__CHANNELS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createChannel()));
	}

}
