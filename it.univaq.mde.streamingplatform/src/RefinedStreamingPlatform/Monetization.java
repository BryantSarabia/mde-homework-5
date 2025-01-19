/**
 */
package RefinedStreamingPlatform;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monetization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getMonetizationID <em>Monetization ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getAmount <em>Amount</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getCurrency <em>Currency</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveAmount'"
 * @generated
 */
public interface Monetization extends EObject {
	/**
	 * Returns the value of the '<em><b>Monetization ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetization ID</em>' attribute.
	 * @see #setMonetizationID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_MonetizationID()
	 * @model id="true"
	 * @generated
	 */
	int getMonetizationID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getMonetizationID <em>Monetization ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monetization ID</em>' attribute.
	 * @see #getMonetizationID()
	 * @generated
	 */
	void setMonetizationID(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see RefinedStreamingPlatform.Currency
	 * @see #setCurrency(Currency)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_Currency()
	 * @model required="true"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see RefinedStreamingPlatform.Currency
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
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_TransactionDate()
	 * @model required="true"
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.PaymentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see RefinedStreamingPlatform.PaymentStatus
	 * @see #setPaymentStatus(PaymentStatus)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_PaymentStatus()
	 * @model required="true"
	 * @generated
	 */
	PaymentStatus getPaymentStatus();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see RefinedStreamingPlatform.PaymentStatus
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(PaymentStatus value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see RefinedStreamingPlatform.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMonetization_PaymentMethod()
	 * @model required="true"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see RefinedStreamingPlatform.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='amount &gt;= 0.0'"
	 * @generated
	 */
	boolean positiveAmount(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Monetization
