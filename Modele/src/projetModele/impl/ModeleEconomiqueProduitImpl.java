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

import projetModele.ModeleCoutProduit;
import projetModele.ModeleEconomiqueProduit;
import projetModele.Produit;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modele Economique Produit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ModeleEconomiqueProduitImpl#getModeleCoutProduit <em>Modele Cout Produit</em>}</li>
 *   <li>{@link projetModele.impl.ModeleEconomiqueProduitImpl#getProduit <em>Produit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeleEconomiqueProduitImpl extends MinimalEObjectImpl.Container implements ModeleEconomiqueProduit {
	/**
	 * The cached value of the '{@link #getModeleCoutProduit() <em>Modele Cout Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeleCoutProduit()
	 * @generated
	 * @ordered
	 */
	protected ModeleCoutProduit modeleCoutProduit;

	/**
	 * The cached value of the '{@link #getProduit() <em>Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduit()
	 * @generated
	 * @ordered
	 */
	protected Produit produit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeleEconomiqueProduitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.MODELE_ECONOMIQUE_PRODUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit getModeleCoutProduit() {
		if (modeleCoutProduit != null && modeleCoutProduit.eIsProxy()) {
			InternalEObject oldModeleCoutProduit = (InternalEObject)modeleCoutProduit;
			modeleCoutProduit = (ModeleCoutProduit)eResolveProxy(oldModeleCoutProduit);
			if (modeleCoutProduit != oldModeleCoutProduit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT, oldModeleCoutProduit, modeleCoutProduit));
			}
		}
		return modeleCoutProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit basicGetModeleCoutProduit() {
		return modeleCoutProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeleCoutProduit(ModeleCoutProduit newModeleCoutProduit) {
		ModeleCoutProduit oldModeleCoutProduit = modeleCoutProduit;
		modeleCoutProduit = newModeleCoutProduit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT, oldModeleCoutProduit, modeleCoutProduit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produit getProduit() {
		if (produit != null && produit.eIsProxy()) {
			InternalEObject oldProduit = (InternalEObject)produit;
			produit = (Produit)eResolveProxy(oldProduit);
			if (produit != oldProduit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT, oldProduit, produit));
			}
		}
		return produit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produit basicGetProduit() {
		return produit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduit(Produit newProduit) {
		Produit oldProduit = produit;
		produit = newProduit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT, oldProduit, produit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleEconomiqueProduit ModeleEconomiqueProduit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleEconomiqueProduit ModeleEconomiqueProduit(ModeleCoutProduit modCout, Produit produit) {
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
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT:
				if (resolve) return getModeleCoutProduit();
				return basicGetModeleCoutProduit();
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT:
				if (resolve) return getProduit();
				return basicGetProduit();
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
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT:
				setModeleCoutProduit((ModeleCoutProduit)newValue);
				return;
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT:
				setProduit((Produit)newValue);
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
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT:
				setModeleCoutProduit((ModeleCoutProduit)null);
				return;
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT:
				setProduit((Produit)null);
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
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT:
				return modeleCoutProduit != null;
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT__PRODUIT:
				return produit != null;
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
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT:
				return ModeleEconomiqueProduit();
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT__MODELECOUTPRODUIT_PRODUIT:
				return ModeleEconomiqueProduit((ModeleCoutProduit)arguments.get(0), (Produit)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModeleEconomiqueProduitImpl
