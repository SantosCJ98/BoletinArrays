package codigo;

import static teclado.Teclado.*;

import teclado.Teclado.Equivalencias;

//Pedir por teclado el area del cuadrado. Rellenar el array con números del 0 al 9. Dibujar el cuadrado. Comprobar si hay filas capicuas y decir cuales son. Comprobar si hay columnas capicuas y decir cuales son. Comprobar si hay diagonales capicuas y decir cuales son. Repetir hasta que el usuario salga.

public class Ej14 {

	public static void main(String[] args) {

		boolean salir = false;

		do {

			// Pedir longitud del array (debe ser mayor a 0)

			System.out.println("Introduce el área del cuadrado (número de filas y columnas):");

			int n = readEqui(0, Equivalencias.MAYOR);

			// Declarar array

			int[][] miarray = new int[n][n];

			// Rellenar array

			rellenararray(miarray);

			// Mostrar array

			dibujarcuadrado(miarray);

			// Comprobar si hay filas, columnas, y diagonales capicuas.

			for (int i = 0; i < miarray.length; i++) {

				if (esfilacapicua(miarray, i)) {

					System.out.println("La fila " + (i + 1) + " es capicua.");

				}

			}

			for (int j = 0; j < miarray[miarray.length - 1].length; j++) {

				if (escolumnacapicua(miarray, j)) {

					System.out.println("La columna " + (j + 1) + " es capicua.");

				}

			}

			if (esdiagonalprincipalcapicua(miarray)) {

				System.out.println("La diagonal principal es capicua.");

			}

			if (esdiagonalsecundariacapicua(miarray)) {

				System.out.println("La diagonal secundaria es capicua.");

			}

			// Preguntar si el usuario quiere salir o hacer otra prueba.

			salir = readBoolean("¿Quieres salir del programa?");

		} while (salir == false);

	}

	// Funcion que rellena el array

	public static void rellenararray(int[][] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			for (int j = 0; j < miarray[i].length; j++) {

				System.out.print("Fila " + (i + 1) + ", Columna: " + (j + 1) + ": ");

				miarray[i][j] = readRange(0, 9, Rangos.AMBOSIN);

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

	// Funcion que comprueba si una columna es capicua.

	public static boolean escolumnacapicua(int[][] miarray, int columna) {

		boolean capicua = true;

		int ultimoindice = miarray.length - 1;

		int i = 0;

		while (i <= ultimoindice && capicua == true) {

			if (miarray[i][columna] != miarray[ultimoindice][columna]) {

				capicua = false;

			}

			else {

				i++;

				ultimoindice--;
			}

		}

		return capicua;

	}

	// Funcion que comprueba si una fila es capicua

	public static boolean esfilacapicua(int[][] miarray, int fila) {

		boolean capicua = true;

		int ultimoindice = miarray.length - 1;

		int j = 0;

		while (j <= ultimoindice && capicua == true) {

			if (miarray[fila][j] != miarray[fila][ultimoindice]) {

				capicua = false;

			}

			else {

				j++;

				ultimoindice--;
			}

		}

		return capicua;

	}

	// Funcion que comprueba si la diagonal principal es capicua

	public static boolean esdiagonalprincipalcapicua(int[][] miarray) {

		boolean capicua = true;

		int ultimoindice = miarray.length - 1;

		int i = 0;

		while (i <= ultimoindice && capicua == true) {

			if (miarray[i][i] != miarray[ultimoindice][ultimoindice]) {

				capicua = false;

			}

			else {

				i++;

				ultimoindice--;
			}

		}

		return capicua;

	}
	
	// Funcion que comprueba si la diagonal secundaria es capicua
	
	public static boolean esdiagonalsecundariacapicua(int[][] miarray) {

		boolean capicua = true;

		int ultimoindice2 = miarray.length - 1;

		int ultimoindice = 0;

		int i = miarray.length - 1;

		int j = 0;

		while (i >= ultimoindice && capicua == true) {

			if (miarray[i][j] != miarray[ultimoindice][ultimoindice2]) {

				capicua = false;

			}

			else {

				i--;

				ultimoindice++;

				j++;

				ultimoindice--;
			}

		}

		return capicua;

	}

}
