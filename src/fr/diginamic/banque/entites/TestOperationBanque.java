package fr.diginamic.banque.entites;

public class TestOperationBanque {

	public static void main(String[] args) {
		
		Credit credit1 = new Credit ("29 09 2022", 12.65);
		Credit credit2 = new Credit ("15 01 1994", 24339.14);
		Debit debit1 = new Debit("08 04 2005", 3659.21);
		Debit debit2 = new Debit("30 11 2014", 39.48);
		
		Operation[] operationsTab = new Operation[] {credit1, debit1, debit2, credit2};
		
		double nvMontant = 0.0;
		
		for (Operation operations : operationsTab) {
			if (operations.getType() == "CREDIT") {
				nvMontant += operations.getMontant();
			}else {
				nvMontant -= operations.getMontant();
			}
			System.out.println(operations);
		}
		System.out.println(nvMontant);
	}

}
