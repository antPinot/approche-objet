package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {

		Set<Double> setCollection = new HashSet<Double>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

		Iterator<Double> iter = setCollection.iterator();
		while (iter.hasNext()) {
			Double nombre = iter.next();
			System.out.println(nombre);
		}
		
		// Boucle non indexée (for each)

		double min= Double.MAX_VALUE;
		for (Double nombre : setCollection) {
			if (nombre < min) {
				min = nombre;
			}
		}
		
		// Iterator
		
		/*iter = setCollection.iterator();
		while (iter.hasNext()) {
		Double nombre = iter.next();
		if(nombre < min);
		min = nombre;
		}*/
		
		System.out.println("Le minimum du set est " + min + " et va être supprimé");
		
		setCollection.remove(min);
		
		System.out.println(setCollection);

	}

}
