/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Currency;
import StreamingPlatform.Monetization;
import StreamingPlatform.PaymentMethod;
import StreamingPlatform.PaymentStatus;
import StreamingPlatform.StreamingPlatformPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monetization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MonetizationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MonetizationImpl extends NamedElementImpl implements Monetization {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final Currency CURRENCY_EDEFAULT = Currency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDate = TRANSACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatus PAYMENT_STATUS_EDEFAULT = PaymentStatus.PENDING;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentStatus paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = PaymentMethod.PAYPAL;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonetizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.MONETIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		Date oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentStatus(PaymentStatus newPaymentStatus) {
		PaymentStatus oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus == null ? PAYMENT_STATUS_EDEFAULT : newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		PaymentMethod oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MONETIZATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.MONETIZATION__AMOUNT:
				return getAmount();
			case StreamingPlatformPackage.MONETIZATION__CURRENCY:
				return getCurrency();
			case StreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				return getTransactionDate();
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				return getPaymentStatus();
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				return getPaymentMethod();
			case StreamingPlatformPackage.MONETIZATION__DESCRIPTION:
				return getDescription();
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
			case StreamingPlatformPackage.MONETIZATION__AMOUNT:
				setAmount((Float)newValue);
				return;
			case StreamingPlatformPackage.MONETIZATION__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case StreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				setPaymentStatus((PaymentStatus)newValue);
				return;
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
				return;
			case StreamingPlatformPackage.MONETIZATION__DESCRIPTION:
				setDescription((String)newValue);
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
			case StreamingPlatformPackage.MONETIZATION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case StreamingPlatformPackage.MONETIZATION__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case StreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
				return;
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
				return;
			case StreamingPlatformPackage.MONETIZATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case StreamingPlatformPackage.MONETIZATION__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case StreamingPlatformPackage.MONETIZATION__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case StreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				return paymentStatus != PAYMENT_STATUS_EDEFAULT;
			case StreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
			case StreamingPlatformPackage.MONETIZATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", currency: ");
		result.append(currency);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", paymentStatus: ");
		result.append(paymentStatus);
		result.append(", paymentMethod: ");
		result.append(paymentMethod);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MonetizationImpl
