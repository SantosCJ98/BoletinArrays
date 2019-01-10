package codigo;

import static teclado.Teclado.*;

//Pedir al usuario el número de valores. Rellenar el array con numeros del 0 al 9. Contar cuantas ocurrencias de cada numero hay en el array, y buscar el maximo. Hacer una columna con números del 0 al 9. Hacer columnas de espacios en blanco, tantos como indique el maximo. Colocar asteriscos

public class Ej10 {

	public static void main(String[] args) {

		// Pedir longitud del array (debe ser mayor a 0)

		System.out.println("Introduce el número de valores");

		int n = readEqui(0, Equivalencias.MAYOR);

		// Declarar array

		int[] miarray = new int[n];

		// Rellenar array

		rellenararray(miarray);

		// Mostrar array

		mostrararray(miarray);

		System.out.println();

		// Dibujar histograma

		histograma(miarray);

	}

	// Funcion que rellena el array

	public static void rellenararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.println("Introduce el valor nº " + (i + 1));

			miarray[i] = readRange(0, 9, Rangos.AMBOSIN);

		}

	}

	// Funcion que muestra el array

	public static void mostrararray(int[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + "   ");

		}

		System.out.println();

	}

	// Función que dibuja el histograma

	public static void histograma(int[] miarray) {
		
		int [] contadores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		for (int i = 0; i < miarray.length; i++) {

			switch (miarray[i]) {
			
			case 0: contadores[0]++;
			break;
			
			case 1: contadores[1]++;
			break;
			
			case 2: contadores[2]++;
			break;
			
			case 3: contadores[3]++;
			break;
			
			case 4: contadores[4]++;
			break;
			
			case 5: contadores[5]++;
			break;
			
			case 6: contadores[6]++;
			break;
			
			case 7: contadores[7]++;
			break;
			
			case 8: contadores[8]++;
			break;
			
			case 9: contadores[9]++;
			break;
			
			}

			
		}

	
		int maximo = contadores[0];

		for (int i = 0; i < contadores.length; i++) {

			if (maximo < contadores[i]) {

				maximo = contadores[i];

			}

		}

		for (int i = 0; i <= 9; i++) {

			System.out.print(i);

			for (int j = 0; j < maximo; j++) {

				if (contadores[i] > 0)

					System.out.print("  *");

				contadores[i]--;

			}

			System.out.println();

		}

	}

}
