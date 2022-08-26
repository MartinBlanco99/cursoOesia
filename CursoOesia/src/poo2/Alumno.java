package poo2;

public class Alumno {

	private String nombre;

	private Convocatoria convocatoriaA;
	private Convocatoria convocatoriaB;

	public Convocatoria getConvocatoriaB() {
		return convocatoriaB;
	}

	public void setConvocatoriaB(Convocatoria convocatoriaB) {
		this.convocatoriaB = convocatoriaB;
	}

	public String getNombre() {
		return nombre;
	}

	public Convocatoria getConvocatoriaA() {
		return convocatoriaA;
	}

	public void setConvocatoriaA(Convocatoria convocatoriaA) {
		this.convocatoriaA = convocatoriaA;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	private double notaMayor(double ... notas) {
		
		double mayor= 0;
		for (int i=0;i<notas.length;i++) {
			
			if (mayor<notas[i]) {
				mayor=notas[i];
			}
		}
		return mayor;
	}
	
	public double getNota() {

			return notaMayor(convocatoriaA.getNota(),convocatoriaB.getNota());
	}

}
