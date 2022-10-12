package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	private double longueur;
	
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double calculerPerimetre() {
		return 2*(getLongueur() + getLargeur());
	}
	
	@Override
	public double calculerSurface() {
		return getLongueur() * getLargeur();
	}

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}
	

}
