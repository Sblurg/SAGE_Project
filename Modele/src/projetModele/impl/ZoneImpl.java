/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetModele.EquipementStockage;
import projetModele.OperateurEntrepot;
import projetModele.Position;
import projetModele.ProjetModelePackage;
import projetModele.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ZoneImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.impl.ZoneImpl#getOpeEntrepots <em>Ope Entrepots</em>}</li>
 *   <li>{@link projetModele.impl.ZoneImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link projetModele.impl.ZoneImpl#getEquipementStockages <em>Equipement Stockages</em>}</li>
 *   <li>{@link projetModele.impl.ZoneImpl#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends MinimalEObjectImpl.Container implements Zone {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpeEntrepots() <em>Ope Entrepots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeEntrepots()
	 * @generated
	 * @ordered
	 */
	protected EList<OperateurEntrepot> opeEntrepots;

	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> positions;

	/**
	 * The cached value of the '{@link #getEquipementStockages() <em>Equipement Stockages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipementStockages()
	 * @generated
	 * @ordered
	 */
	protected EList<EquipementStockage> equipementStockages;

	/**
	 * The cached value of the '{@link #getZones() <em>Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.ZONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperateurEntrepot> getOpeEntrepots() {
		if (opeEntrepots == null) {
			opeEntrepots = new EObjectResolvingEList<OperateurEntrepot>(OperateurEntrepot.class, this, ProjetModelePackage.ZONE__OPE_ENTREPOTS);
		}
		return opeEntrepots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPositions() {
		if (positions == null) {
			positions = new EObjectResolvingEList<Position>(Position.class, this, ProjetModelePackage.ZONE__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipementStockage> getEquipementStockages() {
		if (equipementStockages == null) {
			equipementStockages = new EObjectResolvingEList<EquipementStockage>(EquipementStockage.class, this, ProjetModelePackage.ZONE__EQUIPEMENT_STOCKAGES);
		}
		return equipementStockages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZones() {
		if (zones == null) {
			zones = new EObjectResolvingEList<Zone>(Zone.class, this, ProjetModelePackage.ZONE__ZONES);
		}
		return zones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone Zone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone Zones(String name, EList<Position> pos, EList<EquipementStockage> equip, EList<Zone> zones) {
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
			case ProjetModelePackage.ZONE__NAME:
				return getName();
			case ProjetModelePackage.ZONE__OPE_ENTREPOTS:
				return getOpeEntrepots();
			case ProjetModelePackage.ZONE__POSITIONS:
				return getPositions();
			case ProjetModelePackage.ZONE__EQUIPEMENT_STOCKAGES:
				return getEquipementStockages();
			case ProjetModelePackage.ZONE__ZONES:
				return getZones();
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
			case ProjetModelePackage.ZONE__NAME:
				setName((String)newValue);
				return;
			case ProjetModelePackage.ZONE__OPE_ENTREPOTS:
				getOpeEntrepots().clear();
				getOpeEntrepots().addAll((Collection<? extends OperateurEntrepot>)newValue);
				return;
			case ProjetModelePackage.ZONE__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Position>)newValue);
				return;
			case ProjetModelePackage.ZONE__EQUIPEMENT_STOCKAGES:
				getEquipementStockages().clear();
				getEquipementStockages().addAll((Collection<? extends EquipementStockage>)newValue);
				return;
			case ProjetModelePackage.ZONE__ZONES:
				getZones().clear();
				getZones().addAll((Collection<? extends Zone>)newValue);
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
			case ProjetModelePackage.ZONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjetModelePackage.ZONE__OPE_ENTREPOTS:
				getOpeEntrepots().clear();
				return;
			case ProjetModelePackage.ZONE__POSITIONS:
				getPositions().clear();
				return;
			case ProjetModelePackage.ZONE__EQUIPEMENT_STOCKAGES:
				getEquipementStockages().clear();
				return;
			case ProjetModelePackage.ZONE__ZONES:
				getZones().clear();
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
			case ProjetModelePackage.ZONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjetModelePackage.ZONE__OPE_ENTREPOTS:
				return opeEntrepots != null && !opeEntrepots.isEmpty();
			case ProjetModelePackage.ZONE__POSITIONS:
				return positions != null && !positions.isEmpty();
			case ProjetModelePackage.ZONE__EQUIPEMENT_STOCKAGES:
				return equipementStockages != null && !equipementStockages.isEmpty();
			case ProjetModelePackage.ZONE__ZONES:
				return zones != null && !zones.isEmpty();
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
			case ProjetModelePackage.ZONE___ZONE:
				return Zone();
			case ProjetModelePackage.ZONE___ZONES__STRING_ELIST_ELIST_ELIST:
				return Zones((String)arguments.get(0), (EList<Position>)arguments.get(1), (EList<EquipementStockage>)arguments.get(2), (EList<Zone>)arguments.get(3));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ZoneImpl
