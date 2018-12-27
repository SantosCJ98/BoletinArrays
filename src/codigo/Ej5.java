package codigo;

import static teclado.Teclado.*;

import java.util.Arrays;

import java.util.ArrayList;

//Crear un array de numeros. Pedir la longitud del array, y un numero para contar las veces que aparece. Informar al usuario
//en que indices aparece.

public class Ej5 {

	public static void main(String[] args) {

		// Pedir longitud del array (debe ser mayor a 0)

		System.out.println("Introduce la longitud del array:");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Pedir el numero a buscar.

		System.out.println("¿Qué numero vas a buscar?");

		int buscar = readInt();

		// Declarar array

		int miarray[] = new int[n];

		// Rellenar array

		rellenararray(miarray);

		// Mostrar array

		mostrararray(miarray);

		System.out.println();

		// Mostrar cuantas veces aparece el número en el array.

		System.out.println("El " + buscar + " aparece " + contador(miarray, buscar) + " veces.");

		// Mostrar las posiciones en las que aparece.

		System.out.println("Aparece en las siguientes posiciones: ");

		mostrararray(posicionesarray(posiciones(miarray, buscar)));

	}

	// Funcion que cuenta las veces que aparece un número en el array

	public static int contador(int[] miarray, int buscar) {

		int contador = 0;

		for (int i = 0; i < miarray.length; i++) {

			if (miarray[i] == buscar) {

				contador++;

			}

		}

		return contador;

	}

	// Funcion que muestra las posiciones en las que aparece un número en el array

	public static ArrayList<Integer> posiciones(int[] miarray, int buscar) {

		ArrayList<Integer> posiciones = new ArrayList<Integer>();

		for (int i = 0; i < miarray.length; i++) {

			if (buscar == miarray[i]) {

				posiciones.add(i);

			}

		}

		return posiciones;

	}

	// Convertir ArrayList en array

	public static int[] posicionesarray(ArrayList<Integer> posiciones) {

		int[] miarray = new int[posiciones.size()];

		for (int i = 0; i < miarray.length; i++) {

			miarray[i] = posiciones.get(i);

		}

		return miarray;

	}

	// Funcion que rellena el array

	public static void rellenararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.println("Introduce el " + (i + 1) + "º número:");

			miarray[i] = readInt();

		}

	}

	// Funcion que muestra el array

	public static void mostrararray(int miarray[]) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + " ");

		}

	}

	// Funcion que comprueba si los indices son correctos.

	public static boolean comprobarindices(int[] miarray, int[] posiciones) {

		if (Arrays.equals(miarray, posiciones)) {

			return true;

		}

		else {

			return false;
		}

	}

}
