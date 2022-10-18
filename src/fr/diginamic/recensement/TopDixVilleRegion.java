package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopDixVilleRegion extends MenuService {
	
	/*
	 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
	 * 
	 * Le boolean isFind permet de vérifier que le département est trouvé, sinon nous renvoyons une erreur à 
	 * l'utilisateur.
	 * 
	 */

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création d'une liste d'objets Ville qui contiendra les villes de la région saisie par l'utilisateur

		List<Ville> listeVilleRegion = new ArrayList<>();

		System.out.println(
				"Veuillez entrer SVP le nom de la région pour laquelle vous souhaitez afficher les 10 plus grandes villes: ");
		String villeTopDixRegionRecherche = scanner.nextLine();
		boolean isFind = false;
		
		/* On parcourt l'attribut listeVilles de recensement et si l'attribut nomRegion est égal à la saisie de l'utilisateur
		 * on stocke dans listeVilleRegion des instances de Ville représentant les villes concernées
		 * 
		 */
		
		for (Ville lignes : recensement.getListeVilles()) {
			if (lignes.getNomRegion().equals(villeTopDixRegionRecherche)) {
				listeVilleRegion.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale()));// On utilise le constructeur Ville (String nomCommune, int populationTotale)
				isFind = true;
			}
		}
		
		// On trie la liste grâce à la librairie Collections, en fonction de la méthode compareTo redéfinie dans la classe Ville

		Collections.sort(listeVilleRegion);
		
		// On affiche les 10 premieres valeurs de listeVilleDepartement, c'est à dire les 10 villes les plus peuplées de la région saisie

		if (isFind) {
			for (int i = 0; i < 10; i++) {
				System.out.println((i + 1) + ". " + listeVilleRegion.get(i).getNomCommune() + " : "
						+ listeVilleRegion.get(i).getPopulationTotale() + " habitants");
			}
		}else {
			System.out.println("\nDésolé, nous n'avons pas compris votre requête, merci de choisir une option");
		}
	}

}
