/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Message#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link StreamingPlatform.Message#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends UserInteraction {
	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMessage_MessageID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Message#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMessage_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Message#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Message
