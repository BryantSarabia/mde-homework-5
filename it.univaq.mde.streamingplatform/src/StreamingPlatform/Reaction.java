/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Reaction#getReactionID <em>Reaction ID</em>}</li>
 *   <li>{@link StreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends UserInteraction {
	/**
	 * Returns the value of the '<em><b>Reaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction ID</em>' attribute.
	 * @see #setReactionID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getReaction_ReactionID()
	 * @model id="true" dataType="StreamingPlatform.UUID" required="true"
	 * @generated
	 */
	String getReactionID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Reaction#getReactionID <em>Reaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction ID</em>' attribute.
	 * @see #getReactionID()
	 * @generated
	 */
	void setReactionID(String value);

	/**
	 * Returns the value of the '<em><b>Reaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.ReactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction Type</em>' attribute.
	 * @see StreamingPlatform.ReactionType
	 * @see #setReactionType(ReactionType)
	 * @see StreamingPlatform.StreamingPlatformPackage#getReaction_ReactionType()
	 * @model required="true"
	 * @generated
	 */
	ReactionType getReactionType();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction Type</em>' attribute.
	 * @see StreamingPlatform.ReactionType
	 * @see #getReactionType()
	 * @generated
	 */
	void setReactionType(ReactionType value);

} // Reaction
