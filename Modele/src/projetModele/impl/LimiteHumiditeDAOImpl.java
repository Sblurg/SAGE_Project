/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.LimiteHumiditeDAO;
import projetModele.ProjetModelePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limite Humidite DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LimiteHumiditeDAOImpl extends AbstractDAOImpl implements LimiteHumiditeDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimiteHumiditeDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.LIMITE_HUMIDITE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumiditeDAO LimiteHumiditeDAO() {
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
			case ProjetModelePackage.LIMITE_HUMIDITE_DAO___LIMITE_HUMIDITE_DAO:
				return LimiteHumiditeDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LimiteHumiditeDAOImpl
