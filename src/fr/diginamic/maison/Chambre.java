package fr.diginamic.maison;

public class Chambre extends Piece{

	public Chambre(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}
	
	@Override
	public String getType() {
		return "CHAMBRE";
	}
	
}
