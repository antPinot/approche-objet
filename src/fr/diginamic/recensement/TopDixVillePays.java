package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopDixVillePays extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		List<Ville> listeVillePays = new ArrayList<>();

		for (Ville lignes : recensement.getListeVilles()) {
			listeVillePays.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale()));
		}
		
		Collections.sort(listeVillePays);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". " + listeVillePays.get(i).getNomCommune() + " : "
					+ listeVillePays.get(i).getPopulationTotale() + " habitants");
		}

	}

}
