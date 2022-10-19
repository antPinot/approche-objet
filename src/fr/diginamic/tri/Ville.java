package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.List;

public class Ville implements Comparable<Ville>{
	
	//private List<Ville> villes = new ArrayList<Ville>();
	
	private String nom;
	
	private int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	// Tri Ordre Alphabétique
	
	/*@Override
	public int compareTo(Ville autreVille) {
		int resultatTest = 0;
		if (this.nom.charAt(0) > autreVille.getNom().charAt(0)) {
			resultatTest = 1;
		}
		else if (this.nom.charAt(0) < autreVille.getNom().charAt(0)) {
			resultatTest = -1;
		}
		else {
			resultatTest = 0;
		}		
		return resultatTest;
	}*/
	
	// Tri Ordre Alphabétique simplifié
	
	/*@Override
	public int compareTo(Ville autreVille) {
		return this.nom.compareTo(autreVille.getNom());
	}*/

	// Tri sur le nombre d'habitants
	
	@Override
	public int compareTo(Ville autreVille) {
		int resultatTest = 0;
		if (this.nbHabitants > autreVille.getNbHabitants()) {
			resultatTest = 1;
		}
		else if (this.nbHabitants < autreVille.getNbHabitants()) {
			resultatTest = -1;
		}
		else {
			resultatTest = 0;
		}		
		return resultatTest;
	}

	
	/*public void ajoutVille(Ville ville) {		
		villes.add(ville);
	}
	
	public void getMaxVille() {
		int maxHabitants = (villes.get(0)).getNbHabitants();
		String maxVille = (villes.get(0)).getNom();
		for (int i = 0; i < villes.size(); i++) {
			if ((villes.get(i)).getNbHabitants() > maxHabitants) {
				maxHabitants = (villes.get(i)).getNbHabitants();
				maxVille = (villes.get(i)).getNom();
			}
		}
		System.out.println("La ville la plus peuplée est " + maxVille + " avec " + maxHabitants + " habitants");
	}

	public List<Ville> getVilles() {
		return villes;
	}*/

	public String getNom() {
		return nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}
	

	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "] \n";
	}
	
}
