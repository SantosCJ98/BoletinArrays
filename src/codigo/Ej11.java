package codigo;

import static teclado.Teclado.*;

//Pedir el número de filas y columnas por teclado. Rellenar el array con números. Dibujar el cuadrado. Si hay una fila que es igual a alguna columna, mostrar mensaje al usuario con la fila y la columna que son iguales.

public class Ej11 {

	public static void main(String[] args) {

		// Pedir longitud del array (debe ser mayor a 0)

		System.out.println("Introduce el numero de filas y columnas del cuadrado:");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Declarar array

		int[][] miarray = new int[n][n];

		// Rellenar array

		rellenararray(miarray);

		// Mostrar array

		dibujarcuadrado(miarray);

		// Comprobar si hay alguna fila igual a alguna columna y decir cuales.

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				if (comprobarfilacolumnaigual(miarray, i, j) == true) {

					System.out.println("La " + (i + 1) + "ª fila y la " + (j + 1) + "ª columna son iguales");

				}

			}

		}

	}

	// Funcion que rellena el array

	public static void rellenararray(int[][] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				System.out.print("Fila " + (i + 1) + ", Columna: " + (j + 1) + ": ");

				miarray[i][j] = readInt();

			}

		}

	}

	// Funcion que muestra el array

	public static void dibujarcuadrado(int[][] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				System.out.print(miarray[i][j] + "   ");

			}

			System.out.println();

		}

	}

	// Función que comprueba si alguna fila es igual a alguna columna

	public static boolean comprobarfilacolumnaigual(int[][] miarray, int fila, int columna) {

		for (int i = 0; i < miarray.length; i++) {

			if (miarray[fila][i] != miarray[i][columna]) {

				return false;

			}

		}

		return true;

	}

}
