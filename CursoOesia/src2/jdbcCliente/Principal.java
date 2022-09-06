package jdbcCliente;

import java.util.List;

import jdbcCliente.models.Cliente;
import jdbcCliente.repositories.ClienteRepository;

public class Principal {

	public static void main(String[] args) {

		ClienteRepository repoCliente = new ClienteRepository();

		List<Cliente> lista = repoCliente.listarClientes();
		for (Cliente cliente : lista) {
			System.out.println(cliente.getDni());
			System.out.println(cliente.getNombre());
		}

		Cliente c1 = new Cliente(1, "manolo");
		repoCliente.insertar(c1);

		Cliente c2 = new Cliente(2, "jesus");
		repoCliente.insertar(c2);

		Cliente c3 = new Cliente(3, "sebastian");
		repoCliente.insertar(c3);

		Cliente c4 = new Cliente(4, "lola");
		repoCliente.insertar(c4);

		Cliente c5 = new Cliente(5, "angelines");
		repoCliente.insertar(c5);

		List<Cliente> listaClientes = repoCliente.listarClientes();
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getDni());
			System.out.println(cliente.getNombre());
		}

	}

}
