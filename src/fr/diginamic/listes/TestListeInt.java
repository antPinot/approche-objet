package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listeEntier = new ArrayList<Integer>() {
			{
				add(-1);
				add(5);
				add(7);
				add(3);
				add(-2);
				add(4);
				add(8);
				add(5);
			}
		};

		Iterator<Integer> iterator = listeEntier.iterator();
		while (iterator.hasNext()) {
			Integer entier = iterator.next();
			System.out.println(entier);
		}

		System.out.println(listeEntier.size());

		// Recherche du min et max via boucle for

		Integer max = listeEntier.get(0);
		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) > max) {
				max = listeEntier.get(i);
			}
		}

		Integer min = listeEntier.get(0);
		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) < min) {
				min = listeEntier.get(i);
			}
		}

		System.out.println("Le maximum (Boucle For) de la liste est " + max);
		System.out.println("Le minimum (Boucle For) de la liste est " + min);

		// Utilisation du Framework collections

		System.out.println("Le maximum (Collection Framework) de la liste est " + Collections.max(listeEntier));
		System.out.println("Le minimum (Collection Framework) de la liste est " + Collections.min(listeEntier));

		// Suppression du plus petit élément de la liste (methode remove en dehors d'une boucle for)

		listeEntier.remove(listeEntier.indexOf(min));

		System.out.println(listeEntier);
		
		// Recherche des éléments négatifs et conversion en positif (valeur absolue)

		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) < 0) {
				listeEntier.set(i, Math.abs((Integer) listeEntier.get(i)));
			}
		}
		
		System.out.println(listeEntier);
	}

}
