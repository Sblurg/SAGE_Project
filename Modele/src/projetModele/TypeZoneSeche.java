/**
 */
package projetModele;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Seche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.TypeZoneSeche#getContrainteHumidite <em>Contrainte Humidite</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getTypeZoneSeche()
 * @model
 * @generated
 */
public interface TypeZoneSeche extends TypeEquipement {
	/**
	 * Returns the value of the '<em><b>Contrainte Humidite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrainte Humidite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte Humidite</em>' reference.
	 * @see #setContrainteHumidite(ContrainteHumidite)
	 * @see projetModele.ProjetModelePackage#getTypeZoneSeche_ContrainteHumidite()
	 * @model required="true"
	 * @generated
	 */
	ContrainteHumidite getContrainteHumidite();

	/**
	 * Sets the value of the '{@link projetModele.TypeZoneSeche#getContrainteHumidite <em>Contrainte Humidite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrainte Humidite</em>' reference.
	 * @see #getContrainteHumidite()
	 * @generated
	 */
	void setContrainteHumidite(ContrainteHumidite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeZoneSeche TypeZoneSeche();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeZoneSeche TypeZoneSeche(ContrainteHumidite contr);

} // TypeZoneSeche
