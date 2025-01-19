/**
 */
package StreamingPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Clip#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link StreamingPlatform.Clip#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getClip()
 * @model
 * @generated
 */
public interface Clip extends MediaContent {
	/**
	 * Returns the value of the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip ID</em>' attribute.
	 * @see #setClipID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getClip_ClipID()
	 * @model id="true" dataType="StreamingPlatform.UUID" required="true"
	 * @generated
	 */
	String getClipID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Clip#getClipID <em>Clip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip ID</em>' attribute.
	 * @see #getClipID()
	 * @generated
	 */
	void setClipID(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see StreamingPlatform.StreamingPlatformPackage#getClip_CreatedBy()
	 * @model required="true"
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Clip#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

} // Clip
