/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetModele.LimiteHumidite;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limite Humidite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.LimiteHumiditeImpl#getHumiMin <em>Humi Min</em>}</li>
 *   <li>{@link projetModele.impl.LimiteHumiditeImpl#getHumiMax <em>Humi Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimiteHumiditeImpl extends MinimalEObjectImpl.Container implements LimiteHumidite {
	/**
	 * The default value of the '{@link #getHumiMin() <em>Humi Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumiMin()
	 * @generated
	 * @ordered
	 */
	protected static final float HUMI_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHumiMin() <em>Humi Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumiMin()
	 * @generated
	 * @ordered
	 */
	protected float humiMin = HUMI_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumiMax() <em>Humi Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumiMax()
	 * @generated
	 * @ordered
	 */
	protected static final float HUMI_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHumiMax() <em>Humi Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumiMax()
	 * @generated
	 * @ordered
	 */
	protected float humiMax = HUMI_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimiteHumiditeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.LIMITE_HUMIDITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHumiMin() {
		return humiMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumiMin(float newHumiMin) {
		float oldHumiMin = humiMin;
		humiMin = newHumiMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MIN, oldHumiMin, humiMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHumiMax() {
		return humiMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumiMax(float newHumiMax) {
		float oldHumiMax = humiMax;
		humiMax = newHumiMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MAX, oldHumiMax, humiMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumidite LimiteHumidite() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumidite LimiteHumidite(float humiMin, float humiMax) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MIN:
				return getHumiMin();
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MAX:
				return getHumiMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MIN:
				setHumiMin((Float)newValue);
				return;
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MAX:
				setHumiMax((Float)newValue);
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
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MIN:
				setHumiMin(HUMI_MIN_EDEFAULT);
				return;
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MAX:
				setHumiMax(HUMI_MAX_EDEFAULT);
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
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MIN:
				return humiMin != HUMI_MIN_EDEFAULT;
			case ProjetModelePackage.LIMITE_HUMIDITE__HUMI_MAX:
				return humiMax != HUMI_MAX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjetModelePackage.LIMITE_HUMIDITE___LIMITE_HUMIDITE:
				return LimiteHumidite();
			case ProjetModelePackage.LIMITE_HUMIDITE___LIMITE_HUMIDITE__FLOAT_FLOAT:
				return LimiteHumidite((Float)arguments.get(0), (Float)arguments.get(1));
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (humiMin: ");
		result.append(humiMin);
		result.append(", humiMax: ");
		result.append(humiMax);
		result.append(')');
		return result.toString();
	}

} //LimiteHumiditeImpl
