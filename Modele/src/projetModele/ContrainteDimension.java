/**
 */
package projetModele;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.ContrainteDimension#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getContrainteDimension()
 * @model
 * @generated
 */
public interface ContrainteDimension extends ContrainteStockage {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see projetModele.ProjetModelePackage#getContrainteDimension_Dimension()
	 * @model required="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link projetModele.ContrainteDimension#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteDimension ContrainteDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ContrainteDimension ContrainteDimension(Dimension dim);

} // ContrainteDimension
