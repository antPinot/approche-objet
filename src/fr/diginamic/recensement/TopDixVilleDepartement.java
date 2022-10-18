package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopDixVilleDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		List<Ville> listeVilleDepartement = new ArrayList<>();

		System.out.println(
				"Veuillez entrer SVP le code du département pour lequel vous souhaitez afficher les 10 plus grandes villes: ");
		String villeTopDixDepartementRecherche = scanner.nextLine();

		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getCodeDepartement().equals(villeTopDixDepartementRecherche)) {
				listeVilleDepartement.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale()));
			}
		}

		Collections.sort(listeVilleDepartement);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". " + listeVilleDepartement.get(i).getNomCommune() + " : "
					+ listeVilleDepartement.get(i).getPopulationTotale() + " habitants");
		}

	}

}
