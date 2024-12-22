/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.Badge;
import StreamingPlatform.StreamingPlatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BadgeTest extends FeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BadgeTest.class);
	}

	/**
	 * Constructs a new Badge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Badge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Badge getFixture() {
		return (Badge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StreamingPlatformFactory.eINSTANCE.createBadge());
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

} //BadgeTest
