package ejemplos;

public class Ejemplo_Herencia_Demo {

	public static void main(String[] args) {
		
		Ejemplo_Herencia_Triangulo t1 =  new Ejemplo_Herencia_Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "estilo 1";
		
		System.out.println("Informacion para t1");
		t1.mostrarestilo();
		t1.mostrarDimension();
		System.out.println("Su area es "+t1.area());
		
	
		System.out.println();
		//:::::::::::::::::::::::::::::::::::::::
		
	Ejemplo_Herencia_Triangulo t2 =  new Ejemplo_Herencia_Triangulo(); // Polimorfismo es reutilizar o hacer cambiar los valores de las variables
		
		t2.base = 4.0;
		t2.altura = 4.0;
		t2.estilo = "estilo 1";
		
		System.out.println("Informacion para t2");
		t2.mostrarestilo();
		t2.mostrarDimension();
		System.out.println("Su area es "+t2.area());
		
		

	}

}
