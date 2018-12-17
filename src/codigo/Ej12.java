package codigo;

import static teclado.Teclado.*;

//Pedir las filas y columnas por teclado. Rellenar el array con números. Si el número del indice actual es mayor que el siguiente, cambiarlos de sitio, hasta que el array este ordenado de menor a mayor.

public class Ej12 {

	public static void main(String[] args) {
	
		System.out.println("Introduce el numero de valores:");
		
		int n = readEqui(0, Equivalencias.MAYOR);
		
		int [] miarray = new int [n];
		
		rellenararray(miarray);
		
		System.out.println();
		
		System.out.println("Array original:");
		
		mostrararray(miarray);
		
		burbuja(miarray);
		
		System.out.println();
		
		System.out.println("Array ordenado:");
		
		mostrararray(miarray);
		
	}
		
		public static void rellenararray (int [] miarray) {
			
			for (int i = 0; i < miarray.length; i++) {
					
					System.out.print("Valor nº " + (i+1) +": ");
					
					miarray[i] = readInt();
					
				}
				
			}

	

public static void mostrararray (int [] miarray) {
	
	for (int i = 0; i < miarray.length; i++) {
			
			System.out.print(miarray[i] + "   ");
			
		}
		
	}

public static void burbuja (int [] miarray) {
	
	for (int i = 0; i < miarray.length - 1; i++) {
			
			for (int j = i + 1; j < miarray.length; j++) {
				
				if (miarray[j] < miarray[i]) {
					
					int aux = miarray[j];
					
					miarray[j] = miarray[i];
					
					miarray[i] = aux;
					
				
				}
				
			}
			
		}
		
	}
	
}
