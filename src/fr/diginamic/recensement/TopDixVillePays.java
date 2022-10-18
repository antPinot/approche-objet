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

public class TopDixVillePays extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création d'une liste d'objets Ville qui contiendra toutes les villes de recensement (du pays donc)

		List<Ville> listeVillePays = new ArrayList<>();
		
		// On stocke dans listeVilles des instance de Ville avec le constructeur Ville(String nomCommune, int populationTotale)

		for (Ville lignes : recensement.getListeVilles()) {
			listeVillePays.add(new Ville(lignes.getNomCommune(), lignes.getPopulationTotale()));
		}
		
		// On trie la liste grâce à la librairie Collections, en fonction de la méthode compareTo redéfinie dans la classe Ville
		
		Collections.sort(listeVillePays);
		
		// On affiche les 10 premieres valeurs de listeVillePays, c'est à dire les 10 villes les plus peuplées du pays

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". " + listeVillePays.get(i).getNomCommune() + " : "
					+ listeVillePays.get(i).getPopulationTotale() + " habitants");
		}

	}

}
