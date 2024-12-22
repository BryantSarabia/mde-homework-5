/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.Subscription;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriptionTest extends MonetizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubscriptionTest.class);
	}

	/**
	 * Constructs a new Subscription test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subscription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subscription getFixture() {
		return (Subscription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StreamingPlatformFactory.eINSTANCE.createSubscription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SubscriptionTest
