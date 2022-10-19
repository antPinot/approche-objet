package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		
		Ville nice = new Ville("Nice", 343_000);
		Ville carcassonne = new Ville("Carcassonne", 47_800);
		Ville narbonne = new Ville("Narbonne", 53_400);
		Ville lyon = new Ville("Lyon", 484_000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77_200);
		Ville marseille = new Ville("Marseille", 850_700);
		Ville tarbes = new Ville("Tarbes", 40_600);
		
		List<Ville> villesEnsemble = new ArrayList<Ville>() {
			{
				add(nice);
				add(carcassonne);
				add(narbonne);
				add(lyon);
				add(foix);
				add(pau);
				add(marseille);
				add(tarbes);
			}
		};
		
		System.out.println(villesEnsemble);
		
		int maxHabitants = (villesEnsemble.get(0)).getNbHabitants();
		String maxVille = (villesEnsemble.get(0)).getNom();
		for (int i = 0; i < villesEnsemble.size(); i++) {
			if ((villesEnsemble.get(i)).getNbHabitants() > maxHabitants) {
				maxHabitants = (villesEnsemble.get(i)).getNbHabitants();
				maxVille = (villesEnsemble.get(i)).getNom();
			}
		}
		System.out.println("La ville la plus peuplée est " + maxVille + " avec " + maxHabitants + " habitants");
		
		int minHabitants = (villesEnsemble.get(0)).getNbHabitants();
		String nomMinVille = (villesEnsemble.get(0)).getNom();
		int indexMinVille = villesEnsemble.indexOf(0);
		for (int i = 0; i < villesEnsemble.size(); i++) {
			if ((villesEnsemble.get(i)).getNbHabitants() < minHabitants) {
				minHabitants = (villesEnsemble.get(i)).getNbHabitants();
				nomMinVille = (villesEnsemble.get(i)).getNom();
				indexMinVille = (villesEnsemble.indexOf(villesEnsemble.get(i)));
			}
		}
		
		System.out.println("La ville la moins peuplée est " + nomMinVille + " avec " + minHabitants + " habitants, elle va être supprimée de la liste");
		
		villesEnsemble.remove(indexMinVille);
		
		System.out.println(villesEnsemble);
		
		// Modifier la valeur 
		
		for (int i = 0; i < villesEnsemble.size(); i++) {
			if (((villesEnsemble.get(i)).getNbHabitants() > 100_000)) {		
				(villesEnsemble.get(i)).setNom((villesEnsemble.get(i).getNom()).toUpperCase());
			}
		}
		
		System.out.println(villesEnsemble);

	}

}
