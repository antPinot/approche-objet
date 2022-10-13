package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	public Piece[] pieces = new Piece[1];

	public void ajouterPiece(Piece piece) {

		if (pieces.length == 1 && pieces[0] == null) {
			pieces[0] = piece;
		} else if (piece != null && piece.getNumeroEtage() >= 0 && piece.getSuperficie() >= 0) {
			Piece[] nvPieces = new Piece[pieces.length + 1];
			for (int i = 0; i < pieces.length; i++) {
				nvPieces[i] = pieces[i];
			}
			nvPieces[pieces.length] = piece;
			this.pieces = nvPieces;
		}
	}

	public double getSuperficieTotale() {

		double superficieTotale = 0.0;
		for (int i = 0; i < pieces.length; i++) {
			superficieTotale += pieces[i].getSuperficie();
		}
		return superficieTotale;
	}

	public double getSuperficieEtage(int etage) {

		double superficieEtage = 0.0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getNumeroEtage() == etage) {
				superficieEtage += pieces[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	public double getSuperficieType(String type) {
		
		String formattedType = type.toUpperCase();
		double superficieType = 0.0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType().equals(formattedType)) {
				superficieType += pieces[i].getSuperficie();
			}
		}
		return superficieType;
	}

	public int getNbPiecesType(String type) {
		String formattedType = type.toUpperCase();
		int piece = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType().equals(formattedType)) {
				piece++;
			}
		}
		return piece;
	}

	// Méthode pour renvoyer tous les types de pièces et le nombre par type

	public int[] getNbPiecesAllType() {

		int chambre = 0, salon = 0, cuisine = 0, salleDeBain = 0, WC = 0;
		for (int i = 0; i < pieces.length; i++) {
			switch (pieces[i].getType()) {
			case ("CHAMBRE"):
				chambre++;
				break;
			case ("SALON"):
				salon++;
				break;
			case ("CUISINE"):
				cuisine++;
				break;
			case ("SALLE DE BAIN"):
				salleDeBain++;
				break;
			default:
				WC++;
				break;
			}
		}
		int[] piecesType = { chambre, salon, cuisine, salleDeBain, WC };
		return piecesType;
	}

	@Override
	public String toString() {
		return "Maison [pieces=" + Arrays.toString(pieces) + "]";
	}

}
