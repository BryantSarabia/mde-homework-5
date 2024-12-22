/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.Clip;
import StreamingPlatform.StreamingPlatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clip</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClipTest extends MediaContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClipTest.class);
	}

	/**
	 * Constructs a new Clip test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clip test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clip getFixture() {
		return (Clip)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StreamingPlatformFactory.eINSTANCE.createClip());
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

} //ClipTest
