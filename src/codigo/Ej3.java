package codigo;

import static teclado.Teclado.*;

//Crear un array de caracteres, dejando un indice vacío. Pedir al usuario en que posición quiere insertar ese último caracter.
//Si lo inserta en un indice que ya tiene un caracter, desplazar los demas caracteres de manera que pueda ser colocado y noç
//reemplazar ninguno.

public class Ej3 {

	public static void main(String[] args) {
			
		char miarray [] = {'a', 'b', 'c', 'd', ' '};
		
		mostrararray(miarray);
		
		System.out.println();
		
		System.out.println("Introduce el caracter");
		
		char c = readChar();
		
		System.out.println("Elige posicion");
		
		int n = readRange(1, 5, Rangos.AMBOSIN);
		
		asignarposicion(n, miarray, c);
		
	}
	
	public static void mostrararray (char [] miarray) {
		
	for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + " ");
		
	}
	
	}
	
	public static void asignarposicion (int n, char [] miarray, char c) {
		
		for (int i = miarray.length-1; i >= 0; i--) {
			
			if (i >= n) {
			
			miarray[i] = miarray[i-1];
			
			}
			
			else if (i == n - 1) {
				
				miarray[i] = c;
				
			}
			
		}
		
		mostrararray(miarray);
		
	}
		
	}