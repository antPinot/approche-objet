package fr.diginamic.banque.entites;

public class Compte {
	
	private long numero;
	private double solde;
	
	public Compte(long numero, double solde){
		this.numero = numero;
		this.solde = solde;
	}

	public long getNumero() {
		return numero;
	}



	public void setNumero(long numero) {
		this.numero = numero;
	}



	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}

	// TP 6

	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numero + ", soldeDuCompte=" + solde;
	}
	
	
}
