/**
 */
package RefinedStreamingPlatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Feature#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getType <em>Type</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getUrl <em>Url</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getTenure <em>Tenure</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Feature#getEligibilityDescription <em>Eligibility Description</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature ID</em>' attribute.
	 * @see #setFeatureID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_FeatureID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getFeatureID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getFeatureID <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature ID</em>' attribute.
	 * @see #getFeatureID()
	 * @generated
	 */
	void setFeatureID(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.FeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see RefinedStreamingPlatform.FeatureType
	 * @see #setType(FeatureType)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_Type()
	 * @model
	 * @generated
	 */
	FeatureType getType();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see RefinedStreamingPlatform.FeatureType
	 * @see #getType()
	 * @generated
	 */
	void setType(FeatureType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenure</em>' attribute.
	 * @see #setTenure(short)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_Tenure()
	 * @model required="true"
	 * @generated
	 */
	short getTenure();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getTenure <em>Tenure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenure</em>' attribute.
	 * @see #getTenure()
	 * @generated
	 */
	void setTenure(short value);

	/**
	 * Returns the value of the '<em><b>Donation Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation Amount</em>' attribute.
	 * @see #setDonationAmount(float)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_DonationAmount()
	 * @model required="true"
	 * @generated
	 */
	float getDonationAmount();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation Amount</em>' attribute.
	 * @see #getDonationAmount()
	 * @generated
	 */
	void setDonationAmount(float value);

	/**
	 * Returns the value of the '<em><b>Unlock Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.UnlockCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock Condition</em>' attribute.
	 * @see RefinedStreamingPlatform.UnlockCondition
	 * @see #setUnlockCondition(UnlockCondition)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_UnlockCondition()
	 * @model required="true"
	 * @generated
	 */
	UnlockCondition getUnlockCondition();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlock Condition</em>' attribute.
	 * @see RefinedStreamingPlatform.UnlockCondition
	 * @see #getUnlockCondition()
	 * @generated
	 */
	void setUnlockCondition(UnlockCondition value);

	/**
	 * Returns the value of the '<em><b>Eligibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility Description</em>' attribute.
	 * @see #setEligibilityDescription(String)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getFeature_EligibilityDescription()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	String getEligibilityDescription();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Feature#getEligibilityDescription <em>Eligibility Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Description</em>' attribute.
	 * @see #getEligibilityDescription()
	 * @generated
	 */
	void setEligibilityDescription(String value);

} // Feature
