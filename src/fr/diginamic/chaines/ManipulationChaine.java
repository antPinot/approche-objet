package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand; Marcel; 2 523.5";
		
		System.out.println(chaine.charAt(0));
		
		System.out.println(chaine.length());

		System.out.println(chaine.indexOf(';'));
		
		System.out.println(chaine.substring(chaine.indexOf(chaine.charAt(0)), chaine.indexOf(';')));
		
		String chaineMaj = chaine.toUpperCase();
		
		System.out.println(chaineMaj);
		
		System.out.println(chaineMaj.toLowerCase());
		
		String chaineFormatee = chaine.replace("2 523.5", "2523.5");
		
		String chaineDecoupee[] = chaineFormatee.split(";");
		
		for (int i=0; i<chaineDecoupee.length; i++) {
			System.out.println(chaineDecoupee[i]);
		}
		
		double salaire = Double.parseDouble(chaineDecoupee[2]);
		
		Salarie salarie1 = new Salarie(chaineDecoupee[0], chaineDecoupee[1], salaire);
		
		System.out.println(salarie1);
				
		
	}

}
