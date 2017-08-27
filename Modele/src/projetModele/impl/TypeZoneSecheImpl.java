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
import projetModele.ProjetModelePackage;
import projetModele.TypeZoneSeche;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Seche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.TypeZoneSecheImpl#getContrainteHumidite <em>Contrainte Humidite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeZoneSecheImpl extends TypeEquipementImpl implements TypeZoneSeche {
	/**
	 * The cached value of the '{@link #getContrainteHumidite() <em>Contrainte Humidite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainteHumidite()
	 * @generated
	 * @ordered
	 */
	protected ContrainteHumidite contrainteHumidite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneSecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_ZONE_SECHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumidite getContrainteHumidite() {
		if (contrainteHumidite != null && contrainteHumidite.eIsProxy()) {
			InternalEObject oldContrainteHumidite = (InternalEObject)contrainteHumidite;
			contrainteHumidite = (ContrainteHumidite)eResolveProxy(oldContrainteHumidite);
			if (contrainteHumidite != oldContrainteHumidite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE, oldContrainteHumidite, contrainteHumidite));
			}
		}
		return contrainteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumidite basicGetContrainteHumidite() {
		return contrainteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrainteHumidite(ContrainteHumidite newContrainteHumidite) {
		ContrainteHumidite oldContrainteHumidite = contrainteHumidite;
		contrainteHumidite = newContrainteHumidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE, oldContrainteHumidite, contrainteHumidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneSeche TypeZoneSeche() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneSeche TypeZoneSeche(ContrainteHumidite contr) {
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
			case ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE:
				if (resolve) return getContrainteHumidite();
				return basicGetContrainteHumidite();
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
			case ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE:
				setContrainteHumidite((ContrainteHumidite)newValue);
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
			case ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE:
				setContrainteHumidite((ContrainteHumidite)null);
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
			case ProjetModelePackage.TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE:
				return contrainteHumidite != null;
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
			case ProjetModelePackage.TYPE_ZONE_SECHE___TYPE_ZONE_SECHE:
				return TypeZoneSeche();
			case ProjetModelePackage.TYPE_ZONE_SECHE___TYPE_ZONE_SECHE__CONTRAINTEHUMIDITE:
				return TypeZoneSeche((ContrainteHumidite)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeZoneSecheImpl
