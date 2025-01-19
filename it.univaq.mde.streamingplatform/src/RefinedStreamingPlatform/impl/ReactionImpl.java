/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Reaction;
import RefinedStreamingPlatform.ReactionType;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.ReactionImpl#getReactionType <em>Reaction Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionImpl extends UserInteractionImpl implements Reaction {
	/**
	 * The default value of the '{@link #getReactionType() <em>Reaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionType()
	 * @generated
	 * @ordered
	 */
	protected static final ReactionType REACTION_TYPE_EDEFAULT = ReactionType.LOVE;

	/**
	 * The cached value of the '{@link #getReactionType() <em>Reaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionType()
	 * @generated
	 * @ordered
	 */
	protected ReactionType reactionType = REACTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.REACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionType getReactionType() {
		return reactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReactionType(ReactionType newReactionType) {
		ReactionType oldReactionType = reactionType;
		reactionType = newReactionType == null ? REACTION_TYPE_EDEFAULT : newReactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.REACTION__REACTION_TYPE, oldReactionType, reactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.REACTION__REACTION_TYPE:
				return getReactionType();
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
			case RefinedStreamingPlatformPackage.REACTION__REACTION_TYPE:
				setReactionType((ReactionType)newValue);
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
			case RefinedStreamingPlatformPackage.REACTION__REACTION_TYPE:
				setReactionType(REACTION_TYPE_EDEFAULT);
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
			case RefinedStreamingPlatformPackage.REACTION__REACTION_TYPE:
				return reactionType != REACTION_TYPE_EDEFAULT;
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
		result.append(" (reactionType: ");
		result.append(reactionType);
		result.append(')');
		return result.toString();
	}

} //ReactionImpl
