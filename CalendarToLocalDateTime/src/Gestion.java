
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar otroToday = new GregorianCalendar(2021, Calendar.FEBRUARY, 22, 23, 11, 44);
		LocalDateTime ahora = LocalDateTime.now();

		//verFecha(otroToday);
		verFechaLDT(ahora);

	}

	private static void verFechaLDT(LocalDateTime tiempo) {

		Locale locale = Locale.getDefault();

		System.out.println("Year : " + tiempo.getYear());
		System.out.println("Month (1 is January): " + tiempo.getMonthValue());
		System.out.println("Month (String): " + tiempo.getMonth().toString() );
		System.out.println("Day of Month : " + tiempo.getDayOfMonth() );
		System.out.println("Day of Week (1 is Sunday): " + tiempo.getDayOfWeek().getValue());
		System.out.println("Day of Week (String): " + tiempo.getDayOfWeek().toString());
//		System.out.println("Week of Year : " + );
//		System.out.println("Week of Month : " + );
		System.out.println("Day of Year : " + tiempo.getDayOfYear());
//		System.out.println("24-hour clock : " + );
//		System.out.println("12-hour clock : " + );
//		System.out.println("AM/PM : " + );
//		System.out.println("AM/PM : " + );
		System.out.println("Minutes : " + tiempo.getMinute());
		System.out.println("Seconds : " + tiempo.getSecond());
//		System.out.println("MiliSeconds : " + );

		System.out.println("-------------------------------------");
	}

	private static void verFecha(Calendar today) {

		Locale locale = Locale.getDefault();

		System.out.println("Year : " + today.get(Calendar.YEAR));
		System.out.println("Month (0 is January): " + today.get(Calendar.MONTH));
		System.out.println("Month (String): " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
		System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Week (0 is Sunday): " + today.get(Calendar.DAY_OF_WEEK));
		System.out
				.println("Day of Week (String): " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale));
		System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("12-hour clock : " + today.get(Calendar.HOUR));
		System.out.println("AM/PM : " + today.get(Calendar.AM_PM));
		System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
		System.out.println("Minutes : " + today.get(Calendar.MINUTE));
		System.out.println("Seconds : " + today.get(Calendar.SECOND));
		System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));

		System.out.println("-------------------------------------");

	}

}
