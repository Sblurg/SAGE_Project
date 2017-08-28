package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import produitsModeliser.LotCarotte;
import produitsModeliser.LotPatate;

public class Calculs {
	
	static List<StatistiqueProduitMois> mListStatPatate;
	static List<StatistiqueProduitMois> mListStatCarotte;
	
	public static void calculMoyenneEcart(List<Map<String,LotCarotte>> pLotCarotte,
			List<Map<String,LotPatate>> pLotPatate) {
		
		mListStatPatate = new ArrayList<StatistiqueProduitMois>();
		mListStatCarotte = new ArrayList<StatistiqueProduitMois>();
		
		for(int i = 0; i < 12; i++) {
			switch(i) {
			case 0: 
				calculStatsMois("Janvier", pLotCarotte, pLotPatate);
				break;
			case 1: 
				calculStatsMois("Fevrier", pLotCarotte, pLotPatate);
				break;
			case 2: 
				calculStatsMois("Mars", pLotCarotte, pLotPatate);
				break;
			case 3: 
				calculStatsMois("Avril", pLotCarotte, pLotPatate);
				break;
			case 4: 
				calculStatsMois("Mai", pLotCarotte, pLotPatate);
				break;
			case 5: 
				calculStatsMois("Juin", pLotCarotte, pLotPatate);
				break;
			case 6: 
				calculStatsMois("Juillet", pLotCarotte, pLotPatate);
				break;
			case 7: 
				calculStatsMois("Aout", pLotCarotte, pLotPatate);
				break;
			case 8: 
				calculStatsMois("Septembre", pLotCarotte, pLotPatate);
				break;
			case 9: 
				calculStatsMois("Octobre", pLotCarotte, pLotPatate);
				break;
			case 10: 
				calculStatsMois("Novembre", pLotCarotte, pLotPatate);
				break;
			case 11: 
				calculStatsMois("Decembre", pLotCarotte, pLotPatate);
				break;
			}
		}
	}
	
	private static void calculStatsMois(String pMois, List<Map<String,LotCarotte>> pLotCarotte,
			List<Map<String,LotPatate>> pLotPatate) {
		
		DescriptiveStatistics lStatCarotte = new DescriptiveStatistics();
		Iterator it = pLotCarotte.iterator();
		
		DescriptiveStatistics lStatPatate = new DescriptiveStatistics();
		Iterator it2 = pLotCarotte.iterator();
		
		while(it.hasNext()) {
			Map<String, LotCarotte> lMap = (Map<String, LotCarotte>) it.next();
			for(String lNom : lMap.keySet()) {
				if(lNom.equals(pMois)) {
					lStatCarotte.addValue(lMap.get(lNom).getNbVente());
				}
			}
			
			mListStatCarotte.add(new StatistiqueProduitMois("Carotte", pMois, 
					lStatCarotte.getMean(), lStatCarotte.getStandardDeviation()));
			
			System.out.println("Carotte :: " + pMois + " :: Moyenne : " + lStatCarotte.getMean() + 
					", Ecart Type : " + lStatCarotte.getStandardDeviation());
			
			
			while(it2.hasNext()) {
				Map<String, LotPatate> lMap2 = (Map<String, LotPatate>) it2.next();
				for(String lNom : lMap2.keySet()) {
					if(lNom.equals("Janvier")) {
						lStatPatate.addValue(lMap2.get(lNom).getNbVente());
					}
				}
				
				mListStatPatate.add(new StatistiqueProduitMois("Patate", pMois, 
						lStatPatate.getMean(), lStatPatate.getStandardDeviation()));
				
				System.out.println("Patate :: " + pMois + " :: Moyenne : " + lStatPatate.getMean() + 
						", Ecart Type : " + lStatPatate.getStandardDeviation());
			}
		}
	}
	
	public double calculProbabilite(double x, StatistiqueProduitMois s) {
		double ret = 0.0;
		
		NormalDistribution lNorm = new NormalDistribution(s.getmMoyenne(), s.getmEcart());
		ret = 1 - lNorm.cumulativeProbability(x - 1);
		
		return ret;
	}

	public static List<StatistiqueProduitMois> getmListStatPatate() {
		return mListStatPatate;
	}

	public static void setmListStatPatate(List<StatistiqueProduitMois> mListStatPatate) {
		Calculs.mListStatPatate = mListStatPatate;
	}

	public static List<StatistiqueProduitMois> getmListStatCarotte() {
		return mListStatCarotte;
	}

	public static void setmListStatCarotte(List<StatistiqueProduitMois> mListStatCarotte) {
		Calculs.mListStatCarotte = mListStatCarotte;
	}
}
