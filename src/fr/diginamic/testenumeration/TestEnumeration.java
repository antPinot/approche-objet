package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] valeursSaison = Saison.values();
		
		for (Saison saison : valeursSaison) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getLibelle());
		
		String libelle = "Hiver";
		
		Saison instanceTest = Saison.getSaison(libelle);
		
		System.out.println("Saison: " + instanceTest.getLibelle() + " | Ordre: " + instanceTest.getOrdre());

	}
	
	

}
