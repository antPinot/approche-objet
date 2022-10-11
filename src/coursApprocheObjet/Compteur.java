package coursApprocheObjet;

public class Compteur {
	
	int valeur; // Valeur par défaut = 0 car c'est une variable d'instance
	
	public void inc() {
		valeur++;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
}
