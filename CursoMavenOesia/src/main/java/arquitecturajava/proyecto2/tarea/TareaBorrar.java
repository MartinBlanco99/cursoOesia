package arquitecturajava.proyecto2.tarea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TareaBorrar implements Runnable {
	
	private Thread tareaAnterior;
	
	

	public TareaBorrar(Thread tareaAnterior) {
		super();
		this.tareaAnterior = tareaAnterior;
	
	}



	@Override
	public void run() {
		String fileName = "inicio/hola.txt";

		try {
			tareaAnterior.join();
			Files.delete(Paths.get(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
