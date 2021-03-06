package codigo;

import static teclado.Teclado.*;

//Pedir un numero por teclado, que sera el tamaño del array. A continuación, se pedira al usuario que introduzca un número (el cual se
//introducira a su vez en el array) y la accion se repetira hasta que se introduzcan tantos numeros como de grande sea el array.
//Sumar todos los numeros y mostrar el resultado.

public class Ej1 {

	public static void main(String[] args) {

		// Pedir longitud del array

		System.out.println("Introduce la longitud del array:");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Declarar array

		int miarray[] = new int[n];

		// Rellenar array

		rellenararray(miarray);

		// Mostrar resultado

		System.out.println("El resultado es: " + sumaarray(miarray));

	}

	// Función que suma los valores del array

	public static int sumaarray(int[] miarray) {

		int suma = 0;

		for (int i = 0; i < miarray.length; i++) {

			suma += miarray[i];

		}

		return suma;

	}

	// Funcion que rellena el array

	public static int[] rellenararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.println("Introduce el valor " + (i + 1));

			miarray[i] = readInt();

		}

		return miarray;

	}

}
