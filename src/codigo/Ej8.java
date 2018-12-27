package codigo;

//Crear un array de tres dimensiones. Copiar el array en otro más grande y rellenar de ceros los espacios sobrantes.
public class Ej8 {

	public static void main(String[] args) {

		// Declarar e inicializar array.

		int miarray[][][] = { { { 1, 4, 2 }, { 9, 2, 3 }, { 3, 2, 1 }, { 2, 10, 3 } },
				{ { 9, 2, 1 }, { 1, 2, 9 }, { 50, 30, 12 }, { 5, 9, 6 } } };

		// Declarar array mas grande

		int array2[][][] = new int[2][4][4];

		// Mostrar 1er array

		System.out.println("El array original es:");

		mostrararray(miarray);

		System.out.println();

		System.out.println("Vamos a copiar este array en otro cuya tercera dimension es una unidad más grande...");

		// Copiar elementos del primer array al segundo

		copiararray(miarray, array2);

		System.out.println("Resultado: ");

		// Mostrar segundo array

		mostrararray(array2);

	}

	// Funcion para copiar arrays.

	public static void copiararray(int[][][] miarray, int[][][] array2) {

		for (int i = 0; i < array2.length; i++) {

			for (int j = 0; j < array2[i].length; j++) {

				for (int k = 0; k < array2[i][j].length; k++) {

					if (i < miarray.length && j < miarray[i].length && k < miarray[i][j].length) {

						array2[i][j][k] = miarray[i][j][k];

					}

					// Si una dimension es mas grande, rellenarla con ceros.

					else if (i >= miarray.length || j >= miarray[i].length || k >= miarray[i][j].length) {

						array2[i][j][k] = 0;

					}

				}

			}

		}

	}

	// Funcion que muestra el array

	public static void mostrararray(int[][][] array2) {

		for (int i = 0; i < array2.length; i++) {

			for (int j = 0; j < array2[i].length; j++) {

				for (int k = 0; k < array2[i][j].length; k++) {

					System.out.print(array2[i][j][k] + "  ");

				}

			}

		}

	}

}
