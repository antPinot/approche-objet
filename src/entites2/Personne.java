package entites2;

import entites.AdressePostale;

public class Personne {

	private String nom = "";
	private String prenom = "";
	private AdressePostale adressePersonne = null;

	// TP 2

	// Constructeur primaire

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// Constructeur secondaire

	public Personne(String nom, String prenom, AdressePostale adressePersonne) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePersonne = adressePersonne;
	}
	
	
	// TP 3
	
	// Affiche le prénom et le nom en majuscules
	
	public void affichageNomMajuscules() {
		System.out.println(prenom + " " + nom.toUpperCase());	
	}
	
	// Modifie la variable d'instance nom
	
	public void modifierNom(String nom) {
		this.nom = nom;
	}
	
	
	// Modifie la variable d'instance prenom
	
	public void modifierPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// Modifie la variable d'instance adressePersonne
	
	public void modifierAdresseComplete(AdressePostale adressePersonne) {
		this.adressePersonne = adressePersonne;
	}
	
	// Renvoie la variable d'instance nom
	
	public String renvoyerNom() {
		return this.nom;
	}
	
	// Renvoie la variable d'instance prenom
	
	public String renvoyerPrenom() {
		return this.prenom;
	}
	
	// Renvoie la variable d'instance adresse (de type AdressePostale)
	
	public AdressePostale renvoyerAdresse() {
		return this.adressePersonne;
	}
}
