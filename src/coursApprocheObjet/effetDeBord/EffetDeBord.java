package coursApprocheObjet.effetDeBord;

public class EffetDeBord {
	
	private double x;
	
	// Effet de bord dans cette méthode car le résultat ne dépend pas exclusivement 
	// des paramètres de la méthode
	
	public double calcul (double a, double b) {
		return a * x + b;
	}

}
