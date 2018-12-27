package codigo;

import static teclado.Teclado.*;

import java.util.Arrays;

//Pedir las filas y columnas por teclado. Rellenar el array con números. Si el número del indice actual es mayor que el siguiente, cambiarlos de sitio, hasta que el array este ordenado de menor a mayor.

public class Ej12 {

	public static void main(String[] args) {

		// Pedir longitud del array (debe ser mayor a 0)

		System.out.println("Introduce el numero de valores:");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Declarar array

		int[] miarray = new int[n];

		// Rellenar array

		rellenararray(miarray);

		System.out.println();

		System.out.println("Array original:");

		// Mostrar array

		mostrararray(miarray);

		// Ordenar array

		burbuja(miarray);

		System.out.println();

		// Mostrar array ordenado

		System.out.println("Array ordenado:");

		mostrararray(miarray);

	}

	// Funcion que rellena el array

	public static void rellenararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print("Valor nº " + (i + 1) + ": ");

			miarray[i] = readInt();

		}

	}

	// Funcion que muestra el array

	public static void mostrararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + "   ");

		}

	}

	// Función que ordena el array

	public static int[] burbuja(int[] miarray) {

		for (int i = 0; i < miarray.length - 1; i++) {

			for (int j = i + 1; j < miarray.length; j++) {

				if (miarray[j] < miarray[i]) {

					int aux = miarray[j];

					miarray[j] = miarray[i];

					miarray[i] = aux;

				}

			}

		}

		return miarray;

	}

	// Funcion que comprueba si el array esta ordenado

	public static boolean comprobarburbuja(int[] desordenado, int[] ordenado) {

		if (Arrays.equals(ordenado, burbuja(desordenado))) {

			return true;

		}

		else {

			return false;

		}

	}

}
