package codigo;

import static teclado.Teclado.*;

//Pedir las filas y columnas por teclado. Rellenar el array con números. Dibujar el cuadrado. Tomar como referencia la suma de una fila o una columna. Si la suma de todas las filas, columnas y diagonales son iguales a esa referencia, el array es un cuadrado magico.

public class Ej13 {
		
		public static void main(String[] args) {
			
			System.out.println("Introduce el numero de filas y columnas del cuadrado:");
			
			int n = readEqui(0, Equivalencias.MAYOR);
			
			int [][] miarray = new int [n][n];
			
			rellenararray(miarray);
			
			dibujarcuadrado(miarray);
			
			if (escuadradomagico(miarray, n, n)) {
				
				System.out.println("Es un cuadrado magico");
				
			}
			
			else {
				
				System.out.println("No es un cuadrado mágico");
				
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

public static int resultadosuma (int [][] miarray) {
	
	int suma=0;
	
	for (int i = 0; i < miarray.length; i++) {
		
		suma += miarray[i][0];
		
	}
	
	return suma;
	
}

public static boolean filassumanigual (int [][] miarray, int filas, int columnas) {
	
	for (int i = 0; i < filas; i++) {
		
		int sumafilas = 0;
		
		for (int j = 0; j < columnas; j++) {
			
			sumafilas += miarray[i][j];
			
		}
		
		if (sumafilas != resultadosuma(miarray)) {
			
			return false;
			
		}
		
	}
	
	return true;
	
}

public static boolean columnassumanigual (int [][] miarray, int filas, int columnas) {
	
	for (int j = 0; j < columnas; j++) {
		
		int sumacols = 0;
		
		for (int i = 0; i < filas; i++) {
			
			sumacols += miarray[j][i];
			
		}
		
		if (sumacols != resultadosuma(miarray)) {
			
			return false;
			
		}
		
	}
	
	return true;
	
}

	public static boolean diagonalessumanigual (int [][] miarray) {
	
		
		int sumaprimeradiagonal = 0;
		
		int sumasegundadiagonal = 0;
		
		for (int i = 0; i < miarray.length; i++) {
			
			sumaprimeradiagonal += miarray[i][i];
		};
		
		for (int i = 0, j = miarray.length-1; i < miarray.length; i++, j--) {
			
			sumasegundadiagonal += miarray[i][j];
			
		}
		
		if (sumaprimeradiagonal == resultadosuma(miarray) && sumasegundadiagonal == resultadosuma(miarray) && sumaprimeradiagonal == sumasegundadiagonal) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
		
	
}
	
	public static boolean escuadradomagico (int [][] miarray, int filas, int columnas) {
		
		if ((filassumanigual(miarray, filas, columnas) == columnassumanigual(miarray, filas, columnas)) == diagonalessumanigual(miarray)) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}
	
}
