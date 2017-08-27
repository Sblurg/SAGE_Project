/**
 */
package projetModele.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetModele.LotProduit;
import projetModele.Produit;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lot Produit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.LotProduitImpl#getProduits <em>Produits</em>}</li>
 *   <li>{@link projetModele.impl.LotProduitImpl#getCoutDeplacementLot <em>Cout Deplacement Lot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LotProduitImpl extends MinimalEObjectImpl.Container implements LotProduit {
	/**
	 * The cached value of the '{@link #getProduits() <em>Produits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduits()
	 * @generated
	 * @ordered
	 */
	protected EList<Produit> produits;

	/**
	 * The default value of the '{@link #getCoutDeplacementLot() <em>Cout Deplacement Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutDeplacementLot()
	 * @generated
	 * @ordered
	 */
	protected static final float COUT_DEPLACEMENT_LOT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoutDeplacementLot() <em>Cout Deplacement Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutDeplacementLot()
	 * @generated
	 * @ordered
	 */
	protected float coutDeplacementLot = COUT_DEPLACEMENT_LOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LotProduitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.LOT_PRODUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Produit> getProduits() {
		if (produits == null) {
			produits = new EObjectResolvingEList<Produit>(Produit.class, this, ProjetModelePackage.LOT_PRODUIT__PRODUITS);
		}
		return produits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoutDeplacementLot() {
		return coutDeplacementLot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoutDeplacementLot(float newCoutDeplacementLot) {
		float oldCoutDeplacementLot = coutDeplacementLot;
		coutDeplacementLot = newCoutDeplacementLot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.LOT_PRODUIT__COUT_DEPLACEMENT_LOT, oldCoutDeplacementLot, coutDeplacementLot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjetModelePackage.LOT_PRODUIT__PRODUITS:
				return getProduits();
			case ProjetModelePackage.LOT_PRODUIT__COUT_DEPLACEMENT_LOT:
				return getCoutDeplacementLot();
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
			case ProjetModelePackage.LOT_PRODUIT__PRODUITS:
				getProduits().clear();
				getProduits().addAll((Collection<? extends Produit>)newValue);
				return;
			case ProjetModelePackage.LOT_PRODUIT__COUT_DEPLACEMENT_LOT:
				setCoutDeplacementLot((Float)newValue);
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
			case ProjetModelePackage.LOT_PRODUIT__PRODUITS:
				getProduits().clear();
				return;
			case ProjetModelePackage.LOT_PRODUIT__COUT_DEPLACEMENT_LOT:
				setCoutDeplacementLot(COUT_DEPLACEMENT_LOT_EDEFAULT);
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
			case ProjetModelePackage.LOT_PRODUIT__PRODUITS:
				return produits != null && !produits.isEmpty();
			case ProjetModelePackage.LOT_PRODUIT__COUT_DEPLACEMENT_LOT:
				return coutDeplacementLot != COUT_DEPLACEMENT_LOT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (coutDeplacementLot: ");
		result.append(coutDeplacementLot);
		result.append(')');
		return result.toString();
	}

} //LotProduitImpl
