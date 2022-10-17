package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{
	
	@Override
	public int compare(Ville ville1, Ville ville2) {
		
		int result = ville1.getNom().compareTo(ville2.getNom());
		
		return result;
	}

}
