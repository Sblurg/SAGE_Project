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

	public String getmNomProduit() {
		return mNomProduit;
	}

	public void setmNomProduit(String mNomProduit) {
		this.mNomProduit = mNomProduit;
	}

	public String getmMois() {
		return mMois;
	}

	public void setmMois(String mMois) {
		this.mMois = mMois;
	}

	public double getmMoyenne() {
		return mMoyenne;
	}

	public void setmMoyenne(double mMoyenne) {
		this.mMoyenne = mMoyenne;
	}

	public double getmEcart() {
		return mEcart;
	}

	public void setmEcart(double mEcart) {
		this.mEcart = mEcart;
	}
}
