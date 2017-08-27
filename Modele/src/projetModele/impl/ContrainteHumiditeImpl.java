/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projetModele.ContrainteHumidite;
import projetModele.LimiteHumidite;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte Humidite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ContrainteHumiditeImpl#getLimiteHumidite <em>Limite Humidite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContrainteHumiditeImpl extends ContrainteStockageImpl implements ContrainteHumidite {
	/**
	 * The cached value of the '{@link #getLimiteHumidite() <em>Limite Humidite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteHumidite()
	 * @generated
	 * @ordered
	 */
	protected LimiteHumidite limiteHumidite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContrainteHumiditeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.CONTRAINTE_HUMIDITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumidite getLimiteHumidite() {
		if (limiteHumidite != null && limiteHumidite.eIsProxy()) {
			InternalEObject oldLimiteHumidite = (InternalEObject)limiteHumidite;
			limiteHumidite = (LimiteHumidite)eResolveProxy(oldLimiteHumidite);
			if (limiteHumidite != oldLimiteHumidite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE, oldLimiteHumidite, limiteHumidite));
			}
		}
		return limiteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumidite basicGetLimiteHumidite() {
		return limiteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteHumidite(LimiteHumidite newLimiteHumidite) {
		LimiteHumidite oldLimiteHumidite = limiteHumidite;
		limiteHumidite = newLimiteHumidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE, oldLimiteHumidite, limiteHumidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumidite ContrainteHumidite() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumidite ContrainteHumidite(LimiteHumidite lim) {
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE:
				if (resolve) return getLimiteHumidite();
				return basicGetLimiteHumidite();
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE:
				setLimiteHumidite((LimiteHumidite)newValue);
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE:
				setLimiteHumidite((LimiteHumidite)null);
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE:
				return limiteHumidite != null;
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE:
				return ContrainteHumidite();
			case ProjetModelePackage.CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE__LIMITEHUMIDITE:
				return ContrainteHumidite((LimiteHumidite)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContrainteHumiditeImpl
