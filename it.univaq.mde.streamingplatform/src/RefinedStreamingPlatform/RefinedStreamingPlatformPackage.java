/**
 */
package RefinedStreamingPlatform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface RefinedStreamingPlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RefinedStreamingPlatform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https:/refined-streaming-platform.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RSP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefinedStreamingPlatformPackage eINSTANCE = RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.NamedElementImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.TaggableImpl <em>Taggable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.TaggableImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTaggable()
	 * @generated
	 */
	int TAGGABLE = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGABLE__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Taggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Taggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.AuditableImpl <em>Auditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.AuditableImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getAuditable()
	 * @generated
	 */
	int AUDITABLE = 2;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.PlatformImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 3;

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
	 * The feature id for the '<em><b>Supported Regions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_REGIONS = AUDITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_LANGUAGES = AUDITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supported Devices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_DEVICES = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Supported Video Qualities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SUPPORTED_VIDEO_QUALITIES = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__USERS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__CHANNELS = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Total Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__TOTAL_REVENUE = AUDITABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 11;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.ChannelImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 4;

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
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TAGS = AUDITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_ID = AUDITABLE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Playlists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PLAYLISTS = AUDITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Moderators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__MODERATORS = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FOLLOWERS = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TIPS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SUBSCRIPTIONS = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FEATURES = AUDITABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__OWNER = AUDITABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Total Tips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TOTAL_TIPS = AUDITABLE_FEATURE_COUNT + 12;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.UserImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

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
	 * The feature id for the '<em><b>Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBSCRIPTIONS = AUDITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TIPS = AUDITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Followed Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FOLLOWED_CHANNELS = AUDITABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = AUDITABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Total Tips</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___TOTAL_TIPS = AUDITABLE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.FeatureImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__URL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tenure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TENURE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Donation Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DONATION_AMOUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unlock Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UNLOCK_CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eligibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ELIGIBILITY_DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.MediaContentImpl <em>Media Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.MediaContentImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMediaContent()
	 * @generated
	 */
	int MEDIA_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__TAGS = TAGGABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Media Content ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__MEDIA_CONTENT_ID = TAGGABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__TITLE = TAGGABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__CATEGORY = TAGGABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__VIEW_COUNT = TAGGABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Video Qualities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__VIDEO_QUALITIES = TAGGABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__MESSAGES = TAGGABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__REACTIONS = TAGGABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Media Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT_FEATURE_COUNT = TAGGABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Media Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT_OPERATION_COUNT = TAGGABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.StreamImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__TAGS = MEDIA_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Media Content ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__MEDIA_CONTENT_ID = MEDIA_CONTENT__MEDIA_CONTENT_ID;

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
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__VIEW_COUNT = MEDIA_CONTENT__VIEW_COUNT;

	/**
	 * The feature id for the '<em><b>Video Qualities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__VIDEO_QUALITIES = MEDIA_CONTENT__VIDEO_QUALITIES;

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
	 * The feature id for the '<em><b>Is Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__IS_LIVE = MEDIA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__VIEWERS = MEDIA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Viewers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__ACTIVE_VIEWERS = MEDIA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = MEDIA_CONTENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.ClipImpl <em>Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.ClipImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getClip()
	 * @generated
	 */
	int CLIP = 9;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__TAGS = MEDIA_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Media Content ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__MEDIA_CONTENT_ID = MEDIA_CONTENT__MEDIA_CONTENT_ID;

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
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__VIEW_COUNT = MEDIA_CONTENT__VIEW_COUNT;

	/**
	 * The feature id for the '<em><b>Video Qualities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__VIDEO_QUALITIES = MEDIA_CONTENT__VIDEO_QUALITIES;

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
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__CREATED_BY = MEDIA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_FEATURE_COUNT = MEDIA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_OPERATION_COUNT = MEDIA_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.PlaylistImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Playlist ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__PLAYLIST_ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__MEDIA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.MonetizationImpl <em>Monetization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.MonetizationImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMonetization()
	 * @generated
	 */
	int MONETIZATION = 11;

	/**
	 * The feature id for the '<em><b>Monetization ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__MONETIZATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__CURRENCY = 2;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__TRANSACTION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__PAYMENT_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION__PAYMENT_METHOD = 5;

	/**
	 * The number of structural features of the '<em>Monetization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Positive Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Monetization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONETIZATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.TipImpl <em>Tip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.TipImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTip()
	 * @generated
	 */
	int TIP = 12;

	/**
	 * The feature id for the '<em><b>Monetization ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__MONETIZATION_ID = MONETIZATION__MONETIZATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__AMOUNT = MONETIZATION__AMOUNT;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__CURRENCY = MONETIZATION__CURRENCY;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__TRANSACTION_DATE = MONETIZATION__TRANSACTION_DATE;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__PAYMENT_STATUS = MONETIZATION__PAYMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__PAYMENT_METHOD = MONETIZATION__PAYMENT_METHOD;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP__MESSAGE = MONETIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_FEATURE_COUNT = MONETIZATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Positive Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_OPERATION_COUNT = MONETIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.SubscriptionImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Monetization ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MONETIZATION_ID = MONETIZATION__MONETIZATION_ID;

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
	 * The feature id for the '<em><b>Tier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__TIER = MONETIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRICE = MONETIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DURATION = MONETIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AUTO_RENEWAL = MONETIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__START_DATE = MONETIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__END_DATE = MONETIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__FEATURES = MONETIZATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = MONETIZATION_FEATURE_COUNT + 7;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.UserInteractionImpl <em>User Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.UserInteractionImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUserInteraction()
	 * @generated
	 */
	int USER_INTERACTION = 14;

	/**
	 * The feature id for the '<em><b>User Interaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__USER_INTERACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERACTION__AUTHOR = 2;

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
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.MessageImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>User Interaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__USER_INTERACTION_ID = USER_INTERACTION__USER_INTERACTION_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIMESTAMP = USER_INTERACTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__AUTHOR = USER_INTERACTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = USER_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = USER_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = USER_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.impl.ReactionImpl
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 16;

	/**
	 * The feature id for the '<em><b>User Interaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__USER_INTERACTION_ID = USER_INTERACTION__USER_INTERACTION_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__TIMESTAMP = USER_INTERACTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__AUTHOR = USER_INTERACTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Reaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__REACTION_TYPE = USER_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = USER_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OPERATION_COUNT = USER_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.SubscriptionDuration
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getSubscriptionDuration()
	 * @generated
	 */
	int SUBSCRIPTION_DURATION = 17;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Category
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 18;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Currency
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 19;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Device <em>Device</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Device
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 20;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Language
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 21;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Region <em>Region</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Region
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 22;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.VideoQuality <em>Video Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.VideoQuality
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getVideoQuality()
	 * @generated
	 */
	int VIDEO_QUALITY = 23;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.PaymentMethod
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 24;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.PaymentStatus <em>Payment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.PaymentStatus
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 25;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.ReactionType <em>Reaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.ReactionType
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getReactionType()
	 * @generated
	 */
	int REACTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Role
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 27;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.Tier <em>Tier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Tier
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTier()
	 * @generated
	 */
	int TIER = 28;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.UnlockCondition <em>Unlock Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.UnlockCondition
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUnlockCondition()
	 * @generated
	 */
	int UNLOCK_CONDITION = 29;

	/**
	 * The meta object id for the '{@link RefinedStreamingPlatform.FeatureType <em>Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.FeatureType
	 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 30;


	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see RefinedStreamingPlatform.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RefinedStreamingPlatform.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Taggable <em>Taggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taggable</em>'.
	 * @see RefinedStreamingPlatform.Taggable
	 * @generated
	 */
	EClass getTaggable();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.Taggable#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see RefinedStreamingPlatform.Taggable#getTags()
	 * @see #getTaggable()
	 * @generated
	 */
	EAttribute getTaggable_Tags();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Auditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable</em>'.
	 * @see RefinedStreamingPlatform.Auditable
	 * @generated
	 */
	EClass getAuditable();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Auditable#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see RefinedStreamingPlatform.Auditable#getCreatedAt()
	 * @see #getAuditable()
	 * @generated
	 */
	EAttribute getAuditable_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Auditable#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see RefinedStreamingPlatform.Auditable#getUpdatedAt()
	 * @see #getAuditable()
	 * @generated
	 */
	EAttribute getAuditable_UpdatedAt();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see RefinedStreamingPlatform.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Platform#getPlatformID <em>Platform ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform ID</em>'.
	 * @see RefinedStreamingPlatform.Platform#getPlatformID()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_PlatformID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Platform#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see RefinedStreamingPlatform.Platform#getRevenue()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Revenue();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Platform#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see RefinedStreamingPlatform.Platform#getVersion()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Version();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.Platform#getSupportedRegions <em>Supported Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Regions</em>'.
	 * @see RefinedStreamingPlatform.Platform#getSupportedRegions()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedRegions();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.Platform#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Languages</em>'.
	 * @see RefinedStreamingPlatform.Platform#getSupportedLanguages()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedLanguages();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.Platform#getSupportedDevices <em>Supported Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Devices</em>'.
	 * @see RefinedStreamingPlatform.Platform#getSupportedDevices()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedDevices();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.Platform#getSupportedVideoQualities <em>Supported Video Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Video Qualities</em>'.
	 * @see RefinedStreamingPlatform.Platform#getSupportedVideoQualities()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_SupportedVideoQualities();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Platform#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see RefinedStreamingPlatform.Platform#getUsers()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Platform#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see RefinedStreamingPlatform.Platform#getChannels()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Channels();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Platform#getTotalRevenue <em>Total Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Revenue</em>'.
	 * @see RefinedStreamingPlatform.Platform#getTotalRevenue()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_TotalRevenue();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Platform#activeUsersCount() <em>Active Users Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Active Users Count</em>' operation.
	 * @see RefinedStreamingPlatform.Platform#activeUsersCount()
	 * @generated
	 */
	EOperation getPlatform__ActiveUsersCount();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Platform#findChannelByName(java.lang.String) <em>Find Channel By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Channel By Name</em>' operation.
	 * @see RefinedStreamingPlatform.Platform#findChannelByName(java.lang.String)
	 * @generated
	 */
	EOperation getPlatform__FindChannelByName__String();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see RefinedStreamingPlatform.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Channel#getChannelID <em>Channel ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel ID</em>'.
	 * @see RefinedStreamingPlatform.Channel#getChannelID()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ChannelID();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Channel#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streams</em>'.
	 * @see RefinedStreamingPlatform.Channel#getStreams()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Streams();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Channel#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clips</em>'.
	 * @see RefinedStreamingPlatform.Channel#getClips()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Clips();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Channel#getPlaylists <em>Playlists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playlists</em>'.
	 * @see RefinedStreamingPlatform.Channel#getPlaylists()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Playlists();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Channel#getModerators <em>Moderators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Moderators</em>'.
	 * @see RefinedStreamingPlatform.Channel#getModerators()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Moderators();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Channel#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followers</em>'.
	 * @see RefinedStreamingPlatform.Channel#getFollowers()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Followers();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Channel#getTips <em>Tips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tips</em>'.
	 * @see RefinedStreamingPlatform.Channel#getTips()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Tips();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Channel#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscriptions</em>'.
	 * @see RefinedStreamingPlatform.Channel#getSubscriptions()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Subscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Channel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see RefinedStreamingPlatform.Channel#getFeatures()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Features();

	/**
	 * Returns the meta object for the reference '{@link RefinedStreamingPlatform.Channel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see RefinedStreamingPlatform.Channel#getOwner()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Owner();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Channel#getTotalTips <em>Total Tips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Tips</em>'.
	 * @see RefinedStreamingPlatform.Channel#getTotalTips()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalTips();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Channel#getTotalFollowers <em>Total Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Followers</em>'.
	 * @see RefinedStreamingPlatform.Channel#getTotalFollowers()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalFollowers();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Channel#getTotalViews <em>Total Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Views</em>'.
	 * @see RefinedStreamingPlatform.Channel#getTotalViews()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TotalViews();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see RefinedStreamingPlatform.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see RefinedStreamingPlatform.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see RefinedStreamingPlatform.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Role();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.User#getAvatar <em>Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar</em>'.
	 * @see RefinedStreamingPlatform.User#getAvatar()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Avatar();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.User#isIsOnline <em>Is Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Online</em>'.
	 * @see RefinedStreamingPlatform.User#isIsOnline()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsOnline();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.User#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see RefinedStreamingPlatform.User#getNickname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Nickname();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.User#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriptions</em>'.
	 * @see RefinedStreamingPlatform.User#getSubscriptions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Subscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.User#getTips <em>Tips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tips</em>'.
	 * @see RefinedStreamingPlatform.User#getTips()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Tips();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followed Channels</em>'.
	 * @see RefinedStreamingPlatform.User#getFollowedChannels()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_FollowedChannels();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.User#totalTips() <em>Total Tips</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Tips</em>' operation.
	 * @see RefinedStreamingPlatform.User#totalTips()
	 * @generated
	 */
	EOperation getUser__TotalTips();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.User#isFollowing(RefinedStreamingPlatform.Channel) <em>Is Following</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Following</em>' operation.
	 * @see RefinedStreamingPlatform.User#isFollowing(RefinedStreamingPlatform.Channel)
	 * @generated
	 */
	EOperation getUser__IsFollowing__Channel();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.User#totalSpending() <em>Total Spending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Spending</em>' operation.
	 * @see RefinedStreamingPlatform.User#totalSpending()
	 * @generated
	 */
	EOperation getUser__TotalSpending();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see RefinedStreamingPlatform.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getFeatureID <em>Feature ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature ID</em>'.
	 * @see RefinedStreamingPlatform.Feature#getFeatureID()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_FeatureID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RefinedStreamingPlatform.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see RefinedStreamingPlatform.Feature#getUrl()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Url();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getTenure <em>Tenure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenure</em>'.
	 * @see RefinedStreamingPlatform.Feature#getTenure()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Tenure();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getDonationAmount <em>Donation Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donation Amount</em>'.
	 * @see RefinedStreamingPlatform.Feature#getDonationAmount()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DonationAmount();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getUnlockCondition <em>Unlock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unlock Condition</em>'.
	 * @see RefinedStreamingPlatform.Feature#getUnlockCondition()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_UnlockCondition();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Feature#getEligibilityDescription <em>Eligibility Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eligibility Description</em>'.
	 * @see RefinedStreamingPlatform.Feature#getEligibilityDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_EligibilityDescription();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Content</em>'.
	 * @see RefinedStreamingPlatform.MediaContent
	 * @generated
	 */
	EClass getMediaContent();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.MediaContent#getMediaContentID <em>Media Content ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Content ID</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getMediaContentID()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_MediaContentID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.MediaContent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getTitle()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Title();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.MediaContent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getCategory()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Category();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.MediaContent#getViewCount <em>View Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Count</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getViewCount()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_ViewCount();

	/**
	 * Returns the meta object for the attribute list '{@link RefinedStreamingPlatform.MediaContent#getVideoQualities <em>Video Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Video Qualities</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getVideoQualities()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_VideoQualities();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.MediaContent#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getMessages()
	 * @see #getMediaContent()
	 * @generated
	 */
	EReference getMediaContent_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.MediaContent#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see RefinedStreamingPlatform.MediaContent#getReactions()
	 * @see #getMediaContent()
	 * @generated
	 */
	EReference getMediaContent_Reactions();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see RefinedStreamingPlatform.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Stream#isIsLive <em>Is Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Live</em>'.
	 * @see RefinedStreamingPlatform.Stream#isIsLive()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_IsLive();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Stream#getViewers <em>Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Viewers</em>'.
	 * @see RefinedStreamingPlatform.Stream#getViewers()
	 * @see #getStream()
	 * @generated
	 */
	EReference getStream_Viewers();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Stream#getActiveViewers <em>Active Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Viewers</em>'.
	 * @see RefinedStreamingPlatform.Stream#getActiveViewers()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_ActiveViewers();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Stream#liveCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Live Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Live Condition</em>' operation.
	 * @see RefinedStreamingPlatform.Stream#liveCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStream__LiveCondition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip</em>'.
	 * @see RefinedStreamingPlatform.Clip
	 * @generated
	 */
	EClass getClip();

	/**
	 * Returns the meta object for the reference '{@link RefinedStreamingPlatform.Clip#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see RefinedStreamingPlatform.Clip#getCreatedBy()
	 * @see #getClip()
	 * @generated
	 */
	EReference getClip_CreatedBy();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see RefinedStreamingPlatform.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Playlist#getPlaylistID <em>Playlist ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Playlist ID</em>'.
	 * @see RefinedStreamingPlatform.Playlist#getPlaylistID()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_PlaylistID();

	/**
	 * Returns the meta object for the containment reference list '{@link RefinedStreamingPlatform.Playlist#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media</em>'.
	 * @see RefinedStreamingPlatform.Playlist#getMedia()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Media();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Monetization <em>Monetization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monetization</em>'.
	 * @see RefinedStreamingPlatform.Monetization
	 * @generated
	 */
	EClass getMonetization();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getMonetizationID <em>Monetization ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monetization ID</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getMonetizationID()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_MonetizationID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getAmount()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_Amount();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getCurrency()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_Currency();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getTransactionDate()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getPaymentStatus()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_PaymentStatus();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Monetization#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see RefinedStreamingPlatform.Monetization#getPaymentMethod()
	 * @see #getMonetization()
	 * @generated
	 */
	EAttribute getMonetization_PaymentMethod();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Monetization#positiveAmount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Amount</em>' operation.
	 * @see RefinedStreamingPlatform.Monetization#positiveAmount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMonetization__PositiveAmount__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Tip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tip</em>'.
	 * @see RefinedStreamingPlatform.Tip
	 * @generated
	 */
	EClass getTip();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Tip#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see RefinedStreamingPlatform.Tip#getMessage()
	 * @see #getTip()
	 * @generated
	 */
	EAttribute getTip_Message();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see RefinedStreamingPlatform.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#getTier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tier</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getTier()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Tier();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getPrice()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Price();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getDuration()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Duration();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#isAutoRenewal <em>Auto Renewal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Renewal</em>'.
	 * @see RefinedStreamingPlatform.Subscription#isAutoRenewal()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_AutoRenewal();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getStartDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Subscription#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getEndDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link RefinedStreamingPlatform.Subscription#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see RefinedStreamingPlatform.Subscription#getFeatures()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Features();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Less Than End Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Date Less Than End Date</em>' operation.
	 * @see RefinedStreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscription__StartDateLessThanEndDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link RefinedStreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transaction Date Less Than Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transaction Date Less Than Start Date</em>' operation.
	 * @see RefinedStreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscription__TransactionDateLessThanStartDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interaction</em>'.
	 * @see RefinedStreamingPlatform.UserInteraction
	 * @generated
	 */
	EClass getUserInteraction();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.UserInteraction#getUserInteractionID <em>User Interaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interaction ID</em>'.
	 * @see RefinedStreamingPlatform.UserInteraction#getUserInteractionID()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EAttribute getUserInteraction_UserInteractionID();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.UserInteraction#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see RefinedStreamingPlatform.UserInteraction#getTimestamp()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EAttribute getUserInteraction_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link RefinedStreamingPlatform.UserInteraction#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see RefinedStreamingPlatform.UserInteraction#getAuthor()
	 * @see #getUserInteraction()
	 * @generated
	 */
	EReference getUserInteraction_Author();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see RefinedStreamingPlatform.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see RefinedStreamingPlatform.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for class '{@link RefinedStreamingPlatform.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see RefinedStreamingPlatform.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the attribute '{@link RefinedStreamingPlatform.Reaction#getReactionType <em>Reaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction Type</em>'.
	 * @see RefinedStreamingPlatform.Reaction#getReactionType()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_ReactionType();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Duration</em>'.
	 * @see RefinedStreamingPlatform.SubscriptionDuration
	 * @generated
	 */
	EEnum getSubscriptionDuration();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see RefinedStreamingPlatform.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see RefinedStreamingPlatform.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device</em>'.
	 * @see RefinedStreamingPlatform.Device
	 * @generated
	 */
	EEnum getDevice();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see RefinedStreamingPlatform.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Region</em>'.
	 * @see RefinedStreamingPlatform.Region
	 * @generated
	 */
	EEnum getRegion();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.VideoQuality <em>Video Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Video Quality</em>'.
	 * @see RefinedStreamingPlatform.VideoQuality
	 * @generated
	 */
	EEnum getVideoQuality();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see RefinedStreamingPlatform.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.PaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status</em>'.
	 * @see RefinedStreamingPlatform.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.ReactionType <em>Reaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reaction Type</em>'.
	 * @see RefinedStreamingPlatform.ReactionType
	 * @generated
	 */
	EEnum getReactionType();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see RefinedStreamingPlatform.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tier</em>'.
	 * @see RefinedStreamingPlatform.Tier
	 * @generated
	 */
	EEnum getTier();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.UnlockCondition <em>Unlock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unlock Condition</em>'.
	 * @see RefinedStreamingPlatform.UnlockCondition
	 * @generated
	 */
	EEnum getUnlockCondition();

	/**
	 * Returns the meta object for enum '{@link RefinedStreamingPlatform.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Type</em>'.
	 * @see RefinedStreamingPlatform.FeatureType
	 * @generated
	 */
	EEnum getFeatureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefinedStreamingPlatformFactory getRefinedStreamingPlatformFactory();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.NamedElementImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.TaggableImpl <em>Taggable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.TaggableImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTaggable()
		 * @generated
		 */
		EClass TAGGABLE = eINSTANCE.getTaggable();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGABLE__TAGS = eINSTANCE.getTaggable_Tags();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.AuditableImpl <em>Auditable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.AuditableImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getAuditable()
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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.PlatformImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPlatform()
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
		 * The meta object literal for the '<em><b>Supported Video Qualities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__SUPPORTED_VIDEO_QUALITIES = eINSTANCE.getPlatform_SupportedVideoQualities();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.ChannelImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getChannel()
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
		 * The meta object literal for the '<em><b>Playlists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__PLAYLISTS = eINSTANCE.getChannel_Playlists();

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
		 * The meta object literal for the '<em><b>Tips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__TIPS = eINSTANCE.getChannel_Tips();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SUBSCRIPTIONS = eINSTANCE.getChannel_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__FEATURES = eINSTANCE.getChannel_Features();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__OWNER = eINSTANCE.getChannel_Owner();

		/**
		 * The meta object literal for the '<em><b>Total Tips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TOTAL_TIPS = eINSTANCE.getChannel_TotalTips();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.UserImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUser()
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
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SUBSCRIPTIONS = eINSTANCE.getUser_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Tips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TIPS = eINSTANCE.getUser_Tips();

		/**
		 * The meta object literal for the '<em><b>Followed Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FOLLOWED_CHANNELS = eINSTANCE.getUser_FollowedChannels();

		/**
		 * The meta object literal for the '<em><b>Total Tips</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___TOTAL_TIPS = eINSTANCE.getUser__TotalTips();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.FeatureImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FEATURE_ID = eINSTANCE.getFeature_FeatureID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__URL = eINSTANCE.getFeature_Url();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.MediaContentImpl <em>Media Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.MediaContentImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMediaContent()
		 * @generated
		 */
		EClass MEDIA_CONTENT = eINSTANCE.getMediaContent();

		/**
		 * The meta object literal for the '<em><b>Media Content ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__MEDIA_CONTENT_ID = eINSTANCE.getMediaContent_MediaContentID();

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
		 * The meta object literal for the '<em><b>View Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__VIEW_COUNT = eINSTANCE.getMediaContent_ViewCount();

		/**
		 * The meta object literal for the '<em><b>Video Qualities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__VIDEO_QUALITIES = eINSTANCE.getMediaContent_VideoQualities();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.StreamImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.ClipImpl <em>Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.ClipImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getClip()
		 * @generated
		 */
		EClass CLIP = eINSTANCE.getClip();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP__CREATED_BY = eINSTANCE.getClip_CreatedBy();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.PlaylistImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Playlist ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__PLAYLIST_ID = eINSTANCE.getPlaylist_PlaylistID();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__MEDIA = eINSTANCE.getPlaylist_Media();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.MonetizationImpl <em>Monetization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.MonetizationImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMonetization()
		 * @generated
		 */
		EClass MONETIZATION = eINSTANCE.getMonetization();

		/**
		 * The meta object literal for the '<em><b>Monetization ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONETIZATION__MONETIZATION_ID = eINSTANCE.getMonetization_MonetizationID();

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
		 * The meta object literal for the '<em><b>Positive Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMonetization__PositiveAmount__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.TipImpl <em>Tip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.TipImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTip()
		 * @generated
		 */
		EClass TIP = eINSTANCE.getTip();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIP__MESSAGE = eINSTANCE.getTip_Message();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.SubscriptionImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

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
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__FEATURES = eINSTANCE.getSubscription_Features();

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
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.UserInteractionImpl <em>User Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.UserInteractionImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUserInteraction()
		 * @generated
		 */
		EClass USER_INTERACTION = eINSTANCE.getUserInteraction();

		/**
		 * The meta object literal for the '<em><b>User Interaction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERACTION__USER_INTERACTION_ID = eINSTANCE.getUserInteraction_UserInteractionID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERACTION__TIMESTAMP = eINSTANCE.getUserInteraction_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERACTION__AUTHOR = eINSTANCE.getUserInteraction_Author();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.MessageImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.impl.ReactionImpl
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Reaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__REACTION_TYPE = eINSTANCE.getReaction_ReactionType();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.SubscriptionDuration <em>Subscription Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.SubscriptionDuration
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getSubscriptionDuration()
		 * @generated
		 */
		EEnum SUBSCRIPTION_DURATION = eINSTANCE.getSubscriptionDuration();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Category
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Currency
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Device <em>Device</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Device
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getDevice()
		 * @generated
		 */
		EEnum DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Language
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Region <em>Region</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Region
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getRegion()
		 * @generated
		 */
		EEnum REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.VideoQuality <em>Video Quality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.VideoQuality
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getVideoQuality()
		 * @generated
		 */
		EEnum VIDEO_QUALITY = eINSTANCE.getVideoQuality();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.PaymentMethod
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.PaymentStatus <em>Payment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.PaymentStatus
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.ReactionType <em>Reaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.ReactionType
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getReactionType()
		 * @generated
		 */
		EEnum REACTION_TYPE = eINSTANCE.getReactionType();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Role
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.Tier <em>Tier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.Tier
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getTier()
		 * @generated
		 */
		EEnum TIER = eINSTANCE.getTier();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.UnlockCondition <em>Unlock Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.UnlockCondition
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getUnlockCondition()
		 * @generated
		 */
		EEnum UNLOCK_CONDITION = eINSTANCE.getUnlockCondition();

		/**
		 * The meta object literal for the '{@link RefinedStreamingPlatform.FeatureType <em>Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RefinedStreamingPlatform.FeatureType
		 * @see RefinedStreamingPlatform.impl.RefinedStreamingPlatformPackageImpl#getFeatureType()
		 * @generated
		 */
		EEnum FEATURE_TYPE = eINSTANCE.getFeatureType();

	}

} //RefinedStreamingPlatformPackage
