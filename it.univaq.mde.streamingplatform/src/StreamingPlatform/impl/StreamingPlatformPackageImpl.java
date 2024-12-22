/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Auditable;
import StreamingPlatform.Badge;
import StreamingPlatform.Category;
import StreamingPlatform.Channel;
import StreamingPlatform.Clip;
import StreamingPlatform.Currency;
import StreamingPlatform.Device;
import StreamingPlatform.Donation;
import StreamingPlatform.Emote;
import StreamingPlatform.Feature;
import StreamingPlatform.Language;
import StreamingPlatform.MediaContent;
import StreamingPlatform.Message;
import StreamingPlatform.Monetization;
import StreamingPlatform.NamedElement;
import StreamingPlatform.PaymentMethod;
import StreamingPlatform.PaymentStatus;
import StreamingPlatform.Platform;
import StreamingPlatform.Reaction;
import StreamingPlatform.ReactionType;
import StreamingPlatform.Region;
import StreamingPlatform.Resolution;
import StreamingPlatform.Role;
import StreamingPlatform.Stream;
import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.Subscription;
import StreamingPlatform.SubscriptionDuration;
import StreamingPlatform.Tier;
import StreamingPlatform.UnlockCondition;
import StreamingPlatform.User;
import StreamingPlatform.UserInteraction;

