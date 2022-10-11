package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private double tauxRemuneration;
	
	public CompteTaux(long numeroDeCompte, double soldeDuCompte, double tauxRemuneration){
		
		super(numeroDeCompte, soldeDuCompte);
		this.tauxRemuneration = tauxRemuneration;
			
	}
	
	@Override
	public String toString() {
		String baseCompte = super.toString();
		return baseCompte + "Taux de Rémunération : " + tauxRemuneration + " ] ";
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
