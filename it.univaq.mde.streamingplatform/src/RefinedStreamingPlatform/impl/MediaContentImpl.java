/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Category;
import RefinedStreamingPlatform.MediaContent;
import RefinedStreamingPlatform.Message;
import RefinedStreamingPlatform.Reaction;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.VideoQuality;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getMediaContentID <em>Media Content ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getViewCount <em>View Count</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getVideoQualities <em>Video Qualities</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MediaContentImpl#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MediaContentImpl extends TaggableImpl implements MediaContent {
	/**
	 * The default value of the '{@link #getMediaContentID() <em>Media Content ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaContentID()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDIA_CONTENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMediaContentID() <em>Media Content ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaContentID()
	 * @generated
	 * @ordered
	 */
	protected int mediaContentID = MEDIA_CONTENT_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getVideoQualities() <em>Video Qualities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoQuality> videoQualities;

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
		return RefinedStreamingPlatformPackage.Literals.MEDIA_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMediaContentID() {
		return mediaContentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaContentID(int newMediaContentID) {
		int oldMediaContentID = mediaContentID;
		mediaContentID = newMediaContentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID, oldMediaContentID, mediaContentID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT, oldViewCount, viewCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VideoQuality> getVideoQualities() {
		if (videoQualities == null) {
			videoQualities = new EDataTypeUniqueEList<VideoQuality>(VideoQuality.class, this, RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES);
		}
		return videoQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES);
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
			reactions = new EObjectContainmentEList<Reaction>(Reaction.class, this, RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS);
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
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID:
				return getMediaContentID();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				return getTitle();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				return getCategory();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				return getViewCount();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES:
				return getVideoQualities();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return getMessages();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID:
				setMediaContentID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				setViewCount((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES:
				getVideoQualities().clear();
				getVideoQualities().addAll((Collection<? extends VideoQuality>)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID:
				setMediaContentID(MEDIA_CONTENT_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				setViewCount(VIEW_COUNT_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES:
				getVideoQualities().clear();
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				getMessages().clear();
				return;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MEDIA_CONTENT_ID:
				return mediaContentID != MEDIA_CONTENT_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIEW_COUNT:
				return viewCount != VIEW_COUNT_EDEFAULT;
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__VIDEO_QUALITIES:
				return videoQualities != null && !videoQualities.isEmpty();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__MESSAGES:
				return messages != null && !messages.isEmpty();
			case RefinedStreamingPlatformPackage.MEDIA_CONTENT__REACTIONS:
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
		result.append(" (mediaContentID: ");
		result.append(mediaContentID);
		result.append(", title: ");
		result.append(title);
		result.append(", category: ");
		result.append(category);
		result.append(", viewCount: ");
		result.append(viewCount);
		result.append(", videoQualities: ");
		result.append(videoQualities);
		result.append(')');
		return result.toString();
	}

} //MediaContentImpl
