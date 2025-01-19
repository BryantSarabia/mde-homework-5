/**
 */
package RefinedStreamingPlatform.util;

import RefinedStreamingPlatform.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage
 * @generated
 */
public class RefinedStreamingPlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefinedStreamingPlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStreamingPlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = RefinedStreamingPlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RefinedStreamingPlatformPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.TAGGABLE: {
				Taggable taggable = (Taggable)theEObject;
				T result = caseTaggable(taggable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.AUDITABLE: {
				Auditable auditable = (Auditable)theEObject;
				T result = caseAuditable(auditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = caseAuditable(platform);
				if (result == null) result = caseNamedElement(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseAuditable(channel);
				if (result == null) result = caseNamedElement(channel);
				if (result == null) result = caseTaggable(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseAuditable(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT: {
				MediaContent mediaContent = (MediaContent)theEObject;
				T result = caseMediaContent(mediaContent);
				if (result == null) result = caseTaggable(mediaContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.STREAM: {
				Stream stream = (Stream)theEObject;
				T result = caseStream(stream);
				if (result == null) result = caseMediaContent(stream);
				if (result == null) result = caseTaggable(stream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.CLIP: {
				Clip clip = (Clip)theEObject;
				T result = caseClip(clip);
				if (result == null) result = caseMediaContent(clip);
				if (result == null) result = caseTaggable(clip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.PLAYLIST: {
				Playlist playlist = (Playlist)theEObject;
				T result = casePlaylist(playlist);
				if (result == null) result = caseNamedElement(playlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.MONETIZATION: {
				Monetization monetization = (Monetization)theEObject;
				T result = caseMonetization(monetization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.TIP: {
				Tip tip = (Tip)theEObject;
				T result = caseTip(tip);
				if (result == null) result = caseMonetization(tip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseMonetization(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.USER_INTERACTION: {
				UserInteraction userInteraction = (UserInteraction)theEObject;
				T result = caseUserInteraction(userInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseUserInteraction(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RefinedStreamingPlatformPackage.REACTION: {
				Reaction reaction = (Reaction)theEObject;
				T result = caseReaction(reaction);
				if (result == null) result = caseUserInteraction(reaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taggable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taggable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggable(Taggable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditable(Auditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaContent(MediaContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStream(Stream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClip(Clip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaylist(Playlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monetization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monetization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonetization(Monetization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTip(Tip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInteraction(UserInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaction(Reaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RefinedStreamingPlatformSwitch
