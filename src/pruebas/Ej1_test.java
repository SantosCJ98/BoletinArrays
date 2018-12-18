package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static codigo.Ej1.sumaarray;


class Ej1_test {

	@Test
	void suma() {
		
		int [] miarray = {1, -5, 13};
		
		int [] miarray2 = {9, -3, 7};
		
		assertEquals(9, sumaarray(miarray));
		
		assertEquals(13, sumaarray(miarray2));
		
		
		
	}

}
