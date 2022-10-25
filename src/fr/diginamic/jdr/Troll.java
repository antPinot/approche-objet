package fr.diginamic.jdr;

public class Troll extends Monstre {

	/**
	 * Constructeur
	 * 
	 * @param force
	 * @param hp
	 * @param pointsRapportes
	 * @param nom
	 */
	public Troll() {
		this.force = 10 + (int) (Math.random() * ((15 - 10) + 1));
		this.hp = 20 + (int) (Math.random() * ((30 - 20) + 1));
		this.pointsRapportes = 5;
		this.nom = "Troll";
	}

}
