package fr.diginamic.jdr;

public class RandomMonstre {

	public static Monstre creerMonstre() {
		int selecter = 1 + (int) (Math.random() * ((3 - 1) + 1));

		if (selecter == 1) {
			Loup loup = new Loup();
			return loup;
		} else if (selecter == 2) {
			Gobelin gobelin = new Gobelin();
			return gobelin;
		} else {
			Troll troll = new Troll();
			return troll;
		}

	}

}
