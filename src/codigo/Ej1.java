package codigo;

import static teclado.Teclado.*;

//Pedir un numero por teclado, que sera el tamaño del array. A continuación, se pedira al usuario que introduzca un número (el cual se
//introducira a su vez en el array) y la accion se repetira hasta que se introduzcan tantos numeros como de grande sea el array.
//Sumar todos los numeros y mostrar el resultado.

public class Ej1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la longitud del array:");
		
		int n = readInt();
		
		System.out.println("El resultado es: " + sumaarray(n));

	}
	
	public static int sumaarray (int n) {
		
		int suma = 0;
		
		int miarray [] = new int [n];
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Introduce el " + (i + 1) + "º número:");
			
			miarray[i] = readInt();
			
			suma += miarray[i];
			
		}
		
		return suma;
		
	}

}
