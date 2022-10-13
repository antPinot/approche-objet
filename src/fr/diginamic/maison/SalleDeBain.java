package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
		
	}
	
	@Override
	public String getType() {
		return "SALLE DE BAIN";
	}

}
