/**
 */
package StreamingPlatform;

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Stream#getStreamID <em>Stream ID</em>}</li>
 *   <li>{@link StreamingPlatform.Stream#isIsLive <em>Is Live</em>}</li>
 *   <li>{@link StreamingPlatform.Stream#getViewers <em>Viewers</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends MediaContent {
	/**
	 * Returns the value of the '<em><b>Stream ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream ID</em>' attribute.
	 * @see #setStreamID(UUID)
	 * @see StreamingPlatform.StreamingPlatformPackage#getStream_StreamID()
	 * @model id="true" dataType="StreamingPlatform.UUID" required="true"
	 * @generated
	 */
	UUID getStreamID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Stream#getStreamID <em>Stream ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream ID</em>' attribute.
	 * @see #getStreamID()
	 * @generated
	 */
	void setStreamID(UUID value);

	/**
	 * Returns the value of the '<em><b>Is Live</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Live</em>' attribute.
	 * @see #setIsLive(boolean)
	 * @see StreamingPlatform.StreamingPlatformPackage#getStream_IsLive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLive();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Stream#isIsLive <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Live</em>' attribute.
	 * @see #isIsLive()
	 * @generated
	 */
	void setIsLive(boolean value);

	/**
	 * Returns the value of the '<em><b>Viewers</b></em>' reference list.
	 * The list contents are of type {@link StreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewers</em>' reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getStream_Viewers()
	 * @model
	 * @generated
	 */
	EList<User> getViewers();

} // Stream
