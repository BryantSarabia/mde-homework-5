/**
 */
package StreamingPlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.MediaContent#getTitle <em>Title</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getCategory <em>Category</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getTags <em>Tags</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getViewCount <em>View Count</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getResolutions <em>Resolutions</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getMessages <em>Messages</em>}</li>
 *   <li>{@link StreamingPlatform.MediaContent#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent()
 * @model abstract="true"
 * @generated
 */
public interface MediaContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link StreamingPlatform.MediaContent#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link StreamingPlatform.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see StreamingPlatform.Category
	 * @see #setCategory(Category)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Category()
	 * @model required="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link StreamingPlatform.MediaContent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see StreamingPlatform.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Count</em>' attribute.
	 * @see #setViewCount(int)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_ViewCount()
	 * @model required="true"
	 * @generated
	 */
	int getViewCount();

	/**
	 * Sets the value of the '{@link StreamingPlatform.MediaContent#getViewCount <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Count</em>' attribute.
	 * @see #getViewCount()
	 * @generated
	 */
	void setViewCount(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.MediaContent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Resolutions</b></em>' attribute list.
	 * The list contents are of type {@link StreamingPlatform.Resolution}.
	 * The literals are from the enumeration {@link StreamingPlatform.Resolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolutions</em>' attribute list.
	 * @see StreamingPlatform.Resolution
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Resolutions()
	 * @model required="true"
	 * @generated
	 */
	EList<Resolution> getResolutions();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Reaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getMediaContent_Reactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reaction> getReactions();

} // MediaContent
