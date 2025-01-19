/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Playlist#getPlaylistID <em>Playlist ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Playlist#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Playlist ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlist ID</em>' attribute.
	 * @see #setPlaylistID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlaylist_PlaylistID()
	 * @model required="true"
	 * @generated
	 */
	int getPlaylistID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Playlist#getPlaylistID <em>Playlist ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playlist ID</em>' attribute.
	 * @see #getPlaylistID()
	 * @generated
	 */
	void setPlaylistID(int value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.MediaContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlaylist_Media()
	 * @model containment="true"
	 * @generated
	 */
	EList<MediaContent> getMedia();

} // Playlist
