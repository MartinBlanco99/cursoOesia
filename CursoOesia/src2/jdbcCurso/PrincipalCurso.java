package jdbcCurso;

import java.util.List;

import jdbcCurso.models.Alumno;
import jdbcCurso.models.Curso;
import jdbcCurso.repositories.jdbc.AlumnoRepositoryJDBC;
import jdbcCurso.repositories.jdbc.CursoRepositoryJDBC;

public class PrincipalCurso {

	public static void main(String[] args) {
		CursoRepositoryJDBC cursoRepositoryJDBC = new CursoRepositoryJDBC();
		List<Curso> listaCurso = cursoRepositoryJDBC.listaCursos();
		for (Curso c : listaCurso) {
			System.out.println(c.getTitulo() + " " + c.getHoras() + " " + c.getAlumnos());
		}

		Curso curso = new Curso("Java desde 0", 120);
		cursoRepositoryJDBC.insertar(curso);
		List<Curso> listaCurso2 = cursoRepositoryJDBC.listaCursos();
		for (Curso c1 : listaCurso2) {
			System.out.println(c1.getTitulo() + " " + c1.getHoras() + " " + c1.getAlumnos());
		}

//		System.out.println();
//		
//		AlumnoRepositoryJDBC alumnoRepositoryJDBC = new AlumnoRepositoryJDBC();
//		List<Alumno> listaAlumno = alumnoRepositoryJDBC.listaAlumnos();
//		for (Alumno a : listaAlumno) {
//			System.out.println(a.getNombre() + " " + a.getApellido() + " " + a.getEdad());
//		}
//
//		Alumno a = new Alumno("martin", "blanco", 23);
//		alumnoRepositoryJDBC.insertar(a);
//		List<Alumno> lista2 = alumnoRepositoryJDBC.listaAlumnos();
//		for (Alumno alumno : lista2) {
//			System.out.println(a.getNombre() + " " + a.getApellido() + " " + a.getEdad());
//		}

	}

}
