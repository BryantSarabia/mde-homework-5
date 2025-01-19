/**
 */
package RefinedStreamingPlatform.tests;

import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;
import RefinedStreamingPlatform.Tip;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tip</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TipTest extends MonetizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TipTest.class);
	}

	/**
	 * Constructs a new Tip test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tip test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tip getFixture() {
		return (Tip)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RefinedStreamingPlatformFactory.eINSTANCE.createTip());
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

} //TipTest
