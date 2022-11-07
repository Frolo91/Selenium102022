package ejemplos;

public class Ejmeplo_Arreglo2D {

	public static void main(String[] args) {
		int arr[][]= {{2,7,9},{3,6,1,7,9},{4,5,8}};
		//System.out.println(arr[1][2]);
		
		for(int i = 0; i < 3; i++) {//Se situa en la fila que se va a aimprimir 
			for(int j = 0; j < 3; j++) {// imprime el que sigue 
				System.out.print(arr[i][j]+"");// print para la misma linea 
			}
			System.out.println();// Salto de linea 
		}
		System.out.println();// Salto de linea 
		
		
		// para diferente tamaños del arreglo 
		
		for(int i = 0; i < arr.length; i++) {//Se situa en la fila que se va a aimprimir 
			for(int j = 0; j < arr[i].length; j++) {// imprime el que sigue 
				System.out.print(arr[i][j]+"");// print para la misma linea 
			}
			System.out.println();// Salto de linea 
		}
		
		
	}

}
