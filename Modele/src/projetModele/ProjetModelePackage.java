/**
 */
package projetModele;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projetModele.ProjetModeleFactory
 * @model kind="package"
 * @generated
 */
public interface ProjetModelePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projetModele";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projetModele";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projetModele";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetModelePackage eINSTANCE = projetModele.impl.ProjetModelePackageImpl.init();

	/**
	 * The meta object id for the '{@link projetModele.impl.OperateurEntrepotImpl <em>Operateur Entrepot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.OperateurEntrepotImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getOperateurEntrepot()
	 * @generated
	 */
	int OPERATEUR_ENTREPOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPOT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operateur Entrepot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPOT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT = 0;

	/**
	 * The operation id for the '<em>Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT__STRING = 1;

	/**
	 * The number of operations of the '<em>Operateur Entrepot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPOT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.TopographieImpl <em>Topographie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TopographieImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTopographie()
	 * @generated
	 */
	int TOPOGRAPHIE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE__ZONES = 1;

	/**
	 * The number of structural features of the '<em>Topographie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Topographie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE___TOPOGRAPHIE = 0;

	/**
	 * The operation id for the '<em>Topographie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE___TOPOGRAPHIE__STRING_ELIST = 1;

	/**
	 * The number of operations of the '<em>Topographie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ZoneImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ope Entrepots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__OPE_ENTREPOTS = 1;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__POSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Equipement Stockages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__EQUIPEMENT_STOCKAGES = 3;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONES = 4;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___ZONE = 0;

	/**
	 * The operation id for the '<em>Zones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___ZONES__STRING_ELIST_ELIST_ELIST = 1;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '{@link projetModele.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.PositionImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ALTITUDE = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___POSITION = 0;

	/**
	 * The operation id for the '<em>Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___POSITION__FLOAT_FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.DimensionImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HAUTEUR = 0;

	/**
	 * The feature id for the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LARGEUR = 1;

	/**
	 * The feature id for the '<em><b>Profondeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__PROFONDEUR = 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION___DIMENSION = 0;

	/**
	 * The operation id for the '<em>Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION___DIMENSION__FLOAT_FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.EquipementStockageImpl <em>Equipement Stockage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.EquipementStockageImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getEquipementStockage()
	 * @generated
	 */
	int EQUIPEMENT_STOCKAGE = 5;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Occupe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE__OCCUPE = 4;

	/**
	 * The number of structural features of the '<em>Equipement Stockage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Equipement Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE = 0;

	/**
	 * The operation id for the '<em>Equipement Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE__STRING_DIMENSION_POSITION_TYPEEQUIPEMENT = 1;

	/**
	 * The number of operations of the '<em>Equipement Stockage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeEquipementImpl <em>Type Equipement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeEquipementImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeEquipement()
	 * @generated
	 */
	int TYPE_EQUIPEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Equipement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT___TYPE_EQUIPEMENT = 0;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Type Equipement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeSimpleImpl <em>Type Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeSimpleImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeSimple()
	 * @generated
	 */
	int TYPE_SIMPLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE__NAME = TYPE_EQUIPEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_FEATURE_COUNT = TYPE_EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE___TYPE_EQUIPEMENT = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE___TYPE_EQUIPEMENT__STRING = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING;

	/**
	 * The number of operations of the '<em>Type Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_OPERATION_COUNT = TYPE_EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeZoneSecheImpl <em>Type Zone Seche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeZoneSecheImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeZoneSeche()
	 * @generated
	 */
	int TYPE_ZONE_SECHE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE__NAME = TYPE_EQUIPEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contrainte Humidite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE = TYPE_EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Zone Seche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_FEATURE_COUNT = TYPE_EQUIPEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE___TYPE_EQUIPEMENT = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE___TYPE_EQUIPEMENT__STRING = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING;

	/**
	 * The operation id for the '<em>Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE___TYPE_ZONE_SECHE = TYPE_EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE___TYPE_ZONE_SECHE__CONTRAINTEHUMIDITE = TYPE_EQUIPEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Zone Seche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_OPERATION_COUNT = TYPE_EQUIPEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteStockageImpl <em>Contrainte Stockage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteStockageImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteStockage()
	 * @generated
	 */
	int CONTRAINTE_STOCKAGE = 15;

	/**
	 * The number of structural features of the '<em>Contrainte Stockage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contrainte Stockage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteHumiditeImpl <em>Contrainte Humidite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteHumiditeImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteHumidite()
	 * @generated
	 */
	int CONTRAINTE_HUMIDITE = 9;

	/**
	 * The feature id for the '<em><b>Limite Humidite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contrainte Humidite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_FEATURE_COUNT = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE__LIMITEHUMIDITE = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contrainte Humidite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_OPERATION_COUNT = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeFrigorifiqueImpl <em>Type Frigorifique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeFrigorifiqueImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeFrigorifique()
	 * @generated
	 */
	int TYPE_FRIGORIFIQUE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE__NAME = TYPE_EQUIPEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contrainte Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE = TYPE_EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Frigorifique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_FEATURE_COUNT = TYPE_EQUIPEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE___TYPE_EQUIPEMENT = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT;

	/**
	 * The operation id for the '<em>Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE___TYPE_EQUIPEMENT__STRING = TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING;

	/**
	 * The operation id for the '<em>Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE = TYPE_EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE__CONTRAINTETEMPERATURE = TYPE_EQUIPEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Frigorifique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_OPERATION_COUNT = TYPE_EQUIPEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteTemperatureImpl <em>Contrainte Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteTemperatureImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteTemperature()
	 * @generated
	 */
	int CONTRAINTE_TEMPERATURE = 11;

	/**
	 * The feature id for the '<em><b>Limite Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contrainte Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_FEATURE_COUNT = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE__LIMITETEMPERATURE = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contrainte Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_OPERATION_COUNT = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteDimensionImpl <em>Contrainte Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteDimensionImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteDimension()
	 * @generated
	 */
	int CONTRAINTE_DIMENSION = 12;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION__DIMENSION = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contrainte Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_FEATURE_COUNT = CONTRAINTE_STOCKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION__DIMENSION = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contrainte Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_OPERATION_COUNT = CONTRAINTE_STOCKAGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ProduitImpl <em>Produit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ProduitImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getProduit()
	 * @generated
	 */
	int PRODUIT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Limite Conso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__DATE_LIMITE_CONSO = 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Contrainte Stockage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__CONTRAINTE_STOCKAGE = 5;

	/**
	 * The feature id for the '<em><b>Modele Cout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT__MODELE_COUT = 6;

	/**
	 * The number of structural features of the '<em>Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT___PRODUIT = 0;

	/**
	 * The operation id for the '<em>Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT___PRODUIT__STRING_FLOAT_FLOAT_DATE_TYPEPRODUIT_POSITION_DIMENSION_CONTRAINTESTOCKAGE = 1;

	/**
	 * The number of operations of the '<em>Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeProduitImpl <em>Type Produit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeProduitImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeProduit()
	 * @generated
	 */
	int TYPE_PRODUIT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT___TYPE_PRODUIT = 0;

	/**
	 * The operation id for the '<em>Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT___TYPE_PRODUIT__STRING = 1;

	/**
	 * The number of operations of the '<em>Type Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.LimiteTemperatureImpl <em>Limite Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.LimiteTemperatureImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteTemperature()
	 * @generated
	 */
	int LIMITE_TEMPERATURE = 16;

	/**
	 * The feature id for the '<em><b>Temperature Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE__TEMPERATURE_MIN = 0;

	/**
	 * The feature id for the '<em><b>Temperature Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE__TEMPERATURE_MAX = 1;

	/**
	 * The number of structural features of the '<em>Limite Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE___LIMITE_TEMPERATURE = 0;

	/**
	 * The operation id for the '<em>Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE___LIMITE_TEMPERATURE__FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Limite Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.LimiteHumiditeImpl <em>Limite Humidite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.LimiteHumiditeImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteHumidite()
	 * @generated
	 */
	int LIMITE_HUMIDITE = 17;

	/**
	 * The feature id for the '<em><b>Humi Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE__HUMI_MIN = 0;

	/**
	 * The feature id for the '<em><b>Humi Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE__HUMI_MAX = 1;

	/**
	 * The number of structural features of the '<em>Limite Humidite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE___LIMITE_HUMIDITE = 0;

	/**
	 * The operation id for the '<em>Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE___LIMITE_HUMIDITE__FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Limite Humidite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ModeleCoutProduitImpl <em>Modele Cout Produit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ModeleCoutProduitImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getModeleCoutProduit()
	 * @generated
	 */
	int MODELE_COUT_PRODUIT = 18;

	/**
	 * The feature id for the '<em><b>Cout Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT__COUT_STOCK = 0;

	/**
	 * The feature id for the '<em><b>Cout De Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT__COUT_DE_STOCK = 1;

	/**
	 * The feature id for the '<em><b>Cout Deplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT__COUT_DEPLACEMENT = 2;

	/**
	 * The number of structural features of the '<em>Modele Cout Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT = 0;

	/**
	 * The operation id for the '<em>Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT__FLOAT_FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Modele Cout Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.ModeleEconomiqueProduitImpl <em>Modele Economique Produit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ModeleEconomiqueProduitImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getModeleEconomiqueProduit()
	 * @generated
	 */
	int MODELE_ECONOMIQUE_PRODUIT = 19;

	/**
	 * The feature id for the '<em><b>Modele Cout Produit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT = 0;

	/**
	 * The feature id for the '<em><b>Produit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT__PRODUIT = 1;

	/**
	 * The number of structural features of the '<em>Modele Economique Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT = 0;

	/**
	 * The operation id for the '<em>Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT__MODELECOUTPRODUIT_PRODUIT = 1;

	/**
	 * The number of operations of the '<em>Modele Economique Produit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projetModele.impl.AbstractDAOImpl <em>Abstract DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.AbstractDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getAbstractDAO()
	 * @generated
	 */
	int ABSTRACT_DAO = 40;

	/**
	 * The number of structural features of the '<em>Abstract DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO___CREATE = 0;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO___DELETE = 1;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO___SAVE = 2;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO___FIND = 3;

	/**
	 * The number of operations of the '<em>Abstract DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DAO_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link projetModele.impl.OperateurEntreprotDAOImpl <em>Operateur Entreprot DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.OperateurEntreprotDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getOperateurEntreprotDAO()
	 * @generated
	 */
	int OPERATEUR_ENTREPROT_DAO = 20;

	/**
	 * The number of structural features of the '<em>Operateur Entreprot DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Operateur Entrepot DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO___OPERATEUR_ENTREPOT_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operateur Entreprot DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_ENTREPROT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteHumiditeDAOImpl <em>Contrainte Humidite DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteHumiditeDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteHumiditeDAO()
	 * @generated
	 */
	int CONTRAINTE_HUMIDITE_DAO = 21;

	/**
	 * The number of structural features of the '<em>Contrainte Humidite DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Contrainte Humidite DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO___CONTRAINTE_HUMIDITE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contrainte Humidite DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_HUMIDITE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.LimiteHumiditeDAOImpl <em>Limite Humidite DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.LimiteHumiditeDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteHumiditeDAO()
	 * @generated
	 */
	int LIMITE_HUMIDITE_DAO = 22;

	/**
	 * The number of structural features of the '<em>Limite Humidite DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Limite Humidite DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO___LIMITE_HUMIDITE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limite Humidite DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_HUMIDITE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ModeleEconomiqueProduitDAOImpl <em>Modele Economique Produit DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ModeleEconomiqueProduitDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getModeleEconomiqueProduitDAO()
	 * @generated
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO = 23;

	/**
	 * The number of structural features of the '<em>Modele Economique Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO___MODELE_ECONOMIQUE_PRODUIT = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modele Economique Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_ECONOMIQUE_PRODUIT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.LimiteTemperatureDAOImpl <em>Limite Temperature DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.LimiteTemperatureDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteTemperatureDAO()
	 * @generated
	 */
	int LIMITE_TEMPERATURE_DAO = 24;

	/**
	 * The number of structural features of the '<em>Limite Temperature DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Limite Temperature DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO___LIMITE_TEMPERATURE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limite Temperature DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITE_TEMPERATURE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteStockageDAOImpl <em>Contrainte Stockage DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteStockageDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteStockageDAO()
	 * @generated
	 */
	int CONTRAINTE_STOCKAGE_DAO = 25;

	/**
	 * The number of structural features of the '<em>Contrainte Stockage DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Contrainte Stockage DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO___CONTRAINTE_STOCKAGE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contrainte Stockage DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_STOCKAGE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeProduitDAOImpl <em>Type Produit DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeProduitDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeProduitDAO()
	 * @generated
	 */
	int TYPE_PRODUIT_DAO = 26;

	/**
	 * The number of structural features of the '<em>Type Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Type Produit DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO___TYPE_PRODUIT_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PRODUIT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ProduitDAOImpl <em>Produit DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ProduitDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getProduitDAO()
	 * @generated
	 */
	int PRODUIT_DAO = 27;

	/**
	 * The number of structural features of the '<em>Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Produit DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO___PRODUIT_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUIT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteTemperatureDAOImpl <em>Contrainte Temperature DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteTemperatureDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteTemperatureDAO()
	 * @generated
	 */
	int CONTRAINTE_TEMPERATURE_DAO = 28;

	/**
	 * The number of structural features of the '<em>Contrainte Temperature DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Contrainte Temperature DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO___CONTRAINTE_TEMPERATURE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contrainte Temperature DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TEMPERATURE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ModeleCoutProduitDAOImpl <em>Modele Cout Produit DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ModeleCoutProduitDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getModeleCoutProduitDAO()
	 * @generated
	 */
	int MODELE_COUT_PRODUIT_DAO = 29;

	/**
	 * The number of structural features of the '<em>Modele Cout Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO___MODELE_COUT_PRODUIT = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modele Cout Produit DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELE_COUT_PRODUIT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.PositionDAOImpl <em>Position DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.PositionDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getPositionDAO()
	 * @generated
	 */
	int POSITION_DAO = 30;

	/**
	 * The number of structural features of the '<em>Position DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Position DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO___POSITION_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ZoneDAOImpl <em>Zone DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ZoneDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getZoneDAO()
	 * @generated
	 */
	int ZONE_DAO = 31;

	/**
	 * The number of structural features of the '<em>Zone DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Zone DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO___ZONE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zone DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TopographieDAOImpl <em>Topographie DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TopographieDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTopographieDAO()
	 * @generated
	 */
	int TOPOGRAPHIE_DAO = 32;

	/**
	 * The number of structural features of the '<em>Topographie DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Topographie DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO___TOPOGRAPHIE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topographie DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOGRAPHIE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.EquipementStockageDAOImpl <em>Equipement Stockage DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.EquipementStockageDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getEquipementStockageDAO()
	 * @generated
	 */
	int EQUIPEMENT_STOCKAGE_DAO = 33;

	/**
	 * The number of structural features of the '<em>Equipement Stockage DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Equipement Stockage DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO___EQUIPEMENT_STOCKAGE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equipement Stockage DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_STOCKAGE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.DimensionDAOImpl <em>Dimension DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.DimensionDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getDimensionDAO()
	 * @generated
	 */
	int DIMENSION_DAO = 34;

	/**
	 * The number of structural features of the '<em>Dimension DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Dimension DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO___DIMENSION_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dimension DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeEquipementDAOImpl <em>Type Equipement DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeEquipementDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeEquipementDAO()
	 * @generated
	 */
	int TYPE_EQUIPEMENT_DAO = 35;

	/**
	 * The number of structural features of the '<em>Type Equipement DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Type Equipement DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO___TYPE_EQUIPEMENT_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Equipement DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EQUIPEMENT_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeSimpleDAOImpl <em>Type Simple DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeSimpleDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeSimpleDAO()
	 * @generated
	 */
	int TYPE_SIMPLE_DAO = 36;

	/**
	 * The number of structural features of the '<em>Type Simple DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Type Simple DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO___TYPE_SIMPLE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Simple DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SIMPLE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeZoneSecheDAOImpl <em>Type Zone Seche DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeZoneSecheDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeZoneSecheDAO()
	 * @generated
	 */
	int TYPE_ZONE_SECHE_DAO = 37;

	/**
	 * The number of structural features of the '<em>Type Zone Seche DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Type Zone Seche DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO___TYPE_ZONE_SECHE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Zone Seche DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ZONE_SECHE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.TypeFrigorifiqueDAOImpl <em>Type Frigorifique DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.TypeFrigorifiqueDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getTypeFrigorifiqueDAO()
	 * @generated
	 */
	int TYPE_FRIGORIFIQUE_DAO = 38;

	/**
	 * The number of structural features of the '<em>Type Frigorifique DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Type Frigorifique DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO___TYPE_FRIGORIFIQUE_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Frigorifique DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FRIGORIFIQUE_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ContrainteDimensionDAOImpl <em>Contrainte Dimension DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ContrainteDimensionDAOImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteDimensionDAO()
	 * @generated
	 */
	int CONTRAINTE_DIMENSION_DAO = 39;

	/**
	 * The number of structural features of the '<em>Contrainte Dimension DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO_FEATURE_COUNT = ABSTRACT_DAO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO___CREATE = ABSTRACT_DAO___CREATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO___DELETE = ABSTRACT_DAO___DELETE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO___SAVE = ABSTRACT_DAO___SAVE;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO___FIND = ABSTRACT_DAO___FIND;

	/**
	 * The operation id for the '<em>Contrainte Dimensin DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO___CONTRAINTE_DIMENSIN_DAO = ABSTRACT_DAO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contrainte Dimension DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_DIMENSION_DAO_OPERATION_COUNT = ABSTRACT_DAO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link projetModele.impl.ControleurImpl <em>Controleur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetModele.impl.ControleurImpl
	 * @see projetModele.impl.ProjetModelePackageImpl#getControleur()
	 * @generated
	 */
	int CONTROLEUR = 41;

	/**
	 * The number of structural features of the '<em>Controleur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Controleur DAO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___CONTROLEUR_DAO = 0;

	/**
	 * The operation id for the '<em>Add Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = 1;

	/**
	 * The operation id for the '<em>Remove Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = 2;

	/**
	 * The operation id for the '<em>Update Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = 3;

	/**
	 * The operation id for the '<em>Get All Operateur Entrepot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_OPERATEUR_ENTREPOT = 4;

	/**
	 * The operation id for the '<em>Add Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_ZONE__ZONE = 5;

	/**
	 * The operation id for the '<em>Remove Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_ZONE__ZONE = 6;

	/**
	 * The operation id for the '<em>Update Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_ZONE__ZONE = 7;

	/**
	 * The operation id for the '<em>Get All Zone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_ZONE = 8;

	/**
	 * The operation id for the '<em>Add Topographie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TOPOGRAPHIE__TOPOGRAPHIE = 9;

	/**
	 * The operation id for the '<em>Remove Topographique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TOPOGRAPHIQUE__TOPOGRAPHIE = 10;

	/**
	 * The operation id for the '<em>Update Topographie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TOPOGRAPHIE__TOPOGRAPHIE = 11;

	/**
	 * The operation id for the '<em>Get All Topograpie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TOPOGRAPIE = 12;

	/**
	 * The operation id for the '<em>Add Equipement Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = 13;

	/**
	 * The operation id for the '<em>Remove Equipement Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = 14;

	/**
	 * The operation id for the '<em>Update Equipement Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = 15;

	/**
	 * The operation id for the '<em>Get All Equipement Stockages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_EQUIPEMENT_STOCKAGES = 16;

	/**
	 * The operation id for the '<em>Add Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_DIMENSION__DIMENSION = 17;

	/**
	 * The operation id for the '<em>Remove Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_DIMENSION__DIMENSION = 18;

	/**
	 * The operation id for the '<em>Update Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_DIMENSION__DIMENSION = 19;

	/**
	 * The operation id for the '<em>Get All Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_DIMENSION = 20;

	/**
	 * The operation id for the '<em>Add Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = 21;

	/**
	 * The operation id for the '<em>Remove Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = 22;

	/**
	 * The operation id for the '<em>Update Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = 23;

	/**
	 * The operation id for the '<em>Get All Type Equipement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TYPE_EQUIPEMENT = 24;

	/**
	 * The operation id for the '<em>Add Type Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TYPE_SIMPLE__TYPESIMPLE = 25;

	/**
	 * The operation id for the '<em>Remove Type Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TYPE_SIMPLE__TYPESIMPLE = 26;

	/**
	 * The operation id for the '<em>Update Type Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TYPE_SIMPLE__TYPESIMPLE = 27;

	/**
	 * The operation id for the '<em>Get All Type Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TYPE_SIMPLE = 28;

	/**
	 * The operation id for the '<em>Add Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TYPE_ZONE_SECHE__TYPEZONESECHE = 29;

	/**
	 * The operation id for the '<em>Remove Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TYPE_ZONE_SECHE__TYPEZONESECHE = 30;

	/**
	 * The operation id for the '<em>Update Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TYPE_ZONE_SECHE__TYPEZONESECHE = 31;

	/**
	 * The operation id for the '<em>Get All Type Zone Seche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TYPE_ZONE_SECHE = 32;

	/**
	 * The operation id for the '<em>Add Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = 33;

	/**
	 * The operation id for the '<em>Remove Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = 34;

	/**
	 * The operation id for the '<em>Update Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = 35;

	/**
	 * The operation id for the '<em>Get All Type Frigorifique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TYPE_FRIGORIFIQUE = 36;

	/**
	 * The operation id for the '<em>Add Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = 37;

	/**
	 * The operation id for the '<em>Remove Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = 38;

	/**
	 * The operation id for the '<em>Update Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = 39;

	/**
	 * The operation id for the '<em>Get All Contrainte Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_CONTRAINTE_DIMENSION = 40;

	/**
	 * The operation id for the '<em>Add Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_POSITION__POSITION = 41;

	/**
	 * The operation id for the '<em>Remove Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_POSITION__POSITION = 42;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_POSITION__POSITION = 43;

	/**
	 * The operation id for the '<em>Get All Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_POSITION = 44;

	/**
	 * The operation id for the '<em>Add Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = 45;

	/**
	 * The operation id for the '<em>Remove Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = 46;

	/**
	 * The operation id for the '<em>Update Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = 47;

	/**
	 * The operation id for the '<em>Get All Modele Cout Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_MODELE_COUT_PRODUIT = 48;

	/**
	 * The operation id for the '<em>Add Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = 49;

	/**
	 * The operation id for the '<em>Remove Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = 50;

	/**
	 * The operation id for the '<em>Update Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = 51;

	/**
	 * The operation id for the '<em>Get All Modele Economique Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_MODELE_ECONOMIQUE_PRODUIT = 52;

	/**
	 * The operation id for the '<em>Add Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_LIMITE_HUMIDITE__LIMITEHUMIDITE = 53;

	/**
	 * The operation id for the '<em>Remove Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_LIMITE_HUMIDITE__LIMITEHUMIDITE = 54;

	/**
	 * The operation id for the '<em>Update Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_LIMITE_HUMIDITE__LIMITEHUMIDITE = 55;

	/**
	 * The operation id for the '<em>Get All Limite Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_LIMITE_HUMIDITE = 56;

	/**
	 * The operation id for the '<em>Add Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = 57;

	/**
	 * The operation id for the '<em>Remove Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = 58;

	/**
	 * The operation id for the '<em>Update Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = 59;

	/**
	 * The operation id for the '<em>Get All Contrainte Humidite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_CONTRAINTE_HUMIDITE = 60;

	/**
	 * The operation id for the '<em>Add Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_LIMITE_TEMPERATURE__LIMITETEMPERATURE = 61;

	/**
	 * The operation id for the '<em>Remove Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_LIMITE_TEMPERATURE__LIMITETEMPERATURE = 62;

	/**
	 * The operation id for the '<em>Update Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_LIMITE_TEMPERATURE__LIMITETEMPERATURE = 63;

	/**
	 * The operation id for the '<em>Get All Limite Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_LIMITE_TEMPERATURE = 64;

	/**
	 * The operation id for the '<em>Add Contrainte Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = 65;

	/**
	 * The operation id for the '<em>Remove Contrainte Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = 66;

	/**
	 * The operation id for the '<em>Update Contrainte Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = 67;

	/**
	 * The operation id for the '<em>Get All Contrainte Stockage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_CONTRAINTE_STOCKAGE = 68;

	/**
	 * The operation id for the '<em>Add Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_TYPE_PRODUIT__TYPEPRODUIT = 69;

	/**
	 * The operation id for the '<em>Remove Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_TYPE_PRODUIT__TYPEPRODUIT = 70;

	/**
	 * The operation id for the '<em>Update Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_TYPE_PRODUIT__TYPEPRODUIT = 71;

	/**
	 * The operation id for the '<em>Get All Type Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_TYPE_PRODUIT = 72;

	/**
	 * The operation id for the '<em>Add Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_PRODUIT__PRODUIT = 73;

	/**
	 * The operation id for the '<em>Remove Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_PRODUIT__PRODUIT = 74;

	/**
	 * The operation id for the '<em>Update Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_PRODUIT__PRODUIT = 75;

	/**
	 * The operation id for the '<em>Get All Produit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_PRODUIT = 76;

	/**
	 * The operation id for the '<em>Add Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___ADD_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = 77;

	/**
	 * The operation id for the '<em>Remove Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___REMOVE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = 78;

	/**
	 * The operation id for the '<em>Update Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___UPDATE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = 79;

	/**
	 * The operation id for the '<em>Get All Contrainte Temperature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR___GET_ALL_CONTRAINTE_TEMPERATURE = 80;

	/**
	 * The number of operations of the '<em>Controleur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLEUR_OPERATION_COUNT = 81;


	/**
	 * Returns the meta object for class '{@link projetModele.OperateurEntrepot <em>Operateur Entrepot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Entrepot</em>'.
	 * @see projetModele.OperateurEntrepot
	 * @generated
	 */
	EClass getOperateurEntrepot();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.OperateurEntrepot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.OperateurEntrepot#getName()
	 * @see #getOperateurEntrepot()
	 * @generated
	 */
	EAttribute getOperateurEntrepot_Name();

	/**
	 * Returns the meta object for the '{@link projetModele.OperateurEntrepot#OperateurEntrepot() <em>Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operateur Entrepot</em>' operation.
	 * @see projetModele.OperateurEntrepot#OperateurEntrepot()
	 * @generated
	 */
	EOperation getOperateurEntrepot__OperateurEntrepot();

	/**
	 * Returns the meta object for the '{@link projetModele.OperateurEntrepot#OperateurEntrepot(java.lang.String) <em>Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operateur Entrepot</em>' operation.
	 * @see projetModele.OperateurEntrepot#OperateurEntrepot(java.lang.String)
	 * @generated
	 */
	EOperation getOperateurEntrepot__OperateurEntrepot__String();

	/**
	 * Returns the meta object for class '{@link projetModele.Topographie <em>Topographie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topographie</em>'.
	 * @see projetModele.Topographie
	 * @generated
	 */
	EClass getTopographie();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Topographie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.Topographie#getName()
	 * @see #getTopographie()
	 * @generated
	 */
	EAttribute getTopographie_Name();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Topographie#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zones</em>'.
	 * @see projetModele.Topographie#getZones()
	 * @see #getTopographie()
	 * @generated
	 */
	EReference getTopographie_Zones();

	/**
	 * Returns the meta object for the '{@link projetModele.Topographie#Topographie() <em>Topographie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Topographie</em>' operation.
	 * @see projetModele.Topographie#Topographie()
	 * @generated
	 */
	EOperation getTopographie__Topographie();

	/**
	 * Returns the meta object for the '{@link projetModele.Topographie#Topographie(java.lang.String, org.eclipse.emf.common.util.EList) <em>Topographie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Topographie</em>' operation.
	 * @see projetModele.Topographie#Topographie(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTopographie__Topographie__String_EList();

	/**
	 * Returns the meta object for class '{@link projetModele.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see projetModele.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Zone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.Zone#getName()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Name();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Zone#getOpeEntrepots <em>Ope Entrepots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ope Entrepots</em>'.
	 * @see projetModele.Zone#getOpeEntrepots()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_OpeEntrepots();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Zone#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positions</em>'.
	 * @see projetModele.Zone#getPositions()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Positions();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Zone#getEquipementStockages <em>Equipement Stockages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipement Stockages</em>'.
	 * @see projetModele.Zone#getEquipementStockages()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_EquipementStockages();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Zone#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zones</em>'.
	 * @see projetModele.Zone#getZones()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Zones();

	/**
	 * Returns the meta object for the '{@link projetModele.Zone#Zone() <em>Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zone</em>' operation.
	 * @see projetModele.Zone#Zone()
	 * @generated
	 */
	EOperation getZone__Zone();

	/**
	 * Returns the meta object for the '{@link projetModele.Zone#Zones(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Zones</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zones</em>' operation.
	 * @see projetModele.Zone#Zones(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getZone__Zones__String_EList_EList_EList();

	/**
	 * Returns the meta object for class '{@link projetModele.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see projetModele.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Position#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see projetModele.Position#getLongitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Position#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see projetModele.Position#getLatitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Position#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see projetModele.Position#getAltitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Altitude();

	/**
	 * Returns the meta object for the '{@link projetModele.Position#Position() <em>Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position</em>' operation.
	 * @see projetModele.Position#Position()
	 * @generated
	 */
	EOperation getPosition__Position();

	/**
	 * Returns the meta object for the '{@link projetModele.Position#Position(float, float, float) <em>Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position</em>' operation.
	 * @see projetModele.Position#Position(float, float, float)
	 * @generated
	 */
	EOperation getPosition__Position__float_float_float();

	/**
	 * Returns the meta object for class '{@link projetModele.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see projetModele.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Dimension#getHauteur <em>Hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hauteur</em>'.
	 * @see projetModele.Dimension#getHauteur()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Hauteur();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Dimension#getLargeur <em>Largeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largeur</em>'.
	 * @see projetModele.Dimension#getLargeur()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Largeur();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Dimension#getProfondeur <em>Profondeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profondeur</em>'.
	 * @see projetModele.Dimension#getProfondeur()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Profondeur();

	/**
	 * Returns the meta object for the '{@link projetModele.Dimension#Dimension() <em>Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension</em>' operation.
	 * @see projetModele.Dimension#Dimension()
	 * @generated
	 */
	EOperation getDimension__Dimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Dimension#Dimension(float, float, float) <em>Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension</em>' operation.
	 * @see projetModele.Dimension#Dimension(float, float, float)
	 * @generated
	 */
	EOperation getDimension__Dimension__float_float_float();

	/**
	 * Returns the meta object for class '{@link projetModele.EquipementStockage <em>Equipement Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipement Stockage</em>'.
	 * @see projetModele.EquipementStockage
	 * @generated
	 */
	EClass getEquipementStockage();

	/**
	 * Returns the meta object for the reference '{@link projetModele.EquipementStockage#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see projetModele.EquipementStockage#getDimension()
	 * @see #getEquipementStockage()
	 * @generated
	 */
	EReference getEquipementStockage_Dimension();

	/**
	 * Returns the meta object for the reference '{@link projetModele.EquipementStockage#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see projetModele.EquipementStockage#getPosition()
	 * @see #getEquipementStockage()
	 * @generated
	 */
	EReference getEquipementStockage_Position();

	/**
	 * Returns the meta object for the reference '{@link projetModele.EquipementStockage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see projetModele.EquipementStockage#getType()
	 * @see #getEquipementStockage()
	 * @generated
	 */
	EReference getEquipementStockage_Type();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.EquipementStockage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.EquipementStockage#getName()
	 * @see #getEquipementStockage()
	 * @generated
	 */
	EAttribute getEquipementStockage_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.EquipementStockage#isOccupe <em>Occupe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupe</em>'.
	 * @see projetModele.EquipementStockage#isOccupe()
	 * @see #getEquipementStockage()
	 * @generated
	 */
	EAttribute getEquipementStockage_Occupe();

	/**
	 * Returns the meta object for the '{@link projetModele.EquipementStockage#EquipementStockage() <em>Equipement Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equipement Stockage</em>' operation.
	 * @see projetModele.EquipementStockage#EquipementStockage()
	 * @generated
	 */
	EOperation getEquipementStockage__EquipementStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.EquipementStockage#EquipementStockage(java.lang.String, projetModele.Dimension, projetModele.Position, projetModele.TypeEquipement) <em>Equipement Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equipement Stockage</em>' operation.
	 * @see projetModele.EquipementStockage#EquipementStockage(java.lang.String, projetModele.Dimension, projetModele.Position, projetModele.TypeEquipement)
	 * @generated
	 */
	EOperation getEquipementStockage__EquipementStockage__String_Dimension_Position_TypeEquipement();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeEquipement <em>Type Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Equipement</em>'.
	 * @see projetModele.TypeEquipement
	 * @generated
	 */
	EClass getTypeEquipement();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.TypeEquipement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.TypeEquipement#getName()
	 * @see #getTypeEquipement()
	 * @generated
	 */
	EAttribute getTypeEquipement_Name();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeEquipement#TypeEquipement() <em>Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Equipement</em>' operation.
	 * @see projetModele.TypeEquipement#TypeEquipement()
	 * @generated
	 */
	EOperation getTypeEquipement__TypeEquipement();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeEquipement#TypeEquipement(java.lang.String) <em>Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Equipement</em>' operation.
	 * @see projetModele.TypeEquipement#TypeEquipement(java.lang.String)
	 * @generated
	 */
	EOperation getTypeEquipement__TypeEquipement__String();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeSimple <em>Type Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Simple</em>'.
	 * @see projetModele.TypeSimple
	 * @generated
	 */
	EClass getTypeSimple();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeZoneSeche <em>Type Zone Seche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Zone Seche</em>'.
	 * @see projetModele.TypeZoneSeche
	 * @generated
	 */
	EClass getTypeZoneSeche();

	/**
	 * Returns the meta object for the reference '{@link projetModele.TypeZoneSeche#getContrainteHumidite <em>Contrainte Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contrainte Humidite</em>'.
	 * @see projetModele.TypeZoneSeche#getContrainteHumidite()
	 * @see #getTypeZoneSeche()
	 * @generated
	 */
	EReference getTypeZoneSeche_ContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeZoneSeche#TypeZoneSeche() <em>Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Zone Seche</em>' operation.
	 * @see projetModele.TypeZoneSeche#TypeZoneSeche()
	 * @generated
	 */
	EOperation getTypeZoneSeche__TypeZoneSeche();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeZoneSeche#TypeZoneSeche(projetModele.ContrainteHumidite) <em>Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Zone Seche</em>' operation.
	 * @see projetModele.TypeZoneSeche#TypeZoneSeche(projetModele.ContrainteHumidite)
	 * @generated
	 */
	EOperation getTypeZoneSeche__TypeZoneSeche__ContrainteHumidite();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteHumidite <em>Contrainte Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Humidite</em>'.
	 * @see projetModele.ContrainteHumidite
	 * @generated
	 */
	EClass getContrainteHumidite();

	/**
	 * Returns the meta object for the reference '{@link projetModele.ContrainteHumidite#getLimiteHumidite <em>Limite Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limite Humidite</em>'.
	 * @see projetModele.ContrainteHumidite#getLimiteHumidite()
	 * @see #getContrainteHumidite()
	 * @generated
	 */
	EReference getContrainteHumidite_LimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteHumidite#ContrainteHumidite() <em>Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Humidite</em>' operation.
	 * @see projetModele.ContrainteHumidite#ContrainteHumidite()
	 * @generated
	 */
	EOperation getContrainteHumidite__ContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteHumidite#ContrainteHumidite(projetModele.LimiteHumidite) <em>Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Humidite</em>' operation.
	 * @see projetModele.ContrainteHumidite#ContrainteHumidite(projetModele.LimiteHumidite)
	 * @generated
	 */
	EOperation getContrainteHumidite__ContrainteHumidite__LimiteHumidite();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeFrigorifique <em>Type Frigorifique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Frigorifique</em>'.
	 * @see projetModele.TypeFrigorifique
	 * @generated
	 */
	EClass getTypeFrigorifique();

	/**
	 * Returns the meta object for the reference '{@link projetModele.TypeFrigorifique#getContrainteTemperature <em>Contrainte Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contrainte Temperature</em>'.
	 * @see projetModele.TypeFrigorifique#getContrainteTemperature()
	 * @see #getTypeFrigorifique()
	 * @generated
	 */
	EReference getTypeFrigorifique_ContrainteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeFrigorifique#TypeFrigorifique() <em>Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Frigorifique</em>' operation.
	 * @see projetModele.TypeFrigorifique#TypeFrigorifique()
	 * @generated
	 */
	EOperation getTypeFrigorifique__TypeFrigorifique();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeFrigorifique#TypeFrigorifique(projetModele.ContrainteTemperature) <em>Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Frigorifique</em>' operation.
	 * @see projetModele.TypeFrigorifique#TypeFrigorifique(projetModele.ContrainteTemperature)
	 * @generated
	 */
	EOperation getTypeFrigorifique__TypeFrigorifique__ContrainteTemperature();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteTemperature <em>Contrainte Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Temperature</em>'.
	 * @see projetModele.ContrainteTemperature
	 * @generated
	 */
	EClass getContrainteTemperature();

	/**
	 * Returns the meta object for the reference '{@link projetModele.ContrainteTemperature#getLimiteTemperature <em>Limite Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limite Temperature</em>'.
	 * @see projetModele.ContrainteTemperature#getLimiteTemperature()
	 * @see #getContrainteTemperature()
	 * @generated
	 */
	EReference getContrainteTemperature_LimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteTemperature#ContrainteTemperature() <em>Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Temperature</em>' operation.
	 * @see projetModele.ContrainteTemperature#ContrainteTemperature()
	 * @generated
	 */
	EOperation getContrainteTemperature__ContrainteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteTemperature#ContrainteTemperature(projetModele.LimiteTemperature) <em>Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Temperature</em>' operation.
	 * @see projetModele.ContrainteTemperature#ContrainteTemperature(projetModele.LimiteTemperature)
	 * @generated
	 */
	EOperation getContrainteTemperature__ContrainteTemperature__LimiteTemperature();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteDimension <em>Contrainte Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Dimension</em>'.
	 * @see projetModele.ContrainteDimension
	 * @generated
	 */
	EClass getContrainteDimension();

	/**
	 * Returns the meta object for the reference '{@link projetModele.ContrainteDimension#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see projetModele.ContrainteDimension#getDimension()
	 * @see #getContrainteDimension()
	 * @generated
	 */
	EReference getContrainteDimension_Dimension();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteDimension#ContrainteDimension() <em>Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Dimension</em>' operation.
	 * @see projetModele.ContrainteDimension#ContrainteDimension()
	 * @generated
	 */
	EOperation getContrainteDimension__ContrainteDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteDimension#ContrainteDimension(projetModele.Dimension) <em>Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Dimension</em>' operation.
	 * @see projetModele.ContrainteDimension#ContrainteDimension(projetModele.Dimension)
	 * @generated
	 */
	EOperation getContrainteDimension__ContrainteDimension__Dimension();

	/**
	 * Returns the meta object for class '{@link projetModele.Produit <em>Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produit</em>'.
	 * @see projetModele.Produit
	 * @generated
	 */
	EClass getProduit();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Produit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.Produit#getName()
	 * @see #getProduit()
	 * @generated
	 */
	EAttribute getProduit_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.Produit#getDateLimiteConso <em>Date Limite Conso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Limite Conso</em>'.
	 * @see projetModele.Produit#getDateLimiteConso()
	 * @see #getProduit()
	 * @generated
	 */
	EAttribute getProduit_DateLimiteConso();

	/**
	 * Returns the meta object for the reference '{@link projetModele.Produit#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see projetModele.Produit#getDimension()
	 * @see #getProduit()
	 * @generated
	 */
	EReference getProduit_Dimension();

	/**
	 * Returns the meta object for the reference '{@link projetModele.Produit#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see projetModele.Produit#getPosition()
	 * @see #getProduit()
	 * @generated
	 */
	EReference getProduit_Position();

	/**
	 * Returns the meta object for the reference '{@link projetModele.Produit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see projetModele.Produit#getType()
	 * @see #getProduit()
	 * @generated
	 */
	EReference getProduit_Type();

	/**
	 * Returns the meta object for the reference list '{@link projetModele.Produit#getContrainteStockage <em>Contrainte Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contrainte Stockage</em>'.
	 * @see projetModele.Produit#getContrainteStockage()
	 * @see #getProduit()
	 * @generated
	 */
	EReference getProduit_ContrainteStockage();

	/**
	 * Returns the meta object for the reference '{@link projetModele.Produit#getModeleCout <em>Modele Cout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modele Cout</em>'.
	 * @see projetModele.Produit#getModeleCout()
	 * @see #getProduit()
	 * @generated
	 */
	EReference getProduit_ModeleCout();

	/**
	 * Returns the meta object for the '{@link projetModele.Produit#Produit() <em>Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Produit</em>' operation.
	 * @see projetModele.Produit#Produit()
	 * @generated
	 */
	EOperation getProduit__Produit();

	/**
	 * Returns the meta object for the '{@link projetModele.Produit#Produit(java.lang.String, float, float, java.util.Date, projetModele.TypeProduit, projetModele.Position, projetModele.Dimension, projetModele.ContrainteStockage) <em>Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Produit</em>' operation.
	 * @see projetModele.Produit#Produit(java.lang.String, float, float, java.util.Date, projetModele.TypeProduit, projetModele.Position, projetModele.Dimension, projetModele.ContrainteStockage)
	 * @generated
	 */
	EOperation getProduit__Produit__String_float_float_Date_TypeProduit_Position_Dimension_ContrainteStockage();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeProduit <em>Type Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Produit</em>'.
	 * @see projetModele.TypeProduit
	 * @generated
	 */
	EClass getTypeProduit();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.TypeProduit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetModele.TypeProduit#getName()
	 * @see #getTypeProduit()
	 * @generated
	 */
	EAttribute getTypeProduit_Name();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeProduit#TypeProduit() <em>Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Produit</em>' operation.
	 * @see projetModele.TypeProduit#TypeProduit()
	 * @generated
	 */
	EOperation getTypeProduit__TypeProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeProduit#TypeProduit(java.lang.String) <em>Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Produit</em>' operation.
	 * @see projetModele.TypeProduit#TypeProduit(java.lang.String)
	 * @generated
	 */
	EOperation getTypeProduit__TypeProduit__String();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteStockage <em>Contrainte Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Stockage</em>'.
	 * @see projetModele.ContrainteStockage
	 * @generated
	 */
	EClass getContrainteStockage();

	/**
	 * Returns the meta object for class '{@link projetModele.LimiteTemperature <em>Limite Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limite Temperature</em>'.
	 * @see projetModele.LimiteTemperature
	 * @generated
	 */
	EClass getLimiteTemperature();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.LimiteTemperature#getTemperatureMin <em>Temperature Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Min</em>'.
	 * @see projetModele.LimiteTemperature#getTemperatureMin()
	 * @see #getLimiteTemperature()
	 * @generated
	 */
	EAttribute getLimiteTemperature_TemperatureMin();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.LimiteTemperature#getTemperatureMax <em>Temperature Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Max</em>'.
	 * @see projetModele.LimiteTemperature#getTemperatureMax()
	 * @see #getLimiteTemperature()
	 * @generated
	 */
	EAttribute getLimiteTemperature_TemperatureMax();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteTemperature#LimiteTemperature() <em>Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Temperature</em>' operation.
	 * @see projetModele.LimiteTemperature#LimiteTemperature()
	 * @generated
	 */
	EOperation getLimiteTemperature__LimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteTemperature#LimiteTemperature(float, float) <em>Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Temperature</em>' operation.
	 * @see projetModele.LimiteTemperature#LimiteTemperature(float, float)
	 * @generated
	 */
	EOperation getLimiteTemperature__LimiteTemperature__float_float();

	/**
	 * Returns the meta object for class '{@link projetModele.LimiteHumidite <em>Limite Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limite Humidite</em>'.
	 * @see projetModele.LimiteHumidite
	 * @generated
	 */
	EClass getLimiteHumidite();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.LimiteHumidite#getHumiMin <em>Humi Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Humi Min</em>'.
	 * @see projetModele.LimiteHumidite#getHumiMin()
	 * @see #getLimiteHumidite()
	 * @generated
	 */
	EAttribute getLimiteHumidite_HumiMin();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.LimiteHumidite#getHumiMax <em>Humi Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Humi Max</em>'.
	 * @see projetModele.LimiteHumidite#getHumiMax()
	 * @see #getLimiteHumidite()
	 * @generated
	 */
	EAttribute getLimiteHumidite_HumiMax();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteHumidite#LimiteHumidite() <em>Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Humidite</em>' operation.
	 * @see projetModele.LimiteHumidite#LimiteHumidite()
	 * @generated
	 */
	EOperation getLimiteHumidite__LimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteHumidite#LimiteHumidite(float, float) <em>Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Humidite</em>' operation.
	 * @see projetModele.LimiteHumidite#LimiteHumidite(float, float)
	 * @generated
	 */
	EOperation getLimiteHumidite__LimiteHumidite__float_float();

	/**
	 * Returns the meta object for class '{@link projetModele.ModeleCoutProduit <em>Modele Cout Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modele Cout Produit</em>'.
	 * @see projetModele.ModeleCoutProduit
	 * @generated
	 */
	EClass getModeleCoutProduit();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.ModeleCoutProduit#getCoutStock <em>Cout Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cout Stock</em>'.
	 * @see projetModele.ModeleCoutProduit#getCoutStock()
	 * @see #getModeleCoutProduit()
	 * @generated
	 */
	EAttribute getModeleCoutProduit_CoutStock();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.ModeleCoutProduit#getCoutDeStock <em>Cout De Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cout De Stock</em>'.
	 * @see projetModele.ModeleCoutProduit#getCoutDeStock()
	 * @see #getModeleCoutProduit()
	 * @generated
	 */
	EAttribute getModeleCoutProduit_CoutDeStock();

	/**
	 * Returns the meta object for the attribute '{@link projetModele.ModeleCoutProduit#getCoutDeplacement <em>Cout Deplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cout Deplacement</em>'.
	 * @see projetModele.ModeleCoutProduit#getCoutDeplacement()
	 * @see #getModeleCoutProduit()
	 * @generated
	 */
	EAttribute getModeleCoutProduit_CoutDeplacement();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleCoutProduit#ModeleCoutProduit() <em>Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Cout Produit</em>' operation.
	 * @see projetModele.ModeleCoutProduit#ModeleCoutProduit()
	 * @generated
	 */
	EOperation getModeleCoutProduit__ModeleCoutProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleCoutProduit#ModeleCoutProduit(float, float, float) <em>Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Cout Produit</em>' operation.
	 * @see projetModele.ModeleCoutProduit#ModeleCoutProduit(float, float, float)
	 * @generated
	 */
	EOperation getModeleCoutProduit__ModeleCoutProduit__float_float_float();

	/**
	 * Returns the meta object for class '{@link projetModele.ModeleEconomiqueProduit <em>Modele Economique Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modele Economique Produit</em>'.
	 * @see projetModele.ModeleEconomiqueProduit
	 * @generated
	 */
	EClass getModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the reference '{@link projetModele.ModeleEconomiqueProduit#getModeleCoutProduit <em>Modele Cout Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modele Cout Produit</em>'.
	 * @see projetModele.ModeleEconomiqueProduit#getModeleCoutProduit()
	 * @see #getModeleEconomiqueProduit()
	 * @generated
	 */
	EReference getModeleEconomiqueProduit_ModeleCoutProduit();

	/**
	 * Returns the meta object for the reference '{@link projetModele.ModeleEconomiqueProduit#getProduit <em>Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produit</em>'.
	 * @see projetModele.ModeleEconomiqueProduit#getProduit()
	 * @see #getModeleEconomiqueProduit()
	 * @generated
	 */
	EReference getModeleEconomiqueProduit_Produit();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleEconomiqueProduit#ModeleEconomiqueProduit() <em>Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Economique Produit</em>' operation.
	 * @see projetModele.ModeleEconomiqueProduit#ModeleEconomiqueProduit()
	 * @generated
	 */
	EOperation getModeleEconomiqueProduit__ModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleEconomiqueProduit#ModeleEconomiqueProduit(projetModele.ModeleCoutProduit, projetModele.Produit) <em>Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Economique Produit</em>' operation.
	 * @see projetModele.ModeleEconomiqueProduit#ModeleEconomiqueProduit(projetModele.ModeleCoutProduit, projetModele.Produit)
	 * @generated
	 */
	EOperation getModeleEconomiqueProduit__ModeleEconomiqueProduit__ModeleCoutProduit_Produit();

	/**
	 * Returns the meta object for class '{@link projetModele.OperateurEntreprotDAO <em>Operateur Entreprot DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Entreprot DAO</em>'.
	 * @see projetModele.OperateurEntreprotDAO
	 * @generated
	 */
	EClass getOperateurEntreprotDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.OperateurEntreprotDAO#OperateurEntrepotDAO() <em>Operateur Entrepot DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operateur Entrepot DAO</em>' operation.
	 * @see projetModele.OperateurEntreprotDAO#OperateurEntrepotDAO()
	 * @generated
	 */
	EOperation getOperateurEntreprotDAO__OperateurEntrepotDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteHumiditeDAO <em>Contrainte Humidite DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Humidite DAO</em>'.
	 * @see projetModele.ContrainteHumiditeDAO
	 * @generated
	 */
	EClass getContrainteHumiditeDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteHumiditeDAO#ContrainteHumiditeDAO() <em>Contrainte Humidite DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Humidite DAO</em>' operation.
	 * @see projetModele.ContrainteHumiditeDAO#ContrainteHumiditeDAO()
	 * @generated
	 */
	EOperation getContrainteHumiditeDAO__ContrainteHumiditeDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.LimiteHumiditeDAO <em>Limite Humidite DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limite Humidite DAO</em>'.
	 * @see projetModele.LimiteHumiditeDAO
	 * @generated
	 */
	EClass getLimiteHumiditeDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteHumiditeDAO#LimiteHumiditeDAO() <em>Limite Humidite DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Humidite DAO</em>' operation.
	 * @see projetModele.LimiteHumiditeDAO#LimiteHumiditeDAO()
	 * @generated
	 */
	EOperation getLimiteHumiditeDAO__LimiteHumiditeDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ModeleEconomiqueProduitDAO <em>Modele Economique Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modele Economique Produit DAO</em>'.
	 * @see projetModele.ModeleEconomiqueProduitDAO
	 * @generated
	 */
	EClass getModeleEconomiqueProduitDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleEconomiqueProduitDAO#ModeleEconomiqueProduit() <em>Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Economique Produit</em>' operation.
	 * @see projetModele.ModeleEconomiqueProduitDAO#ModeleEconomiqueProduit()
	 * @generated
	 */
	EOperation getModeleEconomiqueProduitDAO__ModeleEconomiqueProduit();

	/**
	 * Returns the meta object for class '{@link projetModele.LimiteTemperatureDAO <em>Limite Temperature DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limite Temperature DAO</em>'.
	 * @see projetModele.LimiteTemperatureDAO
	 * @generated
	 */
	EClass getLimiteTemperatureDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.LimiteTemperatureDAO#LimiteTemperatureDAO() <em>Limite Temperature DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limite Temperature DAO</em>' operation.
	 * @see projetModele.LimiteTemperatureDAO#LimiteTemperatureDAO()
	 * @generated
	 */
	EOperation getLimiteTemperatureDAO__LimiteTemperatureDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteStockageDAO <em>Contrainte Stockage DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Stockage DAO</em>'.
	 * @see projetModele.ContrainteStockageDAO
	 * @generated
	 */
	EClass getContrainteStockageDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteStockageDAO#ContrainteStockageDAO() <em>Contrainte Stockage DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Stockage DAO</em>' operation.
	 * @see projetModele.ContrainteStockageDAO#ContrainteStockageDAO()
	 * @generated
	 */
	EOperation getContrainteStockageDAO__ContrainteStockageDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeProduitDAO <em>Type Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Produit DAO</em>'.
	 * @see projetModele.TypeProduitDAO
	 * @generated
	 */
	EClass getTypeProduitDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeProduitDAO#TypeProduitDAO() <em>Type Produit DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Produit DAO</em>' operation.
	 * @see projetModele.TypeProduitDAO#TypeProduitDAO()
	 * @generated
	 */
	EOperation getTypeProduitDAO__TypeProduitDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ProduitDAO <em>Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produit DAO</em>'.
	 * @see projetModele.ProduitDAO
	 * @generated
	 */
	EClass getProduitDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ProduitDAO#ProduitDAO() <em>Produit DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Produit DAO</em>' operation.
	 * @see projetModele.ProduitDAO#ProduitDAO()
	 * @generated
	 */
	EOperation getProduitDAO__ProduitDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteTemperatureDAO <em>Contrainte Temperature DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Temperature DAO</em>'.
	 * @see projetModele.ContrainteTemperatureDAO
	 * @generated
	 */
	EClass getContrainteTemperatureDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteTemperatureDAO#ContrainteTemperatureDAO() <em>Contrainte Temperature DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Temperature DAO</em>' operation.
	 * @see projetModele.ContrainteTemperatureDAO#ContrainteTemperatureDAO()
	 * @generated
	 */
	EOperation getContrainteTemperatureDAO__ContrainteTemperatureDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ModeleCoutProduitDAO <em>Modele Cout Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modele Cout Produit DAO</em>'.
	 * @see projetModele.ModeleCoutProduitDAO
	 * @generated
	 */
	EClass getModeleCoutProduitDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ModeleCoutProduitDAO#ModeleCoutProduit() <em>Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modele Cout Produit</em>' operation.
	 * @see projetModele.ModeleCoutProduitDAO#ModeleCoutProduit()
	 * @generated
	 */
	EOperation getModeleCoutProduitDAO__ModeleCoutProduit();

	/**
	 * Returns the meta object for class '{@link projetModele.PositionDAO <em>Position DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position DAO</em>'.
	 * @see projetModele.PositionDAO
	 * @generated
	 */
	EClass getPositionDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.PositionDAO#PositionDAO() <em>Position DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position DAO</em>' operation.
	 * @see projetModele.PositionDAO#PositionDAO()
	 * @generated
	 */
	EOperation getPositionDAO__PositionDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ZoneDAO <em>Zone DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone DAO</em>'.
	 * @see projetModele.ZoneDAO
	 * @generated
	 */
	EClass getZoneDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ZoneDAO#ZoneDAO() <em>Zone DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zone DAO</em>' operation.
	 * @see projetModele.ZoneDAO#ZoneDAO()
	 * @generated
	 */
	EOperation getZoneDAO__ZoneDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TopographieDAO <em>Topographie DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topographie DAO</em>'.
	 * @see projetModele.TopographieDAO
	 * @generated
	 */
	EClass getTopographieDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TopographieDAO#TopographieDAO() <em>Topographie DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Topographie DAO</em>' operation.
	 * @see projetModele.TopographieDAO#TopographieDAO()
	 * @generated
	 */
	EOperation getTopographieDAO__TopographieDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.EquipementStockageDAO <em>Equipement Stockage DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipement Stockage DAO</em>'.
	 * @see projetModele.EquipementStockageDAO
	 * @generated
	 */
	EClass getEquipementStockageDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.EquipementStockageDAO#EquipementStockageDAO() <em>Equipement Stockage DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equipement Stockage DAO</em>' operation.
	 * @see projetModele.EquipementStockageDAO#EquipementStockageDAO()
	 * @generated
	 */
	EOperation getEquipementStockageDAO__EquipementStockageDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.DimensionDAO <em>Dimension DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension DAO</em>'.
	 * @see projetModele.DimensionDAO
	 * @generated
	 */
	EClass getDimensionDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.DimensionDAO#DimensionDAO() <em>Dimension DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension DAO</em>' operation.
	 * @see projetModele.DimensionDAO#DimensionDAO()
	 * @generated
	 */
	EOperation getDimensionDAO__DimensionDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeEquipementDAO <em>Type Equipement DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Equipement DAO</em>'.
	 * @see projetModele.TypeEquipementDAO
	 * @generated
	 */
	EClass getTypeEquipementDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeEquipementDAO#TypeEquipementDAO() <em>Type Equipement DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Equipement DAO</em>' operation.
	 * @see projetModele.TypeEquipementDAO#TypeEquipementDAO()
	 * @generated
	 */
	EOperation getTypeEquipementDAO__TypeEquipementDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeSimpleDAO <em>Type Simple DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Simple DAO</em>'.
	 * @see projetModele.TypeSimpleDAO
	 * @generated
	 */
	EClass getTypeSimpleDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeSimpleDAO#TypeSimpleDAO() <em>Type Simple DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Simple DAO</em>' operation.
	 * @see projetModele.TypeSimpleDAO#TypeSimpleDAO()
	 * @generated
	 */
	EOperation getTypeSimpleDAO__TypeSimpleDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeZoneSecheDAO <em>Type Zone Seche DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Zone Seche DAO</em>'.
	 * @see projetModele.TypeZoneSecheDAO
	 * @generated
	 */
	EClass getTypeZoneSecheDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeZoneSecheDAO#TypeZoneSecheDAO() <em>Type Zone Seche DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Zone Seche DAO</em>' operation.
	 * @see projetModele.TypeZoneSecheDAO#TypeZoneSecheDAO()
	 * @generated
	 */
	EOperation getTypeZoneSecheDAO__TypeZoneSecheDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.TypeFrigorifiqueDAO <em>Type Frigorifique DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Frigorifique DAO</em>'.
	 * @see projetModele.TypeFrigorifiqueDAO
	 * @generated
	 */
	EClass getTypeFrigorifiqueDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.TypeFrigorifiqueDAO#TypeFrigorifiqueDAO() <em>Type Frigorifique DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Frigorifique DAO</em>' operation.
	 * @see projetModele.TypeFrigorifiqueDAO#TypeFrigorifiqueDAO()
	 * @generated
	 */
	EOperation getTypeFrigorifiqueDAO__TypeFrigorifiqueDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.ContrainteDimensionDAO <em>Contrainte Dimension DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Dimension DAO</em>'.
	 * @see projetModele.ContrainteDimensionDAO
	 * @generated
	 */
	EClass getContrainteDimensionDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.ContrainteDimensionDAO#ContrainteDimensinDAO() <em>Contrainte Dimensin DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contrainte Dimensin DAO</em>' operation.
	 * @see projetModele.ContrainteDimensionDAO#ContrainteDimensinDAO()
	 * @generated
	 */
	EOperation getContrainteDimensionDAO__ContrainteDimensinDAO();

	/**
	 * Returns the meta object for class '{@link projetModele.AbstractDAO <em>Abstract DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract DAO</em>'.
	 * @see projetModele.AbstractDAO
	 * @generated
	 */
	EClass getAbstractDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.AbstractDAO#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see projetModele.AbstractDAO#create()
	 * @generated
	 */
	EOperation getAbstractDAO__Create();

	/**
	 * Returns the meta object for the '{@link projetModele.AbstractDAO#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see projetModele.AbstractDAO#delete()
	 * @generated
	 */
	EOperation getAbstractDAO__Delete();

	/**
	 * Returns the meta object for the '{@link projetModele.AbstractDAO#save() <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see projetModele.AbstractDAO#save()
	 * @generated
	 */
	EOperation getAbstractDAO__Save();

	/**
	 * Returns the meta object for the '{@link projetModele.AbstractDAO#find() <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see projetModele.AbstractDAO#find()
	 * @generated
	 */
	EOperation getAbstractDAO__Find();

	/**
	 * Returns the meta object for class '{@link projetModele.Controleur <em>Controleur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controleur</em>'.
	 * @see projetModele.Controleur
	 * @generated
	 */
	EClass getControleur();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#ControleurDAO() <em>Controleur DAO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controleur DAO</em>' operation.
	 * @see projetModele.Controleur#ControleurDAO()
	 * @generated
	 */
	EOperation getControleur__ControleurDAO();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addOperateurEntrepot(projetModele.OperateurEntrepot) <em>Add Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Operateur Entrepot</em>' operation.
	 * @see projetModele.Controleur#addOperateurEntrepot(projetModele.OperateurEntrepot)
	 * @generated
	 */
	EOperation getControleur__AddOperateurEntrepot__OperateurEntrepot();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeOperateurEntrepot(projetModele.OperateurEntrepot) <em>Remove Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Operateur Entrepot</em>' operation.
	 * @see projetModele.Controleur#removeOperateurEntrepot(projetModele.OperateurEntrepot)
	 * @generated
	 */
	EOperation getControleur__RemoveOperateurEntrepot__OperateurEntrepot();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateOperateurEntrepot(projetModele.OperateurEntrepot) <em>Update Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Operateur Entrepot</em>' operation.
	 * @see projetModele.Controleur#updateOperateurEntrepot(projetModele.OperateurEntrepot)
	 * @generated
	 */
	EOperation getControleur__UpdateOperateurEntrepot__OperateurEntrepot();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllOperateurEntrepot() <em>Get All Operateur Entrepot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operateur Entrepot</em>' operation.
	 * @see projetModele.Controleur#getAllOperateurEntrepot()
	 * @generated
	 */
	EOperation getControleur__GetAllOperateurEntrepot();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addZone(projetModele.Zone) <em>Add Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Zone</em>' operation.
	 * @see projetModele.Controleur#addZone(projetModele.Zone)
	 * @generated
	 */
	EOperation getControleur__AddZone__Zone();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeZone(projetModele.Zone) <em>Remove Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Zone</em>' operation.
	 * @see projetModele.Controleur#removeZone(projetModele.Zone)
	 * @generated
	 */
	EOperation getControleur__RemoveZone__Zone();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateZone(projetModele.Zone) <em>Update Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Zone</em>' operation.
	 * @see projetModele.Controleur#updateZone(projetModele.Zone)
	 * @generated
	 */
	EOperation getControleur__UpdateZone__Zone();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllZone() <em>Get All Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Zone</em>' operation.
	 * @see projetModele.Controleur#getAllZone()
	 * @generated
	 */
	EOperation getControleur__GetAllZone();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTopographie(projetModele.Topographie) <em>Add Topographie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Topographie</em>' operation.
	 * @see projetModele.Controleur#addTopographie(projetModele.Topographie)
	 * @generated
	 */
	EOperation getControleur__AddTopographie__Topographie();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTopographique(projetModele.Topographie) <em>Remove Topographique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Topographique</em>' operation.
	 * @see projetModele.Controleur#removeTopographique(projetModele.Topographie)
	 * @generated
	 */
	EOperation getControleur__RemoveTopographique__Topographie();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTopographie(projetModele.Topographie) <em>Update Topographie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Topographie</em>' operation.
	 * @see projetModele.Controleur#updateTopographie(projetModele.Topographie)
	 * @generated
	 */
	EOperation getControleur__UpdateTopographie__Topographie();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTopograpie() <em>Get All Topograpie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Topograpie</em>' operation.
	 * @see projetModele.Controleur#getAllTopograpie()
	 * @generated
	 */
	EOperation getControleur__GetAllTopograpie();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addEquipementStockage(projetModele.EquipementStockage) <em>Add Equipement Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Equipement Stockage</em>' operation.
	 * @see projetModele.Controleur#addEquipementStockage(projetModele.EquipementStockage)
	 * @generated
	 */
	EOperation getControleur__AddEquipementStockage__EquipementStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeEquipementStockage(projetModele.EquipementStockage) <em>Remove Equipement Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Equipement Stockage</em>' operation.
	 * @see projetModele.Controleur#removeEquipementStockage(projetModele.EquipementStockage)
	 * @generated
	 */
	EOperation getControleur__RemoveEquipementStockage__EquipementStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateEquipementStockage(projetModele.EquipementStockage) <em>Update Equipement Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Equipement Stockage</em>' operation.
	 * @see projetModele.Controleur#updateEquipementStockage(projetModele.EquipementStockage)
	 * @generated
	 */
	EOperation getControleur__UpdateEquipementStockage__EquipementStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllEquipementStockages() <em>Get All Equipement Stockages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Equipement Stockages</em>' operation.
	 * @see projetModele.Controleur#getAllEquipementStockages()
	 * @generated
	 */
	EOperation getControleur__GetAllEquipementStockages();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addDimension(projetModele.Dimension) <em>Add Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Dimension</em>' operation.
	 * @see projetModele.Controleur#addDimension(projetModele.Dimension)
	 * @generated
	 */
	EOperation getControleur__AddDimension__Dimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeDimension(projetModele.Dimension) <em>Remove Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Dimension</em>' operation.
	 * @see projetModele.Controleur#removeDimension(projetModele.Dimension)
	 * @generated
	 */
	EOperation getControleur__RemoveDimension__Dimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateDimension(projetModele.Dimension) <em>Update Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Dimension</em>' operation.
	 * @see projetModele.Controleur#updateDimension(projetModele.Dimension)
	 * @generated
	 */
	EOperation getControleur__UpdateDimension__Dimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllDimension() <em>Get All Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Dimension</em>' operation.
	 * @see projetModele.Controleur#getAllDimension()
	 * @generated
	 */
	EOperation getControleur__GetAllDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTypeEquipement(projetModele.TypeEquipement) <em>Add Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Type Equipement</em>' operation.
	 * @see projetModele.Controleur#addTypeEquipement(projetModele.TypeEquipement)
	 * @generated
	 */
	EOperation getControleur__AddTypeEquipement__TypeEquipement();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTypeEquipement(projetModele.TypeEquipement) <em>Remove Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Type Equipement</em>' operation.
	 * @see projetModele.Controleur#removeTypeEquipement(projetModele.TypeEquipement)
	 * @generated
	 */
	EOperation getControleur__RemoveTypeEquipement__TypeEquipement();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTypeEquipement(projetModele.TypeEquipement) <em>Update Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Type Equipement</em>' operation.
	 * @see projetModele.Controleur#updateTypeEquipement(projetModele.TypeEquipement)
	 * @generated
	 */
	EOperation getControleur__UpdateTypeEquipement__TypeEquipement();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTypeEquipement() <em>Get All Type Equipement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Type Equipement</em>' operation.
	 * @see projetModele.Controleur#getAllTypeEquipement()
	 * @generated
	 */
	EOperation getControleur__GetAllTypeEquipement();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTypeSimple(projetModele.TypeSimple) <em>Add Type Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Type Simple</em>' operation.
	 * @see projetModele.Controleur#addTypeSimple(projetModele.TypeSimple)
	 * @generated
	 */
	EOperation getControleur__AddTypeSimple__TypeSimple();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTypeSimple(projetModele.TypeSimple) <em>Remove Type Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Type Simple</em>' operation.
	 * @see projetModele.Controleur#removeTypeSimple(projetModele.TypeSimple)
	 * @generated
	 */
	EOperation getControleur__RemoveTypeSimple__TypeSimple();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTypeSimple(projetModele.TypeSimple) <em>Update Type Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Type Simple</em>' operation.
	 * @see projetModele.Controleur#updateTypeSimple(projetModele.TypeSimple)
	 * @generated
	 */
	EOperation getControleur__UpdateTypeSimple__TypeSimple();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTypeSimple() <em>Get All Type Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Type Simple</em>' operation.
	 * @see projetModele.Controleur#getAllTypeSimple()
	 * @generated
	 */
	EOperation getControleur__GetAllTypeSimple();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTypeZoneSeche(projetModele.TypeZoneSeche) <em>Add Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Type Zone Seche</em>' operation.
	 * @see projetModele.Controleur#addTypeZoneSeche(projetModele.TypeZoneSeche)
	 * @generated
	 */
	EOperation getControleur__AddTypeZoneSeche__TypeZoneSeche();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTypeZoneSeche(projetModele.TypeZoneSeche) <em>Remove Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Type Zone Seche</em>' operation.
	 * @see projetModele.Controleur#removeTypeZoneSeche(projetModele.TypeZoneSeche)
	 * @generated
	 */
	EOperation getControleur__RemoveTypeZoneSeche__TypeZoneSeche();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTypeZoneSeche(projetModele.TypeZoneSeche) <em>Update Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Type Zone Seche</em>' operation.
	 * @see projetModele.Controleur#updateTypeZoneSeche(projetModele.TypeZoneSeche)
	 * @generated
	 */
	EOperation getControleur__UpdateTypeZoneSeche__TypeZoneSeche();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTypeZoneSeche() <em>Get All Type Zone Seche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Type Zone Seche</em>' operation.
	 * @see projetModele.Controleur#getAllTypeZoneSeche()
	 * @generated
	 */
	EOperation getControleur__GetAllTypeZoneSeche();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTypeFrigorifique(projetModele.TypeFrigorifique) <em>Add Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Type Frigorifique</em>' operation.
	 * @see projetModele.Controleur#addTypeFrigorifique(projetModele.TypeFrigorifique)
	 * @generated
	 */
	EOperation getControleur__AddTypeFrigorifique__TypeFrigorifique();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTypeFrigorifique(projetModele.TypeFrigorifique) <em>Remove Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Type Frigorifique</em>' operation.
	 * @see projetModele.Controleur#removeTypeFrigorifique(projetModele.TypeFrigorifique)
	 * @generated
	 */
	EOperation getControleur__RemoveTypeFrigorifique__TypeFrigorifique();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTypeFrigorifique(projetModele.TypeFrigorifique) <em>Update Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Type Frigorifique</em>' operation.
	 * @see projetModele.Controleur#updateTypeFrigorifique(projetModele.TypeFrigorifique)
	 * @generated
	 */
	EOperation getControleur__UpdateTypeFrigorifique__TypeFrigorifique();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTypeFrigorifique() <em>Get All Type Frigorifique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Type Frigorifique</em>' operation.
	 * @see projetModele.Controleur#getAllTypeFrigorifique()
	 * @generated
	 */
	EOperation getControleur__GetAllTypeFrigorifique();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addContrainteDimension(projetModele.ContrainteDimension) <em>Add Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contrainte Dimension</em>' operation.
	 * @see projetModele.Controleur#addContrainteDimension(projetModele.ContrainteDimension)
	 * @generated
	 */
	EOperation getControleur__AddContrainteDimension__ContrainteDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeContrainteDimension(projetModele.ContrainteDimension) <em>Remove Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Contrainte Dimension</em>' operation.
	 * @see projetModele.Controleur#removeContrainteDimension(projetModele.ContrainteDimension)
	 * @generated
	 */
	EOperation getControleur__RemoveContrainteDimension__ContrainteDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateContrainteDimension(projetModele.ContrainteDimension) <em>Update Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contrainte Dimension</em>' operation.
	 * @see projetModele.Controleur#updateContrainteDimension(projetModele.ContrainteDimension)
	 * @generated
	 */
	EOperation getControleur__UpdateContrainteDimension__ContrainteDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllContrainteDimension() <em>Get All Contrainte Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contrainte Dimension</em>' operation.
	 * @see projetModele.Controleur#getAllContrainteDimension()
	 * @generated
	 */
	EOperation getControleur__GetAllContrainteDimension();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addPosition(projetModele.Position) <em>Add Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Position</em>' operation.
	 * @see projetModele.Controleur#addPosition(projetModele.Position)
	 * @generated
	 */
	EOperation getControleur__AddPosition__Position();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removePosition(projetModele.Position) <em>Remove Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Position</em>' operation.
	 * @see projetModele.Controleur#removePosition(projetModele.Position)
	 * @generated
	 */
	EOperation getControleur__RemovePosition__Position();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updatePosition(projetModele.Position) <em>Update Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Position</em>' operation.
	 * @see projetModele.Controleur#updatePosition(projetModele.Position)
	 * @generated
	 */
	EOperation getControleur__UpdatePosition__Position();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllPosition() <em>Get All Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Position</em>' operation.
	 * @see projetModele.Controleur#getAllPosition()
	 * @generated
	 */
	EOperation getControleur__GetAllPosition();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addModeleCoutProduit(projetModele.ModeleCoutProduit) <em>Add Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Modele Cout Produit</em>' operation.
	 * @see projetModele.Controleur#addModeleCoutProduit(projetModele.ModeleCoutProduit)
	 * @generated
	 */
	EOperation getControleur__AddModeleCoutProduit__ModeleCoutProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeModeleCoutProduit(projetModele.ModeleCoutProduit) <em>Remove Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Modele Cout Produit</em>' operation.
	 * @see projetModele.Controleur#removeModeleCoutProduit(projetModele.ModeleCoutProduit)
	 * @generated
	 */
	EOperation getControleur__RemoveModeleCoutProduit__ModeleCoutProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateModeleCoutProduit(projetModele.ModeleCoutProduit) <em>Update Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Modele Cout Produit</em>' operation.
	 * @see projetModele.Controleur#updateModeleCoutProduit(projetModele.ModeleCoutProduit)
	 * @generated
	 */
	EOperation getControleur__UpdateModeleCoutProduit__ModeleCoutProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllModeleCoutProduit() <em>Get All Modele Cout Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Modele Cout Produit</em>' operation.
	 * @see projetModele.Controleur#getAllModeleCoutProduit()
	 * @generated
	 */
	EOperation getControleur__GetAllModeleCoutProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit) <em>Add Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Modele Economique Produit</em>' operation.
	 * @see projetModele.Controleur#addModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit)
	 * @generated
	 */
	EOperation getControleur__AddModeleEconomiqueProduit__ModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit) <em>Remove Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Modele Economique Produit</em>' operation.
	 * @see projetModele.Controleur#removeModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit)
	 * @generated
	 */
	EOperation getControleur__RemoveModeleEconomiqueProduit__ModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit) <em>Update Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Modele Economique Produit</em>' operation.
	 * @see projetModele.Controleur#updateModeleEconomiqueProduit(projetModele.ModeleEconomiqueProduit)
	 * @generated
	 */
	EOperation getControleur__UpdateModeleEconomiqueProduit__ModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllModeleEconomiqueProduit() <em>Get All Modele Economique Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Modele Economique Produit</em>' operation.
	 * @see projetModele.Controleur#getAllModeleEconomiqueProduit()
	 * @generated
	 */
	EOperation getControleur__GetAllModeleEconomiqueProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addLimiteHumidite(projetModele.LimiteHumidite) <em>Add Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Limite Humidite</em>' operation.
	 * @see projetModele.Controleur#addLimiteHumidite(projetModele.LimiteHumidite)
	 * @generated
	 */
	EOperation getControleur__AddLimiteHumidite__LimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeLimiteHumidite(projetModele.LimiteHumidite) <em>Remove Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Limite Humidite</em>' operation.
	 * @see projetModele.Controleur#removeLimiteHumidite(projetModele.LimiteHumidite)
	 * @generated
	 */
	EOperation getControleur__RemoveLimiteHumidite__LimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateLimiteHumidite(projetModele.LimiteHumidite) <em>Update Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Limite Humidite</em>' operation.
	 * @see projetModele.Controleur#updateLimiteHumidite(projetModele.LimiteHumidite)
	 * @generated
	 */
	EOperation getControleur__UpdateLimiteHumidite__LimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllLimiteHumidite() <em>Get All Limite Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Limite Humidite</em>' operation.
	 * @see projetModele.Controleur#getAllLimiteHumidite()
	 * @generated
	 */
	EOperation getControleur__GetAllLimiteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addContrainteHumidite(projetModele.ContrainteHumidite) <em>Add Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contrainte Humidite</em>' operation.
	 * @see projetModele.Controleur#addContrainteHumidite(projetModele.ContrainteHumidite)
	 * @generated
	 */
	EOperation getControleur__AddContrainteHumidite__ContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeContrainteHumidite(projetModele.ContrainteHumidite) <em>Remove Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Contrainte Humidite</em>' operation.
	 * @see projetModele.Controleur#removeContrainteHumidite(projetModele.ContrainteHumidite)
	 * @generated
	 */
	EOperation getControleur__RemoveContrainteHumidite__ContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateContrainteHumidite(projetModele.ContrainteHumidite) <em>Update Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contrainte Humidite</em>' operation.
	 * @see projetModele.Controleur#updateContrainteHumidite(projetModele.ContrainteHumidite)
	 * @generated
	 */
	EOperation getControleur__UpdateContrainteHumidite__ContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllContrainteHumidite() <em>Get All Contrainte Humidite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contrainte Humidite</em>' operation.
	 * @see projetModele.Controleur#getAllContrainteHumidite()
	 * @generated
	 */
	EOperation getControleur__GetAllContrainteHumidite();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addLimiteTemperature(projetModele.LimiteTemperature) <em>Add Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Limite Temperature</em>' operation.
	 * @see projetModele.Controleur#addLimiteTemperature(projetModele.LimiteTemperature)
	 * @generated
	 */
	EOperation getControleur__AddLimiteTemperature__LimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeLimiteTemperature(projetModele.LimiteTemperature) <em>Remove Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Limite Temperature</em>' operation.
	 * @see projetModele.Controleur#removeLimiteTemperature(projetModele.LimiteTemperature)
	 * @generated
	 */
	EOperation getControleur__RemoveLimiteTemperature__LimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateLimiteTemperature(projetModele.LimiteTemperature) <em>Update Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Limite Temperature</em>' operation.
	 * @see projetModele.Controleur#updateLimiteTemperature(projetModele.LimiteTemperature)
	 * @generated
	 */
	EOperation getControleur__UpdateLimiteTemperature__LimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllLimiteTemperature() <em>Get All Limite Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Limite Temperature</em>' operation.
	 * @see projetModele.Controleur#getAllLimiteTemperature()
	 * @generated
	 */
	EOperation getControleur__GetAllLimiteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addContrainteStockage(projetModele.ContrainteStockage) <em>Add Contrainte Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contrainte Stockage</em>' operation.
	 * @see projetModele.Controleur#addContrainteStockage(projetModele.ContrainteStockage)
	 * @generated
	 */
	EOperation getControleur__AddContrainteStockage__ContrainteStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeContrainteStockage(projetModele.ContrainteStockage) <em>Remove Contrainte Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Contrainte Stockage</em>' operation.
	 * @see projetModele.Controleur#removeContrainteStockage(projetModele.ContrainteStockage)
	 * @generated
	 */
	EOperation getControleur__RemoveContrainteStockage__ContrainteStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateContrainteStockage(projetModele.ContrainteStockage) <em>Update Contrainte Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contrainte Stockage</em>' operation.
	 * @see projetModele.Controleur#updateContrainteStockage(projetModele.ContrainteStockage)
	 * @generated
	 */
	EOperation getControleur__UpdateContrainteStockage__ContrainteStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllContrainteStockage() <em>Get All Contrainte Stockage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contrainte Stockage</em>' operation.
	 * @see projetModele.Controleur#getAllContrainteStockage()
	 * @generated
	 */
	EOperation getControleur__GetAllContrainteStockage();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addTypeProduit(projetModele.TypeProduit) <em>Add Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Type Produit</em>' operation.
	 * @see projetModele.Controleur#addTypeProduit(projetModele.TypeProduit)
	 * @generated
	 */
	EOperation getControleur__AddTypeProduit__TypeProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeTypeProduit(projetModele.TypeProduit) <em>Remove Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Type Produit</em>' operation.
	 * @see projetModele.Controleur#removeTypeProduit(projetModele.TypeProduit)
	 * @generated
	 */
	EOperation getControleur__RemoveTypeProduit__TypeProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateTypeProduit(projetModele.TypeProduit) <em>Update Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Type Produit</em>' operation.
	 * @see projetModele.Controleur#updateTypeProduit(projetModele.TypeProduit)
	 * @generated
	 */
	EOperation getControleur__UpdateTypeProduit__TypeProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllTypeProduit() <em>Get All Type Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Type Produit</em>' operation.
	 * @see projetModele.Controleur#getAllTypeProduit()
	 * @generated
	 */
	EOperation getControleur__GetAllTypeProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addProduit(projetModele.Produit) <em>Add Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Produit</em>' operation.
	 * @see projetModele.Controleur#addProduit(projetModele.Produit)
	 * @generated
	 */
	EOperation getControleur__AddProduit__Produit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeProduit(projetModele.Produit) <em>Remove Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Produit</em>' operation.
	 * @see projetModele.Controleur#removeProduit(projetModele.Produit)
	 * @generated
	 */
	EOperation getControleur__RemoveProduit__Produit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateProduit(projetModele.Produit) <em>Update Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Produit</em>' operation.
	 * @see projetModele.Controleur#updateProduit(projetModele.Produit)
	 * @generated
	 */
	EOperation getControleur__UpdateProduit__Produit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllProduit() <em>Get All Produit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Produit</em>' operation.
	 * @see projetModele.Controleur#getAllProduit()
	 * @generated
	 */
	EOperation getControleur__GetAllProduit();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#addContrainteTemperature(projetModele.ContrainteTemperature) <em>Add Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contrainte Temperature</em>' operation.
	 * @see projetModele.Controleur#addContrainteTemperature(projetModele.ContrainteTemperature)
	 * @generated
	 */
	EOperation getControleur__AddContrainteTemperature__ContrainteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#removeContrainteTemperature(projetModele.ContrainteTemperature) <em>Remove Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Contrainte Temperature</em>' operation.
	 * @see projetModele.Controleur#removeContrainteTemperature(projetModele.ContrainteTemperature)
	 * @generated
	 */
	EOperation getControleur__RemoveContrainteTemperature__ContrainteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#updateContrainteTemperature(projetModele.ContrainteTemperature) <em>Update Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contrainte Temperature</em>' operation.
	 * @see projetModele.Controleur#updateContrainteTemperature(projetModele.ContrainteTemperature)
	 * @generated
	 */
	EOperation getControleur__UpdateContrainteTemperature__ContrainteTemperature();

	/**
	 * Returns the meta object for the '{@link projetModele.Controleur#getAllContrainteTemperature() <em>Get All Contrainte Temperature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contrainte Temperature</em>' operation.
	 * @see projetModele.Controleur#getAllContrainteTemperature()
	 * @generated
	 */
	EOperation getControleur__GetAllContrainteTemperature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjetModeleFactory getProjetModeleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projetModele.impl.OperateurEntrepotImpl <em>Operateur Entrepot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.OperateurEntrepotImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getOperateurEntrepot()
		 * @generated
		 */
		EClass OPERATEUR_ENTREPOT = eINSTANCE.getOperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATEUR_ENTREPOT__NAME = eINSTANCE.getOperateurEntrepot_Name();

		/**
		 * The meta object literal for the '<em><b>Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT = eINSTANCE.getOperateurEntrepot__OperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATEUR_ENTREPOT___OPERATEUR_ENTREPOT__STRING = eINSTANCE.getOperateurEntrepot__OperateurEntrepot__String();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TopographieImpl <em>Topographie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TopographieImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTopographie()
		 * @generated
		 */
		EClass TOPOGRAPHIE = eINSTANCE.getTopographie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOGRAPHIE__NAME = eINSTANCE.getTopographie_Name();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOGRAPHIE__ZONES = eINSTANCE.getTopographie_Zones();

		/**
		 * The meta object literal for the '<em><b>Topographie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOGRAPHIE___TOPOGRAPHIE = eINSTANCE.getTopographie__Topographie();

		/**
		 * The meta object literal for the '<em><b>Topographie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOGRAPHIE___TOPOGRAPHIE__STRING_ELIST = eINSTANCE.getTopographie__Topographie__String_EList();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ZoneImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__NAME = eINSTANCE.getZone_Name();

		/**
		 * The meta object literal for the '<em><b>Ope Entrepots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__OPE_ENTREPOTS = eINSTANCE.getZone_OpeEntrepots();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__POSITIONS = eINSTANCE.getZone_Positions();

		/**
		 * The meta object literal for the '<em><b>Equipement Stockages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__EQUIPEMENT_STOCKAGES = eINSTANCE.getZone_EquipementStockages();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ZONES = eINSTANCE.getZone_Zones();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE___ZONE = eINSTANCE.getZone__Zone();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE___ZONES__STRING_ELIST_ELIST_ELIST = eINSTANCE.getZone__Zones__String_EList_EList_EList();

		/**
		 * The meta object literal for the '{@link projetModele.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.PositionImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LONGITUDE = eINSTANCE.getPosition_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LATITUDE = eINSTANCE.getPosition_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ALTITUDE = eINSTANCE.getPosition_Altitude();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___POSITION = eINSTANCE.getPosition__Position();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___POSITION__FLOAT_FLOAT_FLOAT = eINSTANCE.getPosition__Position__float_float_float();

		/**
		 * The meta object literal for the '{@link projetModele.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.DimensionImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Hauteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HAUTEUR = eINSTANCE.getDimension_Hauteur();

		/**
		 * The meta object literal for the '<em><b>Largeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LARGEUR = eINSTANCE.getDimension_Largeur();

		/**
		 * The meta object literal for the '<em><b>Profondeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__PROFONDEUR = eINSTANCE.getDimension_Profondeur();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION___DIMENSION = eINSTANCE.getDimension__Dimension();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION___DIMENSION__FLOAT_FLOAT_FLOAT = eINSTANCE.getDimension__Dimension__float_float_float();

		/**
		 * The meta object literal for the '{@link projetModele.impl.EquipementStockageImpl <em>Equipement Stockage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.EquipementStockageImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getEquipementStockage()
		 * @generated
		 */
		EClass EQUIPEMENT_STOCKAGE = eINSTANCE.getEquipementStockage();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT_STOCKAGE__DIMENSION = eINSTANCE.getEquipementStockage_Dimension();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT_STOCKAGE__POSITION = eINSTANCE.getEquipementStockage_Position();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT_STOCKAGE__TYPE = eINSTANCE.getEquipementStockage_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPEMENT_STOCKAGE__NAME = eINSTANCE.getEquipementStockage_Name();

		/**
		 * The meta object literal for the '<em><b>Occupe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPEMENT_STOCKAGE__OCCUPE = eINSTANCE.getEquipementStockage_Occupe();

		/**
		 * The meta object literal for the '<em><b>Equipement Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE = eINSTANCE.getEquipementStockage__EquipementStockage();

		/**
		 * The meta object literal for the '<em><b>Equipement Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPEMENT_STOCKAGE___EQUIPEMENT_STOCKAGE__STRING_DIMENSION_POSITION_TYPEEQUIPEMENT = eINSTANCE.getEquipementStockage__EquipementStockage__String_Dimension_Position_TypeEquipement();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeEquipementImpl <em>Type Equipement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeEquipementImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeEquipement()
		 * @generated
		 */
		EClass TYPE_EQUIPEMENT = eINSTANCE.getTypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_EQUIPEMENT__NAME = eINSTANCE.getTypeEquipement_Name();

		/**
		 * The meta object literal for the '<em><b>Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_EQUIPEMENT___TYPE_EQUIPEMENT = eINSTANCE.getTypeEquipement__TypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_EQUIPEMENT___TYPE_EQUIPEMENT__STRING = eINSTANCE.getTypeEquipement__TypeEquipement__String();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeSimpleImpl <em>Type Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeSimpleImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeSimple()
		 * @generated
		 */
		EClass TYPE_SIMPLE = eINSTANCE.getTypeSimple();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeZoneSecheImpl <em>Type Zone Seche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeZoneSecheImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeZoneSeche()
		 * @generated
		 */
		EClass TYPE_ZONE_SECHE = eINSTANCE.getTypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Contrainte Humidite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ZONE_SECHE__CONTRAINTE_HUMIDITE = eINSTANCE.getTypeZoneSeche_ContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_ZONE_SECHE___TYPE_ZONE_SECHE = eINSTANCE.getTypeZoneSeche__TypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_ZONE_SECHE___TYPE_ZONE_SECHE__CONTRAINTEHUMIDITE = eINSTANCE.getTypeZoneSeche__TypeZoneSeche__ContrainteHumidite();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteHumiditeImpl <em>Contrainte Humidite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteHumiditeImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteHumidite()
		 * @generated
		 */
		EClass CONTRAINTE_HUMIDITE = eINSTANCE.getContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Limite Humidite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE_HUMIDITE__LIMITE_HUMIDITE = eINSTANCE.getContrainteHumidite_LimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE = eINSTANCE.getContrainteHumidite__ContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_HUMIDITE___CONTRAINTE_HUMIDITE__LIMITEHUMIDITE = eINSTANCE.getContrainteHumidite__ContrainteHumidite__LimiteHumidite();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeFrigorifiqueImpl <em>Type Frigorifique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeFrigorifiqueImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeFrigorifique()
		 * @generated
		 */
		EClass TYPE_FRIGORIFIQUE = eINSTANCE.getTypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Contrainte Temperature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_FRIGORIFIQUE__CONTRAINTE_TEMPERATURE = eINSTANCE.getTypeFrigorifique_ContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE = eINSTANCE.getTypeFrigorifique__TypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_FRIGORIFIQUE___TYPE_FRIGORIFIQUE__CONTRAINTETEMPERATURE = eINSTANCE.getTypeFrigorifique__TypeFrigorifique__ContrainteTemperature();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteTemperatureImpl <em>Contrainte Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteTemperatureImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteTemperature()
		 * @generated
		 */
		EClass CONTRAINTE_TEMPERATURE = eINSTANCE.getContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Limite Temperature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE_TEMPERATURE__LIMITE_TEMPERATURE = eINSTANCE.getContrainteTemperature_LimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE = eINSTANCE.getContrainteTemperature__ContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_TEMPERATURE___CONTRAINTE_TEMPERATURE__LIMITETEMPERATURE = eINSTANCE.getContrainteTemperature__ContrainteTemperature__LimiteTemperature();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteDimensionImpl <em>Contrainte Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteDimensionImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteDimension()
		 * @generated
		 */
		EClass CONTRAINTE_DIMENSION = eINSTANCE.getContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE_DIMENSION__DIMENSION = eINSTANCE.getContrainteDimension_Dimension();

		/**
		 * The meta object literal for the '<em><b>Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION = eINSTANCE.getContrainteDimension__ContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_DIMENSION___CONTRAINTE_DIMENSION__DIMENSION = eINSTANCE.getContrainteDimension__ContrainteDimension__Dimension();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ProduitImpl <em>Produit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ProduitImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getProduit()
		 * @generated
		 */
		EClass PRODUIT = eINSTANCE.getProduit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUIT__NAME = eINSTANCE.getProduit_Name();

		/**
		 * The meta object literal for the '<em><b>Date Limite Conso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUIT__DATE_LIMITE_CONSO = eINSTANCE.getProduit_DateLimiteConso();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUIT__DIMENSION = eINSTANCE.getProduit_Dimension();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUIT__POSITION = eINSTANCE.getProduit_Position();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUIT__TYPE = eINSTANCE.getProduit_Type();

		/**
		 * The meta object literal for the '<em><b>Contrainte Stockage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUIT__CONTRAINTE_STOCKAGE = eINSTANCE.getProduit_ContrainteStockage();

		/**
		 * The meta object literal for the '<em><b>Modele Cout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUIT__MODELE_COUT = eINSTANCE.getProduit_ModeleCout();

		/**
		 * The meta object literal for the '<em><b>Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUIT___PRODUIT = eINSTANCE.getProduit__Produit();

		/**
		 * The meta object literal for the '<em><b>Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUIT___PRODUIT__STRING_FLOAT_FLOAT_DATE_TYPEPRODUIT_POSITION_DIMENSION_CONTRAINTESTOCKAGE = eINSTANCE.getProduit__Produit__String_float_float_Date_TypeProduit_Position_Dimension_ContrainteStockage();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeProduitImpl <em>Type Produit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeProduitImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeProduit()
		 * @generated
		 */
		EClass TYPE_PRODUIT = eINSTANCE.getTypeProduit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_PRODUIT__NAME = eINSTANCE.getTypeProduit_Name();

		/**
		 * The meta object literal for the '<em><b>Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_PRODUIT___TYPE_PRODUIT = eINSTANCE.getTypeProduit__TypeProduit();

		/**
		 * The meta object literal for the '<em><b>Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_PRODUIT___TYPE_PRODUIT__STRING = eINSTANCE.getTypeProduit__TypeProduit__String();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteStockageImpl <em>Contrainte Stockage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteStockageImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteStockage()
		 * @generated
		 */
		EClass CONTRAINTE_STOCKAGE = eINSTANCE.getContrainteStockage();

		/**
		 * The meta object literal for the '{@link projetModele.impl.LimiteTemperatureImpl <em>Limite Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.LimiteTemperatureImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteTemperature()
		 * @generated
		 */
		EClass LIMITE_TEMPERATURE = eINSTANCE.getLimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Temperature Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITE_TEMPERATURE__TEMPERATURE_MIN = eINSTANCE.getLimiteTemperature_TemperatureMin();

		/**
		 * The meta object literal for the '<em><b>Temperature Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITE_TEMPERATURE__TEMPERATURE_MAX = eINSTANCE.getLimiteTemperature_TemperatureMax();

		/**
		 * The meta object literal for the '<em><b>Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_TEMPERATURE___LIMITE_TEMPERATURE = eINSTANCE.getLimiteTemperature__LimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_TEMPERATURE___LIMITE_TEMPERATURE__FLOAT_FLOAT = eINSTANCE.getLimiteTemperature__LimiteTemperature__float_float();

		/**
		 * The meta object literal for the '{@link projetModele.impl.LimiteHumiditeImpl <em>Limite Humidite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.LimiteHumiditeImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteHumidite()
		 * @generated
		 */
		EClass LIMITE_HUMIDITE = eINSTANCE.getLimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Humi Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITE_HUMIDITE__HUMI_MIN = eINSTANCE.getLimiteHumidite_HumiMin();

		/**
		 * The meta object literal for the '<em><b>Humi Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITE_HUMIDITE__HUMI_MAX = eINSTANCE.getLimiteHumidite_HumiMax();

		/**
		 * The meta object literal for the '<em><b>Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_HUMIDITE___LIMITE_HUMIDITE = eINSTANCE.getLimiteHumidite__LimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_HUMIDITE___LIMITE_HUMIDITE__FLOAT_FLOAT = eINSTANCE.getLimiteHumidite__LimiteHumidite__float_float();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ModeleCoutProduitImpl <em>Modele Cout Produit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ModeleCoutProduitImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getModeleCoutProduit()
		 * @generated
		 */
		EClass MODELE_COUT_PRODUIT = eINSTANCE.getModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Cout Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELE_COUT_PRODUIT__COUT_STOCK = eINSTANCE.getModeleCoutProduit_CoutStock();

		/**
		 * The meta object literal for the '<em><b>Cout De Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELE_COUT_PRODUIT__COUT_DE_STOCK = eINSTANCE.getModeleCoutProduit_CoutDeStock();

		/**
		 * The meta object literal for the '<em><b>Cout Deplacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELE_COUT_PRODUIT__COUT_DEPLACEMENT = eINSTANCE.getModeleCoutProduit_CoutDeplacement();

		/**
		 * The meta object literal for the '<em><b>Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT = eINSTANCE.getModeleCoutProduit__ModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_COUT_PRODUIT___MODELE_COUT_PRODUIT__FLOAT_FLOAT_FLOAT = eINSTANCE.getModeleCoutProduit__ModeleCoutProduit__float_float_float();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ModeleEconomiqueProduitImpl <em>Modele Economique Produit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ModeleEconomiqueProduitImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getModeleEconomiqueProduit()
		 * @generated
		 */
		EClass MODELE_ECONOMIQUE_PRODUIT = eINSTANCE.getModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Modele Cout Produit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELE_ECONOMIQUE_PRODUIT__MODELE_COUT_PRODUIT = eINSTANCE.getModeleEconomiqueProduit_ModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Produit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELE_ECONOMIQUE_PRODUIT__PRODUIT = eINSTANCE.getModeleEconomiqueProduit_Produit();

		/**
		 * The meta object literal for the '<em><b>Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT = eINSTANCE.getModeleEconomiqueProduit__ModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_ECONOMIQUE_PRODUIT___MODELE_ECONOMIQUE_PRODUIT__MODELECOUTPRODUIT_PRODUIT = eINSTANCE.getModeleEconomiqueProduit__ModeleEconomiqueProduit__ModeleCoutProduit_Produit();

		/**
		 * The meta object literal for the '{@link projetModele.impl.OperateurEntreprotDAOImpl <em>Operateur Entreprot DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.OperateurEntreprotDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getOperateurEntreprotDAO()
		 * @generated
		 */
		EClass OPERATEUR_ENTREPROT_DAO = eINSTANCE.getOperateurEntreprotDAO();

		/**
		 * The meta object literal for the '<em><b>Operateur Entrepot DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATEUR_ENTREPROT_DAO___OPERATEUR_ENTREPOT_DAO = eINSTANCE.getOperateurEntreprotDAO__OperateurEntrepotDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteHumiditeDAOImpl <em>Contrainte Humidite DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteHumiditeDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteHumiditeDAO()
		 * @generated
		 */
		EClass CONTRAINTE_HUMIDITE_DAO = eINSTANCE.getContrainteHumiditeDAO();

		/**
		 * The meta object literal for the '<em><b>Contrainte Humidite DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_HUMIDITE_DAO___CONTRAINTE_HUMIDITE_DAO = eINSTANCE.getContrainteHumiditeDAO__ContrainteHumiditeDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.LimiteHumiditeDAOImpl <em>Limite Humidite DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.LimiteHumiditeDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteHumiditeDAO()
		 * @generated
		 */
		EClass LIMITE_HUMIDITE_DAO = eINSTANCE.getLimiteHumiditeDAO();

		/**
		 * The meta object literal for the '<em><b>Limite Humidite DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_HUMIDITE_DAO___LIMITE_HUMIDITE_DAO = eINSTANCE.getLimiteHumiditeDAO__LimiteHumiditeDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ModeleEconomiqueProduitDAOImpl <em>Modele Economique Produit DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ModeleEconomiqueProduitDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getModeleEconomiqueProduitDAO()
		 * @generated
		 */
		EClass MODELE_ECONOMIQUE_PRODUIT_DAO = eINSTANCE.getModeleEconomiqueProduitDAO();

		/**
		 * The meta object literal for the '<em><b>Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_ECONOMIQUE_PRODUIT_DAO___MODELE_ECONOMIQUE_PRODUIT = eINSTANCE.getModeleEconomiqueProduitDAO__ModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '{@link projetModele.impl.LimiteTemperatureDAOImpl <em>Limite Temperature DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.LimiteTemperatureDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getLimiteTemperatureDAO()
		 * @generated
		 */
		EClass LIMITE_TEMPERATURE_DAO = eINSTANCE.getLimiteTemperatureDAO();

		/**
		 * The meta object literal for the '<em><b>Limite Temperature DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIMITE_TEMPERATURE_DAO___LIMITE_TEMPERATURE_DAO = eINSTANCE.getLimiteTemperatureDAO__LimiteTemperatureDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteStockageDAOImpl <em>Contrainte Stockage DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteStockageDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteStockageDAO()
		 * @generated
		 */
		EClass CONTRAINTE_STOCKAGE_DAO = eINSTANCE.getContrainteStockageDAO();

		/**
		 * The meta object literal for the '<em><b>Contrainte Stockage DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_STOCKAGE_DAO___CONTRAINTE_STOCKAGE_DAO = eINSTANCE.getContrainteStockageDAO__ContrainteStockageDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeProduitDAOImpl <em>Type Produit DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeProduitDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeProduitDAO()
		 * @generated
		 */
		EClass TYPE_PRODUIT_DAO = eINSTANCE.getTypeProduitDAO();

		/**
		 * The meta object literal for the '<em><b>Type Produit DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_PRODUIT_DAO___TYPE_PRODUIT_DAO = eINSTANCE.getTypeProduitDAO__TypeProduitDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ProduitDAOImpl <em>Produit DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ProduitDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getProduitDAO()
		 * @generated
		 */
		EClass PRODUIT_DAO = eINSTANCE.getProduitDAO();

		/**
		 * The meta object literal for the '<em><b>Produit DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUIT_DAO___PRODUIT_DAO = eINSTANCE.getProduitDAO__ProduitDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteTemperatureDAOImpl <em>Contrainte Temperature DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteTemperatureDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteTemperatureDAO()
		 * @generated
		 */
		EClass CONTRAINTE_TEMPERATURE_DAO = eINSTANCE.getContrainteTemperatureDAO();

		/**
		 * The meta object literal for the '<em><b>Contrainte Temperature DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_TEMPERATURE_DAO___CONTRAINTE_TEMPERATURE_DAO = eINSTANCE.getContrainteTemperatureDAO__ContrainteTemperatureDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ModeleCoutProduitDAOImpl <em>Modele Cout Produit DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ModeleCoutProduitDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getModeleCoutProduitDAO()
		 * @generated
		 */
		EClass MODELE_COUT_PRODUIT_DAO = eINSTANCE.getModeleCoutProduitDAO();

		/**
		 * The meta object literal for the '<em><b>Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELE_COUT_PRODUIT_DAO___MODELE_COUT_PRODUIT = eINSTANCE.getModeleCoutProduitDAO__ModeleCoutProduit();

		/**
		 * The meta object literal for the '{@link projetModele.impl.PositionDAOImpl <em>Position DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.PositionDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getPositionDAO()
		 * @generated
		 */
		EClass POSITION_DAO = eINSTANCE.getPositionDAO();

		/**
		 * The meta object literal for the '<em><b>Position DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION_DAO___POSITION_DAO = eINSTANCE.getPositionDAO__PositionDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ZoneDAOImpl <em>Zone DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ZoneDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getZoneDAO()
		 * @generated
		 */
		EClass ZONE_DAO = eINSTANCE.getZoneDAO();

		/**
		 * The meta object literal for the '<em><b>Zone DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE_DAO___ZONE_DAO = eINSTANCE.getZoneDAO__ZoneDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TopographieDAOImpl <em>Topographie DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TopographieDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTopographieDAO()
		 * @generated
		 */
		EClass TOPOGRAPHIE_DAO = eINSTANCE.getTopographieDAO();

		/**
		 * The meta object literal for the '<em><b>Topographie DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOGRAPHIE_DAO___TOPOGRAPHIE_DAO = eINSTANCE.getTopographieDAO__TopographieDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.EquipementStockageDAOImpl <em>Equipement Stockage DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.EquipementStockageDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getEquipementStockageDAO()
		 * @generated
		 */
		EClass EQUIPEMENT_STOCKAGE_DAO = eINSTANCE.getEquipementStockageDAO();

		/**
		 * The meta object literal for the '<em><b>Equipement Stockage DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPEMENT_STOCKAGE_DAO___EQUIPEMENT_STOCKAGE_DAO = eINSTANCE.getEquipementStockageDAO__EquipementStockageDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.DimensionDAOImpl <em>Dimension DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.DimensionDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getDimensionDAO()
		 * @generated
		 */
		EClass DIMENSION_DAO = eINSTANCE.getDimensionDAO();

		/**
		 * The meta object literal for the '<em><b>Dimension DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIMENSION_DAO___DIMENSION_DAO = eINSTANCE.getDimensionDAO__DimensionDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeEquipementDAOImpl <em>Type Equipement DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeEquipementDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeEquipementDAO()
		 * @generated
		 */
		EClass TYPE_EQUIPEMENT_DAO = eINSTANCE.getTypeEquipementDAO();

		/**
		 * The meta object literal for the '<em><b>Type Equipement DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_EQUIPEMENT_DAO___TYPE_EQUIPEMENT_DAO = eINSTANCE.getTypeEquipementDAO__TypeEquipementDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeSimpleDAOImpl <em>Type Simple DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeSimpleDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeSimpleDAO()
		 * @generated
		 */
		EClass TYPE_SIMPLE_DAO = eINSTANCE.getTypeSimpleDAO();

		/**
		 * The meta object literal for the '<em><b>Type Simple DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_SIMPLE_DAO___TYPE_SIMPLE_DAO = eINSTANCE.getTypeSimpleDAO__TypeSimpleDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeZoneSecheDAOImpl <em>Type Zone Seche DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeZoneSecheDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeZoneSecheDAO()
		 * @generated
		 */
		EClass TYPE_ZONE_SECHE_DAO = eINSTANCE.getTypeZoneSecheDAO();

		/**
		 * The meta object literal for the '<em><b>Type Zone Seche DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_ZONE_SECHE_DAO___TYPE_ZONE_SECHE_DAO = eINSTANCE.getTypeZoneSecheDAO__TypeZoneSecheDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.TypeFrigorifiqueDAOImpl <em>Type Frigorifique DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.TypeFrigorifiqueDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getTypeFrigorifiqueDAO()
		 * @generated
		 */
		EClass TYPE_FRIGORIFIQUE_DAO = eINSTANCE.getTypeFrigorifiqueDAO();

		/**
		 * The meta object literal for the '<em><b>Type Frigorifique DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_FRIGORIFIQUE_DAO___TYPE_FRIGORIFIQUE_DAO = eINSTANCE.getTypeFrigorifiqueDAO__TypeFrigorifiqueDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ContrainteDimensionDAOImpl <em>Contrainte Dimension DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ContrainteDimensionDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getContrainteDimensionDAO()
		 * @generated
		 */
		EClass CONTRAINTE_DIMENSION_DAO = eINSTANCE.getContrainteDimensionDAO();

		/**
		 * The meta object literal for the '<em><b>Contrainte Dimensin DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRAINTE_DIMENSION_DAO___CONTRAINTE_DIMENSIN_DAO = eINSTANCE.getContrainteDimensionDAO__ContrainteDimensinDAO();

		/**
		 * The meta object literal for the '{@link projetModele.impl.AbstractDAOImpl <em>Abstract DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.AbstractDAOImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getAbstractDAO()
		 * @generated
		 */
		EClass ABSTRACT_DAO = eINSTANCE.getAbstractDAO();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DAO___CREATE = eINSTANCE.getAbstractDAO__Create();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DAO___DELETE = eINSTANCE.getAbstractDAO__Delete();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DAO___SAVE = eINSTANCE.getAbstractDAO__Save();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DAO___FIND = eINSTANCE.getAbstractDAO__Find();

		/**
		 * The meta object literal for the '{@link projetModele.impl.ControleurImpl <em>Controleur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetModele.impl.ControleurImpl
		 * @see projetModele.impl.ProjetModelePackageImpl#getControleur()
		 * @generated
		 */
		EClass CONTROLEUR = eINSTANCE.getControleur();

		/**
		 * The meta object literal for the '<em><b>Controleur DAO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___CONTROLEUR_DAO = eINSTANCE.getControleur__ControleurDAO();

		/**
		 * The meta object literal for the '<em><b>Add Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = eINSTANCE.getControleur__AddOperateurEntrepot__OperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Remove Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = eINSTANCE.getControleur__RemoveOperateurEntrepot__OperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Update Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_OPERATEUR_ENTREPOT__OPERATEURENTREPOT = eINSTANCE.getControleur__UpdateOperateurEntrepot__OperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Get All Operateur Entrepot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_OPERATEUR_ENTREPOT = eINSTANCE.getControleur__GetAllOperateurEntrepot();

		/**
		 * The meta object literal for the '<em><b>Add Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_ZONE__ZONE = eINSTANCE.getControleur__AddZone__Zone();

		/**
		 * The meta object literal for the '<em><b>Remove Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_ZONE__ZONE = eINSTANCE.getControleur__RemoveZone__Zone();

		/**
		 * The meta object literal for the '<em><b>Update Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_ZONE__ZONE = eINSTANCE.getControleur__UpdateZone__Zone();

		/**
		 * The meta object literal for the '<em><b>Get All Zone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_ZONE = eINSTANCE.getControleur__GetAllZone();

		/**
		 * The meta object literal for the '<em><b>Add Topographie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TOPOGRAPHIE__TOPOGRAPHIE = eINSTANCE.getControleur__AddTopographie__Topographie();

		/**
		 * The meta object literal for the '<em><b>Remove Topographique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TOPOGRAPHIQUE__TOPOGRAPHIE = eINSTANCE.getControleur__RemoveTopographique__Topographie();

		/**
		 * The meta object literal for the '<em><b>Update Topographie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TOPOGRAPHIE__TOPOGRAPHIE = eINSTANCE.getControleur__UpdateTopographie__Topographie();

		/**
		 * The meta object literal for the '<em><b>Get All Topograpie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TOPOGRAPIE = eINSTANCE.getControleur__GetAllTopograpie();

		/**
		 * The meta object literal for the '<em><b>Add Equipement Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = eINSTANCE.getControleur__AddEquipementStockage__EquipementStockage();

		/**
		 * The meta object literal for the '<em><b>Remove Equipement Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = eINSTANCE.getControleur__RemoveEquipementStockage__EquipementStockage();

		/**
		 * The meta object literal for the '<em><b>Update Equipement Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_EQUIPEMENT_STOCKAGE__EQUIPEMENTSTOCKAGE = eINSTANCE.getControleur__UpdateEquipementStockage__EquipementStockage();

		/**
		 * The meta object literal for the '<em><b>Get All Equipement Stockages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_EQUIPEMENT_STOCKAGES = eINSTANCE.getControleur__GetAllEquipementStockages();

		/**
		 * The meta object literal for the '<em><b>Add Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_DIMENSION__DIMENSION = eINSTANCE.getControleur__AddDimension__Dimension();

		/**
		 * The meta object literal for the '<em><b>Remove Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_DIMENSION__DIMENSION = eINSTANCE.getControleur__RemoveDimension__Dimension();

		/**
		 * The meta object literal for the '<em><b>Update Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_DIMENSION__DIMENSION = eINSTANCE.getControleur__UpdateDimension__Dimension();

		/**
		 * The meta object literal for the '<em><b>Get All Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_DIMENSION = eINSTANCE.getControleur__GetAllDimension();

		/**
		 * The meta object literal for the '<em><b>Add Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = eINSTANCE.getControleur__AddTypeEquipement__TypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Remove Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = eINSTANCE.getControleur__RemoveTypeEquipement__TypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Update Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TYPE_EQUIPEMENT__TYPEEQUIPEMENT = eINSTANCE.getControleur__UpdateTypeEquipement__TypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Get All Type Equipement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TYPE_EQUIPEMENT = eINSTANCE.getControleur__GetAllTypeEquipement();

		/**
		 * The meta object literal for the '<em><b>Add Type Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TYPE_SIMPLE__TYPESIMPLE = eINSTANCE.getControleur__AddTypeSimple__TypeSimple();

		/**
		 * The meta object literal for the '<em><b>Remove Type Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TYPE_SIMPLE__TYPESIMPLE = eINSTANCE.getControleur__RemoveTypeSimple__TypeSimple();

		/**
		 * The meta object literal for the '<em><b>Update Type Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TYPE_SIMPLE__TYPESIMPLE = eINSTANCE.getControleur__UpdateTypeSimple__TypeSimple();

		/**
		 * The meta object literal for the '<em><b>Get All Type Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TYPE_SIMPLE = eINSTANCE.getControleur__GetAllTypeSimple();

		/**
		 * The meta object literal for the '<em><b>Add Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TYPE_ZONE_SECHE__TYPEZONESECHE = eINSTANCE.getControleur__AddTypeZoneSeche__TypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Remove Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TYPE_ZONE_SECHE__TYPEZONESECHE = eINSTANCE.getControleur__RemoveTypeZoneSeche__TypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Update Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TYPE_ZONE_SECHE__TYPEZONESECHE = eINSTANCE.getControleur__UpdateTypeZoneSeche__TypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Get All Type Zone Seche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TYPE_ZONE_SECHE = eINSTANCE.getControleur__GetAllTypeZoneSeche();

		/**
		 * The meta object literal for the '<em><b>Add Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = eINSTANCE.getControleur__AddTypeFrigorifique__TypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Remove Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = eINSTANCE.getControleur__RemoveTypeFrigorifique__TypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Update Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TYPE_FRIGORIFIQUE__TYPEFRIGORIFIQUE = eINSTANCE.getControleur__UpdateTypeFrigorifique__TypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Get All Type Frigorifique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TYPE_FRIGORIFIQUE = eINSTANCE.getControleur__GetAllTypeFrigorifique();

		/**
		 * The meta object literal for the '<em><b>Add Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = eINSTANCE.getControleur__AddContrainteDimension__ContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Remove Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = eINSTANCE.getControleur__RemoveContrainteDimension__ContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Update Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_CONTRAINTE_DIMENSION__CONTRAINTEDIMENSION = eINSTANCE.getControleur__UpdateContrainteDimension__ContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Get All Contrainte Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_CONTRAINTE_DIMENSION = eINSTANCE.getControleur__GetAllContrainteDimension();

		/**
		 * The meta object literal for the '<em><b>Add Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_POSITION__POSITION = eINSTANCE.getControleur__AddPosition__Position();

		/**
		 * The meta object literal for the '<em><b>Remove Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_POSITION__POSITION = eINSTANCE.getControleur__RemovePosition__Position();

		/**
		 * The meta object literal for the '<em><b>Update Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_POSITION__POSITION = eINSTANCE.getControleur__UpdatePosition__Position();

		/**
		 * The meta object literal for the '<em><b>Get All Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_POSITION = eINSTANCE.getControleur__GetAllPosition();

		/**
		 * The meta object literal for the '<em><b>Add Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = eINSTANCE.getControleur__AddModeleCoutProduit__ModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Remove Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = eINSTANCE.getControleur__RemoveModeleCoutProduit__ModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Update Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_MODELE_COUT_PRODUIT__MODELECOUTPRODUIT = eINSTANCE.getControleur__UpdateModeleCoutProduit__ModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Get All Modele Cout Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_MODELE_COUT_PRODUIT = eINSTANCE.getControleur__GetAllModeleCoutProduit();

		/**
		 * The meta object literal for the '<em><b>Add Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = eINSTANCE.getControleur__AddModeleEconomiqueProduit__ModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Remove Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = eINSTANCE.getControleur__RemoveModeleEconomiqueProduit__ModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Update Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_MODELE_ECONOMIQUE_PRODUIT__MODELEECONOMIQUEPRODUIT = eINSTANCE.getControleur__UpdateModeleEconomiqueProduit__ModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Get All Modele Economique Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_MODELE_ECONOMIQUE_PRODUIT = eINSTANCE.getControleur__GetAllModeleEconomiqueProduit();

		/**
		 * The meta object literal for the '<em><b>Add Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_LIMITE_HUMIDITE__LIMITEHUMIDITE = eINSTANCE.getControleur__AddLimiteHumidite__LimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Remove Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_LIMITE_HUMIDITE__LIMITEHUMIDITE = eINSTANCE.getControleur__RemoveLimiteHumidite__LimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Update Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_LIMITE_HUMIDITE__LIMITEHUMIDITE = eINSTANCE.getControleur__UpdateLimiteHumidite__LimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Get All Limite Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_LIMITE_HUMIDITE = eINSTANCE.getControleur__GetAllLimiteHumidite();

		/**
		 * The meta object literal for the '<em><b>Add Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = eINSTANCE.getControleur__AddContrainteHumidite__ContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Remove Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = eINSTANCE.getControleur__RemoveContrainteHumidite__ContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Update Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_CONTRAINTE_HUMIDITE__CONTRAINTEHUMIDITE = eINSTANCE.getControleur__UpdateContrainteHumidite__ContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Get All Contrainte Humidite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_CONTRAINTE_HUMIDITE = eINSTANCE.getControleur__GetAllContrainteHumidite();

		/**
		 * The meta object literal for the '<em><b>Add Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_LIMITE_TEMPERATURE__LIMITETEMPERATURE = eINSTANCE.getControleur__AddLimiteTemperature__LimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Remove Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_LIMITE_TEMPERATURE__LIMITETEMPERATURE = eINSTANCE.getControleur__RemoveLimiteTemperature__LimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Update Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_LIMITE_TEMPERATURE__LIMITETEMPERATURE = eINSTANCE.getControleur__UpdateLimiteTemperature__LimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Get All Limite Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_LIMITE_TEMPERATURE = eINSTANCE.getControleur__GetAllLimiteTemperature();

		/**
		 * The meta object literal for the '<em><b>Add Contrainte Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = eINSTANCE.getControleur__AddContrainteStockage__ContrainteStockage();

		/**
		 * The meta object literal for the '<em><b>Remove Contrainte Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = eINSTANCE.getControleur__RemoveContrainteStockage__ContrainteStockage();

		/**
		 * The meta object literal for the '<em><b>Update Contrainte Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_CONTRAINTE_STOCKAGE__CONTRAINTESTOCKAGE = eINSTANCE.getControleur__UpdateContrainteStockage__ContrainteStockage();

		/**
		 * The meta object literal for the '<em><b>Get All Contrainte Stockage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_CONTRAINTE_STOCKAGE = eINSTANCE.getControleur__GetAllContrainteStockage();

		/**
		 * The meta object literal for the '<em><b>Add Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_TYPE_PRODUIT__TYPEPRODUIT = eINSTANCE.getControleur__AddTypeProduit__TypeProduit();

		/**
		 * The meta object literal for the '<em><b>Remove Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_TYPE_PRODUIT__TYPEPRODUIT = eINSTANCE.getControleur__RemoveTypeProduit__TypeProduit();

		/**
		 * The meta object literal for the '<em><b>Update Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_TYPE_PRODUIT__TYPEPRODUIT = eINSTANCE.getControleur__UpdateTypeProduit__TypeProduit();

		/**
		 * The meta object literal for the '<em><b>Get All Type Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_TYPE_PRODUIT = eINSTANCE.getControleur__GetAllTypeProduit();

		/**
		 * The meta object literal for the '<em><b>Add Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_PRODUIT__PRODUIT = eINSTANCE.getControleur__AddProduit__Produit();

		/**
		 * The meta object literal for the '<em><b>Remove Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_PRODUIT__PRODUIT = eINSTANCE.getControleur__RemoveProduit__Produit();

		/**
		 * The meta object literal for the '<em><b>Update Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_PRODUIT__PRODUIT = eINSTANCE.getControleur__UpdateProduit__Produit();

		/**
		 * The meta object literal for the '<em><b>Get All Produit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_PRODUIT = eINSTANCE.getControleur__GetAllProduit();

		/**
		 * The meta object literal for the '<em><b>Add Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___ADD_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = eINSTANCE.getControleur__AddContrainteTemperature__ContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Remove Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___REMOVE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = eINSTANCE.getControleur__RemoveContrainteTemperature__ContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Update Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___UPDATE_CONTRAINTE_TEMPERATURE__CONTRAINTETEMPERATURE = eINSTANCE.getControleur__UpdateContrainteTemperature__ContrainteTemperature();

		/**
		 * The meta object literal for the '<em><b>Get All Contrainte Temperature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLEUR___GET_ALL_CONTRAINTE_TEMPERATURE = eINSTANCE.getControleur__GetAllContrainteTemperature();

	}

} //ProjetModelePackage
