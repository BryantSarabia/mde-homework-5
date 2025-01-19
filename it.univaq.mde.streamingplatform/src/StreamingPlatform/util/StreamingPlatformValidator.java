/**
 */
package StreamingPlatform.util;

import StreamingPlatform.*;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage
 * @generated
 */
public class StreamingPlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StreamingPlatformValidator INSTANCE = new StreamingPlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "StreamingPlatform";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Live Condition' of 'Stream'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREAM__LIVE_CONDITION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Date Less Than End Date' of 'Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIPTION__START_DATE_LESS_THAN_END_DATE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transaction Date Less Than Start Date' of 'Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIPTION__TRANSACTION_DATE_LESS_THAN_START_DATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Amount' of 'Monetization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MONETIZATION__POSITIVE_AMOUNT = 4;

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
	public StreamingPlatformValidator() {
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
	  return StreamingPlatformPackage.eINSTANCE;
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
			case StreamingPlatformPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case StreamingPlatformPackage.PLATFORM:
				return validatePlatform((Platform)value, diagnostics, context);
			case StreamingPlatformPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case StreamingPlatformPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case StreamingPlatformPackage.BADGE:
				return validateBadge((Badge)value, diagnostics, context);
			case StreamingPlatformPackage.EMOTE:
				return validateEmote((Emote)value, diagnostics, context);
			case StreamingPlatformPackage.STREAM:
				return validateStream((Stream)value, diagnostics, context);
			case StreamingPlatformPackage.CLIP:
				return validateClip((Clip)value, diagnostics, context);
			case StreamingPlatformPackage.DONATION:
				return validateDonation((Donation)value, diagnostics, context);
			case StreamingPlatformPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case StreamingPlatformPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case StreamingPlatformPackage.REACTION:
				return validateReaction((Reaction)value, diagnostics, context);
			case StreamingPlatformPackage.AUDITABLE:
				return validateAuditable((Auditable)value, diagnostics, context);
			case StreamingPlatformPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case StreamingPlatformPackage.MEDIA_CONTENT:
				return validateMediaContent((MediaContent)value, diagnostics, context);
			case StreamingPlatformPackage.USER_INTERACTION:
				return validateUserInteraction((UserInteraction)value, diagnostics, context);
			case StreamingPlatformPackage.MONETIZATION:
				return validateMonetization((Monetization)value, diagnostics, context);
			case StreamingPlatformPackage.SUBSCRIPTION_DURATION:
				return validateSubscriptionDuration((SubscriptionDuration)value, diagnostics, context);
			case StreamingPlatformPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case StreamingPlatformPackage.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case StreamingPlatformPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case StreamingPlatformPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case StreamingPlatformPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case StreamingPlatformPackage.RESOLUTION:
				return validateResolution((Resolution)value, diagnostics, context);
			case StreamingPlatformPackage.PAYMENT_METHOD:
				return validatePaymentMethod((PaymentMethod)value, diagnostics, context);
			case StreamingPlatformPackage.PAYMENT_STATUS:
				return validatePaymentStatus((PaymentStatus)value, diagnostics, context);
			case StreamingPlatformPackage.REACTION_TYPE:
				return validateReactionType((ReactionType)value, diagnostics, context);
			case StreamingPlatformPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case StreamingPlatformPackage.TIER:
				return validateTier((Tier)value, diagnostics, context);
			case StreamingPlatformPackage.UNLOCK_CONDITION:
				return validateUnlockCondition((UnlockCondition)value, diagnostics, context);
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
	public boolean validateBadge(Badge badge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(badge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmote(Emote emote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emote, diagnostics, context);
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
	public boolean validateDonation(Donation donation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(donation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(donation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMonetization_positiveAmount(donation, diagnostics, context);
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
	public boolean validateAuditable(Auditable auditable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditable, diagnostics, context);
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
	public boolean validateUserInteraction(UserInteraction userInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userInteraction, diagnostics, context);
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
	public boolean validateResolution(Resolution resolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //StreamingPlatformValidator
