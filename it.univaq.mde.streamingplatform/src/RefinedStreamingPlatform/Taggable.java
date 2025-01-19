/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taggable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Taggable#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getTaggable()
 * @model abstract="true"
 * @generated
 */
public interface Taggable extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getTaggable_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

} // Taggable
