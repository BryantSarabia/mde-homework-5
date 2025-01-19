/**
 */
package RefinedStreamingPlatform.provider;


import RefinedStreamingPlatform.Channel;
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
 * This is the item provider adapter for a {@link RefinedStreamingPlatform.Channel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChannelItemProvider extends AuditableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelItemProvider(AdapterFactory adapterFactory) {
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
			addTagsPropertyDescriptor(object);
			addChannelIDPropertyDescriptor(object);
			addModeratorsPropertyDescriptor(object);
			addFollowersPropertyDescriptor(object);
			addTipsPropertyDescriptor(object);
			addSubscriptionsPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addTotalTipsPropertyDescriptor(object);
			addTotalFollowersPropertyDescriptor(object);
			addTotalViewsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Taggable_tags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Taggable_tags_feature", "_UI_Taggable_type"),
				 RefinedStreamingPlatformPackage.Literals.TAGGABLE__TAGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Channel ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_channelID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_channelID_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__CHANNEL_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moderators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModeratorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_moderators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_moderators_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__MODERATORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Followers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFollowersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_followers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_followers_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__FOLLOWERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tips feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_tips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_tips_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__TIPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_subscriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_subscriptions_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__SUBSCRIPTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_owner_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__OWNER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Tips feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalTipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_totalTips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_totalTips_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_TIPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Followers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalFollowersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_totalFollowers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_totalFollowers_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_FOLLOWERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_totalViews_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_totalViews_feature", "_UI_Channel_type"),
				 RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_VIEWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.CHANNEL__STREAMS);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.CHANNEL__CLIPS);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.CHANNEL__PLAYLISTS);
			childrenFeatures.add(RefinedStreamingPlatformPackage.Literals.CHANNEL__FEATURES);
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
	 * This returns Channel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Channel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Channel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Channel_type") :
			getString("_UI_Channel_type") + " " + label;
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

		switch (notification.getFeatureID(Channel.class)) {
			case RefinedStreamingPlatformPackage.CHANNEL__NAME:
			case RefinedStreamingPlatformPackage.CHANNEL__TAGS:
			case RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID:
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_TIPS:
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
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
				(RefinedStreamingPlatformPackage.Literals.CHANNEL__STREAMS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createStream()));

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.CHANNEL__CLIPS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createClip()));

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.CHANNEL__PLAYLISTS,
				 RefinedStreamingPlatformFactory.eINSTANCE.createPlaylist()));

		newChildDescriptors.add
			(createChildParameter
				(RefinedStreamingPlatformPackage.Literals.CHANNEL__FEATURES,
				 RefinedStreamingPlatformFactory.eINSTANCE.createFeature()));
	}

}
