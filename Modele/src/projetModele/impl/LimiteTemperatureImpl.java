/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetModele.LimiteTemperature;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limite Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.LimiteTemperatureImpl#getTemperatureMin <em>Temperature Min</em>}</li>
 *   <li>{@link projetModele.impl.LimiteTemperatureImpl#getTemperatureMax <em>Temperature Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimiteTemperatureImpl extends MinimalEObjectImpl.Container implements LimiteTemperature {
	/**
	 * The default value of the '{@link #getTemperatureMin() <em>Temperature Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureMin()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperatureMin() <em>Temperature Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureMin()
	 * @generated
	 * @ordered
	 */
	protected float temperatureMin = TEMPERATURE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureMax() <em>Temperature Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureMax()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperatureMax() <em>Temperature Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureMax()
	 * @generated
	 * @ordered
	 */
	protected float temperatureMax = TEMPERATURE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimiteTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.LIMITE_TEMPERATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTemperatureMin() {
		return temperatureMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureMin(float newTemperatureMin) {
		float oldTemperatureMin = temperatureMin;
		temperatureMin = newTemperatureMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MIN, oldTemperatureMin, temperatureMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTemperatureMax() {
		return temperatureMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureMax(float newTemperatureMax) {
		float oldTemperatureMax = temperatureMax;
		temperatureMax = newTemperatureMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MAX, oldTemperatureMax, temperatureMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperature LimiteTemperature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperature LimiteTemperature(float tempMin, float tempMax) {
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
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MIN:
				return getTemperatureMin();
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MAX:
				return getTemperatureMax();
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
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MIN:
				setTemperatureMin((Float)newValue);
				return;
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MAX:
				setTemperatureMax((Float)newValue);
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
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MIN:
				setTemperatureMin(TEMPERATURE_MIN_EDEFAULT);
				return;
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MAX:
				setTemperatureMax(TEMPERATURE_MAX_EDEFAULT);
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
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MIN:
				return temperatureMin != TEMPERATURE_MIN_EDEFAULT;
			case ProjetModelePackage.LIMITE_TEMPERATURE__TEMPERATURE_MAX:
				return temperatureMax != TEMPERATURE_MAX_EDEFAULT;
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
			case ProjetModelePackage.LIMITE_TEMPERATURE___LIMITE_TEMPERATURE:
				return LimiteTemperature();
			case ProjetModelePackage.LIMITE_TEMPERATURE___LIMITE_TEMPERATURE__FLOAT_FLOAT:
				return LimiteTemperature((Float)arguments.get(0), (Float)arguments.get(1));
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
		result.append(" (temperatureMin: ");
		result.append(temperatureMin);
		result.append(", temperatureMax: ");
		result.append(temperatureMax);
		result.append(')');
		return result.toString();
	}

} //LimiteTemperatureImpl
