/**
 */
package StreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage#getDevice()
 * @model
 * @generated
 */
public enum Device implements Enumerator {
	/**
	 * The '<em><b>IOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOS_VALUE
	 * @generated
	 * @ordered
	 */
	IOS(0, "iOS", "iOS"),

	/**
	 * The '<em><b>Android</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDROID_VALUE
	 * @generated
	 * @ordered
	 */
	ANDROID(1, "Android", "Android"),

	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(2, "Web", "Web"),

	/**
	 * The '<em><b>TV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TV_VALUE
	 * @generated
	 * @ordered
	 */
	TV(3, "TV", "TV");

	/**
	 * The '<em><b>IOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOS
	 * @model name="iOS"
	 * @generated
	 * @ordered
	 */
	public static final int IOS_VALUE = 0;

	/**
	 * The '<em><b>Android</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANDROID
	 * @model name="Android"
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_VALUE = 1;

	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model name="Web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 2;

	/**
	 * The '<em><b>TV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TV_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Device[] VALUES_ARRAY =
		new Device[] {
			IOS,
			ANDROID,
			WEB,
			TV,
		};

	/**
	 * A public read-only list of all the '<em><b>Device</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Device> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Device result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Device result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Device get(int value) {
		switch (value) {
			case IOS_VALUE: return IOS;
			case ANDROID_VALUE: return ANDROID;
			case WEB_VALUE: return WEB;
			case TV_VALUE: return TV;
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
	private Device(int value, String name, String literal) {
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
	
} //Device
