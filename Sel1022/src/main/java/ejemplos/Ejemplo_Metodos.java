package ejemplos;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		
		
		int resultado = suma (55,66); // llamo al metodo 
		System.out.println(resultado);
		
		int resultado2 = suma (2,2,9); // llamo al metodo sobrecargado
		System.out.print(resultado2);

	}
	public static int suma(int a, int b){// construyo el metodo 
		
		int c = a+b;
		return c;// retorno el resultado 
		
	}
	
	public static int suma(int a, int b,int c){// construyo el metodo sobrecargado de diferentes parametros
		
		int d = a +b +c; 
		return d; 
	}
	

}
