package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(2020, 10, 10);

		System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));

		System.out.println();

		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));

		System.out.println();

		System.out.println(calendario.get(Calendar.HOUR));
		System.out.println(calendario.get(Calendar.MINUTE));
		System.out.println(calendario.get(Calendar.SECOND));

		System.out.println();

		calendario.add(Calendar.MONTH, 1);
		calendario.add(Calendar.YEAR, 1);
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));
		
		System.out.println();

		String fecha = "01/01/2023";
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyY");

		try {
			Date fechaReal = formateador.parse(fecha);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaReal);

			System.out.println(cal.get(Calendar.YEAR));
			System.out.println(cal.get(Calendar.MONTH));
			System.out.println(cal.get(Calendar.DATE));
			
			
			System.out.println();
			
			System.out.println(formateador.format(cal.getTime()));

		} catch (ParseException e) {
			// TODO: handle exception
		}

	}

}
