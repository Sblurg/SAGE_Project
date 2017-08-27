package modules;

public class StatistiqueProduitMois {
	private String mNomProduit;
	private String mMois;
	private double mMoyenne;
	private double mEcart;
	
	public StatistiqueProduitMois(String pNom, String pMois, double pMoyenne, double pEcart) {
		mNomProduit = pNom;
		mMois = pMois;
		mMoyenne = pMoyenne;
		mEcart = pEcart;
	}
}
