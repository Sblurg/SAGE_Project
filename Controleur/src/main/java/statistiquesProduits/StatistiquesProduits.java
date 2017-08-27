package statistiquesProduits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import produitsModeliser.LotCarotte;
import produitsModeliser.LotPatate;

// Statistiques des cout d'achat des produits par an
public class StatistiquesProduits {

	private List<Map<String,LotCarotte>> mLotCarotte;
	private List<Map<String,LotPatate>> mLotPatate;
	
	// Les valeurs vont de Septembre 2014 à Aout 2017
	public StatistiquesProduits() {
		mLotCarotte = new ArrayList<Map<String, LotCarotte>>();
		mLotPatate = new ArrayList<Map<String, LotPatate>>();
		for(int i = 2014; i < 2018; i++) {
			switch(i) {
			case 2014 :
				Map<String,LotCarotte> lMap = new HashMap<String, LotCarotte>();
				lMap.put("Septembre", new LotCarotte(17, 15));
				lMap.put("Octobre", new LotCarotte(17, 10));
				lMap.put("Novembre", new LotCarotte(16, 12));
				lMap.put("Decembre", new LotCarotte(14, 15));
				mLotCarotte.add(lMap);
				
				Map<String,LotPatate> lMap2 = new HashMap<String, LotPatate>();
				lMap2.put("Septembre", new LotPatate(64, 75));
				lMap2.put("Octobre", new LotPatate(55, 50));
				lMap2.put("Novembre", new LotPatate(54, 48));
				lMap2.put("Decembre", new LotPatate(46, 40));
				mLotPatate.add(lMap2);
				break;
				
			case 2015 : 
				Map<String,LotCarotte> lMap3 = new HashMap<String, LotCarotte>();
				lMap3.put("Janvier", new LotCarotte(15, 15));
				lMap3.put("Fevrier", new LotCarotte(15, 15));
				lMap3.put("Mars", new LotCarotte(18, 16));
				lMap3.put("Avril", new LotCarotte(17, 15));
				lMap3.put("Mai", new LotCarotte(22, 20));
				lMap3.put("Juin", new LotCarotte(24, 22));
				lMap3.put("Juillet", new LotCarotte(27, 35));
				lMap3.put("Aout", new LotCarotte(24, 32));
				lMap3.put("Septembre", new LotCarotte(25, 35));
				lMap3.put("Octobre", new LotCarotte(23, 31));
				lMap3.put("Novembre", new LotCarotte(20, 29));
				lMap3.put("Decembre", new LotCarotte(22, 30));
				mLotCarotte.add(lMap3);
				
				Map<String,LotPatate> lMap4 = new HashMap<String, LotPatate>();
				lMap4.put("Janvier", new LotPatate(46, 50));
				lMap4.put("Fevrier", new LotPatate(47, 50));
				lMap4.put("Mars", new LotPatate(33, 30));
				lMap4.put("Avril", new LotPatate(32, 28));
				lMap4.put("Mai", new LotPatate(14, 15));
				lMap4.put("Juin", new LotPatate(19, 17));
				lMap4.put("Juillet", new LotPatate(22, 17));
				lMap4.put("Aout", new LotPatate(20, 16));
				lMap4.put("Septembre", new LotPatate(18, 15));
				lMap4.put("Octobre", new LotPatate(16, 14));
				lMap4.put("Novembre", new LotPatate(14, 10));
				lMap4.put("Decembre", new LotPatate(14, 10));
				mLotPatate.add(lMap4);
				break;
			case 2016 :
				Map<String,LotCarotte> lMap5 = new HashMap<String, LotCarotte>();
				lMap5.put("Janvier", new LotCarotte(27, 38));
				lMap5.put("Fevrier", new LotCarotte(14, 16));
				lMap5.put("Mars", new LotCarotte(11, 12));
				lMap5.put("Avril", new LotCarotte(9, 10));
				lMap5.put("Mai", new LotCarotte(64, 75));
				lMap5.put("Juin", new LotCarotte(55, 65));
				lMap5.put("Juillet", new LotCarotte(54, 64));
				lMap5.put("Aout", new LotCarotte(46, 60));
				lMap5.put("Septembre", new LotCarotte(46, 60));
				lMap5.put("Octobre", new LotCarotte(47, 61));
				lMap5.put("Novembre", new LotCarotte(33, 40));
				lMap5.put("Decembre", new LotCarotte(32, 40));
				mLotCarotte.add(lMap5);
				
				Map<String,LotPatate> lMap6 = new HashMap<String, LotPatate>();
				lMap6.put("Janvier", new LotPatate(17, 18));
				lMap6.put("Fevrier", new LotPatate(17, 18));
				lMap6.put("Mars", new LotPatate(16, 17));
				lMap6.put("Avril", new LotPatate(14, 16));
				lMap6.put("Mai", new LotPatate(15, 17));
				lMap6.put("Juin", new LotPatate(15, 17));
				lMap6.put("Juillet", new LotPatate(18, 19));
				lMap6.put("Aout", new LotPatate(17, 18));
				lMap6.put("Septembre", new LotPatate(22, 22));
				lMap6.put("Octobre", new LotPatate(24, 23));
				lMap6.put("Novembre", new LotPatate(27, 35));
				lMap6.put("Decembre", new LotPatate(24, 24));
				mLotPatate.add(lMap6);
				break;
			case 2017 :
				Map<String,LotCarotte> lMap7 = new HashMap<String, LotCarotte>();
				lMap7.put("Janvier", new LotCarotte(14, 15));
				lMap7.put("Fevrier", new LotCarotte(19, 20));
				lMap7.put("Mars", new LotCarotte(22, 23));
				lMap7.put("Avril", new LotCarotte(20, 21));
				lMap7.put("Mai", new LotCarotte(18, 20));
				lMap7.put("Juin", new LotCarotte(16, 18));
				lMap7.put("Juillet", new LotCarotte(14, 14));
				lMap7.put("Aout", new LotCarotte(14, 14));
				mLotCarotte.add(lMap7);
				
				Map<String,LotPatate> lMap8 = new HashMap<String, LotPatate>();
				lMap8.put("Janvier", new LotPatate(25, 22));
				lMap8.put("Fevrier", new LotPatate(23, 21));
				lMap8.put("Mars", new LotPatate(20, 20));
				lMap8.put("Avril", new LotPatate(22, 24));
				lMap8.put("Mai", new LotPatate(27, 29));
				lMap8.put("Juin", new LotPatate(14, 18));
				lMap8.put("Juillet", new LotPatate(11, 14));
				lMap8.put("Aout", new LotPatate(9, 12));
				mLotPatate.add(lMap8);
				break;
			}	
		}
		
	}
	
	public Map<String,LotPatate> getStatistiquesPatateAnnee(int pAnnee) {
		Map<String, LotPatate> lMapRet = new HashMap<String,LotPatate>();
		switch(pAnnee) {
		case 2014 :
			lMapRet = mLotPatate.get(0);
			break;
		case 2015 :
			lMapRet = mLotPatate.get(1);
			break;
		case 2016 :
			lMapRet = mLotPatate.get(2);
			break;
		}
		
		return lMapRet;
	}
	
	public Map<String,LotCarotte> getStatistiquesCarotteAnnee(int pAnnee) {
		Map<String, LotCarotte> lMapRet = new HashMap<String,LotCarotte>();
		switch(pAnnee) {
		case 2014 :
			lMapRet = mLotCarotte.get(0);
			break;
		case 2015 :
			lMapRet = mLotCarotte.get(1);
			break;
		case 2016 :
			lMapRet = mLotCarotte.get(2);
			break;
		}
		
		return lMapRet;
	}
}
