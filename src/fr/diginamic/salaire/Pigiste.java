package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private double nbJoursTravailles;
	
	private double salaireJournalierReference = 124.89;

	public Pigiste(String nom, String prenom, double nbJoursTravailles) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
	}
	
	@Override
	public double getSalaire() {
		return this.salaireJournalierReference*this.nbJoursTravailles;
	}
	
	@Override
	public String getStatut() {
		return "Pigiste";
	}


}
