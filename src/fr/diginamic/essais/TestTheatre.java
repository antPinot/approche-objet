package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre("Theâtre de la comédie", 25, 0, 0);
		
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		theatre1.inscrire(4, 15.50);
		System.out.println(theatre1.getNbCustomers() + " " + theatre1.getIncome());

	}

}
