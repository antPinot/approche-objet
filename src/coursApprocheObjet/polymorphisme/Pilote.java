package coursApprocheObjet.polymorphisme;

public class Pilote extends Collaborateur implements Vetements, AgentNuit{
	
	// habiller et deshabiller sont les méthodes redéfinies depuis l'interface Vetements
	
	@Override
	public void deshabiller() {
		// TODO Auto-generated method stub
		
	}@Override
	public void habiller() {
		// TODO Auto-generated method stub
		
	}
	
	// afficherInfos est une redéfinition de la méthode abstraite déclarée dans la classe mère Collaborateur
	
	@Override
	public void afficherInfos() {
		// TODO Auto-generated method stub
		
	}
	
	// primeNuit est une redéfinition de la méthode primeNuit déclarée dans l'interface Vetements
	
	@Override
	public double primeNuit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
