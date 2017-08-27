/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TypeEquipementDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Equipement DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeEquipementDAOImpl extends AbstractDAOImpl implements TypeEquipementDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEquipementDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_EQUIPEMENT_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEquipementDAO TypeEquipementDAO() {
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
			case ProjetModelePackage.TYPE_EQUIPEMENT_DAO___TYPE_EQUIPEMENT_DAO:
				return TypeEquipementDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeEquipementDAOImpl
