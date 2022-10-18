package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		Recensement recensement = new Recensement();

		boolean applicationRuns = true;

		while (applicationRuns) {

			System.out.println("\n 1. Rechercher la population d'une ville donnée");
			System.out.println(" 2. Rechercher la population d'un département donné");
			System.out.println(" 3. Rechercher la population d'une région donnée");
			System.out.println(" 4. Afficher les 10 régions les plus peuplées");
			System.out.println(" 5. Afficher les 10 départements les plus peuplés");
			System.out.println(" 6. Afficher les 10 villes les plus peuplées d'un département");
			System.out.println(" 7. Afficher les 10 villes les plus peuplées d'une région");
			System.out.println(" 8. Afficher les 10 villes les plus peuplées de France");
			System.out.println(" 9. Sortir");
			System.out.println("\n Merci de choisir une option. Si vous souhaitez quitter l'application, tapez 9");

			String option = scanner.nextLine();

			switch (option) {
			case "1":
				PopulationVille rechPopVille = new PopulationVille();
				rechPopVille.traiter(recensement, scanner);
				break;
			case "2":
				PopulationDepartement rechPopDep = new PopulationDepartement();
				rechPopDep.traiter(recensement, scanner);
				break;
			case "3":
				PopulationRegion rechPopRegion = new PopulationRegion();
				rechPopRegion.traiter(recensement, scanner);
				break;
			case "4":
				TopDixRegions rechDixRegion = new TopDixRegions();
				rechDixRegion.traiter(recensement, scanner);
				break;
			case "5":
				TopDixDepartement rechDixDepartement = new TopDixDepartement();
				rechDixDepartement.traiter(recensement, scanner);
				break;
			case "6":
				TopDixVilleDepartement rechDixVilleDepartement = new TopDixVilleDepartement();
				rechDixVilleDepartement.traiter(recensement, scanner);
				break;
			case "7":
				TopDixVilleRegion rechDixVilleRegion = new TopDixVilleRegion();
				rechDixVilleRegion.traiter(recensement, scanner);
				break;
			case "8":
				TopDixVillePays rechDixVillePays = new TopDixVillePays();
				rechDixVillePays.traiter(recensement, scanner);
				break;
			case "9":
				System.out.println("Fin d'éxécution");
				applicationRuns = false;
				break;
			default:
				System.out.println("Nous n'avons pas compris votre requête. Merci de choisir une option entre 1 et 8 ou de taper 9 si vous souhaitez sortir");
				break;
			}

		}
		scanner.close();

	}

}
