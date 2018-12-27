package codigo;

import java.util.Arrays;

//Crear un array de tres dimensiones. Recorrer el array en busca del elemento más grande y mostrar su posición en el array.

public class Ej7 {

	public static void main(String[] args) {

		// Declarar e iniciar array.

		double miarray[][][] = { { { 1, 4, 2 }, { 9, 2, 3 }, { 3, 2, 1 }, { 2, 10, 3 } },
				{ { 9, 2, 1 }, { 1, 2, 9 }, { 50, 30, 12 }, { 0, 0, 0 } } };

		// Determinar y mostrar mayor elemento.

		mayorelemento(miarray);

		System.out.printf("El mayor elemento es %.2f ", mayorelemento(miarray));

		System.out.println();

		// Mostrar posicion en la que se encuentra el mayor elemento.

		mostrararray(posiciones(miarray));
	}

	// Función que determina el mayor elemento del array

	public static double mayorelemento(double[][][] miarray) {

		double maximo = miarray[0][0][0];

		int pos1 = 0, pos2 = 0, pos3 = 0;

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				for (int k = 0; k < miarray[i][j].length; k++) {

					if (maximo < miarray[i][j][k]) {

						maximo = miarray[i][j][k];

						pos1 = i;

						pos2 = j;

						pos3 = k;

					}

				}

			}

		}

		return maximo;

	}

	// Funcion que busca la posicion del mayor elemento del array

	public static int[] posiciones(double[][][] miarray) {

		double maximo = miarray[0][0][0];

		int[] posiciones = new int[3];

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				for (int k = 0; k < miarray[i][j].length; k++) {

					if (maximo < miarray[i][j][k]) {

						maximo = miarray[i][j][k];

						posiciones[0] = i;

						posiciones[1] = j;

						posiciones[2] = k;

					}

				}

			}

		}

		return posiciones;

	}

	// Funcion que muestra el array

	public static void mostrararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + "  ");
		}

	}

	// Funcion que comprueba las posiciones.

	public static boolean comprobarposicion(int[] miarray, int[] miarray2) {

		if (Arrays.equals(miarray, miarray2)) {

			return true;

		}

		else {

			return false;

		}

	}

}
