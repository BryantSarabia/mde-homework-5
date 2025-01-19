/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Badge;
import StreamingPlatform.Channel;
import StreamingPlatform.Clip;
import StreamingPlatform.Donation;
import StreamingPlatform.Emote;
import StreamingPlatform.NamedElement;
import StreamingPlatform.Stream;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.StreamingPlatformTables;
import StreamingPlatform.Subscription;
import StreamingPlatform.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getModerators <em>Moderators</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getDonations <em>Donations</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getEmotes <em>Emotes</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getTotalDonations <em>Total Donations</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getTotalFollowers <em>Total Followers</em>}</li>
 *   <li>{@link StreamingPlatform.impl.ChannelImpl#getTotalViews <em>Total Views</em>}</li>
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
	 * The default value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected String channelID = CHANNEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getDonations() <em>Donations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonations()
	 * @generated
	 * @ordered
	 */
	protected EList<Donation> donations;

	/**
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscription> subscriptions;

	/**
	 * The cached value of the '{@link #getEmotes() <em>Emotes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Emote> emotes;

	/**
	 * The cached value of the '{@link #getBadges() <em>Badges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadges()
	 * @generated
	 * @ordered
	 */
	protected EList<Badge> badges;

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
	 * The default value of the '{@link #getTotalDonations() <em>Total Donations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDonations()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_DONATIONS_EDEFAULT = 0.0F;

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
		return StreamingPlatformPackage.Literals.CHANNEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannelID() {
		return channelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelID(String newChannelID) {
		String oldChannelID = channelID;
		channelID = newChannelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.CHANNEL__CHANNEL_ID, oldChannelID, channelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.CHANNEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stream> getStreams() {
		if (streams == null) {
			streams = new EObjectContainmentEList<Stream>(Stream.class, this, StreamingPlatformPackage.CHANNEL__STREAMS);
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
			clips = new EObjectContainmentEList<Clip>(Clip.class, this, StreamingPlatformPackage.CHANNEL__CLIPS);
		}
		return clips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getModerators() {
		if (moderators == null) {
			moderators = new EObjectResolvingEList<User>(User.class, this, StreamingPlatformPackage.CHANNEL__MODERATORS);
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
			followers = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, StreamingPlatformPackage.CHANNEL__FOLLOWERS, StreamingPlatformPackage.USER__FOLLOWED_CHANNELS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Donation> getDonations() {
		if (donations == null) {
			donations = new EObjectContainmentEList<Donation>(Donation.class, this, StreamingPlatformPackage.CHANNEL__DONATIONS);
		}
		return donations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscription> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectContainmentEList<Subscription>(Subscription.class, this, StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS);
		}
		return subscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Emote> getEmotes() {
		if (emotes == null) {
			emotes = new EObjectContainmentEList<Emote>(Emote.class, this, StreamingPlatformPackage.CHANNEL__EMOTES);
		}
		return emotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Badge> getBadges() {
		if (badges == null) {
			badges = new EObjectContainmentEList<Badge>(Badge.class, this, StreamingPlatformPackage.CHANNEL__BADGES);
		}
		return badges;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StreamingPlatformPackage.CHANNEL__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.CHANNEL__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalDonations() {
		/**
		 * donations->collect(d | d.amount)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Donation> donations = this.getDonations();
		final /*@NonInvalid*/ OrderedSetValue BOXED_donations = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_Donation, donations);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(StreamingPlatformTables.SEQ_DATAid_EFloat);
		Iterator<Object> ITERATOR_d = BOXED_donations.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_d.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Donation d = (Donation)ITERATOR_d.next();
			/**
			 * d.amount
			 */
			final /*@NonInvalid*/ float amount = d.getAmount();
			final /*@NonInvalid*/ RealValue BOXED_amount = ValueUtil.realValueOf(amount);
			//
			accumulator.add(BOXED_amount);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, StreamingPlatformTables.DATAid_EFloat, collect);
		final /*@NonInvalid*/ float ECORE_sum = ValueUtil.floatValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalDonations(float newTotalDonations) {
		// TODO: implement this method to set the 'Total Donations' attribute
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
		final /*@NonInvalid*/ OrderedSetValue BOXED_followers = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_User, followers);
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
		final /*@NonInvalid*/ OrderedSetValue BOXED_streams = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_Stream, streams);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(StreamingPlatformTables.SEQ_DATAid_EInt);
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
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, StreamingPlatformTables.DATAid_EInt, collect);
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
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
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
			case StreamingPlatformPackage.CHANNEL__STREAMS:
				return ((InternalEList<?>)getStreams()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__CLIPS:
				return ((InternalEList<?>)getClips()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
				return ((InternalEList<?>)getDonations()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__EMOTES:
				return ((InternalEList<?>)getEmotes()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.CHANNEL__BADGES:
				return ((InternalEList<?>)getBadges()).basicRemove(otherEnd, msgs);
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
			case StreamingPlatformPackage.CHANNEL__NAME:
				return getName();
			case StreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				return getChannelID();
			case StreamingPlatformPackage.CHANNEL__DESCRIPTION:
				return getDescription();
			case StreamingPlatformPackage.CHANNEL__STREAMS:
				return getStreams();
			case StreamingPlatformPackage.CHANNEL__CLIPS:
				return getClips();
			case StreamingPlatformPackage.CHANNEL__MODERATORS:
				return getModerators();
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return getFollowers();
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
				return getDonations();
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				return getSubscriptions();
			case StreamingPlatformPackage.CHANNEL__EMOTES:
				return getEmotes();
			case StreamingPlatformPackage.CHANNEL__BADGES:
				return getBadges();
			case StreamingPlatformPackage.CHANNEL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case StreamingPlatformPackage.CHANNEL__TOTAL_DONATIONS:
				return getTotalDonations();
			case StreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				return getTotalFollowers();
			case StreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
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
			case StreamingPlatformPackage.CHANNEL__NAME:
				setName((String)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				setChannelID((String)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__STREAMS:
				getStreams().clear();
				getStreams().addAll((Collection<? extends Stream>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends Clip>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__MODERATORS:
				getModerators().clear();
				getModerators().addAll((Collection<? extends User>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
				getDonations().clear();
				getDonations().addAll((Collection<? extends Donation>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__EMOTES:
				getEmotes().clear();
				getEmotes().addAll((Collection<? extends Emote>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__OWNER:
				setOwner((User)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_DONATIONS:
				setTotalDonations((Float)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				setTotalFollowers((Integer)newValue);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
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
			case StreamingPlatformPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				setChannelID(CHANNEL_ID_EDEFAULT);
				return;
			case StreamingPlatformPackage.CHANNEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StreamingPlatformPackage.CHANNEL__STREAMS:
				getStreams().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__CLIPS:
				getClips().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__MODERATORS:
				getModerators().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
				getFollowers().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
				getDonations().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__EMOTES:
				getEmotes().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__BADGES:
				getBadges().clear();
				return;
			case StreamingPlatformPackage.CHANNEL__OWNER:
				setOwner((User)null);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_DONATIONS:
				setTotalDonations(TOTAL_DONATIONS_EDEFAULT);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				setTotalFollowers(TOTAL_FOLLOWERS_EDEFAULT);
				return;
			case StreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
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
			case StreamingPlatformPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StreamingPlatformPackage.CHANNEL__CHANNEL_ID:
				return CHANNEL_ID_EDEFAULT == null ? channelID != null : !CHANNEL_ID_EDEFAULT.equals(channelID);
			case StreamingPlatformPackage.CHANNEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StreamingPlatformPackage.CHANNEL__STREAMS:
				return streams != null && !streams.isEmpty();
			case StreamingPlatformPackage.CHANNEL__CLIPS:
				return clips != null && !clips.isEmpty();
			case StreamingPlatformPackage.CHANNEL__MODERATORS:
				return moderators != null && !moderators.isEmpty();
			case StreamingPlatformPackage.CHANNEL__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case StreamingPlatformPackage.CHANNEL__DONATIONS:
				return donations != null && !donations.isEmpty();
			case StreamingPlatformPackage.CHANNEL__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case StreamingPlatformPackage.CHANNEL__EMOTES:
				return emotes != null && !emotes.isEmpty();
			case StreamingPlatformPackage.CHANNEL__BADGES:
				return badges != null && !badges.isEmpty();
			case StreamingPlatformPackage.CHANNEL__OWNER:
				return owner != null;
			case StreamingPlatformPackage.CHANNEL__TOTAL_DONATIONS:
				return getTotalDonations() != TOTAL_DONATIONS_EDEFAULT;
			case StreamingPlatformPackage.CHANNEL__TOTAL_FOLLOWERS:
				return getTotalFollowers() != TOTAL_FOLLOWERS_EDEFAULT;
			case StreamingPlatformPackage.CHANNEL__TOTAL_VIEWS:
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
				case StreamingPlatformPackage.CHANNEL__NAME: return StreamingPlatformPackage.NAMED_ELEMENT__NAME;
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
				case StreamingPlatformPackage.NAMED_ELEMENT__NAME: return StreamingPlatformPackage.CHANNEL__NAME;
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
		result.append(", channelID: ");
		result.append(channelID);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
