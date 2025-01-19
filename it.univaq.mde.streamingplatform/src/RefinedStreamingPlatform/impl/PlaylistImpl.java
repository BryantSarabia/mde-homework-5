/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.MediaContent;
import RefinedStreamingPlatform.Playlist;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.PlaylistImpl#getPlaylistID <em>Playlist ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlaylistImpl#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaylistImpl extends NamedElementImpl implements Playlist {
	/**
	 * The default value of the '{@link #getPlaylistID() <em>Playlist ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylistID()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYLIST_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlaylistID() <em>Playlist ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylistID()
	 * @generated
	 * @ordered
	 */
	protected int playlistID = PLAYLIST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaContent> media;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.PLAYLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlaylistID() {
		return playlistID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaylistID(int newPlaylistID) {
		int oldPlaylistID = playlistID;
		playlistID = newPlaylistID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.PLAYLIST__PLAYLIST_ID, oldPlaylistID, playlistID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MediaContent> getMedia() {
		if (media == null) {
			media = new EObjectContainmentEList<MediaContent>(MediaContent.class, this, RefinedStreamingPlatformPackage.PLAYLIST__MEDIA);
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLAYLIST__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLAYLIST__PLAYLIST_ID:
				return getPlaylistID();
			case RefinedStreamingPlatformPackage.PLAYLIST__MEDIA:
				return getMedia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLAYLIST__PLAYLIST_ID:
				setPlaylistID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLAYLIST__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends MediaContent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLAYLIST__PLAYLIST_ID:
				setPlaylistID(PLAYLIST_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.PLAYLIST__MEDIA:
				getMedia().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLAYLIST__PLAYLIST_ID:
				return playlistID != PLAYLIST_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.PLAYLIST__MEDIA:
				return media != null && !media.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (playlistID: ");
		result.append(playlistID);
		result.append(')');
		return result.toString();
	}

} //PlaylistImpl
