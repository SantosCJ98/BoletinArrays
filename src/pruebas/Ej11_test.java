package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej11.*;

class Ej11_test {

	@Test
	void test() {
		
		int [][] miarray = {{1, 2}, {2, 1}};
		
		assertTrue(comprobarfilacolumnaigual(miarray, 0, 0));
		
		assertTrue(comprobarfilacolumnaigual(miarray, 1, 1));
		
		assertFalse(comprobarfilacolumnaigual(miarray, 0, 1));
		
		assertFalse(comprobarfilacolumnaigual(miarray, 1, 0));
		
		
		
	}

}
