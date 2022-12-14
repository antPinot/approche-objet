package fr.diginamic.maison;

public abstract class Piece{
	
	private double superficie;
	
	private int numeroEtage;

	public Piece(double superficie, int numeroEtage) {
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getNumeroEtage() {
		return numeroEtage;
	}
	
	public abstract String getType();

	@Override
	public String toString() {
		return  getType() + " [superficie=" + getSuperficie() + ", numeroEtage=" + getNumeroEtage() + "]";
	}
	

}
