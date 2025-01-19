/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Donation#getDonationID <em>Donation ID</em>}</li>
 *   <li>{@link StreamingPlatform.Donation#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getDonation()
 * @model
 * @generated
 */
public interface Donation extends Monetization {
	/**
	 * Returns the value of the '<em><b>Donation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation ID</em>' attribute.
	 * @see #setDonationID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getDonation_DonationID()
	 * @model id="true" dataType="StreamingPlatform.UUID" required="true"
	 * @generated
	 */
	String getDonationID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Donation#getDonationID <em>Donation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation ID</em>' attribute.
	 * @see #getDonationID()
	 * @generated
	 */
	void setDonationID(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getDonation_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Donation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Donation
