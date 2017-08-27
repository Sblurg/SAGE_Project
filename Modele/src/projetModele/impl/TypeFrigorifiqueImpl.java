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
import projetModele.ProjetModelePackage;
import projetModele.TypeFrigorifique;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Frigorifique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.TypeFrigorifiqueImpl#getContrainteTemperature <em>Contrainte Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeFrigorifiqueImpl extends TypeEquipementImpl implements TypeFrigorifique {
	/**
	 * The cached value of the '{@link #getContrainteTemperature() <em>Contrainte Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainteTemperature()
	 * @generated
	 * @ordered
	 */
	protected ContrainteTemperature contrainteTemperature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFrigorifiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_FRIGORIFIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperature getContrainteTemperature() {
		if (contrainteTemperature != null && contrainteTemperature.eIsProxy()) {
			InternalEObject oldContrainteTemperature = (InternalEObject)contrainteTemperature;
			contrainteTemperature = (ContrainteTemperature)eResolveProxy(oldContrainteTemperature);
			if (contrainteTemperature != oldContrainteTemperature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE, oldContrainteTemperature, contrainteTemperature));
			}
		}
		return contrainteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperature basicGetContrainteTemperature() {
		return contrainteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrainteTemperature(ContrainteTemperature newContrainteTemperature) {
		ContrainteTemperature oldContrainteTemperature = contrainteTemperature;
		contrainteTemperature = newContrainteTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE, oldContrainteTemperature, contrainteTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrigorifique TypeFrigorifique() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrigorifique TypeFrigorifique(ContrainteTemperature contr) {
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE:
				if (resolve) return getContrainteTemperature();
				return basicGetContrainteTemperature();
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE:
				setContrainteTemperature((ContrainteTemperature)newValue);
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE:
				setContrainteTemperature((ContrainteTemperature)null);
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE:
				return contrainteTemperature != null;
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE:
				return TypeFrigorifique();
			case ProjetModelePackage.TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE__CONTRAINTETEMPERATURE:
				return TypeFrigorifique((ContrainteTemperature)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeFrigorifiqueImpl
