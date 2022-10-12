package fr.diginamic.formes;

public class Cercle extends Forme{
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		return Math.PI * Math.pow(getRayon(), 2.0);
	}
	
	public double calculerPerimetre() {
		return 2* Math.PI*(getRayon());
	}

	public double getRayon() {
		return rayon;
	}
	
	

}
