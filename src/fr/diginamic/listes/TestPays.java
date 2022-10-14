package fr.diginamic.listes;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		
		Pays usa = new Pays("USA", 331_449_281, 76_027.043);
		Pays france = new Pays("France", 68_014_000, 44_747.264);
		Pays allemagne = new Pays("Allemagne", 83_695_430, 51_103.976);
		Pays uk = new Pays("UK", 67_886_004, 49_761.126);
		Pays italie = new Pays("Italie", 60_359_546, 34_777.089);
		Pays japon = new Pays("Japon", 124_780_000, 39_243.371);
		Pays chine = new Pays("Chine", 1_411_780_000, 10_525.000);
		Pays poutineLand = new Pays("Russie", 146_170_015, 12_574.926);
		Pays inde = new Pays("Inde", 1_326_093_247, 2_515.435);
		
		Set<Pays> paysSet = new HashSet<Pays>(Arrays.asList(usa,france,allemagne,uk,italie,japon,chine,poutineLand,inde));
		
		//Recherche du pays avec le PIB/Habitant le plus élevé
		
		double maxPib = Double.MIN_VALUE;
		String maxPibPays = "";
		for (Pays pays : paysSet) {
			if ((pays.getPibParHabitant()) > maxPib) {
				maxPib = pays.getPibParHabitant();
				maxPibPays = pays.getNom();
			}
		}
		
		System.out.println("Le pays avec le PIB/habitant le plus important est : " + maxPibPays + " avec " + maxPib + " $/habitant");
		
		//Recherche du pays avec le PIB total le plus élevé
		
		double maxPibTotal = Double.MIN_VALUE;
		String maxPibTotalPays = "";
		for (Pays pays : paysSet) {
			if ((pays.getPibParHabitant()) > maxPibTotal) {
				maxPibTotal = (pays.getPibParHabitant())*(pays.getNbHabitants());
				maxPibTotalPays = pays.getNom();
			}
		}
		
		DecimalFormat formatteur = new DecimalFormat(".00");
		
		System.out.println("Le pays avec le PIB total le plus important est : " + maxPibTotalPays + " avec " + formatteur.format(maxPibTotal) + " $");
		
		double minPibTotal = Double.MAX_VALUE;
		String minPibTotalPays = "";
		Pays minPibPays = null;
		for (Pays pays : paysSet) {
			if ((pays.getPibParHabitant()) < minPibTotal) {
				minPibTotal = (pays.getPibParHabitant())*(pays.getNbHabitants());
				minPibTotalPays = pays.getNom();
				minPibPays = pays;
			}
		}
		
		System.out.println("Le pays avec le PIB total le moins important est : " + minPibTotalPays + " avec " + formatteur.format(minPibTotal) + " $ et va être supprimé de la liste");
		
		paysSet.remove(minPibPays);
		
		for (Pays pays : paysSet) {
			System.out.println(pays);
		}

	}

}
