/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Auditable;
import RefinedStreamingPlatform.Category;
import RefinedStreamingPlatform.Channel;
import RefinedStreamingPlatform.Clip;
import RefinedStreamingPlatform.Currency;
import RefinedStreamingPlatform.Device;
import RefinedStreamingPlatform.Feature;
import RefinedStreamingPlatform.FeatureType;
import RefinedStreamingPlatform.Language;
import RefinedStreamingPlatform.MediaContent;
import RefinedStreamingPlatform.Message;
import RefinedStreamingPlatform.Monetization;
import RefinedStreamingPlatform.NamedElement;
import RefinedStreamingPlatform.PaymentMethod;
import RefinedStreamingPlatform.PaymentStatus;
import RefinedStreamingPlatform.Platform;
import RefinedStreamingPlatform.Playlist;
import RefinedStreamingPlatform.Reaction;
import RefinedStreamingPlatform.ReactionType;
import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.Region;
import RefinedStreamingPlatform.Role;
import RefinedStreamingPlatform.Stream;
import RefinedStreamingPlatform.Subscription;
import RefinedStreamingPlatform.SubscriptionDuration;
import RefinedStreamingPlatform.Taggable;
import RefinedStreamingPlatform.Tier;
import RefinedStreamingPlatform.Tip;
import RefinedStreamingPlatform.UnlockCondition;
import RefinedStreamingPlatform.User;
import RefinedStreamingPlatform.UserInteraction;
import RefinedStreamingPlatform.VideoQuality;

