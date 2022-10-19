package coursApprocheObjet.heritage;

public class Vehicule {
	
	private String marque;
	private String modele;
	
	//Le constructeur de la classe mère possède au moins un paramètre
	
	public Vehicule(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}
	
	public void demarrer( ) {
		
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	
	

}
