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

}
