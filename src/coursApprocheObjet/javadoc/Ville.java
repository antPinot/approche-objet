package coursApprocheObjet.javadoc;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.testenumeration.Continent;

/**
 * Représente le concept de ville 
 * 
 * @author antPinot
 *
 */


public class Ville {

	// private List<Ville> villes = new ArrayList<Ville>();

	/** Nom de la ville */
	private String nom;

	/** Nombre d'habitants */
	private int nbHabitants;

	private Continent continent;

	/**
	 * 
	 * @param nom nom de la ville
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public Ville(String nom, int nbHabitants, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Ville)) {
			return false;
		}
		Ville aComparer = (Ville) object;
		if (nom.equals(aComparer.getNom()) && (nbHabitants == aComparer.nbHabitants)) {
			return true;
		}
		return false;
	}

	/*
	 * public void ajoutVille(Ville ville) { villes.add(ville); }
	 * 
	 * public void getMaxVille() { int maxHabitants =
	 * (villes.get(0)).getNbHabitants(); String maxVille = (villes.get(0)).getNom();
	 * for (int i = 0; i < villes.size(); i++) { if
	 * ((villes.get(i)).getNbHabitants() > maxHabitants) { maxHabitants =
	 * (villes.get(i)).getNbHabitants(); maxVille = (villes.get(i)).getNom(); } }
	 * System.out.println("La ville la plus peuplée est " + maxVille + " avec " +
	 * maxHabitants + " habitants"); }
	 * 
	 * public List<Ville> getVilles() { return villes; }
	 */

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
