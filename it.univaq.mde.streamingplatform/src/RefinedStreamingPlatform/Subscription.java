/**
 */
package RefinedStreamingPlatform;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getTier <em>Tier</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getPrice <em>Price</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getDuration <em>Duration</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getEndDate <em>End Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transactionDateLessThanStartDate'"
 * @generated
 */
public interface Subscription extends Monetization {
	/**
	 * Returns the value of the '<em><b>Tier</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Tier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tier</em>' attribute.
	 * @see RefinedStreamingPlatform.Tier
	 * @see #setTier(Tier)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_Tier()
	 * @model required="true"
	 * @generated
	 */
	Tier getTier();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#getTier <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier</em>' attribute.
	 * @see RefinedStreamingPlatform.Tier
	 * @see #getTier()
	 * @generated
	 */
	void setTier(Tier value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.SubscriptionDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see RefinedStreamingPlatform.SubscriptionDuration
	 * @see #setDuration(SubscriptionDuration)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_Duration()
	 * @model required="true"
	 * @generated
	 */
	SubscriptionDuration getDuration();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see RefinedStreamingPlatform.SubscriptionDuration
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(SubscriptionDuration value);

	/**
	 * Returns the value of the '<em><b>Auto Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Renewal</em>' attribute.
	 * @see #setAutoRenewal(boolean)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_AutoRenewal()
	 * @model required="true"
	 * @generated
	 */
	boolean isAutoRenewal();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Renewal</em>' attribute.
	 * @see #isAutoRenewal()
	 * @generated
	 */
	void setAutoRenewal(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Subscription#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscription_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='startDate &lt;= endDate'"
	 * @generated
	 */
	boolean startDateLessThanEndDate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='transactionDate &lt;= startDate'"
	 * @generated
	 */
	boolean transactionDateLessThanStartDate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Subscription
