package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFolderFileToCreate = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/");
		
		boolean exists = Files.exists(pathFolderFileToCreate);
		boolean isDirectory = Files.isDirectory(pathFolderFileToCreate);
		boolean isReadable = Files.isReadable(pathFolderFileToCreate);
		
		Path pathFileToRead = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/recensement.csv");
		
		List<String> contentToRead = Files.readAllLines(pathFileToRead, StandardCharsets.UTF_8);
		
		Path pathFileToCreate = Paths.get("C:/Users/Saranthony/Documents/Reconversion Professionnelle/Apprentissage Programmation/Diginamic/Approche Objet/FichierTPfichiers.csv");
		
		List<String> contentToWrite = new ArrayList<>();
		
		for (int i=0; i<100; i++) {
			contentToWrite.add(contentToRead.get(i));
		}
		
		Files.write(pathFileToCreate, contentToWrite, StandardCharsets.UTF_8);
		
		for (String lignes : contentToWrite) {
			System.out.println(lignes);
		}	
	}

}
