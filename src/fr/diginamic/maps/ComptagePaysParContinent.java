package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		Pays france = new Pays("France", 65_000_000, "Europe");
		Pays allemagne = new Pays("Allemagne", 80_000_000, "Europe");
		Pays belgique = new Pays("Belgique", 10_000_000, "Europe");
		Pays russie = new Pays("Russie", 150_000_000, "Asie");
		Pays chine = new Pays("Chine", 1_400_000_000, "Asie");
		Pays indonesie = new Pays("Indonésie", 220_000_000, "Océanie");
		Pays australie = new Pays("Australie", 20_000_000, "Océanie");

		List<Pays> listePays = new ArrayList<>(Arrays.asList(france, allemagne, belgique, russie, chine, indonesie, australie));

		Map<String, Integer> comptagePaysContinent = new HashMap<>();

		Integer comptagePaysEurope = 0;
		Integer comptagePaysAsie = 0;
		Integer comptagePaysOceanie = 0;
		for (Pays pays : listePays) {
			switch (pays.getContinent()) {
			case "Europe":
			comptagePaysEurope++;
			comptagePaysContinent.put(pays.getContinent(), comptagePaysEurope);
			break;
			case "Asie":
			comptagePaysAsie++;
			comptagePaysContinent.put(pays.getContinent(), comptagePaysAsie);
			break;
			default:
			comptagePaysOceanie++;
			comptagePaysContinent.put(pays.getContinent(), comptagePaysOceanie);
			break;
			}		
		}	

		System.out.println("Voici le nombre de pays par continent :\n" + comptagePaysContinent);

	}

}
