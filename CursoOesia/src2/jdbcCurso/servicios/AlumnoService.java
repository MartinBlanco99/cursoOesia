package jdbcCurso.servicios;

import java.util.List;

import jdbcCurso.models.Alumno;
import jdbcCurso.repositories.IAlumnoRepository;

public class AlumnoService {

	private IAlumnoRepository ialumnoRepositorio;

	public List<Alumno> listaAlumnos() {
		return ialumnoRepositorio.listaAlumnos();
	}

	public void insertar(Alumno a) {
		ialumnoRepositorio.insertar(a);
	}

	public void borrar(Alumno a) {
		ialumnoRepositorio.borrar(a);
	}

}
