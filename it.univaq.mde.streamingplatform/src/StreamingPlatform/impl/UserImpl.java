/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Channel;
import StreamingPlatform.Donation;
import StreamingPlatform.NamedElement;
import StreamingPlatform.Role;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.StreamingPlatformTables;
import StreamingPlatform.Subscription;
import StreamingPlatform.User;

import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#isIsOnline <em>Is Online</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getDonations <em>Donations</em>}</li>
 *   <li>{@link StreamingPlatform.impl.UserImpl#getFollowedChannels <em>Followed Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends AuditableImpl implements User {
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
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.ADMINISTRATOR;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvatar() <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvatar() <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar()
	 * @generated
	 * @ordered
	 */
	protected String avatar = AVATAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOnline() <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOnline() <em>Is Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnline()
	 * @generated
	 * @ordered
	 */
	protected boolean isOnline = IS_ONLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscription> subscriptions;

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
	 * The cached value of the '{@link #getFollowedChannels() <em>Followed Channels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowedChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> followedChannels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatar() {
		return avatar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatar(String newAvatar) {
		String oldAvatar = avatar;
		avatar = newAvatar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__AVATAR, oldAvatar, avatar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOnline() {
		return isOnline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOnline(boolean newIsOnline) {
		boolean oldIsOnline = isOnline;
		isOnline = newIsOnline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__IS_ONLINE, oldIsOnline, isOnline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__NICKNAME, oldNickname, nickname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.USER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscription> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectContainmentEList<Subscription>(Subscription.class, this, StreamingPlatformPackage.USER__SUBSCRIPTIONS);
		}
		return subscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Donation> getDonations() {
		if (donations == null) {
			donations = new EObjectContainmentEList<Donation>(Donation.class, this, StreamingPlatformPackage.USER__DONATIONS);
		}
		return donations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getFollowedChannels() {
		if (followedChannels == null) {
			followedChannels = new EObjectWithInverseResolvingEList.ManyInverse<Channel>(Channel.class, this, StreamingPlatformPackage.USER__FOLLOWED_CHANNELS, StreamingPlatformPackage.CHANNEL__FOLLOWERS);
		}
		return followedChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float totalDonations() {
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
	public boolean isFollowing(final Channel channel) {
		/**
		 * followedChannels->includes(channel)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Channel> followedChannels = this.getFollowedChannels();
		final /*@NonInvalid*/ OrderedSetValue BOXED_followedChannels = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_Channel, followedChannels);
		final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_followedChannels, channel).booleanValue();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float totalSpending() {
		/**
		 *
		 * subscriptions->collect(s | s.amount)
		 * ->sum() +
		 * donations->collect(d | d.amount)
		 * ->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Subscription> subscriptions = this.getSubscriptions();
		final /*@NonInvalid*/ OrderedSetValue BOXED_subscriptions = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_Subscription, subscriptions);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(StreamingPlatformTables.SEQ_DATAid_EFloat);
		Iterator<Object> ITERATOR_s = BOXED_subscriptions.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_s.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Subscription s = (Subscription)ITERATOR_s.next();
			/**
			 * s.amount
			 */
			final /*@NonInvalid*/ float amount = s.getAmount();
			final /*@NonInvalid*/ RealValue BOXED_amount = ValueUtil.realValueOf(amount);
			//
			accumulator.add(BOXED_amount);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, StreamingPlatformTables.DATAid_EFloat, collect);
		final /*@NonInvalid*/ List<Donation> donations = this.getDonations();
		final /*@NonInvalid*/ OrderedSetValue BOXED_donations = idResolver.createOrderedSetOfAll(StreamingPlatformTables.ORD_CLSSid_Donation, donations);
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(StreamingPlatformTables.SEQ_DATAid_EFloat);
		Iterator<Object> ITERATOR_d = BOXED_donations.iterator();
		/*@NonInvalid*/ SequenceValue collect_0;
		while (true) {
			if (!ITERATOR_d.hasNext()) {
				collect_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Donation d = (Donation)ITERATOR_d.next();
			/**
			 * d.amount
			 */
			final /*@NonInvalid*/ float amount_0 = d.getAmount();
			final /*@NonInvalid*/ RealValue BOXED_amount_0 = ValueUtil.realValueOf(amount_0);
			//
			accumulator_0.add(BOXED_amount_0);
		}
		final /*@NonInvalid*/ RealValue sum_0 = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, StreamingPlatformTables.DATAid_EFloat, collect_0);
		final /*@NonInvalid*/ RealValue sum_1 = NumericPlusOperation.INSTANCE.evaluate(sum, sum_0);
		final /*@NonInvalid*/ float ECORE_sum_1 = ValueUtil.floatValueOf(sum_1);
		return ECORE_sum_1;
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
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowedChannels()).basicAdd(otherEnd, msgs);
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
			case StreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.USER__DONATIONS:
				return ((InternalEList<?>)getDonations()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				return ((InternalEList<?>)getFollowedChannels()).basicRemove(otherEnd, msgs);
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
			case StreamingPlatformPackage.USER__NAME:
				return getName();
			case StreamingPlatformPackage.USER__USER_ID:
				return getUserID();
			case StreamingPlatformPackage.USER__ROLE:
				return getRole();
			case StreamingPlatformPackage.USER__AVATAR:
				return getAvatar();
			case StreamingPlatformPackage.USER__IS_ONLINE:
				return isIsOnline();
			case StreamingPlatformPackage.USER__NICKNAME:
				return getNickname();
			case StreamingPlatformPackage.USER__DESCRIPTION:
				return getDescription();
			case StreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return getSubscriptions();
			case StreamingPlatformPackage.USER__DONATIONS:
				return getDonations();
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				return getFollowedChannels();
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
			case StreamingPlatformPackage.USER__NAME:
				setName((String)newValue);
				return;
			case StreamingPlatformPackage.USER__USER_ID:
				setUserID((String)newValue);
				return;
			case StreamingPlatformPackage.USER__ROLE:
				setRole((Role)newValue);
				return;
			case StreamingPlatformPackage.USER__AVATAR:
				setAvatar((String)newValue);
				return;
			case StreamingPlatformPackage.USER__IS_ONLINE:
				setIsOnline((Boolean)newValue);
				return;
			case StreamingPlatformPackage.USER__NICKNAME:
				setNickname((String)newValue);
				return;
			case StreamingPlatformPackage.USER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StreamingPlatformPackage.USER__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case StreamingPlatformPackage.USER__DONATIONS:
				getDonations().clear();
				getDonations().addAll((Collection<? extends Donation>)newValue);
				return;
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				getFollowedChannels().clear();
				getFollowedChannels().addAll((Collection<? extends Channel>)newValue);
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
			case StreamingPlatformPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__AVATAR:
				setAvatar(AVATAR_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__IS_ONLINE:
				setIsOnline(IS_ONLINE_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StreamingPlatformPackage.USER__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case StreamingPlatformPackage.USER__DONATIONS:
				getDonations().clear();
				return;
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				getFollowedChannels().clear();
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
			case StreamingPlatformPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StreamingPlatformPackage.USER__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case StreamingPlatformPackage.USER__ROLE:
				return role != ROLE_EDEFAULT;
			case StreamingPlatformPackage.USER__AVATAR:
				return AVATAR_EDEFAULT == null ? avatar != null : !AVATAR_EDEFAULT.equals(avatar);
			case StreamingPlatformPackage.USER__IS_ONLINE:
				return isOnline != IS_ONLINE_EDEFAULT;
			case StreamingPlatformPackage.USER__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case StreamingPlatformPackage.USER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case StreamingPlatformPackage.USER__DONATIONS:
				return donations != null && !donations.isEmpty();
			case StreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
				return followedChannels != null && !followedChannels.isEmpty();
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
				case StreamingPlatformPackage.USER__NAME: return StreamingPlatformPackage.NAMED_ELEMENT__NAME;
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
				case StreamingPlatformPackage.NAMED_ELEMENT__NAME: return StreamingPlatformPackage.USER__NAME;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StreamingPlatformPackage.USER___TOTAL_DONATIONS:
				return totalDonations();
			case StreamingPlatformPackage.USER___IS_FOLLOWING__CHANNEL:
				return isFollowing((Channel)arguments.get(0));
			case StreamingPlatformPackage.USER___TOTAL_SPENDING:
				return totalSpending();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", userID: ");
		result.append(userID);
		result.append(", role: ");
		result.append(role);
		result.append(", avatar: ");
		result.append(avatar);
		result.append(", isOnline: ");
		result.append(isOnline);
		result.append(", nickname: ");
		result.append(nickname);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UserImpl
