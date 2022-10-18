package fr.diginamic.recensement;

import java.util.Scanner;

/*
 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
 * 
 * La méthode parcourt l'attribut ListeVilles de recensement et si l'attribut codeDepartement des villes
 * de ListeVilles est égale à la saisie de l'utilisateur, elle incrémente la population de la ville correspondante
 * au compteur compteurPopulationDepartement pour calculer le total de la population du département.
 * 
 * Le boolean isFind permet de vérifier que la ville est trouvée, sinon nous renvoyons une erreur à 
 * l'utilisateur.
 * 
 */

public class PopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Veuillez entrer SVP le nom du département à rechercher : ");
		String departementRecherche = scanner.nextLine();
		int compteurPopulationDepartement = 0;
		boolean isFind = false;
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getCodeDepartement().equals(departementRecherche)) {
				compteurPopulationDepartement += lignes.getPopulationTotale();
				isFind = true;
			}
		}
		if (isFind) {
			System.out.println("\nLa population totale de " + departementRecherche + " est de "
					+ compteurPopulationDepartement + " habitants.");
		} else {
			System.out.println("\nDésolé, nous n'avons pas compris votre requête, merci de choisir une option");
		}

	}

}
