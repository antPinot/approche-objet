package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TopDixRegions extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		Map<String, Integer> regionMap = new HashMap<>();

		List<Region> listeRegions = new ArrayList<>();

		for (Ville lignes : recensement.getListeVilles()) {
			Integer compteurPopulationRegion = regionMap.get(lignes.getNomRegion());
			if (compteurPopulationRegion == null) {
				compteurPopulationRegion = 0;
			}
			compteurPopulationRegion += lignes.getPopulationTotale();
			regionMap.put(lignes.getNomRegion(), compteurPopulationRegion);

		}

		for (String cle : regionMap.keySet()) {
			listeRegions.add(new Region(cle, regionMap.get(cle)));
		}

		Collections.sort(listeRegions);
		
		for (int i=0; i<10; i++) {
			System.out.println((i+1) + "." + listeRegions.get(i).getNom() + " : " + listeRegions.get(i).getPopulationTotale() + " habitants");
		}

	}

}
