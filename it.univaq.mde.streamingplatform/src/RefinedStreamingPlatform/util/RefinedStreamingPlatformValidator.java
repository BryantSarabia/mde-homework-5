/**
 */
package RefinedStreamingPlatform.util;

import RefinedStreamingPlatform.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage
 * @generated
 */
public class RefinedStreamingPlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RefinedStreamingPlatformValidator INSTANCE = new RefinedStreamingPlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "RefinedStreamingPlatform";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Live Condition' of 'Stream'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREAM__LIVE_CONDITION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Amount' of 'Monetization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MONETIZATION__POSITIVE_AMOUNT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Date Less Than End Date' of 'Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIPTION__START_DATE_LESS_THAN_END_DATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transaction Date Less Than Start Date' of 'Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIPTION__TRANSACTION_DATE_LESS_THAN_START_DATE = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStreamingPlatformValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RefinedStreamingPlatformPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RefinedStreamingPlatformPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.TAGGABLE:
				return validateTaggable((Taggable)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.AUDITABLE:
				return validateAuditable((Auditable)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.PLATFORM:
				return validatePlatform((Platform)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT:
				return validateMediaContent((MediaContent)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.STREAM:
				return validateStream((Stream)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.CLIP:
				return validateClip((Clip)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.PLAYLIST:
				return validatePlaylist((Playlist)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.MONETIZATION:
				return validateMonetization((Monetization)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.TIP:
				return validateTip((Tip)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.USER_INTERACTION:
				return validateUserInteraction((UserInteraction)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.REACTION:
				return validateReaction((Reaction)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return validateSubscriptionDuration((SubscriptionDuration)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.VIDEO_QUALITY:
				return validateVideoQuality((VideoQuality)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.PAYMENT_METHOD:
				return validatePaymentMethod((PaymentMethod)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.PAYMENT_STATUS:
				return validatePaymentStatus((PaymentStatus)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.REACTION_TYPE:
				return validateReactionType((ReactionType)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.TIER:
				return validateTier((Tier)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.UNLOCK_CONDITION:
				return validateUnlockCondition((UnlockCondition)value, diagnostics, context);
			case RefinedStreamingPlatformPackage.FEATURE_TYPE:
				return validateFeatureType((FeatureType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaggable(Taggable taggable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taggable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditable(Auditable auditable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaContent(MediaContent mediaContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mediaContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStream(Stream stream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stream, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stream, diagnostics, context);
		if (result || diagnostics != null) result &= validateStream_liveCondition(stream, diagnostics, context);
		return result;
	}

	/**
	 * Validates the liveCondition constraint of '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStream_liveCondition(Stream stream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stream.liveCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClip(Clip clip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clip, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaylist(Playlist playlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playlist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonetization(Monetization monetization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(monetization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(monetization, diagnostics, context);
		if (result || diagnostics != null) result &= validateMonetization_positiveAmount(monetization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positiveAmount constraint of '<em>Monetization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonetization_positiveAmount(Monetization monetization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return monetization.positiveAmount(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTip(Tip tip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tip, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tip, diagnostics, context);
		if (result || diagnostics != null) result &= validateMonetization_positiveAmount(tip, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subscription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateMonetization_positiveAmount(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscription_transactionDateLessThanStartDate(subscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscription_startDateLessThanEndDate(subscription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the transactionDateLessThanStartDate constraint of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription_transactionDateLessThanStartDate(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscription.transactionDateLessThanStartDate(diagnostics, context);
	}

	/**
	 * Validates the startDateLessThanEndDate constraint of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription_startDateLessThanEndDate(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscription.startDateLessThanEndDate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserInteraction(UserInteraction userInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReaction(Reaction reaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionDuration(SubscriptionDuration subscriptionDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoQuality(VideoQuality videoQuality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMethod(PaymentMethod paymentMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentStatus(PaymentStatus paymentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionType(ReactionType reactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTier(Tier tier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockCondition(UnlockCondition unlockCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureType(FeatureType featureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RefinedStreamingPlatformValidator
