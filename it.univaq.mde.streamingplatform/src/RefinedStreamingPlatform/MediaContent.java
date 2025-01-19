/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getMediaContentID <em>Media Content ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getTitle <em>Title</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getCategory <em>Category</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getViewCount <em>View Count</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getVideoQualities <em>Video Qualities</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getMessages <em>Messages</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.MediaContent#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent()
 * @model abstract="true"
 * @generated
 */
public interface MediaContent extends Taggable {
	/**
	 * Returns the value of the '<em><b>Media Content ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Content ID</em>' attribute.
	 * @see #setMediaContentID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_MediaContentID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getMediaContentID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.MediaContent#getMediaContentID <em>Media Content ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Content ID</em>' attribute.
	 * @see #getMediaContentID()
	 * @generated
	 */
	void setMediaContentID(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.MediaContent#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see RefinedStreamingPlatform.Category
	 * @see #setCategory(Category)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_Category()
	 * @model required="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.MediaContent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see RefinedStreamingPlatform.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Count</em>' attribute.
	 * @see #setViewCount(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_ViewCount()
	 * @model required="true"
	 * @generated
	 */
	int getViewCount();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.MediaContent#getViewCount <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Count</em>' attribute.
	 * @see #getViewCount()
	 * @generated
	 */
	void setViewCount(int value);

	/**
	 * Returns the value of the '<em><b>Video Qualities</b></em>' attribute list.
	 * The list contents are of type {@link RefinedStreamingPlatform.VideoQuality}.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.VideoQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Qualities</em>' attribute list.
	 * @see RefinedStreamingPlatform.VideoQuality
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_VideoQualities()
	 * @model required="true"
	 * @generated
	 */
	EList<VideoQuality> getVideoQualities();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Reaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getMediaContent_Reactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reaction> getReactions();

} // MediaContent
