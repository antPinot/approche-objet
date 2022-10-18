package fr.diginamic.recensement;

public class Departement implements Comparable<Departement> {

	private String nom;

	private Integer populationTotale;

	public Departement(String nom, Integer populationTotale) {
		this.nom = nom;
		this.populationTotale = populationTotale;
	}

	public String getNom() {
		return nom;
	}

	public Integer getPopulationTotale() {
		return populationTotale;
	}

	@Override
	public String toString() {
		return "Departement [nom=" + nom + ", populationTotale=" + populationTotale + "]";
	}

	@Override
	public int compareTo(Departement autreDepartement) {
		if (this.populationTotale > autreDepartement.getPopulationTotale()) {
			return -1;
		} else if (this.populationTotale < autreDepartement.getPopulationTotale()) {
			return 1;
		} else {
			return 0;
		}
	}
}
