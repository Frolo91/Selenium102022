package ejemplos;

public class Ejemplo_Herencia_Triangulo extends Ejemplo_herencia_Dosdimensiones{ // declaro que esta es uan clase hija de la clase Ejemplo_herencia_Dosdimensiones

	String estilo;
	
	public double area() {
		
		double areaT = base * altura / 2;
		return areaT;
		
	}
	
	public void mostrarestilo() {
		
		System.out.println("triangulo es: "+ estilo);
		
	}
		
		
}
