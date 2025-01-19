/**
 */
package RefinedStreamingPlatform.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>RefinedStreamingPlatform</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinedStreamingPlatformTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RefinedStreamingPlatformTests("RefinedStreamingPlatform Tests");
		suite.addTestSuite(PlatformTest.class);
		suite.addTestSuite(ChannelTest.class);
		suite.addTestSuite(UserTest.class);
		suite.addTestSuite(FeatureTest.class);
		suite.addTestSuite(StreamTest.class);
		suite.addTestSuite(TipTest.class);
		suite.addTestSuite(SubscriptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStreamingPlatformTests(String name) {
		super(name);
	}

} //RefinedStreamingPlatformTests
