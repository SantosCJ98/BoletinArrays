package codigo;

import static teclado.Teclado.*;

public class Ej6 {
	
 //Pedir al usuario el número de filas y columnas. Rellenar la matriz con números. Mostrar el resultado de la suma de cada fila y de cada columna.

	public static void main(String[] args) {
		
		System.out.println("¿Cuantas filas tiene el array?");
		
		int numfilas = readInt();
		
		System.out.println("¿Cuantas columnas?");
		
		int numcols = readInt();
		
		int miarray [][] = new int [numfilas][numcols];
		
		generararray(miarray, numfilas, numcols);
		
		mostrararray(miarray, numfilas, numcols);
		
		sumarfilas(miarray, numfilas, numcols);
		
		sumarcols(miarray, numfilas, numcols);
		
		

	}
	
	public static void generararray (int [][] miarray, int numfilas, int numcols) {
		
		for (int i = 0; i < numfilas; i++) {
			
			for (int j = 0; j < numcols; j++) {
				
				System.out.println("Introduce un numero en la fila " + (i+1) + ", columna " + (j+1));
				
				miarray[i][j] = readInt();
				
			}
			
		}
		
	}
	
	public static void mostrararray (int [][] miarray, int numfilas, int numcols) {
		
		for (int i = 0; i < numfilas; i++) {
			
			for (int j = 0; j < numcols; j++) {
				
				System.out.print(miarray[i][j] + "   ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void sumarfilas (int [][] miarray, int numfilas, int numcols) {
		
		for (int i = 0; i < numfilas; i++) {
			
			int sumafilas = 0;
			
			for (int j = 0; j < numcols; j++) {
				
				sumafilas += miarray[i][j];
				
			}
			
			System.out.println("La suma de la " + (i+1) + "ª fila es " + sumafilas);
			
		}
		
	}
	
	public static void sumarcols (int [][] miarray, int numfilas, int numcols) {
		
		for (int j = 0; j < numcols; j++) {
			
			int sumacols = 0;
			
			for (int i = 0; i < numfilas; i++) {
				
				sumacols += miarray[i][j];
				
			}
			
			System.out.println("La suma de la " + (j+1) + "ª columna es " + sumacols);
			
		}
		
	}

}
