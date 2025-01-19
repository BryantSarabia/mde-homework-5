/**
 */
package StreamingPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link StreamingPlatform.User#getRole <em>Role</em>}</li>
 *   <li>{@link StreamingPlatform.User#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link StreamingPlatform.User#isIsOnline <em>Is Online</em>}</li>
 *   <li>{@link StreamingPlatform.User#getNickname <em>Nickname</em>}</li>
 *   <li>{@link StreamingPlatform.User#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.User#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link StreamingPlatform.User#getDonations <em>Donations</em>}</li>
 *   <li>{@link StreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Auditable, NamedElement {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_UserID()
	 * @model id="true" dataType="StreamingPlatform.UUID" required="true"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see StreamingPlatform.Role
	 * @see #setRole(Role)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see StreamingPlatform.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar</em>' attribute.
	 * @see #setAvatar(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Avatar()
	 * @model
	 * @generated
	 */
	String getAvatar();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#getAvatar <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar</em>' attribute.
	 * @see #getAvatar()
	 * @generated
	 */
	void setAvatar(String value);

	/**
	 * Returns the value of the '<em><b>Is Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Online</em>' attribute.
	 * @see #setIsOnline(boolean)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_IsOnline()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOnline();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#isIsOnline <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Online</em>' attribute.
	 * @see #isIsOnline()
	 * @generated
	 */
	void setIsOnline(boolean value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Nickname()
	 * @model required="true"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.User#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Subscriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Donations</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Donation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donations</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_Donations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Donation> getDonations();

	/**
	 * Returns the value of the '<em><b>Followed Channels</b></em>' reference list.
	 * The list contents are of type {@link StreamingPlatform.Channel}.
	 * It is bidirectional and its opposite is '{@link StreamingPlatform.Channel#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followed Channels</em>' reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getUser_FollowedChannels()
	 * @see StreamingPlatform.Channel#getFollowers
	 * @model opposite="followers"
	 * @generated
	 */
	EList<Channel> getFollowedChannels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='donations-&gt;collect(d | d.amount)-&gt;sum()'"
	 * @generated
	 */
	float totalDonations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" channelRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='followedChannels-&gt;includes(channel)'"
	 * @generated
	 */
	boolean isFollowing(Channel channel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='subscriptions-&gt;collect(s | s.amount)-&gt;sum() +\n          \t\t\tdonations-&gt;collect(d | d.amount)-&gt;sum()'"
	 * @generated
	 */
	float totalSpending();

} // User
