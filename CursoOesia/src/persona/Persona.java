package persona;

import java.util.Calendar;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	public Persona(String nombre, String apellido, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean esMayor(Persona per) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getFechaNacimiento());
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(per.getFechaNacimiento());
		
		return !cal.after(cal2);
	}
	

}
