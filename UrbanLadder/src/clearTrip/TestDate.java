package clearTrip;

import java.time.LocalDate;
import java.util.Calendar;

public class TestDate {
	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		int day=todayDate.getDayOfYear();
		System.out.println(todayDate.getDayOfWeek());
		System.out.println(day);
	}
}
