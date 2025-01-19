/**
 */
package RefinedStreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reaction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RefinedStreamingPlatform.RefinedStreamingPlatformPackage#getReactionType()
 * @model
 * @generated
 */
public enum ReactionType implements Enumerator {
	/**
	 * The '<em><b>Love</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOVE_VALUE
	 * @generated
	 * @ordered
	 */
	LOVE(0, "Love", "Love"),

	/**
	 * The '<em><b>Thumbs Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBS_UP_VALUE
	 * @generated
	 * @ordered
	 */
	THUMBS_UP(1, "ThumbsUp", "ThumbsUp"),

	/**
	 * The '<em><b>Thumbs Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBS_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	THUMBS_DOWN(2, "ThumbsDown", "ThumbsDown"),

	/**
	 * The '<em><b>Funny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNNY_VALUE
	 * @generated
	 * @ordered
	 */
	FUNNY(3, "Funny", "Funny");

	/**
	 * The '<em><b>Love</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOVE
	 * @model name="Love"
	 * @generated
	 * @ordered
	 */
	public static final int LOVE_VALUE = 0;

	/**
	 * The '<em><b>Thumbs Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBS_UP
	 * @model name="ThumbsUp"
	 * @generated
	 * @ordered
	 */
	public static final int THUMBS_UP_VALUE = 1;

	/**
	 * The '<em><b>Thumbs Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBS_DOWN
	 * @model name="ThumbsDown"
	 * @generated
	 * @ordered
	 */
	public static final int THUMBS_DOWN_VALUE = 2;

	/**
	 * The '<em><b>Funny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNNY
	 * @model name="Funny"
	 * @generated
	 * @ordered
	 */
	public static final int FUNNY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Reaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReactionType[] VALUES_ARRAY =
		new ReactionType[] {
			LOVE,
			THUMBS_UP,
			THUMBS_DOWN,
			FUNNY,
		};

	/**
	 * A public read-only list of all the '<em><b>Reaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReactionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reaction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReactionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReactionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reaction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReactionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReactionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reaction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReactionType get(int value) {
		switch (value) {
			case LOVE_VALUE: return LOVE;
			case THUMBS_UP_VALUE: return THUMBS_UP;
			case THUMBS_DOWN_VALUE: return THUMBS_DOWN;
			case FUNNY_VALUE: return FUNNY;
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
	private ReactionType(int value, String name, String literal) {
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
	
} //ReactionType
