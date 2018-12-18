package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej2.comprobarinvertido;

class Ej2_test {

	@Test
	void test() {
	
		String [] array = {"Hola", "que", "tal", "10"};
		
		String [] array2 = {"10", "tal", "que", "Hola"};
		
		String [] array3 = {"10", "tal", "que", "q"};
		
		assertTrue(comprobarinvertido(array, array2));
		
		assertFalse(comprobarinvertido(array, array3));
	
	}

}
