package codigo;

public class Ej3_x {

	// Demostrar que los array por referencia cambian.
	// Demostrar que los array por valor no cambian.

	public static void main(String[] args) {

		int[] miarray = { 5 };

		if (miarray[0] != referencia(miarray)[0]) {

			System.out.println("Las referencias cambian");

		}

		if (miarray[0] == valor(3, miarray)[0]) {

			System.out.println("Los valores no");

		}

	}

	public static int[] referencia(int[] miarray) {

		miarray[0] = 3;

		return miarray;

	}

	public static int[] valor(int valor, int[] miarray) {

		miarray[0] = valor;

		return miarray;

	}

}
