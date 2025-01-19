/**
 */
package StreamingPlatform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface StreamingPlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StreamingPlatform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https:/streaming-platform.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamingPlatformPackage eINSTANCE = StreamingPlatform.impl.StreamingPlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.NamedElementImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.AuditableImpl <em>Auditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.AuditableImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getAuditable()
	 * @generated
	 */
	int AUDITABLE = 12;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE__CREATED_AT = 0;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE__UPDATED_AT = 1;

	/**
	 * The number of structural features of the '<em>Auditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.PlatformImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__CREATED_AT = AUDITABLE__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__UPDATED_AT = AUDITABLE__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PLATFORM_ID = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__REVENUE = AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__VERSION = AUDITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DESCRIPTION = AUDITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supported Regions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_REGIONS = AUDITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_LANGUAGES = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Supported Devices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_DEVICES = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Supported Resolutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_RESOLUTIONS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__USERS = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__CHANNELS = AUDITABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__TOTAL_REVENUE = AUDITABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Active Users Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM___ACTIVE_USERS_COUNT = AUDITABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Channel By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM___FIND_CHANNEL_BY_NAME__STRING = AUDITABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = AUDITABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.ChannelImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CREATED_AT = AUDITABLE__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__UPDATED_AT = AUDITABLE__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_ID = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__STREAMS = AUDITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CLIPS = AUDITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Moderators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__MODERATORS = AUDITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FOLLOWERS = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Donations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DONATIONS = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SUBSCRIPTIONS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Emotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__EMOTES = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__BADGES = AUDITABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__OWNER = AUDITABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Total Donations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TOTAL_DONATIONS = AUDITABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Total Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TOTAL_FOLLOWERS = AUDITABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Total Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TOTAL_VIEWS = AUDITABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = AUDITABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.UserImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_AT = AUDITABLE__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UPDATED_AT = AUDITABLE__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = AUDITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = AUDITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AVATAR = AUDITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_ONLINE = AUDITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NICKNAME = AUDITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBSCRIPTIONS = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Donations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DONATIONS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Followed Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FOLLOWED_CHANNELS = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Total Donations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___TOTAL_DONATIONS = AUDITABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Following</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___IS_FOLLOWING__CHANNEL = AUDITABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Total Spending</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___TOTAL_SPENDING = AUDITABLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = AUDITABLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.FeatureImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TENURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Donation Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DONATION_AMOUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unlock Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UNLOCK_CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eligibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ELIGIBILITY_DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.BadgeImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__TENURE = FEATURE__TENURE;

	/**
	 * The feature id for the '<em><b>Donation Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DONATION_AMOUNT = FEATURE__DONATION_AMOUNT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unlock Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__UNLOCK_CONDITION = FEATURE__UNLOCK_CONDITION;

	/**
	 * The feature id for the '<em><b>Eligibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ELIGIBILITY_DESCRIPTION = FEATURE__ELIGIBILITY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Badge ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__BADGE_ID = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.EmoteImpl <em>Emote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.EmoteImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getEmote()
	 * @generated
	 */
	int EMOTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__TENURE = FEATURE__TENURE;

	/**
	 * The feature id for the '<em><b>Donation Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__DONATION_AMOUNT = FEATURE__DONATION_AMOUNT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__DESCRIPTION = FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unlock Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__UNLOCK_CONDITION = FEATURE__UNLOCK_CONDITION;

	/**
	 * The feature id for the '<em><b>Eligibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__ELIGIBILITY_DESCRIPTION = FEATURE__ELIGIBILITY_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Emote ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE__EMOTE_ID = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Emote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.MediaContentImpl <em>Media Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.MediaContentImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMediaContent()
	 * @generated
	 */
	int MEDIA_CONTENT = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__TAGS = 2;

	/**
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__VIEW_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__RESOLUTIONS = 5;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__MESSAGES = 6;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__REACTIONS = 7;

	/**
	 * The number of structural features of the '<em>Media Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Media Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.StreamImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__TITLE = MEDIA_CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__CATEGORY = MEDIA_CONTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__TAGS = MEDIA_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__VIEW_COUNT = MEDIA_CONTENT__VIEW_COUNT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__DESCRIPTION = MEDIA_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__RESOLUTIONS = MEDIA_CONTENT__RESOLUTIONS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__MESSAGES = MEDIA_CONTENT__MESSAGES;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__REACTIONS = MEDIA_CONTENT__REACTIONS;

	/**
	 * The feature id for the '<em><b>Stream ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__STREAM_ID = MEDIA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__IS_LIVE = MEDIA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__VIEWERS = MEDIA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active Viewers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__ACTIVE_VIEWERS = MEDIA_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = MEDIA_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Live Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM___LIVE_CONDITION__DIAGNOSTICCHAIN_MAP = MEDIA_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = MEDIA_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.ClipImpl <em>Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.ClipImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getClip()
	 * @generated
	 */
	int CLIP = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__TITLE = MEDIA_CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__CATEGORY = MEDIA_CONTENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__TAGS = MEDIA_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__VIEW_COUNT = MEDIA_CONTENT__VIEW_COUNT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__DESCRIPTION = MEDIA_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__RESOLUTIONS = MEDIA_CONTENT__RESOLUTIONS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__MESSAGES = MEDIA_CONTENT__MESSAGES;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__REACTIONS = MEDIA_CONTENT__REACTIONS;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__CLIP_ID = MEDIA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__CREATED_BY = MEDIA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_FEATURE_COUNT = MEDIA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_OPERATION_COUNT = MEDIA_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.MonetizationImpl <em>Monetization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.MonetizationImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMonetization()
	 * @generated
	 */
	int MONETIZATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__AMOUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__CURRENCY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__TRANSACTION_DATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__PAYMENT_STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__PAYMENT_METHOD = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Monetization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Positive Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monetization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.DonationImpl <em>Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.DonationImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getDonation()
	 * @generated
	 */
	int DONATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__NAME = MONETIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__AMOUNT = MONETIZATION__AMOUNT;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__CURRENCY = MONETIZATION__CURRENCY;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__TRANSACTION_DATE = MONETIZATION__TRANSACTION_DATE;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__PAYMENT_STATUS = MONETIZATION__PAYMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__PAYMENT_METHOD = MONETIZATION__PAYMENT_METHOD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__DESCRIPTION = MONETIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Donation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__DONATION_ID = MONETIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__MESSAGE = MONETIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FEATURE_COUNT = MONETIZATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Positive Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_OPERATION_COUNT = MONETIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.SubscriptionImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__NAME = MONETIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AMOUNT = MONETIZATION__AMOUNT;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CURRENCY = MONETIZATION__CURRENCY;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__TRANSACTION_DATE = MONETIZATION__TRANSACTION_DATE;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PAYMENT_STATUS = MONETIZATION__PAYMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PAYMENT_METHOD = MONETIZATION__PAYMENT_METHOD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DESCRIPTION = MONETIZATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subscription ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_ID = MONETIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__TIER = MONETIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRICE = MONETIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DURATION = MONETIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AUTO_RENEWAL = MONETIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__START_DATE = MONETIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__END_DATE = MONETIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Emotes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EMOTES = MONETIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__BADGE = MONETIZATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = MONETIZATION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Positive Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Start Date Less Than End Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP = MONETIZATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Transaction Date Less Than Start Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP = MONETIZATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = MONETIZATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.UserInteractionImpl <em>User Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.UserInteractionImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUserInteraction()
	 * @generated
	 */
	int USER_INTERACTION = 15;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__USER = 2;

	/**
	 * The number of structural features of the '<em>User Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.MessageImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIMESTAMP = USER_INTERACTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = USER_INTERACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__USER = USER_INTERACTION__USER;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_ID = USER_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = USER_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = USER_INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = USER_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.impl.ReactionImpl
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 11;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__TIMESTAMP = USER_INTERACTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__DESCRIPTION = USER_INTERACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__USER = USER_INTERACTION__USER;

	/**
	 * The feature id for the '<em><b>Reaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__REACTION_ID = USER_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__REACTION_TYPE = USER_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = USER_INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OPERATION_COUNT = USER_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.SubscriptionDuration
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getSubscriptionDuration()
	 * @generated
	 */
	int SUBSCRIPTION_DURATION = 17;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Category
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 18;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Currency
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 19;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Device <em>Device</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Device
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 20;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Language
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 21;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Region <em>Region</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Region
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 22;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Resolution <em>Resolution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Resolution
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 23;

	/**
	 * The meta object id for the '{@link StreamingPlatform.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.PaymentMethod
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 24;

	/**
	 * The meta object id for the '{@link StreamingPlatform.PaymentStatus <em>Payment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.PaymentStatus
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 25;

	/**
	 * The meta object id for the '{@link StreamingPlatform.ReactionType <em>Reaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.ReactionType
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getReactionType()
	 * @generated
	 */
	int REACTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Role
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 27;

	/**
	 * The meta object id for the '{@link StreamingPlatform.Tier <em>Tier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.Tier
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getTier()
	 * @generated
	 */
	int TIER = 28;

	/**
	 * The meta object id for the '{@link StreamingPlatform.UnlockCondition <em>Unlock Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.UnlockCondition
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUnlockCondition()
	 * @generated
	 */
	int UNLOCK_CONDITION = 29;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 30;


	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 31;


	/**
	 * Returns the meta object for class '{@link StreamingPlatform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see StreamingPlatform.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StreamingPlatform.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see StreamingPlatform.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform ID</em>'.
	 * @see StreamingPlatform.Platform#getPlatformID()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_PlatformID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Platform#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see StreamingPlatform.Platform#getRevenue()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Revenue();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Platform#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see StreamingPlatform.Platform#getVersion()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Version();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Platform#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.Platform#getDescription()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Description();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.Platform#getSupportedRegions <em>Supported Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Regions</em>'.
	 * @see StreamingPlatform.Platform#getSupportedRegions()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedRegions();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.Platform#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Languages</em>'.
	 * @see StreamingPlatform.Platform#getSupportedLanguages()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedLanguages();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.Platform#getSupportedDevices <em>Supported Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Devices</em>'.
	 * @see StreamingPlatform.Platform#getSupportedDevices()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedDevices();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.Platform#getSupportedResolutions <em>Supported Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Resolutions</em>'.
	 * @see StreamingPlatform.Platform#getSupportedResolutions()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedResolutions();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Platform#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see StreamingPlatform.Platform#getUsers()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Platform#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see StreamingPlatform.Platform#getChannels()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Channels();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Revenue</em>'.
	 * @see StreamingPlatform.Platform#getTotalRevenue()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_TotalRevenue();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Platform#activeUsersCount() <em>Active Users Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Active Users Count</em>' operation.
	 * @see StreamingPlatform.Platform#activeUsersCount()
	 * @generated
	 */
	EOperation getPlatform__ActiveUsersCount();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Platform#findChannelByName(java.lang.String) <em>Find Channel By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Channel By Name</em>' operation.
	 * @see StreamingPlatform.Platform#findChannelByName(java.lang.String)
	 * @generated
	 */
	EOperation getPlatform__FindChannelByName__String();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see StreamingPlatform.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Channel#getChannelID <em>Channel ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel ID</em>'.
	 * @see StreamingPlatform.Channel#getChannelID()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ChannelID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Channel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.Channel#getDescription()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streams</em>'.
	 * @see StreamingPlatform.Channel#getStreams()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Streams();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clips</em>'.
	 * @see StreamingPlatform.Channel#getClips()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Clips();

	/**
	 * Returns the meta object for the reference list '{@link StreamingPlatform.Channel#getModerators <em>Moderators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Moderators</em>'.
	 * @see StreamingPlatform.Channel#getModerators()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Moderators();

	/**
	 * Returns the meta object for the reference list '{@link StreamingPlatform.Channel#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followers</em>'.
	 * @see StreamingPlatform.Channel#getFollowers()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Followers();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getDonations <em>Donations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Donations</em>'.
	 * @see StreamingPlatform.Channel#getDonations()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Donations();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriptions</em>'.
	 * @see StreamingPlatform.Channel#getSubscriptions()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Subscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getEmotes <em>Emotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emotes</em>'.
	 * @see StreamingPlatform.Channel#getEmotes()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Emotes();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.Channel#getBadges <em>Badges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badges</em>'.
	 * @see StreamingPlatform.Channel#getBadges()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Badges();

	/**
	 * Returns the meta object for the reference '{@link StreamingPlatform.Channel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see StreamingPlatform.Channel#getOwner()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Owner();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Channel#getTotalDonations <em>Total Donations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Donations</em>'.
	 * @see StreamingPlatform.Channel#getTotalDonations()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalDonations();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Channel#getTotalFollowers <em>Total Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Followers</em>'.
	 * @see StreamingPlatform.Channel#getTotalFollowers()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalFollowers();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Channel#getTotalViews <em>Total Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Views</em>'.
	 * @see StreamingPlatform.Channel#getTotalViews()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalViews();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see StreamingPlatform.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see StreamingPlatform.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see StreamingPlatform.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Role();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#getAvatar <em>Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar</em>'.
	 * @see StreamingPlatform.User#getAvatar()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Avatar();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#isIsOnline <em>Is Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Online</em>'.
	 * @see StreamingPlatform.User#isIsOnline()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsOnline();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see StreamingPlatform.User#getNickname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.User#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.User#getDescription()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.User#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriptions</em>'.
	 * @see StreamingPlatform.User#getSubscriptions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Subscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.User#getDonations <em>Donations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Donations</em>'.
	 * @see StreamingPlatform.User#getDonations()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Donations();

	/**
	 * Returns the meta object for the reference list '{@link StreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followed Channels</em>'.
	 * @see StreamingPlatform.User#getFollowedChannels()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_FollowedChannels();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.User#totalDonations() <em>Total Donations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Donations</em>' operation.
	 * @see StreamingPlatform.User#totalDonations()
	 * @generated
	 */
	EOperation getUser__TotalDonations();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.User#isFollowing(StreamingPlatform.Channel) <em>Is Following</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Following</em>' operation.
	 * @see StreamingPlatform.User#isFollowing(StreamingPlatform.Channel)
	 * @generated
	 */
	EOperation getUser__IsFollowing__Channel();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.User#totalSpending() <em>Total Spending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Spending</em>' operation.
	 * @see StreamingPlatform.User#totalSpending()
	 * @generated
	 */
	EOperation getUser__TotalSpending();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see StreamingPlatform.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Badge#getBadgeID <em>Badge ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Badge ID</em>'.
	 * @see StreamingPlatform.Badge#getBadgeID()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_BadgeID();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Emote <em>Emote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emote</em>'.
	 * @see StreamingPlatform.Emote
	 * @generated
	 */
	EClass getEmote();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Emote#getEmoteID <em>Emote ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emote ID</em>'.
	 * @see StreamingPlatform.Emote#getEmoteID()
	 * @see #getEmote()
	 * @generated
	 */
	EAttribute getEmote_EmoteID();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see StreamingPlatform.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Stream#getStreamID <em>Stream ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream ID</em>'.
	 * @see StreamingPlatform.Stream#getStreamID()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_StreamID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Stream#isIsLive <em>Is Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Live</em>'.
	 * @see StreamingPlatform.Stream#isIsLive()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_IsLive();

	/**
	 * Returns the meta object for the reference list '{@link StreamingPlatform.Stream#getViewers <em>Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Viewers</em>'.
	 * @see StreamingPlatform.Stream#getViewers()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_Viewers();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Stream#getActiveViewers <em>Active Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Viewers</em>'.
	 * @see StreamingPlatform.Stream#getActiveViewers()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_ActiveViewers();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Stream#liveCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Live Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Live Condition</em>' operation.
	 * @see StreamingPlatform.Stream#liveCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStream__LiveCondition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip</em>'.
	 * @see StreamingPlatform.Clip
	 * @generated
	 */
	EClass getClip();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Clip#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see StreamingPlatform.Clip#getClipID()
	 * @see #getClip()
	 * @generated
	 */
	EAttribute getClip_ClipID();

	/**
	 * Returns the meta object for the reference '{@link StreamingPlatform.Clip#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see StreamingPlatform.Clip#getCreatedBy()
	 * @see #getClip()
	 * @generated
	 */
	EReference getClip_CreatedBy();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation</em>'.
	 * @see StreamingPlatform.Donation
	 * @generated
	 */
	EClass getDonation();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Donation#getDonationID <em>Donation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donation ID</em>'.
	 * @see StreamingPlatform.Donation#getDonationID()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_DonationID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Donation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see StreamingPlatform.Donation#getMessage()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Message();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see StreamingPlatform.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getSubscriptionID <em>Subscription ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription ID</em>'.
	 * @see StreamingPlatform.Subscription#getSubscriptionID()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_SubscriptionID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getTier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tier</em>'.
	 * @see StreamingPlatform.Subscription#getTier()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Tier();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see StreamingPlatform.Subscription#getPrice()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Price();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see StreamingPlatform.Subscription#getDuration()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Duration();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Renewal</em>'.
	 * @see StreamingPlatform.Subscription#isAutoRenewal()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_AutoRenewal();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see StreamingPlatform.Subscription#getStartDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Subscription#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see StreamingPlatform.Subscription#getEndDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link StreamingPlatform.Subscription#getEmotes <em>Emotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emotes</em>'.
	 * @see StreamingPlatform.Subscription#getEmotes()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Emotes();

	/**
	 * Returns the meta object for the reference '{@link StreamingPlatform.Subscription#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Badge</em>'.
	 * @see StreamingPlatform.Subscription#getBadge()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Badge();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Less Than End Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Date Less Than End Date</em>' operation.
	 * @see StreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transaction Date Less Than Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transaction Date Less Than Start Date</em>' operation.
	 * @see StreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see StreamingPlatform.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Message#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message ID</em>'.
	 * @see StreamingPlatform.Message#getMessageID()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see StreamingPlatform.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see StreamingPlatform.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Reaction#getReactionID <em>Reaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction ID</em>'.
	 * @see StreamingPlatform.Reaction#getReactionID()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_ReactionID();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction Type</em>'.
	 * @see StreamingPlatform.Reaction#getReactionType()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_ReactionType();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Auditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable</em>'.
	 * @see StreamingPlatform.Auditable
	 * @generated
	 */
	EClass getAuditable();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Auditable#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see StreamingPlatform.Auditable#getCreatedAt()
	 * @see #getAuditable()
	 * @generated
	 */
	EAttribute getAuditable_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Auditable#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see StreamingPlatform.Auditable#getUpdatedAt()
	 * @see #getAuditable()
	 * @generated
	 */
	EAttribute getAuditable_UpdatedAt();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see StreamingPlatform.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Feature#getTenure <em>Tenure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenure</em>'.
	 * @see StreamingPlatform.Feature#getTenure()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Tenure();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donation Amount</em>'.
	 * @see StreamingPlatform.Feature#getDonationAmount()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DonationAmount();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unlock Condition</em>'.
	 * @see StreamingPlatform.Feature#getUnlockCondition()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_UnlockCondition();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Feature#getEligibilityDescription <em>Eligibility Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eligibility Description</em>'.
	 * @see StreamingPlatform.Feature#getEligibilityDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_EligibilityDescription();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Content</em>'.
	 * @see StreamingPlatform.MediaContent
	 * @generated
	 */
	EClass getMediaContent();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.MediaContent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see StreamingPlatform.MediaContent#getTitle()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Title();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.MediaContent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see StreamingPlatform.MediaContent#getCategory()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Category();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.MediaContent#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see StreamingPlatform.MediaContent#getTags()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Tags();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.MediaContent#getViewCount <em>View Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Count</em>'.
	 * @see StreamingPlatform.MediaContent#getViewCount()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_ViewCount();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.MediaContent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.MediaContent#getDescription()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Description();

	/**
	 * Returns the meta object for the attribute list '{@link StreamingPlatform.MediaContent#getResolutions <em>Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resolutions</em>'.
	 * @see StreamingPlatform.MediaContent#getResolutions()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Resolutions();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.MediaContent#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see StreamingPlatform.MediaContent#getMessages()
	 * @see #getMediaContent()
	 * @generated
	 */
	EReference getMediaContent_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link StreamingPlatform.MediaContent#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see StreamingPlatform.MediaContent#getReactions()
	 * @see #getMediaContent()
	 * @generated
	 */
	EReference getMediaContent_Reactions();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interaction</em>'.
	 * @see StreamingPlatform.UserInteraction
	 * @generated
	 */
	EClass getUserInteraction();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see StreamingPlatform.UserInteraction#getTimestamp()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EAttribute getUserInteraction_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.UserInteraction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.UserInteraction#getDescription()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EAttribute getUserInteraction_Description();

	/**
	 * Returns the meta object for the reference '{@link StreamingPlatform.UserInteraction#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see StreamingPlatform.UserInteraction#getUser()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EReference getUserInteraction_User();

	/**
	 * Returns the meta object for class '{@link StreamingPlatform.Monetization <em>Monetization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monetization</em>'.
	 * @see StreamingPlatform.Monetization
	 * @generated
	 */
	EClass getMonetization();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see StreamingPlatform.Monetization#getAmount()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_Amount();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see StreamingPlatform.Monetization#getCurrency()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_Currency();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see StreamingPlatform.Monetization#getTransactionDate()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see StreamingPlatform.Monetization#getPaymentStatus()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_PaymentStatus();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see StreamingPlatform.Monetization#getPaymentMethod()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link StreamingPlatform.Monetization#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see StreamingPlatform.Monetization#getDescription()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_Description();

	/**
	 * Returns the meta object for the '{@link StreamingPlatform.Monetization#positiveAmount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Amount</em>' operation.
	 * @see StreamingPlatform.Monetization#positiveAmount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMonetization__PositiveAmount__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Duration</em>'.
	 * @see StreamingPlatform.SubscriptionDuration
	 * @generated
	 */
	EEnum getSubscriptionDuration();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see StreamingPlatform.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see StreamingPlatform.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device</em>'.
	 * @see StreamingPlatform.Device
	 * @generated
	 */
	EEnum getDevice();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see StreamingPlatform.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Region</em>'.
	 * @see StreamingPlatform.Region
	 * @generated
	 */
	EEnum getRegion();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution</em>'.
	 * @see StreamingPlatform.Resolution
	 * @generated
	 */
	EEnum getResolution();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see StreamingPlatform.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.PaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status</em>'.
	 * @see StreamingPlatform.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.ReactionType <em>Reaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reaction Type</em>'.
	 * @see StreamingPlatform.ReactionType
	 * @generated
	 */
	EEnum getReactionType();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see StreamingPlatform.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tier</em>'.
	 * @see StreamingPlatform.Tier
	 * @generated
	 */
	EEnum getTier();

	/**
	 * Returns the meta object for enum '{@link StreamingPlatform.UnlockCondition <em>Unlock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unlock Condition</em>'.
	 * @see StreamingPlatform.UnlockCondition
	 * @generated
	 */
	EEnum getUnlockCondition();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamingPlatformFactory getStreamingPlatformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.NamedElementImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.PlatformImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Platform ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__PLATFORM_ID = eINSTANCE.getPlatform_PlatformID();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__REVENUE = eINSTANCE.getPlatform_Revenue();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__VERSION = eINSTANCE.getPlatform_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__DESCRIPTION = eINSTANCE.getPlatform_Description();

		/**
		 * The meta object literal for the '<em><b>Supported Regions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__SUPPORTED_REGIONS = eINSTANCE.getPlatform_SupportedRegions();

		/**
		 * The meta object literal for the '<em><b>Supported Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__SUPPORTED_LANGUAGES = eINSTANCE.getPlatform_SupportedLanguages();

		/**
		 * The meta object literal for the '<em><b>Supported Devices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__SUPPORTED_DEVICES = eINSTANCE.getPlatform_SupportedDevices();

		/**
		 * The meta object literal for the '<em><b>Supported Resolutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__SUPPORTED_RESOLUTIONS = eINSTANCE.getPlatform_SupportedResolutions();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__USERS = eINSTANCE.getPlatform_Users();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__CHANNELS = eINSTANCE.getPlatform_Channels();

		/**
		 * The meta object literal for the '<em><b>Total Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__TOTAL_REVENUE = eINSTANCE.getPlatform_TotalRevenue();

		/**
		 * The meta object literal for the '<em><b>Active Users Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLATFORM___ACTIVE_USERS_COUNT = eINSTANCE.getPlatform__ActiveUsersCount();

		/**
		 * The meta object literal for the '<em><b>Find Channel By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLATFORM___FIND_CHANNEL_BY_NAME__STRING = eINSTANCE.getPlatform__FindChannelByName__String();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.ChannelImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Channel ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL_ID = eINSTANCE.getChannel_ChannelID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__DESCRIPTION = eINSTANCE.getChannel_Description();

		/**
		 * The meta object literal for the '<em><b>Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__STREAMS = eINSTANCE.getChannel_Streams();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CLIPS = eINSTANCE.getChannel_Clips();

		/**
		 * The meta object literal for the '<em><b>Moderators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__MODERATORS = eINSTANCE.getChannel_Moderators();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__FOLLOWERS = eINSTANCE.getChannel_Followers();

		/**
		 * The meta object literal for the '<em><b>Donations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__DONATIONS = eINSTANCE.getChannel_Donations();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SUBSCRIPTIONS = eINSTANCE.getChannel_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Emotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__EMOTES = eINSTANCE.getChannel_Emotes();

		/**
		 * The meta object literal for the '<em><b>Badges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__BADGES = eINSTANCE.getChannel_Badges();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__OWNER = eINSTANCE.getChannel_Owner();

		/**
		 * The meta object literal for the '<em><b>Total Donations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TOTAL_DONATIONS = eINSTANCE.getChannel_TotalDonations();

		/**
		 * The meta object literal for the '<em><b>Total Followers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TOTAL_FOLLOWERS = eINSTANCE.getChannel_TotalFollowers();

		/**
		 * The meta object literal for the '<em><b>Total Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TOTAL_VIEWS = eINSTANCE.getChannel_TotalViews();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.UserImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '<em><b>Avatar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AVATAR = eINSTANCE.getUser_Avatar();

		/**
		 * The meta object literal for the '<em><b>Is Online</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IS_ONLINE = eINSTANCE.getUser_IsOnline();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NICKNAME = eINSTANCE.getUser_Nickname();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DESCRIPTION = eINSTANCE.getUser_Description();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SUBSCRIPTIONS = eINSTANCE.getUser_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Donations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DONATIONS = eINSTANCE.getUser_Donations();

		/**
		 * The meta object literal for the '<em><b>Followed Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FOLLOWED_CHANNELS = eINSTANCE.getUser_FollowedChannels();

		/**
		 * The meta object literal for the '<em><b>Total Donations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___TOTAL_DONATIONS = eINSTANCE.getUser__TotalDonations();

		/**
		 * The meta object literal for the '<em><b>Is Following</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___IS_FOLLOWING__CHANNEL = eINSTANCE.getUser__IsFollowing__Channel();

		/**
		 * The meta object literal for the '<em><b>Total Spending</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___TOTAL_SPENDING = eINSTANCE.getUser__TotalSpending();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.BadgeImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();

		/**
		 * The meta object literal for the '<em><b>Badge ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__BADGE_ID = eINSTANCE.getBadge_BadgeID();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.EmoteImpl <em>Emote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.EmoteImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getEmote()
		 * @generated
		 */
		EClass EMOTE = eINSTANCE.getEmote();

		/**
		 * The meta object literal for the '<em><b>Emote ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTE__EMOTE_ID = eINSTANCE.getEmote_EmoteID();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.StreamImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Stream ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__STREAM_ID = eINSTANCE.getStream_StreamID();

		/**
		 * The meta object literal for the '<em><b>Is Live</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__IS_LIVE = eINSTANCE.getStream_IsLive();

		/**
		 * The meta object literal for the '<em><b>Viewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM__VIEWERS = eINSTANCE.getStream_Viewers();

		/**
		 * The meta object literal for the '<em><b>Active Viewers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__ACTIVE_VIEWERS = eINSTANCE.getStream_ActiveViewers();

		/**
		 * The meta object literal for the '<em><b>Live Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STREAM___LIVE_CONDITION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStream__LiveCondition__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.ClipImpl <em>Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.ClipImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getClip()
		 * @generated
		 */
		EClass CLIP = eINSTANCE.getClip();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIP__CLIP_ID = eINSTANCE.getClip_ClipID();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP__CREATED_BY = eINSTANCE.getClip_CreatedBy();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.DonationImpl <em>Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.DonationImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getDonation()
		 * @generated
		 */
		EClass DONATION = eINSTANCE.getDonation();

		/**
		 * The meta object literal for the '<em><b>Donation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__DONATION_ID = eINSTANCE.getDonation_DonationID();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__MESSAGE = eINSTANCE.getDonation_Message();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.SubscriptionImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Subscription ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__SUBSCRIPTION_ID = eINSTANCE.getSubscription_SubscriptionID();

		/**
		 * The meta object literal for the '<em><b>Tier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__TIER = eINSTANCE.getSubscription_Tier();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PRICE = eINSTANCE.getSubscription_Price();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__DURATION = eINSTANCE.getSubscription_Duration();

		/**
		 * The meta object literal for the '<em><b>Auto Renewal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__AUTO_RENEWAL = eINSTANCE.getSubscription_AutoRenewal();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__START_DATE = eINSTANCE.getSubscription_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__END_DATE = eINSTANCE.getSubscription_EndDate();

		/**
		 * The meta object literal for the '<em><b>Emotes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__EMOTES = eINSTANCE.getSubscription_Emotes();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__BADGE = eINSTANCE.getSubscription_Badge();

		/**
		 * The meta object literal for the '<em><b>Start Date Less Than End Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIPTION___START_DATE_LESS_THAN_END_DATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Less Than Start Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIPTION___TRANSACTION_DATE_LESS_THAN_START_DATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.MessageImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_ID = eINSTANCE.getMessage_MessageID();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.ReactionImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Reaction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__REACTION_ID = eINSTANCE.getReaction_ReactionID();

		/**
		 * The meta object literal for the '<em><b>Reaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__REACTION_TYPE = eINSTANCE.getReaction_ReactionType();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.AuditableImpl <em>Auditable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.AuditableImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getAuditable()
		 * @generated
		 */
		EClass AUDITABLE = eINSTANCE.getAuditable();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE__CREATED_AT = eINSTANCE.getAuditable_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDITABLE__UPDATED_AT = eINSTANCE.getAuditable_UpdatedAt();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.FeatureImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Tenure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TENURE = eINSTANCE.getFeature_Tenure();

		/**
		 * The meta object literal for the '<em><b>Donation Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DONATION_AMOUNT = eINSTANCE.getFeature_DonationAmount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Unlock Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__UNLOCK_CONDITION = eINSTANCE.getFeature_UnlockCondition();

		/**
		 * The meta object literal for the '<em><b>Eligibility Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ELIGIBILITY_DESCRIPTION = eINSTANCE.getFeature_EligibilityDescription();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.MediaContentImpl <em>Media Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.MediaContentImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMediaContent()
		 * @generated
		 */
		EClass MEDIA_CONTENT = eINSTANCE.getMediaContent();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__TITLE = eINSTANCE.getMediaContent_Title();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__CATEGORY = eINSTANCE.getMediaContent_Category();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__TAGS = eINSTANCE.getMediaContent_Tags();

		/**
		 * The meta object literal for the '<em><b>View Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__VIEW_COUNT = eINSTANCE.getMediaContent_ViewCount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__DESCRIPTION = eINSTANCE.getMediaContent_Description();

		/**
		 * The meta object literal for the '<em><b>Resolutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__RESOLUTIONS = eINSTANCE.getMediaContent_Resolutions();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_CONTENT__MESSAGES = eINSTANCE.getMediaContent_Messages();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_CONTENT__REACTIONS = eINSTANCE.getMediaContent_Reactions();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.UserInteractionImpl <em>User Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.UserInteractionImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUserInteraction()
		 * @generated
		 */
		EClass USER_INTERACTION = eINSTANCE.getUserInteraction();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERACTION__TIMESTAMP = eINSTANCE.getUserInteraction_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERACTION__DESCRIPTION = eINSTANCE.getUserInteraction_Description();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERACTION__USER = eINSTANCE.getUserInteraction_User();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.impl.MonetizationImpl <em>Monetization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.impl.MonetizationImpl
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getMonetization()
		 * @generated
		 */
		EClass MONETIZATION = eINSTANCE.getMonetization();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__AMOUNT = eINSTANCE.getMonetization_Amount();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__CURRENCY = eINSTANCE.getMonetization_Currency();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__TRANSACTION_DATE = eINSTANCE.getMonetization_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Payment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__PAYMENT_STATUS = eINSTANCE.getMonetization_PaymentStatus();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__PAYMENT_METHOD = eINSTANCE.getMonetization_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__DESCRIPTION = eINSTANCE.getMonetization_Description();

		/**
		 * The meta object literal for the '<em><b>Positive Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMonetization__PositiveAmount__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.SubscriptionDuration
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getSubscriptionDuration()
		 * @generated
		 */
		EEnum SUBSCRIPTION_DURATION = eINSTANCE.getSubscriptionDuration();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Category
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Currency
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Device <em>Device</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Device
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getDevice()
		 * @generated
		 */
		EEnum DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Language
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Region <em>Region</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Region
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getRegion()
		 * @generated
		 */
		EEnum REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Resolution <em>Resolution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Resolution
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getResolution()
		 * @generated
		 */
		EEnum RESOLUTION = eINSTANCE.getResolution();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.PaymentMethod
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.PaymentStatus <em>Payment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.PaymentStatus
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.ReactionType <em>Reaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.ReactionType
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getReactionType()
		 * @generated
		 */
		EEnum REACTION_TYPE = eINSTANCE.getReactionType();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Role
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.Tier <em>Tier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.Tier
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getTier()
		 * @generated
		 */
		EEnum TIER = eINSTANCE.getTier();

		/**
		 * The meta object literal for the '{@link StreamingPlatform.UnlockCondition <em>Unlock Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StreamingPlatform.UnlockCondition
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUnlockCondition()
		 * @generated
		 */
		EEnum UNLOCK_CONDITION = eINSTANCE.getUnlockCondition();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see StreamingPlatform.impl.StreamingPlatformPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //StreamingPlatformPackage
