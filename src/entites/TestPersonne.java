package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		/*
		 * 
		 * TP 1
		 *
		
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
			
		
		*/
		
		/*
		 * 
		 * TP 2 Constructeur Primaire
		 *
		
		Personne personne1 = new Personne ("PINOT", "Anthony");
		Personne personne2 = new Personne("VADOR", "Dark");
		
		System.out.println(personne1.prenom);
		System.out.println(personne2.nom);
		
		*/
		
		// TP 2 Constructeur secondaire
		
		AdressePostale adresse1 = new AdressePostale(31, "Avenue Saint-Lazare", 34000, "Montpellier");
		AdressePostale adresse2 = new AdressePostale(666, "Boulevard du Côté Obscur", 666000, "Etoile Noire");
		
		
		Personne personne1 = new Personne("Pinot", "Anthony", adresse1);
		Personne personne2 = new Personne("Vador", "Dark", adresse2);
		
		System.out.println(personne1.adressePersonne.libelleRue);
		System.out.println(personne2.nom);
		
		//TP 3 Instances et Méthodes
		
		AdressePostale adresse3 = new AdressePostale(11, "Mont Palatin", 10_000, "Rome");
		
		Personne personne3 = new Personne("César", "Jules", adresse3);
		
		System.out.println(personne3.adressePersonne.libelleRue);
		
		personne3.modifierAdresseComplete(99, "Cimetière", 10_100, "Rome");
		System.out.println(personne3.adressePersonne.libelleRue);
		
		System.out.println(personne3.renvoyerAdresse());

	}
	
}
