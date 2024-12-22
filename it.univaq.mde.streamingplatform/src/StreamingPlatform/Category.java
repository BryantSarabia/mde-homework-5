/**
 */
package StreamingPlatform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see StreamingPlatform.StreamingPlatformPackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator {
	/**
	 * The '<em><b>Videogames</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEOGAMES_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEOGAMES(0, "Videogames", "Videogames"),

	/**
	 * The '<em><b>Just Chatting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUST_CHATTING_VALUE
	 * @generated
	 * @ordered
	 */
	JUST_CHATTING(1, "JustChatting", "JustChatting"),

	/**
	 * The '<em><b>Esports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	ESPORTS(2, "Esports", "Esports"),

	/**
	 * The '<em><b>Sports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	SPORTS(3, "Sports", "Sports"),

	/**
	 * The '<em><b>Talk Shows And Podscasts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TALK_SHOWS_AND_PODSCASTS_VALUE
	 * @generated
	 * @ordered
	 */
	TALK_SHOWS_AND_PODSCASTS(4, "TalkShowsAndPodscasts", "TalkShowsAndPodscasts");

	/**
	 * The '<em><b>Videogames</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEOGAMES
	 * @model name="Videogames"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEOGAMES_VALUE = 0;

	/**
	 * The '<em><b>Just Chatting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUST_CHATTING
	 * @model name="JustChatting"
	 * @generated
	 * @ordered
	 */
	public static final int JUST_CHATTING_VALUE = 1;

	/**
	 * The '<em><b>Esports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESPORTS
	 * @model name="Esports"
	 * @generated
	 * @ordered
	 */
	public static final int ESPORTS_VALUE = 2;

	/**
	 * The '<em><b>Sports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTS
	 * @model name="Sports"
	 * @generated
	 * @ordered
	 */
	public static final int SPORTS_VALUE = 3;

	/**
	 * The '<em><b>Talk Shows And Podscasts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TALK_SHOWS_AND_PODSCASTS
	 * @model name="TalkShowsAndPodscasts"
	 * @generated
	 * @ordered
	 */
	public static final int TALK_SHOWS_AND_PODSCASTS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[] {
			VIDEOGAMES,
			JUST_CHATTING,
			ESPORTS,
			SPORTS,
			TALK_SHOWS_AND_PODSCASTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value) {
		switch (value) {
			case VIDEOGAMES_VALUE: return VIDEOGAMES;
			case JUST_CHATTING_VALUE: return JUST_CHATTING;
			case ESPORTS_VALUE: return ESPORTS;
			case SPORTS_VALUE: return SPORTS;
			case TALK_SHOWS_AND_PODSCASTS_VALUE: return TALK_SHOWS_AND_PODSCASTS;
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
	private Category(int value, String name, String literal) {
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
	
} //Category
