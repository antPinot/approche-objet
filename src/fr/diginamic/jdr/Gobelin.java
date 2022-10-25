package fr.diginamic.jdr;

public class Gobelin extends Monstre {

	/**
	 * Constructeur
	 * 
	 * @param force
	 * @param hp
	 * @param pointsRapportes
	 * @param nom
	 */
	public Gobelin() {
		this.force = 5 + (int) (Math.random() * ((10 - 5) + 1));
		this.hp = 10 + (int) (Math.random() * ((15 - 10) + 1));
		this.pointsRapportes = 2;
		this.nom = "Gobelin";
	}

}
