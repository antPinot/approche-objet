package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// Ex 1
		
		ArrayList<Integer> nvListe = new ArrayList<>();
		
		for (int i=1; i <=100; i++){
			nvListe.add(i);
		}
		
		System.out.println(nvListe.size());
		System.out.println(nvListe);
	}
	
	

}
