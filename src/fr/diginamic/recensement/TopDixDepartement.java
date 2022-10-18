package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Classe fille de MenuService passant une instance de recensement et de scanner en paramètre
 *
 */

public class TopDixDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création d'une Map pour stocker le nom et le nb d'habitants des départements
		
		Map<String, Integer> departementMap = new HashMap<>();
		
		// Création d'une liste d'objets Departement (une liste est itérable et peut être triée)

		List<Departement> listeDepartement = new ArrayList<>();
		
		/*On parcourt l'attribut listeVilles de recensement et on stocke dans departementMap les attributs codeDepartement
		 * comme clé et on incrémente au compteur, stocké en valeur, les attributs populationTotale des villes
		 * concernées
		 */

		for (Ville lignes : recensement.getListeVilles()) {
			Integer compteurPopulationDepartement = departementMap.get(lignes.getCodeDepartement());
			if (compteurPopulationDepartement == null) {
				compteurPopulationDepartement = 0;
			}
			compteurPopulationDepartement += lignes.getPopulationTotale();
			departementMap.put(lignes.getCodeDepartement(), compteurPopulationDepartement);

		}
		
		/*On reverse le contenu de la departementMap dans une liste en créant des instances de Departement possédant
		 * comme attributs le numéro du département (clé) et sa population totale (valeur)
		 */

		for (String cle : departementMap.keySet()) {
			listeDepartement.add(new Departement(cle, departementMap.get(cle)));
		}
		
		// On trie la liste grâce à la librairie Collections, en fonction de la méthode compareTo redéfinie dans la classe Departement

		Collections.sort(listeDepartement);
		
		// On affiche les 10 premieres valeurs de listeDepartement, c'est à dire les 10 départements les plus peuplés

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". Département " + listeDepartement.get(i).getNom() + " : "
					+ listeDepartement.get(i).getPopulationTotale() + " habitants");
		}

	}

}
