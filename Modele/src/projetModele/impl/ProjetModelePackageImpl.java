/**
 */
package projetModele.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projetModele.AbstractDAO;
import projetModele.ContrainteDimension;
import projetModele.ContrainteDimensionDAO;
import projetModele.ContrainteHumidite;
import projetModele.ContrainteHumiditeDAO;
import projetModele.ContrainteStockage;
import projetModele.ContrainteStockageDAO;
import projetModele.ContrainteTemperature;
import projetModele.ContrainteTemperatureDAO;
import projetModele.Controleur;
import projetModele.Dimension;
import projetModele.DimensionDAO;
import projetModele.EquipementStockage;
import projetModele.EquipementStockageDAO;
import projetModele.LimiteHumidite;
import projetModele.LimiteHumiditeDAO;
import projetModele.LimiteTemperature;
import projetModele.LimiteTemperatureDAO;
import projetModele.LotProduit;
import projetModele.ModeleCoutProduit;
import projetModele.ModeleCoutProduitDAO;
import projetModele.ModeleEconomiqueProduit;
import projetModele.ModeleEconomiqueProduitDAO;
import projetModele.OperateurEntrepot;
import projetModele.OperateurEntreprotDAO;
import projetModele.Position;
import projetModele.PositionDAO;
import projetModele.Produit;
import projetModele.ProduitDAO;
import projetModele.ProjetModeleFactory;
import projetModele.ProjetModelePackage;
import projetModele.Topographie;
import projetModele.TopographieDAO;
import projetModele.TypeEquipement;
import projetModele.TypeEquipementDAO;
import projetModele.TypeFrigorifique;
import projetModele.TypeFrigorifiqueDAO;
import projetModele.TypeProduit;
import projetModele.TypeProduitDAO;
import projetModele.TypeSimple;
import projetModele.TypeSimpleDAO;
import projetModele.TypeZoneSeche;
import projetModele.TypeZoneSecheDAO;
import projetModele.Zone;
import projetModele.ZoneDAO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetModelePackageImpl extends EPackageImpl implements ProjetModelePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operateurEntrepotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topographieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipementStockageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEquipementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeZoneSecheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteHumiditeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFrigorifiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass produitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeProduitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteStockageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiteTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiteHumiditeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeleCoutProduitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeleEconomiqueProduitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operateurEntreprotDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteHumiditeDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiteHumiditeDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeleEconomiqueProduitDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiteTemperatureDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteStockageDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeProduitDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass produitDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteTemperatureDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeleCoutProduitDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topographieDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipementStockageDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEquipementDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSimpleDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeZoneSecheDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFrigorifiqueDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteDimensionDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controleurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lotProduitEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projetModele.ProjetModelePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjetModelePackageImpl() {
		super(eNS_URI, ProjetModeleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProjetModelePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjetModelePackage init() {
		if (isInited) return (ProjetModelePackage)EPackage.Registry.INSTANCE.getEPackage(ProjetModelePackage.eNS_URI);

		// Obtain or create and register package
		ProjetModelePackageImpl theProjetModelePackage = (ProjetModelePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProjetModelePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProjetModelePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProjetModelePackage.createPackageContents();

		// Initialize created meta-data
		theProjetModelePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjetModelePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjetModelePackage.eNS_URI, theProjetModelePackage);
		return theProjetModelePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperateurEntrepot() {
		return operateurEntrepotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperateurEntrepot_Name() {
		return (EAttribute)operateurEntrepotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperateurEntrepot__OperateurEntrepot() {
		return operateurEntrepotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperateurEntrepot__OperateurEntrepot__String() {
		return operateurEntrepotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopographie() {
		return topographieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopographie_Name() {
		return (EAttribute)topographieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopographie_Zones() {
		return (EReference)topographieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopographie__Topographie() {
		return topographieEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopographie__Topographie__String_EList() {
		return topographieEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_Name() {
		return (EAttribute)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_OpeEntrepots() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Positions() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_EquipementStockages() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Zones() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__Zone() {
		return zoneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__Zones__String_EList_EList_EList() {
		return zoneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Longitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Latitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Altitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPosition__Position() {
		return positionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPosition__Position__float_float_float() {
		return positionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Hauteur() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Largeur() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Profondeur() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDimension__Dimension() {
		return dimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDimension__Dimension__float_float_float() {
		return dimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipementStockage() {
		return equipementStockageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipementStockage_Dimension() {
		return (EReference)equipementStockageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipementStockage_Position() {
		return (EReference)equipementStockageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipementStockage_Type() {
		return (EReference)equipementStockageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipementStockage_Name() {
		return (EAttribute)equipementStockageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipementStockage_Occupe() {
		return (EAttribute)equipementStockageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEquipementStockage__EquipementStockage() {
		return equipementStockageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEquipementStockage__EquipementStockage__String_Dimension_Position_TypeEquipement() {
		return equipementStockageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeEquipement() {
		return typeEquipementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeEquipement_Name() {
		return (EAttribute)typeEquipementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeEquipement__TypeEquipement() {
		return typeEquipementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeEquipement__TypeEquipement__String() {
		return typeEquipementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSimple() {
		return typeSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeZoneSeche() {
		return typeZoneSecheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeZoneSeche_ContrainteHumidite() {
		return (EReference)typeZoneSecheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeZoneSeche__TypeZoneSeche() {
		return typeZoneSecheEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeZoneSeche__TypeZoneSeche__ContrainteHumidite() {
		return typeZoneSecheEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteHumidite() {
		return contrainteHumiditeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContrainteHumidite_LimiteHumidite() {
		return (EReference)contrainteHumiditeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteHumidite__ContrainteHumidite() {
		return contrainteHumiditeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteHumidite__ContrainteHumidite__LimiteHumidite() {
		return contrainteHumiditeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFrigorifique() {
		return typeFrigorifiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeFrigorifique_ContrainteTemperature() {
		return (EReference)typeFrigorifiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeFrigorifique__TypeFrigorifique() {
		return typeFrigorifiqueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeFrigorifique__TypeFrigorifique__ContrainteTemperature() {
		return typeFrigorifiqueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteTemperature() {
		return contrainteTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContrainteTemperature_LimiteTemperature() {
		return (EReference)contrainteTemperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteTemperature__ContrainteTemperature() {
		return contrainteTemperatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteTemperature__ContrainteTemperature__LimiteTemperature() {
		return contrainteTemperatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteDimension() {
		return contrainteDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContrainteDimension_Dimension() {
		return (EReference)contrainteDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteDimension__ContrainteDimension() {
		return contrainteDimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteDimension__ContrainteDimension__Dimension() {
		return contrainteDimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduit() {
		return produitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduit_Name() {
		return (EAttribute)produitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduit_DateLimiteConso() {
		return (EAttribute)produitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduit_Dimension() {
		return (EReference)produitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduit_Position() {
		return (EReference)produitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduit_Type() {
		return (EReference)produitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduit_ContrainteStockage() {
		return (EReference)produitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduit_ModeleCout() {
		return (EReference)produitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduit__Produit() {
		return produitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduit__Produit__String_float_float_Date_TypeProduit_Position_Dimension_ContrainteStockage() {
		return produitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeProduit() {
		return typeProduitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeProduit_Name() {
		return (EAttribute)typeProduitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeProduit__TypeProduit() {
		return typeProduitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeProduit__TypeProduit__String() {
		return typeProduitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteStockage() {
		return contrainteStockageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiteTemperature() {
		return limiteTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimiteTemperature_TemperatureMin() {
		return (EAttribute)limiteTemperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimiteTemperature_TemperatureMax() {
		return (EAttribute)limiteTemperatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteTemperature__LimiteTemperature() {
		return limiteTemperatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteTemperature__LimiteTemperature__float_float() {
		return limiteTemperatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiteHumidite() {
		return limiteHumiditeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimiteHumidite_HumiMin() {
		return (EAttribute)limiteHumiditeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimiteHumidite_HumiMax() {
		return (EAttribute)limiteHumiditeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteHumidite__LimiteHumidite() {
		return limiteHumiditeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteHumidite__LimiteHumidite__float_float() {
		return limiteHumiditeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeleCoutProduit() {
		return modeleCoutProduitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeleCoutProduit_CoutStock() {
		return (EAttribute)modeleCoutProduitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeleCoutProduit_CoutDeStock() {
		return (EAttribute)modeleCoutProduitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleCoutProduit__ModeleCoutProduit() {
		return modeleCoutProduitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleCoutProduit__ModeleCoutProduit__float_float_float() {
		return modeleCoutProduitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeleEconomiqueProduit() {
		return modeleEconomiqueProduitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeleEconomiqueProduit_ModeleCoutProduit() {
		return (EReference)modeleEconomiqueProduitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeleEconomiqueProduit_Produit() {
		return (EReference)modeleEconomiqueProduitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleEconomiqueProduit__ModeleEconomiqueProduit() {
		return modeleEconomiqueProduitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleEconomiqueProduit__ModeleEconomiqueProduit__ModeleCoutProduit_Produit() {
		return modeleEconomiqueProduitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperateurEntreprotDAO() {
		return operateurEntreprotDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperateurEntreprotDAO__OperateurEntrepotDAO() {
		return operateurEntreprotDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteHumiditeDAO() {
		return contrainteHumiditeDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteHumiditeDAO__ContrainteHumiditeDAO() {
		return contrainteHumiditeDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiteHumiditeDAO() {
		return limiteHumiditeDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteHumiditeDAO__LimiteHumiditeDAO() {
		return limiteHumiditeDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeleEconomiqueProduitDAO() {
		return modeleEconomiqueProduitDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleEconomiqueProduitDAO__ModeleEconomiqueProduit() {
		return modeleEconomiqueProduitDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiteTemperatureDAO() {
		return limiteTemperatureDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLimiteTemperatureDAO__LimiteTemperatureDAO() {
		return limiteTemperatureDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteStockageDAO() {
		return contrainteStockageDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteStockageDAO__ContrainteStockageDAO() {
		return contrainteStockageDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeProduitDAO() {
		return typeProduitDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeProduitDAO__TypeProduitDAO() {
		return typeProduitDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduitDAO() {
		return produitDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduitDAO__ProduitDAO() {
		return produitDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteTemperatureDAO() {
		return contrainteTemperatureDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteTemperatureDAO__ContrainteTemperatureDAO() {
		return contrainteTemperatureDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeleCoutProduitDAO() {
		return modeleCoutProduitDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeleCoutProduitDAO__ModeleCoutProduit() {
		return modeleCoutProduitDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionDAO() {
		return positionDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPositionDAO__PositionDAO() {
		return positionDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneDAO() {
		return zoneDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZoneDAO__ZoneDAO() {
		return zoneDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopographieDAO() {
		return topographieDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopographieDAO__TopographieDAO() {
		return topographieDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipementStockageDAO() {
		return equipementStockageDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEquipementStockageDAO__EquipementStockageDAO() {
		return equipementStockageDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionDAO() {
		return dimensionDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDimensionDAO__DimensionDAO() {
		return dimensionDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeEquipementDAO() {
		return typeEquipementDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeEquipementDAO__TypeEquipementDAO() {
		return typeEquipementDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSimpleDAO() {
		return typeSimpleDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeSimpleDAO__TypeSimpleDAO() {
		return typeSimpleDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeZoneSecheDAO() {
		return typeZoneSecheDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeZoneSecheDAO__TypeZoneSecheDAO() {
		return typeZoneSecheDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFrigorifiqueDAO() {
		return typeFrigorifiqueDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeFrigorifiqueDAO__TypeFrigorifiqueDAO() {
		return typeFrigorifiqueDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteDimensionDAO() {
		return contrainteDimensionDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContrainteDimensionDAO__ContrainteDimensinDAO() {
		return contrainteDimensionDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDAO() {
		return abstractDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDAO__Create() {
		return abstractDAOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDAO__Delete() {
		return abstractDAOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDAO__Save() {
		return abstractDAOEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDAO__Find() {
		return abstractDAOEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControleur() {
		return controleurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__ControleurDAO() {
		return controleurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddOperateurEntrepot__OperateurEntrepot() {
		return controleurEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveOperateurEntrepot__OperateurEntrepot() {
		return controleurEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateOperateurEntrepot__OperateurEntrepot() {
		return controleurEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllOperateurEntrepot() {
		return controleurEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddZone__Zone() {
		return controleurEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveZone__Zone() {
		return controleurEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateZone__Zone() {
		return controleurEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllZone() {
		return controleurEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTopographie__Topographie() {
		return controleurEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTopographique__Topographie() {
		return controleurEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTopographie__Topographie() {
		return controleurEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTopograpie() {
		return controleurEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddEquipementStockage__EquipementStockage() {
		return controleurEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveEquipementStockage__EquipementStockage() {
		return controleurEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateEquipementStockage__EquipementStockage() {
		return controleurEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllEquipementStockages() {
		return controleurEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddDimension__Dimension() {
		return controleurEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveDimension__Dimension() {
		return controleurEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateDimension__Dimension() {
		return controleurEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllDimension() {
		return controleurEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTypeEquipement__TypeEquipement() {
		return controleurEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTypeEquipement__TypeEquipement() {
		return controleurEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTypeEquipement__TypeEquipement() {
		return controleurEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTypeEquipement() {
		return controleurEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTypeSimple__TypeSimple() {
		return controleurEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTypeSimple__TypeSimple() {
		return controleurEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTypeSimple__TypeSimple() {
		return controleurEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTypeSimple() {
		return controleurEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTypeZoneSeche__TypeZoneSeche() {
		return controleurEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTypeZoneSeche__TypeZoneSeche() {
		return controleurEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTypeZoneSeche__TypeZoneSeche() {
		return controleurEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTypeZoneSeche() {
		return controleurEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTypeFrigorifique__TypeFrigorifique() {
		return controleurEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTypeFrigorifique__TypeFrigorifique() {
		return controleurEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTypeFrigorifique__TypeFrigorifique() {
		return controleurEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTypeFrigorifique() {
		return controleurEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddContrainteDimension__ContrainteDimension() {
		return controleurEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveContrainteDimension__ContrainteDimension() {
		return controleurEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateContrainteDimension__ContrainteDimension() {
		return controleurEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllContrainteDimension() {
		return controleurEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddPosition__Position() {
		return controleurEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemovePosition__Position() {
		return controleurEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdatePosition__Position() {
		return controleurEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllPosition() {
		return controleurEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddModeleCoutProduit__ModeleCoutProduit() {
		return controleurEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveModeleCoutProduit__ModeleCoutProduit() {
		return controleurEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateModeleCoutProduit__ModeleCoutProduit() {
		return controleurEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllModeleCoutProduit() {
		return controleurEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddModeleEconomiqueProduit__ModeleEconomiqueProduit() {
		return controleurEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveModeleEconomiqueProduit__ModeleEconomiqueProduit() {
		return controleurEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateModeleEconomiqueProduit__ModeleEconomiqueProduit() {
		return controleurEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllModeleEconomiqueProduit() {
		return controleurEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddLimiteHumidite__LimiteHumidite() {
		return controleurEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveLimiteHumidite__LimiteHumidite() {
		return controleurEClass.getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateLimiteHumidite__LimiteHumidite() {
		return controleurEClass.getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllLimiteHumidite() {
		return controleurEClass.getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddContrainteHumidite__ContrainteHumidite() {
		return controleurEClass.getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveContrainteHumidite__ContrainteHumidite() {
		return controleurEClass.getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateContrainteHumidite__ContrainteHumidite() {
		return controleurEClass.getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllContrainteHumidite() {
		return controleurEClass.getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddLimiteTemperature__LimiteTemperature() {
		return controleurEClass.getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveLimiteTemperature__LimiteTemperature() {
		return controleurEClass.getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateLimiteTemperature__LimiteTemperature() {
		return controleurEClass.getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllLimiteTemperature() {
		return controleurEClass.getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddContrainteStockage__ContrainteStockage() {
		return controleurEClass.getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveContrainteStockage__ContrainteStockage() {
		return controleurEClass.getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateContrainteStockage__ContrainteStockage() {
		return controleurEClass.getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllContrainteStockage() {
		return controleurEClass.getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddTypeProduit__TypeProduit() {
		return controleurEClass.getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveTypeProduit__TypeProduit() {
		return controleurEClass.getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateTypeProduit__TypeProduit() {
		return controleurEClass.getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllTypeProduit() {
		return controleurEClass.getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddProduit__Produit() {
		return controleurEClass.getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveProduit__Produit() {
		return controleurEClass.getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateProduit__Produit() {
		return controleurEClass.getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllProduit() {
		return controleurEClass.getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__AddContrainteTemperature__ContrainteTemperature() {
		return controleurEClass.getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__RemoveContrainteTemperature__ContrainteTemperature() {
		return controleurEClass.getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__UpdateContrainteTemperature__ContrainteTemperature() {
		return controleurEClass.getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControleur__GetAllContrainteTemperature() {
		return controleurEClass.getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLotProduit() {
		return lotProduitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLotProduit_Produits() {
		return (EReference)lotProduitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLotProduit_CoutDeplacementLot() {
		return (EAttribute)lotProduitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetModeleFactory getProjetModeleFactory() {
		return (ProjetModeleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operateurEntrepotEClass = createEClass(OPERATEUR_ENTREPOT);
		createEAttribute(operateurEntrepotEClass, OPERATEUR_ENTREPOT__NAME);
		createEOperation(operateurEntrepotEClass, OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT);
		createEOperation(operateurEntrepotEClass, OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT__STRING);

		topographieEClass = createEClass(TOPOGRAPHIE);
		createEAttribute(topographieEClass, TOPOGRAPHIE__NAME);
		createEReference(topographieEClass, TOPOGRAPHIE__ZONES);
		createEOperation(topographieEClass, TOPOGRAPHIE___TOPOGRAPHIE);
		createEOperation(topographieEClass, TOPOGRAPHIE___TOPOGRAPHIE__STRING_ELIST);

		zoneEClass = createEClass(ZONE);
		createEAttribute(zoneEClass, ZONE__NAME);
		createEReference(zoneEClass, ZONE__OPE_ENTREPOTS);
		createEReference(zoneEClass, ZONE__POSITIONS);
		createEReference(zoneEClass, ZONE__EQUIPEMENT_STOCKAGES);
		createEReference(zoneEClass, ZONE__ZONES);
		createEOperation(zoneEClass, ZONE___ZONE);
		createEOperation(zoneEClass, ZONE___ZONES__STRING_ELIST_ELIST_ELIST);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__LONGITUDE);
		createEAttribute(positionEClass, POSITION__LATITUDE);
		createEAttribute(positionEClass, POSITION__ALTITUDE);
		createEOperation(positionEClass, POSITION___POSITION);
		createEOperation(positionEClass, POSITION___POSITION__FLOAT_FLOAT_FLOAT);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__HAUTEUR);
		createEAttribute(dimensionEClass, DIMENSION__LARGEUR);
		createEAttribute(dimensionEClass, DIMENSION__PROFONDEUR);
		createEOperation(dimensionEClass, DIMENSION___DIMENSION);
		createEOperation(dimensionEClass, DIMENSION___DIMENSION__FLOAT_FLOAT_FLOAT);

		equipementStockageEClass = createEClass(EQUIPEMENT_STOCKAGE);
		createEReference(equipementStockageEClass, EQUIPEMENT_STOCKAGE__DIMENSION);
		createEReference(equipementStockageEClass, EQUIPEMENT_STOCKAGE__POSITION);
		createEReference(equipementStockageEClass, EQUIPEMENT_STOCKAGE__TYPE);
		createEAttribute(equipementStockageEClass, EQUIPEMENT_STOCKAGE__NAME);
		createEAttribute(equipementStockageEClass, EQUIPEMENT_STOCKAGE__OCCUPE);
		createEOperation(equipementStockageEClass, EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE);
		createEOperation(equipementStockageEClass, EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE__STRING_DIMENSION_POSITION_TYPEEQUIPEMENT);

		typeEquipementEClass = createEClass(TYPE_EQUIPEMENT);
		createEAttribute(typeEquipementEClass, TYPE_EQUIPEMENT__NAME);
		createEOperation(typeEquipementEClass, TYPE_EQUIPEMENT___TYPE_EQUIPEMENT);
		createEOperation(typeEquipementEClass, TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING);

		typeSimpleEClass = createEClass(TYPE_SIMPLE);

		typeZoneSecheEClass = createEClass(TYPE_ZONE_SECHE);
		createEReference(typeZoneSecheEClass, TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE);
		createEOperation(typeZoneSecheEClass, TYPE_ZONE_SECHE___TYPE_ZONE_SECHE);
		createEOperation(typeZoneSecheEClass, TYPE_ZONE_SECHE___TYPE_ZONE_SECHE__CONTRAINTEHUMIDITE);

		contrainteHumiditeEClass = createEClass(CONTRAINTE_HUMIDITE);
		createEReference(contrainteHumiditeEClass, CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE);
		createEOperation(contrainteHumiditeEClass, CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE);
		createEOperation(contrainteHumiditeEClass, CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE__LIMITEHUMIDITE);

		typeFrigorifiqueEClass = createEClass(TYPE_FRIGORIFIQUE);
		createEReference(typeFrigorifiqueEClass, TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE);
		createEOperation(typeFrigorifiqueEClass, TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE);
		createEOperation(typeFrigorifiqueEClass, TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE__CONTRAINTETEMPERATURE);

		contrainteTemperatureEClass = createEClass(CONTRAINTE_TEMPERATURE);
		createEReference(contrainteTemperatureEClass, CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE);
		createEOperation(contrainteTemperatureEClass, CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE);
		createEOperation(contrainteTemperatureEClass, CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE__LIMITETEMPERATURE);

		contrainteDimensionEClass = createEClass(CONTRAINTE_DIMENSION);
		createEReference(contrainteDimensionEClass, CONTRAINTE_DIMENSION__DIMENSION);
		createEOperation(contrainteDimensionEClass, CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION);
		createEOperation(contrainteDimensionEClass, CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION__DIMENSION);

		produitEClass = createEClass(PRODUIT);
		createEAttribute(produitEClass, PRODUIT__NAME);
		createEAttribute(produitEClass, PRODUIT__DATE_LIMITE_CONSO);
		createEReference(produitEClass, PRODUIT__DIMENSION);
		createEReference(produitEClass, PRODUIT__POSITION);
		createEReference(produitEClass, PRODUIT__TYPE);
		createEReference(produitEClass, PRODUIT__CONTRAINTE_STOCKAGE);
		createEReference(produitEClass, PRODUIT__MODELE_COUT);
		createEOperation(produitEClass, PRODUIT___PRODUIT);
		createEOperation(produitEClass, PRODUIT___PRODUIT__STRING_FLOAT_FLOAT_DATE_TYPEPRODUIT_POSITION_DIMENSION_CONTRAINTESTOCKAGE);

		typeProduitEClass = createEClass(TYPE_PRODUIT);
		createEAttribute(typeProduitEClass, TYPE_PRODUIT__NAME);
		createEOperation(typeProduitEClass, TYPE_PRODUIT___TYPE_PRODUIT);
		createEOperation(typeProduitEClass, TYPE_PRODUIT___TYPE_PRODUIT__STRING);

		contrainteStockageEClass = createEClass(CONTRAINTE_STOCKAGE);

		limiteTemperatureEClass = createEClass(LIMITE_TEMPERATURE);
		createEAttribute(limiteTemperatureEClass, LIMITE_TEMPERATURE__TEMPERATURE_MIN);
		createEAttribute(limiteTemperatureEClass, LIMITE_TEMPERATURE__TEMPERATURE_MAX);
		createEOperation(limiteTemperatureEClass, LIMITE_TEMPERATURE___LIMITE_TEMPERATURE);
		createEOperation(limiteTemperatureEClass, LIMITE_TEMPERATURE___LIMITE_TEMPERATURE__FLOAT_FLOAT);

		limiteHumiditeEClass = createEClass(LIMITE_HUMIDITE);
		createEAttribute(limiteHumiditeEClass, LIMITE_HUMIDITE__HUMI_MIN);
		createEAttribute(limiteHumiditeEClass, LIMITE_HUMIDITE__HUMI_MAX);
		createEOperation(limiteHumiditeEClass, LIMITE_HUMIDITE___LIMITE_HUMIDITE);
		createEOperation(limiteHumiditeEClass, LIMITE_HUMIDITE___LIMITE_HUMIDITE__FLOAT_FLOAT);

		modeleCoutProduitEClass = createEClass(MODELE_COUT_PRODUIT);
		createEAttribute(modeleCoutProduitEClass, MODELE_COUT_PRODUIT__COUT_STOCK);
		createEAttribute(modeleCoutProduitEClass, MODELE_COUT_PRODUIT__COUT_DE_STOCK);
		createEOperation(modeleCoutProduitEClass, MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT);
		createEOperation(modeleCoutProduitEClass, MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT__FLOAT_FLOAT_FLOAT);

		modeleEconomiqueProduitEClass = createEClass(MODELE_ECONOMIQUE_PRODUIT);
		createEReference(modeleEconomiqueProduitEClass, MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT);
		createEReference(modeleEconomiqueProduitEClass, MODELE_ECONOMIQUE_PRODUIT__PRODUIT);
		createEOperation(modeleEconomiqueProduitEClass, MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT);
		createEOperation(modeleEconomiqueProduitEClass, MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT__MODELECOUTPRODUIT_PRODUIT);

		operateurEntreprotDAOEClass = createEClass(OPERATEUR_ENTREPROT_DAO);
		createEOperation(operateurEntreprotDAOEClass, OPERATEUR_ENTREPROT_DAO___OPERATEUR_ENTREPOT_DAO);

		contrainteHumiditeDAOEClass = createEClass(CONTRAINTE_HUMIDITE_DAO);
		createEOperation(contrainteHumiditeDAOEClass, CONTRAINTE_HUMIDITE_DAO___CONTRAINTE_HUMIDITE_DAO);

		limiteHumiditeDAOEClass = createEClass(LIMITE_HUMIDITE_DAO);
		createEOperation(limiteHumiditeDAOEClass, LIMITE_HUMIDITE_DAO___LIMITE_HUMIDITE_DAO);

		modeleEconomiqueProduitDAOEClass = createEClass(MODELE_ECONOMIQUE_PRODUIT_DAO);
		createEOperation(modeleEconomiqueProduitDAOEClass, MODELE_ECONOMIQUE_PRODUIT_DAO___MODELE_ECONOMIQUE_PRODUIT);

		limiteTemperatureDAOEClass = createEClass(LIMITE_TEMPERATURE_DAO);
		createEOperation(limiteTemperatureDAOEClass, LIMITE_TEMPERATURE_DAO___LIMITE_TEMPERATURE_DAO);

		contrainteStockageDAOEClass = createEClass(CONTRAINTE_STOCKAGE_DAO);
		createEOperation(contrainteStockageDAOEClass, CONTRAINTE_STOCKAGE_DAO___CONTRAINTE_STOCKAGE_DAO);

		typeProduitDAOEClass = createEClass(TYPE_PRODUIT_DAO);
		createEOperation(typeProduitDAOEClass, TYPE_PRODUIT_DAO___TYPE_PRODUIT_DAO);

		produitDAOEClass = createEClass(PRODUIT_DAO);
		createEOperation(produitDAOEClass, PRODUIT_DAO___PRODUIT_DAO);

		contrainteTemperatureDAOEClass = createEClass(CONTRAINTE_TEMPERATURE_DAO);
		createEOperation(contrainteTemperatureDAOEClass, CONTRAINTE_TEMPERATURE_DAO___CONTRAINTE_TEMPERATURE_DAO);

		modeleCoutProduitDAOEClass = createEClass(MODELE_COUT_PRODUIT_DAO);
		createEOperation(modeleCoutProduitDAOEClass, MODELE_COUT_PRODUIT_DAO___MODELE_COUT_PRODUIT);

		positionDAOEClass = createEClass(POSITION_DAO);
		createEOperation(positionDAOEClass, POSITION_DAO___POSITION_DAO);

		zoneDAOEClass = createEClass(ZONE_DAO);
		createEOperation(zoneDAOEClass, ZONE_DAO___ZONE_DAO);

		topographieDAOEClass = createEClass(TOPOGRAPHIE_DAO);
		createEOperation(topographieDAOEClass, TOPOGRAPHIE_DAO___TOPOGRAPHIE_DAO);

		equipementStockageDAOEClass = createEClass(EQUIPEMENT_STOCKAGE_DAO);
		createEOperation(equipementStockageDAOEClass, EQUIPEMENT_STOCKAGE_DAO___EQUIPEMENT_STOCKAGE_DAO);

		dimensionDAOEClass = createEClass(DIMENSION_DAO);
		createEOperation(dimensionDAOEClass, DIMENSION_DAO___DIMENSION_DAO);

		typeEquipementDAOEClass = createEClass(TYPE_EQUIPEMENT_DAO);
		createEOperation(typeEquipementDAOEClass, TYPE_EQUIPEMENT_DAO___TYPE_EQUIPEMENT_DAO);

		typeSimpleDAOEClass = createEClass(TYPE_SIMPLE_DAO);
		createEOperation(typeSimpleDAOEClass, TYPE_SIMPLE_DAO___TYPE_SIMPLE_DAO);

		typeZoneSecheDAOEClass = createEClass(TYPE_ZONE_SECHE_DAO);
		createEOperation(typeZoneSecheDAOEClass, TYPE_ZONE_SECHE_DAO___TYPE_ZONE_SECHE_DAO);

		typeFrigorifiqueDAOEClass = createEClass(TYPE_FRIGORIFIQUE_DAO);
		createEOperation(typeFrigorifiqueDAOEClass, TYPE_FRIGORIFIQUE_DAO___TYPE_FRIGORIFIQUE_DAO);

		contrainteDimensionDAOEClass = createEClass(CONTRAINTE_DIMENSION_DAO);
		createEOperation(contrainteDimensionDAOEClass, CONTRAINTE_DIMENSION_DAO___CONTRAINTE_DIMENSIN_DAO);

		abstractDAOEClass = createEClass(ABSTRACT_DAO);
		createEOperation(abstractDAOEClass, ABSTRACT_DAO___CREATE);
		createEOperation(abstractDAOEClass, ABSTRACT_DAO___DELETE);
		createEOperation(abstractDAOEClass, ABSTRACT_DAO___SAVE);
		createEOperation(abstractDAOEClass, ABSTRACT_DAO___FIND);

		controleurEClass = createEClass(CONTROLEUR);
		createEOperation(controleurEClass, CONTROLEUR___CONTROLEUR_DAO);
		createEOperation(controleurEClass, CONTROLEUR___ADD_OPERATEUR_ENTREPOT__OPERATEURENTREPOT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_OPERATEUR_ENTREPOT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_ZONE__ZONE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_ZONE__ZONE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_ZONE__ZONE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_ZONE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TOPOGRAPHIE__TOPOGRAPHIE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TOPOGRAPHIQUE__TOPOGRAPHIE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TOPOGRAPHIE__TOPOGRAPHIE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TOPOGRAPIE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_EQUIPEMENT_STOCKAGES);
		createEOperation(controleurEClass, CONTROLEUR___ADD_DIMENSION__DIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_DIMENSION__DIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_DIMENSION__DIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_DIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TYPE_EQUIPEMENT__TYPEEQUIPEMENT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TYPE_EQUIPEMENT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TYPE_SIMPLE__TYPESIMPLE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TYPE_SIMPLE__TYPESIMPLE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TYPE_SIMPLE__TYPESIMPLE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TYPE_SIMPLE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TYPE_ZONE_SECHE__TYPEZONESECHE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TYPE_ZONE_SECHE__TYPEZONESECHE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TYPE_ZONE_SECHE__TYPEZONESECHE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TYPE_ZONE_SECHE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TYPE_FRIGORIFIQUE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_CONTRAINTE_DIMENSION);
		createEOperation(controleurEClass, CONTROLEUR___ADD_POSITION__POSITION);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_POSITION__POSITION);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_POSITION__POSITION);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_POSITION);
		createEOperation(controleurEClass, CONTROLEUR___ADD_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_MODELE_COUT_PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_MODELE_ECONOMIQUE_PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_LIMITE_HUMIDITE__LIMITEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_LIMITE_HUMIDITE__LIMITEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_LIMITE_HUMIDITE__LIMITEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_LIMITE_HUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_CONTRAINTE_HUMIDITE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_LIMITE_TEMPERATURE__LIMITETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_LIMITE_TEMPERATURE__LIMITETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_LIMITE_TEMPERATURE__LIMITETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_LIMITE_TEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_CONTRAINTE_STOCKAGE);
		createEOperation(controleurEClass, CONTROLEUR___ADD_TYPE_PRODUIT__TYPEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_TYPE_PRODUIT__TYPEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_TYPE_PRODUIT__TYPEPRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_TYPE_PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_PRODUIT__PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_PRODUIT__PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_PRODUIT__PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_PRODUIT);
		createEOperation(controleurEClass, CONTROLEUR___ADD_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___REMOVE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___UPDATE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE);
		createEOperation(controleurEClass, CONTROLEUR___GET_ALL_CONTRAINTE_TEMPERATURE);

		lotProduitEClass = createEClass(LOT_PRODUIT);
		createEReference(lotProduitEClass, LOT_PRODUIT__PRODUITS);
		createEAttribute(lotProduitEClass, LOT_PRODUIT__COUT_DEPLACEMENT_LOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeSimpleEClass.getESuperTypes().add(this.getTypeEquipement());
		typeZoneSecheEClass.getESuperTypes().add(this.getTypeEquipement());
		contrainteHumiditeEClass.getESuperTypes().add(this.getContrainteStockage());
		typeFrigorifiqueEClass.getESuperTypes().add(this.getTypeEquipement());
		contrainteTemperatureEClass.getESuperTypes().add(this.getContrainteStockage());
		contrainteDimensionEClass.getESuperTypes().add(this.getContrainteStockage());
		operateurEntreprotDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		contrainteHumiditeDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		limiteHumiditeDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		modeleEconomiqueProduitDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		limiteTemperatureDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		contrainteStockageDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		typeProduitDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		produitDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		contrainteTemperatureDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		modeleCoutProduitDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		positionDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		zoneDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		topographieDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		equipementStockageDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		dimensionDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		typeEquipementDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		typeSimpleDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		typeZoneSecheDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		typeFrigorifiqueDAOEClass.getESuperTypes().add(this.getAbstractDAO());
		contrainteDimensionDAOEClass.getESuperTypes().add(this.getAbstractDAO());

		// Initialize classes, features, and operations; add parameters
		initEClass(operateurEntrepotEClass, OperateurEntrepot.class, "OperateurEntrepot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperateurEntrepot_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperateurEntrepot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperateurEntrepot__OperateurEntrepot(), this.getOperateurEntrepot(), "OperateurEntrepot", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getOperateurEntrepot__OperateurEntrepot__String(), this.getOperateurEntrepot(), "OperateurEntrepot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(topographieEClass, Topographie.class, "Topographie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopographie_Name(), ecorePackage.getEString(), "name", null, 0, 1, Topographie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopographie_Zones(), this.getZone(), null, "zones", null, 0, -1, Topographie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTopographie__Topographie(), this.getTopographie(), "Topographie", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopographie__Topographie__String_EList(), this.getTopographie(), "Topographie", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZone(), "zones", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZone_Name(), ecorePackage.getEString(), "name", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_OpeEntrepots(), this.getOperateurEntrepot(), null, "opeEntrepots", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_Positions(), this.getPosition(), null, "positions", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_EquipementStockages(), this.getEquipementStockage(), null, "equipementStockages", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_Zones(), this.getZone(), null, "zones", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getZone__Zone(), this.getZone(), "Zone", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getZone__Zones__String_EList_EList_EList(), this.getZone(), "Zones", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "pos", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquipementStockage(), "equip", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZone(), "zones", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Latitude(), ecorePackage.getEFloat(), "latitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Altitude(), ecorePackage.getEFloat(), "altitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPosition__Position(), this.getPosition(), "Position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPosition__Position__float_float_float(), this.getPosition(), "Position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "long_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "lat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "alt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Hauteur(), ecorePackage.getEFloat(), "hauteur", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Largeur(), ecorePackage.getEFloat(), "largeur", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Profondeur(), ecorePackage.getEFloat(), "profondeur", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDimension__Dimension(), this.getDimension(), "Dimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDimension__Dimension__float_float_float(), this.getDimension(), "Dimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "haut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "larg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "prof", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(equipementStockageEClass, EquipementStockage.class, "EquipementStockage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipementStockage_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, EquipementStockage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipementStockage_Position(), this.getPosition(), null, "position", null, 1, 1, EquipementStockage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipementStockage_Type(), this.getTypeEquipement(), null, "type", null, 1, 1, EquipementStockage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipementStockage_Name(), ecorePackage.getEString(), "name", null, 0, 1, EquipementStockage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipementStockage_Occupe(), ecorePackage.getEBoolean(), "occupe", null, 0, 1, EquipementStockage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEquipementStockage__EquipementStockage(), this.getEquipementStockage(), "EquipementStockage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEquipementStockage__EquipementStockage__String_Dimension_Position_TypeEquipement(), this.getEquipementStockage(), "EquipementStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "dim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "pos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeEquipement(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeEquipementEClass, TypeEquipement.class, "TypeEquipement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeEquipement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeEquipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTypeEquipement__TypeEquipement(), this.getTypeEquipement(), "TypeEquipement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeEquipement__TypeEquipement__String(), this.getTypeEquipement(), "TypeEquipement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeSimpleEClass, TypeSimple.class, "TypeSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeZoneSecheEClass, TypeZoneSeche.class, "TypeZoneSeche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeZoneSeche_ContrainteHumidite(), this.getContrainteHumidite(), null, "contrainteHumidite", null, 1, 1, TypeZoneSeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTypeZoneSeche__TypeZoneSeche(), this.getTypeZoneSeche(), "TypeZoneSeche", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeZoneSeche__TypeZoneSeche__ContrainteHumidite(), this.getTypeZoneSeche(), "TypeZoneSeche", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteHumidite(), "contr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteHumiditeEClass, ContrainteHumidite.class, "ContrainteHumidite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContrainteHumidite_LimiteHumidite(), this.getLimiteHumidite(), null, "limiteHumidite", null, 1, 1, ContrainteHumidite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContrainteHumidite__ContrainteHumidite(), this.getContrainteHumidite(), "ContrainteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContrainteHumidite__ContrainteHumidite__LimiteHumidite(), this.getContrainteHumidite(), "ContrainteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteHumidite(), "lim", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeFrigorifiqueEClass, TypeFrigorifique.class, "TypeFrigorifique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeFrigorifique_ContrainteTemperature(), this.getContrainteTemperature(), null, "contrainteTemperature", null, 1, 1, TypeFrigorifique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTypeFrigorifique__TypeFrigorifique(), this.getTypeFrigorifique(), "TypeFrigorifique", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeFrigorifique__TypeFrigorifique__ContrainteTemperature(), this.getTypeFrigorifique(), "TypeFrigorifique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteTemperature(), "contr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteTemperatureEClass, ContrainteTemperature.class, "ContrainteTemperature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContrainteTemperature_LimiteTemperature(), this.getLimiteTemperature(), null, "limiteTemperature", null, 1, 1, ContrainteTemperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContrainteTemperature__ContrainteTemperature(), this.getContrainteTemperature(), "ContrainteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContrainteTemperature__ContrainteTemperature__LimiteTemperature(), this.getContrainteTemperature(), "ContrainteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteTemperature(), "lim", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteDimensionEClass, ContrainteDimension.class, "ContrainteDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContrainteDimension_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, ContrainteDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContrainteDimension__ContrainteDimension(), this.getContrainteDimension(), "ContrainteDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContrainteDimension__ContrainteDimension__Dimension(), this.getContrainteDimension(), "ContrainteDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "dim", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(produitEClass, Produit.class, "Produit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduit_DateLimiteConso(), ecorePackage.getEDate(), "dateLimiteConso", null, 0, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduit_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduit_Position(), this.getPosition(), null, "position", null, 1, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduit_Type(), this.getTypeProduit(), null, "type", null, 1, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduit_ContrainteStockage(), this.getContrainteStockage(), null, "contrainteStockage", null, 0, -1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduit_ModeleCout(), this.getModeleCoutProduit(), null, "modeleCout", null, 1, 1, Produit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProduit__Produit(), this.getProduit(), "Produit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProduit__Produit__String_float_float_Date_TypeProduit_Position_Dimension_ContrainteStockage(), this.getProduit(), "Produit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coutStock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coutDestock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dateLim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeProduit(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "pos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "dim", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteStockage(), "contrainte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeProduitEClass, TypeProduit.class, "TypeProduit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeProduit_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTypeProduit__TypeProduit(), this.getTypeProduit(), "TypeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeProduit__TypeProduit__String(), this.getTypeProduit(), "TypeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteStockageEClass, ContrainteStockage.class, "ContrainteStockage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(limiteTemperatureEClass, LimiteTemperature.class, "LimiteTemperature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimiteTemperature_TemperatureMin(), ecorePackage.getEFloat(), "temperatureMin", null, 0, 1, LimiteTemperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLimiteTemperature_TemperatureMax(), ecorePackage.getEFloat(), "temperatureMax", null, 0, 1, LimiteTemperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLimiteTemperature__LimiteTemperature(), this.getLimiteTemperature(), "LimiteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLimiteTemperature__LimiteTemperature__float_float(), this.getLimiteTemperature(), "LimiteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "tempMin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "tempMax", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(limiteHumiditeEClass, LimiteHumidite.class, "LimiteHumidite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimiteHumidite_HumiMin(), ecorePackage.getEFloat(), "humiMin", null, 0, 1, LimiteHumidite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLimiteHumidite_HumiMax(), ecorePackage.getEFloat(), "humiMax", null, 0, 1, LimiteHumidite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLimiteHumidite__LimiteHumidite(), this.getLimiteHumidite(), "LimiteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLimiteHumidite__LimiteHumidite__float_float(), this.getLimiteHumidite(), "LimiteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "humiMin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "humiMax", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modeleCoutProduitEClass, ModeleCoutProduit.class, "ModeleCoutProduit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModeleCoutProduit_CoutStock(), ecorePackage.getEFloat(), "coutStock", null, 0, 1, ModeleCoutProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeleCoutProduit_CoutDeStock(), ecorePackage.getEFloat(), "coutDeStock", null, 0, 1, ModeleCoutProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModeleCoutProduit__ModeleCoutProduit(), this.getModeleCoutProduit(), "ModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeleCoutProduit__ModeleCoutProduit__float_float_float(), this.getModeleCoutProduit(), "ModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coutStock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coutDestock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "coutDepla", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modeleEconomiqueProduitEClass, ModeleEconomiqueProduit.class, "ModeleEconomiqueProduit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeleEconomiqueProduit_ModeleCoutProduit(), this.getModeleCoutProduit(), null, "modeleCoutProduit", null, 1, 1, ModeleEconomiqueProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeleEconomiqueProduit_Produit(), this.getProduit(), null, "produit", null, 1, 1, ModeleEconomiqueProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModeleEconomiqueProduit__ModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "ModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModeleEconomiqueProduit__ModeleEconomiqueProduit__ModeleCoutProduit_Produit(), this.getModeleEconomiqueProduit(), "ModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleCoutProduit(), "modCout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProduit(), "produit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operateurEntreprotDAOEClass, OperateurEntreprotDAO.class, "OperateurEntreprotDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOperateurEntreprotDAO__OperateurEntrepotDAO(), null, "OperateurEntrepotDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteHumiditeDAOEClass, ContrainteHumiditeDAO.class, "ContrainteHumiditeDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContrainteHumiditeDAO__ContrainteHumiditeDAO(), this.getContrainteHumiditeDAO(), "ContrainteHumiditeDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(limiteHumiditeDAOEClass, LimiteHumiditeDAO.class, "LimiteHumiditeDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLimiteHumiditeDAO__LimiteHumiditeDAO(), this.getLimiteHumiditeDAO(), "LimiteHumiditeDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modeleEconomiqueProduitDAOEClass, ModeleEconomiqueProduitDAO.class, "ModeleEconomiqueProduitDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModeleEconomiqueProduitDAO__ModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "ModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(limiteTemperatureDAOEClass, LimiteTemperatureDAO.class, "LimiteTemperatureDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLimiteTemperatureDAO__LimiteTemperatureDAO(), this.getLimiteTemperatureDAO(), "LimiteTemperatureDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteStockageDAOEClass, ContrainteStockageDAO.class, "ContrainteStockageDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContrainteStockageDAO__ContrainteStockageDAO(), this.getContrainteStockageDAO(), "ContrainteStockageDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeProduitDAOEClass, TypeProduitDAO.class, "TypeProduitDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeProduitDAO__TypeProduitDAO(), this.getTypeProduitDAO(), "TypeProduitDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(produitDAOEClass, ProduitDAO.class, "ProduitDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getProduitDAO__ProduitDAO(), this.getProduitDAO(), "ProduitDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteTemperatureDAOEClass, ContrainteTemperatureDAO.class, "ContrainteTemperatureDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContrainteTemperatureDAO__ContrainteTemperatureDAO(), null, "ContrainteTemperatureDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modeleCoutProduitDAOEClass, ModeleCoutProduitDAO.class, "ModeleCoutProduitDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModeleCoutProduitDAO__ModeleCoutProduit(), this.getModeleCoutProduit(), "ModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(positionDAOEClass, PositionDAO.class, "PositionDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPositionDAO__PositionDAO(), this.getPositionDAO(), "PositionDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneDAOEClass, ZoneDAO.class, "ZoneDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getZoneDAO__ZoneDAO(), this.getZoneDAO(), "ZoneDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(topographieDAOEClass, TopographieDAO.class, "TopographieDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTopographieDAO__TopographieDAO(), this.getTopographieDAO(), "TopographieDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(equipementStockageDAOEClass, EquipementStockageDAO.class, "EquipementStockageDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEquipementStockageDAO__EquipementStockageDAO(), this.getEquipementStockageDAO(), "EquipementStockageDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionDAOEClass, DimensionDAO.class, "DimensionDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDimensionDAO__DimensionDAO(), this.getDimensionDAO(), "DimensionDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeEquipementDAOEClass, TypeEquipementDAO.class, "TypeEquipementDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeEquipementDAO__TypeEquipementDAO(), this.getTypeEquipementDAO(), "TypeEquipementDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeSimpleDAOEClass, TypeSimpleDAO.class, "TypeSimpleDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeSimpleDAO__TypeSimpleDAO(), this.getTypeSimpleDAO(), "TypeSimpleDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeZoneSecheDAOEClass, TypeZoneSecheDAO.class, "TypeZoneSecheDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeZoneSecheDAO__TypeZoneSecheDAO(), this.getTypeZoneSecheDAO(), "TypeZoneSecheDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeFrigorifiqueDAOEClass, TypeFrigorifiqueDAO.class, "TypeFrigorifiqueDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypeFrigorifiqueDAO__TypeFrigorifiqueDAO(), this.getTypeFrigorifiqueDAO(), "TypeFrigorifiqueDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contrainteDimensionDAOEClass, ContrainteDimensionDAO.class, "ContrainteDimensionDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContrainteDimensionDAO__ContrainteDimensinDAO(), this.getContrainteDimensionDAO(), "ContrainteDimensinDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractDAOEClass, AbstractDAO.class, "AbstractDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractDAO__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDAO__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDAO__Save(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDAO__Find(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controleurEClass, Controleur.class, "Controleur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getControleur__ControleurDAO(), null, "ControleurDAO", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddOperateurEntrepot__OperateurEntrepot(), this.getOperateurEntrepot(), "addOperateurEntrepot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperateurEntrepot(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveOperateurEntrepot__OperateurEntrepot(), this.getOperateurEntrepot(), "removeOperateurEntrepot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperateurEntrepot(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateOperateurEntrepot__OperateurEntrepot(), this.getOperateurEntrepot(), "updateOperateurEntrepot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperateurEntrepot(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllOperateurEntrepot(), this.getOperateurEntrepot(), "getAllOperateurEntrepot", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddZone__Zone(), this.getZone(), "addZone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZone(), "z", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveZone__Zone(), this.getZone(), "removeZone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZone(), "z", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateZone__Zone(), this.getZone(), "updateZone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZone(), "z", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllZone(), this.getZone(), "getAllZone", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTopographie__Topographie(), this.getTopographie(), "addTopographie", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopographie(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTopographique__Topographie(), this.getTopographie(), "removeTopographique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopographie(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTopographie__Topographie(), this.getTopographie(), "updateTopographie", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopographie(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTopograpie(), this.getTopographie(), "getAllTopograpie", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddEquipementStockage__EquipementStockage(), this.getEquipementStockage(), "addEquipementStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquipementStockage(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveEquipementStockage__EquipementStockage(), this.getEquipementStockage(), "removeEquipementStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquipementStockage(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateEquipementStockage__EquipementStockage(), this.getEquipementStockage(), "updateEquipementStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquipementStockage(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllEquipementStockages(), this.getEquipementStockage(), "getAllEquipementStockages", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddDimension__Dimension(), this.getDimension(), "addDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveDimension__Dimension(), this.getDimension(), "removeDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateDimension__Dimension(), this.getDimension(), "updateDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDimension(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllDimension(), this.getDimension(), "getAllDimension", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTypeEquipement__TypeEquipement(), this.getTypeEquipement(), "addTypeEquipement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeEquipement(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTypeEquipement__TypeEquipement(), this.getTypeEquipement(), "removeTypeEquipement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeEquipement(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTypeEquipement__TypeEquipement(), this.getTypeEquipement(), "updateTypeEquipement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeEquipement(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTypeEquipement(), this.getTypeEquipement(), "getAllTypeEquipement", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTypeSimple__TypeSimple(), this.getTypeSimple(), "addTypeSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeSimple(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTypeSimple__TypeSimple(), this.getTypeSimple(), "removeTypeSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeSimple(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTypeSimple__TypeSimple(), this.getTypeSimple(), "updateTypeSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeSimple(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTypeSimple(), this.getTypeSimple(), "getAllTypeSimple", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTypeZoneSeche__TypeZoneSeche(), this.getTypeZoneSeche(), "addTypeZoneSeche", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeZoneSeche(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTypeZoneSeche__TypeZoneSeche(), this.getTypeZoneSeche(), "removeTypeZoneSeche", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeZoneSeche(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTypeZoneSeche__TypeZoneSeche(), this.getTypeZoneSeche(), "updateTypeZoneSeche", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeZoneSeche(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTypeZoneSeche(), this.getTypeZoneSeche(), "getAllTypeZoneSeche", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTypeFrigorifique__TypeFrigorifique(), this.getTypeFrigorifique(), "addTypeFrigorifique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeFrigorifique(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTypeFrigorifique__TypeFrigorifique(), this.getTypeFrigorifique(), "removeTypeFrigorifique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeFrigorifique(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTypeFrigorifique__TypeFrigorifique(), this.getTypeFrigorifique(), "updateTypeFrigorifique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeFrigorifique(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTypeFrigorifique(), this.getTypeFrigorifique(), "getAllTypeFrigorifique", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddContrainteDimension__ContrainteDimension(), this.getContrainteDimension(), "addContrainteDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteDimension(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveContrainteDimension__ContrainteDimension(), this.getContrainteDimension(), "removeContrainteDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteDimension(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateContrainteDimension__ContrainteDimension(), this.getContrainteDimension(), "updateContrainteDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteDimension(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllContrainteDimension(), this.getContrainteDimension(), "getAllContrainteDimension", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddPosition__Position(), this.getPosition(), "addPosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemovePosition__Position(), this.getPosition(), "removePosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdatePosition__Position(), this.getPosition(), "updatePosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllPosition(), this.getPosition(), "getAllPosition", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddModeleCoutProduit__ModeleCoutProduit(), this.getModeleCoutProduit(), "addModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleCoutProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveModeleCoutProduit__ModeleCoutProduit(), this.getModeleCoutProduit(), "removeModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleCoutProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateModeleCoutProduit__ModeleCoutProduit(), this.getModeleCoutProduit(), "updateModeleCoutProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleCoutProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllModeleCoutProduit(), this.getModeleCoutProduit(), "getAllModeleCoutProduit", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddModeleEconomiqueProduit__ModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "addModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleEconomiqueProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveModeleEconomiqueProduit__ModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "removeModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleEconomiqueProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateModeleEconomiqueProduit__ModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "updateModeleEconomiqueProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeleEconomiqueProduit(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllModeleEconomiqueProduit(), this.getModeleEconomiqueProduit(), "getAllModeleEconomiqueProduit", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddLimiteHumidite__LimiteHumidite(), this.getLimiteHumidite(), "addLimiteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteHumidite(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveLimiteHumidite__LimiteHumidite(), this.getLimiteHumidite(), "removeLimiteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteHumidite(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateLimiteHumidite__LimiteHumidite(), this.getLimiteHumidite(), "updateLimiteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteHumidite(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllLimiteHumidite(), this.getLimiteHumidite(), "getAllLimiteHumidite", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddContrainteHumidite__ContrainteHumidite(), this.getContrainteHumidite(), "addContrainteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteHumidite(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveContrainteHumidite__ContrainteHumidite(), this.getContrainteHumidite(), "removeContrainteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteHumidite(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateContrainteHumidite__ContrainteHumidite(), this.getContrainteHumidite(), "updateContrainteHumidite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteHumidite(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllContrainteHumidite(), this.getContrainteHumidite(), "getAllContrainteHumidite", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddLimiteTemperature__LimiteTemperature(), this.getLimiteTemperature(), "addLimiteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteTemperature(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveLimiteTemperature__LimiteTemperature(), this.getLimiteTemperature(), "removeLimiteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteTemperature(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateLimiteTemperature__LimiteTemperature(), this.getLimiteTemperature(), "updateLimiteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLimiteTemperature(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllLimiteTemperature(), this.getLimiteTemperature(), "getAllLimiteTemperature", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddContrainteStockage__ContrainteStockage(), this.getContrainteStockage(), "addContrainteStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteStockage(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveContrainteStockage__ContrainteStockage(), this.getContrainteStockage(), "removeContrainteStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteStockage(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateContrainteStockage__ContrainteStockage(), this.getContrainteStockage(), "updateContrainteStockage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteStockage(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllContrainteStockage(), this.getContrainteStockage(), "getAllContrainteStockage", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddTypeProduit__TypeProduit(), this.getTypeProduit(), "addTypeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeProduit(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveTypeProduit__TypeProduit(), this.getTypeProduit(), "removeTypeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeProduit(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateTypeProduit__TypeProduit(), this.getTypeProduit(), "updateTypeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeProduit(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllTypeProduit(), this.getTypeProduit(), "getAllTypeProduit", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddProduit__Produit(), this.getProduit(), "addProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProduit(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveProduit__Produit(), this.getProduit(), "removeProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProduit(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateProduit__Produit(), this.getProduit(), "updateProduit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProduit(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllProduit(), this.getProduit(), "getAllProduit", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__AddContrainteTemperature__ContrainteTemperature(), this.getContrainteTemperature(), "addContrainteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteTemperature(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__RemoveContrainteTemperature__ContrainteTemperature(), this.getContrainteTemperature(), "removeContrainteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteTemperature(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControleur__UpdateContrainteTemperature__ContrainteTemperature(), this.getContrainteTemperature(), "updateContrainteTemperature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContrainteTemperature(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getControleur__GetAllContrainteTemperature(), this.getContrainteTemperature(), "getAllContrainteTemperature", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(lotProduitEClass, LotProduit.class, "LotProduit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLotProduit_Produits(), this.getProduit(), null, "produits", null, 0, -1, LotProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLotProduit_CoutDeplacementLot(), ecorePackage.getEFloat(), "coutDeplacementLot", null, 0, 1, LotProduit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjetModelePackageImpl
