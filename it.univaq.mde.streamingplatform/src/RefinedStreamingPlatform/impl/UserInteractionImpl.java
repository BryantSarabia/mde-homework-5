/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.User;
import RefinedStreamingPlatform.UserInteraction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.UserInteractionImpl#getUserInteractionID <em>User Interaction ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserInteractionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserInteractionImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserInteractionImpl extends MinimalEObjectImpl.Container implements UserInteraction {
	/**
	 * The default value of the '{@link #getUserInteractionID() <em>User Interaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInteractionID()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_INTERACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserInteractionID() <em>User Interaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInteractionID()
	 * @generated
	 * @ordered
	 */
	protected int userInteractionID = USER_INTERACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.USER_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUserInteractionID() {
		return userInteractionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserInteractionID(int newUserInteractionID) {
		int oldUserInteractionID = userInteractionID;
		userInteractionID = newUserInteractionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER_INTERACTION__USER_INTERACTION_ID, oldUserInteractionID, userInteractionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER_INTERACTION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (User)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(User newAuthor) {
		User oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.USER_INTERACTION__USER_INTERACTION_ID:
				return getUserInteractionID();
			case RefinedStreamingPlatformPackage.USER_INTERACTION__TIMESTAMP:
				return getTimestamp();
			case RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
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
			case RefinedStreamingPlatformPackage.USER_INTERACTION__USER_INTERACTION_ID:
				setUserInteractionID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR:
				setAuthor((User)newValue);
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
			case RefinedStreamingPlatformPackage.USER_INTERACTION__USER_INTERACTION_ID:
				setUserInteractionID(USER_INTERACTION_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR:
				setAuthor((User)null);
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
			case RefinedStreamingPlatformPackage.USER_INTERACTION__USER_INTERACTION_ID:
				return userInteractionID != USER_INTERACTION_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case RefinedStreamingPlatformPackage.USER_INTERACTION__AUTHOR:
				return author != null;
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
		result.append(" (userInteractionID: ");
		result.append(userInteractionID);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //UserInteractionImpl
