/**
 */
package RefinedStreamingPlatform.tests;

import RefinedStreamingPlatform.Reaction;
import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactionTest extends UserInteractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactionTest.class);
	}

	/**
	 * Constructs a new Reaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Reaction getFixture() {
		return (Reaction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RefinedStreamingPlatformFactory.eINSTANCE.createReaction());
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

} //ReactionTest