import RefinedStreamingPlatform.util.RefinedStreamingPlatformValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinedStreamingPlatformPackageImpl extends EPackageImpl implements RefinedStreamingPlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monetizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionDurationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum videoQualityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unlockConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefinedStreamingPlatformPackageImpl() {
		super(eNS_URI, RefinedStreamingPlatformFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RefinedStreamingPlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefinedStreamingPlatformPackage init() {
		if (isInited) return (RefinedStreamingPlatformPackage)EPackage.Registry.INSTANCE.getEPackage(RefinedStreamingPlatformPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefinedStreamingPlatformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefinedStreamingPlatformPackageImpl theRefinedStreamingPlatformPackage = registeredRefinedStreamingPlatformPackage instanceof RefinedStreamingPlatformPackageImpl ? (RefinedStreamingPlatformPackageImpl)registeredRefinedStreamingPlatformPackage : new RefinedStreamingPlatformPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRefinedStreamingPlatformPackage.createPackageContents();

		// Initialize created meta-data
		theRefinedStreamingPlatformPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRefinedStreamingPlatformPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RefinedStreamingPlatformValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRefinedStreamingPlatformPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefinedStreamingPlatformPackage.eNS_URI, theRefinedStreamingPlatformPackage);
		return theRefinedStreamingPlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaggable() {
		return taggableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggable_Tags() {
		return (EAttribute)taggableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuditable() {
		return auditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuditable_CreatedAt() {
		return (EAttribute)auditableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuditable_UpdatedAt() {
		return (EAttribute)auditableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_PlatformID() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_Revenue() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_Version() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedRegions() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedLanguages() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedDevices() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedVideoQualities() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_Users() {
		return (EReference)platformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_Channels() {
		return (EReference)platformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_TotalRevenue() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlatform__ActiveUsersCount() {
		return platformEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlatform__FindChannelByName__String() {
		return platformEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_ChannelID() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Streams() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Clips() {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Playlists() {
		return (EReference)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Moderators() {
		return (EReference)channelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Followers() {
		return (EReference)channelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Tips() {
		return (EReference)channelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Subscriptions() {
		return (EReference)channelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Features() {
		return (EReference)channelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Owner() {
		return (EReference)channelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_TotalTips() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_TotalFollowers() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_TotalViews() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_UserID() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Role() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Avatar() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_IsOnline() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Nickname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Subscriptions() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Tips() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_FollowedChannels() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__TotalTips() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__IsFollowing__Channel() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__TotalSpending() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_FeatureID() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Type() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Url() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Tenure() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_DonationAmount() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_UnlockCondition() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_EligibilityDescription() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediaContent() {
		return mediaContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_MediaContentID() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_Title() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_Category() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_ViewCount() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_VideoQualities() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaContent_Messages() {
		return (EReference)mediaContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaContent_Reactions() {
		return (EReference)mediaContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStream() {
		return streamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStream_IsLive() {
		return (EAttribute)streamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStream_Viewers() {
		return (EReference)streamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStream_ActiveViewers() {
		return (EAttribute)streamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStream__LiveCondition__DiagnosticChain_Map() {
		return streamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClip() {
		return clipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClip_CreatedBy() {
		return (EReference)clipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaylist() {
		return playlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaylist_PlaylistID() {
		return (EAttribute)playlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Media() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonetization() {
		return monetizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_MonetizationID() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_Amount() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_Currency() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_TransactionDate() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_PaymentStatus() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_PaymentMethod() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMonetization__PositiveAmount__DiagnosticChain_Map() {
		return monetizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTip() {
		return tipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTip_Message() {
		return (EAttribute)tipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Tier() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Price() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Duration() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_AutoRenewal() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_StartDate() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_EndDate() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_Features() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map() {
		return subscriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map() {
		return subscriptionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserInteraction() {
		return userInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserInteraction_UserInteractionID() {
		return (EAttribute)userInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserInteraction_Timestamp() {
		return (EAttribute)userInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserInteraction_Author() {
		return (EReference)userInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Content() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReaction() {
		return reactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReaction_ReactionType() {
		return (EAttribute)reactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubscriptionDuration() {
		return subscriptionDurationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategory() {
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCurrency() {
		return currencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDevice() {
		return deviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegion() {
		return regionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVideoQuality() {
		return videoQualityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentStatus() {
		return paymentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReactionType() {
		return reactionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTier() {
		return tierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnlockCondition() {
		return unlockConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureType() {
		return featureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinedStreamingPlatformFactory getRefinedStreamingPlatformFactory() {
		return (RefinedStreamingPlatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		taggableEClass = createEClass(TAGGABLE);
		createEAttribute(taggableEClass, TAGGABLE__TAGS);

		auditableEClass = createEClass(AUDITABLE);
		createEAttribute(auditableEClass, AUDITABLE__CREATED_AT);
		createEAttribute(auditableEClass, AUDITABLE__UPDATED_AT);

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__PLATFORM_ID);
		createEAttribute(platformEClass, PLATFORM__REVENUE);
		createEAttribute(platformEClass, PLATFORM__VERSION);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_REGIONS);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_LANGUAGES);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_DEVICES);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_VIDEO_QUALITIES);
		createEReference(platformEClass, PLATFORM__USERS);
		createEReference(platformEClass, PLATFORM__CHANNELS);
		createEAttribute(platformEClass, PLATFORM__TOTAL_REVENUE);
		createEOperation(platformEClass, PLATFORM___ACTIVE_USERS_COUNT);
		createEOperation(platformEClass, PLATFORM___FIND_CHANNEL_BY_NAME__STRING);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL_ID);
		createEReference(channelEClass, CHANNEL__STREAMS);
		createEReference(channelEClass, CHANNEL__CLIPS);
		createEReference(channelEClass, CHANNEL__PLAYLISTS);
		createEReference(channelEClass, CHANNEL__MODERATORS);
		createEReference(channelEClass, CHANNEL__FOLLOWERS);
		createEReference(channelEClass, CHANNEL__TIPS);
		createEReference(channelEClass, CHANNEL__SUBSCRIPTIONS);
		createEReference(channelEClass, CHANNEL__FEATURES);
		createEReference(channelEClass, CHANNEL__OWNER);
		createEAttribute(channelEClass, CHANNEL__TOTAL_TIPS);
		createEAttribute(channelEClass, CHANNEL__TOTAL_FOLLOWERS);
		createEAttribute(channelEClass, CHANNEL__TOTAL_VIEWS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_ID);
		createEAttribute(userEClass, USER__ROLE);
		createEAttribute(userEClass, USER__AVATAR);
		createEAttribute(userEClass, USER__IS_ONLINE);
		createEAttribute(userEClass, USER__NICKNAME);
		createEReference(userEClass, USER__SUBSCRIPTIONS);
		createEReference(userEClass, USER__TIPS);
		createEReference(userEClass, USER__FOLLOWED_CHANNELS);
		createEOperation(userEClass, USER___TOTAL_TIPS);
		createEOperation(userEClass, USER___IS_FOLLOWING__CHANNEL);
		createEOperation(userEClass, USER___TOTAL_SPENDING);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__FEATURE_ID);
		createEAttribute(featureEClass, FEATURE__TYPE);
		createEAttribute(featureEClass, FEATURE__URL);
		createEAttribute(featureEClass, FEATURE__TENURE);
		createEAttribute(featureEClass, FEATURE__DONATION_AMOUNT);
		createEAttribute(featureEClass, FEATURE__UNLOCK_CONDITION);
		createEAttribute(featureEClass, FEATURE__ELIGIBILITY_DESCRIPTION);

		mediaContentEClass = createEClass(MEDIA_CONTENT);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__MEDIA_CONTENT_ID);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__TITLE);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__CATEGORY);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__VIEW_COUNT);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__VIDEO_QUALITIES);
		createEReference(mediaContentEClass, MEDIA_CONTENT__MESSAGES);
		createEReference(mediaContentEClass, MEDIA_CONTENT__REACTIONS);

		streamEClass = createEClass(STREAM);
		createEAttribute(streamEClass, STREAM__IS_LIVE);
		createEReference(streamEClass, STREAM__VIEWERS);
		createEAttribute(streamEClass, STREAM__ACTIVE_VIEWERS);
		createEOperation(streamEClass, STREAM___LIVE_CONDITION__DIAGNOSTICCHAIN_MAP);

		clipEClass = createEClass(CLIP);
		createEReference(clipEClass, CLIP__CREATED_BY);

		playlistEClass = createEClass(PLAYLIST);
		createEAttribute(playlistEClass, PLAYLIST__PLAYLIST_ID);
		createEReference(playlistEClass, PLAYLIST__MEDIA);

		monetizationEClass = createEClass(MONETIZATION);
		createEAttribute(monetizationEClass, MONETIZATION__MONETIZATION_ID);
		createEAttribute(monetizationEClass, MONETIZATION__AMOUNT);
		createEAttribute(monetizationEClass, MONETIZATION__CURRENCY);
		createEAttribute(monetizationEClass, MONETIZATION__TRANSACTION_DATE);
		createEAttribute(monetizationEClass, MONETIZATION__PAYMENT_STATUS);
		createEAttribute(monetizationEClass, MONETIZATION__PAYMENT_METHOD);
		createEOperation(monetizationEClass, MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP);

		tipEClass = createEClass(TIP);
		createEAttribute(tipEClass, TIP__MESSAGE);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__TIER);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__PRICE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__DURATION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__AUTO_RENEWAL);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__START_DATE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__END_DATE);
		createEReference(subscriptionEClass, SUBSCRIPTION__FEATURES);
		createEOperation(subscriptionEClass, SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriptionEClass, SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP);

		userInteractionEClass = createEClass(USER_INTERACTION);
		createEAttribute(userInteractionEClass, USER_INTERACTION__USER_INTERACTION_ID);
		createEAttribute(userInteractionEClass, USER_INTERACTION__TIMESTAMP);
		createEReference(userInteractionEClass, USER_INTERACTION__AUTHOR);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__CONTENT);

		reactionEClass = createEClass(REACTION);
		createEAttribute(reactionEClass, REACTION__REACTION_TYPE);

		// Create enums
		subscriptionDurationEEnum = createEEnum(SUBSCRIPTION_DURATION);
		categoryEEnum = createEEnum(CATEGORY);
		currencyEEnum = createEEnum(CURRENCY);
		deviceEEnum = createEEnum(DEVICE);
		languageEEnum = createEEnum(LANGUAGE);
		regionEEnum = createEEnum(REGION);
		videoQualityEEnum = createEEnum(VIDEO_QUALITY);
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
		paymentStatusEEnum = createEEnum(PAYMENT_STATUS);
		reactionTypeEEnum = createEEnum(REACTION_TYPE);
		roleEEnum = createEEnum(ROLE);
		tierEEnum = createEEnum(TIER);
		unlockConditionEEnum = createEEnum(UNLOCK_CONDITION);
		featureTypeEEnum = createEEnum(FEATURE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		platformEClass.getESuperTypes().add(this.getAuditable());
		platformEClass.getESuperTypes().add(this.getNamedElement());
		channelEClass.getESuperTypes().add(this.getAuditable());
		channelEClass.getESuperTypes().add(this.getNamedElement());
		channelEClass.getESuperTypes().add(this.getTaggable());
		userEClass.getESuperTypes().add(this.getAuditable());
		userEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		mediaContentEClass.getESuperTypes().add(this.getTaggable());
		streamEClass.getESuperTypes().add(this.getMediaContent());
		clipEClass.getESuperTypes().add(this.getMediaContent());
		playlistEClass.getESuperTypes().add(this.getNamedElement());
		tipEClass.getESuperTypes().add(this.getMonetization());
		subscriptionEClass.getESuperTypes().add(this.getMonetization());
		messageEClass.getESuperTypes().add(this.getUserInteraction());
		reactionEClass.getESuperTypes().add(this.getUserInteraction());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggableEClass, Taggable.class, "Taggable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggable_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, Taggable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEClass, Auditable.class, "Auditable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditable_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 1, 1, Auditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditable_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, Auditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_PlatformID(), ecorePackage.getEInt(), "platformID", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Revenue(), ecorePackage.getEDouble(), "revenue", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Version(), ecorePackage.getEFloat(), "version", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedRegions(), this.getRegion(), "supportedRegions", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedLanguages(), this.getLanguage(), "supportedLanguages", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedDevices(), this.getDevice(), "supportedDevices", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedVideoQualities(), this.getVideoQuality(), "supportedVideoQualities", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Users(), this.getUser(), null, "users", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Channels(), this.getChannel(), null, "channels", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_TotalRevenue(), ecorePackage.getEDouble(), "totalRevenue", null, 1, 1, Platform.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getPlatform__ActiveUsersCount(), ecorePackage.getEInt(), "activeUsersCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPlatform__FindChannelByName__String(), this.getChannel(), "findChannelByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_ChannelID(), ecorePackage.getEInt(), "channelID", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Streams(), this.getStream(), null, "streams", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Clips(), this.getClip(), null, "clips", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Playlists(), this.getPlaylist(), null, "playlists", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Moderators(), this.getUser(), null, "moderators", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Followers(), this.getUser(), this.getUser_FollowedChannels(), "followers", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Tips(), this.getTip(), null, "tips", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Features(), this.getFeature(), null, "features", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Owner(), this.getUser(), null, "owner", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_TotalTips(), ecorePackage.getEFloat(), "totalTips", null, 1, 1, Channel.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_TotalFollowers(), ecorePackage.getEInt(), "totalFollowers", null, 1, 1, Channel.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_TotalViews(), ecorePackage.getEInt(), "totalViews", null, 1, 1, Channel.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserID(), ecorePackage.getEInt(), "userID", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Role(), this.getRole(), "role", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Avatar(), ecorePackage.getEString(), "avatar", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_IsOnline(), ecorePackage.getEBoolean(), "isOnline", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Nickname(), ecorePackage.getEString(), "nickname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Tips(), this.getTip(), null, "tips", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_FollowedChannels(), this.getChannel(), this.getChannel_Followers(), "followedChannels", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUser__TotalTips(), ecorePackage.getEFloat(), "totalTips", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__IsFollowing__Channel(), ecorePackage.getEBoolean(), "isFollowing", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__TotalSpending(), ecorePackage.getEFloat(), "totalSpending", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_FeatureID(), ecorePackage.getEInt(), "featureID", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Type(), this.getFeatureType(), "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Url(), ecorePackage.getEString(), "url", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Tenure(), ecorePackage.getEShort(), "tenure", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DonationAmount(), ecorePackage.getEFloat(), "donationAmount", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_UnlockCondition(), this.getUnlockCondition(), "unlockCondition", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_EligibilityDescription(), ecorePackage.getEString(), "eligibilityDescription", null, 1, 1, Feature.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mediaContentEClass, MediaContent.class, "MediaContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaContent_MediaContentID(), ecorePackage.getEInt(), "mediaContentID", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Title(), ecorePackage.getEString(), "title", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Category(), this.getCategory(), "category", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_ViewCount(), ecorePackage.getEInt(), "viewCount", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_VideoQualities(), this.getVideoQuality(), "videoQualities", null, 1, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaContent_Messages(), this.getMessage(), null, "messages", null, 0, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaContent_Reactions(), this.getReaction(), null, "reactions", null, 0, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamEClass, Stream.class, "Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStream_IsLive(), ecorePackage.getEBoolean(), "isLive", "false", 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStream_Viewers(), this.getUser(), null, "viewers", null, 0, -1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStream_ActiveViewers(), ecorePackage.getEInt(), "activeViewers", null, 1, 1, Stream.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStream__LiveCondition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "liveCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clipEClass, Clip.class, "Clip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClip_CreatedBy(), this.getUser(), null, "createdBy", null, 1, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playlistEClass, Playlist.class, "Playlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaylist_PlaylistID(), ecorePackage.getEInt(), "playlistID", null, 1, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaylist_Media(), this.getMediaContent(), null, "media", null, 0, -1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monetizationEClass, Monetization.class, "Monetization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonetization_MonetizationID(), ecorePackage.getEInt(), "monetizationID", null, 0, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_Currency(), this.getCurrency(), "currency", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_TransactionDate(), ecorePackage.getEDate(), "transactionDate", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_PaymentStatus(), this.getPaymentStatus(), "paymentStatus", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_PaymentMethod(), this.getPaymentMethod(), "paymentMethod", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMonetization__PositiveAmount__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveAmount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tipEClass, Tip.class, "Tip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTip_Message(), ecorePackage.getEString(), "message", null, 0, 1, Tip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscription_Tier(), this.getTier(), "tier", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Duration(), this.getSubscriptionDuration(), "duration", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_AutoRenewal(), ecorePackage.getEBoolean(), "autoRenewal", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscription_Features(), this.getFeature(), null, "features", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "startDateLessThanEndDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "transactionDateLessThanStartDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userInteractionEClass, UserInteraction.class, "UserInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInteraction_UserInteractionID(), ecorePackage.getEInt(), "userInteractionID", null, 0, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInteraction_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInteraction_Author(), this.getUser(), null, "author", null, 1, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Content(), ecorePackage.getEString(), "content", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReaction_ReactionType(), this.getReactionType(), "reactionType", null, 1, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(subscriptionDurationEEnum, SubscriptionDuration.class, "SubscriptionDuration");
		addEEnumLiteral(subscriptionDurationEEnum, SubscriptionDuration.MONTHLY);
		addEEnumLiteral(subscriptionDurationEEnum, SubscriptionDuration.ANNUAL);

		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.VIDEOGAMES);
		addEEnumLiteral(categoryEEnum, Category.JUST_CHATTING);
		addEEnumLiteral(categoryEEnum, Category.ESPORTS);
		addEEnumLiteral(categoryEEnum, Category.SPORTS);
		addEEnumLiteral(categoryEEnum, Category.TALK_SHOWS_AND_PODSCASTS);

		initEEnum(currencyEEnum, Currency.class, "Currency");
		addEEnumLiteral(currencyEEnum, Currency.EUR);
		addEEnumLiteral(currencyEEnum, Currency.USD);
		addEEnumLiteral(currencyEEnum, Currency.GBP);

		initEEnum(deviceEEnum, Device.class, "Device");
		addEEnumLiteral(deviceEEnum, Device.IOS);
		addEEnumLiteral(deviceEEnum, Device.ANDROID);
		addEEnumLiteral(deviceEEnum, Device.WEB);
		addEEnumLiteral(deviceEEnum, Device.TV);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.ITALIAN);
		addEEnumLiteral(languageEEnum, Language.SPANISH);
		addEEnumLiteral(languageEEnum, Language.ENGLISH);

		initEEnum(regionEEnum, Region.class, "Region");
		addEEnumLiteral(regionEEnum, Region.EUROPE);
		addEEnumLiteral(regionEEnum, Region.AMERICA);

		initEEnum(videoQualityEEnum, VideoQuality.class, "VideoQuality");
		addEEnumLiteral(videoQualityEEnum, VideoQuality.SD);
		addEEnumLiteral(videoQualityEEnum, VideoQuality.HD);
		addEEnumLiteral(videoQualityEEnum, VideoQuality.ULTRA_HD);
		addEEnumLiteral(videoQualityEEnum, VideoQuality.QUAD_HD);
		addEEnumLiteral(videoQualityEEnum, VideoQuality.FULL_HD);

		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.PAYPAL);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.CREDIT_CARD);

		initEEnum(paymentStatusEEnum, PaymentStatus.class, "PaymentStatus");
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.PENDING);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.COMPLETED);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.REJECTED);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.REFUNDED);

		initEEnum(reactionTypeEEnum, ReactionType.class, "ReactionType");
		addEEnumLiteral(reactionTypeEEnum, ReactionType.LOVE);
		addEEnumLiteral(reactionTypeEEnum, ReactionType.THUMBS_UP);
		addEEnumLiteral(reactionTypeEEnum, ReactionType.THUMBS_DOWN);
		addEEnumLiteral(reactionTypeEEnum, ReactionType.FUNNY);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.ADMINISTRATOR);
		addEEnumLiteral(roleEEnum, Role.STREAMER);
		addEEnumLiteral(roleEEnum, Role.VIEWER);

		initEEnum(tierEEnum, Tier.class, "Tier");
		addEEnumLiteral(tierEEnum, Tier.BASIC);
		addEEnumLiteral(tierEEnum, Tier.PREMIUM);
		addEEnumLiteral(tierEEnum, Tier.VIP);

		initEEnum(unlockConditionEEnum, UnlockCondition.class, "UnlockCondition");
		addEEnumLiteral(unlockConditionEEnum, UnlockCondition.DONATION_AMOUNT);
		addEEnumLiteral(unlockConditionEEnum, UnlockCondition.TENURE);

		initEEnum(featureTypeEEnum, FeatureType.class, "FeatureType");
		addEEnumLiteral(featureTypeEEnum, FeatureType.BADGE);
		addEEnumLiteral(featureTypeEEnum, FeatureType.EMOTE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (streamEClass,
		   source,
		   new String[] {
			   "constraints", "liveCondition"
		   });
		addAnnotation
		  (monetizationEClass,
		   source,
		   new String[] {
			   "constraints", "positiveAmount"
		   });
		addAnnotation
		  (subscriptionEClass,
		   source,
		   new String[] {
			   "constraints", "transactionDateLessThanStartDate"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPlatform__ActiveUsersCount(),
		   source,
		   new String[] {
			   "body", "users->select(u | u.isOnline = true)->size()"
		   });
		addAnnotation
		  (getPlatform__FindChannelByName__String(),
		   source,
		   new String[] {
			   "body", "channels->any(c | c.name = name)"
		   });
		addAnnotation
		  (getUser__TotalTips(),
		   source,
		   new String[] {
			   "body", "tips->collect(t | t.amount)->sum()"
		   });
		addAnnotation
		  (getUser__IsFollowing__Channel(),
		   source,
		   new String[] {
			   "body", "followedChannels->includes(channel)"
		   });
		addAnnotation
		  (getUser__TotalSpending(),
		   source,
		   new String[] {
			   "body", "subscriptions->collect(s | s.amount)->sum() +\n                  tips->collect(t | t.amount)->sum()"
		   });
		addAnnotation
		  (getStream__LiveCondition__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "isLive = true implies viewers->notEmpty()"
		   });
		addAnnotation
		  (getMonetization__PositiveAmount__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "amount >= 0.0"
		   });
		addAnnotation
		  (getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "startDate <= endDate"
		   });
		addAnnotation
		  (getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "transactionDate <= startDate"
		   });
	}

} //RefinedStreamingPlatformPackageImpl
