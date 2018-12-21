package codigo;

import static teclado.Teclado.*;

import teclado.Teclado.Equivalencias;

//Pedir el area del array por teclado. Rellenar con numeros. Mostrar el cuadrado. Comprobar si es simetrico. Para ello, el valor de la fila i y la columna j debe ser igual al valor de la fila j y la columna i (para todo el array)
public class Ej9 {

	public static void main(String[] args) {

		System.out.println("Introduce el numero de filas y columnas del cuadrado:");

		int n = readEqui(0, Equivalencias.MAYOR);

		int[][] miarray = new int[n][n];

		rellenararray(miarray);

		dibujarcuadrado(miarray);

		if (arraysimetrico(miarray)) {

			System.out.println("El array es simétrico");

		}

		else {

			System.out.println("El array no es simétrico");

		}

	}

	public static void rellenararray(int[][] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				System.out.print("Fila " + (i + 1) + ", Columna: " + (j + 1) + ": ");

				miarray[i][j] = readInt();

			}

		}

	}

	public static void dibujarcuadrado(int[][] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				System.out.print(miarray[i][j] + "   ");

			}

			System.out.println();

		}

	}

	public static boolean arraysimetrico(int[][] miarray) {

		int i = 0, j = 0;

		boolean simetrico = true;

		while (i < miarray.length && simetrico) {

			while (j < miarray[i].length && simetrico) {

				if (miarray[i][j] != miarray[j][i]) {

					simetrico = false;

				}

				j++;

			}

			i++;

		}

		return simetrico;

	}

}