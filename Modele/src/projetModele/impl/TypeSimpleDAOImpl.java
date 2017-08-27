/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TypeSimpleDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Simple DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeSimpleDAOImpl extends AbstractDAOImpl implements TypeSimpleDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSimpleDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_SIMPLE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleDAO TypeSimpleDAO() {
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
			case ProjetModelePackage.TYPE_SIMPLE_DAO___TYPE_SIMPLE_DAO:
				return TypeSimpleDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeSimpleDAOImpl
