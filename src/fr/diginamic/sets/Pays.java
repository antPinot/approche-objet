package fr.diginamic.sets;

import annotations.ToString;

public class Pays {
	
	@ToString
	private String nom;
	
	@ToString
	private int nbHabitants;
	
	private double pibParHabitant;

	public Pays(String nom, int nbHabitants, double pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}
	

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibParHabitant=" + pibParHabitant + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	

}
