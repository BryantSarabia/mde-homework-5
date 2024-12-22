/**
 */
package StreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resolution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage#getResolution()
 * @model
 * @generated
 */
public enum Resolution implements Enumerator {
	/**
	 * The '<em><b>SD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD_VALUE
	 * @generated
	 * @ordered
	 */
	SD(0, "SD", "SD"),

	/**
	 * The '<em><b>HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD_VALUE
	 * @generated
	 * @ordered
	 */
	HD(1, "HD", "HD"),

	/**
	 * The '<em><b>Ultra HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTRA_HD_VALUE
	 * @generated
	 * @ordered
	 */
	ULTRA_HD(2, "UltraHD", "UltraHD"),

	/**
	 * The '<em><b>Quad HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUAD_HD_VALUE
	 * @generated
	 * @ordered
	 */
	QUAD_HD(3, "QuadHD", "QuadHD"),

	/**
	 * The '<em><b>Full HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_HD_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_HD(4, "FullHD", "FullHD");

	/**
	 * The '<em><b>SD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SD_VALUE = 0;

	/**
	 * The '<em><b>HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HD_VALUE = 1;

	/**
	 * The '<em><b>Ultra HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTRA_HD
	 * @model name="UltraHD"
	 * @generated
	 * @ordered
	 */
	public static final int ULTRA_HD_VALUE = 2;

	/**
	 * The '<em><b>Quad HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUAD_HD
	 * @model name="QuadHD"
	 * @generated
	 * @ordered
	 */
	public static final int QUAD_HD_VALUE = 3;

	/**
	 * The '<em><b>Full HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_HD
	 * @model name="FullHD"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_HD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Resolution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Resolution[] VALUES_ARRAY =
		new Resolution[] {
			SD,
			HD,
			ULTRA_HD,
			QUAD_HD,
			FULL_HD,
		};

	/**
	 * A public read-only list of all the '<em><b>Resolution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Resolution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolution</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resolution get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Resolution result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resolution getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Resolution result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resolution get(int value) {
		switch (value) {
			case SD_VALUE: return SD;
			case HD_VALUE: return HD;
			case ULTRA_HD_VALUE: return ULTRA_HD;
			case QUAD_HD_VALUE: return QUAD_HD;
			case FULL_HD_VALUE: return FULL_HD;
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
	private Resolution(int value, String name, String literal) {
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
	
} //Resolution
