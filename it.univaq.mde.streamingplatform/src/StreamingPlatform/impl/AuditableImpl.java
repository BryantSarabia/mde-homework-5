/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Auditable;
import StreamingPlatform.StreamingPlatformPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.AuditableImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link StreamingPlatform.impl.AuditableImpl#getUpdatedAt <em>Updated At</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuditableImpl extends MinimalEObjectImpl.Container implements Auditable {
	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date updatedAt = UPDATED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.AUDITABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		Date oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.AUDITABLE__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		Date oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.AUDITABLE__UPDATED_AT, oldUpdatedAt, updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.AUDITABLE__CREATED_AT:
				return getCreatedAt();
			case StreamingPlatformPackage.AUDITABLE__UPDATED_AT:
				return getUpdatedAt();
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
			case StreamingPlatformPackage.AUDITABLE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case StreamingPlatformPackage.AUDITABLE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
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
			case StreamingPlatformPackage.AUDITABLE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case StreamingPlatformPackage.AUDITABLE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
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
			case StreamingPlatformPackage.AUDITABLE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case StreamingPlatformPackage.AUDITABLE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
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
		result.append(" (createdAt: ");
		result.append(createdAt);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(')');
		return result.toString();
	}

} //AuditableImpl
