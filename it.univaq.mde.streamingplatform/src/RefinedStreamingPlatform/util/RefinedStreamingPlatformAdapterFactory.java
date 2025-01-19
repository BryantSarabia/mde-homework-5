/**
 */
package RefinedStreamingPlatform.util;

import RefinedStreamingPlatform.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage
 * @generated
 */
public class RefinedStreamingPlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RefinedStreamingPlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStreamingPlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RefinedStreamingPlatformPackage.eINSTANCE;
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
	protected RefinedStreamingPlatformSwitch<Adapter> modelSwitch =
		new RefinedStreamingPlatformSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTaggable(Taggable object) {
				return createTaggableAdapter();
			}
			@Override
			public Adapter caseAuditable(Auditable object) {
				return createAuditableAdapter();
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
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseMediaContent(MediaContent object) {
				return createMediaContentAdapter();
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
			public Adapter casePlaylist(Playlist object) {
				return createPlaylistAdapter();
			}
			@Override
			public Adapter caseMonetization(Monetization object) {
				return createMonetizationAdapter();
			}
			@Override
			public Adapter caseTip(Tip object) {
				return createTipAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseUserInteraction(UserInteraction object) {
				return createUserInteractionAdapter();
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
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Taggable <em>Taggable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Taggable
	 * @generated
	 */
	public Adapter createTaggableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Auditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Auditable
	 * @generated
	 */
	public Adapter createAuditableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.MediaContent
	 * @generated
	 */
	public Adapter createMediaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Clip
	 * @generated
	 */
	public Adapter createClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Playlist
	 * @generated
	 */
	public Adapter createPlaylistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Monetization <em>Monetization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Monetization
	 * @generated
	 */
	public Adapter createMonetizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Tip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Tip
	 * @generated
	 */
	public Adapter createTipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.UserInteraction
	 * @generated
	 */
	public Adapter createUserInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RefinedStreamingPlatform.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RefinedStreamingPlatform.Reaction
	 * @generated
	 */
	public Adapter createReactionAdapter() {
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

} //RefinedStreamingPlatformAdapterFactory
