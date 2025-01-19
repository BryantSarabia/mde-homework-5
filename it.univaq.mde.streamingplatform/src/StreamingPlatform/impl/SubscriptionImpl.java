/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Badge;
import StreamingPlatform.Emote;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.StreamingPlatformTables;
import StreamingPlatform.Subscription;
import StreamingPlatform.SubscriptionDuration;
import StreamingPlatform.Tier;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getSubscriptionID <em>Subscription ID</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getTier <em>Tier</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getEmotes <em>Emotes</em>}</li>
 *   <li>{@link StreamingPlatform.impl.SubscriptionImpl#getBadge <em>Badge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends MonetizationImpl implements Subscription {
	/**
	 * The default value of the '{@link #getSubscriptionID() <em>Subscription ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionID() <em>Subscription ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionID()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionID = SUBSCRIPTION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getEmotes() <em>Emotes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Emote> emotes;

	/**
	 * The cached value of the '{@link #getBadge() <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadge()
	 * @generated
	 * @ordered
	 */
	protected Badge badge;

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
		return StreamingPlatformPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionID() {
		return subscriptionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionID(String newSubscriptionID) {
		String oldSubscriptionID = subscriptionID;
		subscriptionID = newSubscriptionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__SUBSCRIPTION_ID, oldSubscriptionID, subscriptionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__TIER, oldTier, tier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL, oldAutoRenewal, autoRenewal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Emote> getEmotes() {
		if (emotes == null) {
			emotes = new EObjectResolvingEList<Emote>(Emote.class, this, StreamingPlatformPackage.SUBSCRIPTION__EMOTES);
		}
		return emotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Badge getBadge() {
		if (badge != null && badge.eIsProxy()) {
			InternalEObject oldBadge = (InternalEObject)badge;
			badge = (Badge)eResolveProxy(oldBadge);
			if (badge != oldBadge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StreamingPlatformPackage.SUBSCRIPTION__BADGE, oldBadge, badge));
			}
		}
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Badge basicGetBadge() {
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBadge(Badge newBadge) {
		Badge oldBadge = badge;
		badge = newBadge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.SUBSCRIPTION__BADGE, oldBadge, badge));
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, StreamingPlatformPackage.Literals.SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, StreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Date startDate = this.getStartDate();
				final /*@NonInvalid*/ Date endDate = this.getEndDate();
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, startDate, endDate).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, StreamingPlatformTables.INT_0).booleanValue();
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, StreamingPlatformPackage.Literals.SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, StreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Date transactionDate = this.getTransactionDate();
				final /*@NonInvalid*/ Date startDate = this.getStartDate();
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, transactionDate, startDate).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, StreamingPlatformTables.INT_0).booleanValue();
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
			case StreamingPlatformPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				return getSubscriptionID();
			case StreamingPlatformPackage.SUBSCRIPTION__TIER:
				return getTier();
			case StreamingPlatformPackage.SUBSCRIPTION__PRICE:
				return getPrice();
			case StreamingPlatformPackage.SUBSCRIPTION__DURATION:
				return getDuration();
			case StreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return isAutoRenewal();
			case StreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				return getStartDate();
			case StreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				return getEndDate();
			case StreamingPlatformPackage.SUBSCRIPTION__EMOTES:
				return getEmotes();
			case StreamingPlatformPackage.SUBSCRIPTION__BADGE:
				if (resolve) return getBadge();
				return basicGetBadge();
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
			case StreamingPlatformPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				setSubscriptionID((String)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__TIER:
				setTier((Tier)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__PRICE:
				setPrice((Float)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__DURATION:
				setDuration((SubscriptionDuration)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal((Boolean)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__EMOTES:
				getEmotes().clear();
				getEmotes().addAll((Collection<? extends Emote>)newValue);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__BADGE:
				setBadge((Badge)newValue);
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
			case StreamingPlatformPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				setSubscriptionID(SUBSCRIPTION_ID_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__TIER:
				setTier(TIER_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal(AUTO_RENEWAL_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__EMOTES:
				getEmotes().clear();
				return;
			case StreamingPlatformPackage.SUBSCRIPTION__BADGE:
				setBadge((Badge)null);
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
			case StreamingPlatformPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscriptionID != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscriptionID);
			case StreamingPlatformPackage.SUBSCRIPTION__TIER:
				return tier != TIER_EDEFAULT;
			case StreamingPlatformPackage.SUBSCRIPTION__PRICE:
				return price != PRICE_EDEFAULT;
			case StreamingPlatformPackage.SUBSCRIPTION__DURATION:
				return duration != DURATION_EDEFAULT;
			case StreamingPlatformPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return autoRenewal != AUTO_RENEWAL_EDEFAULT;
			case StreamingPlatformPackage.SUBSCRIPTION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case StreamingPlatformPackage.SUBSCRIPTION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case StreamingPlatformPackage.SUBSCRIPTION__EMOTES:
				return emotes != null && !emotes.isEmpty();
			case StreamingPlatformPackage.SUBSCRIPTION__BADGE:
				return badge != null;
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
			case StreamingPlatformPackage.SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP:
				return startDateLessThanEndDate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case StreamingPlatformPackage.SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (subscriptionID: ");
		result.append(subscriptionID);
		result.append(", tier: ");
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
