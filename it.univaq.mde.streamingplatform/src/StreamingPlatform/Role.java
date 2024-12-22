/**
 */
package StreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage#getRole()
 * @model
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Administrator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATOR(0, "Administrator", "Administrator"),

	/**
	 * The '<em><b>Streamer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAMER_VALUE
	 * @generated
	 * @ordered
	 */
	STREAMER(1, "Streamer", "Streamer"),

	/**
	 * The '<em><b>Viewer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	VIEWER(2, "Viewer", "Viewer");

	/**
	 * The '<em><b>Administrator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR
	 * @model name="Administrator"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATOR_VALUE = 0;

	/**
	 * The '<em><b>Streamer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAMER
	 * @model name="Streamer"
	 * @generated
	 * @ordered
	 */
	public static final int STREAMER_VALUE = 1;

	/**
	 * The '<em><b>Viewer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWER
	 * @model name="Viewer"
	 * @generated
	 * @ordered
	 */
	public static final int VIEWER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			ADMINISTRATOR,
			STREAMER,
			VIEWER,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case ADMINISTRATOR_VALUE: return ADMINISTRATOR;
			case STREAMER_VALUE: return STREAMER;
			case VIEWER_VALUE: return VIEWER;
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
	private Role(int value, String name, String literal) {
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
	
} //Role
