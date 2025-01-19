/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Feature;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.StreamingPlatformTables;
import StreamingPlatform.UnlockCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.FeatureImpl#getTenure <em>Tenure</em>}</li>
 *   <li>{@link StreamingPlatform.impl.FeatureImpl#getDonationAmount <em>Donation Amount</em>}</li>
 *   <li>{@link StreamingPlatform.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.impl.FeatureImpl#getUnlockCondition <em>Unlock Condition</em>}</li>
 *   <li>{@link StreamingPlatform.impl.FeatureImpl#getEligibilityDescription <em>Eligibility Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The default value of the '{@link #getTenure() <em>Tenure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenure()
	 * @generated
	 * @ordered
	 */
	protected static final short TENURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTenure() <em>Tenure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenure()
	 * @generated
	 * @ordered
	 */
	protected short tenure = TENURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDonationAmount() <em>Donation Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float DONATION_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDonationAmount() <em>Donation Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationAmount()
	 * @generated
	 * @ordered
	 */
	protected float donationAmount = DONATION_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnlockCondition() <em>Unlock Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlockCondition()
	 * @generated
	 * @ordered
	 */
	protected static final UnlockCondition UNLOCK_CONDITION_EDEFAULT = UnlockCondition.DONATION_AMOUNT;

	/**
	 * The cached value of the '{@link #getUnlockCondition() <em>Unlock Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlockCondition()
	 * @generated
	 * @ordered
	 */
	protected UnlockCondition unlockCondition = UNLOCK_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEligibilityDescription() <em>Eligibility Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ELIGIBILITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getTenure() {
		return tenure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenure(short newTenure) {
		short oldTenure = tenure;
		tenure = newTenure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.FEATURE__TENURE, oldTenure, tenure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDonationAmount() {
		return donationAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDonationAmount(float newDonationAmount) {
		float oldDonationAmount = donationAmount;
		donationAmount = newDonationAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.FEATURE__DONATION_AMOUNT, oldDonationAmount, donationAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlockCondition getUnlockCondition() {
		return unlockCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnlockCondition(UnlockCondition newUnlockCondition) {
		UnlockCondition oldUnlockCondition = unlockCondition;
		unlockCondition = newUnlockCondition == null ? UNLOCK_CONDITION_EDEFAULT : newUnlockCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.FEATURE__UNLOCK_CONDITION, oldUnlockCondition, unlockCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEligibilityDescription() {
		/**
		 *
		 * if unlockCondition = UnlockCondition::DonationAmount
		 * then 'Requires a donation of at least ' +
		 *   donationAmount.toString() + ' currency units'
		 * else 'Requires a tenure of ' + tenure.toString() + ' months'
		 * endif
		 */
		final /*@NonInvalid*/ UnlockCondition unlockCondition = this.getUnlockCondition();
		final /*@NonInvalid*/ EnumerationLiteralId BOXED_unlockCondition = StreamingPlatformTables.ENUMid_UnlockCondition.getEnumerationLiteralId(ClassUtil.nonNullState(unlockCondition.getName()));
		final /*@NonInvalid*/ boolean eq = BOXED_unlockCondition == StreamingPlatformTables.ELITid_DonationAmount;
		/*@NonInvalid*/ String IF_eq;
		if (eq) {
			final /*@NonInvalid*/ float donationAmount = this.getDonationAmount();
			final /*@NonInvalid*/ RealValue BOXED_donationAmount = ValueUtil.realValueOf(donationAmount);
			final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_donationAmount);
			final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(StreamingPlatformTables.STR_Requires_32_a_32_donation_32_of_32_at_32_least_32, toString);
			final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, StreamingPlatformTables.STR__32_currency_32_units);
			IF_eq = sum_0;
		}
		else {
			final /*@NonInvalid*/ short tenure = this.getTenure();
			final /*@NonInvalid*/ IntegerValue BOXED_tenure = ValueUtil.integerValueOf(tenure);
			final /*@NonInvalid*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_tenure);
			final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(StreamingPlatformTables.STR_Requires_32_a_32_tenure_32_of_32, toString_0);
			final /*@NonInvalid*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, StreamingPlatformTables.STR__32_months);
			IF_eq = sum_2;
		}
		return IF_eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEligibilityDescription(String newEligibilityDescription) {
		// TODO: implement this method to set the 'Eligibility Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.FEATURE__TENURE:
				return getTenure();
			case StreamingPlatformPackage.FEATURE__DONATION_AMOUNT:
				return getDonationAmount();
			case StreamingPlatformPackage.FEATURE__DESCRIPTION:
				return getDescription();
			case StreamingPlatformPackage.FEATURE__UNLOCK_CONDITION:
				return getUnlockCondition();
			case StreamingPlatformPackage.FEATURE__ELIGIBILITY_DESCRIPTION:
				return getEligibilityDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamingPlatformPackage.FEATURE__TENURE:
				setTenure((Short)newValue);
				return;
			case StreamingPlatformPackage.FEATURE__DONATION_AMOUNT:
				setDonationAmount((Float)newValue);
				return;
			case StreamingPlatformPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StreamingPlatformPackage.FEATURE__UNLOCK_CONDITION:
				setUnlockCondition((UnlockCondition)newValue);
				return;
			case StreamingPlatformPackage.FEATURE__ELIGIBILITY_DESCRIPTION:
				setEligibilityDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StreamingPlatformPackage.FEATURE__TENURE:
				setTenure(TENURE_EDEFAULT);
				return;
			case StreamingPlatformPackage.FEATURE__DONATION_AMOUNT:
				setDonationAmount(DONATION_AMOUNT_EDEFAULT);
				return;
			case StreamingPlatformPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StreamingPlatformPackage.FEATURE__UNLOCK_CONDITION:
				setUnlockCondition(UNLOCK_CONDITION_EDEFAULT);
				return;
			case StreamingPlatformPackage.FEATURE__ELIGIBILITY_DESCRIPTION:
				setEligibilityDescription(ELIGIBILITY_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StreamingPlatformPackage.FEATURE__TENURE:
				return tenure != TENURE_EDEFAULT;
			case StreamingPlatformPackage.FEATURE__DONATION_AMOUNT:
				return donationAmount != DONATION_AMOUNT_EDEFAULT;
			case StreamingPlatformPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StreamingPlatformPackage.FEATURE__UNLOCK_CONDITION:
				return unlockCondition != UNLOCK_CONDITION_EDEFAULT;
			case StreamingPlatformPackage.FEATURE__ELIGIBILITY_DESCRIPTION:
				return ELIGIBILITY_DESCRIPTION_EDEFAULT == null ? getEligibilityDescription() != null : !ELIGIBILITY_DESCRIPTION_EDEFAULT.equals(getEligibilityDescription());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tenure: ");
		result.append(tenure);
		result.append(", donationAmount: ");
		result.append(donationAmount);
		result.append(", description: ");
		result.append(description);
		result.append(", unlockCondition: ");
		result.append(unlockCondition);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
