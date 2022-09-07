package arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	public void areaRectangulo() {
		Rectangulo r = new Rectangulo(5, 10);
		assertEquals(50, r.area());
	}

	@Test
	public void perimetroRectangulo() {
		Rectangulo r = new Rectangulo(5, 10);
		assertEquals(30, r.perimetro());
	}

}
