package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej4.comprobarresultado;

class Ej4_test {

	@Test
	void test() {
	
		char [] array = {'a','b','c','d',' '};
		
		char [] movido = {'a','b','*','c','d'};
		
		assertTrue(comprobarresultado(3, array, movido, '*'));
		
		assertFalse(comprobarresultado(1, array, movido, '*'));
		
		
	
	
	}

}
