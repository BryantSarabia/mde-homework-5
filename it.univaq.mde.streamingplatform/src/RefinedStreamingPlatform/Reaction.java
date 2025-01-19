/**
 */
package RefinedStreamingPlatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends UserInteraction {
	/**
	 * Returns the value of the '<em><b>Reaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.ReactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction Type</em>' attribute.
	 * @see RefinedStreamingPlatform.ReactionType
	 * @see #setReactionType(ReactionType)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getReaction_ReactionType()
	 * @model required="true"
	 * @generated
	 */
	ReactionType getReactionType();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction Type</em>' attribute.
	 * @see RefinedStreamingPlatform.ReactionType
	 * @see #getReactionType()
	 * @generated
	 */
	void setReactionType(ReactionType value);

} // Reaction
