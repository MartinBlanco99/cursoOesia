package jdbcCurso.servicios;

import java.util.List;

import jdbcCurso.models.Curso;
import jdbcCurso.repositories.ICursoRepository;

public class CursoService {

	private ICursoRepository iCursoRepository;

	public List<Curso> listaCursos() {
		return iCursoRepository.listaCursos();
	}

	public void insertar(Curso c) {
		iCursoRepository.insertar(c);

	}

	void borrar(Curso c) {
		iCursoRepository.borrar(c);
	}

}
