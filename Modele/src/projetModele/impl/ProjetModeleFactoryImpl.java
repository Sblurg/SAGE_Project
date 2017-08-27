/**
 */
package projetModele.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projetModele.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetModeleFactoryImpl extends EFactoryImpl implements ProjetModeleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjetModeleFactory init() {
		try {
			ProjetModeleFactory theProjetModeleFactory = (ProjetModeleFactory)EPackage.Registry.INSTANCE.getEFactory(ProjetModelePackage.eNS_URI);
			if (theProjetModeleFactory != null) {
				return theProjetModeleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjetModeleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetModeleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProjetModelePackage.OPERATEUR_ENTREPOT: return createOperateurEntrepot();
			case ProjetModelePackage.TOPOGRAPHIE: return createTopographie();
			case ProjetModelePackage.ZONE: return createZone();
			case ProjetModelePackage.POSITION: return createPosition();
			case ProjetModelePackage.DIMENSION: return createDimension();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE: return createEquipementStockage();
			case ProjetModelePackage.TYPE_EQUIPEMENT: return createTypeEquipement();
			case ProjetModelePackage.TYPE_SIMPLE: return createTypeSimple();
			case ProjetModelePackage.TYPE_ZONE_SECHE: return createTypeZoneSeche();
			case ProjetModelePackage.CONTRAINTE_HUMIDITE: return createContrainteHumidite();
			case ProjetModelePackage.TYPE_FRIGORIFIQUE: return createTypeFrigorifique();
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE: return createContrainteTemperature();
			case ProjetModelePackage.CONTRAINTE_DIMENSION: return createContrainteDimension();
			case ProjetModelePackage.PRODUIT: return createProduit();
			case ProjetModelePackage.TYPE_PRODUIT: return createTypeProduit();
			case ProjetModelePackage.CONTRAINTE_STOCKAGE: return createContrainteStockage();
			case ProjetModelePackage.LIMITE_TEMPERATURE: return createLimiteTemperature();
			case ProjetModelePackage.LIMITE_HUMIDITE: return createLimiteHumidite();
			case ProjetModelePackage.MODELE_COUT_PRODUIT: return createModeleCoutProduit();
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT: return createModeleEconomiqueProduit();
			case ProjetModelePackage.OPERATEUR_ENTREPROT_DAO: return createOperateurEntreprotDAO();
			case ProjetModelePackage.CONTRAINTE_HUMIDITE_DAO: return createContrainteHumiditeDAO();
			case ProjetModelePackage.LIMITE_HUMIDITE_DAO: return createLimiteHumiditeDAO();
			case ProjetModelePackage.MODELE_ECONOMIQUE_PRODUIT_DAO: return createModeleEconomiqueProduitDAO();
			case ProjetModelePackage.LIMITE_TEMPERATURE_DAO: return createLimiteTemperatureDAO();
			case ProjetModelePackage.CONTRAINTE_STOCKAGE_DAO: return createContrainteStockageDAO();
			case ProjetModelePackage.TYPE_PRODUIT_DAO: return createTypeProduitDAO();
			case ProjetModelePackage.PRODUIT_DAO: return createProduitDAO();
			case ProjetModelePackage.CONTRAINTE_TEMPERATURE_DAO: return createContrainteTemperatureDAO();
			case ProjetModelePackage.MODELE_COUT_PRODUIT_DAO: return createModeleCoutProduitDAO();
			case ProjetModelePackage.POSITION_DAO: return createPositionDAO();
			case ProjetModelePackage.ZONE_DAO: return createZoneDAO();
			case ProjetModelePackage.TOPOGRAPHIE_DAO: return createTopographieDAO();
			case ProjetModelePackage.EQUIPEMENT_STOCKAGE_DAO: return createEquipementStockageDAO();
			case ProjetModelePackage.DIMENSION_DAO: return createDimensionDAO();
			case ProjetModelePackage.TYPE_EQUIPEMENT_DAO: return createTypeEquipementDAO();
			case ProjetModelePackage.TYPE_SIMPLE_DAO: return createTypeSimpleDAO();
			case ProjetModelePackage.TYPE_ZONE_SECHE_DAO: return createTypeZoneSecheDAO();
			case ProjetModelePackage.TYPE_FRIGORIFIQUE_DAO: return createTypeFrigorifiqueDAO();
			case ProjetModelePackage.CONTRAINTE_DIMENSION_DAO: return createContrainteDimensionDAO();
			case ProjetModelePackage.ABSTRACT_DAO: return createAbstractDAO();
			case ProjetModelePackage.CONTROLEUR: return createControleur();
			case ProjetModelePackage.LOT_PRODUIT: return createLotProduit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperateurEntrepot createOperateurEntrepot() {
		OperateurEntrepotImpl operateurEntrepot = new OperateurEntrepotImpl();
		return operateurEntrepot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topographie createTopographie() {
		TopographieImpl topographie = new TopographieImpl();
		return topographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipementStockage createEquipementStockage() {
		EquipementStockageImpl equipementStockage = new EquipementStockageImpl();
		return equipementStockage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEquipement createTypeEquipement() {
		TypeEquipementImpl typeEquipement = new TypeEquipementImpl();
		return typeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimple createTypeSimple() {
		TypeSimpleImpl typeSimple = new TypeSimpleImpl();
		return typeSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneSeche createTypeZoneSeche() {
		TypeZoneSecheImpl typeZoneSeche = new TypeZoneSecheImpl();
		return typeZoneSeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumidite createContrainteHumidite() {
		ContrainteHumiditeImpl contrainteHumidite = new ContrainteHumiditeImpl();
		return contrainteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrigorifique createTypeFrigorifique() {
		TypeFrigorifiqueImpl typeFrigorifique = new TypeFrigorifiqueImpl();
		return typeFrigorifique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperature createContrainteTemperature() {
		ContrainteTemperatureImpl contrainteTemperature = new ContrainteTemperatureImpl();
		return contrainteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteDimension createContrainteDimension() {
		ContrainteDimensionImpl contrainteDimension = new ContrainteDimensionImpl();
		return contrainteDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produit createProduit() {
		ProduitImpl produit = new ProduitImpl();
		return produit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProduit createTypeProduit() {
		TypeProduitImpl typeProduit = new TypeProduitImpl();
		return typeProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteStockage createContrainteStockage() {
		ContrainteStockageImpl contrainteStockage = new ContrainteStockageImpl();
		return contrainteStockage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperature createLimiteTemperature() {
		LimiteTemperatureImpl limiteTemperature = new LimiteTemperatureImpl();
		return limiteTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumidite createLimiteHumidite() {
		LimiteHumiditeImpl limiteHumidite = new LimiteHumiditeImpl();
		return limiteHumidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit createModeleCoutProduit() {
		ModeleCoutProduitImpl modeleCoutProduit = new ModeleCoutProduitImpl();
		return modeleCoutProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleEconomiqueProduit createModeleEconomiqueProduit() {
		ModeleEconomiqueProduitImpl modeleEconomiqueProduit = new ModeleEconomiqueProduitImpl();
		return modeleEconomiqueProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperateurEntreprotDAO createOperateurEntreprotDAO() {
		OperateurEntreprotDAOImpl operateurEntreprotDAO = new OperateurEntreprotDAOImpl();
		return operateurEntreprotDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteHumiditeDAO createContrainteHumiditeDAO() {
		ContrainteHumiditeDAOImpl contrainteHumiditeDAO = new ContrainteHumiditeDAOImpl();
		return contrainteHumiditeDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteHumiditeDAO createLimiteHumiditeDAO() {
		LimiteHumiditeDAOImpl limiteHumiditeDAO = new LimiteHumiditeDAOImpl();
		return limiteHumiditeDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleEconomiqueProduitDAO createModeleEconomiqueProduitDAO() {
		ModeleEconomiqueProduitDAOImpl modeleEconomiqueProduitDAO = new ModeleEconomiqueProduitDAOImpl();
		return modeleEconomiqueProduitDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiteTemperatureDAO createLimiteTemperatureDAO() {
		LimiteTemperatureDAOImpl limiteTemperatureDAO = new LimiteTemperatureDAOImpl();
		return limiteTemperatureDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteStockageDAO createContrainteStockageDAO() {
		ContrainteStockageDAOImpl contrainteStockageDAO = new ContrainteStockageDAOImpl();
		return contrainteStockageDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProduitDAO createTypeProduitDAO() {
		TypeProduitDAOImpl typeProduitDAO = new TypeProduitDAOImpl();
		return typeProduitDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProduitDAO createProduitDAO() {
		ProduitDAOImpl produitDAO = new ProduitDAOImpl();
		return produitDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTemperatureDAO createContrainteTemperatureDAO() {
		ContrainteTemperatureDAOImpl contrainteTemperatureDAO = new ContrainteTemperatureDAOImpl();
		return contrainteTemperatureDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduitDAO createModeleCoutProduitDAO() {
		ModeleCoutProduitDAOImpl modeleCoutProduitDAO = new ModeleCoutProduitDAOImpl();
		return modeleCoutProduitDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionDAO createPositionDAO() {
		PositionDAOImpl positionDAO = new PositionDAOImpl();
		return positionDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDAO createZoneDAO() {
		ZoneDAOImpl zoneDAO = new ZoneDAOImpl();
		return zoneDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopographieDAO createTopographieDAO() {
		TopographieDAOImpl topographieDAO = new TopographieDAOImpl();
		return topographieDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipementStockageDAO createEquipementStockageDAO() {
		EquipementStockageDAOImpl equipementStockageDAO = new EquipementStockageDAOImpl();
		return equipementStockageDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionDAO createDimensionDAO() {
		DimensionDAOImpl dimensionDAO = new DimensionDAOImpl();
		return dimensionDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEquipementDAO createTypeEquipementDAO() {
		TypeEquipementDAOImpl typeEquipementDAO = new TypeEquipementDAOImpl();
		return typeEquipementDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleDAO createTypeSimpleDAO() {
		TypeSimpleDAOImpl typeSimpleDAO = new TypeSimpleDAOImpl();
		return typeSimpleDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeZoneSecheDAO createTypeZoneSecheDAO() {
		TypeZoneSecheDAOImpl typeZoneSecheDAO = new TypeZoneSecheDAOImpl();
		return typeZoneSecheDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrigorifiqueDAO createTypeFrigorifiqueDAO() {
		TypeFrigorifiqueDAOImpl typeFrigorifiqueDAO = new TypeFrigorifiqueDAOImpl();
		return typeFrigorifiqueDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteDimensionDAO createContrainteDimensionDAO() {
		ContrainteDimensionDAOImpl contrainteDimensionDAO = new ContrainteDimensionDAOImpl();
		return contrainteDimensionDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDAO createAbstractDAO() {
		AbstractDAOImpl abstractDAO = new AbstractDAOImpl();
		return abstractDAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controleur createControleur() {
		ControleurImpl controleur = new ControleurImpl();
		return controleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LotProduit createLotProduit() {
		LotProduitImpl lotProduit = new LotProduitImpl();
		return lotProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetModelePackage getProjetModelePackage() {
		return (ProjetModelePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjetModelePackage getPackage() {
		return ProjetModelePackage.eINSTANCE;
	}

} //ProjetModeleFactoryImpl
