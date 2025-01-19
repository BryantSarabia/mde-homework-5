/**
 */
package RefinedStreamingPlatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Clip#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getClip()
 * @model
 * @generated
 */
public interface Clip extends MediaContent {
	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getClip_CreatedBy()
	 * @model required="true"
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Clip#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

} // Clip
