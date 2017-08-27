/**
 */
package projetModele.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projetModele.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projetModele.ProjetModelePackage
 * @generated
 */
public class ProjetModeleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetModelePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetModeleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjetModelePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetModeleSwitch<Adapter> modelSwitch =
		new ProjetModeleSwitch<Adapter>() {
			@Override
			public Adapter caseOperateurEntrepot(OperateurEntrepot object) {
				return createOperateurEntrepotAdapter();
			}
			@Override
			public Adapter caseTopographie(Topographie object) {
				return createTopographieAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseEquipementStockage(EquipementStockage object) {
				return createEquipementStockageAdapter();
			}
			@Override
			public Adapter caseTypeEquipement(TypeEquipement object) {
				return createTypeEquipementAdapter();
			}
			@Override
			public Adapter caseTypeSimple(TypeSimple object) {
				return createTypeSimpleAdapter();
			}
			@Override
			public Adapter caseTypeZoneSeche(TypeZoneSeche object) {
				return createTypeZoneSecheAdapter();
			}
			@Override
			public Adapter caseContrainteHumidite(ContrainteHumidite object) {
				return createContrainteHumiditeAdapter();
			}
			@Override
			public Adapter caseTypeFrigorifique(TypeFrigorifique object) {
				return createTypeFrigorifiqueAdapter();
			}
			@Override
			public Adapter caseContrainteTemperature(ContrainteTemperature object) {
				return createContrainteTemperatureAdapter();
			}
			@Override
			public Adapter caseContrainteDimension(ContrainteDimension object) {
				return createContrainteDimensionAdapter();
			}
			@Override
			public Adapter caseProduit(Produit object) {
				return createProduitAdapter();
			}
			@Override
			public Adapter caseTypeProduit(TypeProduit object) {
				return createTypeProduitAdapter();
			}
			@Override
			public Adapter caseContrainteStockage(ContrainteStockage object) {
				return createContrainteStockageAdapter();
			}
			@Override
			public Adapter caseLimiteTemperature(LimiteTemperature object) {
				return createLimiteTemperatureAdapter();
			}
			@Override
			public Adapter caseLimiteHumidite(LimiteHumidite object) {
				return createLimiteHumiditeAdapter();
			}
			@Override
			public Adapter caseModeleCoutProduit(ModeleCoutProduit object) {
				return createModeleCoutProduitAdapter();
			}
			@Override
			public Adapter caseModeleEconomiqueProduit(ModeleEconomiqueProduit object) {
				return createModeleEconomiqueProduitAdapter();
			}
			@Override
			public Adapter caseOperateurEntreprotDAO(OperateurEntreprotDAO object) {
				return createOperateurEntreprotDAOAdapter();
			}
			@Override
			public Adapter caseContrainteHumiditeDAO(ContrainteHumiditeDAO object) {
				return createContrainteHumiditeDAOAdapter();
			}
			@Override
			public Adapter caseLimiteHumiditeDAO(LimiteHumiditeDAO object) {
				return createLimiteHumiditeDAOAdapter();
			}
			@Override
			public Adapter caseModeleEconomiqueProduitDAO(ModeleEconomiqueProduitDAO object) {
				return createModeleEconomiqueProduitDAOAdapter();
			}
			@Override
			public Adapter caseLimiteTemperatureDAO(LimiteTemperatureDAO object) {
				return createLimiteTemperatureDAOAdapter();
			}
			@Override
			public Adapter caseContrainteStockageDAO(ContrainteStockageDAO object) {
				return createContrainteStockageDAOAdapter();
			}
			@Override
			public Adapter caseTypeProduitDAO(TypeProduitDAO object) {
				return createTypeProduitDAOAdapter();
			}
			@Override
			public Adapter caseProduitDAO(ProduitDAO object) {
				return createProduitDAOAdapter();
			}
			@Override
			public Adapter caseContrainteTemperatureDAO(ContrainteTemperatureDAO object) {
				return createContrainteTemperatureDAOAdapter();
			}
			@Override
			public Adapter caseModeleCoutProduitDAO(ModeleCoutProduitDAO object) {
				return createModeleCoutProduitDAOAdapter();
			}
			@Override
			public Adapter casePositionDAO(PositionDAO object) {
				return createPositionDAOAdapter();
			}
			@Override
			public Adapter caseZoneDAO(ZoneDAO object) {
				return createZoneDAOAdapter();
			}
			@Override
			public Adapter caseTopographieDAO(TopographieDAO object) {
				return createTopographieDAOAdapter();
			}
			@Override
			public Adapter caseEquipementStockageDAO(EquipementStockageDAO object) {
				return createEquipementStockageDAOAdapter();
			}
			@Override
			public Adapter caseDimensionDAO(DimensionDAO object) {
				return createDimensionDAOAdapter();
			}
			@Override
			public Adapter caseTypeEquipementDAO(TypeEquipementDAO object) {
				return createTypeEquipementDAOAdapter();
			}
			@Override
			public Adapter caseTypeSimpleDAO(TypeSimpleDAO object) {
				return createTypeSimpleDAOAdapter();
			}
			@Override
			public Adapter caseTypeZoneSecheDAO(TypeZoneSecheDAO object) {
				return createTypeZoneSecheDAOAdapter();
			}
			@Override
			public Adapter caseTypeFrigorifiqueDAO(TypeFrigorifiqueDAO object) {
				return createTypeFrigorifiqueDAOAdapter();
			}
			@Override
			public Adapter caseContrainteDimensionDAO(ContrainteDimensionDAO object) {
				return createContrainteDimensionDAOAdapter();
			}
			@Override
			public Adapter caseAbstractDAO(AbstractDAO object) {
				return createAbstractDAOAdapter();
			}
			@Override
			public Adapter caseControleur(Controleur object) {
				return createControleurAdapter();
			}
			@Override
			public Adapter caseLotProduit(LotProduit object) {
				return createLotProduitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link projetModele.OperateurEntrepot <em>Operateur Entrepot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.OperateurEntrepot
	 * @generated
	 */
	public Adapter createOperateurEntrepotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Topographie <em>Topographie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Topographie
	 * @generated
	 */
	public Adapter createTopographieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.EquipementStockage <em>Equipement Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.EquipementStockage
	 * @generated
	 */
	public Adapter createEquipementStockageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeEquipement <em>Type Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeEquipement
	 * @generated
	 */
	public Adapter createTypeEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeSimple <em>Type Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeSimple
	 * @generated
	 */
	public Adapter createTypeSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeZoneSeche <em>Type Zone Seche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeZoneSeche
	 * @generated
	 */
	public Adapter createTypeZoneSecheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteHumidite <em>Contrainte Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteHumidite
	 * @generated
	 */
	public Adapter createContrainteHumiditeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeFrigorifique <em>Type Frigorifique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeFrigorifique
	 * @generated
	 */
	public Adapter createTypeFrigorifiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteTemperature <em>Contrainte Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteTemperature
	 * @generated
	 */
	public Adapter createContrainteTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteDimension <em>Contrainte Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteDimension
	 * @generated
	 */
	public Adapter createContrainteDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Produit <em>Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Produit
	 * @generated
	 */
	public Adapter createProduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeProduit <em>Type Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeProduit
	 * @generated
	 */
	public Adapter createTypeProduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteStockage <em>Contrainte Stockage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteStockage
	 * @generated
	 */
	public Adapter createContrainteStockageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.LimiteTemperature <em>Limite Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.LimiteTemperature
	 * @generated
	 */
	public Adapter createLimiteTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.LimiteHumidite <em>Limite Humidite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.LimiteHumidite
	 * @generated
	 */
	public Adapter createLimiteHumiditeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ModeleCoutProduit <em>Modele Cout Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ModeleCoutProduit
	 * @generated
	 */
	public Adapter createModeleCoutProduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ModeleEconomiqueProduit <em>Modele Economique Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ModeleEconomiqueProduit
	 * @generated
	 */
	public Adapter createModeleEconomiqueProduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.OperateurEntreprotDAO <em>Operateur Entreprot DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.OperateurEntreprotDAO
	 * @generated
	 */
	public Adapter createOperateurEntreprotDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteHumiditeDAO <em>Contrainte Humidite DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteHumiditeDAO
	 * @generated
	 */
	public Adapter createContrainteHumiditeDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.LimiteHumiditeDAO <em>Limite Humidite DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.LimiteHumiditeDAO
	 * @generated
	 */
	public Adapter createLimiteHumiditeDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ModeleEconomiqueProduitDAO <em>Modele Economique Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ModeleEconomiqueProduitDAO
	 * @generated
	 */
	public Adapter createModeleEconomiqueProduitDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.LimiteTemperatureDAO <em>Limite Temperature DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.LimiteTemperatureDAO
	 * @generated
	 */
	public Adapter createLimiteTemperatureDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteStockageDAO <em>Contrainte Stockage DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteStockageDAO
	 * @generated
	 */
	public Adapter createContrainteStockageDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeProduitDAO <em>Type Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeProduitDAO
	 * @generated
	 */
	public Adapter createTypeProduitDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ProduitDAO <em>Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ProduitDAO
	 * @generated
	 */
	public Adapter createProduitDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteTemperatureDAO <em>Contrainte Temperature DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteTemperatureDAO
	 * @generated
	 */
	public Adapter createContrainteTemperatureDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ModeleCoutProduitDAO <em>Modele Cout Produit DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ModeleCoutProduitDAO
	 * @generated
	 */
	public Adapter createModeleCoutProduitDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.PositionDAO <em>Position DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.PositionDAO
	 * @generated
	 */
	public Adapter createPositionDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ZoneDAO <em>Zone DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ZoneDAO
	 * @generated
	 */
	public Adapter createZoneDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TopographieDAO <em>Topographie DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TopographieDAO
	 * @generated
	 */
	public Adapter createTopographieDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.EquipementStockageDAO <em>Equipement Stockage DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.EquipementStockageDAO
	 * @generated
	 */
	public Adapter createEquipementStockageDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.DimensionDAO <em>Dimension DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.DimensionDAO
	 * @generated
	 */
	public Adapter createDimensionDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeEquipementDAO <em>Type Equipement DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeEquipementDAO
	 * @generated
	 */
	public Adapter createTypeEquipementDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeSimpleDAO <em>Type Simple DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeSimpleDAO
	 * @generated
	 */
	public Adapter createTypeSimpleDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeZoneSecheDAO <em>Type Zone Seche DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeZoneSecheDAO
	 * @generated
	 */
	public Adapter createTypeZoneSecheDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.TypeFrigorifiqueDAO <em>Type Frigorifique DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.TypeFrigorifiqueDAO
	 * @generated
	 */
	public Adapter createTypeFrigorifiqueDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.ContrainteDimensionDAO <em>Contrainte Dimension DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.ContrainteDimensionDAO
	 * @generated
	 */
	public Adapter createContrainteDimensionDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.AbstractDAO <em>Abstract DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.AbstractDAO
	 * @generated
	 */
	public Adapter createAbstractDAOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.Controleur <em>Controleur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.Controleur
	 * @generated
	 */
	public Adapter createControleurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetModele.LotProduit <em>Lot Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetModele.LotProduit
	 * @generated
	 */
	public Adapter createLotProduitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProjetModeleAdapterFactory
