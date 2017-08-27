/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import projetModele.ProjetModelePackage;
import projetModele.TypeZoneSecheDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Seche DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeZoneSecheDAOImpl extends AbstractDAOImpl implements TypeZoneSecheDAO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneSecheDAOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.TYPE_ZONE_SECHE_DAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneSecheDAO TypeZoneSecheDAO() {
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
			case ProjetModelePackage.TYPE_ZONE_SECHE_DAO___TYPE_ZONE_SECHE_DAO:
				return TypeZoneSecheDAO();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeZoneSecheDAOImpl
