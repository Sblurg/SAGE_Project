package produitsModeliser;

import projetModele.ProjetModeleFactory;

public class LotCarotte {
	
	private projetModele.LotProduit mLot;
	
	public LotCarotte() {
		mLot = ProjetModeleFactory.eINSTANCE.createLotProduit();
		
		for(int i = 0; i < 1000; i++) {
			projetModele.Produit lProduit = ProjetModeleFactory.eINSTANCE.createProduit();
			lProduit.setName("Carotte");
			projetModele.TypeProduit lTypeProduit = ProjetModeleFactory.eINSTANCE.createTypeProduit();
			lTypeProduit.setName("Legume");
			lProduit.setType(lTypeProduit);
			mLot.getProduits().add(lProduit);
		}
	}
	
	public projetModele.LotProduit getLotCarrote() {
		return mLot;
	}
}
