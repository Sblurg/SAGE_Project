/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ModeleEconomiqueProduit;
import projetModele.ModeleEconomiqueProduitDAO;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modele Economique Produit DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModeleEconomiqueProduitDAOImpl extends AbstractDAOImpl implements ModeleEconomiqueProduitDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeleEconomiqueProduitDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.MODELE_ECONOMIQUE_PRODUIT_DAO;
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT_DAO___MODELE_ECONOMIQUE_PRODUIT:
				return ModeleEconomiqueProduit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModeleEconomiqueProduitDAOImpl
