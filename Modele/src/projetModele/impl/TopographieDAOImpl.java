/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TopographieDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topographie DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TopographieDAOImpl extends AbstractDAOImpl implements TopographieDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopographieDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TOPOGRAPHIE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopographieDAO TopographieDAO() {
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
			case ProjetModelePackage.TOPOGRAPHIE_DAO___TOPOGRAPHIE_DAO:
				return TopographieDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TopographieDAOImpl
