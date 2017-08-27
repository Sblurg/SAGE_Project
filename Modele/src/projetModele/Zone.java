/**
 */
package projetModele;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.Zone#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.Zone#getOpeEntrepots <em>Ope Entrepots</em>}</li>
 *   <li>{@link projetModele.Zone#getPositions <em>Positions</em>}</li>
 *   <li>{@link projetModele.Zone#getEquipementStockages <em>Equipement Stockages</em>}</li>
 *   <li>{@link projetModele.Zone#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
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
	 * @see projetModele.ProjetModelePackage#getZone_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetModele.Zone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ope Entrepots</b></em>' reference list.
	 * The list contents are of type {@link projetModele.OperateurEntrepot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ope Entrepots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ope Entrepots</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getZone_OpeEntrepots()
	 * @model
	 * @generated
	 */
	EList<OperateurEntrepot> getOpeEntrepots();

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' reference list.
	 * The list contents are of type {@link projetModele.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getZone_Positions()
	 * @model
	 * @generated
	 */
	EList<Position> getPositions();

	/**
	 * Returns the value of the '<em><b>Equipement Stockages</b></em>' reference list.
	 * The list contents are of type {@link projetModele.EquipementStockage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipement Stockages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipement Stockages</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getZone_EquipementStockages()
	 * @model
	 * @generated
	 */
	EList<EquipementStockage> getEquipementStockages();

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
	 * @see projetModele.ProjetModelePackage#getZone_Zones()
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
	Zone Zone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model posMany="true" equipMany="true" zonesMany="true"
	 * @generated
	 */
	Zone Zones(String name, EList<Position> pos, EList<EquipementStockage> equip, EList<Zone> zones);

} // Zone
