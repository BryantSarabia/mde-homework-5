/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Channel;
import StreamingPlatform.Device;
import StreamingPlatform.Language;
import StreamingPlatform.NamedElement;
import StreamingPlatform.Platform;
import StreamingPlatform.Region;
import StreamingPlatform.Resolution;
import StreamingPlatform.StreamingPlatformPackage;
import StreamingPlatform.User;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getName <em>Name</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getPlatformID <em>Platform ID</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getSupportedRegions <em>Supported Regions</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getSupportedLanguages <em>Supported Languages</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getSupportedDevices <em>Supported Devices</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getSupportedResolutions <em>Supported Resolutions</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link StreamingPlatform.impl.PlatformImpl#getChannels <em>Channels</em>}</li>
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
	protected static final UUID PLATFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformID() <em>Platform ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformID()
	 * @generated
	 * @ordered
	 */
	protected UUID platformID = PLATFORM_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSupportedResolutions() <em>Supported Resolutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedResolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resolution> supportedResolutions;

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
		return StreamingPlatformPackage.Literals.PLATFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.PLATFORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUID getPlatformID() {
		return platformID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformID(UUID newPlatformID) {
		UUID oldPlatformID = platformID;
		platformID = newPlatformID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.PLATFORM__PLATFORM_ID, oldPlatformID, platformID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.PLATFORM__REVENUE, oldRevenue, revenue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.PLATFORM__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.PLATFORM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getSupportedRegions() {
		if (supportedRegions == null) {
			supportedRegions = new EDataTypeUniqueEList<Region>(Region.class, this, StreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS);
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
			supportedLanguages = new EDataTypeUniqueEList<Language>(Language.class, this, StreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES);
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
			supportedDevices = new EDataTypeUniqueEList<Device>(Device.class, this, StreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES);
		}
		return supportedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resolution> getSupportedResolutions() {
		if (supportedResolutions == null) {
			supportedResolutions = new EDataTypeUniqueEList<Resolution>(Resolution.class, this, StreamingPlatformPackage.PLATFORM__SUPPORTED_RESOLUTIONS);
		}
		return supportedResolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, StreamingPlatformPackage.PLATFORM__USERS);
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
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, StreamingPlatformPackage.PLATFORM__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamingPlatformPackage.PLATFORM__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.PLATFORM__CHANNELS:
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
			case StreamingPlatformPackage.PLATFORM__NAME:
				return getName();
			case StreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				return getPlatformID();
			case StreamingPlatformPackage.PLATFORM__REVENUE:
				return getRevenue();
			case StreamingPlatformPackage.PLATFORM__VERSION:
				return getVersion();
			case StreamingPlatformPackage.PLATFORM__DESCRIPTION:
				return getDescription();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				return getSupportedRegions();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				return getSupportedDevices();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_RESOLUTIONS:
				return getSupportedResolutions();
			case StreamingPlatformPackage.PLATFORM__USERS:
				return getUsers();
			case StreamingPlatformPackage.PLATFORM__CHANNELS:
				return getChannels();
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
			case StreamingPlatformPackage.PLATFORM__NAME:
				setName((String)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformID((UUID)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__REVENUE:
				setRevenue((Double)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__VERSION:
				setVersion((Float)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				getSupportedRegions().clear();
				getSupportedRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				getSupportedLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				getSupportedDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_RESOLUTIONS:
				getSupportedResolutions().clear();
				getSupportedResolutions().addAll((Collection<? extends Resolution>)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case StreamingPlatformPackage.PLATFORM__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
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
			case StreamingPlatformPackage.PLATFORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				setPlatformID(PLATFORM_ID_EDEFAULT);
				return;
			case StreamingPlatformPackage.PLATFORM__REVENUE:
				setRevenue(REVENUE_EDEFAULT);
				return;
			case StreamingPlatformPackage.PLATFORM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case StreamingPlatformPackage.PLATFORM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				getSupportedRegions().clear();
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				return;
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_RESOLUTIONS:
				getSupportedResolutions().clear();
				return;
			case StreamingPlatformPackage.PLATFORM__USERS:
				getUsers().clear();
				return;
			case StreamingPlatformPackage.PLATFORM__CHANNELS:
				getChannels().clear();
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
			case StreamingPlatformPackage.PLATFORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StreamingPlatformPackage.PLATFORM__PLATFORM_ID:
				return PLATFORM_ID_EDEFAULT == null ? platformID != null : !PLATFORM_ID_EDEFAULT.equals(platformID);
			case StreamingPlatformPackage.PLATFORM__REVENUE:
				return revenue != REVENUE_EDEFAULT;
			case StreamingPlatformPackage.PLATFORM__VERSION:
				return version != VERSION_EDEFAULT;
			case StreamingPlatformPackage.PLATFORM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_REGIONS:
				return supportedRegions != null && !supportedRegions.isEmpty();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_LANGUAGES:
				return supportedLanguages != null && !supportedLanguages.isEmpty();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_DEVICES:
				return supportedDevices != null && !supportedDevices.isEmpty();
			case StreamingPlatformPackage.PLATFORM__SUPPORTED_RESOLUTIONS:
				return supportedResolutions != null && !supportedResolutions.isEmpty();
			case StreamingPlatformPackage.PLATFORM__USERS:
				return users != null && !users.isEmpty();
			case StreamingPlatformPackage.PLATFORM__CHANNELS:
				return channels != null && !channels.isEmpty();
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
				case StreamingPlatformPackage.PLATFORM__NAME: return StreamingPlatformPackage.NAMED_ELEMENT__NAME;
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
				case StreamingPlatformPackage.NAMED_ELEMENT__NAME: return StreamingPlatformPackage.PLATFORM__NAME;
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
		result.append(", platformID: ");
		result.append(platformID);
		result.append(", revenue: ");
		result.append(revenue);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", supportedRegions: ");
		result.append(supportedRegions);
		result.append(", supportedLanguages: ");
		result.append(supportedLanguages);
		result.append(", supportedDevices: ");
		result.append(supportedDevices);
		result.append(", supportedResolutions: ");
		result.append(supportedResolutions);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
