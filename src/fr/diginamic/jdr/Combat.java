package fr.diginamic.jdr;

public class Combat {
	
	private static Personnage personnage;
	
	private static Monstre monstre;
		
	public static void combat() {

		while (personnage.getHp() > 0 && monstre.getHp() > 0) {
			int resultatCombat = personnage.attaque() - monstre.attaque();
			if (resultatCombat < 0) {
				personnage.setHp(personnage.getHp() + resultatCombat);
				System.out.println("Vos PV sont à " + personnage.getHp() + "et ceux du " + monstre.getNom() + " sont à " + monstre.getHp());
			} else if (resultatCombat > 0) {
				monstre.setHp(monstre.getHp() - resultatCombat);
				System.out.println("Vos PV sont à " + personnage.getHp() + "et ceux du " + monstre.getNom() + " sont à " + monstre.getHp());
			}
			
		
		}

		if (personnage.getHp() <= 0) {
			System.out.println("Vous avez perdu, merci de créer un nouveau personnage");
		} else {
			switch (monstre.getNom()) {
			case "Loup":
				personnage.setScore(personnage.getScore() + 1);
				break;
			case "Gobelin":
				personnage.setScore(personnage.getScore() + 2);
				break;
			default:
				personnage.setScore(personnage.getScore() + 5);
				break;
			}

		}
		
		System.out.println("Votre nouveau score est de " + personnage.getScore());

	}

	/**Getter pour l'attribut personnage
	 * @return the personnage
	 */
	public static Personnage getPersonnage() {
		return personnage;
	}

	/**Setter pour l'attribut personnage
	 * @param personnage the personnage to set
	 */
	public static void setPersonnage(Personnage personnage) {
		Combat.personnage = personnage;
	}

	/**Getter pour l'attribut monstre
	 * @return the monstre
	 */
	public static Monstre getMonstre() {
		return monstre;
	}

	/**Setter pour l'attribut monstre
	 * @param monstre the monstre to set
	 */
	public static void setMonstre(Monstre monstre) {
		Combat.monstre = monstre;
	}
	

}
