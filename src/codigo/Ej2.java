package codigo;

import static teclado.Teclado.*;

//Pedir un numero por teclado, que sera el tamaño del array. A continuación, se pedira al usuario que introduzca unos valores, que se
//meteran en un array. Una vez construido ese array, se hara otro array, pero invertido. Mostrar los dos arrays.

public class Ej2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el número de parámetros:");
		
		int n = readEqui(0, Equivalencias.MAYOR);
		
		String miarray [] = new String [n];
		
		introducirarray(miarray);
		
		System.out.println("El array introducido es: ");
		
		mostrararray(miarray);
		
		System.out.println("El array invertido es: ");
		
		mostrararray(arrayinvertido(miarray));
		
		
	
		

	}
	
	public static String [] introducirarray (String miarray []) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Introduce el parametro nº " + (i + 1));
			
			miarray[i] = readString();
			
		}
		
		return miarray;
		
	}
	
	public static void mostrararray (String miarray[]) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + " ");
			
			
		}
		
		System.out.println();
		
	}
	


	public static String [] arrayinvertido (String miarray[]) {
		
		for (int i = 0; i < miarray.length/2; i++) {
			
			String aux = miarray[i];
			
			miarray[i] = miarray[miarray.length -i - 1];
			
			miarray[miarray.length - i - 1] = aux;
					
			
		}
		
		return miarray;
		
	}
	
	
	public static boolean comprobarinvertido (String [] original, String [] invertido) {
	

	for (int i = 0, j = invertido.length-1; i < original.length && j >= 0; i++, j--) {
		
		if (original[i] != invertido[j]) {
			
			return false;
			
		}
		
	}
	
	return true;
	
}
	
}
		
	
