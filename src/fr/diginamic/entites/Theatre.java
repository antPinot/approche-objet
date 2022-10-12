package fr.diginamic.entites;

public class Theatre {
	
	private String name;
	
	private int maxCapacity;
	
	private int nbCustomers;
	
	private double income;
	
	public Theatre(String name, int maxCapacity, int nbCustomers, double income) {
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.nbCustomers = nbCustomers;
		this.income = income;
	}
	
	public void inscrire(int customers, double price) {
		if ((this.nbCustomers + customers) <= maxCapacity) {
			this.nbCustomers += customers;
			this.income = this.nbCustomers * price;
		}
		else {
			System.out.println("La capacité maximale du théâtre est atteinte, il va falloir faire des choix");
		}
			
	}

	public String getName() {
		return name;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public int getNbCustomers() {
		return nbCustomers;
	}

	public double getIncome() {
		return income;
	}
	

}
