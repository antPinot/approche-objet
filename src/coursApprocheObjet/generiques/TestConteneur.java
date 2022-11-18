package coursApprocheObjet.generiques;

import fr.diginamic.listes.Ville;

public class TestConteneur {

	public static void main(String[] args) {
		
		Conteneur<Integer, String> c1 = new Conteneur<>(15, "Bonjour");
		Conteneur<String, Ville> c2 = new Conteneur<>("A1023", new Ville("Nantes",350000));

	}

}
