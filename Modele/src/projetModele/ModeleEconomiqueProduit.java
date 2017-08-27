/**
 */
package projetModele;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modele Economique Produit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.ModeleEconomiqueProduit#getModeleCoutProduit <em>Modele Cout Produit</em>}</li>
 *   <li>{@link projetModele.ModeleEconomiqueProduit#getProduit <em>Produit</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getModeleEconomiqueProduit()
 * @model
 * @generated
 */
public interface ModeleEconomiqueProduit extends EObject {
	/**
	 * Returns the value of the '<em><b>Modele Cout Produit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modele Cout Produit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modele Cout Produit</em>' reference.
	 * @see #setModeleCoutProduit(ModeleCoutProduit)
	 * @see projetModele.ProjetModelePackage#getModeleEconomiqueProduit_ModeleCoutProduit()
	 * @model required="true"
	 * @generated
	 */
	ModeleCoutProduit getModeleCoutProduit();

	/**
	 * Sets the value of the '{@link projetModele.ModeleEconomiqueProduit#getModeleCoutProduit <em>Modele Cout Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modele Cout Produit</em>' reference.
	 * @see #getModeleCoutProduit()
	 * @generated
	 */
	void setModeleCoutProduit(ModeleCoutProduit value);

	/**
	 * Returns the value of the '<em><b>Produit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produit</em>' reference.
	 * @see #setProduit(Produit)
	 * @see projetModele.ProjetModelePackage#getModeleEconomiqueProduit_Produit()
	 * @model required="true"
	 * @generated
	 */
	Produit getProduit();

	/**
	 * Sets the value of the '{@link projetModele.ModeleEconomiqueProduit#getProduit <em>Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produit</em>' reference.
	 * @see #getProduit()
	 * @generated
	 */
	void setProduit(Produit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModeleEconomiqueProduit ModeleEconomiqueProduit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModeleEconomiqueProduit ModeleEconomiqueProduit(ModeleCoutProduit modCout, Produit produit);

} // ModeleEconomiqueProduit
