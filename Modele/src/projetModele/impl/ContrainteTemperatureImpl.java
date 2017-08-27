/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projetModele.ContrainteTemperature;
import projetModele.LimiteTemperature;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ContrainteTemperatureImpl#getLimiteTemperature <em>Limite Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContrainteTemperatureImpl extends ContrainteStockageImpl implements ContrainteTemperature {
	/**
	 * The cached value of the '{@link #getLimiteTemperature() <em>Limite Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteTemperature()
	 * @generated
	 * @ordered
	 */
	protected LimiteTemperature limiteTemperature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContrainteTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.CONTRAINTE_TEMPERATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperature getLimiteTemperature() {
		if (limiteTemperature != null && limiteTemperature.eIsProxy()) {
			InternalEObject oldLimiteTemperature = (InternalEObject)limiteTemperature;
			limiteTemperature = (LimiteTemperature)eResolveProxy(oldLimiteTemperature);
			if (limiteTemperature != oldLimiteTemperature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE, oldLimiteTemperature, limiteTemperature));
			}
		}
		return limiteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperature basicGetLimiteTemperature() {
		return limiteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteTemperature(LimiteTemperature newLimiteTemperature) {
		LimiteTemperature oldLimiteTemperature = limiteTemperature;
		limiteTemperature = newLimiteTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE, oldLimiteTemperature, limiteTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperature ContrainteTemperature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperature ContrainteTemperature(LimiteTemperature lim) {
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
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE:
				if (resolve) return getLimiteTemperature();
				return basicGetLimiteTemperature();
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
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE:
				setLimiteTemperature((LimiteTemperature)newValue);
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
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE:
				setLimiteTemperature((LimiteTemperature)null);
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
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE:
				return limiteTemperature != null;
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
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE:
				return ContrainteTemperature();
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE__LIMITETEMPERATURE:
				return ContrainteTemperature((LimiteTemperature)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContrainteTemperatureImpl
