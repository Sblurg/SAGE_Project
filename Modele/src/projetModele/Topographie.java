/**
 */
package projetModele;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topographie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.Topographie#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.Topographie#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getTopographie()
 * @model
 * @generated
 */
public interface Topographie extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetModele.ProjetModelePackage#getTopographie_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetModele.Topographie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Zones</b></em>' reference list.
	 * The list contents are of type {@link projetModele.Zone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getTopographie_Zones()
	 * @model
	 * @generated
	 */
	EList<Zone> getZones();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Topographie Topographie();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model zonesMany="true"
	 * @generated
	 */
	Topographie Topographie(String name, EList<Zone> zones);

} // Topographie
