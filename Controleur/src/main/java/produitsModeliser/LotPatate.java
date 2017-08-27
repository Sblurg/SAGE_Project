package produitsModeliser;

import projetModele.ProjetModeleFactory;

public class LotPatate {
	
	private projetModele.LotProduit mLot;
	
	public LotPatate() {
		mLot = ProjetModeleFactory.eINSTANCE.createLotProduit();
		
		for(int i = 0; i < 1000; i++) {
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
}
