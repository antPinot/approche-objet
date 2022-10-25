package fr.diginamic.jdr;

public abstract class Monstre extends Creature {

	protected int pointsRapportes;

	/**
	 * Getter pour l'attribut pointsRapportes
	 * 
	 * @return the pointsRapportes
	 */
	public int getPointsRapportes() {
		return pointsRapportes;
	}

	/**
	 * Setter pour l'attribut pointsRapportes
	 * 
	 * @param pointsRapportes the pointsRapportes to set
	 */
	public void setPointsRapportes(int pointsRapportes) {
		this.pointsRapportes = pointsRapportes;
	}

}
