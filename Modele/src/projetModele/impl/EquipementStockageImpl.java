/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetModele.Dimension;
import projetModele.EquipementStockage;
import projetModele.Position;
import projetModele.ProjetModelePackage;
import projetModele.TypeEquipement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipement Stockage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.EquipementStockageImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link projetModele.impl.EquipementStockageImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link projetModele.impl.EquipementStockageImpl#getType <em>Type</em>}</li>
 *   <li>{@link projetModele.impl.EquipementStockageImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.impl.EquipementStockageImpl#isOccupe <em>Occupe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipementStockageImpl extends MinimalEObjectImpl.Container implements EquipementStockage {
	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeEquipement type;

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
	 * The default value of the '{@link #isOccupe() <em>Occupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OCCUPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccupe() <em>Occupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupe()
	 * @generated
	 * @ordered
	 */
	protected boolean occupe = OCCUPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipementStockageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.EQUIPEMENT_STOCKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (Dimension)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (Position)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEquipement getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeEquipement)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEquipement basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeEquipement newType) {
		TypeEquipement oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.EQUIPEMENT_STOCKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOccupe() {
		return occupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupe(boolean newOccupe) {
		boolean oldOccupe = occupe;
		occupe = newOccupe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.EQUIPEMENT_STOCKAGE__OCCUPE, oldOccupe, occupe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipementStockage EquipementStockage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipementStockage EquipementStockage(String name, Dimension dim, Position pos, TypeEquipement type) {
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
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__NAME:
				return getName();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__OCCUPE:
				return isOccupe();
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
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION:
				setPosition((Position)newValue);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE:
				setType((TypeEquipement)newValue);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__NAME:
				setName((String)newValue);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__OCCUPE:
				setOccupe((Boolean)newValue);
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
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION:
				setDimension((Dimension)null);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION:
				setPosition((Position)null);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE:
				setType((TypeEquipement)null);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__OCCUPE:
				setOccupe(OCCUPE_EDEFAULT);
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
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__DIMENSION:
				return dimension != null;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__POSITION:
				return position != null;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__TYPE:
				return type != null;
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE__OCCUPE:
				return occupe != OCCUPE_EDEFAULT;
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
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE:
				return EquipementStockage();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE__STRING_DIMENSION_POSITION_TYPEEQUIPEMENT:
				return EquipementStockage((String)arguments.get(0), (Dimension)arguments.get(1), (Position)arguments.get(2), (TypeEquipement)arguments.get(3));
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
		result.append(", occupe: ");
		result.append(occupe);
		result.append(')');
		return result.toString();
	}

} //EquipementStockageImpl
