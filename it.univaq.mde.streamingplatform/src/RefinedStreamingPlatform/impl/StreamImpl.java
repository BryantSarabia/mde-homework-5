/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;
import RefinedStreamingPlatform.Stream;
import RefinedStreamingPlatform.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.StreamImpl#isIsLive <em>Is Live</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.StreamImpl#getViewers <em>Viewers</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.StreamImpl#getActiveViewers <em>Active Viewers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamImpl extends MediaContentImpl implements Stream {
	/**
	 * The default value of the '{@link #isIsLive() <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLive() <em>Is Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLive()
	 * @generated
	 * @ordered
	 */
	protected boolean isLive = IS_LIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewers() <em>Viewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> viewers;

	/**
	 * The default value of the '{@link #getActiveViewers() <em>Active Viewers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveViewers()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_VIEWERS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.STREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLive() {
		return isLive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLive(boolean newIsLive) {
		boolean oldIsLive = isLive;
		isLive = newIsLive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.STREAM__IS_LIVE, oldIsLive, isLive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getViewers() {
		if (viewers == null) {
			viewers = new EObjectResolvingEList<User>(User.class, this, RefinedStreamingPlatformPackage.STREAM__VIEWERS);
		}
		return viewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getActiveViewers() {
		/**
		 * viewers->select(v | v.isOnline = true)->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<User> viewers = this.getViewers();
		final /*@NonInvalid*/ OrderedSetValue BOXED_viewers = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_User, viewers);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RefinedStreamingPlatformTables.ORD_CLSSid_User);
		Iterator<Object> ITERATOR_v = BOXED_viewers.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_v.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ User v = (User)ITERATOR_v.next();
			/**
			 * v.isOnline
			 */
			final /*@NonInvalid*/ boolean isOnline = v.isIsOnline();
			//
			if (isOnline) {
				accumulator.add(v);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveViewers(int newActiveViewers) {
		// TODO: implement this method to set the 'Active Viewers' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean liveCondition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Stream::liveCondition";
		try {
			/**
			 *
			 * inv liveCondition:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = isLive = true implies viewers->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformPackage.Literals.STREAM___LIVE_CONDITION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RefinedStreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ boolean isLive = this.isIsLive();
				final /*@NonInvalid*/ Boolean result;
				if (!isLive) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<User> viewers = this.getViewers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_viewers = idResolver.createOrderedSetOfAll(RefinedStreamingPlatformTables.ORD_CLSSid_User, viewers);
					final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_viewers).booleanValue();
					if (notEmpty) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RefinedStreamingPlatformTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.STREAM__IS_LIVE:
				return isIsLive();
			case RefinedStreamingPlatformPackage.STREAM__VIEWERS:
				return getViewers();
			case RefinedStreamingPlatformPackage.STREAM__ACTIVE_VIEWERS:
				return getActiveViewers();
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
			case RefinedStreamingPlatformPackage.STREAM__IS_LIVE:
				setIsLive((Boolean)newValue);
				return;
			case RefinedStreamingPlatformPackage.STREAM__VIEWERS:
				getViewers().clear();
				getViewers().addAll((Collection<? extends User>)newValue);
				return;
			case RefinedStreamingPlatformPackage.STREAM__ACTIVE_VIEWERS:
				setActiveViewers((Integer)newValue);
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
			case RefinedStreamingPlatformPackage.STREAM__IS_LIVE:
				setIsLive(IS_LIVE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.STREAM__VIEWERS:
				getViewers().clear();
				return;
			case RefinedStreamingPlatformPackage.STREAM__ACTIVE_VIEWERS:
				setActiveViewers(ACTIVE_VIEWERS_EDEFAULT);
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
			case RefinedStreamingPlatformPackage.STREAM__IS_LIVE:
				return isLive != IS_LIVE_EDEFAULT;
			case RefinedStreamingPlatformPackage.STREAM__VIEWERS:
				return viewers != null && !viewers.isEmpty();
			case RefinedStreamingPlatformPackage.STREAM__ACTIVE_VIEWERS:
				return getActiveViewers() != ACTIVE_VIEWERS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RefinedStreamingPlatformPackage.STREAM___LIVE_CONDITION__DIAGNOSTICCHAIN_MAP:
				return liveCondition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isLive: ");
		result.append(isLive);
		result.append(')');
		return result.toString();
	}

} //StreamImpl
