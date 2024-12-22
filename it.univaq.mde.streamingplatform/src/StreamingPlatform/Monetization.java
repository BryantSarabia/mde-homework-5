/**
 */
package StreamingPlatform;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monetization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Monetization#getAmount <em>Amount</em>}</li>
 *   <li>{@link StreamingPlatform.Monetization#getCurrency <em>Currency</em>}</li>
 *   <li>{@link StreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link StreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link StreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link StreamingPlatform.Monetization#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization()
 * @model abstract="true"
 * @generated
 */
public interface Monetization extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see StreamingPlatform.Currency
	 * @see #setCurrency(Currency)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_Currency()
	 * @model required="true"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see StreamingPlatform.Currency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_TransactionDate()
	 * @model required="true"
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.PaymentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see StreamingPlatform.PaymentStatus
	 * @see #setPaymentStatus(PaymentStatus)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_PaymentStatus()
	 * @model required="true"
	 * @generated
	 */
	PaymentStatus getPaymentStatus();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see StreamingPlatform.PaymentStatus
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(PaymentStatus value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see StreamingPlatform.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_PaymentMethod()
	 * @model required="true"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see StreamingPlatform.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMonetization_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Monetization#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Monetization
