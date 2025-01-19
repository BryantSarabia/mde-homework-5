/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /it.univaq.mde.streamingplatform/metamodel/RefinedStreamingPlatform.ecore
 * using:
 *   /it.univaq.mde.streamingplatform/metamodel/RefinedStreamingPlatform.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package RefinedStreamingPlatform;

// import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
// import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * RefinedStreamingPlatformTables provides the dispatch tables for the RefinedStreamingPlatform for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RefinedStreamingPlatformTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RefinedStreamingPlatformPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_refined_m_streaming_m_platform_com = IdManager.getNsURIPackageId("https:/refined-streaming-platform.com", null, RefinedStreamingPlatformPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Channel = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Channel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Clip = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Clip", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MediaContent = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("MediaContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Message = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Message", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Monetization = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Monetization", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Platform = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Platform", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Playlist = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Playlist", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reaction = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Reaction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Stream = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Stream", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Subscription = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Subscription", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tip = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("Tip", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_User = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("User", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UserInteraction = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getClassId("UserInteraction", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EShort = RefinedStreamingPlatformTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EShort", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Category = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Category");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Currency = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Currency");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Device = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Device");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_FeatureType = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("FeatureType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Language = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Language");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentMethod = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("PaymentMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentStatus = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("PaymentStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ReactionType = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("ReactionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Region = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Region");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Role = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Role");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SubscriptionDuration = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("SubscriptionDuration");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Tier = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("Tier");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_UnlockCondition = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("UnlockCondition");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VideoQuality = RefinedStreamingPlatformTables.PACKid_https_c_s_refined_m_streaming_m_platform_com.getEnumerationId("VideoQuality");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ RealValue REA_0_0 = ValueUtil.realValueOf("0.0");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Real = TypeId.SEQUENCE.getSpecializedId(TypeId.REAL, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR_Requires_32_a_32_donation_32_of_32_at_32_least_32 = "Requires a donation of at least ";
	public static final /*@NonInvalid*/ String STR_Requires_32_a_32_tenure_32_of_32 = "Requires a tenure of ";
	public static final /*@NonInvalid*/ String STR__32_currency_32_units = " currency units";
	public static final /*@NonInvalid*/ String STR__32_months = " months";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Channel = TypeId.BAG.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Channel, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Clip = TypeId.BAG.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Clip, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Stream = TypeId.BAG.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Stream, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Subscription = TypeId.BAG.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Subscription, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_UserInteraction = TypeId.BAG.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_UserInteraction, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DonationAmount = RefinedStreamingPlatformTables.ENUMid_UnlockCondition.getEnumerationLiteralId("DonationAmount");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Channel = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Channel, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Clip = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Clip, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Feature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MediaContent = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_MediaContent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Message = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Message, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Playlist = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Playlist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Reaction = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Reaction, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Stream = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Stream, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Subscription = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Subscription, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Tip = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_Tip, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_User = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.CLSSid_User, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Device = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.ENUMid_Device, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Language = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.ENUMid_Language, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Region = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.ENUMid_Region, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_VideoQuality = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.ENUMid_VideoQuality, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_VideoQuality_0 = TypeId.ORDERED_SET.getSpecializedId(RefinedStreamingPlatformTables.ENUMid_VideoQuality, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EFloat = TypeId.SEQUENCE.getSpecializedId(RefinedStreamingPlatformTables.DATAid_EFloat, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(RefinedStreamingPlatformTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RefinedStreamingPlatformTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Auditable = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.AUDITABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Category = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.CATEGORY, PACKAGE, 0);
		public static final EcoreExecutorType _Channel = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.CHANNEL, PACKAGE, 0);
		public static final EcoreExecutorType _Clip = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.CLIP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Currency = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.CURRENCY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Device = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.DEVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.FEATURE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _FeatureType = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.FEATURE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Language = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.LANGUAGE, PACKAGE, 0);
		public static final EcoreExecutorType _MediaContent = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Message = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.MESSAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Monetization = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.MONETIZATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _PaymentMethod = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.PAYMENT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentStatus = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.PAYMENT_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Platform = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.PLATFORM, PACKAGE, 0);
		public static final EcoreExecutorType _Playlist = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.PLAYLIST, PACKAGE, 0);
		public static final EcoreExecutorType _Reaction = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.REACTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ReactionType = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.REACTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Region = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.REGION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Role = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Stream = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.STREAM, PACKAGE, 0);
		public static final EcoreExecutorType _Subscription = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SubscriptionDuration = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION_DURATION, PACKAGE, 0);
		public static final EcoreExecutorType _Taggable = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.TAGGABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Tier = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.TIER, PACKAGE, 0);
		public static final EcoreExecutorType _Tip = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.TIP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _UnlockCondition = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.UNLOCK_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.USER, PACKAGE, 0);
		public static final EcoreExecutorType _UserInteraction = new EcoreExecutorType(RefinedStreamingPlatformPackage.Literals.USER_INTERACTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _VideoQuality = new EcoreExecutorEnumeration(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Auditable,
			_Category,
			_Channel,
			_Clip,
			_Currency,
			_Device,
			_Feature,
			_FeatureType,
			_Language,
			_MediaContent,
			_Message,
			_Monetization,
			_NamedElement,
			_PaymentMethod,
			_PaymentStatus,
			_Platform,
			_Playlist,
			_Reaction,
			_ReactionType,
			_Region,
			_Role,
			_Stream,
			_Subscription,
			_SubscriptionDuration,
			_Taggable,
			_Tier,
			_Tip,
			_UnlockCondition,
			_User,
			_UserInteraction,
			_VideoQuality
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Auditable__Auditable = new ExecutorFragment(Types._Auditable, RefinedStreamingPlatformTables.Types._Auditable);
		private static final ExecutorFragment _Auditable__OclAny = new ExecutorFragment(Types._Auditable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Auditable__OclElement = new ExecutorFragment(Types._Auditable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Category__Category = new ExecutorFragment(Types._Category, RefinedStreamingPlatformTables.Types._Category);
		private static final ExecutorFragment _Category__OclAny = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Category__OclElement = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Category__OclEnumeration = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Category__OclType = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Channel__Auditable = new ExecutorFragment(Types._Channel, RefinedStreamingPlatformTables.Types._Auditable);
		private static final ExecutorFragment _Channel__Channel = new ExecutorFragment(Types._Channel, RefinedStreamingPlatformTables.Types._Channel);
		private static final ExecutorFragment _Channel__NamedElement = new ExecutorFragment(Types._Channel, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _Channel__OclAny = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Channel__OclElement = new ExecutorFragment(Types._Channel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Channel__Taggable = new ExecutorFragment(Types._Channel, RefinedStreamingPlatformTables.Types._Taggable);

		private static final ExecutorFragment _Clip__Clip = new ExecutorFragment(Types._Clip, RefinedStreamingPlatformTables.Types._Clip);
		private static final ExecutorFragment _Clip__MediaContent = new ExecutorFragment(Types._Clip, RefinedStreamingPlatformTables.Types._MediaContent);
		private static final ExecutorFragment _Clip__OclAny = new ExecutorFragment(Types._Clip, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Clip__OclElement = new ExecutorFragment(Types._Clip, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Clip__Taggable = new ExecutorFragment(Types._Clip, RefinedStreamingPlatformTables.Types._Taggable);

		private static final ExecutorFragment _Currency__Currency = new ExecutorFragment(Types._Currency, RefinedStreamingPlatformTables.Types._Currency);
		private static final ExecutorFragment _Currency__OclAny = new ExecutorFragment(Types._Currency, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Currency__OclElement = new ExecutorFragment(Types._Currency, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Currency__OclEnumeration = new ExecutorFragment(Types._Currency, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Currency__OclType = new ExecutorFragment(Types._Currency, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Device__Device = new ExecutorFragment(Types._Device, RefinedStreamingPlatformTables.Types._Device);
		private static final ExecutorFragment _Device__OclAny = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Device__OclElement = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Device__OclEnumeration = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Device__OclType = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, RefinedStreamingPlatformTables.Types._Feature);
		private static final ExecutorFragment _Feature__NamedElement = new ExecutorFragment(Types._Feature, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FeatureType__FeatureType = new ExecutorFragment(Types._FeatureType, RefinedStreamingPlatformTables.Types._FeatureType);
		private static final ExecutorFragment _FeatureType__OclAny = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FeatureType__OclElement = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FeatureType__OclEnumeration = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _FeatureType__OclType = new ExecutorFragment(Types._FeatureType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Language__Language = new ExecutorFragment(Types._Language, RefinedStreamingPlatformTables.Types._Language);
		private static final ExecutorFragment _Language__OclAny = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Language__OclElement = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Language__OclEnumeration = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Language__OclType = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MediaContent__MediaContent = new ExecutorFragment(Types._MediaContent, RefinedStreamingPlatformTables.Types._MediaContent);
		private static final ExecutorFragment _MediaContent__OclAny = new ExecutorFragment(Types._MediaContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MediaContent__OclElement = new ExecutorFragment(Types._MediaContent, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MediaContent__Taggable = new ExecutorFragment(Types._MediaContent, RefinedStreamingPlatformTables.Types._Taggable);

		private static final ExecutorFragment _Message__Message = new ExecutorFragment(Types._Message, RefinedStreamingPlatformTables.Types._Message);
		private static final ExecutorFragment _Message__OclAny = new ExecutorFragment(Types._Message, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Message__OclElement = new ExecutorFragment(Types._Message, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Message__UserInteraction = new ExecutorFragment(Types._Message, RefinedStreamingPlatformTables.Types._UserInteraction);

		private static final ExecutorFragment _Monetization__Monetization = new ExecutorFragment(Types._Monetization, RefinedStreamingPlatformTables.Types._Monetization);
		private static final ExecutorFragment _Monetization__OclAny = new ExecutorFragment(Types._Monetization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Monetization__OclElement = new ExecutorFragment(Types._Monetization, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PaymentMethod__OclAny = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentMethod__OclElement = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentMethod__OclEnumeration = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentMethod__OclType = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentMethod__PaymentMethod = new ExecutorFragment(Types._PaymentMethod, RefinedStreamingPlatformTables.Types._PaymentMethod);

		private static final ExecutorFragment _PaymentStatus__OclAny = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentStatus__OclElement = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentStatus__OclEnumeration = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentStatus__OclType = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentStatus__PaymentStatus = new ExecutorFragment(Types._PaymentStatus, RefinedStreamingPlatformTables.Types._PaymentStatus);

		private static final ExecutorFragment _Platform__Auditable = new ExecutorFragment(Types._Platform, RefinedStreamingPlatformTables.Types._Auditable);
		private static final ExecutorFragment _Platform__NamedElement = new ExecutorFragment(Types._Platform, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _Platform__OclAny = new ExecutorFragment(Types._Platform, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Platform__OclElement = new ExecutorFragment(Types._Platform, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Platform__Platform = new ExecutorFragment(Types._Platform, RefinedStreamingPlatformTables.Types._Platform);

		private static final ExecutorFragment _Playlist__NamedElement = new ExecutorFragment(Types._Playlist, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _Playlist__OclAny = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Playlist__OclElement = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Playlist__Playlist = new ExecutorFragment(Types._Playlist, RefinedStreamingPlatformTables.Types._Playlist);

		private static final ExecutorFragment _Reaction__OclAny = new ExecutorFragment(Types._Reaction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reaction__OclElement = new ExecutorFragment(Types._Reaction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reaction__Reaction = new ExecutorFragment(Types._Reaction, RefinedStreamingPlatformTables.Types._Reaction);
		private static final ExecutorFragment _Reaction__UserInteraction = new ExecutorFragment(Types._Reaction, RefinedStreamingPlatformTables.Types._UserInteraction);

		private static final ExecutorFragment _ReactionType__OclAny = new ExecutorFragment(Types._ReactionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReactionType__OclElement = new ExecutorFragment(Types._ReactionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReactionType__OclEnumeration = new ExecutorFragment(Types._ReactionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ReactionType__OclType = new ExecutorFragment(Types._ReactionType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ReactionType__ReactionType = new ExecutorFragment(Types._ReactionType, RefinedStreamingPlatformTables.Types._ReactionType);

		private static final ExecutorFragment _Region__OclAny = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Region__OclElement = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Region__OclEnumeration = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Region__OclType = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Region__Region = new ExecutorFragment(Types._Region, RefinedStreamingPlatformTables.Types._Region);

		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__OclEnumeration = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Role__OclType = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, RefinedStreamingPlatformTables.Types._Role);

		private static final ExecutorFragment _Stream__MediaContent = new ExecutorFragment(Types._Stream, RefinedStreamingPlatformTables.Types._MediaContent);
		private static final ExecutorFragment _Stream__OclAny = new ExecutorFragment(Types._Stream, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Stream__OclElement = new ExecutorFragment(Types._Stream, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Stream__Stream = new ExecutorFragment(Types._Stream, RefinedStreamingPlatformTables.Types._Stream);
		private static final ExecutorFragment _Stream__Taggable = new ExecutorFragment(Types._Stream, RefinedStreamingPlatformTables.Types._Taggable);

		private static final ExecutorFragment _Subscription__Monetization = new ExecutorFragment(Types._Subscription, RefinedStreamingPlatformTables.Types._Monetization);
		private static final ExecutorFragment _Subscription__OclAny = new ExecutorFragment(Types._Subscription, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Subscription__OclElement = new ExecutorFragment(Types._Subscription, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Subscription__Subscription = new ExecutorFragment(Types._Subscription, RefinedStreamingPlatformTables.Types._Subscription);

		private static final ExecutorFragment _SubscriptionDuration__OclAny = new ExecutorFragment(Types._SubscriptionDuration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubscriptionDuration__OclElement = new ExecutorFragment(Types._SubscriptionDuration, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubscriptionDuration__OclEnumeration = new ExecutorFragment(Types._SubscriptionDuration, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SubscriptionDuration__OclType = new ExecutorFragment(Types._SubscriptionDuration, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SubscriptionDuration__SubscriptionDuration = new ExecutorFragment(Types._SubscriptionDuration, RefinedStreamingPlatformTables.Types._SubscriptionDuration);

		private static final ExecutorFragment _Taggable__OclAny = new ExecutorFragment(Types._Taggable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Taggable__OclElement = new ExecutorFragment(Types._Taggable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Taggable__Taggable = new ExecutorFragment(Types._Taggable, RefinedStreamingPlatformTables.Types._Taggable);

		private static final ExecutorFragment _Tier__OclAny = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tier__OclElement = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tier__OclEnumeration = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Tier__OclType = new ExecutorFragment(Types._Tier, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Tier__Tier = new ExecutorFragment(Types._Tier, RefinedStreamingPlatformTables.Types._Tier);

		private static final ExecutorFragment _Tip__Monetization = new ExecutorFragment(Types._Tip, RefinedStreamingPlatformTables.Types._Monetization);
		private static final ExecutorFragment _Tip__OclAny = new ExecutorFragment(Types._Tip, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tip__OclElement = new ExecutorFragment(Types._Tip, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tip__Tip = new ExecutorFragment(Types._Tip, RefinedStreamingPlatformTables.Types._Tip);

		private static final ExecutorFragment _UnlockCondition__OclAny = new ExecutorFragment(Types._UnlockCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UnlockCondition__OclElement = new ExecutorFragment(Types._UnlockCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UnlockCondition__OclEnumeration = new ExecutorFragment(Types._UnlockCondition, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _UnlockCondition__OclType = new ExecutorFragment(Types._UnlockCondition, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _UnlockCondition__UnlockCondition = new ExecutorFragment(Types._UnlockCondition, RefinedStreamingPlatformTables.Types._UnlockCondition);

		private static final ExecutorFragment _User__Auditable = new ExecutorFragment(Types._User, RefinedStreamingPlatformTables.Types._Auditable);
		private static final ExecutorFragment _User__NamedElement = new ExecutorFragment(Types._User, RefinedStreamingPlatformTables.Types._NamedElement);
		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, RefinedStreamingPlatformTables.Types._User);

		private static final ExecutorFragment _UserInteraction__OclAny = new ExecutorFragment(Types._UserInteraction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UserInteraction__OclElement = new ExecutorFragment(Types._UserInteraction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UserInteraction__UserInteraction = new ExecutorFragment(Types._UserInteraction, RefinedStreamingPlatformTables.Types._UserInteraction);

		private static final ExecutorFragment _VideoQuality__OclAny = new ExecutorFragment(Types._VideoQuality, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VideoQuality__OclElement = new ExecutorFragment(Types._VideoQuality, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VideoQuality__OclEnumeration = new ExecutorFragment(Types._VideoQuality, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VideoQuality__OclType = new ExecutorFragment(Types._VideoQuality, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VideoQuality__VideoQuality = new ExecutorFragment(Types._VideoQuality, RefinedStreamingPlatformTables.Types._VideoQuality);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _Channel = TypeUtil.createParameterTypes(RefinedStreamingPlatformTables.Types._Channel);
		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Platform__activeUsersCount = new ExecutorOperation("activeUsersCount", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Platform,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Platform__findChannelByName = new ExecutorOperation("findChannelByName", Parameters._String, Types._Platform,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _User__isFollowing = new ExecutorOperation("isFollowing", Parameters._Channel, Types._User,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _User__totalSpending = new ExecutorOperation("totalSpending", TypeUtil.EMPTY_PARAMETER_TYPES, Types._User,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _User__totalTips = new ExecutorOperation("totalTips", TypeUtil.EMPTY_PARAMETER_TYPES, Types._User,
			2, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Auditable__createdAt = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.AUDITABLE__CREATED_AT, Types._Auditable, 0);
		public static final ExecutorProperty _Auditable__updatedAt = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.AUDITABLE__UPDATED_AT, Types._Auditable, 1);

		public static final ExecutorProperty _Channel__channelID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__CHANNEL_ID, Types._Channel, 0);
		public static final ExecutorProperty _Channel__clips = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__CLIPS, Types._Channel, 1);
		public static final ExecutorProperty _Channel__features = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__FEATURES, Types._Channel, 2);
		public static final ExecutorProperty _Channel__followers = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__FOLLOWERS, Types._Channel, 3);
		public static final ExecutorProperty _Channel__moderators = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__MODERATORS, Types._Channel, 4);
		public static final ExecutorProperty _Channel__owner = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__OWNER, Types._Channel, 5);
		public static final ExecutorProperty _Channel__playlists = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__PLAYLISTS, Types._Channel, 6);
		public static final ExecutorProperty _Channel__streams = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__STREAMS, Types._Channel, 7);
		public static final ExecutorProperty _Channel__subscriptions = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__SUBSCRIPTIONS, Types._Channel, 8);
		public static final ExecutorProperty _Channel__tips = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__TIPS, Types._Channel, 9);
		public static final ExecutorProperty _Channel__totalFollowers = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_FOLLOWERS, Types._Channel, 10);
		public static final ExecutorProperty _Channel__totalTips = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_TIPS, Types._Channel, 11);
		public static final ExecutorProperty _Channel__totalViews = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__TOTAL_VIEWS, Types._Channel, 12);
		public static final ExecutorProperty _Channel__Platform__channels = new ExecutorPropertyWithImplementation("Platform", Types._Channel, 13, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__CHANNELS));

		public static final ExecutorProperty _Clip__createdBy = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.CLIP__CREATED_BY, Types._Clip, 0);
		public static final ExecutorProperty _Clip__Channel__clips = new ExecutorPropertyWithImplementation("Channel", Types._Clip, 1, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__CLIPS));

		public static final ExecutorProperty _Feature__donationAmount = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__DONATION_AMOUNT, Types._Feature, 0);
		public static final ExecutorProperty _Feature__eligibilityDescription = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__ELIGIBILITY_DESCRIPTION, Types._Feature, 1);
		public static final ExecutorProperty _Feature__featureID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__FEATURE_ID, Types._Feature, 2);
		public static final ExecutorProperty _Feature__tenure = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__TENURE, Types._Feature, 3);
		public static final ExecutorProperty _Feature__type = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__TYPE, Types._Feature, 4);
		public static final ExecutorProperty _Feature__unlockCondition = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__UNLOCK_CONDITION, Types._Feature, 5);
		public static final ExecutorProperty _Feature__url = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.FEATURE__URL, Types._Feature, 6);
		public static final ExecutorProperty _Feature__Channel__features = new ExecutorPropertyWithImplementation("Channel", Types._Feature, 7, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__FEATURES));
		public static final ExecutorProperty _Feature__Subscription__features = new ExecutorPropertyWithImplementation("Subscription", Types._Feature, 8, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__FEATURES));

		public static final ExecutorProperty _MediaContent__category = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__CATEGORY, Types._MediaContent, 0);
		public static final ExecutorProperty _MediaContent__mediaContentID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MEDIA_CONTENT_ID, Types._MediaContent, 1);
		public static final ExecutorProperty _MediaContent__messages = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MESSAGES, Types._MediaContent, 2);
		public static final ExecutorProperty _MediaContent__reactions = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__REACTIONS, Types._MediaContent, 3);
		public static final ExecutorProperty _MediaContent__title = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__TITLE, Types._MediaContent, 4);
		public static final ExecutorProperty _MediaContent__videoQualities = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__VIDEO_QUALITIES, Types._MediaContent, 5);
		public static final ExecutorProperty _MediaContent__viewCount = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__VIEW_COUNT, Types._MediaContent, 6);
		public static final ExecutorProperty _MediaContent__Playlist__media = new ExecutorPropertyWithImplementation("Playlist", Types._MediaContent, 7, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.PLAYLIST__MEDIA));

		public static final ExecutorProperty _Message__content = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MESSAGE__CONTENT, Types._Message, 0);
		public static final ExecutorProperty _Message__MediaContent__messages = new ExecutorPropertyWithImplementation("MediaContent", Types._Message, 1, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__MESSAGES));

		public static final ExecutorProperty _Monetization__amount = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__AMOUNT, Types._Monetization, 0);
		public static final ExecutorProperty _Monetization__currency = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__CURRENCY, Types._Monetization, 1);
		public static final ExecutorProperty _Monetization__monetizationID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__MONETIZATION_ID, Types._Monetization, 2);
		public static final ExecutorProperty _Monetization__paymentMethod = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__PAYMENT_METHOD, Types._Monetization, 3);
		public static final ExecutorProperty _Monetization__paymentStatus = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__PAYMENT_STATUS, Types._Monetization, 4);
		public static final ExecutorProperty _Monetization__transactionDate = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.MONETIZATION__TRANSACTION_DATE, Types._Monetization, 5);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Platform__channels = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__CHANNELS, Types._Platform, 0);
		public static final ExecutorProperty _Platform__platformID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__PLATFORM_ID, Types._Platform, 1);
		public static final ExecutorProperty _Platform__revenue = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__REVENUE, Types._Platform, 2);
		public static final ExecutorProperty _Platform__supportedDevices = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_DEVICES, Types._Platform, 3);
		public static final ExecutorProperty _Platform__supportedLanguages = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_LANGUAGES, Types._Platform, 4);
		public static final ExecutorProperty _Platform__supportedRegions = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_REGIONS, Types._Platform, 5);
		public static final ExecutorProperty _Platform__supportedVideoQualities = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__SUPPORTED_VIDEO_QUALITIES, Types._Platform, 6);
		public static final ExecutorProperty _Platform__totalRevenue = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__TOTAL_REVENUE, Types._Platform, 7);
		public static final ExecutorProperty _Platform__users = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__USERS, Types._Platform, 8);
		public static final ExecutorProperty _Platform__version = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__VERSION, Types._Platform, 9);

		public static final ExecutorProperty _Playlist__media = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLAYLIST__MEDIA, Types._Playlist, 0);
		public static final ExecutorProperty _Playlist__playlistID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.PLAYLIST__PLAYLIST_ID, Types._Playlist, 1);
		public static final ExecutorProperty _Playlist__Channel__playlists = new ExecutorPropertyWithImplementation("Channel", Types._Playlist, 2, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__PLAYLISTS));

		public static final ExecutorProperty _Reaction__reactionType = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.REACTION__REACTION_TYPE, Types._Reaction, 0);
		public static final ExecutorProperty _Reaction__MediaContent__reactions = new ExecutorPropertyWithImplementation("MediaContent", Types._Reaction, 1, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT__REACTIONS));

		public static final ExecutorProperty _Stream__activeViewers = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.STREAM__ACTIVE_VIEWERS, Types._Stream, 0);
		public static final ExecutorProperty _Stream__isLive = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.STREAM__IS_LIVE, Types._Stream, 1);
		public static final ExecutorProperty _Stream__viewers = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.STREAM__VIEWERS, Types._Stream, 2);
		public static final ExecutorProperty _Stream__Channel__streams = new ExecutorPropertyWithImplementation("Channel", Types._Stream, 3, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__STREAMS));

		public static final ExecutorProperty _Subscription__autoRenewal = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__AUTO_RENEWAL, Types._Subscription, 0);
		public static final ExecutorProperty _Subscription__duration = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__DURATION, Types._Subscription, 1);
		public static final ExecutorProperty _Subscription__endDate = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__END_DATE, Types._Subscription, 2);
		public static final ExecutorProperty _Subscription__features = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__FEATURES, Types._Subscription, 3);
		public static final ExecutorProperty _Subscription__price = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__PRICE, Types._Subscription, 4);
		public static final ExecutorProperty _Subscription__startDate = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__START_DATE, Types._Subscription, 5);
		public static final ExecutorProperty _Subscription__tier = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION__TIER, Types._Subscription, 6);
		public static final ExecutorProperty _Subscription__Channel__subscriptions = new ExecutorPropertyWithImplementation("Channel", Types._Subscription, 7, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__SUBSCRIPTIONS));
		public static final ExecutorProperty _Subscription__User__subscriptions = new ExecutorPropertyWithImplementation("User", Types._Subscription, 8, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.USER__SUBSCRIPTIONS));

		public static final ExecutorProperty _Taggable__tags = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.TAGGABLE__TAGS, Types._Taggable, 0);

		public static final ExecutorProperty _Tip__message = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.TIP__MESSAGE, Types._Tip, 0);
		public static final ExecutorProperty _Tip__Channel__tips = new ExecutorPropertyWithImplementation("Channel", Types._Tip, 1, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__TIPS));
		public static final ExecutorProperty _Tip__User__tips = new ExecutorPropertyWithImplementation("User", Types._Tip, 2, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.USER__TIPS));

		public static final ExecutorProperty _User__avatar = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__AVATAR, Types._User, 0);
		public static final ExecutorProperty _User__followedChannels = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__FOLLOWED_CHANNELS, Types._User, 1);
		public static final ExecutorProperty _User__isOnline = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__IS_ONLINE, Types._User, 2);
		public static final ExecutorProperty _User__nickname = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__NICKNAME, Types._User, 3);
		public static final ExecutorProperty _User__role = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__ROLE, Types._User, 4);
		public static final ExecutorProperty _User__subscriptions = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__SUBSCRIPTIONS, Types._User, 5);
		public static final ExecutorProperty _User__tips = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__TIPS, Types._User, 6);
		public static final ExecutorProperty _User__userID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER__USER_ID, Types._User, 7);
		public static final ExecutorProperty _User__Channel__moderators = new ExecutorPropertyWithImplementation("Channel", Types._User, 8, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__MODERATORS));
		public static final ExecutorProperty _User__Channel__owner = new ExecutorPropertyWithImplementation("Channel", Types._User, 9, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CHANNEL__OWNER));
		public static final ExecutorProperty _User__Clip__createdBy = new ExecutorPropertyWithImplementation("Clip", Types._User, 10, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.CLIP__CREATED_BY));
		public static final ExecutorProperty _User__Platform__users = new ExecutorPropertyWithImplementation("Platform", Types._User, 11, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.PLATFORM__USERS));
		public static final ExecutorProperty _User__Stream__viewers = new ExecutorPropertyWithImplementation("Stream", Types._User, 12, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.STREAM__VIEWERS));
		public static final ExecutorProperty _User__UserInteraction__author = new ExecutorPropertyWithImplementation("UserInteraction", Types._User, 13, new EcoreLibraryOppositeProperty(RefinedStreamingPlatformPackage.Literals.USER_INTERACTION__AUTHOR));

		public static final ExecutorProperty _UserInteraction__author = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER_INTERACTION__AUTHOR, Types._UserInteraction, 0);
		public static final ExecutorProperty _UserInteraction__timestamp = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER_INTERACTION__TIMESTAMP, Types._UserInteraction, 1);
		public static final ExecutorProperty _UserInteraction__userInteractionID = new EcoreExecutorProperty(RefinedStreamingPlatformPackage.Literals.USER_INTERACTION__USER_INTERACTION_ID, Types._UserInteraction, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Auditable =
			{
				Fragments._Auditable__OclAny /* 0 */,
				Fragments._Auditable__OclElement /* 1 */,
				Fragments._Auditable__Auditable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Auditable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Category =
			{
				Fragments._Category__OclAny /* 0 */,
				Fragments._Category__OclElement /* 1 */,
				Fragments._Category__OclType /* 2 */,
				Fragments._Category__OclEnumeration /* 3 */,
				Fragments._Category__Category /* 4 */
			};
		private static final int /*@NonNull*/ [] __Category = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Channel =
			{
				Fragments._Channel__OclAny /* 0 */,
				Fragments._Channel__OclElement /* 1 */,
				Fragments._Channel__Auditable /* 2 */,
				Fragments._Channel__NamedElement /* 2 */,
				Fragments._Channel__Taggable /* 2 */,
				Fragments._Channel__Channel /* 3 */
			};
		private static final int /*@NonNull*/ [] __Channel = { 1,1,3,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Clip =
			{
				Fragments._Clip__OclAny /* 0 */,
				Fragments._Clip__OclElement /* 1 */,
				Fragments._Clip__Taggable /* 2 */,
				Fragments._Clip__MediaContent /* 3 */,
				Fragments._Clip__Clip /* 4 */
			};
		private static final int /*@NonNull*/ [] __Clip = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Currency =
			{
				Fragments._Currency__OclAny /* 0 */,
				Fragments._Currency__OclElement /* 1 */,
				Fragments._Currency__OclType /* 2 */,
				Fragments._Currency__OclEnumeration /* 3 */,
				Fragments._Currency__Currency /* 4 */
			};
		private static final int /*@NonNull*/ [] __Currency = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Device =
			{
				Fragments._Device__OclAny /* 0 */,
				Fragments._Device__OclElement /* 1 */,
				Fragments._Device__OclType /* 2 */,
				Fragments._Device__OclEnumeration /* 3 */,
				Fragments._Device__Device /* 4 */
			};
		private static final int /*@NonNull*/ [] __Device = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__NamedElement /* 2 */,
				Fragments._Feature__Feature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Feature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FeatureType =
			{
				Fragments._FeatureType__OclAny /* 0 */,
				Fragments._FeatureType__OclElement /* 1 */,
				Fragments._FeatureType__OclType /* 2 */,
				Fragments._FeatureType__OclEnumeration /* 3 */,
				Fragments._FeatureType__FeatureType /* 4 */
			};
		private static final int /*@NonNull*/ [] __FeatureType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Language =
			{
				Fragments._Language__OclAny /* 0 */,
				Fragments._Language__OclElement /* 1 */,
				Fragments._Language__OclType /* 2 */,
				Fragments._Language__OclEnumeration /* 3 */,
				Fragments._Language__Language /* 4 */
			};
		private static final int /*@NonNull*/ [] __Language = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MediaContent =
			{
				Fragments._MediaContent__OclAny /* 0 */,
				Fragments._MediaContent__OclElement /* 1 */,
				Fragments._MediaContent__Taggable /* 2 */,
				Fragments._MediaContent__MediaContent /* 3 */
			};
		private static final int /*@NonNull*/ [] __MediaContent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Message =
			{
				Fragments._Message__OclAny /* 0 */,
				Fragments._Message__OclElement /* 1 */,
				Fragments._Message__UserInteraction /* 2 */,
				Fragments._Message__Message /* 3 */
			};
		private static final int /*@NonNull*/ [] __Message = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Monetization =
			{
				Fragments._Monetization__OclAny /* 0 */,
				Fragments._Monetization__OclElement /* 1 */,
				Fragments._Monetization__Monetization /* 2 */
			};
		private static final int /*@NonNull*/ [] __Monetization = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentMethod =
			{
				Fragments._PaymentMethod__OclAny /* 0 */,
				Fragments._PaymentMethod__OclElement /* 1 */,
				Fragments._PaymentMethod__OclType /* 2 */,
				Fragments._PaymentMethod__OclEnumeration /* 3 */,
				Fragments._PaymentMethod__PaymentMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentMethod = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentStatus =
			{
				Fragments._PaymentStatus__OclAny /* 0 */,
				Fragments._PaymentStatus__OclElement /* 1 */,
				Fragments._PaymentStatus__OclType /* 2 */,
				Fragments._PaymentStatus__OclEnumeration /* 3 */,
				Fragments._PaymentStatus__PaymentStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Platform =
			{
				Fragments._Platform__OclAny /* 0 */,
				Fragments._Platform__OclElement /* 1 */,
				Fragments._Platform__Auditable /* 2 */,
				Fragments._Platform__NamedElement /* 2 */,
				Fragments._Platform__Platform /* 3 */
			};
		private static final int /*@NonNull*/ [] __Platform = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Playlist =
			{
				Fragments._Playlist__OclAny /* 0 */,
				Fragments._Playlist__OclElement /* 1 */,
				Fragments._Playlist__NamedElement /* 2 */,
				Fragments._Playlist__Playlist /* 3 */
			};
		private static final int /*@NonNull*/ [] __Playlist = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reaction =
			{
				Fragments._Reaction__OclAny /* 0 */,
				Fragments._Reaction__OclElement /* 1 */,
				Fragments._Reaction__UserInteraction /* 2 */,
				Fragments._Reaction__Reaction /* 3 */
			};
		private static final int /*@NonNull*/ [] __Reaction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReactionType =
			{
				Fragments._ReactionType__OclAny /* 0 */,
				Fragments._ReactionType__OclElement /* 1 */,
				Fragments._ReactionType__OclType /* 2 */,
				Fragments._ReactionType__OclEnumeration /* 3 */,
				Fragments._ReactionType__ReactionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReactionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Region =
			{
				Fragments._Region__OclAny /* 0 */,
				Fragments._Region__OclElement /* 1 */,
				Fragments._Region__OclType /* 2 */,
				Fragments._Region__OclEnumeration /* 3 */,
				Fragments._Region__Region /* 4 */
			};
		private static final int /*@NonNull*/ [] __Region = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__OclType /* 2 */,
				Fragments._Role__OclEnumeration /* 3 */,
				Fragments._Role__Role /* 4 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Stream =
			{
				Fragments._Stream__OclAny /* 0 */,
				Fragments._Stream__OclElement /* 1 */,
				Fragments._Stream__Taggable /* 2 */,
				Fragments._Stream__MediaContent /* 3 */,
				Fragments._Stream__Stream /* 4 */
			};
		private static final int /*@NonNull*/ [] __Stream = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Subscription =
			{
				Fragments._Subscription__OclAny /* 0 */,
				Fragments._Subscription__OclElement /* 1 */,
				Fragments._Subscription__Monetization /* 2 */,
				Fragments._Subscription__Subscription /* 3 */
			};
		private static final int /*@NonNull*/ [] __Subscription = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubscriptionDuration =
			{
				Fragments._SubscriptionDuration__OclAny /* 0 */,
				Fragments._SubscriptionDuration__OclElement /* 1 */,
				Fragments._SubscriptionDuration__OclType /* 2 */,
				Fragments._SubscriptionDuration__OclEnumeration /* 3 */,
				Fragments._SubscriptionDuration__SubscriptionDuration /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubscriptionDuration = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Taggable =
			{
				Fragments._Taggable__OclAny /* 0 */,
				Fragments._Taggable__OclElement /* 1 */,
				Fragments._Taggable__Taggable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Taggable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tier =
			{
				Fragments._Tier__OclAny /* 0 */,
				Fragments._Tier__OclElement /* 1 */,
				Fragments._Tier__OclType /* 2 */,
				Fragments._Tier__OclEnumeration /* 3 */,
				Fragments._Tier__Tier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Tier = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tip =
			{
				Fragments._Tip__OclAny /* 0 */,
				Fragments._Tip__OclElement /* 1 */,
				Fragments._Tip__Monetization /* 2 */,
				Fragments._Tip__Tip /* 3 */
			};
		private static final int /*@NonNull*/ [] __Tip = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UnlockCondition =
			{
				Fragments._UnlockCondition__OclAny /* 0 */,
				Fragments._UnlockCondition__OclElement /* 1 */,
				Fragments._UnlockCondition__OclType /* 2 */,
				Fragments._UnlockCondition__OclEnumeration /* 3 */,
				Fragments._UnlockCondition__UnlockCondition /* 4 */
			};
		private static final int /*@NonNull*/ [] __UnlockCondition = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__Auditable /* 2 */,
				Fragments._User__NamedElement /* 2 */,
				Fragments._User__User /* 3 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UserInteraction =
			{
				Fragments._UserInteraction__OclAny /* 0 */,
				Fragments._UserInteraction__OclElement /* 1 */,
				Fragments._UserInteraction__UserInteraction /* 2 */
			};
		private static final int /*@NonNull*/ [] __UserInteraction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VideoQuality =
			{
				Fragments._VideoQuality__OclAny /* 0 */,
				Fragments._VideoQuality__OclElement /* 1 */,
				Fragments._VideoQuality__OclType /* 2 */,
				Fragments._VideoQuality__OclEnumeration /* 3 */,
				Fragments._VideoQuality__VideoQuality /* 4 */
			};
		private static final int /*@NonNull*/ [] __VideoQuality = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Auditable.initFragments(_Auditable, __Auditable);
			Types._Category.initFragments(_Category, __Category);
			Types._Channel.initFragments(_Channel, __Channel);
			Types._Clip.initFragments(_Clip, __Clip);
			Types._Currency.initFragments(_Currency, __Currency);
			Types._Device.initFragments(_Device, __Device);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._FeatureType.initFragments(_FeatureType, __FeatureType);
			Types._Language.initFragments(_Language, __Language);
			Types._MediaContent.initFragments(_MediaContent, __MediaContent);
			Types._Message.initFragments(_Message, __Message);
			Types._Monetization.initFragments(_Monetization, __Monetization);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._PaymentMethod.initFragments(_PaymentMethod, __PaymentMethod);
			Types._PaymentStatus.initFragments(_PaymentStatus, __PaymentStatus);
			Types._Platform.initFragments(_Platform, __Platform);
			Types._Playlist.initFragments(_Playlist, __Playlist);
			Types._Reaction.initFragments(_Reaction, __Reaction);
			Types._ReactionType.initFragments(_ReactionType, __ReactionType);
			Types._Region.initFragments(_Region, __Region);
			Types._Role.initFragments(_Role, __Role);
			Types._Stream.initFragments(_Stream, __Stream);
			Types._Subscription.initFragments(_Subscription, __Subscription);
			Types._SubscriptionDuration.initFragments(_SubscriptionDuration, __SubscriptionDuration);
			Types._Taggable.initFragments(_Taggable, __Taggable);
			Types._Tier.initFragments(_Tier, __Tier);
			Types._Tip.initFragments(_Tip, __Tip);
			Types._UnlockCondition.initFragments(_UnlockCondition, __UnlockCondition);
			Types._User.initFragments(_User, __User);
			Types._UserInteraction.initFragments(_UserInteraction, __UserInteraction);
			Types._VideoQuality.initFragments(_VideoQuality, __VideoQuality);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Auditable__Auditable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Auditable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Auditable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Category__Category = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Channel__Channel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__Auditable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Channel__Taggable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Clip__Clip = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Clip__MediaContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Clip__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Clip__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Clip__Taggable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Currency__Currency = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Currency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Currency__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Currency__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Currency__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Device__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__FeatureType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FeatureType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Language__Language = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MediaContent__MediaContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MediaContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MediaContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MediaContent__Taggable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Message__Message = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Message__UserInteraction = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Monetization__Monetization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Monetization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Monetization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__PaymentMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__PaymentStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Platform__Platform = {
			RefinedStreamingPlatformTables.Operations._Platform__activeUsersCount /* activeUsersCount() */,
			RefinedStreamingPlatformTables.Operations._Platform__findChannelByName /* findChannelByName(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Platform__Auditable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Platform__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Platform__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Platform__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__Playlist = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reaction__Reaction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reaction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reaction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reaction__UserInteraction = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ReactionType__ReactionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReactionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReactionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReactionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReactionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Region__Region = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Stream__Stream = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stream__MediaContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stream__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Stream__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Stream__Taggable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Subscription__Subscription = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Subscription__Monetization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Subscription__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Subscription__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubscriptionDuration__SubscriptionDuration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubscriptionDuration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubscriptionDuration__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubscriptionDuration__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubscriptionDuration__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Taggable__Taggable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Taggable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Taggable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Tier__Tier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tier__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tier__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tier__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tier__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Tip__Tip = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tip__Monetization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tip__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tip__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UnlockCondition__UnlockCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UnlockCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnlockCondition__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnlockCondition__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UnlockCondition__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {
			RefinedStreamingPlatformTables.Operations._User__isFollowing /* isFollowing(Channel[1]) */,
			RefinedStreamingPlatformTables.Operations._User__totalSpending /* totalSpending() */,
			RefinedStreamingPlatformTables.Operations._User__totalTips /* totalTips() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__Auditable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UserInteraction__UserInteraction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UserInteraction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UserInteraction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VideoQuality__VideoQuality = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VideoQuality__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VideoQuality__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VideoQuality__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VideoQuality__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Auditable__Auditable.initOperations(_Auditable__Auditable);
			Fragments._Auditable__OclAny.initOperations(_Auditable__OclAny);
			Fragments._Auditable__OclElement.initOperations(_Auditable__OclElement);

			Fragments._Category__Category.initOperations(_Category__Category);
			Fragments._Category__OclAny.initOperations(_Category__OclAny);
			Fragments._Category__OclElement.initOperations(_Category__OclElement);
			Fragments._Category__OclEnumeration.initOperations(_Category__OclEnumeration);
			Fragments._Category__OclType.initOperations(_Category__OclType);

			Fragments._Channel__Auditable.initOperations(_Channel__Auditable);
			Fragments._Channel__Channel.initOperations(_Channel__Channel);
			Fragments._Channel__NamedElement.initOperations(_Channel__NamedElement);
			Fragments._Channel__OclAny.initOperations(_Channel__OclAny);
			Fragments._Channel__OclElement.initOperations(_Channel__OclElement);
			Fragments._Channel__Taggable.initOperations(_Channel__Taggable);

			Fragments._Clip__Clip.initOperations(_Clip__Clip);
			Fragments._Clip__MediaContent.initOperations(_Clip__MediaContent);
			Fragments._Clip__OclAny.initOperations(_Clip__OclAny);
			Fragments._Clip__OclElement.initOperations(_Clip__OclElement);
			Fragments._Clip__Taggable.initOperations(_Clip__Taggable);

			Fragments._Currency__Currency.initOperations(_Currency__Currency);
			Fragments._Currency__OclAny.initOperations(_Currency__OclAny);
			Fragments._Currency__OclElement.initOperations(_Currency__OclElement);
			Fragments._Currency__OclEnumeration.initOperations(_Currency__OclEnumeration);
			Fragments._Currency__OclType.initOperations(_Currency__OclType);

			Fragments._Device__Device.initOperations(_Device__Device);
			Fragments._Device__OclAny.initOperations(_Device__OclAny);
			Fragments._Device__OclElement.initOperations(_Device__OclElement);
			Fragments._Device__OclEnumeration.initOperations(_Device__OclEnumeration);
			Fragments._Device__OclType.initOperations(_Device__OclType);

			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__NamedElement.initOperations(_Feature__NamedElement);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._FeatureType__FeatureType.initOperations(_FeatureType__FeatureType);
			Fragments._FeatureType__OclAny.initOperations(_FeatureType__OclAny);
			Fragments._FeatureType__OclElement.initOperations(_FeatureType__OclElement);
			Fragments._FeatureType__OclEnumeration.initOperations(_FeatureType__OclEnumeration);
			Fragments._FeatureType__OclType.initOperations(_FeatureType__OclType);

			Fragments._Language__Language.initOperations(_Language__Language);
			Fragments._Language__OclAny.initOperations(_Language__OclAny);
			Fragments._Language__OclElement.initOperations(_Language__OclElement);
			Fragments._Language__OclEnumeration.initOperations(_Language__OclEnumeration);
			Fragments._Language__OclType.initOperations(_Language__OclType);

			Fragments._MediaContent__MediaContent.initOperations(_MediaContent__MediaContent);
			Fragments._MediaContent__OclAny.initOperations(_MediaContent__OclAny);
			Fragments._MediaContent__OclElement.initOperations(_MediaContent__OclElement);
			Fragments._MediaContent__Taggable.initOperations(_MediaContent__Taggable);

			Fragments._Message__Message.initOperations(_Message__Message);
			Fragments._Message__OclAny.initOperations(_Message__OclAny);
			Fragments._Message__OclElement.initOperations(_Message__OclElement);
			Fragments._Message__UserInteraction.initOperations(_Message__UserInteraction);

			Fragments._Monetization__Monetization.initOperations(_Monetization__Monetization);
			Fragments._Monetization__OclAny.initOperations(_Monetization__OclAny);
			Fragments._Monetization__OclElement.initOperations(_Monetization__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._PaymentMethod__OclAny.initOperations(_PaymentMethod__OclAny);
			Fragments._PaymentMethod__OclElement.initOperations(_PaymentMethod__OclElement);
			Fragments._PaymentMethod__OclEnumeration.initOperations(_PaymentMethod__OclEnumeration);
			Fragments._PaymentMethod__OclType.initOperations(_PaymentMethod__OclType);
			Fragments._PaymentMethod__PaymentMethod.initOperations(_PaymentMethod__PaymentMethod);

			Fragments._PaymentStatus__OclAny.initOperations(_PaymentStatus__OclAny);
			Fragments._PaymentStatus__OclElement.initOperations(_PaymentStatus__OclElement);
			Fragments._PaymentStatus__OclEnumeration.initOperations(_PaymentStatus__OclEnumeration);
			Fragments._PaymentStatus__OclType.initOperations(_PaymentStatus__OclType);
			Fragments._PaymentStatus__PaymentStatus.initOperations(_PaymentStatus__PaymentStatus);

			Fragments._Platform__Auditable.initOperations(_Platform__Auditable);
			Fragments._Platform__NamedElement.initOperations(_Platform__NamedElement);
			Fragments._Platform__OclAny.initOperations(_Platform__OclAny);
			Fragments._Platform__OclElement.initOperations(_Platform__OclElement);
			Fragments._Platform__Platform.initOperations(_Platform__Platform);

			Fragments._Playlist__NamedElement.initOperations(_Playlist__NamedElement);
			Fragments._Playlist__OclAny.initOperations(_Playlist__OclAny);
			Fragments._Playlist__OclElement.initOperations(_Playlist__OclElement);
			Fragments._Playlist__Playlist.initOperations(_Playlist__Playlist);

			Fragments._Reaction__OclAny.initOperations(_Reaction__OclAny);
			Fragments._Reaction__OclElement.initOperations(_Reaction__OclElement);
			Fragments._Reaction__Reaction.initOperations(_Reaction__Reaction);
			Fragments._Reaction__UserInteraction.initOperations(_Reaction__UserInteraction);

			Fragments._ReactionType__OclAny.initOperations(_ReactionType__OclAny);
			Fragments._ReactionType__OclElement.initOperations(_ReactionType__OclElement);
			Fragments._ReactionType__OclEnumeration.initOperations(_ReactionType__OclEnumeration);
			Fragments._ReactionType__OclType.initOperations(_ReactionType__OclType);
			Fragments._ReactionType__ReactionType.initOperations(_ReactionType__ReactionType);

			Fragments._Region__OclAny.initOperations(_Region__OclAny);
			Fragments._Region__OclElement.initOperations(_Region__OclElement);
			Fragments._Region__OclEnumeration.initOperations(_Region__OclEnumeration);
			Fragments._Region__OclType.initOperations(_Region__OclType);
			Fragments._Region__Region.initOperations(_Region__Region);

			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__OclEnumeration.initOperations(_Role__OclEnumeration);
			Fragments._Role__OclType.initOperations(_Role__OclType);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._Stream__MediaContent.initOperations(_Stream__MediaContent);
			Fragments._Stream__OclAny.initOperations(_Stream__OclAny);
			Fragments._Stream__OclElement.initOperations(_Stream__OclElement);
			Fragments._Stream__Stream.initOperations(_Stream__Stream);
			Fragments._Stream__Taggable.initOperations(_Stream__Taggable);

			Fragments._Subscription__Monetization.initOperations(_Subscription__Monetization);
			Fragments._Subscription__OclAny.initOperations(_Subscription__OclAny);
			Fragments._Subscription__OclElement.initOperations(_Subscription__OclElement);
			Fragments._Subscription__Subscription.initOperations(_Subscription__Subscription);

			Fragments._SubscriptionDuration__OclAny.initOperations(_SubscriptionDuration__OclAny);
			Fragments._SubscriptionDuration__OclElement.initOperations(_SubscriptionDuration__OclElement);
			Fragments._SubscriptionDuration__OclEnumeration.initOperations(_SubscriptionDuration__OclEnumeration);
			Fragments._SubscriptionDuration__OclType.initOperations(_SubscriptionDuration__OclType);
			Fragments._SubscriptionDuration__SubscriptionDuration.initOperations(_SubscriptionDuration__SubscriptionDuration);

			Fragments._Taggable__OclAny.initOperations(_Taggable__OclAny);
			Fragments._Taggable__OclElement.initOperations(_Taggable__OclElement);
			Fragments._Taggable__Taggable.initOperations(_Taggable__Taggable);

			Fragments._Tier__OclAny.initOperations(_Tier__OclAny);
			Fragments._Tier__OclElement.initOperations(_Tier__OclElement);
			Fragments._Tier__OclEnumeration.initOperations(_Tier__OclEnumeration);
			Fragments._Tier__OclType.initOperations(_Tier__OclType);
			Fragments._Tier__Tier.initOperations(_Tier__Tier);

			Fragments._Tip__Monetization.initOperations(_Tip__Monetization);
			Fragments._Tip__OclAny.initOperations(_Tip__OclAny);
			Fragments._Tip__OclElement.initOperations(_Tip__OclElement);
			Fragments._Tip__Tip.initOperations(_Tip__Tip);

			Fragments._UnlockCondition__OclAny.initOperations(_UnlockCondition__OclAny);
			Fragments._UnlockCondition__OclElement.initOperations(_UnlockCondition__OclElement);
			Fragments._UnlockCondition__OclEnumeration.initOperations(_UnlockCondition__OclEnumeration);
			Fragments._UnlockCondition__OclType.initOperations(_UnlockCondition__OclType);
			Fragments._UnlockCondition__UnlockCondition.initOperations(_UnlockCondition__UnlockCondition);

			Fragments._User__Auditable.initOperations(_User__Auditable);
			Fragments._User__NamedElement.initOperations(_User__NamedElement);
			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Fragments._UserInteraction__OclAny.initOperations(_UserInteraction__OclAny);
			Fragments._UserInteraction__OclElement.initOperations(_UserInteraction__OclElement);
			Fragments._UserInteraction__UserInteraction.initOperations(_UserInteraction__UserInteraction);

			Fragments._VideoQuality__OclAny.initOperations(_VideoQuality__OclAny);
			Fragments._VideoQuality__OclElement.initOperations(_VideoQuality__OclElement);
			Fragments._VideoQuality__OclEnumeration.initOperations(_VideoQuality__OclEnumeration);
			Fragments._VideoQuality__OclType.initOperations(_VideoQuality__OclType);
			Fragments._VideoQuality__VideoQuality.initOperations(_VideoQuality__VideoQuality);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Auditable = {
			RefinedStreamingPlatformTables.Properties._Auditable__createdAt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Auditable__updatedAt
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Category = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Channel = {
			RefinedStreamingPlatformTables.Properties._Channel__channelID,
			RefinedStreamingPlatformTables.Properties._Channel__clips,
			RefinedStreamingPlatformTables.Properties._Auditable__createdAt,
			RefinedStreamingPlatformTables.Properties._Channel__features,
			RefinedStreamingPlatformTables.Properties._Channel__followers,
			RefinedStreamingPlatformTables.Properties._Channel__moderators,
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Channel__owner,
			RefinedStreamingPlatformTables.Properties._Channel__playlists,
			RefinedStreamingPlatformTables.Properties._Channel__streams,
			RefinedStreamingPlatformTables.Properties._Channel__subscriptions,
			RefinedStreamingPlatformTables.Properties._Taggable__tags,
			RefinedStreamingPlatformTables.Properties._Channel__tips,
			RefinedStreamingPlatformTables.Properties._Channel__totalFollowers,
			RefinedStreamingPlatformTables.Properties._Channel__totalTips,
			RefinedStreamingPlatformTables.Properties._Channel__totalViews,
			RefinedStreamingPlatformTables.Properties._Auditable__updatedAt
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Clip = {
			RefinedStreamingPlatformTables.Properties._MediaContent__category,
			RefinedStreamingPlatformTables.Properties._Clip__createdBy,
			RefinedStreamingPlatformTables.Properties._MediaContent__mediaContentID,
			RefinedStreamingPlatformTables.Properties._MediaContent__messages,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._MediaContent__reactions,
			RefinedStreamingPlatformTables.Properties._Taggable__tags,
			RefinedStreamingPlatformTables.Properties._MediaContent__title,
			RefinedStreamingPlatformTables.Properties._MediaContent__videoQualities,
			RefinedStreamingPlatformTables.Properties._MediaContent__viewCount
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Currency = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Device = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			RefinedStreamingPlatformTables.Properties._Feature__donationAmount,
			RefinedStreamingPlatformTables.Properties._Feature__eligibilityDescription,
			RefinedStreamingPlatformTables.Properties._Feature__featureID,
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Feature__tenure,
			RefinedStreamingPlatformTables.Properties._Feature__type,
			RefinedStreamingPlatformTables.Properties._Feature__unlockCondition,
			RefinedStreamingPlatformTables.Properties._Feature__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FeatureType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Language = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MediaContent = {
			RefinedStreamingPlatformTables.Properties._MediaContent__category,
			RefinedStreamingPlatformTables.Properties._MediaContent__mediaContentID,
			RefinedStreamingPlatformTables.Properties._MediaContent__messages,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._MediaContent__reactions,
			RefinedStreamingPlatformTables.Properties._Taggable__tags,
			RefinedStreamingPlatformTables.Properties._MediaContent__title,
			RefinedStreamingPlatformTables.Properties._MediaContent__videoQualities,
			RefinedStreamingPlatformTables.Properties._MediaContent__viewCount
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Message = {
			RefinedStreamingPlatformTables.Properties._UserInteraction__author,
			RefinedStreamingPlatformTables.Properties._Message__content,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._UserInteraction__timestamp,
			RefinedStreamingPlatformTables.Properties._UserInteraction__userInteractionID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Monetization = {
			RefinedStreamingPlatformTables.Properties._Monetization__amount,
			RefinedStreamingPlatformTables.Properties._Monetization__currency,
			RefinedStreamingPlatformTables.Properties._Monetization__monetizationID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentMethod,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentStatus,
			RefinedStreamingPlatformTables.Properties._Monetization__transactionDate
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Platform = {
			RefinedStreamingPlatformTables.Properties._Platform__channels,
			RefinedStreamingPlatformTables.Properties._Auditable__createdAt,
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Platform__platformID,
			RefinedStreamingPlatformTables.Properties._Platform__revenue,
			RefinedStreamingPlatformTables.Properties._Platform__supportedDevices,
			RefinedStreamingPlatformTables.Properties._Platform__supportedLanguages,
			RefinedStreamingPlatformTables.Properties._Platform__supportedRegions,
			RefinedStreamingPlatformTables.Properties._Platform__supportedVideoQualities,
			RefinedStreamingPlatformTables.Properties._Platform__totalRevenue,
			RefinedStreamingPlatformTables.Properties._Auditable__updatedAt,
			RefinedStreamingPlatformTables.Properties._Platform__users,
			RefinedStreamingPlatformTables.Properties._Platform__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Playlist = {
			RefinedStreamingPlatformTables.Properties._Playlist__media,
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Playlist__playlistID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reaction = {
			RefinedStreamingPlatformTables.Properties._UserInteraction__author,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Reaction__reactionType,
			RefinedStreamingPlatformTables.Properties._UserInteraction__timestamp,
			RefinedStreamingPlatformTables.Properties._UserInteraction__userInteractionID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReactionType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Region = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Stream = {
			RefinedStreamingPlatformTables.Properties._Stream__activeViewers,
			RefinedStreamingPlatformTables.Properties._MediaContent__category,
			RefinedStreamingPlatformTables.Properties._Stream__isLive,
			RefinedStreamingPlatformTables.Properties._MediaContent__mediaContentID,
			RefinedStreamingPlatformTables.Properties._MediaContent__messages,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._MediaContent__reactions,
			RefinedStreamingPlatformTables.Properties._Taggable__tags,
			RefinedStreamingPlatformTables.Properties._MediaContent__title,
			RefinedStreamingPlatformTables.Properties._MediaContent__videoQualities,
			RefinedStreamingPlatformTables.Properties._MediaContent__viewCount,
			RefinedStreamingPlatformTables.Properties._Stream__viewers
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Subscription = {
			RefinedStreamingPlatformTables.Properties._Monetization__amount,
			RefinedStreamingPlatformTables.Properties._Subscription__autoRenewal,
			RefinedStreamingPlatformTables.Properties._Monetization__currency,
			RefinedStreamingPlatformTables.Properties._Subscription__duration,
			RefinedStreamingPlatformTables.Properties._Subscription__endDate,
			RefinedStreamingPlatformTables.Properties._Subscription__features,
			RefinedStreamingPlatformTables.Properties._Monetization__monetizationID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentMethod,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentStatus,
			RefinedStreamingPlatformTables.Properties._Subscription__price,
			RefinedStreamingPlatformTables.Properties._Subscription__startDate,
			RefinedStreamingPlatformTables.Properties._Subscription__tier,
			RefinedStreamingPlatformTables.Properties._Monetization__transactionDate
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubscriptionDuration = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Taggable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Taggable__tags
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tier = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tip = {
			RefinedStreamingPlatformTables.Properties._Monetization__amount,
			RefinedStreamingPlatformTables.Properties._Monetization__currency,
			RefinedStreamingPlatformTables.Properties._Tip__message,
			RefinedStreamingPlatformTables.Properties._Monetization__monetizationID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentMethod,
			RefinedStreamingPlatformTables.Properties._Monetization__paymentStatus,
			RefinedStreamingPlatformTables.Properties._Monetization__transactionDate
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UnlockCondition = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			RefinedStreamingPlatformTables.Properties._User__avatar,
			RefinedStreamingPlatformTables.Properties._Auditable__createdAt,
			RefinedStreamingPlatformTables.Properties._User__followedChannels,
			RefinedStreamingPlatformTables.Properties._User__isOnline,
			RefinedStreamingPlatformTables.Properties._NamedElement__name,
			RefinedStreamingPlatformTables.Properties._User__nickname,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._User__role,
			RefinedStreamingPlatformTables.Properties._User__subscriptions,
			RefinedStreamingPlatformTables.Properties._User__tips,
			RefinedStreamingPlatformTables.Properties._Auditable__updatedAt,
			RefinedStreamingPlatformTables.Properties._User__userID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UserInteraction = {
			RefinedStreamingPlatformTables.Properties._UserInteraction__author,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RefinedStreamingPlatformTables.Properties._UserInteraction__timestamp,
			RefinedStreamingPlatformTables.Properties._UserInteraction__userInteractionID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VideoQuality = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Auditable__Auditable.initProperties(_Auditable);
			Fragments._Category__Category.initProperties(_Category);
			Fragments._Channel__Channel.initProperties(_Channel);
			Fragments._Clip__Clip.initProperties(_Clip);
			Fragments._Currency__Currency.initProperties(_Currency);
			Fragments._Device__Device.initProperties(_Device);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._FeatureType__FeatureType.initProperties(_FeatureType);
			Fragments._Language__Language.initProperties(_Language);
			Fragments._MediaContent__MediaContent.initProperties(_MediaContent);
			Fragments._Message__Message.initProperties(_Message);
			Fragments._Monetization__Monetization.initProperties(_Monetization);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._PaymentMethod__PaymentMethod.initProperties(_PaymentMethod);
			Fragments._PaymentStatus__PaymentStatus.initProperties(_PaymentStatus);
			Fragments._Platform__Platform.initProperties(_Platform);
			Fragments._Playlist__Playlist.initProperties(_Playlist);
			Fragments._Reaction__Reaction.initProperties(_Reaction);
			Fragments._ReactionType__ReactionType.initProperties(_ReactionType);
			Fragments._Region__Region.initProperties(_Region);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._Stream__Stream.initProperties(_Stream);
			Fragments._Subscription__Subscription.initProperties(_Subscription);
			Fragments._SubscriptionDuration__SubscriptionDuration.initProperties(_SubscriptionDuration);
			Fragments._Taggable__Taggable.initProperties(_Taggable);
			Fragments._Tier__Tier.initProperties(_Tier);
			Fragments._Tip__Tip.initProperties(_Tip);
			Fragments._UnlockCondition__UnlockCondition.initProperties(_UnlockCondition);
			Fragments._User__User.initProperties(_User);
			Fragments._UserInteraction__UserInteraction.initProperties(_UserInteraction);
			Fragments._VideoQuality__VideoQuality.initProperties(_VideoQuality);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Category__Videogames = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CATEGORY.getEEnumLiteral("Videogames"), Types._Category, 0);
		public static final EcoreExecutorEnumerationLiteral _Category__JustChatting = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CATEGORY.getEEnumLiteral("JustChatting"), Types._Category, 1);
		public static final EcoreExecutorEnumerationLiteral _Category__Esports = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CATEGORY.getEEnumLiteral("Esports"), Types._Category, 2);
		public static final EcoreExecutorEnumerationLiteral _Category__Sports = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CATEGORY.getEEnumLiteral("Sports"), Types._Category, 3);
		public static final EcoreExecutorEnumerationLiteral _Category__TalkShowsAndPodscasts = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CATEGORY.getEEnumLiteral("TalkShowsAndPodscasts"), Types._Category, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Category = {
			_Category__Videogames,
			_Category__JustChatting,
			_Category__Esports,
			_Category__Sports,
			_Category__TalkShowsAndPodscasts
		};

		public static final EcoreExecutorEnumerationLiteral _Currency__EUR = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CURRENCY.getEEnumLiteral("EUR"), Types._Currency, 0);
		public static final EcoreExecutorEnumerationLiteral _Currency__USD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CURRENCY.getEEnumLiteral("USD"), Types._Currency, 1);
		public static final EcoreExecutorEnumerationLiteral _Currency__GBP = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.CURRENCY.getEEnumLiteral("GBP"), Types._Currency, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Currency = {
			_Currency__EUR,
			_Currency__USD,
			_Currency__GBP
		};

		public static final EcoreExecutorEnumerationLiteral _Device__iOS = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.DEVICE.getEEnumLiteral("iOS"), Types._Device, 0);
		public static final EcoreExecutorEnumerationLiteral _Device__Android = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.DEVICE.getEEnumLiteral("Android"), Types._Device, 1);
		public static final EcoreExecutorEnumerationLiteral _Device__Web = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.DEVICE.getEEnumLiteral("Web"), Types._Device, 2);
		public static final EcoreExecutorEnumerationLiteral _Device__TV = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.DEVICE.getEEnumLiteral("TV"), Types._Device, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Device = {
			_Device__iOS,
			_Device__Android,
			_Device__Web,
			_Device__TV
		};

		public static final EcoreExecutorEnumerationLiteral _FeatureType__Badge = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.FEATURE_TYPE.getEEnumLiteral("Badge"), Types._FeatureType, 0);
		public static final EcoreExecutorEnumerationLiteral _FeatureType__Emote = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.FEATURE_TYPE.getEEnumLiteral("Emote"), Types._FeatureType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _FeatureType = {
			_FeatureType__Badge,
			_FeatureType__Emote
		};

		public static final EcoreExecutorEnumerationLiteral _Language__Italian = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.LANGUAGE.getEEnumLiteral("Italian"), Types._Language, 0);
		public static final EcoreExecutorEnumerationLiteral _Language__Spanish = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.LANGUAGE.getEEnumLiteral("Spanish"), Types._Language, 1);
		public static final EcoreExecutorEnumerationLiteral _Language__English = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.LANGUAGE.getEEnumLiteral("English"), Types._Language, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Language = {
			_Language__Italian,
			_Language__Spanish,
			_Language__English
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__Paypal = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_METHOD.getEEnumLiteral("Paypal"), Types._PaymentMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__CreditCard = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_METHOD.getEEnumLiteral("CreditCard"), Types._PaymentMethod, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentMethod = {
			_PaymentMethod__Paypal,
			_PaymentMethod__CreditCard
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Pending = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Pending"), Types._PaymentStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Completed = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Completed"), Types._PaymentStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Rejected = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Rejected"), Types._PaymentStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Refunded = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Refunded"), Types._PaymentStatus, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentStatus = {
			_PaymentStatus__Pending,
			_PaymentStatus__Completed,
			_PaymentStatus__Rejected,
			_PaymentStatus__Refunded
		};

		public static final EcoreExecutorEnumerationLiteral _ReactionType__Love = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REACTION_TYPE.getEEnumLiteral("Love"), Types._ReactionType, 0);
		public static final EcoreExecutorEnumerationLiteral _ReactionType__ThumbsUp = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REACTION_TYPE.getEEnumLiteral("ThumbsUp"), Types._ReactionType, 1);
		public static final EcoreExecutorEnumerationLiteral _ReactionType__ThumbsDown = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REACTION_TYPE.getEEnumLiteral("ThumbsDown"), Types._ReactionType, 2);
		public static final EcoreExecutorEnumerationLiteral _ReactionType__Funny = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REACTION_TYPE.getEEnumLiteral("Funny"), Types._ReactionType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ReactionType = {
			_ReactionType__Love,
			_ReactionType__ThumbsUp,
			_ReactionType__ThumbsDown,
			_ReactionType__Funny
		};

		public static final EcoreExecutorEnumerationLiteral _Region__Europe = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REGION.getEEnumLiteral("Europe"), Types._Region, 0);
		public static final EcoreExecutorEnumerationLiteral _Region__America = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.REGION.getEEnumLiteral("America"), Types._Region, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Region = {
			_Region__Europe,
			_Region__America
		};

		public static final EcoreExecutorEnumerationLiteral _Role__Administrator = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.ROLE.getEEnumLiteral("Administrator"), Types._Role, 0);
		public static final EcoreExecutorEnumerationLiteral _Role__Streamer = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.ROLE.getEEnumLiteral("Streamer"), Types._Role, 1);
		public static final EcoreExecutorEnumerationLiteral _Role__Viewer = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.ROLE.getEEnumLiteral("Viewer"), Types._Role, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Role = {
			_Role__Administrator,
			_Role__Streamer,
			_Role__Viewer
		};

		public static final EcoreExecutorEnumerationLiteral _SubscriptionDuration__Monthly = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION_DURATION.getEEnumLiteral("Monthly"), Types._SubscriptionDuration, 0);
		public static final EcoreExecutorEnumerationLiteral _SubscriptionDuration__Annual = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.SUBSCRIPTION_DURATION.getEEnumLiteral("Annual"), Types._SubscriptionDuration, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SubscriptionDuration = {
			_SubscriptionDuration__Monthly,
			_SubscriptionDuration__Annual
		};

		public static final EcoreExecutorEnumerationLiteral _Tier__Basic = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.TIER.getEEnumLiteral("Basic"), Types._Tier, 0);
		public static final EcoreExecutorEnumerationLiteral _Tier__Premium = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.TIER.getEEnumLiteral("Premium"), Types._Tier, 1);
		public static final EcoreExecutorEnumerationLiteral _Tier__VIP = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.TIER.getEEnumLiteral("VIP"), Types._Tier, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Tier = {
			_Tier__Basic,
			_Tier__Premium,
			_Tier__VIP
		};

		public static final EcoreExecutorEnumerationLiteral _UnlockCondition__DonationAmount = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.UNLOCK_CONDITION.getEEnumLiteral("DonationAmount"), Types._UnlockCondition, 0);
		public static final EcoreExecutorEnumerationLiteral _UnlockCondition__Tenure = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.UNLOCK_CONDITION.getEEnumLiteral("Tenure"), Types._UnlockCondition, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UnlockCondition = {
			_UnlockCondition__DonationAmount,
			_UnlockCondition__Tenure
		};

		public static final EcoreExecutorEnumerationLiteral _VideoQuality__SD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY.getEEnumLiteral("SD"), Types._VideoQuality, 0);
		public static final EcoreExecutorEnumerationLiteral _VideoQuality__HD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY.getEEnumLiteral("HD"), Types._VideoQuality, 1);
		public static final EcoreExecutorEnumerationLiteral _VideoQuality__UltraHD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY.getEEnumLiteral("UltraHD"), Types._VideoQuality, 2);
		public static final EcoreExecutorEnumerationLiteral _VideoQuality__QuadHD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY.getEEnumLiteral("QuadHD"), Types._VideoQuality, 3);
		public static final EcoreExecutorEnumerationLiteral _VideoQuality__FullHD = new EcoreExecutorEnumerationLiteral(RefinedStreamingPlatformPackage.Literals.VIDEO_QUALITY.getEEnumLiteral("FullHD"), Types._VideoQuality, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VideoQuality = {
			_VideoQuality__SD,
			_VideoQuality__HD,
			_VideoQuality__UltraHD,
			_VideoQuality__QuadHD,
			_VideoQuality__FullHD
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Category.initLiterals(_Category);
			Types._Currency.initLiterals(_Currency);
			Types._Device.initLiterals(_Device);
			Types._FeatureType.initLiterals(_FeatureType);
			Types._Language.initLiterals(_Language);
			Types._PaymentMethod.initLiterals(_PaymentMethod);
			Types._PaymentStatus.initLiterals(_PaymentStatus);
			Types._ReactionType.initLiterals(_ReactionType);
			Types._Region.initLiterals(_Region);
			Types._Role.initLiterals(_Role);
			Types._SubscriptionDuration.initLiterals(_SubscriptionDuration);
			Types._Tier.initLiterals(_Tier);
			Types._UnlockCondition.initLiterals(_UnlockCondition);
			Types._VideoQuality.initLiterals(_VideoQuality);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RefinedStreamingPlatformTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new RefinedStreamingPlatformTables();
	}

	private RefinedStreamingPlatformTables() {
		super(RefinedStreamingPlatformPackage.eNS_URI);
	}
}
