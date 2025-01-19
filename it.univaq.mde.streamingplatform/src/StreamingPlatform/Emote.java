/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Emote#getEmoteID <em>Emote ID</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getEmote()
 * @model
 * @generated
 */
public interface Emote extends Feature {
	/**
	 * Returns the value of the '<em><b>Emote ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emote ID</em>' attribute.
	 * @see #setEmoteID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getEmote_EmoteID()
	 * @model id="true" dataType="StreamingPlatform.UUID"
	 * @generated
	 */
	String getEmoteID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Emote#getEmoteID <em>Emote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emote ID</em>' attribute.
	 * @see #getEmoteID()
	 * @generated
	 */
	void setEmoteID(String value);

} // Emote
