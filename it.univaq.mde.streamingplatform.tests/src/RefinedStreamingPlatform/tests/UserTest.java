/**
 */
package RefinedStreamingPlatform.tests;

import RefinedStreamingPlatform.RefinedStreamingPlatformFactory;
import RefinedStreamingPlatform.User;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.User#totalTips() <em>Total Tips</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#isFollowing(RefinedStreamingPlatform.Channel) <em>Is Following</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.User#totalSpending() <em>Total Spending</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UserTest extends AuditableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserTest.class);
	}

	/**
	 * Constructs a new User test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected User getFixture() {
		return (User)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RefinedStreamingPlatformFactory.eINSTANCE.createUser());
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
	 * Tests the '{@link RefinedStreamingPlatform.User#totalTips() <em>Total Tips</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.User#totalTips()
	 * @generated
	 */
	public void testTotalTips() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link RefinedStreamingPlatform.User#isFollowing(RefinedStreamingPlatform.Channel) <em>Is Following</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.User#isFollowing(RefinedStreamingPlatform.Channel)
	 * @generated
	 */
	public void testIsFollowing__Channel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link RefinedStreamingPlatform.User#totalSpending() <em>Total Spending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RefinedStreamingPlatform.User#totalSpending()
	 * @generated
	 */
	public void testTotalSpending() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //UserTest
