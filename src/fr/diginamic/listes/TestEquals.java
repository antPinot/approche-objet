package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville("Atlantide", 562_000);
		Ville ville2 = new Ville("Atlantide", 562_000);
		
		boolean test = ville1.equals(ville2);
		System.out.println(test);								// true
		
		Ville ville3 = new Ville("Shangri-La", 562_000);
		Ville ville4 = new Ville("Gotham City", 562_000);
		
		boolean test2 = ville3.equals(ville4);
		System.out.println(test2);								// false
		
		System.out.println(ville1 == ville2);					// false
		System.out.println(ville3 == ville4);					// false
		
		Ville villeRef1 = ville1;
		
		System.out.println(villeRef1 == ville1);				// true

	}

}
