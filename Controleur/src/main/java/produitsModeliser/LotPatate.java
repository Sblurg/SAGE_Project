package produitsModeliser;

import projetModele.ProjetModeleFactory;

public class LotPatate {
	
	private projetModele.LotProduit mLot;
	private float mCoutDuLot;
	private float mNbVente;
	
	public LotPatate(float pCoutDuLot, float pNbVente) {
		mCoutDuLot = pCoutDuLot;
		mNbVente = pNbVente;
		mLot = ProjetModeleFactory.eINSTANCE.createLotProduit();
		
		for(int i = 0; i < 3000000; i++) {
			projetModele.Produit lProduit = ProjetModeleFactory.eINSTANCE.createProduit();
			lProduit.setName("Patate");
			projetModele.TypeProduit lTypeProduit = ProjetModeleFactory.eINSTANCE.createTypeProduit();
			lTypeProduit.setName("Legume");
			lProduit.setType(lTypeProduit);
			mLot.getProduits().add(lProduit);
		}
	}
	
	public projetModele.LotProduit getLotPatate() {
		return mLot;
	}
	
	public projetModele.LotProduit getLot() {
		return mLot;
	}

	public void setLot(projetModele.LotProduit mLot) {
		this.mLot = mLot;
	}

	public float getCoutDuLot() {
		return mCoutDuLot;
	}

	public void setCoutDuLot(float mCoutDuLot) {
		this.mCoutDuLot = mCoutDuLot;
	}
	
	public float getNbVente() {
		return mNbVente;
	}
}
