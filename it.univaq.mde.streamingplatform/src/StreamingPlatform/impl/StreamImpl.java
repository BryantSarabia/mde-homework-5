/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Stream;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.User;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.StreamImpl#getStreamID <em>Stream ID</em>}</li>
 *   <li>{@link StreamingPlatform.impl.StreamImpl#isIsLive <em>Is Live</em>}</li>
 *   <li>{@link StreamingPlatform.impl.StreamImpl#getViewers <em>Viewers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamImpl extends MediaContentImpl implements Stream {
	/**
	 * The default value of the '{@link #getStreamID() <em>Stream ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID STREAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamID() <em>Stream ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamID()
	 * @generated
	 * @ordered
	 */
	protected UUID streamID = STREAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLive() <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLive() <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLive()
	 * @generated
	 * @ordered
	 */
	protected boolean isLive = IS_LIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewers() <em>Viewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> viewers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.STREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUID getStreamID() {
		return streamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreamID(UUID newStreamID) {
		UUID oldStreamID = streamID;
		streamID = newStreamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.STREAM__STREAM_ID, oldStreamID, streamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLive() {
		return isLive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLive(boolean newIsLive) {
		boolean oldIsLive = isLive;
		isLive = newIsLive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.STREAM__IS_LIVE, oldIsLive, isLive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getViewers() {
		if (viewers == null) {
			viewers = new EObjectResolvingEList<User>(User.class, this, StreamingPlatformPackage.STREAM__VIEWERS);
		}
		return viewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.STREAM__STREAM_ID:
				return getStreamID();
			case StreamingPlatformPackage.STREAM__IS_LIVE:
				return isIsLive();
			case StreamingPlatformPackage.STREAM__VIEWERS:
				return getViewers();
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
			case StreamingPlatformPackage.STREAM__STREAM_ID:
				setStreamID((UUID)newValue);
				return;
			case StreamingPlatformPackage.STREAM__IS_LIVE:
				setIsLive((Boolean)newValue);
				return;
			case StreamingPlatformPackage.STREAM__VIEWERS:
				getViewers().clear();
				getViewers().addAll((Collection<? extends User>)newValue);
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
			case StreamingPlatformPackage.STREAM__STREAM_ID:
				setStreamID(STREAM_ID_EDEFAULT);
				return;
			case StreamingPlatformPackage.STREAM__IS_LIVE:
				setIsLive(IS_LIVE_EDEFAULT);
				return;
			case StreamingPlatformPackage.STREAM__VIEWERS:
				getViewers().clear();
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
			case StreamingPlatformPackage.STREAM__STREAM_ID:
				return STREAM_ID_EDEFAULT == null ? streamID != null : !STREAM_ID_EDEFAULT.equals(streamID);
			case StreamingPlatformPackage.STREAM__IS_LIVE:
				return isLive != IS_LIVE_EDEFAULT;
			case StreamingPlatformPackage.STREAM__VIEWERS:
				return viewers != null && !viewers.isEmpty();
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
		result.append(" (streamID: ");
		result.append(streamID);
		result.append(", isLive: ");
		result.append(isLive);
		result.append(')');
		return result.toString();
	}

} //StreamImpl
