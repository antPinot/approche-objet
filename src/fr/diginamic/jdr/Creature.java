package fr.diginamic.jdr;

public abstract class Creature {
	
	private int force;
	
	private int hp;

	public Creature(int force, int hp) {
		this.force = force;
		this.hp = hp;
	}
	
	public abstract void attaque();

}
