package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Cuisine cuisine = new Cuisine(25, 0);
		Chambre chambrePrincipale = new Chambre(15, 1);
		Chambre chambreDesAmis = new Chambre(14, 1);
		Chambre chambreDesEnfants = new Chambre(11, 1);
		Salon salon = new Salon(30, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(16, 1);
		SalleDeBain salleDeBain2 = new SalleDeBain(12, 0);
		WC toilettes1 = new WC(5, 1);
		WC toilettes2 = new WC(3, 0);
		
		// Déclaration avec classe mère
		
		/*
		 * Piece cuisine = new Cuisine(25,0);
		 * 
		 * Piece chambrePrincipale = new Chambre (15,1);
		 */
		
		
		Salon cave = new Salon(52, -1);
		WC bcpTropPetit = new WC(-24, 0);
		Chambre impossible = new Chambre(-20, -6);
		
		Maison nvMaison = new Maison();
		
		nvMaison.ajouterPiece(cuisine);
		nvMaison.ajouterPiece(chambrePrincipale);
		nvMaison.ajouterPiece(chambreDesAmis);
		nvMaison.ajouterPiece(chambreDesEnfants);
		nvMaison.ajouterPiece(salon);
		nvMaison.ajouterPiece(null); 					//Test Bug Null
		nvMaison.ajouterPiece(cave);  					//Test étage négatif
		nvMaison.ajouterPiece(bcpTropPetit);			//Test superficie négative
		nvMaison.ajouterPiece(impossible);				//Test étage et superficie négatifs
		nvMaison.ajouterPiece(salleDeBain1);
		nvMaison.ajouterPiece(salleDeBain2);
		nvMaison.ajouterPiece(toilettes1);
		nvMaison.ajouterPiece(toilettes2);
		
		System.out.println(nvMaison);
		
		System.out.println(nvMaison.getSuperficieTotale());
		System.out.println(nvMaison.getSuperficieEtage(1));
		
		System.out.println(nvMaison.getSuperficieType("chambre"));
		System.out.println(nvMaison.getNbPiecesType("chambre"));
		
		System.out.println(nvMaison.getNbPiecesAllType());

	}

}
