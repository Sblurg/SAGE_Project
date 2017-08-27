/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetModele.ModeleCoutProduit;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modele Cout Produit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ModeleCoutProduitImpl#getCoutStock <em>Cout Stock</em>}</li>
 *   <li>{@link projetModele.impl.ModeleCoutProduitImpl#getCoutDeStock <em>Cout De Stock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeleCoutProduitImpl extends MinimalEObjectImpl.Container implements ModeleCoutProduit {
	/**
	 * The default value of the '{@link #getCoutStock() <em>Cout Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutStock()
	 * @generated
	 * @ordered
	 */
	protected static final float COUT_STOCK_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoutStock() <em>Cout Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutStock()
	 * @generated
	 * @ordered
	 */
	protected float coutStock = COUT_STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoutDeStock() <em>Cout De Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutDeStock()
	 * @generated
	 * @ordered
	 */
	protected static final float COUT_DE_STOCK_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoutDeStock() <em>Cout De Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutDeStock()
	 * @generated
	 * @ordered
	 */
	protected float coutDeStock = COUT_DE_STOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeleCoutProduitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.MODELE_COUT_PRODUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoutStock() {
		return coutStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoutStock(float newCoutStock) {
		float oldCoutStock = coutStock;
		coutStock = newCoutStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_STOCK, oldCoutStock, coutStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoutDeStock() {
		return coutDeStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoutDeStock(float newCoutDeStock) {
		float oldCoutDeStock = coutDeStock;
		coutDeStock = newCoutDeStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_DE_STOCK, oldCoutDeStock, coutDeStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit ModeleCoutProduit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit ModeleCoutProduit(float coutStock, float coutDestock, float coutDepla) {
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
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_STOCK:
				return getCoutStock();
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_DE_STOCK:
				return getCoutDeStock();
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
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_STOCK:
				setCoutStock((Float)newValue);
				return;
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_DE_STOCK:
				setCoutDeStock((Float)newValue);
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
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_STOCK:
				setCoutStock(COUT_STOCK_EDEFAULT);
				return;
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_DE_STOCK:
				setCoutDeStock(COUT_DE_STOCK_EDEFAULT);
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
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_STOCK:
				return coutStock != COUT_STOCK_EDEFAULT;
			case ProjetModelePackage.MODELE_COUT_PRODUIT__COUT_DE_STOCK:
				return coutDeStock != COUT_DE_STOCK_EDEFAULT;
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
			case ProjetModelePackage.MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT:
				return ModeleCoutProduit();
			case ProjetModelePackage.MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT__FLOAT_FLOAT_FLOAT:
				return ModeleCoutProduit((Float)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2));
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
		result.append(" (coutStock: ");
		result.append(coutStock);
		result.append(", coutDeStock: ");
		result.append(coutDeStock);
		result.append(')');
		return result.toString();
	}

} //ModeleCoutProduitImpl
