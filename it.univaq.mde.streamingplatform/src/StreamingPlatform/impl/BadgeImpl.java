/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Badge;
import StreamingPlatform.StreamingPlatformPackage;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.BadgeImpl#getBadgeID <em>Badge ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BadgeImpl extends FeatureImpl implements Badge {
	/**
	 * The default value of the '{@link #getBadgeID() <em>Badge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeID()
	 * @generated
	 * @ordered
	 */
	protected static final UUID BADGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBadgeID() <em>Badge ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeID()
	 * @generated
	 * @ordered
	 */
	protected UUID badgeID = BADGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BadgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUID getBadgeID() {
		return badgeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBadgeID(UUID newBadgeID) {
		UUID oldBadgeID = badgeID;
		badgeID = newBadgeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.BADGE__BADGE_ID, oldBadgeID, badgeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.BADGE__BADGE_ID:
				return getBadgeID();
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
			case StreamingPlatformPackage.BADGE__BADGE_ID:
				setBadgeID((UUID)newValue);
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
			case StreamingPlatformPackage.BADGE__BADGE_ID:
				setBadgeID(BADGE_ID_EDEFAULT);
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
			case StreamingPlatformPackage.BADGE__BADGE_ID:
				return BADGE_ID_EDEFAULT == null ? badgeID != null : !BADGE_ID_EDEFAULT.equals(badgeID);
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
		result.append(" (badgeID: ");
		result.append(badgeID);
		result.append(')');
		return result.toString();
	}

} //BadgeImpl
