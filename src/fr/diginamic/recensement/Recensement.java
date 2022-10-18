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


public class Recensement {
	
	private List<Ville> listeVilles;
	
	public Recensement() throws IOException {
		this.listeVilles = creerRecensement();
	}
	
	public static List<Ville> creerRecensement() throws IOException {
		
		List<Ville> recensement = new ArrayList<>();
		
		Path path = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/tp 16 - recensement population 2016.csv");

		List<String> contenu = Files.readAllLines(path, StandardCharsets.UTF_8);

		String[] tableauCles = contenu.get(0).split(";");

		List<String> clesListe = Arrays.asList(tableauCles);

		Map<String, Integer> clesMap = new HashMap<>();
		
		Integer valeur = 0;
		
		for (String cles : clesListe) {
			clesMap.put(cles, valeur);
			valeur++;
		}
		
		for (String lignes : contenu) {
			if (lignes != contenu.get(0)) {
				String[] lignesDecoupees = lignes.split(";");
				int population = Integer
						.parseInt(lignesDecoupees[clesMap.get("Population totale")].trim().replace(" ", ""));
				recensement.add(new Ville(lignesDecoupees[clesMap.get("Code région")],
						lignesDecoupees[clesMap.get("Nom de la région")],
						lignesDecoupees[clesMap.get("Code département")], lignesDecoupees[clesMap.get("Code commune")], lignesDecoupees[clesMap.get("Nom de la commune")], population));
			}
		}
		
		return recensement;
	}

	public List<Ville> getListeVilles() {
		return listeVilles;
	}
	

}
