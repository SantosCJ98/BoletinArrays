package codigo;

import static teclado.Teclado.readInt;

public class Ej5 {
	
	//Crear un cuadrado (o rectangulo) mediante un array bidimensional. Sumar cada fila y cada columna por separado.

	public static void main(String[] args) {
		
		System.out.println("Introduce el número de filas");
		
		int x = readInt();
		
		System.out.println("Introduce el número de columnas");
		
		int y = readInt();
		
		int miarray [][] = new int[x][y];
		
		for(int i = 0; i < miarray.length; i++) {
			
			int sumafila = 0;
			
			int sumacol = 0;
			
			for(int j = 0; j < miarray[i].length; j++) {
				
				
				
				System.out.println("Fila: " + (i+1) + ", Columna: " +(j+1));
				
				miarray[i][j] = readInt();
				

				sumafila += miarray[i][j];
				
				sumacol += miarray[j][i];
				
				System.out.println("La columna " + (j+1) + " suma " + sumacol);
		
				
			}
			
			System.out.println("La fila " + (i+1) + " suma " + sumafila);
			
			
			
			
		}

	}
		
		

}
