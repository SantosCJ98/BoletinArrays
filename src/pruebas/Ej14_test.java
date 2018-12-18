package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej14.*;

class Ej14_test {

	@Test
	void test() {
		
		int [][] array = {{2, 7, 3}, {5, 1, 9}, {6, 7, 2}};
		
		assertFalse(esfilacapicua(array, 0));
		
		assertFalse(escolumnacapicua(array, 2));
		
		assertTrue(escolumnacapicua(array, 1));
		
		assertTrue(esdiagonalprincipalcapicua(array));
		
		assertFalse(esdiagonalsecundariacapicua(array));
		
	}

}
