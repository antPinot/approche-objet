package fr.diginamic.recensement;

import java.util.Scanner;

public class PopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer SVP le nom de la ville à rechercher : ");
		String villeRecherche = scanner.nextLine();
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomCommune().equals(villeRecherche)) {
				System.out.println("La population totale de " + villeRecherche + " est de "
						+ lignes.getPopulationTotale() + " habitants.");
			}
		}

	}
}
