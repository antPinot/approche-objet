package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre("Theâtre de la comédie", 25, 0, 0);
		Theatre theatre2 = new Theatre("Theâtre de la tragédie", 25, 0, 0);
		
		for (int i=0; i<7; i++) {
			theatre1.inscrire(4, 15.50);
			System.out.println(theatre1);
		}
		
		theatre2.inscrire(26, 120)
		;
		
		// La méthode toString a été redéfinie pour afficher le nb de clients inscrits et la recette totale
		
		System.out.println(theatre1);
		System.out.println(theatre2);

	}

}
