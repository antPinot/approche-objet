package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		personne1.nom = "PINOT";
		personne1.prenom = "Anthony"; 
		personne1.adressePersonne = new AdressePostale();
			personne1.adressePersonne.numeroRue = 31;
			personne1.adressePersonne.libelleRue = "Avenue Saint-Lazare";
			personne1.adressePersonne.codePostal = 34000;
			personne1.adressePersonne.ville = "Montpellier";
		
		Personne personne2 = new Personne();
		personne2.nom = "VADOR";
		personne2.prenom = "Dark"; 
		personne2.adressePersonne = new AdressePostale();
			personne2.adressePersonne.numeroRue = 666;
			personne2.adressePersonne.libelleRue = "Boulevard du Côté Obscur";
			personne2.adressePersonne.codePostal = 666000;
			personne2.adressePersonne.ville = "Etoile Noire";
			
		
		System.out.println(personne1.adressePersonne.libelleRue);
		System.out.println(personne2.nom);

	}
	
}
