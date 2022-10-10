package entites;

public class AdressePostale {

	public int numeroRue = 0;
	public String libelleRue = "";
	public int codePostal = 0;
	public String ville = "";
	
	// TP 2
	
	public AdressePostale (int numeroRue, String libelleRue, int codePostal, String ville){
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}
}
