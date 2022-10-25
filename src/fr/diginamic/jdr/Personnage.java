package fr.diginamic.jdr;

public class Personnage extends Creature{

	private int score;
	
	/**Constructeur
	 * @param force
	 * @param hp
	 * @param score
	 */
	public Personnage(String nom) {
		this.nom = nom;
		this.force = 12 + (int)(Math.random() * ((18 - 12) + 1));;
		this.hp = 20 + (int)(Math.random() * ((50 - 20) + 1));;
		this.score = 0;
	}

	/**Getter pour l'attribut score
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**Setter pour l'attribut score
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}	
	
	
}


