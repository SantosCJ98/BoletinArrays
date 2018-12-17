package codigo;

import static teclado.Teclado.*;


//Pedir el número de filas y columnas por teclado. Rellenar el array con números. Dibujar el cuadrado. Si hay una fila que es igual a alguna columna, mostrar mensaje al usuario con la fila y la columna que son iguales.

public class Ej11 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de filas y columnas del cuadrado:");
		
		int n = readEqui(0, Equivalencias.MAYOR);
		
		int [][] miarray = new int [n][n];
		
		rellenararray(miarray);
		
		dibujarcuadrado(miarray);
	
		
		for (int i = 0; i < miarray.length; i++) {
			
			for (int j = 0; j < miarray[i].length; j++) {
				
				if (comprobarfilacolumnaigual(miarray, i, j) == true) {
					
					System.out.println("La " + (i+1) + "ª fila y la " + (j+1) + "ª columna son iguales");
					
				}
				
			}
			
		}
		

	}
	
	public static void rellenararray (int [][] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			for (int j = 0; j < miarray[i].length; j++) {
				
				System.out.print("Fila " + (i+1) + ", Columna: " + (j+1) + ": ");
				
				miarray[i][j] = readInt();
				
			}
			
		}
		
	}
	
public static void dibujarcuadrado (int [][] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			for (int j = 0; j < miarray[i].length; j++) {
				
				System.out.print(miarray[i][j] + "   ");
				
			}
			
			System.out.println();
			
		}
		
	}

public static boolean comprobarfilacolumnaigual (int [][] miarray, int fila, int columna) {
	
	for (int i = 0; i < miarray.length; i++) {
		
		if (miarray[fila][i] != miarray[i][columna]) {
			
			return false;
			
		}
		
	}
	
	return true;
	
}
	

}
