package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej13.*;

class Ej13_test {

	@Test
	void test() {
		
		int [][] cuadrado = {{4, 15, 14, 1}, {9, 6, 7, 12}, {5, 10, 11, 8}, {16, 3, 2, 13}};
		
		assertTrue(escuadradomagico(cuadrado, cuadrado.length, cuadrado[cuadrado.length-1].length));
		
	}

}
