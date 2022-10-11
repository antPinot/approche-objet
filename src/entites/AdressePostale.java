package entites;

public class AdressePostale {

	private int numeroRue = 0;
	private String libelleRue = "";
	private int codePostal = 0;
	private String ville = "";
	
	// Attribut de classe (static)
	
	private static String pays = "France";
	
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
	
	// Méthode static
	
	public static String getPays() {
		return pays;
	}
	
	// Getters and Setters

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
}
