/**
 */
package projetModele.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import projetModele.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see projetModele.ProjetModelePackage
 * @generated
 */
public class ProjetModeleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetModelePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetModeleSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjetModelePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProjetModelePackage.OPERATEUR_ENTREPOT: {
				OperateurEntrepot operateurEntrepot = (OperateurEntrepot)theEObject;
				T result = caseOperateurEntrepot(operateurEntrepot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TOPOGRAPHIE: {
				Topographie topographie = (Topographie)theEObject;
				T result = caseTopographie(topographie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE: {
				EquipementStockage equipementStockage = (EquipementStockage)theEObject;
				T result = caseEquipementStockage(equipementStockage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_EQUIPEMENT: {
				TypeEquipement typeEquipement = (TypeEquipement)theEObject;
				T result = caseTypeEquipement(typeEquipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_SIMPLE: {
				TypeSimple typeSimple = (TypeSimple)theEObject;
				T result = caseTypeSimple(typeSimple);
				if (result == null) result = caseTypeEquipement(typeSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_ZONE_SECHE: {
				TypeZoneSeche typeZoneSeche = (TypeZoneSeche)theEObject;
				T result = caseTypeZoneSeche(typeZoneSeche);
				if (result == null) result = caseTypeEquipement(typeZoneSeche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_HUMIDITE: {
				ContrainteHumidite contrainteHumidite = (ContrainteHumidite)theEObject;
				T result = caseContrainteHumidite(contrainteHumidite);
				if (result == null) result = caseContrainteStockage(contrainteHumidite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_FRIGORIFIQUE: {
				TypeFrigorifique typeFrigorifique = (TypeFrigorifique)theEObject;
				T result = caseTypeFrigorifique(typeFrigorifique);
				if (result == null) result = caseTypeEquipement(typeFrigorifique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE: {
				ContrainteTemperature contrainteTemperature = (ContrainteTemperature)theEObject;
				T result = caseContrainteTemperature(contrainteTemperature);
				if (result == null) result = caseContrainteStockage(contrainteTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_DIMENSION: {
				ContrainteDimension contrainteDimension = (ContrainteDimension)theEObject;
				T result = caseContrainteDimension(contrainteDimension);
				if (result == null) result = caseContrainteStockage(contrainteDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.PRODUIT: {
				Produit produit = (Produit)theEObject;
				T result = caseProduit(produit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_PRODUIT: {
				TypeProduit typeProduit = (TypeProduit)theEObject;
				T result = caseTypeProduit(typeProduit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_STOCKAGE: {
				ContrainteStockage contrainteStockage = (ContrainteStockage)theEObject;
				T result = caseContrainteStockage(contrainteStockage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.LIMITE_TEMPERATURE: {
				LimiteTemperature limiteTemperature = (LimiteTemperature)theEObject;
				T result = caseLimiteTemperature(limiteTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.LIMITE_HUMIDITE: {
				LimiteHumidite limiteHumidite = (LimiteHumidite)theEObject;
				T result = caseLimiteHumidite(limiteHumidite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.MODELE_COUT_PRODUIT: {
				ModeleCoutProduit modeleCoutProduit = (ModeleCoutProduit)theEObject;
				T result = caseModeleCoutProduit(modeleCoutProduit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT: {
				ModeleEconomiqueProduit modeleEconomiqueProduit = (ModeleEconomiqueProduit)theEObject;
				T result = caseModeleEconomiqueProduit(modeleEconomiqueProduit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.OPERATEUR_ENTREPROT_DAO: {
				OperateurEntreprotDAO operateurEntreprotDAO = (OperateurEntreprotDAO)theEObject;
				T result = caseOperateurEntreprotDAO(operateurEntreprotDAO);
				if (result == null) result = caseAbstractDAO(operateurEntreprotDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_HUMIDITE_DAO: {
				ContrainteHumiditeDAO contrainteHumiditeDAO = (ContrainteHumiditeDAO)theEObject;
				T result = caseContrainteHumiditeDAO(contrainteHumiditeDAO);
				if (result == null) result = caseAbstractDAO(contrainteHumiditeDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.LIMITE_HUMIDITE_DAO: {
				LimiteHumiditeDAO limiteHumiditeDAO = (LimiteHumiditeDAO)theEObject;
				T result = caseLimiteHumiditeDAO(limiteHumiditeDAO);
				if (result == null) result = caseAbstractDAO(limiteHumiditeDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT_DAO: {
				ModeleEconomiqueProduitDAO modeleEconomiqueProduitDAO = (ModeleEconomiqueProduitDAO)theEObject;
				T result = caseModeleEconomiqueProduitDAO(modeleEconomiqueProduitDAO);
				if (result == null) result = caseAbstractDAO(modeleEconomiqueProduitDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.LIMITE_TEMPERATURE_DAO: {
				LimiteTemperatureDAO limiteTemperatureDAO = (LimiteTemperatureDAO)theEObject;
				T result = caseLimiteTemperatureDAO(limiteTemperatureDAO);
				if (result == null) result = caseAbstractDAO(limiteTemperatureDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_STOCKAGE_DAO: {
				ContrainteStockageDAO contrainteStockageDAO = (ContrainteStockageDAO)theEObject;
				T result = caseContrainteStockageDAO(contrainteStockageDAO);
				if (result == null) result = caseAbstractDAO(contrainteStockageDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_PRODUIT_DAO: {
				TypeProduitDAO typeProduitDAO = (TypeProduitDAO)theEObject;
				T result = caseTypeProduitDAO(typeProduitDAO);
				if (result == null) result = caseAbstractDAO(typeProduitDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.PRODUIT_DAO: {
				ProduitDAO produitDAO = (ProduitDAO)theEObject;
				T result = caseProduitDAO(produitDAO);
				if (result == null) result = caseAbstractDAO(produitDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE_DAO: {
				ContrainteTemperatureDAO contrainteTemperatureDAO = (ContrainteTemperatureDAO)theEObject;
				T result = caseContrainteTemperatureDAO(contrainteTemperatureDAO);
				if (result == null) result = caseAbstractDAO(contrainteTemperatureDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.MODELE_COUT_PRODUIT_DAO: {
				ModeleCoutProduitDAO modeleCoutProduitDAO = (ModeleCoutProduitDAO)theEObject;
				T result = caseModeleCoutProduitDAO(modeleCoutProduitDAO);
				if (result == null) result = caseAbstractDAO(modeleCoutProduitDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.POSITION_DAO: {
				PositionDAO positionDAO = (PositionDAO)theEObject;
				T result = casePositionDAO(positionDAO);
				if (result == null) result = caseAbstractDAO(positionDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.ZONE_DAO: {
				ZoneDAO zoneDAO = (ZoneDAO)theEObject;
				T result = caseZoneDAO(zoneDAO);
				if (result == null) result = caseAbstractDAO(zoneDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TOPOGRAPHIE_DAO: {
				TopographieDAO topographieDAO = (TopographieDAO)theEObject;
				T result = caseTopographieDAO(topographieDAO);
				if (result == null) result = caseAbstractDAO(topographieDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE_DAO: {
				EquipementStockageDAO equipementStockageDAO = (EquipementStockageDAO)theEObject;
				T result = caseEquipementStockageDAO(equipementStockageDAO);
				if (result == null) result = caseAbstractDAO(equipementStockageDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.DIMENSION_DAO: {
				DimensionDAO dimensionDAO = (DimensionDAO)theEObject;
				T result = caseDimensionDAO(dimensionDAO);
				if (result == null) result = caseAbstractDAO(dimensionDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_EQUIPEMENT_DAO: {
				TypeEquipementDAO typeEquipementDAO = (TypeEquipementDAO)theEObject;
				T result = caseTypeEquipementDAO(typeEquipementDAO);
				if (result == null) result = caseAbstractDAO(typeEquipementDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_SIMPLE_DAO: {
				TypeSimpleDAO typeSimpleDAO = (TypeSimpleDAO)theEObject;
				T result = caseTypeSimpleDAO(typeSimpleDAO);
				if (result == null) result = caseAbstractDAO(typeSimpleDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_ZONE_SECHE_DAO: {
				TypeZoneSecheDAO typeZoneSecheDAO = (TypeZoneSecheDAO)theEObject;
				T result = caseTypeZoneSecheDAO(typeZoneSecheDAO);
				if (result == null) result = caseAbstractDAO(typeZoneSecheDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.TYPE_FRIGORIFIQUE_DAO: {
				TypeFrigorifiqueDAO typeFrigorifiqueDAO = (TypeFrigorifiqueDAO)theEObject;
				T result = caseTypeFrigorifiqueDAO(typeFrigorifiqueDAO);
				if (result == null) result = caseAbstractDAO(typeFrigorifiqueDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTRAINTE_DIMENSION_DAO: {
				ContrainteDimensionDAO contrainteDimensionDAO = (ContrainteDimensionDAO)theEObject;
				T result = caseContrainteDimensionDAO(contrainteDimensionDAO);
				if (result == null) result = caseAbstractDAO(contrainteDimensionDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.ABSTRACT_DAO: {
				AbstractDAO abstractDAO = (AbstractDAO)theEObject;
				T result = caseAbstractDAO(abstractDAO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.CONTROLEUR: {
				Controleur controleur = (Controleur)theEObject;
				T result = caseControleur(controleur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjetModelePackage.LOT_PRODUIT: {
				LotProduit lotProduit = (LotProduit)theEObject;
				T result = caseLotProduit(lotProduit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operateur Entrepot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operateur Entrepot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperateurEntrepot(OperateurEntrepot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topographie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topographie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopographie(Topographie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipement Stockage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipement Stockage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipementStockage(EquipementStockage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEquipement(TypeEquipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSimple(TypeSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Seche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Seche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneSeche(TypeZoneSeche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Humidite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Humidite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteHumidite(ContrainteHumidite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Frigorifique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Frigorifique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFrigorifique(TypeFrigorifique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteTemperature(ContrainteTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteDimension(ContrainteDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduit(Produit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Produit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Produit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProduit(TypeProduit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Stockage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Stockage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteStockage(ContrainteStockage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limite Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limite Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiteTemperature(LimiteTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limite Humidite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limite Humidite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiteHumidite(LimiteHumidite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modele Cout Produit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modele Cout Produit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeleCoutProduit(ModeleCoutProduit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modele Economique Produit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modele Economique Produit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeleEconomiqueProduit(ModeleEconomiqueProduit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operateur Entreprot DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operateur Entreprot DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperateurEntreprotDAO(OperateurEntreprotDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Humidite DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Humidite DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteHumiditeDAO(ContrainteHumiditeDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limite Humidite DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limite Humidite DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiteHumiditeDAO(LimiteHumiditeDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modele Economique Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modele Economique Produit DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeleEconomiqueProduitDAO(ModeleEconomiqueProduitDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limite Temperature DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limite Temperature DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiteTemperatureDAO(LimiteTemperatureDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Stockage DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Stockage DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteStockageDAO(ContrainteStockageDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Produit DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProduitDAO(TypeProduitDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produit DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduitDAO(ProduitDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Temperature DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Temperature DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteTemperatureDAO(ContrainteTemperatureDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modele Cout Produit DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modele Cout Produit DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeleCoutProduitDAO(ModeleCoutProduitDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionDAO(PositionDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDAO(ZoneDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topographie DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topographie DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopographieDAO(TopographieDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipement Stockage DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipement Stockage DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipementStockageDAO(EquipementStockageDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionDAO(DimensionDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Equipement DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Equipement DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEquipementDAO(TypeEquipementDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Simple DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Simple DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSimpleDAO(TypeSimpleDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Zone Seche DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Zone Seche DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeZoneSecheDAO(TypeZoneSecheDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Frigorifique DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Frigorifique DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFrigorifiqueDAO(TypeFrigorifiqueDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Dimension DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Dimension DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteDimensionDAO(ContrainteDimensionDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DAO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DAO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDAO(AbstractDAO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controleur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controleur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControleur(Controleur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lot Produit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lot Produit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLotProduit(LotProduit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProjetModeleSwitch
