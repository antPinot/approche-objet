package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date dateDuJour = new Date(122, 9, 19, 11, 14, 29);

		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

		String dateFormatee = formateur.format(dateDuJour);

		System.out.println(dateFormatee);

		Date nouvelleDate = new Date(116, 4, 19, 23, 59, 30);

		SimpleDateFormat formateurNouvelleDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String nouvelleDateFormatee = formateurNouvelleDate.format(nouvelleDate);

		System.out.println(nouvelleDateFormatee);
		
		Date dateExacte = new Date();
		
		String dateExacteFormatee = formateurNouvelleDate.format(dateExacte);
		
		System.out.println(dateExacteFormatee);
		

	}

}
