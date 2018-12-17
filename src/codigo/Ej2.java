package codigo;

import static teclado.Teclado.*;

//Pedir un numero por teclado, que sera el tamaño del array. A continuación, se pedira al usuario que introduzca unos valores, que se
//meteran en un array. Una vez construido ese array, se hara otro array, pero invertido. Mostrar los dos arrays.

public class Ej2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el número de parámetros:");
		
		int n = readRange(0, Equivalencias.MAYOR);
		
		String miarray [] = new String [n];
		
		introducirarray(miarray);
		
		array(miarray);
		
		arrayinvertido(miarray);
		
		
		
		
		
	
		

	}
	
	public static void introducirarray (String miarray []) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Introduce el parametro nº " + (i + 1));
			
			miarray[i] = readString();
			
		}
		
	}
	
	public static void array (String miarray[]) {
		
		System.out.print("El array resultante es: ");
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + " ");
			
			
		}
		
		System.out.println();
		
	}
	


	public static void arrayinvertido (String miarray[]) {
		
	System.out.print("El array invertido es: ");
		
		for (int i = miarray.length-1; i >= 0; i--) {
			
			System.out.print(miarray[i] + " ");
			
			
		}
		
	}
	
}
		
	
