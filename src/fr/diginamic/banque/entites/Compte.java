package fr.diginamic.banque.entites;

public class Compte {
	
	private long numeroDeCompte = 0;
	private double soldeDuCompte = 0.0;
	
	public Compte(long numeroDeCompte, double soldeDuCompte){
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = soldeDuCompte;
	}
}