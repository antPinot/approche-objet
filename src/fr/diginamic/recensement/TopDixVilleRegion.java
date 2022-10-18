package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopDixVilleRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		List<Ville> listeVilleRegion = new ArrayList<>();

		System.out.println(
				"Veuillez entrer SVP le nom de la région pour laquelle vous souhaitez afficher les 10 plus grandes villes: ");
		String villeTopDixRegionRecherche = scanner.nextLine();

		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomRegion().equals(villeTopDixRegionRecherche)) {
				listeVilleRegion.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale()));
			}
		}

		Collections.sort(listeVilleRegion);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". " + listeVilleRegion.get(i).getNomCommune() + " : "
					+ listeVilleRegion.get(i).getPopulationTotale() + " habitants");
		}

	}

}
