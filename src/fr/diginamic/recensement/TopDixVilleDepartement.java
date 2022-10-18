package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
 * 
 * Le boolean isFind permet de vérifier que le département est trouvé, sinon nous renvoyons une erreur à 
 * l'utilisateur.
 * 
 */

public class TopDixVilleDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// Création d'une liste d'objets Ville qui contiendra les villes du département saisi par l'utilisateur
		
		List<Ville> listeVilleDepartement = new ArrayList<>();

		System.out.println(
				"Veuillez entrer SVP le code du département pour lequel vous souhaitez afficher les 10 plus grandes villes: ");
		String villeTopDixDepartementRecherche = scanner.nextLine();
		boolean isFind = false;
		
		/* On parcourt l'attribut listeVilles de recensement et si l'attribut codeDepartement est égal à la saisie de l'utilisateur
		 * on stocke dans listeVilleDepartement des instances de Ville représentant les villes concernées
		 * 
		 */
		
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getCodeDepartement().equals(villeTopDixDepartementRecherche)) {
				listeVilleDepartement.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale())); // On utilise le constructeur Ville (String nomCommune, int populationTotale)
				isFind = true;
			}
		}
		
		// On trie la liste grâce à la librairie Collections, en fonction de la méthode compareTo redéfinie dans la classe Ville

		Collections.sort(listeVilleDepartement);
		
		// On affiche les 10 premieres valeurs de listeVilleDepartement, c'est à dire les 10 villes les plus peuplées du département saisi

		if (isFind) {
			for (int i = 0; i < 10; i++) {
				System.out.println((i + 1) + ". " + listeVilleDepartement.get(i).getNomCommune() + " : "
						+ listeVilleDepartement.get(i).getPopulationTotale() + " habitants");
			}
		} else {
			System.out.println("\nDésolé, nous n'avons pas compris votre requête, merci de choisir une option");
		}

	}

}
