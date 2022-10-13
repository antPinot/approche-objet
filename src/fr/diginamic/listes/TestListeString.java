package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> villes = new ArrayList<String>() {
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
		System.out.println("La ville qui a le nom le plus long est " + maxVille + " avec " + maxTaille + " lettres");

		// Noms de villes en majuscules

		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, (villes.get(i)).toUpperCase());
		}

		System.out.println(villes);
	}
	
	//TODO Supprimer de la liste les villes dont le nom commence par la lettre N

}
