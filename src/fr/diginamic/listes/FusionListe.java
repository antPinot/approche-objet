package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Vert");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		
		List<String> liste4 = new ArrayList<String>();
		
		// Ajout liste1(1) puis liste2(i) (Désordonné)
		
		for (int i=0; i< liste1.size(); i++) {
			liste3.add(liste1.get(i));
			liste3.add(liste2.get(i));
		}
		
		System.out.println(liste3);
		
		// Ajout toute la liste1 puis la liste2 (ordonné)
		
		for (int i=0; i< liste1.size(); i++) {
			liste4.add(liste1.get(i));
		}
		
		for (int i=0; i< liste1.size(); i++) {
			liste4.add(liste2.get(i));
		}
		
		System.out.println(liste4);
	}

}
