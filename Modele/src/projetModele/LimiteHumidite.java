/**
 */
package projetModele;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limite Humidite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.LimiteHumidite#getHumiMin <em>Humi Min</em>}</li>
 *   <li>{@link projetModele.LimiteHumidite#getHumiMax <em>Humi Max</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getLimiteHumidite()
 * @model
 * @generated
 */
public interface LimiteHumidite extends EObject {
	/**
	 * Returns the value of the '<em><b>Humi Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Humi Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humi Min</em>' attribute.
	 * @see #setHumiMin(float)
	 * @see projetModele.ProjetModelePackage#getLimiteHumidite_HumiMin()
	 * @model
	 * @generated
	 */
	float getHumiMin();

	/**
	 * Sets the value of the '{@link projetModele.LimiteHumidite#getHumiMin <em>Humi Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humi Min</em>' attribute.
	 * @see #getHumiMin()
	 * @generated
	 */
	void setHumiMin(float value);

	/**
	 * Returns the value of the '<em><b>Humi Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Humi Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humi Max</em>' attribute.
	 * @see #setHumiMax(float)
	 * @see projetModele.ProjetModelePackage#getLimiteHumidite_HumiMax()
	 * @model
	 * @generated
	 */
	float getHumiMax();

	/**
	 * Sets the value of the '{@link projetModele.LimiteHumidite#getHumiMax <em>Humi Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humi Max</em>' attribute.
	 * @see #getHumiMax()
	 * @generated
	 */
	void setHumiMax(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LimiteHumidite LimiteHumidite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LimiteHumidite LimiteHumidite(float humiMin, float humiMax);

} // LimiteHumidite
