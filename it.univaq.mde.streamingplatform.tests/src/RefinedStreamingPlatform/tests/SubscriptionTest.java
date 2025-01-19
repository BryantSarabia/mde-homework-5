/**
 */
package RefinedStreamingPlatform.tests;

import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;
import RefinedStreamingPlatform.Subscription;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Less Than End Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transaction Date Less Than Start Date</em>}</li>
 * </ul>
 * </p>
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
		setFixture(RefinedStreamingPlatformFactory.eINSTANCE.createSubscription());
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

	/**
	 * Tests the '{@link RefinedStreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Less Than End Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Subscription#startDateLessThanEndDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testStartDateLessThanEndDate__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link RefinedStreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transaction Date Less Than Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.Subscription#transactionDateLessThanStartDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testTransactionDateLessThanStartDate__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SubscriptionTest
