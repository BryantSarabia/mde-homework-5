/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.UserInteraction#getUserInteractionID <em>User Interaction ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.UserInteraction#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUserInteraction()
 * @model abstract="true"
 * @generated
 */
public interface UserInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>User Interaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interaction ID</em>' attribute.
	 * @see #setUserInteractionID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUserInteraction_UserInteractionID()
	 * @model id="true"
	 * @generated
	 */
	int getUserInteractionID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.UserInteraction#getUserInteractionID <em>User Interaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interaction ID</em>' attribute.
	 * @see #getUserInteractionID()
	 * @generated
	 */
	void setUserInteractionID(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUserInteraction_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUserInteraction_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.UserInteraction#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

} // UserInteraction
