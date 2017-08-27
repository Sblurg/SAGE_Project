/**
 */
package projetModele;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lot Produit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.LotProduit#getProduits <em>Produits</em>}</li>
 *   <li>{@link projetModele.LotProduit#getCoutDeplacementLot <em>Cout Deplacement Lot</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getLotProduit()
 * @model
 * @generated
 */
public interface LotProduit extends EObject {
	/**
	 * Returns the value of the '<em><b>Produits</b></em>' reference list.
	 * The list contents are of type {@link projetModele.Produit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produits</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getLotProduit_Produits()
	 * @model
	 * @generated
	 */
	EList<Produit> getProduits();

	/**
	 * Returns the value of the '<em><b>Cout Deplacement Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout Deplacement Lot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout Deplacement Lot</em>' attribute.
	 * @see #setCoutDeplacementLot(float)
	 * @see projetModele.ProjetModelePackage#getLotProduit_CoutDeplacementLot()
	 * @model
	 * @generated
	 */
	float getCoutDeplacementLot();

	/**
	 * Sets the value of the '{@link projetModele.LotProduit#getCoutDeplacementLot <em>Cout Deplacement Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout Deplacement Lot</em>' attribute.
	 * @see #getCoutDeplacementLot()
	 * @generated
	 */
	void setCoutDeplacementLot(float value);

} // LotProduit
