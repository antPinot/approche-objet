package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public abstract String getStatut();
	
	public void afficherDonnees() {
		System.out.println("Nom : " + getNom() + "|  Prénom :  " + getPrenom() + "|  Salaire : " + getSalaire() + "|  Statut : " + getStatut());
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom(){
		return prenom;
	}

}
