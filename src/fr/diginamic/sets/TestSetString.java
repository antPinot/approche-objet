package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		Set<String> paysSet = new HashSet<String>(
				Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

		String maxPays = "";
		for (String pays : paysSet) {
			if (pays.length() > maxPays.length()) {
				maxPays = pays;
			}
		}

		System.out.println("Le pays qui a le nom le plus long est : " + maxPays + " et va être supprimé de la liste");

		paysSet.remove(maxPays);

		System.out.println("Nouvelle liste : " + paysSet);
	}

}
