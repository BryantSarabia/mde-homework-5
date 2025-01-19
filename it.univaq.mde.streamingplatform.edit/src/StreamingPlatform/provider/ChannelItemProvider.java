/**
 */
package StreamingPlatform.provider;


import StreamingPlatform.Channel;
import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.StreamingPlatformPackage;

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
 * This is the item provider adapter for a {@link StreamingPlatform.Channel} object.
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
			addChannelIDPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addModeratorsPropertyDescriptor(object);
			addFollowersPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addTotalDonationsPropertyDescriptor(object);
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
				 StreamingPlatformPackage.Literals.NAMED_ELEMENT__NAME,
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
				 StreamingPlatformPackage.Literals.CHANNEL__CHANNEL_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_description_feature", "_UI_Channel_type"),
				 StreamingPlatformPackage.Literals.CHANNEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 StreamingPlatformPackage.Literals.CHANNEL__MODERATORS,
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
				 StreamingPlatformPackage.Literals.CHANNEL__FOLLOWERS,
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
				 StreamingPlatformPackage.Literals.CHANNEL__OWNER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Donations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalDonationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_totalDonations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_totalDonations_feature", "_UI_Channel_type"),
				 StreamingPlatformPackage.Literals.CHANNEL__TOTAL_DONATIONS,
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
				 StreamingPlatformPackage.Literals.CHANNEL__TOTAL_FOLLOWERS,
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
				 StreamingPlatformPackage.Literals.CHANNEL__TOTAL_VIEWS,
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
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__STREAMS);
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__CLIPS);
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__DONATIONS);
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__SUBSCRIPTIONS);
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__EMOTES);
			childrenFeatures.add(StreamingPlatformPackage.Literals.CHANNEL__BADGES);
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
			case StreamingPlatformPackage.CHANNEL__NAME:
			case StreamingPlatformPackage.CHANNEL__CHANNEL_ID:
			case StreamingPlatformPackage.CHANNEL__DESCRIPTION:
			case StreamingPlatformPackage.CHANNEL__TOTAL_DONATIONS:
			case StreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
			case StreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StreamingPlatformPackage.CHANNEL__STREAMS:
			case StreamingPlatformPackage.CHANNEL__CLIPS:
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
			case StreamingPlatformPackage.CHANNEL__EMOTES:
			case StreamingPlatformPackage.CHANNEL__BADGES:
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
				(StreamingPlatformPackage.Literals.CHANNEL__STREAMS,
				 StreamingPlatformFactory.eINSTANCE.createStream()));

		newChildDescriptors.add
			(createChildParameter
				(StreamingPlatformPackage.Literals.CHANNEL__CLIPS,
				 StreamingPlatformFactory.eINSTANCE.createClip()));

		newChildDescriptors.add
			(createChildParameter
				(StreamingPlatformPackage.Literals.CHANNEL__DONATIONS,
				 StreamingPlatformFactory.eINSTANCE.createDonation()));

		newChildDescriptors.add
			(createChildParameter
				(StreamingPlatformPackage.Literals.CHANNEL__SUBSCRIPTIONS,
				 StreamingPlatformFactory.eINSTANCE.createSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(StreamingPlatformPackage.Literals.CHANNEL__EMOTES,
				 StreamingPlatformFactory.eINSTANCE.createEmote()));

		newChildDescriptors.add
			(createChildParameter
				(StreamingPlatformPackage.Literals.CHANNEL__BADGES,
				 StreamingPlatformFactory.eINSTANCE.createBadge()));
	}

}
