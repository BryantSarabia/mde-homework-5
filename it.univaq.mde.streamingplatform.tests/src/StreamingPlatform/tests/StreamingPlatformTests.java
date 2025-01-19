/**
 */
package StreamingPlatform.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>StreamingPlatform</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamingPlatformTests extends TestSuite {

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
		TestSuite suite = new StreamingPlatformTests("StreamingPlatform Tests");
		suite.addTestSuite(PlatformTest.class);
		suite.addTestSuite(ChannelTest.class);
		suite.addTestSuite(UserTest.class);
		suite.addTestSuite(BadgeTest.class);
		suite.addTestSuite(EmoteTest.class);
		suite.addTestSuite(StreamTest.class);
		suite.addTestSuite(DonationTest.class);
		suite.addTestSuite(SubscriptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingPlatformTests(String name) {
		super(name);
	}

} //StreamingPlatformTests
