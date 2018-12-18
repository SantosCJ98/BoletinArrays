package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej4.comprobarresultado;

class Ej4_test {

	@Test
	void test() {
	
		char [] array = {'a','b','c','d',' '};
		
		assertTrue(comprobarresultado(1, array, '*'));
		
		assertTrue(comprobarresultado(2, array, '*'));
		
		assertTrue(comprobarresultado(3, array, '*'));
		
		assertTrue(comprobarresultado(4, array, '*'));
		
		assertTrue(comprobarresultado(5, array, '*'));
	
	}

}
