package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		Salarie paul = new Salarie("Paul", 1750.00);
		Salarie hicham = new Salarie("Hicham", 1825.00);
		Salarie yu = new Salarie("Yu", 2250.00);
		Salarie ingrid = new Salarie("Ingrid", 2015.00);
		Salarie chantal = new Salarie("Chantal", 2418);
		
		Map<String, Salarie> mapSalaires = new HashMap<>();
		
		mapSalaires.put(paul.getPrenom(), paul);
		mapSalaires.put(hicham.getPrenom(), hicham);
		mapSalaires.put(yu.getPrenom(), yu);
		mapSalaires.put(ingrid.getPrenom(), ingrid);
		mapSalaires.put(chantal.getPrenom(), chantal);
		
		System.out.println("La taille du dictionnaire (map) est de " + mapSalaires.size());

	}

}
