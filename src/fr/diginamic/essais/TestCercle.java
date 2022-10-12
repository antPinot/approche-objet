package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		/*Cercle cercle1 = new Cercle(2.4F);
		Cercle cercle2 = new Cercle(7.8F);*/
		
		Cercle cercle1 = CercleFactory.cercleFact(2.4);
		Cercle cercle2 = CercleFactory.cercleFact(7.8);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle2.perimetre());
		
		System.out.println(cercle1.surface());
		System.out.println(cercle2.surface());

	}

}
