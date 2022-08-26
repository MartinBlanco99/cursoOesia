package fechas;

import java.time.LocalDate;

public class PrinicipalLocalDate {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2010, 7, 18);

		System.out.println(ld);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.isAfter(ld2));
		System.out.println(ld.isBefore(ld2));

	}

}
