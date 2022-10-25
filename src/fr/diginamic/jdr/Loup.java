package fr.diginamic.jdr;

public class Loup extends Monstre {

	/**
	 * Constructeur
	 * 
	 * @param force
	 * @param hp
	 * @param pointsRapportes
	 * @param nom
	 */

	public Loup() {
		this.force = 3 + (int) (Math.random() * ((8 - 3) + 1));
		;
		this.hp = 5 + (int) (Math.random() * ((10 - 5) + 1));
		;
		this.pointsRapportes = 1;
		this.nom = "Loup";
	}

}
