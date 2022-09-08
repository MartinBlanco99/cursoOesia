package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest3 {

	Alumno alumno;
	List<Nota2> notas;
	
	// es refactorizar parte de mi codigo
	// a nivel de pruebas unitarias
	@BeforeEach
	public void setUp() {
		
		alumno= new Alumno();
		alumno.setNotasLista(getListaNotasBasica());
		
	}
	@Test
	void alumnoAddNotaTest() {
		
		Nota2 nota= new Nota2(2, "matematicas");
		assertFalse(alumno.getNotasLista().contains(nota));
		alumno.addNota(nota);
		assertTrue(alumno.getNotasLista().contains(nota));
		
	}
	
	@Test
	void alumnoRemoveNotaTest() {
			
		Nota2 nota= new Nota2(2, "matematicas");
		alumno.removeNota(nota);
		assertFalse(alumno.getNotasLista().contains(nota));
		
		
	}
	@Test
	void alumnoCursoAptoTest() {
			
		List<Nota2> notas = listaNotasParaMedia();
		alumno.setNotasLista(notas);
		assertTrue(alumno.apruebaElCurso());
		
		
	}
	@Test
	void alumnoNotaMayorTest() {
			
		List<Nota2> notas = listaNotaMayor();
		alumno.setNotasLista(notas);
		assertEquals(new Nota2(10,"lengua"),alumno.notaMayor());
		
		
	}
	
	
	@Test
	void alumnosNotasSuspensas() {
			
		List<Nota2> notas = getListaNotasBasica();
		alumno.setNotasLista(notas);
		List<Nota2> notasSuspensas=alumno.suspensos();
		notasSuspensas.stream()
		.map(Nota2::getValor)
		.map((nota)->nota<5).forEach(Assertions::assertTrue);
		
	}
	
	
	/***************************/
	
	private List<Nota2> listaNotasParaMedia() {
		Nota2 nota=new Nota2(2, "matematias");
		Nota2 nota2= new Nota2(9, "lengua");
		Nota2 nota3= new Nota2(7, "lengua");
		List<Nota2> notas= new ArrayList<Nota2>();
	
		Collections.addAll(notas, nota,nota2,nota3);
		return notas;
	}
	
	private List<Nota2> listaNotaMayor() {
		Nota2 nota=new Nota2(2, "matematias");
		Nota2 nota2= new Nota2(9, "lengua");
		Nota2 nota3= new Nota2(7, "lengua");
		Nota2 nota4= new Nota2(9, "lengua");
		Nota2 nota5= new Nota2(10, "lengua");
		List<Nota2> notas= new ArrayList<Nota2>();
	
		Collections.addAll(notas, nota,nota2,nota3,nota4,nota5);
		return notas;
	}

	private List<Nota2> getListaNotasBasica() {
		notas= new ArrayList<Nota2>();
		Nota2 nota=new Nota2(2, "matematias");
		Nota2 nota2= new Nota2(3, "lengua");
		Nota2 nota3= new Nota2(0, "lengua");
		Nota2 nota4=new Nota2(7, "matematicas");
		Nota2 nota5= new Nota2(8, "ingles");
		Nota2 nota6= new Nota2(4, "fisica");
		
		Collections.addAll(notas, nota,nota2,nota3,nota4,nota5,nota6);
		return notas;
	}
}
