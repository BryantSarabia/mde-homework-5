/**
 */
package RefinedStreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Subscription Duration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getSubscriptionDuration()
 * @model
 * @generated
 */
public enum SubscriptionDuration implements Enumerator {
	/**
	 * The '<em><b>Monthly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_VALUE
	 * @generated
	 * @ordered
	 */
	MONTHLY(0, "Monthly", "Monthly"),

	/**
	 * The '<em><b>Annual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNUAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANNUAL(1, "Annual", "Annual");

	/**
	 * The '<em><b>Monthly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY
	 * @model name="Monthly"
	 * @generated
	 * @ordered
	 */
	public static final int MONTHLY_VALUE = 0;

	/**
	 * The '<em><b>Annual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNUAL
	 * @model name="Annual"
	 * @generated
	 * @ordered
	 */
	public static final int ANNUAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Subscription Duration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubscriptionDuration[] VALUES_ARRAY =
		new SubscriptionDuration[] {
			MONTHLY,
			ANNUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Subscription Duration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubscriptionDuration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Subscription Duration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionDuration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionDuration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Duration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionDuration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubscriptionDuration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subscription Duration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubscriptionDuration get(int value) {
		switch (value) {
			case MONTHLY_VALUE: return MONTHLY;
			case ANNUAL_VALUE: return ANNUAL;
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
	private SubscriptionDuration(int value, String name, String literal) {
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
	
} //SubscriptionDuration
