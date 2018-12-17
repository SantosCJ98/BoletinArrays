package codigo;

import static teclado.Teclado.*;

//Pedir al usuario el número de valores. Rellenar el array con numeros del 0 al 9. Contar cuantas ocurrencias de cada numero hay en el array, y buscar el maximo. Hacer una columna con números del 0 al 9. Hacer columnas de espacios en blanco, tantos como indique el maximo. Colocar asteriscos

public class Ej10 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el número de valores");
		
		int n = readEqui(0, Equivalencias.MAYOR);
		
		int [] miarray = new int [n];
		
		rellenararray(miarray);
		
		mostrararray(miarray);
		
		System.out.println();
		
		histograma(miarray);
	
	}
	
	public static void rellenararray (int [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
			
			System.out.println("Introduce el valor nº " + (i+1));
			
			miarray[i] = readRange(0, 9, Rangos.AMBOSIN);
			
		}
		
	}
	
	public static void mostrararray (int [] miarray) {
		
		for (int i = 0; i < miarray.length; i++) {
				
				System.out.print(miarray[i] + "   ");
			
		}
		
		System.out.println();
		
	}
	
	public static void histograma (int [] miarray) {
		
		int cont0 = 0;
		
		int cont1 = 0;
		
		int cont2 = 0;
		
		int cont3 = 0;
		
		int cont4 = 0;
		
		int cont5 = 0;
		
		int cont6 = 0;
		
		int cont7 = 0;
		
		int cont8 = 0;
		
		int cont9 = 0;
		
		for (int i = 0; i < miarray.length; i++) {
			
			if (miarray[i] == 0) {
				
				cont0++;
				
			}
			
			else if (miarray[i] == 1) {
				
				cont1++;
				
			}
			
			else if (miarray[i] == 2) {
				
				cont2++;
				
			}
			
			else if (miarray[i] == 3) {
				
				cont3++;
				
			}
			
			else if (miarray[i] == 4) {
				
				cont4++;
				
			}
			
			else if (miarray[i] == 5) {
				
				cont5++;
				
			}
			
			else if (miarray[i] == 6) {
				
				cont6++;
				
			}
			
			else if (miarray[i] == 7) {
				
				cont7++;
				
			}
			
			else if (miarray[i] == 8) {
				
				cont8++;
				
			}
			
			else if (miarray[i] == 9) {
				
				cont9++;
				
			}
		}
		
		int contadores [] = {cont0, cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9};
		
		int maximo = contadores[0];
		
		for (int i = 0; i < contadores.length; i++) {
			
			if (maximo < contadores[i]) {
				
				maximo = contadores[i];
				
			}
			
		}
		
		for (int i = 0; i <= 9; i++) {
			
			System.out.print(i);
			
			for (int j = 0; j < maximo; j++) {
				
				if (contadores[i] > 0)
				
				System.out.print("  *");
				
				contadores[i]--;
				
			}
		
			
			System.out.println();
			
		}
		
	}
	


}


