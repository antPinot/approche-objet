package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.diginamic.listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		Ville newyork = new Ville("New York", 8_804_190, Continent.AMERIQUE);
		Ville paris = new Ville("Paris", 2_165_423, Continent.EUROPE);
		Ville pekin = new Ville("Pékin", 21_893_095, Continent.ASIE);
		Ville moscou = new Ville("Moscou", 12_655_050, Continent.EUROPE);
		Ville berlin = new Ville("Berlin", 3_748_148, Continent.EUROPE);
		Ville sydney = new Ville("Sydney", 5_312_163, Continent.OCEANIE);
		Ville saopaulo = new Ville("Sao Paulo", 11_895_893, Continent.AMERIQUE);
		Ville dakar = new Ville("Dakar", 1_056_009, Continent.AFRIQUE);
		
		List<Ville> villeListe = new ArrayList<>(Arrays.asList(newyork, paris, pekin, moscou, berlin, sydney, saopaulo, dakar));
		
		for (Ville villes : villeListe) {
			System.out.println(villes);
		}
		
		

	}

}
