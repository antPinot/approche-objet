package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> villes = new ArrayList<String>() {

			/**
			 * POSER LA QUESTION A RICHARD
			 * 
			 * private static final long serialVersionUID = 1L;
			 * 
			 */

			{
				add("Nice");
				add("Carcassonne");
				add("Narbonne");
				add("Lyon");
				add("Foix");
				add("Pau");
				add("Marseille");
				add("Tarbes");
			}
		};

		// Rechercher la ville avec le plus grand nombre de lettres

		int maxTaille = villes.get(0).length();
		String maxVille = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).length() > maxTaille) {
				maxTaille = villes.get(i).length();
				maxVille = villes.get(i);
			}
		}
		System.out.println("La ville qui a le nom le plus long est :" + maxVille + " avec " + maxTaille + " lettres");

		// Noms de villes en majuscules

		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, (villes.get(i)).toUpperCase());
		}

		System.out.println(villes);
		
		// Retirer de la liste les villes commençant par la lettre N (déconseillé)

		for (int i = 0; i < villes.size(); i++) {
			if (((villes.get(i)).charAt(0)) == 'N') {
				villes.remove(i);
			}
		}
		
		System.out.println("Liste des villes après retrait par une boucle for :" + villes);
		
		// Retirer de la liste les villes commençant par la lettre N avec un iterator
		
		Iterator<String> iterator = villes.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.charAt(0) == 'N') {
				iterator.remove();
			}
		}
			
		System.out.println("Liste des villes après retrait par un iterator " + villes);

	}

}
