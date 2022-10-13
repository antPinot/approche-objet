package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		/*double[] tableau1 = new double[1];
		
		double[] tableau2 = new double[]{15.25, 4.68, 11.82, 17.78};*/
		
		CalculMoyenne tableauMoy1 = new CalculMoyenne();
		CalculMoyenne tableauMoy2 = new CalculMoyenne();
		
		tableauMoy1.ajout(5.0);
		tableauMoy1.ajout(3.0);	
		tableauMoy1.ajout(15.0);
		
		System.out.println(tableauMoy1.calcul());
		System.out.println(tableauMoy1);
		
		tableauMoy2.ajout(15.25);
		tableauMoy2.ajout(4.68);
		tableauMoy2.ajout(11.82);
		tableauMoy2.ajout(17.78);
		
		System.out.println(tableauMoy2.calcul());
		System.out.println(tableauMoy2);

	}

}
