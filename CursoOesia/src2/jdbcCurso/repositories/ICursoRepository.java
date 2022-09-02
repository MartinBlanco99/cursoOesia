package jdbcCurso.repositories;

import java.util.List;

import jdbcCurso.models.Curso;

public interface ICursoRepository {
	
	List<Curso>listaCursos();
	
	void insertar(Curso c);
	
	void borrar(Curso c);
	

}
