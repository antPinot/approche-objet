package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		
		Ville Nice = new Ville("Nice", 343_000);
		Ville Carcassonne = new Ville("Carcassonne", 47_800);
		Ville Narbonne = new Ville("Narbonne", 53_400);
		Ville Lyon = new Ville("Lyon", 484_000);
		Ville Foix = new Ville("Foix", 9700);
		Ville Pau = new Ville("Pau", 77_200);
		Ville Marseille = new Ville("Marseille", 850_700);
		Ville Tarbes = new Ville("Tarbes", 40_600);
		
		List<Ville> villesEnsemble = new ArrayList<Ville>() {
			{
				add(Nice);
				add(Carcassonne);
				add(Narbonne);
				add(Lyon);
				add(Foix);
				add(Pau);
				add(Marseille);
				add(Tarbes);
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
		
		for (int i = 0; i < villesEnsemble.size(); i++) {
			if (((villesEnsemble.get(i)).getNbHabitants() > 100_000)) {		
				(villesEnsemble.get(i)).setNom((villesEnsemble.get(i).getNom()).toUpperCase());
			}
		}
		
		System.out.println(villesEnsemble);

	}

}
