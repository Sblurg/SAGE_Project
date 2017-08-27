/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TypeFrigorifiqueDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Frigorifique DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeFrigorifiqueDAOImpl extends AbstractDAOImpl implements TypeFrigorifiqueDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFrigorifiqueDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_FRIGORIFIQUE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrigorifiqueDAO TypeFrigorifiqueDAO() {
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
			case ProjetModelePackage.TYPE_FRIGORIFIQUE_DAO___TYPE_FRIGORIFIQUE_DAO:
				return TypeFrigorifiqueDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeFrigorifiqueDAOImpl
