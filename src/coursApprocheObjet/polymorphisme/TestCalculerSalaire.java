package coursApprocheObjet.polymorphisme;

public class TestCalculerSalaire {
	
	public static void main (String[] args) {
		CalculerSalaire calcul = new CalculerSalaire();
		calcul.calculer(new Pilote());
		calcul.calculer(new PersonnelSol());
		
		// Compile car Pilote hérite de l'interface Vetements
		
		calcul.traiter(new Pilote());
		
		// Ne compile pas car PersonnelSol n'hérite pas de l'interface Vetements (Cf. CalculerSalaire)
		
		calcul.traiter(new PersonnelSol());

	}
}
