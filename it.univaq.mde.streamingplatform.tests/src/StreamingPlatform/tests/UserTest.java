/**
 */
package StreamingPlatform.tests;

import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.User;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link StreamingPlatform.User#totalDonations() <em>Total Donations</em>}</li>
 *   <li>{@link StreamingPlatform.User#isFollowing(StreamingPlatform.Channel) <em>Is Following</em>}</li>
 *   <li>{@link StreamingPlatform.User#totalSpending() <em>Total Spending</em>}</li>
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
		setFixture(StreamingPlatformFactory.eINSTANCE.createUser());
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
	 * Tests the '{@link StreamingPlatform.User#totalDonations() <em>Total Donations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.User#totalDonations()
	 * @generated
	 */
	public void testTotalDonations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link StreamingPlatform.User#isFollowing(StreamingPlatform.Channel) <em>Is Following</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.User#isFollowing(StreamingPlatform.Channel)
	 * @generated
	 */
	public void testIsFollowing__Channel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link StreamingPlatform.User#totalSpending() <em>Total Spending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StreamingPlatform.User#totalSpending()
	 * @generated
	 */
	public void testTotalSpending() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //UserTest
