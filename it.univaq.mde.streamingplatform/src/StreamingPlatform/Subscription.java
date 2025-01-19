/**
 */
package StreamingPlatform;

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
 *   <li>{@link StreamingPlatform.Subscription#getSubscriptionID <em>Subscription ID</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getTier <em>Tier</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getPrice <em>Price</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getDuration <em>Duration</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getEndDate <em>End Date</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getEmotes <em>Emotes</em>}</li>
 *   <li>{@link StreamingPlatform.Subscription#getBadge <em>Badge</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transactionDateLessThanStartDate'"
 * @generated
 */
public interface Subscription extends Monetization {
	/**
	 * Returns the value of the '<em><b>Subscription ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription ID</em>' attribute.
	 * @see #setSubscriptionID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_SubscriptionID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSubscriptionID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getSubscriptionID <em>Subscription ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription ID</em>' attribute.
	 * @see #getSubscriptionID()
	 * @generated
	 */
	void setSubscriptionID(String value);

	/**
	 * Returns the value of the '<em><b>Tier</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.Tier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tier</em>' attribute.
	 * @see StreamingPlatform.Tier
	 * @see #setTier(Tier)
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_Tier()
	 * @model required="true"
	 * @generated
	 */
	Tier getTier();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getTier <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier</em>' attribute.
	 * @see StreamingPlatform.Tier
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.SubscriptionDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see StreamingPlatform.SubscriptionDuration
	 * @see #setDuration(SubscriptionDuration)
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_Duration()
	 * @model required="true"
	 * @generated
	 */
	SubscriptionDuration getDuration();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see StreamingPlatform.SubscriptionDuration
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_AutoRenewal()
	 * @model required="true"
	 * @generated
	 */
	boolean isAutoRenewal();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}' attribute.
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Emotes</b></em>' reference list.
	 * The list contents are of type {@link StreamingPlatform.Emote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emotes</em>' reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_Emotes()
	 * @model
	 * @generated
	 */
	EList<Emote> getEmotes();

	/**
	 * Returns the value of the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badge</em>' reference.
	 * @see #setBadge(Badge)
	 * @see StreamingPlatform.StreamingPlatformPackage#getSubscription_Badge()
	 * @model required="true"
	 * @generated
	 */
	Badge getBadge();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Subscription#getBadge <em>Badge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Badge</em>' reference.
	 * @see #getBadge()
	 * @generated
	 */
	void setBadge(Badge value);

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
