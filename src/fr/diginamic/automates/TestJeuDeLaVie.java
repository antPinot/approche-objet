package fr.diginamic.automates;

public class TestJeuDeLaVie {

	public static void main(String[] args) {
		
		
		JeuDeLaVie jeu = new JeuDeLaVie();
		
		Cell cell1 = new Cell(5, 2);
		
		jeu.affectMatrix(cell1);
		
		jeu.printMatrix();
		
		jeu.dies(cell1);
		
		System.out.println("------------Séparation---------------");
		
		jeu.printMatrix();
		

	}

}
