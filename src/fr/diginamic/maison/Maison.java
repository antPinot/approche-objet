package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	public Piece[] pieces = new Piece[1];

	public void ajouterPiece(Piece piece) {

			if (pieces.length == 1 && pieces[0] == null){
				pieces[0] = piece;
			}else {
				Piece[] nvPieces = new Piece[pieces.length + 1];
				for (int i = 0; i <pieces.length; i++) {
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

	@Override
	public String toString() {
		return "Maison [pieces=" + Arrays.toString(pieces) + "]";
	}

}
