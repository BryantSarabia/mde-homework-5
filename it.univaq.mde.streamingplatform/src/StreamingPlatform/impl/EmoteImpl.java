/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Emote;
import StreamingPlatform.StreamingPlatformPackage;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.EmoteImpl#getEmoteID <em>Emote ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmoteImpl extends FeatureImpl implements Emote {
	/**
	 * The default value of the '{@link #getEmoteID() <em>Emote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoteID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID EMOTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmoteID() <em>Emote ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoteID()
	 * @generated
	 * @ordered
	 */
	protected UUID emoteID = EMOTE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.EMOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUID getEmoteID() {
		return emoteID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmoteID(UUID newEmoteID) {
		UUID oldEmoteID = emoteID;
		emoteID = newEmoteID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.EMOTE__EMOTE_ID, oldEmoteID, emoteID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.EMOTE__EMOTE_ID:
				return getEmoteID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamingPlatformPackage.EMOTE__EMOTE_ID:
				setEmoteID((UUID)newValue);
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
			case StreamingPlatformPackage.EMOTE__EMOTE_ID:
				setEmoteID(EMOTE_ID_EDEFAULT);
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
			case StreamingPlatformPackage.EMOTE__EMOTE_ID:
				return EMOTE_ID_EDEFAULT == null ? emoteID != null : !EMOTE_ID_EDEFAULT.equals(emoteID);
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
		result.append(" (emoteID: ");
		result.append(emoteID);
		result.append(')');
		return result.toString();
	}

} //EmoteImpl
