package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	private double[] tableau = new double[0]; // Attribut d'instance "tableau" de type double[]

	public void ajout(double valeur) {

		double[] nvTableau = new double[tableau.length + 1];
		for (int i = 0; i < tableau.length; i++) {
			nvTableau[i] = tableau[i];
		}
		nvTableau[nvTableau.length - 1] = valeur;
		this.tableau = nvTableau;
	}

	public double calcul() {
		double somme = 0.0;
		double moyenne;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		moyenne = somme / (tableau.length);
		return moyenne;
	}

	@Override
	public String toString() {
		return "Le contenu du tableau est : " + Arrays.toString(tableau);
	}

}
