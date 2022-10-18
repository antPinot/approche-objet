package fr.diginamic.recensement;

import java.util.Scanner;

/*
 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
 * 
 * La méthode parcourt l'attribut ListeVilles de recensement et si l'attribut nomRegion des villes
 * de ListeVilles est égale à la saisie de l'utilisateur, elle incrémente la population de la ville correspondante
 * au compteur compteurPopulationRegion pour calculer le total de la population de la région.
 * 
 * Le boolean isFind permet de vérifier que la ville est trouvée, sinon nous renvoyons une erreur à 
 * l'utilisateur.
 * 
 */

public class PopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Veuillez entrer SVP le nom de la région à rechercher : ");
		String regionRecherche = scanner.nextLine();
		int compteurPopulationRegion = 0;
		boolean isFind = false;
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomRegion().equals(regionRecherche)) {
				compteurPopulationRegion += lignes.getPopulationTotale();
				isFind = true;
			}
		}
		if (isFind) {
			System.out.println("\nLa population totale de " + regionRecherche + " est de " + compteurPopulationRegion + " habitants.");
		}else {
			System.out.println("\nDésolé, nous n'avons pas compris votre requête, merci de choisir une option");
		}
		

	}

}
