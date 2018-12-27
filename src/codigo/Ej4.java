package codigo;

import static teclado.Teclado.*;

import java.util.Arrays;

//Crear un array de caracteres, dejando un indice vacío. Pedir al usuario en que posición quiere insertar ese último caracter.
//Si lo inserta en un indice que ya tiene un caracter, desplazar los demas caracteres de manera que pueda ser colocado y noç
//reemplazar ninguno.

public class Ej4 {

	public static void main(String[] args) {

		// Declarar array e inicializar un array con 4 caracteres (dejar uno libre)

		char miarray[] = { 'a', 'b', 'c', 'd', ' ' };

		// Mostrar array

		mostrararray(miarray);

		System.out.println();

		// Pedir caracter

		System.out.println("Introduce el caracter");

		char c = readChar();

		// Pedir posicion (entre 1 y 5)

		System.out.println("Elige posicion");

		int n = readRange(1, 5, Rangos.AMBOSIN);

		// Mostrar array resultante

		mostrararray(asignarposicion(n, miarray, c));

	}

	// Funcion que muestra el array

	public static void mostrararray(char[] miarray) {

		for (int i = 0; i < miarray.length; i++) {

			System.out.print(miarray[i] + " ");

		}

	}

	// Funcion que coloca el caracter en la posicion deseada.

	public static char[] asignarposicion(int n, char[] miarray, char c) {

		for (int i = miarray.length - 1; i >= 0; i--) {

			// Si la posicion es 5, colocar en 5. Si la posicion esta ocupada,
			// desplazar los
			// demás caracteres y colocarlo en el
			// nuevo sitio libro.

			if (i >= n) {

				miarray[i] = miarray[i - 1];

			}

			else if (i == n - 1) {

				miarray[i] = c;

			}

		}

		return miarray;

	}
	
	//Función que comprueba si la asignacion ha sido exitosa.

	public static boolean comprobarresultado(int n, char[] miarray, char[] movido, char c) {

		if (Arrays.equals(movido, asignarposicion(n, miarray, c))) {

			return true;

		}

		else {

			return false;

		}

	}

}
