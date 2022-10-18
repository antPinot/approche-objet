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

public class TopDixRegions extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// Création d'une Map pour stocker le nom et le nb d'habitants des régions
		
		Map<String, Integer> regionMap = new HashMap<>();
		
		// Création d'une liste d'objets Region (une liste est itérable et peut être triée)

		List<Region> listeRegions = new ArrayList<>();
		
		/*On parcourt l'attribut listeVilles de recensement et on stocke dans regionMap les attributs nomRegion
		 * comme clé et on incrémente au compteur, stocké en valeur, les attributs populationTotale des villes
		 * concernées
		 */
		

		for (Ville lignes : recensement.getListeVilles()) {
			Integer compteurPopulationRegion = regionMap.get(lignes.getNomRegion());
			if (compteurPopulationRegion == null) {
				compteurPopulationRegion = 0;
			}
			compteurPopulationRegion += lignes.getPopulationTotale();
			regionMap.put(lignes.getNomRegion(), compteurPopulationRegion);

		}
		
		/*On reverse le contenu de la regionMap dans une liste en créant des objets Region possédant
		 * comme attributs le nom de la région (clé) et sa population totale (valeur)
		 */

		for (String cle : regionMap.keySet()) {
			listeRegions.add(new Region(cle, regionMap.get(cle)));
		}
		
		// On trie la liste grâce à la librairie Collections, en fonction de la méthode compareTo redéfinie dans la classe Region

		Collections.sort(listeRegions);
		
		// On affiche les 10 premieres valeurs de listeRegions, c'est à dire les 10 régions les plus peuplées
		
		for (int i=0; i<10; i++) {
			System.out.println((i+1) + "." + listeRegions.get(i).getNom() + " : " + listeRegions.get(i).getPopulationTotale() + " habitants");
		}

	}

}
