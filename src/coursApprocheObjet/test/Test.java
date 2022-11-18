package coursApprocheObjet.test;

import fr.diginamic.testenumeration.Saison;

public class Test {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			System.out.println(saison);
		}

	}

}
