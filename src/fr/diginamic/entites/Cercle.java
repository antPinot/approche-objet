package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public double perimetre() {
		return 2* Math.PI*(getRayon());
	}
	
	public double surface() {
		return Math.PI * Math.pow(getRayon(), 2.0);
	}

}
