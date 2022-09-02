package jdbcCurso.repositories;

import java.util.List;

import jdbcCurso.models.Alumno;

public interface IAlumnoRepository {
	List<Alumno> listaAlumnos();

	void insertar(Alumno a);

	void borrar(Alumno a);

}
