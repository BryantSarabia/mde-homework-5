/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.Donation;
import StreamingPlatform.StreamingPlatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Donation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DonationTest extends MonetizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DonationTest.class);
	}

	/**
	 * Constructs a new Donation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Donation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Donation getFixture() {
		return (Donation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StreamingPlatformFactory.eINSTANCE.createDonation());
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

} //DonationTest
