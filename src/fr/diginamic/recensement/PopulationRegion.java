package fr.diginamic.recensement;

import java.util.Scanner;

public class PopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Veuillez entrer SVP le nom de la région à rechercher : ");
		String regionRecherche = scanner.nextLine();
		int compteurPopulationRegion = 0;
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomRegion().equals(regionRecherche)) {
				compteurPopulationRegion += lignes.getPopulationTotale();
			}
		}
		System.out.println("La population totale de " + regionRecherche + " est de " + compteurPopulationRegion + " habitants.");

	}

}
