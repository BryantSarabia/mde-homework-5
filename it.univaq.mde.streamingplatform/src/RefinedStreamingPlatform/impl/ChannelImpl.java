/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Channel;
import RefinedStreamingPlatform.Clip;
import RefinedStreamingPlatform.Feature;
import RefinedStreamingPlatform.NamedElement;
import RefinedStreamingPlatform.Playlist;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import RefinedStreamingPlatform.Stream;
import RefinedStreamingPlatform.Subscription;
import RefinedStreamingPlatform.Taggable;
import RefinedStreamingPlatform.Tip;
import RefinedStreamingPlatform.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getPlaylists <em>Playlists</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getModerators <em>Moderators</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getTips <em>Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getTotalTips <em>Total Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getTotalFollowers <em>Total Followers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.ChannelImpl#getTotalViews <em>Total Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends AuditableImpl implements Channel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected int channelID = CHANNEL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStreams() <em>Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<Stream> streams;

	/**
	 * The cached value of the '{@link #getClips() <em>Clips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClips()
	 * @generated
	 * @ordered
	 */
	protected EList<Clip> clips;

	/**
	 * The cached value of the '{@link #getPlaylists() <em>Playlists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylists()
	 * @generated
	 * @ordered
	 */
	protected EList<Playlist> playlists;

	/**
	 * The cached value of the '{@link #getModerators() <em>Moderators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModerators()
	 * @generated
	 * @ordered
	 */
	protected EList<User> moderators;

	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> followers;

	/**
	 * The cached value of the '{@link #getTips() <em>Tips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTips()
	 * @generated
	 * @ordered
	 */
	protected EList<Tip> tips;

	/**
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscription> subscriptions;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected User owner;

	/**
	 * The default value of the '{@link #getTotalTips() <em>Total Tips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTips()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_TIPS_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getTotalFollowers() <em>Total Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFollowers()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_FOLLOWERS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTotalViews() <em>Total Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalViews()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_VIEWS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, RefinedStreamingPlatformPackage.CHANNEL__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChannelID() {
		return channelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelID(int newChannelID) {
		int oldChannelID = channelID;
		channelID = newChannelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID, oldChannelID, channelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stream> getStreams() {
		if (streams == null) {
			streams = new EObjectContainmentEList<Stream>(Stream.class, this, RefinedStreamingPlatformPackage.CHANNEL__STREAMS);
		}
		return streams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clip> getClips() {
		if (clips == null) {
			clips = new EObjectContainmentEList<Clip>(Clip.class, this, RefinedStreamingPlatformPackage.CHANNEL__CLIPS);
		}
		return clips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Playlist> getPlaylists() {
		if (playlists == null) {
			playlists = new EObjectContainmentEList<Playlist>(Playlist.class, this, RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS);
		}
		return playlists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getModerators() {
		if (moderators == null) {
			moderators = new EObjectResolvingEList<User>(User.class, this, RefinedStreamingPlatformPackage.CHANNEL__MODERATORS);
		}
		return moderators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getFollowers() {
		if (followers == null) {
			followers = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS, RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tip> getTips() {
		if (tips == null) {
			tips = new EObjectResolvingEList<Tip>(Tip.class, this, RefinedStreamingPlatformPackage.CHANNEL__TIPS);
		}
		return tips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscription> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectResolvingEList<Subscription>(Subscription.class, this, RefinedStreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS);
		}
		return subscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, RefinedStreamingPlatformPackage.CHANNEL__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (User)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinedStreamingPlatformPackage.CHANNEL__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(User newOwner) {
		User oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.CHANNEL__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalTips() {
		/**
		 * tips->collect(t | t.amount)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Tip> tips = this.getTips();
		final /*@NonInvalid*/ OrderedSetValue BOXED_tips = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Tip, tips);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_DATAid_EFloat);
		Iterator<Object> ITERATOR_t = BOXED_tips.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_t.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Tip t = (Tip)ITERATOR_t.next();
			/**
			 * t.amount
			 */
			final /*@NonInvalid*/ float amount = t.getAmount();
			final /*@NonInvalid*/ RealValue BOXED_amount = ValueUtil.realValueOf(amount);
			//
			accumulator.add(BOXED_amount);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EFloat, collect);
		final /*@NonInvalid*/ float ECORE_sum = ValueUtil.floatValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTips(float newTotalTips) {
		// TODO: implement this method to set the 'Total Tips' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalFollowers() {
		/**
		 * followers->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<User> followers = this.getFollowers();
		final /*@NonInvalid*/ OrderedSetValue BOXED_followers = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_User, followers);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_followers);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalFollowers(int newTotalFollowers) {
		// TODO: implement this method to set the 'Total Followers' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalViews() {
		/**
		 * streams->collect(s | s.viewCount)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Stream> streams = this.getStreams();
		final /*@NonInvalid*/ OrderedSetValue BOXED_streams = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Stream, streams);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR_s = BOXED_streams.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_s.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Stream s = (Stream)ITERATOR_s.next();
			/**
			 * s.viewCount
			 */
			final /*@NonInvalid*/ int viewCount = s.getViewCount();
			final /*@NonInvalid*/ IntegerValue BOXED_viewCount = ValueUtil.integerValueOf(viewCount);
			//
			accumulator.add(BOXED_viewCount);
		}
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EInt, collect);
		final /*@NonInvalid*/ int ECORE_sum = ValueUtil.intValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalViews(int newTotalViews) {
		// TODO: implement this method to set the 'Total Views' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
				return ((InternalEList<?>)getStreams()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
				return ((InternalEList<?>)getClips()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
				return ((InternalEList<?>)getPlaylists()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.CHANNEL__NAME:
				return getName();
			case RefinedStreamingPlatformPackage.CHANNEL__TAGS:
				return getTags();
			case RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				return getChannelID();
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
				return getStreams();
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
				return getClips();
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
				return getPlaylists();
			case RefinedStreamingPlatformPackage.CHANNEL__MODERATORS:
				return getModerators();
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return getFollowers();
			case RefinedStreamingPlatformPackage.CHANNEL__TIPS:
				return getTips();
			case RefinedStreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				return getSubscriptions();
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
				return getFeatures();
			case RefinedStreamingPlatformPackage.CHANNEL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_TIPS:
				return getTotalTips();
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				return getTotalFollowers();
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				return getTotalViews();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.CHANNEL__NAME:
				setName((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				setChannelID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
				getStreams().clear();
				getStreams().addAll((Collection<? extends Stream>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends Clip>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
				getPlaylists().clear();
				getPlaylists().addAll((Collection<? extends Playlist>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__MODERATORS:
				getModerators().clear();
				getModerators().addAll((Collection<? extends User>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TIPS:
				getTips().clear();
				getTips().addAll((Collection<? extends Tip>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__OWNER:
				setOwner((User)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_TIPS:
				setTotalTips((Float)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				setTotalFollowers((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				setTotalViews((Integer)newValue);
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
			case RefinedStreamingPlatformPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TAGS:
				getTags().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				setChannelID(CHANNEL_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
				getStreams().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
				getClips().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
				getPlaylists().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__MODERATORS:
				getModerators().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				getFollowers().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TIPS:
				getTips().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
				getFeatures().clear();
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__OWNER:
				setOwner((User)null);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_TIPS:
				setTotalTips(TOTAL_TIPS_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				setTotalFollowers(TOTAL_FOLLOWERS_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				setTotalViews(TOTAL_VIEWS_EDEFAULT);
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
			case RefinedStreamingPlatformPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefinedStreamingPlatformPackage.CHANNEL__TAGS:
				return tags != null && !tags.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				return channelID != CHANNEL_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.CHANNEL__STREAMS:
				return streams != null && !streams.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__CLIPS:
				return clips != null && !clips.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__PLAYLISTS:
				return playlists != null && !playlists.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__MODERATORS:
				return moderators != null && !moderators.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__TIPS:
				return tips != null && !tips.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__FEATURES:
				return features != null && !features.isEmpty();
			case RefinedStreamingPlatformPackage.CHANNEL__OWNER:
				return owner != null;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_TIPS:
				return getTotalTips() != TOTAL_TIPS_EDEFAULT;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				return getTotalFollowers() != TOTAL_FOLLOWERS_EDEFAULT;
			case RefinedStreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
				return getTotalViews() != TOTAL_VIEWS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RefinedStreamingPlatformPackage.CHANNEL__NAME: return RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Taggable.class) {
			switch (derivedFeatureID) {
				case RefinedStreamingPlatformPackage.CHANNEL__TAGS: return RefinedStreamingPlatformPackage.TAGGABLE__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME: return RefinedStreamingPlatformPackage.CHANNEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == Taggable.class) {
			switch (baseFeatureID) {
				case RefinedStreamingPlatformPackage.TAGGABLE__TAGS: return RefinedStreamingPlatformPackage.CHANNEL__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", tags: ");
		result.append(tags);
		result.append(", channelID: ");
		result.append(channelID);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
