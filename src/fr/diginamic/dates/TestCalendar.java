package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar date2016 = Calendar.getInstance();
		
		date2016.set(Calendar.YEAR, 2016);
		
		date2016.set(Calendar.MONTH, 5);
		
		date2016.set(Calendar.DAY_OF_MONTH, 19);
		
		date2016.set(Calendar.HOUR_OF_DAY, 23);
		
		date2016.set(Calendar.MINUTE, 59);
		
		date2016.set(Calendar.SECOND, 30);
		
		Date date = date2016.getTime();
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

		String dateFormatee = formateur.format(date);
		
		System.out.println(dateFormatee);
		
		Calendar calDuJour = Calendar.getInstance();
		
		calDuJour.set(2022, 9, 19, 11, 59, 58);
		
		Date dateDuJour = calDuJour.getTime();
		
		SimpleDateFormat formateurDateDuJour = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String dateDuJourFormatee = formateurDateDuJour.format(dateDuJour);

		System.out.println(dateDuJourFormatee);
		
		SimpleDateFormat formateurDateDuJourFr = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		
		SimpleDateFormat formateurDateDuJourDe = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		
		SimpleDateFormat formateurDateDuJourCh = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		
		Locale russian = new Locale("ru", "RU");
		
		SimpleDateFormat formateurDateDuJourRu = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", russian);
		
		String dateDuJourFormateeFr = formateurDateDuJourFr.format(dateDuJour);
		
		String dateDuJourFormateeDe = formateurDateDuJourDe.format(dateDuJour);
		
		String dateDuJourFormateeCh = formateurDateDuJourCh.format(dateDuJour);
		
		String dateDuJourFormateeRu = formateurDateDuJourRu.format(dateDuJour);
		
		System.out.println("Date en Français : " + dateDuJourFormateeFr);
		
		System.out.println("Date en Allemand : " + dateDuJourFormateeDe);
		
		System.out.println("Date en Chinois : " + dateDuJourFormateeCh);
		
		System.out.println("Date en Russe : " + dateDuJourFormateeRu);
		
	}

}
