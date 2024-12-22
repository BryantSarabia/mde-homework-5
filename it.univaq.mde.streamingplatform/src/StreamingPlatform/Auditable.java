/**
 */
package StreamingPlatform;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auditable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Auditable#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link StreamingPlatform.Auditable#getUpdatedAt <em>Updated At</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getAuditable()
 * @model abstract="true"
 * @generated
 */
public interface Auditable extends EObject {
	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see StreamingPlatform.StreamingPlatformPackage#getAuditable_CreatedAt()
	 * @model required="true"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Auditable#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see StreamingPlatform.StreamingPlatformPackage#getAuditable_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Auditable#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

} // Auditable
