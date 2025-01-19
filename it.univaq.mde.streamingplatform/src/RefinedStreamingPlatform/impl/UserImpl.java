/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Channel;
import RefinedStreamingPlatform.NamedElement;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import RefinedStreamingPlatform.Role;
import RefinedStreamingPlatform.Subscription;
import RefinedStreamingPlatform.Tip;
import RefinedStreamingPlatform.User;

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
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#isIsOnline <em>Is Online</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getTips <em>Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.UserImpl#getFollowedChannels <em>Followed Channels</em>}</li>
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
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected int userID = USER_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSubscriptions() <em>Subscriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscription> subscriptions;

	/**
	 * The cached value of the '{@link #getTips() <em>Tips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTips()
	 * @generated
	 * @ordered
	 */
	protected EList<Tip> tips;

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
		return RefinedStreamingPlatformPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(int newUserID) {
		int oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__AVATAR, oldAvatar, avatar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__IS_ONLINE, oldIsOnline, isOnline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.USER__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscription> getSubscriptions() {
		if (subscriptions == null) {
			subscriptions = new EObjectContainmentEList<Subscription>(Subscription.class, this, RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS);
		}
		return subscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tip> getTips() {
		if (tips == null) {
			tips = new EObjectContainmentEList<Tip>(Tip.class, this, RefinedStreamingPlatformPackage.USER__TIPS);
		}
		return tips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getFollowedChannels() {
		if (followedChannels == null) {
			followedChannels = new EObjectWithInverseResolvingEList.ManyInverse<Channel>(Channel.class, this, RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS, RefinedStreamingPlatformPackage.CHANNEL__FOLLOWERS);
		}
		return followedChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float totalTips() {
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
	public boolean isFollowing(final Channel channel) {
		/**
		 * followedChannels->includes(channel)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Channel> followedChannels = this.getFollowedChannels();
		final /*@NonInvalid*/ OrderedSetValue BOXED_followedChannels = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Channel, followedChannels);
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
		 * tips->collect(t | t.amount)
		 * ->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Subscription> subscriptions = this.getSubscriptions();
		final /*@NonInvalid*/ OrderedSetValue BOXED_subscriptions = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Subscription, subscriptions);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_DATAid_EFloat);
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
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EFloat, collect);
		final /*@NonInvalid*/ List<Tip> tips = this.getTips();
		final /*@NonInvalid*/ OrderedSetValue BOXED_tips = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Tip, tips);
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_DATAid_EFloat);
		Iterator<Object> ITERATOR_t = BOXED_tips.iterator();
		/*@NonInvalid*/ SequenceValue collect_0;
		while (true) {
			if (!ITERATOR_t.hasNext()) {
				collect_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Tip t = (Tip)ITERATOR_t.next();
			/**
			 * t.amount
			 */
			final /*@NonInvalid*/ float amount_0 = t.getAmount();
			final /*@NonInvalid*/ RealValue BOXED_amount_0 = ValueUtil.realValueOf(amount_0);
			//
			accumulator_0.add(BOXED_amount_0);
		}
		final /*@NonInvalid*/ RealValue sum_0 = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EFloat, collect_0);
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
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
			case RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.USER__TIPS:
				return ((InternalEList<?>)getTips()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
			case RefinedStreamingPlatformPackage.USER__NAME:
				return getName();
			case RefinedStreamingPlatformPackage.USER__USER_ID:
				return getUserID();
			case RefinedStreamingPlatformPackage.USER__ROLE:
				return getRole();
			case RefinedStreamingPlatformPackage.USER__AVATAR:
				return getAvatar();
			case RefinedStreamingPlatformPackage.USER__IS_ONLINE:
				return isIsOnline();
			case RefinedStreamingPlatformPackage.USER__NICKNAME:
				return getNickname();
			case RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return getSubscriptions();
			case RefinedStreamingPlatformPackage.USER__TIPS:
				return getTips();
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
			case RefinedStreamingPlatformPackage.USER__NAME:
				setName((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__USER_ID:
				setUserID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__ROLE:
				setRole((Role)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__AVATAR:
				setAvatar((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__IS_ONLINE:
				setIsOnline((Boolean)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__NICKNAME:
				setNickname((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__TIPS:
				getTips().clear();
				getTips().addAll((Collection<? extends Tip>)newValue);
				return;
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
			case RefinedStreamingPlatformPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__AVATAR:
				setAvatar(AVATAR_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__IS_ONLINE:
				setIsOnline(IS_ONLINE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case RefinedStreamingPlatformPackage.USER__TIPS:
				getTips().clear();
				return;
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
			case RefinedStreamingPlatformPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefinedStreamingPlatformPackage.USER__USER_ID:
				return userID != USER_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.USER__ROLE:
				return role != ROLE_EDEFAULT;
			case RefinedStreamingPlatformPackage.USER__AVATAR:
				return AVATAR_EDEFAULT == null ? avatar != null : !AVATAR_EDEFAULT.equals(avatar);
			case RefinedStreamingPlatformPackage.USER__IS_ONLINE:
				return isOnline != IS_ONLINE_EDEFAULT;
			case RefinedStreamingPlatformPackage.USER__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case RefinedStreamingPlatformPackage.USER__SUBSCRIPTIONS:
				return subscriptions != null && !subscriptions.isEmpty();
			case RefinedStreamingPlatformPackage.USER__TIPS:
				return tips != null && !tips.isEmpty();
			case RefinedStreamingPlatformPackage.USER__FOLLOWED_CHANNELS:
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
				case RefinedStreamingPlatformPackage.USER__NAME: return RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME;
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
				case RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME: return RefinedStreamingPlatformPackage.USER__NAME;
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
			case RefinedStreamingPlatformPackage.USER___TOTAL_TIPS:
				return totalTips();
			case RefinedStreamingPlatformPackage.USER___IS_FOLLOWING__CHANNEL:
				return isFollowing((Channel)arguments.get(0));
			case RefinedStreamingPlatformPackage.USER___TOTAL_SPENDING:
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
		result.append(')');
		return result.toString();
	}

} //UserImpl
