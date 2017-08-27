/**
 */
package projetModele;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.Dimension#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link projetModele.Dimension#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link projetModele.Dimension#getProfondeur <em>Profondeur</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' attribute.
	 * @see #setHauteur(float)
	 * @see projetModele.ProjetModelePackage#getDimension_Hauteur()
	 * @model
	 * @generated
	 */
	float getHauteur();

	/**
	 * Sets the value of the '{@link projetModele.Dimension#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' attribute.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(float value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' attribute.
	 * @see #setLargeur(float)
	 * @see projetModele.ProjetModelePackage#getDimension_Largeur()
	 * @model
	 * @generated
	 */
	float getLargeur();

	/**
	 * Sets the value of the '{@link projetModele.Dimension#getLargeur <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' attribute.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(float value);

	/**
	 * Returns the value of the '<em><b>Profondeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur</em>' attribute.
	 * @see #setProfondeur(float)
	 * @see projetModele.ProjetModelePackage#getDimension_Profondeur()
	 * @model
	 * @generated
	 */
	float getProfondeur();

	/**
	 * Sets the value of the '{@link projetModele.Dimension#getProfondeur <em>Profondeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur</em>' attribute.
	 * @see #getProfondeur()
	 * @generated
	 */
	void setProfondeur(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dimension Dimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dimension Dimension(float haut, float larg, float prof);

} // Dimension
