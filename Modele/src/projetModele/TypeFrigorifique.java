/**
 */
package projetModele;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Frigorifique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.TypeFrigorifique#getContrainteTemperature <em>Contrainte Temperature</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getTypeFrigorifique()
 * @model
 * @generated
 */
public interface TypeFrigorifique extends TypeEquipement {
	/**
	 * Returns the value of the '<em><b>Contrainte Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrainte Temperature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte Temperature</em>' reference.
	 * @see #setContrainteTemperature(ContrainteTemperature)
	 * @see projetModele.ProjetModelePackage#getTypeFrigorifique_ContrainteTemperature()
	 * @model required="true"
	 * @generated
	 */
	ContrainteTemperature getContrainteTemperature();

	/**
	 * Sets the value of the '{@link projetModele.TypeFrigorifique#getContrainteTemperature <em>Contrainte Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrainte Temperature</em>' reference.
	 * @see #getContrainteTemperature()
	 * @generated
	 */
	void setContrainteTemperature(ContrainteTemperature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeFrigorifique TypeFrigorifique();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeFrigorifique TypeFrigorifique(ContrainteTemperature contr);

} // TypeFrigorifique
