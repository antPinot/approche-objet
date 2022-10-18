package fr.diginamic.recensement;

import java.util.Scanner;

public class PopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Veuillez entrer SVP le nom du département à rechercher : ");
		String departementRecherche = scanner.nextLine();
		int compteurPopulationDepartement = 0;
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getCodeDepartement().equals(departementRecherche)) {
				compteurPopulationDepartement += lignes.getPopulationTotale();
			}
		}
		System.out.println("La population totale de " + departementRecherche + " est de " + compteurPopulationDepartement + " habitants.");

	}

}
