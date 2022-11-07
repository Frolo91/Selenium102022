package ejemplos;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		
		
		int resultado = suma (55,66); // llamo al metodo 
		System.out.print(resultado);

	}
	public static int suma(int a, int b){// construyo el metodo 
		
		int c = a+b;
		return c;// retorno el resultado 
		
	}

}
