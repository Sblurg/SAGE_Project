/**
 */
package projetModele.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetModele.ContrainteStockage;
import projetModele.Dimension;
import projetModele.ModeleCoutProduit;
import projetModele.Position;
import projetModele.Produit;
import projetModele.ProjetModelePackage;
import projetModele.TypeProduit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetModele.impl.ProduitImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getDateLimiteConso <em>Date Limite Conso</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getType <em>Type</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getContrainteStockage <em>Contrainte Stockage</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getModeleCout <em>Modele Cout</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getCoutAchat <em>Cout Achat</em>}</li>
 *   <li>{@link projetModele.impl.ProduitImpl#getCoutVente <em>Cout Vente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProduitImpl extends MinimalEObjectImpl.Container implements Produit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLimiteConso() <em>Date Limite Conso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteConso()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LIMITE_CONSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLimiteConso() <em>Date Limite Conso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteConso()
	 * @generated
	 * @ordered
	 */
	protected Date dateLimiteConso = DATE_LIMITE_CONSO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeProduit type;

	/**
	 * The cached value of the '{@link #getContrainteStockage() <em>Contrainte Stockage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainteStockage()
	 * @generated
	 * @ordered
	 */
	protected EList<ContrainteStockage> contrainteStockage;

	/**
	 * The cached value of the '{@link #getModeleCout() <em>Modele Cout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeleCout()
	 * @generated
	 * @ordered
	 */
	protected ModeleCoutProduit modeleCout;

	/**
	 * The default value of the '{@link #getCoutAchat() <em>Cout Achat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutAchat()
	 * @generated
	 * @ordered
	 */
	protected static final float COUT_ACHAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoutAchat() <em>Cout Achat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutAchat()
	 * @generated
	 * @ordered
	 */
	protected float coutAchat = COUT_ACHAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoutVente() <em>Cout Vente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutVente()
	 * @generated
	 * @ordered
	 */
	protected static final float COUT_VENTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoutVente() <em>Cout Vente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoutVente()
	 * @generated
	 * @ordered
	 */
	protected float coutVente = COUT_VENTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetModelePackage.Literals.PRODUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLimiteConso() {
		return dateLimiteConso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLimiteConso(Date newDateLimiteConso) {
		Date oldDateLimiteConso = dateLimiteConso;
		dateLimiteConso = newDateLimiteConso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__DATE_LIMITE_CONSO, oldDateLimiteConso, dateLimiteConso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (Dimension)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.PRODUIT__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (Position)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.PRODUIT__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProduit getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeProduit)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.PRODUIT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeProduit basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeProduit newType) {
		TypeProduit oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContrainteStockage> getContrainteStockage() {
		if (contrainteStockage == null) {
			contrainteStockage = new EObjectResolvingEList<ContrainteStockage>(ContrainteStockage.class, this, ProjetModelePackage.PRODUIT__CONTRAINTE_STOCKAGE);
		}
		return contrainteStockage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit getModeleCout() {
		if (modeleCout != null && modeleCout.eIsProxy()) {
			InternalEObject oldModeleCout = (InternalEObject)modeleCout;
			modeleCout = (ModeleCoutProduit)eResolveProxy(oldModeleCout);
			if (modeleCout != oldModeleCout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetModelePackage.PRODUIT__MODELE_COUT, oldModeleCout, modeleCout));
			}
		}
		return modeleCout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleCoutProduit basicGetModeleCout() {
		return modeleCout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeleCout(ModeleCoutProduit newModeleCout) {
		ModeleCoutProduit oldModeleCout = modeleCout;
		modeleCout = newModeleCout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__MODELE_COUT, oldModeleCout, modeleCout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoutAchat() {
		return coutAchat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoutAchat(float newCoutAchat) {
		float oldCoutAchat = coutAchat;
		coutAchat = newCoutAchat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__COUT_ACHAT, oldCoutAchat, coutAchat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoutVente() {
		return coutVente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoutVente(float newCoutVente) {
		float oldCoutVente = coutVente;
		coutVente = newCoutVente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetModelePackage.PRODUIT__COUT_VENTE, oldCoutVente, coutVente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produit Produit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produit Produit(String name, float coutStock, float coutDestock, Date dateLim, TypeProduit type, Position pos, Dimension dim, ContrainteStockage contrainte) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjetModelePackage.PRODUIT__NAME:
				return getName();
			case ProjetModelePackage.PRODUIT__DATE_LIMITE_CONSO:
				return getDateLimiteConso();
			case ProjetModelePackage.PRODUIT__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
			case ProjetModelePackage.PRODUIT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case ProjetModelePackage.PRODUIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ProjetModelePackage.PRODUIT__CONTRAINTE_STOCKAGE:
				return getContrainteStockage();
			case ProjetModelePackage.PRODUIT__MODELE_COUT:
				if (resolve) return getModeleCout();
				return basicGetModeleCout();
			case ProjetModelePackage.PRODUIT__COUT_ACHAT:
				return getCoutAchat();
			case ProjetModelePackage.PRODUIT__COUT_VENTE:
				return getCoutVente();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjetModelePackage.PRODUIT__NAME:
				setName((String)newValue);
				return;
			case ProjetModelePackage.PRODUIT__DATE_LIMITE_CONSO:
				setDateLimiteConso((Date)newValue);
				return;
			case ProjetModelePackage.PRODUIT__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case ProjetModelePackage.PRODUIT__POSITION:
				setPosition((Position)newValue);
				return;
			case ProjetModelePackage.PRODUIT__TYPE:
				setType((TypeProduit)newValue);
				return;
			case ProjetModelePackage.PRODUIT__CONTRAINTE_STOCKAGE:
				getContrainteStockage().clear();
				getContrainteStockage().addAll((Collection<? extends ContrainteStockage>)newValue);
				return;
			case ProjetModelePackage.PRODUIT__MODELE_COUT:
				setModeleCout((ModeleCoutProduit)newValue);
				return;
			case ProjetModelePackage.PRODUIT__COUT_ACHAT:
				setCoutAchat((Float)newValue);
				return;
			case ProjetModelePackage.PRODUIT__COUT_VENTE:
				setCoutVente((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjetModelePackage.PRODUIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjetModelePackage.PRODUIT__DATE_LIMITE_CONSO:
				setDateLimiteConso(DATE_LIMITE_CONSO_EDEFAULT);
				return;
			case ProjetModelePackage.PRODUIT__DIMENSION:
				setDimension((Dimension)null);
				return;
			case ProjetModelePackage.PRODUIT__POSITION:
				setPosition((Position)null);
				return;
			case ProjetModelePackage.PRODUIT__TYPE:
				setType((TypeProduit)null);
				return;
			case ProjetModelePackage.PRODUIT__CONTRAINTE_STOCKAGE:
				getContrainteStockage().clear();
				return;
			case ProjetModelePackage.PRODUIT__MODELE_COUT:
				setModeleCout((ModeleCoutProduit)null);
				return;
			case ProjetModelePackage.PRODUIT__COUT_ACHAT:
				setCoutAchat(COUT_ACHAT_EDEFAULT);
				return;
			case ProjetModelePackage.PRODUIT__COUT_VENTE:
				setCoutVente(COUT_VENTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjetModelePackage.PRODUIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjetModelePackage.PRODUIT__DATE_LIMITE_CONSO:
				return DATE_LIMITE_CONSO_EDEFAULT == null ? dateLimiteConso != null : !DATE_LIMITE_CONSO_EDEFAULT.equals(dateLimiteConso);
			case ProjetModelePackage.PRODUIT__DIMENSION:
				return dimension != null;
			case ProjetModelePackage.PRODUIT__POSITION:
				return position != null;
			case ProjetModelePackage.PRODUIT__TYPE:
				return type != null;
			case ProjetModelePackage.PRODUIT__CONTRAINTE_STOCKAGE:
				return contrainteStockage != null && !contrainteStockage.isEmpty();
			case ProjetModelePackage.PRODUIT__MODELE_COUT:
				return modeleCout != null;
			case ProjetModelePackage.PRODUIT__COUT_ACHAT:
				return coutAchat != COUT_ACHAT_EDEFAULT;
			case ProjetModelePackage.PRODUIT__COUT_VENTE:
				return coutVente != COUT_VENTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjetModelePackage.PRODUIT___PRODUIT:
				return Produit();
			case ProjetModelePackage.PRODUIT___PRODUIT__STRING_FLOAT_FLOAT_DATE_TYPEPRODUIT_POSITION_DIMENSION_CONTRAINTESTOCKAGE:
				return Produit((String)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2), (Date)arguments.get(3), (TypeProduit)arguments.get(4), (Position)arguments.get(5), (Dimension)arguments.get(6), (ContrainteStockage)arguments.get(7));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dateLimiteConso: ");
		result.append(dateLimiteConso);
		result.append(", coutAchat: ");
		result.append(coutAchat);
		result.append(", coutVente: ");
		result.append(coutVente);
		result.append(')');
		return result.toString();
	}

} //ProduitImpl
