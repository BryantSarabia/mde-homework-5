/**
 */
package RefinedStreamingPlatform.provider;


import RefinedStreamingPlatform.MediaContent;
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
 * This is the item provider adapter for a {@link RefinedStreamingPlatform.MediaContent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaContentItemProvider extends TaggableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaContentItemProvider(AdapterFactory adapterFactory) {
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

			addMediaContentIDPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addViewCountPropertyDescriptor(object);
			addVideoQualitiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Media Content ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediaContentIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediaContent_mediaContentID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediaContent_mediaContentID_feature", "_UI_MediaContent_type"),
				 RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MEDIA_CONTENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_MediaContent_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediaContent_title_feature", "_UI_MediaContent_type"),
				 RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediaContent_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediaContent_category_feature", "_UI_MediaContent_type"),
				 RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediaContent_viewCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediaContent_viewCount_feature", "_UI_MediaContent_type"),
				 RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__VIEW_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Video Qualities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVideoQualitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MediaContent_videoQualities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MediaContent_videoQualities_feature", "_UI_MediaContent_type"),
				 RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__VIDEO_QUALITIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MESSAGES);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__REACTIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		MediaContent mediaContent = (MediaContent)object;
		return getString("_UI_MediaContent_type") + " " + mediaContent.getMediaContentID();
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

		switch (notification.getFeatureID(MediaContent.class)) {
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID:
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE:
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
				(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MESSAGES,
				 RefinedStreamingPlatformFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__REACTIONS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createReaction()));
	}

}
