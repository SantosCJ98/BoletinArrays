package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej9.*;

class Ej9_test {

	@Test
	void test() {
		int [][] miarray = {{1, 2 , 3 , 4}, {2, 5 , 6 , 7}, {3, 6 , 8 , 9}, {4, 7 , 9 , 10}};
		
		assertTrue(arraysimetrico(miarray));
		
	}

}
