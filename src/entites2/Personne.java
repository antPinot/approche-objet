package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom = "";
	public String prenom = "";
	public AdressePostale adressePersonne = null;

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
		System.out.println(this.nom.toUpperCase());
		System.out.println(this.prenom);
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
	
	public void modifierAdresseComplete(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.adressePersonne.numeroRue = numeroRue;
		this.adressePersonne.libelleRue = libelleRue;
		this.adressePersonne.codePostal = codePostal;
		this.adressePersonne.ville = ville;
	}
	
	public String renvoyerNom() {
		return this.nom;
	}
	
	public String renvoyerPrenom() {
		return this.prenom;
	}
	
	public AdressePostale renvoyerAdresse() {
		return this.adressePersonne;
	}
}
