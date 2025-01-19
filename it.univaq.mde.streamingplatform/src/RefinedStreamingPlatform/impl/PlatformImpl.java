/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Channel;
import RefinedStreamingPlatform.Device;
import RefinedStreamingPlatform.Language;
import RefinedStreamingPlatform.NamedElement;
import RefinedStreamingPlatform.Platform;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import RefinedStreamingPlatform.Region;
import RefinedStreamingPlatform.Subscription;
import RefinedStreamingPlatform.Tip;
import RefinedStreamingPlatform.User;
import RefinedStreamingPlatform.VideoQuality;

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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getName <em>Name</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getPlatformID <em>Platform ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getSupportedRegions <em>Supported Regions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getSupportedLanguages <em>Supported Languages</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getSupportedDevices <em>Supported Devices</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getSupportedVideoQualities <em>Supported Video Qualities</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.PlatformImpl#getTotalRevenue <em>Total Revenue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends AuditableImpl implements Platform {
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
	 * The default value of the '{@link #getPlatformID() <em>Platform ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformID()
	 * @generated
	 * @ordered
	 */
	protected static final int PLATFORM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlatformID() <em>Platform ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformID()
	 * @generated
	 * @ordered
	 */
	protected int platformID = PLATFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final double REVENUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected double revenue = REVENUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final float VERSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected float version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedRegions() <em>Supported Regions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> supportedRegions;

	/**
	 * The cached value of the '{@link #getSupportedLanguages() <em>Supported Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> supportedLanguages;

	/**
	 * The cached value of the '{@link #getSupportedDevices() <em>Supported Devices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> supportedDevices;

	/**
	 * The cached value of the '{@link #getSupportedVideoQualities() <em>Supported Video Qualities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedVideoQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoQuality> supportedVideoQualities;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The default value of the '{@link #getTotalRevenue() <em>Total Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_REVENUE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.PLATFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.PLATFORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlatformID() {
		return platformID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformID(int newPlatformID) {
		int oldPlatformID = platformID;
		platformID = newPlatformID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID, oldPlatformID, platformID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevenue(double newRevenue) {
		double oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.PLATFORM__REVENUE, oldRevenue, revenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(float newVersion) {
		float oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.PLATFORM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getSupportedRegions() {
		if (supportedRegions == null) {
			supportedRegions = new EDataTypeUniqueEList<Region>(Region.class, this, RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS);
		}
		return supportedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Language> getSupportedLanguages() {
		if (supportedLanguages == null) {
			supportedLanguages = new EDataTypeUniqueEList<Language>(Language.class, this, RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES);
		}
		return supportedLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getSupportedDevices() {
		if (supportedDevices == null) {
			supportedDevices = new EDataTypeUniqueEList<Device>(Device.class, this, RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES);
		}
		return supportedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VideoQuality> getSupportedVideoQualities() {
		if (supportedVideoQualities == null) {
			supportedVideoQualities = new EDataTypeUniqueEList<VideoQuality>(VideoQuality.class, this, RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES);
		}
		return supportedVideoQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, RefinedStreamingPlatformPackage.PLATFORM__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, RefinedStreamingPlatformPackage.PLATFORM__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalRevenue() {
		/**
		 * channels->collect(c |
		 *   c.tips->collect(t | t.amount)
		 *   ->sum() +
		 *   c.subscriptions->collect(s | s.price)
		 *   ->sum())->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Channel> channels = this.getChannels();
		final /*@NonInvalid*/ OrderedSetValue BOXED_channels = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Channel, channels);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_PRIMid_Real);
		Iterator<Object> ITERATOR_c = BOXED_channels.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_c.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Channel c = (Channel)ITERATOR_c.next();
			/**
			 *
			 * c.tips->collect(t | t.amount)
			 * ->sum() +
			 * c.subscriptions->collect(s | s.price)
			 * ->sum()
			 */
			final /*@NonInvalid*/ List<Tip> tips = c.getTips();
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
				final /*@NonInvalid*/ float amount = t.getAmount();
				final /*@NonInvalid*/ RealValue BOXED_amount = ValueUtil.realValueOf(amount);
				//
				accumulator_0.add(BOXED_amount);
			}
			final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EFloat, collect_0);
			final /*@NonInvalid*/ List<Subscription> subscriptions = c.getSubscriptions();
			final /*@NonInvalid*/ OrderedSetValue BOXED_subscriptions = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Subscription, subscriptions);
			/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(RefinedStreamingPlatformTables.SEQ_DATAid_EFloat);
			Iterator<Object> ITERATOR_s = BOXED_subscriptions.iterator();
			/*@NonInvalid*/ SequenceValue collect_1;
			while (true) {
				if (!ITERATOR_s.hasNext()) {
					collect_1 = accumulator_1;
					break;
				}
				/*@NonInvalid*/ Subscription s = (Subscription)ITERATOR_s.next();
				/**
				 * s.price
				 */
				final /*@NonInvalid*/ float price = s.getPrice();
				final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
				//
				accumulator_1.add(BOXED_price);
			}
			final /*@NonInvalid*/ RealValue sum_0 = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformTables.DATAid_EFloat, collect_1);
			final /*@NonInvalid*/ RealValue sum_1 = NumericPlusOperation.INSTANCE.evaluate(sum, sum_0);
			//
			accumulator.add(sum_1);
		}
		final /*@NonInvalid*/ RealValue sum_2 = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, TypeId.REAL, collect);
		final /*@NonInvalid*/ double ECORE_sum_2 = ValueUtil.doubleValueOf(sum_2);
		return ECORE_sum_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRevenue(double newTotalRevenue) {
		// TODO: implement this method to set the 'Total Revenue' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int activeUsersCount() {
		/**
		 * users->select(u | u.isOnline = true)->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<User> users = this.getUsers();
		final /*@NonInvalid*/ OrderedSetValue BOXED_users = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_User, users);
		/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RefinedStreamingPlatformTables.ORD_CLSSid_User);
		Iterator<Object> ITERATOR_u = BOXED_users.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_u.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ User u = (User)ITERATOR_u.next();
			/**
			 * u.isOnline
			 */
			final /*@NonInvalid*/ boolean isOnline = u.isIsOnline();
			//
			if (isOnline) {
				accumulator.add(u);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel findChannelByName(final String name) {
		/**
		 * channels->any(c | c.name = name)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Channel> channels = this.getChannels();
		final /*@NonInvalid*/ OrderedSetValue BOXED_channels = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_Channel, channels);
		Iterator<Object> ITERATOR_c = BOXED_channels.iterator();
		/*@NonInvalid*/ Channel any;
		while (true) {
			if (!ITERATOR_c.hasNext()) {
				throw new InvalidValueException("Nothing to return for ''any''");
			}
			/*@NonInvalid*/ Channel c = (Channel)ITERATOR_c.next();
			/**
			 * c.name = name
			 */
			final /*@NonInvalid*/ String name_0 = c.getName();
			final /*@NonInvalid*/ boolean eq = name_0.equals(name);
			//
			if (eq) {			// Carry on till something found
				any = c;
				break;
			}
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
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
			case RefinedStreamingPlatformPackage.PLATFORM__NAME:
				return getName();
			case RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				return getPlatformID();
			case RefinedStreamingPlatformPackage.PLATFORM__REVENUE:
				return getRevenue();
			case RefinedStreamingPlatformPackage.PLATFORM__VERSION:
				return getVersion();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				return getSupportedRegions();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				return getSupportedDevices();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES:
				return getSupportedVideoQualities();
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
				return getUsers();
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				return getChannels();
			case RefinedStreamingPlatformPackage.PLATFORM__TOTAL_REVENUE:
				return getTotalRevenue();
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
			case RefinedStreamingPlatformPackage.PLATFORM__NAME:
				setName((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__REVENUE:
				setRevenue((Double)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__VERSION:
				setVersion((Float)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				getSupportedRegions().clear();
				getSupportedRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				getSupportedLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				getSupportedDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES:
				getSupportedVideoQualities().clear();
				getSupportedVideoQualities().addAll((Collection<? extends VideoQuality>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__TOTAL_REVENUE:
				setTotalRevenue((Double)newValue);
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
			case RefinedStreamingPlatformPackage.PLATFORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformID(PLATFORM_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__REVENUE:
				setRevenue(REVENUE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				getSupportedRegions().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES:
				getSupportedVideoQualities().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
				getUsers().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				getChannels().clear();
				return;
			case RefinedStreamingPlatformPackage.PLATFORM__TOTAL_REVENUE:
				setTotalRevenue(TOTAL_REVENUE_EDEFAULT);
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
			case RefinedStreamingPlatformPackage.PLATFORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefinedStreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				return platformID != PLATFORM_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.PLATFORM__REVENUE:
				return revenue != REVENUE_EDEFAULT;
			case RefinedStreamingPlatformPackage.PLATFORM__VERSION:
				return version != VERSION_EDEFAULT;
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				return supportedRegions != null && !supportedRegions.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				return supportedLanguages != null && !supportedLanguages.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				return supportedDevices != null && !supportedDevices.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__SUPPORTED_VIDEO_QUALITIES:
				return supportedVideoQualities != null && !supportedVideoQualities.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__USERS:
				return users != null && !users.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__CHANNELS:
				return channels != null && !channels.isEmpty();
			case RefinedStreamingPlatformPackage.PLATFORM__TOTAL_REVENUE:
				return getTotalRevenue() != TOTAL_REVENUE_EDEFAULT;
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
				case RefinedStreamingPlatformPackage.PLATFORM__NAME: return RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME;
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
				case RefinedStreamingPlatformPackage.NAMED_ELEMENT__NAME: return RefinedStreamingPlatformPackage.PLATFORM__NAME;
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
			case RefinedStreamingPlatformPackage.PLATFORM___ACTIVE_USERS_COUNT:
				return activeUsersCount();
			case RefinedStreamingPlatformPackage.PLATFORM___FIND_CHANNEL_BY_NAME__STRING:
				return findChannelByName((String)arguments.get(0));
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
		result.append(", platformID: ");
		result.append(platformID);
		result.append(", revenue: ");
		result.append(revenue);
		result.append(", version: ");
		result.append(version);
		result.append(", supportedRegions: ");
		result.append(supportedRegions);
		result.append(", supportedLanguages: ");
		result.append(supportedLanguages);
		result.append(", supportedDevices: ");
		result.append(supportedDevices);
		result.append(", supportedVideoQualities: ");
		result.append(supportedVideoQualities);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
