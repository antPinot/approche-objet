package fr.diginamic.testexceptions;

import fr.diginamic.listes.Ville;
import fr.diginamic.testenumeration.Continent;

public class TestReflectionUtils {

	public static void main(String[] args) {

		Ville villeTest = new Ville("Nice", 343_000, Continent.EUROPE);

		try {
			ReflectionUtils.afficherAttributs(villeTest);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			e.printStackTrace();
		}

		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
