package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej5.*;

class Ej5_test {

	@Test
	void test() {
		
		int [] array = {2, 3, 0, 0, 1};
		
		int [] posiciones = {2, 3};
		
		assertEquals(2, contador(array, 0));
		
		assertEquals(1, contador(array, 1));
		
		assertEquals(0, contador(array, -2));
		
		assertTrue(comprobarindices(posiciones, posicionesarray(posiciones(array, 0))));
		
	}

}
