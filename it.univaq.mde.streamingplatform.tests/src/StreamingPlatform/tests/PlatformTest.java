/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.Platform;
import StreamingPlatform.StreamingPlatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformTest extends AuditableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlatformTest.class);
	}

	/**
	 * Constructs a new Platform test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Platform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Platform getFixture() {
		return (Platform)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StreamingPlatformFactory.eINSTANCE.createPlatform());
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

} //PlatformTest