import java.sql.Timestamp;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamingPlatformPackageImpl extends EPackageImpl implements StreamingPlatformPackage {
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
	private EClass badgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoteEClass = null;

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
	private EClass donationEClass = null;

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
	private EClass auditableEClass = null;

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
	private EClass userInteractionEClass = null;

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
	private EEnum resolutionEEnum = null;

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
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

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
	 * @see StreamingPlatform.StreamingPlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StreamingPlatformPackageImpl() {
		super(eNS_URI, StreamingPlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StreamingPlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StreamingPlatformPackage init() {
		if (isInited) return (StreamingPlatformPackage)EPackage.Registry.INSTANCE.getEPackage(StreamingPlatformPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStreamingPlatformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StreamingPlatformPackageImpl theStreamingPlatformPackage = registeredStreamingPlatformPackage instanceof StreamingPlatformPackageImpl ? (StreamingPlatformPackageImpl)registeredStreamingPlatformPackage : new StreamingPlatformPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStreamingPlatformPackage.createPackageContents();

		// Initialize created meta-data
		theStreamingPlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStreamingPlatformPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StreamingPlatformPackage.eNS_URI, theStreamingPlatformPackage);
		return theStreamingPlatformPackage;
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
	public EAttribute getPlatform_Description() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedRegions() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedLanguages() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedDevices() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlatform_SupportedResolutions() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_Users() {
		return (EReference)platformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatform_Channels() {
		return (EReference)platformEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getChannel_Description() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Streams() {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Clips() {
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
	public EReference getChannel_Donations() {
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
	public EReference getChannel_Emotes() {
		return (EReference)channelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Badges() {
		return (EReference)channelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Owner() {
		return (EReference)channelEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getUser_Description() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Subscriptions() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Donations() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_FollowedChannels() {
		return (EReference)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadge_BadgeID() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmote() {
		return emoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmote_EmoteID() {
		return (EAttribute)emoteEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getStream_StreamID() {
		return (EAttribute)streamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStream_IsLive() {
		return (EAttribute)streamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStream_Viewers() {
		return (EReference)streamEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getClip_ClipID() {
		return (EAttribute)clipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClip_CreatedBy() {
		return (EReference)clipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDonation() {
		return donationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDonation_DonationID() {
		return (EAttribute)donationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDonation_Message() {
		return (EAttribute)donationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSubscription_SubscriptionID() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Tier() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Price() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_Duration() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_AutoRenewal() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_StartDate() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_EndDate() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_Emotes() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_Badge() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getMessage_MessageID() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Content() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getReaction_ReactionID() {
		return (EAttribute)reactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReaction_ReactionType() {
		return (EAttribute)reactionEClass.getEStructuralFeatures().get(1);
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
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Tenure() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_DonationAmount() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Description() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_UnlockCondition() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMediaContent_Title() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_Category() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_Tags() {
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
	public EAttribute getMediaContent_Description() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaContent_Resolutions() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaContent_Messages() {
		return (EReference)mediaContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaContent_Reactions() {
		return (EReference)mediaContentEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getUserInteraction_Timestamp() {
		return (EAttribute)userInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserInteraction_Description() {
		return (EAttribute)userInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserInteraction_User() {
		return (EReference)userInteractionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMonetization_Amount() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_Currency() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_TransactionDate() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_PaymentStatus() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_PaymentMethod() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonetization_Description() {
		return (EAttribute)monetizationEClass.getEStructuralFeatures().get(5);
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
	public EEnum getResolution() {
		return resolutionEEnum;
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
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamingPlatformFactory getStreamingPlatformFactory() {
		return (StreamingPlatformFactory)getEFactoryInstance();
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

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__PLATFORM_ID);
		createEAttribute(platformEClass, PLATFORM__REVENUE);
		createEAttribute(platformEClass, PLATFORM__VERSION);
		createEAttribute(platformEClass, PLATFORM__DESCRIPTION);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_REGIONS);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_LANGUAGES);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_DEVICES);
		createEAttribute(platformEClass, PLATFORM__SUPPORTED_RESOLUTIONS);
		createEReference(platformEClass, PLATFORM__USERS);
		createEReference(platformEClass, PLATFORM__CHANNELS);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL_ID);
		createEAttribute(channelEClass, CHANNEL__DESCRIPTION);
		createEReference(channelEClass, CHANNEL__STREAMS);
		createEReference(channelEClass, CHANNEL__CLIPS);
		createEReference(channelEClass, CHANNEL__MODERATORS);
		createEReference(channelEClass, CHANNEL__FOLLOWERS);
		createEReference(channelEClass, CHANNEL__DONATIONS);
		createEReference(channelEClass, CHANNEL__SUBSCRIPTIONS);
		createEReference(channelEClass, CHANNEL__EMOTES);
		createEReference(channelEClass, CHANNEL__BADGES);
		createEReference(channelEClass, CHANNEL__OWNER);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_ID);
		createEAttribute(userEClass, USER__ROLE);
		createEAttribute(userEClass, USER__AVATAR);
		createEAttribute(userEClass, USER__IS_ONLINE);
		createEAttribute(userEClass, USER__NICKNAME);
		createEAttribute(userEClass, USER__DESCRIPTION);
		createEReference(userEClass, USER__SUBSCRIPTIONS);
		createEReference(userEClass, USER__DONATIONS);
		createEReference(userEClass, USER__FOLLOWED_CHANNELS);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__BADGE_ID);

		emoteEClass = createEClass(EMOTE);
		createEAttribute(emoteEClass, EMOTE__EMOTE_ID);

		streamEClass = createEClass(STREAM);
		createEAttribute(streamEClass, STREAM__STREAM_ID);
		createEAttribute(streamEClass, STREAM__IS_LIVE);
		createEReference(streamEClass, STREAM__VIEWERS);

		clipEClass = createEClass(CLIP);
		createEAttribute(clipEClass, CLIP__CLIP_ID);
		createEReference(clipEClass, CLIP__CREATED_BY);

		donationEClass = createEClass(DONATION);
		createEAttribute(donationEClass, DONATION__DONATION_ID);
		createEAttribute(donationEClass, DONATION__MESSAGE);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__SUBSCRIPTION_ID);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__TIER);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__PRICE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__DURATION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__AUTO_RENEWAL);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__START_DATE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__END_DATE);
		createEReference(subscriptionEClass, SUBSCRIPTION__EMOTES);
		createEReference(subscriptionEClass, SUBSCRIPTION__BADGE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_ID);
		createEAttribute(messageEClass, MESSAGE__CONTENT);

		reactionEClass = createEClass(REACTION);
		createEAttribute(reactionEClass, REACTION__REACTION_ID);
		createEAttribute(reactionEClass, REACTION__REACTION_TYPE);

		auditableEClass = createEClass(AUDITABLE);
		createEAttribute(auditableEClass, AUDITABLE__CREATED_AT);
		createEAttribute(auditableEClass, AUDITABLE__UPDATED_AT);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__TENURE);
		createEAttribute(featureEClass, FEATURE__DONATION_AMOUNT);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);
		createEAttribute(featureEClass, FEATURE__UNLOCK_CONDITION);

		mediaContentEClass = createEClass(MEDIA_CONTENT);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__TITLE);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__CATEGORY);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__TAGS);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__VIEW_COUNT);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__DESCRIPTION);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__RESOLUTIONS);
		createEReference(mediaContentEClass, MEDIA_CONTENT__MESSAGES);
		createEReference(mediaContentEClass, MEDIA_CONTENT__REACTIONS);

		userInteractionEClass = createEClass(USER_INTERACTION);
		createEAttribute(userInteractionEClass, USER_INTERACTION__TIMESTAMP);
		createEAttribute(userInteractionEClass, USER_INTERACTION__DESCRIPTION);
		createEReference(userInteractionEClass, USER_INTERACTION__USER);

		monetizationEClass = createEClass(MONETIZATION);
		createEAttribute(monetizationEClass, MONETIZATION__AMOUNT);
		createEAttribute(monetizationEClass, MONETIZATION__CURRENCY);
		createEAttribute(monetizationEClass, MONETIZATION__TRANSACTION_DATE);
		createEAttribute(monetizationEClass, MONETIZATION__PAYMENT_STATUS);
		createEAttribute(monetizationEClass, MONETIZATION__PAYMENT_METHOD);
		createEAttribute(monetizationEClass, MONETIZATION__DESCRIPTION);

		// Create enums
		subscriptionDurationEEnum = createEEnum(SUBSCRIPTION_DURATION);
		categoryEEnum = createEEnum(CATEGORY);
		currencyEEnum = createEEnum(CURRENCY);
		deviceEEnum = createEEnum(DEVICE);
		languageEEnum = createEEnum(LANGUAGE);
		regionEEnum = createEEnum(REGION);
		resolutionEEnum = createEEnum(RESOLUTION);
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
		paymentStatusEEnum = createEEnum(PAYMENT_STATUS);
		reactionTypeEEnum = createEEnum(REACTION_TYPE);
		roleEEnum = createEEnum(ROLE);
		tierEEnum = createEEnum(TIER);
		unlockConditionEEnum = createEEnum(UNLOCK_CONDITION);

		// Create data types
		uuidEDataType = createEDataType(UUID);
		timestampEDataType = createEDataType(TIMESTAMP);
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
		userEClass.getESuperTypes().add(this.getAuditable());
		userEClass.getESuperTypes().add(this.getNamedElement());
		badgeEClass.getESuperTypes().add(this.getFeature());
		emoteEClass.getESuperTypes().add(this.getFeature());
		streamEClass.getESuperTypes().add(this.getMediaContent());
		clipEClass.getESuperTypes().add(this.getMediaContent());
		donationEClass.getESuperTypes().add(this.getMonetization());
		subscriptionEClass.getESuperTypes().add(this.getMonetization());
		messageEClass.getESuperTypes().add(this.getUserInteraction());
		reactionEClass.getESuperTypes().add(this.getUserInteraction());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		monetizationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_PlatformID(), this.getUUID(), "platformID", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Revenue(), ecorePackage.getEDouble(), "revenue", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Version(), ecorePackage.getEFloat(), "version", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Description(), ecorePackage.getEString(), "description", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedRegions(), this.getRegion(), "supportedRegions", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedLanguages(), this.getLanguage(), "supportedLanguages", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedDevices(), this.getDevice(), "supportedDevices", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_SupportedResolutions(), this.getResolution(), "supportedResolutions", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Users(), this.getUser(), null, "users", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Channels(), this.getChannel(), null, "channels", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_ChannelID(), this.getUUID(), "channelID", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Streams(), this.getStream(), null, "streams", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Clips(), this.getClip(), null, "clips", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Moderators(), this.getUser(), null, "moderators", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Followers(), this.getUser(), this.getUser_FollowedChannels(), "followers", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Donations(), this.getDonation(), null, "donations", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Emotes(), this.getEmote(), null, "emotes", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Badges(), this.getBadge(), null, "badges", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Owner(), this.getUser(), null, "owner", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserID(), this.getUUID(), "userID", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Role(), this.getRole(), "role", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Avatar(), ecorePackage.getEString(), "avatar", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_IsOnline(), ecorePackage.getEBoolean(), "isOnline", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Nickname(), ecorePackage.getEString(), "nickname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Description(), ecorePackage.getEString(), "description", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Donations(), this.getDonation(), null, "donations", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_FollowedChannels(), this.getChannel(), this.getChannel_Followers(), "followedChannels", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_BadgeID(), this.getUUID(), "badgeID", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoteEClass, Emote.class, "Emote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmote_EmoteID(), this.getUUID(), "emoteID", null, 0, 1, Emote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamEClass, Stream.class, "Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStream_StreamID(), this.getUUID(), "streamID", null, 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStream_IsLive(), ecorePackage.getEBoolean(), "isLive", "false", 1, 1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStream_Viewers(), this.getUser(), null, "viewers", null, 0, -1, Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clipEClass, Clip.class, "Clip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClip_ClipID(), this.getUUID(), "clipID", null, 1, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClip_CreatedBy(), this.getUser(), null, "createdBy", null, 1, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donationEClass, Donation.class, "Donation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonation_DonationID(), this.getUUID(), "donationID", null, 1, 1, Donation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDonation_Message(), ecorePackage.getEString(), "message", null, 0, 1, Donation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscription_SubscriptionID(), this.getUUID(), "subscriptionID", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Tier(), this.getTier(), "tier", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Duration(), this.getSubscriptionDuration(), "duration", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_AutoRenewal(), ecorePackage.getEBoolean(), "autoRenewal", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscription_Emotes(), this.getEmote(), null, "emotes", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscription_Badge(), this.getBadge(), null, "badge", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_MessageID(), this.getUUID(), "messageID", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Content(), ecorePackage.getEString(), "content", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReaction_ReactionID(), this.getUUID(), "reactionID", null, 1, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReaction_ReactionType(), this.getReactionType(), "reactionType", null, 1, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableEClass, Auditable.class, "Auditable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuditable_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 1, 1, Auditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuditable_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, Auditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Tenure(), ecorePackage.getEShort(), "tenure", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DonationAmount(), ecorePackage.getEFloat(), "donationAmount", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_UnlockCondition(), this.getUnlockCondition(), "unlockCondition", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaContentEClass, MediaContent.class, "MediaContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaContent_Title(), ecorePackage.getEString(), "title", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Category(), this.getCategory(), "category", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_ViewCount(), ecorePackage.getEInt(), "viewCount", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Description(), ecorePackage.getEString(), "description", null, 0, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaContent_Resolutions(), this.getResolution(), "resolutions", null, 1, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaContent_Messages(), this.getMessage(), null, "messages", null, 0, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaContent_Reactions(), this.getReaction(), null, "reactions", null, 0, -1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInteractionEClass, UserInteraction.class, "UserInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInteraction_Timestamp(), this.getTimestamp(), "timestamp", null, 1, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInteraction_Description(), ecorePackage.getEString(), "description", null, 0, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInteraction_User(), this.getUser(), null, "User", null, 1, 1, UserInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monetizationEClass, Monetization.class, "Monetization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonetization_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_Currency(), this.getCurrency(), "currency", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_TransactionDate(), ecorePackage.getEDate(), "transactionDate", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_PaymentStatus(), this.getPaymentStatus(), "paymentStatus", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_PaymentMethod(), this.getPaymentMethod(), "paymentMethod", null, 1, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonetization_Description(), ecorePackage.getEString(), "description", null, 0, 1, Monetization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(resolutionEEnum, Resolution.class, "Resolution");
		addEEnumLiteral(resolutionEEnum, Resolution.SD);
		addEEnumLiteral(resolutionEEnum, Resolution.HD);
		addEEnumLiteral(resolutionEEnum, Resolution.ULTRA_HD);
		addEEnumLiteral(resolutionEEnum, Resolution.QUAD_HD);
		addEEnumLiteral(resolutionEEnum, Resolution.FULL_HD);

		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.PAYPAL);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.CREDIT_CARD);

		initEEnum(paymentStatusEEnum, PaymentStatus.class, "PaymentStatus");
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.PENDING);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.COMPLETED);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.REJECTED);

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

		// Initialize data types
		initEDataType(uuidEDataType, java.util.UUID.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timestampEDataType, Timestamp.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StreamingPlatformPackageImpl
