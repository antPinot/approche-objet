package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		Ville nice = new Ville("Nice", 343_000);
		Ville carcassonne = new Ville("Carcassonne", 47_800);
		Ville narbonne = new Ville("Narbonne", 53_400);
		Ville lyon = new Ville("Lyon", 484_000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77_200);
		Ville marseille = new Ville("Marseille", 850_700);
		Ville tarbes = new Ville("Tarbes", 40_600);
		
		Map<String, Ville> villesMap = new HashMap<>();
		
		villesMap.put(nice.getNom(), nice);
		villesMap.put(carcassonne.getNom(), carcassonne);
		villesMap.put(narbonne.getNom(), narbonne);
		villesMap.put(lyon.getNom(), lyon);
		villesMap.put(foix.getNom(), foix);
		villesMap.put(pau.getNom(), pau);
		villesMap.put(marseille.getNom(), marseille);
		villesMap.put(tarbes.getNom(), tarbes);
		
		double minHabitants = Double.MAX_VALUE;
		String minHabitantsVille = "";
		for (String cle : villesMap.keySet()) {
			if (villesMap.get(cle).getNbHabitants() < minHabitants) {
				minHabitants = villesMap.get(cle).getNbHabitants();
				minHabitantsVille = cle;
			}
		}
		
		System.out.println(villesMap);
		
		System.out.println("La ville la moins peuplée est " + minHabitantsVille + " avec " + minHabitants + " habitants, elle va être supprimée du dictionnaire");
		
		villesMap.remove(minHabitantsVille);
		
		System.out.println(villesMap);

	}

}
