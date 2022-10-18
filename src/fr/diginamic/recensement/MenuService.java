package fr.diginamic.recensement;

import java.util.Scanner;

/*
 * Classe mère abstraite de toutes les classe utilitaires : 
 * 
 */

public abstract class MenuService {
	
	public abstract void traiter (Recensement recensement, Scanner scanner);
	
}
