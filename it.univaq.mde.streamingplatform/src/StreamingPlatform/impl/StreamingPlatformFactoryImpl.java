/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.*;

import java.sql.Timestamp;
import java.util.UUID;

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
public class StreamingPlatformFactoryImpl extends EFactoryImpl implements StreamingPlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreamingPlatformFactory init() {
		try {
			StreamingPlatformFactory theStreamingPlatformFactory = (StreamingPlatformFactory)EPackage.Registry.INSTANCE.getEFactory(StreamingPlatformPackage.eNS_URI);
			if (theStreamingPlatformFactory != null) {
				return theStreamingPlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StreamingPlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingPlatformFactoryImpl() {
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
			case StreamingPlatformPackage.PLATFORM: return createPlatform();
			case StreamingPlatformPackage.CHANNEL: return createChannel();
			case StreamingPlatformPackage.USER: return createUser();
			case StreamingPlatformPackage.BADGE: return createBadge();
			case StreamingPlatformPackage.EMOTE: return createEmote();
			case StreamingPlatformPackage.STREAM: return createStream();
			case StreamingPlatformPackage.CLIP: return createClip();
			case StreamingPlatformPackage.DONATION: return createDonation();
			case StreamingPlatformPackage.SUBSCRIPTION: return createSubscription();
			case StreamingPlatformPackage.MESSAGE: return createMessage();
			case StreamingPlatformPackage.REACTION: return createReaction();
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
			case StreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return createSubscriptionDurationFromString(eDataType, initialValue);
			case StreamingPlatformPackage.CATEGORY:
				return createCategoryFromString(eDataType, initialValue);
			case StreamingPlatformPackage.CURRENCY:
				return createCurrencyFromString(eDataType, initialValue);
			case StreamingPlatformPackage.DEVICE:
				return createDeviceFromString(eDataType, initialValue);
			case StreamingPlatformPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case StreamingPlatformPackage.REGION:
				return createRegionFromString(eDataType, initialValue);
			case StreamingPlatformPackage.RESOLUTION:
				return createResolutionFromString(eDataType, initialValue);
			case StreamingPlatformPackage.PAYMENT_METHOD:
				return createPaymentMethodFromString(eDataType, initialValue);
			case StreamingPlatformPackage.PAYMENT_STATUS:
				return createPaymentStatusFromString(eDataType, initialValue);
			case StreamingPlatformPackage.REACTION_TYPE:
				return createReactionTypeFromString(eDataType, initialValue);
			case StreamingPlatformPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case StreamingPlatformPackage.TIER:
				return createTierFromString(eDataType, initialValue);
			case StreamingPlatformPackage.UNLOCK_CONDITION:
				return createUnlockConditionFromString(eDataType, initialValue);
			case StreamingPlatformPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
			case StreamingPlatformPackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
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
			case StreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return convertSubscriptionDurationToString(eDataType, instanceValue);
			case StreamingPlatformPackage.CATEGORY:
				return convertCategoryToString(eDataType, instanceValue);
			case StreamingPlatformPackage.CURRENCY:
				return convertCurrencyToString(eDataType, instanceValue);
			case StreamingPlatformPackage.DEVICE:
				return convertDeviceToString(eDataType, instanceValue);
			case StreamingPlatformPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case StreamingPlatformPackage.REGION:
				return convertRegionToString(eDataType, instanceValue);
			case StreamingPlatformPackage.RESOLUTION:
				return convertResolutionToString(eDataType, instanceValue);
			case StreamingPlatformPackage.PAYMENT_METHOD:
				return convertPaymentMethodToString(eDataType, instanceValue);
			case StreamingPlatformPackage.PAYMENT_STATUS:
				return convertPaymentStatusToString(eDataType, instanceValue);
			case StreamingPlatformPackage.REACTION_TYPE:
				return convertReactionTypeToString(eDataType, instanceValue);
			case StreamingPlatformPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case StreamingPlatformPackage.TIER:
				return convertTierToString(eDataType, instanceValue);
			case StreamingPlatformPackage.UNLOCK_CONDITION:
				return convertUnlockConditionToString(eDataType, instanceValue);
			case StreamingPlatformPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
			case StreamingPlatformPackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
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
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emote createEmote() {
		EmoteImpl emote = new EmoteImpl();
		return emote;
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
	public Donation createDonation() {
		DonationImpl donation = new DonationImpl();
		return donation;
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
	public Resolution createResolutionFromString(EDataType eDataType, String initialValue) {
		Resolution result = Resolution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionToString(EDataType eDataType, Object instanceValue) {
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
	public UUID createUUIDFromString(EDataType eDataType, String initialValue) {
		return (UUID)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(EDataType eDataType, String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamingPlatformPackage getStreamingPlatformPackage() {
		return (StreamingPlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StreamingPlatformPackage getPackage() {
		return StreamingPlatformPackage.eINSTANCE;
	}

} //StreamingPlatformFactoryImpl
