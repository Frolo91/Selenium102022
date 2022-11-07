package ejemplos;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
	
		int intarray[];
		int [] intarray2;
		byte bytearray[];
		boolean booleArray[];
		
		// Declarar arreglos 
		String[] arr;
		
		// asignar valores al arreglo 
		arr = new String [5];
		
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cutro";
		
		
		//System.out.println("Elemento 2 "+ arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("el elemento en el indice "+i+":" + arr[i]);
			// Primero valida imprime y luego aumenta 
			
		}

	}

}
