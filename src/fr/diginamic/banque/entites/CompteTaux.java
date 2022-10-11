package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private double tauxRemuneration = 0.0;
	
	public CompteTaux(long numeroDeCompte, double soldeDuCompte, double tauxRemuneration){
		
		super(numeroDeCompte, soldeDuCompte);
		this.tauxRemuneration = tauxRemuneration;
			
	}
	
	@Override
	public String toString() {
		String baseCompte = super.toString();
		return baseCompte + "Taux de Rémunération : " + tauxRemuneration + " ] ";
	}
	
}
