/**
 */
package StreamingPlatform.util;

import StreamingPlatform.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage
 * @generated
 */
public class StreamingPlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StreamingPlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingPlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StreamingPlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamingPlatformSwitch<Adapter> modelSwitch =
		new StreamingPlatformSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseBadge(Badge object) {
				return createBadgeAdapter();
			}
			@Override
			public Adapter caseEmote(Emote object) {
				return createEmoteAdapter();
			}
			@Override
			public Adapter caseStream(Stream object) {
				return createStreamAdapter();
			}
			@Override
			public Adapter caseClip(Clip object) {
				return createClipAdapter();
			}
			@Override
			public Adapter caseDonation(Donation object) {
				return createDonationAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseReaction(Reaction object) {
				return createReactionAdapter();
			}
			@Override
			public Adapter caseAuditable(Auditable object) {
				return createAuditableAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseMediaContent(MediaContent object) {
				return createMediaContentAdapter();
			}
			@Override
			public Adapter caseUserInteraction(UserInteraction object) {
				return createUserInteractionAdapter();
			}
			@Override
			public Adapter caseMonetization(Monetization object) {
				return createMonetizationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Badge
	 * @generated
	 */
	public Adapter createBadgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Emote <em>Emote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Emote
	 * @generated
	 */
	public Adapter createEmoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Clip
	 * @generated
	 */
	public Adapter createClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Donation
	 * @generated
	 */
	public Adapter createDonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Reaction
	 * @generated
	 */
	public Adapter createReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Auditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Auditable
	 * @generated
	 */
	public Adapter createAuditableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.MediaContent
	 * @generated
	 */
	public Adapter createMediaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.UserInteraction
	 * @generated
	 */
	public Adapter createUserInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link StreamingPlatform.Monetization <em>Monetization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see StreamingPlatform.Monetization
	 * @generated
	 */
	public Adapter createMonetizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StreamingPlatformAdapterFactory
