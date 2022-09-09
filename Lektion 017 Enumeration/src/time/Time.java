package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Time {

	public static void main(String[] args) {
		LocalDate dat1 = LocalDate.now();
		System.out.println(dat1);
		LocalDate dat2 = dat1.plusMonths(3);
		System.out.println(dat2);
		LocalDate dat3 = LocalDate.of(2017, 12, 6);
		System.out.println(dat3);
		LocalDate dat4 = LocalDate.parse("2018-10-15");
		System.out.println(dat4);

		// Varigheden mellem to datoer
		Period per = dat1.until(dat3);
		long days = per.getDays();
		long months = per.getMonths();
		long years = per.getYears();

		System.out.println("Fra " + dat1 + " til " + dat3 + " er der "
				+ years + " år " + months + " måneder " + days + " dage");

		months = ChronoUnit.MONTHS.between(dat1, dat3);
		days = ChronoUnit.DAYS.between(dat1, dat3);

		System.out.println("Måneder: " + months);
		System.out.println("Dage: " + days);

		LocalTime time1 = LocalTime.of(9, 15);
		System.out.println(time1);
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);

		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1.toLocalDate());
		System.out.println(dt1.toLocalTime());

		LocalDateTime dt2 = LocalDateTime.of(2019, 11, 6, 9, 15);
		System.out.println(dt2.toLocalDate());
		System.out.println(dt2.toLocalTime());
	}
}
