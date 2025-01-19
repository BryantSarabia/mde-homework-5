/**
 */
package RefinedStreamingPlatform;

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
 *   <li>{@link RefinedStreamingPlatform.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getRole <em>Role</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#isIsOnline <em>Is Online</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getNickname <em>Nickname</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getTips <em>Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Auditable, NamedElement {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_UserID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see RefinedStreamingPlatform.Role
	 * @see #setRole(Role)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.User#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see RefinedStreamingPlatform.Role
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
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_Avatar()
	 * @model
	 * @generated
	 */
	String getAvatar();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.User#getAvatar <em>Avatar</em>}' attribute.
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
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_IsOnline()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOnline();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.User#isIsOnline <em>Is Online</em>}' attribute.
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
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_Nickname()
	 * @model required="true"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.User#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_Subscriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Tips</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Tip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tips</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_Tips()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tip> getTips();

	/**
	 * Returns the value of the '<em><b>Followed Channels</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Channel}.
	 * It is bidirectional and its opposite is '{@link RefinedStreamingPlatform.Channel#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followed Channels</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getUser_FollowedChannels()
	 * @see RefinedStreamingPlatform.Channel#getFollowers
	 * @model opposite="followers"
	 * @generated
	 */
	EList<Channel> getFollowedChannels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tips-&gt;collect(t | t.amount)-&gt;sum()'"
	 * @generated
	 */
	float totalTips();

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='subscriptions-&gt;collect(s | s.amount)-&gt;sum() +\n                  tips-&gt;collect(t | t.amount)-&gt;sum()'"
	 * @generated
	 */
	float totalSpending();

} // User
