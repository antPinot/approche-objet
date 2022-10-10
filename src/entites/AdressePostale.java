package entites;

public class AdressePostale {

	protected int numeroRue = 0;
	protected String libelleRue = "";
	protected int codePostal = 0;
	protected String ville = "";
	
	// TP 2
	
	public AdressePostale (int numeroRue, String libelleRue, int codePostal, String ville){
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
