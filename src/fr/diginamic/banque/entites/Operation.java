package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String date;
	
	private double montant;
	
	public abstract String getType();
	
	Operation (String date, double montant){
		this.date = date;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant;
	}
	
	public String getDate() {
		return this.date;
	}

	public double getMontant() {
		return this.montant;
	}
	

}
