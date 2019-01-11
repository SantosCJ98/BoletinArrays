package codigo;

import static teclado.Teclado.*;

import static arrays.Arrays.mostrararray;

public class Ej10 {

	// Pedir los numeros por teclado (deben ser menores o igual a 9), hasta que se
	// introduzca un número negativo.
	// Encontrar el máximo numero de ocurrencias de un numero.
	// Crear tantas filas como numero maximo de ocurrencias haya.
	// Crear 10 columnas.
	// Colocar asteriscos.

	public static void main(String[] args) {

		histograma(rellenararray());

	}

	public static int[] rellenararray() {

		int num;

		int[] miarray = new int[10];

		num = readEqui(9, Equivalencias.MENORIGUAL);

		do {

			miarray[num]++;

			num = readEqui(9, Equivalencias.MENORIGUAL);

		} while (num >= 0);

		return miarray;
	}

	public static int maximoarray(int[] miarray) {

		int maximo = Integer.MIN_VALUE;

		for (int i = 0; i < miarray.length; i++) {

			if (miarray[i] > maximo) {

				maximo = miarray[i];

			}

		}

		return maximo;
	}

	public static void histograma(int[] miarray) {

		for (int i = maximoarray(miarray); i >= 0; i--) {

			for (int j = 0; j <= 9; j++) {

				if (miarray[j] == i && i != 0) {

					System.out.print("*   ");

					miarray[j]--;

				} else if (i != 0) {

					System.out.print("    ");
				}
				if (i == 0) {

					System.out.print(j + "   ");
				}

			}
			System.out.println();
		}
	}

}
