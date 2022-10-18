package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class TestFonctions {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		Recensement recensement = new Recensement();
		
		// Test population d'une ville
		
		/*PopulationVille rechPopVill = new PopulationVille();
		rechPopVill.traiter(recensement, scanner);
		
		// Test population d'un département
		
		PopulationDepartement rechPopDep = new PopulationDepartement();
		rechPopDep.traiter(recensement, scanner);
		
		// Test population d'une région
		
		PopulationRegion rechPopRegion = new PopulationRegion();
		rechPopRegion.traiter(recensement, scanner);
		
		// Test 10 régions les plus peuplées
		
		TopDixRegions rechDixRegion = new TopDixRegions();
		rechDixRegion.traiter(recensement, scanner);
		
		// Test 10 départements les plus peuplés
		
		TopDixDepartement rechDixDepartement = new TopDixDepartement();
		rechDixDepartement.traiter(recensement, scanner);*/
		
		// Test 10 villes les plus peuplées d'un département donné
		
		TopDixVilleDepartement rechDixVilleDepartement = new TopDixVilleDepartement();
		rechDixVilleDepartement.traiter(recensement, scanner);
		
		// Test 10 villes les plus peuplées d'une région donnée
		
		/*TopDixVilleRegion rechDixVilleRegion = new TopDixVilleRegion();
		rechDixVilleRegion.traiter(recensement, scanner);
		
		//Test 10 villes les plus peuplées de France
		
		TopDixVillePays rechDixVillePays = new TopDixVillePays();
		rechDixVillePays.traiter(recensement, scanner);*/
		
		
		
	}

}
