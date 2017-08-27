/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetModele.Dimension;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.DimensionImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link projetModele.impl.DimensionImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link projetModele.impl.DimensionImpl#getProfondeur <em>Profondeur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The default value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected static final float HAUTEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected float hauteur = HAUTEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected static final float LARGEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected float largeur = LARGEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfondeur() <em>Profondeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeur()
	 * @generated
	 * @ordered
	 */
	protected static final float PROFONDEUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProfondeur() <em>Profondeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeur()
	 * @generated
	 * @ordered
	 */
	protected float profondeur = PROFONDEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteur(float newHauteur) {
		float oldHauteur = hauteur;
		hauteur = newHauteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.DIMENSION__HAUTEUR, oldHauteur, hauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(float newLargeur) {
		float oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.DIMENSION__LARGEUR, oldLargeur, largeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProfondeur() {
		return profondeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeur(float newProfondeur) {
		float oldProfondeur = profondeur;
		profondeur = newProfondeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.DIMENSION__PROFONDEUR, oldProfondeur, profondeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension Dimension() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension Dimension(float haut, float larg, float prof) {
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
			case ProjetModelePackage.DIMENSION__HAUTEUR:
				return getHauteur();
			case ProjetModelePackage.DIMENSION__LARGEUR:
				return getLargeur();
			case ProjetModelePackage.DIMENSION__PROFONDEUR:
				return getProfondeur();
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
			case ProjetModelePackage.DIMENSION__HAUTEUR:
				setHauteur((Float)newValue);
				return;
			case ProjetModelePackage.DIMENSION__LARGEUR:
				setLargeur((Float)newValue);
				return;
			case ProjetModelePackage.DIMENSION__PROFONDEUR:
				setProfondeur((Float)newValue);
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
			case ProjetModelePackage.DIMENSION__HAUTEUR:
				setHauteur(HAUTEUR_EDEFAULT);
				return;
			case ProjetModelePackage.DIMENSION__LARGEUR:
				setLargeur(LARGEUR_EDEFAULT);
				return;
			case ProjetModelePackage.DIMENSION__PROFONDEUR:
				setProfondeur(PROFONDEUR_EDEFAULT);
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
			case ProjetModelePackage.DIMENSION__HAUTEUR:
				return hauteur != HAUTEUR_EDEFAULT;
			case ProjetModelePackage.DIMENSION__LARGEUR:
				return largeur != LARGEUR_EDEFAULT;
			case ProjetModelePackage.DIMENSION__PROFONDEUR:
				return profondeur != PROFONDEUR_EDEFAULT;
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
			case ProjetModelePackage.DIMENSION___DIMENSION:
				return Dimension();
			case ProjetModelePackage.DIMENSION___DIMENSION__FLOAT_FLOAT_FLOAT:
				return Dimension((Float)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
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
		result.append(" (hauteur: ");
		result.append(hauteur);
		result.append(", largeur: ");
		result.append(largeur);
		result.append(", profondeur: ");
		result.append(profondeur);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
