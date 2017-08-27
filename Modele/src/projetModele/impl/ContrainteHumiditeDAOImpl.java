/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ContrainteHumiditeDAO;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrainte Humidite DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContrainteHumiditeDAOImpl extends AbstractDAOImpl implements ContrainteHumiditeDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContrainteHumiditeDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.CONTRAINTE_HUMIDITE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumiditeDAO ContrainteHumiditeDAO() {
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
			case ProjetModelePackage.CONTRAINTE_HUMIDITE_DAO___CONTRAINTE_HUMIDITE_DAO:
				return ContrainteHumiditeDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContrainteHumiditeDAOImpl
