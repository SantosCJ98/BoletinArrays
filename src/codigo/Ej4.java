package codigo;

import static teclado.Teclado.*;

//Crear un array de numeros. Pedir la longitud del array, y un numero para contar las veces que aparece. Informar al usuario
//en que indices aparece.

public class Ej4 {

	public static void main(String[] args) {
		
		System.out.println("Introduce la longitud del array:");
		
		int n = readRange(0, Equivalencias.MAYOR);
		
		System.out.println("¿Qué numero vas a buscar?");
		
		int buscar = readInt();
		
		int miarray [] = new int [n];
		
		buscararray(n, miarray, buscar);
		
	}
	
	
		
		public static void buscararray (int n, int [] miarray, int buscar) {
			
			String posiciones="";
			
			int contador = 0;
			
			for (int i = 0; i < miarray.length; i++) {
				
				System.out.println("Introduce el " + (i + 1) + "º número:");
				
				miarray[i] = readInt();
				
				if (miarray[i] == buscar) {
					
					contador++;
					
					posiciones = posiciones.concat(String.valueOf(i) + " ");
					
				}
				
			}
			
			array(miarray);
			
			System.out.println("El número " + buscar + " aparece " + contador + " veces");
			
			System.out.println("Las posiciones que contienen el valor " + buscar + " son: " + posiciones);
			
		}
		
		public static void array (int miarray[]) {
			
			System.out.print("El array resultante es: ");
			
			for (int i = 0; i < miarray.length; i++) {
				
				System.out.print(miarray[i] + " ");
				
				
			}
			
			System.out.println();
			
		}

}
