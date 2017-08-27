/**
 */
package projetModele;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.ContrainteTemperature#getLimiteTemperature <em>Limite Temperature</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getContrainteTemperature()
 * @model
 * @generated
 */
public interface ContrainteTemperature extends ContrainteStockage {
	/**
	 * Returns the value of the '<em><b>Limite Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Temperature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Temperature</em>' reference.
	 * @see #setLimiteTemperature(LimiteTemperature)
	 * @see projetModele.ProjetModelePackage#getContrainteTemperature_LimiteTemperature()
	 * @model required="true"
	 * @generated
	 */
	LimiteTemperature getLimiteTemperature();

	/**
	 * Sets the value of the '{@link projetModele.ContrainteTemperature#getLimiteTemperature <em>Limite Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Temperature</em>' reference.
	 * @see #getLimiteTemperature()
	 * @generated
	 */
	void setLimiteTemperature(LimiteTemperature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteTemperature ContrainteTemperature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteTemperature ContrainteTemperature(LimiteTemperature lim);

} // ContrainteTemperature
