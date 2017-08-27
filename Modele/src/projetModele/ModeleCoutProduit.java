/**
 */
package projetModele;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modele Cout Produit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.ModeleCoutProduit#getCoutStock <em>Cout Stock</em>}</li>
 *   <li>{@link projetModele.ModeleCoutProduit#getCoutDeStock <em>Cout De Stock</em>}</li>
 *   <li>{@link projetModele.ModeleCoutProduit#getCoutDeplacement <em>Cout Deplacement</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getModeleCoutProduit()
 * @model
 * @generated
 */
public interface ModeleCoutProduit extends EObject {
	/**
	 * Returns the value of the '<em><b>Cout Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout Stock</em>' attribute.
	 * @see #setCoutStock(float)
	 * @see projetModele.ProjetModelePackage#getModeleCoutProduit_CoutStock()
	 * @model
	 * @generated
	 */
	float getCoutStock();

	/**
	 * Sets the value of the '{@link projetModele.ModeleCoutProduit#getCoutStock <em>Cout Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout Stock</em>' attribute.
	 * @see #getCoutStock()
	 * @generated
	 */
	void setCoutStock(float value);

	/**
	 * Returns the value of the '<em><b>Cout De Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout De Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout De Stock</em>' attribute.
	 * @see #setCoutDeStock(float)
	 * @see projetModele.ProjetModelePackage#getModeleCoutProduit_CoutDeStock()
	 * @model
	 * @generated
	 */
	float getCoutDeStock();

	/**
	 * Sets the value of the '{@link projetModele.ModeleCoutProduit#getCoutDeStock <em>Cout De Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout De Stock</em>' attribute.
	 * @see #getCoutDeStock()
	 * @generated
	 */
	void setCoutDeStock(float value);

	/**
	 * Returns the value of the '<em><b>Cout Deplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout Deplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout Deplacement</em>' attribute.
	 * @see #setCoutDeplacement(float)
	 * @see projetModele.ProjetModelePackage#getModeleCoutProduit_CoutDeplacement()
	 * @model
	 * @generated
	 */
	float getCoutDeplacement();

	/**
	 * Sets the value of the '{@link projetModele.ModeleCoutProduit#getCoutDeplacement <em>Cout Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout Deplacement</em>' attribute.
	 * @see #getCoutDeplacement()
	 * @generated
	 */
	void setCoutDeplacement(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModeleCoutProduit ModeleCoutProduit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModeleCoutProduit ModeleCoutProduit(float coutStock, float coutDestock, float coutDepla);

} // ModeleCoutProduit
