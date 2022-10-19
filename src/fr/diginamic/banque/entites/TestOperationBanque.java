package fr.diginamic.banque.entites;

import java.text.DecimalFormat;

public class TestOperationBanque {

	public static void main(String[] args) {
		
		Credit credit1 = new Credit ("29 09 2022", 12.65);
		Credit credit2 = new Credit ("15 01 1994", 24339.14);
		Debit debit1 = new Debit("08 04 2005", 3659.21);
		Debit debit2 = new Debit("30 11 2014", 39.48);
		
		Operation[] operationsTab = new Operation[] {credit1, debit1, debit2, credit2};
		
		double nvMontant = 0.0;
		
		for (Operation operations : operationsTab) {
			if (operations.getType().equals("CREDIT")) {		// Methode EQUALS pour les objets, on réserve le " ==" pour les types primitifs.
				nvMontant += operations.getMontant();
			}else {
				nvMontant -= operations.getMontant();
			}
			System.out.println(operations);
		}
		
		DecimalFormat formatter = new DecimalFormat(".00");
		String nvMontantFormate = formatter.format(nvMontant);
		
		System.out.println(nvMontantFormate);
	}

}
