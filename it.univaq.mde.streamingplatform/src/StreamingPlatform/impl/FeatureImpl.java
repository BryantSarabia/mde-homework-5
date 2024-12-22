/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Feature;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.UnlockCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
