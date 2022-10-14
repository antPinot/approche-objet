package fr.diginamic.maps;

public class Salarie {
	
	private String prenom;
	
	private double salaire;

	public Salarie(String prenom, double salaire) {
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salarie [prenom=" + prenom + ", salaire=" + salaire + "]";
	}

	public String getPrenom() {
		return prenom;
	}

	public double getSalaire() {
		return salaire;
	}
	

}
