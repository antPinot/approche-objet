package coursApprocheObjet.heritage;

public class Avion extends Vehicule {
	
	private int nbReacteurs;
	
	@Override		//Redéfinition de la méthode demarrer de la classe mère
	public void demarrer() {
		System.out.println("Je suis un avion et je démarre");
	}
	
	/*Overload Surcharge de méthode
	 * 
	 * public void demarrer (String surcharge){
	 * 
	 * }
	 */
	
	
	public void decoller() {
		
	}

	public int getNbReacteurs() {
		return nbReacteurs;
	}

	public void setNbReacteurs(int nbReacteurs) {
		this.nbReacteurs = nbReacteurs;
	}

}
