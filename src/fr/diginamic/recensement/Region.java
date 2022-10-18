package fr.diginamic.recensement;

public class Region implements Comparable<Region>{
	
	private String nom;
	
	private Integer populationTotale;

	public Region(String nom, Integer populationTotale) {
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
		return "Region [nom=" + nom + ", populationTotale=" + populationTotale + "]";
	}
	
	@Override
	public int compareTo(Region autreRegion) {
		if (this.populationTotale > autreRegion.getPopulationTotale()) {
			return -1;
		}
		else if (this.populationTotale < autreRegion.getPopulationTotale()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
