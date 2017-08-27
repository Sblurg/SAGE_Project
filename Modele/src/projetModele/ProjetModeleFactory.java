/**
 */
package projetModele;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projetModele.ProjetModelePackage
 * @generated
 */
public interface ProjetModeleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetModeleFactory eINSTANCE = projetModele.impl.ProjetModeleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operateur Entrepot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operateur Entrepot</em>'.
	 * @generated
	 */
	OperateurEntrepot createOperateurEntrepot();

	/**
	 * Returns a new object of class '<em>Topographie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topographie</em>'.
	 * @generated
	 */
	Topographie createTopographie();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Equipement Stockage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipement Stockage</em>'.
	 * @generated
	 */
	EquipementStockage createEquipementStockage();

	/**
	 * Returns a new object of class '<em>Type Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Equipement</em>'.
	 * @generated
	 */
	TypeEquipement createTypeEquipement();

	/**
	 * Returns a new object of class '<em>Type Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Simple</em>'.
	 * @generated
	 */
	TypeSimple createTypeSimple();

	/**
	 * Returns a new object of class '<em>Type Zone Seche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Zone Seche</em>'.
	 * @generated
	 */
	TypeZoneSeche createTypeZoneSeche();

	/**
	 * Returns a new object of class '<em>Contrainte Humidite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Humidite</em>'.
	 * @generated
	 */
	ContrainteHumidite createContrainteHumidite();

	/**
	 * Returns a new object of class '<em>Type Frigorifique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Frigorifique</em>'.
	 * @generated
	 */
	TypeFrigorifique createTypeFrigorifique();

	/**
	 * Returns a new object of class '<em>Contrainte Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Temperature</em>'.
	 * @generated
	 */
	ContrainteTemperature createContrainteTemperature();

	/**
	 * Returns a new object of class '<em>Contrainte Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Dimension</em>'.
	 * @generated
	 */
	ContrainteDimension createContrainteDimension();

	/**
	 * Returns a new object of class '<em>Produit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produit</em>'.
	 * @generated
	 */
	Produit createProduit();

	/**
	 * Returns a new object of class '<em>Type Produit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Produit</em>'.
	 * @generated
	 */
	TypeProduit createTypeProduit();

	/**
	 * Returns a new object of class '<em>Contrainte Stockage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Stockage</em>'.
	 * @generated
	 */
	ContrainteStockage createContrainteStockage();

	/**
	 * Returns a new object of class '<em>Limite Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limite Temperature</em>'.
	 * @generated
	 */
	LimiteTemperature createLimiteTemperature();

	/**
	 * Returns a new object of class '<em>Limite Humidite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limite Humidite</em>'.
	 * @generated
	 */
	LimiteHumidite createLimiteHumidite();

	/**
	 * Returns a new object of class '<em>Modele Cout Produit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modele Cout Produit</em>'.
	 * @generated
	 */
	ModeleCoutProduit createModeleCoutProduit();

	/**
	 * Returns a new object of class '<em>Modele Economique Produit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modele Economique Produit</em>'.
	 * @generated
	 */
	ModeleEconomiqueProduit createModeleEconomiqueProduit();

	/**
	 * Returns a new object of class '<em>Operateur Entreprot DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operateur Entreprot DAO</em>'.
	 * @generated
	 */
	OperateurEntreprotDAO createOperateurEntreprotDAO();

	/**
	 * Returns a new object of class '<em>Contrainte Humidite DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Humidite DAO</em>'.
	 * @generated
	 */
	ContrainteHumiditeDAO createContrainteHumiditeDAO();

	/**
	 * Returns a new object of class '<em>Limite Humidite DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limite Humidite DAO</em>'.
	 * @generated
	 */
	LimiteHumiditeDAO createLimiteHumiditeDAO();

	/**
	 * Returns a new object of class '<em>Modele Economique Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modele Economique Produit DAO</em>'.
	 * @generated
	 */
	ModeleEconomiqueProduitDAO createModeleEconomiqueProduitDAO();

	/**
	 * Returns a new object of class '<em>Limite Temperature DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limite Temperature DAO</em>'.
	 * @generated
	 */
	LimiteTemperatureDAO createLimiteTemperatureDAO();

	/**
	 * Returns a new object of class '<em>Contrainte Stockage DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Stockage DAO</em>'.
	 * @generated
	 */
	ContrainteStockageDAO createContrainteStockageDAO();

	/**
	 * Returns a new object of class '<em>Type Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Produit DAO</em>'.
	 * @generated
	 */
	TypeProduitDAO createTypeProduitDAO();

	/**
	 * Returns a new object of class '<em>Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produit DAO</em>'.
	 * @generated
	 */
	ProduitDAO createProduitDAO();

	/**
	 * Returns a new object of class '<em>Contrainte Temperature DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Temperature DAO</em>'.
	 * @generated
	 */
	ContrainteTemperatureDAO createContrainteTemperatureDAO();

	/**
	 * Returns a new object of class '<em>Modele Cout Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modele Cout Produit DAO</em>'.
	 * @generated
	 */
	ModeleCoutProduitDAO createModeleCoutProduitDAO();

	/**
	 * Returns a new object of class '<em>Position DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position DAO</em>'.
	 * @generated
	 */
	PositionDAO createPositionDAO();

	/**
	 * Returns a new object of class '<em>Zone DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone DAO</em>'.
	 * @generated
	 */
	ZoneDAO createZoneDAO();

	/**
	 * Returns a new object of class '<em>Topographie DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topographie DAO</em>'.
	 * @generated
	 */
	TopographieDAO createTopographieDAO();

	/**
	 * Returns a new object of class '<em>Equipement Stockage DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipement Stockage DAO</em>'.
	 * @generated
	 */
	EquipementStockageDAO createEquipementStockageDAO();

	/**
	 * Returns a new object of class '<em>Dimension DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension DAO</em>'.
	 * @generated
	 */
	DimensionDAO createDimensionDAO();

	/**
	 * Returns a new object of class '<em>Type Equipement DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Equipement DAO</em>'.
	 * @generated
	 */
	TypeEquipementDAO createTypeEquipementDAO();

	/**
	 * Returns a new object of class '<em>Type Simple DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Simple DAO</em>'.
	 * @generated
	 */
	TypeSimpleDAO createTypeSimpleDAO();

	/**
	 * Returns a new object of class '<em>Type Zone Seche DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Zone Seche DAO</em>'.
	 * @generated
	 */
	TypeZoneSecheDAO createTypeZoneSecheDAO();

	/**
	 * Returns a new object of class '<em>Type Frigorifique DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Frigorifique DAO</em>'.
	 * @generated
	 */
	TypeFrigorifiqueDAO createTypeFrigorifiqueDAO();

	/**
	 * Returns a new object of class '<em>Contrainte Dimension DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Dimension DAO</em>'.
	 * @generated
	 */
	ContrainteDimensionDAO createContrainteDimensionDAO();

	/**
	 * Returns a new object of class '<em>Abstract DAO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract DAO</em>'.
	 * @generated
	 */
	AbstractDAO createAbstractDAO();

	/**
	 * Returns a new object of class '<em>Controleur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controleur</em>'.
	 * @generated
	 */
	Controleur createControleur();

	/**
	 * Returns a new object of class '<em>Lot Produit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lot Produit</em>'.
	 * @generated
	 */
	LotProduit createLotProduit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetModelePackage getProjetModelePackage();

} //ProjetModeleFactory
