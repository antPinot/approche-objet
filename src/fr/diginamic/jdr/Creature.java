package fr.diginamic.jdr;

public abstract class Creature {

	protected int force;

	protected int hp;

	protected String nom;

	public int attaque() {

		int result = getForce() + (1 + (int) (Math.random() * ((10 - 1) + 1)));
		return result;

	}

	/**
	 * Getter pour l'attribut force
	 * 
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Setter pour l'attribut force
	 * 
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * Getter pour l'attribut hp
	 * 
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * Setter pour l'attribut hp
	 * 
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
