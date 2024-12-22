/**
 */
package StreamingPlatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Feature#getTenure <em>Tenure</em>}</li>
 *   <li>{@link StreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}</li>
 *   <li>{@link StreamingPlatform.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenure</em>' attribute.
	 * @see #setTenure(short)
	 * @see StreamingPlatform.StreamingPlatformPackage#getFeature_Tenure()
	 * @model
	 * @generated
	 */
	short getTenure();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Feature#getTenure <em>Tenure</em>}' attribute.
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getFeature_DonationAmount()
	 * @model
	 * @generated
	 */
	float getDonationAmount();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation Amount</em>' attribute.
	 * @see #getDonationAmount()
	 * @generated
	 */
	void setDonationAmount(float value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Unlock Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.UnlockCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock Condition</em>' attribute.
	 * @see StreamingPlatform.UnlockCondition
	 * @see #setUnlockCondition(UnlockCondition)
	 * @see StreamingPlatform.StreamingPlatformPackage#getFeature_UnlockCondition()
	 * @model required="true"
	 * @generated
	 */
	UnlockCondition getUnlockCondition();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlock Condition</em>' attribute.
	 * @see StreamingPlatform.UnlockCondition
	 * @see #getUnlockCondition()
	 * @generated
	 */
	void setUnlockCondition(UnlockCondition value);

} // Feature
