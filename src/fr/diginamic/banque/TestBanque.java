package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compteEnBanque = new Compte(3008_4569_1258_4267L, 1567.25);
		
		CompteTaux compteEpargne = new CompteTaux(5869_5634_7591_6713L, 12568.41, 2.7);
		
		Compte[] tableauComtpes = new Compte[] {compteEnBanque, compteEpargne};
		
		for (Compte comptes : tableauComtpes) {
			System.out.println(comptes);
		}
	}
	
	/* 
	 * 	System.out.println(compteEnBanque.numeroDeCompte);
		System.out.println(compteEnBanque.soldeDuCompte);
	 * 
	 * Renvoie l'exception suivante : 
	 * 
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		The field Compte.numeroDeCompte is not visible
		The field Compte.soldeDuCompte is not visible

		at fr.diginamic.banque.TestBanque.main(TestBanque.java:11)
		
		Cela est dû aux règles d'encapsulation des attributs d'instance : Avec une visibilité private, il n'est pas possible d'accéder aux attributs
		de l'instance compteEnBanque. Cela permet de contrôler l'accès aux attributs.
		
		Pour pouvoir accéder aux attributs et les modifier, il est alors utile de faire appel aux méthodes getter et setter.
		
		*/

}
