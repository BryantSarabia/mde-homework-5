/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getVersion <em>Version</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getSupportedRegions <em>Supported Regions</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getSupportedLanguages <em>Supported Languages</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getSupportedDevices <em>Supported Devices</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getSupportedVideoQualities <em>Supported Video Qualities</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getUsers <em>Users</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getChannels <em>Channels</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}</li>
 * </ul>
 *
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends Auditable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Platform ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform ID</em>' attribute.
	 * @see #setPlatformID(int)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_PlatformID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getPlatformID();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform ID</em>' attribute.
	 * @see #getPlatformID()
	 * @generated
	 */
	void setPlatformID(int value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(double)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_Revenue()
	 * @model required="true"
	 * @generated
	 */
	double getRevenue();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Platform#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(double value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(float)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_Version()
	 * @model required="true"
	 * @generated
	 */
	float getVersion();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Platform#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(float value);

	/**
	 * Returns the value of the '<em><b>Supported Regions</b></em>' attribute list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Region}.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Regions</em>' attribute list.
	 * @see RefinedStreamingPlatform.Region
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_SupportedRegions()
	 * @model
	 * @generated
	 */
	EList<Region> getSupportedRegions();

	/**
	 * Returns the value of the '<em><b>Supported Languages</b></em>' attribute list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Language}.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Languages</em>' attribute list.
	 * @see RefinedStreamingPlatform.Language
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_SupportedLanguages()
	 * @model
	 * @generated
	 */
	EList<Language> getSupportedLanguages();

	/**
	 * Returns the value of the '<em><b>Supported Devices</b></em>' attribute list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Device}.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Devices</em>' attribute list.
	 * @see RefinedStreamingPlatform.Device
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_SupportedDevices()
	 * @model
	 * @generated
	 */
	EList<Device> getSupportedDevices();

	/**
	 * Returns the value of the '<em><b>Supported Video Qualities</b></em>' attribute list.
	 * The list contents are of type {@link RefinedStreamingPlatform.VideoQuality}.
	 * The literals are from the enumeration {@link RefinedStreamingPlatform.VideoQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Video Qualities</em>' attribute list.
	 * @see RefinedStreamingPlatform.VideoQuality
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_SupportedVideoQualities()
	 * @model
	 * @generated
	 */
	EList<VideoQuality> getSupportedVideoQualities();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link RefinedStreamingPlatform.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Total Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Revenue</em>' attribute.
	 * @see #setTotalRevenue(double)
	 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getPlatform_TotalRevenue()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	double getTotalRevenue();

	/**
	 * Sets the value of the '{@link RefinedStreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Revenue</em>' attribute.
	 * @see #getTotalRevenue()
	 * @generated
	 */
	void setTotalRevenue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='users-&gt;select(u | u.isOnline = true)-&gt;size()'"
	 * @generated
	 */
	int activeUsersCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='channels-&gt;any(c | c.name = name)'"
	 * @generated
	 */
	Channel findChannelByName(String name);

} // Platform
