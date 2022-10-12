package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Le périmètre de la forme est " + forme.calculerPerimetre());
		System.out.println("La surface de la forme est " + forme.calculerSurface());
	}

}
