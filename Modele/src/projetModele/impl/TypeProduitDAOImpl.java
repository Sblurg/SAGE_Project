/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TypeProduitDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Produit DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeProduitDAOImpl extends AbstractDAOImpl implements TypeProduitDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeProduitDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_PRODUIT_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProduitDAO TypeProduitDAO() {
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
			case ProjetModelePackage.TYPE_PRODUIT_DAO___TYPE_PRODUIT_DAO:
				return TypeProduitDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeProduitDAOImpl
