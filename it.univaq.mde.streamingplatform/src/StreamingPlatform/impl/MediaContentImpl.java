/**
 */
package StreamingPlatform.impl;

import StreamingPlatform.Category;
import StreamingPlatform.MediaContent;
import StreamingPlatform.Message;
import StreamingPlatform.Reaction;
import StreamingPlatform.Resolution;
import StreamingPlatform.StreamingPlatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getViewCount <em>View Count</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getResolutions <em>Resolutions</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link StreamingPlatform.impl.MediaContentImpl#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MediaContentImpl extends MinimalEObjectImpl.Container implements MediaContent {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category CATEGORY_EDEFAULT = Category.VIDEOGAMES;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewCount()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewCount()
	 * @generated
	 * @ordered
	 */
	protected int viewCount = VIEW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolutions() <em>Resolutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resolution> resolutions;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reaction> reactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingPlatformPackage.Literals.MEDIA_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MEDIA_CONTENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MEDIA_CONTENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, StreamingPlatformPackage.MEDIA_CONTENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewCount(int newViewCount) {
		int oldViewCount = viewCount;
		viewCount = newViewCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT, oldViewCount, viewCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingPlatformPackage.MEDIA_CONTENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resolution> getResolutions() {
		if (resolutions == null) {
			resolutions = new EDataTypeUniqueEList<Resolution>(Resolution.class, this, StreamingPlatformPackage.MEDIA_CONTENT__RESOLUTIONS);
		}
		return resolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<Reaction>(Reaction.class, this, StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				return getTitle();
			case StreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				return getCategory();
			case StreamingPlatformPackage.MEDIA_CONTENT__TAGS:
				return getTags();
			case StreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				return getViewCount();
			case StreamingPlatformPackage.MEDIA_CONTENT__DESCRIPTION:
				return getDescription();
			case StreamingPlatformPackage.MEDIA_CONTENT__RESOLUTIONS:
				return getResolutions();
			case StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return getMessages();
			case StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
				return getReactions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				setViewCount((Integer)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__RESOLUTIONS:
				getResolutions().clear();
				getResolutions().addAll((Collection<? extends Resolution>)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends Reaction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__TAGS:
				getTags().clear();
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				setViewCount(VIEW_COUNT_EDEFAULT);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__RESOLUTIONS:
				getResolutions().clear();
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				getMessages().clear();
				return;
			case StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
				getReactions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case StreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case StreamingPlatformPackage.MEDIA_CONTENT__TAGS:
				return tags != null && !tags.isEmpty();
			case StreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				return viewCount != VIEW_COUNT_EDEFAULT;
			case StreamingPlatformPackage.MEDIA_CONTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StreamingPlatformPackage.MEDIA_CONTENT__RESOLUTIONS:
				return resolutions != null && !resolutions.isEmpty();
			case StreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return messages != null && !messages.isEmpty();
			case StreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
				return reactions != null && !reactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", category: ");
		result.append(category);
		result.append(", tags: ");
		result.append(tags);
		result.append(", viewCount: ");
		result.append(viewCount);
		result.append(", description: ");
		result.append(description);
		result.append(", resolutions: ");
		result.append(resolutions);
		result.append(')');
		return result.toString();
	}

} //MediaContentImpl
