/**
 */
package RefinedStreamingPlatform;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Stream#isIsLive <em>Is Live</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Stream#getViewers <em>Viewers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Stream#getActiveViewers <em>Active Viewers</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getStream()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='liveCondition'"
 * @generated
 */
public interface Stream extends MediaContent {
	/**
	 * Returns the value of the '<em><b>Is Live</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Live</em>' attribute.
	 * @see #setIsLive(boolean)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getStream_IsLive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsLive();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Stream#isIsLive <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Live</em>' attribute.
	 * @see #isIsLive()
	 * @generated
	 */
	void setIsLive(boolean value);

	/**
	 * Returns the value of the '<em><b>Viewers</b></em>' reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewers</em>' reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getStream_Viewers()
	 * @model
	 * @generated
	 */
	EList<User> getViewers();

	/**
	 * Returns the value of the '<em><b>Active Viewers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Viewers</em>' attribute.
	 * @see #setActiveViewers(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getStream_ActiveViewers()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getActiveViewers();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Stream#getActiveViewers <em>Active Viewers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Viewers</em>' attribute.
	 * @see #getActiveViewers()
	 * @generated
	 */
	void setActiveViewers(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='isLive = true implies viewers-&gt;notEmpty()'"
	 * @generated
	 */
	boolean liveCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Stream
