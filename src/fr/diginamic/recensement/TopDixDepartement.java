package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TopDixDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		Map<String, Integer> departementMap = new HashMap<>();

		List<Departement> listeDepartement = new ArrayList<>();

		for (Ville lignes : recensement.getListeVilles()) {
			Integer compteurPopulationDepartement = departementMap.get(lignes.getCodeDepartement());
			if (compteurPopulationDepartement == null) {
				compteurPopulationDepartement = 0;
			}
			compteurPopulationDepartement += lignes.getPopulationTotale();
			departementMap.put(lignes.getCodeDepartement(), compteurPopulationDepartement);

		}

		for (String cle : departementMap.keySet()) {
			listeDepartement.add(new Departement(cle, departementMap.get(cle)));
		}

		Collections.sort(listeDepartement);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". Département " + listeDepartement.get(i).getNom() + " : "
					+ listeDepartement.get(i).getPopulationTotale() + " habitants");
		}

	}

}
