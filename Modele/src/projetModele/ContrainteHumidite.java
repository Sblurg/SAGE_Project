/**
 */
package projetModele;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte Humidite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.ContrainteHumidite#getLimiteHumidite <em>Limite Humidite</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getContrainteHumidite()
 * @model
 * @generated
 */
public interface ContrainteHumidite extends ContrainteStockage {
	/**
	 * Returns the value of the '<em><b>Limite Humidite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Humidite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Humidite</em>' reference.
	 * @see #setLimiteHumidite(LimiteHumidite)
	 * @see projetModele.ProjetModelePackage#getContrainteHumidite_LimiteHumidite()
	 * @model required="true"
	 * @generated
	 */
	LimiteHumidite getLimiteHumidite();

	/**
	 * Sets the value of the '{@link projetModele.ContrainteHumidite#getLimiteHumidite <em>Limite Humidite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Humidite</em>' reference.
	 * @see #getLimiteHumidite()
	 * @generated
	 */
	void setLimiteHumidite(LimiteHumidite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteHumidite ContrainteHumidite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteHumidite ContrainteHumidite(LimiteHumidite lim);

} // ContrainteHumidite
