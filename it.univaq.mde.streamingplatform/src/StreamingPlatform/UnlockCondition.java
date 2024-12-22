/**
 */
package StreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unlock Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage#getUnlockCondition()
 * @model
 * @generated
 */
public enum UnlockCondition implements Enumerator {
	/**
	 * The '<em><b>Donation Amount</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONATION_AMOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	DONATION_AMOUNT(0, "DonationAmount", "DonationAmount"),

	/**
	 * The '<em><b>Tenure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENURE_VALUE
	 * @generated
	 * @ordered
	 */
	TENURE(1, "Tenure", "Tenure");

	/**
	 * The '<em><b>Donation Amount</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONATION_AMOUNT
	 * @model name="DonationAmount"
	 * @generated
	 * @ordered
	 */
	public static final int DONATION_AMOUNT_VALUE = 0;

	/**
	 * The '<em><b>Tenure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENURE
	 * @model name="Tenure"
	 * @generated
	 * @ordered
	 */
	public static final int TENURE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Unlock Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnlockCondition[] VALUES_ARRAY =
		new UnlockCondition[] {
			DONATION_AMOUNT,
			TENURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Unlock Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnlockCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unlock Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnlockCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnlockCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unlock Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnlockCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnlockCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unlock Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnlockCondition get(int value) {
		switch (value) {
			case DONATION_AMOUNT_VALUE: return DONATION_AMOUNT;
			case TENURE_VALUE: return TENURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnlockCondition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnlockCondition
