package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie1 = new Salarie("Guillotin", "Greg", 1542.23);
		Pigiste pigiste1 = new Pigiste("Fett", "Django", 5.5);
		
		/*System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire())*/
		
		salarie1.afficherDonnees();
		pigiste1.afficherDonnees();

	}

}
