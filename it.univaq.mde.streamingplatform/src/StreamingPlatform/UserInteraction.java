/**
 */
package StreamingPlatform;

import java.sql.Timestamp;
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
 *   <li>{@link StreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link StreamingPlatform.UserInteraction#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.UserInteraction#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getUserInteraction()
 * @model abstract="true"
 * @generated
 */
public interface UserInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Timestamp)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUserInteraction_Timestamp()
	 * @model dataType="StreamingPlatform.Timestamp" required="true"
	 * @generated
	 */
	Timestamp getTimestamp();

	/**
	 * Sets the value of the '{@link StreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUserInteraction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.UserInteraction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUserInteraction_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link StreamingPlatform.UserInteraction#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // UserInteraction
