package codigo;

//Crear un array de tres dimensiones. Recorrer el array en busca del elemento más grande y mostrar su posición en el array.

public class Ej7 {

	public static void main(String[] args) {
		double miarray [][][] = { { {1,4,2}, {9,2,3}, {3,2,1}, {2,10,3}}, {{9,2,1}, {1,2,9}, {50,30,12}, {0, 0, 0} }};
		
		 mayorelemento(miarray);
		 
	}
	

	
	public static void mayorelemento (double [][][] miarray) {
		
		double maximo = miarray[0][0][0];
		
		int pos1 = 0, pos2 = 0, pos3 = 0;
		
		for (int i = 0; i < miarray.length; i++) {
			
			for (int j = 0; j < miarray[i].length; j++) {
				
				for (int k = 0; k < miarray[i][j].length; k++) {
					
					if (maximo < miarray[i][j][k]) {
						
						maximo = miarray[i][j][k];
						
						pos1 = i;
						
						pos2 = j;
						
						pos3 = k;
						
					}
					
				}
				
			}
			
		}
		
		System.out.printf("El valor máximo es %.2f (%d, %d, %d)", maximo, pos1, pos2, pos3);
	
	}
	
	
	
}
