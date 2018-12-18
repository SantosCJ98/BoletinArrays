package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej7.*;

class Ej7_test {
	
	@Test
	void test() {
		
		double miarray [][][] = { { {1,100,2}, {9,2,3}, {3,2,1}, {2,10,3}}, {{9,2,1}, {1,2,9}, {50,30,12}, {0, 0, 0} }};	
		
		int posiciones [] = {0, 0, 1};
		
		assertEquals(100, mayorelemento(miarray));
		
		assertTrue(comprobarposicion(posiciones, posiciones(miarray)));
		
	}

}
