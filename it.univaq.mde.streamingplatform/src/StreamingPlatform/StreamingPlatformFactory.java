/**
 */
package StreamingPlatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage
 * @generated
 */
public interface StreamingPlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamingPlatformFactory eINSTANCE = StreamingPlatform.impl.StreamingPlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Badge</em>'.
	 * @generated
	 */
	Badge createBadge();

	/**
	 * Returns a new object of class '<em>Emote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emote</em>'.
	 * @generated
	 */
	Emote createEmote();

	/**
	 * Returns a new object of class '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream</em>'.
	 * @generated
	 */
	Stream createStream();

	/**
	 * Returns a new object of class '<em>Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clip</em>'.
	 * @generated
	 */
	Clip createClip();

	/**
	 * Returns a new object of class '<em>Donation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donation</em>'.
	 * @generated
	 */
	Donation createDonation();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction</em>'.
	 * @generated
	 */
	Reaction createReaction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StreamingPlatformPackage getStreamingPlatformPackage();

} //StreamingPlatformFactory
