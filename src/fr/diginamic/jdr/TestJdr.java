package fr.diginamic.jdr;

import java.util.Scanner;

public class TestJdr {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean applicationRuns = true;
		
		while (applicationRuns) {
			System.out.println("Bonjour et bienvenue dans le plus exceptionnel des jeux de rôle de votre existence\n Merci de bien vouloir choisir parmi le menu :");
			System.out.println("1. Créer un nouveau personnage");
			System.out.println("2. Combattre une créature");
			System.out.println("3. Affichez votre score");
			System.out.println("4. Quittez le jeu");
			
			String option = scanner.nextLine();
			
			switch(option){
			case "1":
				System.out.println("Veuillez choisir le nom de votre personnage");
				String nomPersonnage = scanner.nextLine();
				Combat.setPersonnage(new Personnage(nomPersonnage));
			break;
			case "2":
				Combat.setMonstre(RandomMonstre.creerMonstre());
				Combat.combat();
			break;
			case "3":
				System.out.println(Combat.getPersonnage().getScore()); 
			break;
			default:
				applicationRuns = false;
			}
		}
		
		scanner.close();

}

}
