package coursApprocheObjet;

public class TestReference {

	public static void main(String[] args) {
		
		// Passage par type
		
		int a = 1;
		
		int b = a;
		
		System.out.println(a + " " + b);
		
		a++;
		
		System.out.println(a + " " + b);
		
		// Passage par référence 
		
		Compteur cpt1 = new Compteur(); // Création d'un objet à l'adresse 0001
		cpt1.inc();
		System.out.println(cpt1.getValeur());
		Compteur cpt2 = new Compteur(); // Création d'un objet à l'adresse 0002
		cpt2.inc();
		cpt2.inc();
		System.out.println(cpt2.valeur);
		Compteur cpt3 = cpt2; //cpt3 n'est pas un nouvel objet car new n'est pas utilisé ==> cpt3 référence la même adresse mémoire que cpt2 c'est à dire 0002.
		cpt3.inc();
		System.out.println(cpt2.valeur);
		//cpt2 = cpt1; // Dans ce cas là, cpt2 pointe vers l'adresse mémoire de cpt1 et l'objet créé via cpt2 = new ... n'est plus référencé. Il est alors supprimé par le Garbage Collector.
		

	}

}
