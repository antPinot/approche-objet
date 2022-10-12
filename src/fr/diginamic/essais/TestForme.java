package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
	
		Cercle cercle1 = new Cercle(2.5);
		Rectangle rectangle1 = new Rectangle(5, 3);
		Carre carre1 = new Carre(5);
		
		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(rectangle1);
		AffichageForme.afficher(carre1);

	}

}

/* 
 * 
 * Penser à récupérer le type de forme pour l'afficher dans la méthode afficher à la place du print "forme" 
 * 
 * 
 * */
 