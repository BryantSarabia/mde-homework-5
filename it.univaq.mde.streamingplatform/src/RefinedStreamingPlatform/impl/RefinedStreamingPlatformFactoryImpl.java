/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinedStreamingPlatformFactoryImpl extends EFactoryImpl implements RefinedStreamingPlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefinedStreamingPlatformFactory init() {
		try {
			RefinedStreamingPlatformFactory theRefinedStreamingPlatformFactory = (RefinedStreamingPlatformFactory)EPackage.Registry.INSTANCE.getEFactory(RefinedStreamingPlatformPackage.eNS_URI);
			if (theRefinedStreamingPlatformFactory != null) {
				return theRefinedStreamingPlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefinedStreamingPlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStreamingPlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefinedStreamingPlatformPackage.PLATFORM: return createPlatform();
			case RefinedStreamingPlatformPackage.CHANNEL: return createChannel();
			case RefinedStreamingPlatformPackage.USER: return createUser();
			case RefinedStreamingPlatformPackage.FEATURE: return createFeature();
			case RefinedStreamingPlatformPackage.STREAM: return createStream();
			case RefinedStreamingPlatformPackage.CLIP: return createClip();
			case RefinedStreamingPlatformPackage.PLAYLIST: return createPlaylist();
			case RefinedStreamingPlatformPackage.TIP: return createTip();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION: return createSubscription();
			case RefinedStreamingPlatformPackage.MESSAGE: return createMessage();
			case RefinedStreamingPlatformPackage.REACTION: return createReaction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RefinedStreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return createSubscriptionDurationFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.CATEGORY:
				return createCategoryFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.CURRENCY:
				return createCurrencyFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.DEVICE:
				return createDeviceFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.REGION:
				return createRegionFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.VIDEO_QUALITY:
				return createVideoQualityFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.PAYMENT_METHOD:
				return createPaymentMethodFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.PAYMENT_STATUS:
				return createPaymentStatusFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.REACTION_TYPE:
				return createReactionTypeFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.TIER:
				return createTierFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.UNLOCK_CONDITION:
				return createUnlockConditionFromString(eDataType, initialValue);
			case RefinedStreamingPlatformPackage.FEATURE_TYPE:
				return createFeatureTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RefinedStreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return convertSubscriptionDurationToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.CATEGORY:
				return convertCategoryToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.CURRENCY:
				return convertCurrencyToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.DEVICE:
				return convertDeviceToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.REGION:
				return convertRegionToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.VIDEO_QUALITY:
				return convertVideoQualityToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.PAYMENT_METHOD:
				return convertPaymentMethodToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.PAYMENT_STATUS:
				return convertPaymentStatusToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.REACTION_TYPE:
				return convertReactionTypeToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.TIER:
				return convertTierToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.UNLOCK_CONDITION:
				return convertUnlockConditionToString(eDataType, instanceValue);
			case RefinedStreamingPlatformPackage.FEATURE_TYPE:
				return convertFeatureTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clip createClip() {
		ClipImpl clip = new ClipImpl();
		return clip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Playlist createPlaylist() {
		PlaylistImpl playlist = new PlaylistImpl();
		return playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tip createTip() {
		TipImpl tip = new TipImpl();
		return tip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reaction createReaction() {
		ReactionImpl reaction = new ReactionImpl();
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDuration createSubscriptionDurationFromString(EDataType eDataType, String initialValue) {
		SubscriptionDuration result = SubscriptionDuration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionDurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue) {
		Category result = Category.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrencyFromString(EDataType eDataType, String initialValue) {
		Currency result = Currency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDeviceFromString(EDataType eDataType, String initialValue) {
		Device result = Device.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegionFromString(EDataType eDataType, String initialValue) {
		Region result = Region.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoQuality createVideoQualityFromString(EDataType eDataType, String initialValue) {
		VideoQuality result = VideoQuality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVideoQualityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod createPaymentMethodFromString(EDataType eDataType, String initialValue) {
		PaymentMethod result = PaymentMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatus createPaymentStatusFromString(EDataType eDataType, String initialValue) {
		PaymentStatus result = PaymentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionType createReactionTypeFromString(EDataType eDataType, String initialValue) {
		ReactionType result = ReactionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReactionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tier createTierFromString(EDataType eDataType, String initialValue) {
		Tier result = Tier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlockCondition createUnlockConditionFromString(EDataType eDataType, String initialValue) {
		UnlockCondition result = UnlockCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlockConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType createFeatureTypeFromString(EDataType eDataType, String initialValue) {
		FeatureType result = FeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinedStreamingPlatformPackage getRefinedStreamingPlatformPackage() {
		return (RefinedStreamingPlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefinedStreamingPlatformPackage getPackage() {
		return RefinedStreamingPlatformPackage.eINSTANCE;
	}

} //RefinedStreamingPlatformFactoryImpl
