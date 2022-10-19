package fr.diginamic.testenumeration;

public enum Continent {
	
	ASIE("Asie"),
	EUROPE("Europe"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
}
