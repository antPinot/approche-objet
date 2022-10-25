package fr.diginamic.automates;

public class JeuDeLaVie {

	private int[][] matrice = new int[10][5];

	public void printMatrix() {
		for (int[] cases : matrice) {
			for (int numero : cases)
				System.out.println(numero);
		}
	}

	public void affectMatrix(Cell cell) {

		matrice[cell.getPositiony()][cell.getPositionx()] = 1;

	}

	public void lives(Cell cell) {
		if ((matrice[cell.getPositiony() - 1][cell.getPositionx()]
				+ matrice[cell.getPositiony() - 1][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony()][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx()]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx() - 1]
				+ matrice[cell.getPositiony() - 1][cell.getPositionx() - 1]) == 2) {
			matrice[cell.getPositiony()][cell.getPositionx()] = 1;
		}

	}

	public void dies(Cell cell) {
		if ((matrice[cell.getPositiony() - 1][cell.getPositionx()]
				+ matrice[cell.getPositiony() - 1][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony()][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx() + 1]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx()]
				+ matrice[cell.getPositiony() + 1][cell.getPositionx() - 1]
				+ matrice[cell.getPositiony() - 1][cell.getPositionx() - 1]) >= 4
				| (matrice[cell.getPositiony() - 1][cell.getPositionx()]
						+ matrice[cell.getPositiony() - 1][cell.getPositionx() + 1]
						+ matrice[cell.getPositiony()][cell.getPositionx() + 1]
						+ matrice[cell.getPositiony() + 1][cell.getPositionx() + 1]
						+ matrice[cell.getPositiony() + 1][cell.getPositionx()]
						+ matrice[cell.getPositiony() + 1][cell.getPositionx() - 1]
						+ matrice[cell.getPositiony() - 1][cell.getPositionx() - 1]) < 2) {
			matrice[cell.getPositiony()][cell.getPositionx()] = 0;

		}

	}
}
