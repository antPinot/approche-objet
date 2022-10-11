package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle(2.4F);
		Cercle cercle2 = new Cercle(7.8F);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle2.perimetre());
		
		System.out.println(cercle1.surface());
		System.out.println(cercle2.surface());

	}

}
