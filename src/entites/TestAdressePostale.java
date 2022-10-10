package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		/*
		 * 
		 * TP 1
		 *
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 5;
		adr1.libelleRue = "des Maréchaux";
		adr1.codePostal = 44100;
		adr1.ville = "Nantes";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 25;
		adr2.libelleRue = "Saint-Lazare";
		adr2.codePostal = 34000;
		adr2.ville = "Montpellier";
		
		
		System.out.println(adr1.numeroRue);
		System.out.println(adr2.ville);
		
		*/
		
		// TP2
		
		AdressePostale adr1 = new AdressePostale(5, "Rue des Maréchaux", 44100, "Nantes");
		AdressePostale adr2 = new AdressePostale(25, "Avenue Saint-Lazare", 34000, "Montpellier");

	}

}
