/**
 */
package StreamingPlatform;

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
 *   <li>{@link StreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getVersion <em>Version</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getSupportedRegions <em>Supported Regions</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getSupportedLanguages <em>Supported Languages</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getSupportedDevices <em>Supported Devices</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getSupportedResolutions <em>Supported Resolutions</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getUsers <em>Users</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getChannels <em>Channels</em>}</li>
 *   <li>{@link StreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends Auditable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Platform ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform ID</em>' attribute.
	 * @see #setPlatformID(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_PlatformID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPlatformID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform ID</em>' attribute.
	 * @see #getPlatformID()
	 * @generated
	 */
	void setPlatformID(String value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(double)
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_Revenue()
	 * @model required="true"
	 * @generated
	 */
	double getRevenue();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Platform#getRevenue <em>Revenue</em>}' attribute.
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_Version()
	 * @model required="true"
	 * @generated
	 */
	float getVersion();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Platform#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(float value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Platform#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Supported Regions</b></em>' attribute list.
	 * The list contents are of type {@link StreamingPlatform.Region}.
	 * The literals are from the enumeration {@link StreamingPlatform.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Regions</em>' attribute list.
	 * @see StreamingPlatform.Region
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_SupportedRegions()
	 * @model
	 * @generated
	 */
	EList<Region> getSupportedRegions();

	/**
	 * Returns the value of the '<em><b>Supported Languages</b></em>' attribute list.
	 * The list contents are of type {@link StreamingPlatform.Language}.
	 * The literals are from the enumeration {@link StreamingPlatform.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Languages</em>' attribute list.
	 * @see StreamingPlatform.Language
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_SupportedLanguages()
	 * @model
	 * @generated
	 */
	EList<Language> getSupportedLanguages();

	/**
	 * Returns the value of the '<em><b>Supported Devices</b></em>' attribute list.
	 * The list contents are of type {@link StreamingPlatform.Device}.
	 * The literals are from the enumeration {@link StreamingPlatform.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Devices</em>' attribute list.
	 * @see StreamingPlatform.Device
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_SupportedDevices()
	 * @model
	 * @generated
	 */
	EList<Device> getSupportedDevices();

	/**
	 * Returns the value of the '<em><b>Supported Resolutions</b></em>' attribute list.
	 * The list contents are of type {@link StreamingPlatform.Resolution}.
	 * The literals are from the enumeration {@link StreamingPlatform.Resolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Resolutions</em>' attribute list.
	 * @see StreamingPlatform.Resolution
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_SupportedResolutions()
	 * @model
	 * @generated
	 */
	EList<Resolution> getSupportedResolutions();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_Channels()
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
	 * @see StreamingPlatform.StreamingPlatformPackage#getPlatform_TotalRevenue()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	double getTotalRevenue();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}' attribute.
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
