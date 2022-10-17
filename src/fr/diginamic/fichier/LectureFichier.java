package fr.diginamic.fichier;

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

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		List<Ville> listeVilles = new ArrayList<>();

		Path path = Paths.get(
				"C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/recensement.csv");

		/*
		 * boolean exists = Files.exists(path); boolean isRegularFile =
		 * Files.isRegularFile(path); boolean isReadable = Files.isReadable(path);
		 * 
		 * List<Boolean> verif = new ArrayList<>(Arrays.asList(exists, isRegularFile,
		 * isReadable));
		 * 
		 * for (Boolean verificateurs : verif) { System.out.println(verificateurs); }
		 * 
		 * if (exists && isRegularFile && isReadable) { List<String> contenu =
		 * Files.readAllLines(path, StandardCharsets.UTF_8); for (String lignes :
		 * contenu) { System.out.println(lignes); } } else {
		 * System.out.println("ERREUR"); }
		 */

		List<String> contenu = Files.readAllLines(path, StandardCharsets.UTF_8);

		String[] tableauCles = contenu.get(0).split(";");

		List<String> clesListe = Arrays.asList(tableauCles);

		Map<String, Integer> clesMap = new HashMap<>();

		Integer valeur = 0;
		for (String cles : clesListe) {
			clesMap.put(cles, valeur);
			valeur++;
		}

		System.out.println(contenu.get(0));

		for (String lignes : contenu) {
			if (lignes != contenu.get(0)) {
				String[] lignesDecoupees = lignes.split(";");
				int population = Integer
						.parseInt(lignesDecoupees[clesMap.get("Population municipale")].trim().replace(" ", ""));
				listeVilles.add(new Ville(lignesDecoupees[clesMap.get("Nom de la commune")],
						lignesDecoupees[clesMap.get("Code département")],
						lignesDecoupees[clesMap.get("Nom de la région")], population));
			}
		}

		/*for (Ville villes : listeVilles) {
			System.out.println(villes);
		}*/
		
		List<String> listeVillesTriees = new ArrayList<>();
		
		for (Ville villesTriees : listeVilles) {
			if (villesTriees.getPopulation() > 25000) {
				listeVillesTriees.add(villesTriees.toString());
			}
		}
		
		/*for (String villesTriees : listeVillesTriees) {
			System.out.println(villesTriees);
		}*/
		
		Path pathFolderFileToCreate = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/");
		
		boolean exists = Files.exists(pathFolderFileToCreate);
		boolean isDirectory = Files.isDirectory(pathFolderFileToCreate);
		boolean isReadable = Files.isReadable(pathFolderFileToCreate);
		
		Path pathFileToCreate = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/Liste_villes_sup25000.csv");
		
		Files.write(pathFileToCreate, listeVillesTriees, StandardCharsets.UTF_8);
	}

}
