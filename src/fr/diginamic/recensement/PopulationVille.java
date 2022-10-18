package fr.diginamic.recensement;

import java.util.Scanner;

/*
 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
 * 
 * La méthode parcourt l'attribut ListeVilles de recensement et si l'attribut nomCommune des villes
 * de ListeVilles est égale à la saisie de l'utilisateur, elle affiche l'attribut populationTotale de 
 * la ville correspondante.
 * 
 * Le boolean isFind permet de vérifier que la ville est trouvée, sinon nous renvoyons une erreur à 
 * l'utilisateur.
 * 
 */

public class PopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer SVP le nom de la ville à rechercher : ");
		String villeRecherche = scanner.nextLine();
		boolean isFind = false;
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomCommune().equals(villeRecherche)) {
				System.out.println("\nLa population totale de " + villeRecherche + " est de "
						+ lignes.getPopulationTotale() + " habitants.");
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("\nDésolé, nous n'avons pas compris votre requête, merci de choisir une option");
		}
	}
}
