/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Channel#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getStreams <em>Streams</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getClips <em>Clips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getPlaylists <em>Playlists</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getModerators <em>Moderators</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getFollowers <em>Followers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getTips <em>Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getFeatures <em>Features</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getOwner <em>Owner</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getTotalTips <em>Total Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getTotalFollowers <em>Total Followers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Channel#getTotalViews <em>Total Views</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Auditable, NamedElement, Taggable {
	/**
	 * Returns the value of the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel ID</em>' attribute.
	 * @see #setChannelID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_ChannelID()
	 * @model id="true"
	 * @generated
	 */
	int getChannelID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Channel#getChannelID <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel ID</em>' attribute.
	 * @see #getChannelID()
	 * @generated
	 */
	void setChannelID(int value);

	/**
	 * Returns the value of the '<em><b>Streams</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Stream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streams</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Streams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stream> getStreams();

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Clip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Clips()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clip> getClips();

	/**
	 * Returns the value of the '<em><b>Playlists</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlists</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Playlists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Playlist> getPlaylists();

	/**
	 * Returns the value of the '<em><b>Moderators</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderators</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Moderators()
	 * @model
	 * @generated
	 */
	EList<User> getModerators();

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.User}.
	 * It is bidirectional and its opposite is '{@link RefinedStreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Followers()
	 * @see RefinedStreamingPlatform.User#getFollowedChannels
	 * @model opposite="followedChannels"
	 * @generated
	 */
	EList<User> getFollowers();

	/**
	 * Returns the value of the '<em><b>Tips</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Tip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tips</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Tips()
	 * @model
	 * @generated
	 */
	EList<Tip> getTips();

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Subscriptions()
	 * @model
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_Owner()
	 * @model required="true"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Channel#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Total Tips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Tips</em>' attribute.
	 * @see #setTotalTips(float)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_TotalTips()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalTips();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Channel#getTotalTips <em>Total Tips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Tips</em>' attribute.
	 * @see #getTotalTips()
	 * @generated
	 */
	void setTotalTips(float value);

	/**
	 * Returns the value of the '<em><b>Total Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Followers</em>' attribute.
	 * @see #setTotalFollowers(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_TotalFollowers()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalFollowers();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Channel#getTotalFollowers <em>Total Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Followers</em>' attribute.
	 * @see #getTotalFollowers()
	 * @generated
	 */
	void setTotalFollowers(int value);

	/**
	 * Returns the value of the '<em><b>Total Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Views</em>' attribute.
	 * @see #setTotalViews(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getChannel_TotalViews()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalViews();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Channel#getTotalViews <em>Total Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Views</em>' attribute.
	 * @see #getTotalViews()
	 * @generated
	 */
	void setTotalViews(int value);

} // Channel
