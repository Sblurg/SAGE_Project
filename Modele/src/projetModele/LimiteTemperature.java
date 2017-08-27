/**
 */
package projetModele;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limite Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.LimiteTemperature#getTemperatureMin <em>Temperature Min</em>}</li>
 *   <li>{@link projetModele.LimiteTemperature#getTemperatureMax <em>Temperature Max</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getLimiteTemperature()
 * @model
 * @generated
 */
public interface LimiteTemperature extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Min</em>' attribute.
	 * @see #setTemperatureMin(float)
	 * @see projetModele.ProjetModelePackage#getLimiteTemperature_TemperatureMin()
	 * @model
	 * @generated
	 */
	float getTemperatureMin();

	/**
	 * Sets the value of the '{@link projetModele.LimiteTemperature#getTemperatureMin <em>Temperature Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Min</em>' attribute.
	 * @see #getTemperatureMin()
	 * @generated
	 */
	void setTemperatureMin(float value);

	/**
	 * Returns the value of the '<em><b>Temperature Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Max</em>' attribute.
	 * @see #setTemperatureMax(float)
	 * @see projetModele.ProjetModelePackage#getLimiteTemperature_TemperatureMax()
	 * @model
	 * @generated
	 */
	float getTemperatureMax();

	/**
	 * Sets the value of the '{@link projetModele.LimiteTemperature#getTemperatureMax <em>Temperature Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Max</em>' attribute.
	 * @see #getTemperatureMax()
	 * @generated
	 */
	void setTemperatureMax(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LimiteTemperature LimiteTemperature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LimiteTemperature LimiteTemperature(float tempMin, float tempMax);

} // LimiteTemperature
