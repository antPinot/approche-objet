package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTriVille {

	public static void main(String[] args) {
		
		Ville nice = new Ville("Nice", 343_000);
		Ville carcassonne = new Ville("Carcassonne", 47_800);
		Ville narbonne = new Ville("Narbonne", 53_400);
		Ville lyon = new Ville("Lyon", 484_000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77_200);
		Ville marseille = new Ville("Marseille", 850_700);
		Ville tarbes = new Ville("Tarbes", 40_600);
		
		List<Ville> listeTriVilles = new ArrayList<>(Arrays.asList(nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes));
		
		// Tri par critère sélectionné via la méthode compareTo (nom ou nbHabitants) de l'interface Comparable
		
		System.out.println("Tri par nb d'habitants via Comparable\n");
		
		Collections.sort(listeTriVilles);
		
		for (Ville ville : listeTriVilles) {
			System.out.println(ville);
		}
		
		// Tri par nombre d'habitants via Comparator 
		
		System.out.println("-------------------------\nTri par nombre d'habitants via Comparator\n");
		
		Collections.sort(listeTriVilles, new ComparatorHabitant());
		
		for (Ville ville : listeTriVilles) {
			System.out.println(ville);
		}
		
		
		// Tri par nom via Comparator
		
		System.out.println("-------------------------\nTri par nom via Comparator\n");
		
		Collections.sort(listeTriVilles, new ComparatorNom());
		
		for (Ville ville : listeTriVilles) {
			System.out.println(ville);
		}


	}

}
