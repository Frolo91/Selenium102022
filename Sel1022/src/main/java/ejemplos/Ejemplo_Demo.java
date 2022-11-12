package ejemplos;

public class Ejemplo_Demo {

	public static void main(String[] args) {
	
		Ejemplo_Demo_Vehiculo minivan = new Ejemplo_Demo_Vehiculo(); //instancia de llamar el objeto de la clase 
		int rango; 
		
		// Asignar los valores a los campos llamados desde la clase demo vehiculo y asignados al objeto minivan
		minivan.pasajeros=9;
		minivan.Capacidad=15; 
		minivan.Kmh=20;
		
		// calcular el rango 
		
		rango = minivan.Capacidad * minivan.Kmh;
		System.out.println(" La mini van puede llevar "+minivan.pasajeros+" pasajeros con un rango de "+rango+" Kilometros");
		
		Ejemplo_Demo_Vehiculo Carro = new Ejemplo_Demo_Vehiculo();
		
		Carro.pasajeros=4;
		
		System.out.println(" El carro puede llevar "+Carro.pasajeros+" Pasajeros");
		

	}

}
