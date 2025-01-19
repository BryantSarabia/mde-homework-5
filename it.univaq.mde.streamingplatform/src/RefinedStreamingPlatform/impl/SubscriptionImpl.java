/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Feature;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import RefinedStreamingPlatform.Subscription;
import RefinedStreamingPlatform.SubscriptionDuration;
import RefinedStreamingPlatform.Tier;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getTier <em>Tier</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.SubscriptionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends MonetizationImpl implements Subscription {
	/**
	 * The default value of the '{@link #getTier() <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTier()
	 * @generated
	 * @ordered
	 */
	protected static final Tier TIER_EDEFAULT = Tier.BASIC;

	/**
	 * The cached value of the '{@link #getTier() <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTier()
	 * @generated
	 * @ordered
	 */
	protected Tier tier = TIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final SubscriptionDuration DURATION_EDEFAULT = SubscriptionDuration.MONTHLY;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionDuration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoRenewal() <em>Auto Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRenewal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_RENEWAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoRenewal() <em>Auto Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRenewal()
	 * @generated
	 * @ordered
	 */
	protected boolean autoRenewal = AUTO_RENEWAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tier getTier() {
		return tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTier(Tier newTier) {
		Tier oldTier = tier;
		tier = newTier == null ? TIER_EDEFAULT : newTier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__TIER, oldTier, tier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionDuration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(SubscriptionDuration newDuration) {
		SubscriptionDuration oldDuration = duration;
		duration = newDuration == null ? DURATION_EDEFAULT : newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoRenewal() {
		return autoRenewal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoRenewal(boolean newAutoRenewal) {
		boolean oldAutoRenewal = autoRenewal;
		autoRenewal = newAutoRenewal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL, oldAutoRenewal, autoRenewal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.SUBSCRIPTION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Feature>(Feature.class, this, RefinedStreamingPlatformPackage.SUBSCRIPTION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean startDateLessThanEndDate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Subscription::startDateLessThanEndDate";
		try {
			/**
			 *
			 * inv startDateLessThanEndDate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = startDate <= endDate
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RefinedStreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Date startDate = this.getStartDate();
				final /*@NonInvalid*/ Date endDate = this.getEndDate();
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, startDate, endDate).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RefinedStreamingPlatformTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean transactionDateLessThanStartDate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Subscription::transactionDateLessThanStartDate";
		try {
			/**
			 *
			 * inv transactionDateLessThanStartDate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = transactionDate <= startDate
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RefinedStreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Date transactionDate = this.getTransactionDate();
				final /*@NonInvalid*/ Date startDate = this.getStartDate();
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, transactionDate, startDate).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RefinedStreamingPlatformTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__TIER:
				return getTier();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__PRICE:
				return getPrice();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__DURATION:
				return getDuration();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return isAutoRenewal();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				return getStartDate();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				return getEndDate();
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__TIER:
				setTier((Tier)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__PRICE:
				setPrice((Float)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__DURATION:
				setDuration((SubscriptionDuration)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal((Boolean)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__TIER:
				setTier(TIER_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal(AUTO_RENEWAL_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__FEATURES:
				getFeatures().clear();
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
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__TIER:
				return tier != TIER_EDEFAULT;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__PRICE:
				return price != PRICE_EDEFAULT;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return autoRenewal != AUTO_RENEWAL_EDEFAULT;
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case RefinedStreamingPlatformPackage.SUBSCRIPTION__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RefinedStreamingPlatformPackage.SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP:
				return startDateLessThanEndDate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RefinedStreamingPlatformPackage.SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP:
				return transactionDateLessThanStartDate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (tier: ");
		result.append(tier);
		result.append(", price: ");
		result.append(price);
		result.append(", duration: ");
		result.append(duration);
		result.append(", autoRenewal: ");
		result.append(autoRenewal);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //SubscriptionImpl
