package fr.diginamic.automates;

public class Cell {
	
	private int positiony;
	
	private int positionx;

	/**
	 * @param positionx
	 * @param positiony
	 */
	public Cell(int positiony, int positionx) {
		this.positiony = positiony;
		this.positionx = positionx;
	}

	/**Getter pour l'attribut positionx
	 * @return the positionx
	 */
	public int getPositionx() {
		return positionx;
	}

	/**Getter pour l'attribut positiony
	 * @return the positiony
	 */
	public int getPositiony() {
		return positiony;
	}
	
	
	

}
