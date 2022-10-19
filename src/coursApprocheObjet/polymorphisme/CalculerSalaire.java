package coursApprocheObjet.polymorphisme;

public class CalculerSalaire {

		//Collaborateur collab = collab
	
		// On peut passer n'importe quel classe fille de collab (classe mère) dans la méthode calculer
	
		public void calculer (Collaborateur collab) {
			
		}
		
		//Méthode qui s'applique aux objets qui héritent (ou plutôt implémentent Vetements), mais pas à l'interface Vetements elle-même qui n'est pas instanciable (une interface est une classe abstraite)
		
		public void traiter(Vetements vetements) {
			
		}
}
