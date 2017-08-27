/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ModeleCoutProduit;
import projetModele.ModeleCoutProduitDAO;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modele Cout Produit DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModeleCoutProduitDAOImpl extends AbstractDAOImpl implements ModeleCoutProduitDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeleCoutProduitDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.MODELE_COUT_PRODUIT_DAO;
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjetModelePackage.MODELE_COUT_PRODUIT_DAO___MODELE_COUT_PRODUIT:
				return ModeleCoutProduit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModeleCoutProduitDAOImpl
