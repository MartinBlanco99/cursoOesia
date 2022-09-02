package jdbcCurso.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
	private int id;
	private String titulo;
	private int horas;
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	public Curso() {
		super();
	}

	public Curso(int id) {
		super();
		this.id = id;
	}

	public Curso(String titulo, int horas) {
		super();
		this.titulo = titulo;
		this.horas = horas;

	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void addAlumno(Alumno a) {
		alumnos.add(a);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return id == other.id;
	}

}
