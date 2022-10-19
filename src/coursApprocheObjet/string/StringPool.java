package coursApprocheObjet.string;

public class StringPool {

	public static void main(String[] args) {
		
		String ch1 = "Bonjour"; // Cette chaîne va être versée dans le string pool à l'adresse mémoire x
		String ch2 = "Bonjour"; // ch2 est une référence à la même adresse mémoire référencée par ch1
		
		if (ch1 == ch2) {		// Fonctionne uniquement si ch1 et ch2 référencent la même zone mémoire
			System.out.println("Les chaines sont identiques");
		}else {
			System.out.println("Les chaînes sont différentes");
		}
		
		String ch3 = "Bonjour"; 
		String ch4 = new String("Bonjour"); // ch4 n'utilise plus le mécanisme de String Pool
		
		if (ch3 == ch4) {		
			System.out.println("Les chaines sont identiques");
		}else {
			System.out.println("Les chaînes sont différentes");
		}
		
		if (ch3.equals(ch4)){
			System.out.println("Les chaines sont identiques");
		}else {
			System.out.println("Les chaînes sont différentes");
		}
		
		Integer a = 128;	// Mécanisme de Integer Pool jusqu'à 127
		Integer b = 128;
		
		if (a == b) {
			System.out.println("a et b sont identiques");
		}else {
			System.out.println("a et b sont différents");
		}
		
		// Conclusion : equals() pour tous les objets et == pour tous les types primitifs

	}

}
