package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej12.*;

class Ej12_test {

	@Test
	void test() {
		
		int [] desordenado = {50, 26, 7, 9, 15, 27};
		
		int [] ordenado = {7, 9, 15, 26, 27, 50};
		
		assertTrue(comprobarburbuja(desordenado, ordenado));
		
		
		
	}

}
