/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Badge#getBadgeID <em>Badge ID</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getBadge()
 * @model
 * @generated
 */
public interface Badge extends Feature {
	/**
	 * Returns the value of the '<em><b>Badge ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badge ID</em>' attribute.
	 * @see #setBadgeID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getBadge_BadgeID()
	 * @model id="true" dataType="StreamingPlatform.UUID"
	 * @generated
	 */
	String getBadgeID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Badge#getBadgeID <em>Badge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Badge ID</em>' attribute.
	 * @see #getBadgeID()
	 * @generated
	 */
	void setBadgeID(String value);

} // Badge
