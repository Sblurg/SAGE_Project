/**
 */
package projetModele;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetModele.Produit#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.Produit#getDateLimiteConso <em>Date Limite Conso</em>}</li>
 *   <li>{@link projetModele.Produit#getDimension <em>Dimension</em>}</li>
 *   <li>{@link projetModele.Produit#getPosition <em>Position</em>}</li>
 *   <li>{@link projetModele.Produit#getType <em>Type</em>}</li>
 *   <li>{@link projetModele.Produit#getContrainteStockage <em>Contrainte Stockage</em>}</li>
 *   <li>{@link projetModele.Produit#getModeleCout <em>Modele Cout</em>}</li>
 * </ul>
 *
 * @see projetModele.ProjetModelePackage#getProduit()
 * @model
 * @generated
 */
public interface Produit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetModele.ProjetModelePackage#getProduit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date Limite Conso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Limite Conso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Limite Conso</em>' attribute.
	 * @see #setDateLimiteConso(Date)
	 * @see projetModele.ProjetModelePackage#getProduit_DateLimiteConso()
	 * @model
	 * @generated
	 */
	Date getDateLimiteConso();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getDateLimiteConso <em>Date Limite Conso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Limite Conso</em>' attribute.
	 * @see #getDateLimiteConso()
	 * @generated
	 */
	void setDateLimiteConso(Date value);

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
	 * @see projetModele.ProjetModelePackage#getProduit_Dimension()
	 * @model required="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see projetModele.ProjetModelePackage#getProduit_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeProduit)
	 * @see projetModele.ProjetModelePackage#getProduit_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeProduit getType();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeProduit value);

	/**
	 * Returns the value of the '<em><b>Contrainte Stockage</b></em>' reference list.
	 * The list contents are of type {@link projetModele.ContrainteStockage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrainte Stockage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte Stockage</em>' reference list.
	 * @see projetModele.ProjetModelePackage#getProduit_ContrainteStockage()
	 * @model
	 * @generated
	 */
	EList<ContrainteStockage> getContrainteStockage();

	/**
	 * Returns the value of the '<em><b>Modele Cout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modele Cout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modele Cout</em>' reference.
	 * @see #setModeleCout(ModeleCoutProduit)
	 * @see projetModele.ProjetModelePackage#getProduit_ModeleCout()
	 * @model required="true"
	 * @generated
	 */
	ModeleCoutProduit getModeleCout();

	/**
	 * Sets the value of the '{@link projetModele.Produit#getModeleCout <em>Modele Cout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modele Cout</em>' reference.
	 * @see #getModeleCout()
	 * @generated
	 */
	void setModeleCout(ModeleCoutProduit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Produit Produit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Produit Produit(String name, float coutStock, float coutDestock, Date dateLim, TypeProduit type, Position pos, Dimension dim, ContrainteStockage contrainte);

} // Produit
