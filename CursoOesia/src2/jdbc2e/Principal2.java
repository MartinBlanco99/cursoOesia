package jdbc2e;

import jdbc2e.repositories.IPersonaRepository;
import jdbc2e.repositories.jdbc.PersonaRepositoryJDBC;

public class Principal2 {

	public static void main(String[] args) {
		IPersonaRepository rp = new PersonaRepositoryJDBC();
		
		rp.calcularEdadMedia();
		
	}

}
